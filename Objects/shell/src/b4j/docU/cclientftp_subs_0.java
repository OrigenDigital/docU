package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cclientftp_subs_0 {


public static RemoteObject  _buttonconn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonConn_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("buttonconn_click")) { return __ref.runUserSub(false, "cclientftp","buttonconn_click", __ref);}
RemoteObject _host = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 134;BA.debugLine="Private Sub ButtonConn_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Dim host As String = TextFTP.Text";
Debug.ShouldStop(64);
_host = __ref.getField(false,"_textftp" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("host", _host);Debug.locals.put("host", _host);
 BA.debugLineNum = 136;BA.debugLine="Dim M As Map = File.ReadMap(File.DirApp,\"save.map";
Debug.ShouldStop(128);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = cclientftp.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(cclientftp.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("save.map")));Debug.locals.put("M", _m);Debug.locals.put("M", _m);
 BA.debugLineNum = 138;BA.debugLine="Dim M As Map = CreateMap(\"localpath\":LocalPath,\"h";
Debug.ShouldStop(512);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = cclientftp.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("localpath")),(__ref.getField(true,"_localpath" /*RemoteObject*/ )),RemoteObject.createImmutable(("host")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("user")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("password")),(RemoteObject.createImmutable(""))}));Debug.locals.put("M", _m);Debug.locals.put("M", _m);
 BA.debugLineNum = 139;BA.debugLine="m.Put(\"host\",host)";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("host"))),(Object)((_host)));
 BA.debugLineNum = 140;BA.debugLine="M.Put(\"user\",TextUser.Text)";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user"))),(Object)((__ref.getField(false,"_textuser" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 141;BA.debugLine="m.put(\"password\",TextPassword.Text)";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("password"))),(Object)((__ref.getField(false,"_textpassword" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 142;BA.debugLine="File.WriteMap(File.DirApp,\"save.map\",m)";
Debug.ShouldStop(8192);
cclientftp.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(cclientftp.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("save.map")),(Object)(_m));
 BA.debugLineNum = 144;BA.debugLine="sFTP.Initialize(\"sftp\",host.Replace(\"ftp://\",\"\").";
Debug.ShouldStop(32768);
__ref.getField(false,"_sftp" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("sftp")),(Object)(_host.runMethod(true,"replace",(Object)(BA.ObjectToString("ftp://")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)(__ref.getField(false,"_textuser" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_textpassword" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 146;BA.debugLine="refreshftp";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshftp" /*void*/ );
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondisc_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonDisc_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("buttondisc_click")) { return __ref.runUserSub(false, "cclientftp","buttondisc_click", __ref);}
 BA.debugLineNum = 149;BA.debugLine="Private Sub ButtonDisc_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="sFTP.Close";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sftp" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buttondownload_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonDownLoad_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,233);
if (RapidSub.canDelegate("buttondownload_click")) { __ref.runUserSub(false, "cclientftp","buttondownload_click", __ref); return;}
ResumableSub_ButtonDownLoad_Click rsub = new ResumableSub_ButtonDownLoad_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonDownLoad_Click extends BA.ResumableSub {
public ResumableSub_ButtonDownLoad_Click(b4j.docU.cclientftp parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cclientftp parent;
RemoteObject _tn = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group2;
int index2;
int groupLen2;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonDownLoad_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,233);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 234;BA.debugLine="SD_LoadingIndicator1.Show";
Debug.ShouldStop(512);
__ref.getField(false,"_sd_loadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.sd_loadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 235;BA.debugLine="For Each tn As CheckboxTreeItem In TreeViewFTP.Ro";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//for
this.state = 8;
_tn = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");
group2 = __ref.getField(false,"_treeviewftp" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren");
index2 = 0;
groupLen2 = group2.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("tn", _tn);
this.state = 9;
if (true) break;

case 9:
//C
this.state = 8;
if (index2 < groupLen2) {
this.state = 3;
_tn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper"), group2.runMethod(false,"Get",index2));Debug.locals.put("tn", _tn);}
if (true) break;

case 10:
//C
this.state = 9;
index2++;
Debug.locals.put("tn", _tn);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 236;BA.debugLine="If tn.Checked Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 7;
if (_tn.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 237;BA.debugLine="wait for (download(LocalPath,FTPPath,tn.Text,tn";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "buttondownload_click"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_localpath" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_ftppath" /*RemoteObject*/ )),(Object)(_tn.runMethod(true,"getText")),(Object)(_tn.runMethod(false,"getImage").runMethod(true,"IsInitialized"))));
this.state = 11;
return;
case 11:
//C
this.state = 7;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
Debug.locals.put("tn", _tn);
;
 BA.debugLineNum = 240;BA.debugLine="refreshtree";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshtree" /*RemoteObject*/ );
 BA.debugLineNum = 241;BA.debugLine="SD_LoadingIndicator1.Hide";
Debug.ShouldStop(65536);
__ref.getField(false,"_sd_loadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.sd_loadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static void  _complete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _buttonftpdel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonFTPdel_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("buttonftpdel_click")) { __ref.runUserSub(false, "cclientftp","buttonftpdel_click", __ref); return;}
ResumableSub_ButtonFTPdel_Click rsub = new ResumableSub_ButtonFTPdel_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonFTPdel_Click extends BA.ResumableSub {
public ResumableSub_ButtonFTPdel_Click(b4j.docU.cclientftp parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cclientftp parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _tn = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group4;
int index4;
int groupLen4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonFTPdel_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,200);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 201;BA.debugLine="Wait For (xui.Msgbox2Async(\"Are you sure?\",\"DELET";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "buttonftpdel_click"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Are you sure?")),(Object)(BA.ObjectToString("DELETE")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No, no no")),(Object)((parent.__c.getField(false,"Null")))));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 202;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 203;BA.debugLine="SD_LoadingIndicator1.Show";
Debug.ShouldStop(1024);
__ref.getField(false,"_sd_loadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.sd_loadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 204;BA.debugLine="For Each tn As CheckboxTreeItem In TreeViewFTP.R";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//for
this.state = 11;
_tn = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");
group4 = __ref.getField(false,"_treeviewftp" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren");
index4 = 0;
groupLen4 = group4.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("tn", _tn);
this.state = 14;
if (true) break;

case 14:
//C
this.state = 11;
if (index4 < groupLen4) {
this.state = 6;
_tn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper"), group4.runMethod(false,"Get",index4));Debug.locals.put("tn", _tn);}
if (true) break;

case 15:
//C
this.state = 14;
index4++;
Debug.locals.put("tn", _tn);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 205;BA.debugLine="If tn.Checked Then";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 10;
if (_tn.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 206;BA.debugLine="wait for (deleteftp(FTPPath,tn.Text,tn.Image.I";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "buttonftpdel_click"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_deleteftp" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_ftppath" /*RemoteObject*/ )),(Object)(_tn.runMethod(true,"getText")),(Object)(_tn.runMethod(false,"getImage").runMethod(true,"IsInitialized"))));
this.state = 16;
return;
case 16:
//C
this.state = 10;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 if (true) break;

case 10:
//C
this.state = 15;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("tn", _tn);
;
 BA.debugLineNum = 209;BA.debugLine="refreshftp";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshftp" /*void*/ );
 BA.debugLineNum = 210;BA.debugLine="SD_LoadingIndicator1.Hide";
Debug.ShouldStop(131072);
__ref.getField(false,"_sd_loadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.sd_loadingindicator.class, "_hide" /*RemoteObject*/ );
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _buttonftpup_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonFTPup_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("buttonftpup_click")) { return __ref.runUserSub(false, "cclientftp","buttonftpup_click", __ref);}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 178;BA.debugLine="Private Sub ButtonFTPup_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="If FTPPath<>\"/\"  Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_ftppath" /*RemoteObject*/ ),BA.ObjectToString("/"))) { 
 BA.debugLineNum = 180;BA.debugLine="Dim i As Int = FTPPath.LastIndexOf(\"/\")";
Debug.ShouldStop(524288);
_i = __ref.getField(true,"_ftppath" /*RemoteObject*/ ).runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 181;BA.debugLine="FTPPath=FTPPath.SubString2(0,i)";
Debug.ShouldStop(1048576);
__ref.setField ("_ftppath" /*RemoteObject*/ ,__ref.getField(true,"_ftppath" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i)));
 };
 BA.debugLineNum = 183;BA.debugLine="refreshftp";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshftp" /*void*/ );
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonhome_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonHome_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("buttonhome_click")) { return __ref.runUserSub(false, "cclientftp","buttonhome_click", __ref);}
 BA.debugLineNum = 153;BA.debugLine="Private Sub ButtonHome_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="LocalPath=\"C:\\\"";
Debug.ShouldStop(33554432);
__ref.setField ("_localpath" /*RemoteObject*/ ,BA.ObjectToString("C:\\"));
 BA.debugLineNum = 155;BA.debugLine="refreshtree";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshtree" /*RemoteObject*/ );
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonlocaldel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonLocalDel_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("buttonlocaldel_click")) { return __ref.runUserSub(false, "cclientftp","buttonlocaldel_click", __ref);}
RemoteObject _tn = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");
 BA.debugLineNum = 192;BA.debugLine="Private Sub ButtonLocalDel_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="For Each tn As CheckboxTreeItem In TreeViewLocal.";
Debug.ShouldStop(1);
_tn = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");
{
final RemoteObject group1 = __ref.getField(false,"_treeviewlocal" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_tn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper"), group1.runMethod(false,"Get",index1));Debug.locals.put("tn", _tn);
Debug.locals.put("tn", _tn);
 BA.debugLineNum = 194;BA.debugLine="If tn.Checked Then";
Debug.ShouldStop(2);
if (_tn.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 195;BA.debugLine="Log(tn.Text)";
Debug.ShouldStop(4);
cclientftp.__c.runVoidMethod ("LogImpl","853018627",_tn.runMethod(true,"getText"),0);
 };
 }
}Debug.locals.put("tn", _tn);
;
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonlocalrefresh_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonLocalRefresh_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("buttonlocalrefresh_click")) { return __ref.runUserSub(false, "cclientftp","buttonlocalrefresh_click", __ref);}
 BA.debugLineNum = 248;BA.debugLine="Private Sub ButtonLocalRefresh_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 249;BA.debugLine="refreshtree";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshtree" /*RemoteObject*/ );
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonlocalup_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonLocalUp_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("buttonlocalup_click")) { return __ref.runUserSub(false, "cclientftp","buttonlocalup_click", __ref);}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 186;BA.debugLine="Private Sub ButtonLocalUp_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="Dim i As Int = LocalPath.LastIndexOf(\"\\\")";
Debug.ShouldStop(67108864);
_i = __ref.getField(true,"_localpath" /*RemoteObject*/ ).runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("\\")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 188;BA.debugLine="LocalPath=LocalPath.SubString2(0,i)";
Debug.ShouldStop(134217728);
__ref.setField ("_localpath" /*RemoteObject*/ ,__ref.getField(true,"_localpath" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i)));
 BA.debugLineNum = 189;BA.debugLine="refreshtree";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshtree" /*RemoteObject*/ );
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonrefresh_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonRefresh_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("buttonrefresh_click")) { return __ref.runUserSub(false, "cclientftp","buttonrefresh_click", __ref);}
 BA.debugLineNum = 244;BA.debugLine="Private Sub ButtonRefresh_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 245;BA.debugLine="refreshftp";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshftp" /*void*/ );
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonroot_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonRoot_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("buttonroot_click")) { return __ref.runUserSub(false, "cclientftp","buttonroot_click", __ref);}
 BA.debugLineNum = 158;BA.debugLine="Private Sub ButtonRoot_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="FTPPath=\"/\"";
Debug.ShouldStop(1073741824);
__ref.setField ("_ftppath" /*RemoteObject*/ ,BA.ObjectToString("/"));
 BA.debugLineNum = 160;BA.debugLine="refreshftp";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshftp" /*void*/ );
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buttonupload_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonUpLoad_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("buttonupload_click")) { __ref.runUserSub(false, "cclientftp","buttonupload_click", __ref); return;}
ResumableSub_ButtonUpLoad_Click rsub = new ResumableSub_ButtonUpLoad_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonUpLoad_Click extends BA.ResumableSub {
public ResumableSub_ButtonUpLoad_Click(b4j.docU.cclientftp parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cclientftp parent;
RemoteObject _tn = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group2;
int index2;
int groupLen2;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonUpLoad_Click (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,214);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 215;BA.debugLine="SD_LoadingIndicator1.Show";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sd_loadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.sd_loadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 217;BA.debugLine="For Each tn As CheckboxTreeItem In TreeViewLocal.";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//for
this.state = 14;
_tn = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");
group2 = __ref.getField(false,"_treeviewlocal" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren");
index2 = 0;
groupLen2 = group2.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("tn", _tn);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 14;
if (index2 < groupLen2) {
this.state = 3;
_tn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper"), group2.runMethod(false,"Get",index2));Debug.locals.put("tn", _tn);}
if (true) break;

case 16:
//C
this.state = 15;
index2++;
Debug.locals.put("tn", _tn);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 218;BA.debugLine="If tn.Checked Then";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 13;
if (_tn.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 219;BA.debugLine="Dim filename As String = File.Combine(LocalPath";
Debug.ShouldStop(67108864);
_filename = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_localpath" /*RemoteObject*/ )),(Object)(_tn.runMethod(true,"getText")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 220;BA.debugLine="If File.IsDirectory(\"\",filename) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(BA.ObjectToString("")),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 221;BA.debugLine="Wait For (upload(filename,FTPPath & \"/\" & File";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "buttonupload_click"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_upload" /*RemoteObject*/ ,(Object)(_filename),(Object)(RemoteObject.concat(__ref.getField(true,"_ftppath" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename))))));
this.state = 17;
return;
case 17:
//C
this.state = 12;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 222;BA.debugLine="logInfo($\"Create path: ${filename}: ${Success}";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_loginfo" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Create path: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable("")))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 224;BA.debugLine="Wait For (upload(filename,FTPPath)) complete (";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "buttonupload_click"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_upload" /*RemoteObject*/ ,(Object)(_filename),(Object)(__ref.getField(true,"_ftppath" /*RemoteObject*/ ))));
this.state = 18;
return;
case 18:
//C
this.state = 12;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 225;BA.debugLine="logInfo($\"Upload: ${filename}: ${Success}\"$)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_loginfo" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Upload: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable("")))));
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
Debug.locals.put("tn", _tn);
;
 BA.debugLineNum = 229;BA.debugLine="refreshftp";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshftp" /*void*/ );
 BA.debugLineNum = 230;BA.debugLine="SD_LoadingIndicator1.Hide";
Debug.ShouldStop(32);
__ref.getField(false,"_sd_loadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.sd_loadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 231;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
cclientftp._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cclientftp._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
cclientftp._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cclientftp._frm);
 //BA.debugLineNum = 4;BA.debugLine="Private LocalPath As String = \"C:\\\"";
cclientftp._localpath = BA.ObjectToString("C:\\");__ref.setField("_localpath",cclientftp._localpath);
 //BA.debugLineNum = 5;BA.debugLine="Private FTPPath As String = \"/\"";
cclientftp._ftppath = BA.ObjectToString("/");__ref.setField("_ftppath",cclientftp._ftppath);
 //BA.debugLineNum = 6;BA.debugLine="Private sFTP As FTP";
cclientftp._sftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");__ref.setField("_sftp",cclientftp._sftp);
 //BA.debugLineNum = 8;BA.debugLine="Dim xui As XUI";
cclientftp._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cclientftp._xui);
 //BA.debugLineNum = 10;BA.debugLine="Private DragAndDrop1 As DragAndDrop";
cclientftp._draganddrop1 = RemoteObject.createNew ("b4j.docU.draganddrop");__ref.setField("_draganddrop1",cclientftp._draganddrop1);
 //BA.debugLineNum = 12;BA.debugLine="Private SplitPane1 As SplitPane";
cclientftp._splitpane1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SplitPaneWrapper");__ref.setField("_splitpane1",cclientftp._splitpane1);
 //BA.debugLineNum = 13;BA.debugLine="Private TreeViewLocal As TreeView";
cclientftp._treeviewlocal = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper");__ref.setField("_treeviewlocal",cclientftp._treeviewlocal);
 //BA.debugLineNum = 14;BA.debugLine="Private TreeViewFTP As TreeView";
cclientftp._treeviewftp = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper");__ref.setField("_treeviewftp",cclientftp._treeviewftp);
 //BA.debugLineNum = 16;BA.debugLine="Private vLocalPath As TextField";
cclientftp._vlocalpath = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_vlocalpath",cclientftp._vlocalpath);
 //BA.debugLineNum = 17;BA.debugLine="Private vFTPpath As TextField";
cclientftp._vftppath = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_vftppath",cclientftp._vftppath);
 //BA.debugLineNum = 18;BA.debugLine="Private TextFTP As TextField";
cclientftp._textftp = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_textftp",cclientftp._textftp);
 //BA.debugLineNum = 19;BA.debugLine="Private TextUser As TextField";
cclientftp._textuser = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_textuser",cclientftp._textuser);
 //BA.debugLineNum = 20;BA.debugLine="Private TextPassword As TextField";
cclientftp._textpassword = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_textpassword",cclientftp._textpassword);
 //BA.debugLineNum = 21;BA.debugLine="Private TextInfo As TextArea";
cclientftp._textinfo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_textinfo",cclientftp._textinfo);
 //BA.debugLineNum = 22;BA.debugLine="Private SD_LoadingIndicator1 As SD_LoadingIndicat";
cclientftp._sd_loadingindicator1 = RemoteObject.createNew ("b4j.docU.sd_loadingindicator");__ref.setField("_sd_loadingindicator1",cclientftp._sd_loadingindicator1);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _deleteftp(RemoteObject __ref,RemoteObject _ftp_path,RemoteObject _ftp_file,RemoteObject _isdir) throws Exception{
try {
		Debug.PushSubsStack("deleteftp (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,431);
if (RapidSub.canDelegate("deleteftp")) { return __ref.runUserSub(false, "cclientftp","deleteftp", __ref, _ftp_path, _ftp_file, _isdir);}
ResumableSub_deleteftp rsub = new ResumableSub_deleteftp(null,__ref,_ftp_path,_ftp_file,_isdir);
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
public static class ResumableSub_deleteftp extends BA.ResumableSub {
public ResumableSub_deleteftp(b4j.docU.cclientftp parent,RemoteObject __ref,RemoteObject _ftp_path,RemoteObject _ftp_file,RemoteObject _isdir) {
this.parent = parent;
this.__ref = __ref;
this._ftp_path = _ftp_path;
this._ftp_file = _ftp_file;
this._isdir = _isdir;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cclientftp parent;
RemoteObject _ftp_path;
RemoteObject _ftp_file;
RemoteObject _isdir;
RemoteObject _res = RemoteObject.createImmutable(false);
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
RemoteObject _fname = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _command = RemoteObject.createImmutable("");
RemoteObject _replycode = RemoteObject.createImmutable(0);
RemoteObject _replystring = RemoteObject.createImmutable("");
RemoteObject group5;
int index5;
int groupLen5;
RemoteObject group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("deleteftp (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,431);
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
Debug.locals.put("ftp_path", _ftp_path);
Debug.locals.put("ftp_file", _ftp_file);
Debug.locals.put("IsDir", _isdir);
 BA.debugLineNum = 432;BA.debugLine="Dim Res As Boolean = False";
Debug.ShouldStop(32768);
_res = parent.__c.getField(true,"False");Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 434;BA.debugLine="If IsDir Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 13;
if (_isdir.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 12;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 435;BA.debugLine="sFTP.List(ftp_path & \"/\" & ftp_file)";
Debug.ShouldStop(262144);
__ref.getField(false,"_sftp" /*RemoteObject*/ ).runVoidMethod ("List",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)));
 BA.debugLineNum = 437;BA.debugLine="Wait For sftp_ListCompleted (ServerPath As Strin";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","sftp_listcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "deleteftp"), null);
this.state = 14;
return;
case 14:
//C
this.state = 4;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(4));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 439;BA.debugLine="For Each fname As FTPEntry In Folders";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//for
this.state = 7;
group5 = _folders;
index5 = 0;
groupLen5 = group5.getField(true,"length").<Integer>get();
Debug.locals.put("fname", _fname);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 7;
if (index5 < groupLen5) {
this.state = 6;
_fname = group5.getArrayElement(false,RemoteObject.createImmutable(index5));Debug.locals.put("fname", _fname);}
if (true) break;

case 16:
//C
this.state = 15;
index5++;
Debug.locals.put("fname", _fname);
if (true) break;

case 6:
//C
this.state = 16;
 BA.debugLineNum = 440;BA.debugLine="Dim filename As String = fname.Name";
Debug.ShouldStop(8388608);
_filename = _fname.runMethod(true,"getName");Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 441;BA.debugLine="Wait For (deleteftp(ftp_path & \"/\" & ftp_file,";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "deleteftp"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_deleteftp" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)),(Object)(_filename),(Object)(parent.__c.getField(true,"True"))));
this.state = 17;
return;
case 17:
//C
this.state = 16;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 if (true) break;
if (true) break;
Debug.locals.put("fname", _fname);
;
 BA.debugLineNum = 444;BA.debugLine="For Each fname As FTPEntry In Files";
Debug.ShouldStop(134217728);

case 7:
//for
this.state = 10;
group9 = _files;
index9 = 0;
groupLen9 = group9.getField(true,"length").<Integer>get();
Debug.locals.put("fname", _fname);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index9 < groupLen9) {
this.state = 9;
_fname = group9.getArrayElement(false,RemoteObject.createImmutable(index9));Debug.locals.put("fname", _fname);}
if (true) break;

case 19:
//C
this.state = 18;
index9++;
Debug.locals.put("fname", _fname);
if (true) break;

case 9:
//C
this.state = 19;
 BA.debugLineNum = 445;BA.debugLine="Dim filename As String = fname.Name";
Debug.ShouldStop(268435456);
_filename = _fname.runMethod(true,"getName");Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 446;BA.debugLine="Wait For (deleteftp(ftp_path & \"/\" & ftp_file,";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "deleteftp"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_deleteftp" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)),(Object)(_filename),(Object)(parent.__c.getField(true,"False"))));
this.state = 20;
return;
case 20:
//C
this.state = 19;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("fname", _fname);
;
 BA.debugLineNum = 449;BA.debugLine="sFTP.SendCommand(\"RMD\",ftp_path & \"/\" & ftp_file";
Debug.ShouldStop(1);
__ref.getField(false,"_sftp" /*RemoteObject*/ ).runVoidMethod ("SendCommand",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("RMD")),(Object)(RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)));
 BA.debugLineNum = 450;BA.debugLine="Wait For sftp_CommandCompleted (Command As Strin";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","sftp_commandcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "deleteftp"), null);
this.state = 21;
return;
case 21:
//C
this.state = 13;
_command = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Command", _command);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
_replycode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("ReplyCode", _replycode);
_replystring = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("ReplyString", _replystring);
;
 BA.debugLineNum = 451;BA.debugLine="logInfo($\"Delete path: ${ftp_path & \"/\" & ftp_fi";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_loginfo" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Delete path: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)))),RemoteObject.createImmutable(": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable("")))));
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 453;BA.debugLine="sFTP.DeleteFile(ftp_path & \"/\" & ftp_file)";
Debug.ShouldStop(16);
__ref.getField(false,"_sftp" /*RemoteObject*/ ).runVoidMethod ("DeleteFile",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)));
 BA.debugLineNum = 455;BA.debugLine="Wait For sftp_DeleteCompleted (ServerPath As Str";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","sftp_deletecompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "deleteftp"), null);
this.state = 22;
return;
case 22:
//C
this.state = 13;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 456;BA.debugLine="logInfo($\"Delete file: ${ftp_path & \"/\" & ftp_fi";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_loginfo" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Delete file: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)))),RemoteObject.createImmutable(": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 457;BA.debugLine="Res=Success";
Debug.ShouldStop(256);
_res = _success;Debug.locals.put("Res", _res);
 if (true) break;

case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 460;BA.debugLine="Return Res";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_res));return;};
 BA.debugLineNum = 461;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static void  _sftp_listcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success,RemoteObject _folders,RemoteObject _files) throws Exception{
}
public static void  _sftp_commandcompleted(RemoteObject __ref,RemoteObject _command,RemoteObject _success,RemoteObject _replycode,RemoteObject _replystring) throws Exception{
}
public static void  _sftp_deletecompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static RemoteObject  _download(RemoteObject __ref,RemoteObject _local_path,RemoteObject _ftp_path,RemoteObject _ftp_file,RemoteObject _isdir) throws Exception{
try {
		Debug.PushSubsStack("download (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,463);
if (RapidSub.canDelegate("download")) { return __ref.runUserSub(false, "cclientftp","download", __ref, _local_path, _ftp_path, _ftp_file, _isdir);}
ResumableSub_download rsub = new ResumableSub_download(null,__ref,_local_path,_ftp_path,_ftp_file,_isdir);
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
public static class ResumableSub_download extends BA.ResumableSub {
public ResumableSub_download(b4j.docU.cclientftp parent,RemoteObject __ref,RemoteObject _local_path,RemoteObject _ftp_path,RemoteObject _ftp_file,RemoteObject _isdir) {
this.parent = parent;
this.__ref = __ref;
this._local_path = _local_path;
this._ftp_path = _ftp_path;
this._ftp_file = _ftp_file;
this._isdir = _isdir;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cclientftp parent;
RemoteObject _local_path;
RemoteObject _ftp_path;
RemoteObject _ftp_file;
RemoteObject _isdir;
RemoteObject _res = RemoteObject.createImmutable(false);
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
RemoteObject _fname = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject group6;
int index6;
int groupLen6;
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("download (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,463);
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
Debug.locals.put("local_path", _local_path);
Debug.locals.put("ftp_path", _ftp_path);
Debug.locals.put("ftp_file", _ftp_file);
Debug.locals.put("IsDir", _isdir);
 BA.debugLineNum = 464;BA.debugLine="Dim Res As Boolean = False";
Debug.ShouldStop(32768);
_res = parent.__c.getField(true,"False");Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 466;BA.debugLine="If IsDir Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 13;
if (_isdir.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 12;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 467;BA.debugLine="sFTP.List(ftp_path & \"/\" & ftp_file)";
Debug.ShouldStop(262144);
__ref.getField(false,"_sftp" /*RemoteObject*/ ).runVoidMethod ("List",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)));
 BA.debugLineNum = 469;BA.debugLine="File.MakeDir(local_path, ftp_file)";
Debug.ShouldStop(1048576);
parent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(_local_path),(Object)(_ftp_file));
 BA.debugLineNum = 471;BA.debugLine="Wait For sftp_ListCompleted (ServerPath As Strin";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","sftp_listcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "download"), null);
this.state = 14;
return;
case 14:
//C
this.state = 4;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(4));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 473;BA.debugLine="For Each fname As FTPEntry In Folders";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//for
this.state = 7;
group6 = _folders;
index6 = 0;
groupLen6 = group6.getField(true,"length").<Integer>get();
Debug.locals.put("fname", _fname);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 7;
if (index6 < groupLen6) {
this.state = 6;
_fname = group6.getArrayElement(false,RemoteObject.createImmutable(index6));Debug.locals.put("fname", _fname);}
if (true) break;

case 16:
//C
this.state = 15;
index6++;
Debug.locals.put("fname", _fname);
if (true) break;

case 6:
//C
this.state = 16;
 BA.debugLineNum = 474;BA.debugLine="Dim filename As String = fname.Name";
Debug.ShouldStop(33554432);
_filename = _fname.runMethod(true,"getName");Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 475;BA.debugLine="Wait For (download(File.Combine(local_path,ftp_";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "download"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_download" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_local_path),(Object)(_ftp_file))),(Object)(RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)),(Object)(_filename),(Object)(parent.__c.getField(true,"True"))));
this.state = 17;
return;
case 17:
//C
this.state = 16;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 if (true) break;
if (true) break;
Debug.locals.put("fname", _fname);
;
 BA.debugLineNum = 478;BA.debugLine="For Each fname As FTPEntry In Files";
Debug.ShouldStop(536870912);

case 7:
//for
this.state = 10;
group10 = _files;
index10 = 0;
groupLen10 = group10.getField(true,"length").<Integer>get();
Debug.locals.put("fname", _fname);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index10 < groupLen10) {
this.state = 9;
_fname = group10.getArrayElement(false,RemoteObject.createImmutable(index10));Debug.locals.put("fname", _fname);}
if (true) break;

case 19:
//C
this.state = 18;
index10++;
Debug.locals.put("fname", _fname);
if (true) break;

case 9:
//C
this.state = 19;
 BA.debugLineNum = 479;BA.debugLine="Dim filename As String = fname.Name";
Debug.ShouldStop(1073741824);
_filename = _fname.runMethod(true,"getName");Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 480;BA.debugLine="Wait For (download(File.Combine(local_path,ftp_";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "download"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_download" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_local_path),(Object)(_ftp_file))),(Object)(RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)),(Object)(_filename),(Object)(parent.__c.getField(true,"False"))));
this.state = 20;
return;
case 20:
//C
this.state = 19;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("fname", _fname);
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 484;BA.debugLine="sFTP.DownloadFile(ftp_path & \"/\" & ftp_file,Fals";
Debug.ShouldStop(8);
__ref.getField(false,"_sftp" /*RemoteObject*/ ).runVoidMethod ("DownloadFile",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)),(Object)(parent.__c.getField(true,"False")),(Object)(_local_path),(Object)(_ftp_file));
 BA.debugLineNum = 486;BA.debugLine="Wait For sftp_DownloadCompleted (ServerPath As S";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","sftp_downloadcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "download"), null);
this.state = 21;
return;
case 21:
//C
this.state = 13;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 487;BA.debugLine="logInfo($\"Download file: ${ftp_path & \"/\" & ftp_";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_loginfo" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Download file: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_ftp_file)))),RemoteObject.createImmutable(": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 488;BA.debugLine="Res=Success";
Debug.ShouldStop(128);
_res = _success;Debug.locals.put("Res", _res);
 if (true) break;

case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 491;BA.debugLine="Return Res";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_res));return;};
 BA.debugLineNum = 492;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static void  _sftp_downloadcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static void  _droptarget_dragdropped(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("DropTarget_DragDropped (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,297);
if (RapidSub.canDelegate("droptarget_dragdropped")) { __ref.runUserSub(false, "cclientftp","droptarget_dragdropped", __ref, _e); return;}
ResumableSub_DropTarget_DragDropped rsub = new ResumableSub_DropTarget_DragDropped(null,__ref,_e);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DropTarget_DragDropped extends BA.ResumableSub {
public ResumableSub_DropTarget_DragDropped(b4j.docU.cclientftp parent,RemoteObject __ref,RemoteObject _e) {
this.parent = parent;
this.__ref = __ref;
this._e = _e;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cclientftp parent;
RemoteObject _e;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DropTarget_DragDropped (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,297);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("e", _e);
 BA.debugLineNum = 298;BA.debugLine="Log(\"drag dropped\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","853739521",RemoteObject.createImmutable("drag dropped"),0);
 BA.debugLineNum = 299;BA.debugLine="SD_LoadingIndicator1.Show";
Debug.ShouldStop(1024);
__ref.getField(false,"_sd_loadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.sd_loadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 300;BA.debugLine="For Each filename As String In e.GetDragboard.Get";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//for
this.state = 10;
group3 = _e.runClassMethod (b4j.docU.dragevent.class, "_getdragboard" /*RemoteObject*/ ).runClassMethod (b4j.docU.dragboard.class, "_getfiles" /*RemoteObject*/ );
index3 = 0;
groupLen3 = group3.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("filename", _filename);
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if (index3 < groupLen3) {
this.state = 3;
_filename = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("filename", _filename);}
if (true) break;

case 12:
//C
this.state = 11;
index3++;
Debug.locals.put("filename", _filename);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 301;BA.debugLine="If File.IsDirectory(\"\",filename) Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(BA.ObjectToString("")),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 302;BA.debugLine="Wait For (upload(filename,FTPPath & \"/\" & File.";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "droptarget_dragdropped"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_upload" /*RemoteObject*/ ,(Object)(_filename),(Object)(RemoteObject.concat(__ref.getField(true,"_ftppath" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename))))));
this.state = 13;
return;
case 13:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 303;BA.debugLine="logInfo($\"Create path: ${filename}: ${Success}\"";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_loginfo" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Create path: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable("")))));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 305;BA.debugLine="Wait For (upload(filename,FTPPath)) complete (S";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "droptarget_dragdropped"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_upload" /*RemoteObject*/ ,(Object)(_filename),(Object)(__ref.getField(true,"_ftppath" /*RemoteObject*/ ))));
this.state = 14;
return;
case 14:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 306;BA.debugLine="logInfo($\"Upload: ${filename}: ${Success}\"$)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_loginfo" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Upload: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable("")))));
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
Debug.locals.put("filename", _filename);
;
 BA.debugLineNum = 310;BA.debugLine="e.SetDropCompleted(True)";
Debug.ShouldStop(2097152);
_e.runClassMethod (b4j.docU.dragevent.class, "_setdropcompleted" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 311;BA.debugLine="SD_LoadingIndicator1.Hide";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sd_loadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.sd_loadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 313;BA.debugLine="refreshftp";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshftp" /*void*/ );
 BA.debugLineNum = 314;BA.debugLine="End Sub";
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
public static RemoteObject  _droptarget_dragentered(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("DropTarget_DragEntered (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("droptarget_dragentered")) { return __ref.runUserSub(false, "cclientftp","droptarget_dragentered", __ref, _e);}
RemoteObject _clr = RemoteObject.createImmutable(0);
Debug.locals.put("e", _e);
 BA.debugLineNum = 264;BA.debugLine="Sub DropTarget_DragEntered(e As DragEvent)";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="Log(\"DragEntered\")";
Debug.ShouldStop(256);
cclientftp.__c.runVoidMethod ("LogImpl","853477377",RemoteObject.createImmutable("DragEntered"),0);
 BA.debugLineNum = 266;BA.debugLine="Dim clr As Int";
Debug.ShouldStop(512);
_clr = RemoteObject.createImmutable(0);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 267;BA.debugLine="If IsValidDropEvent(e) And sFTP.IsInitialized The";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(".",__ref.runClassMethod (b4j.docU.cclientftp.class, "_isvaliddropevent" /*RemoteObject*/ ,(Object)(_e))) && RemoteObject.solveBoolean(".",__ref.getField(false,"_sftp" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 268;BA.debugLine="clr = 0xFF007F46";
Debug.ShouldStop(2048);
_clr = BA.numberCast(int.class, ((int)0xff007f46));Debug.locals.put("clr", _clr);
 }else {
 BA.debugLineNum = 270;BA.debugLine="clr = 0xFFFF0000";
Debug.ShouldStop(8192);
_clr = BA.numberCast(int.class, ((int)0xffff0000));Debug.locals.put("clr", _clr);
 };
 BA.debugLineNum = 272;BA.debugLine="TreeViewFTP.As(B4XView).SetColorAndBorder(0xFFFFF";
Debug.ShouldStop(32768);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_treeviewftp" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(BA.numberCast(int.class, ((int)0xffffffff))),(Object)(BA.numberCast(double.class, cclientftp.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))),(Object)(_clr),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _droptarget_dragexited(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("DropTarget_DragExited (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("droptarget_dragexited")) { return __ref.runUserSub(false, "cclientftp","droptarget_dragexited", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 275;BA.debugLine="Sub DropTarget_DragExited(e As DragEvent)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 276;BA.debugLine="TreeViewFTP.As(B4XView).SetColorAndBorder(0xFFFFF";
Debug.ShouldStop(524288);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_treeviewftp" /*RemoteObject*/ ).getObject())).runVoidMethod ("SetColorAndBorder",(Object)(BA.numberCast(int.class, ((int)0xffffffff))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _droptarget_dragover(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("DropTarget_DragOver (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("droptarget_dragover")) { return __ref.runUserSub(false, "cclientftp","droptarget_dragover", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 279;BA.debugLine="Sub DropTarget_DragOver(e As DragEvent)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="If IsValidDropEvent(e) Then e.AcceptTransferModes";
Debug.ShouldStop(8388608);
if (__ref.runClassMethod (b4j.docU.cclientftp.class, "_isvaliddropevent" /*RemoteObject*/ ,(Object)(_e)).<Boolean>get().booleanValue()) { 
_e.runClassMethod (b4j.docU.dragevent.class, "_accepttransfermodes" /*RemoteObject*/ ,(Object)((cclientftp._transfermode._copy /*RemoteObject*/ )));};
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cclientftp","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Show";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvaliddropevent(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("IsValidDropEvent (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("isvaliddropevent")) { return __ref.runUserSub(false, "cclientftp","isvaliddropevent", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 283;BA.debugLine="Sub IsValidDropEvent(e As DragEvent) As Boolean";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="Return e.GetDragboard.HasFiles";
Debug.ShouldStop(134217728);
if (true) return _e.runClassMethod (b4j.docU.dragevent.class, "_getdragboard" /*RemoteObject*/ ).runClassMethod (b4j.docU.dragboard.class, "_hasfiles" /*RemoteObject*/ );
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loginfo(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("logInfo (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,392);
if (RapidSub.canDelegate("loginfo")) { return __ref.runUserSub(false, "cclientftp","loginfo", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 392;BA.debugLine="Private Sub logInfo(Text As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 393;BA.debugLine="TextInfo.Text=TextInfo.Text & Text & CRLF";
Debug.ShouldStop(256);
__ref.getField(false,"_textinfo" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(__ref.getField(false,"_textinfo" /*RemoteObject*/ ).runMethod(true,"getText"),_text,cclientftp.__c.getField(true,"CRLF")));
 BA.debugLineNum = 394;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menubar1_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MenuBar1_Action (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("menubar1_action")) { return __ref.runUserSub(false, "cclientftp","menubar1_action", __ref);}
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
RemoteObject _choix = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 69;BA.debugLine="Private Sub MenuBar1_Action";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Dim mi As MenuItem = Sender";
Debug.ShouldStop(32);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper"), cclientftp.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("mi", _mi);Debug.locals.put("mi", _mi);
 BA.debugLineNum = 72;BA.debugLine="Select mi.Text";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(_mi.runMethod(true,"getText"),BA.ObjectToString("_Load"),BA.ObjectToString("_Save"))) {
case 0: {
 BA.debugLineNum = 74;BA.debugLine="Dim FC As FileChooser";
Debug.ShouldStop(512);
_fc = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("FC", _fc);
 BA.debugLineNum = 75;BA.debugLine="FC.Initialize";
Debug.ShouldStop(1024);
_fc.runVoidMethod ("Initialize");
 BA.debugLineNum = 76;BA.debugLine="FC.InitialDirectory = File.DirData(\"clientFTP\")";
Debug.ShouldStop(2048);
_fc.runMethod(true,"setInitialDirectory",cclientftp.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("clientFTP"))));
 BA.debugLineNum = 77;BA.debugLine="FC.InitialFileName = \"\"";
Debug.ShouldStop(4096);
_fc.runMethod(true,"setInitialFileName",BA.ObjectToString(""));
 BA.debugLineNum = 78;BA.debugLine="FC.Title = \"Selezione il file Credenziali da ca";
Debug.ShouldStop(8192);
_fc.runMethod(true,"setTitle",BA.ObjectToString("Selezione il file Credenziali da caricare"));
 BA.debugLineNum = 79;BA.debugLine="FC.SetExtensionFilter(\"Credenziali\", Array As S";
Debug.ShouldStop(16384);
_fc.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("Credenziali")),(Object)(cclientftp.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("*.crd")})))));
 BA.debugLineNum = 80;BA.debugLine="Dim Choix As String = FC.ShowOpen(frm)";
Debug.ShouldStop(32768);
_choix = _fc.runMethodAndSync(true,"ShowOpen",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("Choix", _choix);Debug.locals.put("Choix", _choix);
 BA.debugLineNum = 82;BA.debugLine="If Choix <> \"\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_choix,BA.ObjectToString(""))) { 
 BA.debugLineNum = 83;BA.debugLine="Dim M As Map = File.ReadMap(\"\",Choix)";
Debug.ShouldStop(262144);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = cclientftp.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(BA.ObjectToString("")),(Object)(_choix));Debug.locals.put("M", _m);Debug.locals.put("M", _m);
 BA.debugLineNum = 84;BA.debugLine="TextFTP.Text=M.Get(\"host\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_textftp" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("host"))))));
 BA.debugLineNum = 85;BA.debugLine="TextUser.Text=M.Get(\"user\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_textuser" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user"))))));
 BA.debugLineNum = 86;BA.debugLine="TextPassword.Text=M.Get(\"password\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_textpassword" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("password"))))));
 };
 break; }
case 1: {
 BA.debugLineNum = 89;BA.debugLine="Dim FC As FileChooser";
Debug.ShouldStop(16777216);
_fc = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("FC", _fc);
 BA.debugLineNum = 90;BA.debugLine="FC.Initialize";
Debug.ShouldStop(33554432);
_fc.runVoidMethod ("Initialize");
 BA.debugLineNum = 91;BA.debugLine="FC.InitialDirectory = File.DirData(\"clientFTP\")";
Debug.ShouldStop(67108864);
_fc.runMethod(true,"setInitialDirectory",cclientftp.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("clientFTP"))));
 BA.debugLineNum = 92;BA.debugLine="FC.InitialFileName = \"\"";
Debug.ShouldStop(134217728);
_fc.runMethod(true,"setInitialFileName",BA.ObjectToString(""));
 BA.debugLineNum = 93;BA.debugLine="FC.Title = \"Salva file Credenziali\"";
Debug.ShouldStop(268435456);
_fc.runMethod(true,"setTitle",BA.ObjectToString("Salva file Credenziali"));
 BA.debugLineNum = 94;BA.debugLine="FC.SetExtensionFilter(\"Credenziali\", Array As S";
Debug.ShouldStop(536870912);
_fc.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("Credenziali")),(Object)(cclientftp.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("*.crd")})))));
 BA.debugLineNum = 95;BA.debugLine="Dim Choix As String = FC.ShowSave(frm)";
Debug.ShouldStop(1073741824);
_choix = _fc.runMethodAndSync(true,"ShowSave",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("Choix", _choix);Debug.locals.put("Choix", _choix);
 BA.debugLineNum = 97;BA.debugLine="If Choix <> \"\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",_choix,BA.ObjectToString(""))) { 
 BA.debugLineNum = 98;BA.debugLine="Dim M As Map = CreateMap(\"host\":TextFTP.Text,\"";
Debug.ShouldStop(2);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = cclientftp.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("host")),(__ref.getField(false,"_textftp" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("user")),(__ref.getField(false,"_textuser" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("password")),(__ref.getField(false,"_textpassword" /*RemoteObject*/ ).runMethod(true,"getText"))}));Debug.locals.put("M", _m);Debug.locals.put("M", _m);
 BA.debugLineNum = 99;BA.debugLine="File.WriteMap(\"\",Choix,m)";
Debug.ShouldStop(4);
cclientftp.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(BA.ObjectToString("")),(Object)(_choix),(Object)(_m));
 };
 break; }
}
;
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _refreshftp(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("refreshftp (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("refreshftp")) { __ref.runUserSub(false, "cclientftp","refreshftp", __ref); return;}
ResumableSub_refreshftp rsub = new ResumableSub_refreshftp(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_refreshftp extends BA.ResumableSub {
public ResumableSub_refreshftp(b4j.docU.cclientftp parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cclientftp parent;
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
RemoteObject _fname = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper");
RemoteObject _fti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");
RemoteObject group8;
int index8;
int groupLen8;
RemoteObject group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("refreshftp (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,329);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 330;BA.debugLine="FTPPath=FTPPath.Replace(\"//\",\"/\")";
Debug.ShouldStop(512);
__ref.setField ("_ftppath" /*RemoteObject*/ ,__ref.getField(true,"_ftppath" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("//")),(Object)(RemoteObject.createImmutable("/"))));
 BA.debugLineNum = 331;BA.debugLine="If FTPPath=\"\" Then FTPPath=\"/\"";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_ftppath" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref.setField ("_ftppath" /*RemoteObject*/ ,BA.ObjectToString("/"));
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 332;BA.debugLine="vFTPpath.Text=FTPPath";
Debug.ShouldStop(2048);
__ref.getField(false,"_vftppath" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_ftppath" /*RemoteObject*/ ));
 BA.debugLineNum = 333;BA.debugLine="sFTP.List(FTPPath)";
Debug.ShouldStop(4096);
__ref.getField(false,"_sftp" /*RemoteObject*/ ).runVoidMethod ("List",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_ftppath" /*RemoteObject*/ )));
 BA.debugLineNum = 335;BA.debugLine="Wait For sftp_ListCompleted (ServerPath As String";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","sftp_listcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "refreshftp"), null);
this.state = 18;
return;
case 18:
//C
this.state = 7;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(4));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 337;BA.debugLine="If ServerPath=FTPPath Then";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_serverpath,__ref.getField(true,"_ftppath" /*RemoteObject*/ ))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 338;BA.debugLine="TreeViewFTP.Root.Children.Clear";
Debug.ShouldStop(131072);
__ref.getField(false,"_treeviewftp" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Clear");
 BA.debugLineNum = 339;BA.debugLine="For Each fname As FTPEntry In Folders";
Debug.ShouldStop(262144);
if (true) break;

case 10:
//for
this.state = 13;
group8 = _folders;
index8 = 0;
groupLen8 = group8.getField(true,"length").<Integer>get();
Debug.locals.put("fname", _fname);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 13;
if (index8 < groupLen8) {
this.state = 12;
_fname = group8.getArrayElement(false,RemoteObject.createImmutable(index8));Debug.locals.put("fname", _fname);}
if (true) break;

case 20:
//C
this.state = 19;
index8++;
Debug.locals.put("fname", _fname);
if (true) break;

case 12:
//C
this.state = 20;
 BA.debugLineNum = 340;BA.debugLine="Dim fti As CheckboxTreeItem";
Debug.ShouldStop(524288);
_fti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");Debug.locals.put("fti", _fti);
 BA.debugLineNum = 341;BA.debugLine="fti.Initialize(\"ti\",fname.Name)";
Debug.ShouldStop(1048576);
_fti.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ti")),(Object)(_fname.runMethod(true,"getName")));
 BA.debugLineNum = 342;BA.debugLine="fti.Image=fx.LoadImageSample(File.DirAssets,\"fo";
Debug.ShouldStop(2097152);
_fti.runMethod(false,"setImage",(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImageSample",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("folder.png")),(Object)(BA.numberCast(double.class, 16)),(Object)(BA.numberCast(double.class, 16))).getObject()));
 BA.debugLineNum = 343;BA.debugLine="fti.Checked=False";
Debug.ShouldStop(4194304);
_fti.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 344;BA.debugLine="TreeViewFTP.Root.Children.Add(fti)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_treeviewftp" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_fti.getObject())));
 if (true) break;
if (true) break;
Debug.locals.put("fname", _fname);
;
 BA.debugLineNum = 347;BA.debugLine="For Each fname As FTPEntry In Files";
Debug.ShouldStop(67108864);

case 13:
//for
this.state = 16;
group15 = _files;
index15 = 0;
groupLen15 = group15.getField(true,"length").<Integer>get();
Debug.locals.put("fname", _fname);
this.state = 21;
if (true) break;

case 21:
//C
this.state = 16;
if (index15 < groupLen15) {
this.state = 15;
_fname = group15.getArrayElement(false,RemoteObject.createImmutable(index15));Debug.locals.put("fname", _fname);}
if (true) break;

case 22:
//C
this.state = 21;
index15++;
Debug.locals.put("fname", _fname);
if (true) break;

case 15:
//C
this.state = 22;
 BA.debugLineNum = 348;BA.debugLine="Dim fti As CheckboxTreeItem";
Debug.ShouldStop(134217728);
_fti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");Debug.locals.put("fti", _fti);
 BA.debugLineNum = 349;BA.debugLine="fti.Initialize(\"ti\",fname.Name)";
Debug.ShouldStop(268435456);
_fti.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ti")),(Object)(_fname.runMethod(true,"getName")));
 BA.debugLineNum = 350;BA.debugLine="fti.Checked=False";
Debug.ShouldStop(536870912);
_fti.runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 BA.debugLineNum = 351;BA.debugLine="TreeViewFTP.Root.Children.Add(fti)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_treeviewftp" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_fti.getObject())));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
Debug.locals.put("fname", _fname);
;
 if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 354;BA.debugLine="End Sub";
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
public static RemoteObject  _refreshtree(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("refreshtree (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("refreshtree")) { return __ref.runUserSub(false, "cclientftp","refreshtree", __ref);}
 BA.debugLineNum = 320;BA.debugLine="Public Sub refreshtree";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="If LocalPath.EndsWith(\":\") Then LocalPath=LocalPa";
Debug.ShouldStop(1);
if (__ref.getField(true,"_localpath" /*RemoteObject*/ ).runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(":"))).<Boolean>get().booleanValue()) { 
__ref.setField ("_localpath" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_localpath" /*RemoteObject*/ ),RemoteObject.createImmutable("\\")));};
 BA.debugLineNum = 322;BA.debugLine="If File.Exists(LocalPath,\"\") = False Then LocalPa";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",cclientftp.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_localpath" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))),cclientftp.__c.getField(true,"False"))) { 
__ref.setField ("_localpath" /*RemoteObject*/ ,BA.ObjectToString("C:\\"));};
 BA.debugLineNum = 324;BA.debugLine="TreeViewLocal.Root.Children.Clear";
Debug.ShouldStop(8);
__ref.getField(false,"_treeviewlocal" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Clear");
 BA.debugLineNum = 325;BA.debugLine="vLocalPath.Text=LocalPath";
Debug.ShouldStop(16);
__ref.getField(false,"_vlocalpath" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_localpath" /*RemoteObject*/ ));
 BA.debugLineNum = 326;BA.debugLine="scanpath(LocalPath,TreeViewLocal.Root)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_scanpath" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_localpath" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_treeviewlocal" /*RemoteObject*/ ).runMethod(false,"getRoot")));
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scanpath(RemoteObject __ref,RemoteObject _path,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("scanpath (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("scanpath")) { return __ref.runUserSub(false, "cclientftp","scanpath", __ref, _path, _ti);}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fti = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");
RemoteObject _fname = RemoteObject.createImmutable("");
Debug.locals.put("path", _path);
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 356;BA.debugLine="Private Sub scanpath(path As String, ti As TreeIte";
Debug.ShouldStop(8);
 BA.debugLineNum = 357;BA.debugLine="Dim l As List = File.ListFiles(path)";
Debug.ShouldStop(16);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = cclientftp.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_path));Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 359;BA.debugLine="If path.EndsWith(\":\\\")=False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_path.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(":\\"))),cclientftp.__c.getField(true,"False"))) { 
 BA.debugLineNum = 360;BA.debugLine="Dim fti As CheckboxTreeItem";
Debug.ShouldStop(128);
_fti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");Debug.locals.put("fti", _fti);
 BA.debugLineNum = 361;BA.debugLine="fti.Initialize(\"ti\",\"..\")";
Debug.ShouldStop(256);
_fti.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ti")),(Object)(RemoteObject.createImmutable("..")));
 BA.debugLineNum = 362;BA.debugLine="fti.Checked=False";
Debug.ShouldStop(512);
_fti.runMethod(true,"setChecked",cclientftp.__c.getField(true,"False"));
 BA.debugLineNum = 363;BA.debugLine="fti.Image=fx.LoadImageSample(File.DirAssets,\"fol";
Debug.ShouldStop(1024);
_fti.runMethod(false,"setImage",(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImageSample",(Object)(cclientftp.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("folder.png")),(Object)(BA.numberCast(double.class, 16)),(Object)(BA.numberCast(double.class, 16))).getObject()));
 BA.debugLineNum = 364;BA.debugLine="ti.Children.Add(fti)";
Debug.ShouldStop(2048);
_ti.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_fti.getObject())));
 };
 BA.debugLineNum = 366;BA.debugLine="If l.IsInitialized Then";
Debug.ShouldStop(8192);
if (_l.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 367;BA.debugLine="l.Sort(True)";
Debug.ShouldStop(16384);
_l.runVoidMethod ("Sort",(Object)(cclientftp.__c.getField(true,"True")));
 BA.debugLineNum = 368;BA.debugLine="For Each fname As String In l";
Debug.ShouldStop(32768);
{
final RemoteObject group11 = _l;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_fname = BA.ObjectToString(group11.runMethod(false,"Get",index11));Debug.locals.put("fname", _fname);
Debug.locals.put("fname", _fname);
 BA.debugLineNum = 369;BA.debugLine="If fname.StartsWith(\"$\")=False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_fname.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("$"))),cclientftp.__c.getField(true,"False"))) { 
 BA.debugLineNum = 370;BA.debugLine="If File.IsDirectory(path,fname) Then";
Debug.ShouldStop(131072);
if (cclientftp.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_path),(Object)(_fname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 371;BA.debugLine="Dim fti As CheckboxTreeItem";
Debug.ShouldStop(262144);
_fti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");Debug.locals.put("fti", _fti);
 BA.debugLineNum = 372;BA.debugLine="fti.Initialize(\"ti\",fname)";
Debug.ShouldStop(524288);
_fti.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ti")),(Object)(_fname));
 BA.debugLineNum = 373;BA.debugLine="fti.Image=fx.LoadImageSample(File.DirAssets,\"";
Debug.ShouldStop(1048576);
_fti.runMethod(false,"setImage",(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImageSample",(Object)(cclientftp.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("folder.png")),(Object)(BA.numberCast(double.class, 16)),(Object)(BA.numberCast(double.class, 16))).getObject()));
 BA.debugLineNum = 374;BA.debugLine="fti.Checked=False";
Debug.ShouldStop(2097152);
_fti.runMethod(true,"setChecked",cclientftp.__c.getField(true,"False"));
 BA.debugLineNum = 375;BA.debugLine="ti.Children.Add(fti)";
Debug.ShouldStop(4194304);
_ti.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_fti.getObject())));
 };
 };
 }
}Debug.locals.put("fname", _fname);
;
 BA.debugLineNum = 379;BA.debugLine="For Each fname As String In l";
Debug.ShouldStop(67108864);
{
final RemoteObject group22 = _l;
final int groupLen22 = group22.runMethod(true,"getSize").<Integer>get()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_fname = BA.ObjectToString(group22.runMethod(false,"Get",index22));Debug.locals.put("fname", _fname);
Debug.locals.put("fname", _fname);
 BA.debugLineNum = 380;BA.debugLine="If fname.StartsWith(\"$\")=False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_fname.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("$"))),cclientftp.__c.getField(true,"False"))) { 
 BA.debugLineNum = 381;BA.debugLine="If File.IsDirectory(path,fname)=False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",cclientftp.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_path),(Object)(_fname)),cclientftp.__c.getField(true,"False"))) { 
 BA.debugLineNum = 382;BA.debugLine="Dim fti As CheckboxTreeItem";
Debug.ShouldStop(536870912);
_fti = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper");Debug.locals.put("fti", _fti);
 BA.debugLineNum = 383;BA.debugLine="fti.Initialize(\"ti\",fname)";
Debug.ShouldStop(1073741824);
_fti.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ti")),(Object)(_fname));
 BA.debugLineNum = 384;BA.debugLine="fti.Checked=False";
Debug.ShouldStop(-2147483648);
_fti.runMethod(true,"setChecked",cclientftp.__c.getField(true,"False"));
 BA.debugLineNum = 385;BA.debugLine="ti.Children.Add(fti)";
Debug.ShouldStop(1);
_ti.runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_fti.getObject())));
 };
 };
 }
}Debug.locals.put("fname", _fname);
;
 };
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sftp_uploadprogress(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _totaluploaded,RemoteObject _total) throws Exception{
try {
		Debug.PushSubsStack("sftp_UploadProgress (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("sftp_uploadprogress")) { return __ref.runUserSub(false, "cclientftp","sftp_uploadprogress", __ref, _serverpath, _totaluploaded, _total);}
Debug.locals.put("ServerPath", _serverpath);
Debug.locals.put("TotalUploaded", _totaluploaded);
Debug.locals.put("Total", _total);
 BA.debugLineNum = 256;BA.debugLine="Private Sub sftp_UploadProgress (ServerPath As Str";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Show (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cclientftp","show", __ref);}
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 30;BA.debugLine="Sub Show";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, cclientftp._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, cclientftp._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(-2147483648);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 33;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(1);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 34;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(2);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(cclientftp.__c.getField(true,"True"))})));
 BA.debugLineNum = 36;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(8);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(cclientftp._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 37;BA.debugLine="frm.RootPane.LoadLayout(\"mainFTP\")";
Debug.ShouldStop(16);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mainFTP")));
 BA.debugLineNum = 38;BA.debugLine="frm.Show";
Debug.ShouldStop(32);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 40;BA.debugLine="SplitPane1.LoadLayout(\"local\")";
Debug.ShouldStop(128);
__ref.getField(false,"_splitpane1" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("local")));
 BA.debugLineNum = 41;BA.debugLine="SplitPane1.LoadLayout(\"ftp\")";
Debug.ShouldStop(256);
__ref.getField(false,"_splitpane1" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ftp")));
 BA.debugLineNum = 43;BA.debugLine="DragAndDrop1.Initialize(Me)";
Debug.ShouldStop(1024);
__ref.getField(false,"_draganddrop1" /*RemoteObject*/ ).runClassMethod (b4j.docU.draganddrop.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 44;BA.debugLine="DragAndDrop1.MakeDragTarget(TreeViewFTP, \"DropTar";
Debug.ShouldStop(2048);
__ref.getField(false,"_draganddrop1" /*RemoteObject*/ ).runClassMethod (b4j.docU.draganddrop.class, "_makedragtarget" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_treeviewftp" /*RemoteObject*/ ).getObject()),(Object)(RemoteObject.createImmutable("DropTarget")));
 BA.debugLineNum = 46;BA.debugLine="If File.Exists(File.DirApp,\"save.map\") Then";
Debug.ShouldStop(8192);
if (cclientftp.__c.getField(false,"File").runMethod(true,"Exists",(Object)(cclientftp.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("save.map"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 47;BA.debugLine="Dim M As Map = File.ReadMap(File.DirApp,\"save.ma";
Debug.ShouldStop(16384);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = cclientftp.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(cclientftp.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("save.map")));Debug.locals.put("M", _m);Debug.locals.put("M", _m);
 BA.debugLineNum = 48;BA.debugLine="LocalPath=M.Get(\"localpath\")";
Debug.ShouldStop(32768);
__ref.setField ("_localpath" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("localpath"))))));
 BA.debugLineNum = 49;BA.debugLine="TextFTP.Text=M.Get(\"host\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_textftp" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("host"))))));
 BA.debugLineNum = 50;BA.debugLine="TextUser.Text=M.Get(\"user\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_textuser" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user"))))));
 BA.debugLineNum = 51;BA.debugLine="TextPassword.Text=M.Get(\"password\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_textpassword" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("password"))))));
 }else {
 BA.debugLineNum = 53;BA.debugLine="Dim M As Map = CreateMap(\"localpath\":LocalPath,\"";
Debug.ShouldStop(1048576);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = cclientftp.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("localpath")),(__ref.getField(true,"_localpath" /*RemoteObject*/ )),RemoteObject.createImmutable(("host")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("user")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("password")),(RemoteObject.createImmutable(""))}));Debug.locals.put("M", _m);Debug.locals.put("M", _m);
 BA.debugLineNum = 54;BA.debugLine="File.WriteMap(File.DirApp,\"save.map\",m)";
Debug.ShouldStop(2097152);
cclientftp.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(cclientftp.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("save.map")),(Object)(_m));
 };
 BA.debugLineNum = 57;BA.debugLine="TreeViewFTP.SetCheckBoxesMode";
Debug.ShouldStop(16777216);
__ref.getField(false,"_treeviewftp" /*RemoteObject*/ ).runVoidMethod ("SetCheckBoxesMode");
 BA.debugLineNum = 58;BA.debugLine="TreeViewLocal.SetCheckBoxesMode";
Debug.ShouldStop(33554432);
__ref.getField(false,"_treeviewlocal" /*RemoteObject*/ ).runVoidMethod ("SetCheckBoxesMode");
 BA.debugLineNum = 60;BA.debugLine="SD_LoadingIndicator1.Hide";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sd_loadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.sd_loadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 62;BA.debugLine="refreshtree";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshtree" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textinfo_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TextInfo_TextChanged (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("textinfo_textchanged")) { return __ref.runUserSub(false, "cclientftp","textinfo_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 174;BA.debugLine="Private Sub TextInfo_TextChanged (Old As String, N";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="TextInfo.SetSelection(New.Length,New.Length)";
Debug.ShouldStop(16384);
__ref.getField(false,"_textinfo" /*RemoteObject*/ ).runVoidMethod ("SetSelection",(Object)(_new.runMethod(true,"length")),(Object)(_new.runMethod(true,"length")));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _treeviewftp_selecteditemchanged(RemoteObject __ref,RemoteObject _selecteditem) throws Exception{
try {
		Debug.PushSubsStack("TreeViewFTP_SelectedItemChanged (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("treeviewftp_selecteditemchanged")) { return __ref.runUserSub(false, "cclientftp","treeviewftp_selecteditemchanged", __ref, _selecteditem);}
RemoteObject _v = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("SelectedItem", _selecteditem);
 BA.debugLineNum = 118;BA.debugLine="Private Sub TreeViewFTP_SelectedItemChanged (Selec";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="If SelectedItem.IsInitialized Then";
Debug.ShouldStop(4194304);
if (_selecteditem.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 120;BA.debugLine="TreeViewFTP.Root.Children.Clear";
Debug.ShouldStop(8388608);
__ref.getField(false,"_treeviewftp" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Clear");
 BA.debugLineNum = 121;BA.debugLine="Dim V As String = SelectedItem.Text";
Debug.ShouldStop(16777216);
_v = _selecteditem.runMethod(true,"getText");Debug.locals.put("V", _v);Debug.locals.put("V", _v);
 BA.debugLineNum = 122;BA.debugLine="If V=\"..\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_v,BA.ObjectToString(".."))) { 
 BA.debugLineNum = 123;BA.debugLine="If FTPPath<>\"/\"  Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_ftppath" /*RemoteObject*/ ),BA.ObjectToString("/"))) { 
 BA.debugLineNum = 124;BA.debugLine="Dim i As Int = FTPPath.LastIndexOf(\"/\")";
Debug.ShouldStop(134217728);
_i = __ref.getField(true,"_ftppath" /*RemoteObject*/ ).runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 125;BA.debugLine="FTPPath=FTPPath.SubString2(0,i)";
Debug.ShouldStop(268435456);
__ref.setField ("_ftppath" /*RemoteObject*/ ,__ref.getField(true,"_ftppath" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i)));
 };
 }else {
 BA.debugLineNum = 128;BA.debugLine="If SelectedItem.Image.IsInitialized Then FTPPat";
Debug.ShouldStop(-2147483648);
if (_selecteditem.runMethod(false,"getImage").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.setField ("_ftppath" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_ftppath" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_v));};
 };
 BA.debugLineNum = 130;BA.debugLine="refreshftp";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshftp" /*void*/ );
 };
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _treeviewlocal_selecteditemchanged(RemoteObject __ref,RemoteObject _selecteditem) throws Exception{
try {
		Debug.PushSubsStack("TreeViewLocal_SelectedItemChanged (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("treeviewlocal_selecteditemchanged")) { return __ref.runUserSub(false, "cclientftp","treeviewlocal_selecteditemchanged", __ref, _selecteditem);}
RemoteObject _v = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("SelectedItem", _selecteditem);
 BA.debugLineNum = 104;BA.debugLine="Private Sub TreeViewLocal_SelectedItemChanged (Sel";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="If SelectedItem.IsInitialized Then";
Debug.ShouldStop(256);
if (_selecteditem.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 106;BA.debugLine="TreeViewLocal.Root.Children.Clear";
Debug.ShouldStop(512);
__ref.getField(false,"_treeviewlocal" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Clear");
 BA.debugLineNum = 107;BA.debugLine="Dim V As String = SelectedItem.Text";
Debug.ShouldStop(1024);
_v = _selecteditem.runMethod(true,"getText");Debug.locals.put("V", _v);Debug.locals.put("V", _v);
 BA.debugLineNum = 108;BA.debugLine="If V=\"..\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_v,BA.ObjectToString(".."))) { 
 BA.debugLineNum = 109;BA.debugLine="Dim i As Int = LocalPath.LastIndexOf(\"\\\")";
Debug.ShouldStop(4096);
_i = __ref.getField(true,"_localpath" /*RemoteObject*/ ).runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("\\")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 110;BA.debugLine="LocalPath=LocalPath.SubString2(0,i)";
Debug.ShouldStop(8192);
__ref.setField ("_localpath" /*RemoteObject*/ ,__ref.getField(true,"_localpath" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i)));
 }else {
 BA.debugLineNum = 112;BA.debugLine="If File.IsDirectory(LocalPath,v) Then LocalPath";
Debug.ShouldStop(32768);
if (cclientftp.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(__ref.getField(true,"_localpath" /*RemoteObject*/ )),(Object)(_v)).<Boolean>get().booleanValue()) { 
__ref.setField ("_localpath" /*RemoteObject*/ ,cclientftp.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_localpath" /*RemoteObject*/ )),(Object)(_v)));};
 };
 BA.debugLineNum = 114;BA.debugLine="refreshtree";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshtree" /*RemoteObject*/ );
 };
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
public static RemoteObject  _upload(RemoteObject __ref,RemoteObject _local_filepath,RemoteObject _ftp_path) throws Exception{
try {
		Debug.PushSubsStack("upload (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,397);
if (RapidSub.canDelegate("upload")) { return __ref.runUserSub(false, "cclientftp","upload", __ref, _local_filepath, _ftp_path);}
ResumableSub_upload rsub = new ResumableSub_upload(null,__ref,_local_filepath,_ftp_path);
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
public static class ResumableSub_upload extends BA.ResumableSub {
public ResumableSub_upload(b4j.docU.cclientftp parent,RemoteObject __ref,RemoteObject _local_filepath,RemoteObject _ftp_path) {
this.parent = parent;
this.__ref = __ref;
this._local_filepath = _local_filepath;
this._ftp_path = _ftp_path;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cclientftp parent;
RemoteObject _local_filepath;
RemoteObject _ftp_path;
RemoteObject _res = RemoteObject.createImmutable(false);
RemoteObject _command = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _replycode = RemoteObject.createImmutable(0);
RemoteObject _replystring = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _ph = RemoteObject.createImmutable("");
RemoteObject _fn = RemoteObject.createImmutable("");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("upload (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,397);
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
Debug.locals.put("local_filepath", _local_filepath);
Debug.locals.put("ftp_path", _ftp_path);
 BA.debugLineNum = 398;BA.debugLine="Dim Res As Boolean = False";
Debug.ShouldStop(8192);
_res = parent.__c.getField(true,"False");Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 400;BA.debugLine="If File.IsDirectory(\"\",local_filepath) Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 26;
if (parent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(BA.ObjectToString("")),(Object)(_local_filepath)).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 25;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 401;BA.debugLine="sFTP.SendCommand(\"MKD\", ftp_path)";
Debug.ShouldStop(65536);
__ref.getField(false,"_sftp" /*RemoteObject*/ ).runVoidMethod ("SendCommand",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("MKD")),(Object)(_ftp_path));
 BA.debugLineNum = 403;BA.debugLine="Wait For sftp_CommandCompleted (Command As Strin";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","sftp_commandcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "upload"), null);
this.state = 27;
return;
case 27:
//C
this.state = 4;
_command = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Command", _command);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
_replycode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("ReplyCode", _replycode);
_replystring = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("ReplyString", _replystring);
;
 BA.debugLineNum = 404;BA.debugLine="If ReplyCode=\"550\" Then Success=True";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_replycode,BA.numberCast(double.class, "550"))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_success = parent.__c.getField(true,"True");Debug.locals.put("Success", _success);
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 405;BA.debugLine="Res=Success";
Debug.ShouldStop(1048576);
_res = _success;Debug.locals.put("Res", _res);
 BA.debugLineNum = 406;BA.debugLine="If Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 10:
//if
this.state = 23;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 407;BA.debugLine="For Each filename As String In File.ListFiles(l";
Debug.ShouldStop(4194304);
if (true) break;

case 13:
//for
this.state = 22;
group8 = parent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_local_filepath));
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("filename", _filename);
this.state = 28;
if (true) break;

case 28:
//C
this.state = 22;
if (index8 < groupLen8) {
this.state = 15;
_filename = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("filename", _filename);}
if (true) break;

case 29:
//C
this.state = 28;
index8++;
Debug.locals.put("filename", _filename);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 408;BA.debugLine="If File.IsDirectory(local_filepath,filename) T";
Debug.ShouldStop(8388608);
if (true) break;

case 16:
//if
this.state = 21;
if (parent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_local_filepath),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 410;BA.debugLine="Wait For (upload(local_filepath & \"\\\" & filen";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "upload"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_upload" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_local_filepath,RemoteObject.createImmutable("\\"),_filename)),(Object)(RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_filename))));
this.state = 30;
return;
case 30:
//C
this.state = 21;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 411;BA.debugLine="logInfo($\"Create path: ${filename}: ${Success";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_loginfo" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Create path: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable("")))));
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 414;BA.debugLine="Wait For (upload(local_filepath & \"\\\" & filen";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "upload"), __ref.runClassMethod (b4j.docU.cclientftp.class, "_upload" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_local_filepath,RemoteObject.createImmutable("\\"),_filename)),(Object)(_ftp_path)));
this.state = 31;
return;
case 31:
//C
this.state = 21;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 415;BA.debugLine="logInfo($\"Upload: ${filename}: ${Success}\"$)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_loginfo" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Upload: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable("")))));
 if (true) break;

case 21:
//C
this.state = 29;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
Debug.locals.put("filename", _filename);
;
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 420;BA.debugLine="Dim Ph As String = File.GetFileParent(local_file";
Debug.ShouldStop(8);
_ph = parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(_local_filepath));Debug.locals.put("Ph", _ph);Debug.locals.put("Ph", _ph);
 BA.debugLineNum = 421;BA.debugLine="Dim fn As String = File.GetName(local_filepath)";
Debug.ShouldStop(16);
_fn = parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_local_filepath));Debug.locals.put("fn", _fn);Debug.locals.put("fn", _fn);
 BA.debugLineNum = 422;BA.debugLine="sFTP.UploadFile(Ph,fn,False,ftp_path & \"/\" & fn)";
Debug.ShouldStop(32);
__ref.getField(false,"_sftp" /*RemoteObject*/ ).runVoidMethod ("UploadFile",__ref.getField(false, "ba"),(Object)(_ph),(Object)(_fn),(Object)(parent.__c.getField(true,"False")),(Object)(RemoteObject.concat(_ftp_path,RemoteObject.createImmutable("/"),_fn)));
 BA.debugLineNum = 424;BA.debugLine="Wait For sftp_UploadCompleted (ServerPath As Str";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","sftp_uploadcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cclientftp", "upload"), null);
this.state = 32;
return;
case 32:
//C
this.state = 26;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 425;BA.debugLine="Res=Success";
Debug.ShouldStop(256);
_res = _success;Debug.locals.put("Res", _res);
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 428;BA.debugLine="Return Res";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_res));return;};
 BA.debugLineNum = 429;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static void  _sftp_uploadcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static RemoteObject  _vftppath_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("vFTPpath_Action (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("vftppath_action")) { return __ref.runUserSub(false, "cclientftp","vftppath_action", __ref);}
 BA.debugLineNum = 169;BA.debugLine="Private Sub vFTPpath_Action";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="FTPPath=vFTPpath.Text";
Debug.ShouldStop(512);
__ref.setField ("_ftppath" /*RemoteObject*/ ,__ref.getField(false,"_vftppath" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 171;BA.debugLine="refreshftp";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshftp" /*void*/ );
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _vlocalpath_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("VlocalPath_Action (cclientftp) ","cclientftp",24,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("vlocalpath_action")) { return __ref.runUserSub(false, "cclientftp","vlocalpath_action", __ref);}
 BA.debugLineNum = 164;BA.debugLine="Private Sub VlocalPath_Action";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="LocalPath=vLocalPath.Text";
Debug.ShouldStop(16);
__ref.setField ("_localpath" /*RemoteObject*/ ,__ref.getField(false,"_vlocalpath" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 166;BA.debugLine="refreshtree";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.cclientftp.class, "_refreshtree" /*RemoteObject*/ );
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}