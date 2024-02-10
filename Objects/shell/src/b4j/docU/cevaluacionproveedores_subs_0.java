package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cevaluacionproveedores_subs_0 {


public static RemoteObject  _actualizardatosevaluacionproveedores12ultimosmeses(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosEvaluacionProveedores12UltimosMeses (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,825);
if (RapidSub.canDelegate("actualizardatosevaluacionproveedores12ultimosmeses")) { return __ref.runUserSub(false, "cevaluacionproveedores","actualizardatosevaluacionproveedores12ultimosmeses", __ref);}
ResumableSub_ActualizarDatosEvaluacionProveedores12UltimosMeses rsub = new ResumableSub_ActualizarDatosEvaluacionProveedores12UltimosMeses(null,__ref);
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
public static class ResumableSub_ActualizarDatosEvaluacionProveedores12UltimosMeses extends BA.ResumableSub {
public ResumableSub_ActualizarDatosEvaluacionProveedores12UltimosMeses(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _rsdatosnav = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _proveedor = RemoteObject.createImmutable("");
RemoteObject _nombreproveedor = RemoteObject.createImmutable("");
RemoteObject _bloqueado = RemoteObject.createImmutable(0);
RemoteObject _grupocontableproveedor = RemoteObject.createImmutable("");
RemoteObject _totalimportenetofacturacion = RemoteObject.createImmutable(0);
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosEvaluacionProveedores12UltimosMeses (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,825);
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
 BA.debugLineNum = 828;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Actualizando datos NAV 12 meses...")));
 BA.debugLineNum = 829;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 830;BA.debugLine="Wait For(ActualizarDatosNAVEvaluacionProveedores)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosevaluacionproveedores12ultimosmeses"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_actualizardatosnavevaluacionproveedores" /*RemoteObject*/ ));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 831;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 832;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 833;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 834;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 837;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
Debug.ShouldStop(16);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Actualizando datos proveedores en tabla evaluación...")));
 BA.debugLineNum = 839;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(64);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 840;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(128);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 841;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eva";
Debug.ShouldStop(256);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("EvaluacionProveedoresBorrarDatosNAV")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 842;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(512);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 843;BA.debugLine="Dim rsDatosNAV As ResultSet=mSQL.ExecQuery(\"selec";
Debug.ShouldStop(1024);
_rsdatosnav = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdatosnav = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblEvaluacionProveedoresDatosNAVPeriodo order by Proveedor")));Debug.locals.put("rsDatosNAV", _rsdatosnav);Debug.locals.put("rsDatosNAV", _rsdatosnav);
 BA.debugLineNum = 844;BA.debugLine="Do While rsDatosNAV.NextRow";
Debug.ShouldStop(2048);
if (true) break;

case 5:
//do while
this.state = 8;
while (_rsdatosnav.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
 BA.debugLineNum = 845;BA.debugLine="Dim Proveedor As String=rsDatosNAV.GetString(\"Pr";
Debug.ShouldStop(4096);
_proveedor = _rsdatosnav.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Proveedor")));Debug.locals.put("Proveedor", _proveedor);Debug.locals.put("Proveedor", _proveedor);
 BA.debugLineNum = 846;BA.debugLine="Dim NombreProveedor As String=rsDatosNAV.GetStri";
Debug.ShouldStop(8192);
_nombreproveedor = _rsdatosnav.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("NombreProveedor")));Debug.locals.put("NombreProveedor", _nombreproveedor);Debug.locals.put("NombreProveedor", _nombreproveedor);
 BA.debugLineNum = 847;BA.debugLine="Dim Bloqueado As Int=rsDatosNAV.GetString(\"Bloqu";
Debug.ShouldStop(16384);
_bloqueado = BA.numberCast(int.class, _rsdatosnav.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Bloqueado"))));Debug.locals.put("Bloqueado", _bloqueado);Debug.locals.put("Bloqueado", _bloqueado);
 BA.debugLineNum = 848;BA.debugLine="Dim GrupoContableProveedor As String=rsDatosNAV.";
Debug.ShouldStop(32768);
_grupocontableproveedor = _rsdatosnav.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("GrupoContableProveedor")));Debug.locals.put("GrupoContableProveedor", _grupocontableproveedor);Debug.locals.put("GrupoContableProveedor", _grupocontableproveedor);
 BA.debugLineNum = 849;BA.debugLine="Dim TotalImporteNetoFacturacion As Double=rsDato";
Debug.ShouldStop(65536);
_totalimportenetofacturacion = BA.numberCast(double.class, _rsdatosnav.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TotalImporteNetoFacturacion"))));Debug.locals.put("TotalImporteNetoFacturacion", _totalimportenetofacturacion);Debug.locals.put("TotalImporteNetoFacturacion", _totalimportenetofacturacion);
 BA.debugLineNum = 850;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Ev";
Debug.ShouldStop(131072);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("EvaluacionProveedoresInsertarDatosNAVProveedor")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_proveedor),(_nombreproveedor),(_bloqueado),(_grupocontableproveedor),(_totalimportenetofacturacion)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 851;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(262144);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 853;BA.debugLine="rsDatosNAV.Close";
Debug.ShouldStop(1048576);
_rsdatosnav.runVoidMethod ("Close");
 BA.debugLineNum = 855;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosevaluacionproveedores12ultimosmeses"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands)));
this.state = 18;
return;
case 18:
//C
this.state = 9;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 856;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 857;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 858;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible actualizar los datos NAV de proveedores.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 859;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosevaluacionproveedores12ultimosmeses"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 12;
;
 BA.debugLineNum = 860;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 863;BA.debugLine="Wait For(EvaluacionProveedoresActualizarVariables";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosevaluacionproveedores12ultimosmeses"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_evaluacionproveedoresactualizarvariables" /*RemoteObject*/ ));
this.state = 20;
return;
case 20:
//C
this.state = 13;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 864;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 865;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 866;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 867;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 893;BA.debugLine="wait for (RefrescarDatosActualesEvaluacion) compl";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosevaluacionproveedores12ultimosmeses"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_refrescardatosactualesevaluacion" /*RemoteObject*/ ));
this.state = 21;
return;
case 21:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 895;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 896;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 897;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizardatosnavevaluacionproveedores(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosNAVEvaluacionProveedores (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,325);
if (RapidSub.canDelegate("actualizardatosnavevaluacionproveedores")) { return __ref.runUserSub(false, "cevaluacionproveedores","actualizardatosnavevaluacionproveedores", __ref);}
ResumableSub_ActualizarDatosNAVEvaluacionProveedores rsub = new ResumableSub_ActualizarDatosNAVEvaluacionProveedores(null,__ref);
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
public static class ResumableSub_ActualizarDatosNAVEvaluacionProveedores extends BA.ResumableSub {
public ResumableSub_ActualizarDatosNAVEvaluacionProveedores(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosNAVEvaluacionProveedores (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,325);
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
 BA.debugLineNum = 327;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblEvaluacionProve";
Debug.ShouldStop(64);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblEvaluacionProveedoresDatosNAVPeriodo")));
 BA.debugLineNum = 329;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(256);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 330;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(512);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 331;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 332;BA.debugLine="Dim Comando As String=\"DatosEvaluacionProveedores";
Debug.ShouldStop(2048);
_comando = BA.ObjectToString("DatosEvaluacionProveedores");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 333;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
Debug.ShouldStop(4096);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 335;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosnavevaluacionproveedores"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 337;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 338;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 339;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 340;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosnavevaluacionproveedores"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 341;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 342;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2097152);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 345;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 346;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 347;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de proveedores de navision.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 348;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosnavevaluacionproveedores"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 349;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 350;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 352;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(-2147483648);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 356;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 357;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 359;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(64);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblEvaluacionProveedoresDatosNAVPeriodo")),(Object)(_lstreg));
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
 BA.debugLineNum = 362;BA.debugLine="Return mRes";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 363;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _actualizardatosproveedorfijoproveedor(RemoteObject __ref,RemoteObject _provsel) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosProveedorFijoProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1198);
if (RapidSub.canDelegate("actualizardatosproveedorfijoproveedor")) { return __ref.runUserSub(false, "cevaluacionproveedores","actualizardatosproveedorfijoproveedor", __ref, _provsel);}
ResumableSub_ActualizarDatosProveedorFijoProveedor rsub = new ResumableSub_ActualizarDatosProveedorFijoProveedor(null,__ref,_provsel);
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
public static class ResumableSub_ActualizarDatosProveedorFijoProveedor extends BA.ResumableSub {
public ResumableSub_ActualizarDatosProveedorFijoProveedor(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosProveedorFijoProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1198);
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
Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 1199;BA.debugLine="Wait For(EvaluacionProveedoresDatosProveedorFijo(";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosproveedorfijoproveedor"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_evaluacionproveedoresdatosproveedorfijo" /*RemoteObject*/ ,(Object)(_provsel)));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1200;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1201;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 1202;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1203;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1206;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(2097152);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1208;BA.debugLine="Dim rSub As ResumableSub=jamTableViewMotivosFijar";
Debug.ShouldStop(8388608);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_lstreg.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1209;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosproveedorfijoproveedor"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 1210;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1211;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(67108864);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 1212;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 5:
//if
this.state = 25;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1213;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(268435456);
if (true) break;

case 8:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1214;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1215;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosproveedorfijoproveedor"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
 BA.debugLineNum = 1217;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1218;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosproveedorfijoproveedor"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1219;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(4);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1220;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.Ab";
Debug.ShouldStop(8);
__ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 1221;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 1224;BA.debugLine="ExitApplication";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 1226;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(512);

case 15:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1227;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(1024);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 1228;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1229;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "actualizardatosproveedorfijoproveedor"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 1232;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1233;BA.debugLine="End Sub";
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
public static void  _addmotivosproveedorfijoevaluacion(RemoteObject __ref,RemoteObject _provsel,RemoteObject _nombreprovsel) throws Exception{
try {
		Debug.PushSubsStack("AddMotivosProveedorFijoEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,670);
if (RapidSub.canDelegate("addmotivosproveedorfijoevaluacion")) { __ref.runUserSub(false, "cevaluacionproveedores","addmotivosproveedorfijoevaluacion", __ref, _provsel, _nombreprovsel); return;}
ResumableSub_AddMotivosProveedorFijoEvaluacion rsub = new ResumableSub_AddMotivosProveedorFijoEvaluacion(null,__ref,_provsel,_nombreprovsel);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AddMotivosProveedorFijoEvaluacion extends BA.ResumableSub {
public ResumableSub_AddMotivosProveedorFijoEvaluacion(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel,RemoteObject _nombreprovsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._nombreprovsel = _nombreprovsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _nombreprovsel;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _opcionsel = RemoteObject.createImmutable("");
RemoteObject _mdatalista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _descrmap = RemoteObject.createImmutable("");
RemoteObject _idmotivosel = RemoteObject.createImmutable(0);
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group21;
int index21;
int groupLen21;
RemoteObject group41;
int index41;
int groupLen41;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AddMotivosProveedorFijoEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,670);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("ProvSel", _provsel);
Debug.locals.put("NombreProvSel", _nombreprovsel);
 BA.debugLineNum = 671;BA.debugLine="Wait For(EvaluacionProveedoresListaMotivosProveed";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "addmotivosproveedorfijoevaluacion"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor" /*RemoteObject*/ ,(Object)(_provsel)));
this.state = 49;
return;
case 49:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 672;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 673;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(1);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 674;BA.debugLine="If Accion=\"NOK\" Then Return";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
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
 BA.debugLineNum = 675;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(4);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 676;BA.debugLine="If lstReg.Size=0 Then Return";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_lstreg.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 680;BA.debugLine="Dialog.Title=$\"Selecciona motivo de proveedor fij";
Debug.ShouldStop(128);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,((RemoteObject.concat(RemoteObject.createImmutable("Selecciona motivo de proveedor fijo a asignar al proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable(".")))));
 BA.debugLineNum = 681;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(256);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 682;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(512);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 683;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 684;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(2048);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 685;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(4096);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 687;BA.debugLine="B4XListDlg.AllowMultiSelection=False";
Debug.ShouldStop(16384);
_b4xlistdlg.setField ("_allowmultiselection" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 690;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(131072);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 691;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(262144);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 692;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(524288);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 694;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(2097152);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 695;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(4194304);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 697;BA.debugLine="Dim lstOpciones As List";
Debug.ShouldStop(16777216);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 698;BA.debugLine="lstOpciones.Initialize";
Debug.ShouldStop(33554432);
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 699;BA.debugLine="For Each mData As Map In lstReg";
Debug.ShouldStop(67108864);
if (true) break;

case 13:
//for
this.state = 16;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = _lstreg;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 50;
if (true) break;

case 50:
//C
this.state = 16;
if (index21 < groupLen21) {
this.state = 15;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group21.runMethod(false,"Get",index21));Debug.locals.put("mData", _mdata);}
if (true) break;

case 51:
//C
this.state = 50;
index21++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 15:
//C
this.state = 51;
 BA.debugLineNum = 700;BA.debugLine="lstOpciones.Add(mData.Get(\"DescripcionMotivoProv";
Debug.ShouldStop(134217728);
_lstopciones.runVoidMethod ("Add",(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DescripcionMotivoProveedorFijoEvaluacion"))))));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 703;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(1073741824);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 705;BA.debugLine="B4XListDlg.Resize(600dip, 400dip)";
Debug.ShouldStop(1);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))));
 BA.debugLineNum = 707;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(4);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 727;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(4194304);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 728;BA.debugLine="If bOK.IsInitialized Then";
Debug.ShouldStop(8388608);
if (true) break;

case 17:
//if
this.state = 20;
if (_bok.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 730;BA.debugLine="bOK.Left=5dip";
Debug.ShouldStop(33554432);
_bok.runMethod(true,"setLeft",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 BA.debugLineNum = 731;BA.debugLine="bOK.TextSize=18";
Debug.ShouldStop(67108864);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 734;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(536870912);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 735;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 21:
//if
this.state = 24;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 737;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(1);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 738;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(2);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 739;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(4);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 742;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "addmotivosproveedorfijoevaluacion"), _rsub);
this.state = 52;
return;
case 52:
//C
this.state = 25;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 744;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(128);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
if (true) return ;
if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 771;BA.debugLine="Dim OpcionSel As String=B4XListDlg.SelectedItem";
Debug.ShouldStop(4);
_opcionsel = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("OpcionSel", _opcionsel);Debug.locals.put("OpcionSel", _opcionsel);
 BA.debugLineNum = 772;BA.debugLine="For Each mDataLista As Map In lstReg";
Debug.ShouldStop(8);
if (true) break;

case 31:
//for
this.state = 38;
_mdatalista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group41 = _lstreg;
index41 = 0;
groupLen41 = group41.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDataLista", _mdatalista);
this.state = 53;
if (true) break;

case 53:
//C
this.state = 38;
if (index41 < groupLen41) {
this.state = 33;
_mdatalista = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group41.runMethod(false,"Get",index41));Debug.locals.put("mDataLista", _mdatalista);}
if (true) break;

case 54:
//C
this.state = 53;
index41++;
Debug.locals.put("mDataLista", _mdatalista);
if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 773;BA.debugLine="Dim DescrMap As String=mDataLista.Get(\"Descripci";
Debug.ShouldStop(16);
_descrmap = BA.ObjectToString(_mdatalista.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DescripcionMotivoProveedorFijoEvaluacion")))));Debug.locals.put("DescrMap", _descrmap);Debug.locals.put("DescrMap", _descrmap);
 BA.debugLineNum = 774;BA.debugLine="If DescrMap=OpcionSel Then";
Debug.ShouldStop(32);
if (true) break;

case 34:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",_descrmap,_opcionsel)) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 775;BA.debugLine="Dim IDMotivoSel As Int=mDataLista.Get(\"IDMotivo";
Debug.ShouldStop(64);
_idmotivosel = BA.numberCast(int.class, _mdatalista.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDMotivoProveedorFijoEvaluacion")))));Debug.locals.put("IDMotivoSel", _idmotivosel);Debug.locals.put("IDMotivoSel", _idmotivosel);
 BA.debugLineNum = 776;BA.debugLine="Exit";
Debug.ShouldStop(128);
this.state = 38;
if (true) break;
 if (true) break;

case 37:
//C
this.state = 54;
;
 if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
Debug.locals.put("mDataLista", _mdatalista);
;
 BA.debugLineNum = 780;BA.debugLine="Wait For(GrabarNuevoMotivoProveedorFijo(ProvSel,N";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "addmotivosproveedorfijoevaluacion"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_grabarnuevomotivoproveedorfijo" /*RemoteObject*/ ,(Object)(_provsel),(Object)(_nombreprovsel),(Object)(_idmotivosel)));
this.state = 55;
return;
case 55:
//C
this.state = 39;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 781;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 782;BA.debugLine="If Accion=\"NOK\" Then Return";
Debug.ShouldStop(8192);
if (true) break;

case 39:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 41;
;}if (true) break;

case 41:
//C
this.state = 44;
if (true) return ;
if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 784;BA.debugLine="Wait For(ActualizarDatosProveedorFijoProveedor(Pr";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "addmotivosproveedorfijoevaluacion"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_actualizardatosproveedorfijoproveedor" /*RemoteObject*/ ,(Object)(_provsel)));
this.state = 56;
return;
case 56:
//C
this.state = 45;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 785;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(65536);
if (true) break;

case 45:
//if
this.state = 48;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 787;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;

case 48:
//C
this.state = -1;
;
 BA.debugLineNum = 791;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _borrarcalificacionproveedor(RemoteObject __ref,RemoteObject _provsel,RemoteObject _filasel) throws Exception{
try {
		Debug.PushSubsStack("BorrarCalificacionProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1060);
if (RapidSub.canDelegate("borrarcalificacionproveedor")) { return __ref.runUserSub(false, "cevaluacionproveedores","borrarcalificacionproveedor", __ref, _provsel, _filasel);}
ResumableSub_BorrarCalificacionProveedor rsub = new ResumableSub_BorrarCalificacionProveedor(null,__ref,_provsel,_filasel);
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
public static class ResumableSub_BorrarCalificacionProveedor extends BA.ResumableSub {
public ResumableSub_BorrarCalificacionProveedor(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel,RemoteObject _filasel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._filasel = _filasel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _filasel;
RemoteObject _calificacionactualprovsel = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _nuevacalificacion = RemoteObject.createImmutable("");
RemoteObject _datetimeactualizacion = RemoteObject.createImmutable(0L);
RemoteObject _usuariocalificacion = RemoteObject.createImmutable("");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BorrarCalificacionProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1060);
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
Debug.locals.put("ProvSel", _provsel);
Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 1061;BA.debugLine="Dim CalificacionActualProvSel As String=jamTableV";
Debug.ShouldStop(16);
_calificacionactualprovsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Calificacion"))));Debug.locals.put("CalificacionActualProvSel", _calificacionactualprovsel);Debug.locals.put("CalificacionActualProvSel", _calificacionactualprovsel);
 BA.debugLineNum = 1062;BA.debugLine="If CalificacionActualProvSel=\"\" Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_calificacionactualprovsel,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1063;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",$\"El prove";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "borrarcalificacionproveedor"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable(" no tiene calificación."))))));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 1064;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1067;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"¿Borr";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "borrarcalificacionproveedor"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("¿Borrar los datos de calificación del proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable("?")))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1068;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(2048);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1069;BA.debugLine="Dim NuevaCalificacion As String=\"\"";
Debug.ShouldStop(4096);
_nuevacalificacion = BA.ObjectToString("");Debug.locals.put("NuevaCalificacion", _nuevacalificacion);Debug.locals.put("NuevaCalificacion", _nuevacalificacion);
 BA.debugLineNum = 1070;BA.debugLine="Dim DateTimeActualizacion As Long=0";
Debug.ShouldStop(8192);
_datetimeactualizacion = BA.numberCast(long.class, 0);Debug.locals.put("DateTimeActualizacion", _datetimeactualizacion);Debug.locals.put("DateTimeActualizacion", _datetimeactualizacion);
 BA.debugLineNum = 1071;BA.debugLine="Dim UsuarioCalificacion As String=\"\"";
Debug.ShouldStop(16384);
_usuariocalificacion = BA.ObjectToString("");Debug.locals.put("UsuarioCalificacion", _usuariocalificacion);Debug.locals.put("UsuarioCalificacion", _usuariocalificacion);
 BA.debugLineNum = 1073;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eva";
Debug.ShouldStop(65536);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("EvaluacionProveedoresActualizarCalificacionProveedor")),(Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(_provsel),(_datetimeactualizacion),RemoteObject.createImmutable(("")),(_usuariocalificacion),(_datetimeactualizacion),(_nuevacalificacion),(_usuariocalificacion)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1075;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "borrarcalificacionproveedor"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 17;
return;
case 17:
//C
this.state = 11;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 1076;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(524288);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1077;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1078;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido p";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible borrar la calificación del proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable(".")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1079;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "borrarcalificacionproveedor"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
;
 BA.debugLineNum = 1080;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1083;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetimeactualizacion),(_nuevacalificacion),(_usuariocalificacion),(_provsel)})))));
 BA.debugLineNum = 1084;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetimeactualizacion),(_nuevacalificacion),(_usuariocalificacion),(_provsel)})))));
 BA.debugLineNum = 1086;BA.debugLine="jamTableViewEvaluacionProveedores.RefrescarFilaTV";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescarfilatvmetodosql" /*RemoteObject*/ ,(Object)(_filasel));
 BA.debugLineNum = 1088;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1090;BA.debugLine="End Sub";
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
public static RemoteObject  _borrarvalidacioncalificacionproveedor(RemoteObject __ref,RemoteObject _provsel,RemoteObject _filasel) throws Exception{
try {
		Debug.PushSubsStack("BorrarValidacionCalificacionProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1552);
if (RapidSub.canDelegate("borrarvalidacioncalificacionproveedor")) { return __ref.runUserSub(false, "cevaluacionproveedores","borrarvalidacioncalificacionproveedor", __ref, _provsel, _filasel);}
ResumableSub_BorrarValidacionCalificacionProveedor rsub = new ResumableSub_BorrarValidacionCalificacionProveedor(null,__ref,_provsel,_filasel);
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
public static class ResumableSub_BorrarValidacionCalificacionProveedor extends BA.ResumableSub {
public ResumableSub_BorrarValidacionCalificacionProveedor(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel,RemoteObject _filasel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._filasel = _filasel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _filasel;
RemoteObject _validacioncalificacionactualprovsel = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _datetimeactualizacion = RemoteObject.createImmutable(0L);
RemoteObject _usuariovalidacioncalificacion = RemoteObject.createImmutable("");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BorrarValidacionCalificacionProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1552);
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
Debug.locals.put("ProvSel", _provsel);
Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 1553;BA.debugLine="Dim ValidacionCalificacionActualProvSel As String";
Debug.ShouldStop(65536);
_validacioncalificacionactualprovsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("ValidacionCalificacion"))));Debug.locals.put("ValidacionCalificacionActualProvSel", _validacioncalificacionactualprovsel);Debug.locals.put("ValidacionCalificacionActualProvSel", _validacioncalificacionactualprovsel);
 BA.debugLineNum = 1554;BA.debugLine="If ValidacionCalificacionActualProvSel=\"\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_validacioncalificacionactualprovsel,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1555;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",$\"El prove";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "borrarvalidacioncalificacionproveedor"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable(" no tiene calificación validada."))))));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 1556;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1559;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"¿Borr";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "borrarvalidacioncalificacionproveedor"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("¿Borrar los datos de validación de calificación del proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable("?")))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1560;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(8388608);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1561;BA.debugLine="Dim DateTimeActualizacion As Long=0";
Debug.ShouldStop(16777216);
_datetimeactualizacion = BA.numberCast(long.class, 0);Debug.locals.put("DateTimeActualizacion", _datetimeactualizacion);Debug.locals.put("DateTimeActualizacion", _datetimeactualizacion);
 BA.debugLineNum = 1562;BA.debugLine="Dim UsuarioValidacionCalificacion As String=\"\"";
Debug.ShouldStop(33554432);
_usuariovalidacioncalificacion = BA.ObjectToString("");Debug.locals.put("UsuarioValidacionCalificacion", _usuariovalidacioncalificacion);Debug.locals.put("UsuarioValidacionCalificacion", _usuariovalidacioncalificacion);
 BA.debugLineNum = 1564;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eva";
Debug.ShouldStop(134217728);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("EvaluacionProveedoresActualizarValidacionCalificacionProveedor")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetimeactualizacion),RemoteObject.createImmutable(("")),(_usuariovalidacioncalificacion),(_provsel)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1566;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "borrarvalidacioncalificacionproveedor"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 17;
return;
case 17:
//C
this.state = 11;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 1567;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1568;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1569;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido p";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible borrar la validación de la calificación del proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable(".")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1570;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "borrarvalidacioncalificacionproveedor"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
;
 BA.debugLineNum = 1571;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1574;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetimeactualizacion),RemoteObject.createImmutable(("")),(_usuariovalidacioncalificacion),(_provsel)})))));
 BA.debugLineNum = 1575;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
Debug.ShouldStop(64);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetimeactualizacion),RemoteObject.createImmutable(("")),(_usuariovalidacioncalificacion),(_provsel)})))));
 BA.debugLineNum = 1577;BA.debugLine="jamTableViewEvaluacionProveedores.RefrescarFilaTV";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescarfilatvmetodosql" /*RemoteObject*/ ,(Object)(_filasel));
 BA.debugLineNum = 1579;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1581;BA.debugLine="End Sub";
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
public static RemoteObject  _btnmenuevaluacionproveedores_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMenuEvaluacionProveedores_Click (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("btnmenuevaluacionproveedores_click")) { return __ref.runUserSub(false, "cevaluacionproveedores","btnmenuevaluacionproveedores_click", __ref);}
 BA.debugLineNum = 292;BA.debugLine="Private Sub btnMenuEvaluacionProveedores_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 293;BA.debugLine="Drawer.LeftOpen=True";
Debug.ShouldStop(16);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,cevaluacionproveedores.__c.getField(true,"True"));
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calificarproveedor(RemoteObject __ref,RemoteObject _provsel,RemoteObject _filasel) throws Exception{
try {
		Debug.PushSubsStack("CalificarProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,990);
if (RapidSub.canDelegate("calificarproveedor")) { return __ref.runUserSub(false, "cevaluacionproveedores","calificarproveedor", __ref, _provsel, _filasel);}
ResumableSub_CalificarProveedor rsub = new ResumableSub_CalificarProveedor(null,__ref,_provsel,_filasel);
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
public static class ResumableSub_CalificarProveedor extends BA.ResumableSub {
public ResumableSub_CalificarProveedor(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel,RemoteObject _filasel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._filasel = _filasel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _filasel;
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
int _i = 0;
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _nuevacalificacion = RemoteObject.createImmutable("");
RemoteObject _datetimeactualizacion = RemoteObject.createImmutable(0L);
RemoteObject _usuariocalificacion = RemoteObject.createImmutable("");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
int step15;
int limit15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CalificarProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,990);
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
Debug.locals.put("ProvSel", _provsel);
Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 991;BA.debugLine="Dialog.Title=\"Selecciona Calificación\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Calificación")));
 BA.debugLineNum = 992;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 993;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(1);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 994;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(2);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 995;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(4);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 996;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(8);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 998;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(32);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 999;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(64);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 1000;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(128);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 1002;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(512);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 1003;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(1024);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 1005;BA.debugLine="Dim lstOpciones As List=Array As String(\"APTO\",\"N";
Debug.ShouldStop(4096);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstopciones = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("APTO"),RemoteObject.createImmutable("NO APTO")})));Debug.locals.put("lstOpciones", _lstopciones);Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 1007;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(16384);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 1009;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(65536);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1011;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//for
this.state = 4;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 4;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 3;
if (true) break;

case 20:
//C
this.state = 19;
_i = ((int)(0 + _i + step15)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 20;
 BA.debugLineNum = 1012;BA.debugLine="xclv.ResizeItem(i,80dip)";
Debug.ShouldStop(524288);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1016;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(8388608);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 1017;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(16777216);
if (true) break;

case 5:
//if
this.state = 8;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1019;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(67108864);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 1020;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(134217728);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 1021;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(268435456);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 1024;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "calificarproveedor"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1026;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(2);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 1028;BA.debugLine="Dim NuevaCalificacion As String=B4XListDlg.Select";
Debug.ShouldStop(8);
_nuevacalificacion = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("NuevaCalificacion", _nuevacalificacion);Debug.locals.put("NuevaCalificacion", _nuevacalificacion);
 BA.debugLineNum = 1037;BA.debugLine="Dim DateTimeActualizacion As Long=DateTime.Now";
Debug.ShouldStop(4096);
_datetimeactualizacion = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("DateTimeActualizacion", _datetimeactualizacion);Debug.locals.put("DateTimeActualizacion", _datetimeactualizacion);
 BA.debugLineNum = 1038;BA.debugLine="Dim UsuarioCalificacion As String=Main.DatosUsua";
Debug.ShouldStop(8192);
_usuariocalificacion = parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ );Debug.locals.put("UsuarioCalificacion", _usuariocalificacion);Debug.locals.put("UsuarioCalificacion", _usuariocalificacion);
 BA.debugLineNum = 1042;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eva";
Debug.ShouldStop(131072);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("EvaluacionProveedoresActualizarCalificacionProveedor")),(Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(_provsel),(_datetimeactualizacion),(_nuevacalificacion),(_usuariocalificacion),(_datetimeactualizacion),(_nuevacalificacion),(_usuariocalificacion)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1044;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "calificarproveedor"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 22;
return;
case 22:
//C
this.state = 15;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 1045;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(1048576);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1046;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1047;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido p";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar la calificación del proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable(".")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1048;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "calificarproveedor"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 18;
;
 BA.debugLineNum = 1049;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 1052;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetimeactualizacion),(_nuevacalificacion),(_usuariocalificacion),(_provsel)})))));
 BA.debugLineNum = 1053;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetimeactualizacion),(_nuevacalificacion),(_usuariocalificacion),(_provsel)})))));
 BA.debugLineNum = 1055;BA.debugLine="jamTableViewEvaluacionProveedores.RefrescarFilaTV";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescarfilatvmetodosql" /*RemoteObject*/ ,(Object)(_filasel));
 BA.debugLineNum = 1057;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1058;BA.debugLine="End Sub";
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
public static RemoteObject  _cargalistaproveedoresfijosevaluacion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaListaProveedoresFijosEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,511);
if (RapidSub.canDelegate("cargalistaproveedoresfijosevaluacion")) { return __ref.runUserSub(false, "cevaluacionproveedores","cargalistaproveedoresfijosevaluacion", __ref);}
ResumableSub_CargaListaProveedoresFijosEvaluacion rsub = new ResumableSub_CargaListaProveedoresFijosEvaluacion(null,__ref);
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
public static class ResumableSub_CargaListaProveedoresFijosEvaluacion extends BA.ResumableSub {
public ResumableSub_CargaListaProveedoresFijosEvaluacion(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaListaProveedoresFijosEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,511);
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
 BA.debugLineNum = 513;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblEvaluacionProve";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblEvaluacionProveedoresListaProveedoresFijos")));
 BA.debugLineNum = 515;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 516;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 517;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 518;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresLista";
Debug.ShouldStop(32);
_comando = BA.ObjectToString("EvaluacionProveedoresListaProveedoresFijos");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 519;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(64);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 521;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "cargalistaproveedoresfijosevaluacion"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 523;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 524;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 525;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 526;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "cargalistaproveedoresfijosevaluacion"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 527;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16384);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 528;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(32768);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 531;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 535;BA.debugLine="Accion=\"SinProveedoresFijos\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("SinProveedoresFijos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 536;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 538;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(33554432);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 542;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 543;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 545;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(1);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblEvaluacionProveedoresListaProveedoresFijos")),(Object)(_lstreg));
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
 BA.debugLineNum = 548;BA.debugLine="Return mRes";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 549;BA.debugLine="End Sub";
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
public static RemoteObject  _carganumeroincidenciasproveedorperiodo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaNumeroIncidenciasProveedorPeriodo (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,901);
if (RapidSub.canDelegate("carganumeroincidenciasproveedorperiodo")) { return __ref.runUserSub(false, "cevaluacionproveedores","carganumeroincidenciasproveedorperiodo", __ref);}
ResumableSub_CargaNumeroIncidenciasProveedorPeriodo rsub = new ResumableSub_CargaNumeroIncidenciasProveedorPeriodo(null,__ref);
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
public static class ResumableSub_CargaNumeroIncidenciasProveedorPeriodo extends BA.ResumableSub {
public ResumableSub_CargaNumeroIncidenciasProveedorPeriodo(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _prd = RemoteObject.declareNull("b4j.example.dateutils._period");
RemoteObject _fechaactualmenos12meses = RemoteObject.createImmutable(0L);
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaNumeroIncidenciasProveedorPeriodo (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,901);
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
 BA.debugLineNum = 903;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblEvaluacionProve";
Debug.ShouldStop(64);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblEvaluacionProveedoresNumeroIncidenciasPeriodo")));
 BA.debugLineNum = 905;BA.debugLine="Dim prd As Period";
Debug.ShouldStop(256);
_prd = RemoteObject.createNew ("b4j.example.dateutils._period");Debug.locals.put("prd", _prd);
 BA.debugLineNum = 906;BA.debugLine="prd.Months=-12";
Debug.ShouldStop(512);
_prd.setField ("Months",BA.numberCast(int.class, -(double) (0 + 12)));
 BA.debugLineNum = 907;BA.debugLine="Dim FechaActualMenos12Meses As Long=DateUtils.Add";
Debug.ShouldStop(1024);
_fechaactualmenos12meses = parent._dateutils.runMethod(true,"_addperiod",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(_prd));Debug.locals.put("FechaActualMenos12Meses", _fechaactualmenos12meses);Debug.locals.put("FechaActualMenos12Meses", _fechaactualmenos12meses);
 BA.debugLineNum = 909;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4096);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 910;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8192);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 911;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 912;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresNumer";
Debug.ShouldStop(32768);
_comando = BA.ObjectToString("EvaluacionProveedoresNumeroIncidenciasProveedorPeriodo");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 913;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(65536);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_fechaactualmenos12meses)})),(Object)(__ref));
 BA.debugLineNum = 915;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "carganumeroincidenciasproveedorperiodo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 917;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 918;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 919;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 920;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "carganumeroincidenciasproveedorperiodo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 921;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 922;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 925;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 926;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 927;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se han re";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se han registrado incidencias de proveedor en el periodo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 928;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "carganumeroincidenciasproveedorperiodo"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 929;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 930;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 932;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 936;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 937;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 939;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(1024);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblEvaluacionProveedoresNumeroIncidenciasPeriodo")),(Object)(_lstreg));
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
 BA.debugLineNum = 942;BA.debugLine="Return mRes";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 943;BA.debugLine="End Sub";
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
public static RemoteObject  _cargatreeviewdrawer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaTreeViewDrawer (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("cargatreeviewdrawer")) { return __ref.runUserSub(false, "cevaluacionproveedores","cargatreeviewdrawer", __ref);}
RemoteObject _imgtreeitemgo = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _tisalir = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _texpandirtodomenu = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tcontraertodomenu = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tactualizardatos = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
RemoteObject _tlistaproveedoresfijosevaluacion = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
 BA.debugLineNum = 230;BA.debugLine="Sub CargaTreeViewDrawer";
Debug.ShouldStop(32);
 BA.debugLineNum = 232;BA.debugLine="TreeViewDrawer.Root.Children.Clear";
Debug.ShouldStop(128);
__ref.getField(false,"_treeviewdrawer" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Clear");
 BA.debugLineNum = 234;BA.debugLine="Dim imgTreeItemGo As Image=Main.fx.LoadImageSampl";
Debug.ShouldStop(512);
_imgtreeitemgo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_imgtreeitemgo = cevaluacionproveedores._main._fx /*RemoteObject*/ .runMethod(false,"LoadImageSample",(Object)(cevaluacionproveedores.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("arrow-right16.png")),(Object)(BA.numberCast(double.class, 16)),(Object)(BA.numberCast(double.class, 16)));Debug.locals.put("imgTreeItemGo", _imgtreeitemgo);Debug.locals.put("imgTreeItemGo", _imgtreeitemgo);
 BA.debugLineNum = 236;BA.debugLine="Dim img As Image=Utilidades.SetFontToBitmap(Chr(0";
Debug.ShouldStop(2048);
_img = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_img = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), cevaluacionproveedores._utilidades.runMethod(false,"_setfonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(cevaluacionproveedores.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf6cf)))))),(Object)(cevaluacionproveedores._utilidades.runMethod(false,"_createb4xfont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("materialdesignicons-webfont.ttf")),(Object)(BA.numberCast(float.class, 24)),(Object)(BA.numberCast(float.class, 24)))),(Object)(BA.numberCast(float.class, 24)),(Object)(BA.numberCast(int.class, ((int)0xff00bfff)))).getObject());Debug.locals.put("img", _img);Debug.locals.put("img", _img);
 BA.debugLineNum = 238;BA.debugLine="Dim tiSalir As TreeItem";
Debug.ShouldStop(8192);
_tisalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tiSalir", _tisalir);
 BA.debugLineNum = 239;BA.debugLine="tiSalir.Initialize(\"tItem\",\"Salir\")";
Debug.ShouldStop(16384);
_tisalir.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Salir")));
 BA.debugLineNum = 240;BA.debugLine="tiSalir.Image=Utilidades.MaterialIconsToBitmap(Ch";
Debug.ShouldStop(32768);
_tisalir.runMethod(false,"setImage",(cevaluacionproveedores._utilidades.runMethod(false,"_materialiconstobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(cevaluacionproveedores.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe879)))))),(Object)(BA.numberCast(float.class, 24)),(Object)(BA.numberCast(int.class, ((int)0xffb22222)))).getObject()));
 BA.debugLineNum = 241;BA.debugLine="TreeViewDrawer.Root.Children.Add(tiSalir)";
Debug.ShouldStop(65536);
__ref.getField(false,"_treeviewdrawer" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tisalir.getObject())));
 BA.debugLineNum = 243;BA.debugLine="Dim tExpandirTodoMenu As TreeItem";
Debug.ShouldStop(262144);
_texpandirtodomenu = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tExpandirTodoMenu", _texpandirtodomenu);
 BA.debugLineNum = 244;BA.debugLine="tExpandirTodoMenu.Initialize(\"tItem\",\"Expandir Me";
Debug.ShouldStop(524288);
_texpandirtodomenu.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Expandir Menu")));
 BA.debugLineNum = 245;BA.debugLine="tExpandirTodoMenu.Image=Utilidades.SetFontToBitma";
Debug.ShouldStop(1048576);
_texpandirtodomenu.runMethod(false,"setImage",(cevaluacionproveedores._utilidades.runMethod(false,"_setfonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(cevaluacionproveedores.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf616)))))),(Object)(cevaluacionproveedores._utilidades.runMethod(false,"_createb4xfont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("materialdesignicons-webfont.ttf")),(Object)(BA.numberCast(float.class, 24)),(Object)(BA.numberCast(float.class, 24)))),(Object)(BA.numberCast(float.class, 24)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"))).getObject()));
 BA.debugLineNum = 246;BA.debugLine="TreeViewDrawer.Root.Children.Add(tExpandirTodoMen";
Debug.ShouldStop(2097152);
__ref.getField(false,"_treeviewdrawer" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_texpandirtodomenu.getObject())));
 BA.debugLineNum = 249;BA.debugLine="Dim tContraerTodoMenu As TreeItem";
Debug.ShouldStop(16777216);
_tcontraertodomenu = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tContraerTodoMenu", _tcontraertodomenu);
 BA.debugLineNum = 250;BA.debugLine="tContraerTodoMenu.Initialize(\"tItem\",\"Contraer Me";
Debug.ShouldStop(33554432);
_tcontraertodomenu.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Contraer Menu")));
 BA.debugLineNum = 251;BA.debugLine="tContraerTodoMenu.Image=Utilidades.SetFontToBitma";
Debug.ShouldStop(67108864);
_tcontraertodomenu.runMethod(false,"setImage",(cevaluacionproveedores._utilidades.runMethod(false,"_setfonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(cevaluacionproveedores.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf615)))))),(Object)(cevaluacionproveedores._utilidades.runMethod(false,"_createb4xfont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("materialdesignicons-webfont.ttf")),(Object)(BA.numberCast(float.class, 24)),(Object)(BA.numberCast(float.class, 24)))),(Object)(BA.numberCast(float.class, 24)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"))).getObject()));
 BA.debugLineNum = 252;BA.debugLine="TreeViewDrawer.Root.Children.Add(tContraerTodoMen";
Debug.ShouldStop(134217728);
__ref.getField(false,"_treeviewdrawer" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tcontraertodomenu.getObject())));
 BA.debugLineNum = 254;BA.debugLine="Dim tActualizarDatos As TreeItem";
Debug.ShouldStop(536870912);
_tactualizardatos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tActualizarDatos", _tactualizardatos);
 BA.debugLineNum = 255;BA.debugLine="tActualizarDatos.Initialize(\"tItem\",\"Actualizar D";
Debug.ShouldStop(1073741824);
_tactualizardatos.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Actualizar Datos")));
 BA.debugLineNum = 256;BA.debugLine="tActualizarDatos.Image=Utilidades.SetFontToBitmap";
Debug.ShouldStop(-2147483648);
_tactualizardatos.runMethod(false,"setImage",(cevaluacionproveedores._utilidades.runMethod(false,"_setfonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(cevaluacionproveedores.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf450)))))),(Object)(cevaluacionproveedores._utilidades.runMethod(false,"_createb4xfont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("materialdesignicons-webfont.ttf")),(Object)(BA.numberCast(float.class, 24)),(Object)(BA.numberCast(float.class, 24)))),(Object)(BA.numberCast(float.class, 24)),(Object)(BA.numberCast(int.class, ((int)0xff00bfff)))).getObject()));
 BA.debugLineNum = 257;BA.debugLine="TreeViewDrawer.Root.Children.Add(tActualizarDatos";
Debug.ShouldStop(1);
__ref.getField(false,"_treeviewdrawer" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tactualizardatos.getObject())));
 BA.debugLineNum = 259;BA.debugLine="Dim tListaProveedoresFijosEvaluacion As TreeItem";
Debug.ShouldStop(4);
_tlistaproveedoresfijosevaluacion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");Debug.locals.put("tListaProveedoresFijosEvaluacion", _tlistaproveedoresfijosevaluacion);
 BA.debugLineNum = 260;BA.debugLine="tListaProveedoresFijosEvaluacion.Initialize(\"tIte";
Debug.ShouldStop(8);
_tlistaproveedoresfijosevaluacion.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("tItem")),(Object)(RemoteObject.createImmutable("Lista Proveedores Fijos Evaluación")));
 BA.debugLineNum = 261;BA.debugLine="tListaProveedoresFijosEvaluacion.Image=Utilidades";
Debug.ShouldStop(16);
_tlistaproveedoresfijosevaluacion.runMethod(false,"setImage",(cevaluacionproveedores._utilidades.runMethod(false,"_setfonttobitmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString(cevaluacionproveedores.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf27b)))))),(Object)(cevaluacionproveedores._utilidades.runMethod(false,"_createb4xfont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("materialdesignicons-webfont.ttf")),(Object)(BA.numberCast(float.class, 24)),(Object)(BA.numberCast(float.class, 24)))),(Object)(BA.numberCast(float.class, 24)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"))).getObject()));
 BA.debugLineNum = 262;BA.debugLine="TreeViewDrawer.Root.Children.Add(tListaProveedore";
Debug.ShouldStop(32);
__ref.getField(false,"_treeviewdrawer" /*RemoteObject*/ ).runMethod(false,"getRoot").runMethod(false,"getChildren").runVoidMethod ("Add",(Object)((_tlistaproveedoresfijosevaluacion.getObject())));
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
cevaluacionproveedores._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cevaluacionproveedores._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
cevaluacionproveedores._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cevaluacionproveedores._frm);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
cevaluacionproveedores._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cevaluacionproveedores._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private Dialog As B4XDialog";
cevaluacionproveedores._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cevaluacionproveedores._dialog);
 //BA.debugLineNum = 7;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
cevaluacionproveedores._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cevaluacionproveedores._jamloadingindicator1);
 //BA.debugLineNum = 9;BA.debugLine="Dim mSQL As SQL";
cevaluacionproveedores._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cevaluacionproveedores._msql);
 //BA.debugLineNum = 11;BA.debugLine="Private Drawer As B4XDrawer";
cevaluacionproveedores._drawer = RemoteObject.createNew ("b4j.docU.b4xdrawer");__ref.setField("_drawer",cevaluacionproveedores._drawer);
 //BA.debugLineNum = 12;BA.debugLine="Private jamTableViewEvaluacionProveedores As jamT";
cevaluacionproveedores._jamtableviewevaluacionproveedores = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewevaluacionproveedores",cevaluacionproveedores._jamtableviewevaluacionproveedores);
 //BA.debugLineNum = 13;BA.debugLine="Private pnlFondoEvaluacionProveedores As B4XView";
cevaluacionproveedores._pnlfondoevaluacionproveedores = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlfondoevaluacionproveedores",cevaluacionproveedores._pnlfondoevaluacionproveedores);
 //BA.debugLineNum = 14;BA.debugLine="Private lblIconCerrarDrawer As B4XView";
cevaluacionproveedores._lbliconcerrardrawer = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbliconcerrardrawer",cevaluacionproveedores._lbliconcerrardrawer);
 //BA.debugLineNum = 15;BA.debugLine="Private lblTextoCerrarDrawer As B4XView";
cevaluacionproveedores._lbltextocerrardrawer = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltextocerrardrawer",cevaluacionproveedores._lbltextocerrardrawer);
 //BA.debugLineNum = 16;BA.debugLine="Private pnlTopDrawerLeft As B4XView";
cevaluacionproveedores._pnltopdrawerleft = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnltopdrawerleft",cevaluacionproveedores._pnltopdrawerleft);
 //BA.debugLineNum = 17;BA.debugLine="Private TreeViewDrawer As TreeView";
cevaluacionproveedores._treeviewdrawer = RemoteObject.createNew ("anywheresoftware.b4j.objects.TreeViewWrapper");__ref.setField("_treeviewdrawer",cevaluacionproveedores._treeviewdrawer);
 //BA.debugLineNum = 19;BA.debugLine="Private BackgroundProveedoresFijosEvaluacion As B";
cevaluacionproveedores._backgroundproveedoresfijosevaluacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_backgroundproveedoresfijosevaluacion",cevaluacionproveedores._backgroundproveedoresfijosevaluacion);
 //BA.debugLineNum = 20;BA.debugLine="Private BaseProveedoresFijosEvaluacion As B4XView";
cevaluacionproveedores._baseproveedoresfijosevaluacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_baseproveedoresfijosevaluacion",cevaluacionproveedores._baseproveedoresfijosevaluacion);
 //BA.debugLineNum = 21;BA.debugLine="Private jamTableViewProveedoresFijosEvaluacionPro";
cevaluacionproveedores._jamtableviewproveedoresfijosevaluacionproveedores = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewproveedoresfijosevaluacionproveedores",cevaluacionproveedores._jamtableviewproveedoresfijosevaluacionproveedores);
 //BA.debugLineNum = 22;BA.debugLine="Private btnAddMotivoFijarEvaluacionProveedor As B";
cevaluacionproveedores._btnaddmotivofijarevaluacionproveedor = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnaddmotivofijarevaluacionproveedor",cevaluacionproveedores._btnaddmotivofijarevaluacionproveedor);
 //BA.debugLineNum = 26;BA.debugLine="Private lblTitleMotivosFijarEvaluacionProveedor A";
cevaluacionproveedores._lbltitlemotivosfijarevaluacionproveedor = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlemotivosfijarevaluacionproveedor",cevaluacionproveedores._lbltitlemotivosfijarevaluacionproveedor);
 //BA.debugLineNum = 27;BA.debugLine="Private lblTitleProveedorFijoEvaluacion As B4XVie";
cevaluacionproveedores._lbltitleproveedorfijoevaluacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitleproveedorfijoevaluacion",cevaluacionproveedores._lbltitleproveedorfijoevaluacion);
 //BA.debugLineNum = 28;BA.debugLine="Private pnlFondoProveedorFijoEvaluacion As B4XVie";
cevaluacionproveedores._pnlfondoproveedorfijoevaluacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlfondoproveedorfijoevaluacion",cevaluacionproveedores._pnlfondoproveedorfijoevaluacion);
 //BA.debugLineNum = 29;BA.debugLine="Private txtNombreProveedorFijoEvaluacion As B4XVi";
cevaluacionproveedores._txtnombreproveedorfijoevaluacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnombreproveedorfijoevaluacion",cevaluacionproveedores._txtnombreproveedorfijoevaluacion);
 //BA.debugLineNum = 30;BA.debugLine="Private txtProveedorFijoEvaluacion As B4XView";
cevaluacionproveedores._txtproveedorfijoevaluacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtproveedorfijoevaluacion",cevaluacionproveedores._txtproveedorfijoevaluacion);
 //BA.debugLineNum = 31;BA.debugLine="Private jamTableViewMotivosFijarEvaluacionProveed";
cevaluacionproveedores._jamtableviewmotivosfijarevaluacionproveedor = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewmotivosfijarevaluacionproveedor",cevaluacionproveedores._jamtableviewmotivosfijarevaluacionproveedor);
 //BA.debugLineNum = 32;BA.debugLine="Private lblSalirEvaluacionProveedoresConfigurarPr";
cevaluacionproveedores._lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion",cevaluacionproveedores._lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion);
 //BA.debugLineNum = 34;BA.debugLine="Private ProveedorEdicion As String";
cevaluacionproveedores._proveedoredicion = RemoteObject.createImmutable("");__ref.setField("_proveedoredicion",cevaluacionproveedores._proveedoredicion);
 //BA.debugLineNum = 35;BA.debugLine="Private FilaJamTVEvalProveedorEdicion As Int";
cevaluacionproveedores._filajamtvevalproveedoredicion = RemoteObject.createImmutable(0);__ref.setField("_filajamtvevalproveedoredicion",cevaluacionproveedores._filajamtvevalproveedoredicion);
 //BA.debugLineNum = 37;BA.debugLine="Private PermisoCalificarProveedores As Boolean";
cevaluacionproveedores._permisocalificarproveedores = RemoteObject.createImmutable(false);__ref.setField("_permisocalificarproveedores",cevaluacionproveedores._permisocalificarproveedores);
 //BA.debugLineNum = 38;BA.debugLine="Private PermisoValidarCalificacionProveedores As";
cevaluacionproveedores._permisovalidarcalificacionproveedores = RemoteObject.createImmutable(false);__ref.setField("_permisovalidarcalificacionproveedores",cevaluacionproveedores._permisovalidarcalificacionproveedores);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _configurarproveedorfijoevaluacion(RemoteObject __ref,RemoteObject _provsel,RemoteObject _filatvprovsel) throws Exception{
try {
		Debug.PushSubsStack("ConfigurarProveedorFijoEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1144);
if (RapidSub.canDelegate("configurarproveedorfijoevaluacion")) { __ref.runUserSub(false, "cevaluacionproveedores","configurarproveedorfijoevaluacion", __ref, _provsel, _filatvprovsel); return;}
ResumableSub_ConfigurarProveedorFijoEvaluacion rsub = new ResumableSub_ConfigurarProveedorFijoEvaluacion(null,__ref,_provsel,_filatvprovsel);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ConfigurarProveedorFijoEvaluacion extends BA.ResumableSub {
public ResumableSub_ConfigurarProveedorFijoEvaluacion(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel,RemoteObject _filatvprovsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._filatvprovsel = _filatvprovsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _filatvprovsel;
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ConfigurarProveedorFijoEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1144);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("ProvSel", _provsel);
Debug.locals.put("FilaTVProvSel", _filatvprovsel);
 BA.debugLineNum = 1145;BA.debugLine="For Each xNode As B4XView In frm.RootPane";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//for
this.state = 12;
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
group1 = __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane");
index1 = 0;
groupLen1 = group1.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("xNode", _xnode);
this.state = 21;
if (true) break;

case 21:
//C
this.state = 12;
if (index1 < groupLen1) {
this.state = 3;
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group1.runMethod(false,"Get",index1));Debug.locals.put("xNode", _xnode);}
if (true) break;

case 22:
//C
this.state = 21;
index1++;
Debug.locals.put("xNode", _xnode);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1146;BA.debugLine="If xNode Is Pane Then";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("i",_xnode.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.layout.Pane"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1147;BA.debugLine="If xNode.Tag=\"BackgroundDatosNuevoComponente\" T";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_xnode.runMethod(false,"getTag"),RemoteObject.createImmutable(("BackgroundDatosNuevoComponente")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1148;BA.debugLine="xNode.RemoveViewFromParent";
Debug.ShouldStop(134217728);
_xnode.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 1149;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
this.state = 12;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 22;
;
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
Debug.locals.put("xNode", _xnode);
;
 BA.debugLineNum = 1154;BA.debugLine="BackgroundProveedoresFijosEvaluacion= xui.CreateP";
Debug.ShouldStop(2);
__ref.setField ("_backgroundproveedoresfijosevaluacion" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("BackgroundProveedoresFijosEvaluacion"))));
 BA.debugLineNum = 1155;BA.debugLine="BackgroundProveedoresFijosEvaluacion.Tag = \"Backg";
Debug.ShouldStop(4);
__ref.getField(false,"_backgroundproveedoresfijosevaluacion" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("BackgroundProveedoresFijosEvaluacion")));
 BA.debugLineNum = 1156;BA.debugLine="BackgroundProveedoresFijosEvaluacion.Color=0xaa00";
Debug.ShouldStop(8);
__ref.getField(false,"_backgroundproveedoresfijosevaluacion" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 1157;BA.debugLine="frm.RootPane.AddNode(BackgroundProveedoresFijosEv";
Debug.ShouldStop(16);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runVoidMethod ("AddNode",(Object)((__ref.getField(false,"_backgroundproveedoresfijosevaluacion" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"getHeight")));
 BA.debugLineNum = 1159;BA.debugLine="BaseProveedoresFijosEvaluacion=xui.CreatePanel(\"p";
Debug.ShouldStop(64);
__ref.setField ("_baseproveedoresfijosevaluacion" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlBase"))));
 BA.debugLineNum = 1160;BA.debugLine="BaseProveedoresFijosEvaluacion.SetLayoutAnimated(";
Debug.ShouldStop(128);
__ref.getField(false,"_baseproveedoresfijosevaluacion" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 700))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 450))))));
 BA.debugLineNum = 1161;BA.debugLine="BaseProveedoresFijosEvaluacion.LoadLayout(\"scrEva";
Debug.ShouldStop(256);
__ref.getField(false,"_baseproveedoresfijosevaluacion" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrEvaluacionProveedoresConfigurarProveedorFijoEvaluacion")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1163;BA.debugLine="Sleep(0)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "configurarproveedorfijoevaluacion"),BA.numberCast(int.class, 0));
this.state = 23;
return;
case 23:
//C
this.state = 13;
;
 BA.debugLineNum = 1165;BA.debugLine="BackgroundProveedoresFijosEvaluacion.AddView(Base";
Debug.ShouldStop(4096);
__ref.getField(false,"_backgroundproveedoresfijosevaluacion" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_baseproveedoresfijosevaluacion" /*RemoteObject*/ ).getObject())),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_backgroundproveedoresfijosevaluacion" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(false,"_baseproveedoresfijosevaluacion" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_backgroundproveedoresfijosevaluacion" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_baseproveedoresfijosevaluacion" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(__ref.getField(false,"_baseproveedoresfijosevaluacion" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_baseproveedoresfijosevaluacion" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 1168;BA.debugLine="Utilidades.AddImageToLabel(lblSalirEvaluacionProv";
Debug.ShouldStop(32768);
parent._utilidades.runVoidMethod ("_addimagetolabel" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), __ref.getField(false,"_lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion" /*RemoteObject*/ ).getObject()),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("twotone_exit_black_24dp.png")));
 BA.debugLineNum = 1170;BA.debugLine="txtProveedorFijoEvaluacion.Text=ProvSel";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtproveedorfijoevaluacion" /*RemoteObject*/ ).runMethod(true,"setText",_provsel);
 BA.debugLineNum = 1171;BA.debugLine="txtNombreProveedorFijoEvaluacion.Text=mSQL.ExecQu";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtnombreproveedorfijoevaluacion" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NombreProveedor from tblEvaluacionProveedoresDatosEvaluacionActual where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_provsel}))))));
 BA.debugLineNum = 1173;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.Estad";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).getField(true,"_menubartabla" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 1175;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.AddMe";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Añadir motivo proveedor fijo evaluación")),(Object)(BA.ObjectToString("AddMotivoProveedorFijoEvaluacion")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf196)))))),(Object)(__ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 1176;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.AddMe";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Eliminar motivo proveedor fijo evaluación")),(Object)(BA.ObjectToString("EliminarMotivoProveedorFijoEvaluacion")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf014)))))),(Object)(__ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 1177;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.AddCo";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 1178;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.AddCo";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Eliminar motivo proveedor fijo evaluación")),(Object)(BA.ObjectToString("EliminarMotivoProveedorFijoEvaluacion")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf014)))))));
 BA.debugLineNum = 1180;BA.debugLine="Dim rSub As ResumableSub=jamTableViewMotivosFijar";
Debug.ShouldStop(134217728);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaEvaluacionProveedoresMotivosProveedorFijo.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1181;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "configurarproveedorfijoevaluacion"), _rsub);
this.state = 24;
return;
case 24:
//C
this.state = 13;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1182;BA.debugLine="Log(mRes)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","811534374",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 1183;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 13:
//if
this.state = 16;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1184;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1185;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "configurarproveedorfijoevaluacion"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 16;
;
 BA.debugLineNum = 1186;BA.debugLine="frm.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 1187;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1190;BA.debugLine="Wait For(ActualizarDatosProveedorFijoProveedor(Pr";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "configurarproveedorfijoevaluacion"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_actualizardatosproveedorfijoproveedor" /*RemoteObject*/ ,(Object)(_provsel)));
this.state = 26;
return;
case 26:
//C
this.state = 17;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1191;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(64);
if (true) break;

case 17:
//if
this.state = 20;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1192;BA.debugLine="SalirProveedorFijoEvaluacion";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_salirproveedorfijoevaluacion" /*void*/ );
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 1194;BA.debugLine="FilaJamTVEvalProveedorEdicion=FilaTVProvSel";
Debug.ShouldStop(512);
__ref.setField ("_filajamtvevalproveedoredicion" /*RemoteObject*/ ,_filatvprovsel);
 BA.debugLineNum = 1195;BA.debugLine="ProveedorEdicion=ProvSel";
Debug.ShouldStop(1024);
__ref.setField ("_proveedoredicion" /*RemoteObject*/ ,_provsel);
 BA.debugLineNum = 1196;BA.debugLine="End Sub";
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
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,296);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cevaluacionproveedores","creaciontablassqlite", __ref);}
RemoteObject _screartabla = RemoteObject.createImmutable("");
 BA.debugLineNum = 296;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(128);
 BA.debugLineNum = 298;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblEvalua";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblEvaluacionProveedoresDatosEvaluacionActual")));
 BA.debugLineNum = 299;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
Debug.ShouldStop(1024);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS [tblEvaluacionProveedoresDatosEvaluacionActual] ([Proveedor] TEXT, [NombreProveedor] TEXT, [Bloqueado] INTEGER\n"),RemoteObject.createImmutable("	, [GrupoContableProveedor] TEXT, [ImporteNetoFacturacion12Meses] INTEGER, [NumeroIncidencias12Meses] INTEGER, [ProveedorFijoEvaluacion] INTEGER, [CalificacionProvisional] TEXT, [FechaActualizacionDatosLong] INTEGER\n"),RemoteObject.createImmutable("	, [FechaCalificacion] INTEGER, [Calificacion] TEXT, [UsuarioCalificacion] TEXT,[FechaValidacionCalificacion] INTEGER, [ValidacionCalificacion] TEXT, [UsuarioValidacionCalificacion] TEXT)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 302;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 304;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblEvalua";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblEvaluacionProveedoresDatosNAVPeriodo")));
 BA.debugLineNum = 305;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(65536);
_screartabla = (RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblEvaluacionProveedoresDatosNAVPeriodo] ([Proveedor] TEXT, [NombreProveedor] TEXT, [Bloqueado] INTEGER, [GrupoContableProveedor] TEXT, [TotalImporteNetoFacturacion] REAL)"));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 306;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 308;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblEvalua";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblEvaluacionProveedoresListaProveedoresFijos")));
 BA.debugLineNum = 309;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
Debug.ShouldStop(1048576);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS [tblEvaluacionProveedoresListaProveedoresFijos] ([IDLinea] INTEGER\n"),RemoteObject.createImmutable("	, [ProveedorFijoEvaluacionProveedores] TEXT, [NombreProveedorFijoEvaluacionProveedoresaluacionProveedores] TEXT)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 311;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 313;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblEvalua";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblEvaluacionProveedoresNumeroIncidenciasPeriodo")));
 BA.debugLineNum = 314;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
Debug.ShouldStop(33554432);
_screartabla = (RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS [tblEvaluacionProveedoresNumeroIncidenciasPeriodo] ([Proveedor] TEXT, [NumeroIncidenciasPeriodo] INTEGER)"));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 315;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 317;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblEvalua";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblEvaluacionProveedoresSeleccionProveedoresFijos")));
 BA.debugLineNum = 318;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(536870912);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblEvaluacionProveedoresSeleccionProveedoresFijos] ([Proveedor] TEXT, [NombreProveedor] TEXT\n"),RemoteObject.createImmutable("	, [Bloqueado] INTEGER, [GrupoContableProveedor] TEXT, [TotalImporteNetoFacturacion] REAL, [ProveedorFijo] INTEGER)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 320;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _eliminarmotivoproveedorfijoevaluacion(RemoteObject __ref,RemoteObject _provsel,RemoteObject _idmotprovfijosel) throws Exception{
try {
		Debug.PushSubsStack("EliminarMotivoProveedorFijoEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,793);
if (RapidSub.canDelegate("eliminarmotivoproveedorfijoevaluacion")) { __ref.runUserSub(false, "cevaluacionproveedores","eliminarmotivoproveedorfijoevaluacion", __ref, _provsel, _idmotprovfijosel); return;}
ResumableSub_EliminarMotivoProveedorFijoEvaluacion rsub = new ResumableSub_EliminarMotivoProveedorFijoEvaluacion(null,__ref,_provsel,_idmotprovfijosel);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EliminarMotivoProveedorFijoEvaluacion extends BA.ResumableSub {
public ResumableSub_EliminarMotivoProveedorFijoEvaluacion(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel,RemoteObject _idmotprovfijosel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._idmotprovfijosel = _idmotprovfijosel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _idmotprovfijosel;
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EliminarMotivoProveedorFijoEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,793);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("ProvSel", _provsel);
Debug.locals.put("IDMotProvFijoSel", _idmotprovfijosel);
 BA.debugLineNum = 794;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"¿Elim";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "eliminarmotivoproveedorfijoevaluacion"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.createImmutable("¿Eliminar el motivo de proveedor fijo seleccionado?"))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 795;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 811;BA.debugLine="Wait For(GrabarEliminarMotivoProveedorFijo(ProvSe";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "eliminarmotivoproveedorfijoevaluacion"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_grabareliminarmotivoproveedorfijo" /*RemoteObject*/ ,(Object)(_provsel),(Object)(_idmotprovfijosel)));
this.state = 18;
return;
case 18:
//C
this.state = 7;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 812;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 813;BA.debugLine="If Accion=\"NOK\" Then Return";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 815;BA.debugLine="Wait For(ActualizarDatosProveedorFijoProveedor(Pr";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "eliminarmotivoproveedorfijoevaluacion"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_actualizardatosproveedorfijoproveedor" /*RemoteObject*/ ,(Object)(_provsel)));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 816;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(32768);
if (true) break;

case 13:
//if
this.state = 16;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 818;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 821;BA.debugLine="End Sub";
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
public static RemoteObject  _evaluacionproveedoresactualizarvariables(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EvaluacionProveedoresActualizarVariables (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,462);
if (RapidSub.canDelegate("evaluacionproveedoresactualizarvariables")) { return __ref.runUserSub(false, "cevaluacionproveedores","evaluacionproveedoresactualizarvariables", __ref);}
ResumableSub_EvaluacionProveedoresActualizarVariables rsub = new ResumableSub_EvaluacionProveedoresActualizarVariables(null,__ref);
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
public static class ResumableSub_EvaluacionProveedoresActualizarVariables extends BA.ResumableSub {
public ResumableSub_EvaluacionProveedoresActualizarVariables(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _prd = RemoteObject.declareNull("b4j.example.dateutils._period");
RemoteObject _fechaactualmenos12meses = RemoteObject.createImmutable(0L);
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mrespuesta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EvaluacionProveedoresActualizarVariables (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,462);
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
 BA.debugLineNum = 463;BA.debugLine="Dim prd As Period";
Debug.ShouldStop(16384);
_prd = RemoteObject.createNew ("b4j.example.dateutils._period");Debug.locals.put("prd", _prd);
 BA.debugLineNum = 464;BA.debugLine="prd.Months=-12";
Debug.ShouldStop(32768);
_prd.setField ("Months",BA.numberCast(int.class, -(double) (0 + 12)));
 BA.debugLineNum = 465;BA.debugLine="Dim FechaActualMenos12Meses As Long=DateUtils.Add";
Debug.ShouldStop(65536);
_fechaactualmenos12meses = parent._dateutils.runMethod(true,"_addperiod",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(_prd));Debug.locals.put("FechaActualMenos12Meses", _fechaactualmenos12meses);Debug.locals.put("FechaActualMenos12Meses", _fechaactualmenos12meses);
 BA.debugLineNum = 467;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(262144);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 468;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(524288);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 469;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 470;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(2097152);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 471;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresActua";
Debug.ShouldStop(4194304);
_comando = BA.ObjectToString("EvaluacionProveedoresActualizarVariables");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 473;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DateT";
Debug.ShouldStop(16777216);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(_fechaactualmenos12meses)})),(Object)(__ref));
 BA.debugLineNum = 475;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresactualizarvariables"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 476;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 477;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 478;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresactualizarvariables"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 479;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 480;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 483;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then  ' este caso";
Debug.ShouldStop(4);
if (true) break;

case 6:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 484;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 490;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(512);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 491;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
Debug.ShouldStop(1024);
_mrespuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mrespuesta = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mRespuesta", _mrespuesta);Debug.locals.put("mRespuesta", _mrespuesta);
 BA.debugLineNum = 492;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
Debug.ShouldStop(2048);
_sresp = BA.ObjectToString(_mrespuesta.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 493;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(4096);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 494;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error recup";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error recuperando datos del SP "),_comando,RemoteObject.createImmutable("."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 495;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresactualizarvariables"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 496;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 497;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 499;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 500;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 505;BA.debugLine="Return mRes";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
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
public static RemoteObject  _evaluacionproveedoresdatosevaluacionactual(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EvaluacionProveedoresDatosEvaluacionActual (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,948);
if (RapidSub.canDelegate("evaluacionproveedoresdatosevaluacionactual")) { return __ref.runUserSub(false, "cevaluacionproveedores","evaluacionproveedoresdatosevaluacionactual", __ref);}
ResumableSub_EvaluacionProveedoresDatosEvaluacionActual rsub = new ResumableSub_EvaluacionProveedoresDatosEvaluacionActual(null,__ref);
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
public static class ResumableSub_EvaluacionProveedoresDatosEvaluacionActual extends BA.ResumableSub {
public ResumableSub_EvaluacionProveedoresDatosEvaluacionActual(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EvaluacionProveedoresDatosEvaluacionActual (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,948);
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
 BA.debugLineNum = 949;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Actualizando datos evaluacion proveedores...")));
 BA.debugLineNum = 950;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 951;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblEvaluacionProve";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblEvaluacionProveedoresDatosEvaluacionActual")));
 BA.debugLineNum = 954;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(33554432);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 955;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(67108864);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 956;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 957;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresDatos";
Debug.ShouldStop(268435456);
_comando = BA.ObjectToString("EvaluacionProveedoresDatosEvaluacionActual");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 958;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(536870912);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 960;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactual"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 962;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 963;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(4);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 964;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 965;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactual"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 966;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(32);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 967;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 970;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 971;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 972;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos registrados de evaluación de proveedores.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 973;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactual"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 974;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 975;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 977;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(65536);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 981;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 982;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2097152);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 984;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(8388608);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblEvaluacionProveedoresDatosEvaluacionActual")),(Object)(_lstreg));
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
 BA.debugLineNum = 987;BA.debugLine="Return mRes";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 988;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _evaluacionproveedoresdatosevaluacionactualproveedor(RemoteObject __ref,RemoteObject _provsel) throws Exception{
try {
		Debug.PushSubsStack("EvaluacionProveedoresDatosEvaluacionActualProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1440);
if (RapidSub.canDelegate("evaluacionproveedoresdatosevaluacionactualproveedor")) { return __ref.runUserSub(false, "cevaluacionproveedores","evaluacionproveedoresdatosevaluacionactualproveedor", __ref, _provsel);}
ResumableSub_EvaluacionProveedoresDatosEvaluacionActualProveedor rsub = new ResumableSub_EvaluacionProveedoresDatosEvaluacionActualProveedor(null,__ref,_provsel);
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
public static class ResumableSub_EvaluacionProveedoresDatosEvaluacionActualProveedor extends BA.ResumableSub {
public ResumableSub_EvaluacionProveedoresDatosEvaluacionActualProveedor(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EvaluacionProveedoresDatosEvaluacionActualProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1440);
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
Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 1441;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando da";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",((RemoteObject.concat(RemoteObject.createImmutable("Cargando datos proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable("...")))));
 BA.debugLineNum = 1442;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1446;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(32);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1447;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(64);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1448;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(128);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 1449;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(256);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1450;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1451;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1452;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 1453;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresDatos";
Debug.ShouldStop(4096);
_comando = BA.ObjectToString("EvaluacionProveedoresDatosEvaluacionActualProveedor");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1454;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(8192);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_provsel)})),(Object)(__ref));
 BA.debugLineNum = 1456;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactualproveedor"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1458;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 1459;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1460;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1461;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactualproveedor"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1462;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1463;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1466;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 1467;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1468;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El proveedo";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El proveedor seleccionado ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable(") no tiene datos asignados.")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1469;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactualproveedor"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 1470;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1471;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1473;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1);
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1474;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1475;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1476;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
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
 BA.debugLineNum = 1480;BA.debugLine="Return mRes";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1481;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static RemoteObject  _evaluacionproveedoresdatosproveedorfijo(RemoteObject __ref,RemoteObject _provsel) throws Exception{
try {
		Debug.PushSubsStack("EvaluacionProveedoresDatosProveedorFijo (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1235);
if (RapidSub.canDelegate("evaluacionproveedoresdatosproveedorfijo")) { return __ref.runUserSub(false, "cevaluacionproveedores","evaluacionproveedoresdatosproveedorfijo", __ref, _provsel);}
ResumableSub_EvaluacionProveedoresDatosProveedorFijo rsub = new ResumableSub_EvaluacionProveedoresDatosProveedorFijo(null,__ref,_provsel);
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
public static class ResumableSub_EvaluacionProveedoresDatosProveedorFijo extends BA.ResumableSub {
public ResumableSub_EvaluacionProveedoresDatosProveedorFijo(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EvaluacionProveedoresDatosProveedorFijo (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1235);
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
Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 1236;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Actualizando datos proveedor fijo...")));
 BA.debugLineNum = 1237;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1241;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16777216);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1242;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(33554432);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1243;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(67108864);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 1244;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(134217728);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1245;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1246;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1247;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 1248;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresDetal";
Debug.ShouldStop(-2147483648);
_comando = BA.ObjectToString("EvaluacionProveedoresDetalleProveedorFijo");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1249;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(1);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_provsel)})),(Object)(__ref));
 BA.debugLineNum = 1251;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosproveedorfijo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1253;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 1254;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1255;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1256;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosproveedorfijo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1257;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(256);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1258;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1261;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 1262;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1263;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No hay datos registrados de proveedor fijo para el proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable(".")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1264;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosproveedorfijo"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 1265;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1266;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1268;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
Debug.ShouldStop(524288);
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1269;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1270;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2097152);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1271;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
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
 BA.debugLineNum = 1275;BA.debugLine="Return mRes";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1276;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor(RemoteObject __ref,RemoteObject _provsel) throws Exception{
try {
		Debug.PushSubsStack("EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1278);
if (RapidSub.canDelegate("evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor")) { return __ref.runUserSub(false, "cevaluacionproveedores","evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor", __ref, _provsel);}
ResumableSub_EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor rsub = new ResumableSub_EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor(null,__ref,_provsel);
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
public static class ResumableSub_EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor extends BA.ResumableSub {
public ResumableSub_EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1278);
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
Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 1279;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando ti";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",((RemoteObject.concat(RemoteObject.createImmutable("Cargando tipos motivo proveedor fijo no asignados al proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable("...")))));
 BA.debugLineNum = 1280;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1284;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(8);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1285;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(16);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1286;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(32);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 1287;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(64);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1288;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1289;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1290;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 1291;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresLista";
Debug.ShouldStop(1024);
_comando = BA.ObjectToString("EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1292;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(2048);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_provsel)})),(Object)(__ref));
 BA.debugLineNum = 1294;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1296;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 1297;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1298;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1299;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1300;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1301;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1304;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 1305;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1306;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El proveedo";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El proveedor seleccionado ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable(") tiene asignados todos los motivos de proveedor fijo existentes.")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1307;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 1308;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(134217728);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1309;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1311;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1073741824);
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1312;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1313;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1314;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
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
 BA.debugLineNum = 1318;BA.debugLine="Return mRes";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1319;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cevaluacionproveedores","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 129;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="EventData.Consume";
Debug.ShouldStop(2);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getform(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getForm (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("getform")) { return __ref.runUserSub(false, "cevaluacionproveedores","getform", __ref);}
 BA.debugLineNum = 138;BA.debugLine="Sub getForm As Form";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Return frm";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_frm" /*RemoteObject*/ );
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _grabareliminarmotivoproveedorfijo(RemoteObject __ref,RemoteObject _provsel,RemoteObject _idmot) throws Exception{
try {
		Debug.PushSubsStack("GrabarEliminarMotivoProveedorFijo (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1396);
if (RapidSub.canDelegate("grabareliminarmotivoproveedorfijo")) { return __ref.runUserSub(false, "cevaluacionproveedores","grabareliminarmotivoproveedorfijo", __ref, _provsel, _idmot);}
ResumableSub_GrabarEliminarMotivoProveedorFijo rsub = new ResumableSub_GrabarEliminarMotivoProveedorFijo(null,__ref,_provsel,_idmot);
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
public static class ResumableSub_GrabarEliminarMotivoProveedorFijo extends BA.ResumableSub {
public ResumableSub_GrabarEliminarMotivoProveedorFijo(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel,RemoteObject _idmot) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._idmot = _idmot;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _idmot;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mrespuesta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GrabarEliminarMotivoProveedorFijo (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1396);
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
Debug.locals.put("ProvSel", _provsel);
Debug.locals.put("IDMot", _idmot);
 BA.debugLineNum = 1398;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2097152);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1399;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4194304);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1400;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1401;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(16777216);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 1402;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresElimi";
Debug.ShouldStop(33554432);
_comando = BA.ObjectToString("EvaluacionProveedoresEliminarMotivoProveedorFijoProveedor");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1404;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(ProvS";
Debug.ShouldStop(134217728);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_provsel),(_idmot),(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))})),(Object)(__ref));
 BA.debugLineNum = 1406;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "grabareliminarmotivoproveedorfijo"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1407;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 1408;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1409;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "grabareliminarmotivoproveedorfijo"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1410;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1411;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1414;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then  ' este caso";
Debug.ShouldStop(32);
if (true) break;

case 6:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 1415;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1416;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1421;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4096);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1422;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
Debug.ShouldStop(8192);
_mrespuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mrespuesta = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mRespuesta", _mrespuesta);Debug.locals.put("mRespuesta", _mrespuesta);
 BA.debugLineNum = 1423;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
Debug.ShouldStop(16384);
_sresp = BA.ObjectToString(_mrespuesta.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1424;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(32768);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1425;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP \"";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SP "),_comando,RemoteObject.createImmutable("."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp,parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("No ha sido posible eliminar el motivo de proveedor fijo."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1426;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "grabareliminarmotivoproveedorfijo"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 1427;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1428;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1430;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1431;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 1436;BA.debugLine="Return mRes";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1437;BA.debugLine="End Sub";
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
public static RemoteObject  _grabarnuevomotivoproveedorfijo(RemoteObject __ref,RemoteObject _provsel,RemoteObject _nombreprovsel,RemoteObject _idmot) throws Exception{
try {
		Debug.PushSubsStack("GrabarNuevoMotivoProveedorFijo (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1353);
if (RapidSub.canDelegate("grabarnuevomotivoproveedorfijo")) { return __ref.runUserSub(false, "cevaluacionproveedores","grabarnuevomotivoproveedorfijo", __ref, _provsel, _nombreprovsel, _idmot);}
ResumableSub_GrabarNuevoMotivoProveedorFijo rsub = new ResumableSub_GrabarNuevoMotivoProveedorFijo(null,__ref,_provsel,_nombreprovsel,_idmot);
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
public static class ResumableSub_GrabarNuevoMotivoProveedorFijo extends BA.ResumableSub {
public ResumableSub_GrabarNuevoMotivoProveedorFijo(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel,RemoteObject _nombreprovsel,RemoteObject _idmot) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._nombreprovsel = _nombreprovsel;
this._idmot = _idmot;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _nombreprovsel;
RemoteObject _idmot;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mrespuesta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GrabarNuevoMotivoProveedorFijo (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1353);
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
Debug.locals.put("ProvSel", _provsel);
Debug.locals.put("NombreProvSel", _nombreprovsel);
Debug.locals.put("IDMot", _idmot);
 BA.debugLineNum = 1355;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1024);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1356;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(2048);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1357;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1358;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(8192);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 1359;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresNuevo";
Debug.ShouldStop(16384);
_comando = BA.ObjectToString("EvaluacionProveedoresNuevoMotivoProveedorFijoProveedor");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1361;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(ProvS";
Debug.ShouldStop(65536);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_provsel),(_nombreprovsel),(_idmot),(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))})),(Object)(__ref));
 BA.debugLineNum = 1363;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "grabarnuevomotivoproveedorfijo"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1364;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 1365;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1366;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "grabarnuevomotivoproveedorfijo"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1367;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1368;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1371;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then  ' este caso";
Debug.ShouldStop(67108864);
if (true) break;

case 6:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 1372;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(134217728);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1373;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1378;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(2);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1379;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
Debug.ShouldStop(4);
_mrespuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mrespuesta = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mRespuesta", _mrespuesta);Debug.locals.put("mRespuesta", _mrespuesta);
 BA.debugLineNum = 1380;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
Debug.ShouldStop(8);
_sresp = BA.ObjectToString(_mrespuesta.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1381;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(16);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1382;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP \"";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SP "),_comando,RemoteObject.createImmutable("."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp,parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("No ha sido posible grabar el motivo de proveedor fijo."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1383;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "grabarnuevomotivoproveedorfijo"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 1384;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1385;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1387;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1388;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 1393;BA.debugLine="Return mRes";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1394;BA.debugLine="End Sub";
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
public static void  _inicio(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Inicio (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("inicio")) { __ref.runUserSub(false, "cevaluacionproveedores","inicio", __ref); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Inicio (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,142);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 144;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioObje";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "inicio"), parent._cmpermisos.runMethod(false,"_permisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("CalificacionProveedores"))));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 145;BA.debugLine="Select Case sRes";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 147;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de con";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query PermisosAplicacion.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 148;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "inicio"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 12;
;
 BA.debugLineNum = 149;BA.debugLine="SalirModulo";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 150;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 12;
 BA.debugLineNum = 152;BA.debugLine="PermisoCalificarProveedores=False";
Debug.ShouldStop(8388608);
__ref.setField ("_permisocalificarproveedores" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 154;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error\")";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_sres),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 155;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "inicio"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 12;
;
 BA.debugLineNum = 156;BA.debugLine="SalirModulo";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 157;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 159;BA.debugLine="PermisoCalificarProveedores=False";
Debug.ShouldStop(1073741824);
__ref.setField ("_permisocalificarproveedores" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 161;BA.debugLine="PermisoCalificarProveedores=True";
Debug.ShouldStop(1);
__ref.setField ("_permisocalificarproveedores" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 164;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioObje";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "inicio"), parent._cmpermisos.runMethod(false,"_permisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("ValidarCalificacionProveedores"))));
this.state = 28;
return;
case 28:
//C
this.state = 13;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 165;BA.debugLine="Select Case sRes";
Debug.ShouldStop(16);
if (true) break;

case 13:
//select
this.state = 24;
switch (BA.switchObjectToInt(_sres,BA.ObjectToString("ErrConn"),BA.ObjectToString("SinPermiso"),BA.ObjectToString("ERROR"),BA.ObjectToString("DENIED"))) {
case 0: {
this.state = 15;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
case 2: {
this.state = 19;
if (true) break;
}
case 3: {
this.state = 21;
if (true) break;
}
default: {
this.state = 23;
if (true) break;
}
}
if (true) break;

case 15:
//C
this.state = 24;
 BA.debugLineNum = 167;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de con";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query PermisosAplicacion.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 168;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "inicio"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 24;
;
 BA.debugLineNum = 169;BA.debugLine="SalirModulo";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 170;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 24;
 BA.debugLineNum = 172;BA.debugLine="PermisoValidarCalificacionProveedores=False";
Debug.ShouldStop(2048);
__ref.setField ("_permisovalidarcalificacionproveedores" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 19:
//C
this.state = 24;
 BA.debugLineNum = 174;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error\")";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_sres),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 175;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "inicio"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 24;
;
 BA.debugLineNum = 176;BA.debugLine="SalirModulo";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 177;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 179;BA.debugLine="PermisoValidarCalificacionProveedores=False";
Debug.ShouldStop(262144);
__ref.setField ("_permisovalidarcalificacionproveedores" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 181;BA.debugLine="PermisoValidarCalificacionProveedores=True";
Debug.ShouldStop(1048576);
__ref.setField ("_permisovalidarcalificacionproveedores" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 184;BA.debugLine="wait for (RefrescarDatosActualesEvaluacion) compl";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "inicio"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_refrescardatosactualesevaluacion" /*RemoteObject*/ ));
this.state = 31;
return;
case 31:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 185;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 186;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cevaluacionproveedores","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 42;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(cevaluacionproveedores._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(cevaluacionproveedores.__c.getField(true,"True")));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableviewevaluacionproveedores_accionsalirjamtableview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewEvaluacionProveedores_AccionSalirJamTableView (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,365);
if (RapidSub.canDelegate("jamtableviewevaluacionproveedores_accionsalirjamtableview")) { return __ref.runUserSub(false, "cevaluacionproveedores","jamtableviewevaluacionproveedores_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 365;BA.debugLine="Sub jamTableViewEvaluacionProveedores_AccionSalirJ";
Debug.ShouldStop(4096);
 BA.debugLineNum = 366;BA.debugLine="SalirModulo";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableviewevaluacionproveedores_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewEvaluacionProveedores_ContextMenuItem_Action (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,432);
if (RapidSub.canDelegate("jamtableviewevaluacionproveedores_contextmenuitem_action")) { return __ref.runUserSub(false, "cevaluacionproveedores","jamtableviewevaluacionproveedores_contextmenuitem_action", __ref, _tagmenuitem);}
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _provsel = RemoteObject.createImmutable("");
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 432;BA.debugLine="Sub jamTableViewEvaluacionProveedores_ContextMenuI";
Debug.ShouldStop(32768);
 BA.debugLineNum = 434;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("CalificarProveedor"),BA.ObjectToString("BorrarCalificacionProveedor"),BA.ObjectToString("ValidarCalificacionProveedor"),BA.ObjectToString("BorrarValidacionCalificacionProveedor"),BA.ObjectToString("ConfigurarProveedorFijoEvaluacion"))) {
case 0: {
 BA.debugLineNum = 436;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
Debug.ShouldStop(524288);
_filasel = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 437;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
Debug.ShouldStop(1048576);
_provsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Proveedor"))));Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 438;BA.debugLine="CalificarProveedor(ProvSel,FilaSel)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_calificarproveedor" /*RemoteObject*/ ,(Object)(_provsel),(Object)(_filasel));
 break; }
case 1: {
 BA.debugLineNum = 441;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
Debug.ShouldStop(16777216);
_filasel = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 442;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
Debug.ShouldStop(33554432);
_provsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Proveedor"))));Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 443;BA.debugLine="BorrarCalificacionProveedor(ProvSel,FilaSel)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_borrarcalificacionproveedor" /*RemoteObject*/ ,(Object)(_provsel),(Object)(_filasel));
 break; }
case 2: {
 BA.debugLineNum = 446;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
Debug.ShouldStop(536870912);
_filasel = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 447;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
Debug.ShouldStop(1073741824);
_provsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Proveedor"))));Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 448;BA.debugLine="ValidarCalificacionProveedor(ProvSel,FilaSel)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_validarcalificacionproveedor" /*RemoteObject*/ ,(Object)(_provsel),(Object)(_filasel));
 break; }
case 3: {
 BA.debugLineNum = 451;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
Debug.ShouldStop(4);
_filasel = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 452;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
Debug.ShouldStop(8);
_provsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Proveedor"))));Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 453;BA.debugLine="BorrarValidacionCalificacionProveedor(ProvSel,F";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_borrarvalidacioncalificacionproveedor" /*RemoteObject*/ ,(Object)(_provsel),(Object)(_filasel));
 break; }
case 4: {
 BA.debugLineNum = 456;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
Debug.ShouldStop(128);
_filasel = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 457;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
Debug.ShouldStop(256);
_provsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Proveedor"))));Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 458;BA.debugLine="ConfigurarProveedorFijoEvaluacion(ProvSel,FilaS";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_configurarproveedorfijoevaluacion" /*void*/ ,(Object)(_provsel),(Object)(_filasel));
 break; }
}
;
 BA.debugLineNum = 460;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableviewevaluacionproveedores_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewEvaluacionProveedores_MenuBarMenuItem_Action (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("jamtableviewevaluacionproveedores_menubarmenuitem_action")) { __ref.runUserSub(false, "cevaluacionproveedores","jamtableviewevaluacionproveedores_menubarmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableViewEvaluacionProveedores_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableViewEvaluacionProveedores_MenuBarMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableViewEvaluacionProveedores_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewEvaluacionProveedores_MenuBarMenuItem_Action(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _tagmenuitem;
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _provsel = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewEvaluacionProveedores_MenuBarMenuItem_Action (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,370);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 371;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//select
this.state = 36;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("CalificarProveedor"),BA.ObjectToString("BorrarCalificacionProveedor"),BA.ObjectToString("ValidarCalificacionProveedor"),BA.ObjectToString("BorrarValidacionCalificacionProveedor"),BA.ObjectToString("ActualizarDatos"),BA.ObjectToString("ConfigurarProveedorFijoEvaluacion"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 11;
if (true) break;
}
case 3: {
this.state = 17;
if (true) break;
}
case 4: {
this.state = 23;
if (true) break;
}
case 5: {
this.state = 29;
if (true) break;
}
case 6: {
this.state = 31;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 36;
 BA.debugLineNum = 374;BA.debugLine="ActualizarDatosEvaluacionProveedores12UltimosMe";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_actualizardatosevaluacionproveedores12ultimosmeses" /*RemoteObject*/ );
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 380;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
Debug.ShouldStop(134217728);
_filasel = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 381;BA.debugLine="If FilaSel=-1 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 6:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_filasel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 382;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "jamtableviewevaluacionproveedores_menubarmenuitem_action"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("No se ha seleccionado ninguna fila."))));
this.state = 37;
return;
case 37:
//C
this.state = 9;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 383;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 36;
;
 BA.debugLineNum = 385;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
Debug.ShouldStop(1);
_provsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Proveedor"))));Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 386;BA.debugLine="CalificarProveedor(ProvSel,FilaSel)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_calificarproveedor" /*RemoteObject*/ ,(Object)(_provsel),(Object)(_filasel));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 389;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
Debug.ShouldStop(16);
_filasel = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 390;BA.debugLine="If FilaSel=-1 Then";
Debug.ShouldStop(32);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_filasel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 391;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "jamtableviewevaluacionproveedores_menubarmenuitem_action"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("No se ha seleccionado ninguna fila."))));
this.state = 38;
return;
case 38:
//C
this.state = 15;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 392;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 15:
//C
this.state = 36;
;
 BA.debugLineNum = 394;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
Debug.ShouldStop(512);
_provsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Proveedor"))));Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 395;BA.debugLine="BorrarCalificacionProveedor(ProvSel,FilaSel)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_borrarcalificacionproveedor" /*RemoteObject*/ ,(Object)(_provsel),(Object)(_filasel));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 398;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
Debug.ShouldStop(8192);
_filasel = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 399;BA.debugLine="If FilaSel=-1 Then";
Debug.ShouldStop(16384);
if (true) break;

case 18:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_filasel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 400;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "jamtableviewevaluacionproveedores_menubarmenuitem_action"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("No se ha seleccionado ninguna fila."))));
this.state = 39;
return;
case 39:
//C
this.state = 21;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 401;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 36;
;
 BA.debugLineNum = 403;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
Debug.ShouldStop(262144);
_provsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Proveedor"))));Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 404;BA.debugLine="ValidarCalificacionProveedor(ProvSel,FilaSel)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_validarcalificacionproveedor" /*RemoteObject*/ ,(Object)(_provsel),(Object)(_filasel));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 407;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
Debug.ShouldStop(4194304);
_filasel = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 408;BA.debugLine="If FilaSel=-1 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_filasel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 409;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "jamtableviewevaluacionproveedores_menubarmenuitem_action"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("No se ha seleccionado ninguna fila."))));
this.state = 40;
return;
case 40:
//C
this.state = 27;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 410;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 27:
//C
this.state = 36;
;
 BA.debugLineNum = 412;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
Debug.ShouldStop(134217728);
_provsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Proveedor"))));Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 413;BA.debugLine="BorrarValidacionCalificacionProveedor(ProvSel,F";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_borrarvalidacioncalificacionproveedor" /*RemoteObject*/ ,(Object)(_provsel),(Object)(_filasel));
 if (true) break;

case 29:
//C
this.state = 36;
 BA.debugLineNum = 416;BA.debugLine="ActualizarDatosEvaluacionProveedores12UltimosMe";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_actualizardatosevaluacionproveedores12ultimosmeses" /*RemoteObject*/ );
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 419;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
Debug.ShouldStop(4);
_filasel = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 420;BA.debugLine="If FilaSel=-1 Then";
Debug.ShouldStop(8);
if (true) break;

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_filasel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 421;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "jamtableviewevaluacionproveedores_menubarmenuitem_action"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("No se ha seleccionado ninguna fila."))));
this.state = 41;
return;
case 41:
//C
this.state = 35;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 422;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;

case 35:
//C
this.state = 36;
;
 BA.debugLineNum = 424;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
Debug.ShouldStop(128);
_provsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Proveedor"))));Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 425;BA.debugLine="ConfigurarProveedorFijoEvaluacion(ProvSel,FilaS";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_configurarproveedorfijoevaluacion" /*void*/ ,(Object)(_provsel),(Object)(_filasel));
 if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 430;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _jamtableviewmotivosfijarevaluacionproveedor_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewMotivosFijarEvaluacionProveedor_ContextMenuItem_Action (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,635);
if (RapidSub.canDelegate("jamtableviewmotivosfijarevaluacionproveedor_contextmenuitem_action")) { return __ref.runUserSub(false, "cevaluacionproveedores","jamtableviewmotivosfijarevaluacionproveedor_contextmenuitem_action", __ref, _tagmenuitem);}
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _provsel = RemoteObject.createImmutable("");
RemoteObject _idmotivolsel = RemoteObject.createImmutable(0);
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 635;BA.debugLine="Sub jamTableViewMotivosFijarEvaluacionProveedor_Co";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 636;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("EliminarMotivoProveedorFijoEvaluacion"))) {
case 0: {
 BA.debugLineNum = 638;BA.debugLine="Dim FilaSel As Int=jamTableViewMotivosFijarEval";
Debug.ShouldStop(536870912);
_filasel = __ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 639;BA.debugLine="Dim ProvSel As String=txtProveedorFijoEvaluacio";
Debug.ShouldStop(1073741824);
_provsel = __ref.getField(false,"_txtproveedorfijoevaluacion" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 640;BA.debugLine="Dim IDMotivolSel As Int=jamTableViewMotivosFija";
Debug.ShouldStop(-2147483648);
_idmotivolsel = BA.numberCast(int.class, __ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IDMotivoProveedorFijoEvaluacion"))));Debug.locals.put("IDMotivolSel", _idmotivolsel);Debug.locals.put("IDMotivolSel", _idmotivolsel);
 BA.debugLineNum = 641;BA.debugLine="EliminarMotivoProveedorFijoEvaluacion(ProvSel,";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_eliminarmotivoproveedorfijoevaluacion" /*void*/ ,(Object)(_provsel),(Object)(_idmotivolsel));
 break; }
}
;
 BA.debugLineNum = 643;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableviewmotivosfijarevaluacionproveedor_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewMotivosFijarEvaluacionProveedor_MenuBarMenuItem_Action (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,645);
if (RapidSub.canDelegate("jamtableviewmotivosfijarevaluacionproveedor_menubarmenuitem_action")) { __ref.runUserSub(false, "cevaluacionproveedores","jamtableviewmotivosfijarevaluacionproveedor_menubarmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableViewMotivosFijarEvaluacionProveedor_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableViewMotivosFijarEvaluacionProveedor_MenuBarMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableViewMotivosFijarEvaluacionProveedor_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewMotivosFijarEvaluacionProveedor_MenuBarMenuItem_Action(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _tagmenuitem;
RemoteObject _provsel = RemoteObject.createImmutable("");
RemoteObject _nombreprovsel = RemoteObject.createImmutable("");
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _idmotivolsel = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewMotivosFijarEvaluacionProveedor_MenuBarMenuItem_Action (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,645);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 646;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(32);
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("AddMotivoProveedorFijoEvaluacion"),BA.ObjectToString("EliminarMotivoProveedorFijoEvaluacion"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 648;BA.debugLine="Dim ProvSel As String=txtProveedorFijoEvaluacio";
Debug.ShouldStop(128);
_provsel = __ref.getField(false,"_txtproveedorfijoevaluacion" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 649;BA.debugLine="Dim NombreProvSel As String=txtNombreProveedorF";
Debug.ShouldStop(256);
_nombreprovsel = __ref.getField(false,"_txtnombreproveedorfijoevaluacion" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("NombreProvSel", _nombreprovsel);Debug.locals.put("NombreProvSel", _nombreprovsel);
 BA.debugLineNum = 650;BA.debugLine="AddMotivosProveedorFijoEvaluacion(ProvSel, Nomb";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_addmotivosproveedorfijoevaluacion" /*void*/ ,(Object)(_provsel),(Object)(_nombreprovsel));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 652;BA.debugLine="Dim FilaSel As Int=jamTableViewMotivosFijarEval";
Debug.ShouldStop(2048);
_filasel = __ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 653;BA.debugLine="If FilaSel=-1 Then";
Debug.ShouldStop(4096);
if (true) break;

case 6:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_filasel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 654;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "jamtableviewmotivosfijarevaluacionproveedor_menubarmenuitem_action"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("No se ha seleccionado ninguna fila."))));
this.state = 11;
return;
case 11:
//C
this.state = 9;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 655;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 657;BA.debugLine="Dim ProvSel As String=txtProveedorFijoEvaluacio";
Debug.ShouldStop(65536);
_provsel = __ref.getField(false,"_txtproveedorfijoevaluacion" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("ProvSel", _provsel);Debug.locals.put("ProvSel", _provsel);
 BA.debugLineNum = 658;BA.debugLine="Dim IDMotivolSel As Int=jamTableViewMotivosFija";
Debug.ShouldStop(131072);
_idmotivolsel = BA.numberCast(int.class, __ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IDMotivoProveedorFijoEvaluacion"))));Debug.locals.put("IDMotivolSel", _idmotivolsel);Debug.locals.put("IDMotivolSel", _idmotivolsel);
 BA.debugLineNum = 659;BA.debugLine="EliminarMotivoProveedorFijoEvaluacion(ProvSel,";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_eliminarmotivoproveedorfijoevaluacion" /*void*/ ,(Object)(_provsel),(Object)(_idmotivolsel));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 661;BA.debugLine="End Sub";
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
public static RemoteObject  _jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewProveedoresFijosEvaluacionProveedores_AccionSalirJamTableView (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,663);
if (RapidSub.canDelegate("jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview")) { return __ref.runUserSub(false, "cevaluacionproveedores","jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview", __ref);}
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 663;BA.debugLine="Private Sub jamTableViewProveedoresFijosEvaluacion";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 664;BA.debugLine="For Each xNode As B4XView In BackgroundProveedore";
Debug.ShouldStop(8388608);
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group1 = __ref.getField(false,"_backgroundproveedoresfijosevaluacion" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group1.runMethod(false,"Get",index1));Debug.locals.put("xNode", _xnode);
Debug.locals.put("xNode", _xnode);
 BA.debugLineNum = 665;BA.debugLine="xNode.RemoveViewFromParent";
Debug.ShouldStop(16777216);
_xnode.runVoidMethod ("RemoveViewFromParent");
 }
}Debug.locals.put("xNode", _xnode);
;
 BA.debugLineNum = 667;BA.debugLine="BackgroundProveedoresFijosEvaluacion.RemoveViewFr";
Debug.ShouldStop(67108864);
__ref.getField(false,"_backgroundproveedoresfijosevaluacion" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 668;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbliconcerrardrawer_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblIconCerrarDrawer_MouseClicked (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("lbliconcerrardrawer_mouseclicked")) { return __ref.runUserSub(false, "cevaluacionproveedores","lbliconcerrardrawer_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 288;BA.debugLine="Private Sub lblIconCerrarDrawer_MouseClicked (Even";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="Drawer.LeftOpen=False";
Debug.ShouldStop(1);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,cevaluacionproveedores.__c.getField(true,"False"));
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseentered(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblSalirEvaluacionProveedoresConfigurarProveedorFijoEvaluacion_MouseEntered (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1333);
if (RapidSub.canDelegate("lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseentered")) { return __ref.runUserSub(false, "cevaluacionproveedores","lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseentered", __ref, _eventdata);}
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1333;BA.debugLine="Private Sub lblSalirEvaluacionProveedoresConfigura";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1334;BA.debugLine="Dim xNode As B4XView=Sender";
Debug.ShouldStop(2097152);
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), cevaluacionproveedores.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xNode", _xnode);Debug.locals.put("xNode", _xnode);
 BA.debugLineNum = 1335;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,xui.Colo";
Debug.ShouldStop(4194304);
_xnode.runVoidMethod ("SetColorAndBorder",(Object)(_xnode.runMethod(true,"getColor")),(Object)(BA.numberCast(double.class, cevaluacionproveedores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Cyan")),(Object)(BA.numberCast(double.class, 5)));
 BA.debugLineNum = 1337;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblSalirEvaluacionProveedoresConfigurarProveedorFijoEvaluacion_MouseExited (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1345);
if (RapidSub.canDelegate("lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseexited")) { return __ref.runUserSub(false, "cevaluacionproveedores","lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseexited", __ref, _eventdata);}
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1345;BA.debugLine="Private Sub lblSalirEvaluacionProveedoresConfigura";
Debug.ShouldStop(1);
 BA.debugLineNum = 1346;BA.debugLine="Dim xNode As B4XView=Sender";
Debug.ShouldStop(2);
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), cevaluacionproveedores.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xNode", _xnode);Debug.locals.put("xNode", _xnode);
 BA.debugLineNum = 1347;BA.debugLine="If xNode.IsInitialized Then";
Debug.ShouldStop(4);
if (_xnode.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1348;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,0xFF696";
Debug.ShouldStop(8);
_xnode.runVoidMethod ("SetColorAndBorder",(Object)(_xnode.runMethod(true,"getColor")),(Object)(BA.numberCast(double.class, cevaluacionproveedores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(int.class, ((int)0xff696969))),(Object)(BA.numberCast(double.class, 5)));
 };
 BA.debugLineNum = 1351;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblSalirEvaluacionProveedoresConfigurarProveedorFijoEvaluacion_MousePressed (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1339);
if (RapidSub.canDelegate("lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousepressed")) { return __ref.runUserSub(false, "cevaluacionproveedores","lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousepressed", __ref, _eventdata);}
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1339;BA.debugLine="Private Sub lblSalirEvaluacionProveedoresConfigura";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1340;BA.debugLine="Dim xNode As B4XView=Sender";
Debug.ShouldStop(134217728);
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), cevaluacionproveedores.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xNode", _xnode);Debug.locals.put("xNode", _xnode);
 BA.debugLineNum = 1341;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,xui.Colo";
Debug.ShouldStop(268435456);
_xnode.runVoidMethod ("SetColorAndBorder",(Object)(_xnode.runMethod(true,"getColor")),(Object)(BA.numberCast(double.class, cevaluacionproveedores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Cyan")),(Object)(BA.numberCast(double.class, 5)));
 BA.debugLineNum = 1343;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblSalirEvaluacionProveedoresConfigurarProveedorFijoEvaluacion_MouseReleased (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1321);
if (RapidSub.canDelegate("lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousereleased")) { return __ref.runUserSub(false, "cevaluacionproveedores","lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousereleased", __ref, _eventdata);}
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1321;BA.debugLine="Private Sub lblSalirEvaluacionProveedoresConfigura";
Debug.ShouldStop(256);
 BA.debugLineNum = 1322;BA.debugLine="Dim xNode As B4XView=Sender";
Debug.ShouldStop(512);
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), cevaluacionproveedores.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xNode", _xnode);Debug.locals.put("xNode", _xnode);
 BA.debugLineNum = 1323;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,0xFF6969";
Debug.ShouldStop(1024);
_xnode.runVoidMethod ("SetColorAndBorder",(Object)(_xnode.runMethod(true,"getColor")),(Object)(BA.numberCast(double.class, cevaluacionproveedores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(int.class, ((int)0xff696969))),(Object)(BA.numberCast(double.class, 5)));
 BA.debugLineNum = 1330;BA.debugLine="SalirProveedorFijoEvaluacion";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_salirproveedorfijoevaluacion" /*void*/ );
 BA.debugLineNum = 1331;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbltextocerrardrawer_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblTextoCerrarDrawer_MouseClicked (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,284);
if (RapidSub.canDelegate("lbltextocerrardrawer_mouseclicked")) { return __ref.runUserSub(false, "cevaluacionproveedores","lbltextocerrardrawer_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 284;BA.debugLine="Private Sub lblTextoCerrarDrawer_MouseClicked (Eve";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="Drawer.LeftOpen=False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,cevaluacionproveedores.__c.getField(true,"False"));
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnltopdrawerleft_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pnlTopDrawerLeft_MouseClicked (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("pnltopdrawerleft_mouseclicked")) { return __ref.runUserSub(false, "cevaluacionproveedores","pnltopdrawerleft_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 280;BA.debugLine="Private Sub pnlTopDrawerLeft_MouseClicked (EventDa";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="Drawer.LeftOpen=False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,cevaluacionproveedores.__c.getField(true,"False"));
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refrescardatosactualesevaluacion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefrescarDatosActualesEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("refrescardatosactualesevaluacion")) { return __ref.runUserSub(false, "cevaluacionproveedores","refrescardatosactualesevaluacion", __ref);}
ResumableSub_RefrescarDatosActualesEvaluacion rsub = new ResumableSub_RefrescarDatosActualesEvaluacion(null,__ref);
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
public static class ResumableSub_RefrescarDatosActualesEvaluacion extends BA.ResumableSub {
public ResumableSub_RefrescarDatosActualesEvaluacion(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RefrescarDatosActualesEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,188);
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
 BA.debugLineNum = 189;BA.debugLine="wait for(EvaluacionProveedoresDatosEvaluacionActu";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "refrescardatosactualesevaluacion"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_evaluacionproveedoresdatosevaluacionactual" /*RemoteObject*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 190;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 191;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 192;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 193;BA.debugLine="SalirModulo";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 194;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 197;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(16);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblEvaluacionProveedoresDatosEvaluacionActual order by Proveedor")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 199;BA.debugLine="Dim rSub As ResumableSub=jamTableViewEvaluacionPr";
Debug.ShouldStop(64);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 200;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "refrescardatosactualesevaluacion"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 201;BA.debugLine="rs.Close";
Debug.ShouldStop(256);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 202;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(512);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 203;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1024);
if (true) break;

case 5:
//if
this.state = 25;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 204;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(2048);
if (true) break;

case 8:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 205;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 206;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "refrescardatosactualesevaluacion"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
 BA.debugLineNum = 208;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 209;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "refrescardatosactualesevaluacion"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 210;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(131072);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 211;BA.debugLine="jamTableViewEvaluacionProveedores.AbrirCamposB";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 212;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 215;BA.debugLine="ExitApplication";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 217;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(16777216);

case 15:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 218;BA.debugLine="If True<>mResultSetData.Get(\"ListaVacia\") Then";
Debug.ShouldStop(33554432);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("!",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 219;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 220;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "refrescardatosactualesevaluacion"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 222;BA.debugLine="jamTableViewEvaluacionProveedores.SetPlacehold";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setplaceholdertext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 227;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 228;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cevaluacionproveedores","salirmodulo", __ref);}
 BA.debugLineNum = 133;BA.debugLine="Sub SalirModulo";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(32);
cevaluacionproveedores._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 135;BA.debugLine="frm.Close";
Debug.ShouldStop(64);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _salirproveedorfijoevaluacion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirProveedorFijoEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1103);
if (RapidSub.canDelegate("salirproveedorfijoevaluacion")) { __ref.runUserSub(false, "cevaluacionproveedores","salirproveedorfijoevaluacion", __ref); return;}
ResumableSub_SalirProveedorFijoEvaluacion rsub = new ResumableSub_SalirProveedorFijoEvaluacion(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SalirProveedorFijoEvaluacion extends BA.ResumableSub {
public ResumableSub_SalirProveedorFijoEvaluacion(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdataprov = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _proveedorfijoevaluacion = RemoteObject.createImmutable(false);
RemoteObject _calificacionprovisional = RemoteObject.createImmutable("");
RemoteObject group5;
int index5;
int groupLen5;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SalirProveedorFijoEvaluacion (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1103);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1104;BA.debugLine="If jamTableViewMotivosFijarEvaluacionProveedor.Nu";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_jamtableviewmotivosfijarevaluacionproveedor" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getnumerototalregistros" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1105;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"El p";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "salirproveedorfijoevaluacion"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_txtproveedorfijoevaluacion" /*RemoteObject*/ ).runMethod(true,"getText")))),RemoteObject.createImmutable(" no tiene asignado ningún motivo de proveedor fijo, por lo que no es considerado como proveedor fijo.\n"),RemoteObject.createImmutable("Continuar?")))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 18;
return;
case 18:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1107;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;
;
 BA.debugLineNum = 1110;BA.debugLine="For Each xNode As B4XView In BackgroundProveedore";
Debug.ShouldStop(2097152);

case 10:
//for
this.state = 13;
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
group5 = __ref.getField(false,"_backgroundproveedoresfijosevaluacion" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
index5 = 0;
groupLen5 = group5.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("xNode", _xnode);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 13;
if (index5 < groupLen5) {
this.state = 12;
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group5.runMethod(false,"Get",index5));Debug.locals.put("xNode", _xnode);}
if (true) break;

case 20:
//C
this.state = 19;
index5++;
Debug.locals.put("xNode", _xnode);
if (true) break;

case 12:
//C
this.state = 20;
 BA.debugLineNum = 1111;BA.debugLine="xNode.RemoveViewFromParent";
Debug.ShouldStop(4194304);
_xnode.runVoidMethod ("RemoveViewFromParent");
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("xNode", _xnode);
;
 BA.debugLineNum = 1113;BA.debugLine="BackgroundProveedoresFijosEvaluacion.RemoveViewFr";
Debug.ShouldStop(16777216);
__ref.getField(false,"_backgroundproveedoresfijosevaluacion" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 1115;BA.debugLine="Wait For(EvaluacionProveedoresDatosEvaluacionActu";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "salirproveedorfijoevaluacion"), __ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_evaluacionproveedoresdatosevaluacionactualproveedor" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_proveedoredicion" /*RemoteObject*/ ))));
this.state = 21;
return;
case 21:
//C
this.state = 14;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1116;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(134217728);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1117;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(268435456);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1118;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1119;BA.debugLine="SalirModulo";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_salirmodulo" /*RemoteObject*/ );
 if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 1121;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(1);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1122;BA.debugLine="Dim mDataProv As Map=lstReg.Get(0)";
Debug.ShouldStop(2);
_mdataprov = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataprov = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mDataProv", _mdataprov);Debug.locals.put("mDataProv", _mdataprov);
 BA.debugLineNum = 1124;BA.debugLine="Dim ProveedorFijoEvaluacion As Boolean=mDataProv.";
Debug.ShouldStop(8);
_proveedorfijoevaluacion = BA.ObjectToBoolean(_mdataprov.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ProveedorFijoEvaluacion")))));Debug.locals.put("ProveedorFijoEvaluacion", _proveedorfijoevaluacion);Debug.locals.put("ProveedorFijoEvaluacion", _proveedorfijoevaluacion);
 BA.debugLineNum = 1125;BA.debugLine="Dim CalificacionProvisional As String=mDataProv.G";
Debug.ShouldStop(16);
_calificacionprovisional = BA.ObjectToString(_mdataprov.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CalificacionProvisional")))));Debug.locals.put("CalificacionProvisional", _calificacionprovisional);Debug.locals.put("CalificacionProvisional", _calificacionprovisional);
 BA.debugLineNum = 1127;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
Debug.ShouldStop(64);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set ProveedorFijoEvaluacion=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {((_proveedorfijoevaluacion.<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((0)))),(__ref.getField(true,"_proveedoredicion" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 1128;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblEvaluacionProveedoresDatosEvaluacionActual set ProveedorFijoEvaluacion=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {((_proveedorfijoevaluacion.<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((0)))),(__ref.getField(true,"_proveedoredicion" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 1129;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set CalificacionProvisional=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_calificacionprovisional),(__ref.getField(true,"_proveedoredicion" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 1130;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblEvaluacionProveedoresDatosEvaluacionActual set CalificacionProvisional=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_calificacionprovisional),(__ref.getField(true,"_proveedoredicion" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 1131;BA.debugLine="jamTableViewEvaluacionProveedores.RefrescarFilaTV";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescarfilatvmetodosql" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_filajamtvevalproveedoredicion" /*RemoteObject*/ )));
 BA.debugLineNum = 1133;BA.debugLine="FilaJamTVEvalProveedorEdicion=-1";
Debug.ShouldStop(4096);
__ref.setField ("_filajamtvevalproveedoredicion" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 1134;BA.debugLine="ProveedorEdicion=\"\"";
Debug.ShouldStop(8192);
__ref.setField ("_proveedoredicion" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1136;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1138;BA.debugLine="End Sub";
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
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cevaluacionproveedores","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,50);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 51;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 54;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(2097152);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 55;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(4194304);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 56;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(8388608);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 58;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 59;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 67;BA.debugLine="frm.RootPane.LoadLayout(\"scrEvaluacionProveedores";
Debug.ShouldStop(4);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrEvaluacionProveedoresSinDrawer")));
 BA.debugLineNum = 69;BA.debugLine="Sleep(0)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "show"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 73;BA.debugLine="frm.Show";
Debug.ShouldStop(256);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 75;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    Evaluació";
Debug.ShouldStop(1024);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("    Evaluación Proveedores")));
 BA.debugLineNum = 78;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="jamTableViewEvaluacionProveedores.EstadoMenuItem(";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 83;BA.debugLine="jamTableViewEvaluacionProveedores.EstadoMenuItem(";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 86;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontmaterialiconstomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Actualizar Datos")),(Object)(BA.ObjectToString("ActualizarDatos")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe5d5)))))),(Object)(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 88;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Calificar Proveedor")),(Object)(BA.ObjectToString("CalificarProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0f6)))))),(Object)(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 89;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Borrar Calificación Proveedor")),(Object)(BA.ObjectToString("BorrarCalificacionProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf014)))))),(Object)(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 90;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Validar Calificación Proveedor")),(Object)(BA.ObjectToString("ValidarCalificacionProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf046)))))),(Object)(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 91;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Borrar Validación Calificación Proveedor")),(Object)(BA.ObjectToString("BorrarValidacionCalificacionProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf05c)))))),(Object)(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 92;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontmaterialiconstomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Configurar Proveedor FIJO Evaluación")),(Object)(BA.ObjectToString("ConfigurarProveedorFijoEvaluacion")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe1b3)))))),(Object)(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 93;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 94;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Calificar Proveedor")),(Object)(BA.ObjectToString("CalificarProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0f6)))))));
 BA.debugLineNum = 95;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Borrar Calificación Proveedor")),(Object)(BA.ObjectToString("BorrarCalificacionProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf014)))))));
 BA.debugLineNum = 96;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Validar Calificación Proveedor")),(Object)(BA.ObjectToString("ValidarCalificacionProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf046)))))));
 BA.debugLineNum = 97;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
Debug.ShouldStop(1);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Borrar Validación Calificación Proveedor")),(Object)(BA.ObjectToString("BorrarValidacionCalificacionProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf05c)))))));
 BA.debugLineNum = 98;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontmaterialiconstext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Configurar Proveedor FIJO Evaluación")),(Object)(BA.ObjectToString("ConfigurarProveedorFijoEvaluacion")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe1b3)))))));
 BA.debugLineNum = 104;BA.debugLine="Dim rSub As ResumableSub=jamTableViewEvaluacionPr";
Debug.ShouldStop(128);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaEvaluacionProveedoresDatosActuales.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 105;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 106;BA.debugLine="Log(mRes)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","89568312",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 107;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 108;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 109;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
 BA.debugLineNum = 110;BA.debugLine="frm.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 111;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 114;BA.debugLine="jamTableViewEvaluacionProveedores.AlturaFilas=0";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 116;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnafecha" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("FechaActualizacionDatosLong")),RemoteObject.createImmutable(("FechaCalificacion")),(RemoteObject.createImmutable("FechaValidacionCalificacion"))})))));
 BA.debugLineNum = 117;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnabooleanatipointegercheckbox" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("Bloqueado")),(RemoteObject.createImmutable("ProveedorFijoEvaluacion"))})))));
 BA.debugLineNum = 118;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnatexto1condicioncolorfondocolortexto" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("CalificacionProvisional"))})))),(Object)(BA.ObjectToString("EVALUABLE")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(BA.numberCast(int.class, ((int)0xff000000))),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 119;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnatexto1condicioncolorfondocolortexto" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Calificacion"))})))),(Object)(BA.ObjectToString("NO APTO")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(BA.numberCast(int.class, ((int)0xff000000))),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 120;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnatexto1condicioncolorfondocolortexto" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ValidacionCalificacion"))})))),(Object)(BA.ObjectToString("NO OK")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(BA.numberCast(int.class, ((int)0xff000000))),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 121;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnanumericaformatostringdecimales" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ImporteNetoFacturacion12Meses"))})))),(Object)(RemoteObject.createImmutable("#,##0")));
 BA.debugLineNum = 123;BA.debugLine="Inicio";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_inicio" /*void*/ );
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _treeviewdrawer_selecteditemchanged(RemoteObject __ref,RemoteObject _selecteditem) throws Exception{
try {
		Debug.PushSubsStack("TreeViewDrawer_SelectedItemChanged (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("treeviewdrawer_selecteditemchanged")) { return __ref.runUserSub(false, "cevaluacionproveedores","treeviewdrawer_selecteditemchanged", __ref, _selecteditem);}
Debug.locals.put("SelectedItem", _selecteditem);
 BA.debugLineNum = 268;BA.debugLine="Private Sub TreeViewDrawer_SelectedItemChanged (Se";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Drawer.LeftOpen=False";
Debug.ShouldStop(4096);
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,cevaluacionproveedores.__c.getField(true,"False"));
 BA.debugLineNum = 271;BA.debugLine="If SelectedItem.IsInitialized=False Then Return";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_selecteditem.runMethod(true,"IsInitialized"),cevaluacionproveedores.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 273;BA.debugLine="Select Case SelectedItem.Text";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(_selecteditem.runMethod(true,"getText"),BA.ObjectToString("Salir"))) {
case 0: {
 BA.debugLineNum = 275;BA.debugLine="SalirModulo";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.cevaluacionproveedores.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 276;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 break; }
}
;
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validarcalificacionproveedor(RemoteObject __ref,RemoteObject _provsel,RemoteObject _filasel) throws Exception{
try {
		Debug.PushSubsStack("ValidarCalificacionProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1483);
if (RapidSub.canDelegate("validarcalificacionproveedor")) { return __ref.runUserSub(false, "cevaluacionproveedores","validarcalificacionproveedor", __ref, _provsel, _filasel);}
ResumableSub_ValidarCalificacionProveedor rsub = new ResumableSub_ValidarCalificacionProveedor(null,__ref,_provsel,_filasel);
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
public static class ResumableSub_ValidarCalificacionProveedor extends BA.ResumableSub {
public ResumableSub_ValidarCalificacionProveedor(b4j.docU.cevaluacionproveedores parent,RemoteObject __ref,RemoteObject _provsel,RemoteObject _filasel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._filasel = _filasel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedores parent;
RemoteObject _provsel;
RemoteObject _filasel;
RemoteObject _calificacionactualprovsel = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
int _i = 0;
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _nuevavalidacioncalificacion = RemoteObject.createImmutable("");
RemoteObject _datetimeactualizacion = RemoteObject.createImmutable(0L);
RemoteObject _usuariovalidacioncalificacion = RemoteObject.createImmutable("");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
int step20;
int limit20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ValidarCalificacionProveedor (cevaluacionproveedores) ","cevaluacionproveedores",4,__ref.getField(false, "ba"),__ref,1483);
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
Debug.locals.put("ProvSel", _provsel);
Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 1485;BA.debugLine="Dim CalificacionActualProvSel As String=jamTableV";
Debug.ShouldStop(4096);
_calificacionactualprovsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Calificacion"))));Debug.locals.put("CalificacionActualProvSel", _calificacionactualprovsel);Debug.locals.put("CalificacionActualProvSel", _calificacionactualprovsel);
 BA.debugLineNum = 1486;BA.debugLine="If CalificacionActualProvSel=\"\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_calificacionactualprovsel,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1487;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",$\"El prove";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "validarcalificacionproveedor"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable(" no tiene calificación."))))));
this.state = 23;
return;
case 23:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 1488;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1491;BA.debugLine="Dialog.Title=\"Selecciona Validación Calificación\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Validación Calificación")));
 BA.debugLineNum = 1492;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(524288);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 1493;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 1494;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 1495;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(4194304);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 1496;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(8388608);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1498;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(33554432);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 1499;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(67108864);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 1500;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(134217728);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 1502;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(536870912);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 1503;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(1073741824);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 1505;BA.debugLine="Dim lstOpciones As List=Array As String(\"OK\",\"NO";
Debug.ShouldStop(1);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstopciones = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("OK"),RemoteObject.createImmutable("NO OK")})));Debug.locals.put("lstOpciones", _lstopciones);Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 1507;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(4);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 1509;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(16);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1511;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(64);
if (true) break;

case 5:
//for
this.state = 8;
step20 = 1;
limit20 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 24;
if (true) break;

case 24:
//C
this.state = 8;
if ((step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20)) this.state = 7;
if (true) break;

case 25:
//C
this.state = 24;
_i = ((int)(0 + _i + step20)) ;
Debug.locals.put("i", _i);
if (true) break;

case 7:
//C
this.state = 25;
 BA.debugLineNum = 1512;BA.debugLine="xclv.ResizeItem(i,80dip)";
Debug.ShouldStop(128);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1516;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(2048);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 1517;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(4096);
if (true) break;

case 9:
//if
this.state = 12;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1519;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(16384);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 1520;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(32768);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 1521;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(65536);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1524;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "validarcalificacionproveedor"), _rsub);
this.state = 26;
return;
case 26:
//C
this.state = 13;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1526;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(2097152);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 1528;BA.debugLine="Dim NuevaValidacionCalificacion As String=B4XList";
Debug.ShouldStop(8388608);
_nuevavalidacioncalificacion = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("NuevaValidacionCalificacion", _nuevavalidacioncalificacion);Debug.locals.put("NuevaValidacionCalificacion", _nuevavalidacioncalificacion);
 BA.debugLineNum = 1531;BA.debugLine="Dim DateTimeActualizacion As Long=DateTime.Now";
Debug.ShouldStop(67108864);
_datetimeactualizacion = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("DateTimeActualizacion", _datetimeactualizacion);Debug.locals.put("DateTimeActualizacion", _datetimeactualizacion);
 BA.debugLineNum = 1532;BA.debugLine="Dim UsuarioValidacionCalificacion As String=Main.";
Debug.ShouldStop(134217728);
_usuariovalidacioncalificacion = parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ );Debug.locals.put("UsuarioValidacionCalificacion", _usuariovalidacioncalificacion);Debug.locals.put("UsuarioValidacionCalificacion", _usuariovalidacioncalificacion);
 BA.debugLineNum = 1534;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eva";
Debug.ShouldStop(536870912);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("EvaluacionProveedoresActualizarValidacionCalificacionProveedor")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetimeactualizacion),(_nuevavalidacioncalificacion),(_usuariovalidacioncalificacion),(_provsel)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1536;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "validarcalificacionproveedor"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 27;
return;
case 27:
//C
this.state = 19;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 1537;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(1);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1538;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1539;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido p";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar la validación de la calificación del proveedor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_provsel))),RemoteObject.createImmutable(".")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1540;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedores", "validarcalificacionproveedor"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 22;
;
 BA.debugLineNum = 1541;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 1544;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetimeactualizacion),(_nuevavalidacioncalificacion),(_usuariovalidacioncalificacion),(_provsel)})))));
 BA.debugLineNum = 1545;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetimeactualizacion),(_nuevavalidacioncalificacion),(_usuariovalidacioncalificacion),(_provsel)})))));
 BA.debugLineNum = 1547;BA.debugLine="jamTableViewEvaluacionProveedores.RefrescarFilaTV";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamtableviewevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescarfilatvmetodosql" /*RemoteObject*/ ,(Object)(_filasel));
 BA.debugLineNum = 1549;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1550;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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