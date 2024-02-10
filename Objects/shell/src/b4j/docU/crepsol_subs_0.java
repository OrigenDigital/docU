package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class crepsol_subs_0 {


public static void  _btncheckftpinbox_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCheckFTPInbox_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,4540);
if (RapidSub.canDelegate("btncheckftpinbox_click")) { __ref.runUserSub(false, "crepsol","btncheckftpinbox_click", __ref); return;}
ResumableSub_btnCheckFTPInbox_Click rsub = new ResumableSub_btnCheckFTPInbox_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnCheckFTPInbox_Click extends BA.ResumableSub {
public ResumableSub_btnCheckFTPInbox_Click(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
RemoteObject _msa = RemoteObject.declareNull("Object");
int _i = 0;
int step17;
int limit17;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnCheckFTPInbox_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,4540);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 4562;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Buscando Fic";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Buscando Fichero Pedido en carpeta errores FTP...")));
 BA.debugLineNum = 4563;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 4565;BA.debugLine="sFtpRepsol.List(ErrorFilesFoldersFtpRepsol)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("List",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_errorfilesfoldersftprepsol" /*RemoteObject*/ )));
 BA.debugLineNum = 4566;BA.debugLine="Wait For sFtpRepsol_ListCompleted (ServerPath As";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","sftprepsol_listcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btncheckftpinbox_click"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(4));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 4567;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 4568;BA.debugLine="If Success = False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 4569;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","835258397",parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 4570;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error listand";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error listando carpeta de errores FTP."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 4571;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btncheckftpinbox_click"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 4;
;
 BA.debugLineNum = 4572;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 4575;BA.debugLine="If Files.Length=0 Then";
Debug.ShouldStop(1073741824);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_files.getField(true,"length"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 4577;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Carpeta error";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Carpeta errores FTP sin ficheros")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 4578;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btncheckftpinbox_click"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 7;
;
 BA.debugLineNum = 4579;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 4582;BA.debugLine="For i = 0 To Folders.Length - 1";
Debug.ShouldStop(32);

case 7:
//for
this.state = 10;
step17 = 1;
limit17 = RemoteObject.solve(new RemoteObject[] {_folders.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 14;
if (true) break;

case 14:
//C
this.state = 10;
if ((step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17)) this.state = 9;
if (true) break;

case 15:
//C
this.state = 14;
_i = ((int)(0 + _i + step17)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 15;
 BA.debugLineNum = 4583;BA.debugLine="Log(Folders(i).Name)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","835258411",_folders.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),0);
 BA.debugLineNum = 4584;BA.debugLine="Log(DateTime.Date(Folders(i).Timestamp))";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","835258412",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_folders.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"))),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4586;BA.debugLine="End Sub";
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
public static void  _sftprepsol_listcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success,RemoteObject _folders,RemoteObject _files) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static void  _btnprocesar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnProcesar_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2042);
if (RapidSub.canDelegate("btnprocesar_click")) { __ref.runUserSub(false, "crepsol","btnprocesar_click", __ref); return;}
ResumableSub_btnProcesar_Click rsub = new ResumableSub_btnProcesar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnProcesar_Click extends BA.ResumableSub {
public ResumableSub_btnProcesar_Click(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnProcesar_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2042);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2043;BA.debugLine="If File.Exists(DirFicheroProcesar,NombreFicheroPr";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_dirficheroprocesar" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_nombreficheroprocesar" /*RemoteObject*/ ))),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2044;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe el";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No existe el fichero "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_dirficheroprocesar" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_nombreficheroprocesar" /*RemoteObject*/ )))))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2045;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnprocesar_click"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 BA.debugLineNum = 2046;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2050;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Procesando";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",((RemoteObject.concat(RemoteObject.createImmutable("Procesando Fichero Pedido "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_txtficheroseleccionado" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable("...")))));
 BA.debugLineNum = 2051;BA.debugLine="wait for(ProcesarFichero3(DirFicheroProcesar,Nomb";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnprocesar_click"), __ref.runClassMethod (b4j.docU.crepsol.class, "_procesarfichero3" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_dirficheroprocesar" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_nombreficheroprocesar" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dirficheroprocesar" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_nombreficheroprocesar" /*RemoteObject*/ ))));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2052;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(8);
if (true) break;

case 5:
//if
this.state = 10;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 2053;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible completar el proceso")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2054;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnprocesar_click"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2056;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se ha complet";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Se ha completado el proceso con éxito.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2057;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnprocesar_click"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 2059;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static RemoteObject  _btnprocesocompleto_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnProcesoCompleto_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,5248);
if (RapidSub.canDelegate("btnprocesocompleto_click")) { return __ref.runUserSub(false, "crepsol","btnprocesocompleto_click", __ref);}
 BA.debugLineNum = 5248;BA.debugLine="Private Sub btnProcesoCompleto_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 5254;BA.debugLine="ProcesoCompleto";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.crepsol.class, "_procesocompleto" /*void*/ );
 BA.debugLineNum = 5258;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "crepsol","btnsalir_click", __ref);}
 BA.debugLineNum = 279;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="SalirModulo";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.crepsol.class, "_salirmodulo" /*RemoteObject*/ );
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
public static void  _btnselficheroftp_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFicheroFTP_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,1917);
if (RapidSub.canDelegate("btnselficheroftp_click")) { __ref.runUserSub(false, "crepsol","btnselficheroftp_click", __ref); return;}
ResumableSub_btnSelFicheroFTP_Click rsub = new ResumableSub_btnSelFicheroFTP_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelFicheroFTP_Click extends BA.ResumableSub {
public ResumableSub_btnSelFicheroFTP_Click(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _nombreficheropedido = RemoteObject.createImmutable("");
RemoteObject _rutaftpficheropedido = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelFicheroFTP_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,1917);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1918;BA.debugLine="txtFicheroSeleccionado.Text=\"\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtficheroseleccionado" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 1919;BA.debugLine="DirFicheroProcesar=\"\"";
Debug.ShouldStop(1073741824);
__ref.setField ("_dirficheroprocesar" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1920;BA.debugLine="NombreFicheroProcesar=\"\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_nombreficheroprocesar" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1941;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Buscando Fic";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Buscando Fichero Pedido en carpeta FTP...")));
 BA.debugLineNum = 1942;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1943;BA.debugLine="Wait For(BuscarUltimoFicheroPedidoEnFTP) complete";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnselficheroftp_click"), __ref.runClassMethod (b4j.docU.crepsol.class, "_buscarultimoficheropedidoenftp" /*RemoteObject*/ ));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1944;BA.debugLine="If sResp.StartsWith(\"Error\") Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Error"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1945;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1946;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sResp.Replace(";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_sresp.runMethod(true,"replace",(Object)(BA.ObjectToString("Error,")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1947;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnselficheroftp_click"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 4;
;
 BA.debugLineNum = 1948;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1951;BA.debugLine="If sResp.StartsWith(\"Aviso\") Then";
Debug.ShouldStop(1073741824);

case 4:
//if
this.state = 7;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Aviso"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1952;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1953;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sResp.Replace(";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_sresp.runMethod(true,"replace",(Object)(BA.ObjectToString("Aviso,")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1954;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnselficheroftp_click"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 7;
;
 BA.debugLineNum = 1955;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1958;BA.debugLine="Dim NombreFicheroPedido As String=sResp";
Debug.ShouldStop(32);
_nombreficheropedido = _sresp;Debug.locals.put("NombreFicheroPedido", _nombreficheropedido);Debug.locals.put("NombreFicheroPedido", _nombreficheropedido);
 BA.debugLineNum = 1960;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";
Debug.ShouldStop(128);
if (true) break;

case 8:
//if
this.state = 11;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombreficheropedido)).<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1963;BA.debugLine="Log(\"segsdfg\")";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","834471982",RemoteObject.createImmutable("segsdfg"),0);
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 1966;BA.debugLine="Dim RutaFTPFicheroPedido As String=FilesFoldersFt";
Debug.ShouldStop(8192);
_rutaftpficheropedido = RemoteObject.concat(__ref.getField(true,"_filesfoldersftprepsol" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_nombreficheropedido);Debug.locals.put("RutaFTPFicheroPedido", _rutaftpficheropedido);Debug.locals.put("RutaFTPFicheroPedido", _rutaftpficheropedido);
 BA.debugLineNum = 1968;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Descargando";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",((RemoteObject.concat(RemoteObject.createImmutable("Descargando Fichero Pedido "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheropedido))),RemoteObject.createImmutable(" desde carpeta FTP...")))));
 BA.debugLineNum = 1969;BA.debugLine="jamLoadingIndicator1.IniciarControlTiempoProceso";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_iniciarcontroltiempoproceso" /*RemoteObject*/ );
 BA.debugLineNum = 1970;BA.debugLine="Wait For(DescargarFicheroDesdeCarpetaFTP(RutaFTPF";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnselficheroftp_click"), __ref.runClassMethod (b4j.docU.crepsol.class, "_descargarficherodesdecarpetaftp" /*RemoteObject*/ ,(Object)(_rutaftpficheropedido),(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombreficheropedido)));
this.state = 24;
return;
case 24:
//C
this.state = 12;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1971;BA.debugLine="jamLoadingIndicator1.DetenerControlTiempoProceso";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_detenercontroltiempoproceso" /*RemoteObject*/ );
 BA.debugLineNum = 1972;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(524288);
if (true) break;

case 12:
//if
this.state = 17;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 1974;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Ha habido un";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Ha habido un error en la descarga del fichero "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheropedido))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("ATENCION!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1975;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnselficheroftp_click"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 17;
;
 BA.debugLineNum = 1976;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1977;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1979;BA.debugLine="DirFicheroProcesar=CarpetaDestinoFicherosDescarg";
Debug.ShouldStop(67108864);
__ref.setField ("_dirficheroprocesar" /*RemoteObject*/ ,__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ ));
 BA.debugLineNum = 1980;BA.debugLine="NombreFicheroProcesar=NombreFicheroPedido";
Debug.ShouldStop(134217728);
__ref.setField ("_nombreficheroprocesar" /*RemoteObject*/ ,_nombreficheropedido);
 BA.debugLineNum = 1981;BA.debugLine="txtFicheroSeleccionado.Text=File.Combine(Carpeta";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtficheroseleccionado" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_nombreficheroprocesar" /*RemoteObject*/ ))));
 BA.debugLineNum = 1983;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Fichero ${No";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Fichero "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheropedido))),RemoteObject.createImmutable(" descargado a carpeta destino Repsol "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1984;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnselficheroftp_click"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 17;
;
 if (true) break;
;
 BA.debugLineNum = 1991;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";
Debug.ShouldStop(64);

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombreficheropedido)),parent.__c.getField(true,"False"))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1992;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El fichero $";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El fichero "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheropedido))),RemoteObject.createImmutable(" descargado a carpeta destino Repsol "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )))),RemoteObject.createImmutable(" NO se encuentra en esa carpeta.")))),(Object)(RemoteObject.createImmutable("ERROR")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1993;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnselficheroftp_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 20;
;
 BA.debugLineNum = 1994;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(512);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1995;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 2007;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2008;BA.debugLine="End Sub";
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
public static void  _btnselficherowindows_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFicheroWindows_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2011);
if (RapidSub.canDelegate("btnselficherowindows_click")) { __ref.runUserSub(false, "crepsol","btnselficherowindows_click", __ref); return;}
ResumableSub_btnSelFicheroWindows_Click rsub = new ResumableSub_btnSelFicheroWindows_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelFicheroWindows_Click extends BA.ResumableSub {
public ResumableSub_btnSelFicheroWindows_Click(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _dirfichero = RemoteObject.createImmutable("");
RemoteObject _nombrefichero = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelFicheroWindows_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2011);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2012;BA.debugLine="txtFicheroSeleccionado.Text=\"\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtficheroseleccionado" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 2013;BA.debugLine="Dim FileName As String=SeleccionFicheroCarpetaRed";
Debug.ShouldStop(268435456);
_filename = __ref.runClassMethod (b4j.docU.crepsol.class, "_seleccionficherocarpetared" /*RemoteObject*/ );Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 2016;BA.debugLine="Dim DirFichero As String=File.GetFileParent(FileN";
Debug.ShouldStop(-2147483648);
_dirfichero = parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(_filename));Debug.locals.put("DirFichero", _dirfichero);Debug.locals.put("DirFichero", _dirfichero);
 BA.debugLineNum = 2017;BA.debugLine="Dim NombreFichero As String=File.GetName(FileName";
Debug.ShouldStop(1);
_nombrefichero = parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename));Debug.locals.put("NombreFichero", _nombrefichero);Debug.locals.put("NombreFichero", _nombrefichero);
 BA.debugLineNum = 2019;BA.debugLine="If NombreFichero=\"\" Then Return";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_nombrefichero,BA.ObjectToString(""))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2021;BA.debugLine="If DirFichero<>CarpetaDestinoFicherosDescargadosF";
Debug.ShouldStop(16);
if (true) break;

case 7:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_dirfichero,__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ ))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2022;BA.debugLine="Dim msa As Object = xui.Msgbox2Async($\"Se copiar";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Se copiará el fichero seleccionado a la carpeta "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )))),RemoteObject.createImmutable(". ¿Continuar?")))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2023;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnselficherowindows_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 10;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2024;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(128);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 2025;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargados";
Debug.ShouldStop(256);
if (true) break;

case 16:
//if
this.state = 25;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombrefichero)).<Boolean>get().booleanValue()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2026;BA.debugLine="Dim msa As Object = xui.Msgbox2Async($\"El fiche";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El fichero "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombrefichero))))),RemoteObject.createImmutable(" ya existe.\n"),RemoteObject.createImmutable("¿Reemplazarlo por el fichero seleccionado?")))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2028;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnselficherowindows_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 19;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2029;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(4096);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) return ;
if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 2030;BA.debugLine="File.Delete(CarpetaDestinoFicherosDescargadosFT";
Debug.ShouldStop(8192);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombrefichero));
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 2032;BA.debugLine="File.Copy(DirFichero,NombreFichero,CarpetaDestin";
Debug.ShouldStop(32768);
parent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(_dirfichero),(Object)(_nombrefichero),(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombrefichero));
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 2035;BA.debugLine="DirFicheroProcesar=CarpetaDestinoFicherosDescarga";
Debug.ShouldStop(262144);
__ref.setField ("_dirficheroprocesar" /*RemoteObject*/ ,__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ ));
 BA.debugLineNum = 2036;BA.debugLine="NombreFicheroProcesar=NombreFichero";
Debug.ShouldStop(524288);
__ref.setField ("_nombreficheroprocesar" /*RemoteObject*/ ,_nombrefichero);
 BA.debugLineNum = 2037;BA.debugLine="txtFicheroSeleccionado.Text=File.Combine(CarpetaD";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtficheroseleccionado" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_nombreficheroprocesar" /*RemoteObject*/ ))));
 BA.debugLineNum = 2040;BA.debugLine="End Sub";
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
public static void  _btnuploadfile_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnUploadFile_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,4589);
if (RapidSub.canDelegate("btnuploadfile_click")) { __ref.runUserSub(false, "crepsol","btnuploadfile_click", __ref); return;}
ResumableSub_btnUploadFile_Click rsub = new ResumableSub_btnUploadFile_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnUploadFile_Click extends BA.ResumableSub {
public ResumableSub_btnUploadFile_Click(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _rutaftpficheropedidoerrores = RemoteObject.createImmutable("");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnUploadFile_Click (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,4589);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 4607;BA.debugLine="Dim fc As FileChooser";
Debug.ShouldStop(1073741824);
_fc = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 4608;BA.debugLine="fc.Initialize";
Debug.ShouldStop(-2147483648);
_fc.runVoidMethod ("Initialize");
 BA.debugLineNum = 4609;BA.debugLine="fc.Title=\"Selecciona Fichero\"";
Debug.ShouldStop(1);
_fc.runMethod(true,"setTitle",BA.ObjectToString("Selecciona Fichero"));
 BA.debugLineNum = 4610;BA.debugLine="fc.SetExtensionFilter(\"Ficheros texto\", Array As";
Debug.ShouldStop(2);
_fc.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("Ficheros texto")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("*.csv")})))));
 BA.debugLineNum = 4613;BA.debugLine="fc.InitialDirectory=CarpetaDestinoFicherosDescarg";
Debug.ShouldStop(16);
_fc.runMethod(true,"setInitialDirectory",__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ ));
 BA.debugLineNum = 4614;BA.debugLine="Dim fileName As String = fc.ShowOpen(frm)";
Debug.ShouldStop(32);
_filename = _fc.runMethodAndSync(true,"ShowOpen",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 4616;BA.debugLine="If fileName=\"\" Then Return";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 4620;BA.debugLine="Dim RutaFTPFicheroPedidoErrores As String=ErrorFi";
Debug.ShouldStop(2048);
_rutaftpficheropedidoerrores = RemoteObject.concat(__ref.getField(true,"_errorfilesfoldersftprepsol" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename)));Debug.locals.put("RutaFTPFicheroPedidoErrores", _rutaftpficheropedidoerrores);Debug.locals.put("RutaFTPFicheroPedidoErrores", _rutaftpficheropedidoerrores);
 BA.debugLineNum = 4623;BA.debugLine="sFtpRepsol.UploadFile(File.GetFileParent(fileName";
Debug.ShouldStop(16384);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("UploadFile",__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(_filename))),(Object)(parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename))),(Object)(_rutaftpficheropedidoerrores));
 BA.debugLineNum = 4624;BA.debugLine="Wait For sFtpRepsol_UploadCompleted (ServerPath A";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","sftprepsol_uploadcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnuploadfile_click"), null);
this.state = 13;
return;
case 13:
//C
this.state = 7;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 4626;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 4627;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Error subien";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error subiendo fichero de errores de pedido "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 4629;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnuploadfile_click"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 4631;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Fichero subi";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Fichero subido a carpeta de destino "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename))))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 4632;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "btnuploadfile_click"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 4637;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _buscarprimerficheropedidoenftp(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuscarPrimerFicheroPedidoEnFTP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,439);
if (RapidSub.canDelegate("buscarprimerficheropedidoenftp")) { return __ref.runUserSub(false, "crepsol","buscarprimerficheropedidoenftp", __ref);}
ResumableSub_BuscarPrimerFicheroPedidoEnFTP rsub = new ResumableSub_BuscarPrimerFicheroPedidoEnFTP(null,__ref);
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
public static class ResumableSub_BuscarPrimerFicheroPedidoEnFTP extends BA.ResumableSub {
public ResumableSub_BuscarPrimerFicheroPedidoEnFTP(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _i = 0;
RemoteObject _nombreprimerficheropedido = RemoteObject.createImmutable("");
RemoteObject _fechalongprimerfichero = RemoteObject.createImmutable(0L);
int step10;
int limit10;
int step16;
int limit16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BuscarPrimerFicheroPedidoEnFTP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,439);
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
 BA.debugLineNum = 442;BA.debugLine="sFtpRepsol.List(FilesFoldersFtpRepsol)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("List",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_filesfoldersftprepsol" /*RemoteObject*/ )));
 BA.debugLineNum = 443;BA.debugLine="Wait For sFtpRepsol_ListCompleted (ServerPath As";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","sftprepsol_listcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "buscarprimerficheropedidoenftp"), null);
this.state = 32;
return;
case 32:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(4));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 445;BA.debugLine="If Success = False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 446;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","833685511",parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 448;BA.debugLine="Return \"Error listando carpeta FTP.\" & CRLF & CR";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(RemoteObject.concat(RemoteObject.createImmutable("Error listando carpeta FTP."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));return;};
 if (true) break;
;
 BA.debugLineNum = 451;BA.debugLine="If Files.Length=0 Then";
Debug.ShouldStop(4);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_files.getField(true,"length"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 453;BA.debugLine="Return \"Aviso, Carpeta FTP sin ficheros\"";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Aviso, Carpeta FTP sin ficheros")));return;};
 if (true) break;
;
 BA.debugLineNum = 456;BA.debugLine="For i = 0 To Folders.Length - 1";
Debug.ShouldStop(128);

case 7:
//for
this.state = 10;
step10 = 1;
limit10 = RemoteObject.solve(new RemoteObject[] {_folders.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 10;
if ((step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10)) this.state = 9;
if (true) break;

case 34:
//C
this.state = 33;
_i = ((int)(0 + _i + step10)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 34;
 BA.debugLineNum = 457;BA.debugLine="Log(Folders(i).Name)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","833685522",_folders.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),0);
 BA.debugLineNum = 458;BA.debugLine="Log(DateTime.Date(Folders(i).Timestamp))";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","833685523",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_folders.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"))),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 461;BA.debugLine="Dim NombrePrimerFicheroPedido As String";
Debug.ShouldStop(4096);
_nombreprimerficheropedido = RemoteObject.createImmutable("");Debug.locals.put("NombrePrimerFicheroPedido", _nombreprimerficheropedido);
 BA.debugLineNum = 462;BA.debugLine="Dim FechaLongPrimerFichero As Long";
Debug.ShouldStop(8192);
_fechalongprimerfichero = RemoteObject.createImmutable(0L);Debug.locals.put("FechaLongPrimerFichero", _fechalongprimerfichero);
 BA.debugLineNum = 463;BA.debugLine="For i = 0 To Files.Length - 1";
Debug.ShouldStop(16384);
if (true) break;

case 11:
//for
this.state = 22;
step16 = 1;
limit16 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 35;
if (true) break;

case 35:
//C
this.state = 22;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 13;
if (true) break;

case 36:
//C
this.state = 35;
_i = ((int)(0 + _i + step16)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 464;BA.debugLine="Log(Files(i).Name & \", \" & Files(i).Size & \", \"";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","833685529",RemoteObject.concat(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),RemoteObject.createImmutable(", "),_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getSize"),RemoteObject.createImmutable(", "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp")))),0);
 BA.debugLineNum = 465;BA.debugLine="If Files(i).Name.StartsWith(\"PEDVESTUARIO\") Then";
Debug.ShouldStop(65536);
if (true) break;

case 14:
//if
this.state = 21;
if (_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("PEDVESTUARIO"))).<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 466;BA.debugLine="If Files(i).Timestamp<= FechaLongPrimerFichero";
Debug.ShouldStop(131072);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("k",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_fechalongprimerfichero)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 467;BA.debugLine="NombrePrimerFicheroPedido=Files(i).Name";
Debug.ShouldStop(262144);
_nombreprimerficheropedido = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("NombrePrimerFicheroPedido", _nombreprimerficheropedido);
 BA.debugLineNum = 468;BA.debugLine="FechaLongPrimerFichero=Files(i).Timestamp";
Debug.ShouldStop(524288);
_fechalongprimerfichero = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp");Debug.locals.put("FechaLongPrimerFichero", _fechalongprimerfichero);
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 36;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 472;BA.debugLine="If NombrePrimerFicheroPedido=\"\" Then Return \"Avis";
Debug.ShouldStop(8388608);

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_nombreprimerficheropedido,BA.ObjectToString(""))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Aviso, Carpeta FTP sin fichero de pedido.")));return;};
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 474;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";
Debug.ShouldStop(33554432);
if (true) break;

case 28:
//if
this.state = 31;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombreprimerficheropedido)).<Boolean>get().booleanValue()) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 475;BA.debugLine="Return $\"Aviso, El fichero ${NombrePrimerFichero";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,((RemoteObject.concat(RemoteObject.createImmutable("Aviso, El fichero "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreprimerficheropedido))),RemoteObject.createImmutable(" ha sido descargado anteriormente.")))));return;};
 if (true) break;

case 31:
//C
this.state = -1;
;
 BA.debugLineNum = 482;BA.debugLine="Return NombrePrimerFicheroPedido";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_nombreprimerficheropedido));return;};
 BA.debugLineNum = 484;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _buscarultimoficheropedidoenftp(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuscarUltimoFicheroPedidoEnFTP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,391);
if (RapidSub.canDelegate("buscarultimoficheropedidoenftp")) { return __ref.runUserSub(false, "crepsol","buscarultimoficheropedidoenftp", __ref);}
ResumableSub_BuscarUltimoFicheroPedidoEnFTP rsub = new ResumableSub_BuscarUltimoFicheroPedidoEnFTP(null,__ref);
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
public static class ResumableSub_BuscarUltimoFicheroPedidoEnFTP extends BA.ResumableSub {
public ResumableSub_BuscarUltimoFicheroPedidoEnFTP(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _i = 0;
RemoteObject _nombreultimoficheropedido = RemoteObject.createImmutable("");
RemoteObject _fechalongultimofichero = RemoteObject.createImmutable(0L);
int step10;
int limit10;
int step16;
int limit16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BuscarUltimoFicheroPedidoEnFTP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,391);
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
 BA.debugLineNum = 394;BA.debugLine="sFtpRepsol.List(FilesFoldersFtpRepsol)";
Debug.ShouldStop(512);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("List",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_filesfoldersftprepsol" /*RemoteObject*/ )));
 BA.debugLineNum = 395;BA.debugLine="Wait For sFtpRepsol_ListCompleted (ServerPath As";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","sftprepsol_listcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "buscarultimoficheropedidoenftp"), null);
this.state = 32;
return;
case 32:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(4));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 397;BA.debugLine="If Success = False Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 398;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","833619975",parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 400;BA.debugLine="Return \"Error listando carpeta FTP.\" & CRLF & CR";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(RemoteObject.concat(RemoteObject.createImmutable("Error listando carpeta FTP."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));return;};
 if (true) break;
;
 BA.debugLineNum = 403;BA.debugLine="If Files.Length=0 Then";
Debug.ShouldStop(262144);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_files.getField(true,"length"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 405;BA.debugLine="Return \"Aviso, Carpeta FTP sin ficheros\"";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Aviso, Carpeta FTP sin ficheros")));return;};
 if (true) break;
;
 BA.debugLineNum = 408;BA.debugLine="For i = 0 To Folders.Length - 1";
Debug.ShouldStop(8388608);

case 7:
//for
this.state = 10;
step10 = 1;
limit10 = RemoteObject.solve(new RemoteObject[] {_folders.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 10;
if ((step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10)) this.state = 9;
if (true) break;

case 34:
//C
this.state = 33;
_i = ((int)(0 + _i + step10)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 34;
 BA.debugLineNum = 409;BA.debugLine="Log(Folders(i).Name)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","833619986",_folders.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),0);
 BA.debugLineNum = 410;BA.debugLine="Log(DateTime.Date(Folders(i).Timestamp))";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","833619987",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_folders.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"))),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 413;BA.debugLine="Dim NombreUltimoFicheroPedido As String";
Debug.ShouldStop(268435456);
_nombreultimoficheropedido = RemoteObject.createImmutable("");Debug.locals.put("NombreUltimoFicheroPedido", _nombreultimoficheropedido);
 BA.debugLineNum = 414;BA.debugLine="Dim FechaLongUltimoFichero As Long";
Debug.ShouldStop(536870912);
_fechalongultimofichero = RemoteObject.createImmutable(0L);Debug.locals.put("FechaLongUltimoFichero", _fechalongultimofichero);
 BA.debugLineNum = 415;BA.debugLine="For i = 0 To Files.Length - 1";
Debug.ShouldStop(1073741824);
if (true) break;

case 11:
//for
this.state = 22;
step16 = 1;
limit16 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 35;
if (true) break;

case 35:
//C
this.state = 22;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 13;
if (true) break;

case 36:
//C
this.state = 35;
_i = ((int)(0 + _i + step16)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 416;BA.debugLine="Log(Files(i).Name & \", \" & Files(i).Size & \", \"";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","833619993",RemoteObject.concat(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),RemoteObject.createImmutable(", "),_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getSize"),RemoteObject.createImmutable(", "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp")))),0);
 BA.debugLineNum = 417;BA.debugLine="If Files(i).Name.StartsWith(\"PEDVESTUARIO\") Then";
Debug.ShouldStop(1);
if (true) break;

case 14:
//if
this.state = 21;
if (_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("PEDVESTUARIO"))).<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 418;BA.debugLine="If Files(i).Timestamp> FechaLongUltimoFichero T";
Debug.ShouldStop(2);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean(">",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_fechalongultimofichero)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 419;BA.debugLine="NombreUltimoFicheroPedido=Files(i).Name";
Debug.ShouldStop(4);
_nombreultimoficheropedido = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("NombreUltimoFicheroPedido", _nombreultimoficheropedido);
 BA.debugLineNum = 420;BA.debugLine="FechaLongUltimoFichero=Files(i).Timestamp";
Debug.ShouldStop(8);
_fechalongultimofichero = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp");Debug.locals.put("FechaLongUltimoFichero", _fechalongultimofichero);
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 36;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 424;BA.debugLine="If NombreUltimoFicheroPedido=\"\" Then Return \"Avis";
Debug.ShouldStop(128);

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_nombreultimoficheropedido,BA.ObjectToString(""))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Aviso, Carpeta FTP sin fichero de pedido.")));return;};
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 426;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";
Debug.ShouldStop(512);
if (true) break;

case 28:
//if
this.state = 31;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombreultimoficheropedido)).<Boolean>get().booleanValue()) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 427;BA.debugLine="Return $\"Aviso, El fichero ${NombreUltimoFichero";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,((RemoteObject.concat(RemoteObject.createImmutable("Aviso, El fichero "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreultimoficheropedido))),RemoteObject.createImmutable(" ha sido descargado anteriormente.")))));return;};
 if (true) break;

case 31:
//C
this.state = -1;
;
 BA.debugLineNum = 435;BA.debugLine="Return NombreUltimoFicheroPedido";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_nombreultimoficheropedido));return;};
 BA.debugLineNum = 437;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadatosconnsftp(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosConnSFTP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("cargadatosconnsftp")) { return __ref.runUserSub(false, "crepsol","cargadatosconnsftp", __ref);}
ResumableSub_CargaDatosConnSFTP rsub = new ResumableSub_CargaDatosConnSFTP(null,__ref);
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
public static class ResumableSub_CargaDatosConnSFTP extends BA.ResumableSub {
public ResumableSub_CargaDatosConnSFTP(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mdataconn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosConnSFTP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,350);
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
 BA.debugLineNum = 351;BA.debugLine="LogColor(\"CargaDatosConnSFTP\", xui.Color_Green)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","833554433",BA.ObjectToString("CargaDatosConnSFTP"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green"));
 BA.debugLineNum = 352;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(-2147483648);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 353;BA.debugLine="Dim mDataConn As Map";
Debug.ShouldStop(1);
_mdataconn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDataConn", _mdataconn);
 BA.debugLineNum = 354;BA.debugLine="mDataConn.Initialize";
Debug.ShouldStop(2);
_mdataconn.runVoidMethod ("Initialize");
 BA.debugLineNum = 355;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 356;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 357;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 358;BA.debugLine="mRes.Put(\"mDataConn\",mDataConn)";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mDataConn"))),(Object)((_mdataconn.getObject())));
 BA.debugLineNum = 360;BA.debugLine="Dim Comando As String=\"DatossFTPRepsolProduccion\"";
Debug.ShouldStop(128);
_comando = BA.ObjectToString("DatossFTPRepsolProduccion");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 361;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(256);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 363;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargadatosconnsftp"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 365;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 366;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 367;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 368;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargadatosconnsftp"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 369;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 370;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 373;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 374;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 375;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe l";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.createImmutable("No existe la configuración necesaria para la conexión."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 376;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargadatosconnsftp"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 377;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 378;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 380;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(134217728);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 381;BA.debugLine="mDataConn=lstReg.Get(0)";
Debug.ShouldStop(268435456);
_mdataconn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mDataConn", _mdataconn);
 BA.debugLineNum = 382;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 383;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 384;BA.debugLine="mRes.Put(\"mDataConn\", mDataConn)";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mDataConn"))),(Object)((_mdataconn.getObject())));
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
 BA.debugLineNum = 388;BA.debugLine="Return mRes";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 389;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _cargadireccionesenviorepsoleessgrp(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaDireccionesEnvioRepsolEESSGRP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2106);
if (RapidSub.canDelegate("cargadireccionesenviorepsoleessgrp")) { return __ref.runUserSub(false, "crepsol","cargadireccionesenviorepsoleessgrp", __ref);}
ResumableSub_CargaDireccionesEnvioRepsolEESSGRP rsub = new ResumableSub_CargaDireccionesEnvioRepsolEESSGRP(null,__ref);
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
public static class ResumableSub_CargaDireccionesEnvioRepsolEESSGRP extends BA.ResumableSub {
public ResumableSub_CargaDireccionesEnvioRepsolEESSGRP(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDireccionesEnvioRepsolEESSGRP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2106);
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
 BA.debugLineNum = 2108;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolMapeoSede";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblRepsolMapeoSedesEESS")));
 BA.debugLineNum = 2110;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(536870912);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2111;BA.debugLine="Dim Error As String";
Debug.ShouldStop(1073741824);
_error = RemoteObject.createImmutable("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 2112;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(-2147483648);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2113;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(1);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 2114;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(2);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 2115;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 2116;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2117;BA.debugLine="mRes.Put(\"Error\",Error)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 BA.debugLineNum = 2118;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 2119;BA.debugLine="Dim Comando As String=\"RepsolDireccionesEnvioEESS";
Debug.ShouldStop(64);
_comando = BA.ObjectToString("RepsolDireccionesEnvioEESSGRP");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 2120;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(128);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_mcodigonavgrprepsoleess" /*RemoteObject*/ ))})),(Object)(__ref));
 BA.debugLineNum = 2122;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargadireccionesenviorepsoleessgrp"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 2124;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 2125;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2128;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2129;BA.debugLine="Error=\"Error de conexion servidor/query \" & Coma";
Debug.ShouldStop(65536);
_error = RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."));Debug.locals.put("Error", _error);
 BA.debugLineNum = 2130;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2131;BA.debugLine="mRes.Put(\"Error\", Error)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2133;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 2134;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2137;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2138;BA.debugLine="Error=$\"No hay datos de direcciones de envío de";
Debug.ShouldStop(33554432);
_error = (RemoteObject.createImmutable("No hay datos de direcciones de envío de las EESS de España."));Debug.locals.put("Error", _error);
 BA.debugLineNum = 2139;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2140;BA.debugLine="mRes.Put(\"Error\", Error)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2142;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(536870912);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2143;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2144;BA.debugLine="Error=\"\"";
Debug.ShouldStop(-2147483648);
_error = BA.ObjectToString("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 2145;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2146;BA.debugLine="mRes.Put(\"Error\", Error)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 BA.debugLineNum = 2147;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 2150;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(32);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblRepsolMapeoSedesEESS")),(Object)(_lstreg));
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
 BA.debugLineNum = 2153;BA.debugLine="Return mRes";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 2154;BA.debugLine="End Sub";
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
public static RemoteObject  _cargamapeoarticuloseess(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaMapeoArticulosEESS (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2203);
if (RapidSub.canDelegate("cargamapeoarticuloseess")) { return __ref.runUserSub(false, "crepsol","cargamapeoarticuloseess", __ref);}
ResumableSub_CargaMapeoArticulosEESS rsub = new ResumableSub_CargaMapeoArticulosEESS(null,__ref);
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
public static class ResumableSub_CargaMapeoArticulosEESS extends BA.ResumableSub {
public ResumableSub_CargaMapeoArticulosEESS(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaMapeoArticulosEESS (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2203);
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
 BA.debugLineNum = 2205;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolMapeoArti";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblRepsolMapeoArticulosEESS")));
 BA.debugLineNum = 2206;BA.debugLine="LogColor(\"CargaMapeoArticulosEESS\",xui.Color_Mage";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","834799619",BA.ObjectToString("CargaMapeoArticulosEESS"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Magenta"));
 BA.debugLineNum = 2207;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1073741824);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2208;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(-2147483648);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2209;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(1);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 2210;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(2);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 2211;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 2212;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2213;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 2214;BA.debugLine="Dim Comando As String=\"RepsolMapeoArticulosEESS\"";
Debug.ShouldStop(32);
_comando = BA.ObjectToString("RepsolMapeoArticulosEESS");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 2215;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(64);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 2217;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargamapeoarticuloseess"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 2219;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 2220;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2221;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2222;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargamapeoarticuloseess"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2223;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16384);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2224;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(32768);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2226;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 2227;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2228;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.createImmutable("No hay datos de mapeo artículos REPSOL."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2229;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargamapeoarticuloseess"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 2230;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2231;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2233;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16777216);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2234;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2235;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2239;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(1073741824);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblRepsolMapeoArticulosEESS")),(Object)(_lstreg));
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
 BA.debugLineNum = 2242;BA.debugLine="Return mRes";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 2243;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static RemoteObject  _cargamapeocodigosprendaeess(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaMapeoCodigosPrendaEESS (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2245);
if (RapidSub.canDelegate("cargamapeocodigosprendaeess")) { return __ref.runUserSub(false, "crepsol","cargamapeocodigosprendaeess", __ref);}
ResumableSub_CargaMapeoCodigosPrendaEESS rsub = new ResumableSub_CargaMapeoCodigosPrendaEESS(null,__ref);
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
public static class ResumableSub_CargaMapeoCodigosPrendaEESS extends BA.ResumableSub {
public ResumableSub_CargaMapeoCodigosPrendaEESS(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaMapeoCodigosPrendaEESS (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2245);
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
 BA.debugLineNum = 2247;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolMapeoCodi";
Debug.ShouldStop(64);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblRepsolMapeoCodigosPrendaEESS")));
 BA.debugLineNum = 2249;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(256);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2250;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(512);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2251;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(1024);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 2252;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(2048);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 2253;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 2254;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2255;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 2256;BA.debugLine="Dim Comando As String=\"RepsolMapeoCodigosPrendaEE";
Debug.ShouldStop(32768);
_comando = BA.ObjectToString("RepsolMapeoCodigosPrendaEESS");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 2257;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(65536);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 2259;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargamapeocodigosprendaeess"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 2261;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 2262;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2263;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2264;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargamapeocodigosprendaeess"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2265;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2266;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2268;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 2269;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2270;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.createImmutable("No hay datos de mapeo de tipo de prendas."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2271;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargamapeocodigosprendaeess"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 2272;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2273;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2275;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2276;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2277;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2281;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(256);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblRepsolMapeoCodigosPrendaEESS")),(Object)(_lstreg));
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
 BA.debugLineNum = 2284;BA.debugLine="Return mRes";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 2285;BA.debugLine="End Sub";
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
public static RemoteObject  _cargarepsolultimodiaprocesadodatospedidosonline(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,5260);
if (RapidSub.canDelegate("cargarepsolultimodiaprocesadodatospedidosonline")) { return __ref.runUserSub(false, "crepsol","cargarepsolultimodiaprocesadodatospedidosonline", __ref);}
ResumableSub_CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine rsub = new ResumableSub_CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine(null,__ref);
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
public static class ResumableSub_CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine extends BA.ResumableSub {
public ResumableSub_CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _ultimodiapedidosonlineprocesado = RemoteObject.createImmutable(0L);
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,5260);
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
 BA.debugLineNum = 5261;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4096);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 5262;BA.debugLine="Dim Error As String";
Debug.ShouldStop(8192);
_error = RemoteObject.createImmutable("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 5263;BA.debugLine="Dim UltimoDiaPedidosOnlineProcesado As Long";
Debug.ShouldStop(16384);
_ultimodiapedidosonlineprocesado = RemoteObject.createImmutable(0L);Debug.locals.put("UltimoDiaPedidosOnlineProcesado", _ultimodiapedidosonlineprocesado);
 BA.debugLineNum = 5264;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(32768);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 5265;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 5267;BA.debugLine="Dim Comando As String=\"RepsolUltimoDiaProcesadoDa";
Debug.ShouldStop(262144);
_comando = BA.ObjectToString("RepsolUltimoDiaProcesadoDatosPedidosOnLine");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 5268;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(524288);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 5269;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargarepsolultimodiaprocesadodatospedidosonline"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 5270;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 5271;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 5272;BA.debugLine="Error=$\"Error de conexion servidor/query ${Coman";
Debug.ShouldStop(8388608);
_error = (RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_comando))),RemoteObject.createImmutable(".")));Debug.locals.put("Error", _error);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 5275;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 5279;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 5280;BA.debugLine="Error=\"\"";
Debug.ShouldStop(-2147483648);
_error = BA.ObjectToString("");Debug.locals.put("Error", _error);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 5283;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
Debug.ShouldStop(4);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 5284;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 5285;BA.debugLine="Error=\"\"";
Debug.ShouldStop(16);
_error = BA.ObjectToString("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 5288;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
Debug.ShouldStop(128);
_mdata0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData0", _mdata0);Debug.locals.put("mData0", _mdata0);
 BA.debugLineNum = 5289;BA.debugLine="UltimoDiaPedidosOnlineProcesado=Utilidades.FixN";
Debug.ShouldStop(256);
_ultimodiapedidosonlineprocesado = parent._utilidades.runMethod(true,"_fixnulllong" /*RemoteObject*/ ,(Object)(_mdata0.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UltimoDiaPedidosOnlineProcesado"))))));Debug.locals.put("UltimoDiaPedidosOnlineProcesado", _ultimodiapedidosonlineprocesado);
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
 BA.debugLineNum = 5292;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 5293;BA.debugLine="mRes.Put(\"Error\", Error)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 BA.debugLineNum = 5294;BA.debugLine="mRes.Put(\"UltimoDiaPedidosOnlineProcesado\", Ultim";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("UltimoDiaPedidosOnlineProcesado"))),(Object)((_ultimodiapedidosonlineprocesado)));
 BA.debugLineNum = 5295;BA.debugLine="Return mRes";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 5296;BA.debugLine="End Sub";
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
public static RemoteObject  _cargatallasarticuloseess(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaTallasArticulosEESS (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2287);
if (RapidSub.canDelegate("cargatallasarticuloseess")) { return __ref.runUserSub(false, "crepsol","cargatallasarticuloseess", __ref);}
ResumableSub_CargaTallasArticulosEESS rsub = new ResumableSub_CargaTallasArticulosEESS(null,__ref);
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
public static class ResumableSub_CargaTallasArticulosEESS extends BA.ResumableSub {
public ResumableSub_CargaTallasArticulosEESS(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _uuidbatch = RemoteObject.createImmutable("");
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsartseess = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _codigoarticulonav = RemoteObject.createImmutable("");
RemoteObject _mresbatch = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accionbatch = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaTallasArticulosEESS (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2287);
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
 BA.debugLineNum = 2289;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(65536);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2290;BA.debugLine="Dim Error As String";
Debug.ShouldStop(131072);
_error = RemoteObject.createImmutable("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 2291;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(262144);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 2292;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 2293;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2294;BA.debugLine="mRes.Put(\"Error\",Error)";
Debug.ShouldStop(2097152);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 BA.debugLineNum = 2296;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolTallasArt";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblRepsolTallasArticulosEESS")));
 BA.debugLineNum = 2298;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
Debug.ShouldStop(33554432);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarLineasArticulosTallasBatchUsuarioDispositivo")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"Dispositivo" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 2299;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargatallasarticuloseess"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 2300;BA.debugLine="If success=False Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2301;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2305;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2306;BA.debugLine="Error=\"No ha sido posible eliminar los datos bat";
Debug.ShouldStop(2);
_error = BA.ObjectToString("No ha sido posible eliminar los datos batch anteriores del usuario/dispositivo actuales.");Debug.locals.put("Error", _error);
 BA.debugLineNum = 2307;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2308;BA.debugLine="mRes.Put(\"Error\",Error)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 BA.debugLineNum = 2309;BA.debugLine="Return mRes";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2312;BA.debugLine="Dim UUIDBatch As String=Utilidades.GenerarUUIDv4";
Debug.ShouldStop(128);
_uuidbatch = parent._utilidades.runMethod(true,"_generaruuidv4" /*RemoteObject*/ );Debug.locals.put("UUIDBatch", _uuidbatch);Debug.locals.put("UUIDBatch", _uuidbatch);
 BA.debugLineNum = 2313;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(256);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 2314;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(512);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 2315;BA.debugLine="Dim rsArtsEESS As ResultSet=mSQL.ExecQuery(\"selec";
Debug.ShouldStop(1024);
_rsartseess = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsartseess = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select DISTINCT CodigoArticuloNAV from tblRepsolMapeoArticulosEESS")));Debug.locals.put("rsArtsEESS", _rsartseess);Debug.locals.put("rsArtsEESS", _rsartseess);
 BA.debugLineNum = 2316;BA.debugLine="Do While rsArtsEESS.NextRow";
Debug.ShouldStop(2048);
if (true) break;

case 5:
//do while
this.state = 8;
while (_rsartseess.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
 BA.debugLineNum = 2317;BA.debugLine="Dim CodigoArticuloNAV As String=rsArtsEESS.GetSt";
Debug.ShouldStop(4096);
_codigoarticulonav = _rsartseess.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoArticuloNAV")));Debug.locals.put("CodigoArticuloNAV", _codigoarticulonav);Debug.locals.put("CodigoArticuloNAV", _codigoarticulonav);
 BA.debugLineNum = 2318;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"In";
Debug.ShouldStop(8192);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InsertarLineaArticuloTallaBatch")),(Object)(RemoteObject.createNewArray("Object",new int[] {8},new Object[] {(_uuidbatch),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"Dispositivo" /*RemoteObject*/ )),(_codigoarticulonav),RemoteObject.createImmutable(("")),RemoteObject.createImmutable((0)),RemoteObject.createImmutable((0)),(RemoteObject.createImmutable(""))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 2320;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(32768);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 2322;BA.debugLine="rsArtsEESS.Close";
Debug.ShouldStop(131072);
_rsartseess.runVoidMethod ("Close");
 BA.debugLineNum = 2324;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargatallasarticuloseess"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_lstcommands)));
this.state = 18;
return;
case 18:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 2325;BA.debugLine="If success=False Then";
Debug.ShouldStop(1048576);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2326;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2330;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2331;BA.debugLine="Error=\"No ha sido posible insertar las líneas ba";
Debug.ShouldStop(67108864);
_error = BA.ObjectToString("No ha sido posible insertar las líneas batch de los artículos de Repsol.");Debug.locals.put("Error", _error);
 BA.debugLineNum = 2332;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2333;BA.debugLine="mRes.Put(\"Error\",Error)";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 BA.debugLineNum = 2334;BA.debugLine="Return mRes";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 2338;BA.debugLine="Wait For(CargaTallasArticulosEESSBatch(UUIDBatch)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargatallasarticuloseess"), __ref.runClassMethod (b4j.docU.crepsol.class, "_cargatallasarticuloseessbatch" /*RemoteObject*/ ,(Object)(_uuidbatch)));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_mresbatch = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResBatch", _mresbatch);
;
 BA.debugLineNum = 2339;BA.debugLine="Dim AccionBatch As String=mResBatch.Get(\"Accion\")";
Debug.ShouldStop(4);
_accionbatch = BA.ObjectToString(_mresbatch.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("AccionBatch", _accionbatch);Debug.locals.put("AccionBatch", _accionbatch);
 BA.debugLineNum = 2340;BA.debugLine="If AccionBatch=\"NOK\" Then";
Debug.ShouldStop(8);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_accionbatch,BA.ObjectToString("NOK"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2341;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2342;BA.debugLine="Error=mResBatch.Get(\"Error\")";
Debug.ShouldStop(32);
_error = BA.ObjectToString(_mresbatch.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);
 BA.debugLineNum = 2343;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2344;BA.debugLine="mRes.Put(\"Error\",Error)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 BA.debugLineNum = 2345;BA.debugLine="Return mRes";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 2348;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
Debug.ShouldStop(2048);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarLineasArticulosTallasBatchUUID")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_uuidbatch)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 2349;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargatallasarticuloseess"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 20;
return;
case 20:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 2353;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2354;BA.debugLine="Error=\"\"";
Debug.ShouldStop(131072);
_error = BA.ObjectToString("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 2355;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2356;BA.debugLine="mRes.Put(\"Error\",Error)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 BA.debugLineNum = 2357;BA.debugLine="Return mRes";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 2360;BA.debugLine="End Sub";
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
public static RemoteObject  _cargatallasarticuloseessbatch(RemoteObject __ref,RemoteObject _uuidsel) throws Exception{
try {
		Debug.PushSubsStack("CargaTallasArticulosEESSBatch (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2364);
if (RapidSub.canDelegate("cargatallasarticuloseessbatch")) { return __ref.runUserSub(false, "crepsol","cargatallasarticuloseessbatch", __ref, _uuidsel);}
ResumableSub_CargaTallasArticulosEESSBatch rsub = new ResumableSub_CargaTallasArticulosEESSBatch(null,__ref,_uuidsel);
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
public static class ResumableSub_CargaTallasArticulosEESSBatch extends BA.ResumableSub {
public ResumableSub_CargaTallasArticulosEESSBatch(b4j.docU.crepsol parent,RemoteObject __ref,RemoteObject _uuidsel) {
this.parent = parent;
this.__ref = __ref;
this._uuidsel = _uuidsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _uuidsel;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaTallasArticulosEESSBatch (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2364);
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
Debug.locals.put("UUIDSel", _uuidsel);
 BA.debugLineNum = 2366;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolTallasArt";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblRepsolTallasArticulosEESS")));
 BA.debugLineNum = 2367;BA.debugLine="LogColor(\"CargaTallasArticulosEESSBatch\",xui.Colo";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","834996227",BA.ObjectToString("CargaTallasArticulosEESSBatch"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Magenta"));
 BA.debugLineNum = 2368;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(-2147483648);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2369;BA.debugLine="Dim Error As String";
Debug.ShouldStop(1);
_error = RemoteObject.createImmutable("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 2370;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(2);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2371;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(4);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 2372;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 2373;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 2374;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2375;BA.debugLine="mRes.Put(\"Error\",Error)";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 BA.debugLineNum = 2376;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 2377;BA.debugLine="Dim Comando As String=\"RepsolTallasArticulosBatch";
Debug.ShouldStop(256);
_comando = BA.ObjectToString("RepsolTallasArticulosBatch");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 2378;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(512);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_uuidsel)})),(Object)(__ref));
 BA.debugLineNum = 2380;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargatallasarticuloseessbatch"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 2382;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 2383;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2386;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2387;BA.debugLine="Error=$\"Error de conexion servidor/query ${Coman";
Debug.ShouldStop(262144);
_error = (RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_comando))),RemoteObject.createImmutable(".")));Debug.locals.put("Error", _error);
 BA.debugLineNum = 2388;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2389;BA.debugLine="mRes.Put(\"Error\", Error)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2391;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 2392;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2393;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.createImmutable("No hay datos de tallas de artículos Repsol."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2394;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargatallasarticuloseessbatch"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 11;
;
 BA.debugLineNum = 2395;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2396;BA.debugLine="Error=$\"No hay datos de tallas de artículos Rep";
Debug.ShouldStop(134217728);
_error = (RemoteObject.createImmutable("No hay datos de tallas de artículos Repsol."));Debug.locals.put("Error", _error);
 BA.debugLineNum = 2397;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2398;BA.debugLine="mRes.Put(\"Error\", Error)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2400;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(-2147483648);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2401;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2402;BA.debugLine="Error=\"\"";
Debug.ShouldStop(2);
_error = BA.ObjectToString("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 2403;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2404;BA.debugLine="mRes.Put(\"Error\", Error)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 BA.debugLineNum = 2408;BA.debugLine="LogColor(\"InsertarMapsSoloCamposCoincidentes tb";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","834996268",BA.ObjectToString("InsertarMapsSoloCamposCoincidentes tblRepsolTallasArticulosEESS"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green"));
 BA.debugLineNum = 2409;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(256);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblRepsolTallasArticulosEESS")),(Object)(_lstreg));
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
 BA.debugLineNum = 2412;BA.debugLine="Return mRes";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 2413;BA.debugLine="End Sub";
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
public static RemoteObject  _cargatarifaventavalidaactualgrprepsoleess(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaTarifaVentaValidaActualGRPRepsolEESS (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2157);
if (RapidSub.canDelegate("cargatarifaventavalidaactualgrprepsoleess")) { return __ref.runUserSub(false, "crepsol","cargatarifaventavalidaactualgrprepsoleess", __ref);}
ResumableSub_CargaTarifaVentaValidaActualGRPRepsolEESS rsub = new ResumableSub_CargaTarifaVentaValidaActualGRPRepsolEESS(null,__ref);
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
public static class ResumableSub_CargaTarifaVentaValidaActualGRPRepsolEESS extends BA.ResumableSub {
public ResumableSub_CargaTarifaVentaValidaActualGRPRepsolEESS(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaTarifaVentaValidaActualGRPRepsolEESS (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,2157);
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
 BA.debugLineNum = 2159;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolTarifaVen";
Debug.ShouldStop(16384);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblRepsolTarifaVentaGRP07506")));
 BA.debugLineNum = 2161;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(65536);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2162;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(131072);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2163;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(262144);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 2164;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(524288);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 2165;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 2166;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(2097152);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2167;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 2168;BA.debugLine="Dim Comando As String=\"TarifaVentaActualTipoTarif";
Debug.ShouldStop(8388608);
_comando = BA.ObjectToString("TarifaVentaActualTipoTarifaCodigoTarifa");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 2169;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(16777216);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((1)),(__ref.getField(true,"_mcodigonavgrprepsoleess" /*RemoteObject*/ ))})),(Object)(__ref));
 BA.debugLineNum = 2171;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargatarifaventavalidaactualgrprepsoleess"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 2173;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 2174;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2175;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2176;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargatarifaventavalidaactualgrprepsoleess"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2177;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2178;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2180;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 2181;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2182;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.createImmutable("No hay datos de tarifa de precios de las EESS de España."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2183;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "cargatarifaventavalidaactualgrprepsoleess"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 2184;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2185;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2187;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1024);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2188;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2189;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2190;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 2193;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(65536);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblRepsolTarifaVentaGRP07506")),(Object)(_lstreg));
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
 BA.debugLineNum = 2196;BA.debugLine="Return mRes";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 2197;BA.debugLine="End Sub";
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
public static RemoteObject  _checkdni(RemoteObject __ref,RemoteObject _dni) throws Exception{
try {
		Debug.PushSubsStack("checkDNI (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,1351);
if (RapidSub.canDelegate("checkdni")) { return __ref.runUserSub(false, "crepsol","checkdni", __ref, _dni);}
RemoteObject _txtlongitud = RemoteObject.createImmutable(0);
RemoteObject _letra = RemoteObject.createImmutable("");
RemoteObject _letracalculada = RemoteObject.createImmutable("");
Debug.locals.put("dni", _dni);
 BA.debugLineNum = 1351;BA.debugLine="Sub checkDNI(dni As String) As String";
Debug.ShouldStop(64);
 BA.debugLineNum = 1352;BA.debugLine="If dni.Length<>9 Then Return False 'longitud inco";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",_dni.runMethod(true,"length"),BA.numberCast(double.class, 9))) { 
if (true) return BA.ObjectToString(crepsol.__c.getField(true,"False"));};
 BA.debugLineNum = 1353;BA.debugLine="dni = dni.ToUpperCase";
Debug.ShouldStop(256);
_dni = _dni.runMethod(true,"toUpperCase");Debug.locals.put("dni", _dni);
 BA.debugLineNum = 1354;BA.debugLine="Dim txtlongitud As Int = dni.Length";
Debug.ShouldStop(512);
_txtlongitud = _dni.runMethod(true,"length");Debug.locals.put("txtlongitud", _txtlongitud);Debug.locals.put("txtlongitud", _txtlongitud);
 BA.debugLineNum = 1355;BA.debugLine="Dim letra As String = dni.SubString2(txtlongitud-";
Debug.ShouldStop(1024);
_letra = _dni.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_txtlongitud,RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_txtlongitud));Debug.locals.put("letra", _letra);Debug.locals.put("letra", _letra);
 BA.debugLineNum = 1356;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 1357;BA.debugLine="Dim letracalculada As String = getLetraDNI(dni.S";
Debug.ShouldStop(4096);
_letracalculada = __ref.runClassMethod (b4j.docU.crepsol.class, "_getletradni" /*RemoteObject*/ ,(Object)(_dni.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_txtlongitud,RemoteObject.createImmutable(1)}, "-",1, 1)))));Debug.locals.put("letracalculada", _letracalculada);Debug.locals.put("letracalculada", _letracalculada);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 1359;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
crepsol.__c.runVoidMethod ("LogImpl","834340872",BA.ObjectToString(crepsol.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 1360;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToString(crepsol.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1363;BA.debugLine="If letra=letracalculada Then Return True Else Ret";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_letra,_letracalculada)) { 
if (true) return BA.ObjectToString(crepsol.__c.getField(true,"True"));}
else {
if (true) return BA.ObjectToString(crepsol.__c.getField(true,"False"));};
 BA.debugLineNum = 1364;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
crepsol._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",crepsol._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
crepsol._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",crepsol._frm);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
crepsol._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",crepsol._xui);
 //BA.debugLineNum = 9;BA.debugLine="Private mSQL As SQL";
crepsol._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",crepsol._msql);
 //BA.debugLineNum = 11;BA.debugLine="Private DragAndDrop1 As DragAndDrop";
crepsol._draganddrop1 = RemoteObject.createNew ("b4j.docU.draganddrop");__ref.setField("_draganddrop1",crepsol._draganddrop1);
 //BA.debugLineNum = 13;BA.debugLine="Private SplitPane1 As SplitPane";
crepsol._splitpane1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SplitPaneWrapper");__ref.setField("_splitpane1",crepsol._splitpane1);
 //BA.debugLineNum = 14;BA.debugLine="Private TreeViewLocal As TreeView";
crepsol._treeviewlocal = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper");__ref.setField("_treeviewlocal",crepsol._treeviewlocal);
 //BA.debugLineNum = 15;BA.debugLine="Private TreeViewFTP As TreeView";
crepsol._treeviewftp = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper");__ref.setField("_treeviewftp",crepsol._treeviewftp);
 //BA.debugLineNum = 17;BA.debugLine="Private vLocalPath As TextField";
crepsol._vlocalpath = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_vlocalpath",crepsol._vlocalpath);
 //BA.debugLineNum = 18;BA.debugLine="Private vFTPpath As TextField";
crepsol._vftppath = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_vftppath",crepsol._vftppath);
 //BA.debugLineNum = 19;BA.debugLine="Private TextFTP As TextField";
crepsol._textftp = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_textftp",crepsol._textftp);
 //BA.debugLineNum = 20;BA.debugLine="Private TextUser As TextField";
crepsol._textuser = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_textuser",crepsol._textuser);
 //BA.debugLineNum = 21;BA.debugLine="Private TextPassword As TextField";
crepsol._textpassword = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_textpassword",crepsol._textpassword);
 //BA.debugLineNum = 22;BA.debugLine="Private TextInfo As TextArea";
crepsol._textinfo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_textinfo",crepsol._textinfo);
 //BA.debugLineNum = 23;BA.debugLine="Private SD_LoadingIndicator1 As SD_LoadingIndicat";
crepsol._sd_loadingindicator1 = RemoteObject.createNew ("b4j.docU.sd_loadingindicator");__ref.setField("_sd_loadingindicator1",crepsol._sd_loadingindicator1);
 //BA.debugLineNum = 25;BA.debugLine="Private Dialog As B4XDialog";
crepsol._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",crepsol._dialog);
 //BA.debugLineNum = 27;BA.debugLine="Public PermisoModuloUsuario As String";
crepsol._permisomodulousuario = RemoteObject.createImmutable("");__ref.setField("_permisomodulousuario",crepsol._permisomodulousuario);
 //BA.debugLineNum = 28;BA.debugLine="Private btnSalir As B4XView";
crepsol._btnsalir = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnsalir",crepsol._btnsalir);
 //BA.debugLineNum = 30;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
crepsol._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",crepsol._jamloadingindicator1);
 //BA.debugLineNum = 33;BA.debugLine="Private mCodigoNAVGRPRepsolEESS As String";
crepsol._mcodigonavgrprepsoleess = RemoteObject.createImmutable("");__ref.setField("_mcodigonavgrprepsoleess",crepsol._mcodigonavgrprepsoleess);
 //BA.debugLineNum = 35;BA.debugLine="Private sFtpRepsol As SFtp";
crepsol._sftprepsol = RemoteObject.createNew ("anywheresoftware.b4a.objects.SFtpWrapper");__ref.setField("_sftprepsol",crepsol._sftprepsol);
 //BA.debugLineNum = 36;BA.debugLine="Private FilesFoldersFtpRepsol As String";
crepsol._filesfoldersftprepsol = RemoteObject.createImmutable("");__ref.setField("_filesfoldersftprepsol",crepsol._filesfoldersftprepsol);
 //BA.debugLineNum = 37;BA.debugLine="Private ErrorFilesFoldersFtpRepsol As String";
crepsol._errorfilesfoldersftprepsol = RemoteObject.createImmutable("");__ref.setField("_errorfilesfoldersftprepsol",crepsol._errorfilesfoldersftprepsol);
 //BA.debugLineNum = 39;BA.debugLine="Private CarpetaDestinoFicherosDescargadosFTPPedid";
crepsol._carpetadestinoficherosdescargadosftppedidosrepsol = BA.ObjectToString("\\\\192.168.10.4\\Publico\\PedidosRepsolOnline\\FicherosDescargadosFTP");__ref.setField("_carpetadestinoficherosdescargadosftppedidosrepsol",crepsol._carpetadestinoficherosdescargadosftppedidosrepsol);
 //BA.debugLineNum = 40;BA.debugLine="Private CarpetaDestinoFicherosPedidosOKRepsol As";
crepsol._carpetadestinoficherospedidosokrepsol = BA.ObjectToString("\\\\192.168.10.4\\Publico\\PedidosRepsolOnline\\FicherosPedidosOK");__ref.setField("_carpetadestinoficherospedidosokrepsol",crepsol._carpetadestinoficherospedidosokrepsol);
 //BA.debugLineNum = 41;BA.debugLine="Private CarpetaDestinoFicherosPedidosErrorRepsol";
crepsol._carpetadestinoficherospedidoserrorrepsol = BA.ObjectToString("\\\\192.168.10.4\\Publico\\PedidosRepsolOnline\\FicherosPedidosError");__ref.setField("_carpetadestinoficherospedidoserrorrepsol",crepsol._carpetadestinoficherospedidoserrorrepsol);
 //BA.debugLineNum = 43;BA.debugLine="Private Const CuentaEmailRemitenteAvisos As Strin";
crepsol._cuentaemailremitenteavisos = BA.ObjectToString("noreply@proin-pinilla.com");__ref.setField("_cuentaemailremitenteavisos",crepsol._cuentaemailremitenteavisos);
 //BA.debugLineNum = 44;BA.debugLine="Private Const CuentaEmailDestinatarioDev1 As Stri";
crepsol._cuentaemaildestinatariodev1 = BA.ObjectToString("smarquina@proin-pinilla.com");__ref.setField("_cuentaemaildestinatariodev1",crepsol._cuentaemaildestinatariodev1);
 //BA.debugLineNum = 45;BA.debugLine="Private Const CuentaEmailDestinatarioDev2 As Stri";
crepsol._cuentaemaildestinatariodev2 = BA.ObjectToString("fblazquez@proin-pinilla.com");__ref.setField("_cuentaemaildestinatariodev2",crepsol._cuentaemaildestinatariodev2);
 //BA.debugLineNum = 47;BA.debugLine="Private Const CuentaEmailDestinatarioProinPedidos";
crepsol._cuentaemaildestinatarioproinpedidosrepsol = BA.ObjectToString("pedidosrepsol@proin-pinilla.com");__ref.setField("_cuentaemaildestinatarioproinpedidosrepsol",crepsol._cuentaemaildestinatarioproinpedidosrepsol);
 //BA.debugLineNum = 53;BA.debugLine="Type TipoDatosLineaPedidoRepsol (Linea As String,";
;
 //BA.debugLineNum = 61;BA.debugLine="Private btnSelFicheroFTP As B4XView";
crepsol._btnselficheroftp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnselficheroftp",crepsol._btnselficheroftp);
 //BA.debugLineNum = 62;BA.debugLine="Private txtFicheroSeleccionado As B4XView";
crepsol._txtficheroseleccionado = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtficheroseleccionado",crepsol._txtficheroseleccionado);
 //BA.debugLineNum = 63;BA.debugLine="Private btnProcesar As B4XView";
crepsol._btnprocesar = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnprocesar",crepsol._btnprocesar);
 //BA.debugLineNum = 64;BA.debugLine="Private TextAreaDatosProceso As TextArea";
crepsol._textareadatosproceso = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_textareadatosproceso",crepsol._textareadatosproceso);
 //BA.debugLineNum = 65;BA.debugLine="Private btnSelFicheroWindows As B4XView";
crepsol._btnselficherowindows = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnselficherowindows",crepsol._btnselficherowindows);
 //BA.debugLineNum = 67;BA.debugLine="Private DirFicheroProcesar, NombreFicheroProcesar";
crepsol._dirficheroprocesar = RemoteObject.createImmutable("");__ref.setField("_dirficheroprocesar",crepsol._dirficheroprocesar);
crepsol._nombreficheroprocesar = RemoteObject.createImmutable("");__ref.setField("_nombreficheroprocesar",crepsol._nombreficheroprocesar);
 //BA.debugLineNum = 68;BA.debugLine="Private btnCheckFTPInbox As B4XView";
crepsol._btncheckftpinbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btncheckftpinbox",crepsol._btncheckftpinbox);
 //BA.debugLineNum = 69;BA.debugLine="Private btnUploadFile As B4XView";
crepsol._btnuploadfile = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnuploadfile",crepsol._btnuploadfile);
 //BA.debugLineNum = 70;BA.debugLine="Private btnProcesoCompleto As B4XView";
crepsol._btnprocesocompleto = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnprocesocompleto",crepsol._btnprocesocompleto);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "crepsol","creaciontablassqlite", __ref);}
RemoteObject _screartabla = RemoteObject.createImmutable("");
 BA.debugLineNum = 83;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(262144);
 BA.debugLineNum = 92;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblRepsolLineasFicheroPedido")));
 BA.debugLineNum = 93;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE tblRepso";
Debug.ShouldStop(268435456);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE tblRepsolLineasFicheroPedido (Linea TEXT default '', ErrorLongitudLineaCabeceraEstacion TEXT default ''\n"),RemoteObject.createImmutable("	, Sede TEXT default '', CodigoClienteERP TEXT default '', CodigoDireccionEnvioERP TEXT default '', ErrorSede TEXT default ''\n"),RemoteObject.createImmutable("	, CodigoPedido TEXT default '', FechaPedido TEXT default '', ErrorFechaPedido TEXT default ''\n"),RemoteObject.createImmutable("	, NombreEstacion TEXT default '',Calle TEXT default '', CodigoPostal TEXT default '', Poblacion TEXT default '', CodigoProvincia TEXT default '', Telefono TEXT default ''\n"),RemoteObject.createImmutable("	, TipoEstacion TEXT default '', Marca TEXT default '', ErrorMarca TEXT default ''\n"),RemoteObject.createImmutable("	, ErrorLongitudLineaEmpleado TEXT default '', DNI TEXT default '', ErrorDNI TEXT default '', NombreEmpleado TEXT default ''\n"),RemoteObject.createImmutable("	, Cargo TEXT default '', ErrorCargo TEXT default '', Sexo TEXT default '', ErrorSexo TEXT default '',  Embarazo TEXT default '', ErrorEmbarazo TEXT default ''\n"),RemoteObject.createImmutable("	, ErrorLongitudLineaProducto TEXT default '', CodigoPrenda TEXT default '', ErrorCodigoPrenda TEXT default '', CodigoProductoERP TEXT default '', ErrorCodigoProductoERP TEXT default ''\n"),RemoteObject.createImmutable("	, Talla TEXT default '', TallaERP TEXT default '', ErrorTalla TEXT default '', Cantidad INTEGER default 0, ErrorCantidad INTEGER default 0\n"),RemoteObject.createImmutable("	, LineaConError INTEGER default 0, SedePedidoDNIConError INTEGER default 0\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 104;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 106;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblRepsolMapeoCodigosPrendaEESS")));
 BA.debugLineNum = 107;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(1024);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblRepsolMapeoCodigosPrendaEESS] (\n"),RemoteObject.createImmutable("	[CodigoPrenda] TEXT, [NombreCodigoPrenda] TEXT\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 110;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 112;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblRepsolMapeoArticulosEESS")));
 BA.debugLineNum = 113;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(65536);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblRepsolMapeoArticulosEESS] (\n"),RemoteObject.createImmutable("	[IDLinea] INTEGER, [Marca] TEXT, [Cargo] TEXT, [Sexo] TEXT, [CodigoPrenda] TEXT, [CodigoArticuloNAV] TEXT, [NombreCodigoPrenda] TEXT\n"),RemoteObject.createImmutable("	, [Combi] TEXT\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 117;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 119;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblRepsolTallasArticulosEESS")));
 BA.debugLineNum = 120;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(8388608);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblRepsolTallasArticulosEESS] (\n"),RemoteObject.createImmutable("	[Articulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 123;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 125;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblRepsolMapeoSedesEESS")));
 BA.debugLineNum = 126;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(536870912);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblRepsolMapeoSedesEESS] (\n"),RemoteObject.createImmutable("	[Sede] TEXT default '',  [CodigoClienteNAV] TEXT default '', [CodigoDireccionEnvioNAV] TEXT default ''\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 129;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 131;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblRepsolTarifaVentaGRP07506")));
 BA.debugLineNum = 132;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(8);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblRepsolTarifaVentaGRP07506] ([TipoTarifa] INTEGER, [CodigoTarifa] TEXT\n"),RemoteObject.createImmutable("	, [Articulo] TEXT, [DescripcionArticulo] TEXT, [Variante] TEXT, [Moneda] TEXT, [UM] TEXT, [CantidadMinima] REAL, [PrecioUnitario] REAL, [FechaInicial] INTEGER, [FechaFinal] INTEGER\n"),RemoteObject.createImmutable("	, [NumTarifa] INTEGER, [UMVenta] TEXT, [FechaCreacion] INTEGER, [CosteUnitario] REAL, [CosteSTD] REAL, [FechaCosteSTD] INTEGER, [GRC] TEXT, [CompraFab] INTEGER\n"),RemoteObject.createImmutable("	, [CosteRazonable] REAL, [FechaCosteRazonable] INTEGER, [Ruta] TEXT, [NombreRuta] TEXT, [LM] TEXT\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 137;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 143;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
Debug.ShouldStop(16384);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblRepsolErroresSedePedidoDNIFicheroPedido")));
 BA.debugLineNum = 144;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(32768);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblRepsolErroresSedePedidoDNIFicheroPedido] (\n"),RemoteObject.createImmutable("	[Sede] TEXT, [PedidoSede] TEXT, [DNI] TEXT, [Errores] TEXT\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 147;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(262144);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _descargarficherodesdecarpetaftp(RemoteObject __ref,RemoteObject _rutafichero,RemoteObject _carpetadestino,RemoteObject _nombreficherodestino) throws Exception{
try {
		Debug.PushSubsStack("DescargarFicheroDesdeCarpetaFTP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,544);
if (RapidSub.canDelegate("descargarficherodesdecarpetaftp")) { return __ref.runUserSub(false, "crepsol","descargarficherodesdecarpetaftp", __ref, _rutafichero, _carpetadestino, _nombreficherodestino);}
ResumableSub_DescargarFicheroDesdeCarpetaFTP rsub = new ResumableSub_DescargarFicheroDesdeCarpetaFTP(null,__ref,_rutafichero,_carpetadestino,_nombreficherodestino);
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
public static class ResumableSub_DescargarFicheroDesdeCarpetaFTP extends BA.ResumableSub {
public ResumableSub_DescargarFicheroDesdeCarpetaFTP(b4j.docU.crepsol parent,RemoteObject __ref,RemoteObject _rutafichero,RemoteObject _carpetadestino,RemoteObject _nombreficherodestino) {
this.parent = parent;
this.__ref = __ref;
this._rutafichero = _rutafichero;
this._carpetadestino = _carpetadestino;
this._nombreficherodestino = _nombreficherodestino;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _rutafichero;
RemoteObject _carpetadestino;
RemoteObject _nombreficherodestino;
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DescargarFicheroDesdeCarpetaFTP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,544);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("RutaFichero", _rutafichero);
Debug.locals.put("CarpetaDestino", _carpetadestino);
Debug.locals.put("NombreFicheroDestino", _nombreficherodestino);
 BA.debugLineNum = 545;BA.debugLine="sFtpRepsol.DownloadFile(RutaFichero, CarpetaDesti";
Debug.ShouldStop(1);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("DownloadFile",__ref.getField(false, "ba"),(Object)(_rutafichero),(Object)(_carpetadestino),(Object)(_nombreficherodestino));
 BA.debugLineNum = 546;BA.debugLine="Wait For sFtpRepsol_DownloadCompleted (ServerPath";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","sftprepsol_downloadcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "descargarficherodesdecarpetaftp"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 553;BA.debugLine="Return Success";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 554;BA.debugLine="End Sub";
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
public static void  _sftprepsol_downloadcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static RemoteObject  _enviaremailaviso(RemoteObject __ref,RemoteObject _solodev,RemoteObject _asunto,RemoteObject _body) throws Exception{
try {
		Debug.PushSubsStack("EnviarEmailAviso (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,5399);
if (RapidSub.canDelegate("enviaremailaviso")) { return __ref.runUserSub(false, "crepsol","enviaremailaviso", __ref, _solodev, _asunto, _body);}
ResumableSub_EnviarEmailAviso rsub = new ResumableSub_EnviarEmailAviso(null,__ref,_solodev,_asunto,_body);
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
public static class ResumableSub_EnviarEmailAviso extends BA.ResumableSub {
public ResumableSub_EnviarEmailAviso(b4j.docU.crepsol parent,RemoteObject __ref,RemoteObject _solodev,RemoteObject _asunto,RemoteObject _body) {
this.parent = parent;
this.__ref = __ref;
this._solodev = _solodev;
this._asunto = _asunto;
this._body = _body;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _solodev;
RemoteObject _asunto;
RemoteObject _body;
RemoteObject _destinatarios = RemoteObject.createImmutable("");
RemoteObject _destinatarioscc = RemoteObject.createImmutable("");
RemoteObject _destinatarioscco = RemoteObject.createImmutable("");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnviarEmailAviso (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,5399);
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
Debug.locals.put("SoloDev", _solodev);
Debug.locals.put("Asunto", _asunto);
Debug.locals.put("Body", _body);
 BA.debugLineNum = 5400;BA.debugLine="Body=Body & $\"  No respondas a este correo. Ha si";
Debug.ShouldStop(8388608);
_body = RemoteObject.concat(_body,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("No respondas a este correo. Ha sido generado por un proceso automático.\n"),RemoteObject.createImmutable(""))));Debug.locals.put("Body", _body);
 BA.debugLineNum = 5404;BA.debugLine="Body=Body.Replace(CRLF,\"<br>\")";
Debug.ShouldStop(134217728);
_body = _body.runMethod(true,"replace",(Object)(parent.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("<br>")));Debug.locals.put("Body", _body);
 BA.debugLineNum = 5405;BA.debugLine="Dim Destinatarios As String";
Debug.ShouldStop(268435456);
_destinatarios = RemoteObject.createImmutable("");Debug.locals.put("Destinatarios", _destinatarios);
 BA.debugLineNum = 5406;BA.debugLine="Dim DestinatariosCC As String";
Debug.ShouldStop(536870912);
_destinatarioscc = RemoteObject.createImmutable("");Debug.locals.put("DestinatariosCC", _destinatarioscc);
 BA.debugLineNum = 5407;BA.debugLine="Dim DestinatariosCCO As String";
Debug.ShouldStop(1073741824);
_destinatarioscco = RemoteObject.createImmutable("");Debug.locals.put("DestinatariosCCO", _destinatarioscco);
 BA.debugLineNum = 5408;BA.debugLine="If SoloDev Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 6;
if (_solodev.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 5410;BA.debugLine="Destinatarios=$\"${CuentaEmailDestinatarioDev1}\"$";
Debug.ShouldStop(2);
_destinatarios = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_cuentaemaildestinatariodev1" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("Destinatarios", _destinatarios);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 5412;BA.debugLine="Destinatarios=$\"${CuentaEmailDestinatarioProinPe";
Debug.ShouldStop(8);
_destinatarios = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_cuentaemaildestinatarioproinpedidosrepsol" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("Destinatarios", _destinatarios);
 BA.debugLineNum = 5414;BA.debugLine="DestinatariosCC=$\"${CuentaEmailDestinatarioDev1}";
Debug.ShouldStop(32);
_destinatarioscc = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_cuentaemaildestinatariodev1" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("DestinatariosCC", _destinatarioscc);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 5416;BA.debugLine="Wait For(Utilidades.EnviarMensajeHttpPA(CuentaEma";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "enviaremailaviso"), parent._utilidades.runMethod(false,"_enviarmensajehttppa" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_cuentaemailremitenteavisos" /*RemoteObject*/ )),(Object)(_destinatarios),(Object)(_destinatarioscc),(Object)(_destinatarioscco),(Object)(_asunto),(Object)(_body)));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 5417;BA.debugLine="Return sResp";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_sresp));return;};
 BA.debugLineNum = 5418;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "crepsol","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 275;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 276;BA.debugLine="EventData.Consume";
Debug.ShouldStop(524288);
_eventdata.runVoidMethod ("Consume");
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
public static RemoteObject  _generarcsvseparadorcomasquotes(RemoteObject __ref,RemoteObject _lsttabla,RemoteObject _separatorchar,RemoteObject _lstencabezados) throws Exception{
try {
		Debug.PushSubsStack("GenerarCSVSeparadorComasQuotes (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,4488);
if (RapidSub.canDelegate("generarcsvseparadorcomasquotes")) { return __ref.runUserSub(false, "crepsol","generarcsvseparadorcomasquotes", __ref, _lsttabla, _separatorchar, _lstencabezados);}
RemoteObject _eol = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _sh = RemoteObject.createImmutable("");
RemoteObject _wrap = RemoteObject.createImmutable(false);
RemoteObject _word = RemoteObject.createImmutable("");
RemoteObject _row = null;
int _i = 0;
Debug.locals.put("lstTabla", _lsttabla);
Debug.locals.put("SeparatorChar", _separatorchar);
Debug.locals.put("lstEncabezados", _lstencabezados);
 BA.debugLineNum = 4488;BA.debugLine="Public Sub GenerarCSVSeparadorComasQuotes (lstTabl";
Debug.ShouldStop(128);
 BA.debugLineNum = 4489;BA.debugLine="Dim eol As String = Chr(10)";
Debug.ShouldStop(256);
_eol = BA.ObjectToString(crepsol.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("eol", _eol);Debug.locals.put("eol", _eol);
 BA.debugLineNum = 4490;BA.debugLine="If lstTabla.Size = 0 Then Return \"\"";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_lsttabla.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 4491;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1024);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 4492;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 4494;BA.debugLine="For Each sH As String In lstEncabezados";
Debug.ShouldStop(8192);
{
final RemoteObject group5 = _lstencabezados;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_sh = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("sH", _sh);
Debug.locals.put("sH", _sh);
 BA.debugLineNum = 4495;BA.debugLine="Dim Wrap As Boolean";
Debug.ShouldStop(16384);
_wrap = RemoteObject.createImmutable(false);Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 4496;BA.debugLine="Dim word As String=sH";
Debug.ShouldStop(32768);
_word = _sh;Debug.locals.put("word", _word);Debug.locals.put("word", _word);
 BA.debugLineNum = 4497;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = True";
Debug.ShouldStop(65536);
if (_word.runMethod(true,"contains",(Object)(_separatorchar)).<Boolean>get().booleanValue()) { 
_wrap = crepsol.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);};
 BA.debugLineNum = 4498;BA.debugLine="If word.Contains(QUOTE) Then";
Debug.ShouldStop(131072);
if (_word.runMethod(true,"contains",(Object)(crepsol.__c.getField(true,"QUOTE"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4499;BA.debugLine="Wrap = True";
Debug.ShouldStop(262144);
_wrap = crepsol.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 4500;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
Debug.ShouldStop(524288);
_word = _word.runMethod(true,"replace",(Object)(crepsol.__c.getField(true,"QUOTE")),(Object)((RemoteObject.createImmutable("\"\""))));Debug.locals.put("word", _word);
 };
 BA.debugLineNum = 4502;BA.debugLine="If Wrap Then";
Debug.ShouldStop(2097152);
if (_wrap.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4503;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
Debug.ShouldStop(4194304);
_sb.runMethod(false,"Append",(Object)(crepsol.__c.getField(true,"QUOTE"))).runMethod(false,"Append",(Object)(_word)).runVoidMethod ("Append",(Object)(crepsol.__c.getField(true,"QUOTE")));
 }else {
 BA.debugLineNum = 4506;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)  '";
Debug.ShouldStop(33554432);
_sb.runMethod(false,"Append",(Object)(crepsol.__c.getField(true,"QUOTE"))).runMethod(false,"Append",(Object)(_word)).runVoidMethod ("Append",(Object)(crepsol.__c.getField(true,"QUOTE")));
 };
 BA.debugLineNum = 4508;BA.debugLine="sb.Append(SeparatorChar)";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Append",(Object)(_separatorchar));
 }
}Debug.locals.put("sH", _sh);
;
 BA.debugLineNum = 4510;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 4511;BA.debugLine="sb.Append(eol)";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(_eol));
 BA.debugLineNum = 4513;BA.debugLine="For Each row() As String In lstTabla";
Debug.ShouldStop(1);
{
final RemoteObject group22 = _lsttabla;
final int groupLen22 = group22.runMethod(true,"getSize").<Integer>get()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_row = (group22.runMethod(false,"Get",index22));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 4514;BA.debugLine="For i = 0 To row.Length - 1";
Debug.ShouldStop(2);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_row.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4515;BA.debugLine="Dim Wrap As Boolean";
Debug.ShouldStop(4);
_wrap = RemoteObject.createImmutable(false);Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 4516;BA.debugLine="Dim word As String = row(i)";
Debug.ShouldStop(8);
_word = _row.getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("word", _word);Debug.locals.put("word", _word);
 BA.debugLineNum = 4517;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
Debug.ShouldStop(16);
if (_word.runMethod(true,"contains",(Object)(_separatorchar)).<Boolean>get().booleanValue()) { 
_wrap = crepsol.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);};
 BA.debugLineNum = 4518;BA.debugLine="If word.Contains(QUOTE) Then";
Debug.ShouldStop(32);
if (_word.runMethod(true,"contains",(Object)(crepsol.__c.getField(true,"QUOTE"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4519;BA.debugLine="Wrap = True";
Debug.ShouldStop(64);
_wrap = crepsol.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 4520;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
Debug.ShouldStop(128);
_word = _word.runMethod(true,"replace",(Object)(crepsol.__c.getField(true,"QUOTE")),(Object)((RemoteObject.createImmutable("\"\""))));Debug.locals.put("word", _word);
 };
 BA.debugLineNum = 4522;BA.debugLine="If Wrap Then";
Debug.ShouldStop(512);
if (_wrap.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4523;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
Debug.ShouldStop(1024);
_sb.runMethod(false,"Append",(Object)(crepsol.__c.getField(true,"QUOTE"))).runMethod(false,"Append",(Object)(_word)).runVoidMethod ("Append",(Object)(crepsol.__c.getField(true,"QUOTE")));
 }else {
 BA.debugLineNum = 4526;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)  '";
Debug.ShouldStop(8192);
_sb.runMethod(false,"Append",(Object)(crepsol.__c.getField(true,"QUOTE"))).runMethod(false,"Append",(Object)(_word)).runVoidMethod ("Append",(Object)(crepsol.__c.getField(true,"QUOTE")));
 };
 BA.debugLineNum = 4528;BA.debugLine="sb.Append(SeparatorChar)";
Debug.ShouldStop(32768);
_sb.runVoidMethod ("Append",(Object)(_separatorchar));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4530;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 4531;BA.debugLine="sb.Append(eol)";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(_eol));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 4533;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_eol.runMethod(true,"length")}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 4534;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(2097152);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 4535;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generatestring(RemoteObject __ref,RemoteObject _table,RemoteObject _separatorchar) throws Exception{
try {
		Debug.PushSubsStack("GenerateString (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,4460);
if (RapidSub.canDelegate("generatestring")) { return __ref.runUserSub(false, "crepsol","generatestring", __ref, _table, _separatorchar);}
RemoteObject _eol = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _row = null;
int _i = 0;
RemoteObject _wrap = RemoteObject.createImmutable(false);
RemoteObject _word = RemoteObject.createImmutable("");
Debug.locals.put("Table", _table);
Debug.locals.put("SeparatorChar", _separatorchar);
 BA.debugLineNum = 4460;BA.debugLine="Public Sub GenerateString (Table As List, Separato";
Debug.ShouldStop(2048);
 BA.debugLineNum = 4461;BA.debugLine="Dim eol As String = Chr(10)";
Debug.ShouldStop(4096);
_eol = BA.ObjectToString(crepsol.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("eol", _eol);Debug.locals.put("eol", _eol);
 BA.debugLineNum = 4462;BA.debugLine="If Table.Size = 0 Then Return \"\"";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_table.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 4463;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16384);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 4464;BA.debugLine="sb.Initialize";
Debug.ShouldStop(32768);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 4465;BA.debugLine="For Each row() As String In Table";
Debug.ShouldStop(65536);
{
final RemoteObject group5 = _table;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = (group5.runMethod(false,"Get",index5));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 4466;BA.debugLine="For i = 0 To row.Length - 1";
Debug.ShouldStop(131072);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_row.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 4467;BA.debugLine="Dim Wrap As Boolean";
Debug.ShouldStop(262144);
_wrap = RemoteObject.createImmutable(false);Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 4468;BA.debugLine="Dim word As String = row(i)";
Debug.ShouldStop(524288);
_word = _row.getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("word", _word);Debug.locals.put("word", _word);
 BA.debugLineNum = 4469;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
Debug.ShouldStop(1048576);
if (_word.runMethod(true,"contains",(Object)(_separatorchar)).<Boolean>get().booleanValue()) { 
_wrap = crepsol.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);};
 BA.debugLineNum = 4470;BA.debugLine="If word.Contains(QUOTE) Then";
Debug.ShouldStop(2097152);
if (_word.runMethod(true,"contains",(Object)(crepsol.__c.getField(true,"QUOTE"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4471;BA.debugLine="Wrap = True";
Debug.ShouldStop(4194304);
_wrap = crepsol.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 4472;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
Debug.ShouldStop(8388608);
_word = _word.runMethod(true,"replace",(Object)(crepsol.__c.getField(true,"QUOTE")),(Object)((RemoteObject.createImmutable("\"\""))));Debug.locals.put("word", _word);
 };
 BA.debugLineNum = 4474;BA.debugLine="If Wrap Then";
Debug.ShouldStop(33554432);
if (_wrap.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 4475;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
Debug.ShouldStop(67108864);
_sb.runMethod(false,"Append",(Object)(crepsol.__c.getField(true,"QUOTE"))).runMethod(false,"Append",(Object)(_word)).runVoidMethod ("Append",(Object)(crepsol.__c.getField(true,"QUOTE")));
 }else {
 BA.debugLineNum = 4477;BA.debugLine="sb.Append(word)";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(_word));
 };
 BA.debugLineNum = 4479;BA.debugLine="sb.Append(SeparatorChar)";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(_separatorchar));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 4481;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 4482;BA.debugLine="sb.Append(eol)";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Append",(Object)(_eol));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 4484;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_eol.runMethod(true,"length")}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 4485;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(16);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 4486;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getletradni(RemoteObject __ref,RemoteObject _dni) throws Exception{
try {
		Debug.PushSubsStack("getLetraDNI (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,1366);
if (RapidSub.canDelegate("getletradni")) { return __ref.runUserSub(false, "crepsol","getletradni", __ref, _dni);}
RemoteObject _primeraletra = RemoteObject.createImmutable("");
RemoteObject _letras = RemoteObject.createImmutable("");
RemoteObject _character = RemoteObject.createImmutable(0);
Debug.locals.put("dni", _dni);
 BA.debugLineNum = 1366;BA.debugLine="Sub getLetraDNI(dni As String) As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1367;BA.debugLine="If dni.Length<>8 Then Return \"\" 'longitud incorre";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",_dni.runMethod(true,"length"),BA.numberCast(double.class, 8))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 1368;BA.debugLine="dni = dni.ToUpperCase";
Debug.ShouldStop(8388608);
_dni = _dni.runMethod(true,"toUpperCase");Debug.locals.put("dni", _dni);
 BA.debugLineNum = 1370;BA.debugLine="Dim primeraletra As String = dni.SubString2(0,1)";
Debug.ShouldStop(33554432);
_primeraletra = _dni.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("primeraletra", _primeraletra);Debug.locals.put("primeraletra", _primeraletra);
 BA.debugLineNum = 1371;BA.debugLine="Select Case primeraletra";
Debug.ShouldStop(67108864);
switch (BA.switchObjectToInt(_primeraletra,BA.ObjectToString("X"),BA.ObjectToString("Y"),BA.ObjectToString("Z"))) {
case 0: {
 BA.debugLineNum = 1373;BA.debugLine="dni = dni.Replace(\"X\",\"0\")";
Debug.ShouldStop(268435456);
_dni = _dni.runMethod(true,"replace",(Object)(BA.ObjectToString("X")),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("dni", _dni);
 break; }
case 1: {
 BA.debugLineNum = 1375;BA.debugLine="dni = dni.Replace(\"Y\",\"1\")";
Debug.ShouldStop(1073741824);
_dni = _dni.runMethod(true,"replace",(Object)(BA.ObjectToString("Y")),(Object)(RemoteObject.createImmutable("1")));Debug.locals.put("dni", _dni);
 break; }
case 2: {
 BA.debugLineNum = 1377;BA.debugLine="dni = dni.Replace(\"Z\",\"2\")";
Debug.ShouldStop(1);
_dni = _dni.runMethod(true,"replace",(Object)(BA.ObjectToString("Z")),(Object)(RemoteObject.createImmutable("2")));Debug.locals.put("dni", _dni);
 break; }
}
;
 BA.debugLineNum = 1379;BA.debugLine="Dim letras As String = \"TRWAGMYFPDXBNJZSQVHLCKE\"";
Debug.ShouldStop(4);
_letras = BA.ObjectToString("TRWAGMYFPDXBNJZSQVHLCKE");Debug.locals.put("letras", _letras);Debug.locals.put("letras", _letras);
 BA.debugLineNum = 1380;BA.debugLine="Dim character As Int";
Debug.ShouldStop(8);
_character = RemoteObject.createImmutable(0);Debug.locals.put("character", _character);
 BA.debugLineNum = 1381;BA.debugLine="character = (1 + (dni) Mod 23)";
Debug.ShouldStop(16);
_character = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),BA.numberCast(double.class, (_dni)),RemoteObject.createImmutable(23)}, "+%",1, 0)));Debug.locals.put("character", _character);
 BA.debugLineNum = 1382;BA.debugLine="Return letras.SubString2 ((character-1), (charact";
Debug.ShouldStop(32);
if (true) return _letras.runMethod(true,"substring",(Object)((RemoteObject.solve(new RemoteObject[] {_character,RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_character,RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 1383;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inicializaciondatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InicializacionDatos (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,5300);
if (RapidSub.canDelegate("inicializaciondatos")) { return __ref.runUserSub(false, "crepsol","inicializaciondatos", __ref);}
ResumableSub_InicializacionDatos rsub = new ResumableSub_InicializacionDatos(null,__ref);
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
public static class ResumableSub_InicializacionDatos extends BA.ResumableSub {
public ResumableSub_InicializacionDatos(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _respuestajrdc = RemoteObject.declareNull("b4j.docU.main._tiporespuestajrdc");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _mdataconn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InicializacionDatos (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,5300);
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
 BA.debugLineNum = 5302;BA.debugLine="mCodigoNAVGRPRepsolEESS=\"07506\"";
Debug.ShouldStop(2097152);
__ref.setField ("_mcodigonavgrprepsoleess" /*RemoteObject*/ ,BA.ObjectToString("07506"));
 BA.debugLineNum = 5304;BA.debugLine="Dim RespuestaJRDC As TipoRespuestaJRDC";
Debug.ShouldStop(8388608);
_respuestajrdc = RemoteObject.createNew ("b4j.docU.main._tiporespuestajrdc");Debug.locals.put("RespuestaJRDC", _respuestajrdc);
 BA.debugLineNum = 5305;BA.debugLine="RespuestaJRDC.Initialize";
Debug.ShouldStop(16777216);
_respuestajrdc.runVoidMethod ("Initialize");
 BA.debugLineNum = 5311;BA.debugLine="wait for(CargaDireccionesEnvioRepsolEESSGRP) comp";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "inicializaciondatos"), __ref.runClassMethod (b4j.docU.crepsol.class, "_cargadireccionesenviorepsoleessgrp" /*RemoteObject*/ ));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 5312;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 5313;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 5316;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
Debug.ShouldStop(8);
_error = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 5317;BA.debugLine="RespuestaJRDC.Accion=Accion";
Debug.ShouldStop(16);
_respuestajrdc.setField ("Accion" /*RemoteObject*/ ,_accion);
 BA.debugLineNum = 5318;BA.debugLine="RespuestaJRDC.Error=Error";
Debug.ShouldStop(32);
_respuestajrdc.setField ("Error" /*RemoteObject*/ ,_error);
 BA.debugLineNum = 5319;BA.debugLine="Return RespuestaJRDC";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_respuestajrdc));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 5322;BA.debugLine="wait for(CargaTarifaVentaValidaActualGRPRepsolEES";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "inicializaciondatos"), __ref.runClassMethod (b4j.docU.crepsol.class, "_cargatarifaventavalidaactualgrprepsoleess" /*RemoteObject*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 5323;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 5324;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 5328;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
Debug.ShouldStop(32768);
_error = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 5329;BA.debugLine="RespuestaJRDC.Accion=Accion";
Debug.ShouldStop(65536);
_respuestajrdc.setField ("Accion" /*RemoteObject*/ ,_accion);
 BA.debugLineNum = 5330;BA.debugLine="RespuestaJRDC.Error=Error";
Debug.ShouldStop(131072);
_respuestajrdc.setField ("Error" /*RemoteObject*/ ,_error);
 BA.debugLineNum = 5331;BA.debugLine="Return RespuestaJRDC";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_respuestajrdc));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 5336;BA.debugLine="wait for(CargaMapeoCodigosPrendaEESS) complete (m";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "inicializaciondatos"), __ref.runClassMethod (b4j.docU.crepsol.class, "_cargamapeocodigosprendaeess" /*RemoteObject*/ ));
this.state = 27;
return;
case 27:
//C
this.state = 9;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 5337;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 5338;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 5342;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
Debug.ShouldStop(536870912);
_error = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 5343;BA.debugLine="RespuestaJRDC.Accion=Accion";
Debug.ShouldStop(1073741824);
_respuestajrdc.setField ("Accion" /*RemoteObject*/ ,_accion);
 BA.debugLineNum = 5344;BA.debugLine="RespuestaJRDC.Error=Error";
Debug.ShouldStop(-2147483648);
_respuestajrdc.setField ("Error" /*RemoteObject*/ ,_error);
 BA.debugLineNum = 5345;BA.debugLine="Return RespuestaJRDC";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_respuestajrdc));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 5348;BA.debugLine="wait for(CargaMapeoArticulosEESS) complete (mRes";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "inicializaciondatos"), __ref.runClassMethod (b4j.docU.crepsol.class, "_cargamapeoarticuloseess" /*RemoteObject*/ ));
this.state = 28;
return;
case 28:
//C
this.state = 13;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 5349;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(16);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 5350;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(32);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 5354;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
Debug.ShouldStop(512);
_error = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 5355;BA.debugLine="RespuestaJRDC.Accion=Accion";
Debug.ShouldStop(1024);
_respuestajrdc.setField ("Accion" /*RemoteObject*/ ,_accion);
 BA.debugLineNum = 5356;BA.debugLine="RespuestaJRDC.Error=Error";
Debug.ShouldStop(2048);
_respuestajrdc.setField ("Error" /*RemoteObject*/ ,_error);
 BA.debugLineNum = 5357;BA.debugLine="Return RespuestaJRDC";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_respuestajrdc));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 5360;BA.debugLine="wait for(CargaTallasArticulosEESS) complete (mRes";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "inicializaciondatos"), __ref.runClassMethod (b4j.docU.crepsol.class, "_cargatallasarticuloseess" /*RemoteObject*/ ));
this.state = 29;
return;
case 29:
//C
this.state = 17;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 5362;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 5363;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(262144);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 5367;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
Debug.ShouldStop(4194304);
_error = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 5368;BA.debugLine="RespuestaJRDC.Accion=Accion";
Debug.ShouldStop(8388608);
_respuestajrdc.setField ("Accion" /*RemoteObject*/ ,_accion);
 BA.debugLineNum = 5369;BA.debugLine="RespuestaJRDC.Error=Error";
Debug.ShouldStop(16777216);
_respuestajrdc.setField ("Error" /*RemoteObject*/ ,_error);
 BA.debugLineNum = 5370;BA.debugLine="Return RespuestaJRDC";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_respuestajrdc));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 5373;BA.debugLine="Wait For(CargaDatosConnSFTP) complete (mRes As Ma";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "inicializaciondatos"), __ref.runClassMethod (b4j.docU.crepsol.class, "_cargadatosconnsftp" /*RemoteObject*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 21;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 5374;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 5375;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 5376;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
Debug.ShouldStop(-2147483648);
_error = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 5377;BA.debugLine="RespuestaJRDC.Accion=Accion";
Debug.ShouldStop(1);
_respuestajrdc.setField ("Accion" /*RemoteObject*/ ,_accion);
 BA.debugLineNum = 5378;BA.debugLine="RespuestaJRDC.Error=Error";
Debug.ShouldStop(2);
_respuestajrdc.setField ("Error" /*RemoteObject*/ ,_error);
 BA.debugLineNum = 5379;BA.debugLine="Return RespuestaJRDC";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_respuestajrdc));return;};
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 5381;BA.debugLine="Dim mDataConn As Map=mRes.Get(\"mDataConn\")";
Debug.ShouldStop(16);
_mdataconn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataconn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mDataConn")))));Debug.locals.put("mDataConn", _mdataconn);Debug.locals.put("mDataConn", _mdataconn);
 BA.debugLineNum = 5382;BA.debugLine="Log(mDataConn)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","835586130",BA.ObjectToString(_mdataconn),0);
 BA.debugLineNum = 5384;BA.debugLine="sFtpRepsol.Initialize(\"sFtpRepsol\", mDataConn.Get";
Debug.ShouldStop(128);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("sFtpRepsol")),(Object)(BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString2")))))),(Object)(BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString3")))))),(Object)(BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString1")))))),(Object)(BA.numberCast(int.class, _mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoInt1")))))));
 BA.debugLineNum = 5385;BA.debugLine="FilesFoldersFtpRepsol=mDataConn.Get(\"CampoString4";
Debug.ShouldStop(256);
__ref.setField ("_filesfoldersftprepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString4"))))));
 BA.debugLineNum = 5386;BA.debugLine="ErrorFilesFoldersFtpRepsol=mDataConn.Get(\"CampoSt";
Debug.ShouldStop(512);
__ref.setField ("_errorfilesfoldersftprepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString5"))))));
 BA.debugLineNum = 5388;BA.debugLine="sFtpRepsol.SetKnownHostsStore(File.DirData(Main.N";
Debug.ShouldStop(2048);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("SetKnownHostsStore",(Object)(parent.__c.getField(false,"File").runMethod(true,"DirData",(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable("aJma.txt")));
 BA.debugLineNum = 5391;BA.debugLine="RespuestaJRDC.Accion=\"OK\"";
Debug.ShouldStop(16384);
_respuestajrdc.setField ("Accion" /*RemoteObject*/ ,BA.ObjectToString("OK"));
 BA.debugLineNum = 5392;BA.debugLine="RespuestaJRDC.Error=\"\"";
Debug.ShouldStop(32768);
_respuestajrdc.setField ("Error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 5393;BA.debugLine="Return RespuestaJRDC";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_respuestajrdc));return;};
 BA.debugLineNum = 5395;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "crepsol","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 74;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(crepsol._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(crepsol.__c.getField(true,"True")));
 BA.debugLineNum = 80;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.crepsol.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _procesarfichero3(RemoteObject __ref,RemoteObject _carpetaficheroorigen,RemoteObject _nombreficheroorigen,RemoteObject _carpetadestinofichero,RemoteObject _nombreficherodestino) throws Exception{
try {
		Debug.PushSubsStack("ProcesarFichero3 (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,3240);
if (RapidSub.canDelegate("procesarfichero3")) { return __ref.runUserSub(false, "crepsol","procesarfichero3", __ref, _carpetaficheroorigen, _nombreficheroorigen, _carpetadestinofichero, _nombreficherodestino);}
ResumableSub_ProcesarFichero3 rsub = new ResumableSub_ProcesarFichero3(null,__ref,_carpetaficheroorigen,_nombreficheroorigen,_carpetadestinofichero,_nombreficherodestino);
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
public static class ResumableSub_ProcesarFichero3 extends BA.ResumableSub {
public ResumableSub_ProcesarFichero3(b4j.docU.crepsol parent,RemoteObject __ref,RemoteObject _carpetaficheroorigen,RemoteObject _nombreficheroorigen,RemoteObject _carpetadestinofichero,RemoteObject _nombreficherodestino) {
this.parent = parent;
this.__ref = __ref;
this._carpetaficheroorigen = _carpetaficheroorigen;
this._nombreficheroorigen = _nombreficheroorigen;
this._carpetadestinofichero = _carpetadestinofichero;
this._nombreficherodestino = _nombreficherodestino;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _carpetaficheroorigen;
RemoteObject _nombreficheroorigen;
RemoteObject _carpetadestinofichero;
RemoteObject _nombreficherodestino;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mdataconn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstlineasfichero = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tr = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
RemoteObject _dniempleadosel = RemoteObject.createImmutable("");
RemoteObject _idxfila = RemoteObject.createImmutable(0);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _slinea = RemoteObject.createImmutable("");
RemoteObject _numcharlinea = RemoteObject.createImmutable(0);
RemoteObject _csvline = null;
RemoteObject _numlinea = RemoteObject.createImmutable("");
RemoteObject _tipolinea = RemoteObject.createImmutable(0);
RemoteObject _lineanumeropedido = RemoteObject.createImmutable("");
RemoteObject _arrlineanumeropedido = null;
RemoteObject _numeropedido = RemoteObject.createImmutable("");
RemoteObject _datoslineapedido = RemoteObject.declareNull("b4j.docU.crepsol._tipodatoslineapedidorepsol");
RemoteObject _idsedeempresa = RemoteObject.createImmutable("");
RemoteObject _numeropedidoestacion = RemoteObject.createImmutable("");
RemoteObject _fechapedido = RemoteObject.createImmutable("");
RemoteObject _fechapedidolong = RemoteObject.createImmutable(0L);
RemoteObject _nombreestacion = RemoteObject.createImmutable("");
RemoteObject _calle = RemoteObject.createImmutable("");
RemoteObject _codigopostal = RemoteObject.createImmutable("");
RemoteObject _poblacion = RemoteObject.createImmutable("");
RemoteObject _codigoprovincia = RemoteObject.createImmutable("");
RemoteObject _telefono = RemoteObject.createImmutable("");
RemoteObject _stipoestacion = RemoteObject.createImmutable("");
RemoteObject _tipoestacion = RemoteObject.createImmutable("");
RemoteObject _marca = RemoteObject.createImmutable("");
RemoteObject _dni = RemoteObject.createImmutable("");
RemoteObject _dniempleadoselok = RemoteObject.createImmutable(false);
RemoteObject _nombreempleado = RemoteObject.createImmutable("");
RemoteObject _scargo = RemoteObject.createImmutable("");
RemoteObject _ssexoempleado = RemoteObject.createImmutable("");
RemoteObject _sembarazoempleado = RemoteObject.createImmutable("");
RemoteObject _codigoprenda = RemoteObject.createImmutable("");
RemoteObject _nummapeocodigoprenda = RemoteObject.createImmutable(0);
RemoteObject _talla = RemoteObject.createImmutable("");
RemoteObject _cantidad = RemoteObject.createImmutable(0);
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _numlineasconerror = RemoteObject.createImmutable(0);
RemoteObject _csverroressubidookftp = RemoteObject.createImmutable(false);
RemoteObject _rssedepedidodni = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _sede = RemoteObject.createImmutable("");
RemoteObject _pedidosede = RemoteObject.createImmutable("");
RemoteObject _errorlongitudlineacabeceraestacion = RemoteObject.createImmutable(false);
RemoteObject _errorsede = RemoteObject.createImmutable(false);
RemoteObject _errorfechapedido = RemoteObject.createImmutable(false);
RemoteObject _errormarca = RemoteObject.createImmutable(false);
RemoteObject _errorlongitudlineaempleado = RemoteObject.createImmutable(false);
RemoteObject _errordni = RemoteObject.createImmutable(false);
RemoteObject _errorcargo = RemoteObject.createImmutable(false);
RemoteObject _errorsexo = RemoteObject.createImmutable(false);
RemoteObject _errorembarazo = RemoteObject.createImmutable(false);
RemoteObject _errorlongitudlineaproducto = RemoteObject.createImmutable(false);
RemoteObject _errorcodigoprenda = RemoteObject.createImmutable(false);
RemoteObject _errorcodigoproductoerp = RemoteObject.createImmutable(false);
RemoteObject _errortalla = RemoteObject.createImmutable(false);
RemoteObject _errorcantidad = RemoteObject.createImmutable(false);
RemoteObject _rslineassedepedidodni = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _sbtextoerror = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _lsterrores = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstencabezadoserrores = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sficheroerrores = RemoteObject.createImmutable("");
RemoteObject _nombreficheroerrores = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rutaftpficheropedidoerrores = RemoteObject.createImmutable("");
RemoteObject _numlineassinerror = RemoteObject.createImmutable(0);
RemoteObject _csvsficherospedidosok = RemoteObject.createImmutable(false);
RemoteObject _numpedidosincluidosenfichero = RemoteObject.createImmutable(0);
RemoteObject _numficherospedidoscsvcreadosenservidor = RemoteObject.createImmutable(0);
RemoteObject _lstheaders = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _carpetaficherocsv = RemoteObject.createImmutable("");
RemoteObject _rscabecerapedidoslineassinerror = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _uuidpedido = RemoteObject.createImmutable("");
RemoteObject _idpedido = RemoteObject.createImmutable("");
RemoteObject _nombreficherocsv = RemoteObject.createImmutable("");
RemoteObject _lstlineaspedidoventa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _codigoclientenav = RemoteObject.createImmutable("");
RemoteObject _codigodireccionenvionav = RemoteObject.createImmutable("");
RemoteObject _codigopedido = RemoteObject.createImmutable("");
RemoteObject _documentoexterno = RemoteObject.createImmutable("");
RemoteObject _fechapedidocliente = RemoteObject.createImmutable("");
RemoteObject _fechapedidoclientenav = RemoteObject.createImmutable("");
RemoteObject _rslineaspedido = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _precio = RemoteObject.createImmutable(0);
RemoteObject _arrdatoslineapedido = null;
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _bodyemailinfoproceso = RemoteObject.createImmutable("");
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject group29;
int index29;
int groupLen29;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ProcesarFichero3 (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,3240);
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
Debug.locals.put("_ref", __ref);
Debug.locals.put("CarpetaFicheroOrigen", _carpetaficheroorigen);
Debug.locals.put("NombreFicheroOrigen", _nombreficheroorigen);
Debug.locals.put("CarpetaDestinoFichero", _carpetadestinofichero);
Debug.locals.put("NombreFicheroDestino", _nombreficherodestino);
 BA.debugLineNum = 3242;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando con";
Debug.ShouldStop(512);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando configuración FTP...")));
 BA.debugLineNum = 3243;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 3245;BA.debugLine="Wait For(CargaDatosConnSFTP) complete (mRes As Ma";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero3"), __ref.runClassMethod (b4j.docU.crepsol.class, "_cargadatosconnsftp" /*RemoteObject*/ ));
this.state = 389;
return;
case 389:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 3246;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3247;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 3248;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3249;BA.debugLine="SalirModulo";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.crepsol.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 3250;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3252;BA.debugLine="Dim mDataConn As Map=mRes.Get(\"mDataConn\")";
Debug.ShouldStop(524288);
_mdataconn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataconn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mDataConn")))));Debug.locals.put("mDataConn", _mdataconn);Debug.locals.put("mDataConn", _mdataconn);
 BA.debugLineNum = 3255;BA.debugLine="sFtpRepsol.Initialize(\"sFtpRepsol\", mDataConn.Get";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("sFtpRepsol")),(Object)(BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString2")))))),(Object)(BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString3")))))),(Object)(BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString1")))))),(Object)(BA.numberCast(int.class, _mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoInt1")))))));
 BA.debugLineNum = 3256;BA.debugLine="FilesFoldersFtpRepsol=mDataConn.Get(\"CampoString4";
Debug.ShouldStop(8388608);
__ref.setField ("_filesfoldersftprepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString4"))))));
 BA.debugLineNum = 3257;BA.debugLine="ErrorFilesFoldersFtpRepsol=mDataConn.Get(\"CampoSt";
Debug.ShouldStop(16777216);
__ref.setField ("_errorfilesfoldersftprepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString5"))))));
 BA.debugLineNum = 3259;BA.debugLine="sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder,";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("SetKnownHostsStore",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("aJma.txt")));
 BA.debugLineNum = 3261;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolLineasFic";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblRepsolLineasFicheroPedido")));
 BA.debugLineNum = 3262;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolErroresSe";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblRepsolErroresSedePedidoDNIFicheroPedido")));
 BA.debugLineNum = 3264;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Procesando f";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Procesando fichero...")));
 BA.debugLineNum = 3265;BA.debugLine="jamLoadingIndicator1.IniciarControlTiempoProceso";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_iniciarcontroltiempoproceso" /*RemoteObject*/ );
 BA.debugLineNum = 3266;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 3268;BA.debugLine="Dim lstLineasFichero As List";
Debug.ShouldStop(8);
_lstlineasfichero = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstLineasFichero", _lstlineasfichero);
 BA.debugLineNum = 3269;BA.debugLine="lstLineasFichero.Initialize";
Debug.ShouldStop(16);
_lstlineasfichero.runVoidMethod ("Initialize");
 BA.debugLineNum = 3273;BA.debugLine="Dim tr As TextReader";
Debug.ShouldStop(256);
_tr = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");Debug.locals.put("tr", _tr);
 BA.debugLineNum = 3275;BA.debugLine="tr.Initialize2(File.OpenInput(CarpetaFicheroOrige";
Debug.ShouldStop(1024);
_tr.runVoidMethod ("Initialize2",(Object)((parent.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_carpetaficheroorigen),(Object)(_nombreficheroorigen)).getObject())),(Object)(RemoteObject.createImmutable("UTF-8")));
 BA.debugLineNum = 3276;BA.debugLine="lstLineasFichero=tr.ReadList";
Debug.ShouldStop(2048);
_lstlineasfichero = _tr.runMethod(false,"ReadList");Debug.locals.put("lstLineasFichero", _lstlineasfichero);
 BA.debugLineNum = 3296;BA.debugLine="Dim DNIEmpleadoSel As String";
Debug.ShouldStop(-2147483648);
_dniempleadosel = RemoteObject.createImmutable("");Debug.locals.put("DNIEmpleadoSel", _dniempleadosel);
 BA.debugLineNum = 3336;BA.debugLine="Dim idxFila As Int=1";
Debug.ShouldStop(128);
_idxfila = BA.numberCast(int.class, 1);Debug.locals.put("idxFila", _idxfila);Debug.locals.put("idxFila", _idxfila);
 BA.debugLineNum = 3343;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(16384);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 3344;BA.debugLine="DateTime.DateFormat=\"dd-MM-yyyy\"";
Debug.ShouldStop(32768);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 3346;BA.debugLine="For Each sLinea As String In lstLineasFichero";
Debug.ShouldStop(131072);
if (true) break;

case 5:
//for
this.state = 162;
group29 = _lstlineasfichero;
index29 = 0;
groupLen29 = group29.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("sLinea", _slinea);
this.state = 390;
if (true) break;

case 390:
//C
this.state = 162;
if (index29 < groupLen29) {
this.state = 7;
_slinea = BA.ObjectToString(group29.runMethod(false,"Get",index29));Debug.locals.put("sLinea", _slinea);}
if (true) break;

case 391:
//C
this.state = 390;
index29++;
Debug.locals.put("sLinea", _slinea);
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 3351;BA.debugLine="Dim NumCharLinea As Int=sLinea.Length";
Debug.ShouldStop(4194304);
_numcharlinea = _slinea.runMethod(true,"length");Debug.locals.put("NumCharLinea", _numcharlinea);Debug.locals.put("NumCharLinea", _numcharlinea);
 BA.debugLineNum = 3353;BA.debugLine="Dim csvLine(20) As Object";
Debug.ShouldStop(16777216);
_csvline = RemoteObject.createNewArray ("Object", new int[] {20}, new Object[]{});Debug.locals.put("csvLine", _csvline);
 BA.debugLineNum = 3355;BA.debugLine="If NumCharLinea<6 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("<",_numcharlinea,BA.numberCast(double.class, 6))) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 3361;BA.debugLine="mSQL.AddNonQueryToBatch($\"insert into tblRepsol";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)((RemoteObject.createImmutable("insert into tblRepsolLineasFicheroPedido (IDxFila, LineaConError) values (?,?)"))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_idxfila),RemoteObject.createImmutable((1))})))));
 BA.debugLineNum = 3362;BA.debugLine="Continue";
Debug.ShouldStop(2);
this.state = 391;
if (true) break;;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 3364;BA.debugLine="Dim NumLinea As String=sLinea.SubString2(0,6)";
Debug.ShouldStop(8);
_numlinea = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 6)));Debug.locals.put("NumLinea", _numlinea);Debug.locals.put("NumLinea", _numlinea);
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 3369;BA.debugLine="csvLine(0)=NumLinea";
Debug.ShouldStop(256);
_csvline.setArrayElement ((_numlinea),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3373;BA.debugLine="Dim TipoLinea As Int=sLinea.SubString2(6,7)";
Debug.ShouldStop(4096);
_tipolinea = BA.numberCast(int.class, _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 6)),(Object)(BA.numberCast(int.class, 7))));Debug.locals.put("TipoLinea", _tipolinea);Debug.locals.put("TipoLinea", _tipolinea);
 BA.debugLineNum = 3374;BA.debugLine="csvLine(2)=TipoLinea";
Debug.ShouldStop(8192);
_csvline.setArrayElement ((_tipolinea),BA.numberCast(int.class, 2));
 BA.debugLineNum = 3376;BA.debugLine="Select Case TipoLinea";
Debug.ShouldStop(32768);
if (true) break;

case 14:
//select
this.state = 161;
switch (BA.switchObjectToInt(_tipolinea,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 9))) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 41;
if (true) break;
}
case 3: {
this.state = 75;
if (true) break;
}
case 4: {
this.state = 158;
if (true) break;
}
default: {
this.state = 160;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 161;
 BA.debugLineNum = 3383;BA.debugLine="Dim LineaNumeroPedido As String=sLinea.SubStri";
Debug.ShouldStop(4194304);
_lineanumeropedido = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 7)));Debug.locals.put("LineaNumeroPedido", _lineanumeropedido);Debug.locals.put("LineaNumeroPedido", _lineanumeropedido);
 BA.debugLineNum = 3384;BA.debugLine="Dim ArrLineaNumeroPedido() As String=Regex.Spl";
Debug.ShouldStop(8388608);
_arrlineanumeropedido = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(".TXT")),(Object)(_lineanumeropedido));Debug.locals.put("ArrLineaNumeroPedido", _arrlineanumeropedido);Debug.locals.put("ArrLineaNumeroPedido", _arrlineanumeropedido);
 BA.debugLineNum = 3385;BA.debugLine="Dim NumeroPedido As String=ArrLineaNumeroPedid";
Debug.ShouldStop(16777216);
_numeropedido = _arrlineanumeropedido.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("NumeroPedido", _numeropedido);Debug.locals.put("NumeroPedido", _numeropedido);
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 3388;BA.debugLine="Dim DatosLineaPedido As TipoDatosLineaPedidoRe";
Debug.ShouldStop(134217728);
_datoslineapedido = RemoteObject.createNew ("b4j.docU.crepsol._tipodatoslineapedidorepsol");Debug.locals.put("DatosLineaPedido", _datoslineapedido);
 BA.debugLineNum = 3389;BA.debugLine="DatosLineaPedido.Initialize";
Debug.ShouldStop(268435456);
_datoslineapedido.runVoidMethod ("Initialize");
 BA.debugLineNum = 3390;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
Debug.ShouldStop(536870912);
_datoslineapedido.setField ("Linea" /*RemoteObject*/ ,_numlinea);
 BA.debugLineNum = 3393;BA.debugLine="If NumCharLinea<>236 Then";
Debug.ShouldStop(1);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("!",_numcharlinea,BA.numberCast(double.class, 236))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 3396;BA.debugLine="DatosLineaPedido.ErrorLongitudLineaCabeceraEs";
Debug.ShouldStop(8);
_datoslineapedido.setField ("ErrorLongitudLineaCabeceraEstacion" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 3411;BA.debugLine="Dim IDSedeEmpresa As String=sLinea.SubString2";
Debug.ShouldStop(262144);
_idsedeempresa = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 15)));Debug.locals.put("IDSedeEmpresa", _idsedeempresa);Debug.locals.put("IDSedeEmpresa", _idsedeempresa);
 BA.debugLineNum = 3412;BA.debugLine="DatosLineaPedido.Sede=IDSedeEmpresa";
Debug.ShouldStop(524288);
_datoslineapedido.setField ("Sede" /*RemoteObject*/ ,_idsedeempresa);
 BA.debugLineNum = 3413;BA.debugLine="DatosLineaPedido.CodigoClienteERP=Utilidades.";
Debug.ShouldStop(1048576);
_datoslineapedido.setField ("CodigoClienteERP" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select CodigoClienteNAV from tblRepsolMapeoSedesEESS where Sede=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_datoslineapedido.getField(true,"Sede" /*RemoteObject*/ ))})))))))));
 BA.debugLineNum = 3414;BA.debugLine="DatosLineaPedido.ErrorSede=IIf(DatosLineaPedi";
Debug.ShouldStop(2097152);
_datoslineapedido.setField ("ErrorSede" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"CodigoClienteERP" /*RemoteObject*/ ),BA.ObjectToString(""))) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 3415;BA.debugLine="DatosLineaPedido.CodigoDireccionEnvioERP=Util";
Debug.ShouldStop(4194304);
_datoslineapedido.setField ("CodigoDireccionEnvioERP" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select CodigoDireccionEnvioNAV from tblRepsolMapeoSedesEESS where Sede=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_datoslineapedido.getField(true,"Sede" /*RemoteObject*/ ))})))))))));
 BA.debugLineNum = 3416;BA.debugLine="DatosLineaPedido.ErrorSede=IIf(DatosLineaPedi";
Debug.ShouldStop(8388608);
_datoslineapedido.setField ("ErrorSede" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"CodigoDireccionEnvioERP" /*RemoteObject*/ ),BA.ObjectToString(""))) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 3438;BA.debugLine="Dim NumeroPedidoEstacion As String=sLinea.Sub";
Debug.ShouldStop(8192);
_numeropedidoestacion = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 15)),(Object)(BA.numberCast(int.class, 19)));Debug.locals.put("NumeroPedidoEstacion", _numeropedidoestacion);Debug.locals.put("NumeroPedidoEstacion", _numeropedidoestacion);
 BA.debugLineNum = 3439;BA.debugLine="DatosLineaPedido.CodigoPedido=NumeroPedidoEst";
Debug.ShouldStop(16384);
_datoslineapedido.setField ("CodigoPedido" /*RemoteObject*/ ,_numeropedidoestacion);
 BA.debugLineNum = 3449;BA.debugLine="Dim FechaPedido As String=sLinea.SubString2(1";
Debug.ShouldStop(16777216);
_fechapedido = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 19)),(Object)(BA.numberCast(int.class, 29)));Debug.locals.put("FechaPedido", _fechapedido);Debug.locals.put("FechaPedido", _fechapedido);
 BA.debugLineNum = 3450;BA.debugLine="Try";
Debug.ShouldStop(33554432);
if (true) break;

case 23:
//try
this.state = 28;
this.catchState = 27;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 28;
this.catchState = 27;
 BA.debugLineNum = 3451;BA.debugLine="Dim FechaPedidoLong As Long=DateTime.DatePar";
Debug.ShouldStop(67108864);
_fechapedidolong = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_fechapedido));Debug.locals.put("FechaPedidoLong", _fechapedidolong);Debug.locals.put("FechaPedidoLong", _fechapedidolong);
 BA.debugLineNum = 3452;BA.debugLine="DatosLineaPedido.FechaPedido=FechaPedido";
Debug.ShouldStop(134217728);
_datoslineapedido.setField ("FechaPedido" /*RemoteObject*/ ,_fechapedido);
 BA.debugLineNum = 3453;BA.debugLine="DatosLineaPedido.ErrorFechaPedido=0";
Debug.ShouldStop(268435456);
_datoslineapedido.setField ("ErrorFechaPedido" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 Debug.CheckDeviceExceptions();
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
 BA.debugLineNum = 3457;BA.debugLine="DatosLineaPedido.ErrorFechaPedido=1";
Debug.ShouldStop(1);
_datoslineapedido.setField ("ErrorFechaPedido" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 0;
;
 BA.debugLineNum = 3472;BA.debugLine="Dim NombreEstacion As String=sLinea.SubString";
Debug.ShouldStop(32768);
_nombreestacion = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 29)),(Object)(BA.numberCast(int.class, 94)));Debug.locals.put("NombreEstacion", _nombreestacion);Debug.locals.put("NombreEstacion", _nombreestacion);
 BA.debugLineNum = 3473;BA.debugLine="DatosLineaPedido.NombreEstacion=NombreEstacio";
Debug.ShouldStop(65536);
_datoslineapedido.setField ("NombreEstacion" /*RemoteObject*/ ,_nombreestacion);
 BA.debugLineNum = 3483;BA.debugLine="Dim Calle As String=sLinea.SubString2(94,159)";
Debug.ShouldStop(67108864);
_calle = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 94)),(Object)(BA.numberCast(int.class, 159)));Debug.locals.put("Calle", _calle);Debug.locals.put("Calle", _calle);
 BA.debugLineNum = 3484;BA.debugLine="DatosLineaPedido.Calle=Calle";
Debug.ShouldStop(134217728);
_datoslineapedido.setField ("Calle" /*RemoteObject*/ ,_calle);
 BA.debugLineNum = 3494;BA.debugLine="Dim CodigoPostal As String=sLinea.SubString2(";
Debug.ShouldStop(32);
_codigopostal = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 159)),(Object)(BA.numberCast(int.class, 164)));Debug.locals.put("CodigoPostal", _codigopostal);Debug.locals.put("CodigoPostal", _codigopostal);
 BA.debugLineNum = 3495;BA.debugLine="DatosLineaPedido.CodigoPostal=CodigoPostal";
Debug.ShouldStop(64);
_datoslineapedido.setField ("CodigoPostal" /*RemoteObject*/ ,_codigopostal);
 BA.debugLineNum = 3505;BA.debugLine="Dim Poblacion As String=sLinea.SubString2(164";
Debug.ShouldStop(65536);
_poblacion = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 164)),(Object)(BA.numberCast(int.class, 194)));Debug.locals.put("Poblacion", _poblacion);Debug.locals.put("Poblacion", _poblacion);
 BA.debugLineNum = 3506;BA.debugLine="DatosLineaPedido.Poblacion=Poblacion";
Debug.ShouldStop(131072);
_datoslineapedido.setField ("Poblacion" /*RemoteObject*/ ,_poblacion);
 BA.debugLineNum = 3516;BA.debugLine="Dim CodigoProvincia As String=sLinea.SubStrin";
Debug.ShouldStop(134217728);
_codigoprovincia = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 194)),(Object)(BA.numberCast(int.class, 196)));Debug.locals.put("CodigoProvincia", _codigoprovincia);Debug.locals.put("CodigoProvincia", _codigoprovincia);
 BA.debugLineNum = 3517;BA.debugLine="DatosLineaPedido.CodigoProvincia=CodigoProvin";
Debug.ShouldStop(268435456);
_datoslineapedido.setField ("CodigoProvincia" /*RemoteObject*/ ,_codigoprovincia);
 BA.debugLineNum = 3527;BA.debugLine="Dim Telefono As String=sLinea.SubString2(196,";
Debug.ShouldStop(64);
_telefono = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 196)),(Object)(BA.numberCast(int.class, 211)));Debug.locals.put("Telefono", _telefono);Debug.locals.put("Telefono", _telefono);
 BA.debugLineNum = 3528;BA.debugLine="DatosLineaPedido.Telefono=Telefono";
Debug.ShouldStop(128);
_datoslineapedido.setField ("Telefono" /*RemoteObject*/ ,_telefono);
 BA.debugLineNum = 3538;BA.debugLine="Dim sTipoEstacion As String=sLinea.SubString2";
Debug.ShouldStop(131072);
_stipoestacion = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 211)),(Object)(BA.numberCast(int.class, 226)));Debug.locals.put("sTipoEstacion", _stipoestacion);Debug.locals.put("sTipoEstacion", _stipoestacion);
 BA.debugLineNum = 3539;BA.debugLine="Dim TipoEstacion As String=sTipoEstacion";
Debug.ShouldStop(262144);
_tipoestacion = _stipoestacion;Debug.locals.put("TipoEstacion", _tipoestacion);Debug.locals.put("TipoEstacion", _tipoestacion);
 BA.debugLineNum = 3549;BA.debugLine="DatosLineaPedido.TipoEstacion=TipoEstacion";
Debug.ShouldStop(268435456);
_datoslineapedido.setField ("TipoEstacion" /*RemoteObject*/ ,_tipoestacion);
 BA.debugLineNum = 3562;BA.debugLine="Try";
Debug.ShouldStop(512);
if (true) break;

case 29:
//try
this.state = 34;
this.catchState = 33;
this.state = 31;
if (true) break;

case 31:
//C
this.state = 34;
this.catchState = 33;
 BA.debugLineNum = 3563;BA.debugLine="Dim Marca As String=sLinea.SubString2(226,236";
Debug.ShouldStop(1024);
_marca = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 226)),(Object)(BA.numberCast(int.class, 236))).runMethod(true,"trim").runMethod(true,"toUpperCase");Debug.locals.put("Marca", _marca);Debug.locals.put("Marca", _marca);
 Debug.CheckDeviceExceptions();
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
 BA.debugLineNum = 3565;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","835062085",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 3566;BA.debugLine="Dim Marca As String=sLinea.SubString2(226,Num";
Debug.ShouldStop(8192);
_marca = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 226)),(Object)(_numcharlinea)).runMethod(true,"trim").runMethod(true,"toUpperCase");Debug.locals.put("Marca", _marca);Debug.locals.put("Marca", _marca);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 3579;BA.debugLine="If Not(Marca=\"REPSOL\" Or Marca=\"CAMPSA\" Or Ma";
Debug.ShouldStop(67108864);

case 34:
//if
this.state = 39;
this.catchState = 0;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_marca,BA.ObjectToString("REPSOL")) || RemoteObject.solveBoolean("=",_marca,BA.ObjectToString("CAMPSA")) || RemoteObject.solveBoolean("=",_marca,RemoteObject.createImmutable("PETRONOR"))))).<Boolean>get().booleanValue()) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
 BA.debugLineNum = 3580;BA.debugLine="DatosLineaPedido.ErrorMarca=1";
Debug.ShouldStop(134217728);
_datoslineapedido.setField ("ErrorMarca" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 3587;BA.debugLine="DatosLineaPedido.Marca=Marca";
Debug.ShouldStop(4);
_datoslineapedido.setField ("Marca" /*RemoteObject*/ ,_marca);
 if (true) break;

case 39:
//C
this.state = 161;
;
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 3616;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
Debug.ShouldStop(-2147483648);
_datoslineapedido.setField ("Linea" /*RemoteObject*/ ,_numlinea);
 BA.debugLineNum = 3619;BA.debugLine="If NumCharLinea<>141 Then";
Debug.ShouldStop(4);
if (true) break;

case 42:
//if
this.state = 45;
if (RemoteObject.solveBoolean("!",_numcharlinea,BA.numberCast(double.class, 141))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 3621;BA.debugLine="DatosLineaPedido.ErrorLongitudLineaEmpleado=1";
Debug.ShouldStop(16);
_datoslineapedido.setField ("ErrorLongitudLineaEmpleado" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 3626;BA.debugLine="Dim DNI As String=sLinea.SubString2(29,38)   '";
Debug.ShouldStop(512);
_dni = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 29)),(Object)(BA.numberCast(int.class, 38)));Debug.locals.put("DNI", _dni);Debug.locals.put("DNI", _dni);
 BA.debugLineNum = 3630;BA.debugLine="If DNIEmpleadoSel<>DNI Then";
Debug.ShouldStop(8192);
if (true) break;

case 46:
//if
this.state = 73;
if (RemoteObject.solveBoolean("!",_dniempleadosel,_dni)) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 3631;BA.debugLine="DNIEmpleadoSel=DNI";
Debug.ShouldStop(16384);
_dniempleadosel = _dni;Debug.locals.put("DNIEmpleadoSel", _dniempleadosel);
 BA.debugLineNum = 3633;BA.debugLine="DatosLineaPedido.DNI=\"\"";
Debug.ShouldStop(65536);
_datoslineapedido.setField ("DNI" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3634;BA.debugLine="DatosLineaPedido.ErrorDNI=0";
Debug.ShouldStop(131072);
_datoslineapedido.setField ("ErrorDNI" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3635;BA.debugLine="DatosLineaPedido.NombreEmpleado=\"\"";
Debug.ShouldStop(262144);
_datoslineapedido.setField ("NombreEmpleado" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3636;BA.debugLine="DatosLineaPedido.Cargo=\"\"";
Debug.ShouldStop(524288);
_datoslineapedido.setField ("Cargo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3637;BA.debugLine="DatosLineaPedido.ErrorCargo=0";
Debug.ShouldStop(1048576);
_datoslineapedido.setField ("ErrorCargo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3638;BA.debugLine="DatosLineaPedido.Sexo=\"\"";
Debug.ShouldStop(2097152);
_datoslineapedido.setField ("Sexo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3639;BA.debugLine="DatosLineaPedido.errorSexo=0";
Debug.ShouldStop(4194304);
_datoslineapedido.setField ("ErrorSexo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3640;BA.debugLine="DatosLineaPedido.Embarazo=\"\"";
Debug.ShouldStop(8388608);
_datoslineapedido.setField ("Embarazo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3641;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=0";
Debug.ShouldStop(16777216);
_datoslineapedido.setField ("ErrorEmbarazo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3644;BA.debugLine="DatosLineaPedido.CodigoPrenda=\"\"";
Debug.ShouldStop(134217728);
_datoslineapedido.setField ("CodigoPrenda" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3645;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=\"\"";
Debug.ShouldStop(268435456);
_datoslineapedido.setField ("DescripcionCodigoPrenda" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3646;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=0";
Debug.ShouldStop(536870912);
_datoslineapedido.setField ("ErrorCodigoPrenda" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3647;BA.debugLine="DatosLineaPedido.CodigoProductoERP=\"\"";
Debug.ShouldStop(1073741824);
_datoslineapedido.setField ("CodigoProductoERP" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3648;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=0";
Debug.ShouldStop(-2147483648);
_datoslineapedido.setField ("ErrorCodigoProductoERP" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3649;BA.debugLine="DatosLineaPedido.Talla=\"\"";
Debug.ShouldStop(1);
_datoslineapedido.setField ("Talla" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3650;BA.debugLine="DatosLineaPedido.TallaERP=\"\"";
Debug.ShouldStop(2);
_datoslineapedido.setField ("TallaERP" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3651;BA.debugLine="DatosLineaPedido.ErrorTalla=0";
Debug.ShouldStop(4);
_datoslineapedido.setField ("ErrorTalla" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3652;BA.debugLine="DatosLineaPedido.Cantidad=0";
Debug.ShouldStop(8);
_datoslineapedido.setField ("Cantidad" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3653;BA.debugLine="DatosLineaPedido.ErrorCantidad=0";
Debug.ShouldStop(16);
_datoslineapedido.setField ("ErrorCantidad" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3655;BA.debugLine="DatosLineaPedido.DNI=DNIEmpleadoSel";
Debug.ShouldStop(64);
_datoslineapedido.setField ("DNI" /*RemoteObject*/ ,_dniempleadosel);
 BA.debugLineNum = 3656;BA.debugLine="Dim DNIEmpleadoSelOK As Boolean=checkDNI(DNIE";
Debug.ShouldStop(128);
_dniempleadoselok = BA.ObjectToBoolean(__ref.runClassMethod (b4j.docU.crepsol.class, "_checkdni" /*RemoteObject*/ ,(Object)(_dniempleadosel)));Debug.locals.put("DNIEmpleadoSelOK", _dniempleadoselok);Debug.locals.put("DNIEmpleadoSelOK", _dniempleadoselok);
 BA.debugLineNum = 3657;BA.debugLine="If Not(DNIEmpleadoSelOK) Then DatosLineaPedid";
Debug.ShouldStop(256);
if (true) break;

case 49:
//if
this.state = 54;
if (parent.__c.runMethod(true,"Not",(Object)(_dniempleadoselok)).<Boolean>get().booleanValue()) { 
this.state = 51;
;}if (true) break;

case 51:
//C
this.state = 54;
_datoslineapedido.setField ("ErrorDNI" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 3685;BA.debugLine="Dim NombreEmpleado As String=sLinea.SubStrin";
Debug.ShouldStop(16);
_nombreempleado = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 38)),(Object)(BA.numberCast(int.class, 138)));Debug.locals.put("NombreEmpleado", _nombreempleado);Debug.locals.put("NombreEmpleado", _nombreempleado);
 BA.debugLineNum = 3686;BA.debugLine="DatosLineaPedido.NombreEmpleado=NombreEmplea";
Debug.ShouldStop(32);
_datoslineapedido.setField ("NombreEmpleado" /*RemoteObject*/ ,_nombreempleado);
 BA.debugLineNum = 3687;BA.debugLine="Dim sCargo As String=sLinea.SubString2(138,1";
Debug.ShouldStop(64);
_scargo = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 138)),(Object)(BA.numberCast(int.class, 139)));Debug.locals.put("sCargo", _scargo);Debug.locals.put("sCargo", _scargo);
 BA.debugLineNum = 3697;BA.debugLine="DatosLineaPedido.Cargo=sCargo";
Debug.ShouldStop(65536);
_datoslineapedido.setField ("Cargo" /*RemoteObject*/ ,_scargo);
 BA.debugLineNum = 3698;BA.debugLine="If Not(sCargo=\"G\" Or sCargo=\"E\" Or sCargo=\"V";
Debug.ShouldStop(131072);
if (true) break;

case 55:
//if
this.state = 60;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_scargo,BA.ObjectToString("G")) || RemoteObject.solveBoolean("=",_scargo,BA.ObjectToString("E")) || RemoteObject.solveBoolean("=",_scargo,RemoteObject.createImmutable("V"))))).<Boolean>get().booleanValue()) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 60;
 BA.debugLineNum = 3699;BA.debugLine="DatosLineaPedido.ErrorCargo=1";
Debug.ShouldStop(262144);
_datoslineapedido.setField ("ErrorCargo" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 3702;BA.debugLine="DatosLineaPedido.ErrorCargo=0";
Debug.ShouldStop(2097152);
_datoslineapedido.setField ("ErrorCargo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 3706;BA.debugLine="Dim sSexoEmpleado As String=sLinea.SubString";
Debug.ShouldStop(33554432);
_ssexoempleado = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 139)),(Object)(BA.numberCast(int.class, 140)));Debug.locals.put("sSexoEmpleado", _ssexoempleado);Debug.locals.put("sSexoEmpleado", _ssexoempleado);
 BA.debugLineNum = 3714;BA.debugLine="DatosLineaPedido.Sexo=sSexoEmpleado";
Debug.ShouldStop(2);
_datoslineapedido.setField ("Sexo" /*RemoteObject*/ ,_ssexoempleado);
 BA.debugLineNum = 3715;BA.debugLine="If Not(sSexoEmpleado=\"H\" Or sSexoEmpleado=\"M";
Debug.ShouldStop(4);
if (true) break;

case 61:
//if
this.state = 66;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_ssexoempleado,BA.ObjectToString("H")) || RemoteObject.solveBoolean("=",_ssexoempleado,RemoteObject.createImmutable("M"))))).<Boolean>get().booleanValue()) { 
this.state = 63;
}else {
this.state = 65;
}if (true) break;

case 63:
//C
this.state = 66;
 BA.debugLineNum = 3716;BA.debugLine="DatosLineaPedido.ErrorSexo=1";
Debug.ShouldStop(8);
_datoslineapedido.setField ("ErrorSexo" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 3720;BA.debugLine="DatosLineaPedido.ErrorSexo=0";
Debug.ShouldStop(128);
_datoslineapedido.setField ("ErrorSexo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 3723;BA.debugLine="Dim sEmbarazoEmpleado As String=sLinea.SubSt";
Debug.ShouldStop(1024);
_sembarazoempleado = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 140)),(Object)(BA.numberCast(int.class, 141)));Debug.locals.put("sEmbarazoEmpleado", _sembarazoempleado);Debug.locals.put("sEmbarazoEmpleado", _sembarazoempleado);
 BA.debugLineNum = 3732;BA.debugLine="DatosLineaPedido.Embarazo=sEmbarazoEmpleado";
Debug.ShouldStop(524288);
_datoslineapedido.setField ("Embarazo" /*RemoteObject*/ ,_sembarazoempleado);
 BA.debugLineNum = 3733;BA.debugLine="If Not(sEmbarazoEmpleado=\"S\" Or sEmbarazoEmp";
Debug.ShouldStop(1048576);
if (true) break;

case 67:
//if
this.state = 72;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_sembarazoempleado,BA.ObjectToString("S")) || RemoteObject.solveBoolean("=",_sembarazoempleado,RemoteObject.createImmutable("N"))))).<Boolean>get().booleanValue()) { 
this.state = 69;
}else {
this.state = 71;
}if (true) break;

case 69:
//C
this.state = 72;
 BA.debugLineNum = 3734;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=1";
Debug.ShouldStop(2097152);
_datoslineapedido.setField ("ErrorEmbarazo" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 3738;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=0";
Debug.ShouldStop(33554432);
_datoslineapedido.setField ("ErrorEmbarazo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 if (true) break;

case 72:
//C
this.state = 73;
;
 if (true) break;

case 73:
//C
this.state = 161;
;
 if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 3782;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
Debug.ShouldStop(32);
_datoslineapedido.setField ("Linea" /*RemoteObject*/ ,_numlinea);
 BA.debugLineNum = 3785;BA.debugLine="DatosLineaPedido.CodigoPrenda=\"\"";
Debug.ShouldStop(256);
_datoslineapedido.setField ("CodigoPrenda" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3786;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=\"\"";
Debug.ShouldStop(512);
_datoslineapedido.setField ("DescripcionCodigoPrenda" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3787;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=0";
Debug.ShouldStop(1024);
_datoslineapedido.setField ("ErrorCodigoPrenda" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3788;BA.debugLine="DatosLineaPedido.CodigoProductoERP=\"\"";
Debug.ShouldStop(2048);
_datoslineapedido.setField ("CodigoProductoERP" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3789;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=0";
Debug.ShouldStop(4096);
_datoslineapedido.setField ("ErrorCodigoProductoERP" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3790;BA.debugLine="DatosLineaPedido.Talla=\"\"";
Debug.ShouldStop(8192);
_datoslineapedido.setField ("Talla" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3791;BA.debugLine="DatosLineaPedido.TallaERP=\"\"";
Debug.ShouldStop(16384);
_datoslineapedido.setField ("TallaERP" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3792;BA.debugLine="DatosLineaPedido.ErrorTalla=0";
Debug.ShouldStop(32768);
_datoslineapedido.setField ("ErrorTalla" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3793;BA.debugLine="DatosLineaPedido.Cantidad=0";
Debug.ShouldStop(65536);
_datoslineapedido.setField ("Cantidad" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3794;BA.debugLine="DatosLineaPedido.ErrorCantidad=0";
Debug.ShouldStop(131072);
_datoslineapedido.setField ("ErrorCantidad" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 3795;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 76:
//try
this.state = 81;
this.catchState = 80;
this.state = 78;
if (true) break;

case 78:
//C
this.state = 81;
this.catchState = 80;
 BA.debugLineNum = 3796;BA.debugLine="Dim CodigoPrenda As String=sLinea.SubString2(";
Debug.ShouldStop(524288);
_codigoprenda = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 38)),(Object)(BA.numberCast(int.class, 40)));Debug.locals.put("CodigoPrenda", _codigoprenda);Debug.locals.put("CodigoPrenda", _codigoprenda);
 BA.debugLineNum = 3800;BA.debugLine="DatosLineaPedido.CodigoPrenda=CodigoPrenda";
Debug.ShouldStop(8388608);
_datoslineapedido.setField ("CodigoPrenda" /*RemoteObject*/ ,_codigoprenda);
 BA.debugLineNum = 3801;BA.debugLine="Dim NumMapeoCodigoPrenda As Int=Utilidades.Fi";
Debug.ShouldStop(16777216);
_nummapeocodigoprenda = BA.numberCast(int.class, parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_datoslineapedido.getField(true,"CodigoPrenda" /*RemoteObject*/ )})))))))));Debug.locals.put("NumMapeoCodigoPrenda", _nummapeocodigoprenda);Debug.locals.put("NumMapeoCodigoPrenda", _nummapeocodigoprenda);
 BA.debugLineNum = 3803;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=IIf(NumMap";
Debug.ShouldStop(67108864);
_datoslineapedido.setField ("ErrorCodigoPrenda" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_nummapeocodigoprenda,BA.numberCast(double.class, 0))) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 3804;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=Util";
Debug.ShouldStop(134217728);
_datoslineapedido.setField ("DescripcionCodigoPrenda" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NombreCodigoPrenda from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_datoslineapedido.getField(true,"CodigoPrenda" /*RemoteObject*/ )})))))))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 80:
//C
this.state = 81;
this.catchState = 0;
 BA.debugLineNum = 3807;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","835062327",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 3808;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=1";
Debug.ShouldStop(-2147483648);
_datoslineapedido.setField ("ErrorCodigoPrenda" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
this.catchState = 0;
;
 BA.debugLineNum = 3821;BA.debugLine="DatosLineaPedido.CodigoProductoERP=Utilidade";
Debug.ShouldStop(4096);
_datoslineapedido.setField ("CodigoProductoERP" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select CodigoArticuloNAV from tblRepsolMapeoArticulosEESS where Marca=? and Cargo=? and Sexo=? and CodigoPrenda=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datoslineapedido.getField(true,"Marca" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Cargo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Sexo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoPrenda" /*RemoteObject*/ ))})))))))));
 BA.debugLineNum = 3825;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=IIf(D";
Debug.ShouldStop(65536);
_datoslineapedido.setField ("ErrorCodigoProductoERP" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"CodigoProductoERP" /*RemoteObject*/ ),BA.ObjectToString(""))) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 3830;BA.debugLine="Dim Talla As String=sLinea.SubString2(40,44).";
Debug.ShouldStop(2097152);
_talla = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 40)),(Object)(BA.numberCast(int.class, 44))).runMethod(true,"trim");Debug.locals.put("Talla", _talla);Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 3831;BA.debugLine="DatosLineaPedido.Talla=Talla";
Debug.ShouldStop(4194304);
_datoslineapedido.setField ("Talla" /*RemoteObject*/ ,_talla);
 BA.debugLineNum = 3832;BA.debugLine="DatosLineaPedido.TallaERP=Utilidades.FixNull(";
Debug.ShouldStop(8388608);
_datoslineapedido.setField ("TallaERP" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select Talla from tblRepsolTallasArticulosEESS where Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_datoslineapedido.getField(true,"CodigoProductoERP" /*RemoteObject*/ ),_datoslineapedido.getField(true,"Talla" /*RemoteObject*/ )})))))))));
 BA.debugLineNum = 3835;BA.debugLine="DatosLineaPedido.ErrorTalla=IIf(DatosLineaPed";
Debug.ShouldStop(67108864);
_datoslineapedido.setField ("ErrorTalla" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"TallaERP" /*RemoteObject*/ ),_datoslineapedido.getField(true,"Talla" /*RemoteObject*/ ))) ? (RemoteObject.createImmutable((0))) : (RemoteObject.createImmutable((1))))));
 BA.debugLineNum = 3840;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 82:
//try
this.state = 87;
this.catchState = 86;
this.state = 84;
if (true) break;

case 84:
//C
this.state = 87;
this.catchState = 86;
 BA.debugLineNum = 3841;BA.debugLine="Dim Cantidad As Int=sLinea.SubString2(44,45)";
Debug.ShouldStop(1);
_cantidad = BA.numberCast(int.class, _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 44)),(Object)(BA.numberCast(int.class, 45))));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 3842;BA.debugLine="DatosLineaPedido.Cantidad=Cantidad";
Debug.ShouldStop(2);
_datoslineapedido.setField ("Cantidad" /*RemoteObject*/ ,_cantidad);
 Debug.CheckDeviceExceptions();
if (true) break;

case 86:
//C
this.state = 87;
this.catchState = 0;
 BA.debugLineNum = 3844;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","835062364",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 3845;BA.debugLine="DatosLineaPedido.ErrorCantidad=1";
Debug.ShouldStop(16);
_datoslineapedido.setField ("ErrorCantidad" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 3890;BA.debugLine="If DatosLineaPedido.ErrorSede=1 Then DatosLine";
Debug.ShouldStop(131072);

case 87:
//if
this.state = 92;
this.catchState = 0;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorSede" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 89;
;}if (true) break;

case 89:
//C
this.state = 92;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 92:
//C
this.state = 93;
;
 BA.debugLineNum = 3891;BA.debugLine="If DatosLineaPedido.ErrorFechaPedido=1 Then Da";
Debug.ShouldStop(262144);
if (true) break;

case 93:
//if
this.state = 98;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorFechaPedido" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 95;
;}if (true) break;

case 95:
//C
this.state = 98;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 98:
//C
this.state = 99;
;
 BA.debugLineNum = 3892;BA.debugLine="If DatosLineaPedido.ErrorMarca=1 Then DatosLin";
Debug.ShouldStop(524288);
if (true) break;

case 99:
//if
this.state = 104;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorMarca" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 101;
;}if (true) break;

case 101:
//C
this.state = 104;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 104:
//C
this.state = 105;
;
 BA.debugLineNum = 3893;BA.debugLine="If DatosLineaPedido.ErrorDNI=1 Then DatosLinea";
Debug.ShouldStop(1048576);
if (true) break;

case 105:
//if
this.state = 110;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorDNI" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 107;
;}if (true) break;

case 107:
//C
this.state = 110;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 110:
//C
this.state = 111;
;
 BA.debugLineNum = 3894;BA.debugLine="If DatosLineaPedido.ErrorCargo=1 Then DatosLin";
Debug.ShouldStop(2097152);
if (true) break;

case 111:
//if
this.state = 116;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorCargo" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 113;
;}if (true) break;

case 113:
//C
this.state = 116;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 116:
//C
this.state = 117;
;
 BA.debugLineNum = 3895;BA.debugLine="If DatosLineaPedido.ErrorSexo=1 Then DatosLine";
Debug.ShouldStop(4194304);
if (true) break;

case 117:
//if
this.state = 122;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorSexo" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 119;
;}if (true) break;

case 119:
//C
this.state = 122;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 122:
//C
this.state = 123;
;
 BA.debugLineNum = 3896;BA.debugLine="If DatosLineaPedido.ErrorEmbarazo=1 Then Datos";
Debug.ShouldStop(8388608);
if (true) break;

case 123:
//if
this.state = 128;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorEmbarazo" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 125;
;}if (true) break;

case 125:
//C
this.state = 128;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 128:
//C
this.state = 129;
;
 BA.debugLineNum = 3897;BA.debugLine="If DatosLineaPedido.ErrorCodigoPrenda=1 Then D";
Debug.ShouldStop(16777216);
if (true) break;

case 129:
//if
this.state = 134;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorCodigoPrenda" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 131;
;}if (true) break;

case 131:
//C
this.state = 134;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 134:
//C
this.state = 135;
;
 BA.debugLineNum = 3898;BA.debugLine="If DatosLineaPedido.ErrorCodigoProductoERP=1 T";
Debug.ShouldStop(33554432);
if (true) break;

case 135:
//if
this.state = 140;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorCodigoProductoERP" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 137;
;}if (true) break;

case 137:
//C
this.state = 140;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 140:
//C
this.state = 141;
;
 BA.debugLineNum = 3899;BA.debugLine="If DatosLineaPedido.ErrorTalla=1 Then DatosLin";
Debug.ShouldStop(67108864);
if (true) break;

case 141:
//if
this.state = 146;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorTalla" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 143;
;}if (true) break;

case 143:
//C
this.state = 146;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 146:
//C
this.state = 147;
;
 BA.debugLineNum = 3900;BA.debugLine="If DatosLineaPedido.ErrorCantidad=1 Then Datos";
Debug.ShouldStop(134217728);
if (true) break;

case 147:
//if
this.state = 152;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorCantidad" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 149;
;}if (true) break;

case 149:
//C
this.state = 152;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 152:
//C
this.state = 153;
;
 BA.debugLineNum = 3902;BA.debugLine="If DatosLineaPedido.LineaConError=1 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 153:
//if
this.state = 156;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"LineaConError" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
 BA.debugLineNum = 3903;BA.debugLine="LogColor(\"*********************\",xui.Color_Bl";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","835062423",BA.ObjectToString("*********************"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 3904;BA.debugLine="LogColor($\"DatosLineaPedido ERROR: ${DatosLin";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","835062424",(RemoteObject.concat(RemoteObject.createImmutable("DatosLineaPedido ERROR: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datoslineapedido))),RemoteObject.createImmutable(""))),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 3905;BA.debugLine="LogColor(\"*********************\",xui.Color_Bl";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","835062425",BA.ObjectToString("*********************"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 if (true) break;

case 156:
//C
this.state = 161;
;
 BA.debugLineNum = 3915;BA.debugLine="mSQL.AddNonQueryToBatch($\" 	insert into tblRep";
Debug.ShouldStop(1024);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)((RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	insert into tblRepsolLineasFicheroPedido\n"),RemoteObject.createImmutable("	(Linea, ErrorLongitudLineaCabeceraEstacion, Sede , ErrorSede , CodigoClienteERP , CodigoDireccionEnvioERP \n"),RemoteObject.createImmutable("	, CodigoPedido , FechaPedido ,ErrorFechaPedido, NombreEstacion ,Calle , CodigoPostal \n"),RemoteObject.createImmutable("	, Poblacion , CodigoProvincia , Telefono \n"),RemoteObject.createImmutable("	, TipoEstacion , Marca , ErrorMarca \n"),RemoteObject.createImmutable("	, DNI , ErrorDNI , NombreEmpleado , Cargo , ErrorCargo \n"),RemoteObject.createImmutable("	, Sexo , ErrorSexo ,  Embarazo , ErrorEmbarazo \n"),RemoteObject.createImmutable("	,CodigoPrenda , ErrorCodigoPrenda , CodigoProductoERP, ErrorCodigoProductoERP, Talla, TallaERP , ErrorTalla , Cantidad, ErrorCantidad\n"),RemoteObject.createImmutable("	, LineaConError) \n"),RemoteObject.createImmutable("	values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)")))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {37},new Object[] {(_datoslineapedido.getField(true,"Linea" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorLongitudLineaCabeceraEstacion" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Sede" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorSede" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoClienteERP" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoDireccionEnvioERP" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoPedido" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"FechaPedido" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorFechaPedido" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"NombreEstacion" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Calle" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoPostal" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Poblacion" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoProvincia" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Telefono" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"TipoEstacion" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Marca" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorMarca" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"DNI" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorDNI" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"NombreEmpleado" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Cargo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorCargo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Sexo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorSexo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Embarazo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorEmbarazo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoPrenda" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorCodigoPrenda" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoProductoERP" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorCodigoProductoERP" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Talla" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"TallaERP" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorTalla" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Cantidad" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorCantidad" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"LineaConError" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 3937;BA.debugLine="DatosLineaPedido.LineaConError=0  ' reseteamos la";
Debug.ShouldStop(1);
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 if (true) break;

case 158:
//C
this.state = 161;
 BA.debugLineNum = 3950;BA.debugLine="Exit ' Salir del loop (ésta debería ser la últ";
Debug.ShouldStop(8192);
this.state = 161;
if (true) break;
 if (true) break;

case 160:
//C
this.state = 161;
 if (true) break;

case 161:
//C
this.state = 391;
;
 if (true) break;
if (true) break;

case 162:
//C
this.state = 163;
Debug.locals.put("sLinea", _slinea);
;
 BA.debugLineNum = 3969;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
Debug.ShouldStop(1);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 3970;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero3"), _senderfilter);
this.state = 392;
return;
case 392:
//C
this.state = 163;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 3971;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","835062491",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 3984;BA.debugLine="Dim NumLineasConError As Int=mSQL.ExecQuerySingle";
Debug.ShouldStop(32768);
_numlineasconerror = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)((RemoteObject.createImmutable("select count(*) from tblRepsolLineasFicheroPedido where LineaConError=?"))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(1)}))))));Debug.locals.put("NumLineasConError", _numlineasconerror);Debug.locals.put("NumLineasConError", _numlineasconerror);
 BA.debugLineNum = 3985;BA.debugLine="Dim CSVErroresSubidoOKFTP As Boolean";
Debug.ShouldStop(65536);
_csverroressubidookftp = RemoteObject.createImmutable(false);Debug.locals.put("CSVErroresSubidoOKFTP", _csverroressubidookftp);
 BA.debugLineNum = 3987;BA.debugLine="If NumLineasConError>0 Then";
Debug.ShouldStop(262144);
if (true) break;

case 163:
//if
this.state = 366;
if (RemoteObject.solveBoolean(">",_numlineasconerror,BA.numberCast(double.class, 0))) { 
this.state = 165;
}if (true) break;

case 165:
//C
this.state = 166;
 BA.debugLineNum = 3989;BA.debugLine="Dim rsSedePedidoDNI As ResultSet=mSQL.ExecQuery(";
Debug.ShouldStop(1048576);
_rssedepedidodni = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rssedepedidodni = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.createImmutable("select distinct Sede, CodigoPedido, DNI from tblRepsolLineasFicheroPedido where LineaConError=1"))));Debug.locals.put("rsSedePedidoDNI", _rssedepedidodni);Debug.locals.put("rsSedePedidoDNI", _rssedepedidodni);
 BA.debugLineNum = 3990;BA.debugLine="Do While rsSedePedidoDNI.NextRow";
Debug.ShouldStop(2097152);
if (true) break;

case 166:
//do while
this.state = 351;
while (_rssedepedidodni.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 168;
if (true) break;
}
if (true) break;

case 168:
//C
this.state = 169;
 BA.debugLineNum = 3991;BA.debugLine="Dim Sede As String=rsSedePedidoDNI.GetString(\"S";
Debug.ShouldStop(4194304);
_sede = _rssedepedidodni.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Sede")));Debug.locals.put("Sede", _sede);Debug.locals.put("Sede", _sede);
 BA.debugLineNum = 3992;BA.debugLine="Dim PedidoSede As String=rsSedePedidoDNI.GetStr";
Debug.ShouldStop(8388608);
_pedidosede = _rssedepedidodni.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoPedido")));Debug.locals.put("PedidoSede", _pedidosede);Debug.locals.put("PedidoSede", _pedidosede);
 BA.debugLineNum = 3993;BA.debugLine="Dim DNI As String=rsSedePedidoDNI.GetString(\"DN";
Debug.ShouldStop(16777216);
_dni = _rssedepedidodni.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("DNI")));Debug.locals.put("DNI", _dni);Debug.locals.put("DNI", _dni);
 BA.debugLineNum = 3995;BA.debugLine="mSQL.ExecNonQuery2(\"update tblRepsolLineasFiche";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblRepsolLineasFicheroPedido set SedePedidoDNIConError=? where Sede=? and CodigoPedido=? and DNI=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable((1)),(_sede),(_pedidosede),(_dni)})))));
 BA.debugLineNum = 3998;BA.debugLine="mSQL.ExecNonQuery2(\"insert into tblRepsolErrore";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("insert into tblRepsolErroresSedePedidoDNIFicheroPedido (Sede, PedidoSede, DNI, Errores) values (?,?,?,?)")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sede))),RemoteObject.createImmutable("")))),((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pedidosede))),RemoteObject.createImmutable("")))),((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dni))),RemoteObject.createImmutable("")))),(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 4001;BA.debugLine="Dim ErrorLongitudLineaCabeceraEstacion As Boole";
Debug.ShouldStop(1);
_errorlongitudlineacabeceraestacion = RemoteObject.createImmutable(false);Debug.locals.put("ErrorLongitudLineaCabeceraEstacion", _errorlongitudlineacabeceraestacion);
 BA.debugLineNum = 4002;BA.debugLine="Dim ErrorSede As Boolean";
Debug.ShouldStop(2);
_errorsede = RemoteObject.createImmutable(false);Debug.locals.put("ErrorSede", _errorsede);
 BA.debugLineNum = 4003;BA.debugLine="Dim ErrorFechaPedido As Boolean";
Debug.ShouldStop(4);
_errorfechapedido = RemoteObject.createImmutable(false);Debug.locals.put("ErrorFechaPedido", _errorfechapedido);
 BA.debugLineNum = 4004;BA.debugLine="Dim ErrorMarca As Boolean";
Debug.ShouldStop(8);
_errormarca = RemoteObject.createImmutable(false);Debug.locals.put("ErrorMarca", _errormarca);
 BA.debugLineNum = 4005;BA.debugLine="Dim ErrorLongitudLineaEmpleado As Boolean";
Debug.ShouldStop(16);
_errorlongitudlineaempleado = RemoteObject.createImmutable(false);Debug.locals.put("ErrorLongitudLineaEmpleado", _errorlongitudlineaempleado);
 BA.debugLineNum = 4006;BA.debugLine="Dim ErrorDNI As Boolean";
Debug.ShouldStop(32);
_errordni = RemoteObject.createImmutable(false);Debug.locals.put("ErrorDNI", _errordni);
 BA.debugLineNum = 4007;BA.debugLine="Dim ErrorCargo As Boolean";
Debug.ShouldStop(64);
_errorcargo = RemoteObject.createImmutable(false);Debug.locals.put("ErrorCargo", _errorcargo);
 BA.debugLineNum = 4008;BA.debugLine="Dim ErrorSexo As Boolean";
Debug.ShouldStop(128);
_errorsexo = RemoteObject.createImmutable(false);Debug.locals.put("ErrorSexo", _errorsexo);
 BA.debugLineNum = 4009;BA.debugLine="Dim ErrorEmbarazo As Boolean";
Debug.ShouldStop(256);
_errorembarazo = RemoteObject.createImmutable(false);Debug.locals.put("ErrorEmbarazo", _errorembarazo);
 BA.debugLineNum = 4010;BA.debugLine="Dim ErrorLongitudLineaProducto As Boolean";
Debug.ShouldStop(512);
_errorlongitudlineaproducto = RemoteObject.createImmutable(false);Debug.locals.put("ErrorLongitudLineaProducto", _errorlongitudlineaproducto);
 BA.debugLineNum = 4011;BA.debugLine="Dim ErrorCodigoPrenda As Boolean";
Debug.ShouldStop(1024);
_errorcodigoprenda = RemoteObject.createImmutable(false);Debug.locals.put("ErrorCodigoPrenda", _errorcodigoprenda);
 BA.debugLineNum = 4012;BA.debugLine="Dim ErrorCodigoProductoERP As Boolean";
Debug.ShouldStop(2048);
_errorcodigoproductoerp = RemoteObject.createImmutable(false);Debug.locals.put("ErrorCodigoProductoERP", _errorcodigoproductoerp);
 BA.debugLineNum = 4013;BA.debugLine="Dim ErrorTalla As Boolean";
Debug.ShouldStop(4096);
_errortalla = RemoteObject.createImmutable(false);Debug.locals.put("ErrorTalla", _errortalla);
 BA.debugLineNum = 4014;BA.debugLine="Dim ErrorCantidad As Boolean";
Debug.ShouldStop(8192);
_errorcantidad = RemoteObject.createImmutable(false);Debug.locals.put("ErrorCantidad", _errorcantidad);
 BA.debugLineNum = 4028;BA.debugLine="Dim rsLineasSedePedidoDNI As ResultSet= mSQL.Ex";
Debug.ShouldStop(134217728);
_rslineassedepedidodni = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rslineassedepedidodni = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select distinct Sede, CodigoPedido, DNI\n"),RemoteObject.createImmutable("	,ErrorLongitudLineaCabeceraEstacion,ErrorSede,ErrorFechaPedido,ErrorMarca\n"),RemoteObject.createImmutable("	,ErrorLongitudLineaEmpleado, ErrorDNI, ErrorCargo, ErrorSexo, ErrorEmbarazo\n"),RemoteObject.createImmutable("	 ,ErrorLongitudLineaProducto, ErrorCodigoPrenda,ErrorCodigoProductoERP,ErrorTalla, ErrorCantidad\n"),RemoteObject.createImmutable("	 from tblRepsolLineasFicheroPedido\n"),RemoteObject.createImmutable("	 where\n"),RemoteObject.createImmutable("	 Sede=? And CodigoPedido=? And DNI=?")))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_sede),(_pedidosede),(_dni)})))));Debug.locals.put("rsLineasSedePedidoDNI", _rslineassedepedidodni);Debug.locals.put("rsLineasSedePedidoDNI", _rslineassedepedidodni);
 BA.debugLineNum = 4037;BA.debugLine="Do While rsLineasSedePedidoDNI.NextRow";
Debug.ShouldStop(16);
if (true) break;

case 169:
//do while
this.state = 262;
while (_rslineassedepedidodni.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 171;
if (true) break;
}
if (true) break;

case 171:
//C
this.state = 172;
 BA.debugLineNum = 4038;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
Debug.ShouldStop(32);
if (true) break;

case 172:
//if
this.state = 177;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorLongitudLineaCabeceraEstacion"))),BA.numberCast(double.class, 1))) { 
this.state = 174;
;}if (true) break;

case 174:
//C
this.state = 177;
_errorlongitudlineacabeceraestacion = parent.__c.getField(true,"True");Debug.locals.put("ErrorLongitudLineaCabeceraEstacion", _errorlongitudlineacabeceraestacion);
if (true) break;

case 177:
//C
this.state = 178;
;
 BA.debugLineNum = 4039;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorSede\")=1";
Debug.ShouldStop(64);
if (true) break;

case 178:
//if
this.state = 183;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorSede"))),BA.numberCast(double.class, 1))) { 
this.state = 180;
;}if (true) break;

case 180:
//C
this.state = 183;
_errorsede = parent.__c.getField(true,"True");Debug.locals.put("ErrorSede", _errorsede);
if (true) break;

case 183:
//C
this.state = 184;
;
 BA.debugLineNum = 4040;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorFechaPed";
Debug.ShouldStop(128);
if (true) break;

case 184:
//if
this.state = 189;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorFechaPedido"))),BA.numberCast(double.class, 1))) { 
this.state = 186;
;}if (true) break;

case 186:
//C
this.state = 189;
_errorfechapedido = parent.__c.getField(true,"True");Debug.locals.put("ErrorFechaPedido", _errorfechapedido);
if (true) break;

case 189:
//C
this.state = 190;
;
 BA.debugLineNum = 4041;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorMarca\")=";
Debug.ShouldStop(256);
if (true) break;

case 190:
//if
this.state = 195;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorMarca"))),BA.numberCast(double.class, 1))) { 
this.state = 192;
;}if (true) break;

case 192:
//C
this.state = 195;
_errormarca = parent.__c.getField(true,"True");Debug.locals.put("ErrorMarca", _errormarca);
if (true) break;

case 195:
//C
this.state = 196;
;
 BA.debugLineNum = 4042;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
Debug.ShouldStop(512);
if (true) break;

case 196:
//if
this.state = 201;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorLongitudLineaEmpleado"))),BA.numberCast(double.class, 1))) { 
this.state = 198;
;}if (true) break;

case 198:
//C
this.state = 201;
_errorlongitudlineaempleado = parent.__c.getField(true,"True");Debug.locals.put("ErrorLongitudLineaEmpleado", _errorlongitudlineaempleado);
if (true) break;

case 201:
//C
this.state = 202;
;
 BA.debugLineNum = 4043;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorDNI\")=1";
Debug.ShouldStop(1024);
if (true) break;

case 202:
//if
this.state = 207;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorDNI"))),BA.numberCast(double.class, 1))) { 
this.state = 204;
;}if (true) break;

case 204:
//C
this.state = 207;
_errordni = parent.__c.getField(true,"True");Debug.locals.put("ErrorDNI", _errordni);
if (true) break;

case 207:
//C
this.state = 208;
;
 BA.debugLineNum = 4044;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCargo\")=";
Debug.ShouldStop(2048);
if (true) break;

case 208:
//if
this.state = 213;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorCargo"))),BA.numberCast(double.class, 1))) { 
this.state = 210;
;}if (true) break;

case 210:
//C
this.state = 213;
_errorcargo = parent.__c.getField(true,"True");Debug.locals.put("ErrorCargo", _errorcargo);
if (true) break;

case 213:
//C
this.state = 214;
;
 BA.debugLineNum = 4045;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorSexo\")=1";
Debug.ShouldStop(4096);
if (true) break;

case 214:
//if
this.state = 219;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorSexo"))),BA.numberCast(double.class, 1))) { 
this.state = 216;
;}if (true) break;

case 216:
//C
this.state = 219;
_errorsexo = parent.__c.getField(true,"True");Debug.locals.put("ErrorSexo", _errorsexo);
if (true) break;

case 219:
//C
this.state = 220;
;
 BA.debugLineNum = 4046;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorEmbarazo";
Debug.ShouldStop(8192);
if (true) break;

case 220:
//if
this.state = 225;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorEmbarazo"))),BA.numberCast(double.class, 1))) { 
this.state = 222;
;}if (true) break;

case 222:
//C
this.state = 225;
_errorembarazo = parent.__c.getField(true,"True");Debug.locals.put("ErrorEmbarazo", _errorembarazo);
if (true) break;

case 225:
//C
this.state = 226;
;
 BA.debugLineNum = 4047;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
Debug.ShouldStop(16384);
if (true) break;

case 226:
//if
this.state = 231;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorLongitudLineaProducto"))),BA.numberCast(double.class, 1))) { 
this.state = 228;
;}if (true) break;

case 228:
//C
this.state = 231;
_errorlongitudlineaproducto = parent.__c.getField(true,"True");Debug.locals.put("ErrorLongitudLineaProducto", _errorlongitudlineaproducto);
if (true) break;

case 231:
//C
this.state = 232;
;
 BA.debugLineNum = 4048;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCodigoPr";
Debug.ShouldStop(32768);
if (true) break;

case 232:
//if
this.state = 237;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorCodigoPrenda"))),BA.numberCast(double.class, 1))) { 
this.state = 234;
;}if (true) break;

case 234:
//C
this.state = 237;
_errorcodigoprenda = parent.__c.getField(true,"True");Debug.locals.put("ErrorCodigoPrenda", _errorcodigoprenda);
if (true) break;

case 237:
//C
this.state = 238;
;
 BA.debugLineNum = 4049;BA.debugLine="If ErrorMarca Or ErrorCargo Or ErrorSexo Or Er";
Debug.ShouldStop(65536);
if (true) break;

case 238:
//if
this.state = 243;
if (RemoteObject.solveBoolean(".",_errormarca) || RemoteObject.solveBoolean(".",_errorcargo) || RemoteObject.solveBoolean(".",_errorsexo) || RemoteObject.solveBoolean(".",_errorembarazo) || RemoteObject.solveBoolean(".",_errorcodigoprenda)) { 
this.state = 240;
;}if (true) break;

case 240:
//C
this.state = 243;
this.state = 169;
if (true) break;;
if (true) break;

case 243:
//C
this.state = 244;
;
 BA.debugLineNum = 4050;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCodigoPr";
Debug.ShouldStop(131072);
if (true) break;

case 244:
//if
this.state = 249;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorCodigoProductoERP"))),BA.numberCast(double.class, 1))) { 
this.state = 246;
;}if (true) break;

case 246:
//C
this.state = 249;
_errorcodigoproductoerp = parent.__c.getField(true,"True");Debug.locals.put("ErrorCodigoProductoERP", _errorcodigoproductoerp);
if (true) break;

case 249:
//C
this.state = 250;
;
 BA.debugLineNum = 4051;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorTalla\")=";
Debug.ShouldStop(262144);
if (true) break;

case 250:
//if
this.state = 255;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorTalla"))),BA.numberCast(double.class, 1))) { 
this.state = 252;
;}if (true) break;

case 252:
//C
this.state = 255;
_errortalla = parent.__c.getField(true,"True");Debug.locals.put("ErrorTalla", _errortalla);
if (true) break;

case 255:
//C
this.state = 256;
;
 BA.debugLineNum = 4052;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCantidad";
Debug.ShouldStop(524288);
if (true) break;

case 256:
//if
this.state = 261;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorCantidad"))),BA.numberCast(double.class, 1))) { 
this.state = 258;
;}if (true) break;

case 258:
//C
this.state = 261;
_errorcantidad = parent.__c.getField(true,"True");Debug.locals.put("ErrorCantidad", _errorcantidad);
if (true) break;

case 261:
//C
this.state = 169;
;
 if (true) break;

case 262:
//C
this.state = 263;
;
 BA.debugLineNum = 4054;BA.debugLine="rsLineasSedePedidoDNI.close";
Debug.ShouldStop(2097152);
_rslineassedepedidodni.runVoidMethod ("Close");
 BA.debugLineNum = 4056;BA.debugLine="Dim sbTextoError As StringBuilder";
Debug.ShouldStop(8388608);
_sbtextoerror = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbTextoError", _sbtextoerror);
 BA.debugLineNum = 4057;BA.debugLine="sbTextoError.Initialize";
Debug.ShouldStop(16777216);
_sbtextoerror.runVoidMethod ("Initialize");
 BA.debugLineNum = 4059;BA.debugLine="If ErrorLongitudLineaCabeceraEstacion Then sbTe";
Debug.ShouldStop(67108864);
if (true) break;

case 263:
//if
this.state = 268;
if (_errorlongitudlineacabeceraestacion.<Boolean>get().booleanValue()) { 
this.state = 265;
;}if (true) break;

case 265:
//C
this.state = 268;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorLongitudLineaCabeceraEstacion")));
if (true) break;

case 268:
//C
this.state = 269;
;
 BA.debugLineNum = 4060;BA.debugLine="If ErrorSede Then sbTextoError.Append(\", Sede n";
Debug.ShouldStop(134217728);
if (true) break;

case 269:
//if
this.state = 274;
if (_errorsede.<Boolean>get().booleanValue()) { 
this.state = 271;
;}if (true) break;

case 271:
//C
this.state = 274;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Sede no existe ERP Proin")));
if (true) break;

case 274:
//C
this.state = 275;
;
 BA.debugLineNum = 4061;BA.debugLine="If ErrorFechaPedido Then sbTextoError.Append(\",";
Debug.ShouldStop(268435456);
if (true) break;

case 275:
//if
this.state = 280;
if (_errorfechapedido.<Boolean>get().booleanValue()) { 
this.state = 277;
;}if (true) break;

case 277:
//C
this.state = 280;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Fecha")));
if (true) break;

case 280:
//C
this.state = 281;
;
 BA.debugLineNum = 4062;BA.debugLine="If ErrorMarca Then sbTextoError.Append(\", Error";
Debug.ShouldStop(536870912);
if (true) break;

case 281:
//if
this.state = 286;
if (_errormarca.<Boolean>get().booleanValue()) { 
this.state = 283;
;}if (true) break;

case 283:
//C
this.state = 286;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Marca")));
if (true) break;

case 286:
//C
this.state = 287;
;
 BA.debugLineNum = 4063;BA.debugLine="If ErrorLongitudLineaEmpleado Then sbTextoError";
Debug.ShouldStop(1073741824);
if (true) break;

case 287:
//if
this.state = 292;
if (_errorlongitudlineaempleado.<Boolean>get().booleanValue()) { 
this.state = 289;
;}if (true) break;

case 289:
//C
this.state = 292;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorLongitudLineaEmpleado")));
if (true) break;

case 292:
//C
this.state = 293;
;
 BA.debugLineNum = 4064;BA.debugLine="If ErrorDNI Then sbTextoError.Append(\", DNI no";
Debug.ShouldStop(-2147483648);
if (true) break;

case 293:
//if
this.state = 298;
if (_errordni.<Boolean>get().booleanValue()) { 
this.state = 295;
;}if (true) break;

case 295:
//C
this.state = 298;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", DNI no válido")));
if (true) break;

case 298:
//C
this.state = 299;
;
 BA.debugLineNum = 4065;BA.debugLine="If ErrorCargo Then sbTextoError.Append(\", Error";
Debug.ShouldStop(1);
if (true) break;

case 299:
//if
this.state = 304;
if (_errorcargo.<Boolean>get().booleanValue()) { 
this.state = 301;
;}if (true) break;

case 301:
//C
this.state = 304;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Cargo")));
if (true) break;

case 304:
//C
this.state = 305;
;
 BA.debugLineNum = 4066;BA.debugLine="If ErrorSexo Then sbTextoError.Append(\", Error";
Debug.ShouldStop(2);
if (true) break;

case 305:
//if
this.state = 310;
if (_errorsexo.<Boolean>get().booleanValue()) { 
this.state = 307;
;}if (true) break;

case 307:
//C
this.state = 310;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Sexo")));
if (true) break;

case 310:
//C
this.state = 311;
;
 BA.debugLineNum = 4067;BA.debugLine="If ErrorEmbarazo Then sbTextoError.Append(\", Er";
Debug.ShouldStop(4);
if (true) break;

case 311:
//if
this.state = 316;
if (_errorembarazo.<Boolean>get().booleanValue()) { 
this.state = 313;
;}if (true) break;

case 313:
//C
this.state = 316;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Embarazo")));
if (true) break;

case 316:
//C
this.state = 317;
;
 BA.debugLineNum = 4068;BA.debugLine="If ErrorLongitudLineaProducto Then sbTextoError";
Debug.ShouldStop(8);
if (true) break;

case 317:
//if
this.state = 322;
if (_errorlongitudlineaproducto.<Boolean>get().booleanValue()) { 
this.state = 319;
;}if (true) break;

case 319:
//C
this.state = 322;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorLongitudLineaProducto")));
if (true) break;

case 322:
//C
this.state = 323;
;
 BA.debugLineNum = 4069;BA.debugLine="If ErrorCodigoPrenda Then sbTextoError.Append(\"";
Debug.ShouldStop(16);
if (true) break;

case 323:
//if
this.state = 328;
if (_errorcodigoprenda.<Boolean>get().booleanValue()) { 
this.state = 325;
;}if (true) break;

case 325:
//C
this.state = 328;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Código Prenda")));
if (true) break;

case 328:
//C
this.state = 329;
;
 BA.debugLineNum = 4070;BA.debugLine="If ErrorCodigoProductoERP Then sbTextoError.App";
Debug.ShouldStop(32);
if (true) break;

case 329:
//if
this.state = 334;
if (_errorcodigoproductoerp.<Boolean>get().booleanValue()) { 
this.state = 331;
;}if (true) break;

case 331:
//C
this.state = 334;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorCodigoProductoERP")));
if (true) break;

case 334:
//C
this.state = 335;
;
 BA.debugLineNum = 4071;BA.debugLine="If ErrorTalla Then sbTextoError.Append(\", Error";
Debug.ShouldStop(64);
if (true) break;

case 335:
//if
this.state = 340;
if (_errortalla.<Boolean>get().booleanValue()) { 
this.state = 337;
;}if (true) break;

case 337:
//C
this.state = 340;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorTalla")));
if (true) break;

case 340:
//C
this.state = 341;
;
 BA.debugLineNum = 4072;BA.debugLine="If ErrorCantidad Then sbTextoError.Append(\", Er";
Debug.ShouldStop(128);
if (true) break;

case 341:
//if
this.state = 346;
if (_errorcantidad.<Boolean>get().booleanValue()) { 
this.state = 343;
;}if (true) break;

case 343:
//C
this.state = 346;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorCantidad")));
if (true) break;

case 346:
//C
this.state = 347;
;
 BA.debugLineNum = 4074;BA.debugLine="If sbTextoError.Length>2 Then";
Debug.ShouldStop(512);
if (true) break;

case 347:
//if
this.state = 350;
if (RemoteObject.solveBoolean(">",_sbtextoerror.runMethod(true,"getLength"),BA.numberCast(double.class, 2))) { 
this.state = 349;
}if (true) break;

case 349:
//C
this.state = 350;
 BA.debugLineNum = 4075;BA.debugLine="mSQL.ExecNonQuery2(\"update tblRepsolErroresSed";
Debug.ShouldStop(1024);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblRepsolErroresSedePedidoDNIFicheroPedido set Errores=? where Sede=? and PedidoSede=? and DNI=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sbtextoerror.runMethod(true,"ToString").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)))))),RemoteObject.createImmutable("")))),(_sede),(_pedidosede),(_dni)})))));
 if (true) break;

case 350:
//C
this.state = 166;
;
 if (true) break;

case 351:
//C
this.state = 352;
;
 BA.debugLineNum = 4080;BA.debugLine="rsSedePedidoDNI.close";
Debug.ShouldStop(32768);
_rssedepedidodni.runVoidMethod ("Close");
 BA.debugLineNum = 4082;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(131072);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 4084;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Generando F";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Generando Fichero CSV ERRORES...")));
 BA.debugLineNum = 4085;BA.debugLine="Dim lstErrores As List=DBUtils.ExecuteMemoryTabl";
Debug.ShouldStop(1048576);
_lsterrores = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lsterrores = parent._dbutils.runMethod(false,"_executememorytable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("select * from tblRepsolErroresSedePedidoDNIFicheroPedido"))),(Object)((parent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("lstErrores", _lsterrores);Debug.locals.put("lstErrores", _lsterrores);
 BA.debugLineNum = 4086;BA.debugLine="Dim lstEncabezadosErrores As List";
Debug.ShouldStop(2097152);
_lstencabezadoserrores = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEncabezadosErrores", _lstencabezadoserrores);
 BA.debugLineNum = 4087;BA.debugLine="lstEncabezadosErrores.Initialize";
Debug.ShouldStop(4194304);
_lstencabezadoserrores.runVoidMethod ("Initialize");
 BA.debugLineNum = 4088;BA.debugLine="lstEncabezadosErrores.add(\"Sede\")";
Debug.ShouldStop(8388608);
_lstencabezadoserrores.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Sede"))));
 BA.debugLineNum = 4089;BA.debugLine="lstEncabezadosErrores.add(\"PedidoSede\")";
Debug.ShouldStop(16777216);
_lstencabezadoserrores.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("PedidoSede"))));
 BA.debugLineNum = 4090;BA.debugLine="lstEncabezadosErrores.add(\"DNI\")";
Debug.ShouldStop(33554432);
_lstencabezadoserrores.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("DNI"))));
 BA.debugLineNum = 4091;BA.debugLine="lstEncabezadosErrores.add(\"ERROR\")";
Debug.ShouldStop(67108864);
_lstencabezadoserrores.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("ERROR"))));
 BA.debugLineNum = 4121;BA.debugLine="Dim sFicheroErrores As String=GenerarCSVSeparado";
Debug.ShouldStop(16777216);
_sficheroerrores = __ref.runClassMethod (b4j.docU.crepsol.class, "_generarcsvseparadorcomasquotes" /*RemoteObject*/ ,(Object)(_lsterrores),(Object)(BA.ObjectToString(",")),(Object)(_lstencabezadoserrores));Debug.locals.put("sFicheroErrores", _sficheroerrores);Debug.locals.put("sFicheroErrores", _sficheroerrores);
 BA.debugLineNum = 4122;BA.debugLine="Dim NombreFicheroErrores As String=$\"Errores_${N";
Debug.ShouldStop(33554432);
_nombreficheroerrores = (RemoteObject.concat(RemoteObject.createImmutable("Errores_"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_numeropedido))),RemoteObject.createImmutable(".csv")));Debug.locals.put("NombreFicheroErrores", _nombreficheroerrores);Debug.locals.put("NombreFicheroErrores", _nombreficheroerrores);
 BA.debugLineNum = 4123;BA.debugLine="File.WriteString(CarpetaDestinoFicherosPedidosEr";
Debug.ShouldStop(67108864);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(true,"_carpetadestinoficherospedidoserrorrepsol" /*RemoteObject*/ )),(Object)(_nombreficheroerrores),(Object)(_sficheroerrores));
 BA.debugLineNum = 4124;BA.debugLine="If File.Exists(CarpetaDestinoFicherosPedidosErro";
Debug.ShouldStop(134217728);
if (true) break;

case 352:
//if
this.state = 355;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherospedidoserrorrepsol" /*RemoteObject*/ )),(Object)(_nombreficheroerrores)),parent.__c.getField(true,"False"))) { 
this.state = 354;
}if (true) break;

case 354:
//C
this.state = 355;
 BA.debugLineNum = 4125;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Fichero erro";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Fichero error aun no existe!!")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 4126;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero3"), _msa);
this.state = 393;
return;
case 393:
//C
this.state = 355;
;
 if (true) break;

case 355:
//C
this.state = 356;
;
 BA.debugLineNum = 4128;BA.debugLine="Log(File.Exists(CarpetaDestinoFicherosPedidosErr";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","835062648",BA.ObjectToString(parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherospedidoserrorrepsol" /*RemoteObject*/ )),(Object)(_nombreficheroerrores))),0);
 BA.debugLineNum = 4134;BA.debugLine="Dim RutaFTPFicheroPedidoErrores As String=ErrorF";
Debug.ShouldStop(32);
_rutaftpficheropedidoerrores = RemoteObject.concat(__ref.getField(true,"_errorfilesfoldersftprepsol" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_nombreficheroerrores);Debug.locals.put("RutaFTPFicheroPedidoErrores", _rutaftpficheropedidoerrores);Debug.locals.put("RutaFTPFicheroPedidoErrores", _rutaftpficheropedidoerrores);
 BA.debugLineNum = 4136;BA.debugLine="If File.Exists(CarpetaDestinoFicherosPedidosErro";
Debug.ShouldStop(128);
if (true) break;

case 356:
//if
this.state = 365;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherospedidoserrorrepsol" /*RemoteObject*/ )),(Object)(_nombreficheroerrores)).<Boolean>get().booleanValue()) { 
this.state = 358;
}if (true) break;

case 358:
//C
this.state = 359;
 BA.debugLineNum = 4137;BA.debugLine="wait for(SubirFicheroACarpetaFTP(CarpetaDestino";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero3"), __ref.runClassMethod (b4j.docU.crepsol.class, "_subirficheroacarpetaftp" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_carpetadestinoficherospedidoserrorrepsol" /*RemoteObject*/ )),(Object)(_nombreficheroerrores),(Object)(_rutaftpficheropedidoerrores)));
this.state = 394;
return;
case 394:
//C
this.state = 359;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 4138;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(512);
if (true) break;

case 359:
//if
this.state = 364;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 361;
}else {
this.state = 363;
}if (true) break;

case 361:
//C
this.state = 364;
 BA.debugLineNum = 4140;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Ha habido";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Ha habido un error en la subida del fichero de errores"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheroerrores))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("ATENCION!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 4141;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero3"), _msa);
this.state = 395;
return;
case 395:
//C
this.state = 364;
;
 BA.debugLineNum = 4142;BA.debugLine="CSVErroresSubidoOKFTP=False";
Debug.ShouldStop(8192);
_csverroressubidookftp = parent.__c.getField(true,"False");Debug.locals.put("CSVErroresSubidoOKFTP", _csverroressubidookftp);
 BA.debugLineNum = 4143;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 4144;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 363:
//C
this.state = 364;
 BA.debugLineNum = 4146;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Se ha subi";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Se ha subido el fichero de errores"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheroerrores))),RemoteObject.createImmutable(" correspondiente al fichero de pedido seleccionado.")))),(Object)(RemoteObject.createImmutable("ATENCION!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 4147;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero3"), _msa);
this.state = 396;
return;
case 396:
//C
this.state = 364;
;
 BA.debugLineNum = 4148;BA.debugLine="CSVErroresSubidoOKFTP=True";
Debug.ShouldStop(524288);
_csverroressubidookftp = parent.__c.getField(true,"True");Debug.locals.put("CSVErroresSubidoOKFTP", _csverroressubidookftp);
 BA.debugLineNum = 4151;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 if (true) break;

case 364:
//C
this.state = 365;
;
 if (true) break;

case 365:
//C
this.state = 366;
;
 if (true) break;

case 366:
//C
this.state = 367;
;
 BA.debugLineNum = 4158;BA.debugLine="Dim NumLineasSinError As Int=mSQL.ExecQuerySingle";
Debug.ShouldStop(536870912);
_numlineassinerror = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)((RemoteObject.createImmutable("select count(*) from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?"))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(0)}))))));Debug.locals.put("NumLineasSinError", _numlineassinerror);Debug.locals.put("NumLineasSinError", _numlineassinerror);
 BA.debugLineNum = 4159;BA.debugLine="Dim CSVsFicherosPedidosOK As Boolean=True";
Debug.ShouldStop(1073741824);
_csvsficherospedidosok = parent.__c.getField(true,"True");Debug.locals.put("CSVsFicherosPedidosOK", _csvsficherospedidosok);Debug.locals.put("CSVsFicherosPedidosOK", _csvsficherospedidosok);
 BA.debugLineNum = 4160;BA.debugLine="Dim NumPedidosIncluidosEnFichero As Int";
Debug.ShouldStop(-2147483648);
_numpedidosincluidosenfichero = RemoteObject.createImmutable(0);Debug.locals.put("NumPedidosIncluidosEnFichero", _numpedidosincluidosenfichero);
 BA.debugLineNum = 4161;BA.debugLine="Dim NumFicherosPedidosCSVCreadosEnServidor As Int";
Debug.ShouldStop(1);
_numficherospedidoscsvcreadosenservidor = RemoteObject.createImmutable(0);Debug.locals.put("NumFicherosPedidosCSVCreadosEnServidor", _numficherospedidoscsvcreadosenservidor);
 BA.debugLineNum = 4163;BA.debugLine="If NumLineasSinError>0 Then";
Debug.ShouldStop(4);
if (true) break;

case 367:
//if
this.state = 388;
if (RemoteObject.solveBoolean(">",_numlineassinerror,BA.numberCast(double.class, 0))) { 
this.state = 369;
}if (true) break;

case 369:
//C
this.state = 370;
 BA.debugLineNum = 4165;BA.debugLine="Dim lstHeaders As List=Array As String(\"Docuware";
Debug.ShouldStop(16);
_lstheaders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstheaders = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Docuware ID"),BA.ObjectToString("Usuario"),BA.ObjectToString("Cliente"),BA.ObjectToString("DireccionEnvio"),BA.ObjectToString("DocumentoExterno"),BA.ObjectToString("AlmacenOrigen"),BA.ObjectToString("FechaPedidoCliente"),BA.ObjectToString("Articulo"),BA.ObjectToString("ReferenciaCruzada"),BA.ObjectToString("Talla"),BA.ObjectToString("Cantidad"),RemoteObject.createImmutable("Precio")})));Debug.locals.put("lstHeaders", _lstheaders);Debug.locals.put("lstHeaders", _lstheaders);
 BA.debugLineNum = 4168;BA.debugLine="Dim CarpetaFicheroCSV As String=\"\\\\192.168.10.6\\";
Debug.ShouldStop(128);
_carpetaficherocsv = BA.ObjectToString("\\\\192.168.10.6\\PendientesNAV");Debug.locals.put("CarpetaFicheroCSV", _carpetaficherocsv);Debug.locals.put("CarpetaFicheroCSV", _carpetaficherocsv);
 BA.debugLineNum = 4170;BA.debugLine="Dim rsCabeceraPedidosLineasSinError As ResultSet";
Debug.ShouldStop(512);
_rscabecerapedidoslineassinerror = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rscabecerapedidoslineassinerror = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("select distinct CodigoClienteERP, CodigoDireccionEnvioERP, Sede, CodigoPedido, FechaPedido\n"),RemoteObject.createImmutable("			 from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?")))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(0)})))));Debug.locals.put("rsCabeceraPedidosLineasSinError", _rscabecerapedidoslineassinerror);Debug.locals.put("rsCabeceraPedidosLineasSinError", _rscabecerapedidoslineassinerror);
 BA.debugLineNum = 4172;BA.debugLine="Do While rsCabeceraPedidosLineasSinError.NextRow";
Debug.ShouldStop(2048);
if (true) break;

case 370:
//do while
this.state = 387;
while (_rscabecerapedidoslineassinerror.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 372;
if (true) break;
}
if (true) break;

case 372:
//C
this.state = 373;
 BA.debugLineNum = 4173;BA.debugLine="Dim UUIDPedido As String=Utilidades.GenerarUUID";
Debug.ShouldStop(4096);
_uuidpedido = parent._utilidades.runMethod(true,"_generaruuidv4" /*RemoteObject*/ );Debug.locals.put("UUIDPedido", _uuidpedido);Debug.locals.put("UUIDPedido", _uuidpedido);
 BA.debugLineNum = 4174;BA.debugLine="Dim IDPedido As String=$\"REPSOL_${UUIDPedido}\"$";
Debug.ShouldStop(8192);
_idpedido = (RemoteObject.concat(RemoteObject.createImmutable("REPSOL_"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uuidpedido))),RemoteObject.createImmutable("")));Debug.locals.put("IDPedido", _idpedido);Debug.locals.put("IDPedido", _idpedido);
 BA.debugLineNum = 4175;BA.debugLine="Dim NombreFicheroCSV As String=$\"${IDPedido}.cs";
Debug.ShouldStop(16384);
_nombreficherocsv = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idpedido))),RemoteObject.createImmutable(".csv")));Debug.locals.put("NombreFicheroCSV", _nombreficherocsv);Debug.locals.put("NombreFicheroCSV", _nombreficherocsv);
 BA.debugLineNum = 4176;BA.debugLine="Dim lstLineasPedidoVenta As List";
Debug.ShouldStop(32768);
_lstlineaspedidoventa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstLineasPedidoVenta", _lstlineaspedidoventa);
 BA.debugLineNum = 4177;BA.debugLine="lstLineasPedidoVenta.Initialize";
Debug.ShouldStop(65536);
_lstlineaspedidoventa.runVoidMethod ("Initialize");
 BA.debugLineNum = 4178;BA.debugLine="Dim CodigoClienteNAV As String=rsCabeceraPedido";
Debug.ShouldStop(131072);
_codigoclientenav = _rscabecerapedidoslineassinerror.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoClienteERP")));Debug.locals.put("CodigoClienteNAV", _codigoclientenav);Debug.locals.put("CodigoClienteNAV", _codigoclientenav);
 BA.debugLineNum = 4179;BA.debugLine="Dim CodigoDireccionEnvioNAV As String=rsCabecer";
Debug.ShouldStop(262144);
_codigodireccionenvionav = _rscabecerapedidoslineassinerror.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoDireccionEnvioERP")));Debug.locals.put("CodigoDireccionEnvioNAV", _codigodireccionenvionav);Debug.locals.put("CodigoDireccionEnvioNAV", _codigodireccionenvionav);
 BA.debugLineNum = 4180;BA.debugLine="Dim Sede As String=rsCabeceraPedidosLineasSinEr";
Debug.ShouldStop(524288);
_sede = _rscabecerapedidoslineassinerror.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Sede")));Debug.locals.put("Sede", _sede);Debug.locals.put("Sede", _sede);
 BA.debugLineNum = 4181;BA.debugLine="Dim CodigoPedido As String=rsCabeceraPedidosLin";
Debug.ShouldStop(1048576);
_codigopedido = _rscabecerapedidoslineassinerror.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoPedido")));Debug.locals.put("CodigoPedido", _codigopedido);Debug.locals.put("CodigoPedido", _codigopedido);
 BA.debugLineNum = 4182;BA.debugLine="Dim DocumentoExterno As String=Sede & CodigoPed";
Debug.ShouldStop(2097152);
_documentoexterno = RemoteObject.concat(_sede,_codigopedido);Debug.locals.put("DocumentoExterno", _documentoexterno);Debug.locals.put("DocumentoExterno", _documentoexterno);
 BA.debugLineNum = 4183;BA.debugLine="Dim FechaPedidoCliente As String=rsCabeceraPedi";
Debug.ShouldStop(4194304);
_fechapedidocliente = _rscabecerapedidoslineassinerror.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FechaPedido")));Debug.locals.put("FechaPedidoCliente", _fechapedidocliente);Debug.locals.put("FechaPedidoCliente", _fechapedidocliente);
 BA.debugLineNum = 4184;BA.debugLine="Dim FechaPedidoClienteNAV As String=FechaPedido";
Debug.ShouldStop(8388608);
_fechapedidoclientenav = _fechapedidocliente.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("FechaPedidoClienteNAV", _fechapedidoclientenav);Debug.locals.put("FechaPedidoClienteNAV", _fechapedidoclientenav);
 BA.debugLineNum = 4190;BA.debugLine="Dim rsLineasPedido As ResultSet=mSQL.ExecQuery2(";
Debug.ShouldStop(536870912);
_rslineaspedido = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rslineaspedido = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select CodigoProductoERP, TallaERP, sum(Cantidad) as TotalCantidad\n"),RemoteObject.createImmutable("			from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=? And CodigoClienteERP=? and CodigoDireccionEnvioERP=? and CodigoPedido=? and FechaPedido=?\n"),RemoteObject.createImmutable("			group by CodigoProductoERP,TallaERP")))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.NumberToString(0),_codigoclientenav,_codigodireccionenvionav,_codigopedido,_fechapedidocliente})))));Debug.locals.put("rsLineasPedido", _rslineaspedido);Debug.locals.put("rsLineasPedido", _rslineaspedido);
 BA.debugLineNum = 4195;BA.debugLine="Do While rsLineasPedido.NextRow";
Debug.ShouldStop(4);
if (true) break;

case 373:
//do while
this.state = 376;
while (_rslineaspedido.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 375;
if (true) break;
}
if (true) break;

case 375:
//C
this.state = 373;
 BA.debugLineNum = 4197;BA.debugLine="Dim Precio As Double=Utilidades.FixNullDouble(";
Debug.ShouldStop(16);
_precio = parent._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select PrecioUnitario from tblRepsolTarifaVentaGRP07506 where Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_rslineaspedido.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoProductoERP")))}))))))));Debug.locals.put("Precio", _precio);Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 4199;BA.debugLine="Dim ArrDatosLineaPedido(12) As String";
Debug.ShouldStop(64);
_arrdatoslineapedido = RemoteObject.createNewArray ("String", new int[] {12}, new Object[]{});Debug.locals.put("ArrDatosLineaPedido", _arrdatoslineapedido);
 BA.debugLineNum = 4200;BA.debugLine="ArrDatosLineaPedido(0)=$\"${UUIDPedido}\"$";
Debug.ShouldStop(128);
_arrdatoslineapedido.setArrayElement ((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uuidpedido))),RemoteObject.createImmutable(""))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 4202;BA.debugLine="ArrDatosLineaPedido(1)=\"PROIN\\SUSANA.DIEZ\"   '";
Debug.ShouldStop(512);
_arrdatoslineapedido.setArrayElement (BA.ObjectToString("PROIN\\SUSANA.DIEZ"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 4203;BA.debugLine="ArrDatosLineaPedido(2)=CodigoClienteNAV";
Debug.ShouldStop(1024);
_arrdatoslineapedido.setArrayElement (_codigoclientenav,BA.numberCast(int.class, 2));
 BA.debugLineNum = 4204;BA.debugLine="ArrDatosLineaPedido(3)=CodigoDireccionEnvioNAV";
Debug.ShouldStop(2048);
_arrdatoslineapedido.setArrayElement (_codigodireccionenvionav,BA.numberCast(int.class, 3));
 BA.debugLineNum = 4205;BA.debugLine="ArrDatosLineaPedido(4)=DocumentoExterno";
Debug.ShouldStop(4096);
_arrdatoslineapedido.setArrayElement (_documentoexterno,BA.numberCast(int.class, 4));
 BA.debugLineNum = 4206;BA.debugLine="ArrDatosLineaPedido(5)=\"0299\"";
Debug.ShouldStop(8192);
_arrdatoslineapedido.setArrayElement (BA.ObjectToString("0299"),BA.numberCast(int.class, 5));
 BA.debugLineNum = 4207;BA.debugLine="ArrDatosLineaPedido(6)=FechaPedidoClienteNAV";
Debug.ShouldStop(16384);
_arrdatoslineapedido.setArrayElement (_fechapedidoclientenav,BA.numberCast(int.class, 6));
 BA.debugLineNum = 4208;BA.debugLine="ArrDatosLineaPedido(7)=rsLineasPedido.GetStrin";
Debug.ShouldStop(32768);
_arrdatoslineapedido.setArrayElement (_rslineaspedido.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoProductoERP"))),BA.numberCast(int.class, 7));
 BA.debugLineNum = 4209;BA.debugLine="ArrDatosLineaPedido(8)=\"\"";
Debug.ShouldStop(65536);
_arrdatoslineapedido.setArrayElement (BA.ObjectToString(""),BA.numberCast(int.class, 8));
 BA.debugLineNum = 4210;BA.debugLine="ArrDatosLineaPedido(9)=rsLineasPedido.GetStrin";
Debug.ShouldStop(131072);
_arrdatoslineapedido.setArrayElement (_rslineaspedido.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TallaERP"))),BA.numberCast(int.class, 9));
 BA.debugLineNum = 4211;BA.debugLine="ArrDatosLineaPedido(10)=rsLineasPedido.GetInt(";
Debug.ShouldStop(262144);
_arrdatoslineapedido.setArrayElement (BA.NumberToString(_rslineaspedido.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("TotalCantidad")))),BA.numberCast(int.class, 10));
 BA.debugLineNum = 4212;BA.debugLine="ArrDatosLineaPedido(11)=Precio";
Debug.ShouldStop(524288);
_arrdatoslineapedido.setArrayElement (BA.NumberToString(_precio),BA.numberCast(int.class, 11));
 BA.debugLineNum = 4214;BA.debugLine="lstLineasPedidoVenta.Add(ArrDatosLineaPedido)";
Debug.ShouldStop(2097152);
_lstlineaspedidoventa.runVoidMethod ("Add",(Object)((_arrdatoslineapedido)));
 if (true) break;

case 376:
//C
this.state = 377;
;
 BA.debugLineNum = 4218;BA.debugLine="rsLineasPedido.Close";
Debug.ShouldStop(33554432);
_rslineaspedido.runVoidMethod ("Close");
 BA.debugLineNum = 4222;BA.debugLine="If lstLineasPedidoVenta.Size>0 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 377:
//if
this.state = 386;
if (RemoteObject.solveBoolean(">",_lstlineaspedidoventa.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 379;
}if (true) break;

case 379:
//C
this.state = 380;
 BA.debugLineNum = 4223;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(1073741824);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 4224;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 380:
//try
this.state = 385;
this.catchState = 384;
this.state = 382;
if (true) break;

case 382:
//C
this.state = 385;
this.catchState = 384;
 BA.debugLineNum = 4225;BA.debugLine="su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCS";
Debug.ShouldStop(1);
_su.runVoidMethod ("SaveCSV2",(Object)(_carpetaficherocsv),(Object)(_nombreficherocsv),(Object)(BA.ObjectToChar(";")),(Object)(_lstlineaspedidoventa),(Object)(_lstheaders));
 BA.debugLineNum = 4226;BA.debugLine="NumFicherosPedidosCSVCreadosEnServidor=NumFic";
Debug.ShouldStop(2);
_numficherospedidoscsvcreadosenservidor = RemoteObject.solve(new RemoteObject[] {_numficherospedidoscsvcreadosenservidor,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumFicherosPedidosCSVCreadosEnServidor", _numficherospedidoscsvcreadosenservidor);
 Debug.CheckDeviceExceptions();
if (true) break;

case 384:
//C
this.state = 385;
this.catchState = 0;
 BA.debugLineNum = 4241;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","835062761",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 4242;BA.debugLine="CSVsFicherosPedidosOK=False";
Debug.ShouldStop(131072);
_csvsficherospedidosok = parent.__c.getField(true,"False");Debug.locals.put("CSVsFicherosPedidosOK", _csvsficherospedidosok);
 if (true) break;
if (true) break;

case 385:
//C
this.state = 386;
this.catchState = 0;
;
 BA.debugLineNum = 4248;BA.debugLine="NumPedidosIncluidosEnFichero=NumPedidosIncluid";
Debug.ShouldStop(8388608);
_numpedidosincluidosenfichero = RemoteObject.solve(new RemoteObject[] {_numpedidosincluidosenfichero,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumPedidosIncluidosEnFichero", _numpedidosincluidosenfichero);
 if (true) break;

case 386:
//C
this.state = 370;
;
 if (true) break;

case 387:
//C
this.state = 388;
;
 BA.debugLineNum = 4252;BA.debugLine="rsCabeceraPedidosLineasSinError.close";
Debug.ShouldStop(134217728);
_rscabecerapedidoslineassinerror.runVoidMethod ("Close");
 if (true) break;

case 388:
//C
this.state = -1;
;
 BA.debugLineNum = 4256;BA.debugLine="jamLoadingIndicator1.DetenerControlTiempoProceso";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_detenercontroltiempoproceso" /*RemoteObject*/ );
 BA.debugLineNum = 4257;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 4259;BA.debugLine="Dim BodyEmailInfoProceso As String=$\" 		<b>Número";
Debug.ShouldStop(4);
_bodyemailinfoproceso = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		<b>Número de errores: </b> "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(((RemoteObject.solveBoolean("=",_numlineasconerror,BA.numberCast(double.class, 0))) ? (RemoteObject.createImmutable(("OK, SIN ERRORES"))) : ((_numlineasconerror))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		<b>CSV Errores subido a FTP REPSOL: </b> "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(((RemoteObject.solveBoolean("=",_numlineasconerror,BA.numberCast(double.class, 0))) ? (RemoteObject.createImmutable(("No necesario"))) : (((_csverroressubidookftp.<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable(("SI, OK"))) : ((RemoteObject.createImmutable("NO, ERROR")))))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		<b>Número de Pedidos incluidos en Fichero Pedido Repsol ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheroorigen))),RemoteObject.createImmutable(") : </b> "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(((RemoteObject.solveBoolean("=",_numpedidosincluidosenfichero,BA.numberCast(double.class, 0))) ? (RemoteObject.createImmutable(("FICHERO SIN PEDIDOS, OK"))) : ((_numpedidosincluidosenfichero))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		<b>Proceso generación Ficheros CSV de pedidos de venta: </b> "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(((RemoteObject.solveBoolean("=",_numpedidosincluidosenfichero,BA.numberCast(double.class, 0))) ? (RemoteObject.createImmutable(("No necesario"))) : (((_csvsficherospedidosok.<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable(("OK"))) : ((RemoteObject.createImmutable("ATENCION, PROCESO CON ERRORES")))))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		<b>Número de Ficheros CSV creados en nuestro Servidor : </b> "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(((RemoteObject.solveBoolean("=",_numpedidosincluidosenfichero,BA.numberCast(double.class, 0))) ? (RemoteObject.createImmutable(("SIN PEDIDOS PARA GENERAR CSVs"))) : ((_numficherospedidoscsvcreadosenservidor))))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		")));Debug.locals.put("BodyEmailInfoProceso", _bodyemailinfoproceso);Debug.locals.put("BodyEmailInfoProceso", _bodyemailinfoproceso);
 BA.debugLineNum = 4267;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(1024);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 4268;BA.debugLine="DateTime.DateFormat=\"dd-MM-yyyy\"";
Debug.ShouldStop(2048);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 4269;BA.debugLine="Wait For(EnviarEmailAviso(False,$\"Información Pro";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero3"), __ref.runClassMethod (b4j.docU.crepsol.class, "_enviaremailaviso" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Información Proceso Pedidos OnLine Repsol "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("datetime")),(Object)((parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")))),(Object)(_bodyemailinfoproceso)));
this.state = 397;
return;
case 397:
//C
this.state = -1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 4271;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(16384);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 4457;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 4458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _sql_nonquerycomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _procesarfichero4(RemoteObject __ref,RemoteObject _carpetaficheroorigen,RemoteObject _nombreficheroorigen,RemoteObject _carpetadestinofichero,RemoteObject _nombreficherodestino) throws Exception{
try {
		Debug.PushSubsStack("ProcesarFichero4 (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,4639);
if (RapidSub.canDelegate("procesarfichero4")) { return __ref.runUserSub(false, "crepsol","procesarfichero4", __ref, _carpetaficheroorigen, _nombreficheroorigen, _carpetadestinofichero, _nombreficherodestino);}
ResumableSub_ProcesarFichero4 rsub = new ResumableSub_ProcesarFichero4(null,__ref,_carpetaficheroorigen,_nombreficheroorigen,_carpetadestinofichero,_nombreficherodestino);
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
public static class ResumableSub_ProcesarFichero4 extends BA.ResumableSub {
public ResumableSub_ProcesarFichero4(b4j.docU.crepsol parent,RemoteObject __ref,RemoteObject _carpetaficheroorigen,RemoteObject _nombreficheroorigen,RemoteObject _carpetadestinofichero,RemoteObject _nombreficherodestino) {
this.parent = parent;
this.__ref = __ref;
this._carpetaficheroorigen = _carpetaficheroorigen;
this._nombreficheroorigen = _nombreficheroorigen;
this._carpetadestinofichero = _carpetadestinofichero;
this._nombreficherodestino = _nombreficherodestino;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _carpetaficheroorigen;
RemoteObject _nombreficheroorigen;
RemoteObject _carpetadestinofichero;
RemoteObject _nombreficherodestino;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mdataconn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstlineasfichero = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tr = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
RemoteObject _dniempleadosel = RemoteObject.createImmutable("");
RemoteObject _idxfila = RemoteObject.createImmutable(0);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _slinea = RemoteObject.createImmutable("");
RemoteObject _numcharlinea = RemoteObject.createImmutable(0);
RemoteObject _csvline = null;
RemoteObject _numlinea = RemoteObject.createImmutable("");
RemoteObject _tipolinea = RemoteObject.createImmutable(0);
RemoteObject _lineanumeropedido = RemoteObject.createImmutable("");
RemoteObject _arrlineanumeropedido = null;
RemoteObject _numeropedido = RemoteObject.createImmutable("");
RemoteObject _datoslineapedido = RemoteObject.declareNull("b4j.docU.crepsol._tipodatoslineapedidorepsol");
RemoteObject _idsedeempresa = RemoteObject.createImmutable("");
RemoteObject _numeropedidoestacion = RemoteObject.createImmutable("");
RemoteObject _fechapedido = RemoteObject.createImmutable("");
RemoteObject _fechapedidolong = RemoteObject.createImmutable(0L);
RemoteObject _nombreestacion = RemoteObject.createImmutable("");
RemoteObject _calle = RemoteObject.createImmutable("");
RemoteObject _codigopostal = RemoteObject.createImmutable("");
RemoteObject _poblacion = RemoteObject.createImmutable("");
RemoteObject _codigoprovincia = RemoteObject.createImmutable("");
RemoteObject _telefono = RemoteObject.createImmutable("");
RemoteObject _stipoestacion = RemoteObject.createImmutable("");
RemoteObject _tipoestacion = RemoteObject.createImmutable("");
RemoteObject _marca = RemoteObject.createImmutable("");
RemoteObject _dni = RemoteObject.createImmutable("");
RemoteObject _dniempleadoselok = RemoteObject.createImmutable(false);
RemoteObject _nombreempleado = RemoteObject.createImmutable("");
RemoteObject _scargo = RemoteObject.createImmutable("");
RemoteObject _ssexoempleado = RemoteObject.createImmutable("");
RemoteObject _sembarazoempleado = RemoteObject.createImmutable("");
RemoteObject _codigoprenda = RemoteObject.createImmutable("");
RemoteObject _nummapeocodigoprenda = RemoteObject.createImmutable(0);
RemoteObject _talla = RemoteObject.createImmutable("");
RemoteObject _cantidad = RemoteObject.createImmutable(0);
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _numlineasconerror = RemoteObject.createImmutable(0);
RemoteObject _rssedepedidodni = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _sede = RemoteObject.createImmutable("");
RemoteObject _pedidosede = RemoteObject.createImmutable("");
RemoteObject _errorlongitudlineacabeceraestacion = RemoteObject.createImmutable(false);
RemoteObject _errorsede = RemoteObject.createImmutable(false);
RemoteObject _errorfechapedido = RemoteObject.createImmutable(false);
RemoteObject _errormarca = RemoteObject.createImmutable(false);
RemoteObject _errorlongitudlineaempleado = RemoteObject.createImmutable(false);
RemoteObject _errordni = RemoteObject.createImmutable(false);
RemoteObject _errorcargo = RemoteObject.createImmutable(false);
RemoteObject _errorsexo = RemoteObject.createImmutable(false);
RemoteObject _errorembarazo = RemoteObject.createImmutable(false);
RemoteObject _errorlongitudlineaproducto = RemoteObject.createImmutable(false);
RemoteObject _errorcodigoprenda = RemoteObject.createImmutable(false);
RemoteObject _errorcodigoproductoerp = RemoteObject.createImmutable(false);
RemoteObject _errortalla = RemoteObject.createImmutable(false);
RemoteObject _errorcantidad = RemoteObject.createImmutable(false);
RemoteObject _rslineassedepedidodni = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _sbtextoerror = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _lsterrores = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstencabezadoserrores = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sficheroerrores = RemoteObject.createImmutable("");
RemoteObject _nombreficheroerrores = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rutaftpficheropedidoerrores = RemoteObject.createImmutable("");
RemoteObject _numlineassinerror = RemoteObject.createImmutable(0);
RemoteObject _lstheaders = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _carpetaficherocsv = RemoteObject.createImmutable("");
RemoteObject _rscabecerapedidoslineassinerror = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _uuidpedido = RemoteObject.createImmutable("");
RemoteObject _idpedido = RemoteObject.createImmutable("");
RemoteObject _nombreficherocsv = RemoteObject.createImmutable("");
RemoteObject _lstlineaspedidoventa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _codigoclientenav = RemoteObject.createImmutable("");
RemoteObject _codigodireccionenvionav = RemoteObject.createImmutable("");
RemoteObject _codigopedido = RemoteObject.createImmutable("");
RemoteObject _documentoexterno = RemoteObject.createImmutable("");
RemoteObject _fechapedidocliente = RemoteObject.createImmutable("");
RemoteObject _fechapedidoclientenav = RemoteObject.createImmutable("");
RemoteObject _rslineaspedido = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _precio = RemoteObject.createImmutable(0);
RemoteObject _arrdatoslineapedido = null;
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject group29;
int index29;
int groupLen29;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ProcesarFichero4 (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,4639);
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
Debug.locals.put("_ref", __ref);
Debug.locals.put("CarpetaFicheroOrigen", _carpetaficheroorigen);
Debug.locals.put("NombreFicheroOrigen", _nombreficheroorigen);
Debug.locals.put("CarpetaDestinoFichero", _carpetadestinofichero);
Debug.locals.put("NombreFicheroDestino", _nombreficherodestino);
 BA.debugLineNum = 4641;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando con";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando configuración FTP...")));
 BA.debugLineNum = 4642;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 4644;BA.debugLine="Wait For(CargaDatosConnSFTP) complete (mRes As Ma";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero4"), __ref.runClassMethod (b4j.docU.crepsol.class, "_cargadatosconnsftp" /*RemoteObject*/ ));
this.state = 389;
return;
case 389:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 4645;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(16);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 4646;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 4647;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(64);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 4648;BA.debugLine="SalirModulo";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.crepsol.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 4649;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 4651;BA.debugLine="Dim mDataConn As Map=mRes.Get(\"mDataConn\")";
Debug.ShouldStop(1024);
_mdataconn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataconn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mDataConn")))));Debug.locals.put("mDataConn", _mdataconn);Debug.locals.put("mDataConn", _mdataconn);
 BA.debugLineNum = 4654;BA.debugLine="sFtpRepsol.Initialize(\"sFtpRepsol\", mDataConn.Get";
Debug.ShouldStop(8192);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("sFtpRepsol")),(Object)(BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString2")))))),(Object)(BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString3")))))),(Object)(BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString1")))))),(Object)(BA.numberCast(int.class, _mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoInt1")))))));
 BA.debugLineNum = 4655;BA.debugLine="FilesFoldersFtpRepsol=mDataConn.Get(\"CampoString4";
Debug.ShouldStop(16384);
__ref.setField ("_filesfoldersftprepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString4"))))));
 BA.debugLineNum = 4656;BA.debugLine="ErrorFilesFoldersFtpRepsol=mDataConn.Get(\"CampoSt";
Debug.ShouldStop(32768);
__ref.setField ("_errorfilesfoldersftprepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdataconn.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString5"))))));
 BA.debugLineNum = 4658;BA.debugLine="sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder,";
Debug.ShouldStop(131072);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("SetKnownHostsStore",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("aJma.txt")));
 BA.debugLineNum = 4660;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolLineasFic";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblRepsolLineasFicheroPedido")));
 BA.debugLineNum = 4661;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolErroresSe";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblRepsolErroresSedePedidoDNIFicheroPedido")));
 BA.debugLineNum = 4663;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Procesando f";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Procesando fichero...")));
 BA.debugLineNum = 4664;BA.debugLine="jamLoadingIndicator1.IniciarControlTiempoProceso";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_iniciarcontroltiempoproceso" /*RemoteObject*/ );
 BA.debugLineNum = 4665;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 4667;BA.debugLine="Dim lstLineasFichero As List";
Debug.ShouldStop(67108864);
_lstlineasfichero = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstLineasFichero", _lstlineasfichero);
 BA.debugLineNum = 4668;BA.debugLine="lstLineasFichero.Initialize";
Debug.ShouldStop(134217728);
_lstlineasfichero.runVoidMethod ("Initialize");
 BA.debugLineNum = 4672;BA.debugLine="Dim tr As TextReader";
Debug.ShouldStop(-2147483648);
_tr = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");Debug.locals.put("tr", _tr);
 BA.debugLineNum = 4674;BA.debugLine="tr.Initialize2(File.OpenInput(CarpetaFicheroOrige";
Debug.ShouldStop(2);
_tr.runVoidMethod ("Initialize2",(Object)((parent.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_carpetaficheroorigen),(Object)(_nombreficheroorigen)).getObject())),(Object)(RemoteObject.createImmutable("UTF-8")));
 BA.debugLineNum = 4675;BA.debugLine="lstLineasFichero=tr.ReadList";
Debug.ShouldStop(4);
_lstlineasfichero = _tr.runMethod(false,"ReadList");Debug.locals.put("lstLineasFichero", _lstlineasfichero);
 BA.debugLineNum = 4685;BA.debugLine="Dim DNIEmpleadoSel As String";
Debug.ShouldStop(4096);
_dniempleadosel = RemoteObject.createImmutable("");Debug.locals.put("DNIEmpleadoSel", _dniempleadosel);
 BA.debugLineNum = 4687;BA.debugLine="Dim idxFila As Int=1";
Debug.ShouldStop(16384);
_idxfila = BA.numberCast(int.class, 1);Debug.locals.put("idxFila", _idxfila);Debug.locals.put("idxFila", _idxfila);
 BA.debugLineNum = 4689;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(65536);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 4690;BA.debugLine="DateTime.DateFormat=\"dd-MM-yyyy\"";
Debug.ShouldStop(131072);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 4692;BA.debugLine="For Each sLinea As String In lstLineasFichero";
Debug.ShouldStop(524288);
if (true) break;

case 5:
//for
this.state = 162;
group29 = _lstlineasfichero;
index29 = 0;
groupLen29 = group29.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("sLinea", _slinea);
this.state = 390;
if (true) break;

case 390:
//C
this.state = 162;
if (index29 < groupLen29) {
this.state = 7;
_slinea = BA.ObjectToString(group29.runMethod(false,"Get",index29));Debug.locals.put("sLinea", _slinea);}
if (true) break;

case 391:
//C
this.state = 390;
index29++;
Debug.locals.put("sLinea", _slinea);
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 4697;BA.debugLine="Dim NumCharLinea As Int=sLinea.Length";
Debug.ShouldStop(16777216);
_numcharlinea = _slinea.runMethod(true,"length");Debug.locals.put("NumCharLinea", _numcharlinea);Debug.locals.put("NumCharLinea", _numcharlinea);
 BA.debugLineNum = 4699;BA.debugLine="Dim csvLine(20) As Object";
Debug.ShouldStop(67108864);
_csvline = RemoteObject.createNewArray ("Object", new int[] {20}, new Object[]{});Debug.locals.put("csvLine", _csvline);
 BA.debugLineNum = 4701;BA.debugLine="If NumCharLinea<6 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("<",_numcharlinea,BA.numberCast(double.class, 6))) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 4703;BA.debugLine="mSQL.AddNonQueryToBatch($\"insert into tblRepsol";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)((RemoteObject.createImmutable("insert into tblRepsolLineasFicheroPedido (IDxFila, LineaConError) values (?,?)"))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_idxfila),RemoteObject.createImmutable((1))})))));
 BA.debugLineNum = 4704;BA.debugLine="Continue";
Debug.ShouldStop(-2147483648);
this.state = 391;
if (true) break;;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 4706;BA.debugLine="Dim NumLinea As String=sLinea.SubString2(0,6)";
Debug.ShouldStop(2);
_numlinea = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 6)));Debug.locals.put("NumLinea", _numlinea);Debug.locals.put("NumLinea", _numlinea);
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 4711;BA.debugLine="csvLine(0)=NumLinea";
Debug.ShouldStop(64);
_csvline.setArrayElement ((_numlinea),BA.numberCast(int.class, 0));
 BA.debugLineNum = 4713;BA.debugLine="Dim TipoLinea As Int=sLinea.SubString2(6,7)";
Debug.ShouldStop(256);
_tipolinea = BA.numberCast(int.class, _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 6)),(Object)(BA.numberCast(int.class, 7))));Debug.locals.put("TipoLinea", _tipolinea);Debug.locals.put("TipoLinea", _tipolinea);
 BA.debugLineNum = 4714;BA.debugLine="csvLine(2)=TipoLinea";
Debug.ShouldStop(512);
_csvline.setArrayElement ((_tipolinea),BA.numberCast(int.class, 2));
 BA.debugLineNum = 4716;BA.debugLine="Select Case TipoLinea";
Debug.ShouldStop(2048);
if (true) break;

case 14:
//select
this.state = 161;
switch (BA.switchObjectToInt(_tipolinea,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 9))) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 41;
if (true) break;
}
case 3: {
this.state = 75;
if (true) break;
}
case 4: {
this.state = 158;
if (true) break;
}
default: {
this.state = 160;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 161;
 BA.debugLineNum = 4719;BA.debugLine="Dim LineaNumeroPedido As String=sLinea.SubStri";
Debug.ShouldStop(16384);
_lineanumeropedido = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 7)));Debug.locals.put("LineaNumeroPedido", _lineanumeropedido);Debug.locals.put("LineaNumeroPedido", _lineanumeropedido);
 BA.debugLineNum = 4720;BA.debugLine="Dim ArrLineaNumeroPedido() As String=Regex.Spl";
Debug.ShouldStop(32768);
_arrlineanumeropedido = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(".TXT")),(Object)(_lineanumeropedido));Debug.locals.put("ArrLineaNumeroPedido", _arrlineanumeropedido);Debug.locals.put("ArrLineaNumeroPedido", _arrlineanumeropedido);
 BA.debugLineNum = 4721;BA.debugLine="Dim NumeroPedido As String=ArrLineaNumeroPedid";
Debug.ShouldStop(65536);
_numeropedido = _arrlineanumeropedido.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("NumeroPedido", _numeropedido);Debug.locals.put("NumeroPedido", _numeropedido);
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 4724;BA.debugLine="Dim DatosLineaPedido As TipoDatosLineaPedidoRe";
Debug.ShouldStop(524288);
_datoslineapedido = RemoteObject.createNew ("b4j.docU.crepsol._tipodatoslineapedidorepsol");Debug.locals.put("DatosLineaPedido", _datoslineapedido);
 BA.debugLineNum = 4725;BA.debugLine="DatosLineaPedido.Initialize";
Debug.ShouldStop(1048576);
_datoslineapedido.runVoidMethod ("Initialize");
 BA.debugLineNum = 4726;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
Debug.ShouldStop(2097152);
_datoslineapedido.setField ("Linea" /*RemoteObject*/ ,_numlinea);
 BA.debugLineNum = 4729;BA.debugLine="If NumCharLinea<>236 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("!",_numcharlinea,BA.numberCast(double.class, 236))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 4732;BA.debugLine="DatosLineaPedido.ErrorLongitudLineaCabeceraEs";
Debug.ShouldStop(134217728);
_datoslineapedido.setField ("ErrorLongitudLineaCabeceraEstacion" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 4737;BA.debugLine="Dim IDSedeEmpresa As String=sLinea.SubString2";
Debug.ShouldStop(1);
_idsedeempresa = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 15)));Debug.locals.put("IDSedeEmpresa", _idsedeempresa);Debug.locals.put("IDSedeEmpresa", _idsedeempresa);
 BA.debugLineNum = 4738;BA.debugLine="DatosLineaPedido.Sede=IDSedeEmpresa";
Debug.ShouldStop(2);
_datoslineapedido.setField ("Sede" /*RemoteObject*/ ,_idsedeempresa);
 BA.debugLineNum = 4739;BA.debugLine="DatosLineaPedido.CodigoClienteERP=Utilidades.";
Debug.ShouldStop(4);
_datoslineapedido.setField ("CodigoClienteERP" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select CodigoClienteNAV from tblRepsolMapeoSedesEESS where Sede=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_datoslineapedido.getField(true,"Sede" /*RemoteObject*/ ))})))))))));
 BA.debugLineNum = 4740;BA.debugLine="DatosLineaPedido.ErrorSede=IIf(DatosLineaPedi";
Debug.ShouldStop(8);
_datoslineapedido.setField ("ErrorSede" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"CodigoClienteERP" /*RemoteObject*/ ),BA.ObjectToString(""))) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 4741;BA.debugLine="DatosLineaPedido.CodigoDireccionEnvioERP=Util";
Debug.ShouldStop(16);
_datoslineapedido.setField ("CodigoDireccionEnvioERP" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select CodigoDireccionEnvioNAV from tblRepsolMapeoSedesEESS where Sede=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_datoslineapedido.getField(true,"Sede" /*RemoteObject*/ ))})))))))));
 BA.debugLineNum = 4742;BA.debugLine="DatosLineaPedido.ErrorSede=IIf(DatosLineaPedi";
Debug.ShouldStop(32);
_datoslineapedido.setField ("ErrorSede" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"CodigoDireccionEnvioERP" /*RemoteObject*/ ),BA.ObjectToString(""))) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 4744;BA.debugLine="Dim NumeroPedidoEstacion As String=sLinea.Sub";
Debug.ShouldStop(128);
_numeropedidoestacion = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 15)),(Object)(BA.numberCast(int.class, 19)));Debug.locals.put("NumeroPedidoEstacion", _numeropedidoestacion);Debug.locals.put("NumeroPedidoEstacion", _numeropedidoestacion);
 BA.debugLineNum = 4745;BA.debugLine="DatosLineaPedido.CodigoPedido=NumeroPedidoEst";
Debug.ShouldStop(256);
_datoslineapedido.setField ("CodigoPedido" /*RemoteObject*/ ,_numeropedidoestacion);
 BA.debugLineNum = 4747;BA.debugLine="Dim FechaPedido As String=sLinea.SubString2(1";
Debug.ShouldStop(1024);
_fechapedido = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 19)),(Object)(BA.numberCast(int.class, 29)));Debug.locals.put("FechaPedido", _fechapedido);Debug.locals.put("FechaPedido", _fechapedido);
 BA.debugLineNum = 4748;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

case 23:
//try
this.state = 28;
this.catchState = 27;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 28;
this.catchState = 27;
 BA.debugLineNum = 4749;BA.debugLine="Dim FechaPedidoLong As Long=DateTime.DatePar";
Debug.ShouldStop(4096);
_fechapedidolong = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_fechapedido));Debug.locals.put("FechaPedidoLong", _fechapedidolong);Debug.locals.put("FechaPedidoLong", _fechapedidolong);
 BA.debugLineNum = 4750;BA.debugLine="DatosLineaPedido.FechaPedido=FechaPedido";
Debug.ShouldStop(8192);
_datoslineapedido.setField ("FechaPedido" /*RemoteObject*/ ,_fechapedido);
 BA.debugLineNum = 4751;BA.debugLine="DatosLineaPedido.ErrorFechaPedido=0";
Debug.ShouldStop(16384);
_datoslineapedido.setField ("ErrorFechaPedido" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 Debug.CheckDeviceExceptions();
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
 BA.debugLineNum = 4755;BA.debugLine="DatosLineaPedido.ErrorFechaPedido=1";
Debug.ShouldStop(262144);
_datoslineapedido.setField ("ErrorFechaPedido" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 0;
;
 BA.debugLineNum = 4759;BA.debugLine="Dim NombreEstacion As String=sLinea.SubString";
Debug.ShouldStop(4194304);
_nombreestacion = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 29)),(Object)(BA.numberCast(int.class, 94)));Debug.locals.put("NombreEstacion", _nombreestacion);Debug.locals.put("NombreEstacion", _nombreestacion);
 BA.debugLineNum = 4760;BA.debugLine="DatosLineaPedido.NombreEstacion=NombreEstacio";
Debug.ShouldStop(8388608);
_datoslineapedido.setField ("NombreEstacion" /*RemoteObject*/ ,_nombreestacion);
 BA.debugLineNum = 4762;BA.debugLine="Dim Calle As String=sLinea.SubString2(94,159)";
Debug.ShouldStop(33554432);
_calle = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 94)),(Object)(BA.numberCast(int.class, 159)));Debug.locals.put("Calle", _calle);Debug.locals.put("Calle", _calle);
 BA.debugLineNum = 4763;BA.debugLine="DatosLineaPedido.Calle=Calle";
Debug.ShouldStop(67108864);
_datoslineapedido.setField ("Calle" /*RemoteObject*/ ,_calle);
 BA.debugLineNum = 4765;BA.debugLine="Dim CodigoPostal As String=sLinea.SubString2(";
Debug.ShouldStop(268435456);
_codigopostal = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 159)),(Object)(BA.numberCast(int.class, 164)));Debug.locals.put("CodigoPostal", _codigopostal);Debug.locals.put("CodigoPostal", _codigopostal);
 BA.debugLineNum = 4766;BA.debugLine="DatosLineaPedido.CodigoPostal=CodigoPostal";
Debug.ShouldStop(536870912);
_datoslineapedido.setField ("CodigoPostal" /*RemoteObject*/ ,_codigopostal);
 BA.debugLineNum = 4768;BA.debugLine="Dim Poblacion As String=sLinea.SubString2(164";
Debug.ShouldStop(-2147483648);
_poblacion = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 164)),(Object)(BA.numberCast(int.class, 194)));Debug.locals.put("Poblacion", _poblacion);Debug.locals.put("Poblacion", _poblacion);
 BA.debugLineNum = 4769;BA.debugLine="DatosLineaPedido.Poblacion=Poblacion";
Debug.ShouldStop(1);
_datoslineapedido.setField ("Poblacion" /*RemoteObject*/ ,_poblacion);
 BA.debugLineNum = 4771;BA.debugLine="Dim CodigoProvincia As String=sLinea.SubStrin";
Debug.ShouldStop(4);
_codigoprovincia = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 194)),(Object)(BA.numberCast(int.class, 196)));Debug.locals.put("CodigoProvincia", _codigoprovincia);Debug.locals.put("CodigoProvincia", _codigoprovincia);
 BA.debugLineNum = 4772;BA.debugLine="DatosLineaPedido.CodigoProvincia=CodigoProvin";
Debug.ShouldStop(8);
_datoslineapedido.setField ("CodigoProvincia" /*RemoteObject*/ ,_codigoprovincia);
 BA.debugLineNum = 4774;BA.debugLine="Dim Telefono As String=sLinea.SubString2(196,";
Debug.ShouldStop(32);
_telefono = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 196)),(Object)(BA.numberCast(int.class, 211)));Debug.locals.put("Telefono", _telefono);Debug.locals.put("Telefono", _telefono);
 BA.debugLineNum = 4775;BA.debugLine="DatosLineaPedido.Telefono=Telefono";
Debug.ShouldStop(64);
_datoslineapedido.setField ("Telefono" /*RemoteObject*/ ,_telefono);
 BA.debugLineNum = 4777;BA.debugLine="Dim sTipoEstacion As String=sLinea.SubString2";
Debug.ShouldStop(256);
_stipoestacion = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 211)),(Object)(BA.numberCast(int.class, 226)));Debug.locals.put("sTipoEstacion", _stipoestacion);Debug.locals.put("sTipoEstacion", _stipoestacion);
 BA.debugLineNum = 4778;BA.debugLine="Dim TipoEstacion As String=sTipoEstacion";
Debug.ShouldStop(512);
_tipoestacion = _stipoestacion;Debug.locals.put("TipoEstacion", _tipoestacion);Debug.locals.put("TipoEstacion", _tipoestacion);
 BA.debugLineNum = 4788;BA.debugLine="DatosLineaPedido.TipoEstacion=TipoEstacion";
Debug.ShouldStop(524288);
_datoslineapedido.setField ("TipoEstacion" /*RemoteObject*/ ,_tipoestacion);
 BA.debugLineNum = 4791;BA.debugLine="Try";
Debug.ShouldStop(4194304);
if (true) break;

case 29:
//try
this.state = 34;
this.catchState = 33;
this.state = 31;
if (true) break;

case 31:
//C
this.state = 34;
this.catchState = 33;
 BA.debugLineNum = 4792;BA.debugLine="Dim Marca As String=sLinea.SubString2(226,236";
Debug.ShouldStop(8388608);
_marca = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 226)),(Object)(BA.numberCast(int.class, 236))).runMethod(true,"trim").runMethod(true,"toUpperCase");Debug.locals.put("Marca", _marca);Debug.locals.put("Marca", _marca);
 Debug.CheckDeviceExceptions();
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
 BA.debugLineNum = 4794;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","835389595",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 4795;BA.debugLine="Dim Marca As String=sLinea.SubString2(226,Num";
Debug.ShouldStop(67108864);
_marca = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 226)),(Object)(_numcharlinea)).runMethod(true,"trim").runMethod(true,"toUpperCase");Debug.locals.put("Marca", _marca);Debug.locals.put("Marca", _marca);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 4798;BA.debugLine="If Not(Marca=\"REPSOL\" Or Marca=\"CAMPSA\" Or Ma";
Debug.ShouldStop(536870912);

case 34:
//if
this.state = 39;
this.catchState = 0;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_marca,BA.ObjectToString("REPSOL")) || RemoteObject.solveBoolean("=",_marca,BA.ObjectToString("CAMPSA")) || RemoteObject.solveBoolean("=",_marca,RemoteObject.createImmutable("PETRONOR"))))).<Boolean>get().booleanValue()) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
 BA.debugLineNum = 4799;BA.debugLine="DatosLineaPedido.ErrorMarca=1";
Debug.ShouldStop(1073741824);
_datoslineapedido.setField ("ErrorMarca" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 4802;BA.debugLine="DatosLineaPedido.Marca=Marca";
Debug.ShouldStop(2);
_datoslineapedido.setField ("Marca" /*RemoteObject*/ ,_marca);
 if (true) break;

case 39:
//C
this.state = 161;
;
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 4807;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
Debug.ShouldStop(64);
_datoslineapedido.setField ("Linea" /*RemoteObject*/ ,_numlinea);
 BA.debugLineNum = 4810;BA.debugLine="If NumCharLinea<>141 Then";
Debug.ShouldStop(512);
if (true) break;

case 42:
//if
this.state = 45;
if (RemoteObject.solveBoolean("!",_numcharlinea,BA.numberCast(double.class, 141))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 4812;BA.debugLine="DatosLineaPedido.ErrorLongitudLineaEmpleado=1";
Debug.ShouldStop(2048);
_datoslineapedido.setField ("ErrorLongitudLineaEmpleado" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 4817;BA.debugLine="Dim DNI As String=sLinea.SubString2(29,38)   '";
Debug.ShouldStop(65536);
_dni = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 29)),(Object)(BA.numberCast(int.class, 38)));Debug.locals.put("DNI", _dni);Debug.locals.put("DNI", _dni);
 BA.debugLineNum = 4821;BA.debugLine="If DNIEmpleadoSel<>DNI Then";
Debug.ShouldStop(1048576);
if (true) break;

case 46:
//if
this.state = 73;
if (RemoteObject.solveBoolean("!",_dniempleadosel,_dni)) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 4822;BA.debugLine="DNIEmpleadoSel=DNI";
Debug.ShouldStop(2097152);
_dniempleadosel = _dni;Debug.locals.put("DNIEmpleadoSel", _dniempleadosel);
 BA.debugLineNum = 4824;BA.debugLine="DatosLineaPedido.DNI=\"\"";
Debug.ShouldStop(8388608);
_datoslineapedido.setField ("DNI" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4825;BA.debugLine="DatosLineaPedido.ErrorDNI=0";
Debug.ShouldStop(16777216);
_datoslineapedido.setField ("ErrorDNI" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4826;BA.debugLine="DatosLineaPedido.NombreEmpleado=\"\"";
Debug.ShouldStop(33554432);
_datoslineapedido.setField ("NombreEmpleado" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4827;BA.debugLine="DatosLineaPedido.Cargo=\"\"";
Debug.ShouldStop(67108864);
_datoslineapedido.setField ("Cargo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4828;BA.debugLine="DatosLineaPedido.ErrorCargo=0";
Debug.ShouldStop(134217728);
_datoslineapedido.setField ("ErrorCargo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4829;BA.debugLine="DatosLineaPedido.Sexo=\"\"";
Debug.ShouldStop(268435456);
_datoslineapedido.setField ("Sexo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4830;BA.debugLine="DatosLineaPedido.errorSexo=0";
Debug.ShouldStop(536870912);
_datoslineapedido.setField ("ErrorSexo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4831;BA.debugLine="DatosLineaPedido.Embarazo=\"\"";
Debug.ShouldStop(1073741824);
_datoslineapedido.setField ("Embarazo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4832;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=0";
Debug.ShouldStop(-2147483648);
_datoslineapedido.setField ("ErrorEmbarazo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4835;BA.debugLine="DatosLineaPedido.CodigoPrenda=\"\"";
Debug.ShouldStop(4);
_datoslineapedido.setField ("CodigoPrenda" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4836;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=\"\"";
Debug.ShouldStop(8);
_datoslineapedido.setField ("DescripcionCodigoPrenda" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4837;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=0";
Debug.ShouldStop(16);
_datoslineapedido.setField ("ErrorCodigoPrenda" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4838;BA.debugLine="DatosLineaPedido.CodigoProductoERP=\"\"";
Debug.ShouldStop(32);
_datoslineapedido.setField ("CodigoProductoERP" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4839;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=0";
Debug.ShouldStop(64);
_datoslineapedido.setField ("ErrorCodigoProductoERP" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4840;BA.debugLine="DatosLineaPedido.Talla=\"\"";
Debug.ShouldStop(128);
_datoslineapedido.setField ("Talla" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4841;BA.debugLine="DatosLineaPedido.TallaERP=\"\"";
Debug.ShouldStop(256);
_datoslineapedido.setField ("TallaERP" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4842;BA.debugLine="DatosLineaPedido.ErrorTalla=0";
Debug.ShouldStop(512);
_datoslineapedido.setField ("ErrorTalla" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4843;BA.debugLine="DatosLineaPedido.Cantidad=0";
Debug.ShouldStop(1024);
_datoslineapedido.setField ("Cantidad" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4844;BA.debugLine="DatosLineaPedido.ErrorCantidad=0";
Debug.ShouldStop(2048);
_datoslineapedido.setField ("ErrorCantidad" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4846;BA.debugLine="DatosLineaPedido.DNI=DNIEmpleadoSel";
Debug.ShouldStop(8192);
_datoslineapedido.setField ("DNI" /*RemoteObject*/ ,_dniempleadosel);
 BA.debugLineNum = 4847;BA.debugLine="Dim DNIEmpleadoSelOK As Boolean=checkDNI(DNIE";
Debug.ShouldStop(16384);
_dniempleadoselok = BA.ObjectToBoolean(__ref.runClassMethod (b4j.docU.crepsol.class, "_checkdni" /*RemoteObject*/ ,(Object)(_dniempleadosel)));Debug.locals.put("DNIEmpleadoSelOK", _dniempleadoselok);Debug.locals.put("DNIEmpleadoSelOK", _dniempleadoselok);
 BA.debugLineNum = 4848;BA.debugLine="If Not(DNIEmpleadoSelOK) Then DatosLineaPedid";
Debug.ShouldStop(32768);
if (true) break;

case 49:
//if
this.state = 54;
if (parent.__c.runMethod(true,"Not",(Object)(_dniempleadoselok)).<Boolean>get().booleanValue()) { 
this.state = 51;
;}if (true) break;

case 51:
//C
this.state = 54;
_datoslineapedido.setField ("ErrorDNI" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 4851;BA.debugLine="Dim NombreEmpleado As String=sLinea.SubStrin";
Debug.ShouldStop(262144);
_nombreempleado = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 38)),(Object)(BA.numberCast(int.class, 138)));Debug.locals.put("NombreEmpleado", _nombreempleado);Debug.locals.put("NombreEmpleado", _nombreempleado);
 BA.debugLineNum = 4852;BA.debugLine="DatosLineaPedido.NombreEmpleado=NombreEmplea";
Debug.ShouldStop(524288);
_datoslineapedido.setField ("NombreEmpleado" /*RemoteObject*/ ,_nombreempleado);
 BA.debugLineNum = 4853;BA.debugLine="Dim sCargo As String=sLinea.SubString2(138,1";
Debug.ShouldStop(1048576);
_scargo = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 138)),(Object)(BA.numberCast(int.class, 139)));Debug.locals.put("sCargo", _scargo);Debug.locals.put("sCargo", _scargo);
 BA.debugLineNum = 4863;BA.debugLine="DatosLineaPedido.Cargo=sCargo";
Debug.ShouldStop(1073741824);
_datoslineapedido.setField ("Cargo" /*RemoteObject*/ ,_scargo);
 BA.debugLineNum = 4864;BA.debugLine="If Not(sCargo=\"G\" Or sCargo=\"E\" Or sCargo=\"V";
Debug.ShouldStop(-2147483648);
if (true) break;

case 55:
//if
this.state = 60;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_scargo,BA.ObjectToString("G")) || RemoteObject.solveBoolean("=",_scargo,BA.ObjectToString("E")) || RemoteObject.solveBoolean("=",_scargo,RemoteObject.createImmutable("V"))))).<Boolean>get().booleanValue()) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 60;
 BA.debugLineNum = 4865;BA.debugLine="DatosLineaPedido.ErrorCargo=1";
Debug.ShouldStop(1);
_datoslineapedido.setField ("ErrorCargo" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 4868;BA.debugLine="DatosLineaPedido.ErrorCargo=0";
Debug.ShouldStop(8);
_datoslineapedido.setField ("ErrorCargo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 4872;BA.debugLine="Dim sSexoEmpleado As String=sLinea.SubString";
Debug.ShouldStop(128);
_ssexoempleado = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 139)),(Object)(BA.numberCast(int.class, 140)));Debug.locals.put("sSexoEmpleado", _ssexoempleado);Debug.locals.put("sSexoEmpleado", _ssexoempleado);
 BA.debugLineNum = 4880;BA.debugLine="DatosLineaPedido.Sexo=sSexoEmpleado";
Debug.ShouldStop(32768);
_datoslineapedido.setField ("Sexo" /*RemoteObject*/ ,_ssexoempleado);
 BA.debugLineNum = 4881;BA.debugLine="If Not(sSexoEmpleado=\"H\" Or sSexoEmpleado=\"M";
Debug.ShouldStop(65536);
if (true) break;

case 61:
//if
this.state = 66;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_ssexoempleado,BA.ObjectToString("H")) || RemoteObject.solveBoolean("=",_ssexoempleado,RemoteObject.createImmutable("M"))))).<Boolean>get().booleanValue()) { 
this.state = 63;
}else {
this.state = 65;
}if (true) break;

case 63:
//C
this.state = 66;
 BA.debugLineNum = 4882;BA.debugLine="DatosLineaPedido.ErrorSexo=1";
Debug.ShouldStop(131072);
_datoslineapedido.setField ("ErrorSexo" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 4886;BA.debugLine="DatosLineaPedido.ErrorSexo=0";
Debug.ShouldStop(2097152);
_datoslineapedido.setField ("ErrorSexo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 4889;BA.debugLine="Dim sEmbarazoEmpleado As String=sLinea.SubSt";
Debug.ShouldStop(16777216);
_sembarazoempleado = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 140)),(Object)(BA.numberCast(int.class, 141)));Debug.locals.put("sEmbarazoEmpleado", _sembarazoempleado);Debug.locals.put("sEmbarazoEmpleado", _sembarazoempleado);
 BA.debugLineNum = 4898;BA.debugLine="DatosLineaPedido.Embarazo=sEmbarazoEmpleado";
Debug.ShouldStop(2);
_datoslineapedido.setField ("Embarazo" /*RemoteObject*/ ,_sembarazoempleado);
 BA.debugLineNum = 4899;BA.debugLine="If Not(sEmbarazoEmpleado=\"S\" Or sEmbarazoEmp";
Debug.ShouldStop(4);
if (true) break;

case 67:
//if
this.state = 72;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_sembarazoempleado,BA.ObjectToString("S")) || RemoteObject.solveBoolean("=",_sembarazoempleado,RemoteObject.createImmutable("N"))))).<Boolean>get().booleanValue()) { 
this.state = 69;
}else {
this.state = 71;
}if (true) break;

case 69:
//C
this.state = 72;
 BA.debugLineNum = 4900;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=1";
Debug.ShouldStop(8);
_datoslineapedido.setField ("ErrorEmbarazo" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 4904;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=0";
Debug.ShouldStop(128);
_datoslineapedido.setField ("ErrorEmbarazo" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 if (true) break;

case 72:
//C
this.state = 73;
;
 if (true) break;

case 73:
//C
this.state = 161;
;
 if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 4913;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
Debug.ShouldStop(65536);
_datoslineapedido.setField ("Linea" /*RemoteObject*/ ,_numlinea);
 BA.debugLineNum = 4916;BA.debugLine="DatosLineaPedido.CodigoPrenda=\"\"";
Debug.ShouldStop(524288);
_datoslineapedido.setField ("CodigoPrenda" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4917;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=\"\"";
Debug.ShouldStop(1048576);
_datoslineapedido.setField ("DescripcionCodigoPrenda" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4918;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=0";
Debug.ShouldStop(2097152);
_datoslineapedido.setField ("ErrorCodigoPrenda" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4919;BA.debugLine="DatosLineaPedido.CodigoProductoERP=\"\"";
Debug.ShouldStop(4194304);
_datoslineapedido.setField ("CodigoProductoERP" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4920;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=0";
Debug.ShouldStop(8388608);
_datoslineapedido.setField ("ErrorCodigoProductoERP" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4921;BA.debugLine="DatosLineaPedido.Talla=\"\"";
Debug.ShouldStop(16777216);
_datoslineapedido.setField ("Talla" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4922;BA.debugLine="DatosLineaPedido.TallaERP=\"\"";
Debug.ShouldStop(33554432);
_datoslineapedido.setField ("TallaERP" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 4923;BA.debugLine="DatosLineaPedido.ErrorTalla=0";
Debug.ShouldStop(67108864);
_datoslineapedido.setField ("ErrorTalla" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4924;BA.debugLine="DatosLineaPedido.Cantidad=0";
Debug.ShouldStop(134217728);
_datoslineapedido.setField ("Cantidad" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4925;BA.debugLine="DatosLineaPedido.ErrorCantidad=0";
Debug.ShouldStop(268435456);
_datoslineapedido.setField ("ErrorCantidad" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 4926;BA.debugLine="Try";
Debug.ShouldStop(536870912);
if (true) break;

case 76:
//try
this.state = 81;
this.catchState = 80;
this.state = 78;
if (true) break;

case 78:
//C
this.state = 81;
this.catchState = 80;
 BA.debugLineNum = 4927;BA.debugLine="Dim CodigoPrenda As String=sLinea.SubString2(";
Debug.ShouldStop(1073741824);
_codigoprenda = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 38)),(Object)(BA.numberCast(int.class, 40)));Debug.locals.put("CodigoPrenda", _codigoprenda);Debug.locals.put("CodigoPrenda", _codigoprenda);
 BA.debugLineNum = 4931;BA.debugLine="DatosLineaPedido.CodigoPrenda=CodigoPrenda";
Debug.ShouldStop(4);
_datoslineapedido.setField ("CodigoPrenda" /*RemoteObject*/ ,_codigoprenda);
 BA.debugLineNum = 4932;BA.debugLine="Dim NumMapeoCodigoPrenda As Int=Utilidades.Fi";
Debug.ShouldStop(8);
_nummapeocodigoprenda = BA.numberCast(int.class, parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_datoslineapedido.getField(true,"CodigoPrenda" /*RemoteObject*/ )})))))))));Debug.locals.put("NumMapeoCodigoPrenda", _nummapeocodigoprenda);Debug.locals.put("NumMapeoCodigoPrenda", _nummapeocodigoprenda);
 BA.debugLineNum = 4934;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=IIf(NumMap";
Debug.ShouldStop(32);
_datoslineapedido.setField ("ErrorCodigoPrenda" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_nummapeocodigoprenda,BA.numberCast(double.class, 0))) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 4935;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=Util";
Debug.ShouldStop(64);
_datoslineapedido.setField ("DescripcionCodigoPrenda" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NombreCodigoPrenda from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_datoslineapedido.getField(true,"CodigoPrenda" /*RemoteObject*/ )})))))))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 80:
//C
this.state = 81;
this.catchState = 0;
 BA.debugLineNum = 4938;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","835389739",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 4939;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=1";
Debug.ShouldStop(1024);
_datoslineapedido.setField ("ErrorCodigoPrenda" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
this.catchState = 0;
;
 BA.debugLineNum = 4942;BA.debugLine="DatosLineaPedido.CodigoProductoERP=Utilidade";
Debug.ShouldStop(8192);
_datoslineapedido.setField ("CodigoProductoERP" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select CodigoArticuloNAV from tblRepsolMapeoArticulosEESS where Marca=? and Cargo=? and Sexo=? and CodigoPrenda=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datoslineapedido.getField(true,"Marca" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Cargo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Sexo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoPrenda" /*RemoteObject*/ ))})))))))));
 BA.debugLineNum = 4946;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=IIf(D";
Debug.ShouldStop(131072);
_datoslineapedido.setField ("ErrorCodigoProductoERP" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"CodigoProductoERP" /*RemoteObject*/ ),BA.ObjectToString(""))) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 4948;BA.debugLine="Dim Talla As String=sLinea.SubString2(40,44).";
Debug.ShouldStop(524288);
_talla = _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 40)),(Object)(BA.numberCast(int.class, 44))).runMethod(true,"trim");Debug.locals.put("Talla", _talla);Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 4949;BA.debugLine="DatosLineaPedido.Talla=Talla";
Debug.ShouldStop(1048576);
_datoslineapedido.setField ("Talla" /*RemoteObject*/ ,_talla);
 BA.debugLineNum = 4950;BA.debugLine="DatosLineaPedido.TallaERP=Utilidades.FixNull(";
Debug.ShouldStop(2097152);
_datoslineapedido.setField ("TallaERP" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select Talla from tblRepsolTallasArticulosEESS where Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_datoslineapedido.getField(true,"CodigoProductoERP" /*RemoteObject*/ ),_datoslineapedido.getField(true,"Talla" /*RemoteObject*/ )})))))))));
 BA.debugLineNum = 4953;BA.debugLine="DatosLineaPedido.ErrorTalla=IIf(DatosLineaPed";
Debug.ShouldStop(16777216);
_datoslineapedido.setField ("ErrorTalla" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"TallaERP" /*RemoteObject*/ ),_datoslineapedido.getField(true,"Talla" /*RemoteObject*/ ))) ? (RemoteObject.createImmutable((0))) : (RemoteObject.createImmutable((1))))));
 BA.debugLineNum = 4956;BA.debugLine="Try";
Debug.ShouldStop(134217728);
if (true) break;

case 82:
//try
this.state = 87;
this.catchState = 86;
this.state = 84;
if (true) break;

case 84:
//C
this.state = 87;
this.catchState = 86;
 BA.debugLineNum = 4957;BA.debugLine="Dim Cantidad As Int=sLinea.SubString2(44,45)";
Debug.ShouldStop(268435456);
_cantidad = BA.numberCast(int.class, _slinea.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 44)),(Object)(BA.numberCast(int.class, 45))));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 4958;BA.debugLine="DatosLineaPedido.Cantidad=Cantidad";
Debug.ShouldStop(536870912);
_datoslineapedido.setField ("Cantidad" /*RemoteObject*/ ,_cantidad);
 Debug.CheckDeviceExceptions();
if (true) break;

case 86:
//C
this.state = 87;
this.catchState = 0;
 BA.debugLineNum = 4960;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","835389761",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 4961;BA.debugLine="DatosLineaPedido.ErrorCantidad=1";
Debug.ShouldStop(1);
_datoslineapedido.setField ("ErrorCantidad" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 4966;BA.debugLine="If DatosLineaPedido.ErrorSede=1 Then DatosLine";
Debug.ShouldStop(32);

case 87:
//if
this.state = 92;
this.catchState = 0;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorSede" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 89;
;}if (true) break;

case 89:
//C
this.state = 92;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 92:
//C
this.state = 93;
;
 BA.debugLineNum = 4967;BA.debugLine="If DatosLineaPedido.ErrorFechaPedido=1 Then Da";
Debug.ShouldStop(64);
if (true) break;

case 93:
//if
this.state = 98;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorFechaPedido" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 95;
;}if (true) break;

case 95:
//C
this.state = 98;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 98:
//C
this.state = 99;
;
 BA.debugLineNum = 4968;BA.debugLine="If DatosLineaPedido.ErrorMarca=1 Then DatosLin";
Debug.ShouldStop(128);
if (true) break;

case 99:
//if
this.state = 104;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorMarca" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 101;
;}if (true) break;

case 101:
//C
this.state = 104;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 104:
//C
this.state = 105;
;
 BA.debugLineNum = 4969;BA.debugLine="If DatosLineaPedido.ErrorDNI=1 Then DatosLinea";
Debug.ShouldStop(256);
if (true) break;

case 105:
//if
this.state = 110;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorDNI" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 107;
;}if (true) break;

case 107:
//C
this.state = 110;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 110:
//C
this.state = 111;
;
 BA.debugLineNum = 4970;BA.debugLine="If DatosLineaPedido.ErrorCargo=1 Then DatosLin";
Debug.ShouldStop(512);
if (true) break;

case 111:
//if
this.state = 116;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorCargo" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 113;
;}if (true) break;

case 113:
//C
this.state = 116;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 116:
//C
this.state = 117;
;
 BA.debugLineNum = 4971;BA.debugLine="If DatosLineaPedido.ErrorSexo=1 Then DatosLine";
Debug.ShouldStop(1024);
if (true) break;

case 117:
//if
this.state = 122;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorSexo" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 119;
;}if (true) break;

case 119:
//C
this.state = 122;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 122:
//C
this.state = 123;
;
 BA.debugLineNum = 4972;BA.debugLine="If DatosLineaPedido.ErrorEmbarazo=1 Then Datos";
Debug.ShouldStop(2048);
if (true) break;

case 123:
//if
this.state = 128;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorEmbarazo" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 125;
;}if (true) break;

case 125:
//C
this.state = 128;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 128:
//C
this.state = 129;
;
 BA.debugLineNum = 4973;BA.debugLine="If DatosLineaPedido.ErrorCodigoPrenda=1 Then D";
Debug.ShouldStop(4096);
if (true) break;

case 129:
//if
this.state = 134;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorCodigoPrenda" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 131;
;}if (true) break;

case 131:
//C
this.state = 134;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 134:
//C
this.state = 135;
;
 BA.debugLineNum = 4974;BA.debugLine="If DatosLineaPedido.ErrorCodigoProductoERP=1 T";
Debug.ShouldStop(8192);
if (true) break;

case 135:
//if
this.state = 140;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorCodigoProductoERP" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 137;
;}if (true) break;

case 137:
//C
this.state = 140;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 140:
//C
this.state = 141;
;
 BA.debugLineNum = 4975;BA.debugLine="If DatosLineaPedido.ErrorTalla=1 Then DatosLin";
Debug.ShouldStop(16384);
if (true) break;

case 141:
//if
this.state = 146;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorTalla" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 143;
;}if (true) break;

case 143:
//C
this.state = 146;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 146:
//C
this.state = 147;
;
 BA.debugLineNum = 4976;BA.debugLine="If DatosLineaPedido.ErrorCantidad=1 Then Datos";
Debug.ShouldStop(32768);
if (true) break;

case 147:
//if
this.state = 152;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"ErrorCantidad" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 149;
;}if (true) break;

case 149:
//C
this.state = 152;
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
if (true) break;

case 152:
//C
this.state = 153;
;
 BA.debugLineNum = 4978;BA.debugLine="If DatosLineaPedido.LineaConError=1 Then";
Debug.ShouldStop(131072);
if (true) break;

case 153:
//if
this.state = 156;
if (RemoteObject.solveBoolean("=",_datoslineapedido.getField(true,"LineaConError" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
 BA.debugLineNum = 4979;BA.debugLine="LogColor(\"*********************\",xui.Color_Bl";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","835389780",BA.ObjectToString("*********************"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 4980;BA.debugLine="LogColor($\"DatosLineaPedido ERROR: ${DatosLin";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","835389781",(RemoteObject.concat(RemoteObject.createImmutable("DatosLineaPedido ERROR: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datoslineapedido))),RemoteObject.createImmutable(""))),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 4981;BA.debugLine="LogColor(\"*********************\",xui.Color_Bl";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","835389782",BA.ObjectToString("*********************"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 if (true) break;

case 156:
//C
this.state = 161;
;
 BA.debugLineNum = 4985;BA.debugLine="mSQL.AddNonQueryToBatch($\" 	insert into tblRep";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)((RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	insert into tblRepsolLineasFicheroPedido\n"),RemoteObject.createImmutable("	(Linea, ErrorLongitudLineaCabeceraEstacion, Sede , ErrorSede , CodigoClienteERP , CodigoDireccionEnvioERP \n"),RemoteObject.createImmutable("	, CodigoPedido , FechaPedido ,ErrorFechaPedido, NombreEstacion ,Calle , CodigoPostal \n"),RemoteObject.createImmutable("	, Poblacion , CodigoProvincia , Telefono \n"),RemoteObject.createImmutable("	, TipoEstacion , Marca , ErrorMarca \n"),RemoteObject.createImmutable("	, DNI , ErrorDNI , NombreEmpleado , Cargo , ErrorCargo \n"),RemoteObject.createImmutable("	, Sexo , ErrorSexo ,  Embarazo , ErrorEmbarazo \n"),RemoteObject.createImmutable("	,CodigoPrenda , ErrorCodigoPrenda , CodigoProductoERP, ErrorCodigoProductoERP, Talla, TallaERP , ErrorTalla , Cantidad, ErrorCantidad\n"),RemoteObject.createImmutable("	, LineaConError) \n"),RemoteObject.createImmutable("	values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)")))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {37},new Object[] {(_datoslineapedido.getField(true,"Linea" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorLongitudLineaCabeceraEstacion" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Sede" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorSede" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoClienteERP" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoDireccionEnvioERP" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoPedido" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"FechaPedido" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorFechaPedido" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"NombreEstacion" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Calle" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoPostal" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Poblacion" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoProvincia" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Telefono" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"TipoEstacion" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Marca" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorMarca" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"DNI" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorDNI" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"NombreEmpleado" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Cargo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorCargo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Sexo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorSexo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Embarazo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorEmbarazo" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoPrenda" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorCodigoPrenda" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"CodigoProductoERP" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorCodigoProductoERP" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Talla" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"TallaERP" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorTalla" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"Cantidad" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"ErrorCantidad" /*RemoteObject*/ )),(_datoslineapedido.getField(true,"LineaConError" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 5007;BA.debugLine="DatosLineaPedido.LineaConError=0  ' reseteamos la";
Debug.ShouldStop(16384);
_datoslineapedido.setField ("LineaConError" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 if (true) break;

case 158:
//C
this.state = 161;
 BA.debugLineNum = 5012;BA.debugLine="Exit ' Salir del loop (ésta debería ser la últ";
Debug.ShouldStop(524288);
this.state = 161;
if (true) break;
 if (true) break;

case 160:
//C
this.state = 161;
 if (true) break;

case 161:
//C
this.state = 391;
;
 if (true) break;
if (true) break;

case 162:
//C
this.state = 163;
Debug.locals.put("sLinea", _slinea);
;
 BA.debugLineNum = 5031;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
Debug.ShouldStop(64);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 5032;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero4"), _senderfilter);
this.state = 392;
return;
case 392:
//C
this.state = 163;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 5033;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","835389834",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 5036;BA.debugLine="Dim NumLineasConError As Int=mSQL.ExecQuerySingle";
Debug.ShouldStop(2048);
_numlineasconerror = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)((RemoteObject.createImmutable("select count(*) from tblRepsolLineasFicheroPedido where LineaConError=?"))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(1)}))))));Debug.locals.put("NumLineasConError", _numlineasconerror);Debug.locals.put("NumLineasConError", _numlineasconerror);
 BA.debugLineNum = 5038;BA.debugLine="If NumLineasConError>0 Then";
Debug.ShouldStop(8192);
if (true) break;

case 163:
//if
this.state = 366;
if (RemoteObject.solveBoolean(">",_numlineasconerror,BA.numberCast(double.class, 0))) { 
this.state = 165;
}if (true) break;

case 165:
//C
this.state = 166;
 BA.debugLineNum = 5040;BA.debugLine="Dim rsSedePedidoDNI As ResultSet=mSQL.ExecQuery(";
Debug.ShouldStop(32768);
_rssedepedidodni = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rssedepedidodni = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)((RemoteObject.createImmutable("select distinct Sede, CodigoPedido, DNI from tblRepsolLineasFicheroPedido where LineaConError=1"))));Debug.locals.put("rsSedePedidoDNI", _rssedepedidodni);Debug.locals.put("rsSedePedidoDNI", _rssedepedidodni);
 BA.debugLineNum = 5041;BA.debugLine="Do While rsSedePedidoDNI.NextRow";
Debug.ShouldStop(65536);
if (true) break;

case 166:
//do while
this.state = 351;
while (_rssedepedidodni.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 168;
if (true) break;
}
if (true) break;

case 168:
//C
this.state = 169;
 BA.debugLineNum = 5042;BA.debugLine="Dim Sede As String=rsSedePedidoDNI.GetString(\"S";
Debug.ShouldStop(131072);
_sede = _rssedepedidodni.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Sede")));Debug.locals.put("Sede", _sede);Debug.locals.put("Sede", _sede);
 BA.debugLineNum = 5043;BA.debugLine="Dim PedidoSede As String=rsSedePedidoDNI.GetStr";
Debug.ShouldStop(262144);
_pedidosede = _rssedepedidodni.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoPedido")));Debug.locals.put("PedidoSede", _pedidosede);Debug.locals.put("PedidoSede", _pedidosede);
 BA.debugLineNum = 5044;BA.debugLine="Dim DNI As String=rsSedePedidoDNI.GetString(\"DN";
Debug.ShouldStop(524288);
_dni = _rssedepedidodni.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("DNI")));Debug.locals.put("DNI", _dni);Debug.locals.put("DNI", _dni);
 BA.debugLineNum = 5046;BA.debugLine="mSQL.ExecNonQuery2(\"update tblRepsolLineasFiche";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblRepsolLineasFicheroPedido set SedePedidoDNIConError=? where Sede=? and CodigoPedido=? and DNI=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable((1)),(_sede),(_pedidosede),(_dni)})))));
 BA.debugLineNum = 5049;BA.debugLine="mSQL.ExecNonQuery2(\"insert into tblRepsolErrore";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("insert into tblRepsolErroresSedePedidoDNIFicheroPedido (Sede, PedidoSede, DNI, Errores) values (?,?,?,?)")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sede))),RemoteObject.createImmutable("")))),((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pedidosede))),RemoteObject.createImmutable("")))),((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dni))),RemoteObject.createImmutable("")))),(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 5052;BA.debugLine="Dim ErrorLongitudLineaCabeceraEstacion As Boole";
Debug.ShouldStop(134217728);
_errorlongitudlineacabeceraestacion = RemoteObject.createImmutable(false);Debug.locals.put("ErrorLongitudLineaCabeceraEstacion", _errorlongitudlineacabeceraestacion);
 BA.debugLineNum = 5053;BA.debugLine="Dim ErrorSede As Boolean";
Debug.ShouldStop(268435456);
_errorsede = RemoteObject.createImmutable(false);Debug.locals.put("ErrorSede", _errorsede);
 BA.debugLineNum = 5054;BA.debugLine="Dim ErrorFechaPedido As Boolean";
Debug.ShouldStop(536870912);
_errorfechapedido = RemoteObject.createImmutable(false);Debug.locals.put("ErrorFechaPedido", _errorfechapedido);
 BA.debugLineNum = 5055;BA.debugLine="Dim ErrorMarca As Boolean";
Debug.ShouldStop(1073741824);
_errormarca = RemoteObject.createImmutable(false);Debug.locals.put("ErrorMarca", _errormarca);
 BA.debugLineNum = 5056;BA.debugLine="Dim ErrorLongitudLineaEmpleado As Boolean";
Debug.ShouldStop(-2147483648);
_errorlongitudlineaempleado = RemoteObject.createImmutable(false);Debug.locals.put("ErrorLongitudLineaEmpleado", _errorlongitudlineaempleado);
 BA.debugLineNum = 5057;BA.debugLine="Dim ErrorDNI As Boolean";
Debug.ShouldStop(1);
_errordni = RemoteObject.createImmutable(false);Debug.locals.put("ErrorDNI", _errordni);
 BA.debugLineNum = 5058;BA.debugLine="Dim ErrorCargo As Boolean";
Debug.ShouldStop(2);
_errorcargo = RemoteObject.createImmutable(false);Debug.locals.put("ErrorCargo", _errorcargo);
 BA.debugLineNum = 5059;BA.debugLine="Dim ErrorSexo As Boolean";
Debug.ShouldStop(4);
_errorsexo = RemoteObject.createImmutable(false);Debug.locals.put("ErrorSexo", _errorsexo);
 BA.debugLineNum = 5060;BA.debugLine="Dim ErrorEmbarazo As Boolean";
Debug.ShouldStop(8);
_errorembarazo = RemoteObject.createImmutable(false);Debug.locals.put("ErrorEmbarazo", _errorembarazo);
 BA.debugLineNum = 5061;BA.debugLine="Dim ErrorLongitudLineaProducto As Boolean";
Debug.ShouldStop(16);
_errorlongitudlineaproducto = RemoteObject.createImmutable(false);Debug.locals.put("ErrorLongitudLineaProducto", _errorlongitudlineaproducto);
 BA.debugLineNum = 5062;BA.debugLine="Dim ErrorCodigoPrenda As Boolean";
Debug.ShouldStop(32);
_errorcodigoprenda = RemoteObject.createImmutable(false);Debug.locals.put("ErrorCodigoPrenda", _errorcodigoprenda);
 BA.debugLineNum = 5063;BA.debugLine="Dim ErrorCodigoProductoERP As Boolean";
Debug.ShouldStop(64);
_errorcodigoproductoerp = RemoteObject.createImmutable(false);Debug.locals.put("ErrorCodigoProductoERP", _errorcodigoproductoerp);
 BA.debugLineNum = 5064;BA.debugLine="Dim ErrorTalla As Boolean";
Debug.ShouldStop(128);
_errortalla = RemoteObject.createImmutable(false);Debug.locals.put("ErrorTalla", _errortalla);
 BA.debugLineNum = 5065;BA.debugLine="Dim ErrorCantidad As Boolean";
Debug.ShouldStop(256);
_errorcantidad = RemoteObject.createImmutable(false);Debug.locals.put("ErrorCantidad", _errorcantidad);
 BA.debugLineNum = 5068;BA.debugLine="Dim rsLineasSedePedidoDNI As ResultSet= mSQL.Ex";
Debug.ShouldStop(2048);
_rslineassedepedidodni = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rslineassedepedidodni = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select distinct Sede, CodigoPedido, DNI\n"),RemoteObject.createImmutable("	,ErrorLongitudLineaCabeceraEstacion,ErrorSede,ErrorFechaPedido,ErrorMarca\n"),RemoteObject.createImmutable("	,ErrorLongitudLineaEmpleado, ErrorDNI, ErrorCargo, ErrorSexo, ErrorEmbarazo\n"),RemoteObject.createImmutable("	 ,ErrorLongitudLineaProducto, ErrorCodigoPrenda,ErrorCodigoProductoERP,ErrorTalla, ErrorCantidad\n"),RemoteObject.createImmutable("	 from tblRepsolLineasFicheroPedido\n"),RemoteObject.createImmutable("	 where\n"),RemoteObject.createImmutable("	 Sede=? And CodigoPedido=? And DNI=?")))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_sede),(_pedidosede),(_dni)})))));Debug.locals.put("rsLineasSedePedidoDNI", _rslineassedepedidodni);Debug.locals.put("rsLineasSedePedidoDNI", _rslineassedepedidodni);
 BA.debugLineNum = 5077;BA.debugLine="Do While rsLineasSedePedidoDNI.NextRow";
Debug.ShouldStop(1048576);
if (true) break;

case 169:
//do while
this.state = 262;
while (_rslineassedepedidodni.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 171;
if (true) break;
}
if (true) break;

case 171:
//C
this.state = 172;
 BA.debugLineNum = 5078;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
Debug.ShouldStop(2097152);
if (true) break;

case 172:
//if
this.state = 177;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorLongitudLineaCabeceraEstacion"))),BA.numberCast(double.class, 1))) { 
this.state = 174;
;}if (true) break;

case 174:
//C
this.state = 177;
_errorlongitudlineacabeceraestacion = parent.__c.getField(true,"True");Debug.locals.put("ErrorLongitudLineaCabeceraEstacion", _errorlongitudlineacabeceraestacion);
if (true) break;

case 177:
//C
this.state = 178;
;
 BA.debugLineNum = 5079;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorSede\")=1";
Debug.ShouldStop(4194304);
if (true) break;

case 178:
//if
this.state = 183;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorSede"))),BA.numberCast(double.class, 1))) { 
this.state = 180;
;}if (true) break;

case 180:
//C
this.state = 183;
_errorsede = parent.__c.getField(true,"True");Debug.locals.put("ErrorSede", _errorsede);
if (true) break;

case 183:
//C
this.state = 184;
;
 BA.debugLineNum = 5080;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorFechaPed";
Debug.ShouldStop(8388608);
if (true) break;

case 184:
//if
this.state = 189;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorFechaPedido"))),BA.numberCast(double.class, 1))) { 
this.state = 186;
;}if (true) break;

case 186:
//C
this.state = 189;
_errorfechapedido = parent.__c.getField(true,"True");Debug.locals.put("ErrorFechaPedido", _errorfechapedido);
if (true) break;

case 189:
//C
this.state = 190;
;
 BA.debugLineNum = 5081;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorMarca\")=";
Debug.ShouldStop(16777216);
if (true) break;

case 190:
//if
this.state = 195;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorMarca"))),BA.numberCast(double.class, 1))) { 
this.state = 192;
;}if (true) break;

case 192:
//C
this.state = 195;
_errormarca = parent.__c.getField(true,"True");Debug.locals.put("ErrorMarca", _errormarca);
if (true) break;

case 195:
//C
this.state = 196;
;
 BA.debugLineNum = 5082;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
Debug.ShouldStop(33554432);
if (true) break;

case 196:
//if
this.state = 201;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorLongitudLineaEmpleado"))),BA.numberCast(double.class, 1))) { 
this.state = 198;
;}if (true) break;

case 198:
//C
this.state = 201;
_errorlongitudlineaempleado = parent.__c.getField(true,"True");Debug.locals.put("ErrorLongitudLineaEmpleado", _errorlongitudlineaempleado);
if (true) break;

case 201:
//C
this.state = 202;
;
 BA.debugLineNum = 5083;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorDNI\")=1";
Debug.ShouldStop(67108864);
if (true) break;

case 202:
//if
this.state = 207;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorDNI"))),BA.numberCast(double.class, 1))) { 
this.state = 204;
;}if (true) break;

case 204:
//C
this.state = 207;
_errordni = parent.__c.getField(true,"True");Debug.locals.put("ErrorDNI", _errordni);
if (true) break;

case 207:
//C
this.state = 208;
;
 BA.debugLineNum = 5084;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCargo\")=";
Debug.ShouldStop(134217728);
if (true) break;

case 208:
//if
this.state = 213;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorCargo"))),BA.numberCast(double.class, 1))) { 
this.state = 210;
;}if (true) break;

case 210:
//C
this.state = 213;
_errorcargo = parent.__c.getField(true,"True");Debug.locals.put("ErrorCargo", _errorcargo);
if (true) break;

case 213:
//C
this.state = 214;
;
 BA.debugLineNum = 5085;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorSexo\")=1";
Debug.ShouldStop(268435456);
if (true) break;

case 214:
//if
this.state = 219;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorSexo"))),BA.numberCast(double.class, 1))) { 
this.state = 216;
;}if (true) break;

case 216:
//C
this.state = 219;
_errorsexo = parent.__c.getField(true,"True");Debug.locals.put("ErrorSexo", _errorsexo);
if (true) break;

case 219:
//C
this.state = 220;
;
 BA.debugLineNum = 5086;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorEmbarazo";
Debug.ShouldStop(536870912);
if (true) break;

case 220:
//if
this.state = 225;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorEmbarazo"))),BA.numberCast(double.class, 1))) { 
this.state = 222;
;}if (true) break;

case 222:
//C
this.state = 225;
_errorembarazo = parent.__c.getField(true,"True");Debug.locals.put("ErrorEmbarazo", _errorembarazo);
if (true) break;

case 225:
//C
this.state = 226;
;
 BA.debugLineNum = 5087;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
Debug.ShouldStop(1073741824);
if (true) break;

case 226:
//if
this.state = 231;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorLongitudLineaProducto"))),BA.numberCast(double.class, 1))) { 
this.state = 228;
;}if (true) break;

case 228:
//C
this.state = 231;
_errorlongitudlineaproducto = parent.__c.getField(true,"True");Debug.locals.put("ErrorLongitudLineaProducto", _errorlongitudlineaproducto);
if (true) break;

case 231:
//C
this.state = 232;
;
 BA.debugLineNum = 5088;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCodigoPr";
Debug.ShouldStop(-2147483648);
if (true) break;

case 232:
//if
this.state = 237;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorCodigoPrenda"))),BA.numberCast(double.class, 1))) { 
this.state = 234;
;}if (true) break;

case 234:
//C
this.state = 237;
_errorcodigoprenda = parent.__c.getField(true,"True");Debug.locals.put("ErrorCodigoPrenda", _errorcodigoprenda);
if (true) break;

case 237:
//C
this.state = 238;
;
 BA.debugLineNum = 5089;BA.debugLine="If ErrorMarca Or ErrorCargo Or ErrorSexo Or Er";
Debug.ShouldStop(1);
if (true) break;

case 238:
//if
this.state = 243;
if (RemoteObject.solveBoolean(".",_errormarca) || RemoteObject.solveBoolean(".",_errorcargo) || RemoteObject.solveBoolean(".",_errorsexo) || RemoteObject.solveBoolean(".",_errorembarazo) || RemoteObject.solveBoolean(".",_errorcodigoprenda)) { 
this.state = 240;
;}if (true) break;

case 240:
//C
this.state = 243;
this.state = 169;
if (true) break;;
if (true) break;

case 243:
//C
this.state = 244;
;
 BA.debugLineNum = 5090;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCodigoPr";
Debug.ShouldStop(2);
if (true) break;

case 244:
//if
this.state = 249;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorCodigoProductoERP"))),BA.numberCast(double.class, 1))) { 
this.state = 246;
;}if (true) break;

case 246:
//C
this.state = 249;
_errorcodigoproductoerp = parent.__c.getField(true,"True");Debug.locals.put("ErrorCodigoProductoERP", _errorcodigoproductoerp);
if (true) break;

case 249:
//C
this.state = 250;
;
 BA.debugLineNum = 5091;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorTalla\")=";
Debug.ShouldStop(4);
if (true) break;

case 250:
//if
this.state = 255;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorTalla"))),BA.numberCast(double.class, 1))) { 
this.state = 252;
;}if (true) break;

case 252:
//C
this.state = 255;
_errortalla = parent.__c.getField(true,"True");Debug.locals.put("ErrorTalla", _errortalla);
if (true) break;

case 255:
//C
this.state = 256;
;
 BA.debugLineNum = 5092;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCantidad";
Debug.ShouldStop(8);
if (true) break;

case 256:
//if
this.state = 261;
if (RemoteObject.solveBoolean("=",_rslineassedepedidodni.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ErrorCantidad"))),BA.numberCast(double.class, 1))) { 
this.state = 258;
;}if (true) break;

case 258:
//C
this.state = 261;
_errorcantidad = parent.__c.getField(true,"True");Debug.locals.put("ErrorCantidad", _errorcantidad);
if (true) break;

case 261:
//C
this.state = 169;
;
 if (true) break;

case 262:
//C
this.state = 263;
;
 BA.debugLineNum = 5094;BA.debugLine="rsLineasSedePedidoDNI.close";
Debug.ShouldStop(32);
_rslineassedepedidodni.runVoidMethod ("Close");
 BA.debugLineNum = 5096;BA.debugLine="Dim sbTextoError As StringBuilder";
Debug.ShouldStop(128);
_sbtextoerror = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbTextoError", _sbtextoerror);
 BA.debugLineNum = 5097;BA.debugLine="sbTextoError.Initialize";
Debug.ShouldStop(256);
_sbtextoerror.runVoidMethod ("Initialize");
 BA.debugLineNum = 5099;BA.debugLine="If ErrorLongitudLineaCabeceraEstacion Then sbTe";
Debug.ShouldStop(1024);
if (true) break;

case 263:
//if
this.state = 268;
if (_errorlongitudlineacabeceraestacion.<Boolean>get().booleanValue()) { 
this.state = 265;
;}if (true) break;

case 265:
//C
this.state = 268;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorLongitudLineaCabeceraEstacion")));
if (true) break;

case 268:
//C
this.state = 269;
;
 BA.debugLineNum = 5100;BA.debugLine="If ErrorSede Then sbTextoError.Append(\", Sede n";
Debug.ShouldStop(2048);
if (true) break;

case 269:
//if
this.state = 274;
if (_errorsede.<Boolean>get().booleanValue()) { 
this.state = 271;
;}if (true) break;

case 271:
//C
this.state = 274;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Sede no existe ERP Proin")));
if (true) break;

case 274:
//C
this.state = 275;
;
 BA.debugLineNum = 5101;BA.debugLine="If ErrorFechaPedido Then sbTextoError.Append(\",";
Debug.ShouldStop(4096);
if (true) break;

case 275:
//if
this.state = 280;
if (_errorfechapedido.<Boolean>get().booleanValue()) { 
this.state = 277;
;}if (true) break;

case 277:
//C
this.state = 280;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Fecha")));
if (true) break;

case 280:
//C
this.state = 281;
;
 BA.debugLineNum = 5102;BA.debugLine="If ErrorMarca Then sbTextoError.Append(\", Error";
Debug.ShouldStop(8192);
if (true) break;

case 281:
//if
this.state = 286;
if (_errormarca.<Boolean>get().booleanValue()) { 
this.state = 283;
;}if (true) break;

case 283:
//C
this.state = 286;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Marca")));
if (true) break;

case 286:
//C
this.state = 287;
;
 BA.debugLineNum = 5103;BA.debugLine="If ErrorLongitudLineaEmpleado Then sbTextoError";
Debug.ShouldStop(16384);
if (true) break;

case 287:
//if
this.state = 292;
if (_errorlongitudlineaempleado.<Boolean>get().booleanValue()) { 
this.state = 289;
;}if (true) break;

case 289:
//C
this.state = 292;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorLongitudLineaEmpleado")));
if (true) break;

case 292:
//C
this.state = 293;
;
 BA.debugLineNum = 5104;BA.debugLine="If ErrorDNI Then sbTextoError.Append(\", DNI no";
Debug.ShouldStop(32768);
if (true) break;

case 293:
//if
this.state = 298;
if (_errordni.<Boolean>get().booleanValue()) { 
this.state = 295;
;}if (true) break;

case 295:
//C
this.state = 298;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", DNI no válido")));
if (true) break;

case 298:
//C
this.state = 299;
;
 BA.debugLineNum = 5105;BA.debugLine="If ErrorCargo Then sbTextoError.Append(\", Error";
Debug.ShouldStop(65536);
if (true) break;

case 299:
//if
this.state = 304;
if (_errorcargo.<Boolean>get().booleanValue()) { 
this.state = 301;
;}if (true) break;

case 301:
//C
this.state = 304;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Cargo")));
if (true) break;

case 304:
//C
this.state = 305;
;
 BA.debugLineNum = 5106;BA.debugLine="If ErrorSexo Then sbTextoError.Append(\", Error";
Debug.ShouldStop(131072);
if (true) break;

case 305:
//if
this.state = 310;
if (_errorsexo.<Boolean>get().booleanValue()) { 
this.state = 307;
;}if (true) break;

case 307:
//C
this.state = 310;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Sexo")));
if (true) break;

case 310:
//C
this.state = 311;
;
 BA.debugLineNum = 5107;BA.debugLine="If ErrorEmbarazo Then sbTextoError.Append(\", Er";
Debug.ShouldStop(262144);
if (true) break;

case 311:
//if
this.state = 316;
if (_errorembarazo.<Boolean>get().booleanValue()) { 
this.state = 313;
;}if (true) break;

case 313:
//C
this.state = 316;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Embarazo")));
if (true) break;

case 316:
//C
this.state = 317;
;
 BA.debugLineNum = 5108;BA.debugLine="If ErrorLongitudLineaProducto Then sbTextoError";
Debug.ShouldStop(524288);
if (true) break;

case 317:
//if
this.state = 322;
if (_errorlongitudlineaproducto.<Boolean>get().booleanValue()) { 
this.state = 319;
;}if (true) break;

case 319:
//C
this.state = 322;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorLongitudLineaProducto")));
if (true) break;

case 322:
//C
this.state = 323;
;
 BA.debugLineNum = 5109;BA.debugLine="If ErrorCodigoPrenda Then sbTextoError.Append(\"";
Debug.ShouldStop(1048576);
if (true) break;

case 323:
//if
this.state = 328;
if (_errorcodigoprenda.<Boolean>get().booleanValue()) { 
this.state = 325;
;}if (true) break;

case 325:
//C
this.state = 328;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", Error Código Prenda")));
if (true) break;

case 328:
//C
this.state = 329;
;
 BA.debugLineNum = 5110;BA.debugLine="If ErrorCodigoProductoERP Then sbTextoError.App";
Debug.ShouldStop(2097152);
if (true) break;

case 329:
//if
this.state = 334;
if (_errorcodigoproductoerp.<Boolean>get().booleanValue()) { 
this.state = 331;
;}if (true) break;

case 331:
//C
this.state = 334;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorCodigoProductoERP")));
if (true) break;

case 334:
//C
this.state = 335;
;
 BA.debugLineNum = 5111;BA.debugLine="If ErrorTalla Then sbTextoError.Append(\", Error";
Debug.ShouldStop(4194304);
if (true) break;

case 335:
//if
this.state = 340;
if (_errortalla.<Boolean>get().booleanValue()) { 
this.state = 337;
;}if (true) break;

case 337:
//C
this.state = 340;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorTalla")));
if (true) break;

case 340:
//C
this.state = 341;
;
 BA.debugLineNum = 5112;BA.debugLine="If ErrorCantidad Then sbTextoError.Append(\", Er";
Debug.ShouldStop(8388608);
if (true) break;

case 341:
//if
this.state = 346;
if (_errorcantidad.<Boolean>get().booleanValue()) { 
this.state = 343;
;}if (true) break;

case 343:
//C
this.state = 346;
_sbtextoerror.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ErrorCantidad")));
if (true) break;

case 346:
//C
this.state = 347;
;
 BA.debugLineNum = 5114;BA.debugLine="If sbTextoError.Length>2 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 347:
//if
this.state = 350;
if (RemoteObject.solveBoolean(">",_sbtextoerror.runMethod(true,"getLength"),BA.numberCast(double.class, 2))) { 
this.state = 349;
}if (true) break;

case 349:
//C
this.state = 350;
 BA.debugLineNum = 5115;BA.debugLine="mSQL.ExecNonQuery2(\"update tblRepsolErroresSed";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblRepsolErroresSedePedidoDNIFicheroPedido set Errores=? where Sede=? and PedidoSede=? and DNI=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sbtextoerror.runMethod(true,"ToString").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)))))),RemoteObject.createImmutable("")))),(_sede),(_pedidosede),(_dni)})))));
 if (true) break;

case 350:
//C
this.state = 166;
;
 if (true) break;

case 351:
//C
this.state = 352;
;
 BA.debugLineNum = 5120;BA.debugLine="rsSedePedidoDNI.close";
Debug.ShouldStop(-2147483648);
_rssedepedidodni.runVoidMethod ("Close");
 BA.debugLineNum = 5122;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(2);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 5124;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Generando F";
Debug.ShouldStop(8);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Generando Fichero CSV ERRORES...")));
 BA.debugLineNum = 5125;BA.debugLine="Dim lstErrores As List=DBUtils.ExecuteMemoryTabl";
Debug.ShouldStop(16);
_lsterrores = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lsterrores = parent._dbutils.runMethod(false,"_executememorytable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("select * from tblRepsolErroresSedePedidoDNIFicheroPedido"))),(Object)((parent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("lstErrores", _lsterrores);Debug.locals.put("lstErrores", _lsterrores);
 BA.debugLineNum = 5126;BA.debugLine="Dim lstEncabezadosErrores As List";
Debug.ShouldStop(32);
_lstencabezadoserrores = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEncabezadosErrores", _lstencabezadoserrores);
 BA.debugLineNum = 5127;BA.debugLine="lstEncabezadosErrores.Initialize";
Debug.ShouldStop(64);
_lstencabezadoserrores.runVoidMethod ("Initialize");
 BA.debugLineNum = 5128;BA.debugLine="lstEncabezadosErrores.add(\"Sede\")";
Debug.ShouldStop(128);
_lstencabezadoserrores.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Sede"))));
 BA.debugLineNum = 5129;BA.debugLine="lstEncabezadosErrores.add(\"PedidoSede\")";
Debug.ShouldStop(256);
_lstencabezadoserrores.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("PedidoSede"))));
 BA.debugLineNum = 5130;BA.debugLine="lstEncabezadosErrores.add(\"DNI\")";
Debug.ShouldStop(512);
_lstencabezadoserrores.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("DNI"))));
 BA.debugLineNum = 5131;BA.debugLine="lstEncabezadosErrores.add(\"ERROR\")";
Debug.ShouldStop(1024);
_lstencabezadoserrores.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("ERROR"))));
 BA.debugLineNum = 5134;BA.debugLine="Dim sFicheroErrores As String=GenerarCSVSeparado";
Debug.ShouldStop(8192);
_sficheroerrores = __ref.runClassMethod (b4j.docU.crepsol.class, "_generarcsvseparadorcomasquotes" /*RemoteObject*/ ,(Object)(_lsterrores),(Object)(BA.ObjectToString(",")),(Object)(_lstencabezadoserrores));Debug.locals.put("sFicheroErrores", _sficheroerrores);Debug.locals.put("sFicheroErrores", _sficheroerrores);
 BA.debugLineNum = 5135;BA.debugLine="Dim NombreFicheroErrores As String=$\"Errores_${N";
Debug.ShouldStop(16384);
_nombreficheroerrores = (RemoteObject.concat(RemoteObject.createImmutable("Errores_"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_numeropedido))),RemoteObject.createImmutable(".csv")));Debug.locals.put("NombreFicheroErrores", _nombreficheroerrores);Debug.locals.put("NombreFicheroErrores", _nombreficheroerrores);
 BA.debugLineNum = 5136;BA.debugLine="File.WriteString(CarpetaDestinoFicherosPedidosEr";
Debug.ShouldStop(32768);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(true,"_carpetadestinoficherospedidoserrorrepsol" /*RemoteObject*/ )),(Object)(_nombreficheroerrores),(Object)(_sficheroerrores));
 BA.debugLineNum = 5137;BA.debugLine="If File.Exists(CarpetaDestinoFicherosPedidosErro";
Debug.ShouldStop(65536);
if (true) break;

case 352:
//if
this.state = 355;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherospedidoserrorrepsol" /*RemoteObject*/ )),(Object)(_nombreficheroerrores)),parent.__c.getField(true,"False"))) { 
this.state = 354;
}if (true) break;

case 354:
//C
this.state = 355;
 BA.debugLineNum = 5138;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Fichero erro";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Fichero error aun no existe!!")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 5139;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero4"), _msa);
this.state = 393;
return;
case 393:
//C
this.state = 355;
;
 if (true) break;

case 355:
//C
this.state = 356;
;
 BA.debugLineNum = 5141;BA.debugLine="Log(File.Exists(CarpetaDestinoFicherosPedidosErr";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","835389942",BA.ObjectToString(parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherospedidoserrorrepsol" /*RemoteObject*/ )),(Object)(_nombreficheroerrores))),0);
 BA.debugLineNum = 5147;BA.debugLine="Dim RutaFTPFicheroPedidoErrores As String=ErrorF";
Debug.ShouldStop(67108864);
_rutaftpficheropedidoerrores = RemoteObject.concat(__ref.getField(true,"_errorfilesfoldersftprepsol" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_nombreficheroerrores);Debug.locals.put("RutaFTPFicheroPedidoErrores", _rutaftpficheropedidoerrores);Debug.locals.put("RutaFTPFicheroPedidoErrores", _rutaftpficheropedidoerrores);
 BA.debugLineNum = 5149;BA.debugLine="If File.Exists(CarpetaDestinoFicherosPedidosErro";
Debug.ShouldStop(268435456);
if (true) break;

case 356:
//if
this.state = 365;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherospedidoserrorrepsol" /*RemoteObject*/ )),(Object)(_nombreficheroerrores)).<Boolean>get().booleanValue()) { 
this.state = 358;
}if (true) break;

case 358:
//C
this.state = 359;
 BA.debugLineNum = 5150;BA.debugLine="wait for(SubirFicheroACarpetaFTP(CarpetaDestino";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero4"), __ref.runClassMethod (b4j.docU.crepsol.class, "_subirficheroacarpetaftp" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_carpetadestinoficherospedidoserrorrepsol" /*RemoteObject*/ )),(Object)(_nombreficheroerrores),(Object)(_rutaftpficheropedidoerrores)));
this.state = 394;
return;
case 394:
//C
this.state = 359;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 5151;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 359:
//if
this.state = 364;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 361;
}else {
this.state = 363;
}if (true) break;

case 361:
//C
this.state = 364;
 BA.debugLineNum = 5153;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Ha habido";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Ha habido un error en la subida del fichero de errores"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheroerrores))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("ATENCION!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 5154;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero4"), _msa);
this.state = 395;
return;
case 395:
//C
this.state = 364;
;
 BA.debugLineNum = 5155;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(4);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 5156;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 363:
//C
this.state = 364;
 BA.debugLineNum = 5158;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Se ha subi";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Se ha subido el fichero de errores"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheroerrores))),RemoteObject.createImmutable(" correspondiente al fichero de pedido seleccionado.")))),(Object)(RemoteObject.createImmutable("ATENCION!")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 5159;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesarfichero4"), _msa);
this.state = 396;
return;
case 396:
//C
this.state = 364;
;
 BA.debugLineNum = 5160;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(128);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 if (true) break;

case 364:
//C
this.state = 365;
;
 if (true) break;

case 365:
//C
this.state = 366;
;
 if (true) break;

case 366:
//C
this.state = 367;
;
 BA.debugLineNum = 5167;BA.debugLine="Dim NumLineasSinError As Int=mSQL.ExecQuerySingle";
Debug.ShouldStop(16384);
_numlineassinerror = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)((RemoteObject.createImmutable("select count(*) from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?"))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(0)}))))));Debug.locals.put("NumLineasSinError", _numlineassinerror);Debug.locals.put("NumLineasSinError", _numlineassinerror);
 BA.debugLineNum = 5169;BA.debugLine="If NumLineasSinError>0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 367:
//if
this.state = 388;
if (RemoteObject.solveBoolean(">",_numlineassinerror,BA.numberCast(double.class, 0))) { 
this.state = 369;
}if (true) break;

case 369:
//C
this.state = 370;
 BA.debugLineNum = 5171;BA.debugLine="Dim lstHeaders As List=Array As String(\"Docuware";
Debug.ShouldStop(262144);
_lstheaders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstheaders = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Docuware ID"),BA.ObjectToString("Usuario"),BA.ObjectToString("Cliente"),BA.ObjectToString("DireccionEnvio"),BA.ObjectToString("DocumentoExterno"),BA.ObjectToString("AlmacenOrigen"),BA.ObjectToString("FechaPedidoCliente"),BA.ObjectToString("Articulo"),BA.ObjectToString("ReferenciaCruzada"),BA.ObjectToString("Talla"),BA.ObjectToString("Cantidad"),RemoteObject.createImmutable("Precio")})));Debug.locals.put("lstHeaders", _lstheaders);Debug.locals.put("lstHeaders", _lstheaders);
 BA.debugLineNum = 5174;BA.debugLine="Dim CarpetaFicheroCSV As String=\"\\\\192.168.10.6\\";
Debug.ShouldStop(2097152);
_carpetaficherocsv = BA.ObjectToString("\\\\192.168.10.6\\PendientesNAV");Debug.locals.put("CarpetaFicheroCSV", _carpetaficherocsv);Debug.locals.put("CarpetaFicheroCSV", _carpetaficherocsv);
 BA.debugLineNum = 5176;BA.debugLine="Dim rsCabeceraPedidosLineasSinError As ResultSet";
Debug.ShouldStop(8388608);
_rscabecerapedidoslineassinerror = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rscabecerapedidoslineassinerror = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("select distinct CodigoClienteERP, CodigoDireccionEnvioERP, Sede, CodigoPedido, FechaPedido\n"),RemoteObject.createImmutable("			 from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?")))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(0)})))));Debug.locals.put("rsCabeceraPedidosLineasSinError", _rscabecerapedidoslineassinerror);Debug.locals.put("rsCabeceraPedidosLineasSinError", _rscabecerapedidoslineassinerror);
 BA.debugLineNum = 5178;BA.debugLine="Do While rsCabeceraPedidosLineasSinError.NextRow";
Debug.ShouldStop(33554432);
if (true) break;

case 370:
//do while
this.state = 387;
while (_rscabecerapedidoslineassinerror.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 372;
if (true) break;
}
if (true) break;

case 372:
//C
this.state = 373;
 BA.debugLineNum = 5179;BA.debugLine="Dim UUIDPedido As String=Utilidades.GenerarUUID";
Debug.ShouldStop(67108864);
_uuidpedido = parent._utilidades.runMethod(true,"_generaruuidv4" /*RemoteObject*/ );Debug.locals.put("UUIDPedido", _uuidpedido);Debug.locals.put("UUIDPedido", _uuidpedido);
 BA.debugLineNum = 5180;BA.debugLine="Dim IDPedido As String=$\"REPSOL_${UUIDPedido}\"$";
Debug.ShouldStop(134217728);
_idpedido = (RemoteObject.concat(RemoteObject.createImmutable("REPSOL_"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uuidpedido))),RemoteObject.createImmutable("")));Debug.locals.put("IDPedido", _idpedido);Debug.locals.put("IDPedido", _idpedido);
 BA.debugLineNum = 5181;BA.debugLine="Dim NombreFicheroCSV As String=$\"${IDPedido}.cs";
Debug.ShouldStop(268435456);
_nombreficherocsv = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idpedido))),RemoteObject.createImmutable(".csv")));Debug.locals.put("NombreFicheroCSV", _nombreficherocsv);Debug.locals.put("NombreFicheroCSV", _nombreficherocsv);
 BA.debugLineNum = 5182;BA.debugLine="Dim lstLineasPedidoVenta As List";
Debug.ShouldStop(536870912);
_lstlineaspedidoventa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstLineasPedidoVenta", _lstlineaspedidoventa);
 BA.debugLineNum = 5183;BA.debugLine="lstLineasPedidoVenta.Initialize";
Debug.ShouldStop(1073741824);
_lstlineaspedidoventa.runVoidMethod ("Initialize");
 BA.debugLineNum = 5184;BA.debugLine="Dim CodigoClienteNAV As String=rsCabeceraPedido";
Debug.ShouldStop(-2147483648);
_codigoclientenav = _rscabecerapedidoslineassinerror.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoClienteERP")));Debug.locals.put("CodigoClienteNAV", _codigoclientenav);Debug.locals.put("CodigoClienteNAV", _codigoclientenav);
 BA.debugLineNum = 5185;BA.debugLine="Dim CodigoDireccionEnvioNAV As String=rsCabecer";
Debug.ShouldStop(1);
_codigodireccionenvionav = _rscabecerapedidoslineassinerror.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoDireccionEnvioERP")));Debug.locals.put("CodigoDireccionEnvioNAV", _codigodireccionenvionav);Debug.locals.put("CodigoDireccionEnvioNAV", _codigodireccionenvionav);
 BA.debugLineNum = 5186;BA.debugLine="Dim Sede As String=rsCabeceraPedidosLineasSinEr";
Debug.ShouldStop(2);
_sede = _rscabecerapedidoslineassinerror.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Sede")));Debug.locals.put("Sede", _sede);Debug.locals.put("Sede", _sede);
 BA.debugLineNum = 5187;BA.debugLine="Dim CodigoPedido As String=rsCabeceraPedidosLin";
Debug.ShouldStop(4);
_codigopedido = _rscabecerapedidoslineassinerror.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoPedido")));Debug.locals.put("CodigoPedido", _codigopedido);Debug.locals.put("CodigoPedido", _codigopedido);
 BA.debugLineNum = 5188;BA.debugLine="Dim DocumentoExterno As String=Sede & CodigoPed";
Debug.ShouldStop(8);
_documentoexterno = RemoteObject.concat(_sede,_codigopedido);Debug.locals.put("DocumentoExterno", _documentoexterno);Debug.locals.put("DocumentoExterno", _documentoexterno);
 BA.debugLineNum = 5189;BA.debugLine="Dim FechaPedidoCliente As String=rsCabeceraPedi";
Debug.ShouldStop(16);
_fechapedidocliente = _rscabecerapedidoslineassinerror.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FechaPedido")));Debug.locals.put("FechaPedidoCliente", _fechapedidocliente);Debug.locals.put("FechaPedidoCliente", _fechapedidocliente);
 BA.debugLineNum = 5190;BA.debugLine="Dim FechaPedidoClienteNAV As String=FechaPedido";
Debug.ShouldStop(32);
_fechapedidoclientenav = _fechapedidocliente.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("FechaPedidoClienteNAV", _fechapedidoclientenav);Debug.locals.put("FechaPedidoClienteNAV", _fechapedidoclientenav);
 BA.debugLineNum = 5193;BA.debugLine="Dim rsLineasPedido As ResultSet=mSQL.ExecQuery2(";
Debug.ShouldStop(256);
_rslineaspedido = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rslineaspedido = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select CodigoProductoERP, TallaERP, sum(Cantidad) as TotalCantidad\n"),RemoteObject.createImmutable("			from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=? And CodigoClienteERP=? and CodigoDireccionEnvioERP=? and CodigoPedido=? and FechaPedido=?\n"),RemoteObject.createImmutable("			group by CodigoProductoERP,TallaERP")))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.NumberToString(0),_codigoclientenav,_codigodireccionenvionav,_codigopedido,_fechapedidocliente})))));Debug.locals.put("rsLineasPedido", _rslineaspedido);Debug.locals.put("rsLineasPedido", _rslineaspedido);
 BA.debugLineNum = 5198;BA.debugLine="Do While rsLineasPedido.NextRow";
Debug.ShouldStop(8192);
if (true) break;

case 373:
//do while
this.state = 376;
while (_rslineaspedido.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 375;
if (true) break;
}
if (true) break;

case 375:
//C
this.state = 373;
 BA.debugLineNum = 5200;BA.debugLine="Dim Precio As Double=Utilidades.FixNullDouble(";
Debug.ShouldStop(32768);
_precio = parent._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select PrecioUnitario from tblRepsolTarifaVentaGRP07506 where Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_rslineaspedido.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoProductoERP")))}))))))));Debug.locals.put("Precio", _precio);Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 5202;BA.debugLine="Dim ArrDatosLineaPedido(12) As String";
Debug.ShouldStop(131072);
_arrdatoslineapedido = RemoteObject.createNewArray ("String", new int[] {12}, new Object[]{});Debug.locals.put("ArrDatosLineaPedido", _arrdatoslineapedido);
 BA.debugLineNum = 5203;BA.debugLine="ArrDatosLineaPedido(0)=$\"${UUIDPedido}\"$";
Debug.ShouldStop(262144);
_arrdatoslineapedido.setArrayElement ((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uuidpedido))),RemoteObject.createImmutable(""))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 5205;BA.debugLine="ArrDatosLineaPedido(1)=\"PROIN\\SUSANA.DIEZ\"   '";
Debug.ShouldStop(1048576);
_arrdatoslineapedido.setArrayElement (BA.ObjectToString("PROIN\\SUSANA.DIEZ"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 5206;BA.debugLine="ArrDatosLineaPedido(2)=CodigoClienteNAV";
Debug.ShouldStop(2097152);
_arrdatoslineapedido.setArrayElement (_codigoclientenav,BA.numberCast(int.class, 2));
 BA.debugLineNum = 5207;BA.debugLine="ArrDatosLineaPedido(3)=CodigoDireccionEnvioNAV";
Debug.ShouldStop(4194304);
_arrdatoslineapedido.setArrayElement (_codigodireccionenvionav,BA.numberCast(int.class, 3));
 BA.debugLineNum = 5208;BA.debugLine="ArrDatosLineaPedido(4)=DocumentoExterno";
Debug.ShouldStop(8388608);
_arrdatoslineapedido.setArrayElement (_documentoexterno,BA.numberCast(int.class, 4));
 BA.debugLineNum = 5209;BA.debugLine="ArrDatosLineaPedido(5)=\"0299\"";
Debug.ShouldStop(16777216);
_arrdatoslineapedido.setArrayElement (BA.ObjectToString("0299"),BA.numberCast(int.class, 5));
 BA.debugLineNum = 5210;BA.debugLine="ArrDatosLineaPedido(6)=FechaPedidoClienteNAV";
Debug.ShouldStop(33554432);
_arrdatoslineapedido.setArrayElement (_fechapedidoclientenav,BA.numberCast(int.class, 6));
 BA.debugLineNum = 5211;BA.debugLine="ArrDatosLineaPedido(7)=rsLineasPedido.GetStrin";
Debug.ShouldStop(67108864);
_arrdatoslineapedido.setArrayElement (_rslineaspedido.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoProductoERP"))),BA.numberCast(int.class, 7));
 BA.debugLineNum = 5212;BA.debugLine="ArrDatosLineaPedido(8)=\"\"";
Debug.ShouldStop(134217728);
_arrdatoslineapedido.setArrayElement (BA.ObjectToString(""),BA.numberCast(int.class, 8));
 BA.debugLineNum = 5213;BA.debugLine="ArrDatosLineaPedido(9)=rsLineasPedido.GetStrin";
Debug.ShouldStop(268435456);
_arrdatoslineapedido.setArrayElement (_rslineaspedido.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TallaERP"))),BA.numberCast(int.class, 9));
 BA.debugLineNum = 5214;BA.debugLine="ArrDatosLineaPedido(10)=rsLineasPedido.GetInt(";
Debug.ShouldStop(536870912);
_arrdatoslineapedido.setArrayElement (BA.NumberToString(_rslineaspedido.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("TotalCantidad")))),BA.numberCast(int.class, 10));
 BA.debugLineNum = 5215;BA.debugLine="ArrDatosLineaPedido(11)=Precio";
Debug.ShouldStop(1073741824);
_arrdatoslineapedido.setArrayElement (BA.NumberToString(_precio),BA.numberCast(int.class, 11));
 BA.debugLineNum = 5217;BA.debugLine="lstLineasPedidoVenta.Add(ArrDatosLineaPedido)";
Debug.ShouldStop(1);
_lstlineaspedidoventa.runVoidMethod ("Add",(Object)((_arrdatoslineapedido)));
 if (true) break;

case 376:
//C
this.state = 377;
;
 BA.debugLineNum = 5221;BA.debugLine="rsLineasPedido.Close";
Debug.ShouldStop(16);
_rslineaspedido.runVoidMethod ("Close");
 BA.debugLineNum = 5225;BA.debugLine="If lstLineasPedidoVenta.Size>0 Then";
Debug.ShouldStop(256);
if (true) break;

case 377:
//if
this.state = 386;
if (RemoteObject.solveBoolean(">",_lstlineaspedidoventa.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 379;
}if (true) break;

case 379:
//C
this.state = 380;
 BA.debugLineNum = 5226;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(512);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 5227;BA.debugLine="Try";
Debug.ShouldStop(1024);
if (true) break;

case 380:
//try
this.state = 385;
this.catchState = 384;
this.state = 382;
if (true) break;

case 382:
//C
this.state = 385;
this.catchState = 384;
 BA.debugLineNum = 5228;BA.debugLine="su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCS";
Debug.ShouldStop(2048);
_su.runVoidMethod ("SaveCSV2",(Object)(_carpetaficherocsv),(Object)(_nombreficherocsv),(Object)(BA.ObjectToChar(";")),(Object)(_lstlineaspedidoventa),(Object)(_lstheaders));
 Debug.CheckDeviceExceptions();
if (true) break;

case 384:
//C
this.state = 385;
this.catchState = 0;
 BA.debugLineNum = 5231;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","835390032",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 385:
//C
this.state = 386;
this.catchState = 0;
;
 if (true) break;

case 386:
//C
this.state = 370;
;
 if (true) break;

case 387:
//C
this.state = 388;
;
 BA.debugLineNum = 5237;BA.debugLine="rsCabeceraPedidosLineasSinError.close";
Debug.ShouldStop(1048576);
_rscabecerapedidoslineassinerror.runVoidMethod ("Close");
 if (true) break;

case 388:
//C
this.state = -1;
;
 BA.debugLineNum = 5241;BA.debugLine="jamLoadingIndicator1.DetenerControlTiempoProceso";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_detenercontroltiempoproceso" /*RemoteObject*/ );
 BA.debugLineNum = 5242;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 5245;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 5246;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _procesocompleto(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ProcesoCompleto (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,5420);
if (RapidSub.canDelegate("procesocompleto")) { __ref.runUserSub(false, "crepsol","procesocompleto", __ref); return;}
ResumableSub_ProcesoCompleto rsub = new ResumableSub_ProcesoCompleto(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ProcesoCompleto extends BA.ResumableSub {
public ResumableSub_ProcesoCompleto(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _diaactual = RemoteObject.createImmutable("");
RemoteObject _fechahorainicioproceso = RemoteObject.createImmutable(0L);
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _ultimodiaprocesado = RemoteObject.createImmutable(0L);
RemoteObject _t = RemoteObject.createImmutable(0L);
RemoteObject _dift = RemoteObject.createImmutable(0L);
RemoteObject _respjrdc = RemoteObject.declareNull("b4j.docU.main._tiporespuestajrdc");
RemoteObject _fechahorainicializaciondatos = RemoteObject.createImmutable(0L);
RemoteObject _nombreficheropedido = RemoteObject.createImmutable("");
RemoteObject _rutaftpficheropedido = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ProcesoCompleto (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,5420);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 5421;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(4096);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 5422;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(8192);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 5424;BA.debugLine="Dim DiaActual As String=DateTime.Date(DateTime.No";
Debug.ShouldStop(32768);
_diaactual = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("DiaActual", _diaactual);Debug.locals.put("DiaActual", _diaactual);
 BA.debugLineNum = 5426;BA.debugLine="Dim FechaHoraInicioProceso As Long=DateTime.now";
Debug.ShouldStop(131072);
_fechahorainicioproceso = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("FechaHoraInicioProceso", _fechahorainicioproceso);Debug.locals.put("FechaHoraInicioProceso", _fechahorainicioproceso);
 BA.debugLineNum = 5428;BA.debugLine="Wait For(CargaRepsolUltimoDiaProcesadoDatosPedido";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesocompleto"), __ref.runClassMethod (b4j.docU.crepsol.class, "_cargarepsolultimodiaprocesadodatospedidosonline" /*RemoteObject*/ ));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 5429;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 5430;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 5431;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
Debug.ShouldStop(4194304);
_error = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 5432;BA.debugLine="Wait For(EnviarEmailAviso(True,\"ERROR Carga Reps";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesocompleto"), __ref.runClassMethod (b4j.docU.crepsol.class, "_enviaremailaviso" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")),(Object)(BA.ObjectToString("ERROR Carga Repsol Ultimo Dia ProcesadoDatos Pedidos OnLine EESS")),(Object)(_error)));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 5434;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 5436;BA.debugLine="Dim UltimoDiaProcesado As Long=mRes.Get(\"UltimoDi";
Debug.ShouldStop(134217728);
_ultimodiaprocesado = BA.numberCast(long.class, _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UltimoDiaPedidosOnlineProcesado")))));Debug.locals.put("UltimoDiaProcesado", _ultimodiaprocesado);Debug.locals.put("UltimoDiaProcesado", _ultimodiaprocesado);
 BA.debugLineNum = 5438;BA.debugLine="If DateUtils.IsSameDay(DateTime.Now,UltimoDiaProc";
Debug.ShouldStop(536870912);
if (true) break;

case 5:
//if
this.state = 8;
if (parent._dateutils.runMethod(true,"_issameday",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(_ultimodiaprocesado)).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 5440;BA.debugLine="Dim t As Long = Utilidades.FindNextTime(Array As";
Debug.ShouldStop(-2147483648);
_t = parent._utilidades.runMethod(true,"_findnexttime" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("double",new int[] {1},new Object[] {BA.numberCast(double.class, 6)})))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 5441;BA.debugLine="Log($\"Próxima ejecución proceso REPSOL Pedidos O";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","835717141",(RemoteObject.concat(RemoteObject.createImmutable("Próxima ejecución proceso REPSOL Pedidos Online EESS: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("datetime")),(Object)((_t))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 5443;BA.debugLine="Dim DifT As Long=t-DateTime.Now";
Debug.ShouldStop(4);
_dift = RemoteObject.solve(new RemoteObject[] {_t,parent.__c.getField(false,"DateTime").runMethod(true,"getNow")}, "-",1, 2);Debug.locals.put("DifT", _dift);Debug.locals.put("DifT", _dift);
 BA.debugLineNum = 5446;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(32);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 5449;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 5452;BA.debugLine="Wait For(InicializacionDatos) complete (respJRDC";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesocompleto"), __ref.runClassMethod (b4j.docU.crepsol.class, "_inicializaciondatos" /*RemoteObject*/ ));
this.state = 37;
return;
case 37:
//C
this.state = 9;
_respjrdc = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("respJRDC", _respjrdc);
;
 BA.debugLineNum = 5453;BA.debugLine="Dim FechaHoraInicializacionDatos As Long=DateTime";
Debug.ShouldStop(4096);
_fechahorainicializaciondatos = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("FechaHoraInicializacionDatos", _fechahorainicializaciondatos);Debug.locals.put("FechaHoraInicializacionDatos", _fechahorainicializaciondatos);
 BA.debugLineNum = 5454;BA.debugLine="If respJRDC.Accion=\"NOK\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_respjrdc.getField(true,"Accion" /*RemoteObject*/ ),BA.ObjectToString("NOK"))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 5455;BA.debugLine="Dim Error As String=respJRDC.Error";
Debug.ShouldStop(16384);
_error = _respjrdc.getField(true,"Error" /*RemoteObject*/ );Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 5456;BA.debugLine="Wait For(EnviarEmailAviso(True,\"ERROR inicializa";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesocompleto"), __ref.runClassMethod (b4j.docU.crepsol.class, "_enviaremailaviso" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")),(Object)(BA.ObjectToString("ERROR inicializacion datos Proceso Pedidos OnLine REPSOL EESS")),(Object)(_error)));
this.state = 38;
return;
case 38:
//C
this.state = 14;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 5458;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 5463;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(4194304);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 5464;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(8388608);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 5468;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(134217728);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 5478;BA.debugLine="Wait For(BuscarUltimoFicheroPedidoEnFTP) complete";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesocompleto"), __ref.runClassMethod (b4j.docU.crepsol.class, "_buscarultimoficheropedidoenftp" /*RemoteObject*/ ));
this.state = 39;
return;
case 39:
//C
this.state = 15;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 5479;BA.debugLine="If sResp.StartsWith(\"Error\") Then";
Debug.ShouldStop(64);
if (true) break;

case 15:
//if
this.state = 18;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Error"))).<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 5483;BA.debugLine="Dim Error As String=sResp";
Debug.ShouldStop(1024);
_error = _sresp;Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 5484;BA.debugLine="Wait For(EnviarEmailAviso(True,\"ERROR buscar ult";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesocompleto"), __ref.runClassMethod (b4j.docU.crepsol.class, "_enviaremailaviso" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")),(Object)(BA.ObjectToString("ERROR buscar ultimo fichero FTP Proceso Pedidos OnLine REPSOL EESS")),(Object)(_error)));
this.state = 40;
return;
case 40:
//C
this.state = 18;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 5486;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 5496;BA.debugLine="Dim NombreFicheroPedido As String=sResp";
Debug.ShouldStop(8388608);
_nombreficheropedido = _sresp;Debug.locals.put("NombreFicheroPedido", _nombreficheropedido);Debug.locals.put("NombreFicheroPedido", _nombreficheropedido);
 BA.debugLineNum = 5498;BA.debugLine="If NombreFicheroPedido=\"\" Then 'NO HAY FICHERO";
Debug.ShouldStop(33554432);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_nombreficheropedido,BA.ObjectToString(""))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 5499;BA.debugLine="Dim Error As String=sResp";
Debug.ShouldStop(67108864);
_error = _sresp;Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 5500;BA.debugLine="Wait For(EnviarEmailAviso(True,\"ERROR: No hay fi";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesocompleto"), __ref.runClassMethod (b4j.docU.crepsol.class, "_enviaremailaviso" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")),(Object)(BA.ObjectToString("ERROR: No hay fichero pedidos en FTP OUTBOX, Proceso Pedidos OnLine REPSOL EESS")),(Object)(_error)));
this.state = 41;
return;
case 41:
//C
this.state = 22;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 5502;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 5505;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";
Debug.ShouldStop(1);

case 22:
//if
this.state = 25;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombreficheropedido)).<Boolean>get().booleanValue()) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 5508;BA.debugLine="Log(\"segsdfg\")";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","835717208",RemoteObject.createImmutable("segsdfg"),0);
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 5511;BA.debugLine="Dim RutaFTPFicheroPedido As String=FilesFoldersFt";
Debug.ShouldStop(64);
_rutaftpficheropedido = RemoteObject.concat(__ref.getField(true,"_filesfoldersftprepsol" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_nombreficheropedido);Debug.locals.put("RutaFTPFicheroPedido", _rutaftpficheropedido);Debug.locals.put("RutaFTPFicheroPedido", _rutaftpficheropedido);
 BA.debugLineNum = 5514;BA.debugLine="Wait For(DescargarFicheroDesdeCarpetaFTP(RutaFTPF";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesocompleto"), __ref.runClassMethod (b4j.docU.crepsol.class, "_descargarficherodesdecarpetaftp" /*RemoteObject*/ ,(Object)(_rutaftpficheropedido),(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombreficheropedido)));
this.state = 42;
return;
case 42:
//C
this.state = 26;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 5516;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(2048);
if (true) break;

case 26:
//if
this.state = 31;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 5521;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 5523;BA.debugLine="DirFicheroProcesar=CarpetaDestinoFicherosDescarg";
Debug.ShouldStop(262144);
__ref.setField ("_dirficheroprocesar" /*RemoteObject*/ ,__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ ));
 BA.debugLineNum = 5524;BA.debugLine="NombreFicheroProcesar=NombreFicheroPedido";
Debug.ShouldStop(524288);
__ref.setField ("_nombreficheroprocesar" /*RemoteObject*/ ,_nombreficheropedido);
 if (true) break;
;
 BA.debugLineNum = 5534;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";
Debug.ShouldStop(536870912);

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )),(Object)(_nombreficheropedido)),parent.__c.getField(true,"False"))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 5535;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El fichero $";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El fichero "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheropedido))),RemoteObject.createImmutable(" descargado a carpeta destino Repsol "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ )))),RemoteObject.createImmutable(" NO se encuentra en esa carpeta.")))),(Object)(RemoteObject.createImmutable("ERROR")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 5536;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "procesocompleto"), _msa);
this.state = 43;
return;
case 43:
//C
this.state = 34;
;
 BA.debugLineNum = 5537;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 5538;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return ;
 if (true) break;

case 34:
//C
this.state = -1;
;
 BA.debugLineNum = 5548;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,617);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "crepsol","salirmodulo", __ref);}
 BA.debugLineNum = 617;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(256);
 BA.debugLineNum = 618;BA.debugLine="frm.Close";
Debug.ShouldStop(512);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 619;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(1024);
crepsol._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 620;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seleccionficherocarpetared(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SeleccionFicheroCarpetaRed (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,622);
if (RapidSub.canDelegate("seleccionficherocarpetared")) { return __ref.runUserSub(false, "crepsol","seleccionficherocarpetared", __ref);}
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 622;BA.debugLine="Sub SeleccionFicheroCarpetaRed As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 623;BA.debugLine="Dim fc As FileChooser";
Debug.ShouldStop(16384);
_fc = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 624;BA.debugLine="fc.Initialize";
Debug.ShouldStop(32768);
_fc.runVoidMethod ("Initialize");
 BA.debugLineNum = 625;BA.debugLine="fc.Title=\"Selecciona Fichero\"";
Debug.ShouldStop(65536);
_fc.runMethod(true,"setTitle",BA.ObjectToString("Selecciona Fichero"));
 BA.debugLineNum = 626;BA.debugLine="fc.SetExtensionFilter(\"Ficheros texto\", Array As";
Debug.ShouldStop(131072);
_fc.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("Ficheros texto")),(Object)(crepsol.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("*.txt")})))));
 BA.debugLineNum = 629;BA.debugLine="fc.InitialDirectory=CarpetaDestinoFicherosDescarg";
Debug.ShouldStop(1048576);
_fc.runMethod(true,"setInitialDirectory",__ref.getField(true,"_carpetadestinoficherosdescargadosftppedidosrepsol" /*RemoteObject*/ ));
 BA.debugLineNum = 630;BA.debugLine="Dim fileName As String = fc.ShowOpen(frm)";
Debug.ShouldStop(2097152);
_filename = _fc.runMethodAndSync(true,"ShowOpen",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 631;BA.debugLine="Return fileName";
Debug.ShouldStop(4194304);
if (true) return _filename;
 BA.debugLineNum = 657;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sftprepsol_promptyesno(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("sFtpRepsol_PromptYesNo (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,556);
if (RapidSub.canDelegate("sftprepsol_promptyesno")) { return __ref.runUserSub(false, "crepsol","sftprepsol_promptyesno", __ref, _message);}
Debug.locals.put("Message", _message);
 BA.debugLineNum = 556;BA.debugLine="Sub sFtpRepsol_PromptYesNo (Message As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 562;BA.debugLine="sFtpRepsol.SetPromptResult(True)";
Debug.ShouldStop(131072);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("SetPromptResult",(Object)(crepsol.__c.getField(true,"True")));
 BA.debugLineNum = 563;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sftprepsol_showmessage(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("sFtpRepsol_ShowMessage (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,565);
if (RapidSub.canDelegate("sftprepsol_showmessage")) { return __ref.runUserSub(false, "crepsol","sftprepsol_showmessage", __ref, _message);}
Debug.locals.put("Message", _message);
 BA.debugLineNum = 565;BA.debugLine="Sub sFtpRepsol_ShowMessage (Message As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 566;BA.debugLine="If Message.StartsWith(\"Welcome\")=False Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Welcome"))),crepsol.__c.getField(true,"False"))) { 
 BA.debugLineNum = 567;BA.debugLine="fx.Msgbox(frm,Message, \"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(_message),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 569;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sftprepsol_uploadcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("sFtpRepsol_UploadCompleted (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,591);
if (RapidSub.canDelegate("sftprepsol_uploadcompleted")) { return __ref.runUserSub(false, "crepsol","sftprepsol_uploadcompleted", __ref, _serverpath, _success);}
Debug.locals.put("ServerPath", _serverpath);
Debug.locals.put("Success", _success);
 BA.debugLineNum = 591;BA.debugLine="Sub sFtpRepsol_UploadCompleted (ServerPath As Stri";
Debug.ShouldStop(16384);
 BA.debugLineNum = 592;BA.debugLine="Log(ServerPath & \", Success=\" & Success)";
Debug.ShouldStop(32768);
crepsol.__c.runVoidMethod ("LogImpl","834078721",RemoteObject.concat(_serverpath,RemoteObject.createImmutable(", Success="),_success),0);
 BA.debugLineNum = 593;BA.debugLine="If Success = False Then Log(LastException.Message";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_success,crepsol.__c.getField(true,"False"))) { 
crepsol.__c.runVoidMethod ("LogImpl","834078722",crepsol.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);};
 BA.debugLineNum = 594;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sftprepsol_uploadprogress(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _totaluploaded,RemoteObject _total) throws Exception{
try {
		Debug.PushSubsStack("sFtpRepsol_UploadProgress (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,584);
if (RapidSub.canDelegate("sftprepsol_uploadprogress")) { return __ref.runUserSub(false, "crepsol","sftprepsol_uploadprogress", __ref, _serverpath, _totaluploaded, _total);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("ServerPath", _serverpath);
Debug.locals.put("TotalUploaded", _totaluploaded);
Debug.locals.put("Total", _total);
 BA.debugLineNum = 584;BA.debugLine="Sub sFtpRepsol_UploadProgress (ServerPath As Strin";
Debug.ShouldStop(128);
 BA.debugLineNum = 585;BA.debugLine="Dim s As String";
Debug.ShouldStop(256);
_s = RemoteObject.createImmutable("");Debug.locals.put("s", _s);
 BA.debugLineNum = 586;BA.debugLine="s = \"Uploaded \" & Round(TotalUploaded / 1000) & \"";
Debug.ShouldStop(512);
_s = RemoteObject.concat(RemoteObject.createImmutable("Uploaded "),crepsol.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_totaluploaded,RemoteObject.createImmutable(1000)}, "/",0, 0))),RemoteObject.createImmutable("KB"));Debug.locals.put("s", _s);
 BA.debugLineNum = 587;BA.debugLine="If Total > 0 Then s = s & \" out of \" & Round(Tota";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_total,BA.numberCast(long.class, 0))) { 
_s = RemoteObject.concat(_s,RemoteObject.createImmutable(" out of "),crepsol.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_total,RemoteObject.createImmutable(1000)}, "/",0, 0))),RemoteObject.createImmutable("KB"));Debug.locals.put("s", _s);};
 BA.debugLineNum = 588;BA.debugLine="Log(s)";
Debug.ShouldStop(2048);
crepsol.__c.runVoidMethod ("LogImpl","834013188",_s,0);
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "crepsol","show", __ref); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.crepsol parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _respjrdc = RemoteObject.declareNull("b4j.docU.main._tiporespuestajrdc");
RemoteObject _fechahorainicializaciondatos = RemoteObject.createImmutable(0L);
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,152);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 153;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 154;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(33554432);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 155;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(67108864);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 156;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(134217728);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 157;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(268435456);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 158;BA.debugLine="frm.RootPane.LoadLayout(\"scrRepsol\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrRepsol")));
 BA.debugLineNum = 161;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Repsol\"";
Debug.ShouldStop(1);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Repsol")));
 BA.debugLineNum = 163;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(4);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 164;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(8);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 166;BA.debugLine="frm.Show";
Debug.ShouldStop(32);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 255;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Inicializand";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Inicializando datos Repsol EESS...")));
 BA.debugLineNum = 256;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 258;BA.debugLine="Wait For(InicializacionDatos) complete (respJRDC";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "show"), __ref.runClassMethod (b4j.docU.crepsol.class, "_inicializaciondatos" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_respjrdc = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("respJRDC", _respjrdc);
;
 BA.debugLineNum = 259;BA.debugLine="Dim FechaHoraInicializacionDatos As Long=DateTime";
Debug.ShouldStop(4);
_fechahorainicializaciondatos = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("FechaHoraInicializacionDatos", _fechahorainicializaciondatos);Debug.locals.put("FechaHoraInicializacionDatos", _fechahorainicializaciondatos);
 BA.debugLineNum = 260;BA.debugLine="If respJRDC.Accion=\"NOK\" Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_respjrdc.getField(true,"Accion" /*RemoteObject*/ ),BA.ObjectToString("NOK"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 261;BA.debugLine="Dim Error As String=respJRDC.Error";
Debug.ShouldStop(16);
_error = _respjrdc.getField(true,"Error" /*RemoteObject*/ );Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 262;BA.debugLine="Wait For(EnviarEmailAviso(True,\"ERROR inicializa";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "show"), __ref.runClassMethod (b4j.docU.crepsol.class, "_enviaremailaviso" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")),(Object)(BA.ObjectToString("ERROR inicializacion datos Proceso Pedidos OnLine REPSOL EESS")),(Object)(_error)));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 264;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 270;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 272;BA.debugLine="End Sub";
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
public static RemoteObject  _subirficheroacarpetaftp(RemoteObject __ref,RemoteObject _carpetaorigen,RemoteObject _nombreficheroorigen,RemoteObject _rutaficherodestino) throws Exception{
try {
		Debug.PushSubsStack("SubirFicheroACarpetaFTP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,571);
if (RapidSub.canDelegate("subirficheroacarpetaftp")) { return __ref.runUserSub(false, "crepsol","subirficheroacarpetaftp", __ref, _carpetaorigen, _nombreficheroorigen, _rutaficherodestino);}
ResumableSub_SubirFicheroACarpetaFTP rsub = new ResumableSub_SubirFicheroACarpetaFTP(null,__ref,_carpetaorigen,_nombreficheroorigen,_rutaficherodestino);
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
public static class ResumableSub_SubirFicheroACarpetaFTP extends BA.ResumableSub {
public ResumableSub_SubirFicheroACarpetaFTP(b4j.docU.crepsol parent,RemoteObject __ref,RemoteObject _carpetaorigen,RemoteObject _nombreficheroorigen,RemoteObject _rutaficherodestino) {
this.parent = parent;
this.__ref = __ref;
this._carpetaorigen = _carpetaorigen;
this._nombreficheroorigen = _nombreficheroorigen;
this._rutaficherodestino = _rutaficherodestino;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsol parent;
RemoteObject _carpetaorigen;
RemoteObject _nombreficheroorigen;
RemoteObject _rutaficherodestino;
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SubirFicheroACarpetaFTP (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,571);
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
Debug.locals.put("CarpetaOrigen", _carpetaorigen);
Debug.locals.put("NombreFicheroOrigen", _nombreficheroorigen);
Debug.locals.put("RutaFicheroDestino", _rutaficherodestino);
 BA.debugLineNum = 572;BA.debugLine="sFtpRepsol.UploadFile(CarpetaOrigen, NombreFicher";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sftprepsol" /*RemoteObject*/ ).runVoidMethod ("UploadFile",__ref.getField(false, "ba"),(Object)(_carpetaorigen),(Object)(_nombreficheroorigen),(Object)(_rutaficherodestino));
 BA.debugLineNum = 573;BA.debugLine="Wait For sFtpRepsol_UploadCompleted (ServerPath A";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","sftprepsol_uploadcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "subirficheroacarpetaftp"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 575;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 576;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Error subien";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error subiendo fichero de errores de pedido "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheroorigen))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 578;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsol", "subirficheroacarpetaftp"), _msa);
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 581;BA.debugLine="Return Success";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 582;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _utf2android(RemoteObject __ref,RemoteObject _utf) throws Exception{
try {
		Debug.PushSubsStack("utf2android (crepsol) ","crepsol",10,__ref.getField(false, "ba"),__ref,1339);
if (RapidSub.canDelegate("utf2android")) { return __ref.runUserSub(false, "crepsol","utf2android", __ref, _utf);}
RemoteObject _m = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _android = null;
Debug.locals.put("utf", _utf);
 BA.debugLineNum = 1339;BA.debugLine="Sub utf2android(utf As String) As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1340;BA.debugLine="Dim m As Int = utf.Length-1";
Debug.ShouldStop(134217728);
_m = RemoteObject.solve(new RemoteObject[] {_utf.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1341;BA.debugLine="Dim i As Int";
Debug.ShouldStop(268435456);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1342;BA.debugLine="Dim android(m+1) As Byte";
Debug.ShouldStop(536870912);
_android = RemoteObject.createNewArray ("byte", new int[] {RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("android", _android);
 BA.debugLineNum = 1343;BA.debugLine="For i=0 To m";
Debug.ShouldStop(1073741824);
{
final int step4 = 1;
final int limit4 = _m.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step4 > 0 && _i.<Integer>get().intValue() <= limit4) || (step4 < 0 && _i.<Integer>get().intValue() >= limit4) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1344;BA.debugLine="android(i) = Asc(utf.CharAt(i))";
Debug.ShouldStop(-2147483648);
_android.setArrayElement (BA.numberCast(byte.class, crepsol.__c.runMethod(true,"Asc",(Object)(_utf.runMethod(true,"charAt",(Object)(_i))))),_i);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1346;BA.debugLine="Return BytesToString(android, 0, android.Length,";
Debug.ShouldStop(2);
if (true) return crepsol.__c.runMethod(true,"BytesToString",(Object)(_android),(Object)(BA.numberCast(int.class, 0)),(Object)(_android.getField(true,"length")),(Object)(RemoteObject.createImmutable("UTF-8")));
 BA.debugLineNum = 1347;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}