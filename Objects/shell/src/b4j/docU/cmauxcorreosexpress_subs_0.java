package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cmauxcorreosexpress_subs_0 {


public static RemoteObject  _cargalistaestadoscorreosexpress() throws Exception{
try {
		Debug.PushSubsStack("CargaListaEstadosCorreosExpress (cmauxcorreosexpress) ","cmauxcorreosexpress",42,cmauxcorreosexpress.ba,cmauxcorreosexpress.mostCurrent,9);
if (RapidSub.canDelegate("cargalistaestadoscorreosexpress")) { return b4j.docU.cmauxcorreosexpress.remoteMe.runUserSub(false, "cmauxcorreosexpress","cargalistaestadoscorreosexpress");}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
 BA.debugLineNum = 9;BA.debugLine="Sub CargaListaEstadosCorreosExpress";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="lstEstadosCorreosExpress.Initialize";
Debug.ShouldStop(512);
cmauxcorreosexpress._lstestadoscorreosexpress.runVoidMethod ("Initialize");
 BA.debugLineNum = 11;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(1024);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 12;BA.debugLine="lstEstadosCorreosExpress=su.LoadCSV(File.DirAsset";
Debug.ShouldStop(2048);
cmauxcorreosexpress._lstestadoscorreosexpress = _su.runMethod(false,"LoadCSV",(Object)(cmauxcorreosexpress.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("CodigosEstadosCorreosExpress.csv")),(Object)(BA.ObjectToChar(RemoteObject.createImmutable(";"))));
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargalistaincidenciascorreosexpress() throws Exception{
try {
		Debug.PushSubsStack("CargaListaIncidenciasCorreosExpress (cmauxcorreosexpress) ","cmauxcorreosexpress",42,cmauxcorreosexpress.ba,cmauxcorreosexpress.mostCurrent,15);
if (RapidSub.canDelegate("cargalistaincidenciascorreosexpress")) { return b4j.docU.cmauxcorreosexpress.remoteMe.runUserSub(false, "cmauxcorreosexpress","cargalistaincidenciascorreosexpress");}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
 BA.debugLineNum = 15;BA.debugLine="Sub CargaListaIncidenciasCorreosExpress";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="lstCodigosIncidenciasCorreosExpress.Initialize";
Debug.ShouldStop(32768);
cmauxcorreosexpress._lstcodigosincidenciascorreosexpress.runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(65536);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 18;BA.debugLine="lstCodigosIncidenciasCorreosExpress=su.LoadCSV(Fi";
Debug.ShouldStop(131072);
cmauxcorreosexpress._lstcodigosincidenciascorreosexpress = _su.runMethod(false,"LoadCSV",(Object)(cmauxcorreosexpress.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("CodigosIncidenciasCorreosExpress.csv")),(Object)(BA.ObjectToChar(RemoteObject.createImmutable(";"))));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
cmauxcorreosexpress._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 5;BA.debugLine="Public lstCodigosIncidenciasCorreosExpress As Lis";
cmauxcorreosexpress._lstcodigosincidenciascorreosexpress = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 6;BA.debugLine="Public lstEstadosCorreosExpress As List";
cmauxcorreosexpress._lstestadoscorreosexpress = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}