package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ccontroldocumentosnogestionados_subs_0 {


public static RemoteObject  _actualizarcolortfprioridad(RemoteObject __ref,RemoteObject _tf,RemoteObject _nombreprioridad) throws Exception{
try {
		Debug.PushSubsStack("ActualizarColortFPrioridad (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,891);
if (RapidSub.canDelegate("actualizarcolortfprioridad")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","actualizarcolortfprioridad", __ref, _tf, _nombreprioridad);}
RemoteObject _xtf = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("tF", _tf);
Debug.locals.put("NombrePrioridad", _nombreprioridad);
 BA.debugLineNum = 891;BA.debugLine="Sub ActualizarColortFPrioridad(tF As TextField,Nom";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 892;BA.debugLine="Dim xtF As B4XView=tF";
Debug.ShouldStop(134217728);
_xtf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xtf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _tf.getObject());Debug.locals.put("xtF", _xtf);Debug.locals.put("xtF", _xtf);
 BA.debugLineNum = 893;BA.debugLine="Select Case NombrePrioridad";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(_nombreprioridad,BA.ObjectToString("A"),BA.ObjectToString("B"),BA.ObjectToString("C"))) {
case 0: {
 BA.debugLineNum = 895;BA.debugLine="xtF.Font=xui.CreateDefaultBoldFont(xtF.TextSize";
Debug.ShouldStop(1073741824);
_xtf.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, _xtf.runMethod(true,"getTextSize")))));
 BA.debugLineNum = 896;BA.debugLine="xtF.Color=xui.Color_Red";
Debug.ShouldStop(-2147483648);
_xtf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 897;BA.debugLine="xtF.TextColor=xui.Color_White";
Debug.ShouldStop(1);
_xtf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 break; }
case 1: {
 BA.debugLineNum = 899;BA.debugLine="xtF.Font=xui.CreateDefaultBoldFont(xtF.TextSize";
Debug.ShouldStop(4);
_xtf.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, _xtf.runMethod(true,"getTextSize")))));
 BA.debugLineNum = 900;BA.debugLine="xtF.Color=0xFFFFA500";
Debug.ShouldStop(8);
_xtf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xffffa500)));
 BA.debugLineNum = 901;BA.debugLine="xtF.TextColor=xui.Color_Black";
Debug.ShouldStop(16);
_xtf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 break; }
case 2: {
 BA.debugLineNum = 903;BA.debugLine="xtF.Font=xui.CreateDefaultBoldFont(xtF.TextSize";
Debug.ShouldStop(64);
_xtf.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, _xtf.runMethod(true,"getTextSize")))));
 BA.debugLineNum = 904;BA.debugLine="xtF.Color=xui.Color_Yellow";
Debug.ShouldStop(128);
_xtf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Yellow"));
 BA.debugLineNum = 905;BA.debugLine="xtF.TextColor=xui.Color_Black";
Debug.ShouldStop(256);
_xtf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 break; }
default: {
 BA.debugLineNum = 907;BA.debugLine="xtF.Font=xui.CreateDefaultFont(xtF.TextSize)";
Debug.ShouldStop(1024);
_xtf.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, _xtf.runMethod(true,"getTextSize")))));
 BA.debugLineNum = 908;BA.debugLine="xtF.Color=xui.Color_White";
Debug.ShouldStop(2048);
_xtf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 909;BA.debugLine="xtF.TextColor=xui.Color_Black";
Debug.ShouldStop(4096);
_xtf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 break; }
}
;
 BA.debugLineNum = 912;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("ActualizarDatos (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("actualizardatos")) { __ref.runUserSub(false, "ccontroldocumentosnogestionados","actualizardatos", __ref); return;}
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
public ResumableSub_ActualizarDatos(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rsdacum = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _perioddiasacum = RemoteObject.declareNull("b4j.example.dateutils._period");
RemoteObject _diasacum = RemoteObject.createImmutable(0);
RemoteObject _docdiasac = RemoteObject.createImmutable("");
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _docalmf = RemoteObject.createImmutable("");
RemoteObject _almf = RemoteObject.createImmutable("");
RemoteObject _docprioridad = RemoteObject.createImmutable("");
RemoteObject _prioridad = RemoteObject.createImmutable(0);
RemoteObject _nombreprioridad = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _numdocsvariosalmacenes = RemoteObject.createImmutable(0);
RemoteObject group64;
int index64;
int groupLen64;
RemoteObject group80;
int index80;
int groupLen80;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,129);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 131;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 133;BA.debugLine="JamTableCLV1.Clear";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 135;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblAlbVtaDepNavLin";
Debug.ShouldStop(64);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblAlbVtaDepNavLin")));
 BA.debugLineNum = 136;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblDocumentosSinGe";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblDocumentosSinGestionar")));
 BA.debugLineNum = 141;BA.debugLine="Wait For(ActualizarDatosDocumentosNAV) complete (";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_actualizardatosdocumentosnav" /*RemoteObject*/ ));
this.state = 79;
return;
case 79:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 142;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 143;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 144;BA.debugLine="SalirModulo";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 145;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 148;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 150;BA.debugLine="mSQL.ExecNonQuery(\"update tblAlbVtaDepNavLin set";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("update tblAlbVtaDepNavLin set Importe=Qty*Precio*(100-Descuento)/100")));
 BA.debugLineNum = 151;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAlbVtaDepNavLin set";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAlbVtaDepNavLin set Almacen=? where AlmOrig=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("ADESA")),(RemoteObject.createImmutable("0237"))})))));
 BA.debugLineNum = 152;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAlbVtaDepNavLin set";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAlbVtaDepNavLin set Almacen=? where GRC like ?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("PROTEC")),(RemoteObject.createImmutable("ROPA%"))})))));
 BA.debugLineNum = 158;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(536870912);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 159;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 160;BA.debugLine="sb.Append(\"insert into tblDocumentosSinGestionar";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("insert into tblDocumentosSinGestionar (FechaDocumento, TipoDocumento, Documento, Cliente, NombreCliente, AlmacenDocumento, AlmacenFisico, Pedido, ")));
 BA.debugLineNum = 161;BA.debugLine="sb.Append(\"Personalizado, Prioridad, NombrePriori";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Personalizado, Prioridad, NombrePrioridad, Fase, FechaFase, ResponsableFase, InfoAdicionalFase, Observaciones, TotalQty, TotalImp,NombreResponsableCuenta)")));
 BA.debugLineNum = 162;BA.debugLine="sb.Append(\" Select Fecha As FechaDocumento, TipoD";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" Select Fecha As FechaDocumento, TipoDoc As TipoDocumento, Documento, Cliente, NombreCliente, AlmOrig As AlmacenDocumento , Almacen As AlmacenFisico, Pedido,")));
 BA.debugLineNum = 163;BA.debugLine="sb.Append(\"'NO' As Personalizado, 0 as Prioridad,";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("'NO' As Personalizado, 0 as Prioridad, 'Sin Prioridad' as NombrePrioridad, '' as Fase, 0 as FechaFase, '' as ResponsableFase, '' as InfoAdicionalFase, '' as Observaciones,")));
 BA.debugLineNum = 164;BA.debugLine="sb.Append(\"sum (Qty) As TotalQty, sum (Importe) A";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("sum (Qty) As TotalQty, sum (Importe) As TotalImp, NombreResponsableCuenta")));
 BA.debugLineNum = 165;BA.debugLine="sb.Append(\" from tblAlbVtaDepNavLin group by Fech";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" from tblAlbVtaDepNavLin group by Fecha, TipoDoc, Documento, Cliente, NombreCliente, AlmOrig, Almacen, NombreResponsableCuenta")));
 BA.debugLineNum = 166;BA.debugLine="mSQL.ExecNonQuery(sb.ToString)";
Debug.ShouldStop(32);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 168;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGestio";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDocumentosSinGestionar set Personalizado=? where Documento in (Select DISTINCT Documento from tblAlbVtaDepNavLin where Personalizado=1)")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("SI"))})))));
 BA.debugLineNum = 170;BA.debugLine="Dim rsDAcum As ResultSet=mSQL.ExecQuery(\"select D";
Debug.ShouldStop(512);
_rsdacum = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdacum = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select Documento, FechaDocumento from tblDocumentosSinGestionar")));Debug.locals.put("rsDAcum", _rsdacum);Debug.locals.put("rsDAcum", _rsdacum);
 BA.debugLineNum = 171;BA.debugLine="Do While rsDAcum.NextRow";
Debug.ShouldStop(1024);
if (true) break;

case 5:
//do while
this.state = 8;
while (_rsdacum.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
 BA.debugLineNum = 172;BA.debugLine="Dim PeriodDiasAcum As Period=DateUtils.PeriodBet";
Debug.ShouldStop(2048);
_perioddiasacum = parent._dateutils.runMethod(false,"_periodbetweenindays",(Object)(_rsdacum.runMethod(true,"GetLong",(Object)(RemoteObject.createImmutable("FechaDocumento")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("PeriodDiasAcum", _perioddiasacum);Debug.locals.put("PeriodDiasAcum", _perioddiasacum);
 BA.debugLineNum = 173;BA.debugLine="Dim DiasAcum As Int=PeriodDiasAcum.Days";
Debug.ShouldStop(4096);
_diasacum = _perioddiasacum.getField(true,"Days");Debug.locals.put("DiasAcum", _diasacum);Debug.locals.put("DiasAcum", _diasacum);
 BA.debugLineNum = 174;BA.debugLine="Dim DocDiasAc As String=rsDAcum.GetString(\"Docum";
Debug.ShouldStop(8192);
_docdiasac = _rsdacum.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Documento")));Debug.locals.put("DocDiasAc", _docdiasac);Debug.locals.put("DocDiasAc", _docdiasac);
 BA.debugLineNum = 175;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblDocumentosSin";
Debug.ShouldStop(16384);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblDocumentosSinGestionar set DiasAcumulados=? where Documento =?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_diasacum),(_docdiasac)})))));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 177;BA.debugLine="rsDAcum.Close";
Debug.ShouldStop(65536);
_rsdacum.runVoidMethod ("Close");
 BA.debugLineNum = 178;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
Debug.ShouldStop(131072);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 179;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _senderfilter);
this.state = 80;
return;
case 80:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 180;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","854460467",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 182;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 183;BA.debugLine="wait for(BorrarDatosBatchAnterioresUUIDSesion) co";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_borrardatosbatchanterioresuuidsesion" /*RemoteObject*/ ));
this.state = 81;
return;
case 81:
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
 BA.debugLineNum = 185;BA.debugLine="SalirModulo";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 186;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 188;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 189;BA.debugLine="wait for(InsertarLineasBatchDocumentos) complete";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_insertarlineasbatchdocumentos" /*RemoteObject*/ ));
this.state = 82;
return;
case 82:
//C
this.state = 13;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 190;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(536870912);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 191;BA.debugLine="SalirModulo";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 192;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 194;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="wait for(FaseActualDocumentosBacthUUID) complete";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_faseactualdocumentosbacthuuid" /*RemoteObject*/ ));
this.state = 83;
return;
case 83:
//C
this.state = 17;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 196;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 197;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 198;BA.debugLine="SalirModulo";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 199;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 213;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 214;BA.debugLine="wait for(CargaDocumentosAlmacenManual) complete (";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_cargadocumentosalmacenmanual" /*RemoteObject*/ ));
this.state = 84;
return;
case 84:
//C
this.state = 21;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 215;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 216;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(8388608);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 217;BA.debugLine="SalirModulo";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 218;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 220;BA.debugLine="If Accion=\"OK\" Then";
Debug.ShouldStop(134217728);

case 24:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("OK"))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 221;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(268435456);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 222;BA.debugLine="For Each m As Map In lstReg";
Debug.ShouldStop(536870912);
if (true) break;

case 27:
//for
this.state = 30;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group64 = _lstreg;
index64 = 0;
groupLen64 = group64.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 85;
if (true) break;

case 85:
//C
this.state = 30;
if (index64 < groupLen64) {
this.state = 29;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group64.runMethod(false,"Get",index64));Debug.locals.put("m", _m);}
if (true) break;

case 86:
//C
this.state = 85;
index64++;
Debug.locals.put("m", _m);
if (true) break;

case 29:
//C
this.state = 86;
 BA.debugLineNum = 223;BA.debugLine="Dim DocAlmF As String=m.Get(\"Documento\")";
Debug.ShouldStop(1073741824);
_docalmf = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocAlmF", _docalmf);Debug.locals.put("DocAlmF", _docalmf);
 BA.debugLineNum = 224;BA.debugLine="Dim AlmF As String=m.Get(\"Almacen\")";
Debug.ShouldStop(-2147483648);
_almf = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Almacen")))));Debug.locals.put("AlmF", _almf);Debug.locals.put("AlmF", _almf);
 BA.debugLineNum = 225;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGest";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDocumentosSinGestionar set AlmacenFisico=? where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_almf),(_docalmf)})))));
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
Debug.locals.put("m", _m);
;
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 229;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 230;BA.debugLine="wait for(CargaPrioridadesDocumentos) complete (mR";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_cargaprioridadesdocumentos" /*RemoteObject*/ ));
this.state = 87;
return;
case 87:
//C
this.state = 32;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 231;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(64);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 232;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(128);
if (true) break;

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 233;BA.debugLine="SalirModulo";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 234;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 35:
//C
this.state = 36;
;
 BA.debugLineNum = 237;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 238;BA.debugLine="If Accion=\"OK\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 36:
//if
this.state = 43;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("OK"))) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 239;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(16384);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 240;BA.debugLine="For Each m As Map In lstReg";
Debug.ShouldStop(32768);
if (true) break;

case 39:
//for
this.state = 42;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group80 = _lstreg;
index80 = 0;
groupLen80 = group80.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 88;
if (true) break;

case 88:
//C
this.state = 42;
if (index80 < groupLen80) {
this.state = 41;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group80.runMethod(false,"Get",index80));Debug.locals.put("m", _m);}
if (true) break;

case 89:
//C
this.state = 88;
index80++;
Debug.locals.put("m", _m);
if (true) break;

case 41:
//C
this.state = 89;
 BA.debugLineNum = 241;BA.debugLine="Dim DocPrioridad As String=m.Get(\"Documento\")";
Debug.ShouldStop(65536);
_docprioridad = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocPrioridad", _docprioridad);Debug.locals.put("DocPrioridad", _docprioridad);
 BA.debugLineNum = 242;BA.debugLine="Dim Prioridad As Int=m.Get(\"Prioridad\")";
Debug.ShouldStop(131072);
_prioridad = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Prioridad")))));Debug.locals.put("Prioridad", _prioridad);Debug.locals.put("Prioridad", _prioridad);
 BA.debugLineNum = 243;BA.debugLine="Dim NombrePrioridad As String=m.Get(\"NombrePrio";
Debug.ShouldStop(262144);
_nombreprioridad = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombrePrioridad")))));Debug.locals.put("NombrePrioridad", _nombreprioridad);Debug.locals.put("NombrePrioridad", _nombreprioridad);
 BA.debugLineNum = 244;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGest";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDocumentosSinGestionar set Prioridad=?, NombrePrioridad=? where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_prioridad),(_nombreprioridad),(_docprioridad)})))));
 if (true) break;
if (true) break;

case 42:
//C
this.state = 43;
Debug.locals.put("m", _m);
;
 if (true) break;

case 43:
//C
this.state = 44;
;
 BA.debugLineNum = 248;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGestio";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDocumentosSinGestionar set Fase=? where Fase=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("NO INICIADO")),(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 249;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGestio";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDocumentosSinGestionar set NombreResponsableCuenta=? where TipoDocumento=? Or TipoDocumento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("N/A")),RemoteObject.createImmutable(("CDEV")),(RemoteObject.createImmutable("RTTrf"))})))));
 BA.debugLineNum = 250;BA.debugLine="mSQL.ExecNonQuery($\"update tblDocumentosSinGestio";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("update tblDocumentosSinGestionar set NumeroAlmacenesFisicos=tAux.NumAlmFis\n"),RemoteObject.createImmutable("		from (select Documento, count(AlmacenFisico) as NumAlmFis from tblDocumentosSinGestionar group by Documento) tAux\n"),RemoteObject.createImmutable("		where tblDocumentosSinGestionar.Documento=tAux.Documento")))));
 BA.debugLineNum = 253;BA.debugLine="mSQL.ExecNonQuery($\"update tblDocumentosSinGestio";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.createImmutable("update tblDocumentosSinGestionar set VariosAlmacenesFisicos=case when NumeroAlmacenesFisicos>1 then 'SI' else 'NO' end"))));
 BA.debugLineNum = 255;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 256;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(-2147483648);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblDocumentosSinGestionar where Gestionado=0")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 257;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
Debug.ShouldStop(1);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 258;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _rsub);
this.state = 90;
return;
case 90:
//C
this.state = 44;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 259;BA.debugLine="rs.Close";
Debug.ShouldStop(4);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 260;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(8);
if (true) break;

case 44:
//if
this.state = 64;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 261;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(16);
if (true) break;

case 47:
//if
this.state = 54;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 262;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTabl";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 263;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 264;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _msa);
this.state = 91;
return;
case 91:
//C
this.state = 50;
;
 BA.debugLineNum = 266;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 267;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _msa);
this.state = 92;
return;
case 92:
//C
this.state = 50;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 268;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(2048);
if (true) break;

case 50:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 269;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 270;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 53:
//C
this.state = 54;
;
 BA.debugLineNum = 273;BA.debugLine="ExitApplication";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 275;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(262144);

case 54:
//if
this.state = 63;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 276;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTabl";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 277;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(1048576);
if (true) break;

case 57:
//if
this.state = 62;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 59;
;}if (true) break;

case 59:
//C
this.state = 62;
if (true) return ;
if (true) break;

case 62:
//C
this.state = 63;
;
 BA.debugLineNum = 278;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 279;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _msa);
this.state = 93;
return;
case 93:
//C
this.state = 63;
;
 if (true) break;

case 63:
//C
this.state = 64;
;
 if (true) break;

case 64:
//C
this.state = 65;
;
 BA.debugLineNum = 284;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursorwaitdeshabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 285;BA.debugLine="wait for(ActualizarFechaInicioControl) complete (";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_actualizarfechainiciocontrol" /*RemoteObject*/ ));
this.state = 94;
return;
case 94:
//C
this.state = 65;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 287;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 289;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Datos actualiz";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Datos actualizados.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 290;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _msa);
this.state = 95;
return;
case 95:
//C
this.state = 65;
;
 BA.debugLineNum = 292;BA.debugLine="Dim NumDocsVariosAlmacenes As Int=mSQL.ExecQueryS";
Debug.ShouldStop(8);
_numdocsvariosalmacenes = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("select count(*) from tblDocumentosSinGestionar where NumeroAlmacenesFisicos>1"))));Debug.locals.put("NumDocsVariosAlmacenes", _numdocsvariosalmacenes);Debug.locals.put("NumDocsVariosAlmacenes", _numdocsvariosalmacenes);
 BA.debugLineNum = 293;BA.debugLine="If NumDocsVariosAlmacenes>0 Then";
Debug.ShouldStop(16);
if (true) break;

case 65:
//if
this.state = 78;
if (RemoteObject.solveBoolean(">",_numdocsvariosalmacenes,BA.numberCast(double.class, 0))) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 294;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"Hay";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Hay documentos con más de 1 almacén físico teórico asignado.\n"),RemoteObject.createImmutable("¿Filtrar la tabla por esos documentos?")))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 96;
return;
case 96:
//C
this.state = 68;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 296;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(128);
if (true) break;

case 68:
//if
this.state = 77;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 297;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.AddFiltro";
Debug.ShouldStop(256);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_addfiltrocampovalorinicial" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VariosAlmacenesFisicos")),(Object)((RemoteObject.createImmutable("SI"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 298;BA.debugLine="wait for(rSub) complete (Success As Boolean)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _rsub);
this.state = 97;
return;
case 97:
//C
this.state = 71;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 299;BA.debugLine="If Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 71:
//if
this.state = 76;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 73;
}else {
this.state = 75;
}if (true) break;

case 73:
//C
this.state = 76;
 if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 302;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible añadir el filtro de varios almacenes")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 303;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _msa);
this.state = 98;
return;
case 98:
//C
this.state = 76;
;
 if (true) break;

case 76:
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
this.state = -1;
;
 BA.debugLineNum = 308;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _sql_nonquerycomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizardatosdocumentosnav(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosDocumentosNAV (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,439);
if (RapidSub.canDelegate("actualizardatosdocumentosnav")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","actualizardatosdocumentosnav", __ref);}
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
public ResumableSub_ActualizarDatosDocumentosNAV(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _sfechainiciocontrolnav = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosDocumentosNAV (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,439);
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
 BA.debugLineNum = 440;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblAlbVtaDepNavLin";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblAlbVtaDepNavLin")));
 BA.debugLineNum = 441;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16777216);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 442;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(33554432);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 443;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 445;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(268435456);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 446;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(536870912);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 447;BA.debugLine="Dim sFechaInicioControlNAV As String=DateTime.Dat";
Debug.ShouldStop(1073741824);
_sfechainiciocontrolnav = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechainiciocontrol" /*RemoteObject*/ )));Debug.locals.put("sFechaInicioControlNAV", _sfechainiciocontrolnav);Debug.locals.put("sFechaInicioControlNAV", _sfechainiciocontrolnav);
 BA.debugLineNum = 448;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(-2147483648);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 449;BA.debugLine="Dim Comando As String=\"InfoNavControlDocumentos\"";
Debug.ShouldStop(1);
_comando = BA.ObjectToString("InfoNavControlDocumentos");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 450;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(2);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_sfechainiciocontrolnav)})),(Object)(__ref));
 BA.debugLineNum = 452;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatosdocumentosnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 455;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 456;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 457;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 458;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatosdocumentosnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 459;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 460;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 463;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 464;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTabl";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 465;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 466;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 467;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de Documentos no Gestionados.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 468;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizardatosdocumentosnav"), _msa);
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
 BA.debugLineNum = 470;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 471;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 474;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(33554432);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 483;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(4);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblAlbVtaDepNavLin")),(Object)(_lstreg));
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
 BA.debugLineNum = 486;BA.debugLine="Return mRes";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 487;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _actualizarfechainiciocontrol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarFechaInicioControl (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1222);
if (RapidSub.canDelegate("actualizarfechainiciocontrol")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","actualizarfechainiciocontrol", __ref);}
ResumableSub_ActualizarFechaInicioControl rsub = new ResumableSub_ActualizarFechaInicioControl(null,__ref);
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
public static class ResumableSub_ActualizarFechaInicioControl extends BA.ResumableSub {
public ResumableSub_ActualizarFechaInicioControl(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _minfechadocnogestionado = RemoteObject.createImmutable(0L);
RemoteObject _lstcomandos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _sdatetimefechainiciocontrol = RemoteObject.createImmutable("");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarFechaInicioControl (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1222);
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
 BA.debugLineNum = 1223;BA.debugLine="Dim MinFechaDocNoGestionado As Long=Utilidades.Fi";
Debug.ShouldStop(64);
_minfechadocnogestionado = parent._utilidades.runMethod(true,"_fixnulllong" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("select min(FechaDocumento) from tblDocumentosSinGestionar where Gestionado=0"))))));Debug.locals.put("MinFechaDocNoGestionado", _minfechadocnogestionado);Debug.locals.put("MinFechaDocNoGestionado", _minfechadocnogestionado);
 BA.debugLineNum = 1224;BA.debugLine="If MinFechaDocNoGestionado=0 Then Return False";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_minfechadocnogestionado,BA.numberCast(long.class, 0))) { 
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
 BA.debugLineNum = 1225;BA.debugLine="Log(DateTime.Date(MinFechaDocNoGestionado))";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","856098819",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_minfechadocnogestionado)),0);
 BA.debugLineNum = 1227;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(1024);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 1228;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(2048);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 1230;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(8192);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1231;BA.debugLine="DateTime.DateFormat= \"yyyy-MM-dd HH:mm:ss\"";
Debug.ShouldStop(16384);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 1232;BA.debugLine="Dim sDateTimeFechaInicioControl As String=DateTim";
Debug.ShouldStop(32768);
_sdatetimefechainiciocontrol = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_minfechadocnogestionado));Debug.locals.put("sDateTimeFechaInicioControl", _sdatetimefechainiciocontrol);Debug.locals.put("sDateTimeFechaInicioControl", _sdatetimefechainiciocontrol);
 BA.debugLineNum = 1233;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(65536);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1235;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"A";
Debug.ShouldStop(262144);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ActualizarFechaInicioControlDocumentosNoGestionados")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_sdatetimefechainiciocontrol)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1236;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(524288);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 1237;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizarfechainiciocontrol"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 11;
return;
case 11:
//C
this.state = 7;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1238;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 1239;BA.debugLine="If Success=False Then";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1242;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(33554432);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1243;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(67108864);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1244;BA.debugLine="LogColor(\"No ha sido posible actualizar la fecha";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","856098838",RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar la fecha de inicio del control a "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_minfechadocnogestionado))),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 1245;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1246;BA.debugLine="LogColor(\"Se mantiene en \" & sFechaInicioControl";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","856098840",RemoteObject.concat(RemoteObject.createImmutable("Se mantiene en "),__ref.getField(true,"_sfechainiciocontrol" /*RemoteObject*/ ),RemoteObject.createImmutable(".")),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 1247;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1250;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1251;BA.debugLine="End Sub";
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
public static RemoteObject  _actualizarprioridaddocumento(RemoteObject __ref,RemoteObject _idtipoprioridad,RemoteObject _docsel) throws Exception{
try {
		Debug.PushSubsStack("ActualizarPrioridadDocumento (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1343);
if (RapidSub.canDelegate("actualizarprioridaddocumento")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","actualizarprioridaddocumento", __ref, _idtipoprioridad, _docsel);}
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
public ResumableSub_ActualizarPrioridadDocumento(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref,RemoteObject _idtipoprioridad,RemoteObject _docsel) {
this.parent = parent;
this.__ref = __ref;
this._idtipoprioridad = _idtipoprioridad;
this._docsel = _docsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _idtipoprioridad;
RemoteObject _docsel;
RemoteObject _lstcomandos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarPrioridadDocumento (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1343);
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
 BA.debugLineNum = 1345;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(1);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 1346;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(2);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 1348;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"A";
Debug.ShouldStop(8);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ActualizarPrioridadDocumentoNoGestionado")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_docsel),(_idtipoprioridad),(_idtipoprioridad)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1349;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(16);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 1350;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizarprioridaddocumento"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1351;BA.debugLine="If Success=False Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 1352;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar la prioridad para el documento "),_docsel,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1353;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "actualizarprioridaddocumento"), _msa);
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 BA.debugLineNum = 1354;BA.debugLine="Return Success";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1357;BA.debugLine="Return Success";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 1358;BA.debugLine="End Sub";
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
public static RemoteObject  _borrardatosbatchanterioresuuidsesion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosBatchAnterioresUUIDSesion (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,950);
if (RapidSub.canDelegate("borrardatosbatchanterioresuuidsesion")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","borrardatosbatchanterioresuuidsesion", __ref);}
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
public ResumableSub_BorrarDatosBatchAnterioresUUIDSesion(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosBatchAnterioresUUIDSesion (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,950);
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
 BA.debugLineNum = 952;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(8388608);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 953;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(16777216);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 954;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
Debug.ShouldStop(33554432);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarLineasFaseActualDocumentoBacthUUID")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_uuidsesion" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 955;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(67108864);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 956;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(134217728);
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 957;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "borrardatosbatchanterioresuuidsesion"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 959;BA.debugLine="If result=False Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 960;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 961;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthUUID")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 962;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "borrardatosbatchanterioresuuidsesion"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 BA.debugLineNum = 963;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 965;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 967;BA.debugLine="End Sub";
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
public static void  _ejecutarbatch_completed(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _borrardatosfaseactualdocumentosbatchanterioresmaquinausuario(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,931);
if (RapidSub.canDelegate("borrardatosfaseactualdocumentosbatchanterioresmaquinausuario")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","borrardatosfaseactualdocumentosbatchanterioresmaquinausuario", __ref);}
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
public ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,931);
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
 BA.debugLineNum = 933;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(16);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 934;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(32);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 935;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
Debug.ShouldStop(64);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarLineasFaseActualDocumentoBacthMaquinaUsuario")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(parent._main._datosusuario /*RemoteObject*/ .getField(true,"Dispositivo" /*RemoteObject*/ )),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 936;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(128);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 937;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(256);
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 938;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 940;BA.debugLine="If result=False Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 941;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 942;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthMaquinaUsuario")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 943;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 BA.debugLineNum = 944;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 946;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 948;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btnActualizar_Click (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,670);
if (RapidSub.canDelegate("btnactualizar_click")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","btnactualizar_click", __ref);}
 BA.debugLineNum = 670;BA.debugLine="Private Sub btnActualizar_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 671;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 672;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("btnEjemplo_Click (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,674);
if (RapidSub.canDelegate("btnejemplo_click")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","btnejemplo_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
 BA.debugLineNum = 674;BA.debugLine="Private Sub btnEjemplo_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 675;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(4);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), ccontroldocumentosnogestionados.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 676;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(8);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 677;BA.debugLine="Log(mData)";
Debug.ShouldStop(16);
ccontroldocumentosnogestionados.__c.runVoidMethod ("LogImpl","855312387",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 678;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(32);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 679;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("btnFasesDoc_Click (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,914);
if (RapidSub.canDelegate("btnfasesdoc_click")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","btnfasesdoc_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _docsel = RemoteObject.createImmutable("");
RemoteObject _cfdoc = RemoteObject.declareNull("b4j.docU.cfasesdocumento");
 BA.debugLineNum = 914;BA.debugLine="Private Sub btnFasesDoc_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 915;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(262144);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), ccontroldocumentosnogestionados.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 916;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(524288);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 917;BA.debugLine="Log(mData)";
Debug.ShouldStop(1048576);
ccontroldocumentosnogestionados.__c.runVoidMethod ("LogImpl","855574531",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 920;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
Debug.ShouldStop(8388608);
_docsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 922;BA.debugLine="Dim cFDoc As cFasesDocumento";
Debug.ShouldStop(33554432);
_cfdoc = RemoteObject.createNew ("b4j.docU.cfasesdocumento");Debug.locals.put("cFDoc", _cfdoc);
 BA.debugLineNum = 923;BA.debugLine="cFDoc.Initialize(Me, frm.RootPane,DocSel)";
Debug.ShouldStop(67108864);
_cfdoc.runClassMethod (b4j.docU.cfasesdocumento.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()),(Object)(_docsel));
 BA.debugLineNum = 924;BA.debugLine="cFDoc.Show";
Debug.ShouldStop(134217728);
_cfdoc.runClassMethod (b4j.docU.cfasesdocumento.class, "_show" /*void*/ );
 BA.debugLineNum = 925;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("btnMostrarDocumentoEnNavision_Click (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1155);
if (RapidSub.canDelegate("btnmostrardocumentoennavision_click")) { __ref.runUserSub(false, "ccontroldocumentosnogestionados","btnmostrardocumentoennavision_click", __ref); return;}
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
public ResumableSub_btnMostrarDocumentoEnNavision_Click(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
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
		Debug.PushSubsStack("btnMostrarDocumentoEnNavision_Click (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1155);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1156;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(8);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 1157;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(16);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1158;BA.debugLine="Log(mData)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","855967747",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 1159;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(64);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 1161;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
Debug.ShouldStop(256);
_docsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 1162;BA.debugLine="Select True";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 1164;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(2048);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico Albaranes Venta")),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 1166;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(8192);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico recep. transferencia")),(Object)(BA.numberCast(int.class, 5745)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1168;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(32768);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico envío devolución")),(Object)(BA.numberCast(int.class, 6650)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 1174;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnmostrardocumentoennavision_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 1176;BA.debugLine="If success Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 1179;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible abrir la ficha del documento "),_docsel,RemoteObject.createImmutable(" en NAVISION."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1180;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnmostrardocumentoennavision_click"), _msa);
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
 BA.debugLineNum = 1182;BA.debugLine="End Sub";
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
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","btnsalir_click", __ref);}
 BA.debugLineNum = 319;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 320;BA.debugLine="SalirModulo";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("btnSelAlmFisico_Click (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,683);
if (RapidSub.canDelegate("btnselalmfisico_click")) { __ref.runUserSub(false, "ccontroldocumentosnogestionados","btnselalmfisico_click", __ref); return;}
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
public ResumableSub_btnSelAlmFisico_Click(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
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
		Debug.PushSubsStack("btnSelAlmFisico_Click (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,683);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 684;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(2048);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 686;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(8192);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 687;BA.debugLine="Log(mData)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","855377924",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 688;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(32768);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 690;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
Debug.ShouldStop(131072);
_docsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 693;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(1048576);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 695;BA.debugLine="Dialog.Title=\"Selecciona Almacén Físico de Prepar";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Almacén Físico de Preparación")));
 BA.debugLineNum = 696;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 697;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 698;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 699;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(67108864);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 700;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(134217728);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 702;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(536870912);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 703;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(1073741824);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 704;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(-2147483648);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 706;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(2);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 707;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(4);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 709;BA.debugLine="Dim lstOpciones As List=Array As String(\"PROIN\",\"";
Debug.ShouldStop(16);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstopciones = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("PROIN"),BA.ObjectToString("PROTEC"),RemoteObject.createImmutable("ADESA")})));Debug.locals.put("lstOpciones", _lstopciones);Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 711;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(64);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 713;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(256);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 715;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 716;BA.debugLine="xclv.ResizeItem(i,80dip)";
Debug.ShouldStop(2048);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 720;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(32768);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 721;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 723;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(262144);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 724;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(524288);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 725;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(1048576);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 728;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnselalmfisico_click"), _rsub);
this.state = 25;
return;
case 25:
//C
this.state = 9;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 730;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 732;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 734;BA.debugLine="Dim AlmFis As String=B4XListDlg.SelectedItem";
Debug.ShouldStop(536870912);
_almfis = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("AlmFis", _almfis);Debug.locals.put("AlmFis", _almfis);
 BA.debugLineNum = 736;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(-2147483648);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 737;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(1);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 739;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"B";
Debug.ShouldStop(4);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("BorrarDocumentoAlmacenManual")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_docsel)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 740;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(8);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 741;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"I";
Debug.ShouldStop(16);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InsertarDocumentoAlmacenManual")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_docsel),(_almfis)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 742;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(32);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 743;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnselalmfisico_click"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 26;
return;
case 26:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 744;BA.debugLine="If Success=False Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 745;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar el almacén físico para el documento "),_docsel,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 746;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnselalmfisico_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 18;
;
 BA.debugLineNum = 747;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 751;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set AlmacenFisico=? where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_almfis,_docsel})))));
 BA.debugLineNum = 752;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGestio";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDocumentosSinGestionar set AlmacenFisico=? where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_almfis,_docsel})))));
 BA.debugLineNum = 764;BA.debugLine="Dim mDataModif As Map";
Debug.ShouldStop(134217728);
_mdatamodif = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDataModif", _mdatamodif);
 BA.debugLineNum = 765;BA.debugLine="mDataModif.Initialize";
Debug.ShouldStop(268435456);
_mdatamodif.runVoidMethod ("Initialize");
 BA.debugLineNum = 766;BA.debugLine="mDataModif.Put(\"AlmacenFisico\",AlmFis)";
Debug.ShouldStop(536870912);
_mdatamodif.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AlmacenFisico"))),(Object)((_almfis)));
 BA.debugLineNum = 767;BA.debugLine="wait for(JamTableCLV1.ActualizarValueItemCLV(Inde";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnselalmfisico_click"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_actualizarvalueitemclv" /*RemoteObject*/ ,(Object)(_indexsel),(Object)(_mdatamodif)));
this.state = 28;
return;
case 28:
//C
this.state = 19;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 768;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 769;BA.debugLine="ExitApplication";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 22:
//C
this.state = -1;
;
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
public static void  _btnselprioridad_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelPrioridad_Click (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,773);
if (RapidSub.canDelegate("btnselprioridad_click")) { __ref.runUserSub(false, "ccontroldocumentosnogestionados","btnselprioridad_click", __ref); return;}
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
public ResumableSub_btnSelPrioridad_Click(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
RemoteObject _primerindexvisible = RemoteObject.createImmutable(0);
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
RemoteObject group21;
int index21;
int groupLen21;
int step40;
int limit40;
RemoteObject group54;
int index54;
int groupLen54;
RemoteObject group69;
int index69;
int groupLen69;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelPrioridad_Click (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,773);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 774;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(32);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 775;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
Debug.ShouldStop(64);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 776;BA.debugLine="Log(mData)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","855443459",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 777;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
Debug.ShouldStop(256);
_indexsel = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 778;BA.debugLine="Dim PrimerIndexVisible As Int=JamTableCLV1.FirstV";
Debug.ShouldStop(512);
_primerindexvisible = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getfirstvisibleindex" /*RemoteObject*/ );Debug.locals.put("PrimerIndexVisible", _primerindexvisible);Debug.locals.put("PrimerIndexVisible", _primerindexvisible);
 BA.debugLineNum = 780;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
Debug.ShouldStop(2048);
_docsel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 781;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Asignar Pr";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Asignar Prioridad al documento "),_docsel,RemoteObject.createImmutable("?"))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 782;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), _msa);
this.state = 60;
return;
case 60:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 783;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 785;BA.debugLine="If PrimerAvisoInfoEstablecerPrioridad Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 786;BA.debugLine="PrimerAvisoInfoEstablecerPrioridad=False";
Debug.ShouldStop(131072);
__ref.setField ("_primeravisoinfoestablecerprioridad" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 787;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"A=Máxima prio";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("A=Máxima prioridad.")),(Object)(RemoteObject.createImmutable("Información")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 788;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), _msa);
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
 BA.debugLineNum = 792;BA.debugLine="wait for(CargarTiposPrioridadesDocumentosNoGestio";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_cargartiposprioridadesdocumentosnogestionados" /*RemoteObject*/ ));
this.state = 62;
return;
case 62:
//C
this.state = 11;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 793;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 794;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 795;BA.debugLine="Dim lstOpciones As List";
Debug.ShouldStop(67108864);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 796;BA.debugLine="lstOpciones.Initialize";
Debug.ShouldStop(134217728);
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 797;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(268435456);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 801;BA.debugLine="For Each mPrioridad As Map In lstReg";
Debug.ShouldStop(1);
if (true) break;

case 17:
//for
this.state = 20;
_mprioridad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = _lstreg;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mPrioridad", _mprioridad);
this.state = 63;
if (true) break;

case 63:
//C
this.state = 20;
if (index21 < groupLen21) {
this.state = 19;
_mprioridad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group21.runMethod(false,"Get",index21));Debug.locals.put("mPrioridad", _mprioridad);}
if (true) break;

case 64:
//C
this.state = 63;
index21++;
Debug.locals.put("mPrioridad", _mprioridad);
if (true) break;

case 19:
//C
this.state = 64;
 BA.debugLineNum = 803;BA.debugLine="Dim NombreTipoPrioridad As String";
Debug.ShouldStop(4);
_nombretipoprioridad = RemoteObject.createImmutable("");Debug.locals.put("NombreTipoPrioridad", _nombretipoprioridad);
 BA.debugLineNum = 807;BA.debugLine="NombreTipoPrioridad=Utilidades.FixNull(mPriorid";
Debug.ShouldStop(64);
_nombretipoprioridad = parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_mprioridad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TituloPrioridad"))))));Debug.locals.put("NombreTipoPrioridad", _nombretipoprioridad);
 BA.debugLineNum = 810;BA.debugLine="lstOpciones.Add(NombreTipoPrioridad)";
Debug.ShouldStop(512);
_lstopciones.runVoidMethod ("Add",(Object)((_nombretipoprioridad)));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
Debug.locals.put("mPrioridad", _mprioridad);
;
 BA.debugLineNum = 815;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
Debug.ShouldStop(16384);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 816;BA.debugLine="Dialog.Title=\"Selecciona Tipo de Prioridad\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Tipo de Prioridad")));
 BA.debugLineNum = 817;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(65536);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 818;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(131072);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 819;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 820;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(524288);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 821;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(1048576);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 823;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(4194304);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 824;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(8388608);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 825;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(16777216);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 827;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(67108864);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 828;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(134217728);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 830;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(536870912);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 832;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(-2147483648);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 834;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(2);
if (true) break;

case 21:
//for
this.state = 24;
step40 = 1;
limit40 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 65;
if (true) break;

case 65:
//C
this.state = 24;
if ((step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40)) this.state = 23;
if (true) break;

case 66:
//C
this.state = 65;
_i = ((int)(0 + _i + step40)) ;
Debug.locals.put("i", _i);
if (true) break;

case 23:
//C
this.state = 66;
 BA.debugLineNum = 835;BA.debugLine="xclv.ResizeItem(i,(xclv.sv.Height/lstOpciones.si";
Debug.ShouldStop(4);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_xclv.getField(false,"_sv").runMethod(true,"getHeight"),_lstopciones.runMethod(true,"getSize")}, "/",0, 0)),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 0))));
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 838;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(32);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 839;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 841;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(256);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 842;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(512);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 843;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(1024);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 846;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), _rsub);
this.state = 67;
return;
case 67:
//C
this.state = 29;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 848;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 852;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 856;BA.debugLine="Dim PrioridadSel As Int=-1";
Debug.ShouldStop(8388608);
_prioridadsel = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("PrioridadSel", _prioridadsel);Debug.locals.put("PrioridadSel", _prioridadsel);
 BA.debugLineNum = 857;BA.debugLine="Dim NombrePrioridadSel As String=B4XListDlg.Selec";
Debug.ShouldStop(16777216);
_nombreprioridadsel = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("NombrePrioridadSel", _nombreprioridadsel);Debug.locals.put("NombrePrioridadSel", _nombreprioridadsel);
 BA.debugLineNum = 859;BA.debugLine="For Each mPr As Map In lstReg";
Debug.ShouldStop(67108864);
if (true) break;

case 35:
//for
this.state = 42;
_mpr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group54 = _lstreg;
index54 = 0;
groupLen54 = group54.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mPr", _mpr);
this.state = 68;
if (true) break;

case 68:
//C
this.state = 42;
if (index54 < groupLen54) {
this.state = 37;
_mpr = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group54.runMethod(false,"Get",index54));Debug.locals.put("mPr", _mpr);}
if (true) break;

case 69:
//C
this.state = 68;
index54++;
Debug.locals.put("mPr", _mpr);
if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 860;BA.debugLine="Dim NombreTipoPrioridad As String=Utilidades.Fix";
Debug.ShouldStop(134217728);
_nombretipoprioridad = parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_mpr.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TituloPrioridad"))))));Debug.locals.put("NombreTipoPrioridad", _nombretipoprioridad);Debug.locals.put("NombreTipoPrioridad", _nombretipoprioridad);
 BA.debugLineNum = 861;BA.debugLine="If NombreTipoPrioridad=NombrePrioridadSel Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 862;BA.debugLine="PrioridadSel=mPr.Get(\"Prioridad\")";
Debug.ShouldStop(536870912);
_prioridadsel = BA.numberCast(int.class, _mpr.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Prioridad")))));Debug.locals.put("PrioridadSel", _prioridadsel);
 BA.debugLineNum = 863;BA.debugLine="Exit";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 866;BA.debugLine="If PrioridadSel=-1 Then";
Debug.ShouldStop(2);

case 42:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",_prioridadsel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 867;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar la prioridad para el documento "),_docsel,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 868;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), _msa);
this.state = 70;
return;
case 70:
//C
this.state = 45;
;
 BA.debugLineNum = 869;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return ;
 if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 872;BA.debugLine="Wait For(ActualizarPrioridadDocumento(PrioridadSe";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_actualizarprioridaddocumento" /*RemoteObject*/ ,(Object)(_prioridadsel),(Object)(_docsel)));
this.state = 71;
return;
case 71:
//C
this.state = 46;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 873;BA.debugLine="If Success=False Then Return";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 876;BA.debugLine="Dim pnl As B4XView=JamTableCLV1.GetPanel(IndexSel";
Debug.ShouldStop(2048);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getpanel" /*RemoteObject*/ ,(Object)(_indexsel));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 877;BA.debugLine="For Each n As Node In pnl.GetAllViewsRecursive";
Debug.ShouldStop(4096);
if (true) break;

case 52:
//for
this.state = 59;
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
group69 = _pnl.runMethod(false,"GetAllViewsRecursive");
index69 = 0;
groupLen69 = group69.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("n", _n);
this.state = 72;
if (true) break;

case 72:
//C
this.state = 59;
if (index69 < groupLen69) {
this.state = 54;
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group69.runMethod(false,"Get",index69));Debug.locals.put("n", _n);}
if (true) break;

case 73:
//C
this.state = 72;
index69++;
Debug.locals.put("n", _n);
if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 878;BA.debugLine="If n.Tag=\"Prioridad\" Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 879;BA.debugLine="Dim tF As TextField=n";
Debug.ShouldStop(16384);
_tf = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper"), _n.getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 880;BA.debugLine="tF.Text=NombreTipoPrioridad";
Debug.ShouldStop(32768);
_tf.runMethod(true,"setText",_nombretipoprioridad);
 BA.debugLineNum = 881;BA.debugLine="ActualizarColortFPrioridad(tF,NombreTipoPriorid";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_actualizarcolortfprioridad" /*RemoteObject*/ ,(Object)(_tf),(Object)(_nombretipoprioridad));
 BA.debugLineNum = 882;BA.debugLine="Exit";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 885;BA.debugLine="mData.Put(\"Prioridad\",PrioridadSel)";
Debug.ShouldStop(1048576);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Prioridad"))),(Object)((_prioridadsel)));
 BA.debugLineNum = 886;BA.debugLine="mData.Put(\"NombrePrioridad\",NombrePrioridadSel)";
Debug.ShouldStop(2097152);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombrePrioridad"))),(Object)((_nombreprioridadsel)));
 BA.debugLineNum = 887;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set Prioridad=?, NombrePrioridad=? where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_prioridadsel),(_nombreprioridadsel),(_docsel)})))));
 BA.debugLineNum = 889;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadocumentosalmacenmanual(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaDocumentosAlmacenManual (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1028);
if (RapidSub.canDelegate("cargadocumentosalmacenmanual")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","cargadocumentosalmacenmanual", __ref);}
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
public ResumableSub_CargaDocumentosAlmacenManual(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDocumentosAlmacenManual (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1028);
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
 BA.debugLineNum = 1029;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1030;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(32);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1031;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1032;BA.debugLine="Dim Comando As String=\"DocumentosAlmacenManual\"";
Debug.ShouldStop(128);
_comando = BA.ObjectToString("DocumentosAlmacenManual");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1033;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(256);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1035;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "cargadocumentosalmacenmanual"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1037;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 1038;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 1039;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1040;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "cargadocumentosalmacenmanual"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1041;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1042;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1045;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 1046;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1047;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1049;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1050;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1051;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(67108864);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1052;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 1055;BA.debugLine="Return mRes";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1056;BA.debugLine="End Sub";
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
public static RemoteObject  _cargaprioridadesdocumentos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaPrioridadesDocumentos (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1253);
if (RapidSub.canDelegate("cargaprioridadesdocumentos")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","cargaprioridadesdocumentos", __ref);}
ResumableSub_CargaPrioridadesDocumentos rsub = new ResumableSub_CargaPrioridadesDocumentos(null,__ref);
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
public static class ResumableSub_CargaPrioridadesDocumentos extends BA.ResumableSub {
public ResumableSub_CargaPrioridadesDocumentos(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaPrioridadesDocumentos (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1253);
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
 BA.debugLineNum = 1254;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(32);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1255;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(64);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1256;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1257;BA.debugLine="Dim Comando As String=\"PrioridadesDocumentos\"";
Debug.ShouldStop(256);
_comando = BA.ObjectToString("PrioridadesDocumentos");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1258;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(512);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1260;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "cargaprioridadesdocumentos"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1261;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 1262;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 1263;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1264;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "cargaprioridadesdocumentos"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1265;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1266;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1269;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 1270;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1271;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1273;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1274;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1275;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(67108864);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1276;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 1279;BA.debugLine="Return mRes";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1280;BA.debugLine="End Sub";
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
public static RemoteObject  _cargarfechainiciocontrol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargarFechaInicioControl (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1184);
if (RapidSub.canDelegate("cargarfechainiciocontrol")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","cargarfechainiciocontrol", __ref);}
ResumableSub_CargarFechaInicioControl rsub = new ResumableSub_CargarFechaInicioControl(null,__ref);
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
public static class ResumableSub_CargarFechaInicioControl extends BA.ResumableSub {
public ResumableSub_CargarFechaInicioControl(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mfecha = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dateformatant = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargarFechaInicioControl (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1184);
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
 BA.debugLineNum = 1185;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1189;BA.debugLine="Dim Comando As String=\"FechaInicioControlDocument";
Debug.ShouldStop(16);
_comando = BA.ObjectToString("FechaInicioControlDocumentosNoGestionados");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1190;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(32);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1192;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "cargarfechainiciocontrol"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1194;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 1195;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1196;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "cargarfechainiciocontrol"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1197;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1201;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 1202;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1204;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de Fecha Inicio Control")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1205;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "cargarfechainiciocontrol"), _msa);
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
 BA.debugLineNum = 1207;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1210;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(33554432);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1211;BA.debugLine="Dim mFecha As Map=lstReg.Get(0)";
Debug.ShouldStop(67108864);
_mfecha = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mfecha = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mFecha", _mfecha);Debug.locals.put("mFecha", _mfecha);
 BA.debugLineNum = 1212;BA.debugLine="FechaInicioControl=mFecha.GetValueAt(0)";
Debug.ShouldStop(134217728);
__ref.setField ("_fechainiciocontrol" /*RemoteObject*/ ,BA.numberCast(long.class, _mfecha.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 1213;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(268435456);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1214;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(536870912);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1215;BA.debugLine="sFechaInicioControl=DateTime.Date(FechaInicioCo";
Debug.ShouldStop(1073741824);
__ref.setField ("_sfechainiciocontrol" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechainiciocontrol" /*RemoteObject*/ ))));
 BA.debugLineNum = 1216;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(-2147483648);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
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
 BA.debugLineNum = 1219;BA.debugLine="Return Accion";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 1220;BA.debugLine="End Sub";
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
public static RemoteObject  _cargartiposprioridadesdocumentosnogestionados(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargarTiposPrioridadesDocumentosNoGestionados (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1310);
if (RapidSub.canDelegate("cargartiposprioridadesdocumentosnogestionados")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","cargartiposprioridadesdocumentosnogestionados", __ref);}
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
public ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargarTiposPrioridadesDocumentosNoGestionados (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1310);
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
 BA.debugLineNum = 1312;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(-2147483648);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1313;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(1);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1314;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1316;BA.debugLine="Dim Comando As String=\"TiposPrioridadesDocumentos";
Debug.ShouldStop(8);
_comando = BA.ObjectToString("TiposPrioridadesDocumentosNoGestionados");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1317;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(16);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 1319;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "cargartiposprioridadesdocumentosnogestionados"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1321;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 1322;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1323;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "cargartiposprioridadesdocumentosnogestionados"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 1324;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1325;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1328;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 1329;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1330;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1331;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de tipos de prioridad para documentos no gestionados")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1332;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "cargartiposprioridadesdocumentosnogestionados"), _msa);
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
 BA.debugLineNum = 1334;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1335;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1336;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8388608);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1337;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 1340;BA.debugLine="Return mRes";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1341;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
ccontroldocumentosnogestionados._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",ccontroldocumentosnogestionados._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
ccontroldocumentosnogestionados._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",ccontroldocumentosnogestionados._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
ccontroldocumentosnogestionados._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",ccontroldocumentosnogestionados._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private Dialog As B4XDialog";
ccontroldocumentosnogestionados._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",ccontroldocumentosnogestionados._dialog);
 //BA.debugLineNum = 9;BA.debugLine="Private mSQL As SQL";
ccontroldocumentosnogestionados._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",ccontroldocumentosnogestionados._msql);
 //BA.debugLineNum = 14;BA.debugLine="Private JamTableCLV1 As JamTableCLV";
ccontroldocumentosnogestionados._jamtableclv1 = RemoteObject.createNew ("b4j.docU.jamtableclv");__ref.setField("_jamtableclv1",ccontroldocumentosnogestionados._jamtableclv1);
 //BA.debugLineNum = 15;BA.debugLine="Private txtAlmacenDocumento As TextField";
ccontroldocumentosnogestionados._txtalmacendocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtalmacendocumento",ccontroldocumentosnogestionados._txtalmacendocumento);
 //BA.debugLineNum = 16;BA.debugLine="Private txtAlmacenFisico As TextField";
ccontroldocumentosnogestionados._txtalmacenfisico = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtalmacenfisico",ccontroldocumentosnogestionados._txtalmacenfisico);
 //BA.debugLineNum = 17;BA.debugLine="Private txtCliente As TextField";
ccontroldocumentosnogestionados._txtcliente = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcliente",ccontroldocumentosnogestionados._txtcliente);
 //BA.debugLineNum = 18;BA.debugLine="Private txtDiasAcum As TextField";
ccontroldocumentosnogestionados._txtdiasacum = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdiasacum",ccontroldocumentosnogestionados._txtdiasacum);
 //BA.debugLineNum = 19;BA.debugLine="Private txtDocumento As TextField";
ccontroldocumentosnogestionados._txtdocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdocumento",ccontroldocumentosnogestionados._txtdocumento);
 //BA.debugLineNum = 20;BA.debugLine="Private txtFase As TextField";
ccontroldocumentosnogestionados._txtfase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfase",ccontroldocumentosnogestionados._txtfase);
 //BA.debugLineNum = 21;BA.debugLine="Private txtFechaDocumento As TextField";
ccontroldocumentosnogestionados._txtfechadocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechadocumento",ccontroldocumentosnogestionados._txtfechadocumento);
 //BA.debugLineNum = 22;BA.debugLine="Private txtFechaFase As TextField";
ccontroldocumentosnogestionados._txtfechafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechafase",ccontroldocumentosnogestionados._txtfechafase);
 //BA.debugLineNum = 23;BA.debugLine="Private txtFechaReferencia As TextField";
ccontroldocumentosnogestionados._txtfechareferencia = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechareferencia",ccontroldocumentosnogestionados._txtfechareferencia);
 //BA.debugLineNum = 24;BA.debugLine="Private txtInfoAdicionalFase As TextField";
ccontroldocumentosnogestionados._txtinfoadicionalfase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtinfoadicionalfase",ccontroldocumentosnogestionados._txtinfoadicionalfase);
 //BA.debugLineNum = 25;BA.debugLine="Private txtNombreCliente As TextField";
ccontroldocumentosnogestionados._txtnombrecliente = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombrecliente",ccontroldocumentosnogestionados._txtnombrecliente);
 //BA.debugLineNum = 26;BA.debugLine="Private txtObservaciones As TextField";
ccontroldocumentosnogestionados._txtobservaciones = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtobservaciones",ccontroldocumentosnogestionados._txtobservaciones);
 //BA.debugLineNum = 27;BA.debugLine="Private txtPersonalizado As TextField";
ccontroldocumentosnogestionados._txtpersonalizado = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpersonalizado",ccontroldocumentosnogestionados._txtpersonalizado);
 //BA.debugLineNum = 28;BA.debugLine="Private txtPrioridad As TextField";
ccontroldocumentosnogestionados._txtprioridad = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtprioridad",ccontroldocumentosnogestionados._txtprioridad);
 //BA.debugLineNum = 29;BA.debugLine="Private txtResponsableFase As TextField";
ccontroldocumentosnogestionados._txtresponsablefase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtresponsablefase",ccontroldocumentosnogestionados._txtresponsablefase);
 //BA.debugLineNum = 30;BA.debugLine="Private txtTipoDocumento As TextField";
ccontroldocumentosnogestionados._txttipodocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txttipodocumento",ccontroldocumentosnogestionados._txttipodocumento);
 //BA.debugLineNum = 31;BA.debugLine="Private txtTotalImp As TextField";
ccontroldocumentosnogestionados._txttotalimp = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txttotalimp",ccontroldocumentosnogestionados._txttotalimp);
 //BA.debugLineNum = 32;BA.debugLine="Private txtTotalQty As TextField";
ccontroldocumentosnogestionados._txttotalqty = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txttotalqty",ccontroldocumentosnogestionados._txttotalqty);
 //BA.debugLineNum = 34;BA.debugLine="Private TimestampBatchFaseDocs As Long";
ccontroldocumentosnogestionados._timestampbatchfasedocs = RemoteObject.createImmutable(0L);__ref.setField("_timestampbatchfasedocs",ccontroldocumentosnogestionados._timestampbatchfasedocs);
 //BA.debugLineNum = 35;BA.debugLine="Private UUIDSesion As String";
ccontroldocumentosnogestionados._uuidsesion = RemoteObject.createImmutable("");__ref.setField("_uuidsesion",ccontroldocumentosnogestionados._uuidsesion);
 //BA.debugLineNum = 37;BA.debugLine="Private FechaInicioControl As Long";
ccontroldocumentosnogestionados._fechainiciocontrol = RemoteObject.createImmutable(0L);__ref.setField("_fechainiciocontrol",ccontroldocumentosnogestionados._fechainiciocontrol);
 //BA.debugLineNum = 38;BA.debugLine="Private sFechaInicioControl As String";
ccontroldocumentosnogestionados._sfechainiciocontrol = RemoteObject.createImmutable("");__ref.setField("_sfechainiciocontrol",ccontroldocumentosnogestionados._sfechainiciocontrol);
 //BA.debugLineNum = 40;BA.debugLine="Private PrimerAvisoInfoEstablecerPrioridad As Boo";
ccontroldocumentosnogestionados._primeravisoinfoestablecerprioridad = RemoteObject.createImmutable(false);__ref.setField("_primeravisoinfoestablecerprioridad",ccontroldocumentosnogestionados._primeravisoinfoestablecerprioridad);
 //BA.debugLineNum = 41;BA.debugLine="Private txtNombreResponsableCuenta As TextField";
ccontroldocumentosnogestionados._txtnombreresponsablecuenta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombreresponsablecuenta",ccontroldocumentosnogestionados._txtnombreresponsablecuenta);
 //BA.debugLineNum = 42;BA.debugLine="Private txtNumeroAlmacenesFisicos As B4XView";
ccontroldocumentosnogestionados._txtnumeroalmacenesfisicos = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnumeroalmacenesfisicos",ccontroldocumentosnogestionados._txtnumeroalmacenesfisicos);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 354;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(2);
 BA.debugLineNum = 355;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(4);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(ccontroldocumentosnogestionados.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblAlbVtaDepNavLin")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 356;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 357;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblAlbVtaDepNavLin";
Debug.ShouldStop(16);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblAlbVtaDepNavLin")));
 };
 BA.debugLineNum = 359;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(64);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 360;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 361;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblAlbVtaDepNavLin (")));
 BA.debugLineNum = 363;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fecha INTEGER,")));
 BA.debugLineNum = 364;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 365;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Cliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 366;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreCliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 367;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 368;BA.debugLine="sbCrearTabla.Append(\"GRC TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("GRC TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 369;BA.debugLine="sbCrearTabla.Append(\"AlmOrig TEXT COLLATE NOCASE,";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmOrig TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 370;BA.debugLine="sbCrearTabla.Append(\"Almacen TEXT COLLATE NOCASE";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Almacen TEXT COLLATE NOCASE default 'PROIN',")));
 BA.debugLineNum = 371;BA.debugLine="sbCrearTabla.Append(\"Qty REAL,\")";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Qty REAL,")));
 BA.debugLineNum = 372;BA.debugLine="sbCrearTabla.Append(\"Precio REAL,\")";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Precio REAL,")));
 BA.debugLineNum = 373;BA.debugLine="sbCrearTabla.Append(\"Descuento REAL,\")";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Descuento REAL,")));
 BA.debugLineNum = 374;BA.debugLine="sbCrearTabla.Append(\"Importe REAL default 0,\")";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Importe REAL default 0,")));
 BA.debugLineNum = 375;BA.debugLine="sbCrearTabla.Append(\"Personalizado INTEGER,\")";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Personalizado INTEGER,")));
 BA.debugLineNum = 376;BA.debugLine="sbCrearTabla.Append(\"Pedido TEXT COLLATE NOCASE,\"";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Pedido TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 377;BA.debugLine="sbCrearTabla.Append(\"FechaPedido TEXT COLLATE NOC";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPedido TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 378;BA.debugLine="sbCrearTabla.Append(\"FechaProm INTEGER,\")";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaProm INTEGER,")));
 BA.debugLineNum = 379;BA.debugLine="sbCrearTabla.Append(\"FechaReq INTEGER,\")";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaReq INTEGER,")));
 BA.debugLineNum = 380;BA.debugLine="sbCrearTabla.Append(\"TipoDoc TEXT COLLATE NOCASE,";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TipoDoc TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 381;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreResponsableCuenta TEXT COLLATE NOCASE default '')")));
 BA.debugLineNum = 382;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 385;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(1);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(ccontroldocumentosnogestionados.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblDocumentosSinGestionar")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 386;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 387;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblDocumentosSinGe";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblDocumentosSinGestionar")));
 };
 BA.debugLineNum = 389;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(16);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 390;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 391;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblDocumentosSinGestionar (")));
 BA.debugLineNum = 393;BA.debugLine="sbCrearTabla.Append(\"FechaDocumento INTEGER,\")";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaDocumento INTEGER,")));
 BA.debugLineNum = 394;BA.debugLine="sbCrearTabla.Append(\"DiasAcumulados INTEGER defau";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DiasAcumulados INTEGER default 0,")));
 BA.debugLineNum = 395;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 396;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Cliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 397;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreCliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 398;BA.debugLine="sbCrearTabla.Append(\"AlmacenDocumento TEXT COLLAT";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmacenDocumento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 399;BA.debugLine="sbCrearTabla.Append(\"AlmacenFisico TEXT COLLATE N";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmacenFisico TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 400;BA.debugLine="sbCrearTabla.Append(\"NumeroAlmacenesFisicos INTEG";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NumeroAlmacenesFisicos INTEGER DEFAULT 1,")));
 BA.debugLineNum = 401;BA.debugLine="sbCrearTabla.Append(\"VariosAlmacenesFisicos TEXT";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("VariosAlmacenesFisicos TEXT DEFAULT 'NO',")));
 BA.debugLineNum = 402;BA.debugLine="sbCrearTabla.Append(\"Pedido TEXT COLLATE NOCASE,\"";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Pedido TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 403;BA.debugLine="sbCrearTabla.Append(\"TotalQty REAL,\")";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TotalQty REAL,")));
 BA.debugLineNum = 404;BA.debugLine="sbCrearTabla.Append(\"TotalImp REAL,\")";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TotalImp REAL,")));
 BA.debugLineNum = 405;BA.debugLine="sbCrearTabla.Append(\"Personalizado TEXT COLLATE N";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Personalizado TEXT COLLATE NOCASE default 'NO',")));
 BA.debugLineNum = 409;BA.debugLine="sbCrearTabla.Append(\"TipoDocumento TEXT COLLATE N";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TipoDocumento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 410;BA.debugLine="sbCrearTabla.Append(\"Prioridad Integer default 0,";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Prioridad Integer default 0,")));
 BA.debugLineNum = 411;BA.debugLine="sbCrearTabla.Append(\"NombrePrioridad TEXT COLLATE";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombrePrioridad TEXT COLLATE NOCASE DEFAULT 'Sin Prioridad',")));
 BA.debugLineNum = 412;BA.debugLine="sbCrearTabla.Append(\"Fase TEXT COLLATE NOCASE def";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fase TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 413;BA.debugLine="sbCrearTabla.Append(\"Gestionado INTEGER default 0";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Gestionado INTEGER default 0,")));
 BA.debugLineNum = 414;BA.debugLine="sbCrearTabla.Append(\"FechaFase INTEGER default 0,";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaFase INTEGER default 0,")));
 BA.debugLineNum = 415;BA.debugLine="sbCrearTabla.Append(\"ResponsableFase TEXT COLLATE";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ResponsableFase TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 416;BA.debugLine="sbCrearTabla.Append(\"InfoAdicionalFase TEXT COLLA";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("InfoAdicionalFase TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 417;BA.debugLine="sbCrearTabla.Append(\"Observaciones TEXT COLLATE N";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Observaciones TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 418;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreResponsableCuenta TEXT COLLATE NOCASE default '')")));
 BA.debugLineNum = 419;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 436;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("FaseActualDocumentosBacthUUID (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1059);
if (RapidSub.canDelegate("faseactualdocumentosbacthuuid")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","faseactualdocumentosbacthuuid", __ref);}
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
public ResumableSub_FaseActualDocumentosBacthUUID(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FaseActualDocumentosBacthUUID (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1059);
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
 BA.debugLineNum = 1060;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(8);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1063;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(64);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1064;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1067;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(1024);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("FaseActualDocumentosBacthUUID")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_uuidsesion" /*RemoteObject*/ ))})),(Object)(__ref));
 BA.debugLineNum = 1069;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "faseactualdocumentosbacthuuid"), null);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1071;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 1072;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 1073;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query FaseActualDocumentosBacthUUID")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1074;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "faseactualdocumentosbacthuuid"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
 BA.debugLineNum = 1075;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1076;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1079;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 1080;BA.debugLine="Accion=\"SinFaseActualDocumentos\"";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString("SinFaseActualDocumentos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1081;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1083;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1084;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1087;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1073741824);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1088;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 1089;BA.debugLine="For Each m As Map In lstReg";
Debug.ShouldStop(1);
if (true) break;

case 11:
//for
this.state = 14;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = _lstreg;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index21 < groupLen21) {
this.state = 13;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group21.runMethod(false,"Get",index21));Debug.locals.put("m", _m);}
if (true) break;

case 24:
//C
this.state = 23;
index21++;
Debug.locals.put("m", _m);
if (true) break;

case 13:
//C
this.state = 24;
 BA.debugLineNum = 1092;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblDocumentosS";
Debug.ShouldStop(8);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblDocumentosSinGestionar set Fase=?, Gestionado=?, FechaFase=?, ResponsableFase=?, InfoAdicionalFase=?, Observaciones=? where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fase")))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Gestionado")))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaHoraMov")))),(parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableFase"))))))),(parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("InfoAdicionalFase"))))))),(parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Obs"))))))),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))})))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 1095;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
Debug.ShouldStop(64);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1096;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "faseactualdocumentosbacthuuid"), _senderfilter);
this.state = 25;
return;
case 25:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1097;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","855902246",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1098;BA.debugLine="If Success=False Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 1099;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1100;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 1104;BA.debugLine="Return mRes";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1105;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,310);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 310;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="EventData.Consume";
Debug.ShouldStop(4194304);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("GenerarUUIDv4 (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,490);
if (RapidSub.canDelegate("generaruuidv4")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","generaruuidv4", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _stp = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _c = RemoteObject.createImmutable(0);
 BA.debugLineNum = 490;BA.debugLine="Sub GenerarUUIDv4 As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 491;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1024);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 492;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 493;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
Debug.ShouldStop(4096);
{
final RemoteObject group3 = RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable((8)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((12))});
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = BA.numberCast(int.class, group3.getArrayElement(false,RemoteObject.createImmutable(index3)));Debug.locals.put("stp", _stp);
Debug.locals.put("stp", _stp);
 BA.debugLineNum = 494;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("-")));};
 BA.debugLineNum = 495;BA.debugLine="For n = 1 To stp";
Debug.ShouldStop(16384);
{
final int step5 = 1;
final int limit5 = _stp.<Integer>get().intValue();
_n = 1 ;
for (;(step5 > 0 && _n <= limit5) || (step5 < 0 && _n >= limit5) ;_n = ((int)(0 + _n + step5))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 496;BA.debugLine="Dim c As Int = Rnd(0, 16)";
Debug.ShouldStop(32768);
_c = ccontroldocumentosnogestionados.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 497;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",_c,BA.numberCast(double.class, 10))) { 
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(48)}, "+",1, 1);Debug.locals.put("c", _c);}
else {
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(55)}, "+",1, 1);Debug.locals.put("c", _c);};
 BA.debugLineNum = 498;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 19))) { 
_c = ccontroldocumentosnogestionados.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("8"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 499;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 14))) { 
_c = ccontroldocumentosnogestionados.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("4"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 500;BA.debugLine="sb.Append(Chr(c))";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(ccontroldocumentosnogestionados.__c.runMethod(true,"Chr",(Object)(_c)))));
 }
}Debug.locals.put("n", _n);
;
 }
}Debug.locals.put("stp", _stp);
;
 BA.debugLineNum = 503;BA.debugLine="Return sb.ToString.ToLowerCase";
Debug.ShouldStop(4194304);
if (true) return _sb.runMethod(true,"ToString").runMethod(true,"toLowerCase");
 BA.debugLineNum = 504;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 46;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
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
public static RemoteObject  _insertarlineasbatchdocumentos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InsertarLineasBatchDocumentos (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,969);
if (RapidSub.canDelegate("insertarlineasbatchdocumentos")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","insertarlineasbatchdocumentos", __ref);}
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
public ResumableSub_InsertarLineasBatchDocumentos(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _lstcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InsertarLineasBatchDocumentos (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,969);
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
 BA.debugLineNum = 970;BA.debugLine="Dim lstCommands As List";
Debug.ShouldStop(512);
_lstcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCommands", _lstcommands);
 BA.debugLineNum = 971;BA.debugLine="lstCommands.Initialize";
Debug.ShouldStop(1024);
_lstcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 972;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select distin";
Debug.ShouldStop(2048);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select distinct Documento from tblDocumentosSinGestionar")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 973;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 974;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"In";
Debug.ShouldStop(8192);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InsertarLineaFaseActualDocumentoBatch")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(__ref.getField(true,"_timestampbatchfasedocs" /*RemoteObject*/ )),(__ref.getField(true,"_uuidsesion" /*RemoteObject*/ )),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"Dispositivo" /*RemoteObject*/ )),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Documento"))))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 976;BA.debugLine="lstCommands.Add(cmd)";
Debug.ShouldStop(32768);
_lstcommands.runVoidMethod ("Add",(Object)((_cmd)));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 978;BA.debugLine="rs.Close";
Debug.ShouldStop(131072);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 979;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(262144);
parent._jrdcquery.runVoidMethod ("_ejecutarbatch" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcommands),(Object)(__ref));
 BA.debugLineNum = 980;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","ejecutarbatch_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "insertarlineasbatchdocumentos"), null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 982;BA.debugLine="If result=False Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 983;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmousecursordefaulthabilitartableclv" /*RemoteObject*/ );
 BA.debugLineNum = 984;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query InsertarLineaFaseActualDocumentoBatch")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 985;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "insertarlineasbatchdocumentos"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 BA.debugLineNum = 986;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 988;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 990;BA.debugLine="End Sub";
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
public static RemoteObject  _jamtableclv1_accionsalirjamtableclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_AccionSalirJamTableCLV (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("jamtableclv1_accionsalirjamtableclv")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","jamtableclv1_accionsalirjamtableclv", __ref);}
 BA.debugLineNum = 314;BA.debugLine="Sub JamTableCLV1_AccionSalirJamTableCLV";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="SalirModulo";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("JamTableCLV1_ItemClick (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,653);
if (RapidSub.canDelegate("jamtableclv1_itemclick")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","jamtableclv1_itemclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 653;BA.debugLine="Sub JamTableCLV1_ItemClick(Index As Int, Value As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 654;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(8192);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 655;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
Debug.ShouldStop(16384);
ccontroldocumentosnogestionados.__c.runVoidMethod ("LogImpl","855115778",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 656;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(32768);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 657;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(65536);
ccontroldocumentosnogestionados.__c.runVoidMethod ("LogImpl","855115780",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 659;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("JamTableCLV1_ItemLongClick (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,662);
if (RapidSub.canDelegate("jamtableclv1_itemlongclick")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","jamtableclv1_itemlongclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 662;BA.debugLine="Sub JamTableCLV1_ItemLongClick(Index As Int, Value";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 663;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(4194304);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 664;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
Debug.ShouldStop(8388608);
ccontroldocumentosnogestionados.__c.runVoidMethod ("LogImpl","855181314",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado botón secundario ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 665;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(16777216);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 666;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(33554432);
ccontroldocumentosnogestionados.__c.runVoidMethod ("LogImpl","855181316",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
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
public static RemoteObject  _jamtableclv1_loadlayoutpanelitem(RemoteObject __ref,RemoteObject _datositemindexclv) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_LoadLayoutPanelItem (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,578);
if (RapidSub.canDelegate("jamtableclv1_loadlayoutpanelitem")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","jamtableclv1_loadlayoutpanelitem", __ref, _datositemindexclv);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _numalmfisdoc = RemoteObject.createImmutable(0);
RemoteObject _txtfaseb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _timeformatant = RemoteObject.createImmutable("");
RemoteObject _txtfechafaseb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _txtinfoadfaseb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _txtobservacionesb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _txtresponsablefaseb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _totalimp = RemoteObject.createImmutable(0);
RemoteObject _totalqty = RemoteObject.createImmutable(0);
RemoteObject _txtpersonalizadob = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("DatosItemIndexCLV", _datositemindexclv);
 BA.debugLineNum = 578;BA.debugLine="Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemInde";
Debug.ShouldStop(2);
 BA.debugLineNum = 579;BA.debugLine="Dim mData As Map = DatosItemIndexCLV.Value";
Debug.ShouldStop(4);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _datositemindexclv.getField(false,"Value" /*RemoteObject*/ ));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 580;BA.debugLine="Dim pnl As B4XView=DatosItemIndexCLV.Panel";
Debug.ShouldStop(8);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = _datositemindexclv.getField(false,"Panel" /*RemoteObject*/ );Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 581;BA.debugLine="pnl.LoadLayout(\"scrItemControlDocumentosNoGestion";
Debug.ShouldStop(16);
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrItemControlDocumentosNoGestionados")),__ref.getField(false, "ba"));
 BA.debugLineNum = 583;BA.debugLine="txtAlmacenDocumento.Text=mData.Get(\"AlmacenDocume";
Debug.ShouldStop(64);
__ref.getField(false,"_txtalmacendocumento" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AlmacenDocumento"))))));
 BA.debugLineNum = 584;BA.debugLine="txtAlmacenFisico.Text=mData.Get(\"AlmacenFisico\")";
Debug.ShouldStop(128);
__ref.getField(false,"_txtalmacenfisico" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AlmacenFisico"))))));
 BA.debugLineNum = 585;BA.debugLine="Dim NumAlmFisDoc As Int=mData.get(\"NumeroAlmacene";
Debug.ShouldStop(256);
_numalmfisdoc = BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumeroAlmacenesFisicos")))));Debug.locals.put("NumAlmFisDoc", _numalmfisdoc);Debug.locals.put("NumAlmFisDoc", _numalmfisdoc);
 BA.debugLineNum = 586;BA.debugLine="txtNumeroAlmacenesFisicos.Text=NumAlmFisDoc";
Debug.ShouldStop(512);
__ref.getField(false,"_txtnumeroalmacenesfisicos" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_numalmfisdoc));
 BA.debugLineNum = 587;BA.debugLine="If NumAlmFisDoc>1 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_numalmfisdoc,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 588;BA.debugLine="txtNumeroAlmacenesFisicos.Textcolor=xui.Color_Wh";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtnumeroalmacenesfisicos" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 589;BA.debugLine="txtNumeroAlmacenesFisicos.SetColorAndBorder(0xFF";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtnumeroalmacenesfisicos" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(BA.numberCast(int.class, ((int)0xffff2226))),(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(int.class, ((int)0xff696969))),(Object)(BA.numberCast(double.class, 3)));
 }else {
 BA.debugLineNum = 591;BA.debugLine="txtNumeroAlmacenesFisicos.TextColor=xui.Color_Bl";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtnumeroalmacenesfisicos" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 };
 BA.debugLineNum = 593;BA.debugLine="txtCliente.Text=mData.Get(\"Cliente\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtcliente" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cliente"))))));
 BA.debugLineNum = 596;BA.debugLine="txtDiasAcum.Text=mData.Get(\"DiasAcumulados\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtdiasacum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DiasAcumulados"))))));
 BA.debugLineNum = 598;BA.debugLine="txtDocumento.Text=mData.Get(\"Documento\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtdocumento" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))));
 BA.debugLineNum = 599;BA.debugLine="txtFase.Text=mData.Getdefault(\"Fase\",\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtfase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Fase"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 600;BA.debugLine="Dim txtfaseB As B4XView=txtFase";
Debug.ShouldStop(8388608);
_txtfaseb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtfaseb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtfase" /*RemoteObject*/ ).getObject());Debug.locals.put("txtfaseB", _txtfaseb);Debug.locals.put("txtfaseB", _txtfaseb);
 BA.debugLineNum = 601;BA.debugLine="If txtFase.Text=\"NO INICIADO\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtfase" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("NO INICIADO"))) { 
 BA.debugLineNum = 602;BA.debugLine="txtfaseB.Textcolor=xui.Color_Black";
Debug.ShouldStop(33554432);
_txtfaseb.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 603;BA.debugLine="txtfaseB.SetColorAndBorder(0xFFFFA500,1,0xFF6969";
Debug.ShouldStop(67108864);
_txtfaseb.runVoidMethod ("SetColorAndBorder",(Object)(BA.numberCast(int.class, ((int)0xffffa500))),(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(int.class, ((int)0xff696969))),(Object)(BA.numberCast(double.class, 3)));
 }else {
 BA.debugLineNum = 605;BA.debugLine="txtfaseB.TextColor=0xFFB22222";
Debug.ShouldStop(268435456);
_txtfaseb.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffb22222)));
 };
 BA.debugLineNum = 610;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(2);
_dateformatant = ccontroldocumentosnogestionados.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 611;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(4);
ccontroldocumentosnogestionados.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 612;BA.debugLine="Dim TimeFormatAnt As String=DateTime.timeFormat";
Debug.ShouldStop(8);
_timeformatant = ccontroldocumentosnogestionados.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("TimeFormatAnt", _timeformatant);Debug.locals.put("TimeFormatAnt", _timeformatant);
 BA.debugLineNum = 613;BA.debugLine="DateTime.TimeFormat	=\"HH:mm\"";
Debug.ShouldStop(16);
ccontroldocumentosnogestionados.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 614;BA.debugLine="txtFechaDocumento.Text=DateTime.Date(mData.Get(\"F";
Debug.ShouldStop(32);
__ref.getField(false,"_txtfechadocumento" /*RemoteObject*/ ).runMethod(true,"setText",ccontroldocumentosnogestionados.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaDocumento"))))))));
 BA.debugLineNum = 615;BA.debugLine="If mData.Getdefault(\"FechaFase\",0)>0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FechaFase"))),(Object)(RemoteObject.createImmutable((0))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 616;BA.debugLine="txtFechaFase.Text=DateTime.date(mData.Getdefault";
Debug.ShouldStop(128);
__ref.getField(false,"_txtfechafase" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(ccontroldocumentosnogestionados.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FechaFase"))),(Object)(RemoteObject.createImmutable((0))))))),RemoteObject.createImmutable(" "),ccontroldocumentosnogestionados.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("FechaFase"))),(Object)(RemoteObject.createImmutable((0)))))))));
 };
 BA.debugLineNum = 618;BA.debugLine="Dim txtFechaFaseB As B4XView=txtFechaFase";
Debug.ShouldStop(512);
_txtfechafaseb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtfechafaseb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtfechafase" /*RemoteObject*/ ).getObject());Debug.locals.put("txtFechaFaseB", _txtfechafaseb);Debug.locals.put("txtFechaFaseB", _txtfechafaseb);
 BA.debugLineNum = 619;BA.debugLine="txtFechaFaseB.TextColor=0xFFB22222";
Debug.ShouldStop(1024);
_txtfechafaseb.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffb22222)));
 BA.debugLineNum = 620;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(2048);
ccontroldocumentosnogestionados.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 621;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
Debug.ShouldStop(4096);
ccontroldocumentosnogestionados.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_timeformatant);
 BA.debugLineNum = 623;BA.debugLine="txtInfoAdicionalFase.Text=mData.Getdefault(\"InfoA";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtinfoadicionalfase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("InfoAdicionalFase"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 624;BA.debugLine="Dim txtInfoAdfaseB As B4XView=txtInfoAdicionalFas";
Debug.ShouldStop(32768);
_txtinfoadfaseb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtinfoadfaseb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtinfoadicionalfase" /*RemoteObject*/ ).getObject());Debug.locals.put("txtInfoAdfaseB", _txtinfoadfaseb);Debug.locals.put("txtInfoAdfaseB", _txtinfoadfaseb);
 BA.debugLineNum = 625;BA.debugLine="txtInfoAdfaseB.TextColor=0xFFB22222";
Debug.ShouldStop(65536);
_txtinfoadfaseb.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffb22222)));
 BA.debugLineNum = 626;BA.debugLine="txtNombreCliente.Text=mData.Get(\"NombreCliente\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtnombrecliente" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreCliente"))))));
 BA.debugLineNum = 627;BA.debugLine="txtObservaciones.Text=mData.Getdefault(\"Observaci";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtobservaciones" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Observaciones"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 628;BA.debugLine="Dim txtObservacionesB As B4XView=txtObservaciones";
Debug.ShouldStop(524288);
_txtobservacionesb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtobservacionesb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtobservaciones" /*RemoteObject*/ ).getObject());Debug.locals.put("txtObservacionesB", _txtobservacionesb);Debug.locals.put("txtObservacionesB", _txtobservacionesb);
 BA.debugLineNum = 629;BA.debugLine="txtObservacionesB.TextColor=0xFFC71585";
Debug.ShouldStop(1048576);
_txtobservacionesb.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffc71585)));
 BA.debugLineNum = 630;BA.debugLine="txtPersonalizado.Text=mData.Get(\"Personalizado\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtpersonalizado" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Personalizado"))))));
 BA.debugLineNum = 631;BA.debugLine="txtPrioridad.Text=mData.Getdefault(\"NombrePriorid";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtprioridad" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("NombrePrioridad"))),(Object)((RemoteObject.createImmutable("Sin Prioridad"))))));
 BA.debugLineNum = 632;BA.debugLine="ActualizarColortFPrioridad(txtPrioridad,txtPriori";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_actualizarcolortfprioridad" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtprioridad" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_txtprioridad" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 633;BA.debugLine="txtResponsableFase.Text=mData.Getdefault(\"Respons";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtresponsablefase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ResponsableFase"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 634;BA.debugLine="Dim txtResponsableFaseB As B4XView=txtResponsable";
Debug.ShouldStop(33554432);
_txtresponsablefaseb = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtresponsablefaseb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtresponsablefase" /*RemoteObject*/ ).getObject());Debug.locals.put("txtResponsableFaseB", _txtresponsablefaseb);Debug.locals.put("txtResponsableFaseB", _txtresponsablefaseb);
 BA.debugLineNum = 635;BA.debugLine="txtResponsableFaseB.TextColor=0xFFB22222";
Debug.ShouldStop(67108864);
_txtresponsablefaseb.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffb22222)));
 BA.debugLineNum = 636;BA.debugLine="txtTipoDocumento.Text=mData.Get(\"TipoDocumento\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txttipodocumento" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoDocumento"))))));
 BA.debugLineNum = 637;BA.debugLine="Dim TotalImp As Double=mData.Get(\"TotalImp\")";
Debug.ShouldStop(268435456);
_totalimp = BA.numberCast(double.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TotalImp")))));Debug.locals.put("TotalImp", _totalimp);Debug.locals.put("TotalImp", _totalimp);
 BA.debugLineNum = 638;BA.debugLine="txtTotalImp.Text=Utilidades.FormatoNumerico2(Tota";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txttotalimp" /*RemoteObject*/ ).runMethod(true,"setText",ccontroldocumentosnogestionados._utilidades.runMethod(true,"_formatonumerico2" /*RemoteObject*/ ,(Object)(_totalimp),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(ccontroldocumentosnogestionados.__c.getField(true,"True"))));
 BA.debugLineNum = 639;BA.debugLine="Dim TotalQty As Double=mData.Get(\"TotalQty\")";
Debug.ShouldStop(1073741824);
_totalqty = BA.numberCast(double.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TotalQty")))));Debug.locals.put("TotalQty", _totalqty);Debug.locals.put("TotalQty", _totalqty);
 BA.debugLineNum = 640;BA.debugLine="txtTotalQty.Text=Utilidades.FormatoNumerico2(Tota";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txttotalqty" /*RemoteObject*/ ).runMethod(true,"setText",ccontroldocumentosnogestionados._utilidades.runMethod(true,"_formatonumerico2" /*RemoteObject*/ ,(Object)(_totalqty),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(ccontroldocumentosnogestionados.__c.getField(true,"True"))));
 BA.debugLineNum = 641;BA.debugLine="txtPersonalizado.Text=mData.Get(\"Personalizado\")";
Debug.ShouldStop(1);
__ref.getField(false,"_txtpersonalizado" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Personalizado"))))));
 BA.debugLineNum = 642;BA.debugLine="Dim txtPersonalizadoB As B4XView=txtPersonalizado";
Debug.ShouldStop(2);
_txtpersonalizadob = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtpersonalizadob = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtpersonalizado" /*RemoteObject*/ ).getObject());Debug.locals.put("txtPersonalizadoB", _txtpersonalizadob);Debug.locals.put("txtPersonalizadoB", _txtpersonalizadob);
 BA.debugLineNum = 643;BA.debugLine="If txtPersonalizadoB.Text=\"SI\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_txtpersonalizadob.runMethod(true,"getText"),BA.ObjectToString("SI"))) { 
 BA.debugLineNum = 644;BA.debugLine="txtPersonalizadoB.Textcolor=xui.Color_Black";
Debug.ShouldStop(8);
_txtpersonalizadob.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 645;BA.debugLine="txtPersonalizadoB.SetColorAndBorder(0xFFFFA500,1";
Debug.ShouldStop(16);
_txtpersonalizadob.runVoidMethod ("SetColorAndBorder",(Object)(BA.numberCast(int.class, ((int)0xffffa500))),(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(int.class, ((int)0xff696969))),(Object)(BA.numberCast(double.class, 3)));
 }else {
 BA.debugLineNum = 647;BA.debugLine="txtPersonalizadoB.TextColor=xui.Color_Black";
Debug.ShouldStop(64);
_txtpersonalizadob.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 };
 BA.debugLineNum = 649;BA.debugLine="txtNombreResponsableCuenta.Text=mData.Get(\"Nombre";
Debug.ShouldStop(256);
__ref.getField(false,"_txtnombreresponsablecuenta" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreResponsableCuenta"))))));
 BA.debugLineNum = 651;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("JamTableCLV1_MenuBarMenuItem_Action (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("jamtableclv1_menubarmenuitem_action")) { __ref.runUserSub(false, "ccontroldocumentosnogestionados","jamtableclv1_menubarmenuitem_action", __ref, _tagmenuitem); return;}
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
public ResumableSub_JamTableCLV1_MenuBarMenuItem_Action(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _tagmenuitem;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLV1_MenuBarMenuItem_Action (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,328);
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
 BA.debugLineNum = 329;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(256);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("VerFechaInicioControl"),BA.ObjectToString("ResetearPrioridades"))) {
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
}
if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 331;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_actualizardatos" /*void*/ );
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 333;BA.debugLine="Wait For(CargarFechaInicioControl) complete (sR";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "jamtableclv1_menubarmenuitem_action"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_cargarfechainiciocontrol" /*RemoteObject*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 334;BA.debugLine="Dim Accion As String=sResp";
Debug.ShouldStop(8192);
_accion = _sresp;Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 335;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 6:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 336;BA.debugLine="SalirModulo";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 337;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 339;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha de";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La fecha de inicio del control es "),__ref.getField(true,"_sfechainiciocontrol" /*RemoteObject*/ ),RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Fecha Inicio Control")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 340;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "jamtableclv1_menubarmenuitem_action"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 343;BA.debugLine="ResetearPrioridades";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_resetearprioridades" /*void*/ );
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 352;BA.debugLine="End Sub";
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
public static void  _resetearprioridades(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetearPrioridades (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1282);
if (RapidSub.canDelegate("resetearprioridades")) { __ref.runUserSub(false, "ccontroldocumentosnogestionados","resetearprioridades", __ref); return;}
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
public ResumableSub_ResetearPrioridades(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _numdocsconprioridad = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _lstcomandos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ResetearPrioridades (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,1282);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1283;BA.debugLine="Dim NumDocsConPrioridad As Int=Utilidades.FixNull";
Debug.ShouldStop(4);
_numdocsconprioridad = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblDocumentosSinGestionar where Gestionado=? and Prioridad<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(0),RemoteObject.createImmutable("")}))))))));Debug.locals.put("NumDocsConPrioridad", _numdocsconprioridad);Debug.locals.put("NumDocsConPrioridad", _numdocsconprioridad);
 BA.debugLineNum = 1284;BA.debugLine="If NumDocsConPrioridad=0 Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 1285;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay ningún";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay ningún documento con prioridad establecida.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1286;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "resetearprioridades"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
 BA.debugLineNum = 1287;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1290;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear t";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Resetear todas las prioridades de documentos establecidas?"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Esta acción no es reversible."))),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1291;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "resetearprioridades"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 5;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1292;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
if (true) return ;
if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1294;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(8192);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 1295;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(16384);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 1297;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"R";
Debug.ShouldStop(65536);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ResetearPrioridadesDocumentosNoGestionados")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1298;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(131072);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 BA.debugLineNum = 1299;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "resetearprioridades"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 19;
return;
case 19:
//C
this.state = 11;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1300;BA.debugLine="If Success=False Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 1301;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible resetear las prioridades de los documentos.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1302;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "resetearprioridades"), _msa);
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
 BA.debugLineNum = 1304;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se han resete";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Se han reseteado todas las prioridades de los documentos.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1305;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "resetearprioridades"), _msa);
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
 BA.debugLineNum = 1307;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 1308;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "ccontroldocumentosnogestionados","salirmodulo", __ref);}
 BA.debugLineNum = 323;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(4);
 BA.debugLineNum = 324;BA.debugLine="frm.Close";
Debug.ShouldStop(8);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 325;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(16);
ccontroldocumentosnogestionados._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Show (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "ccontroldocumentosnogestionados","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.ccontroldocumentosnogestionados parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _joclvdatosscrollpane = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _accion = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (ccontroldocumentosnogestionados) ","ccontroldocumentosnogestionados",25,__ref.getField(false, "ba"),__ref,52);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 54;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 55;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(4194304);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 56;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(8388608);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 57;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(16777216);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 58;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(33554432);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 59;BA.debugLine="frm.RootPane.LoadLayout(\"scrControlDocumentosNoGe";
Debug.ShouldStop(67108864);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrControlDocumentosNoGestionados")));
 BA.debugLineNum = 60;BA.debugLine="Sleep(0)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "show"),BA.numberCast(int.class, 0));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
 BA.debugLineNum = 62;BA.debugLine="Dim JOClvDatosScrollpane As JavaObject=JamTableCL";
Debug.ShouldStop(536870912);
_joclvdatosscrollpane = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joclvdatosscrollpane = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).getObject());Debug.locals.put("JOClvDatosScrollpane", _joclvdatosscrollpane);Debug.locals.put("JOClvDatosScrollpane", _joclvdatosscrollpane);
 BA.debugLineNum = 63;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setHbarPolicy\",Ar";
Debug.ShouldStop(1073741824);
_joclvdatosscrollpane.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setHbarPolicy")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ALWAYS"))})));
 BA.debugLineNum = 64;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setVbarPolicy\",Ar";
Debug.ShouldStop(-2147483648);
_joclvdatosscrollpane.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVbarPolicy")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ALWAYS"))})));
 BA.debugLineNum = 66;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Control Docum";
Debug.ShouldStop(2);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Control Documentos No Gestionados")));
 BA.debugLineNum = 68;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(8);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 70;BA.debugLine="PrimerAvisoInfoEstablecerPrioridad=True";
Debug.ShouldStop(32);
__ref.setField ("_primeravisoinfoestablecerprioridad" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 72;BA.debugLine="frm.Show";
Debug.ShouldStop(128);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 74;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 76;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 77;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="wait for(BorrarDatosFaseActualDocumentosBatchAnte";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "show"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_borrardatosfaseactualdocumentosbatchanterioresmaquinausuario" /*RemoteObject*/ ));
this.state = 20;
return;
case 20:
//C
this.state = 7;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 80;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 81;BA.debugLine="SalirModulo";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 85;BA.debugLine="UUIDSesion=GenerarUUIDv4";
Debug.ShouldStop(1048576);
__ref.setField ("_uuidsesion" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_generaruuidv4" /*RemoteObject*/ ));
 BA.debugLineNum = 86;BA.debugLine="TimestampBatchFaseDocs=DateTime.Now";
Debug.ShouldStop(2097152);
__ref.setField ("_timestampbatchfasedocs" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 96;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.ConfigurarT";
Debug.ShouldStop(-2147483648);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_configurartableclv" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ListaControlDocumentosNoGestionados2.json")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 97;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "show"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 11;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 98;BA.debugLine="Log(mRes)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","854394926",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 99;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 100;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 101;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "show"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 14;
;
 BA.debugLineNum = 102;BA.debugLine="frm.Close";
Debug.ShouldStop(32);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 103;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 106;BA.debugLine="JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarL";
Debug.ShouldStop(512);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 107;BA.debugLine="JamTableCLV1.AddMenuItemFontAwesomeToMenuInMenuBa";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ver Fecha Inicio Control")),(Object)(BA.ObjectToString("VerFechaInicioControl")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf274)))))),(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 108;BA.debugLine="JamTableCLV1.AddMenuItemFontMaterialIconsToMenuIn";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_addmenuitemfontmaterialiconstomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Resetear Prioridades")),(Object)(BA.ObjectToString("ResetearPrioridades")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe16d)))))),(Object)(__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 111;BA.debugLine="JamTableCLV1.AlturaItems=120dip";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setalturaitems" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120))));
 BA.debugLineNum = 113;BA.debugLine="JamTableCLV1.ModoSeleccionItems=JamTableCLV1.Modo";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmodoseleccionitems" /*RemoteObject*/ ,__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).getField(true,"_modoseleccionindividualtemp" /*RemoteObject*/ ));
 BA.debugLineNum = 115;BA.debugLine="JamTableCLV1.AlturaSeparadorPaneles=4dip";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableclv1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setalturaseparadorpaneles" /*RemoteObject*/ ,BA.numberCast(float.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))));
 BA.debugLineNum = 117;BA.debugLine="Wait For(CargarFechaInicioControl) complete (sRes";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ccontroldocumentosnogestionados", "show"), __ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_cargarfechainiciocontrol" /*RemoteObject*/ ));
this.state = 23;
return;
case 23:
//C
this.state = 15;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 118;BA.debugLine="Dim Accion As String=sResp";
Debug.ShouldStop(2097152);
_accion = _sresp;Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 119;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(4194304);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 120;BA.debugLine="SalirModulo";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 121;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 123;BA.debugLine="Log(\"FechaInicioControl: \" & FechaInicioControl &";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","854394951",RemoteObject.concat(RemoteObject.createImmutable("FechaInicioControl: "),__ref.getField(true,"_fechainiciocontrol" /*RemoteObject*/ ),RemoteObject.createImmutable("  , sFechaInicioControl: "),__ref.getField(true,"_sfechainiciocontrol" /*RemoteObject*/ )),0);
 BA.debugLineNum = 125;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.docU.ccontroldocumentosnogestionados.class, "_actualizardatos" /*void*/ );
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
}