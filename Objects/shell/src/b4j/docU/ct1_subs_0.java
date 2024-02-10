package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ct1_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
ct1._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",ct1._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
ct1._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",ct1._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private frm As Form";
ct1._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",ct1._frm);
 //BA.debugLineNum = 9;BA.debugLine="Private btnSalir As Button";
ct1._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",ct1._btnsalir);
 //BA.debugLineNum = 10;BA.debugLine="Private jamTableView1 As jamTableView";
ct1._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",ct1._jamtableview1);
 //BA.debugLineNum = 12;BA.debugLine="Dim Dialog As B4XDialog";
ct1._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",ct1._dialog);
 //BA.debugLineNum = 13;BA.debugLine="Dim mSQL As SQL";
ct1._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",ct1._msql);
 //BA.debugLineNum = 15;BA.debugLine="Public PermisoUsuarioModulo As String";
ct1._permisousuariomodulo = RemoteObject.createImmutable("");__ref.setField("_permisousuariomodulo",ct1._permisousuariomodulo);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (ct1) ","ct1",49,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "ct1","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}