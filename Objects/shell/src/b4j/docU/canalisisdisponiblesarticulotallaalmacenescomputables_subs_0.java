package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class canalisisdisponiblesarticulotallaalmacenescomputables_subs_0 {


public static void  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("actualizardatos")) { __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","actualizardatos", __ref); return;}
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
public ResumableSub_ActualizarDatos(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent;
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
		Debug.PushSubsStack("ActualizarDatos (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,161);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 163;BA.debugLine="Wait For(ActualizarDatosDisponibles) complete (mR";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatos"), __ref.runClassMethod (b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables.class, "_actualizardatosdisponibles" /*RemoteObject*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 164;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 165;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 166;BA.debugLine="SalirModulo";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 167;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 173;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(4096);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblAnalisisDisponiblesArticuloTallaAlmacenesComputables order by Articulo, Talla")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 175;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(16384);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 176;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatos"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 177;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 178;BA.debugLine="rs.Close";
Debug.ShouldStop(131072);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 179;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 180;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 181;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 182;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatos"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
 BA.debugLineNum = 184;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 185;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatos"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 186;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 187;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 188;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 191;BA.debugLine="ExitApplication";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 193;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(1);

case 15:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 194;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(2);
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
if (true) return ;
if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 195;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 196;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatos"), _msa);
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
 BA.debugLineNum = 201;BA.debugLine="fx.Msgbox(frm,\"Datos actualizados.\",\"Aviso\")";
Debug.ShouldStop(256);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Datos actualizados.")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 205;BA.debugLine="End Sub";
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
public static RemoteObject  _actualizardatosdisponibles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosDisponibles (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("actualizardatosdisponibles")) { return __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","actualizardatosdisponibles", __ref);}
ResumableSub_ActualizarDatosDisponibles rsub = new ResumableSub_ActualizarDatosDisponibles(null,__ref);
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
public static class ResumableSub_ActualizarDatosDisponibles extends BA.ResumableSub {
public ResumableSub_ActualizarDatosDisponibles(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent;
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
		Debug.PushSubsStack("ActualizarDatosDisponibles (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,229);
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
 BA.debugLineNum = 230;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Actualizando datos Disponible por Artículo Talla en Almacenes Computables...")));
 BA.debugLineNum = 231;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(64);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 232;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblAnalisisDisponi";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblAnalisisDisponiblesArticuloTallaAlmacenesComputables")));
 BA.debugLineNum = 233;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(256);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 234;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(512);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 235;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 236;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
Debug.ShouldStop(2048);
_slinkjrdc = parent._main._rdclinknav /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 237;BA.debugLine="Dim Comando As String=\"AnalisisDisponiblesArticul";
Debug.ShouldStop(4096);
_comando = BA.ObjectToString("AnalisisDisponiblesArticuloTallaAlmacenesComputables");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 238;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
Debug.ShouldStop(8192);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 240;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatosdisponibles"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 241;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 242;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 243;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 244;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatosdisponibles"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 245;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 246;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2097152);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 249;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 250;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 251;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 252;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 253;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de Analisis Disponibles Almacen Articulo Talla")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 254;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatosdisponibles"), _msa);
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
 BA.debugLineNum = 256;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 257;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 260;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 264;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblAnalisisDisponibles";
Debug.ShouldStop(128);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblAnalisisDisponiblesArticuloTallaAlmacenesComputables")),(Object)(_lstreg));
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
 BA.debugLineNum = 267;BA.debugLine="Return mRes";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 268;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _alternarexcluidoreclamacion(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("AlternarExcluidoReclamacion (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("alternarexcluidoreclamacion")) { return __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","alternarexcluidoreclamacion", __ref, _datosceldaseleccionada);}
RemoteObject _valoractual = RemoteObject.createImmutable(0);
RemoteObject _nuevovalor = RemoteObject.createImmutable(0);
RemoteObject _mpk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pedidosel = RemoteObject.createImmutable("");
RemoteObject _lineasel = RemoteObject.createImmutable("");
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 352;BA.debugLine="Sub AlternarExcluidoReclamacion(DatosCeldaSeleccio";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="Log(DatosCeldaSeleccionada)";
Debug.ShouldStop(1);
canalisisdisponiblesarticulotallaalmacenescomputables.__c.runVoidMethod ("LogImpl","843515905",BA.ObjectToString(_datosceldaseleccionada),0);
 BA.debugLineNum = 354;BA.debugLine="Dim ValorActual As Int= DatosCeldaSeleccionada.Va";
Debug.ShouldStop(2);
_valoractual = BA.numberCast(int.class, _datosceldaseleccionada.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("ValorActual", _valoractual);Debug.locals.put("ValorActual", _valoractual);
 BA.debugLineNum = 355;BA.debugLine="Dim NuevoValor As Int";
Debug.ShouldStop(4);
_nuevovalor = RemoteObject.createImmutable(0);Debug.locals.put("NuevoValor", _nuevovalor);
 BA.debugLineNum = 356;BA.debugLine="Select ValorActual";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_valoractual,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 358;BA.debugLine="NuevoValor=1";
Debug.ShouldStop(32);
_nuevovalor = BA.numberCast(int.class, 1);Debug.locals.put("NuevoValor", _nuevovalor);
 break; }
case 1: {
 BA.debugLineNum = 361;BA.debugLine="NuevoValor=0";
Debug.ShouldStop(256);
_nuevovalor = BA.numberCast(int.class, 0);Debug.locals.put("NuevoValor", _nuevovalor);
 break; }
}
;
 BA.debugLineNum = 363;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
Debug.ShouldStop(1024);
_mpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mpk = _datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mPK", _mpk);Debug.locals.put("mPK", _mpk);
 BA.debugLineNum = 364;BA.debugLine="Dim PedidoSel As String=mPK.Get(\"Pedido\")";
Debug.ShouldStop(2048);
_pedidosel = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Pedido")))));Debug.locals.put("PedidoSel", _pedidosel);Debug.locals.put("PedidoSel", _pedidosel);
 BA.debugLineNum = 365;BA.debugLine="Dim LineaSel As String=mPK.Get(\"Linea\")";
Debug.ShouldStop(4096);
_lineasel = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Linea")))));Debug.locals.put("LineaSel", _lineasel);Debug.locals.put("LineaSel", _lineasel);
 BA.debugLineNum = 366;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?")),(Object)(canalisisdisponiblesarticulotallaalmacenescomputables.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_nuevovalor),(_pedidosel),(_lineasel)})))));
 BA.debugLineNum = 367;BA.debugLine="jamTableView1.RefrescarTablaValorCeldaEditada(Dat";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescartablavalorceldaeditada" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ )),(Object)(_datosceldaseleccionada.getField(true,"Columna" /*RemoteObject*/ )),(Object)((_nuevovalor)),(Object)(_datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ )));
 BA.debugLineNum = 368;BA.debugLine="jamTableView1.SeleccionarCelda(\"ExcluidoReclamaci";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_seleccionarcelda" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ExcluidoReclamacion")),(Object)(_datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ )));
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("asJO (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 142;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="Return o";
Debug.ShouldStop(16384);
if (true) return _o;
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("btnSalir_Click (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","btnsalir_click", __ref);}
 BA.debugLineNum = 151;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="SalirModulo";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
canalisisdisponiblesarticulotallaalmacenescomputables._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",canalisisdisponiblesarticulotallaalmacenescomputables._fx);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI";
canalisisdisponiblesarticulotallaalmacenescomputables._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",canalisisdisponiblesarticulotallaalmacenescomputables._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private frm As Form";
canalisisdisponiblesarticulotallaalmacenescomputables._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",canalisisdisponiblesarticulotallaalmacenescomputables._frm);
 //BA.debugLineNum = 10;BA.debugLine="Private btnSalir As Button";
canalisisdisponiblesarticulotallaalmacenescomputables._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",canalisisdisponiblesarticulotallaalmacenescomputables._btnsalir);
 //BA.debugLineNum = 11;BA.debugLine="Private jamTableView1 As jamTableView";
canalisisdisponiblesarticulotallaalmacenescomputables._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",canalisisdisponiblesarticulotallaalmacenescomputables._jamtableview1);
 //BA.debugLineNum = 13;BA.debugLine="Dim Dialog As B4XDialog";
canalisisdisponiblesarticulotallaalmacenescomputables._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",canalisisdisponiblesarticulotallaalmacenescomputables._dialog);
 //BA.debugLineNum = 14;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
canalisisdisponiblesarticulotallaalmacenescomputables._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",canalisisdisponiblesarticulotallaalmacenescomputables._jamloadingindicator1);
 //BA.debugLineNum = 15;BA.debugLine="Dim mSQL As SQL";
canalisisdisponiblesarticulotallaalmacenescomputables._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",canalisisdisponiblesarticulotallaalmacenescomputables._msql);
 //BA.debugLineNum = 17;BA.debugLine="Public PermisoModuloUsuario As String";
canalisisdisponiblesarticulotallaalmacenescomputables._permisomodulousuario = RemoteObject.createImmutable("");__ref.setField("_permisomodulousuario",canalisisdisponiblesarticulotallaalmacenescomputables._permisomodulousuario);
 //BA.debugLineNum = 19;BA.debugLine="Private imagencomentario() As Byte";
canalisisdisponiblesarticulotallaalmacenescomputables._imagencomentario = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});__ref.setField("_imagencomentario",canalisisdisponiblesarticulotallaalmacenescomputables._imagencomentario);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 209;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(131072);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(canalisisdisponiblesarticulotallaalmacenescomputables.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblAnalisisDisponiblesArticuloTallaAlmacenesComputables")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 211;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 212;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblAnalisisDisponi";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblAnalisisDisponiblesArticuloTallaAlmacenesComputables")));
 };
 BA.debugLineNum = 214;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(2097152);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 215;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 216;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE If Not EXISTS [";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblAnalisisDisponiblesArticuloTallaAlmacenesComputables] (")));
 BA.debugLineNum = 217;BA.debugLine="sbCrearTabla.Append(\"  [Articulo] TEXT, [Descripc";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("  [Articulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT, [Stock] REAL")));
 BA.debugLineNum = 218;BA.debugLine="sbCrearTabla.Append(\", [CosteUnitario] REAL, [Tot";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [CosteUnitario] REAL, [TotalCosteStock] REAL, [ClienteExclusiva] TEXT, [NombreClienteExclusiva] TEXT, [StockNoConfigurado] TEXT")));
 BA.debugLineNum = 219;BA.debugLine="sbCrearTabla.Append(\", [SistemaReposicion] TEXT,";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [SistemaReposicion] TEXT, [ArticuloBloqueado] TEXT, [ArticuloBloqueadoNoDisponible] TEXT, [GrupoContable] TEXT, [NombreRuta] TEXT")));
 BA.debugLineNum = 220;BA.debugLine="sbCrearTabla.Append(\", [RutaCorte] TEXT, [Proveed";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [RutaCorte] TEXT, [ProveedorPredeterminado] TEXT, [NombreProveedorPredeterminado] TEXT, [UltimoMovPositivo] INTEGER, [Cantidad3M] REAL")));
 BA.debugLineNum = 221;BA.debugLine="sbCrearTabla.Append(\", [Cantidad6M] REAL, [Cantid";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [Cantidad6M] REAL, [Cantidad9M] REAL, [Cantidad12M] REAL, [Cantidad24M] REAL, [ArtTallaConMaxMin] TEXT, [NecConsumo] REAL")));
 BA.debugLineNum = 222;BA.debugLine="sbCrearTabla.Append(\", [NecVenta] REAL, [NecEnvio";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [NecVenta] REAL, [NecEnvioTransf] REAL, [PteRecepcionTransf] REAL, [NecNeta] REAL, [Disponible] REAL, [CosteDisponible] REAL")));
 BA.debugLineNum = 223;BA.debugLine="sbCrearTabla.Append(\", [MesesConsumo6M] REAL, [Se";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [MesesConsumo6M] REAL, [SegConsumo] TEXT, [Comentarios] INTEGER DEFAULT 0)")));
 BA.debugLineNum = 224;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 147;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="EventData.Consume";
Debug.ShouldStop(524288);
_eventdata.runVoidMethod ("Consume");
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { return __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","jamtableview1_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 272;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="SalirModulo";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("jamTableView1_CambioEnCeldaSeleccionada (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("jamtableview1_cambioenceldaseleccionada")) { return __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","jamtableview1_cambioenceldaseleccionada", __ref, _datosceldaseleccionada);}
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
 BA.debugLineNum = 318;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila";
Debug.ShouldStop(1073741824);
_lineaseltv = _datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ );Debug.locals.put("LineaSelTV", _lineaseltv);Debug.locals.put("LineaSelTV", _lineaseltv);
 BA.debugLineNum = 320;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
Debug.ShouldStop(-2147483648);
_mpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mpk = _datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mPK", _mpk);Debug.locals.put("mPK", _mpk);
 BA.debugLineNum = 321;BA.debugLine="Dim Pedido As String=mPK.Get(\"Pedido\")";
Debug.ShouldStop(1);
_pedido = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Pedido")))));Debug.locals.put("Pedido", _pedido);Debug.locals.put("Pedido", _pedido);
 BA.debugLineNum = 322;BA.debugLine="Dim Linea As Int=mPK.Get(\"Linea\")";
Debug.ShouldStop(2);
_linea = BA.numberCast(int.class, _mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Linea")))));Debug.locals.put("Linea", _linea);Debug.locals.put("Linea", _linea);
 BA.debugLineNum = 323;BA.debugLine="Dim NombreProveedor As String=jamTableView1.GetVa";
Debug.ShouldStop(4);
_nombreproveedor = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("NombreProveedor"))));Debug.locals.put("NombreProveedor", _nombreproveedor);Debug.locals.put("NombreProveedor", _nombreproveedor);
 BA.debugLineNum = 324;BA.debugLine="Dim Articulo As String=jamTableView1.GetValorSQLC";
Debug.ShouldStop(8);
_articulo = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Articulo"))));Debug.locals.put("Articulo", _articulo);Debug.locals.put("Articulo", _articulo);
 BA.debugLineNum = 325;BA.debugLine="Dim Descripcion As String=jamTableView1.GetValorS";
Debug.ShouldStop(16);
_descripcion = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("DescripcionArticulo"))));Debug.locals.put("Descripcion", _descripcion);Debug.locals.put("Descripcion", _descripcion);
 BA.debugLineNum = 326;BA.debugLine="Dim Talla As String=jamTableView1.GetValorSQLCamp";
Debug.ShouldStop(32);
_talla = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Talla"))));Debug.locals.put("Talla", _talla);Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 327;BA.debugLine="Dim sTalla As String=IIf(Talla<>\"\",\"Talla: \" & Ta";
Debug.ShouldStop(64);
_stalla = BA.ObjectToString(((RemoteObject.solveBoolean("!",_talla,BA.ObjectToString(""))) ? ((RemoteObject.concat(RemoteObject.createImmutable("Talla: "),_talla))) : ((RemoteObject.createImmutable("")))));Debug.locals.put("sTalla", _stalla);Debug.locals.put("sTalla", _stalla);
 BA.debugLineNum = 328;BA.debugLine="Dim QtyPte As Int=jamTableView1.GetValorSQLCampoF";
Debug.ShouldStop(128);
_qtypte = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("QtyPendiente"))));Debug.locals.put("QtyPte", _qtypte);Debug.locals.put("QtyPte", _qtypte);
 BA.debugLineNum = 329;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(256);
_dateformatant = canalisisdisponiblesarticulotallaalmacenescomputables.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 330;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(512);
canalisisdisponiblesarticulotallaalmacenescomputables.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 331;BA.debugLine="Dim FechaPrometidaLong As Long=jamTableView1.GetV";
Debug.ShouldStop(1024);
_fechaprometidalong = BA.numberCast(long.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("FechaPrometida"))));Debug.locals.put("FechaPrometidaLong", _fechaprometidalong);Debug.locals.put("FechaPrometidaLong", _fechaprometidalong);
 BA.debugLineNum = 332;BA.debugLine="Dim sFechaPrometida As String=IIf(FechaPrometidaL";
Debug.ShouldStop(2048);
_sfechaprometida = BA.ObjectToString(((RemoteObject.solveBoolean(">",_fechaprometidalong,BA.numberCast(long.class, 0))) ? ((RemoteObject.concat(RemoteObject.createImmutable("Fecha Prometida: "),canalisisdisponiblesarticulotallaalmacenescomputables.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechaprometidalong))))) : ((RemoteObject.createImmutable("SIN FECHA PROMETIDA")))));Debug.locals.put("sFechaPrometida", _sfechaprometida);Debug.locals.put("sFechaPrometida", _sfechaprometida);
 BA.debugLineNum = 333;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(4096);
canalisisdisponiblesarticulotallaalmacenescomputables.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 334;BA.debugLine="Dim PendienteSeguimiento As Int=jamTableView1.Get";
Debug.ShouldStop(8192);
_pendienteseguimiento = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("PendienteSeguimiento"))));Debug.locals.put("PendienteSeguimiento", _pendienteseguimiento);Debug.locals.put("PendienteSeguimiento", _pendienteseguimiento);
 BA.debugLineNum = 335;BA.debugLine="Dim sPendienteSeguimiento As String=IIf(Pendiente";
Debug.ShouldStop(16384);
_spendienteseguimiento = BA.ObjectToString(((RemoteObject.solveBoolean("=",_pendienteseguimiento,BA.numberCast(double.class, 1))) ? (RemoteObject.createImmutable(("PENDIENTE SEGUIMIENTO"))) : ((RemoteObject.createImmutable("")))));Debug.locals.put("sPendienteSeguimiento", _spendienteseguimiento);Debug.locals.put("sPendienteSeguimiento", _spendienteseguimiento);
 BA.debugLineNum = 337;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Pedido:";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Pedido: "),_pedido,RemoteObject.createImmutable(" Línea:"),_linea,RemoteObject.createImmutable("  "),_nombreproveedor,RemoteObject.createImmutable("  "),_articulo,RemoteObject.createImmutable("  "),_descripcion,RemoteObject.createImmutable("  "),_stalla,RemoteObject.createImmutable("  QtyPte: "),_qtypte,RemoteObject.createImmutable("  "),_sfechaprometida,RemoteObject.createImmutable(" "),_spendienteseguimiento)));
 BA.debugLineNum = 339;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("jamTableView1_CellClick (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("jamtableview1_cellclick")) { return __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","jamtableview1_cellclick", __ref, _datosceldaseleccionada);}
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 343;BA.debugLine="Sub jamTableView1_CellClick(DatosCeldaSeleccionada";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="Select DatosCeldaSeleccionada.AliasCampo";
Debug.ShouldStop(8388608);
switch (BA.switchObjectToInt(_datosceldaseleccionada.getField(true,"AliasCampo" /*RemoteObject*/ ),BA.ObjectToString("ExcluidoReclamacion"))) {
case 0: {
 BA.debugLineNum = 346;BA.debugLine="AlternarExcluidoReclamacion(DatosCeldaSeleccion";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables.class, "_alternarexcluidoreclamacion" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada));
 break; }
}
;
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("jamtableview1_contextmenuitem_action")) { __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","jamtableview1_contextmenuitem_action", __ref, _tagmenuitem); return;}
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
public ResumableSub_jamTableView1_ContextMenuItem_Action(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent;
RemoteObject _tagmenuitem;
RemoteObject _articulosel = RemoteObject.createImmutable("");
RemoteObject _filaseleccionada = RemoteObject.createImmutable(0);
RemoteObject _lstinfofila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dc = RemoteObject.declareNull("b4j.docU.jamtableview._datoscamporegistrojamtableview");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,288);
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
 BA.debugLineNum = 289;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(1);
if (true) break;

case 1:
//select
this.state = 19;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("VerArticuloNAV"))) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 292;BA.debugLine="Dim ArticuloSel As String";
Debug.ShouldStop(8);
_articulosel = RemoteObject.createImmutable("");Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 293;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
Debug.ShouldStop(16);
_filaseleccionada = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_indicesfilasseleccionadas" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 294;BA.debugLine="Dim lstInfoFila As List=jamTableView1.DatosRegi";
Debug.ShouldStop(32);
_lstinfofila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstinfofila = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datosregistroindicefila" /*RemoteObject*/ ,(Object)(_filaseleccionada));Debug.locals.put("lstInfoFila", _lstinfofila);Debug.locals.put("lstInfoFila", _lstinfofila);
 BA.debugLineNum = 295;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
Debug.ShouldStop(64);
if (true) break;

case 4:
//for
this.state = 11;
group6 = _lstinfofila;
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("dc", _dc);
this.state = 20;
if (true) break;

case 20:
//C
this.state = 11;
if (index6 < groupLen6) {
this.state = 6;
_dc = (group6.runMethod(false,"Get",index6));Debug.locals.put("dc", _dc);}
if (true) break;

case 21:
//C
this.state = 20;
index6++;
Debug.locals.put("dc", _dc);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 296;BA.debugLine="If dc.Campo=\"Articulo\" Then";
Debug.ShouldStop(128);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_dc.getField(true,"Campo" /*RemoteObject*/ ),BA.ObjectToString("Articulo"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 297;BA.debugLine="ArticuloSel=dc.ValorCampo";
Debug.ShouldStop(256);
_articulosel = BA.ObjectToString(_dc.getField(false,"ValorCampo" /*RemoteObject*/ ));Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 298;BA.debugLine="Exit";
Debug.ShouldStop(512);
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 21;
;
 if (true) break;
if (true) break;
Debug.locals.put("dc", _dc);
;
 BA.debugLineNum = 301;BA.debugLine="If ArticuloSel=\"\" Then";
Debug.ShouldStop(4096);

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_articulosel,BA.ObjectToString(""))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 302;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha encontrado el campo Artículo.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 303;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 14;
;
 BA.debugLineNum = 304;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 306;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(131072);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ficha producto")),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.ObjectToString("No.")),(Object)(_articulosel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 307;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 23;
return;
case 23:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 308;BA.debugLine="If success=False Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 309;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible abrir el artículo seleccionado en Navision.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 310;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = -1;
;
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
public static void  _jamtableview1_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem); return;}
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
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent;
RemoteObject _tagmenuitem;
RemoteObject _seleccionardireccionremitenteemails = RemoteObject.createImmutable("");
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,276);
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
 BA.debugLineNum = 277;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("SeleccionarCuentaRemitenteEmail"))) {
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
this.state = 12;
 BA.debugLineNum = 280;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables.class, "_actualizardatos" /*void*/ );
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 282;BA.debugLine="wait for (SeleccionarDireccionRemitenteEmails)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "jamtableview1_menubarmenuitem_action"), (_seleccionardireccionremitenteemails));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 283;BA.debugLine="If rBool=False Then Return";
Debug.ShouldStop(67108864);
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
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 285;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","salirmodulo", __ref);}
 BA.debugLineNum = 155;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 157;BA.debugLine="frm.Close";
Debug.ShouldStop(268435456);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 158;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(536870912);
canalisisdisponiblesarticulotallaalmacenescomputables._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Show (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "canalisisdisponiblesarticulotallaalmacenescomputables","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (canalisisdisponiblesarticulotallaalmacenescomputables) ","canalisisdisponiblesarticulotallaalmacenescomputables",16,__ref.getField(false, "ba"),__ref,27);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 29;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
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
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 36;BA.debugLine="frm.RootPane.LoadLayout(\"scrAnalisisDisponiblesAl";
Debug.ShouldStop(8);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrAnalisisDisponiblesAlmacenArticuloTalla")));
 BA.debugLineNum = 37;BA.debugLine="Sleep(0)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "show"),BA.numberCast(int.class, 0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 BA.debugLineNum = 39;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Análisis Disp";
Debug.ShouldStop(64);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Análisis Disponibles Artículo Talla Almacenes Computables")));
 BA.debugLineNum = 41;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 42;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 44;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 53;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 54;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 60;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 61;BA.debugLine="Dim img As Image";
Debug.ShouldStop(268435456);
_img = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 62;BA.debugLine="img.InitializeSample(File.DirAssets,\"navision.png";
Debug.ShouldStop(536870912);
_img.runVoidMethod ("InitializeSample",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("navision.png")),(Object)(BA.numberCast(double.class, 24)),(Object)(BA.numberCast(double.class, 24)));
 BA.debugLineNum = 64;BA.debugLine="jamTableView1.AddContextMenuItemImage(\"Artículo N";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Artículo NAV")),(Object)(BA.ObjectToString("VerArticuloNAV")),(Object)(_img));
 BA.debugLineNum = 69;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(16);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaAnalisisDisponiblesArticuloTallaAlmacenesComputables.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 70;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 71;BA.debugLine="Log(mRes)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","842663980",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 72;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(128);
if (true) break;

case 7:
//if
this.state = 10;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 73;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 74;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 10;
;
 BA.debugLineNum = 75;BA.debugLine="frm.Close";
Debug.ShouldStop(1024);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 76;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 79;BA.debugLine="jamTableView1.AlturaFilas=0    ' 0 si se quiere q";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 81;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(65536);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 82;BA.debugLine="CF.Initialize";
Debug.ShouldStop(131072);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 83;BA.debugLine="CF.NombreFuncionCellFactory=\"setColumnaImagenCome";
Debug.ShouldStop(262144);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,BA.ObjectToString("setColumnaImagenComentario"));
 BA.debugLineNum = 84;BA.debugLine="CF.CellFactoryEnCallBack=True";
Debug.ShouldStop(524288);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 85;BA.debugLine="Dim img As Image";
Debug.ShouldStop(1048576);
_img = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 89;BA.debugLine="imagencomentario=Utilidades.GetImageBytes(File.Di";
Debug.ShouldStop(16777216);
__ref.setField ("_imagencomentario" /*RemoteObject*/ ,parent._utilidades.runMethod(false,"_getimagebytes" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("comment16Freepik.png"))));
 BA.debugLineNum = 97;BA.debugLine="CF.params=Null";
Debug.ShouldStop(1);
_cf.setField ("params" /*RemoteObject*/ ,(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 98;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("Comentarios")})))));
 BA.debugLineNum = 133;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(16);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 134;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 136;BA.debugLine="frm.Show";
Debug.ShouldStop(128);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 138;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables.class, "_actualizardatos" /*void*/ );
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