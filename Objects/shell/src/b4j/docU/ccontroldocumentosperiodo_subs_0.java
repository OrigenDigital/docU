package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ccontroldocumentosperiodo_subs_0 {


public static void  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("actualizardatos")) { __ref.runUserSub(false, "ccontroldocumentosperiodo","actualizardatos", __ref); return;}
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
public ResumableSub_ActualizarDatos(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _docalmf = RemoteObject.createImmutable("");
RemoteObject _almf = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject group52;
int index52;
int groupLen52;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,135);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 137;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(256);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 139;BA.debugLine="JamTableCLV1.Clear";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 141;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblAlbVtaDepNavLin";
Debug.ShouldStop(4096);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblAlbVtaDepNavLin")));
 BA.debugLineNum = 142;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblDocumentosPerio";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblDocumentosPeriodo")));
 BA.debugLineNum = 145;BA.debugLine="Wait For(ActualizarDatosDocumentosNAV) complete (";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_actualizardatosdocumentosnav" /*RemoteObject*/ ));
this.state = 49;
return;
case 49:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 146;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 147;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 149;BA.debugLine="SalirModulo";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 150;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 153;BA.debugLine="mSQL.ExecNonQuery(\"update tblAlbVtaDepNavLin set";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("update tblAlbVtaDepNavLin set Importe=Qty*Precio*(100-Descuento)/100")));
 BA.debugLineNum = 154;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAlbVtaDepNavLin set";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAlbVtaDepNavLin set Almacen=? where AlmOrig=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("ADESA")),(RemoteObject.createImmutable("0237"))})))));
 BA.debugLineNum = 155;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAlbVtaDepNavLin set";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAlbVtaDepNavLin set Almacen=? where GRC like ?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("PROTEC")),(RemoteObject.createImmutable("ROPA%"))})))));
 BA.debugLineNum = 161;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 162;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 163;BA.debugLine="sb.Append(\"insert into tblDocumentosPeriodo (Fech";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("insert into tblDocumentosPeriodo (FechaDocumento, TipoDocumento, Documento, Cliente, NombreCliente, AlmacenDocumento, AlmacenFisico, ")));
 BA.debugLineNum = 164;BA.debugLine="sb.Append(\"Personalizado, Prioridad, Fase, FechaF";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Personalizado, Prioridad, Fase, FechaFase, ResponsableFase, InfoAdicionalFase, NumExpedicion, Observaciones, TotalQty, TotalImp)")));
 BA.debugLineNum = 165;BA.debugLine="sb.Append(\" Select Fecha As FechaDocumento, TipoD";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" Select Fecha As FechaDocumento, TipoDoc As TipoDocumento, Documento, Cliente, NombreCliente, AlmOrig As AlmacenDocumento , Almacen As AlmacenFisico,")));
 BA.debugLineNum = 166;BA.debugLine="sb.Append(\"'NO' As Personalizado, '' as Prioridad";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("'NO' As Personalizado, '' as Prioridad, '' as Fase, 0 as FechaFase, '' as ResponsableFase, '' as NumExpedicion, '' as InfoAdicionalFase, '' as Observaciones,")));
 BA.debugLineNum = 167;BA.debugLine="sb.Append(\"sum (Qty) As TotalQty, sum (Importe) A";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("sum (Qty) As TotalQty, sum (Importe) As TotalImp")));
 BA.debugLineNum = 168;BA.debugLine="sb.Append(\" from tblAlbVtaDepNavLin group by Fech";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" from tblAlbVtaDepNavLin group by Fecha, TipoDoc, Documento, Cliente, NombreCliente, AlmOrig, Almacen")));
 BA.debugLineNum = 169;BA.debugLine="mSQL.ExecNonQuery(sb.ToString)";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 171;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosPeriodo s";
Debug.ShouldStop(1024);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDocumentosPeriodo set Personalizado=? where Documento in (Select DISTINCT Documento from tblAlbVtaDepNavLin where Personalizado=1)")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("SI"))})))));
 BA.debugLineNum = 172;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosPeriodo s";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDocumentosPeriodo set NombreResponsableCuenta=? where TipoDocumento=? or TipoDocumento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("N/A")),RemoteObject.createImmutable(("CDEV")),(RemoteObject.createImmutable("RTTrf"))})))));
 BA.debugLineNum = 176;BA.debugLine="wait for(BorrarDatosBatchAnterioresUUIDSesion) co";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_borrardatosbatchanterioresuuidsesion" /*RemoteObject*/ ));
this.state = 50;
return;
case 50:
//C
this.state = 5;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 177;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 178;BA.debugLine="JamLoadingIndicator1.close";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 179;BA.debugLine="SalirModulo";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 180;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 183;BA.debugLine="wait for(InsertarLineasBatchDocumentos) complete";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_insertarlineasbatchdocumentos" /*RemoteObject*/ ));
this.state = 51;
return;
case 51:
//C
this.state = 9;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 184;BA.debugLine="If rBool=False Then";
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
 BA.debugLineNum = 185;BA.debugLine="JamLoadingIndicator1.close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 186;BA.debugLine="SalirModulo";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 187;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 190;BA.debugLine="wait for(FaseActualDocumentosBacthUUID) complete";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_faseactualdocumentosbacthuuid" /*RemoteObject*/ ));
this.state = 52;
return;
case 52:
//C
this.state = 13;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 191;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 192;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 193;BA.debugLine="JamLoadingIndicator1.close";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 194;BA.debugLine="SalirModulo";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 204;BA.debugLine="wait for(CargaDocumentosAlmacenManual) complete (";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_cargadocumentosalmacenmanual" /*RemoteObject*/ ));
this.state = 53;
return;
case 53:
//C
this.state = 17;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 205;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 206;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 208;BA.debugLine="SalirModulo";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 209;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 211;BA.debugLine="If Accion=\"OK\" Then";
Debug.ShouldStop(262144);

case 20:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("OK"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 212;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(524288);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 213;BA.debugLine="For Each m As Map In lstReg";
Debug.ShouldStop(1048576);
if (true) break;

case 23:
//for
this.state = 26;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group52 = _lstreg;
index52 = 0;
groupLen52 = group52.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 54;
if (true) break;

case 54:
//C
this.state = 26;
if (index52 < groupLen52) {
this.state = 25;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group52.runMethod(false,"Get",index52));Debug.locals.put("m", _m);}
if (true) break;

case 55:
//C
this.state = 54;
index52++;
Debug.locals.put("m", _m);
if (true) break;

case 25:
//C
this.state = 55;
 BA.debugLineNum = 214;BA.debugLine="Dim DocAlmF As String=m.Get(\"Documento\")";
Debug.ShouldStop(2097152);
_docalmf = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocAlmF", _docalmf);Debug.locals.put("DocAlmF", _docalmf);
 BA.debugLineNum = 215;BA.debugLine="Dim AlmF As String=m.Get(\"Almacen\")";
Debug.ShouldStop(4194304);
_almf = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Almacen")))));Debug.locals.put("AlmF", _almf);Debug.locals.put("AlmF", _almf);
 BA.debugLineNum = 216;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosPeriodo";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDocumentosPeriodo set AlmacenFisico=? where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_almf),(_docalmf)})))));
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
Debug.locals.put("m", _m);
;
 if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 220;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosPeriodo s";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDocumentosPeriodo set Fase=? where Fase=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("NO INICIADO")),(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 222;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 224;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(-2147483648);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblDocumentosPeriodo")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 225;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
Debug.ShouldStop(1);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 226;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatos"), _rsub);
this.state = 56;
return;
case 56:
//C
this.state = 28;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 227;BA.debugLine="rs.Close";
Debug.ShouldStop(4);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 229;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(16);
if (true) break;

case 28:
//if
this.state = 48;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 230;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 231;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 232;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatos"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 34;
;
 BA.debugLineNum = 234;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 235;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatos"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = 34;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 236;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 237;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 238;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 37:
//C
this.state = 38;
;
 BA.debugLineNum = 241;BA.debugLine="ExitApplication";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 243;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(262144);

case 38:
//if
this.state = 47;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 244;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(524288);
if (true) break;

case 41:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 43;
;}if (true) break;

case 43:
//C
this.state = 46;
if (true) return ;
if (true) break;

case 46:
//C
this.state = 47;
;
 BA.debugLineNum = 245;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 246;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatos"), _msa);
this.state = 59;
return;
case 59:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 48;
;
 if (true) break;

case 48:
//C
this.state = -1;
;
 BA.debugLineNum = 251;BA.debugLine="fx.Msgbox(frm,\"Datos actualizados.\",\"Aviso\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Datos actualizados.")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 253;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizardatosdocumentosnav(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosDocumentosNAV (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,367);
if (RapidSub.canDelegate("actualizardatosdocumentosnav")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","actualizardatosdocumentosnav", __ref);}
ResumableSub_ActualizarDatosDocumentosNAV rsub = new ResumableSub_ActualizarDatosDocumentosNAV(null,__ref);
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
public static class ResumableSub_ActualizarDatosDocumentosNAV extends BA.ResumableSub {
public ResumableSub_ActualizarDatosDocumentosNAV(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _sfechain = RemoteObject.createImmutable("");
RemoteObject _sfechafin = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosDocumentosNAV (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,367);
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
 BA.debugLineNum = 368;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblAlbVtaDepNavLin";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblAlbVtaDepNavLin")));
 BA.debugLineNum = 369;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(65536);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 370;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(131072);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 371;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 373;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(1048576);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 374;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(2097152);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 375;BA.debugLine="Dim Comando As String=\"InfoNavControlDocumentosPe";
Debug.ShouldStop(4194304);
_comando = BA.ObjectToString("InfoNavControlDocumentosPeriodo");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 376;BA.debugLine="Dim sFechaIn As String=DateTime.Date(FechaInicial";
Debug.ShouldStop(8388608);
_sfechain = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ )));Debug.locals.put("sFechaIn", _sfechain);Debug.locals.put("sFechaIn", _sfechain);
 BA.debugLineNum = 377;BA.debugLine="Dim sFechaFin As String=DateTime.Date(FechaFinalL";
Debug.ShouldStop(16777216);
_sfechafin = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechafinallong" /*RemoteObject*/ )));Debug.locals.put("sFechaFin", _sfechafin);Debug.locals.put("sFechaFin", _sfechafin);
 BA.debugLineNum = 378;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(33554432);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 379;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(67108864);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_sfechain),(_sfechafin)})),(Object)(__ref));
 BA.debugLineNum = 381;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatosdocumentosnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 382;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(536870912);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 383;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 384;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 385;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatosdocumentosnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 386;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 387;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 390;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 391;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 392;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 393;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de Documentos para el periodo seleccionado.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 394;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "actualizardatosdocumentosnav"), _msa);
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
 BA.debugLineNum = 396;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 397;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 400;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(32768);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 408;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblAlbVtaDepNavLin\",ls";
Debug.ShouldStop(8388608);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblAlbVtaDepNavLin")),(Object)(_lstreg));
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
 BA.debugLineNum = 411;BA.debugLine="Return mRes";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 412;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _borrardatosbatchanterioresmaquinausuario(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosBatchAnterioresMaquinaUsuario (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,682);
if (RapidSub.canDelegate("borrardatosbatchanterioresmaquinausuario")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","borrardatosbatchanterioresmaquinausuario", __ref);}
ResumableSub_BorrarDatosBatchAnterioresMaquinaUsuario rsub = new ResumableSub_BorrarDatosBatchAnterioresMaquinaUsuario(null,__ref);
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
public static class ResumableSub_BorrarDatosBatchAnterioresMaquinaUsuario extends BA.ResumableSub {
public ResumableSub_BorrarDatosBatchAnterioresMaquinaUsuario(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosBatchAnterioresMaquinaUsuario (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,682);
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
 BA.debugLineNum = 684;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(2048);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 685;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(4096);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 686;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
Debug.ShouldStop(8192);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarLineasFaseActualDocumentoBacthMaquinaUsuario")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(parent._main._datosusuario /*RemoteObject*/ .getField(true,"Dispositivo" /*RemoteObject*/ )),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 687;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(16384);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 688;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(32768);
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 689;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "borrardatosbatchanterioresmaquinausuario"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 691;BA.debugLine="If result=False Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 692;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthMaquinaUsuario")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 693;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "borrardatosbatchanterioresmaquinausuario"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 BA.debugLineNum = 694;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 696;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 698;BA.debugLine="End Sub";
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
public static void  _ejecutarbatch_completed(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _borrardatosbatchanterioresuuidsesion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosBatchAnterioresUUIDSesion (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,700);
if (RapidSub.canDelegate("borrardatosbatchanterioresuuidsesion")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","borrardatosbatchanterioresuuidsesion", __ref);}
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
public ResumableSub_BorrarDatosBatchAnterioresUUIDSesion(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosBatchAnterioresUUIDSesion (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,700);
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
 BA.debugLineNum = 702;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(536870912);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 703;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(1073741824);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 704;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
Debug.ShouldStop(-2147483648);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarLineasFaseActualDocumentoBacthUUID")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_uuidsesion" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 705;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(1);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 706;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(2);
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 707;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "borrardatosbatchanterioresuuidsesion"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 709;BA.debugLine="If result=False Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 711;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthUUID")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 712;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "borrardatosbatchanterioresuuidsesion"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 BA.debugLineNum = 713;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 715;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 717;BA.debugLine="End Sub";
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
public static RemoteObject  _borrardocumentosalmacenmanualnoenbatch(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarDocumentosAlmacenManualNoEnBatch (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,740);
if (RapidSub.canDelegate("borrardocumentosalmacenmanualnoenbatch")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","borrardocumentosalmacenmanualnoenbatch", __ref);}
ResumableSub_BorrarDocumentosAlmacenManualNoEnBatch rsub = new ResumableSub_BorrarDocumentosAlmacenManualNoEnBatch(null,__ref);
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
public static class ResumableSub_BorrarDocumentosAlmacenManualNoEnBatch extends BA.ResumableSub {
public ResumableSub_BorrarDocumentosAlmacenManualNoEnBatch(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BorrarDocumentosAlmacenManualNoEnBatch (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,740);
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
 BA.debugLineNum = 741;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(16);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 742;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(32);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 743;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
Debug.ShouldStop(64);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarDocumentosAlmacenManualNoEnBatch")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_uuidsesion" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 744;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(128);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 746;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(512);
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 747;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "borrardocumentosalmacenmanualnoenbatch"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 749;BA.debugLine="If result=False Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 750;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query BorrarDocumentosAlmacenManualNoEnBatch")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 751;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "borrardocumentosalmacenmanualnoenbatch"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 BA.debugLineNum = 752;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 754;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 756;BA.debugLine="End Sub";
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
public static RemoteObject  _btnactualizar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnActualizar_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,557);
if (RapidSub.canDelegate("btnactualizar_click")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","btnactualizar_click", __ref);}
 BA.debugLineNum = 557;BA.debugLine="Private Sub btnActualizar_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndocnav_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDocNAV_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,678);
if (RapidSub.canDelegate("btndocnav_click")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","btndocnav_click", __ref);}
 BA.debugLineNum = 678;BA.debugLine="Private Sub btnDocNAV_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 680;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("btnEjemplo_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,561);
if (RapidSub.canDelegate("btnejemplo_click")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","btnejemplo_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
 BA.debugLineNum = 561;BA.debugLine="Private Sub btnEjemplo_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 562;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(131072);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), ccontroldocumentosperiodo.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 563;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(262144);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 564;BA.debugLine="Log(mData)";
Debug.ShouldStop(524288);
ccontroldocumentosperiodo.__c.runVoidMethod ("LogImpl","857475075",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 565;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(1048576);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 566;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("btnFasesDoc_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,665);
if (RapidSub.canDelegate("btnfasesdoc_click")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","btnfasesdoc_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _docsel = RemoteObject.createImmutable("");
RemoteObject _cfdoc = RemoteObject.declareNull("b4j.docU.cfasesdocumento");
 BA.debugLineNum = 665;BA.debugLine="Private Sub btnFasesDoc_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 666;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(33554432);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), ccontroldocumentosperiodo.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 667;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(67108864);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 668;BA.debugLine="Log(mData)";
Debug.ShouldStop(134217728);
ccontroldocumentosperiodo.__c.runVoidMethod ("LogImpl","857737219",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 671;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
Debug.ShouldStop(1073741824);
_docsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 673;BA.debugLine="Dim cFDoc As cFasesDocumento";
Debug.ShouldStop(1);
_cfdoc = RemoteObject.createNew ("b4j.docU.cfasesdocumento");Debug.locals.put("cFDoc", _cfdoc);
 BA.debugLineNum = 674;BA.debugLine="cFDoc.Initialize(Me, frm.RootPane,DocSel)";
Debug.ShouldStop(2);
_cfdoc.runClassMethod (b4j.docU.cfasesdocumento.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()),(Object)(_docsel));
 BA.debugLineNum = 675;BA.debugLine="cFDoc.Show";
Debug.ShouldStop(4);
_cfdoc.runClassMethod (b4j.docU.cfasesdocumento.class, "_show" /*void*/ );
 BA.debugLineNum = 676;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btnGetInfo_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,914);
if (RapidSub.canDelegate("btngetinfo_click")) { __ref.runUserSub(false, "ccontroldocumentosperiodo","btngetinfo_click", __ref); return;}
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
public ResumableSub_btnGetInfo_Click(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnGetInfo_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,914);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 915;BA.debugLine="If FechaFinalLong=0 Or FechaInicialLong=0 Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 916;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica fecha";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Indica fecha inicial y fecha final.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 917;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "btngetinfo_click"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 4;
;
 BA.debugLineNum = 918;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 920;BA.debugLine="If FechaFinalLong<FechaInicialLong Then";
Debug.ShouldStop(8388608);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ),__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 921;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha fina";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La fecha final no puede ser anterior a la fecha inicial.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 922;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "btngetinfo_click"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 7;
;
 BA.debugLineNum = 923;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 925;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 926;BA.debugLine="End Sub";
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
public static void  _btnmostrardocumentoennavision_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMostrarDocumentoEnNavision_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,884);
if (RapidSub.canDelegate("btnmostrardocumentoennavision_click")) { __ref.runUserSub(false, "ccontroldocumentosperiodo","btnmostrardocumentoennavision_click", __ref); return;}
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
public ResumableSub_btnMostrarDocumentoEnNavision_Click(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
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
		Debug.PushSubsStack("btnMostrarDocumentoEnNavision_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,884);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 885;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(1048576);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 886;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(2097152);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 887;BA.debugLine="Log(mData)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","858261507",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 888;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(8388608);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 890;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
Debug.ShouldStop(33554432);
_docsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 891;BA.debugLine="Select True";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("CDEV"))))) {
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
}
if (true) break;

case 3:
//C
this.state = 8;
 BA.debugLineNum = 893;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(268435456);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico Albaranes Venta")),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 895;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(1073741824);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico recep. transferencia")),(Object)(BA.numberCast(int.class, 5745)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 897;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(1);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico envío devolución")),(Object)(BA.numberCast(int.class, 6650)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 903;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "btnmostrardocumentoennavision_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 905;BA.debugLine="If success Then";
Debug.ShouldStop(256);
if (true) break;

case 9:
//if
this.state = 14;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 908;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible abrir la ficha del documento "),_docsel,RemoteObject.createImmutable(" en NAVISION."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 909;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "btnmostrardocumentoennavision_click"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 14;
;
 if (true) break;

case 14:
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
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","btnsalir_click", __ref);}
 BA.debugLineNum = 264;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="SalirModulo";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_salirmodulo" /*RemoteObject*/ );
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
public static void  _btnselalmfisico_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelAlmFisico_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,588);
if (RapidSub.canDelegate("btnselalmfisico_click")) { __ref.runUserSub(false, "ccontroldocumentosperiodo","btnselalmfisico_click", __ref); return;}
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
public ResumableSub_btnSelAlmFisico_Click(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
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
int step21;
int limit21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelAlmFisico_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,588);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 589;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(4096);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 591;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(16384);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 592;BA.debugLine="Log(mData)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","857606148",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 593;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(65536);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 595;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
Debug.ShouldStop(262144);
_docsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 598;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(2097152);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 600;BA.debugLine="Dialog.Title=\"Selecciona Almacén Físico de Prepar";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Almacén Físico de Preparación")));
 BA.debugLineNum = 601;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 602;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 603;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 604;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(134217728);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 605;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(268435456);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 607;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(1073741824);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 608;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(-2147483648);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 609;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(1);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 611;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(4);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 612;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(8);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 614;BA.debugLine="Dim lstOpciones As List=Array As String(\"PROIN\",\"";
Debug.ShouldStop(32);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstopciones = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("PROIN"),BA.ObjectToString("PROTEC"),RemoteObject.createImmutable("ADESA")})));Debug.locals.put("lstOpciones", _lstopciones);Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 616;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(128);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 618;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(512);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 620;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//for
this.state = 4;
step21 = 1;
limit21 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 4;
if ((step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21)) this.state = 3;
if (true) break;

case 20:
//C
this.state = 19;
_i = ((int)(0 + _i + step21)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 20;
 BA.debugLineNum = 621;BA.debugLine="xclv.ResizeItem(i,80dip)";
Debug.ShouldStop(4096);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 625;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(65536);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 626;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 628;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(524288);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 629;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(1048576);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 630;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(2097152);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 633;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "btnselalmfisico_click"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 635;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 637;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 639;BA.debugLine="Dim AlmFis As String=B4XListDlg.SelectedItem";
Debug.ShouldStop(1073741824);
_almfis = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("AlmFis", _almfis);Debug.locals.put("AlmFis", _almfis);
 BA.debugLineNum = 644;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(8);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 645;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(16);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 647;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"B";
Debug.ShouldStop(64);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarDocumentoAlmacenManual")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_docsel)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 648;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(128);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 649;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"I";
Debug.ShouldStop(256);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InsertarDocumentoAlmacenManual")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_docsel),(_almfis)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 650;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(512);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 651;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "btnselalmfisico_click"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 22;
return;
case 22:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 652;BA.debugLine="If Success=False Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 653;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar el almacén físico para el documento "),_docsel,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 654;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "btnselalmfisico_click"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 659;BA.debugLine="End Sub";
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
public static void  _btnselfechafinal_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaFinal_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,928);
if (RapidSub.canDelegate("btnselfechafinal_click")) { __ref.runUserSub(false, "ccontroldocumentosperiodo","btnselfechafinal_click", __ref); return;}
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
public ResumableSub_btnSelFechaFinal_Click(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
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
		Debug.PushSubsStack("btnSelFechaFinal_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,928);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 929;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(1);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 930;BA.debugLine="Dialog.Title=\"Indica Fecha Final\"";
Debug.ShouldStop(2);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Fecha Final")));
 BA.debugLineNum = 932;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
Debug.ShouldStop(8);
_b4xdatedlg = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");Debug.locals.put("B4XDateDlg", _b4xdatedlg);
 BA.debugLineNum = 933;BA.debugLine="B4XDateDlg.Initialize";
Debug.ShouldStop(16);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 934;BA.debugLine="If FechaFinalLong=0 Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 935;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
Debug.ShouldStop(64);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 937;BA.debugLine="B4XDateDlg.Date=FechaFinalLong";
Debug.ShouldStop(256);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 939;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
Debug.ShouldStop(1024);
_b4xdatedlg.setField ("_closeonselection" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 940;BA.debugLine="B4XDateDlg.FirstDay=1";
Debug.ShouldStop(2048);
_b4xdatedlg.setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 941;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
Debug.ShouldStop(4096);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xdatedlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 944;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(32768);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 945;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(65536);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 946;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(131072);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 947;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(262144);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 948;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "btnselfechafinal_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 949;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 950;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 951;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 953;BA.debugLine="Dim FechaFinSel As Long=B4XDateDlg.Date";
Debug.ShouldStop(16777216);
_fechafinsel = _b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ );Debug.locals.put("FechaFinSel", _fechafinsel);Debug.locals.put("FechaFinSel", _fechafinsel);
 BA.debugLineNum = 955;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(67108864);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 956;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(134217728);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 957;BA.debugLine="Dim FechaFinalHora As Long=FechaFinSel";
Debug.ShouldStop(268435456);
_fechafinalhora = _fechafinsel;Debug.locals.put("FechaFinalHora", _fechafinalhora);Debug.locals.put("FechaFinalHora", _fechafinalhora);
 BA.debugLineNum = 958;BA.debugLine="FechaFinalLong=DateUtils.SetDate(DateTime.GetYear";
Debug.ShouldStop(536870912);
__ref.setField ("_fechafinallong" /*RemoteObject*/ ,parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_fechafinalhora))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_fechafinalhora))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_fechafinalhora)))));
 BA.debugLineNum = 959;BA.debugLine="FechaFinalLong=FechaFinalLong+DateTime.TicksPerDa";
Debug.ShouldStop(1073741824);
__ref.setField ("_fechafinallong" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ),parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay"),RemoteObject.createImmutable(1)}, "+-",2, 2));
 BA.debugLineNum = 960;BA.debugLine="txtFechaFinal.Text=DateTime.Date(FechaFinalLong)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ))));
 BA.debugLineNum = 961;BA.debugLine="Log(DateUtils.TicksToString(FechaFinalLong))";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","858392609",parent._dateutils.runMethod(true,"_tickstostring",(Object)(__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ))),0);
 BA.debugLineNum = 963;BA.debugLine="If FechaInicialLong=0 Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 964;BA.debugLine="FechaInicialLong=FechaFinalLong";
Debug.ShouldStop(8);
__ref.setField ("_fechainiciallong" /*RemoteObject*/ ,__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ));
 BA.debugLineNum = 965;BA.debugLine="txtFechaInicial.Text=DateTime.date(FechaInicialL";
Debug.ShouldStop(16);
__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ))));
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 968;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(128);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 970;BA.debugLine="End Sub";
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
public static void  _btnselfechainicial_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaInicial_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,972);
if (RapidSub.canDelegate("btnselfechainicial_click")) { __ref.runUserSub(false, "ccontroldocumentosperiodo","btnselfechainicial_click", __ref); return;}
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
public ResumableSub_btnSelFechaInicial_Click(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
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
		Debug.PushSubsStack("btnSelFechaInicial_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,972);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 973;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(4096);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 974;BA.debugLine="Dialog.Title=\"Indica Fecha Inicial\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Fecha Inicial")));
 BA.debugLineNum = 976;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
Debug.ShouldStop(32768);
_b4xdatedlg = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");Debug.locals.put("B4XDateDlg", _b4xdatedlg);
 BA.debugLineNum = 977;BA.debugLine="B4XDateDlg.Initialize";
Debug.ShouldStop(65536);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 978;BA.debugLine="If FechaInicialLong=0 Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 979;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
Debug.ShouldStop(262144);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 981;BA.debugLine="B4XDateDlg.Date=FechaInicialLong";
Debug.ShouldStop(1048576);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 983;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
Debug.ShouldStop(4194304);
_b4xdatedlg.setField ("_closeonselection" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 984;BA.debugLine="B4XDateDlg.FirstDay=1";
Debug.ShouldStop(8388608);
_b4xdatedlg.setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 985;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
Debug.ShouldStop(16777216);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xdatedlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 988;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(134217728);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 989;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(268435456);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 990;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(536870912);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 991;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(1073741824);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 992;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "btnselfechainicial_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 993;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(1);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 994;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 995;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 997;BA.debugLine="Dim FechaInSel As Long=B4XDateDlg.Date";
Debug.ShouldStop(16);
_fechainsel = _b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ );Debug.locals.put("FechaInSel", _fechainsel);Debug.locals.put("FechaInSel", _fechainsel);
 BA.debugLineNum = 1000;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(128);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1001;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(256);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1003;BA.debugLine="FechaInicialLong=DateUtils.SetDate(DateTime.GetYe";
Debug.ShouldStop(1024);
__ref.setField ("_fechainiciallong" /*RemoteObject*/ ,parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_fechainsel))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_fechainsel))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_fechainsel)))));
 BA.debugLineNum = 1004;BA.debugLine="txtFechaInicial.Text=DateTime.date(FechaInicialLo";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ))));
 BA.debugLineNum = 1005;BA.debugLine="Log(DateUtils.TicksToString(FechaInicialLong))";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","858458145",parent._dateutils.runMethod(true,"_tickstostring",(Object)(__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ))),0);
 BA.debugLineNum = 1007;BA.debugLine="If FechaFinalLong=0 Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 1008;BA.debugLine="FechaFinalLong=FechaInicialLong";
Debug.ShouldStop(32768);
__ref.setField ("_fechafinallong" /*RemoteObject*/ ,__ref.getField(true,"_fechainiciallong" /*RemoteObject*/ ));
 BA.debugLineNum = 1009;BA.debugLine="txtFechaFinal.Text=DateTime.date(FechaFinalLong)";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechafinallong" /*RemoteObject*/ ))));
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1011;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(262144);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1013;BA.debugLine="End Sub";
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
public static RemoteObject  _btnselprioridad_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelPrioridad_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,661);
if (RapidSub.canDelegate("btnselprioridad_click")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","btnselprioridad_click", __ref);}
 BA.debugLineNum = 661;BA.debugLine="Private Sub btnSelPrioridad_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 663;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btntrazabilidadtransporte_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnTrazabilidadTransporte_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,568);
if (RapidSub.canDelegate("btntrazabilidadtransporte_click")) { __ref.runUserSub(false, "ccontroldocumentosperiodo","btntrazabilidadtransporte_click", __ref); return;}
ResumableSub_btnTrazabilidadTransporte_Click rsub = new ResumableSub_btnTrazabilidadTransporte_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnTrazabilidadTransporte_Click extends BA.ResumableSub {
public ResumableSub_btnTrazabilidadTransporte_Click(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
RemoteObject _responsablefase = RemoteObject.createImmutable("");
RemoteObject _numexpedicion = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnTrazabilidadTransporte_Click (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,568);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 569;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(16777216);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 571;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(67108864);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 572;BA.debugLine="Log(mData)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","857540612",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 573;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(268435456);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 575;BA.debugLine="Dim ResponsableFase As String=mData.Get(\"Responsa";
Debug.ShouldStop(1073741824);
_responsablefase = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableFase")))));Debug.locals.put("ResponsableFase", _responsablefase);Debug.locals.put("ResponsableFase", _responsablefase);
 BA.debugLineNum = 576;BA.debugLine="Dim NumExpedicion As String=mData.Get(\"NumExpedic";
Debug.ShouldStop(-2147483648);
_numexpedicion = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumExpedicion")))));Debug.locals.put("NumExpedicion", _numexpedicion);Debug.locals.put("NumExpedicion", _numexpedicion);
 BA.debugLineNum = 577;BA.debugLine="If NumExpedicion<>\"\" And ResponsableFase<>\"\" Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_numexpedicion,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_responsablefase,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 578;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Ver traza";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Ver trazabilidad de transporte?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 579;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "btntrazabilidadtransporte_click"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 580;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 581;BA.debugLine="TrazabilidadTransporte(mData)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_trazabilidadtransporte" /*void*/ ,(Object)(_mdata));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 584;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadocumentosalmacenmanual(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaDocumentosAlmacenManual (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,758);
if (RapidSub.canDelegate("cargadocumentosalmacenmanual")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","cargadocumentosalmacenmanual", __ref);}
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
public ResumableSub_CargaDocumentosAlmacenManual(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDocumentosAlmacenManual (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,758);
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
 BA.debugLineNum = 759;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4194304);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 760;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8388608);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 761;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 762;BA.debugLine="Dim Comando As String=\"DocumentosAlmacenManual\"";
Debug.ShouldStop(33554432);
_comando = BA.ObjectToString("DocumentosAlmacenManual");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 763;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(67108864);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 765;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "cargadocumentosalmacenmanual"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 767;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 768;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 769;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "cargadocumentosalmacenmanual"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 770;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 771;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 774;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 775;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 776;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 778;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 779;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 780;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(2048);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 781;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 784;BA.debugLine="Return mRes";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 785;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
ccontroldocumentosperiodo._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",ccontroldocumentosperiodo._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
ccontroldocumentosperiodo._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",ccontroldocumentosperiodo._frm);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
ccontroldocumentosperiodo._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",ccontroldocumentosperiodo._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private Dialog As B4XDialog";
ccontroldocumentosperiodo._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",ccontroldocumentosperiodo._dialog);
 //BA.debugLineNum = 8;BA.debugLine="Private mSQL As SQL";
ccontroldocumentosperiodo._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",ccontroldocumentosperiodo._msql);
 //BA.debugLineNum = 11;BA.debugLine="Private JamTableCLV1 As JamTableCLV";
ccontroldocumentosperiodo._jamtableclv1 = RemoteObject.createNew ("b4j.docU.jamtableclv");__ref.setField("_jamtableclv1",ccontroldocumentosperiodo._jamtableclv1);
 //BA.debugLineNum = 12;BA.debugLine="Private txtAlmacenDocumento As TextField";
ccontroldocumentosperiodo._txtalmacendocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtalmacendocumento",ccontroldocumentosperiodo._txtalmacendocumento);
 //BA.debugLineNum = 13;BA.debugLine="Private txtAlmacenFisico As TextField";
ccontroldocumentosperiodo._txtalmacenfisico = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtalmacenfisico",ccontroldocumentosperiodo._txtalmacenfisico);
 //BA.debugLineNum = 14;BA.debugLine="Private txtCliente As TextField";
ccontroldocumentosperiodo._txtcliente = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcliente",ccontroldocumentosperiodo._txtcliente);
 //BA.debugLineNum = 15;BA.debugLine="Private txtDiasAcum As TextField";
ccontroldocumentosperiodo._txtdiasacum = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdiasacum",ccontroldocumentosperiodo._txtdiasacum);
 //BA.debugLineNum = 16;BA.debugLine="Private txtDocumento As TextField";
ccontroldocumentosperiodo._txtdocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdocumento",ccontroldocumentosperiodo._txtdocumento);
 //BA.debugLineNum = 17;BA.debugLine="Private txtFase As TextField";
ccontroldocumentosperiodo._txtfase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfase",ccontroldocumentosperiodo._txtfase);
 //BA.debugLineNum = 18;BA.debugLine="Private txtFechaDocumento As TextField";
ccontroldocumentosperiodo._txtfechadocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechadocumento",ccontroldocumentosperiodo._txtfechadocumento);
 //BA.debugLineNum = 19;BA.debugLine="Private txtFechaFase As TextField";
ccontroldocumentosperiodo._txtfechafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechafase",ccontroldocumentosperiodo._txtfechafase);
 //BA.debugLineNum = 20;BA.debugLine="Private txtFechaReferencia As TextField";
ccontroldocumentosperiodo._txtfechareferencia = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechareferencia",ccontroldocumentosperiodo._txtfechareferencia);
 //BA.debugLineNum = 21;BA.debugLine="Private txtInfoAdicionalFase As TextField";
ccontroldocumentosperiodo._txtinfoadicionalfase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtinfoadicionalfase",ccontroldocumentosperiodo._txtinfoadicionalfase);
 //BA.debugLineNum = 22;BA.debugLine="Private txtNombreCliente As TextField";
ccontroldocumentosperiodo._txtnombrecliente = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombrecliente",ccontroldocumentosperiodo._txtnombrecliente);
 //BA.debugLineNum = 23;BA.debugLine="Private txtObservaciones As TextField";
ccontroldocumentosperiodo._txtobservaciones = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtobservaciones",ccontroldocumentosperiodo._txtobservaciones);
 //BA.debugLineNum = 24;BA.debugLine="Private txtPersonalizado As TextField";
ccontroldocumentosperiodo._txtpersonalizado = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpersonalizado",ccontroldocumentosperiodo._txtpersonalizado);
 //BA.debugLineNum = 25;BA.debugLine="Private txtPrioridad As TextField";
ccontroldocumentosperiodo._txtprioridad = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtprioridad",ccontroldocumentosperiodo._txtprioridad);
 //BA.debugLineNum = 26;BA.debugLine="Private txtResponsableFase As TextField";
ccontroldocumentosperiodo._txtresponsablefase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtresponsablefase",ccontroldocumentosperiodo._txtresponsablefase);
 //BA.debugLineNum = 27;BA.debugLine="Private txtTipoDocumento As TextField";
ccontroldocumentosperiodo._txttipodocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txttipodocumento",ccontroldocumentosperiodo._txttipodocumento);
 //BA.debugLineNum = 28;BA.debugLine="Private txtTotalImp As TextField";
ccontroldocumentosperiodo._txttotalimp = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txttotalimp",ccontroldocumentosperiodo._txttotalimp);
 //BA.debugLineNum = 29;BA.debugLine="Private txtTotalQty As TextField";
ccontroldocumentosperiodo._txttotalqty = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txttotalqty",ccontroldocumentosperiodo._txttotalqty);
 //BA.debugLineNum = 31;BA.debugLine="Private TimestampBatchFaseDocs As Long";
ccontroldocumentosperiodo._timestampbatchfasedocs = RemoteObject.createImmutable(0L);__ref.setField("_timestampbatchfasedocs",ccontroldocumentosperiodo._timestampbatchfasedocs);
 //BA.debugLineNum = 32;BA.debugLine="Private UUIDSesion As String";
ccontroldocumentosperiodo._uuidsesion = RemoteObject.createImmutable("");__ref.setField("_uuidsesion",ccontroldocumentosperiodo._uuidsesion);
 //BA.debugLineNum = 34;BA.debugLine="Private txtFechaInicial As TextField";
ccontroldocumentosperiodo._txtfechainicial = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechainicial",ccontroldocumentosperiodo._txtfechainicial);
 //BA.debugLineNum = 35;BA.debugLine="Private btnSelFechaInicial As Button";
ccontroldocumentosperiodo._btnselfechainicial = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselfechainicial",ccontroldocumentosperiodo._btnselfechainicial);
 //BA.debugLineNum = 36;BA.debugLine="Private txtFechaFinal As TextField";
ccontroldocumentosperiodo._txtfechafinal = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechafinal",ccontroldocumentosperiodo._txtfechafinal);
 //BA.debugLineNum = 37;BA.debugLine="Private btnSelFechaFinal As Button";
ccontroldocumentosperiodo._btnselfechafinal = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselfechafinal",ccontroldocumentosperiodo._btnselfechafinal);
 //BA.debugLineNum = 38;BA.debugLine="Private btnGetInfo As Button";
ccontroldocumentosperiodo._btngetinfo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btngetinfo",ccontroldocumentosperiodo._btngetinfo);
 //BA.debugLineNum = 39;BA.debugLine="Private FechaInicialLong, FechaFinalLong As Long";
ccontroldocumentosperiodo._fechainiciallong = RemoteObject.createImmutable(0L);__ref.setField("_fechainiciallong",ccontroldocumentosperiodo._fechainiciallong);
ccontroldocumentosperiodo._fechafinallong = RemoteObject.createImmutable(0L);__ref.setField("_fechafinallong",ccontroldocumentosperiodo._fechafinallong);
 //BA.debugLineNum = 41;BA.debugLine="Private txtNumExpedicion As TextField";
ccontroldocumentosperiodo._txtnumexpedicion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumexpedicion",ccontroldocumentosperiodo._txtnumexpedicion);
 //BA.debugLineNum = 42;BA.debugLine="Private btnTrazabilidadTransporte As Button";
ccontroldocumentosperiodo._btntrazabilidadtransporte = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btntrazabilidadtransporte",ccontroldocumentosperiodo._btntrazabilidadtransporte);
 //BA.debugLineNum = 44;BA.debugLine="Private JamLoadingIndicator1 As JamLoadingIndicat";
ccontroldocumentosperiodo._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",ccontroldocumentosperiodo._jamloadingindicator1);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 286;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(1073741824);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(ccontroldocumentosperiodo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblAlbVtaDepNavLin")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 288;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 289;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblAlbVtaDepNavLin";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblAlbVtaDepNavLin")));
 };
 BA.debugLineNum = 291;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(4);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 292;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 293;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblAlbVtaDepNavLin (")));
 BA.debugLineNum = 295;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fecha INTEGER,")));
 BA.debugLineNum = 296;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 297;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Cliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 298;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreCliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 299;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreResponsableCuenta TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 300;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 301;BA.debugLine="sbCrearTabla.Append(\"GRC TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("GRC TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 302;BA.debugLine="sbCrearTabla.Append(\"AlmOrig TEXT COLLATE NOCASE,";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmOrig TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 303;BA.debugLine="sbCrearTabla.Append(\"Almacen TEXT COLLATE NOCASE";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Almacen TEXT COLLATE NOCASE default 'PROIN',")));
 BA.debugLineNum = 304;BA.debugLine="sbCrearTabla.Append(\"Qty REAL,\")";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Qty REAL,")));
 BA.debugLineNum = 305;BA.debugLine="sbCrearTabla.Append(\"Precio REAL,\")";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Precio REAL,")));
 BA.debugLineNum = 306;BA.debugLine="sbCrearTabla.Append(\"Descuento REAL,\")";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Descuento REAL,")));
 BA.debugLineNum = 307;BA.debugLine="sbCrearTabla.Append(\"Importe REAL default 0,\")";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Importe REAL default 0,")));
 BA.debugLineNum = 308;BA.debugLine="sbCrearTabla.Append(\"Personalizado INTEGER,\")";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Personalizado INTEGER,")));
 BA.debugLineNum = 309;BA.debugLine="sbCrearTabla.Append(\"Pedido TEXT COLLATE NOCASE,\"";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Pedido TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 310;BA.debugLine="sbCrearTabla.Append(\"FechaPedido TEXT COLLATE NOC";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPedido TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 311;BA.debugLine="sbCrearTabla.Append(\"FechaProm INTEGER,\")";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaProm INTEGER,")));
 BA.debugLineNum = 312;BA.debugLine="sbCrearTabla.Append(\"FechaReq INTEGER,\")";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaReq INTEGER,")));
 BA.debugLineNum = 313;BA.debugLine="sbCrearTabla.Append(\"TipoDoc TEXT COLLATE NOCASE)";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TipoDoc TEXT COLLATE NOCASE)")));
 BA.debugLineNum = 314;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 317;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(268435456);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(ccontroldocumentosperiodo.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblDocumentosPeriodo")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 318;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 319;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblDocumentosPerio";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblDocumentosPeriodo")));
 };
 BA.debugLineNum = 321;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(1);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 322;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 323;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(4);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblDocumentosPeriodo (")));
 BA.debugLineNum = 325;BA.debugLine="sbCrearTabla.Append(\"FechaDocumento INTEGER,\")";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaDocumento INTEGER,")));
 BA.debugLineNum = 326;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 327;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Cliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 328;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreCliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 329;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreResponsableCuenta TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 330;BA.debugLine="sbCrearTabla.Append(\"AlmacenDocumento TEXT COLLAT";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmacenDocumento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 331;BA.debugLine="sbCrearTabla.Append(\"AlmacenFisico TEXT COLLATE N";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmacenFisico TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 332;BA.debugLine="sbCrearTabla.Append(\"TotalQty REAL,\")";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TotalQty REAL,")));
 BA.debugLineNum = 333;BA.debugLine="sbCrearTabla.Append(\"TotalImp REAL,\")";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TotalImp REAL,")));
 BA.debugLineNum = 334;BA.debugLine="sbCrearTabla.Append(\"Personalizado TEXT COLLATE N";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Personalizado TEXT COLLATE NOCASE default 'NO',")));
 BA.debugLineNum = 338;BA.debugLine="sbCrearTabla.Append(\"TipoDocumento TEXT COLLATE N";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TipoDocumento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 339;BA.debugLine="sbCrearTabla.Append(\"Prioridad TEXT COLLATE NOCAS";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Prioridad TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 340;BA.debugLine="sbCrearTabla.Append(\"Fase TEXT COLLATE NOCASE def";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fase TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 341;BA.debugLine="sbCrearTabla.Append(\"Gestionado INTEGER default 0";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Gestionado INTEGER default 0,")));
 BA.debugLineNum = 342;BA.debugLine="sbCrearTabla.Append(\"FechaFase INTEGER default 0,";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaFase INTEGER default 0,")));
 BA.debugLineNum = 343;BA.debugLine="sbCrearTabla.Append(\"ResponsableFase TEXT COLLATE";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ResponsableFase TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 344;BA.debugLine="sbCrearTabla.Append(\"InfoAdicionalFase TEXT COLLA";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("InfoAdicionalFase TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 345;BA.debugLine="sbCrearTabla.Append(\"NumExpedicion TEXT COLLATE N";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NumExpedicion TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 346;BA.debugLine="sbCrearTabla.Append(\"Observaciones TEXT COLLATE N";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Observaciones TEXT COLLATE NOCASE default '')")));
 BA.debugLineNum = 347;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 364;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("FaseActualDocumentosBacthUUID (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,788);
if (RapidSub.canDelegate("faseactualdocumentosbacthuuid")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","faseactualdocumentosbacthuuid", __ref);}
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
public ResumableSub_FaseActualDocumentosBacthUUID(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
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
		Debug.PushSubsStack("FaseActualDocumentosBacthUUID (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,788);
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
 BA.debugLineNum = 789;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1048576);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 792;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8388608);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 793;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 796;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(134217728);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("FaseActualDocumentosBacthUUID")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_uuidsesion" /*RemoteObject*/ ))})),(Object)(__ref));
 BA.debugLineNum = 798;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "faseactualdocumentosbacthuuid"), null);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 799;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 800;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query FaseActualDocumentosBacthUUID")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 801;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "faseactualdocumentosbacthuuid"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
 BA.debugLineNum = 802;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 803;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 806;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 807;BA.debugLine="Accion=\"SinFaseActualDocumentos\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("SinFaseActualDocumentos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 808;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 810;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 811;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 814;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8192);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 815;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 816;BA.debugLine="For Each m As Map In lstReg";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 819;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblDocumentosP";
Debug.ShouldStop(262144);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblDocumentosPeriodo set Fase=?, Gestionado=?, FechaFase=?, ResponsableFase=?, InfoAdicionalFase=?, NumExpedicion=?, Observaciones=? where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {8},new Object[] {_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fase")))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Gestionado")))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaHoraMov")))),(parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableFase"))))))),(parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("InfoAdicionalFase"))))))),(parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumExpedicion"))))))),(parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Obs"))))))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))})))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 822;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
Debug.ShouldStop(2097152);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 823;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "faseactualdocumentosbacthuuid"), _senderfilter);
this.state = 25;
return;
case 25:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 824;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","858196004",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 825;BA.debugLine="If Success=False Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 826;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 827;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 831;BA.debugLine="Return mRes";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 832;BA.debugLine="End Sub";
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
public static void  _sql_nonquerycomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 255;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="EventData.Consume";
Debug.ShouldStop(-2147483648);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("GenerarUUIDv4 (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,415);
if (RapidSub.canDelegate("generaruuidv4")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","generaruuidv4", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _stp = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _c = RemoteObject.createImmutable(0);
 BA.debugLineNum = 415;BA.debugLine="Sub GenerarUUIDv4 As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 416;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(-2147483648);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 417;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 418;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
Debug.ShouldStop(2);
{
final RemoteObject group3 = RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable((8)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((12))});
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = BA.numberCast(int.class, group3.getArrayElement(false,RemoteObject.createImmutable(index3)));Debug.locals.put("stp", _stp);
Debug.locals.put("stp", _stp);
 BA.debugLineNum = 419;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("-")));};
 BA.debugLineNum = 420;BA.debugLine="For n = 1 To stp";
Debug.ShouldStop(8);
{
final int step5 = 1;
final int limit5 = _stp.<Integer>get().intValue();
_n = 1 ;
for (;(step5 > 0 && _n <= limit5) || (step5 < 0 && _n >= limit5) ;_n = ((int)(0 + _n + step5))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 421;BA.debugLine="Dim c As Int = Rnd(0, 16)";
Debug.ShouldStop(16);
_c = ccontroldocumentosperiodo.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 422;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",_c,BA.numberCast(double.class, 10))) { 
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(48)}, "+",1, 1);Debug.locals.put("c", _c);}
else {
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(55)}, "+",1, 1);Debug.locals.put("c", _c);};
 BA.debugLineNum = 423;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 19))) { 
_c = ccontroldocumentosperiodo.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("8"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 424;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 14))) { 
_c = ccontroldocumentosperiodo.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("4"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 425;BA.debugLine="sb.Append(Chr(c))";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(ccontroldocumentosperiodo.__c.runMethod(true,"Chr",(Object)(_c)))));
 }
}Debug.locals.put("n", _n);
;
 }
}Debug.locals.put("stp", _stp);
;
 BA.debugLineNum = 428;BA.debugLine="Return sb.ToString.ToLowerCase";
Debug.ShouldStop(2048);
if (true) return _sb.runMethod(true,"ToString").runMethod(true,"toLowerCase");
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 48;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
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
public static RemoteObject  _insertarlineasbatchdocumentos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InsertarLineasBatchDocumentos (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,719);
if (RapidSub.canDelegate("insertarlineasbatchdocumentos")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","insertarlineasbatchdocumentos", __ref);}
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
public ResumableSub_InsertarLineasBatchDocumentos(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InsertarLineasBatchDocumentos (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,719);
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
 BA.debugLineNum = 720;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(32768);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 721;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(65536);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 722;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select distin";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select distinct Documento from tblDocumentosPeriodo")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 723;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 724;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"In";
Debug.ShouldStop(524288);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InsertarLineaFaseActualDocumentoBatch")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(__ref.getField(true,"_timestampbatchfasedocs" /*RemoteObject*/ )),(__ref.getField(true,"_uuidsesion" /*RemoteObject*/ )),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"Dispositivo" /*RemoteObject*/ )),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Documento"))))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 725;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(1048576);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 727;BA.debugLine="rs.Close";
Debug.ShouldStop(4194304);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 728;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(8388608);
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 729;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "insertarlineasbatchdocumentos"), null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 731;BA.debugLine="If result=False Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 732;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query InsertarLineaFaseActualDocumentoBatch")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 733;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "insertarlineasbatchdocumentos"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 BA.debugLineNum = 734;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 736;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 738;BA.debugLine="End Sub";
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
public static RemoteObject  _jamtableclv1_accionsalirjamtableclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_AccionSalirJamTableCLV (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("jamtableclv1_accionsalirjamtableclv")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","jamtableclv1_accionsalirjamtableclv", __ref);}
 BA.debugLineNum = 259;BA.debugLine="Sub JamTableCLV1_AccionSalirJamTableCLV";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="SalirModulo";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("JamTableCLV1_ItemClick (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,540);
if (RapidSub.canDelegate("jamtableclv1_itemclick")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","jamtableclv1_itemclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 540;BA.debugLine="Sub JamTableCLV1_ItemClick(Index As Int, Value As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 541;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(268435456);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 542;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
Debug.ShouldStop(536870912);
ccontroldocumentosperiodo.__c.runVoidMethod ("LogImpl","857278466",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 543;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(1073741824);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 544;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(-2147483648);
ccontroldocumentosperiodo.__c.runVoidMethod ("LogImpl","857278468",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 546;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("JamTableCLV1_ItemLongClick (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,549);
if (RapidSub.canDelegate("jamtableclv1_itemlongclick")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","jamtableclv1_itemlongclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 549;BA.debugLine="Sub JamTableCLV1_ItemLongClick(Index As Int, Value";
Debug.ShouldStop(16);
 BA.debugLineNum = 550;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(32);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 551;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
Debug.ShouldStop(64);
ccontroldocumentosperiodo.__c.runVoidMethod ("LogImpl","857344002",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado botón secundario ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 552;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(128);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 553;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(256);
ccontroldocumentosperiodo.__c.runVoidMethod ("LogImpl","857344004",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("JamTableCLV1_LoadLayoutPanelItem (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,494);
if (RapidSub.canDelegate("jamtableclv1_loadlayoutpanelitem")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","jamtableclv1_loadlayoutpanelitem", __ref, _datositemindexclv);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _perioddiasacum = RemoteObject.declareNull("b4j.example.dateutils._period");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _timeformatant = RemoteObject.createImmutable("");
RemoteObject _totalimp = RemoteObject.createImmutable(0);
RemoteObject _totalqty = RemoteObject.createImmutable(0);
RemoteObject _responsablefase = RemoteObject.createImmutable("");
RemoteObject _numexpedicion = RemoteObject.createImmutable("");
Debug.locals.put("DatosItemIndexCLV", _datositemindexclv);
 BA.debugLineNum = 494;BA.debugLine="Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemInde";
Debug.ShouldStop(8192);
 BA.debugLineNum = 495;BA.debugLine="Dim mData As Map=DatosItemIndexCLV.Value";
Debug.ShouldStop(16384);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _datositemindexclv.getField(false,"Value" /*RemoteObject*/ ));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 496;BA.debugLine="Dim pnl As B4XView=DatosItemIndexCLV.Panel";
Debug.ShouldStop(32768);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = _datositemindexclv.getField(false,"Panel" /*RemoteObject*/ );Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 497;BA.debugLine="pnl.LoadLayout(\"scrItemControlDocumentosPeriodo\")";
Debug.ShouldStop(65536);
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrItemControlDocumentosPeriodo")),__ref.getField(false, "ba"));
 BA.debugLineNum = 499;BA.debugLine="txtAlmacenDocumento.Text=mData.Get(\"AlmacenDocume";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtalmacendocumento" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AlmacenDocumento"))))));
 BA.debugLineNum = 500;BA.debugLine="txtAlmacenFisico.Text=mData.Get(\"AlmacenFisico\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtalmacenfisico" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AlmacenFisico"))))));
 BA.debugLineNum = 501;BA.debugLine="txtCliente.Text=mData.Get(\"Cliente\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtcliente" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cliente"))))));
 BA.debugLineNum = 502;BA.debugLine="Dim PeriodDiasAcum As Period=DateUtils.PeriodBetw";
Debug.ShouldStop(2097152);
_perioddiasacum = ccontroldocumentosperiodo._dateutils.runMethod(false,"_periodbetweenindays",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaDocumento")))))),(Object)(ccontroldocumentosperiodo.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("PeriodDiasAcum", _perioddiasacum);Debug.locals.put("PeriodDiasAcum", _perioddiasacum);
 BA.debugLineNum = 503;BA.debugLine="txtDiasAcum.Text=PeriodDiasAcum.Days";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtdiasacum" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_perioddiasacum.getField(true,"Days")));
 BA.debugLineNum = 504;BA.debugLine="txtDocumento.Text=mData.Get(\"Documento\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtdocumento" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))));
 BA.debugLineNum = 505;BA.debugLine="txtFase.Text=mData.Getdefault(\"Fase\",\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtfase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Fase"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 507;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(67108864);
_dateformatant = ccontroldocumentosperiodo.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 508;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(134217728);
ccontroldocumentosperiodo.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 509;BA.debugLine="Dim TimeFormatAnt As String=DateTime.timeFormat";
Debug.ShouldStop(268435456);
_timeformatant = ccontroldocumentosperiodo.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("TimeFormatAnt", _timeformatant);Debug.locals.put("TimeFormatAnt", _timeformatant);
 BA.debugLineNum = 510;BA.debugLine="DateTime.TimeFormat	=\"HH:mm\"";
Debug.ShouldStop(536870912);
ccontroldocumentosperiodo.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 511;BA.debugLine="txtFechaDocumento.Text=DateTime.Date(mData.Get(\"F";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtfechadocumento" /*RemoteObject*/ ).runMethod(true,"setText",ccontroldocumentosperiodo.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaDocumento"))))))));
 BA.debugLineNum = 512;BA.debugLine="If mData.Getdefault(\"FechaFase\",0)>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FechaFase"))),(Object)(RemoteObject.createImmutable((0))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 513;BA.debugLine="txtFechaFase.Text=DateTime.date(mData.Getdefault";
Debug.ShouldStop(1);
__ref.getField(false,"_txtfechafase" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(ccontroldocumentosperiodo.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FechaFase"))),(Object)(RemoteObject.createImmutable((0))))))),RemoteObject.createImmutable(" "),ccontroldocumentosperiodo.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FechaFase"))),(Object)(RemoteObject.createImmutable((0)))))))));
 };
 BA.debugLineNum = 515;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(4);
ccontroldocumentosperiodo.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 516;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
Debug.ShouldStop(8);
ccontroldocumentosperiodo.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_timeformatant);
 BA.debugLineNum = 518;BA.debugLine="txtInfoAdicionalFase.Text=mData.Getdefault(\"InfoA";
Debug.ShouldStop(32);
__ref.getField(false,"_txtinfoadicionalfase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("InfoAdicionalFase"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 519;BA.debugLine="txtNombreCliente.Text=mData.Get(\"NombreCliente\")";
Debug.ShouldStop(64);
__ref.getField(false,"_txtnombrecliente" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreCliente"))))));
 BA.debugLineNum = 520;BA.debugLine="txtObservaciones.Text=mData.Getdefault(\"Observaci";
Debug.ShouldStop(128);
__ref.getField(false,"_txtobservaciones" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Observaciones"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 521;BA.debugLine="txtPersonalizado.Text=mData.Get(\"Personalizado\")";
Debug.ShouldStop(256);
__ref.getField(false,"_txtpersonalizado" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Personalizado"))))));
 BA.debugLineNum = 522;BA.debugLine="txtPrioridad.Text=mData.Getdefault(\"Prioridad\",\"\"";
Debug.ShouldStop(512);
__ref.getField(false,"_txtprioridad" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Prioridad"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 523;BA.debugLine="txtResponsableFase.Text=mData.Getdefault(\"Respons";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtresponsablefase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ResponsableFase"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 524;BA.debugLine="txtTipoDocumento.Text=mData.Get(\"TipoDocumento\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_txttipodocumento" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoDocumento"))))));
 BA.debugLineNum = 525;BA.debugLine="Dim TotalImp As Double=mData.Get(\"TotalImp\")";
Debug.ShouldStop(4096);
_totalimp = BA.numberCast(double.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TotalImp")))));Debug.locals.put("TotalImp", _totalimp);Debug.locals.put("TotalImp", _totalimp);
 BA.debugLineNum = 526;BA.debugLine="txtTotalImp.Text=Utilidades.FormatoNumerico2(Tota";
Debug.ShouldStop(8192);
__ref.getField(false,"_txttotalimp" /*RemoteObject*/ ).runMethod(true,"setText",ccontroldocumentosperiodo._utilidades.runMethod(true,"_formatonumerico2" /*RemoteObject*/ ,(Object)(_totalimp),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(ccontroldocumentosperiodo.__c.getField(true,"True"))));
 BA.debugLineNum = 527;BA.debugLine="Dim TotalQty As Double=mData.Get(\"TotalQty\")";
Debug.ShouldStop(16384);
_totalqty = BA.numberCast(double.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TotalQty")))));Debug.locals.put("TotalQty", _totalqty);Debug.locals.put("TotalQty", _totalqty);
 BA.debugLineNum = 528;BA.debugLine="txtTotalQty.Text=Utilidades.FormatoNumerico2(Tota";
Debug.ShouldStop(32768);
__ref.getField(false,"_txttotalqty" /*RemoteObject*/ ).runMethod(true,"setText",ccontroldocumentosperiodo._utilidades.runMethod(true,"_formatonumerico2" /*RemoteObject*/ ,(Object)(_totalqty),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(ccontroldocumentosperiodo.__c.getField(true,"True"))));
 BA.debugLineNum = 529;BA.debugLine="txtPersonalizado.Text=mData.Get(\"Personalizado\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtpersonalizado" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Personalizado"))))));
 BA.debugLineNum = 531;BA.debugLine="txtNumExpedicion.Text=mData.GetDefault(\"NumExpedi";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtnumexpedicion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("NumExpedicion"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 533;BA.debugLine="Dim ResponsableFase As String=mData.Get(\"Responsa";
Debug.ShouldStop(1048576);
_responsablefase = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableFase")))));Debug.locals.put("ResponsableFase", _responsablefase);Debug.locals.put("ResponsableFase", _responsablefase);
 BA.debugLineNum = 534;BA.debugLine="Dim NumExpedicion As String=mData.Get(\"NumExpedic";
Debug.ShouldStop(2097152);
_numexpedicion = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumExpedicion")))));Debug.locals.put("NumExpedicion", _numexpedicion);Debug.locals.put("NumExpedicion", _numexpedicion);
 BA.debugLineNum = 536;BA.debugLine="btnTrazabilidadTransporte.Visible= NumExpedicion<";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btntrazabilidadtransporte" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("!",_numexpedicion,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_responsablefase,BA.ObjectToString(""))));
 BA.debugLineNum = 538;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("JamTableCLV1_MenuBarMenuItem_Action (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("jamtableclv1_menubarmenuitem_action")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","jamtableclv1_menubarmenuitem_action", __ref, _tagmenuitem);}
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 273;BA.debugLine="Sub JamTableCLV1_MenuBarMenuItem_Action(TagMenuIte";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"))) {
case 0: {
 BA.debugLineNum = 276;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_actualizardatos" /*void*/ );
 break; }
}
;
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("SalirModulo (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "ccontroldocumentosperiodo","salirmodulo", __ref);}
 BA.debugLineNum = 268;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="frm.Close";
Debug.ShouldStop(4096);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 270;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(8192);
ccontroldocumentosperiodo._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Show (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "ccontroldocumentosperiodo","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,54);
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
 BA.debugLineNum = 61;BA.debugLine="frm.RootPane.LoadLayout(\"scrControlDocumentosPeri";
Debug.ShouldStop(268435456);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrControlDocumentosPeriodo")));
 BA.debugLineNum = 62;BA.debugLine="Sleep(0)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "show"),BA.numberCast(int.class, 0));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
 BA.debugLineNum = 65;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Control Docum";
Debug.ShouldStop(1);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Control Documentos Periodo")));
 BA.debugLineNum = 67;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(4);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 69;BA.debugLine="JamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(16);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 71;BA.debugLine="frm.Show";
Debug.ShouldStop(64);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 86;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 88;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 89;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 91;BA.debugLine="wait for(BorrarDatosBatchAnterioresMaquinaUsuario";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "show"), __ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_borrardatosbatchanterioresmaquinausuario" /*RemoteObject*/ ));
this.state = 16;
return;
case 16:
//C
this.state = 7;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 92;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 93;BA.debugLine="SalirModulo";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 94;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 97;BA.debugLine="UUIDSesion=GenerarUUIDv4";
Debug.ShouldStop(1);
__ref.setField ("_uuidsesion" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.ccontroldocumentosperiodo.class, "_generaruuidv4" /*RemoteObject*/ ));
 BA.debugLineNum = 98;BA.debugLine="TimestampBatchFaseDocs=DateTime.Now";
Debug.ShouldStop(2);
__ref.setField ("_timestampbatchfasedocs" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 108;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.ConfigurarT";
Debug.ShouldStop(2048);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_configurartableclv" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ListaControlDocumentosPeriodo.json")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 109;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "show"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 11;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 110;BA.debugLine="Log(mRes)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","856557624",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 111;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 112;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 113;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "show"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
;
 BA.debugLineNum = 114;BA.debugLine="frm.Close";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 115;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 119;BA.debugLine="JamTableCLV1.AddMenuItemToMenuInMenuBar(\"Actualiz";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_addmenuitemtomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Actualizar")),(Object)(BA.ObjectToString("Actualizar")),(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 122;BA.debugLine="JamTableCLV1.AlturaItems=130dip";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setalturaitems" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))));
 BA.debugLineNum = 124;BA.debugLine="JamTableCLV1.ModoSeleccionItems=JamTableCLV1.Modo";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmodoseleccionitems" /*RemoteObject*/ ,__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_modoseleccionmultiple" /*RemoteObject*/ ));
 BA.debugLineNum = 126;BA.debugLine="JamTableCLV1.AlturaSeparadorPaneles=2dip";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setalturaseparadorpaneles" /*RemoteObject*/ ,BA.numberCast(float.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
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
public static void  _trazabilidadtransporte(RemoteObject __ref,RemoteObject _mdata) throws Exception{
try {
		Debug.PushSubsStack("TrazabilidadTransporte (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,1015);
if (RapidSub.canDelegate("trazabilidadtransporte")) { __ref.runUserSub(false, "ccontroldocumentosperiodo","trazabilidadtransporte", __ref, _mdata); return;}
ResumableSub_TrazabilidadTransporte rsub = new ResumableSub_TrazabilidadTransporte(null,__ref,_mdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_TrazabilidadTransporte extends BA.ResumableSub {
public ResumableSub_TrazabilidadTransporte(b4j.docU.ccontroldocumentosperiodo parent,RemoteObject __ref,RemoteObject _mdata) {
this.parent = parent;
this.__ref = __ref;
this._mdata = _mdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosperiodo parent;
RemoteObject _mdata;
RemoteObject _transporte = RemoteObject.createImmutable("");
RemoteObject _expedicion = RemoteObject.createImmutable("");
RemoteObject _expediciondhl = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _urltxt = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cinfoexpedcorreosexp = RemoteObject.declareNull("b4j.docU.cinfoexpedicioncorreosexpress");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TrazabilidadTransporte (ccontroldocumentosperiodo) ","ccontroldocumentosperiodo",26,__ref.getField(false, "ba"),__ref,1015);
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
 BA.debugLineNum = 1016;BA.debugLine="Dim Transporte As String=mData.Get(\"ResponsableFa";
Debug.ShouldStop(8388608);
_transporte = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableFase")))));Debug.locals.put("Transporte", _transporte);Debug.locals.put("Transporte", _transporte);
 BA.debugLineNum = 1017;BA.debugLine="Transporte=Transporte.ToUpperCase";
Debug.ShouldStop(16777216);
_transporte = _transporte.runMethod(true,"toUpperCase");Debug.locals.put("Transporte", _transporte);
 BA.debugLineNum = 1018;BA.debugLine="Dim Expedicion As String=mData.Get(\"NumExpedicion";
Debug.ShouldStop(33554432);
_expedicion = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumExpedicion")))));Debug.locals.put("Expedicion", _expedicion);Debug.locals.put("Expedicion", _expedicion);
 BA.debugLineNum = 1019;BA.debugLine="Expedicion=Expedicion.ToUpperCase";
Debug.ShouldStop(67108864);
_expedicion = _expedicion.runMethod(true,"toUpperCase");Debug.locals.put("Expedicion", _expedicion);
 BA.debugLineNum = 1020;BA.debugLine="Select Case Transporte";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//select
this.state = 26;
switch (BA.switchObjectToInt(_transporte,BA.ObjectToString("DHL"),BA.ObjectToString("TXT"),BA.ObjectToString("CORREOS EXPRESS"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 23;
if (true) break;
}
default: {
this.state = 25;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1024;BA.debugLine="Dim ExpedicionDHL As String";
Debug.ShouldStop(-2147483648);
_expediciondhl = RemoteObject.createImmutable("");Debug.locals.put("ExpedicionDHL", _expediciondhl);
 BA.debugLineNum = 1025;BA.debugLine="If Expedicion.Length>=20 Then";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("g",_expedicion.runMethod(true,"length"),BA.numberCast(double.class, 20))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1026;BA.debugLine="ExpedicionDHL=Expedicion.SubString2(8,10)&Expe";
Debug.ShouldStop(2);
_expediciondhl = RemoteObject.concat(_expedicion.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 8)),(Object)(BA.numberCast(int.class, 10))),_expedicion.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 20))));Debug.locals.put("ExpedicionDHL", _expediciondhl);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1028;BA.debugLine="ExpedicionDHL=Expedicion";
Debug.ShouldStop(8);
_expediciondhl = _expedicion;Debug.locals.put("ExpedicionDHL", _expediciondhl);
 if (true) break;

case 9:
//C
this.state = 26;
;
 BA.debugLineNum = 1030;BA.debugLine="fx.ShowExternalDocument(\"https://clientesparcel";
Debug.ShouldStop(32);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethod ("ShowExternalDocument",(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://clientesparcel.dhl.es/seguimientoenvios/integra/SeguimientoDocumentos.aspx?codigo="),_expediciondhl,RemoteObject.createImmutable("&anno=2017&lang=sp"))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1033;BA.debugLine="wait for(cmAuxTxT.ObtenerURLTrazabilidadExpedic";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "trazabilidadtransporte"), parent._cmauxtxt.runMethod(false,"_obtenerurltrazabilidadexpediciontxt" /*RemoteObject*/ ,(Object)(_expedicion)));
this.state = 27;
return;
case 27:
//C
this.state = 12;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1034;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(512);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1035;BA.debugLine="If Accion=\"OK\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 12:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("OK"))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1036;BA.debugLine="Dim URLtxt As String=mRes.Get(\"URL\")";
Debug.ShouldStop(2048);
_urltxt = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("URL")))));Debug.locals.put("URLtxt", _urltxt);Debug.locals.put("URLtxt", _urltxt);
 BA.debugLineNum = 1037;BA.debugLine="If URLtxt<>\"\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 15:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",_urltxt,BA.ObjectToString(""))) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 1038;BA.debugLine="fx.ShowExternalDocument(URLtxt)";
Debug.ShouldStop(8192);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethod ("ShowExternalDocument",(Object)(_urltxt));
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1040;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Método Url";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Método UrlTracking TXT devuelve cadena vacía.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1041;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "trazabilidadtransporte"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 26;
;
 if (true) break;

case 23:
//C
this.state = 26;
 BA.debugLineNum = 1046;BA.debugLine="Dim cInfoExpedCorreosExp As cInfoExpedicionCorr";
Debug.ShouldStop(2097152);
_cinfoexpedcorreosexp = RemoteObject.createNew ("b4j.docU.cinfoexpedicioncorreosexpress");Debug.locals.put("cInfoExpedCorreosExp", _cinfoexpedcorreosexp);
 BA.debugLineNum = 1047;BA.debugLine="cInfoExpedCorreosExp.Initialize(Expedicion)";
Debug.ShouldStop(4194304);
_cinfoexpedcorreosexp.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_expedicion));
 BA.debugLineNum = 1048;BA.debugLine="cInfoExpedCorreosExp.Show";
Debug.ShouldStop(8388608);
_cinfoexpedcorreosexp.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_show" /*void*/ );
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1051;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No es posibl";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No es posible obtener información de trazabilidad de esta expedición mediante este formulario."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Consultar con Logística."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1053;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosperiodo", "trazabilidadtransporte"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
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
}