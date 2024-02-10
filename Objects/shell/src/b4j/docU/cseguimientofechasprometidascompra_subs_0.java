package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cseguimientofechasprometidascompra_subs_0 {


public static RemoteObject  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("actualizardatos")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","actualizardatos", __ref);}
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
public ResumableSub_ActualizarDatos(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _fechahoyhora0 = RemoteObject.createImmutable(0L);
RemoteObject _sbqtysenrecepptes = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,164);
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
 BA.debugLineNum = 167;BA.debugLine="Wait For(ActualizarDatosFechasPrometidasComprasPe";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_actualizardatosfechasprometidascompraspendientes" /*RemoteObject*/ ));
this.state = 34;
return;
case 34:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 168;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(128);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 169;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 170;BA.debugLine="SalirModulo";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 171;BA.debugLine="Return False";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 174;BA.debugLine="Dim FechaHoyHora0 As Long=DateUtils.SetDate(DateT";
Debug.ShouldStop(8192);
_fechahoyhora0 = parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("FechaHoyHora0", _fechahoyhora0);Debug.locals.put("FechaHoyHora0", _fechahoyhora0);
 BA.debugLineNum = 176;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDatosFechasPrometidasPedidosCompraPendientes set FechaPrometidaVencida=1 where FechaPrometida>? and FechaPrometida<?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((0)),(_fechahoyhora0)})))));
 BA.debugLineNum = 177;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
Debug.ShouldStop(65536);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDatosFechasPrometidasPedidosCompraPendientes set PendienteSeguimiento=1 where FechaPrometidaVencida=? or FechaPrometida<?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((1)),RemoteObject.createImmutable((0))})))));
 BA.debugLineNum = 178;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDatosFechasPrometidasPedidosCompraPendientes set FechaHoyHora0=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_fechahoyhora0)})))));
 BA.debugLineNum = 179;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
Debug.ShouldStop(262144);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDatosFechasPrometidasPedidosCompraPendientes set DiasRespectoAPlazo=(FechaPrometida-FechaHoyHora0)/? where FechaPrometida>0")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay"))})))));
 BA.debugLineNum = 180;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDatosFechasPrometidasPedidosCompraPendientes set DiasDesdePedido=(FechaHoyHora0-FechaPedido)/?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay"))})))));
 BA.debugLineNum = 181;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDatosFechasPrometidasPedidosCompraPendientes set DiasDesdeReclamacion=(FechaHoyHora0-FechaEnvioReclamacionLong)/? where FechaEnvioReclamacionLong>0")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay"))})))));
 BA.debugLineNum = 183;BA.debugLine="Wait For(CargaDatosPedidosCompraRecepcionesPendie";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_cargadatospedidoscomprarecepcionespendientes" /*RemoteObject*/ ,(Object)(BA.ObjectToString("PROIN")),(Object)(parent.__c.getField(true,"True"))));
this.state = 35;
return;
case 35:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 184;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 185;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 186;BA.debugLine="SalirModulo";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 187;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 190;BA.debugLine="Wait For(CargaDatosPedidosCompraRecepcionesPendie";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_cargadatospedidoscomprarecepcionespendientes" /*RemoteObject*/ ,(Object)(BA.ObjectToString("PROTEC")),(Object)(parent.__c.getField(true,"False"))));
this.state = 36;
return;
case 36:
//C
this.state = 9;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 191;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 192;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 193;BA.debugLine="SalirModulo";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 194;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 197;BA.debugLine="Dim sbQtysEnRecepPtes As StringBuilder";
Debug.ShouldStop(16);
_sbqtysenrecepptes = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbQtysEnRecepPtes", _sbqtysenrecepptes);
 BA.debugLineNum = 198;BA.debugLine="sbQtysEnRecepPtes.Initialize";
Debug.ShouldStop(32);
_sbqtysenrecepptes.runVoidMethod ("Initialize");
 BA.debugLineNum = 199;BA.debugLine="sbQtysEnRecepPtes.Append(\"update tblDatosFechasPr";
Debug.ShouldStop(64);
_sbqtysenrecepptes.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblDatosFechasPrometidasPedidosCompraPendientes as t1 set QtyEnAlmacenRecepcionPendiente=tRecepPtesAlm.QtyRecepPte from")));
 BA.debugLineNum = 200;BA.debugLine="sbQtysEnRecepPtes.Append(\" (Select Pedido, Linea,";
Debug.ShouldStop(128);
_sbqtysenrecepptes.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" (Select Pedido, Linea, Articulo, Talla, sum(QtyARecibir) As QtyRecepPte from tblDatosFechasPrometidasPedidosCompraPendientes tDF join")));
 BA.debugLineNum = 201;BA.debugLine="sbQtysEnRecepPtes.Append(\" tblPedidosCompraRecepc";
Debug.ShouldStop(256);
_sbqtysenrecepptes.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" tblPedidosCompraRecepcionesPendientesAlmacen tPCRPA on tdf.Pedido=tPCRPA.PedidoNav And tdf.Proveedor=tPCRPA.ProvOrigen group by Pedido, Linea, Articulo, Talla) As tRecepPtesAlm")));
 BA.debugLineNum = 202;BA.debugLine="sbQtysEnRecepPtes.Append(\" where t1.Pedido=tRecep";
Debug.ShouldStop(512);
_sbqtysenrecepptes.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where t1.Pedido=tRecepPtesAlm.Pedido And t1.Linea=tRecepPtesAlm.Linea")));
 BA.debugLineNum = 203;BA.debugLine="mSQL.ExecNonQuery(sbQtysEnRecepPtes.tostring)";
Debug.ShouldStop(1024);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbqtysenrecepptes.runMethod(true,"ToString")));
 BA.debugLineNum = 206;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(8192);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblDatosFechasPrometidasPedidosCompraPendientes order by Pedido, Linea")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 207;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(16384);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 208;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), _rsub);
this.state = 37;
return;
case 37:
//C
this.state = 13;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 209;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 210;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(131072);
if (true) break;

case 13:
//if
this.state = 33;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 211;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(262144);
if (true) break;

case 16:
//if
this.state = 23;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 212;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 213;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), _msa);
this.state = 38;
return;
case 38:
//C
this.state = 19;
;
 BA.debugLineNum = 215;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 216;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 19;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 217;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(16777216);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 218;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 219;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 222;BA.debugLine="ExitApplication";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 224;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(-2147483648);

case 23:
//if
this.state = 32;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 225;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(1);
if (true) break;

case 26:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 226;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 227;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = -1;
;
 BA.debugLineNum = 232;BA.debugLine="fx.Msgbox(frm,\"Datos actualizados.\",\"Aviso\")";
Debug.ShouldStop(128);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Datos actualizados.")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 234;BA.debugLine="jamTableView1.AddFiltroCampoValorInicial(\"Pendien";
Debug.ShouldStop(512);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addfiltrocampovalorinicial" /*RemoteObject*/ ,(Object)(BA.ObjectToString("PendienteSeguimiento")),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 236;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 237;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizardatosfechasprometidascompraspendientes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosFechasPrometidasComprasPendientes (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("actualizardatosfechasprometidascompraspendientes")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","actualizardatosfechasprometidascompraspendientes", __ref);}
ResumableSub_ActualizarDatosFechasPrometidasComprasPendientes rsub = new ResumableSub_ActualizarDatosFechasPrometidasComprasPendientes(null,__ref);
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
public static class ResumableSub_ActualizarDatosFechasPrometidasComprasPendientes extends BA.ResumableSub {
public ResumableSub_ActualizarDatosFechasPrometidasComprasPendientes(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosFechasPrometidasComprasPendientes (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,301);
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
 BA.debugLineNum = 302;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblDatosFechasProm";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblDatosFechasPrometidasPedidosCompraPendientes")));
 BA.debugLineNum = 303;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16384);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 304;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(32768);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 305;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 306;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
Debug.ShouldStop(131072);
_slinkjrdc = parent._main._rdclinknav /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 307;BA.debugLine="Dim Comando As String=\"PedidosCompraPendientesFec";
Debug.ShouldStop(262144);
_comando = BA.ObjectToString("PedidosCompraPendientesFechasPrometidasReclamaciones");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 308;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
Debug.ShouldStop(524288);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 310;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "actualizardatosfechasprometidascompraspendientes"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 311;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 312;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 313;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "actualizardatosfechasprometidascompraspendientes"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 314;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 315;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 318;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 319;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 320;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 321;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de .............")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 322;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "actualizardatosfechasprometidascompraspendientes"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 324;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 325;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 326;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(32);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 327;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(64);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblDatosFechasPrometidasPedidosCompraPendientes")),(Object)(_lstreg));
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
 BA.debugLineNum = 330;BA.debugLine="Return mRes";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 331;BA.debugLine="End Sub";
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
public static RemoteObject  _alternarexcluidoreclamacion(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("AlternarExcluidoReclamacion (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,499);
if (RapidSub.canDelegate("alternarexcluidoreclamacion")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","alternarexcluidoreclamacion", __ref, _datosceldaseleccionada);}
RemoteObject _valoractual = RemoteObject.createImmutable(0);
RemoteObject _nuevovalor = RemoteObject.createImmutable(0);
RemoteObject _mpk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pedidosel = RemoteObject.createImmutable("");
RemoteObject _lineasel = RemoteObject.createImmutable("");
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 499;BA.debugLine="Sub AlternarExcluidoReclamacion(DatosCeldaSeleccio";
Debug.ShouldStop(262144);
 BA.debugLineNum = 500;BA.debugLine="Log(DatosCeldaSeleccionada)";
Debug.ShouldStop(524288);
cseguimientofechasprometidascompra.__c.runVoidMethod ("LogImpl","88454145",BA.ObjectToString(_datosceldaseleccionada),0);
 BA.debugLineNum = 501;BA.debugLine="Dim ValorActual As Int= DatosCeldaSeleccionada.Va";
Debug.ShouldStop(1048576);
_valoractual = BA.numberCast(int.class, _datosceldaseleccionada.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("ValorActual", _valoractual);Debug.locals.put("ValorActual", _valoractual);
 BA.debugLineNum = 502;BA.debugLine="Dim NuevoValor As Int";
Debug.ShouldStop(2097152);
_nuevovalor = RemoteObject.createImmutable(0);Debug.locals.put("NuevoValor", _nuevovalor);
 BA.debugLineNum = 503;BA.debugLine="Select ValorActual";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_valoractual,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 505;BA.debugLine="NuevoValor=1";
Debug.ShouldStop(16777216);
_nuevovalor = BA.numberCast(int.class, 1);Debug.locals.put("NuevoValor", _nuevovalor);
 break; }
case 1: {
 BA.debugLineNum = 508;BA.debugLine="NuevoValor=0";
Debug.ShouldStop(134217728);
_nuevovalor = BA.numberCast(int.class, 0);Debug.locals.put("NuevoValor", _nuevovalor);
 break; }
}
;
 BA.debugLineNum = 510;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
Debug.ShouldStop(536870912);
_mpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mpk = _datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mPK", _mpk);Debug.locals.put("mPK", _mpk);
 BA.debugLineNum = 511;BA.debugLine="Dim PedidoSel As String=mPK.Get(\"Pedido\")";
Debug.ShouldStop(1073741824);
_pedidosel = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Pedido")))));Debug.locals.put("PedidoSel", _pedidosel);Debug.locals.put("PedidoSel", _pedidosel);
 BA.debugLineNum = 512;BA.debugLine="Dim LineaSel As String=mPK.Get(\"Linea\")";
Debug.ShouldStop(-2147483648);
_lineasel = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Linea")))));Debug.locals.put("LineaSel", _lineasel);Debug.locals.put("LineaSel", _lineasel);
 BA.debugLineNum = 513;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?")),(Object)(cseguimientofechasprometidascompra.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_nuevovalor),(_pedidosel),(_lineasel)})))));
 BA.debugLineNum = 514;BA.debugLine="jamTableView1.RefrescarTablaValorCeldaEditada(Dat";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescartablavalorceldaeditada" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ )),(Object)(_datosceldaseleccionada.getField(true,"Columna" /*RemoteObject*/ )),(Object)((_nuevovalor)),(Object)(_datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ )));
 BA.debugLineNum = 515;BA.debugLine="jamTableView1.SeleccionarCelda(\"ExcluidoReclamaci";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_seleccionarcelda" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ExcluidoReclamacion")),(Object)(_datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ )));
 BA.debugLineNum = 516;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("asJO (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 143;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Return o";
Debug.ShouldStop(32768);
if (true) return _o;
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _borrarvbsscriptdireccionremitenteemailoutlook(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarVBSScriptDireccionRemitenteEmailOutlook (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1264);
if (RapidSub.canDelegate("borrarvbsscriptdireccionremitenteemailoutlook")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","borrarvbsscriptdireccionremitenteemailoutlook", __ref);}
 BA.debugLineNum = 1264;BA.debugLine="Sub BorrarVBSScriptDireccionRemitenteEmailOutlook";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1265;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc.vbs\")";
Debug.ShouldStop(65536);
if (cseguimientofechasprometidascompra.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc.vbs"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1266;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc.vbs\")";
Debug.ShouldStop(131072);
cseguimientofechasprometidascompra.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc.vbs")));
 };
 BA.debugLineNum = 1268;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _borrarvbsscriptenvioemailoutlook(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarVBSScriptEnvioEmailOutlook (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1399);
if (RapidSub.canDelegate("borrarvbsscriptenvioemailoutlook")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","borrarvbsscriptenvioemailoutlook", __ref);}
 BA.debugLineNum = 1399;BA.debugLine="Sub BorrarVBSScriptEnvioEmailOutlook";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1400;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc2.vbs\")";
Debug.ShouldStop(8388608);
if (cseguimientofechasprometidascompra.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc2.vbs"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1401;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc2.vbs\")";
Debug.ShouldStop(16777216);
cseguimientofechasprometidascompra.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc2.vbs")));
 };
 BA.debugLineNum = 1403;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("btnSalir_Click (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","btnsalir_click", __ref);}
 BA.debugLineNum = 152;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="SalirModulo";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargadatospedidoscomprarecepcionespendientes(RemoteObject __ref,RemoteObject _almfisico,RemoteObject _borrarcontenidotabla) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosPedidosCompraRecepcionesPendientes (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1545);
if (RapidSub.canDelegate("cargadatospedidoscomprarecepcionespendientes")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","cargadatospedidoscomprarecepcionespendientes", __ref, _almfisico, _borrarcontenidotabla);}
ResumableSub_CargaDatosPedidosCompraRecepcionesPendientes rsub = new ResumableSub_CargaDatosPedidosCompraRecepcionesPendientes(null,__ref,_almfisico,_borrarcontenidotabla);
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
public static class ResumableSub_CargaDatosPedidosCompraRecepcionesPendientes extends BA.ResumableSub {
public ResumableSub_CargaDatosPedidosCompraRecepcionesPendientes(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref,RemoteObject _almfisico,RemoteObject _borrarcontenidotabla) {
this.parent = parent;
this.__ref = __ref;
this._almfisico = _almfisico;
this._borrarcontenidotabla = _borrarcontenidotabla;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _almfisico;
RemoteObject _borrarcontenidotabla;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosPedidosCompraRecepcionesPendientes (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1545);
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
Debug.locals.put("AlmFisico", _almfisico);
Debug.locals.put("BorrarContenidoTabla", _borrarcontenidotabla);
 BA.debugLineNum = 1546;BA.debugLine="If BorrarContenidoTabla Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 4;
if (_borrarcontenidotabla.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1547;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblPedidosCompraR";
Debug.ShouldStop(1024);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblPedidosCompraRecepcionesPendientesAlmacen")));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1549;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4096);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1550;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8192);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1551;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1552;BA.debugLine="Select Case AlmFisico";
Debug.ShouldStop(32768);
if (true) break;

case 5:
//select
this.state = 12;
switch (BA.switchObjectToInt(_almfisico,BA.ObjectToString("PROIN"),BA.ObjectToString("PROTEC"))) {
case 0: {
this.state = 7;
if (true) break;
}
case 1: {
this.state = 9;
if (true) break;
}
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 1554;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlAlmPro";
Debug.ShouldStop(131072);
_slinkjrdc = parent._main._rdclinkmysqlalmproin /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1556;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlAlmPro";
Debug.ShouldStop(524288);
_slinkjrdc = parent._main._rdclinkmysqlalmprotec /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1558;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1559;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1560;BA.debugLine="Return mRes";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1563;BA.debugLine="Dim Comando As String=\"PedidosCompraRecepcionesPe";
Debug.ShouldStop(67108864);
_comando = BA.ObjectToString("PedidosCompraRecepcionesPendientes");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1564;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
Debug.ShouldStop(134217728);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1566;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "cargadatospedidoscomprarecepcionespendientes"), null);
this.state = 25;
return;
case 25:
//C
this.state = 13;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1567;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 13:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 24;
 BA.debugLineNum = 1568;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1569;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "cargadatospedidoscomprarecepcionespendientes"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 24;
;
 BA.debugLineNum = 1570;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1571;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1573;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then' puede no hab";
Debug.ShouldStop(16);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 1574;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(32);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1575;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1577;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(256);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1578;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1579;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1024);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1582;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(8192);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblPedidosCompraRecepcionesPendientesAlmacen")),(Object)(_lstreg));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 1585;BA.debugLine="Return mRes";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1586;BA.debugLine="End Sub";
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
public static RemoteObject  _carpetaconfiguradaficherosreclamaciones(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CarpetaConfiguradaFicherosReclamaciones (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,933);
if (RapidSub.canDelegate("carpetaconfiguradaficherosreclamaciones")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","carpetaconfiguradaficherosreclamaciones", __ref);}
ResumableSub_CarpetaConfiguradaFicherosReclamaciones rsub = new ResumableSub_CarpetaConfiguradaFicherosReclamaciones(null,__ref);
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
public static class ResumableSub_CarpetaConfiguradaFicherosReclamaciones extends BA.ResumableSub {
public ResumableSub_CarpetaConfiguradaFicherosReclamaciones(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mcarp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _carpetafich = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CarpetaConfiguradaFicherosReclamaciones (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,933);
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
 BA.debugLineNum = 934;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(32);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 937;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(256);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 938;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 941;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(4096);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("CarpetaDatoAplicacion")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("docU")),(RemoteObject.createImmutable("FicherosReclamacionesFechasPrometidasCompras"))})),(Object)(__ref));
 BA.debugLineNum = 943;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "carpetaconfiguradaficherosreclamaciones"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 944;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 945;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query CarpetaDatoAplicacion")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 946;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "carpetaconfiguradaficherosreclamaciones"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 947;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 948;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 951;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 952;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay defin";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay definida una carpeta predeterminada para ubicar los ficheros de reclamaciones.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 953;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "carpetaconfiguradaficherosreclamaciones"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 954;BA.debugLine="Accion=\"NO\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("NO");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 955;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 957;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 958;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 959;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1073741824);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 960;BA.debugLine="Dim mCarp As Map=lstReg.Get(0)";
Debug.ShouldStop(-2147483648);
_mcarp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mcarp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mCarp", _mcarp);Debug.locals.put("mCarp", _mcarp);
 BA.debugLineNum = 961;BA.debugLine="Dim CarpetaFich As String=mCarp.GetValueAt(0)";
Debug.ShouldStop(1);
_carpetafich = BA.ObjectToString(_mcarp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("CarpetaFich", _carpetafich);Debug.locals.put("CarpetaFich", _carpetafich);
 BA.debugLineNum = 962;BA.debugLine="mRes.Put(\"CarpetaFichero\", CarpetaFich)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CarpetaFichero"))),(Object)((_carpetafich)));
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
 BA.debugLineNum = 965;BA.debugLine="Return mRes";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 966;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
cseguimientofechasprometidascompra._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cseguimientofechasprometidascompra._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
cseguimientofechasprometidascompra._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cseguimientofechasprometidascompra._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private frm As Form";
cseguimientofechasprometidascompra._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cseguimientofechasprometidascompra._frm);
 //BA.debugLineNum = 8;BA.debugLine="Private btnSalir As Button";
cseguimientofechasprometidascompra._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",cseguimientofechasprometidascompra._btnsalir);
 //BA.debugLineNum = 9;BA.debugLine="Private jamTableView1 As jamTableView";
cseguimientofechasprometidascompra._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",cseguimientofechasprometidascompra._jamtableview1);
 //BA.debugLineNum = 11;BA.debugLine="Dim Dialog As B4XDialog";
cseguimientofechasprometidascompra._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cseguimientofechasprometidascompra._dialog);
 //BA.debugLineNum = 12;BA.debugLine="Dim mSQL As SQL";
cseguimientofechasprometidascompra._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cseguimientofechasprometidascompra._msql);
 //BA.debugLineNum = 14;BA.debugLine="Dim DireccionSeleccionadaRemitenteEmails As Strin";
cseguimientofechasprometidascompra._direccionseleccionadaremitenteemails = RemoteObject.createImmutable("");__ref.setField("_direccionseleccionadaremitenteemails",cseguimientofechasprometidascompra._direccionseleccionadaremitenteemails);
 //BA.debugLineNum = 16;BA.debugLine="Public PermisoUsuarioModulo As String";
cseguimientofechasprometidascompra._permisousuariomodulo = RemoteObject.createImmutable("");__ref.setField("_permisousuariomodulo",cseguimientofechasprometidascompra._permisousuariomodulo);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 241;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(65536);
 BA.debugLineNum = 242;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(131072);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cseguimientofechasprometidascompra.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblDatosFechasPrometidasPedidosCompraPendientes")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 243;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 244;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblDatosFechasProm";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblDatosFechasPrometidasPedidosCompraPendientes")));
 };
 BA.debugLineNum = 246;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(2097152);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 247;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 248;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblDatosFechasPrometidasPedidosCompraPendientes (")));
 BA.debugLineNum = 251;BA.debugLine="sbCrearTabla.Append(\"Pedido TEXT COLLATE NOCASE,\"";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Pedido TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 252;BA.debugLine="sbCrearTabla.Append(\"Proveedor TEXT COLLATE NOCAS";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Proveedor TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 253;BA.debugLine="sbCrearTabla.Append(\"NombreProveedor TEXT COLLATE";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreProveedor TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 254;BA.debugLine="sbCrearTabla.Append(\"DireccionEmail TEXT COLLATE";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DireccionEmail TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 255;BA.debugLine="sbCrearTabla.Append(\"FechaPedido INTEGER,\")";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPedido INTEGER,")));
 BA.debugLineNum = 256;BA.debugLine="sbCrearTabla.Append(\"DiasDesdePedido INTEGER defa";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DiasDesdePedido INTEGER default 0,")));
 BA.debugLineNum = 257;BA.debugLine="sbCrearTabla.Append(\"VPG TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("VPG TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 258;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER ,\")";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Linea INTEGER ,")));
 BA.debugLineNum = 259;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(4);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 260;BA.debugLine="sbCrearTabla.Append(\"DescripcionArticulo TEXT COL";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DescripcionArticulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 261;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 262;BA.debugLine="sbCrearTabla.Append(\"Qty REAL,\")";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Qty REAL,")));
 BA.debugLineNum = 263;BA.debugLine="sbCrearTabla.Append(\"QtyRecibida REAL,\")";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyRecibida REAL,")));
 BA.debugLineNum = 264;BA.debugLine="sbCrearTabla.Append(\"QtyPendiente REAL,\")";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPendiente REAL,")));
 BA.debugLineNum = 265;BA.debugLine="sbCrearTabla.Append(\"QtyARecibir REAL,\")";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyARecibir REAL,")));
 BA.debugLineNum = 266;BA.debugLine="sbCrearTabla.Append(\"QtyEnAlmacenRecepcionPendien";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyEnAlmacenRecepcionPendiente REAL default 0,")));
 BA.debugLineNum = 267;BA.debugLine="sbCrearTabla.Append(\"RecPteRecep REAL,\")";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("RecPteRecep REAL,")));
 BA.debugLineNum = 268;BA.debugLine="sbCrearTabla.Append(\"FechaPrometida INTEGER,\")";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrometida INTEGER,")));
 BA.debugLineNum = 269;BA.debugLine="sbCrearTabla.Append(\"FechaPrometidaOriginal INTEG";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrometidaOriginal INTEGER,")));
 BA.debugLineNum = 270;BA.debugLine="sbCrearTabla.Append(\"FechaPrometidaOriginalModifi";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrometidaOriginalModificada INTEGER,")));
 BA.debugLineNum = 271;BA.debugLine="sbCrearTabla.Append(\"FechaPrometidaVencida INTEGE";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrometidaVencida INTEGER default 0,")));
 BA.debugLineNum = 272;BA.debugLine="sbCrearTabla.Append(\"PendienteSeguimiento INTEGER";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PendienteSeguimiento INTEGER default 0,")));
 BA.debugLineNum = 273;BA.debugLine="sbCrearTabla.Append(\"FechaHoyHora0 INTEGER defaul";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaHoyHora0 INTEGER default 0,")));
 BA.debugLineNum = 274;BA.debugLine="sbCrearTabla.Append(\"DiasRespectoAPlazo INTEGER d";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DiasRespectoAPlazo INTEGER default 0,")));
 BA.debugLineNum = 275;BA.debugLine="sbCrearTabla.Append(\"ExcluidoReclamacion INTEGER";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ExcluidoReclamacion INTEGER default 0,")));
 BA.debugLineNum = 276;BA.debugLine="sbCrearTabla.Append(\"IDReclamacionFPC INTEGER def";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDReclamacionFPC INTEGER default 0,")));
 BA.debugLineNum = 277;BA.debugLine="sbCrearTabla.Append(\"FechaEnvioReclamacionLong IN";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaEnvioReclamacionLong INTEGER default 0,")));
 BA.debugLineNum = 278;BA.debugLine="sbCrearTabla.Append(\"DiasDesdeReclamacion INTEGER";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DiasDesdeReclamacion INTEGER default 0,")));
 BA.debugLineNum = 279;BA.debugLine="sbCrearTabla.Append(\"IDUsuario INTEGER default 0,";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDUsuario INTEGER default 0,")));
 BA.debugLineNum = 280;BA.debugLine="sbCrearTabla.Append(\"NombreUsuario TEXT COLLATE N";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreUsuario TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 281;BA.debugLine="sbCrearTabla.Append(\"DireccionEmailRemitente TEXT";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DireccionEmailRemitente TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 282;BA.debugLine="sbCrearTabla.Append(\"DireccionEmailDestinatario T";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DireccionEmailDestinatario TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 283;BA.debugLine="sbCrearTabla.Append(\"ReclamacionFPC TEXT COLLATE";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ReclamacionFPC TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 284;BA.debugLine="sbCrearTabla.Append(\"RecepcionesPendientes INTEGE";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("RecepcionesPendientes INTEGER default 0)")));
 BA.debugLineNum = 287;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 289;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(1);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cseguimientofechasprometidascompra.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblPedidosCompraRecepcionesPendientesAlmacen")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 290;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 291;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblPedidosCompraRe";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblPedidosCompraRecepcionesPendientesAlmacen")));
 };
 BA.debugLineNum = 293;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(16);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 294;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 295;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE If Not EXISTS [";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblPedidosCompraRecepcionesPendientesAlmacen] ([LR] INTEGER, [FechaCreacion] INTEGER, [PedidoNav] TEXT, [ProvOrigen] TEXT)")));
 BA.debugLineNum = 296;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearcabecerareclamacion(RemoteObject __ref,RemoteObject _fenviolong,RemoteObject _idu,RemoteObject _nombreusu,RemoteObject _diremailrem,RemoteObject _diremaildest) throws Exception{
try {
		Debug.PushSubsStack("CrearCabeceraReclamacion (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1504);
if (RapidSub.canDelegate("crearcabecerareclamacion")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","crearcabecerareclamacion", __ref, _fenviolong, _idu, _nombreusu, _diremailrem, _diremaildest);}
ResumableSub_CrearCabeceraReclamacion rsub = new ResumableSub_CrearCabeceraReclamacion(null,__ref,_fenviolong,_idu,_nombreusu,_diremailrem,_diremaildest);
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
public static class ResumableSub_CrearCabeceraReclamacion extends BA.ResumableSub {
public ResumableSub_CrearCabeceraReclamacion(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref,RemoteObject _fenviolong,RemoteObject _idu,RemoteObject _nombreusu,RemoteObject _diremailrem,RemoteObject _diremaildest) {
this.parent = parent;
this.__ref = __ref;
this._fenviolong = _fenviolong;
this._idu = _idu;
this._nombreusu = _nombreusu;
this._diremailrem = _diremailrem;
this._diremaildest = _diremaildest;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _fenviolong;
RemoteObject _idu;
RemoteObject _nombreusu;
RemoteObject _diremailrem;
RemoteObject _diremaildest;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CrearCabeceraReclamacion (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1504);
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
Debug.locals.put("FEnvioLong", _fenviolong);
Debug.locals.put("IDU", _idu);
Debug.locals.put("NombreUsu", _nombreusu);
Debug.locals.put("DirEmailRem", _diremailrem);
Debug.locals.put("DirEmailDest", _diremaildest);
 BA.debugLineNum = 1506;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1507;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1508;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1509;BA.debugLine="Dim Comando As String=\"NuevaReclamacionFechasProm";
Debug.ShouldStop(16);
_comando = BA.ObjectToString("NuevaReclamacionFechasPrometidasCompras");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1510;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(32);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_fenviolong),(_idu),(_nombreusu),(_diremailrem),(_diremaildest)})),(Object)(__ref));
 BA.debugLineNum = 1512;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "crearcabecerareclamacion"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1514;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 1515;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1516;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "crearcabecerareclamacion"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1517;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1518;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1521;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 1522;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1523;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1525;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1048576);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1526;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(2097152);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 1527;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(4194304);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1528;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(8388608);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1529;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de SP";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de SP "),_sresp,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1530;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "crearcabecerareclamacion"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 1531;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1533;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1534;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1535;BA.debugLine="mRes.Put(\"IDReclamacionFPC\", mResp.Get(\"IDRecl";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDReclamacionFPC"))),(Object)(_mresp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDReclamacionFPC"))))));
 BA.debugLineNum = 1536;BA.debugLine="mRes.Put(\"ReclamacionFPC\", mResp.Get(\"Reclamac";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReclamacionFPC"))),(Object)(_mresp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReclamacionFPC"))))));
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
 BA.debugLineNum = 1540;BA.debugLine="Return mRes";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1541;BA.debugLine="End Sub";
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
public static RemoteObject  _crearvbsscriptdireccionremitenteemailoutlook(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CrearVBSScriptDireccionRemitenteEmailOutlook (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1198);
if (RapidSub.canDelegate("crearvbsscriptdireccionremitenteemailoutlook")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","crearvbsscriptdireccionremitenteemailoutlook", __ref);}
RemoteObject _svbscript = RemoteObject.createImmutable("");
 BA.debugLineNum = 1198;BA.debugLine="Sub CrearVBSScriptDireccionRemitenteEmailOutlook";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1200;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlook";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_borrarvbsscriptdireccionremitenteemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 1202;BA.debugLine="Dim sVBscript As String";
Debug.ShouldStop(131072);
_svbscript = RemoteObject.createImmutable("");Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 1204;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
Debug.ShouldStop(524288);
_svbscript = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Option Explicit\n"),RemoteObject.createImmutable("		On Error Resume Next\n"),RemoteObject.createImmutable("		Dim xOLApp, olAccounts\n"),RemoteObject.createImmutable("		Dim objStdOut,objStdErr\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("		Set objStdOut = WScript.StdOut\n"),RemoteObject.createImmutable("		Set objStdErr = WScript.StdErr\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("		'Set xOLApp = CreateObject(\"Outlook.Application\")\n"),RemoteObject.createImmutable("		Set xOLApp =GetObject(, \"Outlook.Application\")\n"),RemoteObject.createImmutable("		If Err.Number<>0 Then\n"),RemoteObject.createImmutable("			If Err.Number=429 Then\n"),RemoteObject.createImmutable("				'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("			Else\n"),RemoteObject.createImmutable("				'MsgBox Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("				objStdErr.Write Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("			End If\n"),RemoteObject.createImmutable("			WScript.Quit (1) 'return code 1\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Dim i\n"),RemoteObject.createImmutable("		For i = 1 To xOLApp.Session.Accounts.count\n"),RemoteObject.createImmutable("			objStdOut.Write xOLApp.Session.Accounts.Item(i) & \",\"\n"),RemoteObject.createImmutable("		Next\n"),RemoteObject.createImmutable("		Set xOLApp = Nothing\n"),RemoteObject.createImmutable("		If Err.Number<>0 Then\n"),RemoteObject.createImmutable("			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"),RemoteObject.createImmutable("			WScript.Quit (1)\n"),RemoteObject.createImmutable("		Else\n"),RemoteObject.createImmutable("			WScript.Quit (0)\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("			")));Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 1261;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc.vbs\"";
Debug.ShouldStop(4096);
cseguimientofechasprometidascompra.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(BA.ObjectToString("smfpromc.vbs")),(Object)(_svbscript));
 BA.debugLineNum = 1262;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearvbsscriptenvioemailoutlookhtml(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CrearVBSScriptEnvioEmailOutlookHTML (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1331);
if (RapidSub.canDelegate("crearvbsscriptenvioemailoutlookhtml")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","crearvbsscriptenvioemailoutlookhtml", __ref);}
RemoteObject _svbscript = RemoteObject.createImmutable("");
 BA.debugLineNum = 1331;BA.debugLine="Sub CrearVBSScriptEnvioEmailOutlookHTML";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1333;BA.debugLine="BorrarVBSScriptEnvioEmailOutlook";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_borrarvbsscriptenvioemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 1335;BA.debugLine="Dim sVBscript As String";
Debug.ShouldStop(4194304);
_svbscript = RemoteObject.createImmutable("");Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 1337;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
Debug.ShouldStop(16777216);
_svbscript = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Option Explicit\n"),RemoteObject.createImmutable("		On Error Resume Next\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Dim objStdOut,objStdErr\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("		Set objStdOut = WScript.StdOut\n"),RemoteObject.createImmutable("		Set objStdErr = WScript.StdErr\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		Dim xOLApp\n"),RemoteObject.createImmutable("		Dim objMailItem\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		'Dim OutAccount\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		Dim signature\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("		'Set xOLApp = CreateObject(\"Outlook.Application\")\n"),RemoteObject.createImmutable("		Set xOLApp =GetObject(, \"Outlook.Application\")\n"),RemoteObject.createImmutable("		If Err.Number<>0 Then\n"),RemoteObject.createImmutable("			If Err.Number=429 Then\n"),RemoteObject.createImmutable("				'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("			Else\n"),RemoteObject.createImmutable("				'MsgBox Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("				objStdErr.Write Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("			End If\n"),RemoteObject.createImmutable("			WScript.Quit (1) 'return code 1\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("		Set objMailItem = xOLApp.CreateItem(0)\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("   		objMailItem.Display\n"),RemoteObject.createImmutable("		signature = objMailItem.HTMLBody\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		'Set OutAccount = xOLApp.Session.Accounts(WScript.Arguments(0))\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		objMailItem.SentOnBehalfOfName = WScript.Arguments(0)\n"),RemoteObject.createImmutable("		'objMailItem.SendUsingAccount = WScript.Arguments(0)\n"),RemoteObject.createImmutable("		'objMailItem.SendUsingAccount = OutAccount\n"),RemoteObject.createImmutable("		'objMailItem.SentOnBehalfOfName = OutAccount\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		objMailItem.To = WScript.Arguments(1)\n"),RemoteObject.createImmutable("		if WScript.Arguments(5)<>\"None\" then\n"),RemoteObject.createImmutable("			objMailItem.CC = WScript.Arguments(5)\n"),RemoteObject.createImmutable("		end if\n"),RemoteObject.createImmutable("		objMailItem.Subject = WScript.Arguments(2)\n"),RemoteObject.createImmutable("		'objMailItem.HTMLBody = WScript.Arguments(3) & \"<br><br>\" & objMailItem.HTMLBody & \"</p>\"\n"),RemoteObject.createImmutable("		objMailItem.HTMLBody = \"<p><br>\" & WScript.Arguments(3) & \"<br>\" & signature & \"</p>\"\n"),RemoteObject.createImmutable("		objMailItem.Attachments.Add WScript.Arguments(4)\n"),RemoteObject.createImmutable("		'objMailItem.Send\n"),RemoteObject.createImmutable("		Set xOLApp = Nothing\n"),RemoteObject.createImmutable("		Set objMailItem = Nothing\n"),RemoteObject.createImmutable("		If Err.Number = 0 Then\n"),RemoteObject.createImmutable("			objStdOut.Write \"Email enviado\"\n"),RemoteObject.createImmutable("			WScript.Quit (0)\n"),RemoteObject.createImmutable("		Else\n"),RemoteObject.createImmutable("			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"),RemoteObject.createImmutable("			WScript.Quit (1)\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("			")));Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 1396;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc2.vbs";
Debug.ShouldStop(524288);
cseguimientofechasprometidascompra.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(BA.ObjectToString("smfpromc2.vbs")),(Object)(_svbscript));
 BA.debugLineNum = 1397;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ejecutarvbsscriptdireccionesemail(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EjecutarVBSScriptDireccionesEmail (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1462);
if (RapidSub.canDelegate("ejecutarvbsscriptdireccionesemail")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","ejecutarvbsscriptdireccionesemail", __ref);}
ResumableSub_EjecutarVBSScriptDireccionesEmail rsub = new ResumableSub_EjecutarVBSScriptDireccionesEmail(null,__ref);
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
public static class ResumableSub_EjecutarVBSScriptDireccionesEmail extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptDireccionesEmail(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EjecutarVBSScriptDireccionesEmail (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1462);
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
 BA.debugLineNum = 1463;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4194304);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1464;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1465;BA.debugLine="Dim shl As Shell";
Debug.ShouldStop(16777216);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 1466;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
Debug.ShouldStop(33554432);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(BA.ObjectToString("c:\\windows\\system32\\cscript.exe")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("//nologo"),RemoteObject.createImmutable("smfpromc.vbs")})))));
 BA.debugLineNum = 1467;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
Debug.ShouldStop(67108864);
_shl.runMethod(true,"setWorkingDirectory",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder"));
 BA.debugLineNum = 1468;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(134217728);
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 1469;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.ShouldStop(268435456);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 1470;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "ejecutarvbsscriptdireccionesemail"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 1471;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1472;BA.debugLine="Log(\"Success\")";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","89175050",RemoteObject.createImmutable("Success"),0);
 BA.debugLineNum = 1473;BA.debugLine="Log(StdOut)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","89175051",_stdout,0);
 BA.debugLineNum = 1474;BA.debugLine="mRes.Put(\"Success\",True)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 1475;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdOut"))),(Object)((_stdout)));
 BA.debugLineNum = 1476;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdErr"))),(Object)((_stderr)));
 BA.debugLineNum = 1477;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ExitCode"))),(Object)((_exitcode)));
 BA.debugLineNum = 1478;BA.debugLine="Return mRes";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1479;BA.debugLine="End Sub";
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
public static void  _shl_processcompleted(RemoteObject __ref,RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
}
public static RemoteObject  _ejecutarvbsscriptenviaremail(RemoteObject __ref,RemoteObject _senderaddr,RemoteObject _receiveraddr,RemoteObject _subject,RemoteObject _body,RemoteObject _fileattch,RemoteObject _ccreceiveraddr) throws Exception{
try {
		Debug.PushSubsStack("EjecutarVBSScriptEnviarEmail (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1481);
if (RapidSub.canDelegate("ejecutarvbsscriptenviaremail")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","ejecutarvbsscriptenviaremail", __ref, _senderaddr, _receiveraddr, _subject, _body, _fileattch, _ccreceiveraddr);}
ResumableSub_EjecutarVBSScriptEnviarEmail rsub = new ResumableSub_EjecutarVBSScriptEnviarEmail(null,__ref,_senderaddr,_receiveraddr,_subject,_body,_fileattch,_ccreceiveraddr);
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
public static class ResumableSub_EjecutarVBSScriptEnviarEmail extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptEnviarEmail(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref,RemoteObject _senderaddr,RemoteObject _receiveraddr,RemoteObject _subject,RemoteObject _body,RemoteObject _fileattch,RemoteObject _ccreceiveraddr) {
this.parent = parent;
this.__ref = __ref;
this._senderaddr = _senderaddr;
this._receiveraddr = _receiveraddr;
this._subject = _subject;
this._body = _body;
this._fileattch = _fileattch;
this._ccreceiveraddr = _ccreceiveraddr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _senderaddr;
RemoteObject _receiveraddr;
RemoteObject _subject;
RemoteObject _body;
RemoteObject _fileattch;
RemoteObject _ccreceiveraddr;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EjecutarVBSScriptEnviarEmail (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1481);
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
Debug.locals.put("SenderAddr", _senderaddr);
Debug.locals.put("ReceiverAddr", _receiveraddr);
Debug.locals.put("Subject", _subject);
Debug.locals.put("Body", _body);
Debug.locals.put("FileAttch", _fileattch);
Debug.locals.put("CCReceiverAddr", _ccreceiveraddr);
 BA.debugLineNum = 1483;BA.debugLine="Body=Body.Replace(CRLF,\"<br>\")";
Debug.ShouldStop(1024);
_body = _body.runMethod(true,"replace",(Object)(parent.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("<br>")));Debug.locals.put("Body", _body);
 BA.debugLineNum = 1485;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4096);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1486;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1487;BA.debugLine="Dim shl As Shell";
Debug.ShouldStop(16384);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 1488;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
Debug.ShouldStop(32768);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(BA.ObjectToString("c:\\windows\\system32\\cscript.exe")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {8},new Object[] {BA.ObjectToString("//nologo"),BA.ObjectToString("smfpromc2.vbs"),_senderaddr,_receiveraddr,_subject,_body,_fileattch,_ccreceiveraddr})))));
 BA.debugLineNum = 1489;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
Debug.ShouldStop(65536);
_shl.runMethod(true,"setWorkingDirectory",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder"));
 BA.debugLineNum = 1490;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(131072);
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 1491;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 1492;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "ejecutarvbsscriptenviaremail"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 1493;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1494;BA.debugLine="Log(\"Success\")";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","89240589",RemoteObject.createImmutable("Success"),0);
 BA.debugLineNum = 1495;BA.debugLine="Log(StdOut)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","89240590",_stdout,0);
 BA.debugLineNum = 1496;BA.debugLine="mRes.Put(\"Success\",True)";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 1497;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdOut"))),(Object)((_stdout)));
 BA.debugLineNum = 1498;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdErr"))),(Object)((_stderr)));
 BA.debugLineNum = 1499;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ExitCode"))),(Object)((_exitcode)));
 BA.debugLineNum = 1500;BA.debugLine="Return mRes";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1501;BA.debugLine="End Sub";
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
public static void  _emailreclamacionproveedor(RemoteObject __ref,RemoteObject _proveedor,RemoteObject _nombreproveedor,RemoteObject _direccionemail) throws Exception{
try {
		Debug.PushSubsStack("EmailReclamacionProveedor (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,531);
if (RapidSub.canDelegate("emailreclamacionproveedor")) { __ref.runUserSub(false, "cseguimientofechasprometidascompra","emailreclamacionproveedor", __ref, _proveedor, _nombreproveedor, _direccionemail); return;}
ResumableSub_EmailReclamacionProveedor rsub = new ResumableSub_EmailReclamacionProveedor(null,__ref,_proveedor,_nombreproveedor,_direccionemail);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EmailReclamacionProveedor extends BA.ResumableSub {
public ResumableSub_EmailReclamacionProveedor(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref,RemoteObject _proveedor,RemoteObject _nombreproveedor,RemoteObject _direccionemail) {
this.parent = parent;
this.__ref = __ref;
this._proveedor = _proveedor;
this._nombreproveedor = _nombreproveedor;
this._direccionemail = _direccionemail;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _proveedor;
RemoteObject _nombreproveedor;
RemoteObject _direccionemail;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lineasrecl = RemoteObject.createImmutable(0);
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _carpetafichero = RemoteObject.createImmutable("");
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _direcciondestinoemail = RemoteObject.createImmutable("");
RemoteObject _direcciondestinoemailcc = RemoteObject.createImmutable("");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _idrecl = RemoteObject.createImmutable(0);
RemoteObject _recl = RemoteObject.createImmutable("");
RemoteObject _lstcomandos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rspedlin = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _xl = RemoteObject.declareNull("b4j.docU.xlutils");
RemoteObject _workbook = RemoteObject.declareNull("b4j.docU.xlworkbookwriter");
RemoteObject _sheet1 = RemoteObject.declareNull("b4j.docU.xlsheetwriter");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _numcolsrs = RemoteObject.createImmutable(0);
RemoteObject _headerstyle = RemoteObject.declareNull("b4j.docU.xlstyle");
int _idxcol = 0;
RemoteObject _fechasstyle = RemoteObject.declareNull("b4j.docU.xlstyle");
RemoteObject _rowstyles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _idxfila = RemoteObject.createImmutable(0);
RemoteObject _nombrecampo = RemoteObject.createImmutable("");
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _tickshora0 = RemoteObject.createImmutable(0L);
RemoteObject _ultimafila = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _sbbody = RemoteObject.createImmutable("");
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
int step135;
int limit135;
int step147;
int limit147;
int step180;
int limit180;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EmailReclamacionProveedor (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,531);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Proveedor", _proveedor);
Debug.locals.put("NombreProveedor", _nombreproveedor);
Debug.locals.put("DireccionEmail", _direccionemail);
 BA.debugLineNum = 532;BA.debugLine="If PermisoUsuarioModulo<>\"RW\" And PermisoUsuarioM";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_permisousuariomodulo" /*RemoteObject*/ ),BA.ObjectToString("RW")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_permisousuariomodulo" /*RemoteObject*/ ),BA.ObjectToString("ADMIN"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 533;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes per";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No tienes permiso para enviar email de reclamación.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 534;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 155;
return;
case 155:
//C
this.state = 4;
;
 BA.debugLineNum = 535;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 538;BA.debugLine="Dim LineasRecl As Int=jamTableView1.FixNullInt(mS";
Debug.ShouldStop(33554432);
_lineasrecl = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? and ExcluidoReclamacion=? order by Pedido, Linea")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_proveedor,BA.NumberToString(0)}))))))));Debug.locals.put("LineasRecl", _lineasrecl);Debug.locals.put("LineasRecl", _lineasrecl);
 BA.debugLineNum = 539;BA.debugLine="If LineasRecl=0 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_lineasrecl,BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 540;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay líneas";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay líneas no excluidas para enviar en la reclamación de plazo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 541;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 156;
return;
case 156:
//C
this.state = 8;
;
 BA.debugLineNum = 542;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 545;BA.debugLine="Wait For(CarpetaConfiguradaFicherosReclamaciones)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_carpetaconfiguradaficherosreclamaciones" /*RemoteObject*/ ));
this.state = 157;
return;
case 157:
//C
this.state = 9;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 546;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(2);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 547;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(4);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
if (true) return ;
if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 548;BA.debugLine="Dim CarpetaFichero As String=mRes.Get(\"CarpetaFic";
Debug.ShouldStop(8);
_carpetafichero = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CarpetaFichero")))));Debug.locals.put("CarpetaFichero", _carpetafichero);Debug.locals.put("CarpetaFichero", _carpetafichero);
 BA.debugLineNum = 550;BA.debugLine="If File.Exists(CarpetaFichero,\"\")=False Then";
Debug.ShouldStop(32);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_carpetafichero),(Object)(RemoteObject.createImmutable(""))),parent.__c.getField(true,"False"))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 551;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No existe la";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No existe la carpeta configurada para grabar los ficheros de reclamaciones."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_carpetafichero)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 552;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 158;
return;
case 158:
//C
this.state = 18;
;
 BA.debugLineNum = 553;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 556;BA.debugLine="Dialog.Title=\"Confirma Dirección Email Destinatar";
Debug.ShouldStop(2048);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Confirma Dirección Email Destinatario")));
 BA.debugLineNum = 557;BA.debugLine="Dialog.TitleBarHeight=50dip";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 558;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(8192);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 559;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(16384);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 560;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(32768);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 561;BA.debugLine="InputDlg.Text=DireccionEmail.Trim";
Debug.ShouldStop(65536);
_inputdlg.setField ("_text" /*RemoteObject*/ ,_direccionemail.runMethod(true,"trim"));
 BA.debugLineNum = 562;BA.debugLine="InputDlg.RegexPattern=\"^(?i)[a-z0-9!#$%&'*+/=?^_`";
Debug.ShouldStop(131072);
_inputdlg.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$"));
 BA.debugLineNum = 565;BA.debugLine="InputDlg.mBase.Width = 600dip";
Debug.ShouldStop(1048576);
_inputdlg.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600)))));
 BA.debugLineNum = 567;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.ShouldStop(4194304);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 568;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(8388608);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 569;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(16777216);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 570;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(33554432);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 571;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(67108864);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 572;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(134217728);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 573;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(268435456);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 574;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _rsub);
this.state = 159;
return;
case 159:
//C
this.state = 19;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 576;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 577;BA.debugLine="Dim DireccionDestinoEmail As String=InputDlg.Text";
Debug.ShouldStop(1);
_direcciondestinoemail = _inputdlg.getField(true,"_text" /*RemoteObject*/ ).runMethod(true,"trim");Debug.locals.put("DireccionDestinoEmail", _direcciondestinoemail);Debug.locals.put("DireccionDestinoEmail", _direcciondestinoemail);
 BA.debugLineNum = 579;BA.debugLine="Dim DireccionDestinoEmailCC As String";
Debug.ShouldStop(4);
_direcciondestinoemailcc = RemoteObject.createImmutable("");Debug.locals.put("DireccionDestinoEmailCC", _direcciondestinoemailcc);
 BA.debugLineNum = 581;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Añadir otr";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Añadir otra dirección de email a la que enviar el mensaje en copia?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 582;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 160;
return;
case 160:
//C
this.state = 25;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 583;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(64);
if (true) break;

case 25:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 584;BA.debugLine="Dialog.Title=\"Indica Dirección Email Destinatari";
Debug.ShouldStop(128);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Dirección Email Destinatario (Copia)")));
 BA.debugLineNum = 585;BA.debugLine="Dialog.TitleBarHeight=50dip";
Debug.ShouldStop(256);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 586;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(512);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 587;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(1024);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 588;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(2048);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 589;BA.debugLine="InputDlg.Text=\"\"";
Debug.ShouldStop(4096);
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 590;BA.debugLine="InputDlg.RegexPattern=\"^(?i)[a-z0-9!#$%&'*+/=?^_";
Debug.ShouldStop(8192);
_inputdlg.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$"));
 BA.debugLineNum = 593;BA.debugLine="InputDlg.mBase.Width = 600dip";
Debug.ShouldStop(65536);
_inputdlg.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600)))));
 BA.debugLineNum = 595;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inp";
Debug.ShouldStop(262144);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 596;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRe";
Debug.ShouldStop(524288);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 597;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(1048576);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 598;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dial";
Debug.ShouldStop(2097152);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 599;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(4194304);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 600;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(8388608);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 601;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(16777216);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 602;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _rsub);
this.state = 161;
return;
case 161:
//C
this.state = 28;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 604;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(134217728);
if (true) break;

case 28:
//if
this.state = 37;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 30;
}else {
this.state = 36;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 605;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No se ha";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha añadido direccion de email destinatario (copia) ¿Continuar con el proceso?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 606;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 162;
return;
case 162:
//C
this.state = 31;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 607;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 608;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 34:
//C
this.state = 37;
;
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 611;BA.debugLine="Dim DireccionDestinoEmailCC As String=InputDlg.";
Debug.ShouldStop(4);
_direcciondestinoemailcc = _inputdlg.getField(true,"_text" /*RemoteObject*/ ).runMethod(true,"trim");Debug.locals.put("DireccionDestinoEmailCC", _direcciondestinoemailcc);Debug.locals.put("DireccionDestinoEmailCC", _direcciondestinoemailcc);
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;
;
 BA.debugLineNum = 615;BA.debugLine="If DireccionDestinoEmailCC=\"\" Then DireccionDesti";
Debug.ShouldStop(64);

case 38:
//if
this.state = 43;
if (RemoteObject.solveBoolean("=",_direcciondestinoemailcc,BA.ObjectToString(""))) { 
this.state = 40;
;}if (true) break;

case 40:
//C
this.state = 43;
_direcciondestinoemailcc = BA.ObjectToString("None");Debug.locals.put("DireccionDestinoEmailCC", _direcciondestinoemailcc);
if (true) break;

case 43:
//C
this.state = 44;
;
 BA.debugLineNum = 656;BA.debugLine="If DireccionSeleccionadaRemitenteEmails=\"\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 44:
//if
this.state = 59;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_direccionseleccionadaremitenteemails" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 46;
}else {
this.state = 52;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 658;BA.debugLine="wait for (SeleccionarDireccionRemitenteEmails) c";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_seleccionardireccionremitenteemails" /*RemoteObject*/ ));
this.state = 163;
return;
case 163:
//C
this.state = 47;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 659;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(262144);
if (true) break;

case 47:
//if
this.state = 50;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 660;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es necesario";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Es necesario seleccionar la dirección desde la que enviar emails."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selecciónala desde el menú de Acciones."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 661;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 164;
return;
case 164:
//C
this.state = 50;
;
 BA.debugLineNum = 662;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return ;
 if (true) break;

case 50:
//C
this.state = 59;
;
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 665;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"La direcci";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La dirección DESDE la que se enviará el correo será:"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),__ref.getField(true,"_direccionseleccionadaremitenteemails" /*RemoteObject*/ ))),(Object)(BA.ObjectToString("Direccion envío email")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Seleccionar Otra")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 666;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 165;
return;
case 165:
//C
this.state = 53;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 667;BA.debugLine="Select rInt";
Debug.ShouldStop(67108864);
if (true) break;

case 53:
//select
this.state = 58;
switch (BA.switchObjectToInt(_rint,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Negative"))) {
case 0: {
this.state = 55;
if (true) break;
}
case 1: {
this.state = 57;
if (true) break;
}
}
if (true) break;

case 55:
//C
this.state = 58;
 BA.debugLineNum = 669;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 671;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Selecciona";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Selecciona otra cuenta remitente desde el menú Acciones.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 672;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 166;
return;
case 166:
//C
this.state = 58;
;
 BA.debugLineNum = 673;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = 60;
;
 BA.debugLineNum = 677;BA.debugLine="jamTableView1.SetMouseCursorWaitDeshabilitarTable";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursorwaitdeshabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 678;BA.debugLine="Wait For(CrearCabeceraReclamacion(DateTime.Now,0,";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_crearcabecerareclamacion" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_direccionseleccionadaremitenteemails" /*RemoteObject*/ )),(Object)(_direcciondestinoemail)));
this.state = 167;
return;
case 167:
//C
this.state = 60;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 679;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(64);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 680;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(128);
if (true) break;

case 60:
//if
this.state = 65;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 62;
;}if (true) break;

case 62:
//C
this.state = 65;
if (true) return ;
if (true) break;

case 65:
//C
this.state = 66;
;
 BA.debugLineNum = 681;BA.debugLine="Dim IDRecl As Int=mRes.Get(\"IDReclamacionFPC\")";
Debug.ShouldStop(256);
_idrecl = BA.numberCast(int.class, _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDReclamacionFPC")))));Debug.locals.put("IDRecl", _idrecl);Debug.locals.put("IDRecl", _idrecl);
 BA.debugLineNum = 682;BA.debugLine="Dim Recl As String=mRes.Get(\"ReclamacionFPC\")";
Debug.ShouldStop(512);
_recl = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReclamacionFPC")))));Debug.locals.put("Recl", _recl);Debug.locals.put("Recl", _recl);
 BA.debugLineNum = 684;BA.debugLine="jamTableView1.SetMouseCursorWaitDeshabilitarTable";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursorwaitdeshabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 685;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(4096);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 686;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(8192);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 687;BA.debugLine="Dim rsPedLin As ResultSet=mSQL.ExecQuery2(\"select";
Debug.ShouldStop(16384);
_rspedlin = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rspedlin = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select Pedido, Linea from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? and PendienteSeguimiento=? and ExcluidoReclamacion=? order by Pedido, Linea")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {_proveedor,BA.NumberToString(1),BA.NumberToString(0)})))));Debug.locals.put("rsPedLin", _rspedlin);Debug.locals.put("rsPedLin", _rspedlin);
 BA.debugLineNum = 688;BA.debugLine="Do While rsPedLin.NextRow";
Debug.ShouldStop(32768);
if (true) break;

case 66:
//do while
this.state = 69;
while (_rspedlin.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 68;
if (true) break;
}
if (true) break;

case 68:
//C
this.state = 66;
 BA.debugLineNum = 689;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"";
Debug.ShouldStop(65536);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("UpdatePedidosLineasReclamacionesFPCMov0")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_rspedlin.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Pedido")))),(_rspedlin.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Linea"))))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 690;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(131072);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 if (true) break;

case 69:
//C
this.state = 70;
;
 BA.debugLineNum = 692;BA.debugLine="rsPedLin.Close";
Debug.ShouldStop(524288);
_rspedlin.runVoidMethod ("Close");
 BA.debugLineNum = 694;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 168;
return;
case 168:
//C
this.state = 70;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 695;BA.debugLine="If Success=False Then";
Debug.ShouldStop(4194304);
if (true) break;

case 70:
//if
this.state = 73;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 696;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTabl";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursordefaulthabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 697;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible resetear mov de las líneas de Pedido reclamaciones anteriores  "),_recl,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 698;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 169;
return;
case 169:
//C
this.state = 73;
;
 BA.debugLineNum = 699;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return ;
 if (true) break;

case 73:
//C
this.state = 74;
;
 BA.debugLineNum = 702;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(536870912);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 703;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(1073741824);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 704;BA.debugLine="Dim rsPedLin As ResultSet=mSQL.ExecQuery2(\"select";
Debug.ShouldStop(-2147483648);
_rspedlin = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rspedlin = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select Pedido, Linea from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? And PendienteSeguimiento=? And ExcluidoReclamacion=? order by Pedido, Linea")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {_proveedor,BA.NumberToString(1),BA.NumberToString(0)})))));Debug.locals.put("rsPedLin", _rspedlin);Debug.locals.put("rsPedLin", _rspedlin);
 BA.debugLineNum = 705;BA.debugLine="Do While rsPedLin.NextRow";
Debug.ShouldStop(1);
if (true) break;

case 74:
//do while
this.state = 77;
while (_rspedlin.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 76;
if (true) break;
}
if (true) break;

case 76:
//C
this.state = 74;
 BA.debugLineNum = 707;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"";
Debug.ShouldStop(4);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InsertarPedidoCompraLineaReclamacionFPC")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_idrecl),(_rspedlin.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Pedido")))),(_rspedlin.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Linea"))))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 708;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(8);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 if (true) break;

case 77:
//C
this.state = 78;
;
 BA.debugLineNum = 710;BA.debugLine="rsPedLin.Close";
Debug.ShouldStop(32);
_rspedlin.runVoidMethod ("Close");
 BA.debugLineNum = 712;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 170;
return;
case 170:
//C
this.state = 78;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 713;BA.debugLine="If Success=False Then";
Debug.ShouldStop(256);
if (true) break;

case 78:
//if
this.state = 81;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 714;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTabl";
Debug.ShouldStop(512);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursordefaulthabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 715;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible insertar las líneas de Pedido en la nueva reclamación  "),_recl,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 716;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 171;
return;
case 171:
//C
this.state = 81;
;
 BA.debugLineNum = 717;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 81:
//C
this.state = 82;
;
 BA.debugLineNum = 720;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select Pedid";
Debug.ShouldStop(32768);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select Pedido, Linea, FechaPedido, Articulo, DescripcionArticulo, Talla, Qty, QtyPendiente, FechaPrometida from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? and PendienteSeguimiento=? and ExcluidoReclamacion=? order by Pedido, Linea")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {_proveedor,BA.NumberToString(1),BA.NumberToString(0)})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 722;BA.debugLine="Dim xl As XLUtils";
Debug.ShouldStop(131072);
_xl = RemoteObject.createNew ("b4j.docU.xlutils");Debug.locals.put("xl", _xl);
 BA.debugLineNum = 723;BA.debugLine="xl.Initialize";
Debug.ShouldStop(262144);
_xl.runClassMethod (b4j.docU.xlutils.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 724;BA.debugLine="Dim Workbook As XLWorkbookWriter = xl.CreateWrite";
Debug.ShouldStop(524288);
_workbook = _xl.runClassMethod (b4j.docU.xlutils.class, "_createwriterblank" /*RemoteObject*/ );Debug.locals.put("Workbook", _workbook);Debug.locals.put("Workbook", _workbook);
 BA.debugLineNum = 725;BA.debugLine="Dim sheet1 As XLSheetWriter = Workbook.CreateShee";
Debug.ShouldStop(1048576);
_sheet1 = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createsheetwriterbyname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Datos")));Debug.locals.put("sheet1", _sheet1);Debug.locals.put("sheet1", _sheet1);
 BA.debugLineNum = 728;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(8388608);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 729;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(16777216);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 731;BA.debugLine="Dim NumColsRs As Int=rs.ColumnCount";
Debug.ShouldStop(67108864);
_numcolsrs = _rs.runMethod(true,"getColumnCount");Debug.locals.put("NumColsRs", _numcolsrs);Debug.locals.put("NumColsRs", _numcolsrs);
 BA.debugLineNum = 732;BA.debugLine="Dim HeaderStyle As XLStyle=Workbook.CreateStyle.F";
Debug.ShouldStop(134217728);
_headerstyle = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_fontcolor" /*RemoteObject*/ ,(Object)(BA.numberCast(short.class, 12)),(Object)(BA.numberCast(int.class, _xl.getField(true,"_color_white" /*RemoteObject*/ )))).runClassMethod (b4j.docU.xlstyle.class, "_foregroundcolor" /*RemoteObject*/ ,(Object)(_xl.getField(true,"_color_dark_teal" /*RemoteObject*/ )));Debug.locals.put("HeaderStyle", _headerstyle);Debug.locals.put("HeaderStyle", _headerstyle);
 BA.debugLineNum = 734;BA.debugLine="For idxCol=0 To rs.ColumnCount-1";
Debug.ShouldStop(536870912);
if (true) break;

case 82:
//for
this.state = 91;
step135 = 1;
limit135 = RemoteObject.solve(new RemoteObject[] {_rs.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxcol = 0 ;
Debug.locals.put("idxCol", _idxcol);
this.state = 172;
if (true) break;

case 172:
//C
this.state = 91;
if ((step135 > 0 && _idxcol <= limit135) || (step135 < 0 && _idxcol >= limit135)) this.state = 84;
if (true) break;

case 173:
//C
this.state = 172;
_idxcol = ((int)(0 + _idxcol + step135)) ;
Debug.locals.put("idxCol", _idxcol);
if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 735;BA.debugLine="If rs.GetColumnName(idxCol)<>\"FechaPrometida\" Th";
Debug.ShouldStop(1073741824);
if (true) break;

case 85:
//if
this.state = 90;
if (RemoteObject.solveBoolean("!",_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _idxcol))),BA.ObjectToString("FechaPrometida"))) { 
this.state = 87;
}else {
this.state = 89;
}if (true) break;

case 87:
//C
this.state = 90;
 BA.debugLineNum = 736;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0), rs.G";
Debug.ShouldStop(-2147483648);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(BA.numberCast(int.class, 0)))),(Object)(_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _idxcol))))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_headerstyle));
 if (true) break;

case 89:
//C
this.state = 90;
 BA.debugLineNum = 738;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0), \"Fec";
Debug.ShouldStop(2);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.createImmutable("Fecha Entrega Anterior"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_headerstyle));
 if (true) break;

case 90:
//C
this.state = 173;
;
 if (true) break;
if (true) break;

case 91:
//C
this.state = 92;
Debug.locals.put("idxCol", _idxcol);
;
 BA.debugLineNum = 741;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0), \"Nueva";
Debug.ShouldStop(16);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.createImmutable("Nueva Fecha Entrega"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_headerstyle));
 BA.debugLineNum = 744;BA.debugLine="Dim FechasStyle As XLStyle = Workbook.CreateStyle";
Debug.ShouldStop(128);
_fechasstyle = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_dataformat" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("dd\"/\"mm\"/\"yyyy"))));Debug.locals.put("FechasStyle", _fechasstyle);Debug.locals.put("FechasStyle", _fechasstyle);
 BA.debugLineNum = 745;BA.debugLine="Dim RowStyles As List = Array(Workbook.CreateStyl";
Debug.ShouldStop(256);
_rowstyles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rowstyles = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_foregroundcolor" /*RemoteObject*/ ,(Object)(_xl.getField(true,"_color_orange" /*RemoteObject*/ )))),(_workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_foregroundcolor" /*RemoteObject*/ ,(Object)(_xl.getField(true,"_color_white" /*RemoteObject*/ ))))})));Debug.locals.put("RowStyles", _rowstyles);Debug.locals.put("RowStyles", _rowstyles);
 BA.debugLineNum = 746;BA.debugLine="Dim idxFila As Int=1";
Debug.ShouldStop(512);
_idxfila = BA.numberCast(int.class, 1);Debug.locals.put("idxFila", _idxfila);Debug.locals.put("idxFila", _idxfila);
 BA.debugLineNum = 748;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(2048);
if (true) break;

case 92:
//do while
this.state = 121;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 94;
if (true) break;
}
if (true) break;

case 94:
//C
this.state = 95;
 BA.debugLineNum = 750;BA.debugLine="For idxCol=0 To rs.ColumnCount-1";
Debug.ShouldStop(8192);
if (true) break;

case 95:
//for
this.state = 120;
step147 = 1;
limit147 = RemoteObject.solve(new RemoteObject[] {_rs.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxcol = 0 ;
Debug.locals.put("idxCol", _idxcol);
this.state = 174;
if (true) break;

case 174:
//C
this.state = 120;
if ((step147 > 0 && _idxcol <= limit147) || (step147 < 0 && _idxcol >= limit147)) this.state = 97;
if (true) break;

case 175:
//C
this.state = 174;
_idxcol = ((int)(0 + _idxcol + step147)) ;
Debug.locals.put("idxCol", _idxcol);
if (true) break;

case 97:
//C
this.state = 98;
 BA.debugLineNum = 751;BA.debugLine="Dim NombreCampo As String=rs.GetColumnName(idxC";
Debug.ShouldStop(16384);
_nombrecampo = _rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _idxcol)));Debug.locals.put("NombreCampo", _nombrecampo);Debug.locals.put("NombreCampo", _nombrecampo);
 BA.debugLineNum = 752;BA.debugLine="Select True";
Debug.ShouldStop(32768);
if (true) break;

case 98:
//select
this.state = 119;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_nombrecampo,BA.ObjectToString("Pedido")) || RemoteObject.solveBoolean("=",_nombrecampo,BA.ObjectToString("Articulo")) || RemoteObject.solveBoolean("=",_nombrecampo,BA.ObjectToString("DescripcionArticulo")) || RemoteObject.solveBoolean("=",_nombrecampo,BA.ObjectToString("Talla"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_nombrecampo,BA.ObjectToString("Linea"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_nombrecampo,BA.ObjectToString("FechaPedido"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_nombrecampo,BA.ObjectToString("Qty")) || RemoteObject.solveBoolean("=",_nombrecampo,BA.ObjectToString("QtyPendiente"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_nombrecampo,BA.ObjectToString("FechaPrometida"))))) {
case 0: {
this.state = 100;
if (true) break;
}
case 1: {
this.state = 102;
if (true) break;
}
case 2: {
this.state = 104;
if (true) break;
}
case 3: {
this.state = 110;
if (true) break;
}
case 4: {
this.state = 112;
if (true) break;
}
default: {
this.state = 118;
if (true) break;
}
}
if (true) break;

case 100:
//C
this.state = 119;
 BA.debugLineNum = 755;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,idxFil";
Debug.ShouldStop(262144);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(_idxfila))),(Object)(_rs.runMethod(true,"GetString",(Object)(_nombrecampo))));
 if (true) break;

case 102:
//C
this.state = 119;
 BA.debugLineNum = 758;BA.debugLine="sheet1.PutNumber(xl.AddressZero(idxCol,idxFil";
Debug.ShouldStop(2097152);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putnumber" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(_idxfila))),(Object)(BA.numberCast(double.class, _rs.runMethod(true,"GetInt",(Object)(_nombrecampo)))));
 if (true) break;

case 104:
//C
this.state = 105;
 BA.debugLineNum = 762;BA.debugLine="Dim ticks As Long = rs.GetLong(NombreCampo)";
Debug.ShouldStop(33554432);
_ticks = _rs.runMethod(true,"GetLong",(Object)(_nombrecampo));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 764;BA.debugLine="If ticks > 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 105:
//if
this.state = 108;
if (RemoteObject.solveBoolean(">",_ticks,BA.numberCast(long.class, 0))) { 
this.state = 107;
}if (true) break;

case 107:
//C
this.state = 108;
 BA.debugLineNum = 765;BA.debugLine="Dim TicksHora0 As Long=DateUtils.SetDate(Da";
Debug.ShouldStop(268435456);
_tickshora0 = parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_ticks))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_ticks))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_ticks))));Debug.locals.put("TicksHora0", _tickshora0);Debug.locals.put("TicksHora0", _tickshora0);
 BA.debugLineNum = 767;BA.debugLine="sheet1.PutDate(xl.AddressZero(idxCol,idxFil";
Debug.ShouldStop(1073741824);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putdate" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(_idxfila))),(Object)(_tickshora0)).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_fechasstyle));
 if (true) break;

case 108:
//C
this.state = 119;
;
 if (true) break;

case 110:
//C
this.state = 119;
 BA.debugLineNum = 771;BA.debugLine="sheet1.PutNumber(xl.AddressZero(idxCol,idxFil";
Debug.ShouldStop(4);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putnumber" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(_idxfila))),(Object)(parent.__c.runMethod(true,"Round2",(Object)(_rs.runMethod(true,"GetDouble",(Object)(_nombrecampo))),(Object)(BA.numberCast(int.class, 2)))));
 if (true) break;

case 112:
//C
this.state = 113;
 BA.debugLineNum = 774;BA.debugLine="Dim ticks As Long = rs.GetLong(NombreCampo)";
Debug.ShouldStop(32);
_ticks = _rs.runMethod(true,"GetLong",(Object)(_nombrecampo));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 776;BA.debugLine="If ticks > 0 Then";
Debug.ShouldStop(128);
if (true) break;

case 113:
//if
this.state = 116;
if (RemoteObject.solveBoolean(">",_ticks,BA.numberCast(long.class, 0))) { 
this.state = 115;
}if (true) break;

case 115:
//C
this.state = 116;
 BA.debugLineNum = 777;BA.debugLine="Dim TicksHora0 As Long=DateUtils.SetDate(Dat";
Debug.ShouldStop(256);
_tickshora0 = parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_ticks))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_ticks))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_ticks))));Debug.locals.put("TicksHora0", _tickshora0);Debug.locals.put("TicksHora0", _tickshora0);
 BA.debugLineNum = 779;BA.debugLine="sheet1.PutDate(xl.AddressZero(idxCol,idxFila";
Debug.ShouldStop(1024);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putdate" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(_idxfila))),(Object)(_tickshora0)).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_fechasstyle));
 if (true) break;

case 116:
//C
this.state = 119;
;
 if (true) break;

case 118:
//C
this.state = 119;
 if (true) break;

case 119:
//C
this.state = 175;
;
 if (true) break;
if (true) break;

case 120:
//C
this.state = 92;
Debug.locals.put("idxCol", _idxcol);
;
 BA.debugLineNum = 786;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Proces";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Procesando Fila "),_idxfila)));
 BA.debugLineNum = 787;BA.debugLine="Sleep(0)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"),BA.numberCast(int.class, 0));
this.state = 176;
return;
case 176:
//C
this.state = 92;
;
 BA.debugLineNum = 788;BA.debugLine="idxFila=idxFila+1";
Debug.ShouldStop(524288);
_idxfila = RemoteObject.solve(new RemoteObject[] {_idxfila,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idxFila", _idxfila);
 if (true) break;

case 121:
//C
this.state = 122;
;
 BA.debugLineNum = 790;BA.debugLine="rs.Close";
Debug.ShouldStop(2097152);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 794;BA.debugLine="Dim UltimaFila As Int=idxFila";
Debug.ShouldStop(33554432);
_ultimafila = _idxfila;Debug.locals.put("UltimaFila", _ultimafila);Debug.locals.put("UltimaFila", _ultimafila);
 BA.debugLineNum = 795;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Generan";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,RemoteObject.createImmutable(("Generando fichero excel...")));
 BA.debugLineNum = 796;BA.debugLine="Sleep(0)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"),BA.numberCast(int.class, 0));
this.state = 177;
return;
case 177:
//C
this.state = 122;
;
 BA.debugLineNum = 800;BA.debugLine="sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZ";
Debug.ShouldStop(-2147483648);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_setautofilter" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_createxlrange" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(_numcolsrs),(Object)(_ultimafila))))));
 BA.debugLineNum = 802;BA.debugLine="For i=0 To idxCol+1 ' +1 ,  porque hemos añadido";
Debug.ShouldStop(2);
if (true) break;

case 122:
//for
this.state = 125;
step180 = 1;
limit180 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_idxcol),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 178;
if (true) break;

case 178:
//C
this.state = 125;
if ((step180 > 0 && _i <= limit180) || (step180 < 0 && _i >= limit180)) this.state = 124;
if (true) break;

case 179:
//C
this.state = 178;
_i = ((int)(0 + _i + step180)) ;
Debug.locals.put("i", _i);
if (true) break;

case 124:
//C
this.state = 179;
 BA.debugLineNum = 803;BA.debugLine="sheet1.AutoSizeColumn(i)";
Debug.ShouldStop(4);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_autosizecolumn" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));
 if (true) break;
if (true) break;

case 125:
//C
this.state = 126;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 806;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 807;BA.debugLine="jamTableView1.EstadoLabelSalirJamTableView(True)";
Debug.ShouldStop(64);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadolabelsalirjamtableview" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 808;BA.debugLine="jamTableView1.HabilitarJamTableView(True)";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_habilitarjamtableview" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 810;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"\"";
Debug.ShouldStop(512);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,RemoteObject.createImmutable(("")));
 BA.debugLineNum = 814;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(8192);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 830;BA.debugLine="Dim filename As String = Workbook.SaveAs(CarpetaF";
Debug.ShouldStop(536870912);
_filename = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_saveas" /*RemoteObject*/ ,(Object)(_carpetafichero),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Reclamación "),_recl,RemoteObject.createImmutable(" Fechas Entrega "),_nombreproveedor,RemoteObject.createImmutable(".xlsx"))),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 831;BA.debugLine="If filename<>CarpetaFichero & \"\\\" & \"Reclamación";
Debug.ShouldStop(1073741824);
if (true) break;

case 126:
//if
this.state = 129;
if (RemoteObject.solveBoolean("!",_filename,RemoteObject.concat(_carpetafichero,RemoteObject.createImmutable("\\"),RemoteObject.createImmutable("Reclamación "),_recl,RemoteObject.createImmutable(" Fechas Entrega "),_nombreproveedor,RemoteObject.createImmutable(".xlsx")))) { 
this.state = 128;
}if (true) break;

case 128:
//C
this.state = 129;
 BA.debugLineNum = 832;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTabl";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursordefaulthabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 833;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error al grab";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error al grabar el fichero excel.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 834;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 180;
return;
case 180:
//C
this.state = 129;
;
 BA.debugLineNum = 835;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;

case 129:
//C
this.state = 130;
;
 BA.debugLineNum = 863;BA.debugLine="Dim sbBody As String=HTMLBodyEmail";
Debug.ShouldStop(1073741824);
_sbbody = __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_htmlbodyemail" /*RemoteObject*/ );Debug.locals.put("sbBody", _sbbody);Debug.locals.put("sbBody", _sbbody);
 BA.debugLineNum = 866;BA.debugLine="wait for(EjecutarVBSScriptEnviarEmail(DireccionSe";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_ejecutarvbsscriptenviaremail" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_direccionseleccionadaremitenteemails" /*RemoteObject*/ )),(Object)(_direcciondestinoemail),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Reclamación Confirmación Fechas Entrega Pedidos Pendientes "),_recl)),(Object)(_sbbody),(Object)(_filename),(Object)(_direcciondestinoemailcc)));
this.state = 181;
return;
case 181:
//C
this.state = 130;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 867;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTable";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursordefaulthabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 868;BA.debugLine="Log(\"mRes: \" & mRes)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","88520017",RemoteObject.concat(RemoteObject.createImmutable("mRes: "),_mres),0);
 BA.debugLineNum = 869;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
Debug.ShouldStop(16);
_success = BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Success")))));Debug.locals.put("Success", _success);Debug.locals.put("Success", _success);
 BA.debugLineNum = 870;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
Debug.ShouldStop(32);
_exitcode = BA.numberCast(int.class, _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ExitCode")))));Debug.locals.put("ExitCode", _exitcode);Debug.locals.put("ExitCode", _exitcode);
 BA.debugLineNum = 871;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
Debug.ShouldStop(64);
_stdout = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdOut")))));Debug.locals.put("StdOut", _stdout);Debug.locals.put("StdOut", _stdout);
 BA.debugLineNum = 872;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
Debug.ShouldStop(128);
_stderr = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdErr")))));Debug.locals.put("StdErr", _stderr);Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 873;BA.debugLine="If Success=False Then";
Debug.ShouldStop(256);
if (true) break;

case 130:
//if
this.state = 133;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 132;
}if (true) break;

case 132:
//C
this.state = 133;
 BA.debugLineNum = 874;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt env";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt enviar email"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 875;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 182;
return;
case 182:
//C
this.state = 133;
;
 BA.debugLineNum = 876;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 878;BA.debugLine="If ExitCode=1 Then";
Debug.ShouldStop(8192);

case 133:
//if
this.state = 136;
if (RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 1))) { 
this.state = 135;
}if (true) break;

case 135:
//C
this.state = 136;
 BA.debugLineNum = 879;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt env";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt enviar email"),parent.__c.getField(true,"CRLF"),_stderr)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 880;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 183;
return;
case 183:
//C
this.state = 136;
;
 BA.debugLineNum = 881;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 136:
//C
this.state = 137;
;
 BA.debugLineNum = 883;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Email enviado,";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Email enviado, OK")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 884;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 184;
return;
case 184:
//C
this.state = 137;
;
 BA.debugLineNum = 886;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Fichero excel";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Fichero excel con datos reclamacion grabado en "),_filename)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 887;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 185;
return;
case 185:
//C
this.state = 137;
;
 BA.debugLineNum = 889;BA.debugLine="WAIT FOR (ActualizarDatos) COMPLETE (rBool As Boo";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_actualizardatos" /*RemoteObject*/ ));
this.state = 186;
return;
case 186:
//C
this.state = 137;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 890;BA.debugLine="If rBool= False Then Return";
Debug.ShouldStop(33554432);
if (true) break;

case 137:
//if
this.state = 142;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 139;
;}if (true) break;

case 139:
//C
this.state = 142;
if (true) return ;
if (true) break;

case 142:
//C
this.state = 143;
;
 BA.debugLineNum = 892;BA.debugLine="Wait For(jamTableView1.QuitarFiltros) complete (r";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_quitarfiltros" /*RemoteObject*/ ));
this.state = 187;
return;
case 187:
//C
this.state = 143;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 895;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.AddFiltroC";
Debug.ShouldStop(1073741824);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addfiltrocampovalorinicial" /*RemoteObject*/ ,(Object)(BA.ObjectToString("PendienteSeguimiento")),(Object)(RemoteObject.createImmutable((1))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 896;BA.debugLine="wait for(rSub) complete (Success As Boolean)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _rsub);
this.state = 188;
return;
case 188:
//C
this.state = 143;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 897;BA.debugLine="If Success Then";
Debug.ShouldStop(1);
if (true) break;

case 143:
//if
this.state = 148;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 145;
}else {
this.state = 147;
}if (true) break;

case 145:
//C
this.state = 148;
 if (true) break;

case 147:
//C
this.state = 148;
 if (true) break;

case 148:
//C
this.state = 149;
;
 BA.debugLineNum = 903;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.AddFiltroC";
Debug.ShouldStop(64);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addfiltrocampovalorinicial" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Proveedor")),(Object)((_proveedor)));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 904;BA.debugLine="wait for(rSub) complete (Success As Boolean)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _rsub);
this.state = 189;
return;
case 189:
//C
this.state = 149;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 905;BA.debugLine="If Success Then";
Debug.ShouldStop(256);
if (true) break;

case 149:
//if
this.state = 154;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 151;
}else {
this.state = 153;
}if (true) break;

case 151:
//C
this.state = 154;
 if (true) break;

case 153:
//C
this.state = 154;
 if (true) break;

case 154:
//C
this.state = -1;
;
 BA.debugLineNum = 911;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 148;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="EventData.Consume";
Debug.ShouldStop(1048576);
_eventdata.runVoidMethod ("Consume");
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
public static RemoteObject  _htmlbodyemail(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HTMLBodyEmail (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,913);
if (RapidSub.canDelegate("htmlbodyemail")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","htmlbodyemail", __ref);}
RemoteObject _strbodyhtml = RemoteObject.createImmutable("");
 BA.debugLineNum = 913;BA.debugLine="Sub HTMLBodyEmail As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 914;BA.debugLine="Dim strBodyHTML As String";
Debug.ShouldStop(131072);
_strbodyhtml = RemoteObject.createImmutable("");Debug.locals.put("strBodyHTML", _strbodyhtml);
 BA.debugLineNum = 915;BA.debugLine="strBodyHTML = \"<p>Buenos días<br><br>\" & _";
Debug.ShouldStop(262144);
_strbodyhtml = RemoteObject.concat(RemoteObject.createImmutable("<p>Buenos días<br><br>"),RemoteObject.createImmutable("Adjunto listado excel de pedidos pendientes sin información de plazo de entrega o cuya fecha informada esta vencida.<br>"),RemoteObject.createImmutable("Necesitamos cumplimenten el documento adjunto con las fechas actualizadas y nos lo hagan llegar a urgentemente.<br>"),RemoteObject.createImmutable("<br>Gracias"));Debug.locals.put("strBodyHTML", _strbodyhtml);
 BA.debugLineNum = 919;BA.debugLine="Return strBodyHTML";
Debug.ShouldStop(4194304);
if (true) return _strbodyhtml;
 BA.debugLineNum = 920;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Initialize (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,334);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","jamtableview1_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 334;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
Debug.ShouldStop(8192);
 BA.debugLineNum = 335;BA.debugLine="SalirModulo";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 336;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("jamTableView1_CambioEnCeldaSeleccionada (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("jamtableview1_cambioenceldaseleccionada")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","jamtableview1_cambioenceldaseleccionada", __ref, _datosceldaseleccionada);}
RemoteObject _lineaseltv = RemoteObject.createImmutable(0);
RemoteObject _mpk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pedido = RemoteObject.createImmutable("");
RemoteObject _linea = RemoteObject.createImmutable(0);
RemoteObject _nombreproveedor = RemoteObject.createImmutable("");
RemoteObject _articulo = RemoteObject.createImmutable("");
RemoteObject _descripcion = RemoteObject.createImmutable("");
RemoteObject _talla = RemoteObject.createImmutable("");
RemoteObject _stalla = RemoteObject.createImmutable("");
RemoteObject _qtypte = RemoteObject.createImmutable(0);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _fechaprometidalong = RemoteObject.createImmutable(0L);
RemoteObject _sfechaprometida = RemoteObject.createImmutable("");
RemoteObject _pendienteseguimiento = RemoteObject.createImmutable(0);
RemoteObject _spendienteseguimiento = RemoteObject.createImmutable("");
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 467;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
Debug.ShouldStop(262144);
 BA.debugLineNum = 468;BA.debugLine="Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila";
Debug.ShouldStop(524288);
_lineaseltv = _datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ );Debug.locals.put("LineaSelTV", _lineaseltv);Debug.locals.put("LineaSelTV", _lineaseltv);
 BA.debugLineNum = 469;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
Debug.ShouldStop(1048576);
_mpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mpk = _datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mPK", _mpk);Debug.locals.put("mPK", _mpk);
 BA.debugLineNum = 470;BA.debugLine="Dim Pedido As String=mPK.Get(\"Pedido\")";
Debug.ShouldStop(2097152);
_pedido = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Pedido")))));Debug.locals.put("Pedido", _pedido);Debug.locals.put("Pedido", _pedido);
 BA.debugLineNum = 471;BA.debugLine="Dim Linea As Int=mPK.Get(\"Linea\")";
Debug.ShouldStop(4194304);
_linea = BA.numberCast(int.class, _mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Linea")))));Debug.locals.put("Linea", _linea);Debug.locals.put("Linea", _linea);
 BA.debugLineNum = 472;BA.debugLine="Dim NombreProveedor As String=jamTableView1.GetVa";
Debug.ShouldStop(8388608);
_nombreproveedor = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("NombreProveedor"))));Debug.locals.put("NombreProveedor", _nombreproveedor);Debug.locals.put("NombreProveedor", _nombreproveedor);
 BA.debugLineNum = 473;BA.debugLine="Dim Articulo As String=jamTableView1.GetValorSQLC";
Debug.ShouldStop(16777216);
_articulo = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Articulo"))));Debug.locals.put("Articulo", _articulo);Debug.locals.put("Articulo", _articulo);
 BA.debugLineNum = 474;BA.debugLine="Dim Descripcion As String=jamTableView1.GetValorS";
Debug.ShouldStop(33554432);
_descripcion = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("DescripcionArticulo"))));Debug.locals.put("Descripcion", _descripcion);Debug.locals.put("Descripcion", _descripcion);
 BA.debugLineNum = 475;BA.debugLine="Dim Talla As String=jamTableView1.GetValorSQLCamp";
Debug.ShouldStop(67108864);
_talla = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Talla"))));Debug.locals.put("Talla", _talla);Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 476;BA.debugLine="Dim sTalla As String=IIf(Talla<>\"\",\"Talla: \" & Ta";
Debug.ShouldStop(134217728);
_stalla = BA.ObjectToString(((RemoteObject.solveBoolean("!",_talla,BA.ObjectToString(""))) ? ((RemoteObject.concat(RemoteObject.createImmutable("Talla: "),_talla))) : ((RemoteObject.createImmutable("")))));Debug.locals.put("sTalla", _stalla);Debug.locals.put("sTalla", _stalla);
 BA.debugLineNum = 477;BA.debugLine="Dim QtyPte As Int=jamTableView1.GetValorSQLCampoF";
Debug.ShouldStop(268435456);
_qtypte = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("QtyPendiente"))));Debug.locals.put("QtyPte", _qtypte);Debug.locals.put("QtyPte", _qtypte);
 BA.debugLineNum = 479;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(1073741824);
_dateformatant = cseguimientofechasprometidascompra.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 480;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(-2147483648);
cseguimientofechasprometidascompra.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 481;BA.debugLine="Dim FechaPrometidaLong As Long=jamTableView1.GetV";
Debug.ShouldStop(1);
_fechaprometidalong = BA.numberCast(long.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("FechaPrometida"))));Debug.locals.put("FechaPrometidaLong", _fechaprometidalong);Debug.locals.put("FechaPrometidaLong", _fechaprometidalong);
 BA.debugLineNum = 482;BA.debugLine="Dim sFechaPrometida As String=IIf(FechaPrometidaL";
Debug.ShouldStop(2);
_sfechaprometida = BA.ObjectToString(((RemoteObject.solveBoolean(">",_fechaprometidalong,BA.numberCast(long.class, 0))) ? ((RemoteObject.concat(RemoteObject.createImmutable("Fecha Prometida: "),cseguimientofechasprometidascompra.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechaprometidalong))))) : ((RemoteObject.createImmutable("SIN FECHA PROMETIDA")))));Debug.locals.put("sFechaPrometida", _sfechaprometida);Debug.locals.put("sFechaPrometida", _sfechaprometida);
 BA.debugLineNum = 483;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(4);
cseguimientofechasprometidascompra.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 484;BA.debugLine="Dim PendienteSeguimiento As Int=jamTableView1.Get";
Debug.ShouldStop(8);
_pendienteseguimiento = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("PendienteSeguimiento"))));Debug.locals.put("PendienteSeguimiento", _pendienteseguimiento);Debug.locals.put("PendienteSeguimiento", _pendienteseguimiento);
 BA.debugLineNum = 485;BA.debugLine="Dim sPendienteSeguimiento As String=IIf(Pendiente";
Debug.ShouldStop(16);
_spendienteseguimiento = BA.ObjectToString(((RemoteObject.solveBoolean("=",_pendienteseguimiento,BA.numberCast(double.class, 1))) ? (RemoteObject.createImmutable(("PENDIENTE SEGUIMIENTO"))) : ((RemoteObject.createImmutable("")))));Debug.locals.put("sPendienteSeguimiento", _spendienteseguimiento);Debug.locals.put("sPendienteSeguimiento", _spendienteseguimiento);
 BA.debugLineNum = 487;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Pedido:";
Debug.ShouldStop(64);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Pedido: "),_pedido,RemoteObject.createImmutable(" Línea:"),_linea,RemoteObject.createImmutable("  "),_nombreproveedor,RemoteObject.createImmutable("  "),_articulo,RemoteObject.createImmutable("  "),_descripcion,RemoteObject.createImmutable("  "),_stalla,RemoteObject.createImmutable("  QtyPte: "),_qtypte,RemoteObject.createImmutable("  "),_sfechaprometida,RemoteObject.createImmutable(" "),_spendienteseguimiento)));
 BA.debugLineNum = 489;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("jamTableView1_CellClick (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,491);
if (RapidSub.canDelegate("jamtableview1_cellclick")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","jamtableview1_cellclick", __ref, _datosceldaseleccionada);}
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 491;BA.debugLine="Sub jamTableView1_CellClick(DatosCeldaSeleccionada";
Debug.ShouldStop(1024);
 BA.debugLineNum = 492;BA.debugLine="Select DatosCeldaSeleccionada.AliasCampo";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(_datosceldaseleccionada.getField(true,"AliasCampo" /*RemoteObject*/ ),BA.ObjectToString("ExcluidoReclamacion"))) {
case 0: {
 BA.debugLineNum = 494;BA.debugLine="AlternarExcluidoReclamacion(DatosCeldaSeleccion";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_alternarexcluidoreclamacion" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada));
 break; }
}
;
 BA.debugLineNum = 496;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableview1_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("jamtableview1_contextmenuitem_action")) { __ref.runUserSub(false, "cseguimientofechasprometidascompra","jamtableview1_contextmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableView1_ContextMenuItem_Action rsub = new ResumableSub_jamTableView1_ContextMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableView1_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_ContextMenuItem_Action(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _tagmenuitem;
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _dcs = RemoteObject.declareNull("b4j.docU.jamtableview._datosceldaseleccionadajamtableview");
RemoteObject _pedidosel = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _articulosel = RemoteObject.createImmutable("");
RemoteObject _filaseleccionada = RemoteObject.createImmutable(0);
RemoteObject _lstinfofila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dc = RemoteObject.declareNull("b4j.docU.jamtableview._datoscamporegistrojamtableview");
RemoteObject _nombreproveedor = RemoteObject.createImmutable("");
RemoteObject _proveedor = RemoteObject.createImmutable("");
RemoteObject _direccionemail = RemoteObject.createImmutable("");
RemoteObject _lineasel = RemoteObject.createImmutable(0);
RemoteObject _rfpc = RemoteObject.createImmutable("");
RemoteObject _fechaenviolong = RemoteObject.createImmutable(0L);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _fechaenvio = RemoteObject.createImmutable("");
RemoteObject _nombreusuario = RemoteObject.createImmutable("");
RemoteObject _direccionemailremitente = RemoteObject.createImmutable("");
RemoteObject _direccionemaildestinatario = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,374);
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
 BA.debugLineNum = 375;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//select
this.state = 51;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("VerPedidoCompraNAV"),BA.ObjectToString("VerArticuloNAV"),BA.ObjectToString("EmailReclamacionProveedor"),BA.ObjectToString("DatosUltimaRFP"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 15;
if (true) break;
}
case 2: {
this.state = 32;
if (true) break;
}
case 3: {
this.state = 40;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 377;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.ShouldStop(16777216);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 378;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(33554432);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Pedido")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 379;BA.debugLine="Dim PedidoSel As String=DCS.ValorCelda";
Debug.ShouldStop(67108864);
_pedidosel = BA.ObjectToString(_dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("PedidoSel", _pedidosel);Debug.locals.put("PedidoSel", _pedidosel);
 BA.debugLineNum = 380;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Ver el p";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Ver el pedido de compra "),_pedidosel,RemoteObject.createImmutable(" en NAVISION?"))),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 381;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 52;
return;
case 52:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 382;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 383;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(1073741824);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Pedido compra")),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.ObjectToString("No.")),(Object)(_pedidosel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 384;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 53;
return;
case 53:
//C
this.state = 10;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 385;BA.debugLine="If success=False Then";
Debug.ShouldStop(1);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 386;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible abrir el pedido seleccionado en Navision.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 387;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 54;
return;
case 54:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 51;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 391;BA.debugLine="Dim ArticuloSel As String";
Debug.ShouldStop(64);
_articulosel = RemoteObject.createImmutable("");Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 392;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
Debug.ShouldStop(128);
_filaseleccionada = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_indicesfilasseleccionadas" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 393;BA.debugLine="Dim lstInfoFila As List=jamTableView1.DatosRegi";
Debug.ShouldStop(256);
_lstinfofila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstinfofila = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datosregistroindicefila" /*RemoteObject*/ ,(Object)(_filaseleccionada));Debug.locals.put("lstInfoFila", _lstinfofila);Debug.locals.put("lstInfoFila", _lstinfofila);
 BA.debugLineNum = 394;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
Debug.ShouldStop(512);
if (true) break;

case 16:
//for
this.state = 23;
group19 = _lstinfofila;
index19 = 0;
groupLen19 = group19.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("dc", _dc);
this.state = 55;
if (true) break;

case 55:
//C
this.state = 23;
if (index19 < groupLen19) {
this.state = 18;
_dc = (group19.runMethod(false,"Get",index19));Debug.locals.put("dc", _dc);}
if (true) break;

case 56:
//C
this.state = 55;
index19++;
Debug.locals.put("dc", _dc);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 395;BA.debugLine="If dc.Campo=\"Articulo\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_dc.getField(true,"Campo" /*RemoteObject*/ ),BA.ObjectToString("Articulo"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 396;BA.debugLine="ArticuloSel=dc.ValorCampo";
Debug.ShouldStop(2048);
_articulosel = BA.ObjectToString(_dc.getField(false,"ValorCampo" /*RemoteObject*/ ));Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 397;BA.debugLine="Exit";
Debug.ShouldStop(4096);
this.state = 23;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 56;
;
 if (true) break;
if (true) break;
Debug.locals.put("dc", _dc);
;
 BA.debugLineNum = 400;BA.debugLine="If ArticuloSel=\"\" Then";
Debug.ShouldStop(32768);

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_articulosel,BA.ObjectToString(""))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 401;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha encontrado el campo Artículo.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 402;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 26;
;
 BA.debugLineNum = 403;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 405;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(1048576);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ficha producto")),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.ObjectToString("No.")),(Object)(_articulosel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 406;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 58;
return;
case 58:
//C
this.state = 27;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 407;BA.debugLine="If success=False Then";
Debug.ShouldStop(4194304);
if (true) break;

case 27:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 408;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible abrir el artículo seleccionado en Navision.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 409;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 59;
return;
case 59:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 51;
;
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 412;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.ShouldStop(134217728);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 413;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(268435456);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("NombreProveedor")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 414;BA.debugLine="Dim NombreProveedor As String=DCS.ValorCelda";
Debug.ShouldStop(536870912);
_nombreproveedor = BA.ObjectToString(_dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("NombreProveedor", _nombreproveedor);Debug.locals.put("NombreProveedor", _nombreproveedor);
 BA.debugLineNum = 415;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(1073741824);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Proveedor")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 416;BA.debugLine="Dim Proveedor As String=DCS.ValorCelda";
Debug.ShouldStop(-2147483648);
_proveedor = BA.ObjectToString(_dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("Proveedor", _proveedor);Debug.locals.put("Proveedor", _proveedor);
 BA.debugLineNum = 417;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(1);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("DireccionEmail")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 418;BA.debugLine="Dim DireccionEmail As String=DCS.ValorCelda";
Debug.ShouldStop(2);
_direccionemail = BA.ObjectToString(_dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("DireccionEmail", _direccionemail);Debug.locals.put("DireccionEmail", _direccionemail);
 BA.debugLineNum = 419;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Enviar e";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Enviar email reclamación de plazos de entrega al proveedor "),_nombreproveedor,RemoteObject.createImmutable("?"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Se generará un fichero excel con la información de todas sus líneas de pedido pendientes no excluidas"))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 420;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 60;
return;
case 60:
//C
this.state = 33;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 421;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(16);
if (true) break;

case 33:
//if
this.state = 38;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 35;
;}if (true) break;

case 35:
//C
this.state = 38;
if (true) return ;
if (true) break;

case 38:
//C
this.state = 51;
;
 BA.debugLineNum = 422;BA.debugLine="EmailReclamacionProveedor(Proveedor, NombreProv";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_emailreclamacionproveedor" /*void*/ ,(Object)(_proveedor),(Object)(_nombreproveedor),(Object)(_direccionemail));
 if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 425;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.ShouldStop(256);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 426;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(512);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Pedido")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 427;BA.debugLine="Dim PedidoSel As String=DCS.ValorCelda";
Debug.ShouldStop(1024);
_pedidosel = BA.ObjectToString(_dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("PedidoSel", _pedidosel);Debug.locals.put("PedidoSel", _pedidosel);
 BA.debugLineNum = 428;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(2048);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Linea")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 429;BA.debugLine="Dim LineaSel As Int=DCS.ValorCelda";
Debug.ShouldStop(4096);
_lineasel = BA.numberCast(int.class, _dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("LineaSel", _lineasel);Debug.locals.put("LineaSel", _lineasel);
 BA.debugLineNum = 430;BA.debugLine="Dim RFPC As String=mSQL.ExecQuerySingleResult2(";
Debug.ShouldStop(8192);
_rfpc = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select ReclamacionFPC from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_pedidosel,BA.NumberToString(_lineasel)})))));Debug.locals.put("RFPC", _rfpc);Debug.locals.put("RFPC", _rfpc);
 BA.debugLineNum = 431;BA.debugLine="If RFPC=\"\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 41:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_rfpc,BA.ObjectToString(""))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 432;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La línea de";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La línea de pedido seleccionada no tiene datos de reclamación de fechas prometidas.")),(Object)(RemoteObject.createImmutable("Información Reclamación")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 433;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 61;
return;
case 61:
//C
this.state = 44;
;
 BA.debugLineNum = 434;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 436;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(524288);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FechaEnvioReclamacionLong")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 437;BA.debugLine="Dim FechaEnvioLong As Long=DCS.ValorCelda";
Debug.ShouldStop(1048576);
_fechaenviolong = BA.numberCast(long.class, _dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("FechaEnvioLong", _fechaenviolong);Debug.locals.put("FechaEnvioLong", _fechaenviolong);
 BA.debugLineNum = 438;BA.debugLine="Dim DateFormatAnt As String=DateTime.Dateformat";
Debug.ShouldStop(2097152);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 439;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(4194304);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 440;BA.debugLine="Dim FechaEnvio As String=DateTime.Date(FechaEnv";
Debug.ShouldStop(8388608);
_fechaenvio = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechaenviolong));Debug.locals.put("FechaEnvio", _fechaenvio);Debug.locals.put("FechaEnvio", _fechaenvio);
 BA.debugLineNum = 441;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(16777216);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 442;BA.debugLine="Dim NombreUsuario As String=mSQL.ExecQuerySingl";
Debug.ShouldStop(33554432);
_nombreusuario = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NombreUsuario from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_pedidosel,BA.NumberToString(_lineasel)})))));Debug.locals.put("NombreUsuario", _nombreusuario);Debug.locals.put("NombreUsuario", _nombreusuario);
 BA.debugLineNum = 443;BA.debugLine="Dim DireccionEmailRemitente As String=mSQL.Exec";
Debug.ShouldStop(67108864);
_direccionemailremitente = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select DireccionEmailRemitente from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_pedidosel,BA.NumberToString(_lineasel)})))));Debug.locals.put("DireccionEmailRemitente", _direccionemailremitente);Debug.locals.put("DireccionEmailRemitente", _direccionemailremitente);
 BA.debugLineNum = 444;BA.debugLine="Dim DireccionEmailDestinatario As String=mSQL.E";
Debug.ShouldStop(134217728);
_direccionemaildestinatario = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select DireccionEmailDestinatario from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_pedidosel,BA.NumberToString(_lineasel)})))));Debug.locals.put("DireccionEmailDestinatario", _direccionemaildestinatario);Debug.locals.put("DireccionEmailDestinatario", _direccionemaildestinatario);
 BA.debugLineNum = 449;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 450;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 451;BA.debugLine="sb.Append(\"Pedido / Línea:  \").Append(PedidoSel";
Debug.ShouldStop(4);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Pedido / Línea:  "))).runMethod(false,"Append",(Object)(_pedidosel)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" / "))).runMethod(false,"Append",(Object)(BA.NumberToString(_lineasel))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 452;BA.debugLine="sb.Append(\"Reclamación:  \").Append(RFPC).Append";
Debug.ShouldStop(8);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Reclamación:  "))).runMethod(false,"Append",(Object)(_rfpc)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 453;BA.debugLine="sb.Append(\"Fecha Reclamación:  \").Append(FechaE";
Debug.ShouldStop(16);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Fecha Reclamación:  "))).runMethod(false,"Append",(Object)(_fechaenvio)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 454;BA.debugLine="sb.Append(\"Usuario: \").Append(NombreUsuario).Ap";
Debug.ShouldStop(32);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Usuario: "))).runMethod(false,"Append",(Object)(_nombreusuario)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 455;BA.debugLine="sb.Append(\"DireccionEmailRemitente:  \").Append(";
Debug.ShouldStop(64);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("DireccionEmailRemitente:  "))).runMethod(false,"Append",(Object)(_direccionemailremitente)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 456;BA.debugLine="sb.Append(\"DireccionEmailDestinatario:  \").Appe";
Debug.ShouldStop(128);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("DireccionEmailDestinatario:  "))).runMethod(false,"Append",(Object)(_direccionemaildestinatario)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 458;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sb.ToString,\"";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_sb.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("Información Reclamación")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 459;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 62;
return;
case 62:
//C
this.state = 45;
;
 BA.debugLineNum = 461;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Copiar e";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Copiar el número de reclamación ("),_rfpc,RemoteObject.createImmutable(") ?"))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 462;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 63;
return;
case 63:
//C
this.state = 45;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 463;BA.debugLine="If rInt= xui.DialogResponse_Positive Then fx.Cl";
Debug.ShouldStop(16384);
if (true) break;

case 45:
//if
this.state = 50;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 47;
;}if (true) break;

case 47:
//C
this.state = 50;
__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Clipboard").runVoidMethod ("SetString",(Object)(_rfpc));
if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;

case 51:
//C
this.state = -1;
;
 BA.debugLineNum = 465;BA.debugLine="End Sub";
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
public static void  _jamtableview1_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,338);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { __ref.runUserSub(false, "cseguimientofechasprometidascompra","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _tagmenuitem;
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _dcs = RemoteObject.declareNull("b4j.docU.jamtableview._datosceldaseleccionadajamtableview");
RemoteObject _nombreproveedor = RemoteObject.createImmutable("");
RemoteObject _proveedor = RemoteObject.createImmutable("");
RemoteObject _direccionemail = RemoteObject.createImmutable("");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,338);
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
 BA.debugLineNum = 339;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//select
this.state = 24;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("SeleccionarCuentaRemitenteEmail"),BA.ObjectToString("EmailReclamacionProveedor"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 13;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 24;
 BA.debugLineNum = 342;BA.debugLine="WAIT FOR (ActualizarDatos) COMPLETE (rBool As B";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_menubarmenuitem_action"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_actualizardatos" /*RemoteObject*/ ));
this.state = 25;
return;
case 25:
//C
this.state = 24;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 345;BA.debugLine="wait for (SeleccionarDireccionRemitenteEmails)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_menubarmenuitem_action"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_seleccionardireccionremitenteemails" /*RemoteObject*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 6;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 346;BA.debugLine="If rBool=False Then Return";
Debug.ShouldStop(33554432);
if (true) break;

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
if (true) return ;
if (true) break;

case 11:
//C
this.state = 24;
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 349;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.ShouldStop(268435456);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 350;BA.debugLine="If FilaSel=-1 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_filasel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 351;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha se";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha seleccionado ninguna línea.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 352;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 17;
;
 BA.debugLineNum = 353;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 355;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(4);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("NombreProveedor")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 356;BA.debugLine="Dim NombreProveedor As String=DCS.ValorCelda";
Debug.ShouldStop(8);
_nombreproveedor = BA.ObjectToString(_dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("NombreProveedor", _nombreproveedor);Debug.locals.put("NombreProveedor", _nombreproveedor);
 BA.debugLineNum = 357;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(16);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Proveedor")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 358;BA.debugLine="Dim Proveedor As String=DCS.ValorCelda";
Debug.ShouldStop(32);
_proveedor = BA.ObjectToString(_dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("Proveedor", _proveedor);Debug.locals.put("Proveedor", _proveedor);
 BA.debugLineNum = 359;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(64);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("DireccionEmail")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 360;BA.debugLine="Dim DireccionEmail As String=DCS.ValorCelda";
Debug.ShouldStop(128);
_direccionemail = BA.ObjectToString(_dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("DireccionEmail", _direccionemail);Debug.locals.put("DireccionEmail", _direccionemail);
 BA.debugLineNum = 361;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Enviar e";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Enviar email reclamación de plazos de entrega al proveedor "),_nombreproveedor,RemoteObject.createImmutable("?"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Se generará un fichero excel con la información de todas sus líneas de pedido pendientes no excluidas"))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 362;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 18;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 363;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(1024);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) return ;
if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 370;BA.debugLine="EmailReclamacionProveedor(Proveedor, NombreProv";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_emailreclamacionproveedor" /*void*/ ,(Object)(_proveedor),(Object)(_nombreproveedor),(Object)(_direccionemail));
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 372;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","salirmodulo", __ref);}
 BA.debugLineNum = 156;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 158;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlook";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_borrarvbsscriptdireccionremitenteemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 159;BA.debugLine="BorrarVBSScriptEnvioEmailOutlook";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_borrarvbsscriptenvioemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 160;BA.debugLine="frm.Close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 161;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(1);
cseguimientofechasprometidascompra._mainmenu2.runVoidMethod ("_show" /*void*/ );
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
public static RemoteObject  _seleccionardireccionremitenteemails(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDireccionRemitenteEmails (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1013);
if (RapidSub.canDelegate("seleccionardireccionremitenteemails")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","seleccionardireccionremitenteemails", __ref);}
ResumableSub_SeleccionarDireccionRemitenteEmails rsub = new ResumableSub_SeleccionarDireccionRemitenteEmails(null,__ref);
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
public static class ResumableSub_SeleccionarDireccionRemitenteEmails extends BA.ResumableSub {
public ResumableSub_SeleccionarDireccionRemitenteEmails(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _sdireccionescuentasemail = RemoteObject.createImmutable("");
RemoteObject _arrdireccionescuentasemail = null;
RemoteObject _lstdireccionescuentasemail = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _idx = 0;
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
int step26;
int limit26;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDireccionRemitenteEmails (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,1013);
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
 BA.debugLineNum = 1015;BA.debugLine="wait for(EjecutarVBSScriptDireccionesEmail) compl";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_ejecutarvbsscriptdireccionesemail" /*RemoteObject*/ ));
this.state = 33;
return;
case 33:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1016;BA.debugLine="Log(\"mRes: \" & mRes)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","88847363",RemoteObject.concat(RemoteObject.createImmutable("mRes: "),_mres),0);
 BA.debugLineNum = 1017;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
Debug.ShouldStop(16777216);
_success = BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Success")))));Debug.locals.put("Success", _success);Debug.locals.put("Success", _success);
 BA.debugLineNum = 1018;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
Debug.ShouldStop(33554432);
_exitcode = BA.numberCast(int.class, _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ExitCode")))));Debug.locals.put("ExitCode", _exitcode);Debug.locals.put("ExitCode", _exitcode);
 BA.debugLineNum = 1019;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
Debug.ShouldStop(67108864);
_stdout = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdOut")))));Debug.locals.put("StdOut", _stdout);Debug.locals.put("StdOut", _stdout);
 BA.debugLineNum = 1020;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
Debug.ShouldStop(134217728);
_stderr = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdErr")))));Debug.locals.put("StdErr", _stderr);Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 1023;BA.debugLine="If Success=False Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 1024;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt direcciones email"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1025;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 4;
;
 BA.debugLineNum = 1026;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1028;BA.debugLine="If ExitCode=1 Then";
Debug.ShouldStop(8);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 1))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1029;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt direcciones email"),parent.__c.getField(true,"CRLF"),_stderr)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1030;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 7;
;
 BA.debugLineNum = 1031;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1033;BA.debugLine="Dim sDireccionesCuentasEmail As String=StdOut.Sub";
Debug.ShouldStop(256);
_sdireccionescuentasemail = _stdout.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_stdout.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("sDireccionesCuentasEmail", _sdireccionescuentasemail);Debug.locals.put("sDireccionesCuentasEmail", _sdireccionescuentasemail);
 BA.debugLineNum = 1034;BA.debugLine="If sDireccionesCuentasEmail=\"\" Then";
Debug.ShouldStop(512);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_sdireccionescuentasemail,BA.ObjectToString(""))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1035;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay direcciones de email configuradas."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Outlook no instalado?"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1036;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 11;
;
 BA.debugLineNum = 1037;BA.debugLine="Return False";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 1040;BA.debugLine="Dim ArrDireccionesCuentasEmail() As String=Regex.";
Debug.ShouldStop(32768);
_arrdireccionescuentasemail = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)(_sdireccionescuentasemail));Debug.locals.put("ArrDireccionesCuentasEmail", _arrdireccionescuentasemail);Debug.locals.put("ArrDireccionesCuentasEmail", _arrdireccionescuentasemail);
 BA.debugLineNum = 1041;BA.debugLine="Dim lstDireccionesCuentasEmail As List";
Debug.ShouldStop(65536);
_lstdireccionescuentasemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstDireccionesCuentasEmail", _lstdireccionescuentasemail);
 BA.debugLineNum = 1042;BA.debugLine="lstDireccionesCuentasEmail.Initialize";
Debug.ShouldStop(131072);
_lstdireccionescuentasemail.runVoidMethod ("Initialize");
 BA.debugLineNum = 1044;BA.debugLine="For iDx =0 To ArrDireccionesCuentasEmail.Length-1";
Debug.ShouldStop(524288);
if (true) break;

case 12:
//for
this.state = 15;
step26 = 1;
limit26 = RemoteObject.solve(new RemoteObject[] {_arrdireccionescuentasemail.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idx = 0 ;
Debug.locals.put("iDx", _idx);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 15;
if ((step26 > 0 && _idx <= limit26) || (step26 < 0 && _idx >= limit26)) this.state = 14;
if (true) break;

case 38:
//C
this.state = 37;
_idx = ((int)(0 + _idx + step26)) ;
Debug.locals.put("iDx", _idx);
if (true) break;

case 14:
//C
this.state = 38;
 BA.debugLineNum = 1045;BA.debugLine="lstDireccionesCuentasEmail.Add(ArrDireccionesCue";
Debug.ShouldStop(1048576);
_lstdireccionescuentasemail.runVoidMethod ("Add",(Object)((_arrdireccionescuentasemail.getArrayElement(true,BA.numberCast(int.class, _idx)))));
 if (true) break;
if (true) break;
Debug.locals.put("iDx", _idx);
;
 BA.debugLineNum = 1048;BA.debugLine="If lstDireccionesCuentasEmail.Size=0 Then";
Debug.ShouldStop(8388608);

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_lstdireccionescuentasemail.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1049;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay direcciones de email configuradas."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Outlook no instalado?"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1050;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 18;
;
 BA.debugLineNum = 1051;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 1054;BA.debugLine="lstDireccionesCuentasEmail.Add(\"compras@proin-pin";
Debug.ShouldStop(536870912);
_lstdireccionescuentasemail.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("compras@proin-pinilla.com"))));
 BA.debugLineNum = 1056;BA.debugLine="Dialog.Title=\"Selecciona Cuenta para Enviar los E";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Cuenta para Enviar los Emails")));
 BA.debugLineNum = 1057;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(1);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 1058;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(2);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 1059;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(4);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 1060;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(8);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 1061;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(16);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1063;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(64);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 1064;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(128);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 1065;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(256);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 1067;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(1024);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 1068;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(2048);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 1070;BA.debugLine="B4XListDlg.Options=lstDireccionesCuentasEmail";
Debug.ShouldStop(8192);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstdireccionescuentasemail);
 BA.debugLineNum = 1071;BA.debugLine="B4XListDlg.Resize(600dip,300dip)";
Debug.ShouldStop(16384);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))));
 BA.debugLineNum = 1073;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(65536);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1080;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(8388608);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 1081;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(16777216);
if (true) break;

case 19:
//if
this.state = 22;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1083;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(67108864);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 1084;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(134217728);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 1085;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(268435456);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 1088;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), _rsub);
this.state = 40;
return;
case 40:
//C
this.state = 23;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1089;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(1);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1092;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 1096;BA.debugLine="DireccionSeleccionadaRemitenteEmails=B4XListDlg.S";
Debug.ShouldStop(128);
__ref.setField ("_direccionseleccionadaremitenteemails" /*RemoteObject*/ ,_b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ ));
 BA.debugLineNum = 1097;BA.debugLine="If DireccionSeleccionadaRemitenteEmails=\"compras@";
Debug.ShouldStop(256);
if (true) break;

case 27:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_direccionseleccionadaremitenteemails" /*RemoteObject*/ ),BA.ObjectToString("compras@proin-pinilla.com"))) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
__ref.setField ("_direccionseleccionadaremitenteemails" /*RemoteObject*/ ,BA.ObjectToString("Compras Proin"));
if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 1099;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1142;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _seleccionardireccionremitenteemailsant(RemoteObject __ref,RemoteObject _lstopciones) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDireccionRemitenteEmailsAnt (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,968);
if (RapidSub.canDelegate("seleccionardireccionremitenteemailsant")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","seleccionardireccionremitenteemailsant", __ref, _lstopciones);}
ResumableSub_SeleccionarDireccionRemitenteEmailsAnt rsub = new ResumableSub_SeleccionarDireccionRemitenteEmailsAnt(null,__ref,_lstopciones);
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
public static class ResumableSub_SeleccionarDireccionRemitenteEmailsAnt extends BA.ResumableSub {
public ResumableSub_SeleccionarDireccionRemitenteEmailsAnt(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref,RemoteObject _lstopciones) {
this.parent = parent;
this.__ref = __ref;
this._lstopciones = _lstopciones;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _lstopciones;
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDireccionRemitenteEmailsAnt (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,968);
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
Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 969;BA.debugLine="DireccionSeleccionadaRemitenteEmails=\"\"";
Debug.ShouldStop(256);
__ref.setField ("_direccionseleccionadaremitenteemails" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 971;BA.debugLine="Dialog.Title=\"Selecciona Cuenta para Enviar los E";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Cuenta para Enviar los Emails")));
 BA.debugLineNum = 972;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(2048);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 973;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 974;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(8192);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 975;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(16384);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 976;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(32768);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 978;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(131072);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 979;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(262144);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 980;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(524288);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 982;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(2097152);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 983;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(4194304);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 985;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(16777216);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 986;BA.debugLine="B4XListDlg.Resize(600dip,300dip)";
Debug.ShouldStop(33554432);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))));
 BA.debugLineNum = 988;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(134217728);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 995;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(4);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 996;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 4;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 998;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(32);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 999;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(64);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 1000;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(128);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1003;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemailsant"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1004;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
this.state = -1;
;
 BA.debugLineNum = 1006;BA.debugLine="DireccionSeleccionadaRemitenteEmails=B4XListDlg.S";
Debug.ShouldStop(8192);
__ref.setField ("_direccionseleccionadaremitenteemails" /*RemoteObject*/ ,_b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ ));
 BA.debugLineNum = 1008;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1011;BA.debugLine="End Sub";
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
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cseguimientofechasprometidascompra","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cseguimientofechasprometidascompra parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _dcf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,24);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 26;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 27;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(67108864);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 29;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(268435456);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 30;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(536870912);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 31;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(1073741824);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 32;BA.debugLine="frm.RootPane.LoadLayout(\"scrSeguimientoFechasProm";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrSeguimientoFechasPrometidasCompra")));
 BA.debugLineNum = 33;BA.debugLine="Sleep(0)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "show"),BA.numberCast(int.class, 0));
this.state = 17;
return;
case 17:
//C
this.state = 1;
;
 BA.debugLineNum = 34;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    Seguimien";
Debug.ShouldStop(2);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("    Seguimiento Fechas Prometidas Pedidos Compra")));
 BA.debugLineNum = 36;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(8);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 37;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 39;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.ShouldStop(64);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Email Reclamación Proveedor")),(Object)(BA.ObjectToString("EmailReclamacionProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf003)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 41;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Seleccionar Cuenta Remitente Email")),(Object)(BA.ObjectToString("SeleccionarCuentaRemitenteEmail")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf2bc)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 42;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.ShouldStop(512);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Excluir Todo lo Filtrado")),(Object)(BA.ObjectToString("ExcluirtodoLoFiltrado")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf046)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="jamTableView1.AddMenuItemFontMaterialIconsToMenuI";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontmaterialiconstomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Desmarcar Todo lo Excluido")),(Object)(BA.ObjectToString("DesmarcarTodoLoExcluido")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe835)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Email Reclamación Proveedor")),(Object)(BA.ObjectToString("EmailReclamacionProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf003)))))));
 BA.debugLineNum = 48;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="Dim img As Image";
Debug.ShouldStop(65536);
_img = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 50;BA.debugLine="img.InitializeSample(File.DirAssets,\"navision.png";
Debug.ShouldStop(131072);
_img.runVoidMethod ("InitializeSample",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("navision.png")),(Object)(BA.numberCast(double.class, 24)),(Object)(BA.numberCast(double.class, 24)));
 BA.debugLineNum = 51;BA.debugLine="jamTableView1.AddContextMenuItemImage(\"Ver Pedido";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ver Pedido Compra NAV")),(Object)(BA.ObjectToString("VerPedidoCompraNAV")),(Object)(_img));
 BA.debugLineNum = 54;BA.debugLine="jamTableView1.AddContextMenuItemImage(\"Artículo N";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Artículo NAV")),(Object)(BA.ObjectToString("VerArticuloNAV")),(Object)(_img));
 BA.debugLineNum = 55;BA.debugLine="jamTableView1.AddContextMenuItemColumna(\"FechaEnv";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemcolumna" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FechaEnvioReclamacionLong")),(Object)(BA.ObjectToString("Ver datos última RFP")),(Object)(RemoteObject.createImmutable("DatosUltimaRFP")));
 BA.debugLineNum = 60;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(134217728);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaSeguimientoFechasPrometidasCompras.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 61;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "show"), _rsub);
this.state = 18;
return;
case 18:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 62;BA.debugLine="Log(mRes)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","87602214",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 63;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 64;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 65;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "show"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 4;
;
 BA.debugLineNum = 66;BA.debugLine="frm.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 67;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 70;BA.debugLine="jamTableView1.AlturaFilas=0";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 72;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(128);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 73;BA.debugLine="CF.Initialize";
Debug.ShouldStop(256);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 74;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
Debug.ShouldStop(512);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_cellfactory_columnafechasqlserver" /*RemoteObject*/ ));
 BA.debugLineNum = 75;BA.debugLine="CF.CellFactoryEnCallBack=False";
Debug.ShouldStop(1024);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 76;BA.debugLine="CF.params=Null";
Debug.ShouldStop(2048);
_cf.setField ("params" /*RemoteObject*/ ,(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 78;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("FechaPedido"),BA.ObjectToString("FechaPrometida"),RemoteObject.createImmutable("FechaEnvioReclamacionLong")})))));
 BA.debugLineNum = 80;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(32768);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 81;BA.debugLine="CF.Initialize";
Debug.ShouldStop(65536);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
Debug.ShouldStop(131072);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_cellfactory_columnawraptext" /*RemoteObject*/ ));
 BA.debugLineNum = 83;BA.debugLine="CF.CellFactoryEnCallBack=False";
Debug.ShouldStop(262144);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 84;BA.debugLine="CF.params=Null";
Debug.ShouldStop(524288);
_cf.setField ("params" /*RemoteObject*/ ,(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 85;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("NombreProveedor"),RemoteObject.createImmutable("DescripcionArticulo")})))));
 BA.debugLineNum = 87;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(4194304);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 88;BA.debugLine="CF.Initialize";
Debug.ShouldStop(8388608);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 89;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
Debug.ShouldStop(16777216);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_cellfactory_columnabooleanatipointegercheckboxsolotrue" /*RemoteObject*/ ));
 BA.debugLineNum = 90;BA.debugLine="CF.CellFactoryEnCallBack=False";
Debug.ShouldStop(33554432);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 91;BA.debugLine="CF.params=Null";
Debug.ShouldStop(67108864);
_cf.setField ("params" /*RemoteObject*/ ,(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 92;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("FechaPrometidaVencida"),RemoteObject.createImmutable("PendienteSeguimiento")})))));
 BA.debugLineNum = 94;BA.debugLine="Dim dCF As DatosCellFactoryJamTableView";
Debug.ShouldStop(536870912);
_dcf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("dCF", _dcf);
 BA.debugLineNum = 95;BA.debugLine="dCF.Initialize";
Debug.ShouldStop(1073741824);
_dcf.runVoidMethod ("Initialize");
 BA.debugLineNum = 96;BA.debugLine="dCF.AliasCampoColumna=\"ExcluidoReclamacion\"";
Debug.ShouldStop(-2147483648);
_dcf.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("ExcluidoReclamacion"));
 BA.debugLineNum = 97;BA.debugLine="dCF.CellFactoryEnCallBack=False";
Debug.ShouldStop(1);
_dcf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 98;BA.debugLine="dCF.NombreFuncionCellFactory=jamTableView1.CellFa";
Debug.ShouldStop(2);
_dcf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_cellfactory_columnabooleanatipointegercheckbox" /*RemoteObject*/ ));
 BA.debugLineNum = 99;BA.debugLine="jamTableView1.SetCellFactory(dCF)";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactory" /*RemoteObject*/ ,(Object)(_dcf));
 BA.debugLineNum = 101;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_tooltiptablecolumncolorfondocolortextosizefont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("PendienteSeguimiento")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Pendiente Seguimiento:"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("  - SIN Fecha Prometida"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("o"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" - Fecha Prometida Vencida"))),(Object)(BA.ObjectToString("lightyellow")),(Object)(BA.ObjectToString("black")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 102;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_tooltiptablecolumncolorfondocolortextosizefont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FechaPrometidaVencida")),(Object)(BA.ObjectToString("Fecha Prometida Vencida")),(Object)(BA.ObjectToString("lightyellow")),(Object)(BA.ObjectToString("black")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 103;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
Debug.ShouldStop(64);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_tooltiptablecolumncolorfondocolortextosizefont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("DiasRespectoAPlazo")),(Object)(BA.ObjectToString("Días Respecto al plazo prometido por el proveedor")),(Object)(BA.ObjectToString("lightyellow")),(Object)(BA.ObjectToString("black")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 104;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_tooltiptablecolumncolorfondocolortextosizefont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FechaEnvioReclamacionLong")),(Object)(BA.ObjectToString("Fecha en la que se grabó la última reclamación de plazo para cada Pedido-Línea")),(Object)(BA.ObjectToString("lightyellow")),(Object)(BA.ObjectToString("black")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 105;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_tooltiptablecolumncolorfondocolortextosizefont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ExcluidoReclamacion")),(Object)(BA.ObjectToString("Marcar para EXCLUIR del informe de reclamación que se adjuntará al correo.")),(Object)(BA.ObjectToString("lightyellow")),(Object)(BA.ObjectToString("black")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 106;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
Debug.ShouldStop(512);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_tooltiptablecolumncolorfondocolortextosizefont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VPG")),(Object)(BA.ObjectToString("Grupo Contable Negocio del proveedor.")),(Object)(BA.ObjectToString("lightyellow")),(Object)(BA.ObjectToString("black")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 107;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_tooltiptablecolumncolorfondocolortextosizefont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("DiasDesdePedido")),(Object)(BA.ObjectToString("Nº de días transcurridos entre la fecha de creación del pedido y la fecha actual.")),(Object)(BA.ObjectToString("lightyellow")),(Object)(BA.ObjectToString("black")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 109;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 113;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.ShouldStop(65536);
if (true) break;

case 5:
//if
this.state = 10;
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("Close");
if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 115;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nom";
Debug.ShouldStop(262144);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 120;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="frm.Show";
Debug.ShouldStop(33554432);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 124;BA.debugLine="Dim joForm As JavaObject=asJO(frm)";
Debug.ShouldStop(134217728);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 125;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(268435456);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 126;BA.debugLine="joStage.RunMethod(\"setMaximized\",Array(True))";
Debug.ShouldStop(536870912);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 130;BA.debugLine="frm.RootPane.MouseCursor= fx.Cursors.WAIT";
Debug.ShouldStop(2);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 132;BA.debugLine="CrearVBSScriptDireccionRemitenteEmailOutlook";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_crearvbsscriptdireccionremitenteemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 136;BA.debugLine="CrearVBSScriptEnvioEmailOutlookHTML";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_crearvbsscriptenvioemailoutlookhtml" /*RemoteObject*/ );
 BA.debugLineNum = 138;BA.debugLine="WAIT FOR (ActualizarDatos) COMPLETE (rBool As Boo";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseguimientofechasprometidascompra", "show"), __ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_actualizardatos" /*RemoteObject*/ ));
this.state = 20;
return;
case 20:
//C
this.state = 11;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 139;BA.debugLine="If rBool= False Then SalirModulo";
Debug.ShouldStop(1024);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
__ref.runClassMethod (b4j.docU.cseguimientofechasprometidascompra.class, "_salirmodulo" /*RemoteObject*/ );
if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 141;BA.debugLine="End Sub";
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
public static RemoteObject  _stringbodyemail(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StringBodyEmail (cseguimientofechasprometidascompra) ","cseguimientofechasprometidascompra",3,__ref.getField(false, "ba"),__ref,922);
if (RapidSub.canDelegate("stringbodyemail")) { return __ref.runUserSub(false, "cseguimientofechasprometidascompra","stringbodyemail", __ref);}
RemoteObject _sbody = RemoteObject.createImmutable("");
 BA.debugLineNum = 922;BA.debugLine="Sub StringBodyEmail As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 923;BA.debugLine="Dim sBody As String=$\" Buenos Días  Adjunto lista";
Debug.ShouldStop(67108864);
_sbody = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Buenos Días\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Adjunto listado excel de pedidos pendientes sin información de plazo de entrega o cuya fecha informada esta vencida.\n"),RemoteObject.createImmutable("Necesitamos cumplimenten el documento adjunto con las fechas actualizadas y nos lo hagan llegar a urgentemente.\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("")));Debug.locals.put("sBody", _sbody);Debug.locals.put("sBody", _sbody);
 BA.debugLineNum = 930;BA.debugLine="Return sBody";
Debug.ShouldStop(2);
if (true) return _sbody;
 BA.debugLineNum = 931;BA.debugLine="End Sub";
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