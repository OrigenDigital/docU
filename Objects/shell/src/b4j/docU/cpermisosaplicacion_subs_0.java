package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cpermisosaplicacion_subs_0 {


public static void  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("actualizardatos")) { __ref.runUserSub(false, "cpermisosaplicacion","actualizardatos", __ref); return;}
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
public ResumableSub_ActualizarDatos(b4j.docU.cpermisosaplicacion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cpermisosaplicacion parent;
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
		Debug.PushSubsStack("ActualizarDatos (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,78);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 81;BA.debugLine="Wait For(ActualizarDatosMysql) complete (mRes As";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "actualizardatos"), __ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_actualizardatosmysql" /*RemoteObject*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 82;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 83;BA.debugLine="If Accion<>\"OK\" Then";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 84;BA.debugLine="SalirModulo";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 89;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblPermisosAplicacion order by ObjetoPermiso, IDUsuario")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 90;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 91;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "actualizardatos"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 92;BA.debugLine="rs.Close";
Debug.JustUpdateDeviceLine();
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 93;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 94;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 8:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 95;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
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
 BA.debugLineNum = 96;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 97;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "actualizardatos"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 17;
;
 if (true) break;
;
 BA.debugLineNum = 99;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.JustUpdateDeviceLine();

case 17:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 100;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 101;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "actualizardatos"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 20;
;
 BA.debugLineNum = 103;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 104;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "actualizardatos"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 20;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 105;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 106;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 107;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 110;BA.debugLine="ExitApplication";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("ExitApplication");
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
 BA.debugLineNum = 114;BA.debugLine="fx.Msgbox(frm,\"Datos actualizados.\",\"Aviso\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Datos actualizados.")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _actualizardatosmysql(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosMysql (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("actualizardatosmysql")) { return __ref.runUserSub(false, "cpermisosaplicacion","actualizardatosmysql", __ref);}
ResumableSub_ActualizarDatosMysql rsub = new ResumableSub_ActualizarDatosMysql(null,__ref);
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
public static class ResumableSub_ActualizarDatosMysql extends BA.ResumableSub {
public ResumableSub_ActualizarDatosMysql(b4j.docU.cpermisosaplicacion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cpermisosaplicacion parent;
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
		Debug.PushSubsStack("ActualizarDatosMysql (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,164);
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
 BA.debugLineNum = 165;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblPermisosAplicac";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblPermisosAplicacion")));
 BA.debugLineNum = 166;BA.debugLine="Dim Accion As String";
Debug.JustUpdateDeviceLine();
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 167;BA.debugLine="Dim mRes As Map";
Debug.JustUpdateDeviceLine();
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 168;BA.debugLine="mRes.Initialize";
Debug.JustUpdateDeviceLine();
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 169;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.JustUpdateDeviceLine();
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 170;BA.debugLine="Dim Comando As String=\"PermisosAplicacionEdicion\"";
Debug.JustUpdateDeviceLine();
_comando = BA.ObjectToString("PermisosAplicacionEdicion");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 171;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(Main.";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(parent._main._nombreaplicacion /*RemoteObject*/ ),(RemoteObject.createImmutable("Windows"))})),(Object)(__ref));
 BA.debugLineNum = 173;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "actualizardatosmysql"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 174;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 175;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 176;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "actualizardatosmysql"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 177;BA.debugLine="Accion=\"Salir\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 178;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.JustUpdateDeviceLine();
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 181;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 182;BA.debugLine="Accion=\"Sin Datos\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 183;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.JustUpdateDeviceLine();
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 184;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de Permisos para la aplicación actual ")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 185;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "actualizardatosmysql"), _msa);
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
 BA.debugLineNum = 187;BA.debugLine="Accion=\"OK\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 188;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.JustUpdateDeviceLine();
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 191;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 193;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblPermisosAplicacion\"";
Debug.JustUpdateDeviceLine();
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblPermisosAplicacion")),(Object)(_lstreg));
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
 BA.debugLineNum = 196;BA.debugLine="Return mRes";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cpermisosaplicacion","btnsalir_click", __ref);}
 BA.debugLineNum = 129;BA.debugLine="Private Sub btnSalir_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="SalirModulo";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
cpermisosaplicacion._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cpermisosaplicacion._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
cpermisosaplicacion._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cpermisosaplicacion._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cpermisosaplicacion._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cpermisosaplicacion._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private Dialog As B4XDialog";
cpermisosaplicacion._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cpermisosaplicacion._dialog);
 //BA.debugLineNum = 9;BA.debugLine="Private mSQL As SQL";
cpermisosaplicacion._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cpermisosaplicacion._msql);
 //BA.debugLineNum = 14;BA.debugLine="Private jamTableView1 As jamTableView";
cpermisosaplicacion._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",cpermisosaplicacion._jamtableview1);
 //BA.debugLineNum = 15;BA.debugLine="Private jFReg As jamFormRegistro";
cpermisosaplicacion._jfreg = RemoteObject.createNew ("b4j.docU.jamformregistro");__ref.setField("_jfreg",cpermisosaplicacion._jfreg);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _copiarpermisootrousuario(RemoteObject __ref,RemoteObject _mdata) throws Exception{
try {
		Debug.PushSubsStack("CopiarPermisoOtroUsuario (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("copiarpermisootrousuario")) { return __ref.runUserSub(false, "cpermisosaplicacion","copiarpermisootrousuario", __ref, _mdata);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 270;BA.debugLine="Sub CopiarPermisoOtroUsuario(mData As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 271;BA.debugLine="mData.put(\"IDUsuario\",\"\")";
Debug.JustUpdateDeviceLine();
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDUsuario"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 272;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 273;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 274;BA.debugLine="m.Put(\"Aplicacion\",Main.NombreAplicacion)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Aplicacion"))),(Object)((cpermisosaplicacion._main._nombreaplicacion /*RemoteObject*/ )));
 BA.debugLineNum = 275;BA.debugLine="m.Put(\"OS\",\"Windows\")";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("OS"))),(Object)((RemoteObject.createImmutable("Windows"))));
 BA.debugLineNum = 276;BA.debugLine="m.Put(\"ObjetoPermiso\",mData.get(\"ObjetoPermiso\"))";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ObjetoPermiso"))),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ObjetoPermiso"))))));
 BA.debugLineNum = 277;BA.debugLine="m.Put(\"TipoPermiso\",mData.get(\"TipoPermiso\"))";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TipoPermiso"))),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoPermiso"))))));
 BA.debugLineNum = 278;BA.debugLine="jFReg.Initialize(Me,\"jFReg\",frm,\"Nuevo Permiso\",\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("jFReg")),(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Nuevo Permiso")),(Object)(BA.ObjectToString("Nuevo")),(Object)(BA.ObjectToString("PermisosAplicacionEdicionFormRegistro.json")),(Object)(_m));
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _copiartodospermisosaplicacionotrousuario(RemoteObject __ref,RemoteObject _usuarioorigen) throws Exception{
try {
		Debug.PushSubsStack("CopiarTodosPermisosAplicacionOtroUsuario (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,304);
if (RapidSub.canDelegate("copiartodospermisosaplicacionotrousuario")) { __ref.runUserSub(false, "cpermisosaplicacion","copiartodospermisosaplicacionotrousuario", __ref, _usuarioorigen); return;}
ResumableSub_CopiarTodosPermisosAplicacionOtroUsuario rsub = new ResumableSub_CopiarTodosPermisosAplicacionOtroUsuario(null,__ref,_usuarioorigen);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CopiarTodosPermisosAplicacionOtroUsuario extends BA.ResumableSub {
public ResumableSub_CopiarTodosPermisosAplicacionOtroUsuario(b4j.docU.cpermisosaplicacion parent,RemoteObject __ref,RemoteObject _usuarioorigen) {
this.parent = parent;
this.__ref = __ref;
this._usuarioorigen = _usuarioorigen;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cpermisosaplicacion parent;
RemoteObject _usuarioorigen;
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _idusuariodestino = RemoteObject.createImmutable("");
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _aplicacion = RemoteObject.createImmutable("");
RemoteObject _os = RemoteObject.createImmutable("");
RemoteObject _objetopermiso = RemoteObject.createImmutable("");
RemoteObject _tipopermiso = RemoteObject.createImmutable("");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject group37;
int index37;
int groupLen37;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CopiarTodosPermisosAplicacionOtroUsuario (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,304);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UsuarioOrigen", _usuarioorigen);
 BA.debugLineNum = 309;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.JustUpdateDeviceLine();
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 310;BA.debugLine="Dim Comando As String=\"PermisosAplicacionUsuario\"";
Debug.JustUpdateDeviceLine();
_comando = BA.ObjectToString("PermisosAplicacionUsuario");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 311;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(Main.";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(parent._main._nombreaplicacion /*RemoteObject*/ ),(RemoteObject.createImmutable("Windows"))})),(Object)(__ref));
 BA.debugLineNum = 313;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), null);
this.state = 34;
return;
case 34:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 314;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 315;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 316;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 12;
;
 BA.debugLineNum = 319;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 322;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 325;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay datos de Permisos para la aplicación actual, para el usuario con ID "),_usuarioorigen)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 326;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 11;
;
 BA.debugLineNum = 327;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 333;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 340;BA.debugLine="Dialog.Title=\"Indica Usuario\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Usuario")));
 BA.debugLineNum = 341;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 342;BA.debugLine="Dialog.OverlayColor=0x00FFFFFF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_overlaycolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x00ffffff)));
 BA.debugLineNum = 343;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.JustUpdateDeviceLine();
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 344;BA.debugLine="InputDlg.Initialize";
Debug.JustUpdateDeviceLine();
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 345;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.JustUpdateDeviceLine();
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 346;BA.debugLine="InputDlg.Text=\"\"";
Debug.JustUpdateDeviceLine();
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 349;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 350;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.JustUpdateDeviceLine();
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 351;BA.debugLine="bOK.TextSize=15";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 352;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 353;BA.debugLine="bCancel.TextSize=15";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 354;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 355;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 356;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), _rsub);
this.state = 37;
return;
case 37:
//C
this.state = 13;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 358;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.JustUpdateDeviceLine();
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
if (true) return ;
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 359;BA.debugLine="Dim IDUsuarioDestino As String=InputDlg.Text.Trim";
Debug.JustUpdateDeviceLine();
_idusuariodestino = _inputdlg.getField(true,"_text" /*RemoteObject*/ ).runMethod(true,"trim").runMethod(true,"toUpperCase");Debug.locals.put("IDUsuarioDestino", _idusuariodestino);Debug.locals.put("IDUsuarioDestino", _idusuariodestino);
 BA.debugLineNum = 361;BA.debugLine="Dim lstCommands As List";
Debug.JustUpdateDeviceLine();
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 362;BA.debugLine="lstCommands.Initialize";
Debug.JustUpdateDeviceLine();
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 363;BA.debugLine="For Each mData As Map In lstReg";
Debug.JustUpdateDeviceLine();
if (true) break;

case 19:
//for
this.state = 22;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group37 = _lstreg;
index37 = 0;
groupLen37 = group37.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 38;
if (true) break;

case 38:
//C
this.state = 22;
if (index37 < groupLen37) {
this.state = 21;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group37.runMethod(false,"Get",index37));Debug.locals.put("mData", _mdata);}
if (true) break;

case 39:
//C
this.state = 38;
index37++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 21:
//C
this.state = 39;
 BA.debugLineNum = 364;BA.debugLine="Dim Aplicacion As String=mData.Get(\"Aplicacion\")";
Debug.JustUpdateDeviceLine();
_aplicacion = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Aplicacion")))));Debug.locals.put("Aplicacion", _aplicacion);Debug.locals.put("Aplicacion", _aplicacion);
 BA.debugLineNum = 365;BA.debugLine="Dim OS As String=mData.Get(\"OS\")";
Debug.JustUpdateDeviceLine();
_os = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OS")))));Debug.locals.put("OS", _os);Debug.locals.put("OS", _os);
 BA.debugLineNum = 366;BA.debugLine="Dim ObjetoPermiso As String=mData.Get(\"ObjetoPer";
Debug.JustUpdateDeviceLine();
_objetopermiso = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ObjetoPermiso")))));Debug.locals.put("ObjetoPermiso", _objetopermiso);Debug.locals.put("ObjetoPermiso", _objetopermiso);
 BA.debugLineNum = 367;BA.debugLine="Dim TipoPermiso As String=mData.Get(\"TipoPermiso";
Debug.JustUpdateDeviceLine();
_tipopermiso = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoPermiso")))));Debug.locals.put("TipoPermiso", _tipopermiso);Debug.locals.put("TipoPermiso", _tipopermiso);
 BA.debugLineNum = 368;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Nu";
Debug.JustUpdateDeviceLine();
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("NuevoPermisoAplicacion")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_aplicacion),(_os),(_idusuariodestino),(_objetopermiso),(_tipopermiso)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 369;BA.debugLine="lstCommands.Add(cmd)";
Debug.JustUpdateDeviceLine();
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 if (true) break;
if (true) break;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 371;BA.debugLine="If lstCommands.Size=0 Then Return";
Debug.JustUpdateDeviceLine();

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_lstcommands.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) return ;
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 372;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 373;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), null);
this.state = 40;
return;
case 40:
//C
this.state = 28;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 374;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTable";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursordefaulthabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 375;BA.debugLine="If result=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 28:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_result,parent.__c.getField(true,"False"))) { 
this.state = 30;
}else {
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 33;
 BA.debugLineNum = 376;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query EliminarPermisoAplicacion")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 377;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 33;
;
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 379;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Registro elim";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Registro eliminado.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 380;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), _msa);
this.state = 42;
return;
case 42:
//C
this.state = 33;
;
 BA.debugLineNum = 381;BA.debugLine="ActualizarDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_actualizardatos" /*void*/ );
 if (true) break;

case 33:
//C
this.state = -1;
;
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cpermisosaplicacion","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 143;BA.debugLine="Sub CreacionTablasSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 144;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.JustUpdateDeviceLine();
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cpermisosaplicacion.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblPermisosAplicacion")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 145;BA.debugLine="If ntFP>0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 146;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblPermisosAplicac";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblPermisosAplicacion")));
 };
 BA.debugLineNum = 148;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.JustUpdateDeviceLine();
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 149;BA.debugLine="sbCrearTabla.Initialize";
Debug.JustUpdateDeviceLine();
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 150;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.JustUpdateDeviceLine();
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblPermisosAplicacion (")));
 BA.debugLineNum = 152;BA.debugLine="sbCrearTabla.Append(\"IDLin INTEGER,\")";
Debug.JustUpdateDeviceLine();
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDLin INTEGER,")));
 BA.debugLineNum = 153;BA.debugLine="sbCrearTabla.Append(\"Aplicacion TEXT COLLATE NOCA";
Debug.JustUpdateDeviceLine();
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Aplicacion TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 154;BA.debugLine="sbCrearTabla.Append(\"OS TEXT COLLATE NOCASE,\")";
Debug.JustUpdateDeviceLine();
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("OS TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 155;BA.debugLine="sbCrearTabla.Append(\"IDUsuario TEXT COLLATE NOCAS";
Debug.JustUpdateDeviceLine();
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDUsuario TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 156;BA.debugLine="sbCrearTabla.Append(\"ObjetoPermiso TEXT COLLATE N";
Debug.JustUpdateDeviceLine();
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ObjetoPermiso TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 157;BA.debugLine="sbCrearTabla.Append(\"TipoPermiso TEXT COLLATE NOC";
Debug.JustUpdateDeviceLine();
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TipoPermiso TEXT COLLATE NOCASE)")));
 BA.debugLineNum = 158;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editarpermiso(RemoteObject __ref,RemoteObject _mdata) throws Exception{
try {
		Debug.PushSubsStack("EditarPermiso (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("editarpermiso")) { return __ref.runUserSub(false, "cpermisosaplicacion","editarpermiso", __ref, _mdata);}
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 238;BA.debugLine="Sub EditarPermiso(mData As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 239;BA.debugLine="jFReg.Initialize(Me,\"jFReg\",frm,\"Editar Permiso\",";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("jFReg")),(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Editar Permiso")),(Object)(BA.ObjectToString("Editar")),(Object)(BA.ObjectToString("PermisosAplicacionEdicionFormRegistro.json")),(Object)(_mdata));
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _eliminarpermiso(RemoteObject __ref,RemoteObject _mdata) throws Exception{
try {
		Debug.PushSubsStack("EliminarPermiso (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("eliminarpermiso")) { __ref.runUserSub(false, "cpermisosaplicacion","eliminarpermiso", __ref, _mdata); return;}
ResumableSub_EliminarPermiso rsub = new ResumableSub_EliminarPermiso(null,__ref,_mdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EliminarPermiso extends BA.ResumableSub {
public ResumableSub_EliminarPermiso(b4j.docU.cpermisosaplicacion parent,RemoteObject __ref,RemoteObject _mdata) {
this.parent = parent;
this.__ref = __ref;
this._mdata = _mdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cpermisosaplicacion parent;
RemoteObject _mdata;
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _idlin = RemoteObject.createImmutable(0);
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EliminarPermiso (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,243);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 244;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 245;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 246;BA.debugLine="For Each k As String In mData.Keys";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 4;
group3 = _mdata.runMethod(false,"Keys");
index3 = 0;
groupLen3 = group3.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 4;
if (index3 < groupLen3) {
this.state = 3;
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);}
if (true) break;

case 18:
//C
this.state = 17;
index3++;
Debug.locals.put("k", _k);
if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 247;BA.debugLine="sb.Append(k).Append(\": \").Append(mData.Get(k)).A";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_k)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(": "))).runMethod(false,"Append",(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((_k)))))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 249;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Eliminar e";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Eliminar el registro de permiso seleccionado?"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sb.runMethod(true,"ToString"))),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 250;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "eliminarpermiso"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 5;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 251;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 252;BA.debugLine="Dim IDLin As Int=mData.Get(\"IDLin\")";
Debug.JustUpdateDeviceLine();
_idlin = BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDLin")))));Debug.locals.put("IDLin", _idlin);Debug.locals.put("IDLin", _idlin);
 BA.debugLineNum = 254;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eli";
Debug.JustUpdateDeviceLine();
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("EliminarPermisoAplicacion")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_idlin)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 256;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)})))),(Object)(__ref));
 BA.debugLineNum = 257;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "eliminarpermiso"), null);
this.state = 20;
return;
case 20:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 258;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTable";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursordefaulthabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 259;BA.debugLine="If result=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result,parent.__c.getField(true,"False"))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 260;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query EliminarPermisoAplicacion")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 261;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "eliminarpermiso"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 263;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Registro elim";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Registro eliminado.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 264;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "eliminarpermiso"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 BA.debugLineNum = 265;BA.debugLine="ActualizarDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_actualizardatos" /*void*/ );
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("frm_CloseRequest (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cpermisosaplicacion","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 119;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("Initialize (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cpermisosaplicacion","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { return __ref.runUserSub(false, "cpermisosaplicacion","jamtableview1_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 123;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="SalirModulo";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("jamtableview1_contextmenuitem_action")) { return __ref.runUserSub(false, "cpermisosaplicacion","jamtableview1_contextmenuitem_action", __ref, _tagmenuitem);}
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _mdreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 199;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 200;BA.debugLine="Select Case TagMenuItem";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("EditarPermiso"),BA.ObjectToString("EliminarPermiso"),BA.ObjectToString("CopiarPermisoOtroUsuario"),BA.ObjectToString("CopiarTodosPermisosAplicacionOtroUsuario"),BA.ObjectToString("CopiarTodosPermisosTodasAplicacionesOtroUsuario"))) {
case 0: {
 BA.debugLineNum = 202;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.JustUpdateDeviceLine();
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 203;BA.debugLine="Dim mDReg As Map=jamTableView1.DatosPKRegistroI";
Debug.JustUpdateDeviceLine();
_mdreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdreg = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datospkregistroindicefila" /*RemoteObject*/ ,(Object)(_filasel));Debug.locals.put("mDReg", _mdreg);Debug.locals.put("mDReg", _mdreg);
 BA.debugLineNum = 204;BA.debugLine="Log(mDReg)";
Debug.JustUpdateDeviceLine();
cpermisosaplicacion.__c.runVoidMethod ("LogImpl","9158662661",BA.ObjectToString(_mdreg),0);
 BA.debugLineNum = 205;BA.debugLine="EditarPermiso(mDReg)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_editarpermiso" /*RemoteObject*/ ,(Object)(_mdreg));
 break; }
case 1: {
 BA.debugLineNum = 207;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.JustUpdateDeviceLine();
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 208;BA.debugLine="Dim mDReg As Map=jamTableView1.DatosPKRegistroI";
Debug.JustUpdateDeviceLine();
_mdreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdreg = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datospkregistroindicefila" /*RemoteObject*/ ,(Object)(_filasel));Debug.locals.put("mDReg", _mdreg);Debug.locals.put("mDReg", _mdreg);
 BA.debugLineNum = 209;BA.debugLine="Log(mDReg)";
Debug.JustUpdateDeviceLine();
cpermisosaplicacion.__c.runVoidMethod ("LogImpl","9158662666",BA.ObjectToString(_mdreg),0);
 BA.debugLineNum = 210;BA.debugLine="EliminarPermiso(mDReg)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_eliminarpermiso" /*void*/ ,(Object)(_mdreg));
 break; }
case 2: {
 BA.debugLineNum = 213;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.JustUpdateDeviceLine();
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 214;BA.debugLine="Dim mDReg As Map=jamTableView1.DatosPKRegistroI";
Debug.JustUpdateDeviceLine();
_mdreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdreg = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datospkregistroindicefila" /*RemoteObject*/ ,(Object)(_filasel));Debug.locals.put("mDReg", _mdreg);Debug.locals.put("mDReg", _mdreg);
 BA.debugLineNum = 215;BA.debugLine="Log(mDReg)";
Debug.JustUpdateDeviceLine();
cpermisosaplicacion.__c.runVoidMethod ("LogImpl","9158662672",BA.ObjectToString(_mdreg),0);
 BA.debugLineNum = 216;BA.debugLine="CopiarPermisoOtroUsuario(mDReg)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_copiarpermisootrousuario" /*RemoteObject*/ ,(Object)(_mdreg));
 break; }
case 3: {
 BA.debugLineNum = 219;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.JustUpdateDeviceLine();
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 220;BA.debugLine="Dim mDReg As Map=jamTableView1.DatosPKRegistroI";
Debug.JustUpdateDeviceLine();
_mdreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdreg = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datospkregistroindicefila" /*RemoteObject*/ ,(Object)(_filasel));Debug.locals.put("mDReg", _mdreg);Debug.locals.put("mDReg", _mdreg);
 BA.debugLineNum = 221;BA.debugLine="Log(mDReg)";
Debug.JustUpdateDeviceLine();
cpermisosaplicacion.__c.runVoidMethod ("LogImpl","9158662678",BA.ObjectToString(_mdreg),0);
 BA.debugLineNum = 222;BA.debugLine="CopiarTodosPermisosAplicacionOtroUsuario(mDReg)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_copiartodospermisosaplicacionotrousuario" /*void*/ ,(Object)(BA.ObjectToString(_mdreg)));
 break; }
case 4: {
 BA.debugLineNum = 224;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.JustUpdateDeviceLine();
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 225;BA.debugLine="Dim mDReg As Map=jamTableView1.DatosPKRegistroI";
Debug.JustUpdateDeviceLine();
_mdreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdreg = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datospkregistroindicefila" /*RemoteObject*/ ,(Object)(_filasel));Debug.locals.put("mDReg", _mdreg);Debug.locals.put("mDReg", _mdreg);
 BA.debugLineNum = 226;BA.debugLine="Log(mDReg)";
Debug.JustUpdateDeviceLine();
cpermisosaplicacion.__c.runVoidMethod ("LogImpl","9158662683",BA.ObjectToString(_mdreg),0);
 BA.debugLineNum = 227;BA.debugLine="CopiarPermisoOtroUsuario(mDReg)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_copiarpermisootrousuario" /*RemoteObject*/ ,(Object)(_mdreg));
 break; }
}
;
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { return __ref.runUserSub(false, "cpermisosaplicacion","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem);}
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 231;BA.debugLine="Sub jamTableView1_MenuBarMenuItem_Action(TagMenuIt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 232;BA.debugLine="Select Case TagMenuItem";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("NuevoPermiso"))) {
case 0: {
 BA.debugLineNum = 234;BA.debugLine="NuevoPermiso";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_nuevopermiso" /*RemoteObject*/ );
 break; }
}
;
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jfreg_grabaredicionregistro(RemoteObject __ref,RemoteObject _lstinfocampojamformregistro) throws Exception{
try {
		Debug.PushSubsStack("jFReg_GrabarEdicionRegistro (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,395);
if (RapidSub.canDelegate("jfreg_grabaredicionregistro")) { __ref.runUserSub(false, "cpermisosaplicacion","jfreg_grabaredicionregistro", __ref, _lstinfocampojamformregistro); return;}
ResumableSub_jFReg_GrabarEdicionRegistro rsub = new ResumableSub_jFReg_GrabarEdicionRegistro(null,__ref,_lstinfocampojamformregistro);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jFReg_GrabarEdicionRegistro extends BA.ResumableSub {
public ResumableSub_jFReg_GrabarEdicionRegistro(b4j.docU.cpermisosaplicacion parent,RemoteObject __ref,RemoteObject _lstinfocampojamformregistro) {
this.parent = parent;
this.__ref = __ref;
this._lstinfocampojamformregistro = _lstinfocampojamformregistro;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cpermisosaplicacion parent;
RemoteObject _lstinfocampojamformregistro;
RemoteObject _idlin = RemoteObject.createImmutable(0);
RemoteObject _aplicacion = RemoteObject.createImmutable("");
RemoteObject _os = RemoteObject.createImmutable("");
RemoteObject _idusuario = RemoteObject.createImmutable("");
RemoteObject _objetopermiso = RemoteObject.createImmutable("");
RemoteObject _tipopermiso = RemoteObject.createImmutable("");
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jFReg_GrabarEdicionRegistro (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,395);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("lstInfoCampoJamFormRegistro", _lstinfocampojamformregistro);
 BA.debugLineNum = 396;BA.debugLine="Dim IDLin As Int=jFReg.DatosCampoSeleccionado(\"ID";
Debug.JustUpdateDeviceLine();
_idlin = BA.numberCast(int.class, __ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("IDLin"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("IDLin", _idlin);Debug.locals.put("IDLin", _idlin);
 BA.debugLineNum = 397;BA.debugLine="Dim Aplicacion As String=jFReg.DatosCampoSeleccio";
Debug.JustUpdateDeviceLine();
_aplicacion = BA.ObjectToString(__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Aplicacion"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("Aplicacion", _aplicacion);Debug.locals.put("Aplicacion", _aplicacion);
 BA.debugLineNum = 398;BA.debugLine="Dim OS As String=jFReg.DatosCampoSeleccionado(\"OS";
Debug.JustUpdateDeviceLine();
_os = BA.ObjectToString(__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("OS"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("OS", _os);Debug.locals.put("OS", _os);
 BA.debugLineNum = 399;BA.debugLine="Dim IDUsuario As String=jFReg.DatosCampoSeleccion";
Debug.JustUpdateDeviceLine();
_idusuario = BA.ObjectToString(__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("IDUsuario"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("IDUsuario", _idusuario);Debug.locals.put("IDUsuario", _idusuario);
 BA.debugLineNum = 400;BA.debugLine="Dim ObjetoPermiso As String=jFReg.DatosCampoSelec";
Debug.JustUpdateDeviceLine();
_objetopermiso = BA.ObjectToString(__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ObjetoPermiso"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("ObjetoPermiso", _objetopermiso);Debug.locals.put("ObjetoPermiso", _objetopermiso);
 BA.debugLineNum = 401;BA.debugLine="Dim TipoPermiso As String=jFReg.DatosCampoSelecci";
Debug.JustUpdateDeviceLine();
_tipopermiso = BA.ObjectToString(__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("TipoPermiso"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("TipoPermiso", _tipopermiso);Debug.locals.put("TipoPermiso", _tipopermiso);
 BA.debugLineNum = 402;BA.debugLine="jamTableView1.SetMouseCursorWaitDeshabilitarTable";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursorwaitdeshabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 403;BA.debugLine="Dim lstCommands As List";
Debug.JustUpdateDeviceLine();
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 404;BA.debugLine="lstCommands.Initialize";
Debug.JustUpdateDeviceLine();
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 405;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Edi";
Debug.JustUpdateDeviceLine();
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("EditarPermisoAplicacion")),(Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_aplicacion),(_os),(_idusuario),(_objetopermiso),(_tipopermiso),(_idlin)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 406;BA.debugLine="lstCommands.Add(cmd)";
Debug.JustUpdateDeviceLine();
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 407;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 408;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "jfreg_grabaredicionregistro"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 409;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTable";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursordefaulthabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 410;BA.debugLine="If result=False Then";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 411;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query EditarPermisoAplicacion")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 412;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "jfreg_grabaredicionregistro"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 414;BA.debugLine="jFReg.CerrarFormRegistro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_cerrarformregistro" /*RemoteObject*/ );
 BA.debugLineNum = 415;BA.debugLine="ActualizarDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_actualizardatos" /*void*/ );
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _jfreg_grabarnuevoregistro(RemoteObject __ref,RemoteObject _lstdatoscamposregistronuevo) throws Exception{
try {
		Debug.PushSubsStack("jFReg_GrabarNuevoRegistro (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,420);
if (RapidSub.canDelegate("jfreg_grabarnuevoregistro")) { __ref.runUserSub(false, "cpermisosaplicacion","jfreg_grabarnuevoregistro", __ref, _lstdatoscamposregistronuevo); return;}
ResumableSub_jFReg_GrabarNuevoRegistro rsub = new ResumableSub_jFReg_GrabarNuevoRegistro(null,__ref,_lstdatoscamposregistronuevo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jFReg_GrabarNuevoRegistro extends BA.ResumableSub {
public ResumableSub_jFReg_GrabarNuevoRegistro(b4j.docU.cpermisosaplicacion parent,RemoteObject __ref,RemoteObject _lstdatoscamposregistronuevo) {
this.parent = parent;
this.__ref = __ref;
this._lstdatoscamposregistronuevo = _lstdatoscamposregistronuevo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cpermisosaplicacion parent;
RemoteObject _lstdatoscamposregistronuevo;
RemoteObject _aplicacion = RemoteObject.createImmutable("");
RemoteObject _os = RemoteObject.createImmutable("");
RemoteObject _idusuario = RemoteObject.createImmutable("");
RemoteObject _objetopermiso = RemoteObject.createImmutable("");
RemoteObject _tipopermiso = RemoteObject.createImmutable("");
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jFReg_GrabarNuevoRegistro (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,420);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("lstDatosCamposRegistroNuevo", _lstdatoscamposregistronuevo);
 BA.debugLineNum = 421;BA.debugLine="Dim Aplicacion As String=jFReg.DatosCampoSeleccio";
Debug.JustUpdateDeviceLine();
_aplicacion = BA.ObjectToString(__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Aplicacion"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("Aplicacion", _aplicacion);Debug.locals.put("Aplicacion", _aplicacion);
 BA.debugLineNum = 422;BA.debugLine="Dim OS As String=jFReg.DatosCampoSeleccionado(\"OS";
Debug.JustUpdateDeviceLine();
_os = BA.ObjectToString(__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("OS"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("OS", _os);Debug.locals.put("OS", _os);
 BA.debugLineNum = 423;BA.debugLine="Dim IDUsuario As String=jFReg.DatosCampoSeleccion";
Debug.JustUpdateDeviceLine();
_idusuario = BA.ObjectToString(__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("IDUsuario"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("IDUsuario", _idusuario);Debug.locals.put("IDUsuario", _idusuario);
 BA.debugLineNum = 424;BA.debugLine="Dim ObjetoPermiso As String=jFReg.DatosCampoSelec";
Debug.JustUpdateDeviceLine();
_objetopermiso = BA.ObjectToString(__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ObjetoPermiso"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("ObjetoPermiso", _objetopermiso);Debug.locals.put("ObjetoPermiso", _objetopermiso);
 BA.debugLineNum = 425;BA.debugLine="Dim TipoPermiso As String=jFReg.DatosCampoSelecci";
Debug.JustUpdateDeviceLine();
_tipopermiso = BA.ObjectToString(__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("TipoPermiso"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("TipoPermiso", _tipopermiso);Debug.locals.put("TipoPermiso", _tipopermiso);
 BA.debugLineNum = 426;BA.debugLine="jamTableView1.SetMouseCursorWaitDeshabilitarTable";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursorwaitdeshabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 427;BA.debugLine="Dim lstCommands As List";
Debug.JustUpdateDeviceLine();
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 428;BA.debugLine="lstCommands.Initialize";
Debug.JustUpdateDeviceLine();
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 429;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Nue";
Debug.JustUpdateDeviceLine();
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("NuevoPermisoAplicacion")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_aplicacion),(_os),(_idusuario),(_objetopermiso),(_tipopermiso)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 430;BA.debugLine="lstCommands.Add(cmd)";
Debug.JustUpdateDeviceLine();
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 431;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 432;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "jfreg_grabarnuevoregistro"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 433;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTable";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursordefaulthabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 434;BA.debugLine="If result=False Then";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 435;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query NuevoPermisoAplicacion")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 436;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "jfreg_grabarnuevoregistro"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 438;BA.debugLine="jFReg.CerrarFormRegistro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_cerrarformregistro" /*RemoteObject*/ );
 BA.debugLineNum = 439;BA.debugLine="ActualizarDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_actualizardatos" /*void*/ );
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 441;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _nuevopermiso(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NuevoPermiso (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("nuevopermiso")) { return __ref.runUserSub(false, "cpermisosaplicacion","nuevopermiso", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 387;BA.debugLine="Sub NuevoPermiso";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 388;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 389;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 390;BA.debugLine="m.Put(\"Aplicacion\",Main.NombreAplicacion)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Aplicacion"))),(Object)((cpermisosaplicacion._main._nombreaplicacion /*RemoteObject*/ )));
 BA.debugLineNum = 391;BA.debugLine="m.Put(\"OS\",\"Windows\")";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("OS"))),(Object)((RemoteObject.createImmutable("Windows"))));
 BA.debugLineNum = 392;BA.debugLine="jFReg.Initialize(Me,\"jFReg\",frm,\"Nuevo Permiso\",\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jfreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("jFReg")),(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Nuevo Permiso")),(Object)(BA.ObjectToString("Nuevo")),(Object)(BA.ObjectToString("PermisosAplicacionEdicionFormRegistro.json")),(Object)(_m));
 BA.debugLineNum = 393;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("SalirModulo (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cpermisosaplicacion","salirmodulo", __ref);}
 BA.debugLineNum = 133;BA.debugLine="private Sub SalirModulo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="frm.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("Show (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cpermisosaplicacion","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cpermisosaplicacion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cpermisosaplicacion parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cpermisosaplicacion) ","cpermisosaplicacion",89,__ref.getField(false, "ba"),__ref,25);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 27;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 28;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.JustUpdateDeviceLine();
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 29;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.JustUpdateDeviceLine();
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 30;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.JustUpdateDeviceLine();
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 31;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets,\"key-perso";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("key-person32.png"))).getObject()));
 BA.debugLineNum = 32;BA.debugLine="frm.RootPane.LoadLayout(\"scrPermisosAplicacion\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrPermisosAplicacion")));
 BA.debugLineNum = 33;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "show"),BA.numberCast(int.class, 0));
this.state = 10;
return;
case 10:
//C
this.state = 1;
;
 BA.debugLineNum = 36;BA.debugLine="frm.Title=\"Permisos aplicacion\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",BA.ObjectToString("Permisos aplicacion"));
 BA.debugLineNum = 38;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 40;BA.debugLine="frm.Show";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 45;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 47;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 48;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Editar Permiso")),(Object)(BA.ObjectToString("EditarPermiso")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf044)))))));
 BA.debugLineNum = 49;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Eliminar Permiso")),(Object)(BA.ObjectToString("EliminarPermiso")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf014)))))));
 BA.debugLineNum = 50;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Copiar Permiso a Otro Usuario")),(Object)(BA.ObjectToString("CopiarPermisoOtroUsuario")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0c5)))))));
 BA.debugLineNum = 51;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Copiar Todos Permisos Aplicacion a Otro Usuario")),(Object)(BA.ObjectToString("CopiarTodosPermisosAplicacionOtroUsuario")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0c5)))))));
 BA.debugLineNum = 52;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Copiar Todos Permisos Todas Aplicaciones a Otro Usuario")),(Object)(BA.ObjectToString("CopiarTodosPermisosTodasAplicacionesOtroUsuario")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0c5)))))));
 BA.debugLineNum = 54;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Nuevo Permiso")),(Object)(BA.ObjectToString("NuevoPermiso")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf196)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 57;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaPermisosAplicacion.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 58;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "show"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 59;BA.debugLine="Log(mRes)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9158138402",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 60;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 61;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 62;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cpermisosaplicacion", "show"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 4;
;
 BA.debugLineNum = 63;BA.debugLine="frm.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 64;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 68;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.JustUpdateDeviceLine();

case 4:
//if
this.state = 9;
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("Close");
if (true) break;

case 9:
//C
this.state = -1;
;
 BA.debugLineNum = 70;BA.debugLine="mSQL.InitializeSQLite(Main.UserFolder, Main.Nombr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(parent._main._userfolder /*RemoteObject*/ ),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 72;BA.debugLine="CreacionTablasSQLite";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="ActualizarDatos";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.cpermisosaplicacion.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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