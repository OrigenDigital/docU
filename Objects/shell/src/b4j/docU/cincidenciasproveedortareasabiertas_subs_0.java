package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cincidenciasproveedortareasabiertas_subs_0 {


public static RemoteObject  _abrirfichaincidenciaproveedor(RemoteObject __ref,RemoteObject _idincprovsel,RemoteObject _incprov) throws Exception{
try {
		Debug.PushSubsStack("AbrirFichaIncidenciaProveedor (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,299);
if (RapidSub.canDelegate("abrirfichaincidenciaproveedor")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","abrirfichaincidenciaproveedor", __ref, _idincprovsel, _incprov);}
RemoteObject _cfichaincprov = RemoteObject.declareNull("b4j.docU.cincidenciaproveedorficha");
Debug.locals.put("IDIncProvSel", _idincprovsel);
Debug.locals.put("IncProv", _incprov);
 BA.debugLineNum = 299;BA.debugLine="Sub AbrirFichaIncidenciaProveedor(IDIncProvSel As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 300;BA.debugLine="Dim cFichaIncProv As cIncidenciaProveedorFicha";
Debug.ShouldStop(2048);
_cfichaincprov = RemoteObject.createNew ("b4j.docU.cincidenciaproveedorficha");Debug.locals.put("cFichaIncProv", _cfichaincprov);
 BA.debugLineNum = 301;BA.debugLine="cFichaIncProv.Initialize(IDIncProvSel, IncProv)";
Debug.ShouldStop(4096);
_cfichaincprov.runClassMethod (b4j.docU.cincidenciaproveedorficha.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_idincprovsel),(Object)(_incprov));
 BA.debugLineNum = 302;BA.debugLine="cFichaIncProv.DepartamentoEmisor=DepartamentoEmis";
Debug.ShouldStop(8192);
_cfichaincprov.setField ("_departamentoemisor" /*RemoteObject*/ ,__ref.getField(true,"_departamentoemisor" /*RemoteObject*/ ));
 BA.debugLineNum = 303;BA.debugLine="cFichaIncProv.Show";
Debug.ShouldStop(16384);
_cfichaincprov.runClassMethod (b4j.docU.cincidenciaproveedorficha.class, "_show" /*void*/ );
 BA.debugLineNum = 304;BA.debugLine="frm.Close";
Debug.ShouldStop(32768);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("actualizardatos")) { __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","actualizardatos", __ref); return;}
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
public ResumableSub_ActualizarDatos(b4j.docU.cincidenciasproveedortareasabiertas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cincidenciasproveedortareasabiertas parent;
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
		Debug.PushSubsStack("ActualizarDatos (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,111);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 115;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando datos lista tareas pendientes incidencias proveedor...")));
 BA.debugLineNum = 116;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 117;BA.debugLine="Wait For(ActualizarDatosLista) complete (mRes As";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "actualizardatos"), __ref.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_actualizardatoslista" /*RemoteObject*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 118;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 119;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 120;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 121;BA.debugLine="SalirModulo";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 130;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(2);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblIncidenciasProveedorListaTareasPendientes")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 131;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(4);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 132;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "actualizardatos"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 133;BA.debugLine="rs.Close";
Debug.ShouldStop(16);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 134;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 135;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 136;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 137;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 138;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "actualizardatos"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
 BA.debugLineNum = 140;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 141;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "actualizardatos"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 142;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 143;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 144;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 147;BA.debugLine="ExitApplication";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 149;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(1048576);

case 15:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 150;BA.debugLine="If True<>mResultSetData.Get(\"ListaVacia\") Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 151;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 152;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "actualizardatos"), _msa);
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
 BA.debugLineNum = 154;BA.debugLine="jamTableView1.SetPlaceholderText(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setplaceholdertext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
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
 BA.debugLineNum = 164;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizardatoslista(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosLista (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("actualizardatoslista")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","actualizardatoslista", __ref);}
ResumableSub_ActualizarDatosLista rsub = new ResumableSub_ActualizarDatosLista(null,__ref);
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
public static class ResumableSub_ActualizarDatosLista extends BA.ResumableSub {
public ResumableSub_ActualizarDatosLista(b4j.docU.cincidenciasproveedortareasabiertas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cincidenciasproveedortareasabiertas parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosLista (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,180);
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
 BA.debugLineNum = 182;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblIncidenciasProv";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblIncidenciasProveedorListaTareasPendientes")));
 BA.debugLineNum = 184;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(8388608);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 185;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(16777216);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 186;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 188;BA.debugLine="Dim Comando As String=\"IncidenciasProveedorTareas";
Debug.ShouldStop(134217728);
_comando = BA.ObjectToString("IncidenciasProveedorTareasPendientes");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 189;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(268435456);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 191;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "actualizardatoslista"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 193;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 194;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 196;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "actualizardatoslista"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 197;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 198;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 201;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 202;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(512);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 203;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay tarea";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay tareas de incidencias de proveedor pendientes.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 204;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "actualizardatoslista"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 205;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 206;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 208;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(32768);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 212;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 213;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 215;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(4194304);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblIncidenciasProveedorListaTareasPendientes")),(Object)(_lstreg));
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
 BA.debugLineNum = 218;BA.debugLine="Return mRes";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 219;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _asjo(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("asJO (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 92;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Return o";
Debug.ShouldStop(268435456);
if (true) return _o;
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("btnSalir_Click (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","btnsalir_click", __ref);}
 BA.debugLineNum = 101;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="SalirModulo";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargadatoscabeceraincidencia(RemoteObject __ref,RemoteObject _idincsel,RemoteObject _incidenciaproveedorsel) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosCabeceraIncidencia (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("cargadatoscabeceraincidencia")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","cargadatoscabeceraincidencia", __ref, _idincsel, _incidenciaproveedorsel);}
ResumableSub_CargaDatosCabeceraIncidencia rsub = new ResumableSub_CargaDatosCabeceraIncidencia(null,__ref,_idincsel,_incidenciaproveedorsel);
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
public static class ResumableSub_CargaDatosCabeceraIncidencia extends BA.ResumableSub {
public ResumableSub_CargaDatosCabeceraIncidencia(b4j.docU.cincidenciasproveedortareasabiertas parent,RemoteObject __ref,RemoteObject _idincsel,RemoteObject _incidenciaproveedorsel) {
this.parent = parent;
this.__ref = __ref;
this._idincsel = _idincsel;
this._incidenciaproveedorsel = _incidenciaproveedorsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cincidenciasproveedortareasabiertas parent;
RemoteObject _idincsel;
RemoteObject _incidenciaproveedorsel;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosCabeceraIncidencia (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,352);
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
Debug.locals.put("IDIncSel", _idincsel);
Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);
 BA.debugLineNum = 354;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 355;BA.debugLine="Dim mData0 As Map";
Debug.ShouldStop(4);
_mdata0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mData0", _mdata0);
 BA.debugLineNum = 356;BA.debugLine="mData0.Initialize";
Debug.ShouldStop(8);
_mdata0.runVoidMethod ("Initialize");
 BA.debugLineNum = 357;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(16);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 358;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 359;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 360;BA.debugLine="mRes.Put(\"mData0\",mData0)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mData0"))),(Object)((_mdata0.getObject())));
 BA.debugLineNum = 361;BA.debugLine="Dim Comando As String=\"IncidenciasProveedorDatosC";
Debug.ShouldStop(256);
_comando = BA.ObjectToString("IncidenciasProveedorDatosCabeceraIncidencia");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 362;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(512);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_idincsel)})),(Object)(__ref));
 BA.debugLineNum = 364;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "cargadatoscabeceraincidencia"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 366;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 367;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 368;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 369;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "cargadatoscabeceraincidencia"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 370;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 371;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 374;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 375;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 376;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe l";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No existe la incidencia seleccionada ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_incidenciaproveedorsel))),RemoteObject.createImmutable(")")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 377;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "cargadatoscabeceraincidencia"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 378;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 379;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 381;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(268435456);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 382;BA.debugLine="mData0=lstReg.Get(0)";
Debug.ShouldStop(536870912);
_mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData0", _mdata0);
 BA.debugLineNum = 383;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 384;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 385;BA.debugLine="mRes.Put(\"mData0\", mData0)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mData0"))),(Object)((_mdata0.getObject())));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
cincidenciasproveedortareasabiertas._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cincidenciasproveedortareasabiertas._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cincidenciasproveedortareasabiertas._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cincidenciasproveedortareasabiertas._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private frm As Form";
cincidenciasproveedortareasabiertas._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cincidenciasproveedortareasabiertas._frm);
 //BA.debugLineNum = 9;BA.debugLine="Private btnSalir As Button";
cincidenciasproveedortareasabiertas._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",cincidenciasproveedortareasabiertas._btnsalir);
 //BA.debugLineNum = 10;BA.debugLine="Private jamTableView1 As jamTableView";
cincidenciasproveedortareasabiertas._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",cincidenciasproveedortareasabiertas._jamtableview1);
 //BA.debugLineNum = 12;BA.debugLine="Dim Dialog As B4XDialog";
cincidenciasproveedortareasabiertas._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cincidenciasproveedortareasabiertas._dialog);
 //BA.debugLineNum = 13;BA.debugLine="Dim mSQL As SQL";
cincidenciasproveedortareasabiertas._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cincidenciasproveedortareasabiertas._msql);
 //BA.debugLineNum = 15;BA.debugLine="Public PermisoModuloUsuario As String";
cincidenciasproveedortareasabiertas._permisomodulousuario = RemoteObject.createImmutable("");__ref.setField("_permisomodulousuario",cincidenciasproveedortareasabiertas._permisomodulousuario);
 //BA.debugLineNum = 16;BA.debugLine="Public DepartamentoEmisor As String";
cincidenciasproveedortareasabiertas._departamentoemisor = RemoteObject.createImmutable("");__ref.setField("_departamentoemisor",cincidenciasproveedortareasabiertas._departamentoemisor);
 //BA.debugLineNum = 19;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
cincidenciasproveedortareasabiertas._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cincidenciasproveedortareasabiertas._jamloadingindicator1);
 //BA.debugLineNum = 20;BA.debugLine="Private TextAreaDialog As TextArea";
cincidenciasproveedortareasabiertas._textareadialog = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_textareadialog",cincidenciasproveedortareasabiertas._textareadialog);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","creaciontablassqlite", __ref);}
RemoteObject _screartabla = RemoteObject.createImmutable("");
 BA.debugLineNum = 168;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(128);
 BA.debugLineNum = 170;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblIncide";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblIncidenciasProveedorListaTareasPendientes")));
 BA.debugLineNum = 171;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
Debug.ShouldStop(1024);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS [tblIncidenciasProveedorListaTareasPendientes] ([IDTarea] INTEGER\n"),RemoteObject.createImmutable("	, [IDIncidenciaProveedor] INTEGER, [IncidenciaProveedor] TEXT, [FechaTarea] INTEGER, [DepartamentoAsignadoTarea] TEXT\n"),RemoteObject.createImmutable("	, [Proveedor] TEXT, [NombreProveedor] TEXT, [DescripcionIncidencia] TEXT, [UsuarioCreacionTarea] TEXT, [DescripcionTarea] TEXT)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 174;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("frm_CloseRequest (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 97;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="EventData.Consume";
Debug.ShouldStop(2);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Initialize (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(cincidenciasproveedortareasabiertas._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(cincidenciasproveedortareasabiertas.__c.getField(true,"True")));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","jamtableview1_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 223;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="SalirModulo";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("jamTableView1_CellDobleClick (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("jamtableview1_celldobleclick")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","jamtableview1_celldobleclick", __ref, _datosceldaseleccionada);}
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _idincidenciaproveedorsel = RemoteObject.createImmutable(0);
RemoteObject _incidenciaproveedorsel = RemoteObject.createImmutable("");
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 269;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="Dim FilaSel As Int=DatosCeldaSeleccionada.Fila";
Debug.ShouldStop(8192);
_filasel = _datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 271;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaSel";
Debug.ShouldStop(16384);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 272;BA.debugLine="Dim IDIncidenciaProveedorSel As Int=jamTableView1";
Debug.ShouldStop(32768);
_idincidenciaproveedorsel = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IDIncidenciaProveedor"))));Debug.locals.put("IDIncidenciaProveedorSel", _idincidenciaproveedorsel);Debug.locals.put("IDIncidenciaProveedorSel", _idincidenciaproveedorsel);
 BA.debugLineNum = 273;BA.debugLine="Dim IncidenciaProveedorSel As String=jamTableView";
Debug.ShouldStop(65536);
_incidenciaproveedorsel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IncidenciaProveedor"))));Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);
 BA.debugLineNum = 275;BA.debugLine="AbrirFichaIncidenciaProveedor(IDIncidenciaProveed";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_abrirfichaincidenciaproveedor" /*RemoteObject*/ ,(Object)(_idincidenciaproveedorsel),(Object)(_incidenciaproveedorsel));
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("jamtableview1_contextmenuitem_action")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","jamtableview1_contextmenuitem_action", __ref, _tagmenuitem);}
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _idincidenciaproveedorsel = RemoteObject.createImmutable(0);
RemoteObject _incidenciaproveedorsel = RemoteObject.createImmutable("");
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 237;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("FichaIncidenciaProveedor"),BA.ObjectToString("VerDescripcionIncidencia"))) {
case 0: {
 BA.debugLineNum = 240;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.ShouldStop(32768);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 241;BA.debugLine="Dim IDIncidenciaProveedorSel As Int=jamTableVie";
Debug.ShouldStop(65536);
_idincidenciaproveedorsel = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IDIncidenciaProveedor"))));Debug.locals.put("IDIncidenciaProveedorSel", _idincidenciaproveedorsel);Debug.locals.put("IDIncidenciaProveedorSel", _idincidenciaproveedorsel);
 BA.debugLineNum = 242;BA.debugLine="Dim IncidenciaProveedorSel As String=jamTableVi";
Debug.ShouldStop(131072);
_incidenciaproveedorsel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IncidenciaProveedor"))));Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);
 BA.debugLineNum = 244;BA.debugLine="AbrirFichaIncidenciaProveedor(IDIncidenciaProve";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_abrirfichaincidenciaproveedor" /*RemoteObject*/ ,(Object)(_idincidenciaproveedorsel),(Object)(_incidenciaproveedorsel));
 break; }
case 1: {
 BA.debugLineNum = 247;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.ShouldStop(4194304);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 248;BA.debugLine="Dim IDIncidenciaProveedorSel As Int=jamTableVie";
Debug.ShouldStop(8388608);
_idincidenciaproveedorsel = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IDIncidenciaProveedor"))));Debug.locals.put("IDIncidenciaProveedorSel", _idincidenciaproveedorsel);Debug.locals.put("IDIncidenciaProveedorSel", _idincidenciaproveedorsel);
 BA.debugLineNum = 249;BA.debugLine="Dim IncidenciaProveedorSel As String=jamTableVi";
Debug.ShouldStop(16777216);
_incidenciaproveedorsel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IncidenciaProveedor"))));Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);
 BA.debugLineNum = 250;BA.debugLine="VerDecripcionIncidencia(IDIncidenciaProveedorSe";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_verdecripcionincidencia" /*void*/ ,(Object)(_idincidenciaproveedorsel),(Object)(_incidenciaproveedorsel));
 break; }
}
;
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,227);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem);}
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 227;BA.debugLine="Sub jamTableView1_MenuBarMenuItem_Action(TagMenuIt";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"))) {
case 0: {
 BA.debugLineNum = 231;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_actualizardatos" /*void*/ );
 break; }
}
;
 BA.debugLineNum = 234;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SalirModulo (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","salirmodulo", __ref);}
 BA.debugLineNum = 105;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
Debug.ShouldStop(512);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 107;BA.debugLine="frm.Close";
Debug.ShouldStop(1024);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 108;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(2048);
cincidenciasproveedortareasabiertas._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 109;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Show (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cincidenciasproveedortareasabiertas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cincidenciasproveedortareasabiertas parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,32);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 34;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
Debug.ShouldStop(2);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(4);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 37;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(16);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 38;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(32);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 39;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(64);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 41;BA.debugLine="frm.RootPane.LoadLayout(\"scrIncidenciasProveedorL";
Debug.ShouldStop(256);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrIncidenciasProveedorListaTareasPendientes")));
 BA.debugLineNum = 42;BA.debugLine="Sleep(0)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "show"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 44;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Lista Tareas";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Lista Tareas Pendientes Incidencias Proveedor")));
 BA.debugLineNum = 46;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(8192);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 47;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 52;BA.debugLine="frm.Show";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 56;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 60;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 61;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 63;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Actualizar Datos")),(Object)(BA.ObjectToString("Actualizar")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf021)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.ShouldStop(1);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ficha Incidencia Proveedor")),(Object)(BA.ObjectToString("FichaIncidenciaProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0f6)))))));
 BA.debugLineNum = 66;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ver Descripción Incidencia")),(Object)(BA.ObjectToString("VerDescripcionIncidencia")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf022)))))));
 BA.debugLineNum = 72;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(128);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaIncidenciasProveedorTareasPendientes.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 73;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 74;BA.debugLine="Log(mRes)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","832178218",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 75;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
 BA.debugLineNum = 76;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 77;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
 BA.debugLineNum = 78;BA.debugLine="frm.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 79;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 85;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaFecha(Arra";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnafecha" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("FechaTarea"))})))));
 BA.debugLineNum = 88;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 90;BA.debugLine="End Sub";
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
public static void  _verdecripcionincidencia(RemoteObject __ref,RemoteObject _idincsel,RemoteObject _incidenciaproveedorsel) throws Exception{
try {
		Debug.PushSubsStack("VerDecripcionIncidencia (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("verdecripcionincidencia")) { __ref.runUserSub(false, "cincidenciasproveedortareasabiertas","verdecripcionincidencia", __ref, _idincsel, _incidenciaproveedorsel); return;}
ResumableSub_VerDecripcionIncidencia rsub = new ResumableSub_VerDecripcionIncidencia(null,__ref,_idincsel,_incidenciaproveedorsel);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_VerDecripcionIncidencia extends BA.ResumableSub {
public ResumableSub_VerDecripcionIncidencia(b4j.docU.cincidenciasproveedortareasabiertas parent,RemoteObject __ref,RemoteObject _idincsel,RemoteObject _incidenciaproveedorsel) {
this.parent = parent;
this.__ref = __ref;
this._idincsel = _idincsel;
this._incidenciaproveedorsel = _incidenciaproveedorsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cincidenciasproveedortareasabiertas parent;
RemoteObject _idincsel;
RemoteObject _incidenciaproveedorsel;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _descripcionincidencia = RemoteObject.createImmutable("");
RemoteObject _dialogtitlebarheightant = RemoteObject.createImmutable(0);
RemoteObject _pbasetextarea = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("VerDecripcionIncidencia (cincidenciasproveedortareasabiertas) ","cincidenciasproveedortareasabiertas",9,__ref.getField(false, "ba"),__ref,307);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IDIncSel", _idincsel);
Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);
 BA.debugLineNum = 308;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 309;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 310;BA.debugLine="Wait For(CargaDatosCabeceraIncidencia(IDIncSel, I";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "verdecripcionincidencia"), __ref.runClassMethod (b4j.docU.cincidenciasproveedortareasabiertas.class, "_cargadatoscabeceraincidencia" /*RemoteObject*/ ,(Object)(_idincsel),(Object)(_incidenciaproveedorsel)));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 311;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 312;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 313;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 315;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 318;BA.debugLine="Dim mData0 As Map=mRes.Get(\"mData0\")";
Debug.ShouldStop(536870912);
_mdata0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mData0")))));Debug.locals.put("mData0", _mdata0);Debug.locals.put("mData0", _mdata0);
 BA.debugLineNum = 319;BA.debugLine="Dim DescripcionIncidencia As String=mData0.Get(\"D";
Debug.ShouldStop(1073741824);
_descripcionincidencia = BA.ObjectToString(_mdata0.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DescripcionIncidencia")))));Debug.locals.put("DescripcionIncidencia", _descripcionincidencia);Debug.locals.put("DescripcionIncidencia", _descripcionincidencia);
 BA.debugLineNum = 321;BA.debugLine="Dim DialogTitleBarHeightAnt As Int=Dialog.TitleBa";
Debug.ShouldStop(1);
_dialogtitlebarheightant = __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_titlebarheight" /*RemoteObject*/ );Debug.locals.put("DialogTitleBarHeightAnt", _dialogtitlebarheightant);Debug.locals.put("DialogTitleBarHeightAnt", _dialogtitlebarheightant);
 BA.debugLineNum = 322;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(2);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 323;BA.debugLine="Dialog.Title=$\"Descripción de la incidencia.\"$";
Debug.ShouldStop(4);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,((RemoteObject.createImmutable("Descripción de la incidencia."))));
 BA.debugLineNum = 325;BA.debugLine="Dim pBaseTextArea As B4XView = xui.CreatePanel(\"\"";
Debug.ShouldStop(16);
_pbasetextarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pbasetextarea = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pBaseTextArea", _pbasetextarea);Debug.locals.put("pBaseTextArea", _pbasetextarea);
 BA.debugLineNum = 326;BA.debugLine="pBaseTextArea.SetLayoutAnimated(0, 0, 0, 600dip,";
Debug.ShouldStop(32);
_pbasetextarea.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 327;BA.debugLine="pBaseTextArea.LoadLayout(\"scrDialogTextArea\")";
Debug.ShouldStop(64);
_pbasetextarea.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrDialogTextArea")),__ref.getField(false, "ba"));
 BA.debugLineNum = 329;BA.debugLine="TextAreaDialog.Text=DescripcionIncidencia";
Debug.ShouldStop(256);
__ref.getField(false,"_textareadialog" /*RemoteObject*/ ).runMethod(true,"setText",_descripcionincidencia);
 BA.debugLineNum = 330;BA.debugLine="TextAreaDialog.As(JavaObject).RunMethod(\"setFont\"";
Debug.ShouldStop(512);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_textareadialog" /*RemoteObject*/ ).getObject())).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFont")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12))).runMethod(false,"ToNativeFont").getObject())})));
 BA.debugLineNum = 331;BA.debugLine="TextAreaDialog.As(JavaObject).RunMethod(\"setEdita";
Debug.ShouldStop(1024);
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_textareadialog" /*RemoteObject*/ ).getObject())).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setEditable")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"False"))})));
 BA.debugLineNum = 333;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseT";
Debug.ShouldStop(4096);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_pbasetextarea),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 341;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(1048576);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 342;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(2097152);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 343;BA.debugLine="bOK.Left=5dip";
Debug.ShouldStop(4194304);
_bok.runMethod(true,"setLeft",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 BA.debugLineNum = 345;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedortareasabiertas", "verdecripcionincidencia"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = -1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 346;BA.debugLine="Dialog.TitleBarHeight=DialogTitleBarHeightAnt";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,_dialogtitlebarheightant);
 BA.debugLineNum = 349;BA.debugLine="End Sub";
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
}