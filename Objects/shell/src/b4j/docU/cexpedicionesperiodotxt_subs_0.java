package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cexpedicionesperiodotxt_subs_0 {


public static void  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("actualizardatos")) { __ref.runUserSub(false, "cexpedicionesperiodotxt","actualizardatos", __ref); return;}
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
public ResumableSub_ActualizarDatos(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _sfechadesde = RemoteObject.createImmutable("");
RemoteObject _sfechahasta = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _lstregdocsexpperiodo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _ndoc = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _micli = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _minfoexp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _refexp = RemoteObject.createImmutable("");
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject group20;
int index20;
int groupLen20;
RemoteObject group40;
int index40;
int groupLen40;
RemoteObject group49;
int index49;
int groupLen49;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,130);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 133;BA.debugLine="jamLoadingIndicator1.DuracionCiclo=1000";
Debug.ShouldStop(16);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setduracionciclo",BA.numberCast(int.class, 1000));
 BA.debugLineNum = 135;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"\"";
Debug.ShouldStop(64);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 136;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(128);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 138;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(512);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 140;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(2048);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 141;BA.debugLine="Dim SFechaDesde As String=DateTime.Date(FechaInic";
Debug.ShouldStop(4096);
_sfechadesde = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ )));Debug.locals.put("SFechaDesde", _sfechadesde);Debug.locals.put("SFechaDesde", _sfechadesde);
 BA.debugLineNum = 142;BA.debugLine="Dim SFechaHasta As String=DateTime.Date(FechaFina";
Debug.ShouldStop(8192);
_sfechahasta = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechafinallong" /*RemoteObject*/ )));Debug.locals.put("SFechaHasta", _sfechahasta);Debug.locals.put("SFechaHasta", _sfechahasta);
 BA.debugLineNum = 145;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(65536);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 147;BA.debugLine="JamTableCLV1.Clear";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 149;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblExpedicionesPer";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblExpedicionesPeriodoTXT")));
 BA.debugLineNum = 150;BA.debugLine="wait for(cmAuxTxT.ObtenerBuscarExpedicionesPeriod";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizardatos"), parent._cmauxtxt.runMethod(false,"_obtenerbuscarexpedicionesperiodotxt" /*RemoteObject*/ ,(Object)(_sfechadesde),(Object)(_sfechahasta)));
this.state = 59;
return;
case 59:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 151;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 152;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 153;BA.debugLine="SalirModulo";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 154;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 157;BA.debugLine="Dim lstRes As List=mRes.Get(\"lstRes\")";
Debug.ShouldStop(268435456);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 158;BA.debugLine="If lstRes.Size>0 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 5:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",_lstres.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 160;BA.debugLine="Dim mData As Map=lstRes.Get(0)";
Debug.ShouldStop(-2147483648);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 161;BA.debugLine="For Each k As String In mData.Keys";
Debug.ShouldStop(1);
if (true) break;

case 8:
//for
this.state = 11;
group20 = _mdata.runMethod(false,"Keys");
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 60;
if (true) break;

case 60:
//C
this.state = 11;
if (index20 < groupLen20) {
this.state = 10;
_k = BA.ObjectToString(group20.runMethod(false,"Get",index20));Debug.locals.put("k", _k);}
if (true) break;

case 61:
//C
this.state = 60;
index20++;
Debug.locals.put("k", _k);
if (true) break;

case 10:
//C
this.state = 61;
 BA.debugLineNum = 162;BA.debugLine="Log(\"\")";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","864028704",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 163;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","864028705",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)((_k)))),0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("k", _k);
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 169;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
Debug.ShouldStop(256);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblExpedicionesPeriodoTXT")),(Object)(_lstres));
 BA.debugLineNum = 189;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesPeriodo";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblExpedicionesPeriodoTXT set EstadoActual=? where  Fecha_x0020_Entrega<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("ENTREGADO")),(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 190;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesPeriodo";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblExpedicionesPeriodoTXT set Entregado=? where  Fecha_x0020_Entrega<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("SI")),(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 191;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesPeriodo";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblExpedicionesPeriodoTXT set EstadoActual=? where  Fecha_x0020_Entrega=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("PENDIENTE DE ACTUALIZAR")),(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 192;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesPeriodo";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblExpedicionesPeriodoTXT set Entregado=? where  Fecha_x0020_Entrega=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("NO")),(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 197;BA.debugLine="Dim lstRegDocsExpPeriodo As List";
Debug.ShouldStop(16);
_lstregdocsexpperiodo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegDocsExpPeriodo", _lstregdocsexpperiodo);
 BA.debugLineNum = 198;BA.debugLine="lstRegDocsExpPeriodo.Initialize";
Debug.ShouldStop(32);
_lstregdocsexpperiodo.runVoidMethod ("Initialize");
 BA.debugLineNum = 199;BA.debugLine="Wait For(DocumentosExpedicionesPeriodoBatch) comp";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizardatos"), __ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_documentosexpedicionesperiodobatch" /*RemoteObject*/ ));
this.state = 62;
return;
case 62:
//C
this.state = 13;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 200;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
Debug.ShouldStop(128);
_success = BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Success")))));Debug.locals.put("Success", _success);Debug.locals.put("Success", _success);
 BA.debugLineNum = 201;BA.debugLine="If Success Then";
Debug.ShouldStop(256);
if (true) break;

case 13:
//if
this.state = 16;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 202;BA.debugLine="Dim lstRegDocsExpPeriodo As List=mRes.Get(\"lstRe";
Debug.ShouldStop(512);
_lstregdocsexpperiodo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstregdocsexpperiodo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstRegDocsExpPeriodo", _lstregdocsexpperiodo);Debug.locals.put("lstRegDocsExpPeriodo", _lstregdocsexpperiodo);
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 205;BA.debugLine="Wait For(EliminarTablaTemporalDocumentosReferenci";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizardatos"), __ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_eliminartablatemporaldocumentosreferenciastte" /*RemoteObject*/ ));
this.state = 63;
return;
case 63:
//C
this.state = 17;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 207;BA.debugLine="If lstRegDocsExpPeriodo.Size>0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 17:
//if
this.state = 39;
if (RemoteObject.solveBoolean(">",_lstregdocsexpperiodo.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 262;BA.debugLine="Dim nDoc As Int=1";
Debug.ShouldStop(32);
_ndoc = BA.numberCast(int.class, 1);Debug.locals.put("nDoc", _ndoc);Debug.locals.put("nDoc", _ndoc);
 BA.debugLineNum = 263;BA.debugLine="For Each m As Map In lstRegDocsExpPeriodo";
Debug.ShouldStop(64);
if (true) break;

case 20:
//for
this.state = 38;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group40 = _lstregdocsexpperiodo;
index40 = 0;
groupLen40 = group40.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 64;
if (true) break;

case 64:
//C
this.state = 38;
if (index40 < groupLen40) {
this.state = 22;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group40.runMethod(false,"Get",index40));Debug.locals.put("m", _m);}
if (true) break;

case 65:
//C
this.state = 64;
index40++;
Debug.locals.put("m", _m);
if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 265;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizan";
Debug.ShouldStop(256);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",(RemoteObject.concat(RemoteObject.createImmutable("Actualizando info "),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))),RemoteObject.createImmutable(" ("),_ndoc,RemoteObject.createImmutable(" de "),_lstregdocsexpperiodo.runMethod(true,"getSize"),RemoteObject.createImmutable(") ..."))));
 BA.debugLineNum = 266;BA.debugLine="Wait For(ClienteResponsableCuentaDocumento(m.Ge";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizardatos"), __ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_clienteresponsablecuentadocumento" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))))));
this.state = 66;
return;
case 66:
//C
this.state = 23;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 267;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 268;BA.debugLine="If Accion=\"ErrConn\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("ErrConn"))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 if (true) break;
;
 BA.debugLineNum = 271;BA.debugLine="If Accion=\"OK\" Then";
Debug.ShouldStop(16384);

case 26:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("OK"))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 272;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(32768);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 273;BA.debugLine="Dim mICli As Map=lstReg.Get(0)";
Debug.ShouldStop(65536);
_micli = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_micli = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mICli", _micli);Debug.locals.put("mICli", _micli);
 BA.debugLineNum = 278;BA.debugLine="For Each mInfoExp As Map In lstRegDocsExpPerio";
Debug.ShouldStop(2097152);
if (true) break;

case 29:
//for
this.state = 36;
_minfoexp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group49 = _lstregdocsexpperiodo;
index49 = 0;
groupLen49 = group49.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mInfoExp", _minfoexp);
this.state = 67;
if (true) break;

case 67:
//C
this.state = 36;
if (index49 < groupLen49) {
this.state = 31;
_minfoexp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group49.runMethod(false,"Get",index49));Debug.locals.put("mInfoExp", _minfoexp);}
if (true) break;

case 68:
//C
this.state = 67;
index49++;
Debug.locals.put("mInfoExp", _minfoexp);
if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 279;BA.debugLine="Dim RefExp As String=mInfoExp.Get(\"Referencia";
Debug.ShouldStop(4194304);
_refexp = BA.ObjectToString(_minfoexp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReferenciaExpedicionTransporte")))));Debug.locals.put("RefExp", _refexp);Debug.locals.put("RefExp", _refexp);
 BA.debugLineNum = 280;BA.debugLine="If RefExp=m.Get(\"ReferenciaExpedicionTranspor";
Debug.ShouldStop(8388608);
if (true) break;

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_refexp,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReferenciaExpedicionTransporte"))))))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 284;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblExpedicio";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblExpedicionesPeriodoTXT set NombreCliente=?, NombreResponsableCuenta=? where Referencia_x0020_1=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {_micli.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreCliente")))),_micli.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableCuenta")))),(_refexp)})))));
 BA.debugLineNum = 285;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
this.state = 36;
if (true) break;
 if (true) break;

case 35:
//C
this.state = 68;
;
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
Debug.locals.put("mInfoExp", _minfoexp);
;
 if (true) break;

case 37:
//C
this.state = 65;
;
 BA.debugLineNum = 289;BA.debugLine="nDoc=nDoc+1";
Debug.ShouldStop(1);
_ndoc = RemoteObject.solve(new RemoteObject[] {_ndoc,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nDoc", _ndoc);
 if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 292;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBa";
Debug.ShouldStop(8);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 293;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _senderfilter);
this.state = 69;
return;
case 69:
//C
this.state = 39;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 294;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","864028836",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 if (true) break;

case 39:
//C
this.state = 40;
;
 BA.debugLineNum = 302;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 304;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(32768);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblExpedicionesPeriodoTXT order by Fecha_x0020_Alta, NExped1, Nexped2")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 305;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
Debug.ShouldStop(65536);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 306;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _rsub);
this.state = 70;
return;
case 70:
//C
this.state = 40;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 309;BA.debugLine="rs.Close";
Debug.ShouldStop(1048576);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 310;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 40:
//if
this.state = 58;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 311;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(4194304);
if (true) break;

case 43:
//if
this.state = 50;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 312;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 313;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _msa);
this.state = 71;
return;
case 71:
//C
this.state = 46;
;
 BA.debugLineNum = 315;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 316;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _msa);
this.state = 72;
return;
case 72:
//C
this.state = 46;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 317;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(268435456);
if (true) break;

case 46:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 318;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 319;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 322;BA.debugLine="ExitApplication";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 324;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(8);

case 50:
//if
this.state = 57;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 325;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then";
Debug.ShouldStop(16);
if (true) break;

case 53:
//if
this.state = 56;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 55;
}if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 326;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay expe";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay expediciones de TXT en el periodo seleccionado")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 327;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _msa);
this.state = 73;
return;
case 73:
//C
this.state = 56;
;
 BA.debugLineNum = 328;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 56:
//C
this.state = 57;
;
 BA.debugLineNum = 330;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 331;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _msa);
this.state = 74;
return;
case 74:
//C
this.state = 57;
;
 if (true) break;

case 57:
//C
this.state = 58;
;
 if (true) break;

case 58:
//C
this.state = -1;
;
 BA.debugLineNum = 336;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Datos actualiz";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Datos actualizados.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 337;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _msa);
this.state = 75;
return;
case 75:
//C
this.state = -1;
;
 BA.debugLineNum = 339;BA.debugLine="ActualizarStatusExpedicionesNoEntregadas";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_actualizarstatusexpedicionesnoentregadas" /*void*/ );
 BA.debugLineNum = 341;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _sql_nonquerycomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizarestadoexpedicion(RemoteObject __ref,RemoteObject _idxitem,RemoteObject _mdata,RemoteObject _lstestadosexpedicion) throws Exception{
try {
		Debug.PushSubsStack("ActualizarEstadoExpedicion (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,884);
if (RapidSub.canDelegate("actualizarestadoexpedicion")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","actualizarestadoexpedicion", __ref, _idxitem, _mdata, _lstestadosexpedicion);}
RemoteObject _mdataestadoactual = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _estadoactual = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _entregado = RemoteObject.createImmutable(false);
RemoteObject _xnent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xne = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("IDxItem", _idxitem);
Debug.locals.put("mData", _mdata);
Debug.locals.put("lstEstadosExpedicion", _lstestadosexpedicion);
 BA.debugLineNum = 884;BA.debugLine="Sub ActualizarEstadoExpedicion(IDxItem As Int, mDa";
Debug.ShouldStop(524288);
 BA.debugLineNum = 886;BA.debugLine="For Each mDataEstadoActual As Map In lstEstadosEx";
Debug.ShouldStop(2097152);
_mdataestadoactual = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group1 = _lstestadosexpedicion;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mdataestadoactual = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group1.runMethod(false,"Get",index1));Debug.locals.put("mDataEstadoActual", _mdataestadoactual);
Debug.locals.put("mDataEstadoActual", _mdataestadoactual);
 BA.debugLineNum = 887;BA.debugLine="Log(mDataEstadoActual)";
Debug.ShouldStop(4194304);
cexpedicionesperiodotxt.__c.runVoidMethod ("LogImpl","865077251",BA.ObjectToString(_mdataestadoactual),0);
 }
}Debug.locals.put("mDataEstadoActual", _mdataestadoactual);
;
 BA.debugLineNum = 889;BA.debugLine="Dim EstadoActual As String=mDataEstadoActual.Get(";
Debug.ShouldStop(16777216);
_estadoactual = BA.ObjectToString(_mdataestadoactual.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESTADO")))));Debug.locals.put("EstadoActual", _estadoactual);Debug.locals.put("EstadoActual", _estadoactual);
 BA.debugLineNum = 893;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesPeriodo";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblExpedicionesPeriodoTXT set EstadoActual=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?")),(Object)(cexpedicionesperiodotxt.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_estadoactual),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))})))));
 BA.debugLineNum = 895;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set EstadoActual=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?")),(Object)(cexpedicionesperiodotxt.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_estadoactual),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))})))));
 BA.debugLineNum = 899;BA.debugLine="Dim p As B4XView=JamTableCLV1.GetPanel(IDxItem)";
Debug.ShouldStop(4);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getpanel" /*RemoteObject*/ ,(Object)(_idxitem));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 900;BA.debugLine="Dim Entregado As Boolean";
Debug.ShouldStop(8);
_entregado = RemoteObject.createImmutable(false);Debug.locals.put("Entregado", _entregado);
 BA.debugLineNum = 901;BA.debugLine="For Each xNEnt As B4XView In p.GetAllViewsRecursi";
Debug.ShouldStop(16);
_xnent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group9 = _p.runMethod(false,"GetAllViewsRecursive");
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_xnent = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group9.runMethod(false,"Get",index9));Debug.locals.put("xNEnt", _xnent);
Debug.locals.put("xNEnt", _xnent);
 BA.debugLineNum = 902;BA.debugLine="If xNEnt.Tag=\"Entregado\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_xnent.runMethod(false,"getTag"),RemoteObject.createImmutable(("Entregado")))) { 
 BA.debugLineNum = 903;BA.debugLine="Entregado=xNEnt.text=\"SI\"";
Debug.ShouldStop(64);
_entregado = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_xnent.runMethod(true,"getText"),BA.ObjectToString("SI")));Debug.locals.put("Entregado", _entregado);
 BA.debugLineNum = 904;BA.debugLine="Exit";
Debug.ShouldStop(128);
if (true) break;
 };
 }
}Debug.locals.put("xNEnt", _xnent);
;
 BA.debugLineNum = 907;BA.debugLine="For Each xNE As B4XView In p.GetAllViewsRecursive";
Debug.ShouldStop(1024);
_xne = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group15 = _p.runMethod(false,"GetAllViewsRecursive");
final int groupLen15 = group15.runMethod(true,"getSize").<Integer>get()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_xne = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group15.runMethod(false,"Get",index15));Debug.locals.put("xNE", _xne);
Debug.locals.put("xNE", _xne);
 BA.debugLineNum = 908;BA.debugLine="If xNE.Tag=\"EstadoActual\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_xne.runMethod(false,"getTag"),RemoteObject.createImmutable(("EstadoActual")))) { 
 BA.debugLineNum = 909;BA.debugLine="xNE.Text=EstadoActual";
Debug.ShouldStop(4096);
_xne.runMethod(true,"setText",_estadoactual);
 BA.debugLineNum = 910;BA.debugLine="If Entregado Then";
Debug.ShouldStop(8192);
if (_entregado.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 911;BA.debugLine="xNE.TextColor=xui.Color_Blue";
Debug.ShouldStop(16384);
_xne.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 }else {
 BA.debugLineNum = 913;BA.debugLine="xNE.TextColor=0xFFDC143C";
Debug.ShouldStop(65536);
_xne.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffdc143c)));
 };
 BA.debugLineNum = 915;BA.debugLine="Exit";
Debug.ShouldStop(262144);
if (true) break;
 };
 }
}Debug.locals.put("xNE", _xne);
;
 BA.debugLineNum = 919;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _actualizarstatusexpedicionesnoentregadas(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarStatusExpedicionesNoEntregadas (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1191);
if (RapidSub.canDelegate("actualizarstatusexpedicionesnoentregadas")) { __ref.runUserSub(false, "cexpedicionesperiodotxt","actualizarstatusexpedicionesnoentregadas", __ref); return;}
ResumableSub_ActualizarStatusExpedicionesNoEntregadas rsub = new ResumableSub_ActualizarStatusExpedicionesNoEntregadas(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ActualizarStatusExpedicionesNoEntregadas extends BA.ResumableSub {
public ResumableSub_ActualizarStatusExpedicionesNoEntregadas(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _numexpptes = RemoteObject.createImmutable(0);
RemoteObject _intervalo = RemoteObject.createImmutable(0);
RemoteObject _idxaqctestados = RemoteObject.createImmutable(0);
RemoteObject _rsestados = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdataestado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _estadoexp = RemoteObject.createImmutable("");
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarStatusExpedicionesNoEntregadas (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1191);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1192;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Actualizar";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Actualizar Status expediciones pendientes de entrega?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1193;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1195;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 1197;BA.debugLine="Dim NumExpPtes As Int=mSQL.ExecQuerySingleResult2";
Debug.ShouldStop(4096);
_numexpptes = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblExpedicionesPeriodoTXT where Entregado=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("NO")}))))));Debug.locals.put("NumExpPtes", _numexpptes);Debug.locals.put("NumExpPtes", _numexpptes);
 BA.debugLineNum = 1198;BA.debugLine="Dim Intervalo As Int=100/NumExpPtes";
Debug.ShouldStop(8192);
_intervalo = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_numexpptes}, "/",0, 0));Debug.locals.put("Intervalo", _intervalo);Debug.locals.put("Intervalo", _intervalo);
 BA.debugLineNum = 1199;BA.debugLine="jamCircularProgressBar1.Visible=True";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvisible" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1200;BA.debugLine="Dim iDxAQctEstados As Int";
Debug.ShouldStop(32768);
_idxaqctestados = RemoteObject.createImmutable(0);Debug.locals.put("iDxAQctEstados", _idxaqctestados);
 BA.debugLineNum = 1201;BA.debugLine="Dim rsEstados As ResultSet=mSQL.ExecQuery2(\"selec";
Debug.ShouldStop(65536);
_rsestados = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsestados = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select * from tblExpedicionesPeriodoTXT where Entregado=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("NO")})))));Debug.locals.put("rsEstados", _rsestados);Debug.locals.put("rsEstados", _rsestados);
 BA.debugLineNum = 1202;BA.debugLine="Do While rsEstados.NextRow";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//do while
this.state = 16;
while (_rsestados.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1203;BA.debugLine="Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(rsE";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), parent._cmauxtxt.runMethod(false,"_obtenerestadoexpediciontxt" /*RemoteObject*/ ,(Object)(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CODORIGEN")))),(Object)(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CODDESTIN")))),(Object)(_rsestados.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("NEXPED1")))),(Object)(_rsestados.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("NEXPED2")))),(Object)(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ANO"))))));
this.state = 37;
return;
case 37:
//C
this.state = 10;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1204;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1205;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(1048576);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1212;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get(";
Debug.ShouldStop(134217728);
_lstdatosestadosexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);
 BA.debugLineNum = 1213;BA.debugLine="Dim mDataEstado As Map=lstDatosEstadosExpedicio";
Debug.ShouldStop(268435456);
_mdataestado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataestado = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstdatosestadosexpedicion.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mDataEstado", _mdataestado);Debug.locals.put("mDataEstado", _mdataestado);
 BA.debugLineNum = 1214;BA.debugLine="Dim EstadoExp As String=mDataEstado.Get(\"ESTADO";
Debug.ShouldStop(536870912);
_estadoexp = BA.ObjectToString(_mdataestado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESTADO")))));Debug.locals.put("EstadoExp", _estadoexp);Debug.locals.put("EstadoExp", _estadoexp);
 BA.debugLineNum = 1218;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblExpediciones";
Debug.ShouldStop(2);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblExpedicionesPeriodoTXT set EstadoActual=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_estadoexp),(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CODORIGEN")))),(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CODDESTIN")))),(_rsestados.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("NEXPED1")))),(_rsestados.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("NEXPED2")))),(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ANO"))))})))));
 if (true) break;

case 15:
//C
this.state = 7;
;
 BA.debugLineNum = 1221;BA.debugLine="iDxAQctEstados=iDxAQctEstados+1";
Debug.ShouldStop(16);
_idxaqctestados = RemoteObject.solve(new RemoteObject[] {_idxaqctestados,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("iDxAQctEstados", _idxaqctestados);
 BA.debugLineNum = 1222;BA.debugLine="jamCircularProgressBar1.Value=Floor(iDxAQctEstad";
Debug.ShouldStop(32);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, parent.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_idxaqctestados,_intervalo}, "*",0, 1))))));
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1224;BA.debugLine="rsEstados.Close";
Debug.ShouldStop(128);
_rsestados.runVoidMethod ("Close");
 BA.debugLineNum = 1226;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
Debug.ShouldStop(512);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1227;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _senderfilter);
this.state = 38;
return;
case 38:
//C
this.state = 17;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1228;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","865470501",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1231;BA.debugLine="jamCircularProgressBar1.Value=0";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 1232;BA.debugLine="jamCircularProgressBar1.Visible=False";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvisible" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1234;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblExpedicionesPeriodoTXT order by Fecha_x0020_Alta, NExped1, Nexped2")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1235;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
Debug.ShouldStop(262144);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1236;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _rsub);
this.state = 39;
return;
case 39:
//C
this.state = 17;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 1237;BA.debugLine="rs.Close";
Debug.ShouldStop(1048576);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 1238;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 1239;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 17:
//if
this.state = 35;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1240;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(8388608);
if (true) break;

case 20:
//if
this.state = 27;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1241;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1242;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 23;
;
 BA.debugLineNum = 1244;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1245;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 23;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1246;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(536870912);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1247;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 1248;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 1251;BA.debugLine="ExitApplication";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 1253;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(16);

case 27:
//if
this.state = 34;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 1254;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then";
Debug.ShouldStop(32);
if (true) break;

case 30:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 1255;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay Exp";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No hay Expediciones de TXT sin entregar.\n"),RemoteObject.createImmutable("(¿Error en webservice?)")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1257;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _msa);
this.state = 42;
return;
case 42:
//C
this.state = 33;
;
 BA.debugLineNum = 1258;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 33:
//C
this.state = 34;
;
 BA.debugLineNum = 1260;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1261;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _msa);
this.state = 43;
return;
case 43:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = -1;
;
 BA.debugLineNum = 1265;BA.debugLine="End Sub";
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
public static void  _btnaccionesexpedicionsinentregar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnAccionesExpedicionSinEntregar_Click (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,638);
if (RapidSub.canDelegate("btnaccionesexpedicionsinentregar_click")) { __ref.runUserSub(false, "cexpedicionesperiodotxt","btnaccionesexpedicionsinentregar_click", __ref); return;}
ResumableSub_btnAccionesExpedicionSinEntregar_Click rsub = new ResumableSub_btnAccionesExpedicionSinEntregar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnAccionesExpedicionSinEntregar_Click extends BA.ResumableSub {
public ResumableSub_btnAccionesExpedicionSinEntregar_Click(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
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
RemoteObject _opcionsel = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstdatosincidenciasexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nexped1 = RemoteObject.createImmutable("");
RemoteObject _numexpedicion = RemoteObject.createImmutable("");
RemoteObject _urltxt = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _idtransportetxt = RemoteObject.createImmutable(0);
RemoteObject _numexpediciontxtmysql = RemoteObject.createImmutable("");
int step30;
int limit30;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnAccionesExpedicionSinEntregar_Click (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,638);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 639;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(1073741824);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 640;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(-2147483648);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 641;BA.debugLine="Log(mData)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","864815107",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 642;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(2);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 644;BA.debugLine="JamTableCLV1.SeleccionarItem(IndexSel)";
Debug.ShouldStop(8);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_seleccionaritem" /*RemoteObject*/ ,(Object)(_indexsel));
 BA.debugLineNum = 646;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(32);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 648;BA.debugLine="Dialog.Title=\"Selecciona Acción\"";
Debug.ShouldStop(128);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Acción")));
 BA.debugLineNum = 649;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(256);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 650;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(512);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 651;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 652;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(2048);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 653;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(4096);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 655;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(16384);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 656;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(32768);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 657;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(65536);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 659;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(262144);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 660;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(524288);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 662;BA.debugLine="Dim lstOpciones As List";
Debug.ShouldStop(2097152);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 663;BA.debugLine="lstOpciones.Initialize";
Debug.ShouldStop(4194304);
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 664;BA.debugLine="lstOpciones.Add(\"Actualizar Estado Expedición\")";
Debug.ShouldStop(8388608);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Actualizar Estado Expedición"))));
 BA.debugLineNum = 665;BA.debugLine="lstOpciones.Add(\"Histórico Estados Expedición\")";
Debug.ShouldStop(16777216);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Histórico Estados Expedición"))));
 BA.debugLineNum = 666;BA.debugLine="lstOpciones.Add(\"Consulta Incidencias Expedición\"";
Debug.ShouldStop(33554432);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Consulta Incidencias Expedición"))));
 BA.debugLineNum = 667;BA.debugLine="lstOpciones.Add(\"Ficha Expedición Web TXT\")";
Debug.ShouldStop(67108864);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Ficha Expedición Web TXT"))));
 BA.debugLineNum = 668;BA.debugLine="lstOpciones.Add(\"Documentos NAV de la expedición\"";
Debug.ShouldStop(134217728);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Documentos NAV de la expedición"))));
 BA.debugLineNum = 670;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(536870912);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 673;BA.debugLine="B4XListDlg.Resize(500dip, 400dip)";
Debug.ShouldStop(1);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))));
 BA.debugLineNum = 674;BA.debugLine="B4XListDlg.CustomListView1.AsView.width=500dip";
Debug.ShouldStop(2);
_b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 675;BA.debugLine="B4XListDlg.CustomListView1.AsView.Height=400dip";
Debug.ShouldStop(4);
_b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setHeight",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))));
 BA.debugLineNum = 677;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(16);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 679;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(64);
if (true) break;

case 1:
//for
this.state = 4;
step30 = 1;
limit30 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 61;
if (true) break;

case 61:
//C
this.state = 4;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 3;
if (true) break;

case 62:
//C
this.state = 61;
_i = ((int)(0 + _i + step30)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 62;
 BA.debugLineNum = 680;BA.debugLine="xclv.ResizeItem(i,60dip)";
Debug.ShouldStop(128);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 684;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(2048);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 685;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 687;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(16384);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 688;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(32768);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 689;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(65536);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 692;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), _rsub);
this.state = 63;
return;
case 63:
//C
this.state = 9;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 694;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 697;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 701;BA.debugLine="Dim OpcionSel As String=B4XListDlg.SelectedItem";
Debug.ShouldStop(268435456);
_opcionsel = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("OpcionSel", _opcionsel);Debug.locals.put("OpcionSel", _opcionsel);
 BA.debugLineNum = 703;BA.debugLine="Select Case OpcionSel";
Debug.ShouldStop(1073741824);
if (true) break;

case 15:
//select
this.state = 60;
switch (BA.switchObjectToInt(_opcionsel,BA.ObjectToString("Actualizar Estado Expedición"),BA.ObjectToString("Histórico Estados Expedición"),BA.ObjectToString("Consulta Incidencias Expedición"),BA.ObjectToString("Ficha Expedición Web TXT"),BA.ObjectToString("Documentos NAV de la expedición"))) {
case 0: {
this.state = 17;
if (true) break;
}
case 1: {
this.state = 25;
if (true) break;
}
case 2: {
this.state = 33;
if (true) break;
}
case 3: {
this.state = 41;
if (true) break;
}
case 4: {
this.state = 59;
if (true) break;
}
}
if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 706;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarpare";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitarparenttableclv" /*RemoteObject*/ );
 BA.debugLineNum = 707;BA.debugLine="Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(mD";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt.runMethod(false,"_obtenerestadoexpediciontxt" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))))));
this.state = 64;
return;
case 64:
//C
this.state = 18;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 708;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTabl";
Debug.ShouldStop(8);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 709;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(16);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 710;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(32);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) return ;
if (true) break;

case 23:
//C
this.state = 60;
;
 BA.debugLineNum = 711;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get(";
Debug.ShouldStop(64);
_lstdatosestadosexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);
 BA.debugLineNum = 713;BA.debugLine="ActualizarEstadoExpedicion(IndexSel,mData, lstD";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_actualizarestadoexpedicion" /*RemoteObject*/ ,(Object)(_indexsel),(Object)(_mdata),(Object)(_lstdatosestadosexpedicion));
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 716;BA.debugLine="Wait For(cmAuxTxT.ObtenerHistoricoEstadosExpedi";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt.runMethod(false,"_obtenerhistoricoestadosexpediciontxt" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))))));
this.state = 65;
return;
case 65:
//C
this.state = 26;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 717;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 718;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(8192);
if (true) break;

case 26:
//if
this.state = 31;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
if (true) return ;
if (true) break;

case 31:
//C
this.state = 60;
;
 BA.debugLineNum = 719;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get(";
Debug.ShouldStop(16384);
_lstdatosestadosexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);
 BA.debugLineNum = 720;BA.debugLine="MostrarHistoricoEstadosExpedicion(lstDatosEstad";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_mostrarhistoricoestadosexpedicion" /*void*/ ,(Object)(_lstdatosestadosexpedicion));
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 722;BA.debugLine="Wait For(cmAuxTxT.ObtenerConsultaIncidenciasExp";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt.runMethod(false,"_obtenerconsultaincidenciasexpediciontxt" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))))));
this.state = 66;
return;
case 66:
//C
this.state = 34;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 723;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 724;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(524288);
if (true) break;

case 34:
//if
this.state = 39;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
if (true) return ;
if (true) break;

case 39:
//C
this.state = 60;
;
 BA.debugLineNum = 725;BA.debugLine="Dim lstDatosIncidenciasExpedicion As List=mRes.";
Debug.ShouldStop(1048576);
_lstdatosincidenciasexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosincidenciasexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstDatosIncidenciasExpedicion", _lstdatosincidenciasexpedicion);Debug.locals.put("lstDatosIncidenciasExpedicion", _lstdatosincidenciasexpedicion);
 BA.debugLineNum = 726;BA.debugLine="MostrarIncidenciasExpedicion(lstDatosIncidencia";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_mostrarincidenciasexpedicion" /*RemoteObject*/ ,(Object)(_lstdatosincidenciasexpedicion));
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 730;BA.debugLine="Dim nExped1 As String=mData.Get(\"NEXPED1\")";
Debug.ShouldStop(33554432);
_nexped1 = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))));Debug.locals.put("nExped1", _nexped1);Debug.locals.put("nExped1", _nexped1);
 BA.debugLineNum = 731;BA.debugLine="If nExped1=\"0\" Then nExped1=\"000\"";
Debug.ShouldStop(67108864);
if (true) break;

case 42:
//if
this.state = 47;
if (RemoteObject.solveBoolean("=",_nexped1,BA.ObjectToString("0"))) { 
this.state = 44;
;}if (true) break;

case 44:
//C
this.state = 47;
_nexped1 = BA.ObjectToString("000");Debug.locals.put("nExped1", _nexped1);
if (true) break;

case 47:
//C
this.state = 48;
;
 BA.debugLineNum = 732;BA.debugLine="Dim NumExpedicion As String=$\"${mData.Get(\"CODE";
Debug.ShouldStop(134217728);
_numexpedicion = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODEMPRESA")))))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nexped1))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO")))))),RemoteObject.createImmutable("")));Debug.locals.put("NumExpedicion", _numexpedicion);Debug.locals.put("NumExpedicion", _numexpedicion);
 BA.debugLineNum = 733;BA.debugLine="wait for(cmAuxTxT.ObtenerURLTrazabilidadExpedic";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt.runMethod(false,"_obtenerurltrazabilidadexpediciontxt" /*RemoteObject*/ ,(Object)(_numexpedicion)));
this.state = 67;
return;
case 67:
//C
this.state = 48;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 734;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 735;BA.debugLine="If Accion=\"OK\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 48:
//if
this.state = 57;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("OK"))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 736;BA.debugLine="Dim URLtxt As String=mRes.Get(\"URL\")";
Debug.ShouldStop(-2147483648);
_urltxt = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("URL")))));Debug.locals.put("URLtxt", _urltxt);Debug.locals.put("URLtxt", _urltxt);
 BA.debugLineNum = 737;BA.debugLine="If URLtxt<>\"\" Then";
Debug.ShouldStop(1);
if (true) break;

case 51:
//if
this.state = 56;
if (RemoteObject.solveBoolean("!",_urltxt,BA.ObjectToString(""))) { 
this.state = 53;
}else {
this.state = 55;
}if (true) break;

case 53:
//C
this.state = 56;
 BA.debugLineNum = 738;BA.debugLine="fx.ShowExternalDocument(URLtxt)";
Debug.ShouldStop(2);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethod ("ShowExternalDocument",(Object)(_urltxt));
 if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 740;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Método Url";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Método UrlTracking TXT devuelve cadena vacía.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 741;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), _msa);
this.state = 68;
return;
case 68:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = 57;
;
 if (true) break;

case 57:
//C
this.state = 60;
;
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 746;BA.debugLine="Dim IDTransporteTXT As Int=7";
Debug.ShouldStop(512);
_idtransportetxt = BA.numberCast(int.class, 7);Debug.locals.put("IDTransporteTXT", _idtransportetxt);Debug.locals.put("IDTransporteTXT", _idtransportetxt);
 BA.debugLineNum = 747;BA.debugLine="Dim NumExpedicionTXTMySQL As String=\"001\" & mDa";
Debug.ShouldStop(1024);
_numexpediciontxtmysql = RemoteObject.concat(RemoteObject.createImmutable("001"),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))),RemoteObject.createImmutable("000"),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO")))));Debug.locals.put("NumExpedicionTXTMySQL", _numexpediciontxtmysql);Debug.locals.put("NumExpedicionTXTMySQL", _numexpediciontxtmysql);
 BA.debugLineNum = 748;BA.debugLine="DatosExpedicionInternaExpedicionTransporte(IDTr";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_datosexpedicioninternaexpediciontransporte" /*void*/ ,(Object)(_idtransportetxt),(Object)(_numexpediciontxtmysql));
 if (true) break;

case 60:
//C
this.state = -1;
;
 BA.debugLineNum = 750;BA.debugLine="End Sub";
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
public static RemoteObject  _btnejemplo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEjemplo_Click (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,630);
if (RapidSub.canDelegate("btnejemplo_click")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","btnejemplo_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
 BA.debugLineNum = 630;BA.debugLine="Private Sub btnEjemplo_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 631;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(4194304);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), cexpedicionesperiodotxt.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 632;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(8388608);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 633;BA.debugLine="Log(mData)";
Debug.ShouldStop(16777216);
cexpedicionesperiodotxt.__c.runVoidMethod ("LogImpl","864749571",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 634;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(33554432);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 635;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btngetinfo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnGetInfo_Click (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1026);
if (RapidSub.canDelegate("btngetinfo_click")) { __ref.runUserSub(false, "cexpedicionesperiodotxt","btngetinfo_click", __ref); return;}
ResumableSub_btnGetInfo_Click rsub = new ResumableSub_btnGetInfo_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnGetInfo_Click extends BA.ResumableSub {
public ResumableSub_btnGetInfo_Click(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnGetInfo_Click (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1026);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1027;BA.debugLine="If FechaFinalLong=0 Or FechaInicialLong=0 Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) || RemoteObject.solveBoolean("=",__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1028;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica fecha";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Indica fecha inicial y fecha final.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1029;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "btngetinfo_click"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 4;
;
 BA.debugLineNum = 1030;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 1032;BA.debugLine="If FechaFinalLong<FechaInicialLong Then";
Debug.ShouldStop(128);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ),__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1033;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha fina";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La fecha final no puede ser anterior a la fecha inicial.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1034;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "btngetinfo_click"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 7;
;
 BA.debugLineNum = 1035;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 1037;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 1038;BA.debugLine="End Sub";
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
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","btnsalir_click", __ref);}
 BA.debugLineNum = 352;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="SalirModulo";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnselfechafinal_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaFinal_Click (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1040);
if (RapidSub.canDelegate("btnselfechafinal_click")) { __ref.runUserSub(false, "cexpedicionesperiodotxt","btnselfechafinal_click", __ref); return;}
ResumableSub_btnSelFechaFinal_Click rsub = new ResumableSub_btnSelFechaFinal_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelFechaFinal_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaFinal_Click(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _offset_before_dialog = RemoteObject.createImmutable(0f);
RemoteObject _b4xdatedlg = RemoteObject.declareNull("b4j.docU.b4xdatetemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _fechafinsel = RemoteObject.createImmutable(0L);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _fechafinalhora = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaFinal_Click (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1040);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1074;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(131072);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 1075;BA.debugLine="Dialog.Title=\"Indica Fecha Final\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Fecha Final")));
 BA.debugLineNum = 1077;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
Debug.ShouldStop(1048576);
_b4xdatedlg = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");Debug.locals.put("B4XDateDlg", _b4xdatedlg);
 BA.debugLineNum = 1078;BA.debugLine="B4XDateDlg.Initialize";
Debug.ShouldStop(2097152);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1079;BA.debugLine="If FechaFinalLong=0 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1080;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
Debug.ShouldStop(8388608);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1082;BA.debugLine="B4XDateDlg.Date=FechaFinalLong";
Debug.ShouldStop(33554432);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1084;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
Debug.ShouldStop(134217728);
_b4xdatedlg.setField ("_closeonselection" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1085;BA.debugLine="B4XDateDlg.FirstDay=1";
Debug.ShouldStop(268435456);
_b4xdatedlg.setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 1086;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
Debug.ShouldStop(536870912);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xdatedlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1089;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(1);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 1090;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(2);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 1091;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(4);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 1092;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(8);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 1093;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "btnselfechafinal_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1094;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 1095;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(64);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1096;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1098;BA.debugLine="Dim FechaFinSel As Long=B4XDateDlg.Date";
Debug.ShouldStop(512);
_fechafinsel = _b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ );Debug.locals.put("FechaFinSel", _fechafinsel);Debug.locals.put("FechaFinSel", _fechafinsel);
 BA.debugLineNum = 1100;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(2048);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1101;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(4096);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1102;BA.debugLine="Dim FechaFinalHora As Long=FechaFinSel";
Debug.ShouldStop(8192);
_fechafinalhora = _fechafinsel;Debug.locals.put("FechaFinalHora", _fechafinalhora);Debug.locals.put("FechaFinalHora", _fechafinalhora);
 BA.debugLineNum = 1103;BA.debugLine="FechaFinalLong=DateUtils.SetDate(DateTime.GetYear";
Debug.ShouldStop(16384);
__ref.setField ("_fechafinallong" /*RemoteObject*/ ,parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_fechafinalhora))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_fechafinalhora))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_fechafinalhora)))));
 BA.debugLineNum = 1104;BA.debugLine="FechaFinalLong=FechaFinalLong+DateTime.TicksPerDa";
Debug.ShouldStop(32768);
__ref.setField ("_fechafinallong" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ),parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay"),RemoteObject.createImmutable(1)}, "+-",2, 2));
 BA.debugLineNum = 1105;BA.debugLine="txtFechaFinal.Text=DateTime.Date(FechaFinalLong)";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ))));
 BA.debugLineNum = 1106;BA.debugLine="Log(DateUtils.TicksToString(FechaFinalLong))";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","865339458",parent._dateutils.runMethod(true,"_tickstostring",(Object)(__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ))),0);
 BA.debugLineNum = 1108;BA.debugLine="If FechaInicialLong=0 Then";
Debug.ShouldStop(524288);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1109;BA.debugLine="FechaInicialLong=FechaFinalLong";
Debug.ShouldStop(1048576);
__ref.setField ("_fechainiciallong" /*RemoteObject*/ ,__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ));
 BA.debugLineNum = 1110;BA.debugLine="txtFechaInicial.Text=DateTime.date(FechaInicialL";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ))));
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1113;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(16777216);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1114;BA.debugLine="End Sub";
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
public static void  _btnselfechainicial_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaInicial_Click (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1116);
if (RapidSub.canDelegate("btnselfechainicial_click")) { __ref.runUserSub(false, "cexpedicionesperiodotxt","btnselfechainicial_click", __ref); return;}
ResumableSub_btnSelFechaInicial_Click rsub = new ResumableSub_btnSelFechaInicial_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelFechaInicial_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaInicial_Click(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _offset_before_dialog = RemoteObject.createImmutable(0f);
RemoteObject _b4xdatedlg = RemoteObject.declareNull("b4j.docU.b4xdatetemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _fechainsel = RemoteObject.createImmutable(0L);
RemoteObject _dateformatant = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaInicial_Click (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1116);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1148;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(134217728);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 1149;BA.debugLine="Dialog.Title=\"Indica Fecha Inicial\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Fecha Inicial")));
 BA.debugLineNum = 1151;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
Debug.ShouldStop(1073741824);
_b4xdatedlg = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");Debug.locals.put("B4XDateDlg", _b4xdatedlg);
 BA.debugLineNum = 1152;BA.debugLine="B4XDateDlg.Initialize";
Debug.ShouldStop(-2147483648);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1153;BA.debugLine="If FechaInicialLong=0 Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1154;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
Debug.ShouldStop(2);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1156;BA.debugLine="B4XDateDlg.Date=FechaInicialLong";
Debug.ShouldStop(8);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1158;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
Debug.ShouldStop(32);
_b4xdatedlg.setField ("_closeonselection" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1159;BA.debugLine="B4XDateDlg.FirstDay=1";
Debug.ShouldStop(64);
_b4xdatedlg.setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 1160;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
Debug.ShouldStop(128);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xdatedlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1163;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(1024);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 1164;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(2048);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 1165;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(4096);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 1166;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(8192);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 1167;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "btnselfechainicial_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1168;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 1169;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1170;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1172;BA.debugLine="Dim FechaInSel As Long=B4XDateDlg.Date";
Debug.ShouldStop(524288);
_fechainsel = _b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ );Debug.locals.put("FechaInSel", _fechainsel);Debug.locals.put("FechaInSel", _fechainsel);
 BA.debugLineNum = 1175;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(4194304);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1176;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(8388608);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1178;BA.debugLine="FechaInicialLong=DateUtils.SetDate(DateTime.GetYe";
Debug.ShouldStop(33554432);
__ref.setField ("_fechainiciallong" /*RemoteObject*/ ,parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_fechainsel))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_fechainsel))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_fechainsel)))));
 BA.debugLineNum = 1179;BA.debugLine="txtFechaInicial.Text=DateTime.date(FechaInicialLo";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ))));
 BA.debugLineNum = 1180;BA.debugLine="Log(DateUtils.TicksToString(FechaInicialLong))";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","865404992",parent._dateutils.runMethod(true,"_tickstostring",(Object)(__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ))),0);
 BA.debugLineNum = 1182;BA.debugLine="If FechaFinalLong=0 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1183;BA.debugLine="FechaFinalLong=FechaInicialLong";
Debug.ShouldStop(1073741824);
__ref.setField ("_fechafinallong" /*RemoteObject*/ ,__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ));
 BA.debugLineNum = 1184;BA.debugLine="txtFechaFinal.Text=DateTime.date(FechaFinalLong)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ))));
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1186;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(2);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1188;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
cexpedicionesperiodotxt._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cexpedicionesperiodotxt._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
cexpedicionesperiodotxt._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cexpedicionesperiodotxt._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cexpedicionesperiodotxt._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cexpedicionesperiodotxt._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private Dialog As B4XDialog";
cexpedicionesperiodotxt._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cexpedicionesperiodotxt._dialog);
 //BA.debugLineNum = 9;BA.debugLine="Private mSQL As SQL";
cexpedicionesperiodotxt._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cexpedicionesperiodotxt._msql);
 //BA.debugLineNum = 14;BA.debugLine="Private JamTableCLV1 As JamTableCLV";
cexpedicionesperiodotxt._jamtableclv1 = RemoteObject.createNew ("b4j.docU.jamtableclv");__ref.setField("_jamtableclv1",cexpedicionesperiodotxt._jamtableclv1);
 //BA.debugLineNum = 15;BA.debugLine="Private txtANO As TextField";
cexpedicionesperiodotxt._txtano = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtano",cexpedicionesperiodotxt._txtano);
 //BA.debugLineNum = 16;BA.debugLine="Private txtBULTOS As TextField";
cexpedicionesperiodotxt._txtbultos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtbultos",cexpedicionesperiodotxt._txtbultos);
 //BA.debugLineNum = 17;BA.debugLine="Private txtCODDESTIN As TextField";
cexpedicionesperiodotxt._txtcoddestin = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcoddestin",cexpedicionesperiodotxt._txtcoddestin);
 //BA.debugLineNum = 18;BA.debugLine="Private txtCODEMPRESA As TextField";
cexpedicionesperiodotxt._txtcodempresa = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodempresa",cexpedicionesperiodotxt._txtcodempresa);
 //BA.debugLineNum = 19;BA.debugLine="Private txtCODORIGEN As TextField";
cexpedicionesperiodotxt._txtcodorigen = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodorigen",cexpedicionesperiodotxt._txtcodorigen);
 //BA.debugLineNum = 20;BA.debugLine="Private txtCPOSTALDESTINATARIO As TextField";
cexpedicionesperiodotxt._txtcpostaldestinatario = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcpostaldestinatario",cexpedicionesperiodotxt._txtcpostaldestinatario);
 //BA.debugLineNum = 21;BA.debugLine="Private txtDIRECCIONDESTINATARIO As TextField";
cexpedicionesperiodotxt._txtdirecciondestinatario = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdirecciondestinatario",cexpedicionesperiodotxt._txtdirecciondestinatario);
 //BA.debugLineNum = 23;BA.debugLine="Private txtFECHAALTA As TextField";
cexpedicionesperiodotxt._txtfechaalta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechaalta",cexpedicionesperiodotxt._txtfechaalta);
 //BA.debugLineNum = 24;BA.debugLine="Private txtKILOS As TextField";
cexpedicionesperiodotxt._txtkilos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtkilos",cexpedicionesperiodotxt._txtkilos);
 //BA.debugLineNum = 25;BA.debugLine="Private txtNEXPED1 As TextField";
cexpedicionesperiodotxt._txtnexped1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnexped1",cexpedicionesperiodotxt._txtnexped1);
 //BA.debugLineNum = 26;BA.debugLine="Private txtNEXPED2 As TextField";
cexpedicionesperiodotxt._txtnexped2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnexped2",cexpedicionesperiodotxt._txtnexped2);
 //BA.debugLineNum = 27;BA.debugLine="Private txtNOMBREDESTINATARIO As TextField";
cexpedicionesperiodotxt._txtnombredestinatario = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombredestinatario",cexpedicionesperiodotxt._txtnombredestinatario);
 //BA.debugLineNum = 29;BA.debugLine="Private txtPOBLACIONDESTINATARIO As TextField";
cexpedicionesperiodotxt._txtpoblaciondestinatario = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpoblaciondestinatario",cexpedicionesperiodotxt._txtpoblaciondestinatario);
 //BA.debugLineNum = 31;BA.debugLine="Private txtREFERENCIA1 As TextField";
cexpedicionesperiodotxt._txtreferencia1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtreferencia1",cexpedicionesperiodotxt._txtreferencia1);
 //BA.debugLineNum = 32;BA.debugLine="Private txtDestino As TextField";
cexpedicionesperiodotxt._txtdestino = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdestino",cexpedicionesperiodotxt._txtdestino);
 //BA.debugLineNum = 33;BA.debugLine="Private txtEstadoActual As B4XView";
cexpedicionesperiodotxt._txtestadoactual = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtestadoactual",cexpedicionesperiodotxt._txtestadoactual);
 //BA.debugLineNum = 35;BA.debugLine="Private MeasurementCanvas As B4XCanvas";
cexpedicionesperiodotxt._measurementcanvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_measurementcanvas",cexpedicionesperiodotxt._measurementcanvas);
 //BA.debugLineNum = 37;BA.debugLine="Private FlexGridDialog As FlexGrid";
cexpedicionesperiodotxt._flexgriddialog = RemoteObject.createNew ("b4j.example.flexgrid");__ref.setField("_flexgriddialog",cexpedicionesperiodotxt._flexgriddialog);
 //BA.debugLineNum = 38;BA.debugLine="Private btnSalir As Button";
cexpedicionesperiodotxt._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",cexpedicionesperiodotxt._btnsalir);
 //BA.debugLineNum = 39;BA.debugLine="Private txtFechaInicial As TextField";
cexpedicionesperiodotxt._txtfechainicial = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechainicial",cexpedicionesperiodotxt._txtfechainicial);
 //BA.debugLineNum = 40;BA.debugLine="Private btnSelFechaInicial As Button";
cexpedicionesperiodotxt._btnselfechainicial = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselfechainicial",cexpedicionesperiodotxt._btnselfechainicial);
 //BA.debugLineNum = 41;BA.debugLine="Private txtFechaFinal As TextField";
cexpedicionesperiodotxt._txtfechafinal = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechafinal",cexpedicionesperiodotxt._txtfechafinal);
 //BA.debugLineNum = 42;BA.debugLine="Private btnSelFechaFinal As Button";
cexpedicionesperiodotxt._btnselfechafinal = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselfechafinal",cexpedicionesperiodotxt._btnselfechafinal);
 //BA.debugLineNum = 43;BA.debugLine="Private btnGetInfo As Button";
cexpedicionesperiodotxt._btngetinfo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btngetinfo",cexpedicionesperiodotxt._btngetinfo);
 //BA.debugLineNum = 45;BA.debugLine="Private FechaInicialLong, FechaFinalLong As Long";
cexpedicionesperiodotxt._fechainiciallong = RemoteObject.createImmutable(0L);__ref.setField("_fechainiciallong",cexpedicionesperiodotxt._fechainiciallong);
cexpedicionesperiodotxt._fechafinallong = RemoteObject.createImmutable(0L);__ref.setField("_fechafinallong",cexpedicionesperiodotxt._fechafinallong);
 //BA.debugLineNum = 46;BA.debugLine="Private txtFechaSalida As TextField";
cexpedicionesperiodotxt._txtfechasalida = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechasalida",cexpedicionesperiodotxt._txtfechasalida);
 //BA.debugLineNum = 47;BA.debugLine="Private txtFechaEntrega As TextField";
cexpedicionesperiodotxt._txtfechaentrega = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechaentrega",cexpedicionesperiodotxt._txtfechaentrega);
 //BA.debugLineNum = 48;BA.debugLine="Private txtNombreCliente As TextField";
cexpedicionesperiodotxt._txtnombrecliente = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombrecliente",cexpedicionesperiodotxt._txtnombrecliente);
 //BA.debugLineNum = 49;BA.debugLine="Private txtNombreResponsableCuenta As B4XView";
cexpedicionesperiodotxt._txtnombreresponsablecuenta = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnombreresponsablecuenta",cexpedicionesperiodotxt._txtnombreresponsablecuenta);
 //BA.debugLineNum = 50;BA.debugLine="Private txtTipo As B4XView";
cexpedicionesperiodotxt._txttipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txttipo",cexpedicionesperiodotxt._txttipo);
 //BA.debugLineNum = 51;BA.debugLine="Private lblIndicadorEstado As B4XView";
cexpedicionesperiodotxt._lblindicadorestado = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblindicadorestado",cexpedicionesperiodotxt._lblindicadorestado);
 //BA.debugLineNum = 52;BA.debugLine="Private txtEntregado As B4XView";
cexpedicionesperiodotxt._txtentregado = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtentregado",cexpedicionesperiodotxt._txtentregado);
 //BA.debugLineNum = 53;BA.debugLine="Private lblIndicadorTipo As B4XView";
cexpedicionesperiodotxt._lblindicadortipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblindicadortipo",cexpedicionesperiodotxt._lblindicadortipo);
 //BA.debugLineNum = 56;BA.debugLine="Private jamCircularProgressBar1 As jamCircularPro";
cexpedicionesperiodotxt._jamcircularprogressbar1 = RemoteObject.createNew ("b4j.docU.jamcircularprogressbar");__ref.setField("_jamcircularprogressbar1",cexpedicionesperiodotxt._jamcircularprogressbar1);
 //BA.debugLineNum = 57;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
cexpedicionesperiodotxt._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cexpedicionesperiodotxt._jamloadingindicator1);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clienteresponsablecuentadocumento(RemoteObject __ref,RemoteObject _doc) throws Exception{
try {
		Debug.PushSubsStack("ClienteResponsableCuentaDocumento (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1398);
if (RapidSub.canDelegate("clienteresponsablecuentadocumento")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","clienteresponsablecuentadocumento", __ref, _doc);}
ResumableSub_ClienteResponsableCuentaDocumento rsub = new ResumableSub_ClienteResponsableCuentaDocumento(null,__ref,_doc);
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
public static class ResumableSub_ClienteResponsableCuentaDocumento extends BA.ResumableSub {
public ResumableSub_ClienteResponsableCuentaDocumento(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref,RemoteObject _doc) {
this.parent = parent;
this.__ref = __ref;
this._doc = _doc;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _doc;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ClienteResponsableCuentaDocumento (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1398);
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
Debug.locals.put("Doc", _doc);
 BA.debugLineNum = 1399;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4194304);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1402;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(33554432);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1403;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1406;BA.debugLine="Dim comando As String";
Debug.ShouldStop(536870912);
_comando = RemoteObject.createImmutable("");Debug.locals.put("comando", _comando);
 BA.debugLineNum = 1407;BA.debugLine="Select True";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_doc.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_doc.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
default: {
this.state = 7;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 8;
 BA.debugLineNum = 1409;BA.debugLine="comando=\"ClienteResponsableCuentaALBV\"";
Debug.ShouldStop(1);
_comando = BA.ObjectToString("ClienteResponsableCuentaALBV");Debug.locals.put("comando", _comando);
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 1411;BA.debugLine="comando=\"ClienteResponsableCuentaRT\"";
Debug.ShouldStop(4);
_comando = BA.ObjectToString("ClienteResponsableCuentaRT");Debug.locals.put("comando", _comando);
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1413;BA.debugLine="Accion=\"ErrTipoDoc\"";
Debug.ShouldStop(16);
_accion = BA.ObjectToString("ErrTipoDoc");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1414;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1415;BA.debugLine="Return mRes";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 1417;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,comando,Array";
Debug.ShouldStop(256);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_doc)})),(Object)(__ref));
 BA.debugLineNum = 1419;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "clienteresponsablecuentadocumento"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1420;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(2048);
if (true) break;

case 9:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 20;
 BA.debugLineNum = 1421;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1422;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "clienteresponsablecuentadocumento"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
 BA.debugLineNum = 1423;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(16384);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1424;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(32768);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1427;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(262144);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 1428;BA.debugLine="Accion=\"SinResultado\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("SinResultado");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1429;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1431;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4194304);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1432;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1433;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1434;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
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
 BA.debugLineNum = 1438;BA.debugLine="Return mRes";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1439;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,388);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 388;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(8);
 BA.debugLineNum = 389;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(16);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cexpedicionesperiodotxt.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblExpedicionesPeriodoTXT")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 390;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 391;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblExpedicionesPer";
Debug.ShouldStop(64);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblExpedicionesPeriodoTXT")));
 };
 BA.debugLineNum = 393;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(256);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 394;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 395;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblExpedicionesPeriodoTXT (")));
 BA.debugLineNum = 397;BA.debugLine="sbCrearTabla.Append(\"CODEMPRESA TEXT COLLATE NOCA";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CODEMPRESA TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 398;BA.debugLine="sbCrearTabla.Append(\"CODORIGEN TEXT COLLATE NOCAS";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CODORIGEN TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 399;BA.debugLine="sbCrearTabla.Append(\"CODDESTIN TEXT COLLATE NOCAS";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CODDESTIN TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 400;BA.debugLine="sbCrearTabla.Append(\"NEXPED1 INTEGER,\")";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NEXPED1 INTEGER,")));
 BA.debugLineNum = 401;BA.debugLine="sbCrearTabla.Append(\"NEXPED2 INTEGER,\")";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NEXPED2 INTEGER,")));
 BA.debugLineNum = 402;BA.debugLine="sbCrearTabla.Append(\"ANO TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ANO TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 403;BA.debugLine="sbCrearTabla.Append(\"Fecha_x0020_salida TEXT COLL";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fecha_x0020_salida TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 404;BA.debugLine="sbCrearTabla.Append(\"Fecha_x0020_Alta TEXT COLLAT";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fecha_x0020_Alta TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 405;BA.debugLine="sbCrearTabla.Append(\"Fecha_x0020_Entrega TEXT COL";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fecha_x0020_Entrega TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 406;BA.debugLine="sbCrearTabla.Append(\"Nombre_x0020_Destinatario TE";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Nombre_x0020_Destinatario TEXT DEFAULT '',")));
 BA.debugLineNum = 407;BA.debugLine="sbCrearTabla.Append(\"Dirección_x0020_Destinatario";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Dirección_x0020_Destinatario TEXT DEFAULT '',")));
 BA.debugLineNum = 408;BA.debugLine="sbCrearTabla.Append(\"Código_x0020_Postal_x0020_De";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Código_x0020_Postal_x0020_Destinatario TEXT DEFAULT '',")));
 BA.debugLineNum = 409;BA.debugLine="sbCrearTabla.Append(\"Población_x0020_Destinatario";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Población_x0020_Destinatario TEXT DEFAULT '',")));
 BA.debugLineNum = 410;BA.debugLine="sbCrearTabla.Append(\"Referencia_x0020_1 TEXT DEFA";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Referencia_x0020_1 TEXT DEFAULT '',")));
 BA.debugLineNum = 411;BA.debugLine="sbCrearTabla.Append(\"Bultos INTEGER DEFAULT 0,\")";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Bultos INTEGER DEFAULT 0,")));
 BA.debugLineNum = 412;BA.debugLine="sbCrearTabla.Append(\"Kilos_x0020_Reales INTEGER D";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Kilos_x0020_Reales INTEGER DEFAULT 0,")));
 BA.debugLineNum = 413;BA.debugLine="sbCrearTabla.Append(\"Volumen INTEGER DEFAULT 0,\")";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Volumen INTEGER DEFAULT 0,")));
 BA.debugLineNum = 414;BA.debugLine="sbCrearTabla.Append(\"Tipo TEXT COLLATE NOCASE DEF";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Tipo TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 415;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreCliente TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 416;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreResponsableCuenta TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 417;BA.debugLine="sbCrearTabla.Append(\"Entregado TEXT COLLATE NOCAS";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Entregado TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 418;BA.debugLine="sbCrearTabla.Append(\"EstadoActual TEXT COLLATE NO";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("EstadoActual TEXT COLLATE NOCASE DEFAULT '')")));
 BA.debugLineNum = 419;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _creartablatemporaldocumentosnavexpedicionespendientestxt(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1442);
if (RapidSub.canDelegate("creartablatemporaldocumentosnavexpedicionespendientestxt")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","creartablatemporaldocumentosnavexpedicionespendientestxt", __ref);}
ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT rsub = new ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT(null,__ref);
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
public static class ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT extends BA.ResumableSub {
public ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1442);
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
 BA.debugLineNum = 1443;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1446;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(32);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1447;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1450;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"CrearTablaTe";
Debug.ShouldStop(512);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(BA.ObjectToString("CrearTablaTemporalDocumentosExpedicionesPendientes")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1452;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1453;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 1454;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query CrearTablaTemporalDocumentosExpedicionesPendientes")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1455;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1456;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1457;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1460;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 1463;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4194304);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1464;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(8388608);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 1465;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(16777216);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1466;BA.debugLine="If sResp.ToUpperCase=\"OK\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_sresp.runMethod(true,"toUpperCase"),BA.ObjectToString("OK"))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1467;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1468;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1470;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Cr";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SP CrearTablaTemporalDocumentosExpedicionesPendientes "),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1471;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 1472;BA.debugLine="Accion=\"ERROR SP\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("ERROR SP");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1473;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 1477;BA.debugLine="Return mRes";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1478;BA.debugLine="End Sub";
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
public static RemoteObject  _creartablatemporaldocumentosreferenciastte(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CrearTablaTemporalDocumentosReferenciasTte (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1316);
if (RapidSub.canDelegate("creartablatemporaldocumentosreferenciastte")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","creartablatemporaldocumentosreferenciastte", __ref);}
ResumableSub_CrearTablaTemporalDocumentosReferenciasTte rsub = new ResumableSub_CrearTablaTemporalDocumentosReferenciasTte(null,__ref);
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
public static class ResumableSub_CrearTablaTemporalDocumentosReferenciasTte extends BA.ResumableSub {
public ResumableSub_CrearTablaTemporalDocumentosReferenciasTte(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CrearTablaTemporalDocumentosReferenciasTte (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1316);
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
 BA.debugLineNum = 1317;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1320;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(128);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1321;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1324;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(2048);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("CrearTablaTemporalDocumentosReferenciasTte")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1326;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosreferenciastte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1327;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 1328;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query CrearTablaTemporalDocumentosReferenciasTte")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1329;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1330;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1331;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1334;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 1337;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16777216);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1338;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(33554432);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 1339;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(67108864);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1340;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
Debug.ShouldStop(134217728);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1341;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Cr";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SP CrearTablaTemporalDocumentosReferenciasTte"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1342;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 1343;BA.debugLine="Accion=\"ERROR SP\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("ERROR SP");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1344;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1346;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1347;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 1351;BA.debugLine="Return mRes";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1352;BA.debugLine="End Sub";
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
public static void  _datosexpedicioninternaexpediciontransporte(RemoteObject __ref,RemoteObject _idtransporte,RemoteObject _numexp) throws Exception{
try {
		Debug.PushSubsStack("DatosExpedicionInternaExpedicionTransporte (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,752);
if (RapidSub.canDelegate("datosexpedicioninternaexpediciontransporte")) { __ref.runUserSub(false, "cexpedicionesperiodotxt","datosexpedicioninternaexpediciontransporte", __ref, _idtransporte, _numexp); return;}
ResumableSub_DatosExpedicionInternaExpedicionTransporte rsub = new ResumableSub_DatosExpedicionInternaExpedicionTransporte(null,__ref,_idtransporte,_numexp);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DatosExpedicionInternaExpedicionTransporte extends BA.ResumableSub {
public ResumableSub_DatosExpedicionInternaExpedicionTransporte(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref,RemoteObject _idtransporte,RemoteObject _numexp) {
this.parent = parent;
this.__ref = __ref;
this._idtransporte = _idtransporte;
this._numexp = _numexp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _idtransporte;
RemoteObject _numexp;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _docexp = RemoteObject.createImmutable("");
RemoteObject _offset_before_dialog = RemoteObject.createImmutable(0f);
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
int _i = 0;
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _docsel = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject group7;
int index7;
int groupLen7;
int step29;
int limit29;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DatosExpedicionInternaExpedicionTransporte (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,752);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IDTransporte", _idtransporte);
Debug.locals.put("NumExp", _numexp);
 BA.debugLineNum = 753;BA.debugLine="Wait For(ExpedicionInternaExpedicionTransporte(ID";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "datosexpedicioninternaexpediciontransporte"), __ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_expedicioninternaexpediciontransporte" /*RemoteObject*/ ,(Object)(_idtransporte),(Object)(_numexp)));
this.state = 39;
return;
case 39:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 754;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 755;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
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
 BA.debugLineNum = 756;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(524288);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 759;BA.debugLine="Dim lstOpciones As List";
Debug.ShouldStop(4194304);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 760;BA.debugLine="lstOpciones.Initialize";
Debug.ShouldStop(8388608);
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 762;BA.debugLine="For Each mData As Map In lstReg";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//for
this.state = 14;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group7 = _lstreg;
index7 = 0;
groupLen7 = group7.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 40;
if (true) break;

case 40:
//C
this.state = 14;
if (index7 < groupLen7) {
this.state = 9;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group7.runMethod(false,"Get",index7));Debug.locals.put("mData", _mdata);}
if (true) break;

case 41:
//C
this.state = 40;
index7++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 763;BA.debugLine="Dim DocExp As String=mData.Get(\"Documento\")";
Debug.ShouldStop(67108864);
_docexp = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocExp", _docexp);Debug.locals.put("DocExp", _docexp);
 BA.debugLineNum = 764;BA.debugLine="If DocExp<>\"\" Then";
Debug.ShouldStop(134217728);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_docexp,BA.ObjectToString(""))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 765;BA.debugLine="lstOpciones.Add(mData.Get(\"Documento\"))";
Debug.ShouldStop(268435456);
_lstopciones.runVoidMethod ("Add",(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))));
 if (true) break;

case 13:
//C
this.state = 41;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 770;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(2);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 772;BA.debugLine="Dialog.Title=\"Selecciona Documento NAV\"";
Debug.ShouldStop(8);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Documento NAV")));
 BA.debugLineNum = 773;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(16);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 774;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(32);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 775;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(64);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 776;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(128);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 777;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(256);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 779;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
Debug.ShouldStop(1024);
parent._utilidades.runVoidMethod ("_setlightthemedialog" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 780;BA.debugLine="Utilidades.SetLightThemeList(B4XListDlg)";
Debug.ShouldStop(2048);
parent._utilidades.runVoidMethod ("_setlightthemelist" /*RemoteObject*/ ,(Object)(_b4xlistdlg));
 BA.debugLineNum = 783;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(16384);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 784;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(32768);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 785;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
Debug.ShouldStop(65536);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 787;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(262144);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 788;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(524288);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 792;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(8388608);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 796;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(134217728);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 798;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(536870912);
if (true) break;

case 15:
//for
this.state = 18;
step29 = 1;
limit29 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 42;
if (true) break;

case 42:
//C
this.state = 18;
if ((step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29)) this.state = 17;
if (true) break;

case 43:
//C
this.state = 42;
_i = ((int)(0 + _i + step29)) ;
Debug.locals.put("i", _i);
if (true) break;

case 17:
//C
this.state = 43;
 BA.debugLineNum = 799;BA.debugLine="xclv.ResizeItem(i,60dip)";
Debug.ShouldStop(1073741824);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 803;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(4);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 804;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 806;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(32);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 807;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(64);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 808;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(128);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 811;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "datosexpedicioninternaexpediciontransporte"), _rsub);
this.state = 44;
return;
case 44:
//C
this.state = 23;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 813;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 814;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(8192);
if (true) break;

case 23:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
if (true) return ;
if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 816;BA.debugLine="Dim DocSel As String=B4XListDlg.SelectedItem";
Debug.ShouldStop(32768);
_docsel = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 817;BA.debugLine="Select True";
Debug.ShouldStop(65536);
if (true) break;

case 29:
//select
this.state = 38;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("CDEV"))))) {
case 0: {
this.state = 31;
if (true) break;
}
case 1: {
this.state = 33;
if (true) break;
}
case 2: {
this.state = 35;
if (true) break;
}
default: {
this.state = 37;
if (true) break;
}
}
if (true) break;

case 31:
//C
this.state = 38;
 BA.debugLineNum = 819;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(262144);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico Albaranes Venta")),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 33:
//C
this.state = 38;
 BA.debugLineNum = 821;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(1048576);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico recep. transferencia")),(Object)(BA.numberCast(int.class, 5745)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 35:
//C
this.state = 38;
 BA.debugLineNum = 823;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(4194304);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico envío devolución")),(Object)(BA.numberCast(int.class, 6650)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 825;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No es posibl";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No es posible abrir la ficha de navision del documento "),_docsel)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 826;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "datosexpedicioninternaexpediciontransporte"), _msa);
this.state = 45;
return;
case 45:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = -1;
;
 BA.debugLineNum = 828;BA.debugLine="End Sub";
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
public static RemoteObject  _documentosexpedicionesperiodo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionesPeriodo (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1356);
if (RapidSub.canDelegate("documentosexpedicionesperiodo")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","documentosexpedicionesperiodo", __ref);}
ResumableSub_DocumentosExpedicionesPeriodo rsub = new ResumableSub_DocumentosExpedicionesPeriodo(null,__ref);
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
public static class ResumableSub_DocumentosExpedicionesPeriodo extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesPeriodo(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionesPeriodo (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1356);
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
 BA.debugLineNum = 1357;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4096);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1360;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(32768);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1361;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1364;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(524288);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("DocumentosReferenciasExpedicionesTte")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1366;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1367;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 1368;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query DocumentosReferenciasExpedicionesTte")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1369;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1370;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1371;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1374;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 1375;BA.debugLine="Accion=\"SinDocumentos\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("SinDocumentos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1376;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1378;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1379;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1380;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1381;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 1384;BA.debugLine="Return mRes";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1385;BA.debugLine="End Sub";
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
public static RemoteObject  _documentosexpedicionesperiodobatch(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionesPeriodoBatch (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1268);
if (RapidSub.canDelegate("documentosexpedicionesperiodobatch")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","documentosexpedicionesperiodobatch", __ref);}
ResumableSub_DocumentosExpedicionesPeriodoBatch rsub = new ResumableSub_DocumentosExpedicionesPeriodoBatch(null,__ref);
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
public static class ResumableSub_DocumentosExpedicionesPeriodoBatch extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesPeriodoBatch(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _numregref1doc = RemoteObject.createImmutable(0);
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstcomandos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionesPeriodoBatch (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1268);
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
 BA.debugLineNum = 1270;BA.debugLine="Dim mResult As Map";
Debug.ShouldStop(2097152);
_mresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mResult", _mresult);
 BA.debugLineNum = 1271;BA.debugLine="mResult.Initialize";
Debug.ShouldStop(4194304);
_mresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 1272;BA.debugLine="mResult.Put(\"Success\", False)";
Debug.ShouldStop(8388608);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 1274;BA.debugLine="Dim NumRegRef1Doc As Int=Utilidades.FixNullInt(mS";
Debug.ShouldStop(33554432);
_numregref1doc = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblExpedicionesPeriodoTXT where Referencia_x0020_1<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("")}))))))));Debug.locals.put("NumRegRef1Doc", _numregref1doc);Debug.locals.put("NumRegRef1Doc", _numregref1doc);
 BA.debugLineNum = 1275;BA.debugLine="If NumRegRef1Doc=0 Then Return mResult";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_numregref1doc,BA.numberCast(double.class, 0))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1277;BA.debugLine="Wait For(CrearTablaTemporalDocumentosReferenciasT";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodobatch"), __ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_creartablatemporaldocumentosreferenciastte" /*RemoteObject*/ ));
this.state = 27;
return;
case 27:
//C
this.state = 7;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1278;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1279;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
Debug.ShouldStop(1073741824);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1282;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(2);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 1283;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(4);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 1288;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select Refer";
Debug.ShouldStop(128);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select Referencia_x0020_1 from tblExpedicionesPeriodoTXT where Referencia_x0020_1<>? order by Referencia_x0020_1")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("")})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1289;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(256);
if (true) break;

case 13:
//do while
this.state = 16;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 15;
if (true) break;
}
if (true) break;

case 15:
//C
this.state = 13;
 BA.debugLineNum = 1291;BA.debugLine="Log(\"Referencia_x0020_1 \" & rs.GetString(\"Refere";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","865536023",RemoteObject.concat(RemoteObject.createImmutable("Referencia_x0020_1 "),_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Referencia_x0020_1")))),0);
 BA.debugLineNum = 1293;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"";
Debug.ShouldStop(4096);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InsertarDatosTablaTemporalDocumentosReferenciasTte")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Referencia_x0020_1"))))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1294;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(8192);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1296;BA.debugLine="rs.Close";
Debug.ShouldStop(32768);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 1297;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodobatch"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 28;
return;
case 28:
//C
this.state = 17;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1298;BA.debugLine="If Success=False Then";
Debug.ShouldStop(131072);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1299;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible actualizar los datos de documentos expedición en la tabla temporal tblreferenciasexpedicionestemp.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1300;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodobatch"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 20;
;
 BA.debugLineNum = 1301;BA.debugLine="Return mResult";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 1304;BA.debugLine="Wait For(DocumentosExpedicionesPeriodo) complete";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodobatch"), __ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_documentosexpedicionesperiodo" /*RemoteObject*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 21;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1305;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1306;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
Debug.ShouldStop(33554432);
if (true) break;

case 21:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 23;
;}if (true) break;

case 23:
//C
this.state = 26;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 1308;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(134217728);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1309;BA.debugLine="mResult.put(\"Success\", True)";
Debug.ShouldStop(268435456);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 1310;BA.debugLine="mResult.put(\"lstReg\", lstReg)";
Debug.ShouldStop(536870912);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 1312;BA.debugLine="Return mResult";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 BA.debugLineNum = 1313;BA.debugLine="End Sub";
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
public static RemoteObject  _eliminartablatemporaldocumentosreferenciastte(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EliminarTablaTemporalDocumentosReferenciasTte (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1387);
if (RapidSub.canDelegate("eliminartablatemporaldocumentosreferenciastte")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","eliminartablatemporaldocumentosreferenciastte", __ref);}
ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte rsub = new ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte(null,__ref);
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
public static class ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte extends BA.ResumableSub {
public ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EliminarTablaTemporalDocumentosReferenciasTte (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1387);
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
 BA.debugLineNum = 1388;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"E";
Debug.ShouldStop(2048);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("EliminarTablaTemporalDocumentosReferenciasTte")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1389;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "eliminartablatemporaldocumentosreferenciastte"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1395;BA.debugLine="Return Null";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 1396;BA.debugLine="End Sub";
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
public static RemoteObject  _expedicioninternaexpediciontransporte(RemoteObject __ref,RemoteObject _idtransporte,RemoteObject _numexp) throws Exception{
try {
		Debug.PushSubsStack("ExpedicionInternaExpedicionTransporte (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,830);
if (RapidSub.canDelegate("expedicioninternaexpediciontransporte")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","expedicioninternaexpediciontransporte", __ref, _idtransporte, _numexp);}
ResumableSub_ExpedicionInternaExpedicionTransporte rsub = new ResumableSub_ExpedicionInternaExpedicionTransporte(null,__ref,_idtransporte,_numexp);
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
public static class ResumableSub_ExpedicionInternaExpedicionTransporte extends BA.ResumableSub {
public ResumableSub_ExpedicionInternaExpedicionTransporte(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref,RemoteObject _idtransporte,RemoteObject _numexp) {
this.parent = parent;
this.__ref = __ref;
this._idtransporte = _idtransporte;
this._numexp = _numexp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _idtransporte;
RemoteObject _numexp;
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
		Debug.PushSubsStack("ExpedicionInternaExpedicionTransporte (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,830);
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
Debug.locals.put("IDTransporte", _idtransporte);
Debug.locals.put("NumExp", _numexp);
 BA.debugLineNum = 832;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(-2147483648);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 833;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(1);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 834;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 835;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(4);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 836;BA.debugLine="Dim Comando As String=\"DatosExpedicionInternaExpe";
Debug.ShouldStop(8);
_comando = BA.ObjectToString("DatosExpedicionInternaExpedicionTransporte");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 839;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDTra";
Debug.ShouldStop(64);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_idtransporte),(_numexp)})),(Object)(__ref));
 BA.debugLineNum = 841;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "expedicioninternaexpediciontransporte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 842;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 843;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 844;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "expedicioninternaexpediciontransporte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 845;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 846;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 849;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 850;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 851;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 852;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de expedicion interna para el transporte y número de expedición seleccionados.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 853;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "expedicioninternaexpediciontransporte"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 856;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8388608);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 857;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
Debug.ShouldStop(16777216);
_mrespuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mrespuesta = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mRespuesta", _mrespuesta);Debug.locals.put("mRespuesta", _mrespuesta);
 BA.debugLineNum = 858;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
Debug.ShouldStop(33554432);
_sresp = BA.ObjectToString(_mrespuesta.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 859;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 860;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error recup";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error recuperando datos del SP "),_comando,RemoteObject.createImmutable("."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 861;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "expedicioninternaexpediciontransporte"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 BA.debugLineNum = 862;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 863;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 865;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 866;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 867;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
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
 BA.debugLineNum = 871;BA.debugLine="Return mRes";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 872;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 343;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="EventData.Consume";
Debug.ShouldStop(8388608);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 345;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("GenerarUUIDv4 (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("generaruuidv4")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","generaruuidv4", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _stp = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _c = RemoteObject.createImmutable(0);
 BA.debugLineNum = 467;BA.debugLine="Sub GenerarUUIDv4 As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 468;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(524288);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 469;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 470;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
Debug.ShouldStop(2097152);
{
final RemoteObject group3 = RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable((8)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((12))});
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = BA.numberCast(int.class, group3.getArrayElement(false,RemoteObject.createImmutable(index3)));Debug.locals.put("stp", _stp);
Debug.locals.put("stp", _stp);
 BA.debugLineNum = 471;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("-")));};
 BA.debugLineNum = 472;BA.debugLine="For n = 1 To stp";
Debug.ShouldStop(8388608);
{
final int step5 = 1;
final int limit5 = _stp.<Integer>get().intValue();
_n = 1 ;
for (;(step5 > 0 && _n <= limit5) || (step5 < 0 && _n >= limit5) ;_n = ((int)(0 + _n + step5))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 473;BA.debugLine="Dim c As Int = Rnd(0, 16)";
Debug.ShouldStop(16777216);
_c = cexpedicionesperiodotxt.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 474;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("<",_c,BA.numberCast(double.class, 10))) { 
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(48)}, "+",1, 1);Debug.locals.put("c", _c);}
else {
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(55)}, "+",1, 1);Debug.locals.put("c", _c);};
 BA.debugLineNum = 475;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 19))) { 
_c = cexpedicionesperiodotxt.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("8"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 476;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 14))) { 
_c = cexpedicionesperiodotxt.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("4"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 477;BA.debugLine="sb.Append(Chr(c))";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(cexpedicionesperiodotxt.__c.runMethod(true,"Chr",(Object)(_c)))));
 }
}Debug.locals.put("n", _n);
;
 }
}Debug.locals.put("stp", _stp);
;
 BA.debugLineNum = 480;BA.debugLine="Return sb.ToString.ToLowerCase";
Debug.ShouldStop(-2147483648);
if (true) return _sb.runMethod(true,"ToString").runMethod(true,"toLowerCase");
 BA.debugLineNum = 481;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Initialize (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 61;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 63;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, cexpedicionesperiodotxt.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, cexpedicionesperiodotxt.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 64;BA.debugLine="MeasurementCanvas.Initialize(p)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_p));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableclv1_accionsalirjamtableclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_AccionSalirJamTableCLV (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,347);
if (RapidSub.canDelegate("jamtableclv1_accionsalirjamtableclv")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","jamtableclv1_accionsalirjamtableclv", __ref);}
 BA.debugLineNum = 347;BA.debugLine="Sub JamTableCLV1_AccionSalirJamTableCLV";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 348;BA.debugLine="SalirModulo";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("JamTableCLV1_ItemClick (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,609);
if (RapidSub.canDelegate("jamtableclv1_itemclick")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","jamtableclv1_itemclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 609;BA.debugLine="Sub JamTableCLV1_ItemClick(Index As Int, Value As";
Debug.ShouldStop(1);
 BA.debugLineNum = 610;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(2);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 611;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
Debug.ShouldStop(4);
cexpedicionesperiodotxt.__c.runVoidMethod ("LogImpl","864618498",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 612;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(8);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 613;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(16);
cexpedicionesperiodotxt.__c.runVoidMethod ("LogImpl","864618500",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 615;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("JamTableCLV1_ItemLongClick (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,618);
if (RapidSub.canDelegate("jamtableclv1_itemlongclick")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","jamtableclv1_itemlongclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 618;BA.debugLine="Sub JamTableCLV1_ItemLongClick(Index As Int, Value";
Debug.ShouldStop(512);
 BA.debugLineNum = 619;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(1024);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 620;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
Debug.ShouldStop(2048);
cexpedicionesperiodotxt.__c.runVoidMethod ("LogImpl","864684034",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado botón secundario ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 621;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(4096);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 622;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(8192);
cexpedicionesperiodotxt.__c.runVoidMethod ("LogImpl","864684036",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 624;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("JamTableCLV1_LoadLayoutPanelItem (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,540);
if (RapidSub.canDelegate("jamtableclv1_loadlayoutpanelitem")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","jamtableclv1_loadlayoutpanelitem", __ref, _datositemindexclv);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tipo = RemoteObject.createImmutable("");
RemoteObject _estadoactual = RemoteObject.createImmutable("");
Debug.locals.put("DatosItemIndexCLV", _datositemindexclv);
 BA.debugLineNum = 540;BA.debugLine="Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemInde";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 541;BA.debugLine="Dim mData As Map = DatosItemIndexCLV.Value";
Debug.ShouldStop(268435456);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _datositemindexclv.getField(false,"Value" /*RemoteObject*/ ));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 542;BA.debugLine="Dim pnl As B4XView=DatosItemIndexCLV.Panel";
Debug.ShouldStop(536870912);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = _datositemindexclv.getField(false,"Panel" /*RemoteObject*/ );Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 543;BA.debugLine="pnl.LoadLayout(\"scrItemExpedicionesPeriodoTxT\")";
Debug.ShouldStop(1073741824);
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrItemExpedicionesPeriodoTxT")),__ref.getField(false, "ba"));
 BA.debugLineNum = 546;BA.debugLine="txtANO.Text=mData.Get(\"ANO\")";
Debug.ShouldStop(2);
__ref.getField(false,"_txtano" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))));
 BA.debugLineNum = 547;BA.debugLine="txtBULTOS.Text=mData.Get(\"Bultos\")";
Debug.ShouldStop(4);
__ref.getField(false,"_txtbultos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Bultos"))))));
 BA.debugLineNum = 548;BA.debugLine="txtCODDESTIN.Text=mData.Get(\"CODDESTIN\")";
Debug.ShouldStop(8);
__ref.getField(false,"_txtcoddestin" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN"))))));
 BA.debugLineNum = 549;BA.debugLine="txtCODEMPRESA.Text=mData.Get(\"CODEMPRESA\")";
Debug.ShouldStop(16);
__ref.getField(false,"_txtcodempresa" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODEMPRESA"))))));
 BA.debugLineNum = 550;BA.debugLine="txtCODORIGEN.Text=mData.Get(\"CODORIGEN\")";
Debug.ShouldStop(32);
__ref.getField(false,"_txtcodorigen" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN"))))));
 BA.debugLineNum = 551;BA.debugLine="txtCPOSTALDESTINATARIO.Text=mData.Get(\"Código_x00";
Debug.ShouldStop(64);
__ref.getField(false,"_txtcpostaldestinatario" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Código_x0020_Postal_x0020_Destinatario"))))));
 BA.debugLineNum = 552;BA.debugLine="txtDIRECCIONDESTINATARIO.Text=mData.Get(\"Direcció";
Debug.ShouldStop(128);
__ref.getField(false,"_txtdirecciondestinatario" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Dirección_x0020_Destinatario"))))));
 BA.debugLineNum = 554;BA.debugLine="txtKILOS.Text=mData.Get(\"Kilos_x0020_Reales\")";
Debug.ShouldStop(512);
__ref.getField(false,"_txtkilos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Kilos_x0020_Reales"))))));
 BA.debugLineNum = 555;BA.debugLine="txtNEXPED1.Text=mData.Get(\"NEXPED1\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtnexped1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1"))))));
 BA.debugLineNum = 556;BA.debugLine="txtNEXPED2.Text=mData.Get(\"NEXPED2\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtnexped2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2"))))));
 BA.debugLineNum = 557;BA.debugLine="txtNOMBREDESTINATARIO.Text=mData.Get(\"Nombre_x002";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtnombredestinatario" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre_x0020_Destinatario"))))));
 BA.debugLineNum = 559;BA.debugLine="txtDestino.Text=\"\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtdestino" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 560;BA.debugLine="txtPOBLACIONDESTINATARIO.Text=mData.Get(\"Població";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtpoblaciondestinatario" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Población_x0020_Destinatario"))))));
 BA.debugLineNum = 561;BA.debugLine="txtREFERENCIA1.Text=mData.Get(\"Referencia_x0020_1";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtreferencia1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Referencia_x0020_1"))))));
 BA.debugLineNum = 567;BA.debugLine="txtFECHAALTA.Text=mData.Get(\"Fecha_x0020_Alta\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtfechaalta" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fecha_x0020_Alta"))))));
 BA.debugLineNum = 569;BA.debugLine="txtFechaEntrega.Text=mData.Get(\"Fecha_x0020_Entre";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtfechaentrega" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fecha_x0020_Entrega"))))));
 BA.debugLineNum = 570;BA.debugLine="txtFechaSalida.Text=mData.Get(\"Fecha_x0020_salida";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txtfechasalida" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fecha_x0020_salida"))))));
 BA.debugLineNum = 572;BA.debugLine="txtNombreResponsableCuenta.Text=mData.Get(\"Nombre";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtnombreresponsablecuenta" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreResponsableCuenta"))))));
 BA.debugLineNum = 573;BA.debugLine="If txtNombreResponsableCuenta.Text<>\"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtnombreresponsablecuenta" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 574;BA.debugLine="txtNombreResponsableCuenta.Color=0xFFFFA500";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtnombreresponsablecuenta" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xffffa500)));
 };
 BA.debugLineNum = 576;BA.debugLine="Dim Tipo As String=mData.Get(\"Tipo\")";
Debug.ShouldStop(-2147483648);
_tipo = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tipo")))));Debug.locals.put("Tipo", _tipo);Debug.locals.put("Tipo", _tipo);
 BA.debugLineNum = 577;BA.debugLine="txtTipo.Text=Tipo";
Debug.ShouldStop(1);
__ref.getField(false,"_txttipo" /*RemoteObject*/ ).runMethod(true,"setText",_tipo);
 BA.debugLineNum = 578;BA.debugLine="If Tipo=\"LLEGADAS\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString("LLEGADAS"))) { 
 BA.debugLineNum = 579;BA.debugLine="lblIndicadorTipo.Color=0xFFF0E68C";
Debug.ShouldStop(4);
__ref.getField(false,"_lblindicadortipo" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xfff0e68c)));
 BA.debugLineNum = 580;BA.debugLine="lblIndicadorTipo.Text=Chr(0xF090)";
Debug.ShouldStop(8);
__ref.getField(false,"_lblindicadortipo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(cexpedicionesperiodotxt.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf090))))));
 }else {
 BA.debugLineNum = 582;BA.debugLine="lblIndicadorTipo.Color=0xC0FF7F50";
Debug.ShouldStop(32);
__ref.getField(false,"_lblindicadortipo" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xc0ff7f50)));
 BA.debugLineNum = 583;BA.debugLine="lblIndicadorTipo.Text=Chr(0xF08B)";
Debug.ShouldStop(64);
__ref.getField(false,"_lblindicadortipo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(cexpedicionesperiodotxt.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf08b))))));
 };
 BA.debugLineNum = 586;BA.debugLine="Dim EstadoActual As String=mData.Get(\"EstadoActua";
Debug.ShouldStop(512);
_estadoactual = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EstadoActual")))));Debug.locals.put("EstadoActual", _estadoactual);Debug.locals.put("EstadoActual", _estadoactual);
 BA.debugLineNum = 588;BA.debugLine="If EstadoActual=\"PENDIENTE DE ACTUALIZAR\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_estadoactual,BA.ObjectToString("PENDIENTE DE ACTUALIZAR"))) { 
 BA.debugLineNum = 589;BA.debugLine="txtEstadoActual.TextColor=xui.Color_Gray";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtestadoactual" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 590;BA.debugLine="txtEstadoActual.Text=\"STATUS PENDIENTE DE ACTUAL";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtestadoactual" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("STATUS PENDIENTE DE ACTUALIZAR"));
 }else {
 BA.debugLineNum = 592;BA.debugLine="txtEstadoActual.Text=EstadoActual";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtestadoactual" /*RemoteObject*/ ).runMethod(true,"setText",_estadoactual);
 BA.debugLineNum = 593;BA.debugLine="If EstadoActual.ToUpperCase.StartsWith(\"ENTREGAD";
Debug.ShouldStop(65536);
if (_estadoactual.runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ENTREGADO"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 594;BA.debugLine="txtEstadoActual.TextColor=xui.Color_Blue";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtestadoactual" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 }else {
 BA.debugLineNum = 596;BA.debugLine="txtEstadoActual.TextColor=0xFFDC143C";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtestadoactual" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffdc143c)));
 };
 };
 BA.debugLineNum = 599;BA.debugLine="txtEntregado.Text=mData.Get(\"Entregado\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtentregado" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Entregado"))))));
 BA.debugLineNum = 600;BA.debugLine="If EstadoActual=\"ENTREGADO\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_estadoactual,BA.ObjectToString("ENTREGADO"))) { 
 BA.debugLineNum = 601;BA.debugLine="lblIndicadorEstado.Color=0xFF7FFF00";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblindicadorestado" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff7fff00)));
 }else {
 BA.debugLineNum = 603;BA.debugLine="lblIndicadorEstado.Color=0xFFFF4500";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblindicadorestado" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xffff4500)));
 };
 BA.debugLineNum = 605;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("JamTableCLV1_MenuBarMenuItem_Action (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,362);
if (RapidSub.canDelegate("jamtableclv1_menubarmenuitem_action")) { __ref.runUserSub(false, "cexpedicionesperiodotxt","jamtableclv1_menubarmenuitem_action", __ref, _tagmenuitem); return;}
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
public ResumableSub_JamTableCLV1_MenuBarMenuItem_Action(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _tagmenuitem;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstdatoslineasseleccionadas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_MenuBarMenuItem_Action (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,362);
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
 BA.debugLineNum = 363;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//select
this.state = 19;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("EjemploAccionLineasSeleccionadas"),BA.ObjectToString("ActualizarStatusExpedicionesNoEntregadas"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 12;
if (true) break;
}
case 2: {
this.state = 18;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 365;BA.debugLine="If FechaFinalLong=0 Or FechaInicialLong=0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) || RemoteObject.solveBoolean("=",__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 366;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica fech";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Indica fecha inicial y fecha final.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 367;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "jamtableclv1_menubarmenuitem_action"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 7;
;
 BA.debugLineNum = 368;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 370;BA.debugLine="If FechaFinalLong<FechaInicialLong Then";
Debug.ShouldStop(131072);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ),__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 371;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha fi";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La fecha final no puede ser anterior a la fecha inicial.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 372;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "jamtableclv1_menubarmenuitem_action"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 10;
;
 BA.debugLineNum = 373;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 19;
;
 BA.debugLineNum = 375;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_actualizardatos" /*void*/ );
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 377;BA.debugLine="Dim lstDatosLineasSeleccionadas As List=JamTabl";
Debug.ShouldStop(16777216);
_lstdatoslineasseleccionadas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatoslineasseleccionadas = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getdatositemsseleccionados" /*RemoteObject*/ );Debug.locals.put("lstDatosLineasSeleccionadas", _lstdatoslineasseleccionadas);Debug.locals.put("lstDatosLineasSeleccionadas", _lstdatoslineasseleccionadas);
 BA.debugLineNum = 378;BA.debugLine="For Each mData As Map In lstDatosLineasSeleccio";
Debug.ShouldStop(33554432);
if (true) break;

case 13:
//for
this.state = 16;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group16 = _lstdatoslineasseleccionadas;
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 22;
if (true) break;

case 22:
//C
this.state = 16;
if (index16 < groupLen16) {
this.state = 15;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group16.runMethod(false,"Get",index16));Debug.locals.put("mData", _mdata);}
if (true) break;

case 23:
//C
this.state = 22;
index16++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 15:
//C
this.state = 23;
 BA.debugLineNum = 379;BA.debugLine="LogColor(\"DatosLineaSeleccionada : \" & mData,";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","864356369",RemoteObject.concat(RemoteObject.createImmutable("DatosLineaSeleccionada : "),_mdata),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 19;
Debug.locals.put("mData", _mdata);
;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 382;BA.debugLine="ActualizarStatusExpedicionesNoEntregadas";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_actualizarstatusexpedicionesnoentregadas" /*void*/ );
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static void  _mostrarestadosexpedicion(RemoteObject __ref,RemoteObject _lstestadosexpedicion) throws Exception{
try {
		Debug.PushSubsStack("MostrarEstadosExpedicion (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,876);
if (RapidSub.canDelegate("mostrarestadosexpedicion")) { __ref.runUserSub(false, "cexpedicionesperiodotxt","mostrarestadosexpedicion", __ref, _lstestadosexpedicion); return;}
ResumableSub_MostrarEstadosExpedicion rsub = new ResumableSub_MostrarEstadosExpedicion(null,__ref,_lstestadosexpedicion);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarEstadosExpedicion extends BA.ResumableSub {
public ResumableSub_MostrarEstadosExpedicion(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref,RemoteObject _lstestadosexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._lstestadosexpedicion = _lstestadosexpedicion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _lstestadosexpedicion;
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarEstadosExpedicion (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,876);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("lstEstadosExpedicion", _lstestadosexpedicion);
 BA.debugLineNum = 877;BA.debugLine="For Each mData As Map In lstEstadosExpedicion";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//for
this.state = 4;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group1 = _lstestadosexpedicion;
index1 = 0;
groupLen1 = group1.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if (index1 < groupLen1) {
this.state = 3;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group1.runMethod(false,"Get",index1));Debug.locals.put("mData", _mdata);}
if (true) break;

case 6:
//C
this.state = 5;
index1++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 878;BA.debugLine="Log(mData)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","865011714",BA.ObjectToString(_mdata),0);
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 880;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mData.Get(\"ESTA";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESTADO")))))),(Object)(RemoteObject.createImmutable("Estado actual")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 881;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "mostrarestadosexpedicion"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 882;BA.debugLine="End Sub";
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
public static void  _mostrarhistoricoestadosexpedicion(RemoteObject __ref,RemoteObject _lstestadosexpedicion) throws Exception{
try {
		Debug.PushSubsStack("MostrarHistoricoEstadosExpedicion (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,921);
if (RapidSub.canDelegate("mostrarhistoricoestadosexpedicion")) { __ref.runUserSub(false, "cexpedicionesperiodotxt","mostrarhistoricoestadosexpedicion", __ref, _lstestadosexpedicion); return;}
ResumableSub_MostrarHistoricoEstadosExpedicion rsub = new ResumableSub_MostrarHistoricoEstadosExpedicion(null,__ref,_lstestadosexpedicion);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarHistoricoEstadosExpedicion extends BA.ResumableSub {
public ResumableSub_MostrarHistoricoEstadosExpedicion(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref,RemoteObject _lstestadosexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._lstestadosexpedicion = _lstestadosexpedicion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _lstestadosexpedicion;
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _lstestadosaj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ticksfecha = RemoteObject.createImmutable(0L);
RemoteObject _mdataaj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pbaseflexgrid = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _headersfont = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
RemoteObject _rowsfont = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
RemoteObject _numcolumnastablatotales = RemoteObject.createImmutable(0);
RemoteObject _anchoscolumnas = null;
RemoteObject _colindex = RemoteObject.createImmutable(0);
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _anchocolumna = RemoteObject.createImmutable(0);
RemoteObject _mdatos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fila = null;
RemoteObject _anchototaltabla = RemoteObject.createImmutable(0);
int _rowindex = 0;
RemoteObject _altototal = RemoteObject.createImmutable(0);
RemoteObject _offset_before_dialog = RemoteObject.createImmutable(0f);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject group6;
int index6;
int groupLen6;
RemoteObject group25;
int index25;
int groupLen25;
RemoteObject group34;
int index34;
int groupLen34;
RemoteObject group37;
int index37;
int groupLen37;
int step49;
int limit49;
int step53;
int limit53;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarHistoricoEstadosExpedicion (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,921);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("lstEstadosExpedicion", _lstestadosexpedicion);
 BA.debugLineNum = 922;BA.debugLine="If lstEstadosExpedicion.Size=0 Then Return";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_lstestadosexpedicion.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
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
 BA.debugLineNum = 924;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(134217728);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 925;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd'T'HH:mm:ssXXX"));
 BA.debugLineNum = 927;BA.debugLine="Dim lstEstadosAj As List";
Debug.ShouldStop(1073741824);
_lstestadosaj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEstadosAj", _lstestadosaj);
 BA.debugLineNum = 928;BA.debugLine="lstEstadosAj.Initialize";
Debug.ShouldStop(-2147483648);
_lstestadosaj.runVoidMethod ("Initialize");
 BA.debugLineNum = 929;BA.debugLine="For Each mData As Map In lstEstadosExpedicion";
Debug.ShouldStop(1);
if (true) break;

case 7:
//for
this.state = 10;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group6 = _lstestadosexpedicion;
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 10;
if (index6 < groupLen6) {
this.state = 9;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group6.runMethod(false,"Get",index6));Debug.locals.put("mData", _mdata);}
if (true) break;

case 38:
//C
this.state = 37;
index6++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 9:
//C
this.state = 38;
 BA.debugLineNum = 933;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
Debug.ShouldStop(16);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd'T'HH:mm:ssXXX"));
 BA.debugLineNum = 934;BA.debugLine="Dim TicksFecha As Long=DateTime.DateParse(mData.";
Debug.ShouldStop(32);
_ticksfecha = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FECHAESTADO")))))));Debug.locals.put("TicksFecha", _ticksfecha);Debug.locals.put("TicksFecha", _ticksfecha);
 BA.debugLineNum = 935;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(64);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 936;BA.debugLine="Dim mDataAj As Map=CreateMap(\"Centro\":mData.Get(";
Debug.ShouldStop(128);
_mdataaj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataaj = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Centro")),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CENTRO")))),RemoteObject.createImmutable(("Estado")),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESTADO")))),RemoteObject.createImmutable(("Fecha")),(RemoteObject.concat(parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticksfecha)),RemoteObject.createImmutable(" "),parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_ticksfecha))))}));Debug.locals.put("mDataAj", _mdataaj);Debug.locals.put("mDataAj", _mdataaj);
 BA.debugLineNum = 937;BA.debugLine="lstEstadosAj.Add(mDataAj)";
Debug.ShouldStop(256);
_lstestadosaj.runVoidMethod ("Add",(Object)((_mdataaj.getObject())));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 939;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(1024);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 941;BA.debugLine="Dim pBaseFlexGrid As B4XView = xui.CreatePanel(\"\"";
Debug.ShouldStop(4096);
_pbaseflexgrid = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pbaseflexgrid = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pBaseFlexGrid", _pbaseflexgrid);Debug.locals.put("pBaseFlexGrid", _pbaseflexgrid);
 BA.debugLineNum = 942;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip,";
Debug.ShouldStop(8192);
_pbaseflexgrid.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500))))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))}, "*",0, 0))));
 BA.debugLineNum = 944;BA.debugLine="pBaseFlexGrid.LoadLayout(\"scrDialogFlexGrid\")";
Debug.ShouldStop(32768);
_pbaseflexgrid.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrDialogFlexGrid")),__ref.getField(false, "ba"));
 BA.debugLineNum = 946;BA.debugLine="Dim HeadersFont As Font=xui.CreateDefaultfont(15)";
Debug.ShouldStop(131072);
_headersfont = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_headersfont = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 15))).getObject());Debug.locals.put("HeadersFont", _headersfont);Debug.locals.put("HeadersFont", _headersfont);
 BA.debugLineNum = 947;BA.debugLine="FlexGridDialog.HeaderFont=HeadersFont";
Debug.ShouldStop(262144);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_setvvvvvvvvvvvvvvvv7",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject()));
 BA.debugLineNum = 949;BA.debugLine="Dim RowsFont As Font=xui.CreateDefaultfont(14)";
Debug.ShouldStop(1048576);
_rowsfont = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_rowsfont = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14))).getObject());Debug.locals.put("RowsFont", _rowsfont);Debug.locals.put("RowsFont", _rowsfont);
 BA.debugLineNum = 950;BA.debugLine="FlexGridDialog.Font=RowsFont";
Debug.ShouldStop(2097152);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_setvvvvvvvvvvvvvvvv4",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject()));
 BA.debugLineNum = 951;BA.debugLine="Dim NumColumnasTablaTotales As Int=mDataAj.Size";
Debug.ShouldStop(4194304);
_numcolumnastablatotales = _mdataaj.runMethod(true,"getSize");Debug.locals.put("NumColumnasTablaTotales", _numcolumnastablatotales);Debug.locals.put("NumColumnasTablaTotales", _numcolumnastablatotales);
 BA.debugLineNum = 952;BA.debugLine="Dim AnchosColumnas(NumColumnasTablaTotales) As In";
Debug.ShouldStop(8388608);
_anchoscolumnas = RemoteObject.createNewArray ("int", new int[] {_numcolumnastablatotales.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("AnchosColumnas", _anchoscolumnas);
 BA.debugLineNum = 953;BA.debugLine="FlexGridDialog.SetColsNumber(NumColumnasTablaTota";
Debug.ShouldStop(16777216);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvv1",(Object)(_numcolumnastablatotales));
 BA.debugLineNum = 954;BA.debugLine="Dim ColIndex As Int";
Debug.ShouldStop(33554432);
_colindex = RemoteObject.createImmutable(0);Debug.locals.put("ColIndex", _colindex);
 BA.debugLineNum = 956;BA.debugLine="For Each k As String In mDataAj.Keys";
Debug.ShouldStop(134217728);
if (true) break;

case 11:
//for
this.state = 18;
group25 = _mdataaj.runMethod(false,"Keys");
index25 = 0;
groupLen25 = group25.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 18;
if (index25 < groupLen25) {
this.state = 13;
_k = BA.ObjectToString(group25.runMethod(false,"Get",index25));Debug.locals.put("k", _k);}
if (true) break;

case 40:
//C
this.state = 39;
index25++;
Debug.locals.put("k", _k);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 958;BA.debugLine="FlexGridDialog.SetColName(ColIndex,k)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvv4",(Object)(_colindex),(Object)(_k));
 BA.debugLineNum = 960;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex)";
Debug.ShouldStop(-2147483648);
_anchocolumna = _anchoscolumnas.getArrayElement(true,_colindex);Debug.locals.put("AnchoColumna", _anchocolumna);Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 961;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(Fl";
Debug.ShouldStop(1);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("<",_anchocolumna,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvvv2").getArrayElement(true,_colindex)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 962;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(Flex";
Debug.ShouldStop(2);
_anchocolumna = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvvv2").getArrayElement(true,_colindex)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0));Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 963;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
Debug.ShouldStop(4);
_anchoscolumnas.setArrayElement (_anchocolumna,_colindex);
 if (true) break;

case 17:
//C
this.state = 40;
;
 BA.debugLineNum = 966;BA.debugLine="ColIndex=ColIndex+1";
Debug.ShouldStop(32);
_colindex = RemoteObject.solve(new RemoteObject[] {_colindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColIndex", _colindex);
 if (true) break;
if (true) break;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 969;BA.debugLine="For Each mDatos As Map In lstEstadosAj";
Debug.ShouldStop(256);

case 18:
//for
this.state = 29;
_mdatos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group34 = _lstestadosaj;
index34 = 0;
groupLen34 = group34.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDatos", _mdatos);
this.state = 41;
if (true) break;

case 41:
//C
this.state = 29;
if (index34 < groupLen34) {
this.state = 20;
_mdatos = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group34.runMethod(false,"Get",index34));Debug.locals.put("mDatos", _mdatos);}
if (true) break;

case 42:
//C
this.state = 41;
index34++;
Debug.locals.put("mDatos", _mdatos);
if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 970;BA.debugLine="Dim Fila(NumColumnasTablaTotales) As String";
Debug.ShouldStop(512);
_fila = RemoteObject.createNewArray ("String", new int[] {_numcolumnastablatotales.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 971;BA.debugLine="Dim ColIndex As Int";
Debug.ShouldStop(1024);
_colindex = RemoteObject.createImmutable(0);Debug.locals.put("ColIndex", _colindex);
 BA.debugLineNum = 972;BA.debugLine="For Each k As String In mDatos.Keys";
Debug.ShouldStop(2048);
if (true) break;

case 21:
//for
this.state = 28;
group37 = _mdatos.runMethod(false,"Keys");
index37 = 0;
groupLen37 = group37.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 43;
if (true) break;

case 43:
//C
this.state = 28;
if (index37 < groupLen37) {
this.state = 23;
_k = BA.ObjectToString(group37.runMethod(false,"Get",index37));Debug.locals.put("k", _k);}
if (true) break;

case 44:
//C
this.state = 43;
index37++;
Debug.locals.put("k", _k);
if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 973;BA.debugLine="Fila(ColIndex)=mDatos.get(k)";
Debug.ShouldStop(4096);
_fila.setArrayElement (BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k)))),_colindex);
 BA.debugLineNum = 974;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex";
Debug.ShouldStop(8192);
_anchocolumna = _anchoscolumnas.getArrayElement(true,_colindex);Debug.locals.put("AnchoColumna", _anchocolumna);Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 975;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(m";
Debug.ShouldStop(16384);
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean("<",_anchocolumna,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 976;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(mDa";
Debug.ShouldStop(32768);
_anchocolumna = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0));Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 977;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
Debug.ShouldStop(65536);
_anchoscolumnas.setArrayElement (_anchocolumna,_colindex);
 if (true) break;

case 27:
//C
this.state = 44;
;
 BA.debugLineNum = 979;BA.debugLine="ColIndex=ColIndex+1";
Debug.ShouldStop(262144);
_colindex = RemoteObject.solve(new RemoteObject[] {_colindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColIndex", _colindex);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 42;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 981;BA.debugLine="FlexGridDialog.AddRow(Fila,False)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_v7",(Object)((_fila)),(Object)(parent.__c.getField(true,"False")));
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
Debug.locals.put("mDatos", _mdatos);
;
 BA.debugLineNum = 985;BA.debugLine="Dim AnchoTotalTabla As Int";
Debug.ShouldStop(16777216);
_anchototaltabla = RemoteObject.createImmutable(0);Debug.locals.put("AnchoTotalTabla", _anchototaltabla);
 BA.debugLineNum = 986;BA.debugLine="For ColIndex=0 To NumColumnasTablaTotales-1";
Debug.ShouldStop(33554432);
if (true) break;

case 30:
//for
this.state = 33;
step49 = 1;
limit49 = RemoteObject.solve(new RemoteObject[] {_numcolumnastablatotales,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_colindex = BA.numberCast(int.class, 0) ;
Debug.locals.put("ColIndex", _colindex);
this.state = 45;
if (true) break;

case 45:
//C
this.state = 33;
if ((step49 > 0 && _colindex.<Integer>get().intValue() <= limit49) || (step49 < 0 && _colindex.<Integer>get().intValue() >= limit49)) this.state = 32;
if (true) break;

case 46:
//C
this.state = 45;
_colindex = RemoteObject.createImmutable((int)(0 + _colindex.<Integer>get().intValue() + step49)) ;
Debug.locals.put("ColIndex", _colindex);
if (true) break;

case 32:
//C
this.state = 46;
 BA.debugLineNum = 987;BA.debugLine="FlexGridDialog.SetColWidth(ColIndex,AnchosColumn";
Debug.ShouldStop(67108864);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvv5",(Object)(_colindex),(Object)(_anchoscolumnas.getArrayElement(true,_colindex)));
 BA.debugLineNum = 988;BA.debugLine="AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(C";
Debug.ShouldStop(134217728);
_anchototaltabla = RemoteObject.solve(new RemoteObject[] {_anchototaltabla,_anchoscolumnas.getArrayElement(true,_colindex)}, "+",1, 1);Debug.locals.put("AnchoTotalTabla", _anchototaltabla);
 if (true) break;
if (true) break;
Debug.locals.put("ColIndex", _colindex);
;
 BA.debugLineNum = 991;BA.debugLine="For RowIndex=0 To FlexGridDialog.RowCount-1";
Debug.ShouldStop(1073741824);

case 33:
//for
this.state = 36;
step53 = 1;
limit53 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(true,"_getvvvvvvvvvvvvvv6"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_rowindex = 0 ;
Debug.locals.put("RowIndex", _rowindex);
this.state = 47;
if (true) break;

case 47:
//C
this.state = 36;
if ((step53 > 0 && _rowindex <= limit53) || (step53 < 0 && _rowindex >= limit53)) this.state = 35;
if (true) break;

case 48:
//C
this.state = 47;
_rowindex = ((int)(0 + _rowindex + step53)) ;
Debug.locals.put("RowIndex", _rowindex);
if (true) break;

case 35:
//C
this.state = 48;
 BA.debugLineNum = 992;BA.debugLine="FlexGridDialog.SetRowHeight(RowIndex,50dip)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvvvv5",(Object)(BA.numberCast(int.class, _rowindex)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 if (true) break;
if (true) break;

case 36:
//C
this.state = -1;
Debug.locals.put("RowIndex", _rowindex);
;
 BA.debugLineNum = 994;BA.debugLine="Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.Ro";
Debug.ShouldStop(2);
_altototal = BA.numberCast(int.class, parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(true,"_getvvvvvvvvvvvvvv6")),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "*+",1, 1))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))}, "*",0, 0)))));Debug.locals.put("AltoTotal", _altototal);Debug.locals.put("AltoTotal", _altototal);
 BA.debugLineNum = 995;BA.debugLine="FlexGridDialog.Base.Width=AnchoTotalTabla";
Debug.ShouldStop(4);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvv0").runMethod(true,"setWidth",BA.numberCast(double.class, _anchototaltabla));
 BA.debugLineNum = 996;BA.debugLine="FlexGridDialog.Base.Height=AltoTotal";
Debug.ShouldStop(8);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvv0").runMethod(true,"setHeight",BA.numberCast(double.class, _altototal));
 BA.debugLineNum = 998;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTot";
Debug.ShouldStop(32);
_pbaseflexgrid.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_anchototaltabla,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_altototal,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "+",1, 1))));
 BA.debugLineNum = 1000;BA.debugLine="Sleep(100)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "mostrarhistoricoestadosexpedicion"),BA.numberCast(int.class, 100));
this.state = 49;
return;
case 49:
//C
this.state = -1;
;
 BA.debugLineNum = 1001;BA.debugLine="FlexGridDialog.Invalidate";
Debug.ShouldStop(256);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvv1");
 BA.debugLineNum = 1003;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(1024);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 1005;BA.debugLine="Dialog.Title=\"Histórico Estados Expedición\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Histórico Estados Expedición")));
 BA.debugLineNum = 1006;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseF";
Debug.ShouldStop(8192);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_pbaseflexgrid),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1007;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(16384);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 1008;BA.debugLine="bOK.TextSize=16";
Debug.ShouldStop(32768);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 1009;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "mostrarhistoricoestadosexpedicion"), _rsub);
this.state = 50;
return;
case 50:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1011;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 1012;BA.debugLine="End Sub";
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
public static RemoteObject  _mostrarincidenciasexpedicion(RemoteObject __ref,RemoteObject _lstincidenciasexpedicion) throws Exception{
try {
		Debug.PushSubsStack("MostrarIncidenciasExpedicion (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,1015);
if (RapidSub.canDelegate("mostrarincidenciasexpedicion")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","mostrarincidenciasexpedicion", __ref, _lstincidenciasexpedicion);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("lstIncidenciasExpedicion", _lstincidenciasexpedicion);
 BA.debugLineNum = 1015;BA.debugLine="Sub MostrarIncidenciasExpedicion(lstIncidenciasExp";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1016;BA.debugLine="For Each mData As Map In lstIncidenciasExpedicion";
Debug.ShouldStop(8388608);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group1 = _lstincidenciasexpedicion;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group1.runMethod(false,"Get",index1));Debug.locals.put("mData", _mdata);
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1017;BA.debugLine="Log(mData)";
Debug.ShouldStop(16777216);
cexpedicionesperiodotxt.__c.runVoidMethod ("LogImpl","865208322",BA.ObjectToString(_mdata),0);
 }
}Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 1021;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("SalirModulo (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cexpedicionesperiodotxt","salirmodulo", __ref);}
 BA.debugLineNum = 356;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(8);
 BA.debugLineNum = 357;BA.debugLine="frm.Close";
Debug.ShouldStop(16);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 358;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(32);
cexpedicionesperiodotxt._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Show (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cexpedicionesperiodotxt","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cexpedicionesperiodotxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesperiodotxt parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cexpedicionesperiodotxt) ","cexpedicionesperiodotxt",31,__ref.getField(false, "ba"),__ref,70);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 72;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(128);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 73;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(256);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 74;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(512);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 75;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(1024);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 76;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 77;BA.debugLine="frm.RootPane.LoadLayout(\"scrExpedicionesPeriodoTX";
Debug.ShouldStop(4096);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrExpedicionesPeriodoTXT")));
 BA.debugLineNum = 78;BA.debugLine="Sleep(0)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "show"),BA.numberCast(int.class, 0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 BA.debugLineNum = 81;BA.debugLine="frm.Title=Main.PrefijoTitleForms &  \"  \" & \"Exped";
Debug.ShouldStop(65536);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("  "),RemoteObject.createImmutable("Expediciones Periodo TXT")));
 BA.debugLineNum = 83;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 86;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 88;BA.debugLine="frm.Show";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 95;BA.debugLine="JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarA";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 96;BA.debugLine="JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarL";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 97;BA.debugLine="JamTableCLV1.AddMenuItemToMenuInMenuBar(\"Actualiz";
Debug.ShouldStop(1);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_addmenuitemtomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Actualizar Status Expediciones No Entregadas")),(Object)(BA.ObjectToString("ActualizarStatusExpedicionesNoEntregadas")),(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 99;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.ConfigurarT";
Debug.ShouldStop(4);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_configurartableclv" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ListaExpedicionesPeriodoTXT.json")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 100;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 101;BA.debugLine="Log(mRes)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","863963167",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 102;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 103;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 104;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesperiodotxt", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
 BA.debugLineNum = 105;BA.debugLine="frm.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 106;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 113;BA.debugLine="JamTableCLV1.AlturaItems=180dip";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setalturaitems" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 180))));
 BA.debugLineNum = 115;BA.debugLine="JamTableCLV1.ModoSeleccionItems=JamTableCLV1.Modo";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmodoseleccionitems" /*RemoteObject*/ ,__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_modoseleccionindividualperm" /*RemoteObject*/ ));
 BA.debugLineNum = 117;BA.debugLine="JamTableCLV1.AlturaSeparadorPaneles=2dip";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setalturaseparadorpaneles" /*RemoteObject*/ ,BA.numberCast(float.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 118;BA.debugLine="JamTableCLV1.ColorSeparadorPaneles=0xFF696969";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setcolorseparadorpaneles",BA.numberCast(int.class, ((int)0xff696969)));
 BA.debugLineNum = 120;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.ShouldStop(8388608);
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
this.state = -1;
;
 BA.debugLineNum = 122;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 124;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.cexpedicionesperiodotxt.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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