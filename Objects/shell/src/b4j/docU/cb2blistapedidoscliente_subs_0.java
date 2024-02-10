package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cb2blistapedidoscliente_subs_0 {


public static RemoteObject  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("actualizardatos")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","actualizardatos", __ref);}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(null,__ref);
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
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.cb2blistapedidoscliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2blistapedidoscliente parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _rsdata = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,165);
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
 BA.debugLineNum = 166;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"\"";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 167;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(64);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 169;BA.debugLine="Wait For(CargaDatosCredenciales) complete (mRes A";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), __ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_cargadatoscredenciales" /*RemoteObject*/ ));
this.state = 44;
return;
case 44:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 170;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(512);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 171;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 172;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error cre";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error credenciales."))));
this.state = 45;
return;
case 45:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 173;BA.debugLine="Return False";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 175;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(16384);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 176;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
Debug.ShouldStop(32768);
_mdata0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData0", _mdata0);Debug.locals.put("mData0", _mdata0);
 BA.debugLineNum = 177;BA.debugLine="tk=mData0.GetValueAt(0)";
Debug.ShouldStop(65536);
__ref.setField ("_tk" /*RemoteObject*/ ,BA.ObjectToString(_mdata0.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 179;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando Sto";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Stores...")));
 BA.debugLineNum = 181;BA.debugLine="Wait For(CargaListaStoresMagento) complete (Succe";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), __ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_cargalistastoresmagento" /*RemoteObject*/ ));
this.state = 46;
return;
case 46:
//C
this.state = 5;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 182;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 183;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 184;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 187;BA.debugLine="wait for(CargaValoresAtributoSizeProductos) compl";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), __ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_cargavaloresatributosizeproductos" /*RemoteObject*/ ));
this.state = 47;
return;
case 47:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 188;BA.debugLine="If Not(Success) Then Return False";
Debug.ShouldStop(134217728);
if (true) break;

case 9:
//if
this.state = 14;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 190;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando Cli";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Clientes...")));
 BA.debugLineNum = 191;BA.debugLine="Wait For(CargaListaClientesMagento) complete (Suc";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), __ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_cargalistaclientesmagento" /*RemoteObject*/ ));
this.state = 48;
return;
case 48:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 192;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 15:
//if
this.state = 18;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 193;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 194;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Clientes B2B"))));
this.state = 49;
return;
case 49:
//C
this.state = 18;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 195;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 198;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando Ped";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Pedidos...")));
 BA.debugLineNum = 199;BA.debugLine="Wait For(CargaPedidos) complete (Success As Boole";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), __ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_cargapedidos" /*RemoteObject*/ ));
this.state = 50;
return;
case 50:
//C
this.state = 19;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 200;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(128);
if (true) break;

case 19:
//if
this.state = 22;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 201;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 202;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Pedidos (Orders) B2B"))));
this.state = 51;
return;
case 51:
//C
this.state = 22;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 203;BA.debugLine="Return False";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 206;BA.debugLine="mSQL.ExecNonQuery(\"update tblB2BOrdersTotales set";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("update tblB2BOrdersTotales set TotalQtyPendienteEnvio=TotalQtyPedida-TotalQtyEnviada")));
 BA.debugLineNum = 207;BA.debugLine="mSQL.ExecNonQuery(\"update tblB2BOrdersTotales set";
Debug.ShouldStop(16384);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("update tblB2BOrdersTotales set TotalQtyPendienteFacturar=TotalQtyPedida-TotalQtyFacturada")));
 BA.debugLineNum = 209;BA.debugLine="Dim rsData As ResultSet=mSQL.ExecQuery(\"select *";
Debug.ShouldStop(65536);
_rsdata = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdata = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblB2BOrdersTotales")));Debug.locals.put("rsData", _rsdata);Debug.locals.put("rsData", _rsdata);
 BA.debugLineNum = 211;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(262144);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rsdata.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 212;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), _rsub);
this.state = 52;
return;
case 52:
//C
this.state = 23;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 213;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 23:
//if
this.state = 43;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 214;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(2097152);
if (true) break;

case 26:
//if
this.state = 33;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 215;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 216;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 217;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), _msa);
this.state = 53;
return;
case 53:
//C
this.state = 29;
;
 BA.debugLineNum = 219;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 220;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), _msa);
this.state = 54;
return;
case 54:
//C
this.state = 29;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 221;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(268435456);
if (true) break;

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 222;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 223;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 226;BA.debugLine="ExitApplication";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 228;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(8);

case 33:
//if
this.state = 42;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 229;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(16);
if (true) break;

case 36:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 38;
;}if (true) break;

case 38:
//C
this.state = 41;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
if (true) break;

case 41:
//C
this.state = 42;
;
 BA.debugLineNum = 230;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 231;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 232;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "actualizardatos"), _msa);
this.state = 55;
return;
case 55:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = -1;
;
 BA.debugLineNum = 236;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 239;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _alternarexcluidoreclamacion(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("AlternarExcluidoReclamacion (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,442);
if (RapidSub.canDelegate("alternarexcluidoreclamacion")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","alternarexcluidoreclamacion", __ref, _datosceldaseleccionada);}
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 442;BA.debugLine="Sub AlternarExcluidoReclamacion(DatosCeldaSeleccio";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asjo(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("asJO (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 151;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Return o";
Debug.ShouldStop(8388608);
if (true) return _o;
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","btnsalir_click", __ref);}
 BA.debugLineNum = 160;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="SalirModulo";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargadatoscredenciales(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosCredenciales (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("cargadatoscredenciales")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","cargadatoscredenciales", __ref);}
ResumableSub_CargaDatosCredenciales rsub = new ResumableSub_CargaDatosCredenciales(null,__ref);
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
public static class ResumableSub_CargaDatosCredenciales extends BA.ResumableSub {
public ResumableSub_CargaDatosCredenciales(b4j.docU.cb2blistapedidoscliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2blistapedidoscliente parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comandojrdc = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosCredenciales (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,464);
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
 BA.debugLineNum = 466;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(131072);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 467;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(262144);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 468;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 469;BA.debugLine="Dim ComandoJRDC As String";
Debug.ShouldStop(1048576);
_comandojrdc = RemoteObject.createImmutable("");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 470;BA.debugLine="ComandoJRDC=\"TokenB2BPruebas\"";
Debug.ShouldStop(2097152);
_comandojrdc = BA.ObjectToString("TokenB2BPruebas");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 471;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(4194304);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comandojrdc),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 472;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "cargadatoscredenciales"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 473;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 474;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 476;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 477;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 479;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
Debug.ShouldStop(1073741824);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 480;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 481;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 484;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 485;BA.debugLine="Return mRes";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 486;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _cargalistaclientesmagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaListaClientesMagento (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,1192);
if (RapidSub.canDelegate("cargalistaclientesmagento")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","cargalistaclientesmagento", __ref);}
ResumableSub_CargaListaClientesMagento rsub = new ResumableSub_CargaListaClientesMagento(null,__ref);
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
public static class ResumableSub_CargaListaClientesMagento extends BA.ResumableSub {
public ResumableSub_CargaListaClientesMagento(b4j.docU.cb2blistapedidoscliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2blistapedidoscliente parent;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total_count = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _sk = RemoteObject.createImmutable("");
RemoteObject _store_id = RemoteObject.createImmutable(0);
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _addresses = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coladdresses = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _region_id = RemoteObject.createImmutable(0);
RemoteObject _postcode = RemoteObject.createImmutable("");
RemoteObject _telephone = RemoteObject.createImmutable("");
RemoteObject _default_shipping = RemoteObject.createImmutable("");
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _street = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colstreet = RemoteObject.createImmutable("");
RemoteObject _customer_id = RemoteObject.createImmutable(0);
RemoteObject _region = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _regiona = RemoteObject.createImmutable("");
RemoteObject _region_code = RemoteObject.createImmutable("");
RemoteObject _default_billing = RemoteObject.createImmutable("");
RemoteObject _country_id = RemoteObject.createImmutable("");
RemoteObject _gender = RemoteObject.createImmutable(0);
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _is_subscribed = RemoteObject.createImmutable("");
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _disable_auto_group_change = RemoteObject.createImmutable(0);
RemoteObject _group_id = RemoteObject.createImmutable(0);
RemoteObject _dob = RemoteObject.createImmutable("");
RemoteObject _website_id = RemoteObject.createImmutable(0);
RemoteObject _email = RemoteObject.createImmutable("");
RemoteObject _created_in = RemoteObject.createImmutable("");
RemoteObject _custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _is_blocked = RemoteObject.createImmutable(0);
RemoteObject _is_commercial = RemoteObject.createImmutable(0);
RemoteObject _company = RemoteObject.createImmutable("");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _customer_group_code = RemoteObject.createImmutable("");
RemoteObject _customer_group_name = RemoteObject.createImmutable("");
RemoteObject _language = RemoteObject.createImmutable("");
RemoteObject _mattribute = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colfilter_groups = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filters = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colfilters = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _field = RemoteObject.createImmutable("");
RemoteObject _condition_type = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject group9;
int index9;
int groupLen9;
RemoteObject group15;
int index15;
int groupLen15;
RemoteObject group21;
int index21;
int groupLen21;
RemoteObject group31;
int index31;
int groupLen31;
RemoteObject group68;
int index68;
int groupLen68;
RemoteObject group91;
int index91;
int groupLen91;
RemoteObject group93;
int index93;
int groupLen93;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaListaClientesMagento (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,1192);
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
 BA.debugLineNum = 1193;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BClientes\")";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BClientes")));
 BA.debugLineNum = 1194;BA.debugLine="wait for(EnvioDatosAPIMagentoBusquedaClientes(tk)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "cargalistaclientesmagento"), __ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_enviodatosapimagentobusquedaclientes" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 90;
return;
case 90:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1195;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1196;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1197;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 1198;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8192);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1199;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
Debug.ShouldStop(16384);
_total_count = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_count")))));Debug.locals.put("total_count", _total_count);Debug.locals.put("total_count", _total_count);
 BA.debugLineNum = 1200;BA.debugLine="Dim items As List = root.Get(\"items\")";
Debug.ShouldStop(32768);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 1201;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//for
this.state = 81;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group9 = _items;
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 91;
if (true) break;

case 91:
//C
this.state = 81;
if (index9 < groupLen9) {
this.state = 9;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group9.runMethod(false,"Get",index9));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 92:
//C
this.state = 91;
index9++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1202;BA.debugLine="Log(\"ColItems: \" & colitems)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","851838986",RemoteObject.concat(RemoteObject.createImmutable("ColItems: "),_colitems),0);
 BA.debugLineNum = 1204;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
Debug.ShouldStop(524288);
_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1205;BA.debugLine="If id=66 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_id,BA.numberCast(double.class, 66))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1206;BA.debugLine="Log(\"Mary J\")";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","851838990",RemoteObject.createImmutable("Mary J"),0);
 if (true) break;
;
 BA.debugLineNum = 1209;BA.debugLine="For Each sK As String In colitems.Keys";
Debug.ShouldStop(16777216);

case 13:
//for
this.state = 16;
group15 = _colitems.runMethod(false,"Keys");
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("sK", _sk);
this.state = 93;
if (true) break;

case 93:
//C
this.state = 16;
if (index15 < groupLen15) {
this.state = 15;
_sk = BA.ObjectToString(group15.runMethod(false,"Get",index15));Debug.locals.put("sK", _sk);}
if (true) break;

case 94:
//C
this.state = 93;
index15++;
Debug.locals.put("sK", _sk);
if (true) break;

case 15:
//C
this.state = 94;
 BA.debugLineNum = 1210;BA.debugLine="Log(sK & \": \" & colitems.Get(sK))";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","851838994",RemoteObject.concat(_sk,RemoteObject.createImmutable(": "),_colitems.runMethod(false,"Get",(Object)((_sk)))),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
Debug.locals.put("sK", _sk);
;
 BA.debugLineNum = 1212;BA.debugLine="Dim store_id As Int = colitems.Get(\"store_id\")";
Debug.ShouldStop(134217728);
_store_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_id")))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 1213;BA.debugLine="Dim firstname As String = colitems.Get(\"firstnam";
Debug.ShouldStop(268435456);
_firstname = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 1214;BA.debugLine="Dim addresses As List = colitems.Get(\"addresses\"";
Debug.ShouldStop(536870912);
_addresses = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_addresses = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("addresses")))));Debug.locals.put("addresses", _addresses);Debug.locals.put("addresses", _addresses);
 BA.debugLineNum = 1215;BA.debugLine="For Each coladdresses As Map In addresses";
Debug.ShouldStop(1073741824);
if (true) break;

case 17:
//for
this.state = 24;
_coladdresses = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = _addresses;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("coladdresses", _coladdresses);
this.state = 95;
if (true) break;

case 95:
//C
this.state = 24;
if (index21 < groupLen21) {
this.state = 19;
_coladdresses = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group21.runMethod(false,"Get",index21));Debug.locals.put("coladdresses", _coladdresses);}
if (true) break;

case 96:
//C
this.state = 95;
index21++;
Debug.locals.put("coladdresses", _coladdresses);
if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1217;BA.debugLine="Log(\"coladdresses: \" & coladdresses)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","851839001",RemoteObject.concat(RemoteObject.createImmutable("coladdresses: "),_coladdresses),0);
 BA.debugLineNum = 1218;BA.debugLine="Dim firstname As String = coladdresses.Get(\"fir";
Debug.ShouldStop(2);
_firstname = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 1219;BA.debugLine="Dim city As String = coladdresses.Get(\"city\")";
Debug.ShouldStop(4);
_city = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 1220;BA.debugLine="Dim region_id As Int = coladdresses.Get(\"region";
Debug.ShouldStop(8);
_region_id = BA.numberCast(int.class, _coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_id")))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 1221;BA.debugLine="Dim postcode As String = coladdresses.Get(\"post";
Debug.ShouldStop(16);
_postcode = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 1222;BA.debugLine="Dim telephone As String = coladdresses.Get(\"tel";
Debug.ShouldStop(32);
_telephone = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 1223;BA.debugLine="Dim default_shipping As String = coladdresses.G";
Debug.ShouldStop(64);
_default_shipping = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("default_shipping")))));Debug.locals.put("default_shipping", _default_shipping);Debug.locals.put("default_shipping", _default_shipping);
 BA.debugLineNum = 1224;BA.debugLine="Dim lastname As String = coladdresses.Get(\"last";
Debug.ShouldStop(128);
_lastname = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 1225;BA.debugLine="Dim street As List = coladdresses.Get(\"street\")";
Debug.ShouldStop(256);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 1226;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(512);
if (true) break;

case 20:
//for
this.state = 23;
group31 = _street;
index31 = 0;
groupLen31 = group31.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 97;
if (true) break;

case 97:
//C
this.state = 23;
if (index31 < groupLen31) {
this.state = 22;
_colstreet = BA.ObjectToString(group31.runMethod(false,"Get",index31));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 98:
//C
this.state = 97;
index31++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 22:
//C
this.state = 98;
 if (true) break;
if (true) break;

case 23:
//C
this.state = 96;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 1228;BA.debugLine="Dim id As Int = coladdresses.Get(\"id\")";
Debug.ShouldStop(2048);
_id = BA.numberCast(int.class, _coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1229;BA.debugLine="Dim customer_id As Int = coladdresses.Get(\"cust";
Debug.ShouldStop(4096);
_customer_id = BA.numberCast(int.class, _coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_id")))));Debug.locals.put("customer_id", _customer_id);Debug.locals.put("customer_id", _customer_id);
 BA.debugLineNum = 1230;BA.debugLine="Dim region As Map = coladdresses.Get(\"region\")";
Debug.ShouldStop(8192);
_region = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_region = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 1231;BA.debugLine="Dim region_id As Int = region.Get(\"region_id\")";
Debug.ShouldStop(16384);
_region_id = BA.numberCast(int.class, _region.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_id")))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 1232;BA.debugLine="Dim regionA As String = region.Get(\"region\")";
Debug.ShouldStop(32768);
_regiona = BA.ObjectToString(_region.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("regionA", _regiona);Debug.locals.put("regionA", _regiona);
 BA.debugLineNum = 1233;BA.debugLine="Dim region_code As String = region.Get(\"region_";
Debug.ShouldStop(65536);
_region_code = BA.ObjectToString(_region.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 1234;BA.debugLine="Dim default_billing As String = coladdresses.Ge";
Debug.ShouldStop(131072);
_default_billing = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("default_billing")))));Debug.locals.put("default_billing", _default_billing);Debug.locals.put("default_billing", _default_billing);
 BA.debugLineNum = 1235;BA.debugLine="Dim country_id As String = coladdresses.Get(\"co";
Debug.ShouldStop(262144);
_country_id = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
Debug.locals.put("coladdresses", _coladdresses);
;
 BA.debugLineNum = 1237;BA.debugLine="Dim gender As Int = colitems.Getdefault(\"gender\"";
Debug.ShouldStop(1048576);
_gender = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gender"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("gender", _gender);Debug.locals.put("gender", _gender);
 BA.debugLineNum = 1238;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
Debug.ShouldStop(2097152);
_created_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 1239;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
Debug.ShouldStop(4194304);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 1240;BA.debugLine="Dim is_subscribed As String = extension_attribut";
Debug.ShouldStop(8388608);
_is_subscribed = BA.ObjectToString(_extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_subscribed")))));Debug.locals.put("is_subscribed", _is_subscribed);Debug.locals.put("is_subscribed", _is_subscribed);
 BA.debugLineNum = 1241;BA.debugLine="Dim default_shipping As String = colitems.Get(\"d";
Debug.ShouldStop(16777216);
_default_shipping = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("default_shipping")))));Debug.locals.put("default_shipping", _default_shipping);Debug.locals.put("default_shipping", _default_shipping);
 BA.debugLineNum = 1242;BA.debugLine="Dim lastname As String = colitems.Get(\"lastname\"";
Debug.ShouldStop(33554432);
_lastname = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 1243;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
Debug.ShouldStop(67108864);
_updated_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 1244;BA.debugLine="Dim disable_auto_group_change As Int = colitems.";
Debug.ShouldStop(134217728);
_disable_auto_group_change = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("disable_auto_group_change")))));Debug.locals.put("disable_auto_group_change", _disable_auto_group_change);Debug.locals.put("disable_auto_group_change", _disable_auto_group_change);
 BA.debugLineNum = 1245;BA.debugLine="Dim group_id As Int = colitems.Get(\"group_id\")";
Debug.ShouldStop(268435456);
_group_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("group_id")))));Debug.locals.put("group_id", _group_id);Debug.locals.put("group_id", _group_id);
 BA.debugLineNum = 1246;BA.debugLine="Dim dob As String = colitems.Get(\"dob\")";
Debug.ShouldStop(536870912);
_dob = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dob")))));Debug.locals.put("dob", _dob);Debug.locals.put("dob", _dob);
 BA.debugLineNum = 1247;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
Debug.ShouldStop(1073741824);
_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1248;BA.debugLine="Dim default_billing As String = colitems.Get(\"de";
Debug.ShouldStop(-2147483648);
_default_billing = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("default_billing")))));Debug.locals.put("default_billing", _default_billing);Debug.locals.put("default_billing", _default_billing);
 BA.debugLineNum = 1249;BA.debugLine="Dim website_id As Int = colitems.Get(\"website_id";
Debug.ShouldStop(1);
_website_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("website_id")))));Debug.locals.put("website_id", _website_id);Debug.locals.put("website_id", _website_id);
 BA.debugLineNum = 1250;BA.debugLine="Dim email As String = colitems.Get(\"email\")";
Debug.ShouldStop(2);
_email = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 1251;BA.debugLine="Dim created_in As String = colitems.Get(\"created";
Debug.ShouldStop(4);
_created_in = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_in")))));Debug.locals.put("created_in", _created_in);Debug.locals.put("created_in", _created_in);
 BA.debugLineNum = 1252;BA.debugLine="Dim custom_attributes As List=colitems.Get(\"cust";
Debug.ShouldStop(8);
_custom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("custom_attributes")))));Debug.locals.put("custom_attributes", _custom_attributes);Debug.locals.put("custom_attributes", _custom_attributes);
 BA.debugLineNum = 1253;BA.debugLine="Dim is_blocked As Int=0";
Debug.ShouldStop(16);
_is_blocked = BA.numberCast(int.class, 0);Debug.locals.put("is_blocked", _is_blocked);Debug.locals.put("is_blocked", _is_blocked);
 BA.debugLineNum = 1254;BA.debugLine="Dim is_commercial As Int=0";
Debug.ShouldStop(32);
_is_commercial = BA.numberCast(int.class, 0);Debug.locals.put("is_commercial", _is_commercial);Debug.locals.put("is_commercial", _is_commercial);
 BA.debugLineNum = 1255;BA.debugLine="Dim company As String=\"\"";
Debug.ShouldStop(64);
_company = BA.ObjectToString("");Debug.locals.put("company", _company);Debug.locals.put("company", _company);
 BA.debugLineNum = 1256;BA.debugLine="Dim code As String=\"\"";
Debug.ShouldStop(128);
_code = BA.ObjectToString("");Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 1257;BA.debugLine="Dim customer_group_code As String=\"\"";
Debug.ShouldStop(256);
_customer_group_code = BA.ObjectToString("");Debug.locals.put("customer_group_code", _customer_group_code);Debug.locals.put("customer_group_code", _customer_group_code);
 BA.debugLineNum = 1258;BA.debugLine="Dim customer_group_name As String=\"\"";
Debug.ShouldStop(512);
_customer_group_name = BA.ObjectToString("");Debug.locals.put("customer_group_name", _customer_group_name);Debug.locals.put("customer_group_name", _customer_group_name);
 BA.debugLineNum = 1259;BA.debugLine="Dim language As String=\"\"";
Debug.ShouldStop(1024);
_language = BA.ObjectToString("");Debug.locals.put("language", _language);Debug.locals.put("language", _language);
 BA.debugLineNum = 1260;BA.debugLine="Dim country_id As String=\"\"";
Debug.ShouldStop(2048);
_country_id = BA.ObjectToString("");Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 1261;BA.debugLine="If custom_attributes.IsInitialized Then";
Debug.ShouldStop(4096);
if (true) break;

case 25:
//if
this.state = 80;
if (_custom_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 1262;BA.debugLine="Log(custom_attributes)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","851839046",BA.ObjectToString(_custom_attributes),0);
 BA.debugLineNum = 1263;BA.debugLine="For Each mAttribute As Map In custom_attributes";
Debug.ShouldStop(16384);
if (true) break;

case 28:
//for
this.state = 79;
_mattribute = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group68 = _custom_attributes;
index68 = 0;
groupLen68 = group68.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mAttribute", _mattribute);
this.state = 99;
if (true) break;

case 99:
//C
this.state = 79;
if (index68 < groupLen68) {
this.state = 30;
_mattribute = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group68.runMethod(false,"Get",index68));Debug.locals.put("mAttribute", _mattribute);}
if (true) break;

case 100:
//C
this.state = 99;
index68++;
Debug.locals.put("mAttribute", _mattribute);
if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1264;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"is_blocke";
Debug.ShouldStop(32768);
if (true) break;

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("is_blocked")))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_is_blocked = BA.numberCast(int.class, _mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("is_blocked", _is_blocked);
if (true) break;

case 36:
//C
this.state = 37;
;
 BA.debugLineNum = 1265;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"is_commer";
Debug.ShouldStop(65536);
if (true) break;

case 37:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("is_commercial")))) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
_is_commercial = BA.numberCast(int.class, _mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("is_commercial", _is_commercial);
if (true) break;

case 42:
//C
this.state = 43;
;
 BA.debugLineNum = 1266;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"company\"";
Debug.ShouldStop(131072);
if (true) break;

case 43:
//if
this.state = 48;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("company")))) { 
this.state = 45;
;}if (true) break;

case 45:
//C
this.state = 48;
_company = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("company", _company);
if (true) break;

case 48:
//C
this.state = 49;
;
 BA.debugLineNum = 1267;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"code\" The";
Debug.ShouldStop(262144);
if (true) break;

case 49:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("code")))) { 
this.state = 51;
;}if (true) break;

case 51:
//C
this.state = 54;
_code = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("code", _code);
if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 1268;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"customer_";
Debug.ShouldStop(524288);
if (true) break;

case 55:
//if
this.state = 60;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("customer_group_code")))) { 
this.state = 57;
;}if (true) break;

case 57:
//C
this.state = 60;
_customer_group_code = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("customer_group_code", _customer_group_code);
if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 1269;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"customer_";
Debug.ShouldStop(1048576);
if (true) break;

case 61:
//if
this.state = 66;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("customer_group_name")))) { 
this.state = 63;
;}if (true) break;

case 63:
//C
this.state = 66;
_customer_group_name = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("customer_group_name", _customer_group_name);
if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 1270;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"language\"";
Debug.ShouldStop(2097152);
if (true) break;

case 67:
//if
this.state = 72;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("language")))) { 
this.state = 69;
;}if (true) break;

case 69:
//C
this.state = 72;
_language = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("language", _language);
if (true) break;

case 72:
//C
this.state = 73;
;
 BA.debugLineNum = 1271;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"country_i";
Debug.ShouldStop(4194304);
if (true) break;

case 73:
//if
this.state = 78;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("country_id")))) { 
this.state = 75;
;}if (true) break;

case 75:
//C
this.state = 78;
_country_id = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("country_id", _country_id);
if (true) break;

case 78:
//C
this.state = 100;
;
 if (true) break;
if (true) break;

case 79:
//C
this.state = 80;
Debug.locals.put("mAttribute", _mattribute);
;
 BA.debugLineNum = 1274;BA.debugLine="colitems.put(\"is_blocked\",is_blocked)";
Debug.ShouldStop(33554432);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_blocked"))),(Object)((_is_blocked)));
 BA.debugLineNum = 1275;BA.debugLine="colitems.put(\"is_commercial\",is_commercial)";
Debug.ShouldStop(67108864);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_commercial"))),(Object)((_is_commercial)));
 BA.debugLineNum = 1276;BA.debugLine="colitems.put(\"company\",company)";
Debug.ShouldStop(134217728);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("company"))),(Object)((_company)));
 BA.debugLineNum = 1277;BA.debugLine="colitems.put(\"code\",code)";
Debug.ShouldStop(268435456);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("code"))),(Object)((_code)));
 BA.debugLineNum = 1278;BA.debugLine="colitems.put(\"customer_group_code\",customer_gro";
Debug.ShouldStop(536870912);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("customer_group_code"))),(Object)((_customer_group_code)));
 BA.debugLineNum = 1279;BA.debugLine="colitems.put(\"customer_group_name\",customer_gro";
Debug.ShouldStop(1073741824);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("customer_group_name"))),(Object)((_customer_group_name)));
 BA.debugLineNum = 1280;BA.debugLine="colitems.put(\"language\",language)";
Debug.ShouldStop(-2147483648);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("language"))),(Object)((_language)));
 BA.debugLineNum = 1281;BA.debugLine="colitems.put(\"country_id\",country_id)";
Debug.ShouldStop(1);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("country_id"))),(Object)((_country_id)));
 if (true) break;

case 80:
//C
this.state = 92;
;
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 1287;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
Debug.ShouldStop(64);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblB2BClientes")),(Object)(_items));
 BA.debugLineNum = 1288;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
Debug.ShouldStop(128);
_search_criteria = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("search_criteria")))));Debug.locals.put("search_criteria", _search_criteria);Debug.locals.put("search_criteria", _search_criteria);
 BA.debugLineNum = 1289;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
Debug.ShouldStop(256);
_filter_groups = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _search_criteria.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filter_groups")))));Debug.locals.put("filter_groups", _filter_groups);Debug.locals.put("filter_groups", _filter_groups);
 BA.debugLineNum = 1290;BA.debugLine="For Each colfilter_groups As Map In filter_groups";
Debug.ShouldStop(512);
if (true) break;

case 82:
//for
this.state = 89;
_colfilter_groups = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group91 = _filter_groups;
index91 = 0;
groupLen91 = group91.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colfilter_groups", _colfilter_groups);
this.state = 101;
if (true) break;

case 101:
//C
this.state = 89;
if (index91 < groupLen91) {
this.state = 84;
_colfilter_groups = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group91.runMethod(false,"Get",index91));Debug.locals.put("colfilter_groups", _colfilter_groups);}
if (true) break;

case 102:
//C
this.state = 101;
index91++;
Debug.locals.put("colfilter_groups", _colfilter_groups);
if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 1291;BA.debugLine="Dim filters As List = colfilter_groups.Get(\"filt";
Debug.ShouldStop(1024);
_filters = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filters = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colfilter_groups.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filters")))));Debug.locals.put("filters", _filters);Debug.locals.put("filters", _filters);
 BA.debugLineNum = 1292;BA.debugLine="For Each colfilters As Map In filters";
Debug.ShouldStop(2048);
if (true) break;

case 85:
//for
this.state = 88;
_colfilters = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group93 = _filters;
index93 = 0;
groupLen93 = group93.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colfilters", _colfilters);
this.state = 103;
if (true) break;

case 103:
//C
this.state = 88;
if (index93 < groupLen93) {
this.state = 87;
_colfilters = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group93.runMethod(false,"Get",index93));Debug.locals.put("colfilters", _colfilters);}
if (true) break;

case 104:
//C
this.state = 103;
index93++;
Debug.locals.put("colfilters", _colfilters);
if (true) break;

case 87:
//C
this.state = 104;
 BA.debugLineNum = 1293;BA.debugLine="Dim field As String = colfilters.Get(\"field\")";
Debug.ShouldStop(4096);
_field = BA.ObjectToString(_colfilters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("field")))));Debug.locals.put("field", _field);Debug.locals.put("field", _field);
 BA.debugLineNum = 1294;BA.debugLine="Dim condition_type As String = colfilters.Get(\"";
Debug.ShouldStop(8192);
_condition_type = BA.ObjectToString(_colfilters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("condition_type")))));Debug.locals.put("condition_type", _condition_type);Debug.locals.put("condition_type", _condition_type);
 BA.debugLineNum = 1295;BA.debugLine="Dim value As String = colfilters.Get(\"value\")";
Debug.ShouldStop(16384);
_value = BA.ObjectToString(_colfilters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 if (true) break;
if (true) break;

case 88:
//C
this.state = 102;
Debug.locals.put("colfilters", _colfilters);
;
 if (true) break;
if (true) break;

case 89:
//C
this.state = -1;
Debug.locals.put("colfilter_groups", _colfilter_groups);
;
 BA.debugLineNum = 1298;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1299;BA.debugLine="End Sub";
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
public static RemoteObject  _cargalistastoresmagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaListaStoresMagento (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,1130);
if (RapidSub.canDelegate("cargalistastoresmagento")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","cargalistastoresmagento", __ref);}
ResumableSub_CargaListaStoresMagento rsub = new ResumableSub_CargaListaStoresMagento(null,__ref);
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
public static class ResumableSub_CargaListaStoresMagento extends BA.ResumableSub {
public ResumableSub_CargaListaStoresMagento(b4j.docU.cb2blistapedidoscliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2blistapedidoscliente parent;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _default_store_id = RemoteObject.createImmutable(0);
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _root_category_id = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _website_id = RemoteObject.createImmutable(0);
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaListaStoresMagento (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,1130);
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
 BA.debugLineNum = 1131;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BStores\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BStores")));
 BA.debugLineNum = 1132;BA.debugLine="wait for(EnvioDatosAPIMagentoListaStores(tk)) com";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "cargalistastoresmagento"), __ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_enviodatosapimagentolistastores" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1133;BA.debugLine="If sResp.StartsWith(\"ERROR\") Or sResp.Contains(\"U";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(".",_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR")))) || RemoteObject.solveBoolean(".",_sresp.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Uncaught ReflectionException"))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1134;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",$\"Error ca";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "cargalistastoresmagento"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error cargando Stores B2B \n"),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sresp))),RemoteObject.createImmutable(""))))));
this.state = 10;
return;
case 10:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 1136;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1138;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(131072);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1139;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(262144);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 1140;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(524288);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1141;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(1048576);
if (true) break;

case 5:
//for
this.state = 8;
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group10 = _root;
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colroot", _colroot);
this.state = 11;
if (true) break;

case 11:
//C
this.state = 8;
if (index10 < groupLen10) {
this.state = 7;
_colroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group10.runMethod(false,"Get",index10));Debug.locals.put("colroot", _colroot);}
if (true) break;

case 12:
//C
this.state = 11;
index10++;
Debug.locals.put("colroot", _colroot);
if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 1142;BA.debugLine="Dim code As String = colroot.Get(\"code\")";
Debug.ShouldStop(2097152);
_code = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 1143;BA.debugLine="Dim default_store_id As Int = colroot.Getdefault";
Debug.ShouldStop(4194304);
_default_store_id = BA.numberCast(int.class, _colroot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("default_store_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("default_store_id", _default_store_id);Debug.locals.put("default_store_id", _default_store_id);
 BA.debugLineNum = 1144;BA.debugLine="Dim name As String = colroot.Get(\"name\")";
Debug.ShouldStop(8388608);
_name = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1145;BA.debugLine="Dim root_category_id As Int = colroot.Getdefault";
Debug.ShouldStop(16777216);
_root_category_id = BA.numberCast(int.class, _colroot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("root_category_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("root_category_id", _root_category_id);Debug.locals.put("root_category_id", _root_category_id);
 BA.debugLineNum = 1146;BA.debugLine="Dim id As Int = colroot.Get(\"id\")";
Debug.ShouldStop(33554432);
_id = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1147;BA.debugLine="Dim website_id As Int = colroot.Get(\"website_id\"";
Debug.ShouldStop(67108864);
_website_id = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("website_id")))));Debug.locals.put("website_id", _website_id);Debug.locals.put("website_id", _website_id);
 BA.debugLineNum = 1149;BA.debugLine="Log(\"code: \" & code & \" Name: \" & name & \" ID: \"";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","851707923",RemoteObject.concat(RemoteObject.createImmutable("code: "),_code,RemoteObject.createImmutable(" Name: "),_name,RemoteObject.createImmutable(" ID: "),_id),0);
 BA.debugLineNum = 1150;BA.debugLine="Log(\" \")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","851707924",RemoteObject.createImmutable(" "),0);
 BA.debugLineNum = 1151;BA.debugLine="mSQL.ExecNonQuery2($\"insert into tblB2BStores (c";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.createImmutable("insert into tblB2BStores (code, default_store_id, name, root_category_id, id, website_id) values (?,?,?,?,?,?)"))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_code),(_default_store_id),(_name),(_root_category_id),(_id),(_website_id)})))));
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 1156;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1157;BA.debugLine="End Sub";
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
public static RemoteObject  _cargapedidos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaPedidos (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,543);
if (RapidSub.canDelegate("cargapedidos")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","cargapedidos", __ref);}
ResumableSub_CargaPedidos rsub = new ResumableSub_CargaPedidos(null,__ref);
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
public static class ResumableSub_CargaPedidos extends BA.ResumableSub {
public ResumableSub_CargaPedidos(b4j.docU.cb2blistapedidoscliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2blistapedidoscliente parent;
RemoteObject _locale = RemoteObject.declareNull("de.amberhome.locale.AHLocale");
RemoteObject _ahnum = RemoteObject.declareNull("de.amberhome.locale.AHNumeric");
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total_count = RemoteObject.createImmutable(0);
RemoteObject _lstpedidos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdatapedido = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idpedido = RemoteObject.createImmutable(0);
RemoteObject _idtienda = RemoteObject.createImmutable(0);
RemoteObject _nombretienda = RemoteObject.createImmutable("");
RemoteObject _pedido = RemoteObject.createImmutable("");
RemoteObject _fechacreacion = RemoteObject.createImmutable("");
RemoteObject _fechaactualizacion = RemoteObject.createImmutable("");
RemoteObject _fechacreacionlong = RemoteObject.createImmutable(0L);
RemoteObject _fechaactualizacionlong = RemoteObject.createImmutable(0L);
RemoteObject _ordencompra = RemoteObject.createImmutable("");
RemoteObject _emailcomprador = RemoteObject.createImmutable("");
RemoteObject _nombreusuariocomprador = RemoteObject.createImmutable("");
RemoteObject _apellidousuariocomprador = RemoteObject.createImmutable("");
RemoteObject _idcliente = RemoteObject.createImmutable(0);
RemoteObject _idgrpcliente = RemoteObject.createImmutable(0);
RemoteObject _clienteerp = RemoteObject.createImmutable("");
RemoteObject _nombreclienteerp = RemoteObject.createImmutable("");
RemoteObject _grpclienteerp = RemoteObject.createImmutable("");
RemoteObject _nombregrpclienteerp = RemoteObject.createImmutable("");
RemoteObject _iddireccionenvioclienteerp = RemoteObject.createImmutable(0);
RemoteObject _nombredireccionenvioclienteerp = RemoteObject.createImmutable("");
RemoteObject _iddireccionfacturacion = RemoteObject.createImmutable(0);
RemoteObject _nombredireccionfacturacion = RemoteObject.createImmutable("");
RemoteObject _totalqtypedida = RemoteObject.createImmutable(0);
RemoteObject _totalqtyenviada = RemoteObject.createImmutable(0);
RemoteObject _totalqtyfacturada = RemoteObject.createImmutable(0);
RemoteObject _statuspedido = RemoteObject.createImmutable("");
RemoteObject _extension_attributespedido = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _po_number = RemoteObject.createImmutable("");
RemoteObject _tipoivapedido = RemoteObject.createImmutable(0);
RemoteObject _importeivapedido = RemoteObject.createImmutable(0);
RemoteObject _pgw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sextradatapgw = RemoteObject.createImmutable("");
RemoteObject _parserextradatapgw = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _mextradatapgw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstextradatapgwtaxdetails = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdatataxespedido = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _customer_firstname = RemoteObject.createImmutable("");
RemoteObject _billing_address = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _address_type = RemoteObject.createImmutable("");
RemoteObject _customer_address_id = RemoteObject.createImmutable(0);
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _postcode = RemoteObject.createImmutable("");
RemoteObject _region_id = RemoteObject.createImmutable(0);
RemoteObject _telephone = RemoteObject.createImmutable("");
RemoteObject _entity_id = RemoteObject.createImmutable(0);
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _parent_id = RemoteObject.createImmutable(0);
RemoteObject _street = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colstreet = RemoteObject.createImmutable("");
RemoteObject _region = RemoteObject.createImmutable("");
RemoteObject _country_id = RemoteObject.createImmutable("");
RemoteObject _email = RemoteObject.createImmutable("");
RemoteObject _region_code = RemoteObject.createImmutable("");
RemoteObject _billingextensionattributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total_paid = RemoteObject.createImmutable(0);
RemoteObject _increment_id = RemoteObject.createImmutable("");
RemoteObject _payment = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _base_amount_ordered = RemoteObject.createImmutable(0);
RemoteObject _amount_paid = RemoteObject.createImmutable(0);
RemoteObject _method = RemoteObject.createImmutable("");
RemoteObject _cc_last4 = RemoteObject.createImmutable("");
RemoteObject _account_status = RemoteObject.createImmutable("");
RemoteObject _amount_ordered = RemoteObject.createImmutable(0);
RemoteObject _paymententity_id = RemoteObject.createImmutable(0);
RemoteObject _base_amount_paid = RemoteObject.createImmutable(0);
RemoteObject _shipping_amount = RemoteObject.createImmutable(0);
RemoteObject _additional_information = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coladditional_information = RemoteObject.createImmutable("");
RemoteObject _base_shipping_amount = RemoteObject.createImmutable(0);
RemoteObject _paymentparent_id = RemoteObject.createImmutable(0);
RemoteObject _state = RemoteObject.createImmutable("");
RemoteObject _base_grand_total = RemoteObject.createImmutable(0);
RemoteObject _billing_address_id = RemoteObject.createImmutable(0);
RemoteObject _customer_lastname = RemoteObject.createImmutable("");
RemoteObject _quote_id = RemoteObject.createImmutable(0);
RemoteObject _shipping_invoiced = RemoteObject.createImmutable(0);
RemoteObject _discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _weight = RemoteObject.createImmutable(0);
RemoteObject _base_total_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal_invoiced = RemoteObject.createImmutable(0);
RemoteObject _applied_rule_ids = RemoteObject.createImmutable("");
RemoteObject _subtotal_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_discount_tax_compensation_amnt = RemoteObject.createImmutable(0);
RemoteObject _subtotal = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _customer_email = RemoteObject.createImmutable("");
RemoteObject _base_discount_invoiced = RemoteObject.createImmutable(0);
RemoteObject _total_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_to_global_rate = RemoteObject.createImmutable(0);
RemoteObject _customer_is_guest = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _product_type = RemoteObject.createImmutable("");
RemoteObject _tax_amount = RemoteObject.createImmutable(0);
RemoteObject _tax_invoiced = RemoteObject.createImmutable(0);
RemoteObject _original_price = RemoteObject.createImmutable(0);
RemoteObject _free_shipping = RemoteObject.createImmutable(0);
RemoteObject _base_discount_tax_compensation_invoiced = RemoteObject.createImmutable(0);
RemoteObject _discount_amount = RemoteObject.createImmutable(0);
RemoteObject _tax_percent = RemoteObject.createImmutable(0);
RemoteObject _price_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _price = RemoteObject.createImmutable(0);
RemoteObject _product_id = RemoteObject.createImmutable(0);
RemoteObject _base_row_total = RemoteObject.createImmutable(0);
RemoteObject _sku = RemoteObject.createImmutable("");
RemoteObject _base_original_price = RemoteObject.createImmutable(0);
RemoteObject _row_weight = RemoteObject.createImmutable(0);
RemoteObject _base_amount_refunded = RemoteObject.createImmutable(0);
RemoteObject _base_price_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _no_discount = RemoteObject.createImmutable(0);
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _discount_percent = RemoteObject.createImmutable(0);
RemoteObject _order_id = RemoteObject.createImmutable(0);
RemoteObject _discount_tax_compensation_invoiced = RemoteObject.createImmutable(0);
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _qty_shipped = RemoteObject.createImmutable(0);
RemoteObject _qty_ordered = RemoteObject.createImmutable(0);
RemoteObject _row_total = RemoteObject.createImmutable(0);
RemoteObject _qty_canceled = RemoteObject.createImmutable(0);
RemoteObject _product_option = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _talla = RemoteObject.createImmutable("");
RemoteObject _extension_attributesproductoption = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _option_value = RemoteObject.createImmutable(0);
RemoteObject _option_id = RemoteObject.createImmutable("");
RemoteObject _amount_refunded = RemoteObject.createImmutable(0);
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _base_price = RemoteObject.createImmutable(0);
RemoteObject _qty_invoiced = RemoteObject.createImmutable(0);
RemoteObject _row_invoiced = RemoteObject.createImmutable(0);
RemoteObject _row_total_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _store_id = RemoteObject.createImmutable(0);
RemoteObject _item_id = RemoteObject.createImmutable(0);
RemoteObject _base_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _base_row_total_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _qty_refunded = RemoteObject.createImmutable(0);
RemoteObject _base_row_invoiced = RemoteObject.createImmutable(0);
RemoteObject _is_qty_decimal = RemoteObject.createImmutable(0);
RemoteObject _discount_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_tax_invoiced = RemoteObject.createImmutable(0);
RemoteObject _parent_item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mcolitemsextensionattributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _global_currency_code = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _is_virtual = RemoteObject.createImmutable(0);
RemoteObject _base_total_invoiced_cost = RemoteObject.createImmutable(0);
RemoteObject _status_histories = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _store_currency_code = RemoteObject.createImmutable("");
RemoteObject _total_item_count = RemoteObject.createImmutable(0);
RemoteObject _shipping_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _store_to_base_rate = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _grand_total = RemoteObject.createImmutable(0);
RemoteObject _base_currency_code = RemoteObject.createImmutable("");
RemoteObject _base_total_paid = RemoteObject.createImmutable(0);
RemoteObject _shipping_discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _total_due = RemoteObject.createImmutable(0);
RemoteObject _total_qty_ordered = RemoteObject.createImmutable(0);
RemoteObject _extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _pgwshipping = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _payment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colpayment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _amount = RemoteObject.createImmutable(0);
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _base_amount = RemoteObject.createImmutable(0);
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _percent = RemoteObject.createImmutable(0);
RemoteObject _item_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitem_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _type = RemoteObject.createImmutable("");
RemoteObject _converting_from_quote = RemoteObject.createImmutable("");
RemoteObject _shipping_description = RemoteObject.createImmutable("");
RemoteObject _store_to_order_rate = RemoteObject.createImmutable(0);
RemoteObject _subtotal_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_to_order_rate = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal = RemoteObject.createImmutable(0);
RemoteObject _protect_code = RemoteObject.createImmutable("");
RemoteObject _customer_dob = RemoteObject.createImmutable("");
RemoteObject _base_total_due = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _customer_id = RemoteObject.createImmutable(0);
RemoteObject _customer_group_id = RemoteObject.createImmutable(0);
RemoteObject _order_currency_code = RemoteObject.createImmutable("");
RemoteObject _customer_gender = RemoteObject.createImmutable(0);
RemoteObject _shipping_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_invoiced = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _page_size = RemoteObject.createImmutable(0);
RemoteObject group20;
int index20;
int groupLen20;
RemoteObject group52;
int index52;
int groupLen52;
RemoteObject group76;
int index76;
int groupLen76;
RemoteObject group100;
int index100;
int groupLen100;
RemoteObject group131;
int index131;
int groupLen131;
RemoteObject group172;
int index172;
int groupLen172;
RemoteObject group248;
int index248;
int groupLen248;
RemoteObject group255;
int index255;
int groupLen255;
RemoteObject group265;
int index265;
int groupLen265;
RemoteObject group267;
int index267;
int groupLen267;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaPedidos (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,543);
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
 BA.debugLineNum = 545;BA.debugLine="Dim Locale As AHLocale";
Debug.ShouldStop(1);
_locale = RemoteObject.createNew ("de.amberhome.locale.AHLocale");Debug.locals.put("Locale", _locale);
 BA.debugLineNum = 546;BA.debugLine="Locale.Initialize";
Debug.ShouldStop(2);
_locale.runVoidMethod ("Initialize");
 BA.debugLineNum = 547;BA.debugLine="Dim AHNum As AHNumeric";
Debug.ShouldStop(4);
_ahnum = RemoteObject.createNew ("de.amberhome.locale.AHNumeric");Debug.locals.put("AHNum", _ahnum);
 BA.debugLineNum = 548;BA.debugLine="AHNum.InitializeNumber2(Locale)";
Debug.ShouldStop(8);
_ahnum.runVoidMethod ("InitializeNumber2",(Object)(_locale));
 BA.debugLineNum = 550;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BOrders\")";
Debug.ShouldStop(32);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BOrders")));
 BA.debugLineNum = 551;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BOrdersTotale";
Debug.ShouldStop(64);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BOrdersTotales")));
 BA.debugLineNum = 552;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidos(t";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "cargapedidos"), __ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_enviodatosapimagentoinformacionpedidos" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 105;
return;
case 105:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 553;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 554;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(512);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 555;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "cargapedidos"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Pedidos B2B"))));
this.state = 106;
return;
case 106:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 556;BA.debugLine="Return False";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 559;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(16384);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 560;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd HH:mm:ss\"";
Debug.ShouldStop(32768);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 562;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(131072);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 563;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(262144);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 564;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(524288);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 565;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
Debug.ShouldStop(1048576);
_total_count = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_count")))));Debug.locals.put("total_count", _total_count);Debug.locals.put("total_count", _total_count);
 BA.debugLineNum = 567;BA.debugLine="Dim lstPedidos As List = root.Get(\"items\")";
Debug.ShouldStop(4194304);
_lstpedidos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstpedidos = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("lstPedidos", _lstpedidos);Debug.locals.put("lstPedidos", _lstpedidos);
 BA.debugLineNum = 569;BA.debugLine="For Each mDataPedido As Map In lstPedidos";
Debug.ShouldStop(16777216);
if (true) break;

case 5:
//for
this.state = 104;
_mdatapedido = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group20 = _lstpedidos;
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDataPedido", _mdatapedido);
this.state = 107;
if (true) break;

case 107:
//C
this.state = 104;
if (index20 < groupLen20) {
this.state = 7;
_mdatapedido = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group20.runMethod(false,"Get",index20));Debug.locals.put("mDataPedido", _mdatapedido);}
if (true) break;

case 108:
//C
this.state = 107;
index20++;
Debug.locals.put("mDataPedido", _mdatapedido);
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 571;BA.debugLine="Log(\"mDataPedido: \" & mDataPedido)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","851576860",RemoteObject.concat(RemoteObject.createImmutable("mDataPedido: "),_mdatapedido),0);
 BA.debugLineNum = 577;BA.debugLine="Dim IDPedido, IDTienda As Int";
Debug.ShouldStop(1);
_idpedido = RemoteObject.createImmutable(0);Debug.locals.put("IDPedido", _idpedido);
_idtienda = RemoteObject.createImmutable(0);Debug.locals.put("IDTienda", _idtienda);
 BA.debugLineNum = 578;BA.debugLine="Dim NombreTienda As String";
Debug.ShouldStop(2);
_nombretienda = RemoteObject.createImmutable("");Debug.locals.put("NombreTienda", _nombretienda);
 BA.debugLineNum = 579;BA.debugLine="Dim Pedido, FechaCreacion, FechaActualizacion As";
Debug.ShouldStop(4);
_pedido = RemoteObject.createImmutable("");Debug.locals.put("Pedido", _pedido);
_fechacreacion = RemoteObject.createImmutable("");Debug.locals.put("FechaCreacion", _fechacreacion);
_fechaactualizacion = RemoteObject.createImmutable("");Debug.locals.put("FechaActualizacion", _fechaactualizacion);
 BA.debugLineNum = 580;BA.debugLine="Dim FechaCreacionLong, FechaActualizacionLong As";
Debug.ShouldStop(8);
_fechacreacionlong = RemoteObject.createImmutable(0L);Debug.locals.put("FechaCreacionLong", _fechacreacionlong);
_fechaactualizacionlong = RemoteObject.createImmutable(0L);Debug.locals.put("FechaActualizacionLong", _fechaactualizacionlong);
 BA.debugLineNum = 581;BA.debugLine="Dim OrdenCompra As String";
Debug.ShouldStop(16);
_ordencompra = RemoteObject.createImmutable("");Debug.locals.put("OrdenCompra", _ordencompra);
 BA.debugLineNum = 582;BA.debugLine="Dim EmailComprador, NombreUsuarioComprador, Apel";
Debug.ShouldStop(32);
_emailcomprador = RemoteObject.createImmutable("");Debug.locals.put("EmailComprador", _emailcomprador);
_nombreusuariocomprador = RemoteObject.createImmutable("");Debug.locals.put("NombreUsuarioComprador", _nombreusuariocomprador);
_apellidousuariocomprador = RemoteObject.createImmutable("");Debug.locals.put("ApellidoUsuarioComprador", _apellidousuariocomprador);
 BA.debugLineNum = 583;BA.debugLine="Dim IDCliente, IDGRPCliente As Int";
Debug.ShouldStop(64);
_idcliente = RemoteObject.createImmutable(0);Debug.locals.put("IDCliente", _idcliente);
_idgrpcliente = RemoteObject.createImmutable(0);Debug.locals.put("IDGRPCliente", _idgrpcliente);
 BA.debugLineNum = 584;BA.debugLine="Dim ClienteERP, NombreClienteERP, GRPClienteERP,";
Debug.ShouldStop(128);
_clienteerp = RemoteObject.createImmutable("");Debug.locals.put("ClienteERP", _clienteerp);
_nombreclienteerp = RemoteObject.createImmutable("");Debug.locals.put("NombreClienteERP", _nombreclienteerp);
_grpclienteerp = RemoteObject.createImmutable("");Debug.locals.put("GRPClienteERP", _grpclienteerp);
_nombregrpclienteerp = RemoteObject.createImmutable("");Debug.locals.put("NombreGRPClienteERP", _nombregrpclienteerp);
 BA.debugLineNum = 585;BA.debugLine="Dim IDDireccionEnvioClienteERP As Int";
Debug.ShouldStop(256);
_iddireccionenvioclienteerp = RemoteObject.createImmutable(0);Debug.locals.put("IDDireccionEnvioClienteERP", _iddireccionenvioclienteerp);
 BA.debugLineNum = 586;BA.debugLine="Dim NombreDireccionEnvioClienteERP As String";
Debug.ShouldStop(512);
_nombredireccionenvioclienteerp = RemoteObject.createImmutable("");Debug.locals.put("NombreDireccionEnvioClienteERP", _nombredireccionenvioclienteerp);
 BA.debugLineNum = 587;BA.debugLine="Dim IDDireccionFacturacion As Int";
Debug.ShouldStop(1024);
_iddireccionfacturacion = RemoteObject.createImmutable(0);Debug.locals.put("IDDireccionFacturacion", _iddireccionfacturacion);
 BA.debugLineNum = 588;BA.debugLine="Dim NombreDireccionFacturacion As String";
Debug.ShouldStop(2048);
_nombredireccionfacturacion = RemoteObject.createImmutable("");Debug.locals.put("NombreDireccionFacturacion", _nombredireccionfacturacion);
 BA.debugLineNum = 589;BA.debugLine="Dim TotalQtyPedida, TotalQtyEnviada, TotalQtyFac";
Debug.ShouldStop(4096);
_totalqtypedida = RemoteObject.createImmutable(0);Debug.locals.put("TotalQtyPedida", _totalqtypedida);
_totalqtyenviada = RemoteObject.createImmutable(0);Debug.locals.put("TotalQtyEnviada", _totalqtyenviada);
_totalqtyfacturada = RemoteObject.createImmutable(0);Debug.locals.put("TotalQtyFacturada", _totalqtyfacturada);
 BA.debugLineNum = 590;BA.debugLine="Dim StatusPedido As String";
Debug.ShouldStop(8192);
_statuspedido = RemoteObject.createImmutable("");Debug.locals.put("StatusPedido", _statuspedido);
 BA.debugLineNum = 593;BA.debugLine="Dim extension_attributesPedido As Map = mDataPed";
Debug.ShouldStop(65536);
_extension_attributespedido = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributespedido = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributesPedido", _extension_attributespedido);Debug.locals.put("extension_attributesPedido", _extension_attributespedido);
 BA.debugLineNum = 594;BA.debugLine="Dim po_number As String";
Debug.ShouldStop(131072);
_po_number = RemoteObject.createImmutable("");Debug.locals.put("po_number", _po_number);
 BA.debugLineNum = 595;BA.debugLine="Dim TipoIVAPedido As Double";
Debug.ShouldStop(262144);
_tipoivapedido = RemoteObject.createImmutable(0);Debug.locals.put("TipoIVAPedido", _tipoivapedido);
 BA.debugLineNum = 596;BA.debugLine="Dim ImporteIVAPedido As Double    ' .... NO TIEN";
Debug.ShouldStop(524288);
_importeivapedido = RemoteObject.createImmutable(0);Debug.locals.put("ImporteIVAPedido", _importeivapedido);
 BA.debugLineNum = 597;BA.debugLine="If extension_attributesPedido.IsInitialized Then";
Debug.ShouldStop(1048576);
if (true) break;

case 8:
//if
this.state = 25;
if (_extension_attributespedido.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 598;BA.debugLine="Dim pgw As Map=extension_attributesPedido.Get(\"";
Debug.ShouldStop(2097152);
_pgw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_pgw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _extension_attributespedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pgw")))));Debug.locals.put("pgw", _pgw);Debug.locals.put("pgw", _pgw);
 BA.debugLineNum = 599;BA.debugLine="If pgw.IsInitialized Then";
Debug.ShouldStop(4194304);
if (true) break;

case 11:
//if
this.state = 24;
if (_pgw.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 600;BA.debugLine="po_number=pgw.Getdefault(\"po_number\",\"\")";
Debug.ShouldStop(8388608);
_po_number = BA.ObjectToString(_pgw.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("po_number"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("po_number", _po_number);
 BA.debugLineNum = 601;BA.debugLine="OrdenCompra=po_number";
Debug.ShouldStop(16777216);
_ordencompra = _po_number;Debug.locals.put("OrdenCompra", _ordencompra);
 BA.debugLineNum = 602;BA.debugLine="Dim sExtraDataPgw As String=pgw.Get(\"extra_dat";
Debug.ShouldStop(33554432);
_sextradatapgw = BA.ObjectToString(_pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extra_data")))));Debug.locals.put("sExtraDataPgw", _sextradatapgw);Debug.locals.put("sExtraDataPgw", _sextradatapgw);
 BA.debugLineNum = 604;BA.debugLine="Try";
Debug.ShouldStop(134217728);
if (true) break;

case 14:
//try
this.state = 23;
this.catchState = 22;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 22;
 BA.debugLineNum = 605;BA.debugLine="Dim parserExtraDataPgw As JSONParser";
Debug.ShouldStop(268435456);
_parserextradatapgw = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parserExtraDataPgw", _parserextradatapgw);
 BA.debugLineNum = 606;BA.debugLine="parserExtraDataPgw.Initialize(sExtraDataPgw)";
Debug.ShouldStop(536870912);
_parserextradatapgw.runVoidMethod ("Initialize",(Object)(_sextradatapgw));
 BA.debugLineNum = 607;BA.debugLine="Dim mExtraDataPgw As Map = parserExtraDataPgw";
Debug.ShouldStop(1073741824);
_mextradatapgw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mextradatapgw = _parserextradatapgw.runMethod(false,"NextObject");Debug.locals.put("mExtraDataPgw", _mextradatapgw);Debug.locals.put("mExtraDataPgw", _mextradatapgw);
 BA.debugLineNum = 608;BA.debugLine="Dim TipoIVAPedido As Double=mExtraDataPgw.Get";
Debug.ShouldStop(-2147483648);
_tipoivapedido = BA.numberCast(double.class, _mextradatapgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tax_rate")))));Debug.locals.put("TipoIVAPedido", _tipoivapedido);Debug.locals.put("TipoIVAPedido", _tipoivapedido);
 BA.debugLineNum = 609;BA.debugLine="Dim lstExtraDataPgwTaxDetails As List=mExtraD";
Debug.ShouldStop(1);
_lstextradatapgwtaxdetails = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstextradatapgwtaxdetails = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mextradatapgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tax Details")))));Debug.locals.put("lstExtraDataPgwTaxDetails", _lstextradatapgwtaxdetails);Debug.locals.put("lstExtraDataPgwTaxDetails", _lstextradatapgwtaxdetails);
 BA.debugLineNum = 610;BA.debugLine="For Each mDataTaxesPedido As Map In lstExtraD";
Debug.ShouldStop(2);
if (true) break;

case 17:
//for
this.state = 20;
_mdatataxespedido = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group52 = _lstextradatapgwtaxdetails;
index52 = 0;
groupLen52 = group52.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDataTaxesPedido", _mdatataxespedido);
this.state = 109;
if (true) break;

case 109:
//C
this.state = 20;
if (index52 < groupLen52) {
this.state = 19;
_mdatataxespedido = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group52.runMethod(false,"Get",index52));Debug.locals.put("mDataTaxesPedido", _mdatataxespedido);}
if (true) break;

case 110:
//C
this.state = 109;
index52++;
Debug.locals.put("mDataTaxesPedido", _mdatataxespedido);
if (true) break;

case 19:
//C
this.state = 110;
 BA.debugLineNum = 612;BA.debugLine="ImporteIVAPedido=mDataTaxesPedido.Get(\"Amoun";
Debug.ShouldStop(8);
_importeivapedido = BA.numberCast(double.class, _mdatataxespedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Amount")))));Debug.locals.put("ImporteIVAPedido", _importeivapedido);
 if (true) break;
if (true) break;

case 20:
//C
this.state = 23;
Debug.locals.put("mDataTaxesPedido", _mdatataxespedido);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
 BA.debugLineNum = 615;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","851576904",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 633;BA.debugLine="Dim customer_firstname As String = mDataPedido.G";
Debug.ShouldStop(16777216);
_customer_firstname = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_firstname")))));Debug.locals.put("customer_firstname", _customer_firstname);Debug.locals.put("customer_firstname", _customer_firstname);
 BA.debugLineNum = 634;BA.debugLine="NombreUsuarioComprador=customer_firstname";
Debug.ShouldStop(33554432);
_nombreusuariocomprador = _customer_firstname;Debug.locals.put("NombreUsuarioComprador", _nombreusuariocomprador);
 BA.debugLineNum = 637;BA.debugLine="Dim billing_address As Map = mDataPedido.Get(\"bi";
Debug.ShouldStop(268435456);
_billing_address = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_billing_address = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("billing_address")))));Debug.locals.put("billing_address", _billing_address);Debug.locals.put("billing_address", _billing_address);
 BA.debugLineNum = 638;BA.debugLine="IDDireccionFacturacion=billing_address.Get(\"enti";
Debug.ShouldStop(536870912);
_iddireccionfacturacion = BA.numberCast(int.class, _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("IDDireccionFacturacion", _iddireccionfacturacion);
 BA.debugLineNum = 639;BA.debugLine="Dim firstname As String = billing_address.Get(\"f";
Debug.ShouldStop(1073741824);
_firstname = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 640;BA.debugLine="Dim address_type As String = billing_address.Get";
Debug.ShouldStop(-2147483648);
_address_type = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address_type")))));Debug.locals.put("address_type", _address_type);Debug.locals.put("address_type", _address_type);
 BA.debugLineNum = 641;BA.debugLine="Dim customer_address_id As Int = billing_address";
Debug.ShouldStop(1);
_customer_address_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_address_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_address_id", _customer_address_id);Debug.locals.put("customer_address_id", _customer_address_id);
 BA.debugLineNum = 642;BA.debugLine="IDDireccionEnvioClienteERP=customer_address_id";
Debug.ShouldStop(2);
_iddireccionenvioclienteerp = _customer_address_id;Debug.locals.put("IDDireccionEnvioClienteERP", _iddireccionenvioclienteerp);
 BA.debugLineNum = 644;BA.debugLine="Dim city As String = billing_address.Get(\"city\")";
Debug.ShouldStop(8);
_city = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 645;BA.debugLine="Dim postcode As String = billing_address.Get(\"po";
Debug.ShouldStop(16);
_postcode = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 646;BA.debugLine="Dim region_id As Int = billing_address.Getdefaul";
Debug.ShouldStop(32);
_region_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("region_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 647;BA.debugLine="Dim telephone As String = billing_address.Get(\"t";
Debug.ShouldStop(64);
_telephone = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 648;BA.debugLine="Dim entity_id As Int = billing_address.Get(\"enti";
Debug.ShouldStop(128);
_entity_id = BA.numberCast(int.class, _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("entity_id", _entity_id);Debug.locals.put("entity_id", _entity_id);
 BA.debugLineNum = 649;BA.debugLine="Dim lastname As String = billing_address.Get(\"la";
Debug.ShouldStop(256);
_lastname = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 650;BA.debugLine="Dim parent_id As Int = billing_address.Get(\"pare";
Debug.ShouldStop(512);
_parent_id = BA.numberCast(int.class, _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parent_id")))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 651;BA.debugLine="Dim street As List = billing_address.Get(\"street";
Debug.ShouldStop(1024);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 652;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(2048);
if (true) break;

case 26:
//for
this.state = 29;
group76 = _street;
index76 = 0;
groupLen76 = group76.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 111;
if (true) break;

case 111:
//C
this.state = 29;
if (index76 < groupLen76) {
this.state = 28;
_colstreet = BA.ObjectToString(group76.runMethod(false,"Get",index76));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 112:
//C
this.state = 111;
index76++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 28:
//C
this.state = 112;
 BA.debugLineNum = 654;BA.debugLine="NombreDireccionFacturacion=NombreDireccionFactu";
Debug.ShouldStop(8192);
_nombredireccionfacturacion = RemoteObject.concat(_nombredireccionfacturacion,RemoteObject.createImmutable(" "),_colstreet);Debug.locals.put("NombreDireccionFacturacion", _nombredireccionfacturacion);
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 656;BA.debugLine="Dim region As String = billing_address.Get(\"regi";
Debug.ShouldStop(32768);
_region = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 657;BA.debugLine="Dim country_id As String = billing_address.Get(\"";
Debug.ShouldStop(65536);
_country_id = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 658;BA.debugLine="Dim email As String = billing_address.Get(\"email";
Debug.ShouldStop(131072);
_email = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 659;BA.debugLine="Dim region_code As String = billing_address.Get(";
Debug.ShouldStop(262144);
_region_code = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 660;BA.debugLine="NombreDireccionFacturacion=NombreDireccionFactur";
Debug.ShouldStop(524288);
_nombredireccionfacturacion = RemoteObject.concat(_nombredireccionfacturacion,RemoteObject.createImmutable(", "),_postcode,RemoteObject.createImmutable(" "),_city,RemoteObject.createImmutable(" "),_region,RemoteObject.createImmutable(" "),_country_id);Debug.locals.put("NombreDireccionFacturacion", _nombredireccionfacturacion);
 BA.debugLineNum = 661;BA.debugLine="NombreDireccionFacturacion=NombreDireccionFactur";
Debug.ShouldStop(1048576);
_nombredireccionfacturacion = _nombredireccionfacturacion.runMethod(true,"trim");Debug.locals.put("NombreDireccionFacturacion", _nombredireccionfacturacion);
 BA.debugLineNum = 662;BA.debugLine="Dim BillingExtensionAttributes As Map=billing_ad";
Debug.ShouldStop(2097152);
_billingextensionattributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_billingextensionattributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("BillingExtensionAttributes", _billingextensionattributes);Debug.locals.put("BillingExtensionAttributes", _billingextensionattributes);
 BA.debugLineNum = 664;BA.debugLine="Dim total_paid As Double = mDataPedido.Getdefaul";
Debug.ShouldStop(8388608);
_total_paid = BA.numberCast(double.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("total_paid", _total_paid);Debug.locals.put("total_paid", _total_paid);
 BA.debugLineNum = 666;BA.debugLine="Dim increment_id As String = mDataPedido.Get(\"in";
Debug.ShouldStop(33554432);
_increment_id = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("increment_id")))));Debug.locals.put("increment_id", _increment_id);Debug.locals.put("increment_id", _increment_id);
 BA.debugLineNum = 667;BA.debugLine="Pedido=increment_id";
Debug.ShouldStop(67108864);
_pedido = _increment_id;Debug.locals.put("Pedido", _pedido);
 BA.debugLineNum = 669;BA.debugLine="Dim payment As Map = mDataPedido.Get(\"payment\")";
Debug.ShouldStop(268435456);
_payment = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_payment = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment")))));Debug.locals.put("payment", _payment);Debug.locals.put("payment", _payment);
 BA.debugLineNum = 670;BA.debugLine="Dim base_amount_ordered As Double = payment.Getd";
Debug.ShouldStop(536870912);
_base_amount_ordered = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_ordered", _base_amount_ordered);Debug.locals.put("base_amount_ordered", _base_amount_ordered);
 BA.debugLineNum = 671;BA.debugLine="Dim amount_paid As Double = payment.Getdefault(\"";
Debug.ShouldStop(1073741824);
_amount_paid = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("amount_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("amount_paid", _amount_paid);Debug.locals.put("amount_paid", _amount_paid);
 BA.debugLineNum = 672;BA.debugLine="Dim method As String = payment.Get(\"method\")";
Debug.ShouldStop(-2147483648);
_method = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("method")))));Debug.locals.put("method", _method);Debug.locals.put("method", _method);
 BA.debugLineNum = 673;BA.debugLine="Dim cc_last4 As String = payment.Get(\"cc_last4\")";
Debug.ShouldStop(1);
_cc_last4 = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cc_last4")))));Debug.locals.put("cc_last4", _cc_last4);Debug.locals.put("cc_last4", _cc_last4);
 BA.debugLineNum = 675;BA.debugLine="Dim account_status As String = payment.Get(\"acco";
Debug.ShouldStop(4);
_account_status = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_status")))));Debug.locals.put("account_status", _account_status);Debug.locals.put("account_status", _account_status);
 BA.debugLineNum = 676;BA.debugLine="Dim amount_ordered As Double = payment.Getdefaul";
Debug.ShouldStop(8);
_amount_ordered = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("amount_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("amount_ordered", _amount_ordered);Debug.locals.put("amount_ordered", _amount_ordered);
 BA.debugLineNum = 677;BA.debugLine="Dim PaymentEntity_id As Int = payment.Get(\"entit";
Debug.ShouldStop(16);
_paymententity_id = BA.numberCast(int.class, _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("PaymentEntity_id", _paymententity_id);Debug.locals.put("PaymentEntity_id", _paymententity_id);
 BA.debugLineNum = 678;BA.debugLine="Dim base_amount_paid As Double = payment.Getdefa";
Debug.ShouldStop(32);
_base_amount_paid = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_paid", _base_amount_paid);Debug.locals.put("base_amount_paid", _base_amount_paid);
 BA.debugLineNum = 679;BA.debugLine="Dim shipping_amount As Int = payment.Getdefault(";
Debug.ShouldStop(64);
_shipping_amount = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 680;BA.debugLine="Dim additional_information As List = payment.Get";
Debug.ShouldStop(128);
_additional_information = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_additional_information = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("additional_information")))));Debug.locals.put("additional_information", _additional_information);Debug.locals.put("additional_information", _additional_information);
 BA.debugLineNum = 681;BA.debugLine="For Each coladditional_information As String In";
Debug.ShouldStop(256);
if (true) break;

case 30:
//for
this.state = 33;
group100 = _additional_information;
index100 = 0;
groupLen100 = group100.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("coladditional_information", _coladditional_information);
this.state = 113;
if (true) break;

case 113:
//C
this.state = 33;
if (index100 < groupLen100) {
this.state = 32;
_coladditional_information = BA.ObjectToString(group100.runMethod(false,"Get",index100));Debug.locals.put("coladditional_information", _coladditional_information);}
if (true) break;

case 114:
//C
this.state = 113;
index100++;
Debug.locals.put("coladditional_information", _coladditional_information);
if (true) break;

case 32:
//C
this.state = 114;
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
Debug.locals.put("coladditional_information", _coladditional_information);
;
 BA.debugLineNum = 683;BA.debugLine="Dim base_shipping_amount As Double = payment.Get";
Debug.ShouldStop(1024);
_base_shipping_amount = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 684;BA.debugLine="Dim PaymentParent_id As Int = payment.Get(\"paren";
Debug.ShouldStop(2048);
_paymentparent_id = BA.numberCast(int.class, _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parent_id")))));Debug.locals.put("PaymentParent_id", _paymentparent_id);Debug.locals.put("PaymentParent_id", _paymentparent_id);
 BA.debugLineNum = 687;BA.debugLine="Dim state As String = mDataPedido.Get(\"state\")";
Debug.ShouldStop(16384);
_state = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("state")))));Debug.locals.put("state", _state);Debug.locals.put("state", _state);
 BA.debugLineNum = 690;BA.debugLine="Dim base_grand_total As Double = mDataPedido.Get";
Debug.ShouldStop(131072);
_base_grand_total = BA.numberCast(double.class, _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_grand_total")))));Debug.locals.put("base_grand_total", _base_grand_total);Debug.locals.put("base_grand_total", _base_grand_total);
 BA.debugLineNum = 692;BA.debugLine="Dim billing_address_id As Int = mDataPedido.Get(";
Debug.ShouldStop(524288);
_billing_address_id = BA.numberCast(int.class, _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("billing_address_id")))));Debug.locals.put("billing_address_id", _billing_address_id);Debug.locals.put("billing_address_id", _billing_address_id);
 BA.debugLineNum = 694;BA.debugLine="Dim customer_lastname As String = mDataPedido.Ge";
Debug.ShouldStop(2097152);
_customer_lastname = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_lastname")))));Debug.locals.put("customer_lastname", _customer_lastname);Debug.locals.put("customer_lastname", _customer_lastname);
 BA.debugLineNum = 695;BA.debugLine="ApellidoUsuarioComprador=customer_lastname";
Debug.ShouldStop(4194304);
_apellidousuariocomprador = _customer_lastname;Debug.locals.put("ApellidoUsuarioComprador", _apellidousuariocomprador);
 BA.debugLineNum = 697;BA.debugLine="Dim quote_id As Int = mDataPedido.Getdefault(\"qu";
Debug.ShouldStop(16777216);
_quote_id = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("quote_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("quote_id", _quote_id);Debug.locals.put("quote_id", _quote_id);
 BA.debugLineNum = 699;BA.debugLine="Dim shipping_invoiced As Int = mDataPedido.Getde";
Debug.ShouldStop(67108864);
_shipping_invoiced = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_invoiced", _shipping_invoiced);Debug.locals.put("shipping_invoiced", _shipping_invoiced);
 BA.debugLineNum = 701;BA.debugLine="Dim discount_tax_compensation_amount As Int = mD";
Debug.ShouldStop(268435456);
_discount_tax_compensation_amount = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 703;BA.debugLine="Dim weight As Int = mDataPedido.Getdefault(\"weig";
Debug.ShouldStop(1073741824);
_weight = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("weight"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 705;BA.debugLine="Dim entity_id As Int = mDataPedido.Get(\"entity_i";
Debug.ShouldStop(1);
_entity_id = BA.numberCast(int.class, _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("entity_id", _entity_id);Debug.locals.put("entity_id", _entity_id);
 BA.debugLineNum = 707;BA.debugLine="Dim IDPedido As Int = mDataPedido.Get(\"entity_id";
Debug.ShouldStop(4);
_idpedido = BA.numberCast(int.class, _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("IDPedido", _idpedido);Debug.locals.put("IDPedido", _idpedido);
 BA.debugLineNum = 708;BA.debugLine="Log($\"IDPedido: ${IDPedido}\"$)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","851576997",(RemoteObject.concat(RemoteObject.createImmutable("IDPedido: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idpedido))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 710;BA.debugLine="Dim base_total_invoiced As Double = mDataPedido.";
Debug.ShouldStop(32);
_base_total_invoiced = BA.numberCast(double.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_total_invoiced", _base_total_invoiced);Debug.locals.put("base_total_invoiced", _base_total_invoiced);
 BA.debugLineNum = 712;BA.debugLine="Dim base_shipping_amount As Double = mDataPedido";
Debug.ShouldStop(128);
_base_shipping_amount = BA.numberCast(double.class, _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_amount")))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 714;BA.debugLine="Dim base_subtotal_invoiced As Int = mDataPedido.";
Debug.ShouldStop(512);
_base_subtotal_invoiced = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_subtotal_invoiced", _base_subtotal_invoiced);Debug.locals.put("base_subtotal_invoiced", _base_subtotal_invoiced);
 BA.debugLineNum = 716;BA.debugLine="Dim applied_rule_ids As String = mDataPedido.Get";
Debug.ShouldStop(2048);
_applied_rule_ids = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 718;BA.debugLine="Dim subtotal_incl_tax As Double = mDataPedido.Ge";
Debug.ShouldStop(8192);
_subtotal_incl_tax = BA.numberCast(double.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("subtotal_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("subtotal_incl_tax", _subtotal_incl_tax);Debug.locals.put("subtotal_incl_tax", _subtotal_incl_tax);
 BA.debugLineNum = 720;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
Debug.ShouldStop(32768);
_base_shipping_discount_tax_compensation_amnt = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_tax_compensation_amnt"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);
 BA.debugLineNum = 722;BA.debugLine="Dim subtotal As Double = mDataPedido.Get(\"subtot";
Debug.ShouldStop(131072);
_subtotal = BA.numberCast(double.class, _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("subtotal")))));Debug.locals.put("subtotal", _subtotal);Debug.locals.put("subtotal", _subtotal);
 BA.debugLineNum = 724;BA.debugLine="Dim base_shipping_incl_tax As Int = mDataPedido.";
Debug.ShouldStop(524288);
_base_shipping_incl_tax = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);
 BA.debugLineNum = 726;BA.debugLine="Dim customer_email As String = mDataPedido.Get(\"";
Debug.ShouldStop(2097152);
_customer_email = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_email")))));Debug.locals.put("customer_email", _customer_email);Debug.locals.put("customer_email", _customer_email);
 BA.debugLineNum = 727;BA.debugLine="EmailComprador=customer_email";
Debug.ShouldStop(4194304);
_emailcomprador = _customer_email;Debug.locals.put("EmailComprador", _emailcomprador);
 BA.debugLineNum = 729;BA.debugLine="Dim base_discount_invoiced As Int = mDataPedido.";
Debug.ShouldStop(16777216);
_base_discount_invoiced = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 731;BA.debugLine="Dim total_invoiced As Double = mDataPedido.Getde";
Debug.ShouldStop(67108864);
_total_invoiced = BA.numberCast(double.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("total_invoiced", _total_invoiced);Debug.locals.put("total_invoiced", _total_invoiced);
 BA.debugLineNum = 733;BA.debugLine="Dim base_to_global_rate As Int = mDataPedido.Get";
Debug.ShouldStop(268435456);
_base_to_global_rate = BA.numberCast(int.class, _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_to_global_rate")))));Debug.locals.put("base_to_global_rate", _base_to_global_rate);Debug.locals.put("base_to_global_rate", _base_to_global_rate);
 BA.debugLineNum = 735;BA.debugLine="Dim customer_is_guest As Int = mDataPedido.Get(\"";
Debug.ShouldStop(1073741824);
_customer_is_guest = BA.numberCast(int.class, _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_is_guest")))));Debug.locals.put("customer_is_guest", _customer_is_guest);Debug.locals.put("customer_is_guest", _customer_is_guest);
 BA.debugLineNum = 737;BA.debugLine="Dim items As List = mDataPedido.Get(\"items\")";
Debug.ShouldStop(1);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 738;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(2);
if (true) break;

case 34:
//for
this.state = 63;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group131 = _items;
index131 = 0;
groupLen131 = group131.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 115;
if (true) break;

case 115:
//C
this.state = 63;
if (index131 < groupLen131) {
this.state = 36;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group131.runMethod(false,"Get",index131));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 116:
//C
this.state = 115;
index131++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 740;BA.debugLine="Dim product_type As String = colitems.Get(\"prod";
Debug.ShouldStop(8);
_product_type = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_type")))));Debug.locals.put("product_type", _product_type);Debug.locals.put("product_type", _product_type);
 BA.debugLineNum = 741;BA.debugLine="If product_type=\"configurable\" Then Continue";
Debug.ShouldStop(16);
if (true) break;

case 37:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_product_type,BA.ObjectToString("configurable"))) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
this.state = 116;
if (true) break;;
if (true) break;

case 42:
//C
this.state = 43;
;
 BA.debugLineNum = 743;BA.debugLine="colitems.Put(\"po_number\",po_number)";
Debug.ShouldStop(64);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("po_number"))),(Object)((_po_number)));
 BA.debugLineNum = 744;BA.debugLine="Dim tax_amount As Double = colitems.Getdefault(";
Debug.ShouldStop(128);
_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_amount", _tax_amount);Debug.locals.put("tax_amount", _tax_amount);
 BA.debugLineNum = 745;BA.debugLine="Dim tax_invoiced As Double = colitems.Get(\"tax_";
Debug.ShouldStop(256);
_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tax_invoiced")))));Debug.locals.put("tax_invoiced", _tax_invoiced);Debug.locals.put("tax_invoiced", _tax_invoiced);
 BA.debugLineNum = 746;BA.debugLine="Dim original_price As Int = colitems.Get(\"origi";
Debug.ShouldStop(512);
_original_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("original_price")))));Debug.locals.put("original_price", _original_price);Debug.locals.put("original_price", _original_price);
 BA.debugLineNum = 747;BA.debugLine="Dim free_shipping As Int = colitems.Get(\"free_s";
Debug.ShouldStop(1024);
_free_shipping = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("free_shipping")))));Debug.locals.put("free_shipping", _free_shipping);Debug.locals.put("free_shipping", _free_shipping);
 BA.debugLineNum = 748;BA.debugLine="Dim base_discount_tax_compensation_invoiced As";
Debug.ShouldStop(2048);
_base_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);
 BA.debugLineNum = 749;BA.debugLine="Dim discount_amount As Int = colitems.Getdefaul";
Debug.ShouldStop(4096);
_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_amount", _discount_amount);Debug.locals.put("discount_amount", _discount_amount);
 BA.debugLineNum = 750;BA.debugLine="Dim tax_percent As Double = colitems.Getdefault";
Debug.ShouldStop(8192);
_tax_percent = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_percent"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_percent", _tax_percent);Debug.locals.put("tax_percent", _tax_percent);
 BA.debugLineNum = 751;BA.debugLine="Dim price_incl_tax As Double = Utilidades.FixNu";
Debug.ShouldStop(16384);
_price_incl_tax = parent._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)(_colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("price_incl_tax"))),(Object)(RemoteObject.createImmutable((0))))));Debug.locals.put("price_incl_tax", _price_incl_tax);Debug.locals.put("price_incl_tax", _price_incl_tax);
 BA.debugLineNum = 752;BA.debugLine="Dim price As Int = colitems.Get(\"price\")";
Debug.ShouldStop(32768);
_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("price")))));Debug.locals.put("price", _price);Debug.locals.put("price", _price);
 BA.debugLineNum = 753;BA.debugLine="Dim product_id As Int = colitems.Getdefault(\"pr";
Debug.ShouldStop(65536);
_product_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("product_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("product_id", _product_id);Debug.locals.put("product_id", _product_id);
 BA.debugLineNum = 754;BA.debugLine="Dim base_row_total As Int = colitems.Get(\"base_";
Debug.ShouldStop(131072);
_base_row_total = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total")))));Debug.locals.put("base_row_total", _base_row_total);Debug.locals.put("base_row_total", _base_row_total);
 BA.debugLineNum = 755;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
Debug.ShouldStop(262144);
_sku = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sku")))));Debug.locals.put("sku", _sku);Debug.locals.put("sku", _sku);
 BA.debugLineNum = 756;BA.debugLine="Dim discount_tax_compensation_amount As Int = c";
Debug.ShouldStop(524288);
_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 757;BA.debugLine="Dim weight As Int = colitems.Getdefault(\"weight";
Debug.ShouldStop(1048576);
_weight = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("weight"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 758;BA.debugLine="Dim base_original_price As Int = colitems.GetDE";
Debug.ShouldStop(2097152);
_base_original_price = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_original_price"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_original_price", _base_original_price);Debug.locals.put("base_original_price", _base_original_price);
 BA.debugLineNum = 759;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_weigh";
Debug.ShouldStop(4194304);
_row_weight = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_weight")))));Debug.locals.put("row_weight", _row_weight);Debug.locals.put("row_weight", _row_weight);
 BA.debugLineNum = 760;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"";
Debug.ShouldStop(8388608);
_applied_rule_ids = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 761;BA.debugLine="Dim base_amount_refunded As Int = colitems.Get(";
Debug.ShouldStop(16777216);
_base_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount_refunded")))));Debug.locals.put("base_amount_refunded", _base_amount_refunded);Debug.locals.put("base_amount_refunded", _base_amount_refunded);
 BA.debugLineNum = 762;BA.debugLine="Dim base_price_incl_tax As Double = colitems.Ge";
Debug.ShouldStop(33554432);
_base_price_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_price_incl_tax"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);
 BA.debugLineNum = 763;BA.debugLine="Dim no_discount As Int = colitems.Get(\"no_disco";
Debug.ShouldStop(67108864);
_no_discount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("no_discount")))));Debug.locals.put("no_discount", _no_discount);Debug.locals.put("no_discount", _no_discount);
 BA.debugLineNum = 764;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
Debug.ShouldStop(134217728);
_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 765;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Ge";
Debug.ShouldStop(268435456);
_base_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_invoiced")))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 766;BA.debugLine="Dim discount_percent As Int = colitems.Getdefau";
Debug.ShouldStop(536870912);
_discount_percent = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_percent"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_percent", _discount_percent);Debug.locals.put("discount_percent", _discount_percent);
 BA.debugLineNum = 767;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id\")";
Debug.ShouldStop(1073741824);
_order_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_id")))));Debug.locals.put("order_id", _order_id);Debug.locals.put("order_id", _order_id);
 BA.debugLineNum = 768;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
Debug.ShouldStop(-2147483648);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 769;BA.debugLine="Dim created_at As String = colitems.Get(\"create";
Debug.ShouldStop(1);
_created_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 770;BA.debugLine="Dim qty_shipped As Int = colitems.Get(\"qty_ship";
Debug.ShouldStop(2);
_qty_shipped = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_shipped")))));Debug.locals.put("qty_shipped", _qty_shipped);Debug.locals.put("qty_shipped", _qty_shipped);
 BA.debugLineNum = 771;BA.debugLine="Dim qty_ordered As Int = colitems.Get(\"qty_orde";
Debug.ShouldStop(4);
_qty_ordered = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_ordered")))));Debug.locals.put("qty_ordered", _qty_ordered);Debug.locals.put("qty_ordered", _qty_ordered);
 BA.debugLineNum = 773;BA.debugLine="TotalQtyPedida=TotalQtyPedida+qty_ordered";
Debug.ShouldStop(16);
_totalqtypedida = RemoteObject.solve(new RemoteObject[] {_totalqtypedida,_qty_ordered}, "+",1, 0);Debug.locals.put("TotalQtyPedida", _totalqtypedida);
 BA.debugLineNum = 774;BA.debugLine="TotalQtyEnviada=TotalQtyEnviada+qty_shipped";
Debug.ShouldStop(32);
_totalqtyenviada = RemoteObject.solve(new RemoteObject[] {_totalqtyenviada,_qty_shipped}, "+",1, 0);Debug.locals.put("TotalQtyEnviada", _totalqtyenviada);
 BA.debugLineNum = 776;BA.debugLine="Dim row_total As Int = colitems.Get(\"row_total\"";
Debug.ShouldStop(128);
_row_total = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total")))));Debug.locals.put("row_total", _row_total);Debug.locals.put("row_total", _row_total);
 BA.debugLineNum = 777;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_can";
Debug.ShouldStop(256);
_qty_canceled = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_canceled")))));Debug.locals.put("qty_canceled", _qty_canceled);Debug.locals.put("qty_canceled", _qty_canceled);
 BA.debugLineNum = 778;BA.debugLine="Dim product_option As Map = colitems.Get(\"produ";
Debug.ShouldStop(512);
_product_option = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_product_option = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_option")))));Debug.locals.put("product_option", _product_option);Debug.locals.put("product_option", _product_option);
 BA.debugLineNum = 779;BA.debugLine="Dim Talla As String";
Debug.ShouldStop(1024);
_talla = RemoteObject.createImmutable("");Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 780;BA.debugLine="If product_option.IsInitialized Then";
Debug.ShouldStop(2048);
if (true) break;

case 43:
//if
this.state = 54;
if (_product_option.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 781;BA.debugLine="Dim extension_attributesProductOption As Map =";
Debug.ShouldStop(4096);
_extension_attributesproductoption = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributesproductoption = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _product_option.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributesProductOption", _extension_attributesproductoption);Debug.locals.put("extension_attributesProductOption", _extension_attributesproductoption);
 BA.debugLineNum = 782;BA.debugLine="Dim configurable_item_options As List = extens";
Debug.ShouldStop(8192);
_configurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributesproductoption.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("configurable_item_options")))));Debug.locals.put("configurable_item_options", _configurable_item_options);Debug.locals.put("configurable_item_options", _configurable_item_options);
 BA.debugLineNum = 783;BA.debugLine="For Each colconfigurable_item_options As Map I";
Debug.ShouldStop(16384);
if (true) break;

case 46:
//for
this.state = 53;
_colconfigurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group172 = _configurable_item_options;
index172 = 0;
groupLen172 = group172.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
this.state = 117;
if (true) break;

case 117:
//C
this.state = 53;
if (index172 < groupLen172) {
this.state = 48;
_colconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group172.runMethod(false,"Get",index172));Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);}
if (true) break;

case 118:
//C
this.state = 117;
index172++;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 784;BA.debugLine="Dim option_value As Int = colconfigurable_ite";
Debug.ShouldStop(32768);
_option_value = BA.numberCast(int.class, _colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_value")))));Debug.locals.put("option_value", _option_value);Debug.locals.put("option_value", _option_value);
 BA.debugLineNum = 785;BA.debugLine="Dim option_id As String = colconfigurable_ite";
Debug.ShouldStop(65536);
_option_id = BA.ObjectToString(_colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_id")))));Debug.locals.put("option_id", _option_id);Debug.locals.put("option_id", _option_id);
 BA.debugLineNum = 786;BA.debugLine="If option_id=142 Then";
Debug.ShouldStop(131072);
if (true) break;

case 49:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_option_id,BA.NumberToString(142))) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 787;BA.debugLine="Talla=mSQL.ExecQuerySingleResult2(\"select la";
Debug.ShouldStop(262144);
_talla = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select label from tblB2BAtributoSizeProducts where value=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_option_value)})))));Debug.locals.put("Talla", _talla);
 if (true) break;

case 52:
//C
this.state = 118;
;
 if (true) break;
if (true) break;

case 53:
//C
this.state = 54;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
;
 if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 791;BA.debugLine="colitems.Put(\"Talla\",Talla)";
Debug.ShouldStop(4194304);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Talla"))),(Object)((_talla)));
 BA.debugLineNum = 792;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"amou";
Debug.ShouldStop(8388608);
_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount_refunded")))));Debug.locals.put("amount_refunded", _amount_refunded);Debug.locals.put("amount_refunded", _amount_refunded);
 BA.debugLineNum = 793;BA.debugLine="Dim updated_at As String = colitems.Get(\"update";
Debug.ShouldStop(16777216);
_updated_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 794;BA.debugLine="Dim base_price As Double = colitems.Get(\"base_p";
Debug.ShouldStop(33554432);
_base_price = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_price")))));Debug.locals.put("base_price", _base_price);Debug.locals.put("base_price", _base_price);
 BA.debugLineNum = 795;BA.debugLine="Dim qty_invoiced As Int = colitems.Get(\"qty_inv";
Debug.ShouldStop(67108864);
_qty_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_invoiced")))));Debug.locals.put("qty_invoiced", _qty_invoiced);Debug.locals.put("qty_invoiced", _qty_invoiced);
 BA.debugLineNum = 797;BA.debugLine="TotalQtyFacturada=TotalQtyFacturada+qty_invoice";
Debug.ShouldStop(268435456);
_totalqtyfacturada = RemoteObject.solve(new RemoteObject[] {_totalqtyfacturada,_qty_invoiced}, "+",1, 0);Debug.locals.put("TotalQtyFacturada", _totalqtyfacturada);
 BA.debugLineNum = 799;BA.debugLine="Dim row_invoiced As Int = colitems.Get(\"row_inv";
Debug.ShouldStop(1073741824);
_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_invoiced")))));Debug.locals.put("row_invoiced", _row_invoiced);Debug.locals.put("row_invoiced", _row_invoiced);
 BA.debugLineNum = 800;BA.debugLine="Dim row_total_incl_tax As Double = colitems.Get";
Debug.ShouldStop(-2147483648);
_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total_incl_tax")))));Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);
 BA.debugLineNum = 801;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"b";
Debug.ShouldStop(1);
_base_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_amount")))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 802;BA.debugLine="Dim store_id As Int = colitems.Getdefault(\"stor";
Debug.ShouldStop(2);
_store_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 803;BA.debugLine="IDTienda=store_id";
Debug.ShouldStop(4);
_idtienda = _store_id;Debug.locals.put("IDTienda", _idtienda);
 BA.debugLineNum = 804;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
Debug.ShouldStop(8);
_item_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_id")))));Debug.locals.put("item_id", _item_id);Debug.locals.put("item_id", _item_id);
 BA.debugLineNum = 805;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(";
Debug.ShouldStop(16);
_base_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_amount")))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 806;BA.debugLine="Dim base_row_total_incl_tax As Double = colitem";
Debug.ShouldStop(32);
_base_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total_incl_tax")))));Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);
 BA.debugLineNum = 807;BA.debugLine="Dim base_discount_tax_compensation_amount As In";
Debug.ShouldStop(64);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 808;BA.debugLine="Dim product_type As String = colitems.Get(\"prod";
Debug.ShouldStop(128);
_product_type = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_type")))));Debug.locals.put("product_type", _product_type);Debug.locals.put("product_type", _product_type);
 BA.debugLineNum = 809;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_ref";
Debug.ShouldStop(256);
_qty_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_refunded")))));Debug.locals.put("qty_refunded", _qty_refunded);Debug.locals.put("qty_refunded", _qty_refunded);
 BA.debugLineNum = 810;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(\"ba";
Debug.ShouldStop(512);
_base_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_invoiced")))));Debug.locals.put("base_row_invoiced", _base_row_invoiced);Debug.locals.put("base_row_invoiced", _base_row_invoiced);
 BA.debugLineNum = 811;BA.debugLine="Dim is_qty_decimal As Int = colitems.Getdefault";
Debug.ShouldStop(1024);
_is_qty_decimal = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_qty_decimal"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("is_qty_decimal", _is_qty_decimal);Debug.locals.put("is_qty_decimal", _is_qty_decimal);
 BA.debugLineNum = 812;BA.debugLine="Dim discount_invoiced As Int = colitems.Get(\"di";
Debug.ShouldStop(2048);
_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_invoiced")))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 813;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Get(";
Debug.ShouldStop(4096);
_base_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_invoiced")))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 BA.debugLineNum = 814;BA.debugLine="Dim parent_item As Map=colitems.Get(\"parent_ite";
Debug.ShouldStop(8192);
_parent_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_parent_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parent_item")))));Debug.locals.put("parent_item", _parent_item);Debug.locals.put("parent_item", _parent_item);
 BA.debugLineNum = 815;BA.debugLine="If parent_item.IsInitialized Then";
Debug.ShouldStop(16384);
if (true) break;

case 55:
//if
this.state = 58;
if (_parent_item.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 816;BA.debugLine="Log(\"parent_item: \" & parent_item)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","851577105",RemoteObject.concat(RemoteObject.createImmutable("parent_item: "),_parent_item),0);
 if (true) break;

case 58:
//C
this.state = 59;
;
 BA.debugLineNum = 818;BA.debugLine="Dim mColItemsExtensionAttributes As Map=colitem";
Debug.ShouldStop(131072);
_mcolitemsextensionattributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mcolitemsextensionattributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("mColItemsExtensionAttributes", _mcolitemsextensionattributes);Debug.locals.put("mColItemsExtensionAttributes", _mcolitemsextensionattributes);
 BA.debugLineNum = 819;BA.debugLine="If mColItemsExtensionAttributes.IsInitialized T";
Debug.ShouldStop(262144);
if (true) break;

case 59:
//if
this.state = 62;
if (_mcolitemsextensionattributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 820;BA.debugLine="Log(mColItemsExtensionAttributes)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","851577109",BA.ObjectToString(_mcolitemsextensionattributes),0);
 if (true) break;

case 62:
//C
this.state = 116;
;
 if (true) break;
if (true) break;

case 63:
//C
this.state = 64;
Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 824;BA.debugLine="Dim global_currency_code As String = mDataPedido";
Debug.ShouldStop(8388608);
_global_currency_code = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("global_currency_code")))));Debug.locals.put("global_currency_code", _global_currency_code);Debug.locals.put("global_currency_code", _global_currency_code);
 BA.debugLineNum = 826;BA.debugLine="Dim status As String = mDataPedido.Get(\"status\")";
Debug.ShouldStop(33554432);
_status = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 827;BA.debugLine="StatusPedido=status";
Debug.ShouldStop(67108864);
_statuspedido = _status;Debug.locals.put("StatusPedido", _statuspedido);
 BA.debugLineNum = 829;BA.debugLine="Dim is_virtual As Int = mDataPedido.Getdefault(\"";
Debug.ShouldStop(268435456);
_is_virtual = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_virtual"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("is_virtual", _is_virtual);Debug.locals.put("is_virtual", _is_virtual);
 BA.debugLineNum = 831;BA.debugLine="Dim base_total_invoiced_cost As Int = mDataPedid";
Debug.ShouldStop(1073741824);
_base_total_invoiced_cost = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_invoiced_cost"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_total_invoiced_cost", _base_total_invoiced_cost);Debug.locals.put("base_total_invoiced_cost", _base_total_invoiced_cost);
 BA.debugLineNum = 833;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
Debug.ShouldStop(1);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 835;BA.debugLine="Dim status_histories As List = mDataPedido.Get(\"";
Debug.ShouldStop(4);
_status_histories = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_status_histories = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_histories")))));Debug.locals.put("status_histories", _status_histories);Debug.locals.put("status_histories", _status_histories);
 BA.debugLineNum = 837;BA.debugLine="Dim store_currency_code As String = mDataPedido.";
Debug.ShouldStop(16);
_store_currency_code = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_currency_code")))));Debug.locals.put("store_currency_code", _store_currency_code);Debug.locals.put("store_currency_code", _store_currency_code);
 BA.debugLineNum = 839;BA.debugLine="Dim created_at As String = mDataPedido.Get(\"crea";
Debug.ShouldStop(64);
_created_at = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 840;BA.debugLine="FechaCreacion=created_at";
Debug.ShouldStop(128);
_fechacreacion = _created_at;Debug.locals.put("FechaCreacion", _fechacreacion);
 BA.debugLineNum = 841;BA.debugLine="FechaCreacionLong=DateTime.DateParse(FechaCreaci";
Debug.ShouldStop(256);
_fechacreacionlong = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_fechacreacion));Debug.locals.put("FechaCreacionLong", _fechacreacionlong);
 BA.debugLineNum = 843;BA.debugLine="Dim total_item_count As Int = mDataPedido.Getdef";
Debug.ShouldStop(1024);
_total_item_count = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_item_count"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("total_item_count", _total_item_count);Debug.locals.put("total_item_count", _total_item_count);
 BA.debugLineNum = 845;BA.debugLine="Dim shipping_tax_amount As Int = mDataPedido.Get";
Debug.ShouldStop(4096);
_shipping_tax_amount = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_tax_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);
 BA.debugLineNum = 847;BA.debugLine="Dim store_to_base_rate As Int = mDataPedido.Getd";
Debug.ShouldStop(16384);
_store_to_base_rate = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_to_base_rate"))),(Object)(RemoteObject.createImmutable((1)))));Debug.locals.put("store_to_base_rate", _store_to_base_rate);Debug.locals.put("store_to_base_rate", _store_to_base_rate);
 BA.debugLineNum = 849;BA.debugLine="Dim updated_at As String = mDataPedido.Get(\"upda";
Debug.ShouldStop(65536);
_updated_at = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 850;BA.debugLine="FechaActualizacion=updated_at";
Debug.ShouldStop(131072);
_fechaactualizacion = _updated_at;Debug.locals.put("FechaActualizacion", _fechaactualizacion);
 BA.debugLineNum = 851;BA.debugLine="FechaActualizacionLong=DateTime.DateParse(FechaA";
Debug.ShouldStop(262144);
_fechaactualizacionlong = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_fechaactualizacion));Debug.locals.put("FechaActualizacionLong", _fechaactualizacionlong);
 BA.debugLineNum = 853;BA.debugLine="Dim base_shipping_discount_amount As Int = mData";
Debug.ShouldStop(1048576);
_base_shipping_discount_amount = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);
 BA.debugLineNum = 856;BA.debugLine="NombreTienda=Utilidades.FixNull(mSQL.ExecQuerySi";
Debug.ShouldStop(8388608);
_nombretienda = parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select name from tblB2BStores where id=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idtienda)}))))))));Debug.locals.put("NombreTienda", _nombretienda);
 BA.debugLineNum = 858;BA.debugLine="Dim grand_total As Double = mDataPedido.Getdefau";
Debug.ShouldStop(33554432);
_grand_total = BA.numberCast(double.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("grand_total"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("grand_total", _grand_total);Debug.locals.put("grand_total", _grand_total);
 BA.debugLineNum = 860;BA.debugLine="Dim base_currency_code As String = mDataPedido.G";
Debug.ShouldStop(134217728);
_base_currency_code = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_currency_code")))));Debug.locals.put("base_currency_code", _base_currency_code);Debug.locals.put("base_currency_code", _base_currency_code);
 BA.debugLineNum = 862;BA.debugLine="Dim base_total_paid As Double = mDataPedido.Getd";
Debug.ShouldStop(536870912);
_base_total_paid = BA.numberCast(double.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_paid"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_total_paid", _base_total_paid);Debug.locals.put("base_total_paid", _base_total_paid);
 BA.debugLineNum = 864;BA.debugLine="Dim base_tax_amount As Double = mDataPedido.Get(";
Debug.ShouldStop(-2147483648);
_base_tax_amount = BA.numberCast(double.class, _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_amount")))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 866;BA.debugLine="Dim store_id As Int = mDataPedido.Getdefault(\"st";
Debug.ShouldStop(2);
_store_id = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 868;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
Debug.ShouldStop(8);
_shipping_discount_tax_compensation_amount = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);
 BA.debugLineNum = 870;BA.debugLine="Dim total_due As Int = mDataPedido.Getdefault(\"t";
Debug.ShouldStop(32);
_total_due = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_due"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("total_due", _total_due);Debug.locals.put("total_due", _total_due);
 BA.debugLineNum = 872;BA.debugLine="Dim total_qty_ordered As Int = mDataPedido.Getde";
Debug.ShouldStop(128);
_total_qty_ordered = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_qty_ordered"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("total_qty_ordered", _total_qty_ordered);Debug.locals.put("total_qty_ordered", _total_qty_ordered);
 BA.debugLineNum = 874;BA.debugLine="Dim base_discount_amount As Int = mDataPedido.Ge";
Debug.ShouldStop(512);
_base_discount_amount = BA.numberCast(int.class, _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_amount")))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 876;BA.debugLine="Dim extension_attributes As Map = mDataPedido.Ge";
Debug.ShouldStop(2048);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 877;BA.debugLine="If extension_attributes.IsInitialized Then";
Debug.ShouldStop(4096);
if (true) break;

case 64:
//if
this.state = 103;
if (_extension_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
 BA.debugLineNum = 878;BA.debugLine="Dim shipping_assignments As List = extension_at";
Debug.ShouldStop(8192);
_shipping_assignments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_shipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_assignments")))));Debug.locals.put("shipping_assignments", _shipping_assignments);Debug.locals.put("shipping_assignments", _shipping_assignments);
 BA.debugLineNum = 879;BA.debugLine="If shipping_assignments.IsInitialized Then";
Debug.ShouldStop(16384);
if (true) break;

case 67:
//if
this.state = 74;
if (_shipping_assignments.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 880;BA.debugLine="Dim pgwShipping As Map=extension_attributes.Ge";
Debug.ShouldStop(32768);
_pgwshipping = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_pgwshipping = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pgw")))));Debug.locals.put("pgwShipping", _pgwshipping);Debug.locals.put("pgwShipping", _pgwshipping);
 BA.debugLineNum = 881;BA.debugLine="If pgw.IsInitialized Then";
Debug.ShouldStop(65536);
if (true) break;

case 70:
//if
this.state = 73;
if (_pgw.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 if (true) break;

case 73:
//C
this.state = 74;
;
 if (true) break;

case 74:
//C
this.state = 75;
;
 BA.debugLineNum = 980;BA.debugLine="Dim payment_additional_info As List = extension";
Debug.ShouldStop(524288);
_payment_additional_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_payment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment_additional_info")))));Debug.locals.put("payment_additional_info", _payment_additional_info);Debug.locals.put("payment_additional_info", _payment_additional_info);
 BA.debugLineNum = 981;BA.debugLine="If payment_additional_info.IsInitialized Then";
Debug.ShouldStop(1048576);
if (true) break;

case 75:
//if
this.state = 82;
if (_payment_additional_info.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 982;BA.debugLine="For Each colpayment_additional_info As Map In";
Debug.ShouldStop(2097152);
if (true) break;

case 78:
//for
this.state = 81;
_colpayment_additional_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group248 = _payment_additional_info;
index248 = 0;
groupLen248 = group248.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
this.state = 119;
if (true) break;

case 119:
//C
this.state = 81;
if (index248 < groupLen248) {
this.state = 80;
_colpayment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group248.runMethod(false,"Get",index248));Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);}
if (true) break;

case 120:
//C
this.state = 119;
index248++;
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
if (true) break;

case 80:
//C
this.state = 120;
 BA.debugLineNum = 983;BA.debugLine="Dim value As String = colpayment_additional_i";
Debug.ShouldStop(4194304);
_value = BA.ObjectToString(_colpayment_additional_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 984;BA.debugLine="Dim key As String = colpayment_additional_inf";
Debug.ShouldStop(8388608);
_key = BA.ObjectToString(_colpayment_additional_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("key")))));Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
;
 if (true) break;

case 82:
//C
this.state = 83;
;
 BA.debugLineNum = 987;BA.debugLine="Dim applied_taxes As List = extension_attribute";
Debug.ShouldStop(67108864);
_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_taxes")))));Debug.locals.put("applied_taxes", _applied_taxes);Debug.locals.put("applied_taxes", _applied_taxes);
 BA.debugLineNum = 988;BA.debugLine="If applied_taxes.IsInitialized Then";
Debug.ShouldStop(134217728);
if (true) break;

case 83:
//if
this.state = 90;
if (_applied_taxes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 85;
}if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 989;BA.debugLine="For Each colapplied_taxes As Map In applied_ta";
Debug.ShouldStop(268435456);
if (true) break;

case 86:
//for
this.state = 89;
_colapplied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group255 = _applied_taxes;
index255 = 0;
groupLen255 = group255.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
this.state = 121;
if (true) break;

case 121:
//C
this.state = 89;
if (index255 < groupLen255) {
this.state = 88;
_colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group255.runMethod(false,"Get",index255));Debug.locals.put("colapplied_taxes", _colapplied_taxes);}
if (true) break;

case 122:
//C
this.state = 121;
index255++;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
if (true) break;

case 88:
//C
this.state = 122;
 BA.debugLineNum = 990;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"";
Debug.ShouldStop(536870912);
_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount")))));Debug.locals.put("amount", _amount);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 991;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"co";
Debug.ShouldStop(1073741824);
_code = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 992;BA.debugLine="Dim base_amount As Double = colapplied_taxes.";
Debug.ShouldStop(-2147483648);
_base_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount")))));Debug.locals.put("base_amount", _base_amount);Debug.locals.put("base_amount", _base_amount);
 BA.debugLineNum = 993;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"t";
Debug.ShouldStop(1);
_title = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 994;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(";
Debug.ShouldStop(2);
_percent = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("percent")))));Debug.locals.put("percent", _percent);Debug.locals.put("percent", _percent);
 if (true) break;
if (true) break;

case 89:
//C
this.state = 90;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
;
 if (true) break;

case 90:
//C
this.state = 91;
;
 BA.debugLineNum = 997;BA.debugLine="Dim item_applied_taxes As List = extension_attr";
Debug.ShouldStop(16);
_item_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_item_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_applied_taxes")))));Debug.locals.put("item_applied_taxes", _item_applied_taxes);Debug.locals.put("item_applied_taxes", _item_applied_taxes);
 BA.debugLineNum = 998;BA.debugLine="If item_applied_taxes.IsInitialized Then";
Debug.ShouldStop(32);
if (true) break;

case 91:
//if
this.state = 102;
if (_item_applied_taxes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 93;
}if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 999;BA.debugLine="For Each colitem_applied_taxes As Map In item_";
Debug.ShouldStop(64);
if (true) break;

case 94:
//for
this.state = 101;
_colitem_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group265 = _item_applied_taxes;
index265 = 0;
groupLen265 = group265.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
this.state = 123;
if (true) break;

case 123:
//C
this.state = 101;
if (index265 < groupLen265) {
this.state = 96;
_colitem_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group265.runMethod(false,"Get",index265));Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);}
if (true) break;

case 124:
//C
this.state = 123;
index265++;
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 1000;BA.debugLine="Dim applied_taxes As List = colitem_applied_t";
Debug.ShouldStop(128);
_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitem_applied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_taxes")))));Debug.locals.put("applied_taxes", _applied_taxes);Debug.locals.put("applied_taxes", _applied_taxes);
 BA.debugLineNum = 1001;BA.debugLine="For Each colapplied_taxes As Map In applied_t";
Debug.ShouldStop(256);
if (true) break;

case 97:
//for
this.state = 100;
_colapplied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group267 = _applied_taxes;
index267 = 0;
groupLen267 = group267.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
this.state = 125;
if (true) break;

case 125:
//C
this.state = 100;
if (index267 < groupLen267) {
this.state = 99;
_colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group267.runMethod(false,"Get",index267));Debug.locals.put("colapplied_taxes", _colapplied_taxes);}
if (true) break;

case 126:
//C
this.state = 125;
index267++;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
if (true) break;

case 99:
//C
this.state = 126;
 BA.debugLineNum = 1002;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(";
Debug.ShouldStop(512);
_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount")))));Debug.locals.put("amount", _amount);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 1003;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"c";
Debug.ShouldStop(1024);
_code = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 1004;BA.debugLine="Dim base_amount As Double = colapplied_taxes";
Debug.ShouldStop(2048);
_base_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount")))));Debug.locals.put("base_amount", _base_amount);Debug.locals.put("base_amount", _base_amount);
 BA.debugLineNum = 1005;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"";
Debug.ShouldStop(4096);
_title = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 1006;BA.debugLine="Dim percent As Double = colapplied_taxes.Get";
Debug.ShouldStop(8192);
_percent = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("percent")))));Debug.locals.put("percent", _percent);Debug.locals.put("percent", _percent);
 if (true) break;
if (true) break;

case 100:
//C
this.state = 124;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
;
 BA.debugLineNum = 1008;BA.debugLine="Dim Type As String = colitem_applied_taxes.Ge";
Debug.ShouldStop(32768);
_type = BA.ObjectToString(_colitem_applied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Type", _type);Debug.locals.put("Type", _type);
 if (true) break;
if (true) break;

case 101:
//C
this.state = 102;
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
;
 if (true) break;

case 102:
//C
this.state = 103;
;
 BA.debugLineNum = 1011;BA.debugLine="Dim converting_from_quote As String = extension";
Debug.ShouldStop(262144);
_converting_from_quote = BA.ObjectToString(_extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("converting_from_quote")))));Debug.locals.put("converting_from_quote", _converting_from_quote);Debug.locals.put("converting_from_quote", _converting_from_quote);
 BA.debugLineNum = 1013;BA.debugLine="Dim pgw As Map=extension_attributes.Get(\"pgw\")";
Debug.ShouldStop(1048576);
_pgw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_pgw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pgw")))));Debug.locals.put("pgw", _pgw);Debug.locals.put("pgw", _pgw);
 if (true) break;

case 103:
//C
this.state = 108;
;
 BA.debugLineNum = 1017;BA.debugLine="Dim shipping_description As String = mDataPedido";
Debug.ShouldStop(16777216);
_shipping_description = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_description")))));Debug.locals.put("shipping_description", _shipping_description);Debug.locals.put("shipping_description", _shipping_description);
 BA.debugLineNum = 1019;BA.debugLine="Dim store_to_order_rate As Int = mDataPedido.Get";
Debug.ShouldStop(67108864);
_store_to_order_rate = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_to_order_rate"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("store_to_order_rate", _store_to_order_rate);Debug.locals.put("store_to_order_rate", _store_to_order_rate);
 BA.debugLineNum = 1021;BA.debugLine="Dim shipping_amount As Int = mDataPedido.Getdefa";
Debug.ShouldStop(268435456);
_shipping_amount = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 1023;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
Debug.ShouldStop(1073741824);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 1025;BA.debugLine="Dim subtotal_invoiced As Int = mDataPedido.Getde";
Debug.ShouldStop(1);
_subtotal_invoiced = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("subtotal_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("subtotal_invoiced", _subtotal_invoiced);Debug.locals.put("subtotal_invoiced", _subtotal_invoiced);
 BA.debugLineNum = 1027;BA.debugLine="Dim base_to_order_rate As Int = mDataPedido.Getd";
Debug.ShouldStop(4);
_base_to_order_rate = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_to_order_rate"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_to_order_rate", _base_to_order_rate);Debug.locals.put("base_to_order_rate", _base_to_order_rate);
 BA.debugLineNum = 1029;BA.debugLine="Dim base_subtotal As Int = mDataPedido.Getdefaul";
Debug.ShouldStop(16);
_base_subtotal = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_subtotal", _base_subtotal);Debug.locals.put("base_subtotal", _base_subtotal);
 BA.debugLineNum = 1031;BA.debugLine="Dim protect_code As String = mDataPedido.Get(\"pr";
Debug.ShouldStop(64);
_protect_code = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("protect_code")))));Debug.locals.put("protect_code", _protect_code);Debug.locals.put("protect_code", _protect_code);
 BA.debugLineNum = 1033;BA.debugLine="Dim customer_dob As String = mDataPedido.Get(\"cu";
Debug.ShouldStop(256);
_customer_dob = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_dob")))));Debug.locals.put("customer_dob", _customer_dob);Debug.locals.put("customer_dob", _customer_dob);
 BA.debugLineNum = 1035;BA.debugLine="Dim base_total_due As Int = mDataPedido.Getdefau";
Debug.ShouldStop(1024);
_base_total_due = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_due"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_total_due", _base_total_due);Debug.locals.put("base_total_due", _base_total_due);
 BA.debugLineNum = 1037;BA.debugLine="Dim base_subtotal_incl_tax As Double = mDataPedi";
Debug.ShouldStop(4096);
_base_subtotal_incl_tax = BA.numberCast(double.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal_incl_tax"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_subtotal_incl_tax", _base_subtotal_incl_tax);Debug.locals.put("base_subtotal_incl_tax", _base_subtotal_incl_tax);
 BA.debugLineNum = 1039;BA.debugLine="Dim customer_id As Int = mDataPedido.Getdefault(";
Debug.ShouldStop(16384);
_customer_id = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_id", _customer_id);Debug.locals.put("customer_id", _customer_id);
 BA.debugLineNum = 1040;BA.debugLine="IDCliente=customer_id";
Debug.ShouldStop(32768);
_idcliente = _customer_id;Debug.locals.put("IDCliente", _idcliente);
 BA.debugLineNum = 1043;BA.debugLine="ClienteERP=Utilidades.FixNull(mSQL.ExecQuerySing";
Debug.ShouldStop(262144);
_clienteerp = parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select Code from tblB2BClientes where id=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idcliente)}))))))));Debug.locals.put("ClienteERP", _clienteerp);
 BA.debugLineNum = 1044;BA.debugLine="NombreClienteERP=Utilidades.FixNull(mSQL.ExecQue";
Debug.ShouldStop(524288);
_nombreclienteerp = parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select Company from tblB2BClientes where id=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idcliente)}))))))));Debug.locals.put("NombreClienteERP", _nombreclienteerp);
 BA.debugLineNum = 1045;BA.debugLine="Dim customer_group_id As Int = mDataPedido.Getde";
Debug.ShouldStop(1048576);
_customer_group_id = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_group_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_group_id", _customer_group_id);Debug.locals.put("customer_group_id", _customer_group_id);
 BA.debugLineNum = 1046;BA.debugLine="IDGRPCliente=customer_group_id";
Debug.ShouldStop(2097152);
_idgrpcliente = _customer_group_id;Debug.locals.put("IDGRPCliente", _idgrpcliente);
 BA.debugLineNum = 1049;BA.debugLine="Dim discount_invoiced As Int = mDataPedido.Getde";
Debug.ShouldStop(16777216);
_discount_invoiced = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 1051;BA.debugLine="Dim order_currency_code As String = mDataPedido.";
Debug.ShouldStop(67108864);
_order_currency_code = BA.ObjectToString(_mdatapedido.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_currency_code")))));Debug.locals.put("order_currency_code", _order_currency_code);Debug.locals.put("order_currency_code", _order_currency_code);
 BA.debugLineNum = 1053;BA.debugLine="Dim base_tax_invoiced As Double = mDataPedido.Ge";
Debug.ShouldStop(268435456);
_base_tax_invoiced = BA.numberCast(double.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_tax_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 BA.debugLineNum = 1055;BA.debugLine="Dim customer_gender As Int = mDataPedido.Getdefa";
Debug.ShouldStop(1073741824);
_customer_gender = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_gender"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_gender", _customer_gender);Debug.locals.put("customer_gender", _customer_gender);
 BA.debugLineNum = 1057;BA.debugLine="Dim shipping_incl_tax As Int = mDataPedido.Getde";
Debug.ShouldStop(1);
_shipping_incl_tax = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);
 BA.debugLineNum = 1059;BA.debugLine="Dim base_shipping_invoiced As Int = mDataPedido.";
Debug.ShouldStop(4);
_base_shipping_invoiced = BA.numberCast(int.class, _mdatapedido.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);
 BA.debugLineNum = 1063;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mS";
Debug.ShouldStop(64);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblB2BOrders")),(Object)(_items));
 BA.debugLineNum = 1065;BA.debugLine="Dim sSQL As String=$\"Insert into tblB2BOrdersTot";
Debug.ShouldStop(256);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("Insert into tblB2BOrdersTotales (IDPedido\n"),RemoteObject.createImmutable("		, IDTienda, NombreTienda\n"),RemoteObject.createImmutable("		, Pedido, FechaCreacion, FechaActualizacion\n"),RemoteObject.createImmutable("		, OrdenCompra\n"),RemoteObject.createImmutable("		, name\n"),RemoteObject.createImmutable("		, EmailComprador, NombreUsuarioComprador, ApellidoUsuarioComprador\n"),RemoteObject.createImmutable("		, IDGRPCliente,IDCliente,IDDireccionEnvioClienteERP\n"),RemoteObject.createImmutable("		, GRPClienteERP, ClienteERP, NombreClienteERP, IDDireccionEnvioClienteERP, NombreDireccionEnvioClienteERP, IDDireccionFacturacion, NombreDireccionFacturacion\n"),RemoteObject.createImmutable("		, TotalQtyPedida, TotalQtyEnviada, TotalQtyFacturada) \n"),RemoteObject.createImmutable("		values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)\n"),RemoteObject.createImmutable("		")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1077;BA.debugLine="mSQL.ExecNonQuery2(sSQL,Array As Object(IDPedido";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(_ssql),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {24},new Object[] {(_idpedido),(_idtienda),(_nombretienda),(_pedido),(_fechacreacionlong),(_fechaactualizacionlong),(_ordencompra),RemoteObject.createImmutable(("")),(_emailcomprador),(_nombreusuariocomprador),(_apellidousuariocomprador),(_idgrpcliente),(_idcliente),(_iddireccionenvioclienteerp),(_grpclienteerp),(_clienteerp),(_nombreclienteerp),(_nombredireccionenvioclienteerp),(_nombredireccionenvioclienteerp),(_iddireccionfacturacion),(_nombredireccionfacturacion),(_totalqtypedida),(_totalqtyenviada),(_totalqtyfacturada)})))));
 if (true) break;
if (true) break;

case 104:
//C
this.state = -1;
Debug.locals.put("mDataPedido", _mdatapedido);
;
 BA.debugLineNum = 1083;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
Debug.ShouldStop(67108864);
_search_criteria = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("search_criteria")))));Debug.locals.put("search_criteria", _search_criteria);Debug.locals.put("search_criteria", _search_criteria);
 BA.debugLineNum = 1084;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
Debug.ShouldStop(134217728);
_filter_groups = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _search_criteria.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filter_groups")))));Debug.locals.put("filter_groups", _filter_groups);Debug.locals.put("filter_groups", _filter_groups);
 BA.debugLineNum = 1085;BA.debugLine="Dim page_size As Int = search_criteria.Get(\"page_";
Debug.ShouldStop(268435456);
_page_size = BA.numberCast(int.class, _search_criteria.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("page_size")))));Debug.locals.put("page_size", _page_size);Debug.locals.put("page_size", _page_size);
 BA.debugLineNum = 1088;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(-2147483648);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1090;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1091;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static RemoteObject  _cargavaloresatributosizeproductos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaValoresAtributoSizeProductos (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,488);
if (RapidSub.canDelegate("cargavaloresatributosizeproductos")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","cargavaloresatributosizeproductos", __ref);}
ResumableSub_CargaValoresAtributoSizeProductos rsub = new ResumableSub_CargaValoresAtributoSizeProductos(null,__ref);
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
public static class ResumableSub_CargaValoresAtributoSizeProductos extends BA.ResumableSub {
public ResumableSub_CargaValoresAtributoSizeProductos(b4j.docU.cb2blistapedidoscliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2blistapedidoscliente parent;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _label = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaValoresAtributoSizeProductos (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,488);
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
 BA.debugLineNum = 489;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BAtributoSize";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BAtributoSizeProducts")));
 BA.debugLineNum = 490;BA.debugLine="wait for(EnvioDatosAPIMagentoValoresAtributoSizeP";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "cargavaloresatributosizeproductos"), __ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_enviodatosapimagentovaloresatributosizeproductos" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 491;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 492;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 493;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "cargavaloresatributosizeproductos"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Valores atributo size (talla) B2B"))));
this.state = 10;
return;
case 10:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 494;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 497;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(65536);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 498;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(131072);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 499;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(262144);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 500;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(524288);
if (true) break;

case 5:
//for
this.state = 8;
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group11 = _root;
index11 = 0;
groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colroot", _colroot);
this.state = 11;
if (true) break;

case 11:
//C
this.state = 8;
if (index11 < groupLen11) {
this.state = 7;
_colroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group11.runMethod(false,"Get",index11));Debug.locals.put("colroot", _colroot);}
if (true) break;

case 12:
//C
this.state = 11;
index11++;
Debug.locals.put("colroot", _colroot);
if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 501;BA.debugLine="Dim label As String = colroot.Get(\"label\")";
Debug.ShouldStop(1048576);
_label = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("label")))));Debug.locals.put("label", _label);Debug.locals.put("label", _label);
 BA.debugLineNum = 502;BA.debugLine="Dim value As String = colroot.Get(\"value\")";
Debug.ShouldStop(2097152);
_value = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 507;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
Debug.ShouldStop(67108864);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblB2BAtributoSizeProducts")),(Object)(_root));
 BA.debugLineNum = 508;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 509;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
cb2blistapedidoscliente._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cb2blistapedidoscliente._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cb2blistapedidoscliente._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cb2blistapedidoscliente._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private frm As Form";
cb2blistapedidoscliente._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cb2blistapedidoscliente._frm);
 //BA.debugLineNum = 9;BA.debugLine="Private btnSalir As Button";
cb2blistapedidoscliente._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",cb2blistapedidoscliente._btnsalir);
 //BA.debugLineNum = 10;BA.debugLine="Private jamTableView1 As jamTableView";
cb2blistapedidoscliente._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",cb2blistapedidoscliente._jamtableview1);
 //BA.debugLineNum = 12;BA.debugLine="Dim Dialog As B4XDialog";
cb2blistapedidoscliente._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cb2blistapedidoscliente._dialog);
 //BA.debugLineNum = 13;BA.debugLine="Dim mSQL As SQL";
cb2blistapedidoscliente._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cb2blistapedidoscliente._msql);
 //BA.debugLineNum = 15;BA.debugLine="Public PermisoUsuarioModulo As String";
cb2blistapedidoscliente._permisousuariomodulo = RemoteObject.createImmutable("");__ref.setField("_permisousuariomodulo",cb2blistapedidoscliente._permisousuariomodulo);
 //BA.debugLineNum = 16;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
cb2blistapedidoscliente._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cb2blistapedidoscliente._jamloadingindicator1);
 //BA.debugLineNum = 18;BA.debugLine="Private tk As  String";
cb2blistapedidoscliente._tk = RemoteObject.createImmutable("");__ref.setField("_tk",cb2blistapedidoscliente._tk);
 //BA.debugLineNum = 20;BA.debugLine="Type TipoDatosCabeceraPedidoB2B (IDPedido As Int,";
;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","creaciontablassqlite", __ref);}
RemoteObject _screartabla = RemoteObject.createImmutable("");
 BA.debugLineNum = 246;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 247;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BSto";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BStores")));
 BA.debugLineNum = 248;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE tblB2BSt";
Debug.ShouldStop(8388608);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE tblB2BStores (\n"),RemoteObject.createImmutable("	code TEXT,default_store_id INTEGER , name TEXT, root_category_id INT, id INTEGER, website_id INTEGER\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 251;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 253;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BGru";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BGruposCliente")));
 BA.debugLineNum = 254;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE tblB2BGr";
Debug.ShouldStop(536870912);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE tblB2BGruposCliente (\n"),RemoteObject.createImmutable("	code TEXT,tax_class_id INTEGER , id INTEGER, tax_class_name TEXT\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 257;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 259;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BCli";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BClientes")));
 BA.debugLineNum = 260;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
Debug.ShouldStop(8);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS [tblB2BClientes] ([store_id] INTEGER, [firstname] TEXT\n"),RemoteObject.createImmutable("	, [addresses] TEXT, [created_at] TEXT, [extension_attributes] TEXT, [default_shipping] INTEGER default 0, [lastname] TEXT, gender INTEGER default 0, dob INTEGER default 0\n"),RemoteObject.createImmutable("	, [custom_attributes] TEXT, [updated_at] TEXT, [disable_auto_group_change] INTEGER, [group_id] INTEGER, [id] INTEGER\n"),RemoteObject.createImmutable("	, [default_billing] INTEGER default 0, [website_id] INTEGER, [email] TEXT PRIMARY KEY, [created_in] TEXT, [is_blocked] INTEGER default 0\n"),RemoteObject.createImmutable("	, [is_commercial] INTEGER default 0, [company] TEXT default '', [code] TEXT default '', [customer_group_code] TEXT default '', [customer_group_name] TEXT default ''\n"),RemoteObject.createImmutable("	, [language] TEXT default '', [country_id] TEXT '')")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 266;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 268;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BPro";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BProductos")));
 BA.debugLineNum = 269;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(4096);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BProductos] ([visibility] INTEGER, [type_id] TEXT, [created_at] TEXT\n"),RemoteObject.createImmutable("	, [extension_attributes] TEXT, [tier_prices] TEXT, [custom_attributes] TEXT, IDTalla INTEGER default -1, Talla TEXT default '', UnidadMedida TEXT default ''\n"),RemoteObject.createImmutable("	, [attribute_set_id] INTEGER, [updated_at] TEXT, [price] INTEGER default 0\n"),RemoteObject.createImmutable("	, [media_gallery_entries] TEXT, [name] TEXT, [options] TEXT, [id] INTEGER, [sku] TEXT PRIMARY KEY, [product_links] TEXT, [status] INTEGER, weight INTEGER default 0\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 274;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 276;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BDir";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BDireccionesCliente")));
 BA.debugLineNum = 277;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(1048576);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BDireccionesCliente] ([firstname] TEXT,[lastname] TEXT, [city] TEXT\n"),RemoteObject.createImmutable("	, customer_code TEXT default'' , code TEXT default'', [region_id] INTEGER\n"),RemoteObject.createImmutable("	, [postcode] TEXT, [telephone] INTEGER, [default_shipping] TEXT default '', [default_billing] TEXT default '',[custom_attributes] TEXT\n"),RemoteObject.createImmutable("	, [street] TEXT default '', [street1] TEXT default '', [street2] TEXT default '', [street3] TEXT default '', [company] TEXT\n"),RemoteObject.createImmutable("	, [id] INTEGER, [customer_id] INTEGER, [region] TEXT, [country_id] TEXT)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 282;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 285;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BAtr";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BAtributoSizeProducts")));
 BA.debugLineNum = 286;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(536870912);
_screartabla = (RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BAtributoSizeProducts] ([label] TEXT, [value] INTEGER)"));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 287;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 289;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BAtr";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BAtributoUnidadMedidaProductos")));
 BA.debugLineNum = 290;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(2);
_screartabla = (RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BAtributoUnidadMedidaProductos] ([label] TEXT, [value] INTEGER)"));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 291;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 306;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BOrd";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BOrders")));
 BA.debugLineNum = 307;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(262144);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BOrders] ([item_id] INTEGER, [store_id] INTEGER default 0\n"),RemoteObject.createImmutable("	, [order_id] INTEGER,  [created_at] TEXT, [updated_at] TEXT\n"),RemoteObject.createImmutable("	, [po_number] TEXT default ''\n"),RemoteObject.createImmutable("	, [product_type] TEXT\n"),RemoteObject.createImmutable("	, [product_id] INTEGER default 0, parent_id TEXT default ''\n"),RemoteObject.createImmutable("	, line_number INTEGER\n"),RemoteObject.createImmutable("	, [product_option] TEXT\n"),RemoteObject.createImmutable("	, [sku] TEXT,[name] TEXT, [Talla] TEXT DEFAULT ''\n"),RemoteObject.createImmutable("	, [qty_ordered] INTEGER, [qty_canceled] INTEGER, [qty_refunded] INTEGER\n"),RemoteObject.createImmutable("	, [qty_shipped] INTEGER\n"),RemoteObject.createImmutable("	, [base_row_invoiced] INTEGER,[qty_invoiced] INTEGER, [row_invoiced] INTEGER\n"),RemoteObject.createImmutable("	, [base_original_price] REAL default 0, [original_price] REAL default 0, [base_price] REAL, [price] REAL default 0\n"),RemoteObject.createImmutable("	, [tax_percent] REAL default 0\n"),RemoteObject.createImmutable("	, [free_shipping] INTEGER default 0, [discount_amount] REAL default 0\n"),RemoteObject.createImmutable("	, [base_row_total] REAL, [row_total] REAL\n"),RemoteObject.createImmutable("	, [is_qty_decimal] INTEGER default 0)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 323;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 326;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BOrd";
Debug.ShouldStop(32);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BOrdersTotales")));
 BA.debugLineNum = 327;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(64);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BOrdersTotales] ([IDPedido] INTEGER\n"),RemoteObject.createImmutable("	, [IDTienda] INTEGER default 0, [NombreTienda] TEXT ''\n"),RemoteObject.createImmutable("	, [Pedido] TEXT,  [FechaCreacion] INTEGER, [FechaActualizacion] INTEGER\n"),RemoteObject.createImmutable("	, [OrdenCompra] TEXT default ''\n"),RemoteObject.createImmutable("	, [name] TEXT\n"),RemoteObject.createImmutable("	, [EmailComprador] TEXT, [NombreUsuarioComprador] TEXT, [ApellidoUsuarioComprador] TEXT\n"),RemoteObject.createImmutable("	, [IDGRPCliente] INTEGER default 0, [IDCliente] INTEGER default 0, [IDDireccionEnvioClienteERP] INTEGER default 0\n"),RemoteObject.createImmutable("	, [GRPClienteERP] TEXT default '', [ClienteERP] TEXT default '', [NombreClienteERP] TEXT, [NombreDireccionEnvioClienteERP] TEXT default '', IDDireccionFacturacion INTEGER default 0, NombreDireccionFacturacion TEXT default ''\n"),RemoteObject.createImmutable("	, [TotalQtyPedida] INTEGER, [TotalQtyEnviada] INTEGER, [TotalQtyPendienteEnvio] INTEGER default 0, [TotalQtyFacturada] INTEGER, [TotalQtyPendienteFacturar] INTEGER default 0\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 337;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(65536);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 339;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BCat";
Debug.ShouldStop(262144);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BCategoriasProductos")));
 BA.debugLineNum = 340;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(524288);
_screartabla = (RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BCategoriasProductos] ([label] TEXT, [value] INTEGER)"));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 341;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enviodatosapimagentobusquedaclientes(RemoteObject __ref,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaClientes (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,1304);
if (RapidSub.canDelegate("enviodatosapimagentobusquedaclientes")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","enviodatosapimagentobusquedaclientes", __ref, _token);}
ResumableSub_EnvioDatosAPIMagentoBusquedaClientes rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaClientes(null,__ref,_token);
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
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaClientes extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaClientes(b4j.docU.cb2blistapedidoscliente parent,RemoteObject __ref,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2blistapedidoscliente parent;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaClientes (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,1304);
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
Debug.locals.put("Token", _token);
 BA.debugLineNum = 1306;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(33554432);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1307;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(67108864);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1312;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(-2147483648);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/customers/search?\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][field]=firstname&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][value]=%&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][condition_type]=like")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 1317;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(16);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 1319;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(64);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1320;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(128);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 1322;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(512);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 1324;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "enviodatosapimagentobusquedaclientes"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1326;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1327;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","851904535",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 1328;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","851904536",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1329;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(65536);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1330;BA.debugLine="j.Release";
Debug.ShouldStop(131072);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1331;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1334;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(2097152);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1335;BA.debugLine="j.Release";
Debug.ShouldStop(4194304);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1336;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1338;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _enviodatosapimagentoinformacionpedidos(RemoteObject __ref,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidos (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,1094);
if (RapidSub.canDelegate("enviodatosapimagentoinformacionpedidos")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","enviodatosapimagentoinformacionpedidos", __ref, _token);}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidos rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidos(null,__ref,_token);
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
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidos(b4j.docU.cb2blistapedidoscliente parent,RemoteObject __ref,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2blistapedidoscliente parent;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidos (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,1094);
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
Debug.locals.put("Token", _token);
 BA.debugLineNum = 1096;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(128);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1097;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(256);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1101;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(4096);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/orders/?searchCriteria[pageSize] = 0\n"),RemoteObject.createImmutable("	&searchCriteria[filterGroups][0][filters][0][field]=store_id&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][value]=32,35,37,38&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][condition_type]=in")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 1106;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(131072);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 1108;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(524288);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1109;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 1111;BA.debugLine="job.GetRequest.Timeout=30000";
Debug.ShouldStop(4194304);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 30000));
 BA.debugLineNum = 1113;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "enviodatosapimagentoinformacionpedidos"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1115;BA.debugLine="If j.Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1118;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(536870912);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1119;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1120;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1123;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(4);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1124;BA.debugLine="j.Release";
Debug.ShouldStop(8);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1125;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1127;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentolistastores(RemoteObject __ref,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoListaStores (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,1159);
if (RapidSub.canDelegate("enviodatosapimagentolistastores")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","enviodatosapimagentolistastores", __ref, _token);}
ResumableSub_EnvioDatosAPIMagentoListaStores rsub = new ResumableSub_EnvioDatosAPIMagentoListaStores(null,__ref,_token);
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
public static class ResumableSub_EnvioDatosAPIMagentoListaStores extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoListaStores(b4j.docU.cb2blistapedidoscliente parent,RemoteObject __ref,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2blistapedidoscliente parent;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoListaStores (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,1159);
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
Debug.locals.put("Token", _token);
 BA.debugLineNum = 1161;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(256);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1162;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(512);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1165;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(4096);
_squeryapi = (RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/store/storeGroups"));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 1168;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(32768);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 1170;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(131072);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1171;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(262144);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 1173;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 1175;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "enviodatosapimagentolistastores"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1177;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1178;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","851773459",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 1179;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","851773460",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1180;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(134217728);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1181;BA.debugLine="j.Release";
Debug.ShouldStop(268435456);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1182;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1185;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(1);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1186;BA.debugLine="j.Release";
Debug.ShouldStop(2);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1187;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1189;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentovaloresatributosizeproductos(RemoteObject __ref,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoValoresAtributoSizeProductos (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,511);
if (RapidSub.canDelegate("enviodatosapimagentovaloresatributosizeproductos")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","enviodatosapimagentovaloresatributosizeproductos", __ref, _token);}
ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos rsub = new ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos(null,__ref,_token);
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
public static class ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos(b4j.docU.cb2blistapedidoscliente parent,RemoteObject __ref,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2blistapedidoscliente parent;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoValoresAtributoSizeProductos (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,511);
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
Debug.locals.put("Token", _token);
 BA.debugLineNum = 513;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(1);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 514;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(2);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 516;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(8);
_squeryapi = (RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/products/attributes/size/options"));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 518;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(32);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 520;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(128);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 521;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(256);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 523;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(1024);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 525;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "enviodatosapimagentovaloresatributosizeproductos"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 527;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 528;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","851511313",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 529;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","851511314",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 530;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(131072);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 531;BA.debugLine="j.Release";
Debug.ShouldStop(262144);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 532;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 535;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(4194304);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 536;BA.debugLine="j.Release";
Debug.ShouldStop(8388608);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 537;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 539;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("frm_CloseRequest (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 156;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="EventData.Consume";
Debug.ShouldStop(268435456);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Initialize (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.ShouldStop(4);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("Close");};
 BA.debugLineNum = 37;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(16);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(cb2blistapedidoscliente._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(cb2blistapedidoscliente.__c.getField(true,"True")));
 BA.debugLineNum = 42;BA.debugLine="Show";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_show" /*void*/ );
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableview1_accionsalirjamtableview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","jamtableview1_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 349;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 350;BA.debugLine="SalirModulo";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableview1_cambioenceldaseleccionada(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_CambioEnCeldaSeleccionada (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("jamtableview1_cambioenceldaseleccionada")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","jamtableview1_cambioenceldaseleccionada", __ref, _datosceldaseleccionada);}
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 408;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 429;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableview1_cellclick(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_CellClick (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,433);
if (RapidSub.canDelegate("jamtableview1_cellclick")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","jamtableview1_cellclick", __ref, _datosceldaseleccionada);}
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 433;BA.debugLine="Sub jamTableView1_CellClick(DatosCeldaSeleccionada";
Debug.ShouldStop(65536);
 BA.debugLineNum = 434;BA.debugLine="Select DatosCeldaSeleccionada.AliasCampo";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(_datosceldaseleccionada.getField(true,"AliasCampo" /*RemoteObject*/ ))) {
}
;
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableview1_celldobleclick(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_CellDobleClick (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,1340);
if (RapidSub.canDelegate("jamtableview1_celldobleclick")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","jamtableview1_celldobleclick", __ref, _datosceldaseleccionada);}
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _idpedidosel = RemoteObject.createImmutable(0);
RemoteObject _cpedidob2b = RemoteObject.declareNull("b4j.docU.cb2bfichapedidocliente");
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 1340;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1341;BA.debugLine="Dim FilaSel As Int=DatosCeldaSeleccionada.Fila";
Debug.ShouldStop(268435456);
_filasel = _datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 1342;BA.debugLine="Dim IDPedidoSel As Int=jamTableView1.GetValorSQLC";
Debug.ShouldStop(536870912);
_idpedidosel = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IDPedido"))));Debug.locals.put("IDPedidoSel", _idpedidosel);Debug.locals.put("IDPedidoSel", _idpedidosel);
 BA.debugLineNum = 1369;BA.debugLine="Dim cPedidoB2B As cB2BFichaPedidoCliente";
Debug.ShouldStop(16777216);
_cpedidob2b = RemoteObject.createNew ("b4j.docU.cb2bfichapedidocliente");Debug.locals.put("cPedidoB2B", _cpedidob2b);
 BA.debugLineNum = 1370;BA.debugLine="cPedidoB2B.Initialize(IDPedidoSel,tk)";
Debug.ShouldStop(33554432);
_cpedidob2b.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_idpedidosel),(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ )));
 BA.debugLineNum = 1372;BA.debugLine="frm.Close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 1373;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableview1_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,365);
if (RapidSub.canDelegate("jamtableview1_contextmenuitem_action")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","jamtableview1_contextmenuitem_action", __ref, _tagmenuitem);}
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 365;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
Debug.ShouldStop(4096);
 BA.debugLineNum = 366;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(_tagmenuitem)) {
}
;
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableview1_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem);}
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 353;BA.debugLine="Sub jamTableView1_MenuBarMenuItem_Action(TagMenuIt";
Debug.ShouldStop(1);
 BA.debugLineNum = 354;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"))) {
case 0: {
 BA.debugLineNum = 357;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_actualizardatos" /*RemoteObject*/ );
 break; }
}
;
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cb2blistapedidoscliente","salirmodulo", __ref);}
 BA.debugLineNum = 143;BA.debugLine="Sub SalirModulo";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="If jamTableView1.IsInitialized Then";
Debug.ShouldStop(32768);
if (__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 145;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuari";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 };
 BA.debugLineNum = 147;BA.debugLine="frm.Close";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 148;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(524288);
cb2blistapedidoscliente._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Show (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cb2blistapedidoscliente","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cb2blistapedidoscliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2blistapedidoscliente parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cb2blistapedidoscliente) ","cb2blistapedidoscliente",23,__ref.getField(false, "ba"),__ref,45);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 47;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(32768);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 50;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(131072);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 51;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(262144);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 52;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(524288);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 54;BA.debugLine="frm.RootPane.LoadLayout(\"scrB2BListaPedidosClient";
Debug.ShouldStop(2097152);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrB2BListaPedidosCliente")));
 BA.debugLineNum = 55;BA.debugLine="Sleep(0)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "show"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 57;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Lista Pedidos";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Lista Pedidos Cliente B2B")));
 BA.debugLineNum = 59;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(262144);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaPedidosClienteB2B.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 84;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 85;BA.debugLine="Log(mRes)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","850528296",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 86;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 87;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 88;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2blistapedidoscliente", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
 BA.debugLineNum = 89;BA.debugLine="frm.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 90;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 93;BA.debugLine="jamTableView1.AlturaFilas=0    ' 0 si se quiere q";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 97;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaFecha(Arra";
Debug.ShouldStop(1);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnafecha" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("FechaCreacion")),(RemoteObject.createImmutable("FechaActualizacion"))})))));
 BA.debugLineNum = 132;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(8);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 133;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(16);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 136;BA.debugLine="frm.Show";
Debug.ShouldStop(128);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 138;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_actualizardatos" /*RemoteObject*/ );
 BA.debugLineNum = 140;BA.debugLine="End Sub";
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
}