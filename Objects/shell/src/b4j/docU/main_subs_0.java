package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,606);
if (RapidSub.canDelegate("application_error")) { return b4j.docU.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _serrmsg = RemoteObject.createImmutable("");
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 606;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 609;BA.debugLine="LogError(StackTrace)";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("LogError",(Object)(_stacktrace));
 BA.debugLineNum = 611;BA.debugLine="If File.Exists(xui.DefaultFolder,\"logCrash.txt\")";
Debug.ShouldStop(4);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main._xui.runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("logCrash.txt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 612;BA.debugLine="File.Delete(xui.DefaultFolder,\"logCrash.txt\")";
Debug.ShouldStop(8);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main._xui.runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("logCrash.txt")));
 };
 BA.debugLineNum = 614;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy hh:mm:ss\"";
Debug.ShouldStop(32);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yy hh:mm:ss"));
 BA.debugLineNum = 615;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(64);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 616;BA.debugLine="sb.Initialize";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 617;BA.debugLine="sb.Append(\"Error \" & DateTime.Date(DateTime.Now))";
Debug.ShouldStop(256);
_sb.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error "),main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")))))).runMethod(false,"Append",(Object)(main.__c.getField(true,"CRLF"))).runMethod(false,"Append",(Object)(main.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(_stacktrace));
 BA.debugLineNum = 618;BA.debugLine="sb.Append(CRLF).Append(Error)";
Debug.ShouldStop(512);
_sb.runMethod(false,"Append",(Object)(main.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(BA.ObjectToString(_error)));
 BA.debugLineNum = 619;BA.debugLine="Dim sErrMsg As String=sb.ToString";
Debug.ShouldStop(1024);
_serrmsg = _sb.runMethod(true,"ToString");Debug.locals.put("sErrMsg", _serrmsg);Debug.locals.put("sErrMsg", _serrmsg);
 BA.debugLineNum = 621;BA.debugLine="File.WriteString(xui.DefaultFolder,\"logCrash.txt\"";
Debug.ShouldStop(4096);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main._xui.runMethod(true,"getDefaultFolder")),(Object)(BA.ObjectToString("logCrash.txt")),(Object)(_serrmsg));
 BA.debugLineNum = 622;BA.debugLine="EnviarEmailErrorApp";
Debug.ShouldStop(8192);
_enviaremailerrorapp();
 BA.debugLineNum = 623;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) return main.__c.getField(true,"False");
 BA.debugLineNum = 624;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,162);
if (RapidSub.canDelegate("appstart")) { return b4j.docU.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _rb = RemoteObject.declareNull("butt.droid.awtRobot.AWTRobot");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _msys = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _minfosystem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _local = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper");
RemoteObject _mscreendim = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 162;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 164;BA.debugLine="xui.SetDataFolder(NombreAplicacion)";
Debug.ShouldStop(8);
main._xui.runVoidMethod ("SetDataFolder",(Object)(main._nombreaplicacion));
 BA.debugLineNum = 167;BA.debugLine="Log(\"File.DirApp \" & File.DirApp)";
Debug.ShouldStop(64);
main.__c.runVoidMethod ("LogImpl","865541",RemoteObject.concat(RemoteObject.createImmutable("File.DirApp "),main.__c.getField(false,"File").runMethod(true,"getDirApp")),0);
 BA.debugLineNum = 177;BA.debugLine="Robot = Robot.InitializeStatic(\"com.sun.glass.ui.";
Debug.ShouldStop(65536);
main._robot = main._robot.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.glass.ui.Application"))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("GetApplication")),(Object)((main.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("createRobot")),(Object)((main.__c.getField(false,"Null"))));
 BA.debugLineNum = 179;BA.debugLine="mConfiguracionUsuario.Initialize";
Debug.ShouldStop(262144);
main._mconfiguracionusuario.runVoidMethod ("Initialize");
 BA.debugLineNum = 183;BA.debugLine="Dim rb As AWTRobot";
Debug.ShouldStop(4194304);
_rb = RemoteObject.createNew ("butt.droid.awtRobot.AWTRobot");Debug.locals.put("rb", _rb);
 BA.debugLineNum = 184;BA.debugLine="DatosUsuario.Dispositivo=rb.SystemHostNameAndIPAd";
Debug.ShouldStop(8388608);
main._datosusuario.setField ("Dispositivo" /*RemoteObject*/ ,_rb.runMethod(true,"SystemHostNameAndIPAddress"));
 BA.debugLineNum = 185;BA.debugLine="DatosUsuario.NombreUsuarioWindows=GetSystemProper";
Debug.ShouldStop(16777216);
main._datosusuario.setField ("NombreUsuarioWindows" /*RemoteObject*/ ,main.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("user.name")),(Object)(RemoteObject.createImmutable("default"))));
 BA.debugLineNum = 187;BA.debugLine="Dim JO As JavaObject";
Debug.ShouldStop(67108864);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("JO", _jo);
 BA.debugLineNum = 188;BA.debugLine="JO.InitializeStatic(\"java.lang.System\")";
Debug.ShouldStop(134217728);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.lang.System")));
 BA.debugLineNum = 190;BA.debugLine="Dim mSys As JavaObject=JO.RunMethodJO(\"getenv\",Nu";
Debug.ShouldStop(536870912);
_msys = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_msys = _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getenv")),(Object)((main.__c.getField(false,"Null"))));Debug.locals.put("mSys", _msys);Debug.locals.put("mSys", _msys);
 BA.debugLineNum = 191;BA.debugLine="Log(mSys)";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("LogImpl","865565",BA.ObjectToString(_msys),0);
 BA.debugLineNum = 192;BA.debugLine="Dim mInfoSystem As Map=mSys";
Debug.ShouldStop(-2147483648);
_minfosystem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_minfosystem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _msys.getObject());Debug.locals.put("mInfoSystem", _minfosystem);Debug.locals.put("mInfoSystem", _minfosystem);
 BA.debugLineNum = 193;BA.debugLine="DatosUsuario.DominioUsuarioWindows=mInfoSystem.Ge";
Debug.ShouldStop(1);
main._datosusuario.setField ("DominioUsuarioWindows" /*RemoteObject*/ ,BA.ObjectToString(_minfosystem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("USERDOMAIN"))))));
 BA.debugLineNum = 194;BA.debugLine="DatosUsuario.NombreADUsuarioWindows=DatosUsuario.";
Debug.ShouldStop(2);
main._datosusuario.setField ("NombreADUsuarioWindows" /*RemoteObject*/ ,RemoteObject.concat(main._datosusuario.getField(true,"DominioUsuarioWindows" /*RemoteObject*/ ),RemoteObject.createImmutable("\\"),main._datosusuario.getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )));
 BA.debugLineNum = 196;BA.debugLine="Dim local As ServerSocket";
Debug.ShouldStop(8);
_local = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper");Debug.locals.put("local", _local);
 BA.debugLineNum = 197;BA.debugLine="local.Initialize(1, \"\")";
Debug.ShouldStop(16);
_local.runVoidMethod ("Initialize",main.ba,(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 199;BA.debugLine="DatosUsuario.IPConexion=local.GetMyIP";
Debug.ShouldStop(64);
main._datosusuario.setField ("IPConexion" /*RemoteObject*/ ,_local.runMethod(true,"GetMyIP"));
 BA.debugLineNum = 201;BA.debugLine="If DatosUsuario.IPConexion.StartsWith(\"192.168.10";
Debug.ShouldStop(256);
if (main._datosusuario.getField(true,"IPConexion" /*RemoteObject*/ ).runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("192.168.10."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 202;BA.debugLine="AlmacenIPConexion=\"PROIN\"";
Debug.ShouldStop(512);
main._almacenipconexion = BA.ObjectToString("PROIN");
 };
 BA.debugLineNum = 205;BA.debugLine="If DatosUsuario.IPConexion.StartsWith(\"192.168.20";
Debug.ShouldStop(4096);
if (main._datosusuario.getField(true,"IPConexion" /*RemoteObject*/ ).runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("192.168.20."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 206;BA.debugLine="AlmacenIPConexion=\"PROTEC\"";
Debug.ShouldStop(8192);
main._almacenipconexion = BA.ObjectToString("PROTEC");
 };
 BA.debugLineNum = 209;BA.debugLine="If DatosUsuario.IPConexion.StartsWith(\"10.0.0.\")";
Debug.ShouldStop(65536);
if (main._datosusuario.getField(true,"IPConexion" /*RemoteObject*/ ).runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("10.0.0."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 210;BA.debugLine="AlmacenIPConexion=\"PROTEC\"";
Debug.ShouldStop(131072);
main._almacenipconexion = BA.ObjectToString("PROTEC");
 };
 BA.debugLineNum = 213;BA.debugLine="If DatosUsuario.IPConexion.StartsWith(\"192.168.11";
Debug.ShouldStop(1048576);
if (main._datosusuario.getField(true,"IPConexion" /*RemoteObject*/ ).runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("192.168.11"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 214;BA.debugLine="AlmacenIPConexion=\"PROIN\"";
Debug.ShouldStop(2097152);
main._almacenipconexion = BA.ObjectToString("PROIN");
 };
 BA.debugLineNum = 217;BA.debugLine="If AlmacenIPConexion<>\"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("!",main._almacenipconexion,BA.ObjectToString(""))) { 
 BA.debugLineNum = 218;BA.debugLine="AlmacenConexion=AlmacenIPConexion";
Debug.ShouldStop(33554432);
main._almacenconexion = main._almacenipconexion;
 };
 BA.debugLineNum = 243;BA.debugLine="Dim mScreenDim As Map";
Debug.ShouldStop(262144);
_mscreendim = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mScreenDim", _mscreendim);
 BA.debugLineNum = 244;BA.debugLine="mScreenDim.Initialize";
Debug.ShouldStop(524288);
_mscreendim.runVoidMethod ("Initialize");
 BA.debugLineNum = 245;BA.debugLine="mScreenDim=Utilidades.DimensionesPantalla";
Debug.ShouldStop(1048576);
_mscreendim = main._utilidades.runMethod(false,"_dimensionespantalla" /*RemoteObject*/ );Debug.locals.put("mScreenDim", _mscreendim);
 BA.debugLineNum = 246;BA.debugLine="xScreen=mScreenDim.Get(\"X\")";
Debug.ShouldStop(2097152);
main._xscreen = BA.numberCast(int.class, _mscreendim.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("X")))));
 BA.debugLineNum = 247;BA.debugLine="yScreen=mScreenDim.Get(\"Y\")";
Debug.ShouldStop(4194304);
main._yscreen = BA.numberCast(int.class, _mscreendim.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Y")))));
 BA.debugLineNum = 251;BA.debugLine="awesome = fx.CreateFontAwesome(14)";
Debug.ShouldStop(67108864);
main._awesome = main._fx.runMethod(false,"CreateFontAwesome",(Object)(BA.numberCast(double.class, 14)));
 BA.debugLineNum = 262;BA.debugLine="lstSelItem.Initialize";
Debug.ShouldStop(32);
main._lstselitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 264;BA.debugLine="Inicio";
Debug.ShouldStop(128);
_inicio();
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargadatosgrabadosconfiguracionusuario() throws Exception{
try {
		Debug.PushSubsStack("CargaDatosGrabadosConfiguracionUsuario (main) ","main",0,main.ba,main.mostCurrent,510);
if (RapidSub.canDelegate("cargadatosgrabadosconfiguracionusuario")) { return b4j.docU.main.remoteMe.runUserSub(false, "main","cargadatosgrabadosconfiguracionusuario");}
RemoteObject _confusuario = RemoteObject.createImmutable(false);
RemoteObject _ser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
RemoteObject _opt = null;
 BA.debugLineNum = 510;BA.debugLine="Sub CargaDatosGrabadosConfiguracionUsuario As Bool";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 511;BA.debugLine="Dim ConfUsuario As Boolean=True";
Debug.ShouldStop(1073741824);
_confusuario = main.__c.getField(true,"True");Debug.locals.put("ConfUsuario", _confusuario);Debug.locals.put("ConfUsuario", _confusuario);
 BA.debugLineNum = 512;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 513;BA.debugLine="If File.Exists(UserFolder, \"ConfiguracionUsuario";
Debug.ShouldStop(1);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main._userfolder),(Object)(RemoteObject.createImmutable("ConfiguracionUsuario.txt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 514;BA.debugLine="Dim ser As B4XSerializator";
Debug.ShouldStop(2);
_ser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("ser", _ser);
 BA.debugLineNum = 515;BA.debugLine="Dim opt() As Object = ser.ConvertBytesToObject(";
Debug.ShouldStop(4);
_opt = (_ser.runMethod(false,"ConvertBytesToObject",(Object)(main.__c.getField(false,"File").runMethod(false,"ReadBytes",(Object)(main._userfolder),(Object)(RemoteObject.createImmutable("ConfiguracionUsuario.txt"))))));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 516;BA.debugLine="mConfiguracionUsuario = opt(0)";
Debug.ShouldStop(8);
main._mconfiguracionusuario = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _opt.getArrayElement(false,BA.numberCast(int.class, 0)));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e9.toString()); BA.debugLineNum = 519;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
main.__c.runVoidMethod ("LogImpl","8393225",BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba)),0);
 BA.debugLineNum = 521;BA.debugLine="ConfUsuario=False";
Debug.ShouldStop(256);
_confusuario = main.__c.getField(true,"False");Debug.locals.put("ConfUsuario", _confusuario);
 };
 BA.debugLineNum = 523;BA.debugLine="Return ConfUsuario";
Debug.ShouldStop(1024);
if (true) return _confusuario;
 BA.debugLineNum = 524;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargapermisosusuario() throws Exception{
try {
		Debug.PushSubsStack("CargaPermisosUsuario (main) ","main",0,main.ba,main.mostCurrent,665);
if (RapidSub.canDelegate("cargapermisosusuario")) { return b4j.docU.main.remoteMe.runUserSub(false, "main","cargapermisosusuario");}
ResumableSub_CargaPermisosUsuario rsub = new ResumableSub_CargaPermisosUsuario(null);
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
public static class ResumableSub_CargaPermisosUsuario extends BA.ResumableSub {
public ResumableSub_CargaPermisosUsuario(b4j.docU.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.main parent;
RemoteObject _permisoapp = RemoteObject.createImmutable("");
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaPermisosUsuario (main) ","main",0,main.ba,main.mostCurrent,665);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 666;BA.debugLine="Dim PermisoAPP As String";
Debug.ShouldStop(33554432);
_permisoapp = RemoteObject.createImmutable("");Debug.locals.put("PermisoAPP", _permisoapp);
 BA.debugLineNum = 667;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioObje";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cargapermisosusuario"), parent._cmpermisos.runMethod(false,"_permisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._rdclinkmysqldatoscomunes),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._nombreaplicacion),(Object)(parent._datosusuario.getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Aplicacion"))));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 668;BA.debugLine="Select Case sRes";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_sres,BA.ObjectToString("ErrConn"),BA.ObjectToString("SinPermiso"),BA.ObjectToString("ERROR"),BA.ObjectToString("DENIED"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
case 3: {
this.state = 9;
if (true) break;
}
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 670;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de con";
Debug.ShouldStop(536870912);
_msa = parent._xui.runMethod(false,"MsgboxAsync",main.ba,(Object)(BA.ObjectToString("Error de conexion servidor/query.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 671;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cargapermisosusuario"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 672;BA.debugLine="PermisoAPP=\"NO\"";
Debug.ShouldStop(-2147483648);
_permisoapp = BA.ObjectToString("NO");Debug.locals.put("PermisoAPP", _permisoapp);
 if (true) break;

case 5:
//C
this.state = 12;
 BA.debugLineNum = 678;BA.debugLine="PermisoAPP=\"OK\"";
Debug.ShouldStop(32);
_permisoapp = BA.ObjectToString("OK");Debug.locals.put("PermisoAPP", _permisoapp);
 if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 680;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error\")";
Debug.ShouldStop(128);
_msa = parent._xui.runMethod(false,"MsgboxAsync",main.ba,(Object)(_sres),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 681;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cargapermisosusuario"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 12;
;
 BA.debugLineNum = 682;BA.debugLine="PermisoAPP=\"NO\"";
Debug.ShouldStop(512);
_permisoapp = BA.ObjectToString("NO");Debug.locals.put("PermisoAPP", _permisoapp);
 if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 684;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes pe";
Debug.ShouldStop(2048);
_msa = parent._xui.runMethod(false,"MsgboxAsync",main.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a  esta aplicación.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 685;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cargapermisosusuario"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 12;
;
 BA.debugLineNum = 686;BA.debugLine="PermisoAPP=\"NO\"";
Debug.ShouldStop(8192);
_permisoapp = BA.ObjectToString("NO");Debug.locals.put("PermisoAPP", _permisoapp);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 689;BA.debugLine="PermisoAPP=sRes";
Debug.ShouldStop(65536);
_permisoapp = _sres;Debug.locals.put("PermisoAPP", _permisoapp);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 691;BA.debugLine="Return PermisoAPP";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_permisoapp));return;};
 BA.debugLineNum = 692;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject _sres) throws Exception{
}
public static void  _msgbox_result() throws Exception{
}
public static void  _cargardatosconfiguracionaplicacion() throws Exception{
try {
		Debug.PushSubsStack("CargarDatosConfiguracionAplicacion (main) ","main",0,main.ba,main.mostCurrent,526);
if (RapidSub.canDelegate("cargardatosconfiguracionaplicacion")) { b4j.docU.main.remoteMe.runUserSub(false, "main","cargardatosconfiguracionaplicacion"); return;}
ResumableSub_CargarDatosConfiguracionAplicacion rsub = new ResumableSub_CargarDatosConfiguracionAplicacion(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargarDatosConfiguracionAplicacion extends BA.ResumableSub {
public ResumableSub_CargarDatosConfiguracionAplicacion(b4j.docU.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.main parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargarDatosConfiguracionAplicacion (main) ","main",0,main.ba,main.mostCurrent,526);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 527;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16384);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 528;BA.debugLine="JRDCQuery.DatosJRDC(rdclinkMySqlDatosComunes,\"Dat";
Debug.ShouldStop(32768);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._rdclinkmysqldatoscomunes),(Object)(BA.ObjectToString("DatosConfigAlmacen")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("PROTEC"))})),(Object)(main.getObject()));
 BA.debugLineNum = 529;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cargardatosconfiguracionaplicacion"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 530;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 534;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 536;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 540;BA.debugLine="Accion=\"ErrNoConf\"";
Debug.ShouldStop(134217728);
_accion = BA.ObjectToString("ErrNoConf");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 542;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
Debug.ShouldStop(536870912);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 543;BA.debugLine="Dim m As Map=lstReg.Get(0)";
Debug.ShouldStop(1073741824);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 544;BA.debugLine="DatosConfiguracionAplicacion.DireccionEnvioEmai";
Debug.ShouldStop(-2147483648);
parent._datosconfiguracionaplicacion.setField ("DireccionEnvioEmail" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EmailSenderError"))))));
 BA.debugLineNum = 547;BA.debugLine="DatosConfiguracionAplicacion.PasswordEnvioEmail";
Debug.ShouldStop(4);
parent._datosconfiguracionaplicacion.setField ("PasswordEnvioEmail" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EmailPsswSenderError"))))));
 BA.debugLineNum = 549;BA.debugLine="DatosConfiguracionAplicacion.PuertoEnvioEmail=m";
Debug.ShouldStop(16);
parent._datosconfiguracionaplicacion.setField ("PuertoEnvioEmail" /*RemoteObject*/ ,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PortServerError"))))));
 BA.debugLineNum = 550;BA.debugLine="DatosConfiguracionAplicacion.ServidorEnvioEmail";
Debug.ShouldStop(32);
parent._datosconfiguracionaplicacion.setField ("ServidorEnvioEmail" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SMTPServerError"))))));
 BA.debugLineNum = 551;BA.debugLine="DatosConfiguracionAplicacion.EmailDesarrollador";
Debug.ShouldStop(64);
parent._datosconfiguracionaplicacion.setField ("EmailDesarrollador1" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EmailDeveloper1"))))));
 BA.debugLineNum = 552;BA.debugLine="DatosConfiguracionAplicacion.EmailDesarrollador";
Debug.ShouldStop(128);
parent._datosconfiguracionaplicacion.setField ("EmailDesarrollador2" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EmailDeveloper2"))))));
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
 BA.debugLineNum = 558;BA.debugLine="CallSubDelayed2(Me,\"CargarDatosConfiguracionAplic";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("CallSubDelayed2",main.ba,(Object)(main.getObject()),(Object)(BA.ObjectToString("CargarDatosConfiguracionAplicacion_Complete")),(Object)((_accion)));
 BA.debugLineNum = 559;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject _mresult) throws Exception{
}
public static void  _enviaremailerrorapp() throws Exception{
try {
		Debug.PushSubsStack("EnviarEmailErrorApp (main) ","main",0,main.ba,main.mostCurrent,626);
if (RapidSub.canDelegate("enviaremailerrorapp")) { b4j.docU.main.remoteMe.runUserSub(false, "main","enviaremailerrorapp"); return;}
ResumableSub_EnviarEmailErrorApp rsub = new ResumableSub_EnviarEmailErrorApp(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EnviarEmailErrorApp extends BA.ResumableSub {
public ResumableSub_EnviarEmailErrorApp(b4j.docU.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.main parent;
RemoteObject _smtp = RemoteObject.declareNull("anywheresoftware.b4a.net.SMTPWrapper");
RemoteObject _sendemail = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnviarEmailErrorApp (main) ","main",0,main.ba,main.mostCurrent,626);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 627;BA.debugLine="Dim SMTP As SMTP";
Debug.ShouldStop(262144);
_smtp = RemoteObject.createNew ("anywheresoftware.b4a.net.SMTPWrapper");Debug.locals.put("SMTP", _smtp);
 BA.debugLineNum = 628;BA.debugLine="SMTP.Initialize(DatosConfiguracionAplicacion.Serv";
Debug.ShouldStop(524288);
_smtp.runVoidMethod ("Initialize",(Object)(parent._datosconfiguracionaplicacion.getField(true,"ServidorEnvioEmail" /*RemoteObject*/ )),(Object)(parent._datosconfiguracionaplicacion.getField(true,"PuertoEnvioEmail" /*RemoteObject*/ )),(Object)(parent._datosconfiguracionaplicacion.getField(true,"DireccionEnvioEmail" /*RemoteObject*/ )),(Object)(parent._datosconfiguracionaplicacion.getField(true,"PasswordEnvioEmail" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("SMTP")));
 BA.debugLineNum = 630;BA.debugLine="SMTP.StartTLSMode = True";
Debug.ShouldStop(2097152);
_smtp.runMethod(true,"setStartTLSMode",parent.__c.getField(true,"True"));
 BA.debugLineNum = 631;BA.debugLine="SMTP.UseSSL = True 'Gmail requires SSL.";
Debug.ShouldStop(4194304);
_smtp.runMethod(true,"setUseSSL",parent.__c.getField(true,"True"));
 BA.debugLineNum = 632;BA.debugLine="SMTP.AuthMethod = SMTP.AUTH_LOGIN";
Debug.ShouldStop(8388608);
_smtp.runMethod(false,"setAuthMethod",_smtp.getField(false,"AUTH_LOGIN"));
 BA.debugLineNum = 633;BA.debugLine="If DatosConfiguracionAplicacion.EmailDesarrollado";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",parent._datosconfiguracionaplicacion.getField(true,"EmailDesarrollador1" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("!",parent._datosconfiguracionaplicacion.getField(true,"EmailDesarrollador2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 634;BA.debugLine="If DatosConfiguracionAplicacion.EmailDesarrollad";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",parent._datosconfiguracionaplicacion.getField(true,"EmailDesarrollador1" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 635;BA.debugLine="SMTP.To.Add(DatosConfiguracionAplicacion.EmailD";
Debug.ShouldStop(67108864);
_smtp.runMethod(false,"getTo").runVoidMethod ("Add",(Object)((parent._datosconfiguracionaplicacion.getField(true,"EmailDesarrollador1" /*RemoteObject*/ ))));
 if (true) break;
;
 BA.debugLineNum = 638;BA.debugLine="If DatosConfiguracionAplicacion.EmailDesarrollad";
Debug.ShouldStop(536870912);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",parent._datosconfiguracionaplicacion.getField(true,"EmailDesarrollador2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 639;BA.debugLine="SMTP.To.Add(DatosConfiguracionAplicacion.EmailD";
Debug.ShouldStop(1073741824);
_smtp.runMethod(false,"getTo").runVoidMethod ("Add",(Object)((parent._datosconfiguracionaplicacion.getField(true,"EmailDesarrollador2" /*RemoteObject*/ ))));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 642;BA.debugLine="SMTP.Subject = \"App crash \" & NombreAplicacion";
Debug.ShouldStop(2);
_smtp.runMethod(true,"setSubject",RemoteObject.concat(RemoteObject.createImmutable("App crash "),parent._nombreaplicacion));
 BA.debugLineNum = 645;BA.debugLine="SMTP.Body = \"Error en versión \" & Version & CRLF";
Debug.ShouldStop(16);
_smtp.runMethod(true,"setBody",RemoteObject.concat(RemoteObject.createImmutable("Error en versión "),parent._version,parent.__c.getField(true,"CRLF"),parent._datosusuario.getField(true,"Dispositivo" /*RemoteObject*/ ),RemoteObject.createImmutable("   "),parent._datosusuario.getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )));
 BA.debugLineNum = 647;BA.debugLine="SMTP.AddAttachment(xui.DefaultFolder,\"logCrash.t";
Debug.ShouldStop(64);
_smtp.runVoidMethod ("AddAttachment",(Object)(parent._xui.runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("logCrash.txt")));
 BA.debugLineNum = 649;BA.debugLine="Dim SendEmail As Object =SMTP.Send";
Debug.ShouldStop(256);
_sendemail = _smtp.runMethod(false,"Send",main.ba);Debug.locals.put("SendEmail", _sendemail);Debug.locals.put("SendEmail", _sendemail);
 BA.debugLineNum = 650;BA.debugLine="Wait For (SendEmail) SMTP_MessageSent(Success As";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","smtp_messagesent", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "enviaremailerrorapp"), _sendemail);
this.state = 18;
return;
case 18:
//C
this.state = 11;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 651;BA.debugLine="If Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 11:
//if
this.state = 16;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 652;BA.debugLine="File.Delete(xui.DefaultFolder,\"logCrash.txt\")";
Debug.ShouldStop(2048);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._xui.runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("logCrash.txt")));
 BA.debugLineNum = 653;BA.debugLine="ExitApplication";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 655;BA.debugLine="Log(\"Error enviando fichero appCrash por email\"";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","8589853",RemoteObject.createImmutable("Error enviando fichero appCrash por email"),0);
 BA.debugLineNum = 656;BA.debugLine="ExitApplication";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 660;BA.debugLine="End Sub";
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
public static void  _smtp_messagesent(RemoteObject _success) throws Exception{
}
public static RemoteObject  _getsystemproperties() throws Exception{
try {
		Debug.PushSubsStack("GetSystemProperties (main) ","main",0,main.ba,main.mostCurrent,433);
if (RapidSub.canDelegate("getsystemproperties")) { return b4j.docU.main.remoteMe.runUserSub(false, "main","getsystemproperties");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 433;BA.debugLine="Sub GetSystemProperties As Map";
Debug.ShouldStop(65536);
 BA.debugLineNum = 434;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(131072);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 435;BA.debugLine="jo = jo.InitializeStatic(\"java.lang.management.Ma";
Debug.ShouldStop(262144);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("java.lang.management.ManagementFactory"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRuntimeMXBean")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("jo", _jo);
 BA.debugLineNum = 436;BA.debugLine="Dim m As JavaObject";
Debug.ShouldStop(524288);
_m = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("m", _m);
 BA.debugLineNum = 437;BA.debugLine="m.InitializeNewInstance(\"anywheresoftware.b4a.obj";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("anywheresoftware.b4a.objects.collections.Map$MyMap")),(Object)((main.__c.getField(false,"Null"))));
 BA.debugLineNum = 438;BA.debugLine="m.RunMethod(\"putAll\", Array(jo.RunMethod(\"getSyst";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("putAll")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSystemProperties")),(Object)((main.__c.getField(false,"Null"))))})));
 BA.debugLineNum = 439;BA.debugLine="Return m";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _m.getObject());
 BA.debugLineNum = 440;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _inicio() throws Exception{
try {
		Debug.PushSubsStack("Inicio (main) ","main",0,main.ba,main.mostCurrent,315);
if (RapidSub.canDelegate("inicio")) { b4j.docU.main.remoteMe.runUserSub(false, "main","inicio"); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.main parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
int step15;
int limit15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Inicio (main) ","main",0,main.ba,main.mostCurrent,315);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 319;BA.debugLine="IconoFormularios=fx.LoadImage(File.DirAssets,\"doc";
Debug.ShouldStop(1073741824);
parent._iconoformularios = parent._fx.runMethod(false,"LoadImage",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("docU32.png")));
 BA.debugLineNum = 321;BA.debugLine="SufijoTitleForms=\"   \" & NombreAplicacion & \"  v\"";
Debug.ShouldStop(1);
parent._sufijotitleforms = RemoteObject.concat(RemoteObject.createImmutable("   "),parent._nombreaplicacion,RemoteObject.createImmutable("  v"),parent._version,RemoteObject.createImmutable("    Usuario: "),parent._datosusuario.getField(true,"NombreUsuarioWindows" /*RemoteObject*/ ));
 BA.debugLineNum = 323;BA.debugLine="NombreFicheroIconoAplicacion=\"docU32.png\"";
Debug.ShouldStop(4);
parent._nombreficheroiconoaplicacion = BA.ObjectToString("docU32.png");
 BA.debugLineNum = 325;BA.debugLine="PrefijoTitleForms=NombreAplicacionForms & \"  v\" &";
Debug.ShouldStop(16);
parent._prefijotitleforms = RemoteObject.concat(parent._nombreaplicacionforms,RemoteObject.createImmutable("  v"),parent._version,RemoteObject.createImmutable("    Usuario: "),parent._datosusuario.getField(true,"NombreUsuarioWindows" /*RemoteObject*/ ),parent.__c.getField(true,"TAB"),RemoteObject.createImmutable(" "));
 BA.debugLineNum = 331;BA.debugLine="Log(\"DatosUsuario \" & DatosUsuario)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","8131088",RemoteObject.concat(RemoteObject.createImmutable("DatosUsuario "),parent._datosusuario),0);
 BA.debugLineNum = 339;BA.debugLine="PrefijoTitleForms=NombreAplicacionForms & \"  v\" &";
Debug.ShouldStop(262144);
parent._prefijotitleforms = RemoteObject.concat(parent._nombreaplicacionforms,RemoteObject.createImmutable("  v"),parent._version,RemoteObject.createImmutable("    Usuario: "),parent._datosusuario.getField(true,"NombreUsuarioWindows" /*RemoteObject*/ ),RemoteObject.createImmutable("\\"),parent._datosusuario.getField(true,"DominioUsuarioWindows" /*RemoteObject*/ ),parent.__c.getField(true,"TAB"),RemoteObject.createImmutable(" "));
 BA.debugLineNum = 342;BA.debugLine="UserFolder=GetSystemProperty(\"user.home\",\"\") & \"\\";
Debug.ShouldStop(2097152);
parent._userfolder = RemoteObject.concat(parent.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("user.home")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("\\AppData\\Roaming\\"),parent._nombreaplicacion);
 BA.debugLineNum = 343;BA.debugLine="UserTempFolder=UserFolder & \"\\Temp\"";
Debug.ShouldStop(4194304);
parent._usertempfolder = RemoteObject.concat(parent._userfolder,RemoteObject.createImmutable("\\Temp"));
 BA.debugLineNum = 344;BA.debugLine="Log(\"UserFolder \" & UserFolder)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","8131101",RemoteObject.concat(RemoteObject.createImmutable("UserFolder "),parent._userfolder),0);
 BA.debugLineNum = 349;BA.debugLine="If File.Exists(UserTempFolder,\"\")=False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._usertempfolder),(Object)(RemoteObject.createImmutable(""))),parent.__c.getField(true,"False"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 14;
 BA.debugLineNum = 350;BA.debugLine="File.MakeDir(UserTempFolder,\"\")";
Debug.ShouldStop(536870912);
parent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(parent._usertempfolder),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 352;BA.debugLine="Wait For (File.ListFilesAsync(UserTempFolder)) C";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "inicio"), parent.__c.getField(false,"File").runMethod(false,"ListFilesAsync",main.ba,(Object)(parent._usertempfolder)));
this.state = 45;
return;
case 45:
//C
this.state = 6;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 353;BA.debugLine="If Success Then";
Debug.ShouldStop(1);
if (true) break;

case 6:
//if
this.state = 13;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 354;BA.debugLine="For i=0 To Files.Size-1";
Debug.ShouldStop(2);
if (true) break;

case 9:
//for
this.state = 12;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_files.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 46;
if (true) break;

case 46:
//C
this.state = 12;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 11;
if (true) break;

case 47:
//C
this.state = 46;
_i = ((int)(0 + _i + step15)) ;
Debug.locals.put("i", _i);
if (true) break;

case 11:
//C
this.state = 47;
 BA.debugLineNum = 355;BA.debugLine="File.Delete(UserTempFolder,Files.Get(i))";
Debug.ShouldStop(4);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._usertempfolder),(Object)(BA.ObjectToString(_files.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
Debug.locals.put("i", _i);
;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;
;
 BA.debugLineNum = 361;BA.debugLine="If File.Exists(xui.DefaultFolder,\"SQLGestionVenta";
Debug.ShouldStop(256);

case 14:
//if
this.state = 19;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._xui.runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("SQLGestionVentas.db"))).<Boolean>get().booleanValue()) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._xui.runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("SQLGestionVentas.db")));
if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 364;BA.debugLine="wait for(CargaPermisosUsuario) complete (sResp As";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "inicio"), _cargapermisosusuario());
this.state = 48;
return;
case 48:
//C
this.state = 20;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 365;BA.debugLine="If sResp=\"NO\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("NO"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 366;BA.debugLine="ExitApplication";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 367;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 370;BA.debugLine="If sResp=\"ADMIN\" Then DatosUsuario.Administrador=";
Debug.ShouldStop(131072);

case 23:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("ADMIN"))) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
parent._datosusuario.setField ("Administrador" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 372;BA.debugLine="If CargaDatosGrabadosConfiguracionUsuario=False T";
Debug.ShouldStop(524288);
if (true) break;

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_cargadatosgrabadosconfiguracionusuario(),parent.__c.getField(true,"False"))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 373;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error al carg";
Debug.ShouldStop(1048576);
_msa = parent._xui.runMethod(false,"MsgboxAsync",main.ba,(Object)(BA.ObjectToString("Error al cargar la configuración de usuario. No es posible iniciar la aplicación.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 374;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "inicio"), _msa);
this.state = 49;
return;
case 49:
//C
this.state = 32;
;
 BA.debugLineNum = 375;BA.debugLine="frm.Close";
Debug.ShouldStop(4194304);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 380;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",main.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 381;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 382;BA.debugLine="cvs.Initialize(p)";
Debug.ShouldStop(536870912);
parent._cvs.runVoidMethod ("Initialize",main.ba,(Object)(_p));
 BA.debugLineNum = 395;BA.debugLine="CargarDatosConfiguracionAplicacion";
Debug.ShouldStop(1024);
_cargardatosconfiguracionaplicacion();
 BA.debugLineNum = 396;BA.debugLine="Wait For CargarDatosConfiguracionAplicacion_Compl";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","cargardatosconfiguracionaplicacion_complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "inicio"), null);
this.state = 50;
return;
case 50:
//C
this.state = 33;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Accion", _accion);
;
 BA.debugLineNum = 398;BA.debugLine="If Accion=\"ErrConn\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 33:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("ErrConn"))) { 
this.state = 35;
}else {
this.state = 37;
}if (true) break;

case 35:
//C
this.state = 44;
 BA.debugLineNum = 399;BA.debugLine="frm.Initialize(\"frm\",xScreen, yScreen)";
Debug.ShouldStop(16384);
parent._frm.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._xscreen)),(Object)(BA.numberCast(double.class, parent._yscreen)));
 BA.debugLineNum = 400;BA.debugLine="frm.Icon = IconoFormularios";
Debug.ShouldStop(32768);
parent._frm.runMethod(false,"setIcon",(parent._iconoformularios.getObject()));
 BA.debugLineNum = 401;BA.debugLine="frm.RootPane.LoadLayout(\"scrMain\") 'Load the lay";
Debug.ShouldStop(65536);
parent._frm.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("scrMain")));
 BA.debugLineNum = 402;BA.debugLine="frm.Show";
Debug.ShouldStop(131072);
parent._frm.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 403;BA.debugLine="frm.Title=\"TOJ\"";
Debug.ShouldStop(262144);
parent._frm.runMethod(true,"setTitle",BA.ObjectToString("TOJ"));
 BA.debugLineNum = 404;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(524288);
_msa = parent._xui.runMethod(false,"MsgboxAsync",main.ba,(Object)(BA.ObjectToString("Error de conexion servidor (DatosConfigAlmacen). No es posible iniciar la aplicación.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 405;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "inicio"), _msa);
this.state = 51;
return;
case 51:
//C
this.state = 44;
;
 BA.debugLineNum = 406;BA.debugLine="frm.Close";
Debug.ShouldStop(2097152);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 408;BA.debugLine="If Accion=\"ErrNoConf\" Then";
Debug.ShouldStop(8388608);
if (true) break;

case 38:
//if
this.state = 43;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("ErrNoConf"))) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
 BA.debugLineNum = 409;BA.debugLine="frm.Initialize(\"frm\",xScreen, yScreen)";
Debug.ShouldStop(16777216);
parent._frm.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._xscreen)),(Object)(BA.numberCast(double.class, parent._yscreen)));
 BA.debugLineNum = 410;BA.debugLine="frm.Icon = IconoFormularios";
Debug.ShouldStop(33554432);
parent._frm.runMethod(false,"setIcon",(parent._iconoformularios.getObject()));
 BA.debugLineNum = 411;BA.debugLine="frm.RootPane.LoadLayout(\"scrMain\") 'Load the la";
Debug.ShouldStop(67108864);
parent._frm.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("scrMain")));
 BA.debugLineNum = 412;BA.debugLine="frm.Show";
Debug.ShouldStop(134217728);
parent._frm.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 413;BA.debugLine="frm.Title=\"TOJ\"";
Debug.ShouldStop(268435456);
parent._frm.runMethod(true,"setTitle",BA.ObjectToString("TOJ"));
 BA.debugLineNum = 414;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Falta config";
Debug.ShouldStop(536870912);
_msa = parent._xui.runMethod(false,"MsgboxAsync",main.ba,(Object)(BA.ObjectToString("Falta configuración de la aplicación, avisar al administrador de la aplicación")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 415;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "inicio"), _msa);
this.state = 52;
return;
case 52:
//C
this.state = 43;
;
 BA.debugLineNum = 416;BA.debugLine="frm.Close";
Debug.ShouldStop(-2147483648);
parent._frm.runVoidMethod ("Close");
 if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 426;BA.debugLine="Wait For(ShowSplashScreen2) complete (rObj As O";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "inicio"), _showsplashscreen2());
this.state = 53;
return;
case 53:
//C
this.state = 43;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 427;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(1024);
parent._mainmenu2.runVoidMethod ("_show" /*void*/ );
 if (true) break;

case 43:
//C
this.state = 44;
;
 if (true) break;

case 44:
//C
this.state = -1;
;
 BA.debugLineNum = 431;BA.debugLine="End Sub";
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
public static void  _cargardatosconfiguracionaplicacion_complete(RemoteObject _accion) throws Exception{
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
mainmenu2_subs_0._process_globals();
utilidades_subs_0._process_globals();
cmauxcorreosexpress_subs_0._process_globals();
cmauxtxt_subs_0._process_globals();
jrdcquery_subs_0._process_globals();
dbutils_subs_0._process_globals();
transfermode_subs_0._process_globals();
jamrecordformbuilder_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
jamlinknavision_subs_0._process_globals();
cmpermisos_subs_0._process_globals();
jamtableviewcamposbuilder_subs_0._process_globals();
httputils2service_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.docU.main");
mainmenu2.myClass = BA.getDeviceClass ("b4j.docU.mainmenu2");
utilidades.myClass = BA.getDeviceClass ("b4j.docU.utilidades");
cseguimientofechasprometidascompra.myClass = BA.getDeviceClass ("b4j.docU.cseguimientofechasprometidascompra");
cevaluacionproveedores.myClass = BA.getDeviceClass ("b4j.docU.cevaluacionproveedores");
cgestionventas.myClass = BA.getDeviceClass ("b4j.docU.cgestionventas");
cfichaanalisistarifasventa.myClass = BA.getDeviceClass ("b4j.docU.cfichaanalisistarifasventa");
cincidenciasproveedorlista.myClass = BA.getDeviceClass ("b4j.docU.cincidenciasproveedorlista");
cfasesdocumento.myClass = BA.getDeviceClass ("b4j.docU.cfasesdocumento");
cincidenciasproveedortareasabiertas.myClass = BA.getDeviceClass ("b4j.docU.cincidenciasproveedortareasabiertas");
crepsol.myClass = BA.getDeviceClass ("b4j.docU.crepsol");
cgeneracionficheroscsvplantillapedidosventa.myClass = BA.getDeviceClass ("b4j.docU.cgeneracionficheroscsvplantillapedidosventa");
b4xswitch_adjsize.myClass = BA.getDeviceClass ("b4j.docU.b4xswitch_adjsize");
bblistitem.myClass = BA.getDeviceClass ("b4j.docU.bblistitem");
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.myClass = BA.getDeviceClass ("b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla");
canalisisdisponiblesalmacenarticulotalla.myClass = BA.getDeviceClass ("b4j.docU.canalisisdisponiblesalmacenarticulotalla");
canalisisdisponiblesarticulotallaalmacenescomputables.myClass = BA.getDeviceClass ("b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables");
canalisistarifasavisostarifacompra.myClass = BA.getDeviceClass ("b4j.docU.canalisistarifasavisostarifacompra");
canalisistarifasavisostarifaventa.myClass = BA.getDeviceClass ("b4j.docU.canalisistarifasavisostarifaventa");
canalisistarifasinfocompras.myClass = BA.getDeviceClass ("b4j.docU.canalisistarifasinfocompras");
canalisistarifasinfoventas.myClass = BA.getDeviceClass ("b4j.docU.canalisistarifasinfoventas");
canalisistarifastarifasventausuario.myClass = BA.getDeviceClass ("b4j.docU.canalisistarifastarifasventausuario");
cb2bfichapedidocliente.myClass = BA.getDeviceClass ("b4j.docU.cb2bfichapedidocliente");
cb2blistapedidoscliente.myClass = BA.getDeviceClass ("b4j.docU.cb2blistapedidoscliente");
cclientftp.myClass = BA.getDeviceClass ("b4j.docU.cclientftp");
ccontroldocumentosnogestionados.myClass = BA.getDeviceClass ("b4j.docU.ccontroldocumentosnogestionados");
ccontroldocumentosperiodo.myClass = BA.getDeviceClass ("b4j.docU.ccontroldocumentosperiodo");
ccontrolosubspendientesnoconfeccion.myClass = BA.getDeviceClass ("b4j.docU.ccontrolosubspendientesnoconfeccion");
cdocumentosnavexpedicion.myClass = BA.getDeviceClass ("b4j.docU.cdocumentosnavexpedicion");
cevaluacionproveedoresproveedoresfijos.myClass = BA.getDeviceClass ("b4j.docU.cevaluacionproveedoresproveedoresfijos");
cexpedicionesnoentregadasdhl.myClass = BA.getDeviceClass ("b4j.docU.cexpedicionesnoentregadasdhl");
cexpedicionesperiodotxt.myClass = BA.getDeviceClass ("b4j.docU.cexpedicionesperiodotxt");
cexpedicionessinentregartxt.myClass = BA.getDeviceClass ("b4j.docU.cexpedicionessinentregartxt");
cgestioncompras.myClass = BA.getDeviceClass ("b4j.docU.cgestioncompras");
cincidenciaproveedorficha.myClass = BA.getDeviceClass ("b4j.docU.cincidenciaproveedorficha");
cinfoenviosperiodocorreosexpress2.myClass = BA.getDeviceClass ("b4j.docU.cinfoenviosperiodocorreosexpress2");
cinfoexpedicioncorreosexpress.myClass = BA.getDeviceClass ("b4j.docU.cinfoexpedicioncorreosexpress");
cinfoexpediciondhl.myClass = BA.getDeviceClass ("b4j.docU.cinfoexpediciondhl");
cinfoexpediciontxt.myClass = BA.getDeviceClass ("b4j.docU.cinfoexpediciontxt");
cinformesexpedicionesclientes.myClass = BA.getDeviceClass ("b4j.docU.cinformesexpedicionesclientes");
clistaanalisistarifasventa.myClass = BA.getDeviceClass ("b4j.docU.clistaanalisistarifasventa");
cmarcaralbaranfisico.myClass = BA.getDeviceClass ("b4j.docU.cmarcaralbaranfisico");
cmauxcorreosexpress.myClass = BA.getDeviceClass ("b4j.docU.cmauxcorreosexpress");
cmauxtxt.myClass = BA.getDeviceClass ("b4j.docU.cmauxtxt");
cnuevafasedocumento.myClass = BA.getDeviceClass ("b4j.docU.cnuevafasedocumento");
crepsolinformacionlogisticaalbaran.myClass = BA.getDeviceClass ("b4j.docU.crepsolinformacionlogisticaalbaran");
cseleccionarticulonav.myClass = BA.getDeviceClass ("b4j.docU.cseleccionarticulonav");
cseleccionproveedornav.myClass = BA.getDeviceClass ("b4j.docU.cseleccionproveedornav");
csvparser.myClass = BA.getDeviceClass ("b4j.docU.csvparser");
ct1.myClass = BA.getDeviceClass ("b4j.docU.ct1");
ctestsinfomagento.myClass = BA.getDeviceClass ("b4j.docU.ctestsinfomagento");
dbrequestmanager.myClass = BA.getDeviceClass ("b4j.docU.dbrequestmanager");
jrdcquery.myClass = BA.getDeviceClass ("b4j.docU.jrdcquery");
regexbuilder.myClass = BA.getDeviceClass ("b4j.docU.regexbuilder");
textflow.myClass = BA.getDeviceClass ("b4j.docU.textflow");
wildcardlisting.myClass = BA.getDeviceClass ("b4j.docU.wildcardlisting");
b4xdrawer.myClass = BA.getDeviceClass ("b4j.docU.b4xdrawer");
b4xgifview.myClass = BA.getDeviceClass ("b4j.docU.b4xgifview");
preferencesdialog.myClass = BA.getDeviceClass ("b4j.docU.preferencesdialog");
dbutils.myClass = BA.getDeviceClass ("b4j.docU.dbutils");
draganddrop.myClass = BA.getDeviceClass ("b4j.docU.draganddrop");
dragboard.myClass = BA.getDeviceClass ("b4j.docU.dragboard");
dragevent.myClass = BA.getDeviceClass ("b4j.docU.dragevent");
transfermode.myClass = BA.getDeviceClass ("b4j.docU.transfermode");
jamcircularprogressbar.myClass = BA.getDeviceClass ("b4j.docU.jamcircularprogressbar");
jamclickablebadges.myClass = BA.getDeviceClass ("b4j.docU.jamclickablebadges");
jamformregistro.myClass = BA.getDeviceClass ("b4j.docU.jamformregistro");
jamrecordformbuilder.myClass = BA.getDeviceClass ("b4j.docU.jamrecordformbuilder");
jamrecordformclvdragger.myClass = BA.getDeviceClass ("b4j.docU.jamrecordformclvdragger");
bccolorpicker.myClass = BA.getDeviceClass ("b4j.docU.bccolorpicker");
b4xbitset.myClass = BA.getDeviceClass ("b4j.docU.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4j.docU.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("b4j.docU.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("b4j.docU.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("b4j.docU.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("b4j.docU.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4j.docU.b4xset");
recentfilesmanagerrecordformbuilder.myClass = BA.getDeviceClass ("b4j.docU.recentfilesmanagerrecordformbuilder");
jamlinknavision.myClass = BA.getDeviceClass ("b4j.docU.jamlinknavision");
jamloadingindicator.myClass = BA.getDeviceClass ("b4j.docU.jamloadingindicator");
jamb4xlongtexttemplate.myClass = BA.getDeviceClass ("b4j.docU.jamb4xlongtexttemplate");
jammsgdialog.myClass = BA.getDeviceClass ("b4j.docU.jammsgdialog");
jammsgdialogbbcodeview.myClass = BA.getDeviceClass ("b4j.docU.jammsgdialogbbcodeview");
bbcodeparser.myClass = BA.getDeviceClass ("b4j.docU.bbcodeparser");
bbcodeview.myClass = BA.getDeviceClass ("b4j.docU.bbcodeview");
bblabel.myClass = BA.getDeviceClass ("b4j.docU.bblabel");
bctextengine.myClass = BA.getDeviceClass ("b4j.docU.bctextengine");
jampegardatospreview.myClass = BA.getDeviceClass ("b4j.docU.jampegardatospreview");
cmpermisos.myClass = BA.getDeviceClass ("b4j.docU.cmpermisos");
cpermisosaplicacion.myClass = BA.getDeviceClass ("b4j.docU.cpermisosaplicacion");
clvselectionsjamtableclv.myClass = BA.getDeviceClass ("b4j.docU.clvselectionsjamtableclv");
jamtableclv.myClass = BA.getDeviceClass ("b4j.docU.jamtableclv");
jamtableclvcamposbuilder.myClass = BA.getDeviceClass ("b4j.docU.jamtableclvcamposbuilder");
jamtableclvclvdragger.myClass = BA.getDeviceClass ("b4j.docU.jamtableclvclvdragger");
clvselectionsjamtableview.myClass = BA.getDeviceClass ("b4j.docU.clvselectionsjamtableview");
jamtableview.myClass = BA.getDeviceClass ("b4j.docU.jamtableview");
jamtableviewcamposbuilder.myClass = BA.getDeviceClass ("b4j.docU.jamtableviewcamposbuilder");
jamtableviewclvdragger.myClass = BA.getDeviceClass ("b4j.docU.jamtableviewclvdragger");
httputils2service.myClass = BA.getDeviceClass ("b4j.docU.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4j.docU.httpjob");
preoptimizedclv.myClass = BA.getDeviceClass ("b4j.docU.preoptimizedclv");
sd_loadingindicator.myClass = BA.getDeviceClass ("b4j.docU.sd_loadingindicator");
worddocument.myClass = BA.getDeviceClass ("b4j.docU.worddocument");
wordparagraph.myClass = BA.getDeviceClass ("b4j.docU.wordparagraph");
wordutils.myClass = BA.getDeviceClass ("b4j.docU.wordutils");
xlconditionalformattingrule.myClass = BA.getDeviceClass ("b4j.docU.xlconditionalformattingrule");
xlreader.myClass = BA.getDeviceClass ("b4j.docU.xlreader");
xlreaderresult.myClass = BA.getDeviceClass ("b4j.docU.xlreaderresult");
xlsheetwriter.myClass = BA.getDeviceClass ("b4j.docU.xlsheetwriter");
xlstyle.myClass = BA.getDeviceClass ("b4j.docU.xlstyle");
xltable.myClass = BA.getDeviceClass ("b4j.docU.xltable");
xlutils.myClass = BA.getDeviceClass ("b4j.docU.xlutils");
xlworkbookwriter.myClass = BA.getDeviceClass ("b4j.docU.xlworkbookwriter");
map2xml.myClass = BA.getDeviceClass ("b4j.docU.map2xml");
xml2map.myClass = BA.getDeviceClass ("b4j.docU.xml2map");
animatedcounter.myClass = BA.getDeviceClass ("b4j.docU.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4j.docU.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4j.docU.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4j.docU.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4j.docU.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4j.docU.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4j.docU.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4j.docU.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4j.docU.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4j.docU.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4j.docU.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4j.docU.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4j.docU.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4j.docU.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4j.docU.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4j.docU.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4j.docU.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4j.docU.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4j.docU.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4j.docU.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4j.docU.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("b4j.docU.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4j.docU.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4j.docU.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4j.docU.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4j.docU.xuiviewsutils");
b4jtextflow.myClass = BA.getDeviceClass ("b4j.docU.b4jtextflow");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 67;BA.debugLine="Public Const Version As String=\"1.67\"";
main._version = BA.ObjectToString("1.67");
 //BA.debugLineNum = 69;BA.debugLine="Public Const NombreAplicacion As String=\"docU\"";
main._nombreaplicacion = BA.ObjectToString("docU");
 //BA.debugLineNum = 70;BA.debugLine="Public Const NombreAplicacionForms As String=\"doc";
main._nombreaplicacionforms = BA.ObjectToString("docU");
 //BA.debugLineNum = 72;BA.debugLine="Type DatosConfiguracionAplicacion (DominioRed As";
;
 //BA.debugLineNum = 74;BA.debugLine="Public DatosConfiguracionAplicacion As DatosConfi";
main._datosconfiguracionaplicacion = RemoteObject.createNew ("b4j.docU.main._datosconfiguracionaplicacion");
 //BA.debugLineNum = 78;BA.debugLine="Type DatosUsuario (Dispositivo As String, NombreU";
;
 //BA.debugLineNum = 80;BA.debugLine="Type ConfiguracionUsuario (IPImpresoraEtiquetasOS";
;
 //BA.debugLineNum = 82;BA.debugLine="Type DatosImpresora (Almacen As String, IPImpreso";
;
 //BA.debugLineNum = 84;BA.debugLine="Type Vendedor (Codigo As String, Nombre As String";
;
 //BA.debugLineNum = 85;BA.debugLine="Type ResponsableCuenta (Codigo As String, Nombre";
;
 //BA.debugLineNum = 86;BA.debugLine="Type ContactoCliente (ClienteProtec As Int, Codig";
;
 //BA.debugLineNum = 88;BA.debugLine="Type CellIndex (Row As Int, Column As Int, IDClav";
;
 //BA.debugLineNum = 90;BA.debugLine="Type ErrorProcesoInformeCliente(CodigoContacto As";
;
 //BA.debugLineNum = 92;BA.debugLine="Type TipoRespuestaJRDC (Accion As String, Error A";
;
 //BA.debugLineNum = 97;BA.debugLine="Public fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 98;BA.debugLine="Private frm As Form";
main._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 99;BA.debugLine="Public xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 103;BA.debugLine="Public cvs As B4XCanvas";
main._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");
 //BA.debugLineNum = 105;BA.debugLine="Public PrefijoTitleForms As String";
main._prefijotitleforms = RemoteObject.createImmutable("");
 //BA.debugLineNum = 106;BA.debugLine="Public IconoFormularios As Image";
main._iconoformularios = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Public SufijoTitleForms As String";
main._sufijotitleforms = RemoteObject.createImmutable("");
 //BA.debugLineNum = 108;BA.debugLine="Public NombreFicheroIconoAplicacion As String";
main._nombreficheroiconoaplicacion = RemoteObject.createImmutable("");
 //BA.debugLineNum = 113;BA.debugLine="Type DBResult (Tag As Object, Columns As Map, Row";
;
 //BA.debugLineNum = 114;BA.debugLine="Type DBCommand (Name As String, Parameters() As O";
;
 //BA.debugLineNum = 116;BA.debugLine="Public rdclinkMySqlAlmConexion As String";
main._rdclinkmysqlalmconexion = RemoteObject.createImmutable("");
 //BA.debugLineNum = 117;BA.debugLine="Public AlmacenConexion As String";
main._almacenconexion = RemoteObject.createImmutable("");
 //BA.debugLineNum = 118;BA.debugLine="Public Const rdclinkMySqlDatosComunes As String=\"";
main._rdclinkmysqldatoscomunes = BA.ObjectToString("http://192.168.10.20:17179/rdc");
 //BA.debugLineNum = 119;BA.debugLine="Public Const rdcLinkNav As String=\"http://192.168";
main._rdclinknav = BA.ObjectToString("http://192.168.10.6:17200/rdc");
 //BA.debugLineNum = 121;BA.debugLine="Public Const rdclinkMySqlAlmProin As String=\"http";
main._rdclinkmysqlalmproin = BA.ObjectToString("http://192.168.10.20:17178/rdc");
 //BA.debugLineNum = 122;BA.debugLine="Public Const rdclinkMySqlAlmProtec As String=\"htt";
main._rdclinkmysqlalmprotec = BA.ObjectToString("http://192.168.10.21:17178/rdc");
 //BA.debugLineNum = 125;BA.debugLine="Public ConfiguracionUsuario As ConfiguracionUsuar";
main._configuracionusuario = RemoteObject.createNew ("b4j.docU.main._configuracionusuario");
 //BA.debugLineNum = 126;BA.debugLine="Public mConfiguracionUsuario As Map";
main._mconfiguracionusuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 128;BA.debugLine="Public xScreen, yScreen As Int";
main._xscreen = RemoteObject.createImmutable(0);
main._yscreen = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 130;BA.debugLine="Public TreeItemMenuAbreForm As TreeItem";
main._treeitemmenuabreform = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
 //BA.debugLineNum = 132;BA.debugLine="Public const AlineacionCentroDerecha As String=\"-";
main._alineacioncentroderecha = BA.ObjectToString("-fx-alignment: CENTER-RIGHT");
 //BA.debugLineNum = 133;BA.debugLine="Public const AlineacionCentro As String=\"-fx-alig";
main._alineacioncentro = BA.ObjectToString("-fx-alignment: CENTER");
 //BA.debugLineNum = 134;BA.debugLine="Public const AlineacionCentroIzquierda As String=";
main._alineacioncentroizquierda = BA.ObjectToString("-fx-alignment: CENTER-LEFT");
 //BA.debugLineNum = 136;BA.debugLine="Public UserFolder As String";
main._userfolder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 137;BA.debugLine="Public UserTempFolder As String";
main._usertempfolder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 139;BA.debugLine="Public DatosUsuario As DatosUsuario";
main._datosusuario = RemoteObject.createNew ("b4j.docU.main._datosusuario");
 //BA.debugLineNum = 141;BA.debugLine="Public awesome As Font";
main._awesome = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
 //BA.debugLineNum = 145;BA.debugLine="Public lstSelItem As List";
main._lstselitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 149;BA.debugLine="Public Robot As JavaObject";
main._robot = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 151;BA.debugLine="Public AlmacenIPConexion As String";
main._almacenipconexion = RemoteObject.createImmutable("");
 //BA.debugLineNum = 153;BA.debugLine="Private ImageViewSplashScreen As B4XView";
main._imageviewsplashscreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 154;BA.debugLine="Private lblSplashScreenAppVersion As B4XView";
main._lblsplashscreenappversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 155;BA.debugLine="Private pnlFondoSplashScreen As B4XView";
main._pnlfondosplashscreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 157;BA.debugLine="Public sCamposFiltradosListaIncidenciasProveedor";
main._scamposfiltradoslistaincidenciasproveedor = RemoteObject.createImmutable("");
 //BA.debugLineNum = 158;BA.debugLine="Public lstValoresFiltrosListaIncidenciasProveedor";
main._lstvaloresfiltroslistaincidenciasproveedor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showsplashscreen() throws Exception{
try {
		Debug.PushSubsStack("ShowSplashScreen (main) ","main",0,main.ba,main.mostCurrent,442);
if (RapidSub.canDelegate("showsplashscreen")) { return b4j.docU.main.remoteMe.runUserSub(false, "main","showsplashscreen");}
ResumableSub_ShowSplashScreen rsub = new ResumableSub_ShowSplashScreen(null);
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
public static class ResumableSub_ShowSplashScreen extends BA.ResumableSub {
public ResumableSub_ShowSplashScreen(b4j.docU.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.main parent;
RemoteObject _sp = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowSplashScreen (main) ","main",0,main.ba,main.mostCurrent,442);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
 BA.debugLineNum = 443;BA.debugLine="Dim sp As Form";
Debug.ShouldStop(67108864);
_sp = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");Debug.locals.put("sp", _sp);
 BA.debugLineNum = 444;BA.debugLine="sp.Initialize(\"sp\", 500, 224)";
Debug.ShouldStop(134217728);
_sp.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("sp")),(Object)(BA.numberCast(double.class, 500)),(Object)(BA.numberCast(double.class, 224)));
 BA.debugLineNum = 445;BA.debugLine="sp.SetFormStyle(\"TRANSPARENT\")";
Debug.ShouldStop(268435456);
_sp.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("TRANSPARENT")));
 BA.debugLineNum = 446;BA.debugLine="sp.BackColor = fx.Colors.Transparent";
Debug.ShouldStop(536870912);
_sp.runMethod(false,"setBackColor",parent._fx.getField(false,"Colors").getField(false,"Transparent"));
 BA.debugLineNum = 454;BA.debugLine="CSSUtils.SetBackgroundImage(sp.RootPane, File.Dir";
Debug.ShouldStop(32);
parent._cssutils.runVoidMethod ("_setbackgroundimage",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _sp.runMethod(false,"getRootPane").getObject()),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("docUSplash2.png")));
 BA.debugLineNum = 457;BA.debugLine="sp.Show";
Debug.ShouldStop(256);
_sp.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 459;BA.debugLine="Utilidades.CenterFormOnScreen(sp)";
Debug.ShouldStop(1024);
parent._utilidades.runVoidMethod ("_centerformonscreen" /*RemoteObject*/ ,(Object)(_sp));
 BA.debugLineNum = 460;BA.debugLine="sp.RootPane.Alpha = 0";
Debug.ShouldStop(2048);
_sp.runMethod(false,"getRootPane").runMethod(true,"setAlpha",BA.numberCast(double.class, 0));
 BA.debugLineNum = 461;BA.debugLine="sp.RootPane.SetAlphaAnimated(500, 1)";
Debug.ShouldStop(4096);
_sp.runMethod(false,"getRootPane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(double.class, 1)));
 BA.debugLineNum = 462;BA.debugLine="Wait For (sp.RootPane) sp_AnimationCompleted";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","sp_animationcompleted", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "showsplashscreen"), (_sp.runMethod(false,"getRootPane").getObject()));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 463;BA.debugLine="Sleep(2000)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "showsplashscreen"),BA.numberCast(int.class, 2000));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
 BA.debugLineNum = 464;BA.debugLine="sp.RootPane.SetAlphaAnimated(1000, 0)";
Debug.ShouldStop(32768);
_sp.runMethod(false,"getRootPane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 465;BA.debugLine="Wait For (sp.RootPane) sp_AnimationCompleted";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","sp_animationcompleted", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "showsplashscreen"), (_sp.runMethod(false,"getRootPane").getObject()));
this.state = 3;
return;
case 3:
//C
this.state = -1;
;
 BA.debugLineNum = 466;BA.debugLine="sp.Close";
Debug.ShouldStop(131072);
_sp.runVoidMethod ("Close");
 BA.debugLineNum = 468;BA.debugLine="Return Null";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 469;BA.debugLine="End Sub";
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
public static void  _sp_animationcompleted() throws Exception{
}
public static RemoteObject  _showsplashscreen2() throws Exception{
try {
		Debug.PushSubsStack("ShowSplashScreen2 (main) ","main",0,main.ba,main.mostCurrent,472);
if (RapidSub.canDelegate("showsplashscreen2")) { return b4j.docU.main.remoteMe.runUserSub(false, "main","showsplashscreen2");}
ResumableSub_ShowSplashScreen2 rsub = new ResumableSub_ShowSplashScreen2(null);
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
public static class ResumableSub_ShowSplashScreen2 extends BA.ResumableSub {
public ResumableSub_ShowSplashScreen2(b4j.docU.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.main parent;
RemoteObject _b4xbitmapsplash = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _sp = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowSplashScreen2 (main) ","main",0,main.ba,main.mostCurrent,472);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
 BA.debugLineNum = 474;BA.debugLine="Dim B4XBitmapSplash As B4XBitmap=xui.LoadBitmap(F";
Debug.ShouldStop(33554432);
_b4xbitmapsplash = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b4xbitmapsplash = parent._xui.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("docUSplash2.png")));Debug.locals.put("B4XBitmapSplash", _b4xbitmapsplash);Debug.locals.put("B4XBitmapSplash", _b4xbitmapsplash);
 BA.debugLineNum = 477;BA.debugLine="Dim sp As Form";
Debug.ShouldStop(268435456);
_sp = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");Debug.locals.put("sp", _sp);
 BA.debugLineNum = 479;BA.debugLine="sp.Initialize(\"sp\", B4XBitmapSplash.Width+20dip,";
Debug.ShouldStop(1073741824);
_sp.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("sp")),(Object)(RemoteObject.solve(new RemoteObject[] {_b4xbitmapsplash.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_b4xbitmapsplash.runMethod(true,"getHeight"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0)));
 BA.debugLineNum = 480;BA.debugLine="sp.SetFormStyle(\"TRANSPARENT\")";
Debug.ShouldStop(-2147483648);
_sp.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("TRANSPARENT")));
 BA.debugLineNum = 481;BA.debugLine="sp.BackColor = fx.Colors.Transparent";
Debug.ShouldStop(1);
_sp.runMethod(false,"setBackColor",parent._fx.getField(false,"Colors").getField(false,"Transparent"));
 BA.debugLineNum = 484;BA.debugLine="sp.RootPane.LoadLayout(\"scrSplashScreen\")";
Debug.ShouldStop(8);
_sp.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("scrSplashScreen")));
 BA.debugLineNum = 487;BA.debugLine="ImageViewSplashScreen.SetBitmap(B4XBitmapSplash)";
Debug.ShouldStop(64);
parent._imageviewsplashscreen.runVoidMethod ("SetBitmap",(Object)((_b4xbitmapsplash.getObject())));
 BA.debugLineNum = 489;BA.debugLine="lblSplashScreenAppVersion.TextColor=xui.Color_Lig";
Debug.ShouldStop(256);
parent._lblsplashscreenappversion.runMethod(true,"setTextColor",parent._xui.getField(true,"Color_LightGray"));
 BA.debugLineNum = 490;BA.debugLine="lblSplashScreenAppVersion.Text=$\"${NombreAplicaci";
Debug.ShouldStop(512);
parent._lblsplashscreenappversion.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._nombreaplicacion))),RemoteObject.createImmutable(" v "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._version))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 491;BA.debugLine="CSSUtils.SetBorder(ImageViewSplashScreen,1dip,fx.";
Debug.ShouldStop(1024);
parent._cssutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), parent._imageviewsplashscreen.getObject()),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), parent._fx.getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))),(Object)(BA.numberCast(double.class, 10)));
 BA.debugLineNum = 494;BA.debugLine="sp.Show";
Debug.ShouldStop(8192);
_sp.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 496;BA.debugLine="Utilidades.CenterFormOnScreen(sp)";
Debug.ShouldStop(32768);
parent._utilidades.runVoidMethod ("_centerformonscreen" /*RemoteObject*/ ,(Object)(_sp));
 BA.debugLineNum = 497;BA.debugLine="sp.RootPane.Alpha = 0";
Debug.ShouldStop(65536);
_sp.runMethod(false,"getRootPane").runMethod(true,"setAlpha",BA.numberCast(double.class, 0));
 BA.debugLineNum = 498;BA.debugLine="sp.RootPane.SetAlphaAnimated(500, 1)";
Debug.ShouldStop(131072);
_sp.runMethod(false,"getRootPane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(double.class, 1)));
 BA.debugLineNum = 499;BA.debugLine="Wait For (sp.RootPane) sp_AnimationCompleted";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","sp_animationcompleted", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "showsplashscreen2"), (_sp.runMethod(false,"getRootPane").getObject()));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 500;BA.debugLine="Sleep(2000)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "showsplashscreen2"),BA.numberCast(int.class, 2000));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
 BA.debugLineNum = 501;BA.debugLine="sp.RootPane.SetAlphaAnimated(500, 0)";
Debug.ShouldStop(1048576);
_sp.runMethod(false,"getRootPane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 502;BA.debugLine="Wait For (sp.RootPane) sp_AnimationCompleted";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","sp_animationcompleted", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "showsplashscreen2"), (_sp.runMethod(false,"getRootPane").getObject()));
this.state = 3;
return;
case 3:
//C
this.state = -1;
;
 BA.debugLineNum = 503;BA.debugLine="sp.Close";
Debug.ShouldStop(4194304);
_sp.runVoidMethod ("Close");
 BA.debugLineNum = 505;BA.debugLine="Return Null";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 506;BA.debugLine="End Sub";
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
}