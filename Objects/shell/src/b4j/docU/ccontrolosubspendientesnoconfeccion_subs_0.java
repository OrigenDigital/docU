package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ccontrolosubspendientesnoconfeccion_subs_0 {


public static void  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("actualizardatos")) { __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","actualizardatos", __ref); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,126);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 128;BA.debugLine="JamTableCLV1.Clear";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 130;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblPedFabPtesNoCor";
Debug.ShouldStop(2);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblPedFabPtesNoCorteNoConf")));
 BA.debugLineNum = 131;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblOSUBsPendientes";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblOSUBsPendientesNoCorteNoConf")));
 BA.debugLineNum = 133;BA.debugLine="FechaHoyHora0=DateUtils.SetDate(DateTime.GetYear(";
Debug.ShouldStop(16);
__ref.setField ("_fechahoyhora0" /*RemoteObject*/ ,parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))))));
 BA.debugLineNum = 136;BA.debugLine="Wait For(ActualizarDatosOSUBsPtesNAV) complete (m";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_actualizardatososubsptesnav" /*RemoteObject*/ ));
this.state = 42;
return;
case 42:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 137;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(256);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 138;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 139;BA.debugLine="SalirModulo";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 140;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 144;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(32768);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 145;BA.debugLine="sb.Initialize";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 146;BA.debugLine="sb.Append(\"insert into tblOSUBsPendientesNoCorteN";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("insert into tblOSUBsPendientesNoCorteNoConf (OSUB, FechaOSUB, Proveedor, NombreProveedor, Articulo, Descripcion, RutaOF, Cliente, NombreCliente, ResponsableCuenta, QtyPte, TransfComp, FinalizaProducto)")));
 BA.debugLineNum = 147;BA.debugLine="sb.Append(\" Select PedidoFab As OSUB, FechaPedido";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" Select PedidoFab As OSUB, FechaPedido As FechaOSUB, Proveedor, NombreProveedor, Articulo, Descripcion, RutaOF, Cliente, NombreCliente, ResponsableCuenta,sum(QtyPte) as QtyPte, TransfComp, FinalizaProducto")));
 BA.debugLineNum = 148;BA.debugLine="sb.Append(\" from tblPedFabPtesNoCorteNoConf group";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" from tblPedFabPtesNoCorteNoConf group by PedidoFab, FechaPedido, Proveedor, NombreProveedor, Articulo, Descripcion, RutaOF, Cliente, NombreCliente, ResponsableCuenta,TransfComp, FinalizaProducto")));
 BA.debugLineNum = 149;BA.debugLine="mSQL.ExecNonQuery(sb.ToString)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 151;BA.debugLine="wait for(BorrarDatosBatchAnterioresUUIDSesion) co";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_borrardatosbatchanterioresuuidsesion" /*RemoteObject*/ ));
this.state = 43;
return;
case 43:
//C
this.state = 5;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 152;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 153;BA.debugLine="SalirModulo";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 154;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 157;BA.debugLine="wait for(InsertarLineasBatchDocumentos) complete";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_insertarlineasbatchdocumentos" /*RemoteObject*/ ));
this.state = 44;
return;
case 44:
//C
this.state = 9;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 158;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 159;BA.debugLine="SalirModulo";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 160;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 163;BA.debugLine="wait for(FaseActualDocumentosBacthUUID) complete";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_faseactualdocumentosbacthuuid" /*RemoteObject*/ ));
this.state = 45;
return;
case 45:
//C
this.state = 13;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 164;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 165;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(16);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 166;BA.debugLine="SalirModulo";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 167;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 193;BA.debugLine="wait for(FechasPrioridadVentasDocumentosBacthUUID";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_fechasprioridadventasdocumentosbacthuuid" /*RemoteObject*/ ));
this.state = 46;
return;
case 46:
//C
this.state = 17;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 194;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(2);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 195;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(4);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 196;BA.debugLine="SalirModulo";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 197;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return ;
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 200;BA.debugLine="mSQL.ExecNonQuery2(\"update tblOSUBsPendientesNoCo";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOSUBsPendientesNoCorteNoConf set Fase=? where Fase=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("NO INICIADO")),(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 202;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(512);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblOSUBsPendientesNoCorteNoConf")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 203;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
Debug.ShouldStop(1024);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 204;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), _rsub);
this.state = 47;
return;
case 47:
//C
this.state = 21;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 205;BA.debugLine="rs.Close";
Debug.ShouldStop(4096);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 206;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(8192);
if (true) break;

case 21:
//if
this.state = 41;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 207;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(16384);
if (true) break;

case 24:
//if
this.state = 31;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 208;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 209;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), _msa);
this.state = 48;
return;
case 48:
//C
this.state = 27;
;
 BA.debugLineNum = 211;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 212;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), _msa);
this.state = 49;
return;
case 49:
//C
this.state = 27;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 213;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(1048576);
if (true) break;

case 27:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 214;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 215;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 218;BA.debugLine="ExitApplication";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 220;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(134217728);

case 31:
//if
this.state = 40;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 221;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(268435456);
if (true) break;

case 34:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
if (true) return ;
if (true) break;

case 39:
//C
this.state = 40;
;
 BA.debugLineNum = 222;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 223;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), _msa);
this.state = 50;
return;
case 50:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = -1;
;
 BA.debugLineNum = 229;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Datos actualiz";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Datos actualizados.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 230;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), _msa);
this.state = 51;
return;
case 51:
//C
this.state = -1;
;
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static RemoteObject  _actualizardatososubsptesnav(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosOSUBsPtesNAV (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,365);
if (RapidSub.canDelegate("actualizardatososubsptesnav")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","actualizardatososubsptesnav", __ref);}
ResumableSub_ActualizarDatosOSUBsPtesNAV rsub = new ResumableSub_ActualizarDatosOSUBsPtesNAV(null,__ref);
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
public static class ResumableSub_ActualizarDatosOSUBsPtesNAV extends BA.ResumableSub {
public ResumableSub_ActualizarDatosOSUBsPtesNAV(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosOSUBsPtesNAV (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,365);
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
 BA.debugLineNum = 366;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblPedFabPtesNoCor";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblPedFabPtesNoCorteNoConf")));
 BA.debugLineNum = 367;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16384);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 368;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(32768);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 369;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 375;BA.debugLine="Dim Comando As String=\"InfoPedidosFabPtesNoCorteN";
Debug.ShouldStop(4194304);
_comando = BA.ObjectToString("InfoPedidosFabPtesNoCorteNoConfeccion");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 376;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
Debug.ShouldStop(8388608);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 378;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatososubsptesnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 380;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 381;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 382;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatososubsptesnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 383;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 384;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 387;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 388;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 389;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 390;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de OSUBs Pendientes No Corte No Confección")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 391;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatososubsptesnav"), _msa);
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
 BA.debugLineNum = 393;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(256);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 394;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 397;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4096);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 405;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(1048576);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblPedFabPtesNoCorteNoConf")),(Object)(_lstreg));
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
 BA.debugLineNum = 408;BA.debugLine="Return mRes";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _actualizarfechagestionorden(RemoteObject __ref,RemoteObject _idtipof,RemoteObject _ordenf,RemoteObject _fechal,RemoteObject _idu,RemoteObject _nombreusu) throws Exception{
try {
		Debug.PushSubsStack("ActualizarFechaGestionOrden (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1376);
if (RapidSub.canDelegate("actualizarfechagestionorden")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","actualizarfechagestionorden", __ref, _idtipof, _ordenf, _fechal, _idu, _nombreusu);}
ResumableSub_ActualizarFechaGestionOrden rsub = new ResumableSub_ActualizarFechaGestionOrden(null,__ref,_idtipof,_ordenf,_fechal,_idu,_nombreusu);
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
public static class ResumableSub_ActualizarFechaGestionOrden extends BA.ResumableSub {
public ResumableSub_ActualizarFechaGestionOrden(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref,RemoteObject _idtipof,RemoteObject _ordenf,RemoteObject _fechal,RemoteObject _idu,RemoteObject _nombreusu) {
this.parent = parent;
this.__ref = __ref;
this._idtipof = _idtipof;
this._ordenf = _ordenf;
this._fechal = _fechal;
this._idu = _idu;
this._nombreusu = _nombreusu;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _idtipof;
RemoteObject _ordenf;
RemoteObject _fechal;
RemoteObject _idu;
RemoteObject _nombreusu;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _mreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarFechaGestionOrden (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1376);
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
Debug.locals.put("IDTipoF", _idtipof);
Debug.locals.put("OrdenF", _ordenf);
Debug.locals.put("FechaL", _fechal);
Debug.locals.put("IDU", _idu);
Debug.locals.put("NombreUsu", _nombreusu);
 BA.debugLineNum = 1377;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1378;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(2);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1379;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(4);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 1380;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(8);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("NuevaFechaGestionOrdenFab")),(Object)((RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.NumberToString(_idtipof),_ordenf,BA.NumberToString(_fechal),BA.NumberToString(_idu),_nombreusu}))),(Object)(__ref));
 BA.debugLineNum = 1382;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizarfechagestionorden"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1383;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 1384;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query NuevaFechaGestionOrdenFab")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1385;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizarfechagestionorden"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1386;BA.debugLine="Accion=\"Error\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("Error");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1388;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(2048);
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
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1391;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16384);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1392;BA.debugLine="Dim mReg As Map=lstReg.Get(0)";
Debug.ShouldStop(32768);
_mreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mReg", _mreg);Debug.locals.put("mReg", _mreg);
 BA.debugLineNum = 1393;BA.debugLine="Dim sResp As String=mReg.GetValueAt(0)";
Debug.ShouldStop(65536);
_sresp = BA.ObjectToString(_mreg.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1394;BA.debugLine="If sResp<>\"OK\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",_sresp,BA.ObjectToString("OK"))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1395;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sResp & CRLF";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_sresp,parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("No se ha actualizado la fecha"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1396;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizarfechagestionorden"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 1397;BA.debugLine="Accion=\"Error\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("Error");Debug.locals.put("Accion", _accion);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1399;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
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
 BA.debugLineNum = 1403;BA.debugLine="Return Accion";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 1404;BA.debugLine="End Sub";
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
public static RemoteObject  _actualizarprioridaddocumento(RemoteObject __ref,RemoteObject _idtipoprioridad,RemoteObject _docsel) throws Exception{
try {
		Debug.PushSubsStack("ActualizarPrioridadDocumento (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1228);
if (RapidSub.canDelegate("actualizarprioridaddocumento")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","actualizarprioridaddocumento", __ref, _idtipoprioridad, _docsel);}
ResumableSub_ActualizarPrioridadDocumento rsub = new ResumableSub_ActualizarPrioridadDocumento(null,__ref,_idtipoprioridad,_docsel);
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
public static class ResumableSub_ActualizarPrioridadDocumento extends BA.ResumableSub {
public ResumableSub_ActualizarPrioridadDocumento(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref,RemoteObject _idtipoprioridad,RemoteObject _docsel) {
this.parent = parent;
this.__ref = __ref;
this._idtipoprioridad = _idtipoprioridad;
this._docsel = _docsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _idtipoprioridad;
RemoteObject _docsel;
RemoteObject _lstcomandos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarPrioridadDocumento (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1228);
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
Debug.locals.put("IDTipoPrioridad", _idtipoprioridad);
Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 1230;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(8192);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 1231;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(16384);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 1233;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"A";
Debug.ShouldStop(65536);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ActualizarPrioridadDocumentoNoGestionado")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_docsel),(_idtipoprioridad),(_idtipoprioridad)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1234;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(131072);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 1235;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizarprioridaddocumento"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1236;BA.debugLine="If Success=False Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 1237;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar la prioridad para el documento "),_docsel,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1238;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizarprioridaddocumento"), _msa);
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 BA.debugLineNum = 1239;BA.debugLine="Return Success";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1242;BA.debugLine="Return Success";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 1243;BA.debugLine="End Sub";
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
public static RemoteObject  _actualizartblprioridadespedidosfab(RemoteObject __ref,RemoteObject _pedidofab,RemoteObject _prioridad,RemoteObject _fecharequeridalong,RemoteObject _usuario) throws Exception{
try {
		Debug.PushSubsStack("ActualizarTblPrioridadesPedidosFab (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1408);
if (RapidSub.canDelegate("actualizartblprioridadespedidosfab")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","actualizartblprioridadespedidosfab", __ref, _pedidofab, _prioridad, _fecharequeridalong, _usuario);}
ResumableSub_ActualizarTblPrioridadesPedidosFab rsub = new ResumableSub_ActualizarTblPrioridadesPedidosFab(null,__ref,_pedidofab,_prioridad,_fecharequeridalong,_usuario);
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
public static class ResumableSub_ActualizarTblPrioridadesPedidosFab extends BA.ResumableSub {
public ResumableSub_ActualizarTblPrioridadesPedidosFab(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref,RemoteObject _pedidofab,RemoteObject _prioridad,RemoteObject _fecharequeridalong,RemoteObject _usuario) {
this.parent = parent;
this.__ref = __ref;
this._pedidofab = _pedidofab;
this._prioridad = _prioridad;
this._fecharequeridalong = _fecharequeridalong;
this._usuario = _usuario;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _pedidofab;
RemoteObject _prioridad;
RemoteObject _fecharequeridalong;
RemoteObject _usuario;
RemoteObject _fechaexcel = RemoteObject.createImmutable(0);
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarTblPrioridadesPedidosFab (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1408);
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
Debug.locals.put("PedidoFab", _pedidofab);
Debug.locals.put("Prioridad", _prioridad);
Debug.locals.put("FechaRequeridaLong", _fecharequeridalong);
Debug.locals.put("Usuario", _usuario);
 BA.debugLineNum = 1409;BA.debugLine="Dim FechaExcel As Int=TicksToExcelDate(FechaReque";
Debug.ShouldStop(1);
_fechaexcel = BA.numberCast(int.class, __ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_tickstoexceldate" /*RemoteObject*/ ,(Object)(_fecharequeridalong)));Debug.locals.put("FechaExcel", _fechaexcel);Debug.locals.put("FechaExcel", _fechaexcel);
 BA.debugLineNum = 1410;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"A";
Debug.ShouldStop(2);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ActualizarPrioridadOrdenesFab")),(Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(_pedidofab),(_prioridad),(_fechaexcel),(_usuario),(_prioridad),(_fechaexcel),(_usuario)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1411;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizartblprioridadespedidosfab"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1412;BA.debugLine="If Success=False Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 1413;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible actualizar la tabla tblprioridadespedidosfab.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1414;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "actualizartblprioridadespedidosfab"), _msa);
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
 BA.debugLineNum = 1416;BA.debugLine="Return Success";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 1418;BA.debugLine="End Sub";
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
public static RemoteObject  _borrardatosbatchanterioresuuidsesion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosBatchAnterioresUUIDSesion (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,870);
if (RapidSub.canDelegate("borrardatosbatchanterioresuuidsesion")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","borrardatosbatchanterioresuuidsesion", __ref);}
ResumableSub_BorrarDatosBatchAnterioresUUIDSesion rsub = new ResumableSub_BorrarDatosBatchAnterioresUUIDSesion(null,__ref);
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
public static class ResumableSub_BorrarDatosBatchAnterioresUUIDSesion extends BA.ResumableSub {
public ResumableSub_BorrarDatosBatchAnterioresUUIDSesion(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosBatchAnterioresUUIDSesion (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,870);
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
 BA.debugLineNum = 872;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(128);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 873;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(256);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 874;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
Debug.ShouldStop(512);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarLineasFaseActualDocumentoBacthUUID")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_uuidsesion" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 875;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(1024);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 876;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(2048);
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 877;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "borrardatosbatchanterioresuuidsesion"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 879;BA.debugLine="If result=False Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,parent.__c.getField(true,"False"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 880;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthUUID")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 881;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "borrardatosbatchanterioresuuidsesion"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 BA.debugLineNum = 882;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 884;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 886;BA.debugLine="End Sub";
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
public static void  _ejecutarbatch_completed(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _borrardatosfaseactualdocumentosbatchanterioresmaquinausuario(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,852);
if (RapidSub.canDelegate("borrardatosfaseactualdocumentosbatchanterioresmaquinausuario")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","borrardatosfaseactualdocumentosbatchanterioresmaquinausuario", __ref);}
ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario rsub = new ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario(null,__ref);
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
public static class ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario extends BA.ResumableSub {
public ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,852);
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
 BA.debugLineNum = 854;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(2097152);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 855;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(4194304);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 856;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
Debug.ShouldStop(8388608);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarLineasFaseActualDocumentoBacthMaquinaUsuario")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(parent._main._datosusuario /*RemoteObject*/ .getField(true,"Dispositivo" /*RemoteObject*/ )),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 857;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(16777216);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 858;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(33554432);
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 859;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 861;BA.debugLine="If result=False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,parent.__c.getField(true,"False"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 862;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthMaquinaUsuario")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 863;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 BA.debugLineNum = 864;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 866;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 868;BA.debugLine="End Sub";
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
public static RemoteObject  _btnactualizar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnActualizar_Click (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,628);
if (RapidSub.canDelegate("btnactualizar_click")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","btnactualizar_click", __ref);}
 BA.debugLineNum = 628;BA.debugLine="Private Sub btnActualizar_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 629;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 630;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnejemplo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEjemplo_Click (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,632);
if (RapidSub.canDelegate("btnejemplo_click")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","btnejemplo_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
 BA.debugLineNum = 632;BA.debugLine="Private Sub btnEjemplo_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 633;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(16777216);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), ccontrolosubspendientesnoconfeccion.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 634;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(33554432);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 635;BA.debugLine="Log(mData)";
Debug.ShouldStop(67108864);
ccontrolosubspendientesnoconfeccion.__c.runVoidMethod ("LogImpl","859637763",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 636;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(134217728);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 637;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnfasesdoc_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnFasesDoc_Click (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,835);
if (RapidSub.canDelegate("btnfasesdoc_click")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","btnfasesdoc_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _docsel = RemoteObject.createImmutable("");
RemoteObject _cfdoc = RemoteObject.declareNull("b4j.docU.cfasesdocumento");
 BA.debugLineNum = 835;BA.debugLine="Private Sub btnFasesDoc_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 836;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(8);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), ccontrolosubspendientesnoconfeccion.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 837;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(16);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 838;BA.debugLine="Log(mData)";
Debug.ShouldStop(32);
ccontrolosubspendientesnoconfeccion.__c.runVoidMethod ("LogImpl","859834371",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 841;BA.debugLine="Dim DocSel As String=mData.Get(\"OSUB\")";
Debug.ShouldStop(256);
_docsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OSUB")))));Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 843;BA.debugLine="Dim cFDoc As cFasesDocumento";
Debug.ShouldStop(1024);
_cfdoc = RemoteObject.createNew ("b4j.docU.cfasesdocumento");Debug.locals.put("cFDoc", _cfdoc);
 BA.debugLineNum = 844;BA.debugLine="cFDoc.Initialize(Me, frm.RootPane,DocSel)";
Debug.ShouldStop(2048);
_cfdoc.runClassMethod (b4j.docU.cfasesdocumento.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()),(Object)(_docsel));
 BA.debugLineNum = 845;BA.debugLine="cFDoc.Show";
Debug.ShouldStop(4096);
_cfdoc.runClassMethod (b4j.docU.cfasesdocumento.class, "_show" /*void*/ );
 BA.debugLineNum = 846;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnmostrardocumentoennavision_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMostrarDocumentoEnNavision_Click (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1052);
if (RapidSub.canDelegate("btnmostrardocumentoennavision_click")) { __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","btnmostrardocumentoennavision_click", __ref); return;}
ResumableSub_btnMostrarDocumentoEnNavision_Click rsub = new ResumableSub_btnMostrarDocumentoEnNavision_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnMostrarDocumentoEnNavision_Click extends BA.ResumableSub {
public ResumableSub_btnMostrarDocumentoEnNavision_Click(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
RemoteObject _docsel = RemoteObject.createImmutable("");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnMostrarDocumentoEnNavision_Click (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1052);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1053;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(268435456);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 1054;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(536870912);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1055;BA.debugLine="Log(mData)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","860227587",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 1056;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(-2147483648);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 1058;BA.debugLine="Dim DocSel As String=mData.Get(\"OSUB\")";
Debug.ShouldStop(2);
_docsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OSUB")))));Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 1068;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirLin";
Debug.ShouldStop(2048);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Orden producción")),(Object)(BA.numberCast(int.class, 50147)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1073;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnmostrardocumentoennavision_click"), _rsub);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 1075;BA.debugLine="If success Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1078;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible abrir la ficha de la OSUB "),_docsel,RemoteObject.createImmutable(" en NAVISION."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1079;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnmostrardocumentoennavision_click"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1081;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _btnmostrardocumentoennavision_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btnMostrarDocumentoEnNavision_MousePressed (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1449);
if (RapidSub.canDelegate("btnmostrardocumentoennavision_mousepressed")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","btnmostrardocumentoennavision_mousepressed", __ref, _eventdata);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1449;BA.debugLine="Private Sub btnMostrarDocumentoEnNavision_MousePre";
Debug.ShouldStop(256);
 BA.debugLineNum = 1450;BA.debugLine="Dim b As Button=Sender";
Debug.ShouldStop(512);
_b = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), ccontrolosubspendientesnoconfeccion.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 1451;BA.debugLine="CSSUtils.SetBorder(b,2,fx.Colors.From32Bit(0xFF00";
Debug.ShouldStop(1024);
ccontrolosubspendientesnoconfeccion._cssutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _b.getObject()),(Object)(BA.numberCast(double.class, 2)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xff00ffff))))),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 1452;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmostrardocumentoennavision_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btnMostrarDocumentoEnNavision_MouseReleased (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1454);
if (RapidSub.canDelegate("btnmostrardocumentoennavision_mousereleased")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","btnmostrardocumentoennavision_mousereleased", __ref, _eventdata);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1454;BA.debugLine="Private Sub btnMostrarDocumentoEnNavision_MouseRel";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1455;BA.debugLine="Dim b As Button=Sender";
Debug.ShouldStop(16384);
_b = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), ccontrolosubspendientesnoconfeccion.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 1456;BA.debugLine="CSSUtils.SetBorder(b,2,fx.Colors.From32Bit(0xFF87";
Debug.ShouldStop(32768);
ccontrolosubspendientesnoconfeccion._cssutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _b.getObject()),(Object)(BA.numberCast(double.class, 2)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xff87cefa))))),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 1457;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("btnSalir_Click (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","btnsalir_click", __ref);}
 BA.debugLineNum = 243;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="SalirModulo";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnselalmfisico_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelAlmFisico_Click (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,641);
if (RapidSub.canDelegate("btnselalmfisico_click")) { __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","btnselalmfisico_click", __ref); return;}
ResumableSub_btnSelAlmFisico_Click rsub = new ResumableSub_btnSelAlmFisico_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelAlmFisico_Click extends BA.ResumableSub {
public ResumableSub_btnSelAlmFisico_Click(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
RemoteObject _docsel = RemoteObject.createImmutable("");
RemoteObject _offset_before_dialog = RemoteObject.createImmutable(0f);
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
int _i = 0;
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _almfis = RemoteObject.createImmutable("");
RemoteObject _lstcomandos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _mdatamodif = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rbool = RemoteObject.createImmutable(false);
int step21;
int limit21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelAlmFisico_Click (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,641);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 642;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(2);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 644;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(8);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 645;BA.debugLine="Log(mData)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","859703300",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 646;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(32);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 648;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
Debug.ShouldStop(128);
_docsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 651;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(1024);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 652;BA.debugLine="Dialog.Title=\"Selecciona Almacén Físico de Prepar";
Debug.ShouldStop(2048);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Almacén Físico de Preparación")));
 BA.debugLineNum = 653;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 654;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(8192);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 655;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(16384);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 656;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(32768);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 657;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(65536);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 659;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(262144);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 660;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(524288);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 661;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(1048576);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 663;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(4194304);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 664;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(8388608);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 666;BA.debugLine="Dim lstOpciones As List=Array As String(\"PROIN\",\"";
Debug.ShouldStop(33554432);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstopciones = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("PROIN"),BA.ObjectToString("PROTEC"),RemoteObject.createImmutable("ADESA")})));Debug.locals.put("lstOpciones", _lstopciones);Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 668;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(134217728);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 670;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(536870912);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 672;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//for
this.state = 4;
step21 = 1;
limit21 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 4;
if ((step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21)) this.state = 3;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step21)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 24;
 BA.debugLineNum = 673;BA.debugLine="xclv.ResizeItem(i,80dip)";
Debug.ShouldStop(1);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 677;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(16);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 678;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 680;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(128);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 681;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(256);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 682;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(512);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 685;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnselalmfisico_click"), _rsub);
this.state = 25;
return;
case 25:
//C
this.state = 9;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 686;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 687;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(16384);
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
if (true) return ;
if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 689;BA.debugLine="Dim AlmFis As String=B4XListDlg.SelectedItem";
Debug.ShouldStop(65536);
_almfis = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("AlmFis", _almfis);Debug.locals.put("AlmFis", _almfis);
 BA.debugLineNum = 691;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(262144);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 692;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(524288);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 694;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"B";
Debug.ShouldStop(2097152);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarDocumentoAlmacenManual")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_docsel)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 695;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(4194304);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 696;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"I";
Debug.ShouldStop(8388608);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InsertarDocumentoAlmacenManual")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_docsel),(_almfis)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 697;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(16777216);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 698;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnselalmfisico_click"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 26;
return;
case 26:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 699;BA.debugLine="If Success=False Then";
Debug.ShouldStop(67108864);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 700;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar el almacén físico para el documento "),_docsel,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 701;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnselalmfisico_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 705;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
Debug.ShouldStop(1);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set AlmacenFisico=? where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_almfis,_docsel})))));
 BA.debugLineNum = 706;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOSUBsPe";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOSUBsPendientesNoCorteNoConf set AlmacenFisico=? where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_almfis,_docsel})))));
 BA.debugLineNum = 713;BA.debugLine="Dim mDataModif As Map";
Debug.ShouldStop(256);
_mdatamodif = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDataModif", _mdatamodif);
 BA.debugLineNum = 714;BA.debugLine="mDataModif.Initialize";
Debug.ShouldStop(512);
_mdatamodif.runVoidMethod ("Initialize");
 BA.debugLineNum = 715;BA.debugLine="mDataModif.Put(\"AlmacenFisico\",AlmFis)";
Debug.ShouldStop(1024);
_mdatamodif.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AlmacenFisico"))),(Object)((_almfis)));
 BA.debugLineNum = 716;BA.debugLine="wait for(JamTableCLV1.ActualizarValueItemCLV(Inde";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnselalmfisico_click"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_actualizarvalueitemclv" /*RemoteObject*/ ,(Object)(_indexsel),(Object)(_mdatamodif)));
this.state = 28;
return;
case 28:
//C
this.state = 19;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 717;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 718;BA.debugLine="ExitApplication";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 721;BA.debugLine="End Sub";
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
public static RemoteObject  _btnselfecharequerida_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaRequerida_Click (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1248);
if (RapidSub.canDelegate("btnselfecharequerida_click")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","btnselfecharequerida_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1248;BA.debugLine="Private Sub btnSelFechaRequerida_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1252;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(8);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), ccontrolosubspendientesnoconfeccion.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 1253;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(16);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1254;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(32);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), ccontrolosubspendientesnoconfeccion.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 1255;BA.debugLine="EditarFechaRequeridaVentas(IndexSel, mData)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_editarfecharequeridaventas" /*void*/ ,(Object)(_indexsel),(Object)(_mdata));
 BA.debugLineNum = 1256;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnselprioridad_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelPrioridad_Click (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,723);
if (RapidSub.canDelegate("btnselprioridad_click")) { __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","btnselprioridad_click", __ref); return;}
ResumableSub_btnSelPrioridad_Click rsub = new ResumableSub_btnSelPrioridad_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelPrioridad_Click extends BA.ResumableSub {
public ResumableSub_btnSelPrioridad_Click(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
RemoteObject _docsel = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mprioridad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nombretipoprioridad = RemoteObject.createImmutable("");
RemoteObject _offset_before_dialog = RemoteObject.createImmutable(0f);
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
int _i = 0;
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _prioridadsel = RemoteObject.createImmutable(0);
RemoteObject _nombreprioridadsel = RemoteObject.createImmutable("");
RemoteObject _mpr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
RemoteObject group20;
int index20;
int groupLen20;
int step39;
int limit39;
RemoteObject group53;
int index53;
int groupLen53;
RemoteObject group68;
int index68;
int groupLen68;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelPrioridad_Click (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,723);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 724;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(524288);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 725;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(1048576);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 726;BA.debugLine="Log(mData)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","859768835",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 727;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(4194304);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 729;BA.debugLine="Dim DocSel As String=mData.Get(\"OSUB\")";
Debug.ShouldStop(16777216);
_docsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OSUB")))));Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 730;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Asignar Pr";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Asignar Prioridad al documento "),_docsel,RemoteObject.createImmutable("?"))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 731;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), _msa);
this.state = 60;
return;
case 60:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 732;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 734;BA.debugLine="If PrimerAvisoInfoEstablecerPrioridad Then";
Debug.ShouldStop(536870912);
if (true) break;

case 7:
//if
this.state = 10;
if (__ref.getField(true,"_primeravisoinfoestablecerprioridad" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 735;BA.debugLine="PrimerAvisoInfoEstablecerPrioridad=False";
Debug.ShouldStop(1073741824);
__ref.setField ("_primeravisoinfoestablecerprioridad" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 736;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"A=Máxima prio";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("A=Máxima prioridad.")),(Object)(RemoteObject.createImmutable("Información")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 737;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), _msa);
this.state = 61;
return;
case 61:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 741;BA.debugLine="wait for(CargarTiposPrioridadesDocumentosNoGestio";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), __ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_cargartiposprioridadesdocumentosnogestionados" /*RemoteObject*/ ));
this.state = 62;
return;
case 62:
//C
this.state = 11;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 742;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(32);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 743;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(64);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) return ;
if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 744;BA.debugLine="Dim lstOpciones As List";
Debug.ShouldStop(128);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 745;BA.debugLine="lstOpciones.Initialize";
Debug.ShouldStop(256);
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 746;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(512);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 750;BA.debugLine="For Each mPrioridad As Map In lstReg";
Debug.ShouldStop(8192);
if (true) break;

case 17:
//for
this.state = 20;
_mprioridad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group20 = _lstreg;
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mPrioridad", _mprioridad);
this.state = 63;
if (true) break;

case 63:
//C
this.state = 20;
if (index20 < groupLen20) {
this.state = 19;
_mprioridad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group20.runMethod(false,"Get",index20));Debug.locals.put("mPrioridad", _mprioridad);}
if (true) break;

case 64:
//C
this.state = 63;
index20++;
Debug.locals.put("mPrioridad", _mprioridad);
if (true) break;

case 19:
//C
this.state = 64;
 BA.debugLineNum = 752;BA.debugLine="Dim NombreTipoPrioridad As String";
Debug.ShouldStop(32768);
_nombretipoprioridad = RemoteObject.createImmutable("");Debug.locals.put("NombreTipoPrioridad", _nombretipoprioridad);
 BA.debugLineNum = 756;BA.debugLine="NombreTipoPrioridad=Utilidades.FixNull(mPriorida";
Debug.ShouldStop(524288);
_nombretipoprioridad = parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_mprioridad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TituloPrioridad"))))));Debug.locals.put("NombreTipoPrioridad", _nombretipoprioridad);
 BA.debugLineNum = 759;BA.debugLine="lstOpciones.Add(NombreTipoPrioridad)";
Debug.ShouldStop(4194304);
_lstopciones.runVoidMethod ("Add",(Object)((_nombretipoprioridad)));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
Debug.locals.put("mPrioridad", _mprioridad);
;
 BA.debugLineNum = 764;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(134217728);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 766;BA.debugLine="Dialog.Title=\"Selecciona Tipo de Prioridad\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Tipo de Prioridad")));
 BA.debugLineNum = 767;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 768;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 769;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(1);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 770;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(2);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 771;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(4);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 773;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(16);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 774;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(32);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 775;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(64);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 777;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(256);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 778;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(512);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 780;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(2048);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 782;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(8192);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 784;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(32768);
if (true) break;

case 21:
//for
this.state = 24;
step39 = 1;
limit39 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 65;
if (true) break;

case 65:
//C
this.state = 24;
if ((step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39)) this.state = 23;
if (true) break;

case 66:
//C
this.state = 65;
_i = ((int)(0 + _i + step39)) ;
Debug.locals.put("i", _i);
if (true) break;

case 23:
//C
this.state = 66;
 BA.debugLineNum = 785;BA.debugLine="xclv.ResizeItem(i,(xclv.sv.Height/lstOpciones.si";
Debug.ShouldStop(65536);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_xclv.getField(false,"_sv").runMethod(true,"getHeight"),_lstopciones.runMethod(true,"getSize")}, "/",0, 0)),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 0))));
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 788;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(524288);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 789;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(1048576);
if (true) break;

case 25:
//if
this.state = 28;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 791;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(4194304);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 792;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(8388608);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 793;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(16777216);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 796;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), _rsub);
this.state = 67;
return;
case 67:
//C
this.state = 29;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 798;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 799;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(1073741824);
if (true) break;

case 29:
//if
this.state = 34;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
if (true) return ;
if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 801;BA.debugLine="Dim PrioridadSel As Int=-1";
Debug.ShouldStop(1);
_prioridadsel = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("PrioridadSel", _prioridadsel);Debug.locals.put("PrioridadSel", _prioridadsel);
 BA.debugLineNum = 802;BA.debugLine="Dim NombrePrioridadSel As String=B4XListDlg.Selec";
Debug.ShouldStop(2);
_nombreprioridadsel = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("NombrePrioridadSel", _nombreprioridadsel);Debug.locals.put("NombrePrioridadSel", _nombreprioridadsel);
 BA.debugLineNum = 804;BA.debugLine="For Each mPr As Map In lstReg";
Debug.ShouldStop(8);
if (true) break;

case 35:
//for
this.state = 42;
_mpr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group53 = _lstreg;
index53 = 0;
groupLen53 = group53.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mPr", _mpr);
this.state = 68;
if (true) break;

case 68:
//C
this.state = 42;
if (index53 < groupLen53) {
this.state = 37;
_mpr = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group53.runMethod(false,"Get",index53));Debug.locals.put("mPr", _mpr);}
if (true) break;

case 69:
//C
this.state = 68;
index53++;
Debug.locals.put("mPr", _mpr);
if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 805;BA.debugLine="Dim NombreTipoPrioridad As String=Utilidades.Fix";
Debug.ShouldStop(16);
_nombretipoprioridad = parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_mpr.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TituloPrioridad"))))));Debug.locals.put("NombreTipoPrioridad", _nombretipoprioridad);Debug.locals.put("NombreTipoPrioridad", _nombretipoprioridad);
 BA.debugLineNum = 806;BA.debugLine="If NombreTipoPrioridad=NombrePrioridadSel Then";
Debug.ShouldStop(32);
if (true) break;

case 38:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",_nombretipoprioridad,_nombreprioridadsel)) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 807;BA.debugLine="PrioridadSel=mPr.Get(\"Prioridad\")";
Debug.ShouldStop(64);
_prioridadsel = BA.numberCast(int.class, _mpr.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Prioridad")))));Debug.locals.put("PrioridadSel", _prioridadsel);
 BA.debugLineNum = 808;BA.debugLine="Exit";
Debug.ShouldStop(128);
this.state = 42;
if (true) break;
 if (true) break;

case 41:
//C
this.state = 69;
;
 if (true) break;
if (true) break;
Debug.locals.put("mPr", _mpr);
;
 BA.debugLineNum = 812;BA.debugLine="If PrioridadSel=-1 Then";
Debug.ShouldStop(2048);

case 42:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",_prioridadsel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 813;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar la prioridad para el documento "),_docsel,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 814;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), _msa);
this.state = 70;
return;
case 70:
//C
this.state = 45;
;
 BA.debugLineNum = 815;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 818;BA.debugLine="Wait For(ActualizarPrioridadDocumento(PrioridadSe";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), __ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_actualizarprioridaddocumento" /*RemoteObject*/ ,(Object)(_prioridadsel),(Object)(_docsel)));
this.state = 71;
return;
case 71:
//C
this.state = 46;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 819;BA.debugLine="If Success=False Then Return";
Debug.ShouldStop(262144);
if (true) break;

case 46:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 48;
;}if (true) break;

case 48:
//C
this.state = 51;
if (true) return ;
if (true) break;

case 51:
//C
this.state = 52;
;
 BA.debugLineNum = 821;BA.debugLine="Dim pnl As B4XView=JamTableCLV1.GetPanel(IndexSel";
Debug.ShouldStop(1048576);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getpanel" /*RemoteObject*/ ,(Object)(_indexsel));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 822;BA.debugLine="For Each n As Node In pnl.GetAllViewsRecursive";
Debug.ShouldStop(2097152);
if (true) break;

case 52:
//for
this.state = 59;
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
group68 = _pnl.runMethod(false,"GetAllViewsRecursive");
index68 = 0;
groupLen68 = group68.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("n", _n);
this.state = 72;
if (true) break;

case 72:
//C
this.state = 59;
if (index68 < groupLen68) {
this.state = 54;
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group68.runMethod(false,"Get",index68));Debug.locals.put("n", _n);}
if (true) break;

case 73:
//C
this.state = 72;
index68++;
Debug.locals.put("n", _n);
if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 823;BA.debugLine="If n.Tag=\"Prioridad\" Then";
Debug.ShouldStop(4194304);
if (true) break;

case 55:
//if
this.state = 58;
if (RemoteObject.solveBoolean("=",_n.runMethod(false,"getTag"),RemoteObject.createImmutable(("Prioridad")))) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 824;BA.debugLine="Dim tF As TextField=n";
Debug.ShouldStop(8388608);
_tf = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper"), _n.getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 825;BA.debugLine="tF.Text=NombreTipoPrioridad";
Debug.ShouldStop(16777216);
_tf.runMethod(true,"setText",_nombretipoprioridad);
 BA.debugLineNum = 826;BA.debugLine="Exit";
Debug.ShouldStop(33554432);
this.state = 59;
if (true) break;
 if (true) break;

case 58:
//C
this.state = 73;
;
 if (true) break;
if (true) break;

case 59:
//C
this.state = -1;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 829;BA.debugLine="mData.Put(\"Prioridad\",PrioridadSel)";
Debug.ShouldStop(268435456);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Prioridad"))),(Object)((_prioridadsel)));
 BA.debugLineNum = 830;BA.debugLine="mData.Put(\"NombrePrioridad\",NombrePrioridadSel)";
Debug.ShouldStop(536870912);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombrePrioridad"))),(Object)((_nombreprioridadsel)));
 BA.debugLineNum = 831;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set PrioridadVentas=?, NombrePrioridadVentas=? where OSUB=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_prioridadsel),(_nombreprioridadsel),(_docsel)})))));
 BA.debugLineNum = 833;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadocumentosalmacenmanual(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaDocumentosAlmacenManual (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,928);
if (RapidSub.canDelegate("cargadocumentosalmacenmanual")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","cargadocumentosalmacenmanual", __ref);}
ResumableSub_CargaDocumentosAlmacenManual rsub = new ResumableSub_CargaDocumentosAlmacenManual(null,__ref);
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
public static class ResumableSub_CargaDocumentosAlmacenManual extends BA.ResumableSub {
public ResumableSub_CargaDocumentosAlmacenManual(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDocumentosAlmacenManual (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,928);
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
 BA.debugLineNum = 929;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 930;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(2);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 931;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 932;BA.debugLine="Dim Comando As String=\"DocumentosAlmacenManual\"";
Debug.ShouldStop(8);
_comando = BA.ObjectToString("DocumentosAlmacenManual");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 933;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(16);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 935;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "cargadocumentosalmacenmanual"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 937;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 938;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 939;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "cargadocumentosalmacenmanual"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 940;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 941;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 944;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 945;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 946;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 948;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 949;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 950;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(2097152);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 951;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
 BA.debugLineNum = 954;BA.debugLine="Return mRes";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 955;BA.debugLine="End Sub";
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
public static RemoteObject  _cargartiposprioridadesdocumentosnogestionados(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargarTiposPrioridadesDocumentosNoGestionados (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1195);
if (RapidSub.canDelegate("cargartiposprioridadesdocumentosnogestionados")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","cargartiposprioridadesdocumentosnogestionados", __ref);}
ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados rsub = new ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados(null,__ref);
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
public static class ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados extends BA.ResumableSub {
public ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargarTiposPrioridadesDocumentosNoGestionados (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1195);
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
 BA.debugLineNum = 1197;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4096);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1198;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8192);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1199;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1201;BA.debugLine="Dim Comando As String=\"TiposPrioridadesDocumentos";
Debug.ShouldStop(65536);
_comando = BA.ObjectToString("TiposPrioridadesDocumentosNoGestionados");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1202;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(131072);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1204;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "cargartiposprioridadesdocumentosnogestionados"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1206;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 1207;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1208;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "cargartiposprioridadesdocumentosnogestionados"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1209;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1210;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1213;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 1214;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1215;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1216;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de tipos de prioridad para documentos no gestionados")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1217;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "cargartiposprioridadesdocumentosnogestionados"), _msa);
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
 BA.debugLineNum = 1219;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(4);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1220;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1221;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1222;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 1225;BA.debugLine="Return mRes";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1226;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
ccontrolosubspendientesnoconfeccion._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",ccontrolosubspendientesnoconfeccion._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
ccontrolosubspendientesnoconfeccion._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",ccontrolosubspendientesnoconfeccion._frm);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
ccontrolosubspendientesnoconfeccion._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",ccontrolosubspendientesnoconfeccion._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private Dialog As B4XDialog";
ccontrolosubspendientesnoconfeccion._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",ccontrolosubspendientesnoconfeccion._dialog);
 //BA.debugLineNum = 8;BA.debugLine="Private mSQL As SQL";
ccontrolosubspendientesnoconfeccion._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",ccontrolosubspendientesnoconfeccion._msql);
 //BA.debugLineNum = 13;BA.debugLine="Private JamTableCLV1 As JamTableCLV";
ccontrolosubspendientesnoconfeccion._jamtableclv1 = RemoteObject.createNew ("b4j.docU.jamtableclv");__ref.setField("_jamtableclv1",ccontrolosubspendientesnoconfeccion._jamtableclv1);
 //BA.debugLineNum = 16;BA.debugLine="Private TimestampBatchFaseDocs As Long";
ccontrolosubspendientesnoconfeccion._timestampbatchfasedocs = RemoteObject.createImmutable(0L);__ref.setField("_timestampbatchfasedocs",ccontrolosubspendientesnoconfeccion._timestampbatchfasedocs);
 //BA.debugLineNum = 17;BA.debugLine="Private UUIDSesion As String";
ccontrolosubspendientesnoconfeccion._uuidsesion = RemoteObject.createImmutable("");__ref.setField("_uuidsesion",ccontrolosubspendientesnoconfeccion._uuidsesion);
 //BA.debugLineNum = 19;BA.debugLine="Private PrimerAvisoInfoEstablecerPrioridad As Boo";
ccontrolosubspendientesnoconfeccion._primeravisoinfoestablecerprioridad = RemoteObject.createImmutable(false);__ref.setField("_primeravisoinfoestablecerprioridad",ccontrolosubspendientesnoconfeccion._primeravisoinfoestablecerprioridad);
 //BA.debugLineNum = 20;BA.debugLine="Private btnFasesDoc As Button";
ccontrolosubspendientesnoconfeccion._btnfasesdoc = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnfasesdoc",ccontrolosubspendientesnoconfeccion._btnfasesdoc);
 //BA.debugLineNum = 21;BA.debugLine="Private btnMostrarDocumentoEnNavision As Button";
ccontrolosubspendientesnoconfeccion._btnmostrardocumentoennavision = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnmostrardocumentoennavision",ccontrolosubspendientesnoconfeccion._btnmostrardocumentoennavision);
 //BA.debugLineNum = 22;BA.debugLine="Private btnSelFechaRequerida As Button";
ccontrolosubspendientesnoconfeccion._btnselfecharequerida = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselfecharequerida",ccontrolosubspendientesnoconfeccion._btnselfecharequerida);
 //BA.debugLineNum = 23;BA.debugLine="Private btnSelPrioridad As Button";
ccontrolosubspendientesnoconfeccion._btnselprioridad = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselprioridad",ccontrolosubspendientesnoconfeccion._btnselprioridad);
 //BA.debugLineNum = 24;BA.debugLine="Private txtAreaFaseActual As TextField";
ccontrolosubspendientesnoconfeccion._txtareafaseactual = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtareafaseactual",ccontrolosubspendientesnoconfeccion._txtareafaseactual);
 //BA.debugLineNum = 25;BA.debugLine="Private txtArticulo As TextField";
ccontrolosubspendientesnoconfeccion._txtarticulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtarticulo",ccontrolosubspendientesnoconfeccion._txtarticulo);
 //BA.debugLineNum = 26;BA.debugLine="Private txtDescripcion As TextField";
ccontrolosubspendientesnoconfeccion._txtdescripcion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdescripcion",ccontrolosubspendientesnoconfeccion._txtdescripcion);
 //BA.debugLineNum = 27;BA.debugLine="Private txtFaseActual As TextField";
ccontrolosubspendientesnoconfeccion._txtfaseactual = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfaseactual",ccontrolosubspendientesnoconfeccion._txtfaseactual);
 //BA.debugLineNum = 28;BA.debugLine="Private txtFechaFaseActual As TextField";
ccontrolosubspendientesnoconfeccion._txtfechafaseactual = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechafaseactual",ccontrolosubspendientesnoconfeccion._txtfechafaseactual);
 //BA.debugLineNum = 29;BA.debugLine="Private txtFechaOF As TextField";
ccontrolosubspendientesnoconfeccion._txtfechaof = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechaof",ccontrolosubspendientesnoconfeccion._txtfechaof);
 //BA.debugLineNum = 30;BA.debugLine="Private txtFechaRequerida As TextField";
ccontrolosubspendientesnoconfeccion._txtfecharequerida = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfecharequerida",ccontrolosubspendientesnoconfeccion._txtfecharequerida);
 //BA.debugLineNum = 31;BA.debugLine="Private txtFinalizaProducto As TextField";
ccontrolosubspendientesnoconfeccion._txtfinalizaproducto = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfinalizaproducto",ccontrolosubspendientesnoconfeccion._txtfinalizaproducto);
 //BA.debugLineNum = 32;BA.debugLine="Private txtInfoAdicionalFaseActual As TextField";
ccontrolosubspendientesnoconfeccion._txtinfoadicionalfaseactual = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtinfoadicionalfaseactual",ccontrolosubspendientesnoconfeccion._txtinfoadicionalfaseactual);
 //BA.debugLineNum = 33;BA.debugLine="Private txtNombreProveedor As TextField";
ccontrolosubspendientesnoconfeccion._txtnombreproveedor = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombreproveedor",ccontrolosubspendientesnoconfeccion._txtnombreproveedor);
 //BA.debugLineNum = 34;BA.debugLine="Private txtObservaciones As TextField";
ccontrolosubspendientesnoconfeccion._txtobservaciones = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtobservaciones",ccontrolosubspendientesnoconfeccion._txtobservaciones);
 //BA.debugLineNum = 35;BA.debugLine="Private txtOSUB As TextField";
ccontrolosubspendientesnoconfeccion._txtosub = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtosub",ccontrolosubspendientesnoconfeccion._txtosub);
 //BA.debugLineNum = 36;BA.debugLine="Private txtPrioridad As TextField";
ccontrolosubspendientesnoconfeccion._txtprioridad = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtprioridad",ccontrolosubspendientesnoconfeccion._txtprioridad);
 //BA.debugLineNum = 37;BA.debugLine="Private txtProveedor As TextField";
ccontrolosubspendientesnoconfeccion._txtproveedor = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtproveedor",ccontrolosubspendientesnoconfeccion._txtproveedor);
 //BA.debugLineNum = 38;BA.debugLine="Private txtQtyPte As TextField";
ccontrolosubspendientesnoconfeccion._txtqtypte = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtqtypte",ccontrolosubspendientesnoconfeccion._txtqtypte);
 //BA.debugLineNum = 39;BA.debugLine="Private txtRequiereTransferenciaComponentes As Te";
ccontrolosubspendientesnoconfeccion._txtrequieretransferenciacomponentes = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtrequieretransferenciacomponentes",ccontrolosubspendientesnoconfeccion._txtrequieretransferenciacomponentes);
 //BA.debugLineNum = 40;BA.debugLine="Private txtRuta As TextField";
ccontrolosubspendientesnoconfeccion._txtruta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtruta",ccontrolosubspendientesnoconfeccion._txtruta);
 //BA.debugLineNum = 41;BA.debugLine="Private txtDiasAcumulados As TextField";
ccontrolosubspendientesnoconfeccion._txtdiasacumulados = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdiasacumulados",ccontrolosubspendientesnoconfeccion._txtdiasacumulados);
 //BA.debugLineNum = 43;BA.debugLine="Private FechaHoyHora0 As Long";
ccontrolosubspendientesnoconfeccion._fechahoyhora0 = RemoteObject.createImmutable(0L);__ref.setField("_fechahoyhora0",ccontrolosubspendientesnoconfeccion._fechahoyhora0);
 //BA.debugLineNum = 44;BA.debugLine="Private txtCliente As TextField";
ccontrolosubspendientesnoconfeccion._txtcliente = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcliente",ccontrolosubspendientesnoconfeccion._txtcliente);
 //BA.debugLineNum = 45;BA.debugLine="Private txtNombreCliente As TextField";
ccontrolosubspendientesnoconfeccion._txtnombrecliente = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombrecliente",ccontrolosubspendientesnoconfeccion._txtnombrecliente);
 //BA.debugLineNum = 46;BA.debugLine="Private txtNombreResponsableCuenta As TextField";
ccontrolosubspendientesnoconfeccion._txtnombreresponsablecuenta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombreresponsablecuenta",ccontrolosubspendientesnoconfeccion._txtnombreresponsablecuenta);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 274;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(262144);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(ccontrolosubspendientesnoconfeccion.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblPedFabPtesNoCorteNoConf")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 276;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 277;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblPedFabPtesNoCor";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblPedFabPtesNoCorteNoConf")));
 };
 BA.debugLineNum = 279;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(4194304);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 280;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 281;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblPedFabPtesNoCorteNoConf (")));
 BA.debugLineNum = 284;BA.debugLine="sbCrearTabla.Append(\"PedidoFab TEXT COLLATE NOCAS";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PedidoFab TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 285;BA.debugLine="sbCrearTabla.Append(\"FechaPedido INTEGER,\")";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPedido INTEGER,")));
 BA.debugLineNum = 286;BA.debugLine="sbCrearTabla.Append(\"Proveedor TEXT COLLATE NOCAS";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Proveedor TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 287;BA.debugLine="sbCrearTabla.Append(\"NombreProveedor TEXT COLLATE";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreProveedor TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 288;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 289;BA.debugLine="sbCrearTabla.Append(\"Descripcion TEXT COLLATE NOC";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Descripcion TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 290;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 291;BA.debugLine="sbCrearTabla.Append(\"RutaOF TEXT COLLATE NOCASE,\"";
Debug.ShouldStop(4);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("RutaOF TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 292;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Cliente TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 293;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreCliente TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 294;BA.debugLine="sbCrearTabla.Append(\"ResponsableCuenta TEXT COLLA";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ResponsableCuenta TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 295;BA.debugLine="sbCrearTabla.Append(\"QtyRec REAL,\")";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyRec REAL,")));
 BA.debugLineNum = 296;BA.debugLine="sbCrearTabla.Append(\"QtyPte REAL,\")";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPte REAL,")));
 BA.debugLineNum = 297;BA.debugLine="sbCrearTabla.Append(\"FechaRequerida REAL default";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaRequerida REAL default 0,")));
 BA.debugLineNum = 298;BA.debugLine="sbCrearTabla.Append(\"TransfComp INTEGER DEFAULT 0";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TransfComp INTEGER DEFAULT 0,")));
 BA.debugLineNum = 299;BA.debugLine="sbCrearTabla.Append(\"FinalizaProducto INTEGER DEF";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FinalizaProducto INTEGER DEFAULT 0)")));
 BA.debugLineNum = 300;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 302;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(8192);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(ccontrolosubspendientesnoconfeccion.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblOSUBsPendientesNoCorteNoConf")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 303;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 304;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblOSUBsPendientes";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblOSUBsPendientesNoCorteNoConf")));
 };
 BA.debugLineNum = 306;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(131072);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 307;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 308;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblOSUBsPendientesNoCorteNoConf (")));
 BA.debugLineNum = 311;BA.debugLine="sbCrearTabla.Append(\"OSUB TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("OSUB TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 312;BA.debugLine="sbCrearTabla.Append(\"FechaOSUB INTEGER,\")";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaOSUB INTEGER,")));
 BA.debugLineNum = 313;BA.debugLine="sbCrearTabla.Append(\"Proveedor TEXT COLLATE NOCAS";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Proveedor TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 314;BA.debugLine="sbCrearTabla.Append(\"NombreProveedor TEXT COLLATE";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreProveedor TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 315;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 316;BA.debugLine="sbCrearTabla.Append(\"Descripcion TEXT COLLATE NOC";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Descripcion TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 317;BA.debugLine="sbCrearTabla.Append(\"RutaOF TEXT COLLATE NOCASE,\"";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("RutaOF TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 318;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Cliente TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 319;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreCliente TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 320;BA.debugLine="sbCrearTabla.Append(\"ResponsableCuenta TEXT COLLA";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ResponsableCuenta TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 321;BA.debugLine="sbCrearTabla.Append(\"QtyPte REAL,\")";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPte REAL,")));
 BA.debugLineNum = 322;BA.debugLine="sbCrearTabla.Append(\"TransfComp INTEGER DEFAULT 0";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TransfComp INTEGER DEFAULT 0,")));
 BA.debugLineNum = 323;BA.debugLine="sbCrearTabla.Append(\"FinalizaProducto INTEGER DEF";
Debug.ShouldStop(4);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FinalizaProducto INTEGER DEFAULT 0,")));
 BA.debugLineNum = 324;BA.debugLine="sbCrearTabla.Append(\"PrioridadVentas INTEGER DEFA";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PrioridadVentas INTEGER DEFAULT 0,")));
 BA.debugLineNum = 325;BA.debugLine="sbCrearTabla.Append(\"NombrePrioridadVentas TEXT C";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombrePrioridadVentas TEXT COLLATE NOCASE default 'Sin Prioridad',")));
 BA.debugLineNum = 326;BA.debugLine="sbCrearTabla.Append(\"FechaRequeridaVentas INTEGER";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaRequeridaVentas INTEGER DEFAULT 0,")));
 BA.debugLineNum = 327;BA.debugLine="sbCrearTabla.Append(\"IDFase INTEGER DEFAULT 0,\")";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDFase INTEGER DEFAULT 0,")));
 BA.debugLineNum = 328;BA.debugLine="sbCrearTabla.Append(\"AreaFase TEXT COLLATE NOCASE";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AreaFase TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 329;BA.debugLine="sbCrearTabla.Append(\"Fase TEXT COLLATE NOCASE def";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fase TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 330;BA.debugLine="sbCrearTabla.Append(\"FechaFase INTEGER default 0,";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaFase INTEGER default 0,")));
 BA.debugLineNum = 331;BA.debugLine="sbCrearTabla.Append(\"Gestionado INTEGER default 0";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Gestionado INTEGER default 0,")));
 BA.debugLineNum = 332;BA.debugLine="sbCrearTabla.Append(\"IDResponsableFase INTEGER de";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDResponsableFase INTEGER default 0,")));
 BA.debugLineNum = 333;BA.debugLine="sbCrearTabla.Append(\"ResponsableFase TEXT COLLATE";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ResponsableFase TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 334;BA.debugLine="sbCrearTabla.Append(\"IDInfoAdicionalFase INTEGER";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDInfoAdicionalFase INTEGER default 0,")));
 BA.debugLineNum = 335;BA.debugLine="sbCrearTabla.Append(\"InfoAdicionalFase TEXT COLLA";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("InfoAdicionalFase TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 336;BA.debugLine="sbCrearTabla.Append(\"Observaciones TEXT COLLATE N";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Observaciones TEXT COLLATE NOCASE default '')")));
 BA.debugLineNum = 337;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(65536);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
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
public static void  _editarfecharequeridaventas(RemoteObject __ref,RemoteObject _indexsel,RemoteObject _mdata) throws Exception{
try {
		Debug.PushSubsStack("EditarFechaRequeridaVentas (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1257);
if (RapidSub.canDelegate("editarfecharequeridaventas")) { __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","editarfecharequeridaventas", __ref, _indexsel, _mdata); return;}
ResumableSub_EditarFechaRequeridaVentas rsub = new ResumableSub_EditarFechaRequeridaVentas(null,__ref,_indexsel,_mdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EditarFechaRequeridaVentas extends BA.ResumableSub {
public ResumableSub_EditarFechaRequeridaVentas(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref,RemoteObject _indexsel,RemoteObject _mdata) {
this.parent = parent;
this.__ref = __ref;
this._indexsel = _indexsel;
this._mdata = _mdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _indexsel;
RemoteObject _mdata;
RemoteObject _osubsel = RemoteObject.createImmutable("");
RemoteObject _idprioridadventas = RemoteObject.createImmutable(0);
RemoteObject _offset_before_dialog = RemoteObject.createImmutable(0f);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _fechaactual = RemoteObject.createImmutable(0L);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _sfechaactual = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _b4xdatedlg = RemoteObject.declareNull("b4j.docU.b4xdatetemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _fecharequeridaventas = RemoteObject.createImmutable(0L);
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _b4xtf = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group52;
int index52;
int groupLen52;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EditarFechaRequeridaVentas (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1257);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IndexSel", _indexsel);
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1260;BA.debugLine="Log(mData)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","860620803",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 1261;BA.debugLine="Dim OSUBSel As String=mData.Get(\"OSUB\")";
Debug.ShouldStop(4096);
_osubsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OSUB")))));Debug.locals.put("OSUBSel", _osubsel);Debug.locals.put("OSUBSel", _osubsel);
 BA.debugLineNum = 1262;BA.debugLine="Dim IDPrioridadVentas As Int=mData.Get(\"Prioridad";
Debug.ShouldStop(8192);
_idprioridadventas = BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrioridadVentas")))));Debug.locals.put("IDPrioridadVentas", _idprioridadventas);Debug.locals.put("IDPrioridadVentas", _idprioridadventas);
 BA.debugLineNum = 1265;BA.debugLine="Dim offset_before_dialog As Float= JamTableCLV1.s";
Debug.ShouldStop(65536);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 1267;BA.debugLine="Dim pnl As B4XView=JamTableCLV1.GetPanel(IndexSel";
Debug.ShouldStop(262144);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getpanel" /*RemoteObject*/ ,(Object)(_indexsel));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1269;BA.debugLine="Dim FechaActual As Long=mData.Get(\"FechaRequerida";
Debug.ShouldStop(1048576);
_fechaactual = BA.numberCast(long.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaRequeridaVentas")))));Debug.locals.put("FechaActual", _fechaactual);Debug.locals.put("FechaActual", _fechaactual);
 BA.debugLineNum = 1270;BA.debugLine="If FechaActual>0 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",_fechaactual,BA.numberCast(long.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1271;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(4194304);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1272;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
Debug.ShouldStop(8388608);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yy"));
 BA.debugLineNum = 1273;BA.debugLine="Dim sFechaActual As String=DateTime.Date(FechaAc";
Debug.ShouldStop(16777216);
_sfechaactual = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechaactual));Debug.locals.put("sFechaActual", _sfechaactual);Debug.locals.put("sFechaActual", _sfechaactual);
 BA.debugLineNum = 1274;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(33554432);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1286;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Ya hay una";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ya hay una fecha Requerida Ventas grabada para la OSUB "),_osubsel,RemoteObject.createImmutable(" ("),_sfechaactual,RemoteObject.createImmutable(")."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Editar la Fecha Requerida de Ventas?"))),(Object)(BA.ObjectToString("Aviso")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1287;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "editarfecharequeridaventas"), _msa);
this.state = 54;
return;
case 54:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1288;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 1289;BA.debugLine="If rInt <>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(256);
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

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1292;BA.debugLine="Dialog.Title=\"Indica Fecha Requerida Ventas\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Fecha Requerida Ventas")));
 BA.debugLineNum = 1294;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
Debug.ShouldStop(8192);
_b4xdatedlg = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");Debug.locals.put("B4XDateDlg", _b4xdatedlg);
 BA.debugLineNum = 1295;BA.debugLine="B4XDateDlg.Initialize";
Debug.ShouldStop(16384);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1296;BA.debugLine="If FechaActual>0 Then";
Debug.ShouldStop(32768);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean(">",_fechaactual,BA.numberCast(long.class, 0))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1297;BA.debugLine="B4XDateDlg.Date=FechaActual";
Debug.ShouldStop(65536);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,_fechaactual);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1299;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
Debug.ShouldStop(262144);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1302;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
Debug.ShouldStop(2097152);
_b4xdatedlg.setField ("_closeonselection" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1303;BA.debugLine="B4XDateDlg.FirstDay=1";
Debug.ShouldStop(4194304);
_b4xdatedlg.setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 1304;BA.debugLine="If FechaActual>0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 17:
//if
this.state = 22;
if (RemoteObject.solveBoolean(">",_fechaactual,BA.numberCast(long.class, 0))) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 1305;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4X";
Debug.ShouldStop(16777216);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xdatedlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable(("Borrar"))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1307;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4X";
Debug.ShouldStop(67108864);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xdatedlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 1312;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(-2147483648);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 1313;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(1);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 1314;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(2);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 1315;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(4);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 1316;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "editarfecharequeridaventas"), _rsub);
this.state = 55;
return;
case 55:
//C
this.state = 23;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1317;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 1318;BA.debugLine="If rInt=xui.DialogResponse_Cancel Then";
Debug.ShouldStop(32);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1324;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha sele";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No se ha seleccionado fecha."),parent.__c.getField(true,"CRLF"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1325;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "editarfecharequeridaventas"), _msa);
this.state = 56;
return;
case 56:
//C
this.state = 26;
;
 BA.debugLineNum = 1327;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1329;BA.debugLine="If rInt=xui.DialogResponse_Negative Then";
Debug.ShouldStop(65536);

case 26:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Negative")))) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 1330;BA.debugLine="Dim FechaRequeridaVentas As Long=0";
Debug.ShouldStop(131072);
_fecharequeridaventas = BA.numberCast(long.class, 0);Debug.locals.put("FechaRequeridaVentas", _fecharequeridaventas);Debug.locals.put("FechaRequeridaVentas", _fecharequeridaventas);
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1332;BA.debugLine="Dim FechaRequeridaVentas As Long=B4XDateDlg.Date";
Debug.ShouldStop(524288);
_fecharequeridaventas = _b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ );Debug.locals.put("FechaRequeridaVentas", _fecharequeridaventas);Debug.locals.put("FechaRequeridaVentas", _fecharequeridaventas);
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 1336;BA.debugLine="Wait For(ActualizarFechaGestionOrden(1,OSUBSel,Fe";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "editarfecharequeridaventas"), __ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_actualizarfechagestionorden" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(_osubsel),(Object)(_fecharequeridaventas),(Object)(BA.numberCast(int.class, 0)),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ ))));
this.state = 57;
return;
case 57:
//C
this.state = 32;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
;
 BA.debugLineNum = 1337;BA.debugLine="If Accion=\"OK\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 32:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("OK"))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1338;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigen";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set [FechaRequeridaVentas]=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_fecharequeridaventas)})))));
 BA.debugLineNum = 1339;BA.debugLine="mData.put(\"FechaRequeridaVentas\", FechaRequerida";
Debug.ShouldStop(67108864);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FechaRequeridaVentas"))),(Object)((_fecharequeridaventas)));
 BA.debugLineNum = 1341;BA.debugLine="For Each n As Node In pnl.GetAllViewsRecursive";
Debug.ShouldStop(268435456);
if (true) break;

case 35:
//for
this.state = 52;
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
group52 = _pnl.runMethod(false,"GetAllViewsRecursive");
index52 = 0;
groupLen52 = group52.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("n", _n);
this.state = 58;
if (true) break;

case 58:
//C
this.state = 52;
if (index52 < groupLen52) {
this.state = 37;
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group52.runMethod(false,"Get",index52));Debug.locals.put("n", _n);}
if (true) break;

case 59:
//C
this.state = 58;
index52++;
Debug.locals.put("n", _n);
if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1342;BA.debugLine="If n.Tag=\"FechaRequeridaVentas\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 38:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",_n.runMethod(false,"getTag"),RemoteObject.createImmutable(("FechaRequeridaVentas")))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 1343;BA.debugLine="Dim B4xtF As B4XView=n";
Debug.ShouldStop(1073741824);
_b4xtf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b4xtf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _n.getObject());Debug.locals.put("B4xtF", _b4xtf);Debug.locals.put("B4xtF", _b4xtf);
 BA.debugLineNum = 1344;BA.debugLine="If FechaRequeridaVentas=0 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 41:
//if
this.state = 50;
if (RemoteObject.solveBoolean("=",_fecharequeridaventas,BA.numberCast(long.class, 0))) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 50;
 BA.debugLineNum = 1345;BA.debugLine="B4xtF.Text=\"\"";
Debug.ShouldStop(1);
_b4xtf.runMethod(true,"setText",BA.ObjectToString(""));
 if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 1347;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateForm";
Debug.ShouldStop(4);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1348;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(8);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1349;BA.debugLine="B4xtF.Text=DateTime.Date(FechaRequeridaVentas";
Debug.ShouldStop(16);
_b4xtf.runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecharequeridaventas)));
 BA.debugLineNum = 1350;BA.debugLine="If DateUtils.IsSameDay(DateTime.Now,FechaRequ";
Debug.ShouldStop(32);
if (true) break;

case 46:
//if
this.state = 49;
if (parent._dateutils.runMethod(true,"_issameday",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(_fecharequeridaventas)).<Boolean>get().booleanValue()) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 1351;BA.debugLine="B4xtF.TextColor=xui.Color_Red";
Debug.ShouldStop(64);
_b4xtf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 1353;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(256);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 1356;BA.debugLine="Exit";
Debug.ShouldStop(2048);
this.state = 52;
if (true) break;
 if (true) break;

case 51:
//C
this.state = 59;
;
 if (true) break;
if (true) break;

case 52:
//C
this.state = 53;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 1367;BA.debugLine="wait for(ActualizarTblPrioridadesPedidosFab(OSUB";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "editarfecharequeridaventas"), __ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_actualizartblprioridadespedidosfab" /*RemoteObject*/ ,(Object)(_osubsel),(Object)(_idprioridadventas),(Object)(_fecharequeridaventas),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ ))));
this.state = 60;
return;
case 60:
//C
this.state = 53;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 if (true) break;

case 53:
//C
this.state = -1;
;
 BA.debugLineNum = 1374;BA.debugLine="End Sub";
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
public static RemoteObject  _exceldatetostring(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("ExcelDateToString (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1420);
if (RapidSub.canDelegate("exceldatetostring")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","exceldatetostring", __ref, _t);}
RemoteObject _excelunixdiff = RemoteObject.createImmutable(0L);
RemoteObject _daysecs = RemoteObject.createImmutable(0L);
RemoteObject _val = RemoteObject.createImmutable(0L);
Debug.locals.put("t", _t);
 BA.debugLineNum = 1420;BA.debugLine="Public Sub ExcelDateToString(t As Long) As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1421;BA.debugLine="Dim ExcelUnixDiff As Long=25569             'days";
Debug.ShouldStop(4096);
_excelunixdiff = BA.numberCast(long.class, 25569);Debug.locals.put("ExcelUnixDiff", _excelunixdiff);Debug.locals.put("ExcelUnixDiff", _excelunixdiff);
 BA.debugLineNum = 1422;BA.debugLine="Dim  DaySecs As Long=86400             'number of";
Debug.ShouldStop(8192);
_daysecs = BA.numberCast(long.class, 86400);Debug.locals.put("DaySecs", _daysecs);Debug.locals.put("DaySecs", _daysecs);
 BA.debugLineNum = 1423;BA.debugLine="Dim val As Long";
Debug.ShouldStop(16384);
_val = RemoteObject.createImmutable(0L);Debug.locals.put("val", _val);
 BA.debugLineNum = 1424;BA.debugLine="val=  (t - ExcelUnixDiff) * DaySecs";
Debug.ShouldStop(32768);
_val = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_t,_excelunixdiff}, "-",1, 2)),_daysecs}, "*",0, 2);Debug.locals.put("val", _val);
 BA.debugLineNum = 1425;BA.debugLine="val=DateUtils.UnixTimeToTicks(val)";
Debug.ShouldStop(65536);
_val = ccontrolosubspendientesnoconfeccion._dateutils.runMethod(true,"_unixtimetoticks",(Object)(_val));Debug.locals.put("val", _val);
 BA.debugLineNum = 1426;BA.debugLine="DateTime.DateFormat=\"dd-MMM-yyyy\"";
Debug.ShouldStop(131072);
ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MMM-yyyy"));
 BA.debugLineNum = 1427;BA.debugLine="Return(DateTime.Date(val))";
Debug.ShouldStop(262144);
if (true) return (ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_val)));
 BA.debugLineNum = 1429;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _faseactualdocumentosbacthuuid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FaseActualDocumentosBacthUUID (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,958);
if (RapidSub.canDelegate("faseactualdocumentosbacthuuid")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","faseactualdocumentosbacthuuid", __ref);}
ResumableSub_FaseActualDocumentosBacthUUID rsub = new ResumableSub_FaseActualDocumentosBacthUUID(null,__ref);
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
public static class ResumableSub_FaseActualDocumentosBacthUUID extends BA.ResumableSub {
public ResumableSub_FaseActualDocumentosBacthUUID(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FaseActualDocumentosBacthUUID (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,958);
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
 BA.debugLineNum = 959;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1073741824);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 962;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(2);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 963;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 966;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(32);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("FaseActualDocumentosBacthUUID")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_uuidsesion" /*RemoteObject*/ ))})),(Object)(__ref));
 BA.debugLineNum = 968;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "faseactualdocumentosbacthuuid"), null);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 969;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 20;
 BA.debugLineNum = 970;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query FaseActualDocumentosBacthUUID")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 971;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "faseactualdocumentosbacthuuid"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
 BA.debugLineNum = 972;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 973;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 976;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(32768);
if (true) break;

case 6:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 19;
 BA.debugLineNum = 977;BA.debugLine="Accion=\"SinFaseActualDocumentos\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("SinFaseActualDocumentos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 978;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 980;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 981;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 984;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8388608);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 985;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 986;BA.debugLine="For Each m As Map In lstReg";
Debug.ShouldStop(33554432);
if (true) break;

case 11:
//for
this.state = 14;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group20 = _lstreg;
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index20 < groupLen20) {
this.state = 13;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group20.runMethod(false,"Get",index20));Debug.locals.put("m", _m);}
if (true) break;

case 24:
//C
this.state = 23;
index20++;
Debug.locals.put("m", _m);
if (true) break;

case 13:
//C
this.state = 24;
 BA.debugLineNum = 989;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblOSUBsPendie";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblOSUBsPendientesNoCorteNoConf set Fase=?, Gestionado=?, FechaFase=?, ResponsableFase=?, InfoAdicionalFase=?, Observaciones=? where OSUB=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fase")))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Gestionado")))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaHoraMov")))),(parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableFase"))))))),(parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("InfoAdicionalFase"))))))),(parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Obs"))))))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))})))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 992;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
Debug.ShouldStop(-2147483648);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 993;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "faseactualdocumentosbacthuuid"), _senderfilter);
this.state = 25;
return;
case 25:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 994;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","860162084",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 995;BA.debugLine="If Success=False Then";
Debug.ShouldStop(4);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 996;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 997;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 1001;BA.debugLine="Return mRes";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1002;BA.debugLine="End Sub";
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
public static void  _sql_nonquerycomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _fechasprioridadventasdocumentosbacthuuid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FechasPrioridadVentasDocumentosBacthUUID (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1122);
if (RapidSub.canDelegate("fechasprioridadventasdocumentosbacthuuid")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","fechasprioridadventasdocumentosbacthuuid", __ref);}
ResumableSub_FechasPrioridadVentasDocumentosBacthUUID rsub = new ResumableSub_FechasPrioridadVentasDocumentosBacthUUID(null,__ref);
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
public static class ResumableSub_FechasPrioridadVentasDocumentosBacthUUID extends BA.ResumableSub {
public ResumableSub_FechasPrioridadVentasDocumentosBacthUUID(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FechasPrioridadVentasDocumentosBacthUUID (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1122);
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
 BA.debugLineNum = 1123;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1126;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(32);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1127;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1130;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(512);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("FechasPrioridadVentasDocumentosBacthUUID")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_uuidsesion" /*RemoteObject*/ ))})),(Object)(__ref));
 BA.debugLineNum = 1132;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "fechasprioridadventasdocumentosbacthuuid"), null);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1133;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 20;
 BA.debugLineNum = 1134;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query FechasPrioridadVentasDocumentosBacthUUID")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1135;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "fechasprioridadventasdocumentosbacthuuid"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
 BA.debugLineNum = 1136;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1137;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1140;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(524288);
if (true) break;

case 6:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 19;
 BA.debugLineNum = 1141;BA.debugLine="Accion=\"SinFechasPrioridadVentasOSUBsPendientes";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("SinFechasPrioridadVentasOSUBsPendientes");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1142;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2097152);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1144;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1145;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1148;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(134217728);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1149;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 1150;BA.debugLine="For Each m As Map In lstReg";
Debug.ShouldStop(536870912);
if (true) break;

case 11:
//for
this.state = 14;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group20 = _lstreg;
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index20 < groupLen20) {
this.state = 13;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group20.runMethod(false,"Get",index20));Debug.locals.put("m", _m);}
if (true) break;

case 24:
//C
this.state = 23;
index20++;
Debug.locals.put("m", _m);
if (true) break;

case 13:
//C
this.state = 24;
 BA.debugLineNum = 1152;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblOSUBsPendie";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblOSUBsPendientesNoCorteNoConf set PrioridadVentas=?, NombrePrioridadVentas=?, FechaRequeridaVentas=? where OSUB=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDPrioridadVentas")))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrioridadVentas")))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaVentasLong")))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PedidoFab"))))})))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 1155;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
Debug.ShouldStop(4);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1156;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "fechasprioridadventasdocumentosbacthuuid"), _senderfilter);
this.state = 25;
return;
case 25:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1157;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","860293155",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1158;BA.debugLine="If Success=False Then";
Debug.ShouldStop(32);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1159;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1160;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 1164;BA.debugLine="Return mRes";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1165;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 234;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(512);
 BA.debugLineNum = 235;BA.debugLine="EventData.Consume";
Debug.ShouldStop(1024);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generaruuidv4(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GenerarUUIDv4 (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,412);
if (RapidSub.canDelegate("generaruuidv4")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","generaruuidv4", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _stp = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _c = RemoteObject.createImmutable(0);
 BA.debugLineNum = 412;BA.debugLine="Sub GenerarUUIDv4 As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 413;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(268435456);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 414;BA.debugLine="sb.Initialize";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 415;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
Debug.ShouldStop(1073741824);
{
final RemoteObject group3 = RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable((8)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((12))});
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = BA.numberCast(int.class, group3.getArrayElement(false,RemoteObject.createImmutable(index3)));Debug.locals.put("stp", _stp);
Debug.locals.put("stp", _stp);
 BA.debugLineNum = 416;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("-")));};
 BA.debugLineNum = 417;BA.debugLine="For n = 1 To stp";
Debug.ShouldStop(1);
{
final int step5 = 1;
final int limit5 = _stp.<Integer>get().intValue();
_n = 1 ;
for (;(step5 > 0 && _n <= limit5) || (step5 < 0 && _n >= limit5) ;_n = ((int)(0 + _n + step5))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 418;BA.debugLine="Dim c As Int = Rnd(0, 16)";
Debug.ShouldStop(2);
_c = ccontrolosubspendientesnoconfeccion.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 419;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",_c,BA.numberCast(double.class, 10))) { 
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(48)}, "+",1, 1);Debug.locals.put("c", _c);}
else {
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(55)}, "+",1, 1);Debug.locals.put("c", _c);};
 BA.debugLineNum = 420;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 19))) { 
_c = ccontrolosubspendientesnoconfeccion.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("8"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 421;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 14))) { 
_c = ccontrolosubspendientesnoconfeccion.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("4"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 422;BA.debugLine="sb.Append(Chr(c))";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(ccontrolosubspendientesnoconfeccion.__c.runMethod(true,"Chr",(Object)(_c)))));
 }
}Debug.locals.put("n", _n);
;
 }
}Debug.locals.put("stp", _stp);
;
 BA.debugLineNum = 425;BA.debugLine="Return sb.ToString.ToLowerCase";
Debug.ShouldStop(256);
if (true) return _sb.runMethod(true,"ToString").runMethod(true,"toLowerCase");
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Initialize (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 50;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(131072);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertarlineasbatchdocumentos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InsertarLineasBatchDocumentos (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,888);
if (RapidSub.canDelegate("insertarlineasbatchdocumentos")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","insertarlineasbatchdocumentos", __ref);}
ResumableSub_InsertarLineasBatchDocumentos rsub = new ResumableSub_InsertarLineasBatchDocumentos(null,__ref);
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
public static class ResumableSub_InsertarLineasBatchDocumentos extends BA.ResumableSub {
public ResumableSub_InsertarLineasBatchDocumentos(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InsertarLineasBatchDocumentos (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,888);
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
 BA.debugLineNum = 889;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(16777216);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 890;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(33554432);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 891;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select distin";
Debug.ShouldStop(67108864);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select distinct OSUB from tblOSUBsPendientesNoCorteNoConf")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 892;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//do while
this.state = 4;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 BA.debugLineNum = 893;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"In";
Debug.ShouldStop(268435456);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InsertarLineaFaseActualDocumentoBatch")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(__ref.getField(true,"_timestampbatchfasedocs" /*RemoteObject*/ )),(__ref.getField(true,"_uuidsesion" /*RemoteObject*/ )),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"Dispositivo" /*RemoteObject*/ )),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("OSUB"))))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 894;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(536870912);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 896;BA.debugLine="rs.Close";
Debug.ShouldStop(-2147483648);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 897;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(1);
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 898;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "insertarlineasbatchdocumentos"), null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 900;BA.debugLine="If result=False Then";
Debug.ShouldStop(8);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,parent.__c.getField(true,"False"))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 901;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query InsertarLineaFaseActualDocumentoBatch")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 902;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "insertarlineasbatchdocumentos"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 BA.debugLineNum = 903;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 905;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 907;BA.debugLine="End Sub";
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
public static RemoteObject  _jamtableclv1_accionsalirjamtableclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_AccionSalirJamTableCLV (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("jamtableclv1_accionsalirjamtableclv")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","jamtableclv1_accionsalirjamtableclv", __ref);}
 BA.debugLineNum = 238;BA.debugLine="Sub JamTableCLV1_AccionSalirJamTableCLV";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="SalirModulo";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableclv1_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_ItemClick (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,611);
if (RapidSub.canDelegate("jamtableclv1_itemclick")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","jamtableclv1_itemclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 611;BA.debugLine="Sub JamTableCLV1_ItemClick(Index As Int, Value As";
Debug.ShouldStop(4);
 BA.debugLineNum = 612;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(8);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 613;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
Debug.ShouldStop(16);
ccontrolosubspendientesnoconfeccion.__c.runVoidMethod ("LogImpl","859441154",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 614;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(32);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 615;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(64);
ccontrolosubspendientesnoconfeccion.__c.runVoidMethod ("LogImpl","859441156",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 617;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableclv1_itemlongclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_ItemLongClick (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,620);
if (RapidSub.canDelegate("jamtableclv1_itemlongclick")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","jamtableclv1_itemlongclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 620;BA.debugLine="Sub JamTableCLV1_ItemLongClick(Index As Int, Value";
Debug.ShouldStop(2048);
 BA.debugLineNum = 621;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(4096);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 622;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
Debug.ShouldStop(8192);
ccontrolosubspendientesnoconfeccion.__c.runVoidMethod ("LogImpl","859506690",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado botón secundario ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 623;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(16384);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 624;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(32768);
ccontrolosubspendientesnoconfeccion.__c.runVoidMethod ("LogImpl","859506692",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 626;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableclv1_loadlayoutpanelitem(RemoteObject __ref,RemoteObject _datositemindexclv) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_LoadLayoutPanelItem (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,516);
if (RapidSub.canDelegate("jamtableclv1_loadlayoutpanelitem")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","jamtableclv1_loadlayoutpanelitem", __ref, _datositemindexclv);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _txtfaseb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _timeformatant = RemoteObject.createImmutable("");
RemoteObject _txtfechafaseb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _perioddiasacum = RemoteObject.declareNull("b4j.example.dateutils._period");
RemoteObject _txtinfoadfaseb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _txtobservacionesb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _txtfinalizaproductob = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _qtypte = RemoteObject.createImmutable(0);
RemoteObject _fechareqvtas = RemoteObject.createImmutable(0L);
RemoteObject _txtfecharequeridaventasb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _b4xtf = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("DatosItemIndexCLV", _datositemindexclv);
 BA.debugLineNum = 516;BA.debugLine="Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemInde";
Debug.ShouldStop(8);
 BA.debugLineNum = 517;BA.debugLine="Dim mData As Map=DatosItemIndexCLV.Value";
Debug.ShouldStop(16);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _datositemindexclv.getField(false,"Value" /*RemoteObject*/ ));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 518;BA.debugLine="Dim Pnl As B4XView=DatosItemIndexCLV.Panel";
Debug.ShouldStop(32);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = _datositemindexclv.getField(false,"Panel" /*RemoteObject*/ );Debug.locals.put("Pnl", _pnl);Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 519;BA.debugLine="Pnl.LoadLayout(\"scrItemControlPedidosFabNoConfecc";
Debug.ShouldStop(64);
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrItemControlPedidosFabNoConfeccion2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 522;BA.debugLine="txtOSUB.Text=mData.Get(\"OSUB\")";
Debug.ShouldStop(512);
__ref.getField(false,"_txtosub" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OSUB"))))));
 BA.debugLineNum = 523;BA.debugLine="txtFaseActual.Text=mData.Getdefault(\"Fase\",\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtfaseactual" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Fase"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 524;BA.debugLine="Dim txtfaseB As B4XView=txtFaseActual";
Debug.ShouldStop(2048);
_txtfaseb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtfaseb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtfaseactual" /*RemoteObject*/ ).getObject());Debug.locals.put("txtfaseB", _txtfaseb);Debug.locals.put("txtfaseB", _txtfaseb);
 BA.debugLineNum = 525;BA.debugLine="txtfaseB.TextColor=0xFFB22222";
Debug.ShouldStop(4096);
_txtfaseb.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffb22222)));
 BA.debugLineNum = 527;BA.debugLine="txtAreaFaseActual.Text=mData.get(\"AreaFase\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtareafaseactual" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AreaFase"))))));
 BA.debugLineNum = 529;BA.debugLine="txtRuta.Text=mData.Get(\"RutaOF\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtruta" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RutaOF"))))));
 BA.debugLineNum = 531;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(262144);
_dateformatant = ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 532;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(524288);
ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 533;BA.debugLine="Dim TimeFormatAnt As String=DateTime.timeFormat";
Debug.ShouldStop(1048576);
_timeformatant = ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("TimeFormatAnt", _timeformatant);Debug.locals.put("TimeFormatAnt", _timeformatant);
 BA.debugLineNum = 534;BA.debugLine="DateTime.TimeFormat	=\"HH:mm\"";
Debug.ShouldStop(2097152);
ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 535;BA.debugLine="txtFechaOF.Text=DateTime.Date(mData.Get(\"FechaOSU";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtfechaof" /*RemoteObject*/ ).runMethod(true,"setText",ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaOSUB"))))))));
 BA.debugLineNum = 536;BA.debugLine="If mData.Getdefault(\"FechaFase\",0)>0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FechaFase"))),(Object)(RemoteObject.createImmutable((0))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 537;BA.debugLine="txtFechaFaseActual.Text=DateTime.date(mData.Getd";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtfechafaseactual" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FechaFase"))),(Object)(RemoteObject.createImmutable((0))))))),RemoteObject.createImmutable(" "),ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FechaFase"))),(Object)(RemoteObject.createImmutable((0)))))))));
 };
 BA.debugLineNum = 539;BA.debugLine="Dim txtFechaFaseB As B4XView=txtFechaFaseActual";
Debug.ShouldStop(67108864);
_txtfechafaseb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtfechafaseb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtfechafaseactual" /*RemoteObject*/ ).getObject());Debug.locals.put("txtFechaFaseB", _txtfechafaseb);Debug.locals.put("txtFechaFaseB", _txtfechafaseb);
 BA.debugLineNum = 540;BA.debugLine="txtFechaFaseB.TextColor=0xFFB22222";
Debug.ShouldStop(134217728);
_txtfechafaseb.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffb22222)));
 BA.debugLineNum = 541;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(268435456);
ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 542;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
Debug.ShouldStop(536870912);
ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_timeformatant);
 BA.debugLineNum = 544;BA.debugLine="Dim PeriodDiasAcum As Period=DateUtils.PeriodBetw";
Debug.ShouldStop(-2147483648);
_perioddiasacum = ccontrolosubspendientesnoconfeccion._dateutils.runMethod(false,"_periodbetweenindays",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaOSUB")))))),(Object)(ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("PeriodDiasAcum", _perioddiasacum);Debug.locals.put("PeriodDiasAcum", _perioddiasacum);
 BA.debugLineNum = 545;BA.debugLine="txtDiasAcumulados.Text=PeriodDiasAcum.Days";
Debug.ShouldStop(1);
__ref.getField(false,"_txtdiasacumulados" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_perioddiasacum.getField(true,"Days")));
 BA.debugLineNum = 547;BA.debugLine="txtInfoAdicionalFaseActual.Text=mData.Getdefault(";
Debug.ShouldStop(4);
__ref.getField(false,"_txtinfoadicionalfaseactual" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("InfoAdicionalFase"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 548;BA.debugLine="Dim txtInfoAdfaseB As B4XView=txtInfoAdicionalFas";
Debug.ShouldStop(8);
_txtinfoadfaseb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtinfoadfaseb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtinfoadicionalfaseactual" /*RemoteObject*/ ).getObject());Debug.locals.put("txtInfoAdfaseB", _txtinfoadfaseb);Debug.locals.put("txtInfoAdfaseB", _txtinfoadfaseb);
 BA.debugLineNum = 549;BA.debugLine="txtInfoAdfaseB.TextColor=0xFFB22222";
Debug.ShouldStop(16);
_txtinfoadfaseb.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffb22222)));
 BA.debugLineNum = 550;BA.debugLine="txtProveedor.Text=mData.Get(\"Proveedor\")";
Debug.ShouldStop(32);
__ref.getField(false,"_txtproveedor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Proveedor"))))));
 BA.debugLineNum = 551;BA.debugLine="txtNombreProveedor.Text=mData.Get(\"NombreProveedo";
Debug.ShouldStop(64);
__ref.getField(false,"_txtnombreproveedor" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreProveedor"))))));
 BA.debugLineNum = 552;BA.debugLine="txtObservaciones.Text=mData.Getdefault(\"Observaci";
Debug.ShouldStop(128);
__ref.getField(false,"_txtobservaciones" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Observaciones"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 553;BA.debugLine="Dim txtObservacionesB As B4XView=txtObservaciones";
Debug.ShouldStop(256);
_txtobservacionesb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtobservacionesb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtobservaciones" /*RemoteObject*/ ).getObject());Debug.locals.put("txtObservacionesB", _txtobservacionesb);Debug.locals.put("txtObservacionesB", _txtobservacionesb);
 BA.debugLineNum = 554;BA.debugLine="txtObservacionesB.TextColor=0xFFC71585";
Debug.ShouldStop(512);
_txtobservacionesb.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffc71585)));
 BA.debugLineNum = 555;BA.debugLine="txtArticulo.Text=mData.Get(\"Articulo\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtarticulo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Articulo"))))));
 BA.debugLineNum = 556;BA.debugLine="txtDescripcion.Text=mData.Get(\"Descripcion\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Descripcion"))))));
 BA.debugLineNum = 564;BA.debugLine="If 0=mData.get(\"FinalizaProducto\") Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(0),BA.numberCast(double.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FinalizaProducto"))))))) { 
 BA.debugLineNum = 565;BA.debugLine="txtFinalizaProducto.Text=\"NO\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtfinalizaproducto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("NO"));
 }else {
 BA.debugLineNum = 567;BA.debugLine="txtFinalizaProducto.Text=\"SI\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtfinalizaproducto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("SI"));
 BA.debugLineNum = 568;BA.debugLine="Dim txtFinalizaProductoB As B4XView=txtFinalizaP";
Debug.ShouldStop(8388608);
_txtfinalizaproductob = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtfinalizaproductob = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtfinalizaproducto" /*RemoteObject*/ ).getObject());Debug.locals.put("txtFinalizaProductoB", _txtfinalizaproductob);Debug.locals.put("txtFinalizaProductoB", _txtfinalizaproductob);
 BA.debugLineNum = 569;BA.debugLine="txtFinalizaProductoB.Color=0xFF7FFF00";
Debug.ShouldStop(16777216);
_txtfinalizaproductob.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff7fff00)));
 };
 BA.debugLineNum = 572;BA.debugLine="If 0=mData.get(\"TransfComp\") Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(0),BA.numberCast(double.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TransfComp"))))))) { 
 BA.debugLineNum = 573;BA.debugLine="txtRequiereTransferenciaComponentes.Text=\"NO\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtrequieretransferenciacomponentes" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("NO"));
 }else {
 BA.debugLineNum = 575;BA.debugLine="txtRequiereTransferenciaComponentes.Text=\"SI\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtrequieretransferenciacomponentes" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("SI"));
 };
 BA.debugLineNum = 578;BA.debugLine="Dim QtyPte As Double=mData.Get(\"QtyPte\")";
Debug.ShouldStop(2);
_qtypte = BA.numberCast(double.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("QtyPte")))));Debug.locals.put("QtyPte", _qtypte);Debug.locals.put("QtyPte", _qtypte);
 BA.debugLineNum = 579;BA.debugLine="txtQtyPte.Text=Utilidades.FormatoNumerico2(QtyPte";
Debug.ShouldStop(4);
__ref.getField(false,"_txtqtypte" /*RemoteObject*/ ).runMethod(true,"setText",ccontrolosubspendientesnoconfeccion._utilidades.runMethod(true,"_formatonumerico2" /*RemoteObject*/ ,(Object)(_qtypte),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(ccontrolosubspendientesnoconfeccion.__c.getField(true,"True"))));
 BA.debugLineNum = 581;BA.debugLine="Dim FechaReqVtas As Long=mData.Get(\"FechaRequerid";
Debug.ShouldStop(16);
_fechareqvtas = BA.numberCast(long.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaRequeridaVentas")))));Debug.locals.put("FechaReqVtas", _fechareqvtas);Debug.locals.put("FechaReqVtas", _fechareqvtas);
 BA.debugLineNum = 582;BA.debugLine="If FechaReqVtas=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_fechareqvtas,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 583;BA.debugLine="txtFechaRequerida.Text=\"\"";
Debug.ShouldStop(64);
__ref.getField(false,"_txtfecharequerida" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 585;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(256);
_dateformatant = ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 586;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(512);
ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 587;BA.debugLine="txtFechaRequerida.Text=DateTime.Date(FechaReqVta";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtfecharequerida" /*RemoteObject*/ ).runMethod(true,"setText",ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechareqvtas)));
 BA.debugLineNum = 588;BA.debugLine="If FechaHoyHora0>FechaReqVtas Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_fechahoyhora0" /*RemoteObject*/ ),_fechareqvtas)) { 
 BA.debugLineNum = 589;BA.debugLine="Dim txtFechaRequeridaVentasB As B4XView=txtFech";
Debug.ShouldStop(4096);
_txtfecharequeridaventasb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtfecharequeridaventasb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtfecharequerida" /*RemoteObject*/ ).getObject());Debug.locals.put("txtFechaRequeridaVentasB", _txtfecharequeridaventasb);Debug.locals.put("txtFechaRequeridaVentasB", _txtfecharequeridaventasb);
 BA.debugLineNum = 590;BA.debugLine="txtFechaRequeridaVentasB.TextColor=xui.Color_Re";
Debug.ShouldStop(8192);
_txtfecharequeridaventasb.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 591;BA.debugLine="txtFechaRequeridaVentasB.Font=xui.CreateDefault";
Debug.ShouldStop(16384);
_txtfecharequeridaventasb.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 12))));
 };
 BA.debugLineNum = 600;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(8388608);
ccontrolosubspendientesnoconfeccion.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 };
 BA.debugLineNum = 603;BA.debugLine="txtCliente.Text=mData.Get(\"Cliente\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtcliente" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cliente"))))));
 BA.debugLineNum = 604;BA.debugLine="txtNombreCliente.Text=mData.Get(\"NombreCliente\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtnombrecliente" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreCliente"))))));
 BA.debugLineNum = 605;BA.debugLine="txtNombreResponsableCuenta.Text=mData.Get(\"Respon";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtnombreresponsablecuenta" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableCuenta"))))));
 BA.debugLineNum = 606;BA.debugLine="Dim B4xtF As B4XView=txtNombreResponsableCuenta";
Debug.ShouldStop(536870912);
_b4xtf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b4xtf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnombreresponsablecuenta" /*RemoteObject*/ ).getObject());Debug.locals.put("B4xtF", _b4xtf);Debug.locals.put("B4xtF", _b4xtf);
 BA.debugLineNum = 608;BA.debugLine="B4xtF.SetColorAndBorder(0xFFFFA500,1dip,0xFF69696";
Debug.ShouldStop(-2147483648);
_b4xtf.runVoidMethod ("SetColorAndBorder",(Object)(BA.numberCast(int.class, ((int)0xffffa500))),(Object)(BA.numberCast(double.class, ccontrolosubspendientesnoconfeccion.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(int.class, ((int)0xff696969))),(Object)(BA.numberCast(double.class, 3)));
 BA.debugLineNum = 609;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableclv1_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_MenuBarMenuItem_Action (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("jamtableclv1_menubarmenuitem_action")) { __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","jamtableclv1_menubarmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_JamTableCLV1_MenuBarMenuItem_Action rsub = new ResumableSub_JamTableCLV1_MenuBarMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_JamTableCLV1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_JamTableCLV1_MenuBarMenuItem_Action(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _tagmenuitem;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstdatoslineasseleccionadas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_MenuBarMenuItem_Action (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,252);
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
 BA.debugLineNum = 253;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//select
this.state = 14;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("ResetearPrioridades"),BA.ObjectToString("EjemploAccionLineasSeleccionadas"),BA.ObjectToString(""))) {
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
this.state = 13;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 14;
 BA.debugLineNum = 255;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_actualizardatos" /*void*/ );
 if (true) break;

case 5:
//C
this.state = 14;
 BA.debugLineNum = 259;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Función desh";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Función deshabilitada."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Si es necesaria su utilización , avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 260;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "jamtableclv1_menubarmenuitem_action"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 14;
;
 BA.debugLineNum = 261;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return ;
 BA.debugLineNum = 263;BA.debugLine="ResetearPrioridades";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_resetearprioridades" /*void*/ );
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 266;BA.debugLine="Dim lstDatosLineasSeleccionadas As List=JamTabl";
Debug.ShouldStop(512);
_lstdatoslineasseleccionadas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatoslineasseleccionadas = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getdatositemsseleccionados" /*RemoteObject*/ );Debug.locals.put("lstDatosLineasSeleccionadas", _lstdatoslineasseleccionadas);Debug.locals.put("lstDatosLineasSeleccionadas", _lstdatoslineasseleccionadas);
 BA.debugLineNum = 267;BA.debugLine="For Each mData As Map In lstDatosLineasSeleccio";
Debug.ShouldStop(1024);
if (true) break;

case 8:
//for
this.state = 11;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group11 = _lstdatoslineasseleccionadas;
index11 = 0;
groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 16;
if (true) break;

case 16:
//C
this.state = 11;
if (index11 < groupLen11) {
this.state = 10;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group11.runMethod(false,"Get",index11));Debug.locals.put("mData", _mdata);}
if (true) break;

case 17:
//C
this.state = 16;
index11++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 10:
//C
this.state = 17;
 BA.debugLineNum = 268;BA.debugLine="LogColor(\"DatosLineaSeleccionada : \" & mData,";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","859113488",RemoteObject.concat(RemoteObject.createImmutable("DatosLineaSeleccionada : "),_mdata),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("mData", _mdata);
;
 if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = -1;
;
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
public static void  _resetearprioridades(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetearPrioridades (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1167);
if (RapidSub.canDelegate("resetearprioridades")) { __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","resetearprioridades", __ref); return;}
ResumableSub_ResetearPrioridades rsub = new ResumableSub_ResetearPrioridades(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ResetearPrioridades extends BA.ResumableSub {
public ResumableSub_ResetearPrioridades(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _numdocsconprioridad = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _lstcomandos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ResetearPrioridades (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1167);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1168;BA.debugLine="Dim NumDocsConPrioridad As Int=Utilidades.FixNull";
Debug.ShouldStop(32768);
_numdocsconprioridad = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblOSUBsPendientesNoCorteNoConf where Gestionado=? and Prioridad<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(0),RemoteObject.createImmutable("")}))))))));Debug.locals.put("NumDocsConPrioridad", _numdocsconprioridad);Debug.locals.put("NumDocsConPrioridad", _numdocsconprioridad);
 BA.debugLineNum = 1169;BA.debugLine="If NumDocsConPrioridad=0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_numdocsconprioridad,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1170;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay ningun";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay ninguna OSUB con prioridad establecida.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1171;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "resetearprioridades"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
 BA.debugLineNum = 1172;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1175;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear t";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Resetear todas las prioridades de OSUBs establecidas?"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Esta acción no es reversible."))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1176;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "resetearprioridades"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 5;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1177;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(16777216);
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
if (true) return ;
if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1179;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(67108864);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 1180;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(134217728);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 1182;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"R";
Debug.ShouldStop(536870912);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ResetearPrioridadesDocumentosNoGestionados")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1183;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(1073741824);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 1184;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "resetearprioridades"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 19;
return;
case 19:
//C
this.state = 11;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1185;BA.debugLine="If Success=False Then";
Debug.ShouldStop(1);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1186;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible resetear las prioridades de las OSUBs.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1187;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "resetearprioridades"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1189;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se han resete";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Se han reseteado todas las prioridades de las OSUBs.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1190;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "resetearprioridades"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 1192;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 1193;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","salirmodulo", __ref);}
 BA.debugLineNum = 247;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="frm.Close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 249;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(16777216);
ccontrolosubspendientesnoconfeccion._mainmenu2.runVoidMethod ("_show" /*void*/ );
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
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.ccontrolosubspendientesnoconfeccion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,57);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 59;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 60;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(134217728);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 61;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(268435456);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 62;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(536870912);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 63;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 64;BA.debugLine="frm.RootPane.LoadLayout(\"scrControlOSUBsPendiente";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrControlOSUBsPendientesNoConfeccion")));
 BA.debugLineNum = 65;BA.debugLine="Sleep(0)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "show"),BA.numberCast(int.class, 0));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
 BA.debugLineNum = 68;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Control OSUBs";
Debug.ShouldStop(8);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Control OSUBs Pendientes No Confección")));
 BA.debugLineNum = 70;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(32);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 72;BA.debugLine="PrimerAvisoInfoEstablecerPrioridad=True";
Debug.ShouldStop(128);
__ref.setField ("_primeravisoinfoestablecerprioridad" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 74;BA.debugLine="frm.Show";
Debug.ShouldStop(512);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 76;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("Close");
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 78;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 79;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="wait for(BorrarDatosFaseActualDocumentosBatchAnte";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "show"), __ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_borrardatosfaseactualdocumentosbatchanterioresmaquinausuario" /*RemoteObject*/ ));
this.state = 16;
return;
case 16:
//C
this.state = 7;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 82;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 83;BA.debugLine="SalirModulo";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 87;BA.debugLine="UUIDSesion=GenerarUUIDv4";
Debug.ShouldStop(4194304);
__ref.setField ("_uuidsesion" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_generaruuidv4" /*RemoteObject*/ ));
 BA.debugLineNum = 88;BA.debugLine="TimestampBatchFaseDocs=DateTime.Now";
Debug.ShouldStop(8388608);
__ref.setField ("_timestampbatchfasedocs" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 98;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.ConfigurarT";
Debug.ShouldStop(2);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_configurartableclv" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ListaControlOSUBsPendientesNoCorteNoConfeccion.json")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 99;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "show"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 11;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 100;BA.debugLine="Log(mRes)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","858720299",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 101;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(16);
if (true) break;

case 11:
//if
this.state = 14;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 102;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 103;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontrolosubspendientesnoconfeccion", "show"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
;
 BA.debugLineNum = 104;BA.debugLine="frm.Close";
Debug.ShouldStop(128);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 105;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 108;BA.debugLine="JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarL";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 110;BA.debugLine="JamTableCLV1.AddMenuItemFontMaterialIconsToMenuIn";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_addmenuitemfontmaterialiconstomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Resetear Prioridades")),(Object)(BA.ObjectToString("ResetearPrioridades")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe16d)))))),(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 114;BA.debugLine="JamTableCLV1.AlturaItems=210dip";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setalturaitems" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 210))));
 BA.debugLineNum = 115;BA.debugLine="JamTableCLV1.ColorSeparadorPaneles=0xFF696969";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setcolorseparadorpaneles",BA.numberCast(int.class, ((int)0xff696969)));
 BA.debugLineNum = 116;BA.debugLine="JamTableCLV1.AlturaSeparadorPaneles=2dip";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setalturaseparadorpaneles" /*RemoteObject*/ ,BA.numberCast(float.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 117;BA.debugLine="JamTableCLV1.ColorPanelSeleccionado=0xFF87CEFA";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setcolorpanelseleccionado" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff87cefa)));
 BA.debugLineNum = 119;BA.debugLine="JamTableCLV1.ModoSeleccionItems=JamTableCLV1.Modo";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmodoseleccionitems" /*RemoteObject*/ ,__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_modoseleccionindividualperm" /*RemoteObject*/ ));
 BA.debugLineNum = 121;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.ccontrolosubspendientesnoconfeccion.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 122;BA.debugLine="End Sub";
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
public static RemoteObject  _tickstoexceldate(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("TicksToExcelDate (ccontrolosubspendientesnoconfeccion) ","ccontrolosubspendientesnoconfeccion",27,__ref.getField(false, "ba"),__ref,1431);
if (RapidSub.canDelegate("tickstoexceldate")) { return __ref.runUserSub(false, "ccontrolosubspendientesnoconfeccion","tickstoexceldate", __ref, _t);}
RemoteObject _excelunixdiff = RemoteObject.createImmutable(0L);
RemoteObject _p = RemoteObject.declareNull("b4j.example.dateutils._period");
RemoteObject _diasdesde0101970 = RemoteObject.createImmutable(0);
RemoteObject _diasexcel = RemoteObject.createImmutable(0);
Debug.locals.put("t", _t);
 BA.debugLineNum = 1431;BA.debugLine="Public Sub TicksToExcelDate(t As Long) As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1432;BA.debugLine="Dim ExcelUnixDiff As Long=25569             'd";
Debug.ShouldStop(8388608);
_excelunixdiff = BA.numberCast(long.class, 25569);Debug.locals.put("ExcelUnixDiff", _excelunixdiff);Debug.locals.put("ExcelUnixDiff", _excelunixdiff);
 BA.debugLineNum = 1436;BA.debugLine="Dim p As Period=DateUtils.PeriodBetweenInDays(0,t";
Debug.ShouldStop(134217728);
_p = ccontrolosubspendientesnoconfeccion._dateutils.runMethod(false,"_periodbetweenindays",(Object)(BA.numberCast(long.class, 0)),(Object)(_t));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1437;BA.debugLine="Dim DiasDesde0101970 As Int=p.Days";
Debug.ShouldStop(268435456);
_diasdesde0101970 = _p.getField(true,"Days");Debug.locals.put("DiasDesde0101970", _diasdesde0101970);Debug.locals.put("DiasDesde0101970", _diasdesde0101970);
 BA.debugLineNum = 1440;BA.debugLine="Dim DiasExcel As Int=ExcelUnixDiff+DiasDesde01019";
Debug.ShouldStop(-2147483648);
_diasexcel = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_excelunixdiff,_diasdesde0101970,RemoteObject.createImmutable(1)}, "++",2, 2));Debug.locals.put("DiasExcel", _diasexcel);Debug.locals.put("DiasExcel", _diasexcel);
 BA.debugLineNum = 1441;BA.debugLine="Log(\"DiasExcel \" & DiasExcel)";
Debug.ShouldStop(1);
ccontrolosubspendientesnoconfeccion.__c.runVoidMethod ("LogImpl","860882954",RemoteObject.concat(RemoteObject.createImmutable("DiasExcel "),_diasexcel),0);
 BA.debugLineNum = 1442;BA.debugLine="Return(DiasExcel)";
Debug.ShouldStop(2);
if (true) return BA.NumberToString((_diasexcel));
 BA.debugLineNum = 1444;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}