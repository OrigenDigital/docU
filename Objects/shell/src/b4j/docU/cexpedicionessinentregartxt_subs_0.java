package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cexpedicionessinentregartxt_subs_0 {


public static void  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("actualizardatos")) { __ref.runUserSub(false, "cexpedicionessinentregartxt","actualizardatos", __ref); return;}
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
public ResumableSub_ActualizarDatos(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _lstregdocsexpptes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _micli = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _numexpptes = RemoteObject.createImmutable(0);
RemoteObject _intervalo = RemoteObject.createImmutable(0);
RemoteObject _idxaqctestados = RemoteObject.createImmutable(0);
RemoteObject _rsestados = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdataestado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _estadoexp = RemoteObject.createImmutable("");
RemoteObject group33;
int index33;
int groupLen33;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,112);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 113;BA.debugLine="JamTableCLV1.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 118;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 119;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblExpedicionesSin";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblExpedicionesSinEntregar")));
 BA.debugLineNum = 120;BA.debugLine="wait for(cmAuxTxT.ObtenerExpedicionesSinEntregarT";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), parent._cmauxtxt.runMethod(false,"_obtenerexpedicionessinentregartxt" /*RemoteObject*/ ));
this.state = 80;
return;
case 80:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 122;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 123;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 124;BA.debugLine="SalirModulo";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 125;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 128;BA.debugLine="Dim lstRes As List=mRes.Get(\"lstRes\")";
Debug.ShouldStop(-2147483648);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 136;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 137;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
Debug.ShouldStop(256);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblExpedicionesSinEntregar")),(Object)(_lstres));
 BA.debugLineNum = 139;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(1024);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 140;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(2048);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 141;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(4096);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblExpedicionesSinEntregar")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 142;BA.debugLine="Do While rs.nextrow";
Debug.ShouldStop(8192);
if (true) break;

case 5:
//do while
this.state = 8;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
 BA.debugLineNum = 146;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblExpedicionesS";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblExpedicionesSinEntregar set FechaSalida=? where CODORIGEN=? And CODDESTIN=? And NEXPED1=? And NEXPED2=? And ANO=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FECHA_x0020_SALIDA")))))),(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CODORIGEN")))),(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CODDESTIN")))),(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("NEXPED1")))),(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("NEXPED2")))),(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ANO"))))})))));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 149;BA.debugLine="rs.Close";
Debug.ShouldStop(1048576);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 150;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
Debug.ShouldStop(2097152);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 151;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _senderfilter);
this.state = 81;
return;
case 81:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 152;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","866125864",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 154;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(33554432);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 156;BA.debugLine="Dim lstRegDocsExpPtes As List";
Debug.ShouldStop(134217728);
_lstregdocsexpptes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegDocsExpPtes", _lstregdocsexpptes);
 BA.debugLineNum = 157;BA.debugLine="lstRegDocsExpPtes.Initialize";
Debug.ShouldStop(268435456);
_lstregdocsexpptes.runVoidMethod ("Initialize");
 BA.debugLineNum = 158;BA.debugLine="Wait For(DocumentosExpedicionesSinEntregarBatch)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), __ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_documentosexpedicionessinentregarbatch" /*RemoteObject*/ ));
this.state = 82;
return;
case 82:
//C
this.state = 9;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 159;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
Debug.ShouldStop(1073741824);
_success = BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Success")))));Debug.locals.put("Success", _success);Debug.locals.put("Success", _success);
 BA.debugLineNum = 160;BA.debugLine="If Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 9:
//if
this.state = 12;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 161;BA.debugLine="Dim lstRegDocsExpPtes As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(1);
_lstregdocsexpptes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstregdocsexpptes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstRegDocsExpPtes", _lstregdocsexpptes);Debug.locals.put("lstRegDocsExpPtes", _lstregdocsexpptes);
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 164;BA.debugLine="Wait For(EliminarTablaTemporalDocumentosReferenci";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), __ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_eliminartablatemporaldocumentosreferenciastte" /*RemoteObject*/ ));
this.state = 83;
return;
case 83:
//C
this.state = 13;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 166;BA.debugLine="If lstRegDocsExpPtes.Size>0 Then";
Debug.ShouldStop(32);
if (true) break;

case 13:
//if
this.state = 27;
if (RemoteObject.solveBoolean(">",_lstregdocsexpptes.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 197;BA.debugLine="For Each m As Map In lstRegDocsExpPtes";
Debug.ShouldStop(16);
if (true) break;

case 16:
//for
this.state = 26;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group33 = _lstregdocsexpptes;
index33 = 0;
groupLen33 = group33.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 84;
if (true) break;

case 84:
//C
this.state = 26;
if (index33 < groupLen33) {
this.state = 18;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group33.runMethod(false,"Get",index33));Debug.locals.put("m", _m);}
if (true) break;

case 85:
//C
this.state = 84;
index33++;
Debug.locals.put("m", _m);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 200;BA.debugLine="Wait For(ClienteResponsableCuentaDocumento(m.Ge";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), __ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_clienteresponsablecuentadocumento" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))))));
this.state = 86;
return;
case 86:
//C
this.state = 19;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 201;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(256);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 202;BA.debugLine="If Accion=\"ErrConn\" Then";
Debug.ShouldStop(512);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("ErrConn"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 203;BA.debugLine="SalirModulo";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 204;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 206;BA.debugLine="If Accion=\"OK\" Then";
Debug.ShouldStop(8192);

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("OK"))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 207;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(16384);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 208;BA.debugLine="Dim mICli As Map=lstReg.Get(0)";
Debug.ShouldStop(32768);
_micli = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_micli = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mICli", _micli);Debug.locals.put("mICli", _micli);
 BA.debugLineNum = 210;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblExpedicione";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblExpedicionesSinEntregar set NombreCliente=?, NombreResponsableCuenta=? where trim(REFERENCIA1)=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {_micli.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreCliente")))),_micli.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableCuenta")))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReferenciaExpedicionTransporte"))))})))));
 if (true) break;

case 25:
//C
this.state = 85;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 215;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBa";
Debug.ShouldStop(4194304);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 216;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _senderfilter);
this.state = 87;
return;
case 87:
//C
this.state = 27;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 217;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","866125929",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 223;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(1073741824);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblExpedicionesSinEntregar order by FechaSalida")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 224;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
Debug.ShouldStop(-2147483648);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 225;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _rsub);
this.state = 88;
return;
case 88:
//C
this.state = 28;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 226;BA.debugLine="rs.Close";
Debug.ShouldStop(2);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 227;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 228;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(8);
if (true) break;

case 28:
//if
this.state = 46;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 229;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(16);
if (true) break;

case 31:
//if
this.state = 38;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 230;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 231;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 89;
return;
case 89:
//C
this.state = 34;
;
 BA.debugLineNum = 233;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 234;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 90;
return;
case 90:
//C
this.state = 34;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 235;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(1024);
if (true) break;

case 34:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 236;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 237;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 37:
//C
this.state = 38;
;
 BA.debugLineNum = 240;BA.debugLine="ExitApplication";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 242;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(131072);

case 38:
//if
this.state = 45;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 243;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then";
Debug.ShouldStop(262144);
if (true) break;

case 41:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 244;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay Exp";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No hay Expediciones de TXT sin entregar.\n"),RemoteObject.createImmutable("(¿Error en webservice?)")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 246;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 91;
return;
case 91:
//C
this.state = 44;
;
 BA.debugLineNum = 247;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 249;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 250;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 92;
return;
case 92:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = 47;
;
 BA.debugLineNum = 255;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Actualizar";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Actualizar de forma masiva los estados de las expediciciones pendientes?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 256;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 93;
return;
case 93:
//C
this.state = 47;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 257;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(1);
if (true) break;

case 47:
//if
this.state = 79;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 259;BA.debugLine="Dim NumExpPtes As Int=mSQL.ExecQuerySingleResult";
Debug.ShouldStop(4);
_numexpptes = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("select count(*) from tblExpedicionesSinEntregar"))));Debug.locals.put("NumExpPtes", _numexpptes);Debug.locals.put("NumExpPtes", _numexpptes);
 BA.debugLineNum = 260;BA.debugLine="Dim Intervalo As Int=100/NumExpPtes";
Debug.ShouldStop(8);
_intervalo = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_numexpptes}, "/",0, 0));Debug.locals.put("Intervalo", _intervalo);Debug.locals.put("Intervalo", _intervalo);
 BA.debugLineNum = 261;BA.debugLine="jamCircularProgressBar1.Visible=True";
Debug.ShouldStop(16);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvisible" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 262;BA.debugLine="Dim iDxAQctEstados As Int";
Debug.ShouldStop(32);
_idxaqctestados = RemoteObject.createImmutable(0);Debug.locals.put("iDxAQctEstados", _idxaqctestados);
 BA.debugLineNum = 263;BA.debugLine="Dim rsEstados As ResultSet=mSQL.ExecQuery(\"selec";
Debug.ShouldStop(64);
_rsestados = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsestados = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblExpedicionesSinEntregar order by FechaSalida")));Debug.locals.put("rsEstados", _rsestados);Debug.locals.put("rsEstados", _rsestados);
 BA.debugLineNum = 264;BA.debugLine="Do While rsEstados.NextRow";
Debug.ShouldStop(128);
if (true) break;

case 50:
//do while
this.state = 59;
while (_rsestados.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 52;
if (true) break;
}
if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 265;BA.debugLine="Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(rs";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), parent._cmauxtxt.runMethod(false,"_obtenerestadoexpediciontxt" /*RemoteObject*/ ,(Object)(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CODORIGEN")))),(Object)(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CODDESTIN")))),(Object)(_rsestados.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("NEXPED1")))),(Object)(_rsestados.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("NEXPED2")))),(Object)(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ANO"))))));
this.state = 94;
return;
case 94:
//C
this.state = 53;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 266;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(512);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 267;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 53:
//if
this.state = 58;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
 BA.debugLineNum = 268;BA.debugLine="jamCircularProgressBar1.Value=0";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 269;BA.debugLine="jamCircularProgressBar1.Visible=False";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvisible" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 270;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha ac";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha actualizado el estado de las expediciones no entregadas")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 271;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 95;
return;
case 95:
//C
this.state = 58;
;
 BA.debugLineNum = 272;BA.debugLine="Exit";
Debug.ShouldStop(32768);
this.state = 59;
if (true) break;
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 274;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get";
Debug.ShouldStop(131072);
_lstdatosestadosexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);
 BA.debugLineNum = 275;BA.debugLine="Dim mDataEstado As Map=lstDatosEstadosExpedici";
Debug.ShouldStop(262144);
_mdataestado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataestado = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstdatosestadosexpedicion.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mDataEstado", _mdataestado);Debug.locals.put("mDataEstado", _mdataestado);
 BA.debugLineNum = 276;BA.debugLine="Dim EstadoExp As String=mDataEstado.Get(\"ESTAD";
Debug.ShouldStop(524288);
_estadoexp = BA.ObjectToString(_mdataestado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESTADO")))));Debug.locals.put("EstadoExp", _estadoexp);Debug.locals.put("EstadoExp", _estadoexp);
 BA.debugLineNum = 277;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesSinE";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblExpedicionesSinEntregar set ESTADO=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_estadoexp),(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CODORIGEN")))),(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CODDESTIN")))),(_rsestados.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("NEXPED1")))),(_rsestados.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("NEXPED2")))),(_rsestados.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ANO"))))})))));
 if (true) break;

case 58:
//C
this.state = 50;
;
 BA.debugLineNum = 280;BA.debugLine="iDxAQctEstados=iDxAQctEstados+1";
Debug.ShouldStop(8388608);
_idxaqctestados = RemoteObject.solve(new RemoteObject[] {_idxaqctestados,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("iDxAQctEstados", _idxaqctestados);
 BA.debugLineNum = 281;BA.debugLine="jamCircularProgressBar1.Value=Floor(iDxAQctEsta";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, parent.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_idxaqctestados,_intervalo}, "*",0, 1))))));
 if (true) break;

case 59:
//C
this.state = 60;
;
 BA.debugLineNum = 283;BA.debugLine="rsEstados.Close";
Debug.ShouldStop(67108864);
_rsestados.runVoidMethod ("Close");
 BA.debugLineNum = 284;BA.debugLine="jamCircularProgressBar1.Value=0";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 285;BA.debugLine="jamCircularProgressBar1.Visible=False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvisible" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 287;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * fro";
Debug.ShouldStop(1073741824);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblExpedicionesSinEntregar order by FechaSalida")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 288;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs";
Debug.ShouldStop(-2147483648);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 289;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _rsub);
this.state = 96;
return;
case 96:
//C
this.state = 60;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 290;BA.debugLine="rs.Close";
Debug.ShouldStop(2);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 291;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 292;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(8);
if (true) break;

case 60:
//if
this.state = 78;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 293;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(16);
if (true) break;

case 63:
//if
this.state = 70;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 294;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 295;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 97;
return;
case 97:
//C
this.state = 66;
;
 BA.debugLineNum = 297;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir C";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 298;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 98;
return;
case 98:
//C
this.state = 66;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 299;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(1024);
if (true) break;

case 66:
//if
this.state = 69;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 300;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 301;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 69:
//C
this.state = 70;
;
 BA.debugLineNum = 304;BA.debugLine="ExitApplication";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 306;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(131072);

case 70:
//if
this.state = 77;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 307;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then";
Debug.ShouldStop(262144);
if (true) break;

case 73:
//if
this.state = 76;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 308;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay Ex";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No hay Expediciones de TXT sin entregar.\n"),RemoteObject.createImmutable("(¿Error en webservice?)")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 310;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 99;
return;
case 99:
//C
this.state = 76;
;
 BA.debugLineNum = 311;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 76:
//C
this.state = 77;
;
 BA.debugLineNum = 313;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 314;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 100;
return;
case 100:
//C
this.state = 77;
;
 if (true) break;

case 77:
//C
this.state = 78;
;
 if (true) break;

case 78:
//C
this.state = 79;
;
 if (true) break;

case 79:
//C
this.state = -1;
;
 BA.debugLineNum = 329;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _sql_nonquerycomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizarestadoexpedicion(RemoteObject __ref,RemoteObject _indexsel,RemoteObject _lstestadosexpedicion) throws Exception{
try {
		Debug.PushSubsStack("ActualizarEstadoExpedicion (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,722);
if (RapidSub.canDelegate("actualizarestadoexpedicion")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","actualizarestadoexpedicion", __ref, _indexsel, _lstestadosexpedicion);}
ResumableSub_ActualizarEstadoExpedicion rsub = new ResumableSub_ActualizarEstadoExpedicion(null,__ref,_indexsel,_lstestadosexpedicion);
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
public static class ResumableSub_ActualizarEstadoExpedicion extends BA.ResumableSub {
public ResumableSub_ActualizarEstadoExpedicion(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref,RemoteObject _indexsel,RemoteObject _lstestadosexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._indexsel = _indexsel;
this._lstestadosexpedicion = _lstestadosexpedicion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
RemoteObject _indexsel;
RemoteObject _lstestadosexpedicion;
RemoteObject _mestado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _estadoexp = RemoteObject.createImmutable("");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
RemoteObject _xtf = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarEstadoExpedicion (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,722);
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
Debug.locals.put("IndexSel", _indexsel);
Debug.locals.put("lstEstadosExpedicion", _lstestadosexpedicion);
 BA.debugLineNum = 724;BA.debugLine="Log(\"Offset: \" & JamTableCLV1.sv.ScrollViewOffset";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","867108866",RemoteObject.concat(RemoteObject.createImmutable("Offset: "),__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY")),0);
 BA.debugLineNum = 726;BA.debugLine="Dim mEstado As Map=lstEstadosExpedicion.Get(0)";
Debug.ShouldStop(2097152);
_mestado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mestado = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstestadosexpedicion.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mEstado", _mestado);Debug.locals.put("mEstado", _mestado);
 BA.debugLineNum = 727;BA.debugLine="Dim EstadoExp As String";
Debug.ShouldStop(4194304);
_estadoexp = RemoteObject.createImmutable("");Debug.locals.put("EstadoExp", _estadoexp);
 BA.debugLineNum = 728;BA.debugLine="If mEstado.ContainsKey(\"ESTADO\") Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 6;
if (_mestado.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("ESTADO")))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 729;BA.debugLine="EstadoExp=mEstado.get(\"ESTADO\")";
Debug.ShouldStop(16777216);
_estadoexp = BA.ObjectToString(_mestado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESTADO")))));Debug.locals.put("EstadoExp", _estadoexp);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 731;BA.debugLine="EstadoExp=\"ERROR, ESTADO SIN ACTUALIZAR \"";
Debug.ShouldStop(67108864);
_estadoexp = BA.ObjectToString("ERROR, ESTADO SIN ACTUALIZAR ");Debug.locals.put("EstadoExp", _estadoexp);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 733;BA.debugLine="Dim pnl As B4XView=JamTableCLV1.GetPanel(IndexSel";
Debug.ShouldStop(268435456);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getpanel" /*RemoteObject*/ ,(Object)(_indexsel));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 734;BA.debugLine="For Each n As Node In pnl.GetAllViewsRecursive";
Debug.ShouldStop(536870912);
if (true) break;

case 7:
//for
this.state = 14;
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
group10 = _pnl.runMethod(false,"GetAllViewsRecursive");
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("n", _n);
this.state = 27;
if (true) break;

case 27:
//C
this.state = 14;
if (index10 < groupLen10) {
this.state = 9;
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group10.runMethod(false,"Get",index10));Debug.locals.put("n", _n);}
if (true) break;

case 28:
//C
this.state = 27;
index10++;
Debug.locals.put("n", _n);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 735;BA.debugLine="If n.Tag=\"ESTADO\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_n.runMethod(false,"getTag"),RemoteObject.createImmutable(("ESTADO")))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 736;BA.debugLine="Dim tF As TextField=n";
Debug.ShouldStop(-2147483648);
_tf = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper"), _n.getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 737;BA.debugLine="tF.Text=EstadoExp";
Debug.ShouldStop(1);
_tf.runMethod(true,"setText",_estadoexp);
 BA.debugLineNum = 738;BA.debugLine="Exit";
Debug.ShouldStop(2);
this.state = 14;
if (true) break;
 if (true) break;

case 13:
//C
this.state = 28;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 742;BA.debugLine="Dim xtF As B4XView=tF";
Debug.ShouldStop(32);
_xtf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xtf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tf.getObject());Debug.locals.put("xtF", _xtf);Debug.locals.put("xtF", _xtf);
 BA.debugLineNum = 743;BA.debugLine="If EstadoExp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(64);
if (true) break;

case 15:
//if
this.state = 26;
if (_estadoexp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 26;
 BA.debugLineNum = 744;BA.debugLine="xtF.Color=xui.Color_Red";
Debug.ShouldStop(128);
_xtf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 745;BA.debugLine="xtF.TextColor=xui.Color_White";
Debug.ShouldStop(256);
_xtf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 749;BA.debugLine="If EstadoExp.Contains(\"con incidencia\") Then";
Debug.ShouldStop(4096);
if (true) break;

case 20:
//if
this.state = 25;
if (_estadoexp.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("con incidencia"))).<Boolean>get().booleanValue()) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 750;BA.debugLine="xtF.Color=xui.Color_Red";
Debug.ShouldStop(8192);
_xtf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 751;BA.debugLine="xtF.TextColor=xui.Color_White";
Debug.ShouldStop(16384);
_xtf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 753;BA.debugLine="xtF.Color=0xFFFFA500";
Debug.ShouldStop(65536);
_xtf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xffffa500)));
 BA.debugLineNum = 754;BA.debugLine="xtF.TextColor=xui.Color_Black";
Debug.ShouldStop(131072);
_xtf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 758;BA.debugLine="Dim mData As Map=JamTableCLV1.GetDatosItemNodo(tF";
Debug.ShouldStop(2097152);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getdatositemnodo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tf.getObject()));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 759;BA.debugLine="mData.Put(\"ESTADO\",EstadoExp)";
Debug.ShouldStop(4194304);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ESTADO"))),(Object)((_estadoexp)));
 BA.debugLineNum = 760;BA.debugLine="Log(\"Offset: \" & JamTableCLV1.sv.ScrollViewOffset";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","867108902",RemoteObject.concat(RemoteObject.createImmutable("Offset: "),__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY")),0);
 BA.debugLineNum = 761;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesSinEntr";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblExpedicionesSinEntregar set ESTADO=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_estadoexp),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))})))));
 BA.debugLineNum = 763;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set ESTADO=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_estadoexp),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))})))));
 BA.debugLineNum = 766;BA.debugLine="Sleep(0)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "actualizarestadoexpedicion"),BA.numberCast(int.class, 0));
this.state = 29;
return;
case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 768;BA.debugLine="Return Null";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 770;BA.debugLine="Log(\"Offset: \" & JamTableCLV1.sv.ScrollViewOffset";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","867108912",RemoteObject.concat(RemoteObject.createImmutable("Offset: "),__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY")),0);
 BA.debugLineNum = 771;BA.debugLine="End Sub";
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
public static void  _btnaccionesexpedicionsinentregar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnAccionesExpedicionSinEntregar_Click (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,597);
if (RapidSub.canDelegate("btnaccionesexpedicionsinentregar_click")) { __ref.runUserSub(false, "cexpedicionessinentregartxt","btnaccionesexpedicionsinentregar_click", __ref); return;}
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
public ResumableSub_btnAccionesExpedicionSinEntregar_Click(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
RemoteObject _idtransportetxt = RemoteObject.createImmutable(0);
RemoteObject _numexpediciontxtmysql = RemoteObject.createImmutable("");
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
RemoteObject _offset_before_update = RemoteObject.createImmutable(0f);
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _lstdatosincidenciasexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _numexpedicion = RemoteObject.createImmutable("");
RemoteObject _urltxt = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
int step33;
int limit33;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnAccionesExpedicionSinEntregar_Click (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,597);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 600;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(8388608);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 601;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(16777216);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 602;BA.debugLine="Log(mData)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","866977797",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 603;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(67108864);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 605;BA.debugLine="Dim IDTransporteTXT As Int=7";
Debug.ShouldStop(268435456);
_idtransportetxt = BA.numberCast(int.class, 7);Debug.locals.put("IDTransporteTXT", _idtransportetxt);Debug.locals.put("IDTransporteTXT", _idtransportetxt);
 BA.debugLineNum = 606;BA.debugLine="Dim NumExpedicionTXTMySQL As String=\"001\" & mData";
Debug.ShouldStop(536870912);
_numexpediciontxtmysql = RemoteObject.concat(RemoteObject.createImmutable("001"),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))),RemoteObject.createImmutable("000"),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO")))));Debug.locals.put("NumExpedicionTXTMySQL", _numexpediciontxtmysql);Debug.locals.put("NumExpedicionTXTMySQL", _numexpediciontxtmysql);
 BA.debugLineNum = 608;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(-2147483648);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 610;BA.debugLine="Dialog.Title=\"Selecciona Acción\"";
Debug.ShouldStop(2);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Acción")));
 BA.debugLineNum = 611;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(4);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 612;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(8);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 613;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(16);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 614;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(32);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 615;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(64);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 617;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
Debug.ShouldStop(256);
parent._utilidades.runVoidMethod ("_setlightthemedialog" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 618;BA.debugLine="Utilidades.SetLightThemeList(B4XListDlg)";
Debug.ShouldStop(512);
parent._utilidades.runVoidMethod ("_setlightthemelist" /*RemoteObject*/ ,(Object)(_b4xlistdlg));
 BA.debugLineNum = 621;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(4096);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 622;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(8192);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 623;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
Debug.ShouldStop(16384);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 625;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(65536);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 626;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(131072);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 628;BA.debugLine="Dim lstOpciones As List";
Debug.ShouldStop(524288);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 629;BA.debugLine="lstOpciones.Initialize";
Debug.ShouldStop(1048576);
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 630;BA.debugLine="lstOpciones.Add(\"Actualizar Estado Expedición\")";
Debug.ShouldStop(2097152);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Actualizar Estado Expedición"))));
 BA.debugLineNum = 631;BA.debugLine="lstOpciones.Add(\"Buscar Histórico Estados Expedic";
Debug.ShouldStop(4194304);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Buscar Histórico Estados Expedición"))));
 BA.debugLineNum = 632;BA.debugLine="lstOpciones.Add(\"Consulta Incidencias Expedición\"";
Debug.ShouldStop(8388608);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Consulta Incidencias Expedición"))));
 BA.debugLineNum = 633;BA.debugLine="lstOpciones.Add(\"Ficha Expedición Web TXT\")";
Debug.ShouldStop(16777216);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Ficha Expedición Web TXT"))));
 BA.debugLineNum = 634;BA.debugLine="lstOpciones.Add(\"Documentos NAV de la expedición\"";
Debug.ShouldStop(33554432);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Documentos NAV de la expedición"))));
 BA.debugLineNum = 636;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(134217728);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 638;BA.debugLine="B4XListDlg.Resize(500dip, 400dip)";
Debug.ShouldStop(536870912);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))));
 BA.debugLineNum = 639;BA.debugLine="B4XListDlg.CustomListView1.AsView.width=500dip";
Debug.ShouldStop(1073741824);
_b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 640;BA.debugLine="B4XListDlg.CustomListView1.AsView.Height=400dip";
Debug.ShouldStop(-2147483648);
_b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setHeight",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))));
 BA.debugLineNum = 644;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(8);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 646;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(32);
if (true) break;

case 1:
//for
this.state = 4;
step33 = 1;
limit33 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 55;
if (true) break;

case 55:
//C
this.state = 4;
if ((step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33)) this.state = 3;
if (true) break;

case 56:
//C
this.state = 55;
_i = ((int)(0 + _i + step33)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 56;
 BA.debugLineNum = 647;BA.debugLine="xclv.ResizeItem(i,60dip)";
Debug.ShouldStop(64);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 651;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(1024);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 652;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 654;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(8192);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 655;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(16384);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 656;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(32768);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 659;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), _rsub);
this.state = 57;
return;
case 57:
//C
this.state = 9;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 661;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 662;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 664;BA.debugLine="JamTableCLV1.QuitarSeleccionTodosItems";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_quitarselecciontodositems" /*RemoteObject*/ );
 BA.debugLineNum = 665;BA.debugLine="JamTableCLV1.SeleccionarItem(IndexSel)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_seleccionaritem" /*RemoteObject*/ ,(Object)(_indexsel));
 BA.debugLineNum = 667;BA.debugLine="Dim OpcionSel As String=B4XListDlg.SelectedItem";
Debug.ShouldStop(67108864);
_opcionsel = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("OpcionSel", _opcionsel);Debug.locals.put("OpcionSel", _opcionsel);
 BA.debugLineNum = 669;BA.debugLine="Select Case OpcionSel";
Debug.ShouldStop(268435456);
if (true) break;

case 15:
//select
this.state = 54;
switch (BA.switchObjectToInt(_opcionsel,BA.ObjectToString("Actualizar Estado Expedición"),BA.ObjectToString("Buscar Histórico Estados Expedición"),BA.ObjectToString("Consulta Incidencias Expedición"),BA.ObjectToString("Ficha Expedición Web TXT"),BA.ObjectToString("Documentos NAV de la expedición"))) {
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
this.state = 53;
if (true) break;
}
}
if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 671;BA.debugLine="Dim offset_before_update As Float=  JamTableCLV";
Debug.ShouldStop(1073741824);
_offset_before_update = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_update", _offset_before_update);Debug.locals.put("offset_before_update", _offset_before_update);
 BA.debugLineNum = 672;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTabl";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 673;BA.debugLine="Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(mD";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt.runMethod(false,"_obtenerestadoexpediciontxt" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))))));
this.state = 58;
return;
case 58:
//C
this.state = 18;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 674;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTabl";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 675;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(4);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 676;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(8);
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
this.state = 54;
;
 BA.debugLineNum = 677;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get(";
Debug.ShouldStop(16);
_lstdatosestadosexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);
 BA.debugLineNum = 679;BA.debugLine="wait for(ActualizarEstadoExpedicion(IndexSel, l";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), __ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_actualizarestadoexpedicion" /*RemoteObject*/ ,(Object)(_indexsel),(Object)(_lstdatosestadosexpedicion)));
this.state = 59;
return;
case 59:
//C
this.state = 54;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 680;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_update));
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 683;BA.debugLine="Wait For(cmAuxTxT.ObtenerHistoricoEstadosExpedi";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt.runMethod(false,"_obtenerhistoricoestadosexpediciontxt" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))))));
this.state = 60;
return;
case 60:
//C
this.state = 26;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 684;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 685;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(4096);
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
this.state = 54;
;
 BA.debugLineNum = 686;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get(";
Debug.ShouldStop(8192);
_lstdatosestadosexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);
 BA.debugLineNum = 687;BA.debugLine="MostrarHistoricoEstadosExpedicion(lstDatosEstad";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_mostrarhistoricoestadosexpedicion" /*void*/ ,(Object)(_lstdatosestadosexpedicion));
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 689;BA.debugLine="Wait For(cmAuxTxT.ObtenerConsultaIncidenciasExp";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt.runMethod(false,"_obtenerconsultaincidenciasexpediciontxt" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))))),(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))))),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))))));
this.state = 61;
return;
case 61:
//C
this.state = 34;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 690;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 691;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(262144);
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
this.state = 54;
;
 BA.debugLineNum = 692;BA.debugLine="Dim lstDatosIncidenciasExpedicion As List=mRes.";
Debug.ShouldStop(524288);
_lstdatosincidenciasexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosincidenciasexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstDatosIncidenciasExpedicion", _lstdatosincidenciasexpedicion);Debug.locals.put("lstDatosIncidenciasExpedicion", _lstdatosincidenciasexpedicion);
 BA.debugLineNum = 693;BA.debugLine="MostrarIncidenciasExpedicion(lstDatosIncidencia";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_mostrarincidenciasexpedicion" /*void*/ ,(Object)(_lstdatosincidenciasexpedicion));
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 696;BA.debugLine="Dim NumExpedicion As String=$\"${mData.Get(\"CODE";
Debug.ShouldStop(8388608);
_numexpedicion = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODEMPRESA")))))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN")))))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN")))))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1")))))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2")))))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO")))))),RemoteObject.createImmutable("")));Debug.locals.put("NumExpedicion", _numexpedicion);Debug.locals.put("NumExpedicion", _numexpedicion);
 BA.debugLineNum = 697;BA.debugLine="wait for(cmAuxTxT.ObtenerURLTrazabilidadExpedic";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt.runMethod(false,"_obtenerurltrazabilidadexpediciontxt" /*RemoteObject*/ ,(Object)(_numexpedicion)));
this.state = 62;
return;
case 62:
//C
this.state = 42;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 698;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 699;BA.debugLine="If Accion=\"OK\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 42:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("OK"))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 700;BA.debugLine="Dim URLtxt As String=mRes.Get(\"URL\")";
Debug.ShouldStop(134217728);
_urltxt = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("URL")))));Debug.locals.put("URLtxt", _urltxt);Debug.locals.put("URLtxt", _urltxt);
 BA.debugLineNum = 701;BA.debugLine="If URLtxt<>\"\" Then";
Debug.ShouldStop(268435456);
if (true) break;

case 45:
//if
this.state = 50;
if (RemoteObject.solveBoolean("!",_urltxt,BA.ObjectToString(""))) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 50;
 BA.debugLineNum = 702;BA.debugLine="fx.ShowExternalDocument(URLtxt)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethod ("ShowExternalDocument",(Object)(_urltxt));
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 704;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Método Url";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Método UrlTracking TXT devuelve cadena vacía.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 705;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), _msa);
this.state = 63;
return;
case 63:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;

case 51:
//C
this.state = 54;
;
 if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 709;BA.debugLine="DatosExpedicionInternaExpedicionTransporte(IDTr";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_datosexpedicioninternaexpediciontransporte" /*void*/ ,(Object)(_idtransportetxt),(Object)(_numexpediciontxtmysql));
 if (true) break;

case 54:
//C
this.state = -1;
;
 BA.debugLineNum = 711;BA.debugLine="End Sub";
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
public static RemoteObject  _btnactualizar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnActualizar_Click (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,585);
if (RapidSub.canDelegate("btnactualizar_click")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","btnactualizar_click", __ref);}
 BA.debugLineNum = 585;BA.debugLine="Private Sub btnActualizar_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 586;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 587;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("btnEjemplo_Click (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,589);
if (RapidSub.canDelegate("btnejemplo_click")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","btnejemplo_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
 BA.debugLineNum = 589;BA.debugLine="Private Sub btnEjemplo_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 590;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(8192);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), cexpedicionessinentregartxt.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 591;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(16384);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 592;BA.debugLine="Log(mData)";
Debug.ShouldStop(32768);
cexpedicionessinentregartxt.__c.runVoidMethod ("LogImpl","866912259",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 593;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(65536);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
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
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","btnsalir_click", __ref);}
 BA.debugLineNum = 340;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="SalirModulo";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
cexpedicionessinentregartxt._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cexpedicionessinentregartxt._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
cexpedicionessinentregartxt._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cexpedicionessinentregartxt._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cexpedicionessinentregartxt._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cexpedicionessinentregartxt._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private Dialog As B4XDialog";
cexpedicionessinentregartxt._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cexpedicionessinentregartxt._dialog);
 //BA.debugLineNum = 9;BA.debugLine="Private mSQL As SQL";
cexpedicionessinentregartxt._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cexpedicionessinentregartxt._msql);
 //BA.debugLineNum = 14;BA.debugLine="Private JamTableCLV1 As JamTableCLV";
cexpedicionessinentregartxt._jamtableclv1 = RemoteObject.createNew ("b4j.docU.jamtableclv");__ref.setField("_jamtableclv1",cexpedicionessinentregartxt._jamtableclv1);
 //BA.debugLineNum = 15;BA.debugLine="Private txtANO As TextField";
cexpedicionessinentregartxt._txtano = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtano",cexpedicionessinentregartxt._txtano);
 //BA.debugLineNum = 16;BA.debugLine="Private txtBULTOS As TextField";
cexpedicionessinentregartxt._txtbultos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtbultos",cexpedicionessinentregartxt._txtbultos);
 //BA.debugLineNum = 17;BA.debugLine="Private txtCODDESTIN As TextField";
cexpedicionessinentregartxt._txtcoddestin = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcoddestin",cexpedicionessinentregartxt._txtcoddestin);
 //BA.debugLineNum = 18;BA.debugLine="Private txtCODEMPRESA As TextField";
cexpedicionessinentregartxt._txtcodempresa = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodempresa",cexpedicionessinentregartxt._txtcodempresa);
 //BA.debugLineNum = 19;BA.debugLine="Private txtCODORIGEN As TextField";
cexpedicionessinentregartxt._txtcodorigen = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodorigen",cexpedicionessinentregartxt._txtcodorigen);
 //BA.debugLineNum = 20;BA.debugLine="Private txtCPOSTALDESTINATARIO As TextField";
cexpedicionessinentregartxt._txtcpostaldestinatario = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcpostaldestinatario",cexpedicionessinentregartxt._txtcpostaldestinatario);
 //BA.debugLineNum = 21;BA.debugLine="Private txtDIRECCIONDESTINATARIO As TextField";
cexpedicionessinentregartxt._txtdirecciondestinatario = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdirecciondestinatario",cexpedicionessinentregartxt._txtdirecciondestinatario);
 //BA.debugLineNum = 22;BA.debugLine="Private txtDOCADJUNTA As TextField";
cexpedicionessinentregartxt._txtdocadjunta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdocadjunta",cexpedicionessinentregartxt._txtdocadjunta);
 //BA.debugLineNum = 23;BA.debugLine="Private txtFECHAALTA As TextField";
cexpedicionessinentregartxt._txtfechaalta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechaalta",cexpedicionessinentregartxt._txtfechaalta);
 //BA.debugLineNum = 24;BA.debugLine="Private txtKILOS As TextField";
cexpedicionessinentregartxt._txtkilos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtkilos",cexpedicionessinentregartxt._txtkilos);
 //BA.debugLineNum = 25;BA.debugLine="Private txtNEXPED1 As TextField";
cexpedicionessinentregartxt._txtnexped1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnexped1",cexpedicionessinentregartxt._txtnexped1);
 //BA.debugLineNum = 26;BA.debugLine="Private txtNEXPED2 As TextField";
cexpedicionessinentregartxt._txtnexped2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnexped2",cexpedicionessinentregartxt._txtnexped2);
 //BA.debugLineNum = 27;BA.debugLine="Private txtNOMBREDESTINATARIO As TextField";
cexpedicionessinentregartxt._txtnombredestinatario = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombredestinatario",cexpedicionessinentregartxt._txtnombredestinatario);
 //BA.debugLineNum = 28;BA.debugLine="Private txtOBSERVACIONES As TextField";
cexpedicionessinentregartxt._txtobservaciones = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtobservaciones",cexpedicionessinentregartxt._txtobservaciones);
 //BA.debugLineNum = 29;BA.debugLine="Private txtPOBLACIONDESTINATARIO As TextField";
cexpedicionessinentregartxt._txtpoblaciondestinatario = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpoblaciondestinatario",cexpedicionessinentregartxt._txtpoblaciondestinatario);
 //BA.debugLineNum = 30;BA.debugLine="Private txtPORTEE As TextField";
cexpedicionessinentregartxt._txtportee = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtportee",cexpedicionessinentregartxt._txtportee);
 //BA.debugLineNum = 31;BA.debugLine="Private txtREFERENCIA1 As TextField";
cexpedicionessinentregartxt._txtreferencia1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtreferencia1",cexpedicionessinentregartxt._txtreferencia1);
 //BA.debugLineNum = 32;BA.debugLine="Private txtDestino As TextField";
cexpedicionessinentregartxt._txtdestino = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdestino",cexpedicionessinentregartxt._txtdestino);
 //BA.debugLineNum = 33;BA.debugLine="Private txtEstadoActual As TextField";
cexpedicionessinentregartxt._txtestadoactual = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtestadoactual",cexpedicionessinentregartxt._txtestadoactual);
 //BA.debugLineNum = 35;BA.debugLine="Private MeasurementCanvas As B4XCanvas";
cexpedicionessinentregartxt._measurementcanvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_measurementcanvas",cexpedicionessinentregartxt._measurementcanvas);
 //BA.debugLineNum = 37;BA.debugLine="Private FlexGridDialog As FlexGrid";
cexpedicionessinentregartxt._flexgriddialog = RemoteObject.createNew ("b4j.example.flexgrid");__ref.setField("_flexgriddialog",cexpedicionessinentregartxt._flexgriddialog);
 //BA.debugLineNum = 38;BA.debugLine="Private jamCircularProgressBar1 As jamCircularPro";
cexpedicionessinentregartxt._jamcircularprogressbar1 = RemoteObject.createNew ("b4j.docU.jamcircularprogressbar");__ref.setField("_jamcircularprogressbar1",cexpedicionessinentregartxt._jamcircularprogressbar1);
 //BA.debugLineNum = 39;BA.debugLine="Private txtNombreCliente As TextField";
cexpedicionessinentregartxt._txtnombrecliente = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombrecliente",cexpedicionessinentregartxt._txtnombrecliente);
 //BA.debugLineNum = 40;BA.debugLine="Private txtNombreResponsableCuenta As TextField";
cexpedicionessinentregartxt._txtnombreresponsablecuenta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombreresponsablecuenta",cexpedicionessinentregartxt._txtnombreresponsablecuenta);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clienteresponsablecuentadocumento(RemoteObject __ref,RemoteObject _doc) throws Exception{
try {
		Debug.PushSubsStack("ClienteResponsableCuentaDocumento (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1287);
if (RapidSub.canDelegate("clienteresponsablecuentadocumento")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","clienteresponsablecuentadocumento", __ref, _doc);}
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
public ResumableSub_ClienteResponsableCuentaDocumento(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref,RemoteObject _doc) {
this.parent = parent;
this.__ref = __ref;
this._doc = _doc;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
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
		Debug.PushSubsStack("ClienteResponsableCuentaDocumento (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1287);
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
 BA.debugLineNum = 1288;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(128);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1291;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(1024);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1292;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1295;BA.debugLine="Dim comando As String";
Debug.ShouldStop(16384);
_comando = RemoteObject.createImmutable("");Debug.locals.put("comando", _comando);
 BA.debugLineNum = 1296;BA.debugLine="Select True";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 1298;BA.debugLine="comando=\"ClienteResponsableCuentaALBV\"";
Debug.ShouldStop(131072);
_comando = BA.ObjectToString("ClienteResponsableCuentaALBV");Debug.locals.put("comando", _comando);
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 1300;BA.debugLine="comando=\"ClienteResponsableCuentaRT\"";
Debug.ShouldStop(524288);
_comando = BA.ObjectToString("ClienteResponsableCuentaRT");Debug.locals.put("comando", _comando);
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1302;BA.debugLine="Accion=\"ErrTipoDoc\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("ErrTipoDoc");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1303;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1304;BA.debugLine="Return mRes";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 1306;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,comando,Array";
Debug.ShouldStop(33554432);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_doc)})),(Object)(__ref));
 BA.debugLineNum = 1308;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "clienteresponsablecuentadocumento"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1309;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 1310;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1311;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "clienteresponsablecuentadocumento"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
 BA.debugLineNum = 1312;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1313;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1316;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 1317;BA.debugLine="Accion=\"SinResultado\"";
Debug.ShouldStop(16);
_accion = BA.ObjectToString("SinResultado");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1318;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1320;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(128);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1321;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(256);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1322;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1323;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 1327;BA.debugLine="Return mRes";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1328;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,365);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 365;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(4096);
 BA.debugLineNum = 366;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(8192);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cexpedicionessinentregartxt.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblExpedicionesSinEntregar")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 367;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 368;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblExpedicionesSin";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblExpedicionesSinEntregar")));
 };
 BA.debugLineNum = 370;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(131072);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 371;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 372;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblExpedicionesSinEntregar (")));
 BA.debugLineNum = 374;BA.debugLine="sbCrearTabla.Append(\"CODEMPRESA TEXT COLLATE NOCA";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CODEMPRESA TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 375;BA.debugLine="sbCrearTabla.Append(\"CODORIGEN TEXT COLLATE NOCAS";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CODORIGEN TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 376;BA.debugLine="sbCrearTabla.Append(\"CODDESTIN TEXT COLLATE NOCAS";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CODDESTIN TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 377;BA.debugLine="sbCrearTabla.Append(\"NEXPED1 INTEGER,\")";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NEXPED1 INTEGER,")));
 BA.debugLineNum = 378;BA.debugLine="sbCrearTabla.Append(\"NEXPED2 INTEGER,\")";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NEXPED2 INTEGER,")));
 BA.debugLineNum = 379;BA.debugLine="sbCrearTabla.Append(\"ANO TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ANO TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 380;BA.debugLine="sbCrearTabla.Append(\"FECHA_x0020_SALIDA TEXT COLL";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FECHA_x0020_SALIDA TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 381;BA.debugLine="sbCrearTabla.Append(\"FechaSalida INTEGER DEFAULT";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaSalida INTEGER DEFAULT 0,")));
 BA.debugLineNum = 382;BA.debugLine="sbCrearTabla.Append(\"DESTINO TEXT,\")";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DESTINO TEXT,")));
 BA.debugLineNum = 383;BA.debugLine="sbCrearTabla.Append(\"DESTINATARIO TEXT,\")";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DESTINATARIO TEXT,")));
 BA.debugLineNum = 384;BA.debugLine="sbCrearTabla.Append(\"DIRECCION TEXT,\")";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DIRECCION TEXT,")));
 BA.debugLineNum = 385;BA.debugLine="sbCrearTabla.Append(\"CP TEXT,\")";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CP TEXT,")));
 BA.debugLineNum = 386;BA.debugLine="sbCrearTabla.Append(\"POBLACION TEXT,\")";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("POBLACION TEXT,")));
 BA.debugLineNum = 387;BA.debugLine="sbCrearTabla.Append(\"REFERENCIA1 TEXT COLLATE NOC";
Debug.ShouldStop(4);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("REFERENCIA1 TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 388;BA.debugLine="sbCrearTabla.Append(\"REFERENCIA2 TEXT COLLATE NOC";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("REFERENCIA2 TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 389;BA.debugLine="sbCrearTabla.Append(\"BULTOS INTEGER,\")";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("BULTOS INTEGER,")));
 BA.debugLineNum = 390;BA.debugLine="sbCrearTabla.Append(\"KILOS INTEGER,\")";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("KILOS INTEGER,")));
 BA.debugLineNum = 391;BA.debugLine="sbCrearTabla.Append(\"ESTADO TEXT COLLATE NOCASE D";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ESTADO TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 392;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreCliente TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 393;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreResponsableCuenta TEXT COLLATE NOCASE DEFAULT '')")));
 BA.debugLineNum = 394;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 397;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1248);
if (RapidSub.canDelegate("creartablatemporaldocumentosnavexpedicionespendientestxt")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","creartablatemporaldocumentosnavexpedicionespendientestxt", __ref);}
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
public ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
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
		Debug.PushSubsStack("CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1248);
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
 BA.debugLineNum = 1249;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1252;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1253;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1256;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"CrearTablaTe";
Debug.ShouldStop(128);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(BA.ObjectToString("CrearTablaTemporalDocumentosExpedicionesPendientes")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1258;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1259;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 1260;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query CrearTablaTemporalDocumentosExpedicionesPendientes")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1261;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1262;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1263;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1266;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 1269;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1048576);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1270;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(2097152);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 1271;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(4194304);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1272;BA.debugLine="If sResp.ToUpperCase=\"OK\" Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 1273;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1274;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1276;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Cr";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SP CrearTablaTemporalDocumentosExpedicionesPendientes "),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1277;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 1278;BA.debugLine="Accion=\"ERROR SP\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("ERROR SP");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1279;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 1283;BA.debugLine="Return mRes";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1284;BA.debugLine="End Sub";
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
public static RemoteObject  _creartablatemporaldocumentosreferenciastte(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CrearTablaTemporalDocumentosReferenciasTte (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1167);
if (RapidSub.canDelegate("creartablatemporaldocumentosreferenciastte")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","creartablatemporaldocumentosreferenciastte", __ref);}
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
public ResumableSub_CrearTablaTemporalDocumentosReferenciasTte(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
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
		Debug.PushSubsStack("CrearTablaTemporalDocumentosReferenciasTte (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1167);
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
 BA.debugLineNum = 1168;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(32768);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1171;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(262144);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1172;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1175;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(4194304);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("CrearTablaTemporalDocumentosReferenciasTte")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1177;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosreferenciastte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1178;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 1179;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query CrearTablaTemporalDocumentosReferenciasTte")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1180;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1181;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1182;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1185;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 1188;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1189;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(16);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 1190;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(32);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1191;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 1192;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Cr";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SP CrearTablaTemporalDocumentosReferenciasTte"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1193;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 1194;BA.debugLine="Accion=\"ERROR SP\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("ERROR SP");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1195;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1197;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1198;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 1202;BA.debugLine="Return mRes";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1203;BA.debugLine="End Sub";
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
public static void  _datosexpedicioninternaexpediciontransporte(RemoteObject __ref,RemoteObject _idtransporte,RemoteObject _numexp) throws Exception{
try {
		Debug.PushSubsStack("DatosExpedicionInternaExpedicionTransporte (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,962);
if (RapidSub.canDelegate("datosexpedicioninternaexpediciontransporte")) { __ref.runUserSub(false, "cexpedicionessinentregartxt","datosexpedicioninternaexpediciontransporte", __ref, _idtransporte, _numexp); return;}
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
public ResumableSub_DatosExpedicionInternaExpedicionTransporte(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref,RemoteObject _idtransporte,RemoteObject _numexp) {
this.parent = parent;
this.__ref = __ref;
this._idtransporte = _idtransporte;
this._numexp = _numexp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
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
		Debug.PushSubsStack("DatosExpedicionInternaExpedicionTransporte (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,962);
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
 BA.debugLineNum = 963;BA.debugLine="Wait For(ExpedicionInternaExpedicionTransporte(ID";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "datosexpedicioninternaexpediciontransporte"), __ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_expedicioninternaexpediciontransporte" /*RemoteObject*/ ,(Object)(_idtransporte),(Object)(_numexp)));
this.state = 39;
return;
case 39:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 964;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 965;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 966;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(32);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 969;BA.debugLine="Dim lstOpciones As List";
Debug.ShouldStop(256);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 970;BA.debugLine="lstOpciones.Initialize";
Debug.ShouldStop(512);
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 972;BA.debugLine="For Each mData As Map In lstReg";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 973;BA.debugLine="Dim DocExp As String=mData.Get(\"Documento\")";
Debug.ShouldStop(4096);
_docexp = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocExp", _docexp);Debug.locals.put("DocExp", _docexp);
 BA.debugLineNum = 974;BA.debugLine="If DocExp<>\"\" Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 975;BA.debugLine="lstOpciones.Add(mData.Get(\"Documento\"))";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 980;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(524288);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 982;BA.debugLine="Dialog.Title=\"Selecciona Documento NAV\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Documento NAV")));
 BA.debugLineNum = 983;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 984;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 985;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 986;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(33554432);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 987;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(67108864);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 989;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
Debug.ShouldStop(268435456);
parent._utilidades.runVoidMethod ("_setlightthemedialog" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 990;BA.debugLine="Utilidades.SetLightThemeList(B4XListDlg)";
Debug.ShouldStop(536870912);
parent._utilidades.runVoidMethod ("_setlightthemelist" /*RemoteObject*/ ,(Object)(_b4xlistdlg));
 BA.debugLineNum = 993;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(1);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 994;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(2);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 995;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
Debug.ShouldStop(4);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 997;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(16);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 998;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(32);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 1002;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(512);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 1006;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(8192);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1008;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 1009;BA.debugLine="xclv.ResizeItem(i,60dip)";
Debug.ShouldStop(65536);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1013;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(1048576);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 1014;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 1016;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(8388608);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 1017;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(16777216);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 1018;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(33554432);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 1021;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "datosexpedicioninternaexpediciontransporte"), _rsub);
this.state = 44;
return;
case 44:
//C
this.state = 23;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1023;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 1024;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 1026;BA.debugLine="Dim DocSel As String=B4XListDlg.SelectedItem";
Debug.ShouldStop(2);
_docsel = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 1027;BA.debugLine="Select True";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 1029;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(16);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico Albaranes Venta")),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 33:
//C
this.state = 38;
 BA.debugLineNum = 1031;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(64);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico recep. transferencia")),(Object)(BA.numberCast(int.class, 5745)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 35:
//C
this.state = 38;
 BA.debugLineNum = 1033;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(256);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico envío devolución")),(Object)(BA.numberCast(int.class, 6650)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1035;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No es posibl";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No es posible abrir la ficha de navision del documento "),_docsel)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1036;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "datosexpedicioninternaexpediciontransporte"), _msa);
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
public static RemoteObject  _documentosexpedicionespendientes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionesPendientes (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1205);
if (RapidSub.canDelegate("documentosexpedicionespendientes")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","documentosexpedicionespendientes", __ref);}
ResumableSub_DocumentosExpedicionesPendientes rsub = new ResumableSub_DocumentosExpedicionesPendientes(null,__ref);
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
public static class ResumableSub_DocumentosExpedicionesPendientes extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesPendientes(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionesPendientes (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1205);
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
 BA.debugLineNum = 1206;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2097152);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1209;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(16777216);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1210;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1213;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(268435456);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("DocumentosReferenciasExpedicionesTte")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1215;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "documentosexpedicionespendientes"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1216;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 1217;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query DocumentosReferenciasExpedicionesTte")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1218;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "documentosexpedicionespendientes"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1219;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(4);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1220;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1223;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 1224;BA.debugLine="Accion=\"SinDocumentos\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("SinDocumentos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1225;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1227;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1228;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1229;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4096);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1230;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 1233;BA.debugLine="Return mRes";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1234;BA.debugLine="End Sub";
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
public static RemoteObject  _documentosexpedicionessinentregarbatch(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionesSinEntregarBatch (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1120);
if (RapidSub.canDelegate("documentosexpedicionessinentregarbatch")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","documentosexpedicionessinentregarbatch", __ref);}
ResumableSub_DocumentosExpedicionesSinEntregarBatch rsub = new ResumableSub_DocumentosExpedicionesSinEntregarBatch(null,__ref);
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
public static class ResumableSub_DocumentosExpedicionesSinEntregarBatch extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesSinEntregarBatch(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
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
		Debug.PushSubsStack("DocumentosExpedicionesSinEntregarBatch (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1120);
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
 BA.debugLineNum = 1122;BA.debugLine="Dim mResult As Map";
Debug.ShouldStop(2);
_mresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mResult", _mresult);
 BA.debugLineNum = 1123;BA.debugLine="mResult.Initialize";
Debug.ShouldStop(4);
_mresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 1124;BA.debugLine="mResult.Put(\"Success\", False)";
Debug.ShouldStop(8);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 1126;BA.debugLine="Dim NumRegRef1Doc As Int=Utilidades.FixNullInt(mS";
Debug.ShouldStop(32);
_numregref1doc = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblExpedicionesSinEntregar where REFERENCIA1<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("")}))))))));Debug.locals.put("NumRegRef1Doc", _numregref1doc);Debug.locals.put("NumRegRef1Doc", _numregref1doc);
 BA.debugLineNum = 1127;BA.debugLine="If NumRegRef1Doc=0 Then Return mResult";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 1129;BA.debugLine="Wait For(CrearTablaTemporalDocumentosReferenciasT";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "documentosexpedicionessinentregarbatch"), __ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_creartablatemporaldocumentosreferenciastte" /*RemoteObject*/ ));
this.state = 27;
return;
case 27:
//C
this.state = 7;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1130;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(512);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1131;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 1134;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(8192);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 1135;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(16384);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 1140;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select REFER";
Debug.ShouldStop(524288);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select REFERENCIA1 from tblExpedicionesSinEntregar where referencia1<>? order by REFERENCIA1")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("")})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1141;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 1143;BA.debugLine="Log(\"REFERENCIA1 \" & rs.GetString(\"REFERENCIA1\")";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","867436567",RemoteObject.concat(RemoteObject.createImmutable("REFERENCIA1 "),_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("REFERENCIA1")))),0);
 BA.debugLineNum = 1145;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"";
Debug.ShouldStop(16777216);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InsertarDatosTablaTemporalDocumentosReferenciasTte")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("REFERENCIA1"))))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1146;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(33554432);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1148;BA.debugLine="rs.Close";
Debug.ShouldStop(134217728);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 1149;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "documentosexpedicionessinentregarbatch"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 28;
return;
case 28:
//C
this.state = 17;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1150;BA.debugLine="If Success=False Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 1151;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible actualizar los datos de documentos expedición en la tabla temporal tblreferenciasexpedicionestemp.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1152;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "documentosexpedicionessinentregarbatch"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 20;
;
 BA.debugLineNum = 1153;BA.debugLine="Return mResult";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 1156;BA.debugLine="Wait For(DocumentosExpedicionesPendientes) comple";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "documentosexpedicionessinentregarbatch"), __ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_documentosexpedicionespendientes" /*RemoteObject*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 21;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1157;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(16);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1158;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 1160;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(128);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1161;BA.debugLine="mResult.put(\"Success\", True)";
Debug.ShouldStop(256);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 1162;BA.debugLine="mResult.put(\"lstReg\", lstReg)";
Debug.ShouldStop(512);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 1164;BA.debugLine="Return mResult";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
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
public static RemoteObject  _eliminartablatemporaldocumentosreferenciastte(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EliminarTablaTemporalDocumentosReferenciasTte (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1236);
if (RapidSub.canDelegate("eliminartablatemporaldocumentosreferenciastte")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","eliminartablatemporaldocumentosreferenciastte", __ref);}
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
public ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EliminarTablaTemporalDocumentosReferenciasTte (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1236);
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
 BA.debugLineNum = 1237;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"E";
Debug.ShouldStop(1048576);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("EliminarTablaTemporalDocumentosReferenciasTte")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1238;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "eliminartablatemporaldocumentosreferenciastte"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1244;BA.debugLine="Return Null";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 1245;BA.debugLine="End Sub";
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
public static RemoteObject  _expedicioninternaexpediciontransporte(RemoteObject __ref,RemoteObject _idtransporte,RemoteObject _numexp) throws Exception{
try {
		Debug.PushSubsStack("ExpedicionInternaExpedicionTransporte (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1041);
if (RapidSub.canDelegate("expedicioninternaexpediciontransporte")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","expedicioninternaexpediciontransporte", __ref, _idtransporte, _numexp);}
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
public ResumableSub_ExpedicionInternaExpedicionTransporte(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref,RemoteObject _idtransporte,RemoteObject _numexp) {
this.parent = parent;
this.__ref = __ref;
this._idtransporte = _idtransporte;
this._numexp = _numexp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
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
		Debug.PushSubsStack("ExpedicionInternaExpedicionTransporte (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,1041);
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
 BA.debugLineNum = 1043;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(262144);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1044;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(524288);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1045;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1046;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(2097152);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 1047;BA.debugLine="Dim Comando As String=\"DatosExpedicionInternaExpe";
Debug.ShouldStop(4194304);
_comando = BA.ObjectToString("DatosExpedicionInternaExpedicionTransporte");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1050;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDTra";
Debug.ShouldStop(33554432);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_idtransporte),(_numexp)})),(Object)(__ref));
 BA.debugLineNum = 1052;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "expedicioninternaexpediciontransporte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1053;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 1054;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1055;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "expedicioninternaexpediciontransporte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1056;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1057;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1060;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 1061;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1062;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1063;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de expedicion interna para el transporte y número de expedición seleccionados.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1064;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "expedicioninternaexpediciontransporte"), _msa);
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
 BA.debugLineNum = 1067;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1024);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1068;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
Debug.ShouldStop(2048);
_mrespuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mrespuesta = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mRespuesta", _mrespuesta);Debug.locals.put("mRespuesta", _mrespuesta);
 BA.debugLineNum = 1069;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
Debug.ShouldStop(4096);
_sresp = BA.ObjectToString(_mrespuesta.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1070;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 1071;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error recup";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error recuperando datos del SP "),_comando,RemoteObject.createImmutable("."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1072;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "expedicioninternaexpediciontransporte"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 BA.debugLineNum = 1073;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1074;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1076;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1077;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1078;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 1082;BA.debugLine="Return mRes";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1083;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("frm_CloseRequest (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,331);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 331;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="EventData.Consume";
Debug.ShouldStop(2048);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("GenerarUUIDv4 (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,442);
if (RapidSub.canDelegate("generaruuidv4")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","generaruuidv4", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _stp = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _c = RemoteObject.createImmutable(0);
 BA.debugLineNum = 442;BA.debugLine="Sub GenerarUUIDv4 As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 443;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(67108864);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 444;BA.debugLine="sb.Initialize";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 445;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
Debug.ShouldStop(268435456);
{
final RemoteObject group3 = RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable((8)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((12))});
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = BA.numberCast(int.class, group3.getArrayElement(false,RemoteObject.createImmutable(index3)));Debug.locals.put("stp", _stp);
Debug.locals.put("stp", _stp);
 BA.debugLineNum = 446;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("-")));};
 BA.debugLineNum = 447;BA.debugLine="For n = 1 To stp";
Debug.ShouldStop(1073741824);
{
final int step5 = 1;
final int limit5 = _stp.<Integer>get().intValue();
_n = 1 ;
for (;(step5 > 0 && _n <= limit5) || (step5 < 0 && _n >= limit5) ;_n = ((int)(0 + _n + step5))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 448;BA.debugLine="Dim c As Int = Rnd(0, 16)";
Debug.ShouldStop(-2147483648);
_c = cexpedicionessinentregartxt.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 449;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("<",_c,BA.numberCast(double.class, 10))) { 
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(48)}, "+",1, 1);Debug.locals.put("c", _c);}
else {
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(55)}, "+",1, 1);Debug.locals.put("c", _c);};
 BA.debugLineNum = 450;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 19))) { 
_c = cexpedicionessinentregartxt.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("8"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 451;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 14))) { 
_c = cexpedicionessinentregartxt.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("4"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 452;BA.debugLine="sb.Append(Chr(c))";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(cexpedicionessinentregartxt.__c.runMethod(true,"Chr",(Object)(_c)))));
 }
}Debug.locals.put("n", _n);
;
 }
}Debug.locals.put("stp", _stp);
;
 BA.debugLineNum = 455;BA.debugLine="Return sb.ToString.ToLowerCase";
Debug.ShouldStop(64);
if (true) return _sb.runMethod(true,"ToString").runMethod(true,"toLowerCase");
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Initialize (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 46;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 48;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
Debug.ShouldStop(32768);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, cexpedicionessinentregartxt.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, cexpedicionessinentregartxt.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 49;BA.debugLine="MeasurementCanvas.Initialize(p)";
Debug.ShouldStop(65536);
__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_p));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("JamTableCLV1_AccionSalirJamTableCLV (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,335);
if (RapidSub.canDelegate("jamtableclv1_accionsalirjamtableclv")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","jamtableclv1_accionsalirjamtableclv", __ref);}
 BA.debugLineNum = 335;BA.debugLine="Sub JamTableCLV1_AccionSalirJamTableCLV";
Debug.ShouldStop(16384);
 BA.debugLineNum = 336;BA.debugLine="SalirModulo";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("JamTableCLV1_ItemClick (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,568);
if (RapidSub.canDelegate("jamtableclv1_itemclick")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","jamtableclv1_itemclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 568;BA.debugLine="Sub JamTableCLV1_ItemClick(Index As Int, Value As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 569;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(16777216);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 570;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
Debug.ShouldStop(33554432);
cexpedicionessinentregartxt.__c.runVoidMethod ("LogImpl","866715650",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 571;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(67108864);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 572;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(134217728);
cexpedicionessinentregartxt.__c.runVoidMethod ("LogImpl","866715652",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 574;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("JamTableCLV1_ItemLongClick (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,577);
if (RapidSub.canDelegate("jamtableclv1_itemlongclick")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","jamtableclv1_itemlongclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 577;BA.debugLine="Sub JamTableCLV1_ItemLongClick(Index As Int, Value";
Debug.ShouldStop(1);
 BA.debugLineNum = 578;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(2);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 579;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
Debug.ShouldStop(4);
cexpedicionessinentregartxt.__c.runVoidMethod ("LogImpl","866781186",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado botón secundario ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 580;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(8);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 581;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(16);
cexpedicionessinentregartxt.__c.runVoidMethod ("LogImpl","866781188",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 583;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("JamTableCLV1_LoadLayoutPanelItem (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,514);
if (RapidSub.canDelegate("jamtableclv1_loadlayoutpanelitem")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","jamtableclv1_loadlayoutpanelitem", __ref, _datositemindexclv);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _estadoexp = RemoteObject.createImmutable("");
RemoteObject _xtf = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("DatosItemIndexCLV", _datositemindexclv);
 BA.debugLineNum = 514;BA.debugLine="Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemInde";
Debug.ShouldStop(2);
 BA.debugLineNum = 515;BA.debugLine="Dim mData As Map=DatosItemIndexCLV.Value";
Debug.ShouldStop(4);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _datositemindexclv.getField(false,"Value" /*RemoteObject*/ ));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 516;BA.debugLine="Dim Pnl As B4XView=DatosItemIndexCLV.Panel";
Debug.ShouldStop(8);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = _datositemindexclv.getField(false,"Panel" /*RemoteObject*/ );Debug.locals.put("Pnl", _pnl);Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 517;BA.debugLine="Pnl.LoadLayout(\"scrItemExpedicionSinEntregarTxt\")";
Debug.ShouldStop(16);
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrItemExpedicionSinEntregarTxt")),__ref.getField(false, "ba"));
 BA.debugLineNum = 520;BA.debugLine="txtANO.Text=mData.Get(\"ANO\")";
Debug.ShouldStop(128);
__ref.getField(false,"_txtano" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ANO"))))));
 BA.debugLineNum = 521;BA.debugLine="txtBULTOS.Text=mData.Get(\"BULTOS\")";
Debug.ShouldStop(256);
__ref.getField(false,"_txtbultos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BULTOS"))))));
 BA.debugLineNum = 522;BA.debugLine="txtCODDESTIN.Text=mData.Get(\"CODDESTIN\")";
Debug.ShouldStop(512);
__ref.getField(false,"_txtcoddestin" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODDESTIN"))))));
 BA.debugLineNum = 523;BA.debugLine="txtCODEMPRESA.Text=mData.Get(\"CODEMPRESA\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtcodempresa" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODEMPRESA"))))));
 BA.debugLineNum = 524;BA.debugLine="txtCODORIGEN.Text=mData.Get(\"CODORIGEN\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtcodorigen" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODORIGEN"))))));
 BA.debugLineNum = 525;BA.debugLine="txtCPOSTALDESTINATARIO.Text=mData.Get(\"CP\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtcpostaldestinatario" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CP"))))));
 BA.debugLineNum = 526;BA.debugLine="txtDIRECCIONDESTINATARIO.Text=mData.Get(\"DIRECCIO";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtdirecciondestinatario" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DIRECCION"))))));
 BA.debugLineNum = 528;BA.debugLine="txtKILOS.Text=mData.Get(\"KILOS\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtkilos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KILOS"))))));
 BA.debugLineNum = 529;BA.debugLine="txtNEXPED1.Text=mData.Get(\"NEXPED1\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtnexped1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED1"))))));
 BA.debugLineNum = 530;BA.debugLine="txtNEXPED2.Text=mData.Get(\"NEXPED2\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtnexped2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NEXPED2"))))));
 BA.debugLineNum = 531;BA.debugLine="txtNOMBREDESTINATARIO.Text=mData.Get(\"DESTINATARI";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtnombredestinatario" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DESTINATARIO"))))));
 BA.debugLineNum = 532;BA.debugLine="txtDestino.Text=mData.Get(\"DESTINO\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtdestino" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DESTINO"))))));
 BA.debugLineNum = 533;BA.debugLine="txtPOBLACIONDESTINATARIO.Text=mData.Get(\"POBLACIO";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtpoblaciondestinatario" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("POBLACION"))))));
 BA.debugLineNum = 534;BA.debugLine="txtREFERENCIA1.Text=mData.Get(\"REFERENCIA1\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtreferencia1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("REFERENCIA1"))))));
 BA.debugLineNum = 540;BA.debugLine="txtFECHAALTA.Text=mData.Get(\"FECHA_x0020_SALIDA\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtfechaalta" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FECHA_x0020_SALIDA"))))));
 BA.debugLineNum = 542;BA.debugLine="Dim EstadoExp As String=mData.Get(\"ESTADO\")";
Debug.ShouldStop(536870912);
_estadoexp = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESTADO")))));Debug.locals.put("EstadoExp", _estadoexp);Debug.locals.put("EstadoExp", _estadoexp);
 BA.debugLineNum = 543;BA.debugLine="Dim xtF As B4XView=txtEstadoActual";
Debug.ShouldStop(1073741824);
_xtf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xtf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtestadoactual" /*RemoteObject*/ ).getObject());Debug.locals.put("xtF", _xtf);Debug.locals.put("xtF", _xtf);
 BA.debugLineNum = 544;BA.debugLine="If EstadoExp=\"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_estadoexp,BA.ObjectToString(""))) { 
 BA.debugLineNum = 545;BA.debugLine="EstadoExp=\"ESTADO PENDIENTE DE ACTUALIZAR\"";
Debug.ShouldStop(1);
_estadoexp = BA.ObjectToString("ESTADO PENDIENTE DE ACTUALIZAR");Debug.locals.put("EstadoExp", _estadoexp);
 BA.debugLineNum = 546;BA.debugLine="xtF.Color=xui.Color_LightGray";
Debug.ShouldStop(2);
_xtf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_LightGray"));
 BA.debugLineNum = 547;BA.debugLine="xtF.TextColor=xui.Color_Red";
Debug.ShouldStop(4);
_xtf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 }else {
 BA.debugLineNum = 549;BA.debugLine="If EstadoExp.Contains(\"con incidencia\") Then";
Debug.ShouldStop(16);
if (_estadoexp.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("con incidencia"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 550;BA.debugLine="xtF.Color=xui.Color_Red";
Debug.ShouldStop(32);
_xtf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 551;BA.debugLine="xtF.TextColor=xui.Color_White";
Debug.ShouldStop(64);
_xtf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 }else {
 BA.debugLineNum = 553;BA.debugLine="xtF.Color=0xFFFFA500";
Debug.ShouldStop(256);
_xtf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xffffa500)));
 BA.debugLineNum = 554;BA.debugLine="xtF.TextColor=xui.Color_Black";
Debug.ShouldStop(512);
_xtf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 };
 };
 BA.debugLineNum = 558;BA.debugLine="txtEstadoActual.Text=EstadoExp";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtestadoactual" /*RemoteObject*/ ).runMethod(true,"setText",_estadoexp);
 BA.debugLineNum = 559;BA.debugLine="txtNombreCliente.Text=mData.Get(\"NombreCliente\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtnombrecliente" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreCliente"))))));
 BA.debugLineNum = 560;BA.debugLine="Dim xtF As B4XView=txtNombreResponsableCuenta";
Debug.ShouldStop(32768);
_xtf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xtf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnombreresponsablecuenta" /*RemoteObject*/ ).getObject());Debug.locals.put("xtF", _xtf);Debug.locals.put("xtF", _xtf);
 BA.debugLineNum = 561;BA.debugLine="txtNombreResponsableCuenta.Text=mData.Get(\"Nombre";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtnombreresponsablecuenta" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreResponsableCuenta"))))));
 BA.debugLineNum = 562;BA.debugLine="If txtNombreResponsableCuenta.Text<>\"\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtnombreresponsablecuenta" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 563;BA.debugLine="xtF.Color=0xFFFFA500";
Debug.ShouldStop(262144);
_xtf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xffffa500)));
 };
 BA.debugLineNum = 565;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableclv1_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_MenuBarMenuItem_Action (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("jamtableclv1_menubarmenuitem_action")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","jamtableclv1_menubarmenuitem_action", __ref, _tagmenuitem);}
RemoteObject _lstdatoslineasseleccionadas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 350;BA.debugLine="Sub JamTableCLV1_MenuBarMenuItem_Action(TagMenuIte";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 351;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("EjemploAccionLineasSeleccionadas"),BA.ObjectToString(""))) {
case 0: {
 BA.debugLineNum = 353;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_actualizardatos" /*void*/ );
 break; }
case 1: {
 BA.debugLineNum = 355;BA.debugLine="Dim lstDatosLineasSeleccionadas As List=JamTabl";
Debug.ShouldStop(4);
_lstdatoslineasseleccionadas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatoslineasseleccionadas = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getdatositemsseleccionados" /*RemoteObject*/ );Debug.locals.put("lstDatosLineasSeleccionadas", _lstdatoslineasseleccionadas);Debug.locals.put("lstDatosLineasSeleccionadas", _lstdatoslineasseleccionadas);
 BA.debugLineNum = 356;BA.debugLine="For Each mData As Map In lstDatosLineasSeleccio";
Debug.ShouldStop(8);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group6 = _lstdatoslineasseleccionadas;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group6.runMethod(false,"Get",index6));Debug.locals.put("mData", _mdata);
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 357;BA.debugLine="LogColor(\"DatosLineaSeleccionada : \" & mData,";
Debug.ShouldStop(16);
cexpedicionessinentregartxt.__c.runVoidMethod ("LogImpl","866453511",RemoteObject.concat(RemoteObject.createImmutable("DatosLineaSeleccionada : "),_mdata),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 }
}Debug.locals.put("mData", _mdata);
;
 break; }
case 2: {
 break; }
}
;
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mostrarestadosexpedicion(RemoteObject __ref,RemoteObject _lstestadosexpedicion) throws Exception{
try {
		Debug.PushSubsStack("MostrarEstadosExpedicion (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,714);
if (RapidSub.canDelegate("mostrarestadosexpedicion")) { __ref.runUserSub(false, "cexpedicionessinentregartxt","mostrarestadosexpedicion", __ref, _lstestadosexpedicion); return;}
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
public ResumableSub_MostrarEstadosExpedicion(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref,RemoteObject _lstestadosexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._lstestadosexpedicion = _lstestadosexpedicion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
RemoteObject _lstestadosexpedicion;
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarEstadosExpedicion (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,714);
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
 BA.debugLineNum = 715;BA.debugLine="For Each mData As Map In lstEstadosExpedicion";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 716;BA.debugLine="Log(mData)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","867043330",BA.ObjectToString(_mdata),0);
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 718;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mData.Get(\"ESTA";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESTADO")))))),(Object)(RemoteObject.createImmutable("Estado actual")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 719;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "mostrarestadosexpedicion"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 720;BA.debugLine="End Sub";
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
public static void  _mostrarhistoricoestadosexpedicion(RemoteObject __ref,RemoteObject _lstestadosexpedicion) throws Exception{
try {
		Debug.PushSubsStack("MostrarHistoricoEstadosExpedicion (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,773);
if (RapidSub.canDelegate("mostrarhistoricoestadosexpedicion")) { __ref.runUserSub(false, "cexpedicionessinentregartxt","mostrarhistoricoestadosexpedicion", __ref, _lstestadosexpedicion); return;}
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
public ResumableSub_MostrarHistoricoEstadosExpedicion(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref,RemoteObject _lstestadosexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._lstestadosexpedicion = _lstestadosexpedicion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
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
		Debug.PushSubsStack("MostrarHistoricoEstadosExpedicion (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,773);
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
 BA.debugLineNum = 774;BA.debugLine="If lstEstadosExpedicion.Size=0 Then Return";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 776;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(128);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 777;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
Debug.ShouldStop(256);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd'T'HH:mm:ssXXX"));
 BA.debugLineNum = 779;BA.debugLine="Dim lstEstadosAj As List";
Debug.ShouldStop(1024);
_lstestadosaj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEstadosAj", _lstestadosaj);
 BA.debugLineNum = 780;BA.debugLine="lstEstadosAj.Initialize";
Debug.ShouldStop(2048);
_lstestadosaj.runVoidMethod ("Initialize");
 BA.debugLineNum = 781;BA.debugLine="For Each mData As Map In lstEstadosExpedicion";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 785;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
Debug.ShouldStop(65536);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd'T'HH:mm:ssXXX"));
 BA.debugLineNum = 786;BA.debugLine="Dim TicksFecha As Long=DateTime.DateParse(mData.";
Debug.ShouldStop(131072);
_ticksfecha = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FECHAESTADO")))))));Debug.locals.put("TicksFecha", _ticksfecha);Debug.locals.put("TicksFecha", _ticksfecha);
 BA.debugLineNum = 787;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(262144);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 788;BA.debugLine="Dim mDataAj As Map=CreateMap(\"Centro\":mData.Get(";
Debug.ShouldStop(524288);
_mdataaj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataaj = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Centro")),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CENTRO")))),RemoteObject.createImmutable(("Estado")),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESTADO")))),RemoteObject.createImmutable(("Fecha")),(RemoteObject.concat(parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticksfecha)),RemoteObject.createImmutable(" "),parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_ticksfecha))))}));Debug.locals.put("mDataAj", _mdataaj);Debug.locals.put("mDataAj", _mdataaj);
 BA.debugLineNum = 789;BA.debugLine="lstEstadosAj.Add(mDataAj)";
Debug.ShouldStop(1048576);
_lstestadosaj.runVoidMethod ("Add",(Object)((_mdataaj.getObject())));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 791;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(4194304);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 793;BA.debugLine="Dim pBaseFlexGrid As B4XView = xui.CreatePanel(\"\"";
Debug.ShouldStop(16777216);
_pbaseflexgrid = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pbaseflexgrid = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pBaseFlexGrid", _pbaseflexgrid);Debug.locals.put("pBaseFlexGrid", _pbaseflexgrid);
 BA.debugLineNum = 794;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip,";
Debug.ShouldStop(33554432);
_pbaseflexgrid.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500))))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))}, "*",0, 0))));
 BA.debugLineNum = 796;BA.debugLine="pBaseFlexGrid.LoadLayout(\"scrDialogFlexGrid\")";
Debug.ShouldStop(134217728);
_pbaseflexgrid.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrDialogFlexGrid")),__ref.getField(false, "ba"));
 BA.debugLineNum = 798;BA.debugLine="Dim HeadersFont As Font=xui.CreateDefaultfont(15)";
Debug.ShouldStop(536870912);
_headersfont = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_headersfont = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 15))).getObject());Debug.locals.put("HeadersFont", _headersfont);Debug.locals.put("HeadersFont", _headersfont);
 BA.debugLineNum = 799;BA.debugLine="FlexGridDialog.HeaderFont=HeadersFont";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_setvvvvvvvvvvvvvvvv7",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject()));
 BA.debugLineNum = 801;BA.debugLine="Dim RowsFont As Font=xui.CreateDefaultfont(14)";
Debug.ShouldStop(1);
_rowsfont = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_rowsfont = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14))).getObject());Debug.locals.put("RowsFont", _rowsfont);Debug.locals.put("RowsFont", _rowsfont);
 BA.debugLineNum = 802;BA.debugLine="FlexGridDialog.Font=RowsFont";
Debug.ShouldStop(2);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_setvvvvvvvvvvvvvvvv4",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject()));
 BA.debugLineNum = 803;BA.debugLine="Dim NumColumnasTablaTotales As Int=mDataAj.Size";
Debug.ShouldStop(4);
_numcolumnastablatotales = _mdataaj.runMethod(true,"getSize");Debug.locals.put("NumColumnasTablaTotales", _numcolumnastablatotales);Debug.locals.put("NumColumnasTablaTotales", _numcolumnastablatotales);
 BA.debugLineNum = 804;BA.debugLine="Dim AnchosColumnas(NumColumnasTablaTotales) As In";
Debug.ShouldStop(8);
_anchoscolumnas = RemoteObject.createNewArray ("int", new int[] {_numcolumnastablatotales.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("AnchosColumnas", _anchoscolumnas);
 BA.debugLineNum = 805;BA.debugLine="FlexGridDialog.SetColsNumber(NumColumnasTablaTota";
Debug.ShouldStop(16);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvv1",(Object)(_numcolumnastablatotales));
 BA.debugLineNum = 806;BA.debugLine="Dim ColIndex As Int";
Debug.ShouldStop(32);
_colindex = RemoteObject.createImmutable(0);Debug.locals.put("ColIndex", _colindex);
 BA.debugLineNum = 808;BA.debugLine="For Each k As String In mDataAj.Keys";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 810;BA.debugLine="FlexGridDialog.SetColName(ColIndex,k)";
Debug.ShouldStop(512);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvv4",(Object)(_colindex),(Object)(_k));
 BA.debugLineNum = 812;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex)";
Debug.ShouldStop(2048);
_anchocolumna = _anchoscolumnas.getArrayElement(true,_colindex);Debug.locals.put("AnchoColumna", _anchocolumna);Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 813;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(Fl";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 814;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(Flex";
Debug.ShouldStop(8192);
_anchocolumna = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvvv2").getArrayElement(true,_colindex)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0));Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 815;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
Debug.ShouldStop(16384);
_anchoscolumnas.setArrayElement (_anchocolumna,_colindex);
 if (true) break;

case 17:
//C
this.state = 40;
;
 BA.debugLineNum = 818;BA.debugLine="ColIndex=ColIndex+1";
Debug.ShouldStop(131072);
_colindex = RemoteObject.solve(new RemoteObject[] {_colindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColIndex", _colindex);
 if (true) break;
if (true) break;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 821;BA.debugLine="For Each mDatos As Map In lstEstadosAj";
Debug.ShouldStop(1048576);

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
 BA.debugLineNum = 822;BA.debugLine="Dim Fila(NumColumnasTablaTotales) As String";
Debug.ShouldStop(2097152);
_fila = RemoteObject.createNewArray ("String", new int[] {_numcolumnastablatotales.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 823;BA.debugLine="Dim ColIndex As Int";
Debug.ShouldStop(4194304);
_colindex = RemoteObject.createImmutable(0);Debug.locals.put("ColIndex", _colindex);
 BA.debugLineNum = 824;BA.debugLine="For Each k As String In mDatos.Keys";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 825;BA.debugLine="Fila(ColIndex)=mDatos.get(k)";
Debug.ShouldStop(16777216);
_fila.setArrayElement (BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k)))),_colindex);
 BA.debugLineNum = 826;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex";
Debug.ShouldStop(33554432);
_anchocolumna = _anchoscolumnas.getArrayElement(true,_colindex);Debug.locals.put("AnchoColumna", _anchocolumna);Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 827;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(m";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 828;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(mDa";
Debug.ShouldStop(134217728);
_anchocolumna = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0));Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 829;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
Debug.ShouldStop(268435456);
_anchoscolumnas.setArrayElement (_anchocolumna,_colindex);
 if (true) break;

case 27:
//C
this.state = 44;
;
 BA.debugLineNum = 831;BA.debugLine="ColIndex=ColIndex+1";
Debug.ShouldStop(1073741824);
_colindex = RemoteObject.solve(new RemoteObject[] {_colindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColIndex", _colindex);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 42;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 833;BA.debugLine="FlexGridDialog.AddRow(Fila,False)";
Debug.ShouldStop(1);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_v7",(Object)((_fila)),(Object)(parent.__c.getField(true,"False")));
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
Debug.locals.put("mDatos", _mdatos);
;
 BA.debugLineNum = 837;BA.debugLine="Dim AnchoTotalTabla As Int";
Debug.ShouldStop(16);
_anchototaltabla = RemoteObject.createImmutable(0);Debug.locals.put("AnchoTotalTabla", _anchototaltabla);
 BA.debugLineNum = 838;BA.debugLine="For ColIndex=0 To NumColumnasTablaTotales-1";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 839;BA.debugLine="FlexGridDialog.SetColWidth(ColIndex,AnchosColumn";
Debug.ShouldStop(64);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvv5",(Object)(_colindex),(Object)(_anchoscolumnas.getArrayElement(true,_colindex)));
 BA.debugLineNum = 840;BA.debugLine="AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(C";
Debug.ShouldStop(128);
_anchototaltabla = RemoteObject.solve(new RemoteObject[] {_anchototaltabla,_anchoscolumnas.getArrayElement(true,_colindex)}, "+",1, 1);Debug.locals.put("AnchoTotalTabla", _anchototaltabla);
 if (true) break;
if (true) break;
Debug.locals.put("ColIndex", _colindex);
;
 BA.debugLineNum = 843;BA.debugLine="For RowIndex=0 To FlexGridDialog.RowCount-1";
Debug.ShouldStop(1024);

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
 BA.debugLineNum = 844;BA.debugLine="FlexGridDialog.SetRowHeight(RowIndex,50dip)";
Debug.ShouldStop(2048);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvvvv5",(Object)(BA.numberCast(int.class, _rowindex)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 if (true) break;
if (true) break;

case 36:
//C
this.state = -1;
Debug.locals.put("RowIndex", _rowindex);
;
 BA.debugLineNum = 846;BA.debugLine="Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.Ro";
Debug.ShouldStop(8192);
_altototal = BA.numberCast(int.class, parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(true,"_getvvvvvvvvvvvvvv6")),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "*+",1, 1))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))}, "*",0, 0)))));Debug.locals.put("AltoTotal", _altototal);Debug.locals.put("AltoTotal", _altototal);
 BA.debugLineNum = 847;BA.debugLine="FlexGridDialog.Base.Width=AnchoTotalTabla";
Debug.ShouldStop(16384);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvv0").runMethod(true,"setWidth",BA.numberCast(double.class, _anchototaltabla));
 BA.debugLineNum = 848;BA.debugLine="FlexGridDialog.Base.Height=AltoTotal";
Debug.ShouldStop(32768);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvv0").runMethod(true,"setHeight",BA.numberCast(double.class, _altototal));
 BA.debugLineNum = 850;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTot";
Debug.ShouldStop(131072);
_pbaseflexgrid.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_anchototaltabla,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_altototal,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "+",1, 1))));
 BA.debugLineNum = 852;BA.debugLine="Sleep(100)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "mostrarhistoricoestadosexpedicion"),BA.numberCast(int.class, 100));
this.state = 49;
return;
case 49:
//C
this.state = -1;
;
 BA.debugLineNum = 853;BA.debugLine="FlexGridDialog.Invalidate";
Debug.ShouldStop(1048576);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvv1");
 BA.debugLineNum = 855;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(4194304);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 857;BA.debugLine="Dialog.Title=\"Histórico Estados Expedición\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Histórico Estados Expedición")));
 BA.debugLineNum = 858;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseF";
Debug.ShouldStop(33554432);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_pbaseflexgrid),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 859;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(67108864);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 860;BA.debugLine="bOK.TextSize=16";
Debug.ShouldStop(134217728);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 861;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "mostrarhistoricoestadosexpedicion"), _rsub);
this.state = 50;
return;
case 50:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 863;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 864;BA.debugLine="End Sub";
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
public static void  _mostrarincidenciasexpedicion(RemoteObject __ref,RemoteObject _lstincidenciasexpedicion) throws Exception{
try {
		Debug.PushSubsStack("MostrarIncidenciasExpedicion (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,867);
if (RapidSub.canDelegate("mostrarincidenciasexpedicion")) { __ref.runUserSub(false, "cexpedicionessinentregartxt","mostrarincidenciasexpedicion", __ref, _lstincidenciasexpedicion); return;}
ResumableSub_MostrarIncidenciasExpedicion rsub = new ResumableSub_MostrarIncidenciasExpedicion(null,__ref,_lstincidenciasexpedicion);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarIncidenciasExpedicion extends BA.ResumableSub {
public ResumableSub_MostrarIncidenciasExpedicion(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref,RemoteObject _lstincidenciasexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._lstincidenciasexpedicion = _lstincidenciasexpedicion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
RemoteObject _lstincidenciasexpedicion;
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _lstincidenciasaj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
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
RemoteObject group1;
int index1;
int groupLen1;
RemoteObject group9;
int index9;
int groupLen9;
RemoteObject group28;
int index28;
int groupLen28;
RemoteObject group37;
int index37;
int groupLen37;
RemoteObject group40;
int index40;
int groupLen40;
int step52;
int limit52;
int step56;
int limit56;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarIncidenciasExpedicion (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,867);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("lstIncidenciasExpedicion", _lstincidenciasexpedicion);
 BA.debugLineNum = 868;BA.debugLine="For Each mData As Map In lstIncidenciasExpedicion";
Debug.ShouldStop(8);
if (true) break;

case 1:
//for
this.state = 4;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group1 = _lstincidenciasexpedicion;
index1 = 0;
groupLen1 = group1.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 40;
if (true) break;

case 40:
//C
this.state = 4;
if (index1 < groupLen1) {
this.state = 3;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group1.runMethod(false,"Get",index1));Debug.locals.put("mData", _mdata);}
if (true) break;

case 41:
//C
this.state = 40;
index1++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 3:
//C
this.state = 41;
 BA.debugLineNum = 869;BA.debugLine="Log(mData)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","867239938",BA.ObjectToString(_mdata),0);
 if (true) break;
if (true) break;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 871;BA.debugLine="If lstIncidenciasExpedicion.Size=0 Then Return";
Debug.ShouldStop(64);

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_lstincidenciasexpedicion.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
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
 BA.debugLineNum = 873;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(256);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 874;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
Debug.ShouldStop(512);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd'T'HH:mm:ssXXX"));
 BA.debugLineNum = 876;BA.debugLine="Dim lstIncidenciasAj As List";
Debug.ShouldStop(2048);
_lstincidenciasaj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstIncidenciasAj", _lstincidenciasaj);
 BA.debugLineNum = 877;BA.debugLine="lstIncidenciasAj.Initialize";
Debug.ShouldStop(4096);
_lstincidenciasaj.runVoidMethod ("Initialize");
 BA.debugLineNum = 878;BA.debugLine="For Each mData As Map In lstIncidenciasExpedicion";
Debug.ShouldStop(8192);
if (true) break;

case 10:
//for
this.state = 13;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group9 = _lstincidenciasexpedicion;
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 42;
if (true) break;

case 42:
//C
this.state = 13;
if (index9 < groupLen9) {
this.state = 12;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group9.runMethod(false,"Get",index9));Debug.locals.put("mData", _mdata);}
if (true) break;

case 43:
//C
this.state = 42;
index9++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 12:
//C
this.state = 43;
 BA.debugLineNum = 882;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
Debug.ShouldStop(131072);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd'T'HH:mm:ssXXX"));
 BA.debugLineNum = 883;BA.debugLine="Dim TicksFecha As Long=DateTime.DateParse(mData.";
Debug.ShouldStop(262144);
_ticksfecha = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FECHA")))))));Debug.locals.put("TicksFecha", _ticksfecha);Debug.locals.put("TicksFecha", _ticksfecha);
 BA.debugLineNum = 884;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(524288);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 885;BA.debugLine="Dim mDataAj As Map=CreateMap(\"CodigoIncidencia\":";
Debug.ShouldStop(1048576);
_mdataaj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataaj = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("CodigoIncidencia")),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODINCIDENCIA")))),RemoteObject.createImmutable(("Descripcion")),_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DESCRIPCION")))),RemoteObject.createImmutable(("Fecha")),(RemoteObject.concat(parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticksfecha)),RemoteObject.createImmutable(" "),parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_ticksfecha))))}));Debug.locals.put("mDataAj", _mdataaj);Debug.locals.put("mDataAj", _mdataaj);
 BA.debugLineNum = 886;BA.debugLine="lstIncidenciasAj.Add(mDataAj)";
Debug.ShouldStop(2097152);
_lstincidenciasaj.runVoidMethod ("Add",(Object)((_mdataaj.getObject())));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 888;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(8388608);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 890;BA.debugLine="Dim pBaseFlexGrid As B4XView = xui.CreatePanel(\"\"";
Debug.ShouldStop(33554432);
_pbaseflexgrid = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pbaseflexgrid = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pBaseFlexGrid", _pbaseflexgrid);Debug.locals.put("pBaseFlexGrid", _pbaseflexgrid);
 BA.debugLineNum = 891;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip,";
Debug.ShouldStop(67108864);
_pbaseflexgrid.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500))))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))}, "*",0, 0))));
 BA.debugLineNum = 893;BA.debugLine="pBaseFlexGrid.LoadLayout(\"scrDialogFlexGrid\")";
Debug.ShouldStop(268435456);
_pbaseflexgrid.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrDialogFlexGrid")),__ref.getField(false, "ba"));
 BA.debugLineNum = 895;BA.debugLine="Dim HeadersFont As Font=xui.CreateDefaultfont(15)";
Debug.ShouldStop(1073741824);
_headersfont = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_headersfont = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 15))).getObject());Debug.locals.put("HeadersFont", _headersfont);Debug.locals.put("HeadersFont", _headersfont);
 BA.debugLineNum = 896;BA.debugLine="FlexGridDialog.HeaderFont=HeadersFont";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_setvvvvvvvvvvvvvvvv7",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject()));
 BA.debugLineNum = 898;BA.debugLine="Dim RowsFont As Font=xui.CreateDefaultfont(14)";
Debug.ShouldStop(2);
_rowsfont = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_rowsfont = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14))).getObject());Debug.locals.put("RowsFont", _rowsfont);Debug.locals.put("RowsFont", _rowsfont);
 BA.debugLineNum = 899;BA.debugLine="FlexGridDialog.Font=RowsFont";
Debug.ShouldStop(4);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_setvvvvvvvvvvvvvvvv4",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject()));
 BA.debugLineNum = 900;BA.debugLine="Dim NumColumnasTablaTotales As Int=mDataAj.Size";
Debug.ShouldStop(8);
_numcolumnastablatotales = _mdataaj.runMethod(true,"getSize");Debug.locals.put("NumColumnasTablaTotales", _numcolumnastablatotales);Debug.locals.put("NumColumnasTablaTotales", _numcolumnastablatotales);
 BA.debugLineNum = 901;BA.debugLine="Dim AnchosColumnas(NumColumnasTablaTotales) As In";
Debug.ShouldStop(16);
_anchoscolumnas = RemoteObject.createNewArray ("int", new int[] {_numcolumnastablatotales.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("AnchosColumnas", _anchoscolumnas);
 BA.debugLineNum = 902;BA.debugLine="FlexGridDialog.SetColsNumber(NumColumnasTablaTota";
Debug.ShouldStop(32);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvv1",(Object)(_numcolumnastablatotales));
 BA.debugLineNum = 903;BA.debugLine="Dim ColIndex As Int";
Debug.ShouldStop(64);
_colindex = RemoteObject.createImmutable(0);Debug.locals.put("ColIndex", _colindex);
 BA.debugLineNum = 905;BA.debugLine="For Each k As String In mDataAj.Keys";
Debug.ShouldStop(256);
if (true) break;

case 14:
//for
this.state = 21;
group28 = _mdataaj.runMethod(false,"Keys");
index28 = 0;
groupLen28 = group28.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 44;
if (true) break;

case 44:
//C
this.state = 21;
if (index28 < groupLen28) {
this.state = 16;
_k = BA.ObjectToString(group28.runMethod(false,"Get",index28));Debug.locals.put("k", _k);}
if (true) break;

case 45:
//C
this.state = 44;
index28++;
Debug.locals.put("k", _k);
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 907;BA.debugLine="FlexGridDialog.SetColName(ColIndex,k)";
Debug.ShouldStop(1024);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvv4",(Object)(_colindex),(Object)(_k));
 BA.debugLineNum = 909;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex)";
Debug.ShouldStop(4096);
_anchocolumna = _anchoscolumnas.getArrayElement(true,_colindex);Debug.locals.put("AnchoColumna", _anchocolumna);Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 910;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(Fl";
Debug.ShouldStop(8192);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("<",_anchocolumna,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvvv2").getArrayElement(true,_colindex)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 911;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(Flex";
Debug.ShouldStop(16384);
_anchocolumna = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvvv2").getArrayElement(true,_colindex)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0));Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 912;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
Debug.ShouldStop(32768);
_anchoscolumnas.setArrayElement (_anchocolumna,_colindex);
 if (true) break;

case 20:
//C
this.state = 45;
;
 BA.debugLineNum = 915;BA.debugLine="ColIndex=ColIndex+1";
Debug.ShouldStop(262144);
_colindex = RemoteObject.solve(new RemoteObject[] {_colindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColIndex", _colindex);
 if (true) break;
if (true) break;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 918;BA.debugLine="For Each mDatos As Map In lstIncidenciasAj";
Debug.ShouldStop(2097152);

case 21:
//for
this.state = 32;
_mdatos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group37 = _lstincidenciasaj;
index37 = 0;
groupLen37 = group37.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDatos", _mdatos);
this.state = 46;
if (true) break;

case 46:
//C
this.state = 32;
if (index37 < groupLen37) {
this.state = 23;
_mdatos = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group37.runMethod(false,"Get",index37));Debug.locals.put("mDatos", _mdatos);}
if (true) break;

case 47:
//C
this.state = 46;
index37++;
Debug.locals.put("mDatos", _mdatos);
if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 919;BA.debugLine="Dim Fila(NumColumnasTablaTotales) As String";
Debug.ShouldStop(4194304);
_fila = RemoteObject.createNewArray ("String", new int[] {_numcolumnastablatotales.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 920;BA.debugLine="Dim ColIndex As Int";
Debug.ShouldStop(8388608);
_colindex = RemoteObject.createImmutable(0);Debug.locals.put("ColIndex", _colindex);
 BA.debugLineNum = 921;BA.debugLine="For Each k As String In mDatos.Keys";
Debug.ShouldStop(16777216);
if (true) break;

case 24:
//for
this.state = 31;
group40 = _mdatos.runMethod(false,"Keys");
index40 = 0;
groupLen40 = group40.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 48;
if (true) break;

case 48:
//C
this.state = 31;
if (index40 < groupLen40) {
this.state = 26;
_k = BA.ObjectToString(group40.runMethod(false,"Get",index40));Debug.locals.put("k", _k);}
if (true) break;

case 49:
//C
this.state = 48;
index40++;
Debug.locals.put("k", _k);
if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 922;BA.debugLine="Fila(ColIndex)=mDatos.get(k)";
Debug.ShouldStop(33554432);
_fila.setArrayElement (BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k)))),_colindex);
 BA.debugLineNum = 923;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex";
Debug.ShouldStop(67108864);
_anchocolumna = _anchoscolumnas.getArrayElement(true,_colindex);Debug.locals.put("AnchoColumna", _anchocolumna);Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 924;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(m";
Debug.ShouldStop(134217728);
if (true) break;

case 27:
//if
this.state = 30;
if (RemoteObject.solveBoolean("<",_anchocolumna,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 925;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(mDa";
Debug.ShouldStop(268435456);
_anchocolumna = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0));Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 926;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
Debug.ShouldStop(536870912);
_anchoscolumnas.setArrayElement (_anchocolumna,_colindex);
 if (true) break;

case 30:
//C
this.state = 49;
;
 BA.debugLineNum = 928;BA.debugLine="ColIndex=ColIndex+1";
Debug.ShouldStop(-2147483648);
_colindex = RemoteObject.solve(new RemoteObject[] {_colindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColIndex", _colindex);
 if (true) break;
if (true) break;

case 31:
//C
this.state = 47;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 930;BA.debugLine="FlexGridDialog.AddRow(Fila,False)";
Debug.ShouldStop(2);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_v7",(Object)((_fila)),(Object)(parent.__c.getField(true,"False")));
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
Debug.locals.put("mDatos", _mdatos);
;
 BA.debugLineNum = 934;BA.debugLine="Dim AnchoTotalTabla As Int";
Debug.ShouldStop(32);
_anchototaltabla = RemoteObject.createImmutable(0);Debug.locals.put("AnchoTotalTabla", _anchototaltabla);
 BA.debugLineNum = 935;BA.debugLine="For ColIndex=0 To NumColumnasTablaTotales-1";
Debug.ShouldStop(64);
if (true) break;

case 33:
//for
this.state = 36;
step52 = 1;
limit52 = RemoteObject.solve(new RemoteObject[] {_numcolumnastablatotales,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_colindex = BA.numberCast(int.class, 0) ;
Debug.locals.put("ColIndex", _colindex);
this.state = 50;
if (true) break;

case 50:
//C
this.state = 36;
if ((step52 > 0 && _colindex.<Integer>get().intValue() <= limit52) || (step52 < 0 && _colindex.<Integer>get().intValue() >= limit52)) this.state = 35;
if (true) break;

case 51:
//C
this.state = 50;
_colindex = RemoteObject.createImmutable((int)(0 + _colindex.<Integer>get().intValue() + step52)) ;
Debug.locals.put("ColIndex", _colindex);
if (true) break;

case 35:
//C
this.state = 51;
 BA.debugLineNum = 936;BA.debugLine="FlexGridDialog.SetColWidth(ColIndex,AnchosColumn";
Debug.ShouldStop(128);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvv5",(Object)(_colindex),(Object)(_anchoscolumnas.getArrayElement(true,_colindex)));
 BA.debugLineNum = 937;BA.debugLine="AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(C";
Debug.ShouldStop(256);
_anchototaltabla = RemoteObject.solve(new RemoteObject[] {_anchototaltabla,_anchoscolumnas.getArrayElement(true,_colindex)}, "+",1, 1);Debug.locals.put("AnchoTotalTabla", _anchototaltabla);
 if (true) break;
if (true) break;
Debug.locals.put("ColIndex", _colindex);
;
 BA.debugLineNum = 940;BA.debugLine="For RowIndex=0 To FlexGridDialog.RowCount-1";
Debug.ShouldStop(2048);

case 36:
//for
this.state = 39;
step56 = 1;
limit56 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(true,"_getvvvvvvvvvvvvvv6"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_rowindex = 0 ;
Debug.locals.put("RowIndex", _rowindex);
this.state = 52;
if (true) break;

case 52:
//C
this.state = 39;
if ((step56 > 0 && _rowindex <= limit56) || (step56 < 0 && _rowindex >= limit56)) this.state = 38;
if (true) break;

case 53:
//C
this.state = 52;
_rowindex = ((int)(0 + _rowindex + step56)) ;
Debug.locals.put("RowIndex", _rowindex);
if (true) break;

case 38:
//C
this.state = 53;
 BA.debugLineNum = 941;BA.debugLine="FlexGridDialog.SetRowHeight(RowIndex,50dip)";
Debug.ShouldStop(4096);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvvvv5",(Object)(BA.numberCast(int.class, _rowindex)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 if (true) break;
if (true) break;

case 39:
//C
this.state = -1;
Debug.locals.put("RowIndex", _rowindex);
;
 BA.debugLineNum = 943;BA.debugLine="Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.Ro";
Debug.ShouldStop(16384);
_altototal = BA.numberCast(int.class, parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(true,"_getvvvvvvvvvvvvvv6")),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "*+",1, 1))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))}, "*",0, 0)))));Debug.locals.put("AltoTotal", _altototal);Debug.locals.put("AltoTotal", _altototal);
 BA.debugLineNum = 944;BA.debugLine="FlexGridDialog.Base.Width=AnchoTotalTabla";
Debug.ShouldStop(32768);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvv0").runMethod(true,"setWidth",BA.numberCast(double.class, _anchototaltabla));
 BA.debugLineNum = 945;BA.debugLine="FlexGridDialog.Base.Height=AltoTotal";
Debug.ShouldStop(65536);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvv0").runMethod(true,"setHeight",BA.numberCast(double.class, _altototal));
 BA.debugLineNum = 947;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTot";
Debug.ShouldStop(262144);
_pbaseflexgrid.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_anchototaltabla,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_altototal,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "+",1, 1))));
 BA.debugLineNum = 949;BA.debugLine="Sleep(100)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "mostrarincidenciasexpedicion"),BA.numberCast(int.class, 100));
this.state = 54;
return;
case 54:
//C
this.state = -1;
;
 BA.debugLineNum = 950;BA.debugLine="FlexGridDialog.Invalidate";
Debug.ShouldStop(2097152);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvv1");
 BA.debugLineNum = 952;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(8388608);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 953;BA.debugLine="Dialog.Title=\"Histórico Incidencias Expedición\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Histórico Incidencias Expedición")));
 BA.debugLineNum = 954;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseF";
Debug.ShouldStop(33554432);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_pbaseflexgrid),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 955;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(67108864);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 956;BA.debugLine="bOK.TextSize=16";
Debug.ShouldStop(134217728);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 957;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "mostrarincidenciasexpedicion"), _rsub);
this.state = 55;
return;
case 55:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 958;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 960;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cexpedicionessinentregartxt","salirmodulo", __ref);}
 BA.debugLineNum = 344;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="frm.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 346;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(33554432);
cexpedicionessinentregartxt._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Show (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cexpedicionessinentregartxt","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cexpedicionessinentregartxt parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionessinentregartxt parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cexpedicionessinentregartxt) ","cexpedicionessinentregartxt",32,__ref.getField(false, "ba"),__ref,54);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 56;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 57;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(16777216);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 58;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(33554432);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 59;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(67108864);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 60;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(134217728);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 61;BA.debugLine="frm.RootPane.LoadLayout(\"scrExpedicionesSinEntreg";
Debug.ShouldStop(268435456);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrExpedicionesSinEntregarTXT")));
 BA.debugLineNum = 62;BA.debugLine="Sleep(0)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "show"),BA.numberCast(int.class, 0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 BA.debugLineNum = 65;BA.debugLine="frm.Title=Main.PrefijoTitleForms &  \"  \" & \"Exped";
Debug.ShouldStop(1);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("  "),RemoteObject.createImmutable("Expediciones Sin Entregar TXT")));
 BA.debugLineNum = 67;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(4);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 70;BA.debugLine="frm.Show";
Debug.ShouldStop(32);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 80;BA.debugLine="JamTableCLV1.ColorPanelSeleccionado=0xFF87CEFA";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setcolorpanelseleccionado" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff87cefa)));
 BA.debugLineNum = 82;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.ConfigurarT";
Debug.ShouldStop(131072);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_configurartableclv" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ListaExpedicionesSinEntregarTXT.json")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 83;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 84;BA.debugLine="Log(mRes)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","866060318",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 85;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 86;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 87;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionessinentregartxt", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
 BA.debugLineNum = 88;BA.debugLine="frm.Close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 89;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 93;BA.debugLine="JamTableCLV1.AddMenuItemToMenuInMenuBar(\"Actualiz";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_addmenuitemtomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Actualizar")),(Object)(BA.ObjectToString("Actualizar")),(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 96;BA.debugLine="JamTableCLV1.AlturaItems=190dip";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setalturaitems" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190))));
 BA.debugLineNum = 98;BA.debugLine="JamTableCLV1.ModoSeleccionItems=JamTableCLV1.Modo";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmodoseleccionitems" /*RemoteObject*/ ,__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_modoseleccionindividualtemp" /*RemoteObject*/ ));
 BA.debugLineNum = 101;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 103;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(64);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 104;BA.debugLine="mSQL.ExecNonQuery(\"PRAGMA journal_mode = wal\")";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("PRAGMA journal_mode = wal")));
 BA.debugLineNum = 106;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 108;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.cexpedicionessinentregartxt.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 109;BA.debugLine="End Sub";
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
}