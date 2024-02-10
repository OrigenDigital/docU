package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jamlinknavision_subs_0 {


public static RemoteObject  _abrirlinkfichanav(RemoteObject _titulowindow,RemoteObject _codigopaginanav,RemoteObject _campoclave,RemoteObject _valorregistro) throws Exception{
try {
		Debug.PushSubsStack("AbrirLinkFichaNAV (jamlinknavision) ","jamlinknavision",78,jamlinknavision.ba,jamlinknavision.mostCurrent,25);
if (RapidSub.canDelegate("abrirlinkfichanav")) { return b4j.docU.jamlinknavision.remoteMe.runUserSub(false, "jamlinknavision","abrirlinkfichanav", _titulowindow, _codigopaginanav, _campoclave, _valorregistro);}
ResumableSub_AbrirLinkFichaNAV rsub = new ResumableSub_AbrirLinkFichaNAV(null,_titulowindow,_codigopaginanav,_campoclave,_valorregistro);
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
public static class ResumableSub_AbrirLinkFichaNAV extends BA.ResumableSub {
public ResumableSub_AbrirLinkFichaNAV(b4j.docU.jamlinknavision parent,RemoteObject _titulowindow,RemoteObject _codigopaginanav,RemoteObject _campoclave,RemoteObject _valorregistro) {
this.parent = parent;
this._titulowindow = _titulowindow;
this._codigopaginanav = _codigopaginanav;
this._campoclave = _campoclave;
this._valorregistro = _valorregistro;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jamlinknavision parent;
RemoteObject _titulowindow;
RemoteObject _codigopaginanav;
RemoteObject _campoclave;
RemoteObject _valorregistro;
RemoteObject _wu = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _flagok = RemoteObject.createImmutable(false);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _t = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _navfilepath = RemoteObject.createImmutable("");
RemoteObject _filtroregistro = RemoteObject.createImmutable("");
RemoteObject _navhyperlink = RemoteObject.createImmutable("");
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _user32 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject group6;
int index6;
int groupLen6;
int step35;
int limit35;
RemoteObject group43;
int index43;
int groupLen43;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AbrirLinkFichaNAV (jamlinknavision) ","jamlinknavision",78,jamlinknavision.ba,jamlinknavision.mostCurrent,25);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("TituloWindow", _titulowindow);
Debug.locals.put("CodigoPaginaNav", _codigopaginanav);
Debug.locals.put("CampoClave", _campoclave);
Debug.locals.put("ValorRegistro", _valorregistro);
 BA.debugLineNum = 28;BA.debugLine="Log(\"Buscando window title \" & TituloWindow)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9139788291",RemoteObject.concat(RemoteObject.createImmutable("Buscando window title "),_titulowindow),0);
 BA.debugLineNum = 31;BA.debugLine="Dim WU As JavaObject";
Debug.JustUpdateDeviceLine();
_wu = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("WU", _wu);
 BA.debugLineNum = 32;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.WindowU";
Debug.JustUpdateDeviceLine();
_wu.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.jna.platform.WindowUtils")));
 BA.debugLineNum = 33;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",Arra";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _wu.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAllWindows")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"False"))}))));Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 34;BA.debugLine="Dim FlagOk As Boolean";
Debug.JustUpdateDeviceLine();
_flagok = RemoteObject.createImmutable(false);Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 35;BA.debugLine="For Each JO As JavaObject In L";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 8;
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
group6 = _l;
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("JO", _jo);
this.state = 63;
if (true) break;

case 63:
//C
this.state = 8;
if (index6 < groupLen6) {
this.state = 3;
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), group6.runMethod(false,"Get",index6));Debug.locals.put("JO", _jo);}
if (true) break;

case 64:
//C
this.state = 63;
index6++;
Debug.locals.put("JO", _jo);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 36;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Null)";
Debug.JustUpdateDeviceLine();
_t = BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTitle")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 38;BA.debugLine="Log(\"window title\" & t)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9139788301",RemoteObject.concat(RemoteObject.createImmutable("window title"),_t),0);
 BA.debugLineNum = 42;BA.debugLine="If t.Contains(TituloWindow) And t.Contains(Valor";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(".",_t.runMethod(true,"contains",(Object)(_titulowindow))) && RemoteObject.solveBoolean(".",_t.runMethod(true,"contains",(Object)(_valorregistro)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 49;BA.debugLine="FlagOk=True";
Debug.JustUpdateDeviceLine();
_flagok = parent.__c.getField(true,"True");Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 50;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 64;
;
 if (true) break;
if (true) break;
Debug.locals.put("JO", _jo);
;
 BA.debugLineNum = 54;BA.debugLine="If FlagOk Then";
Debug.JustUpdateDeviceLine();

case 8:
//if
this.state = 21;
if (_flagok.<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 55;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Ya hay una";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"Msgbox2Async",jamlinknavision.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ya hay una ventana abierta con el título: "),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTitle")),(Object)((parent.__c.getField(false,"Null")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"))),(Object)(BA.ObjectToString("Aviso")),(Object)(BA.ObjectToString("Abrir Nueva")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Abrir Actual")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 56;BA.debugLine="Wait For (msa) Msgbox_Result (RInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamlinknavision.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamlinknavision", "abrirlinkfichanav"), _msa);
this.state = 65;
return;
case 65:
//C
this.state = 11;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RInt", _rint);
;
 BA.debugLineNum = 57;BA.debugLine="If RInt=xui.DialogResponse_Cancel Then Return Fa";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Cancel")))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 58;BA.debugLine="If RInt =xui.DialogResponse_Negative Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Negative")))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 65;BA.debugLine="SetForegroundWindow(t,False)";
Debug.JustUpdateDeviceLine();
_setforegroundwindow(_t,parent.__c.getField(true,"False"));
 BA.debugLineNum = 66;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 70;BA.debugLine="Dim NavFilePath As String=\"C:\\Program Files (x86)";
Debug.JustUpdateDeviceLine();
_navfilepath = BA.ObjectToString("C:\\Program Files (x86)\\Microsoft Dynamics NAV\\90\\RoleTailored Client\\Microsoft.Dynamics.Nav.Client.exe");Debug.locals.put("NavFilePath", _navfilepath);Debug.locals.put("NavFilePath", _navfilepath);
 BA.debugLineNum = 72;BA.debugLine="Dim FiltroRegistro As String=\"&$filter='\" & Campo";
Debug.JustUpdateDeviceLine();
_filtroregistro = RemoteObject.concat(RemoteObject.createImmutable("&$filter='"),_campoclave,RemoteObject.createImmutable("'%20IS%20"),_valorregistro);Debug.locals.put("FiltroRegistro", _filtroregistro);Debug.locals.put("FiltroRegistro", _filtroregistro);
 BA.debugLineNum = 74;BA.debugLine="Dim NAVHyperlink As String=\"Dynamicsnav://NAVISIO";
Debug.JustUpdateDeviceLine();
_navhyperlink = RemoteObject.concat(RemoteObject.createImmutable("Dynamicsnav://NAVISION2012:7046/PROIN/PROIN%20PINILLA/runpage?page="),_codigopaginanav,_filtroregistro);Debug.locals.put("NAVHyperlink", _navhyperlink);Debug.locals.put("NAVHyperlink", _navhyperlink);
 BA.debugLineNum = 76;BA.debugLine="Log(\"Microsoft.Dynamics.Nav.Client.exe \" & NAVHyp";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9139788339",RemoteObject.concat(RemoteObject.createImmutable("Microsoft.Dynamics.Nav.Client.exe "),_navhyperlink),0);
 BA.debugLineNum = 77;BA.debugLine="Dim shl As Shell";
Debug.JustUpdateDeviceLine();
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 78;BA.debugLine="shl.Initialize(\"shl\",NavFilePath, Array As String";
Debug.JustUpdateDeviceLine();
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(_navfilepath),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_navhyperlink})))));
 BA.debugLineNum = 80;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
if (true) break;

case 22:
//try
this.state = 62;
this.catchState = 55;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 55;
 BA.debugLineNum = 81;BA.debugLine="shl.Run(-1)";
Debug.JustUpdateDeviceLine();
_shl.runVoidMethod ("Run",jamlinknavision.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 82;BA.debugLine="Log(\"try Success\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9139788345",RemoteObject.createImmutable("try Success"),0);
 BA.debugLineNum = 83;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolea";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", jamlinknavision.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamlinknavision", "abrirlinkfichanav"), null);
this.state = 66;
return;
case 66:
//C
this.state = 25;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 84;BA.debugLine="If Success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 25:
//if
this.state = 53;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 27;
}else {
this.state = 46;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 114;BA.debugLine="Dim FlagOk As Boolean";
Debug.JustUpdateDeviceLine();
_flagok = RemoteObject.createImmutable(false);Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 115;BA.debugLine="For i=0 To 3 ' intentarlo 3 veces ... por si na";
Debug.JustUpdateDeviceLine();
if (true) break;

case 28:
//for
this.state = 44;
step35 = 1;
limit35 = 3;
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 67;
if (true) break;

case 67:
//C
this.state = 44;
if ((step35 > 0 && _i <= limit35) || (step35 < 0 && _i >= limit35)) this.state = 30;
if (true) break;

case 68:
//C
this.state = 67;
_i = ((int)(0 + _i + step35)) ;
Debug.locals.put("i", _i);
if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 116;BA.debugLine="Sleep(1000) ' dar tiempo a que la ventana se a";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",jamlinknavision.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamlinknavision", "abrirlinkfichanav"),BA.numberCast(int.class, 1000));
this.state = 69;
return;
case 69:
//C
this.state = 31;
;
 BA.debugLineNum = 117;BA.debugLine="Log(\"Buscando window title \" & TituloWindow)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9139788380",RemoteObject.concat(RemoteObject.createImmutable("Buscando window title "),_titulowindow),0);
 BA.debugLineNum = 118;BA.debugLine="Dim WU As JavaObject";
Debug.JustUpdateDeviceLine();
_wu = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("WU", _wu);
 BA.debugLineNum = 119;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.Wind";
Debug.JustUpdateDeviceLine();
_wu.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.jna.platform.WindowUtils")));
 BA.debugLineNum = 120;BA.debugLine="Dim user32 As JavaObject";
Debug.JustUpdateDeviceLine();
_user32 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("user32", _user32);
 BA.debugLineNum = 121;BA.debugLine="user32 = user32.InitializeStatic(\"com.sun.jna.";
Debug.JustUpdateDeviceLine();
_user32 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _user32.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.jna.platform.win32.User32"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("INSTANCE"))));Debug.locals.put("user32", _user32);
 BA.debugLineNum = 122;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",A";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _wu.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAllWindows")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"False"))}))));Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 123;BA.debugLine="For Each JO As JavaObject In L";
Debug.JustUpdateDeviceLine();
if (true) break;

case 31:
//for
this.state = 38;
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
group43 = _l;
index43 = 0;
groupLen43 = group43.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("JO", _jo);
this.state = 70;
if (true) break;

case 70:
//C
this.state = 38;
if (index43 < groupLen43) {
this.state = 33;
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), group43.runMethod(false,"Get",index43));Debug.locals.put("JO", _jo);}
if (true) break;

case 71:
//C
this.state = 70;
index43++;
Debug.locals.put("JO", _jo);
if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 124;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Nul";
Debug.JustUpdateDeviceLine();
_t = BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTitle")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 126;BA.debugLine="If t.Contains(TituloWindow) And t.Contains(Va";
Debug.JustUpdateDeviceLine();
if (true) break;

case 34:
//if
this.state = 37;
if (RemoteObject.solveBoolean(".",_t.runMethod(true,"contains",(Object)(_titulowindow))) && RemoteObject.solveBoolean(".",_t.runMethod(true,"contains",(Object)(_valorregistro)))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 127;BA.debugLine="SetForegroundWindow(t,False)";
Debug.JustUpdateDeviceLine();
_setforegroundwindow(_t,parent.__c.getField(true,"False"));
 BA.debugLineNum = 128;BA.debugLine="FlagOk=True";
Debug.JustUpdateDeviceLine();
_flagok = parent.__c.getField(true,"True");Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 129;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 38;
if (true) break;
 if (true) break;

case 37:
//C
this.state = 71;
;
 if (true) break;
if (true) break;
Debug.locals.put("JO", _jo);
;
 BA.debugLineNum = 132;BA.debugLine="If FlagOk Then Exit";
Debug.JustUpdateDeviceLine();

case 38:
//if
this.state = 43;
if (_flagok.<Boolean>get().booleanValue()) { 
this.state = 40;
;}if (true) break;

case 40:
//C
this.state = 43;
this.state = 44;
if (true) break;
if (true) break;

case 43:
//C
this.state = 68;
;
 if (true) break;
if (true) break;

case 44:
//C
this.state = 53;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 134;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 143;BA.debugLine="If StdErr.Contains(shl.WorkingDirectory) Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 47:
//if
this.state = 52;
if (_stderr.runMethod(true,"contains",(Object)(_shl.runMethod(true,"getWorkingDirectory"))).<Boolean>get().booleanValue()) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
 BA.debugLineNum = 144;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La aplicaci";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamlinknavision.ba,(Object)(BA.ObjectToString("La aplicación NAVISION no está instalada en el directorio predeterminado.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 145;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamlinknavision.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamlinknavision", "abrirlinkfichanav"), _msa);
this.state = 72;
return;
case 72:
//C
this.state = 52;
;
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 147;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(StdErr,\"Erro";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamlinknavision.ba,(Object)(_stderr),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 148;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamlinknavision.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamlinknavision", "abrirlinkfichanav"), _msa);
this.state = 73;
return;
case 73:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 BA.debugLineNum = 150;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 53:
//C
this.state = 62;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 55:
//C
this.state = 56;
this.catchState = 0;
 BA.debugLineNum = 154;BA.debugLine="Log(LastException)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9139788417",BA.ObjectToString(parent.__c.runMethod(false,"LastException",jamlinknavision.ba)),0);
 BA.debugLineNum = 155;BA.debugLine="If LastException.Message.Contains(shl.WorkingDir";
Debug.JustUpdateDeviceLine();
if (true) break;

case 56:
//if
this.state = 61;
if (parent.__c.runMethod(false,"LastException",jamlinknavision.ba).runMethod(true,"getMessage").runMethod(true,"contains",(Object)(_shl.runMethod(true,"getWorkingDirectory"))).<Boolean>get().booleanValue()) { 
this.state = 58;
}else {
this.state = 60;
}if (true) break;

case 58:
//C
this.state = 61;
 BA.debugLineNum = 156;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La aplicació";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamlinknavision.ba,(Object)(BA.ObjectToString("La aplicación NAVISION no está instalada en el directorio predeterminado.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 157;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamlinknavision.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamlinknavision", "abrirlinkfichanav"), _msa);
this.state = 74;
return;
case 74:
//C
this.state = 61;
;
 if (true) break;

case 60:
//C
this.state = 61;
 BA.debugLineNum = 159;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(LastException";
Debug.JustUpdateDeviceLine();
_msa = parent._xui.runMethod(false,"MsgboxAsync",jamlinknavision.ba,(Object)(parent.__c.runMethod(false,"LastException",jamlinknavision.ba).runMethod(true,"getMessage")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 160;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", jamlinknavision.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamlinknavision", "abrirlinkfichanav"), _msa);
this.state = 75;
return;
case 75:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = 62;
;
 BA.debugLineNum = 162;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 62:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",jamlinknavision.ba, e0.toString());}
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
public static void  _msgbox_result(RemoteObject _rint) throws Exception{
}
public static void  _shl_processcompleted(RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
jamlinknavision._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
jamlinknavision._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setforegroundwindow(RemoteObject _title,RemoteObject _justfind) throws Exception{
try {
		Debug.PushSubsStack("SetForegroundWindow (jamlinknavision) ","jamlinknavision",78,jamlinknavision.ba,jamlinknavision.mostCurrent,167);
if (RapidSub.canDelegate("setforegroundwindow")) { return b4j.docU.jamlinknavision.remoteMe.runUserSub(false, "jamlinknavision","setforegroundwindow", _title, _justfind);}
Debug.locals.put("Title", _title);
Debug.locals.put("JustFind", _justfind);
 BA.debugLineNum = 167;BA.debugLine="Sub SetForegroundWindow(Title As String, JustFind";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 168;BA.debugLine="Return Me.As(JavaObject).RunMethod(\"SetForeground";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), jamlinknavision.getObject())).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("SetForegroundWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_title),(_justfind)}))));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}