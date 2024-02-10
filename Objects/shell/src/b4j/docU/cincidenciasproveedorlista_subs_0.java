package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cincidenciasproveedorlista_subs_0 {


public static RemoteObject  _abrirfichaincidenciaproveedor(RemoteObject __ref,RemoteObject _idincprovsel,RemoteObject _incprov) throws Exception{
try {
		Debug.PushSubsStack("AbrirFichaIncidenciaProveedor (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("abrirfichaincidenciaproveedor")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","abrirfichaincidenciaproveedor", __ref, _idincprovsel, _incprov);}
RemoteObject _cfichaincprov = RemoteObject.declareNull("b4j.docU.cincidenciaproveedorficha");
Debug.locals.put("IDIncProvSel", _idincprovsel);
Debug.locals.put("IncProv", _incprov);
 BA.debugLineNum = 301;BA.debugLine="Sub AbrirFichaIncidenciaProveedor(IDIncProvSel As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 302;BA.debugLine="Dim cFichaIncProv As cIncidenciaProveedorFicha";
Debug.ShouldStop(8192);
_cfichaincprov = RemoteObject.createNew ("b4j.docU.cincidenciaproveedorficha");Debug.locals.put("cFichaIncProv", _cfichaincprov);
 BA.debugLineNum = 303;BA.debugLine="cFichaIncProv.Initialize(IDIncProvSel, IncProv)";
Debug.ShouldStop(16384);
_cfichaincprov.runClassMethod (b4j.docU.cincidenciaproveedorficha.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_idincprovsel),(Object)(_incprov));
 BA.debugLineNum = 304;BA.debugLine="cFichaIncProv.DepartamentoEmisor=DepartamentoEmis";
Debug.ShouldStop(32768);
_cfichaincprov.setField ("_departamentoemisor" /*RemoteObject*/ ,__ref.getField(true,"_departamentoemisor" /*RemoteObject*/ ));
 BA.debugLineNum = 305;BA.debugLine="cFichaIncProv.Show";
Debug.ShouldStop(65536);
_cfichaincprov.runClassMethod (b4j.docU.cincidenciaproveedorficha.class, "_show" /*void*/ );
 BA.debugLineNum = 306;BA.debugLine="frm.Close";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("actualizardatos")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","actualizardatos", __ref);}
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
public ResumableSub_ActualizarDatos(b4j.docU.cincidenciasproveedorlista parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cincidenciasproveedorlista parent;
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
		Debug.PushSubsStack("ActualizarDatos (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,114);
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
 BA.debugLineNum = 116;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando datos lista incidencias proveedor...")));
 BA.debugLineNum = 117;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 118;BA.debugLine="Wait For(ActualizarDatosLista) complete (mRes As";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "actualizardatos"), __ref.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_actualizardatoslista" /*RemoteObject*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 119;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 120;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 121;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="SalirModulo";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 123;BA.debugLine="Return Null";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 127;BA.debugLine="mSQL.ExecNonQuery2(\"Update tblIncidenciasProveedo";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("Update tblIncidenciasProveedorListaCompras set Estado='ABIERTA' where EstadoIncidencia=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((0))})))));
 BA.debugLineNum = 128;BA.debugLine="mSQL.ExecNonQuery2(\"Update tblIncidenciasProveedo";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("Update tblIncidenciasProveedorListaCompras set Estado='CERRADA' where EstadoIncidencia=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((1))})))));
 BA.debugLineNum = 129;BA.debugLine="mSQL.ExecNonQuery2(\"Update tblIncidenciasProveedo";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("Update tblIncidenciasProveedorListaCompras set Estado='ANULADA' where EstadoIncidencia=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((2))})))));
 BA.debugLineNum = 131;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(4);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblIncidenciasProveedorListaCompras")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 132;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(8);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 133;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "actualizardatos"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 134;BA.debugLine="rs.Close";
Debug.ShouldStop(32);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 135;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(64);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 136;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 137;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 138;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 139;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "actualizardatos"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
 BA.debugLineNum = 141;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 142;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "actualizardatos"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 143;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 144;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 145;BA.debugLine="Return Null";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 148;BA.debugLine="ExitApplication";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 150;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(2097152);

case 15:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 151;BA.debugLine="If True<>mResultSetData.Get(\"ListaVacia\") Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 152;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 153;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "actualizardatos"), _msa);
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
 BA.debugLineNum = 155;BA.debugLine="jamTableView1.SetPlaceholderText(\"\")";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 162;BA.debugLine="Return Null";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 163;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizardatoslista(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosLista (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("actualizardatoslista")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","actualizardatoslista", __ref);}
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
public ResumableSub_ActualizarDatosLista(b4j.docU.cincidenciasproveedorlista parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cincidenciasproveedorlista parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _fechainicialconsulta = RemoteObject.createImmutable(0L);
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosLista (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,183);
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
 BA.debugLineNum = 185;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblIncidenciasProv";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblIncidenciasProveedorListaCompras")));
 BA.debugLineNum = 187;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(67108864);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 188;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(134217728);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 189;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 191;BA.debugLine="Dim Comando As String=\"IncidenciasProveedorListaD";
Debug.ShouldStop(1073741824);
_comando = BA.ObjectToString("IncidenciasProveedorListaDesdeFecha");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 192;BA.debugLine="Dim FechaInicialConsulta As Long=DateUtils.SetDat";
Debug.ShouldStop(-2147483648);
_fechainicialconsulta = parent._dateutils.runMethod(true,"_setdate",(Object)(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(2)}, "-",1, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("FechaInicialConsulta", _fechainicialconsulta);Debug.locals.put("FechaInicialConsulta", _fechainicialconsulta);
 BA.debugLineNum = 193;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(1);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_fechainicialconsulta)})),(Object)(__ref));
 BA.debugLineNum = 195;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "actualizardatoslista"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 197;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 198;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 199;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 200;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "actualizardatoslista"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 201;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(256);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 202;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 205;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 206;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 207;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay incid";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay incidencias de proveedor registradas.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 208;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "actualizardatoslista"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 209;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 210;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 212;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(524288);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 215;BA.debugLine="Dim mData As Map=lstReg.Get(0)";
Debug.ShouldStop(4194304);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 216;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 217;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 219;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(67108864);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblIncidenciasProveedorListaCompras")),(Object)(_lstreg));
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
 BA.debugLineNum = 222;BA.debugLine="Return mRes";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 223;BA.debugLine="End Sub";
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
public static RemoteObject  _asjo(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("asJO (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 95;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Return o";
Debug.ShouldStop(-2147483648);
if (true) return _o;
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("btnSalir_Click (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","btnsalir_click", __ref);}
 BA.debugLineNum = 104;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="SalirModulo";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
cincidenciasproveedorlista._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cincidenciasproveedorlista._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cincidenciasproveedorlista._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cincidenciasproveedorlista._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private frm As Form";
cincidenciasproveedorlista._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cincidenciasproveedorlista._frm);
 //BA.debugLineNum = 9;BA.debugLine="Private btnSalir As Button";
cincidenciasproveedorlista._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",cincidenciasproveedorlista._btnsalir);
 //BA.debugLineNum = 10;BA.debugLine="Private jamTableView1 As jamTableView";
cincidenciasproveedorlista._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",cincidenciasproveedorlista._jamtableview1);
 //BA.debugLineNum = 12;BA.debugLine="Dim Dialog As B4XDialog";
cincidenciasproveedorlista._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cincidenciasproveedorlista._dialog);
 //BA.debugLineNum = 13;BA.debugLine="Dim mSQL As SQL";
cincidenciasproveedorlista._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cincidenciasproveedorlista._msql);
 //BA.debugLineNum = 15;BA.debugLine="Public PermisoModuloUsuario As String";
cincidenciasproveedorlista._permisomodulousuario = RemoteObject.createImmutable("");__ref.setField("_permisomodulousuario",cincidenciasproveedorlista._permisomodulousuario);
 //BA.debugLineNum = 16;BA.debugLine="Public DepartamentoEmisor As String";
cincidenciasproveedorlista._departamentoemisor = RemoteObject.createImmutable("");__ref.setField("_departamentoemisor",cincidenciasproveedorlista._departamentoemisor);
 //BA.debugLineNum = 19;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
cincidenciasproveedorlista._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cincidenciasproveedorlista._jamloadingindicator1);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","creaciontablassqlite", __ref);}
RemoteObject _screartabla = RemoteObject.createImmutable("");
 BA.debugLineNum = 167;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(64);
 BA.debugLineNum = 169;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblIncide";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblIncidenciasProveedorListaCompras")));
 BA.debugLineNum = 170;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
Debug.ShouldStop(512);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS [tblIncidenciasProveedorListaCompras] ([IDIncidenciaProveedor] INTEGER\n"),RemoteObject.createImmutable("	, [IncidenciaProveedor] TEXT, [MigracionAccess] INTEGER, [Estado] TEXT default '', [EstadoIncidencia] INTEGER,[DepartamentoCoordinador] TEXT, [NumTareasAbiertas] INTEGER default 0\n"),RemoteObject.createImmutable("	, [TipoOrigenIncidenciaProveedor] TEXT,[IDUsuarioEmisor] INTEGER, [NombreUsuarioEmisor] TEXT, [IDUsuarioCompras] INTEGER, [NombreUsuarioCompras] TEXT\n"),RemoteObject.createImmutable("	, [FechaIncidenciaLong] INTEGER, [Proveedor] TEXT, [NombreProveedor] TEXT, [OrigenIncidencia] TEXT, [IDTipoDocumento] INTEGER, [DocumentoProveedor] TEXT\n"),RemoteObject.createImmutable("	, [FechaDocumentoProveedorLong] INTEGER, [IDTipoDocumentoOrigen] INTEGER, [NombreTipoDocumento] TEXT, [DocumentoOrigen] TEXT, [DescripcionIncidencia] TEXT, [IDTipoIncidencia] INTEGER\n"),RemoteObject.createImmutable("	, [NombreTipoIncidencia] TEXT, [AccionCompras] TEXT, [FechaAccionComprasLong] INTEGER, [IDUsuarioAccionCompras] INTEGER, [NombreUsuarioAccionCompras] TEXT\n"),RemoteObject.createImmutable("	, [FechaCierreLong] INTEGER, [IDUsuarioCierre] INTEGER, [NombreUsuarioCierre] TEXT, [GravedadIncidencia] TEXT, [ResponsabilidadInterna] INTEGER default 0)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 177;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(65536);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("frm_CloseRequest (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 100;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="EventData.Consume";
Debug.ShouldStop(16);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Initialize (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(cincidenciasproveedorlista._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(cincidenciasproveedorlista.__c.getField(true,"True")));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,227);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","jamtableview1_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 227;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="SalirModulo";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("jamTableView1_CellDobleClick (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("jamtableview1_celldobleclick")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","jamtableview1_celldobleclick", __ref, _datosceldaseleccionada);}
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _idincidenciaproveedorsel = RemoteObject.createImmutable(0);
RemoteObject _incidenciaproveedorsel = RemoteObject.createImmutable("");
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 268;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Dim FilaSel As Int=DatosCeldaSeleccionada.Fila";
Debug.ShouldStop(4096);
_filasel = _datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 270;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaSel";
Debug.ShouldStop(8192);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 271;BA.debugLine="Dim IDIncidenciaProveedorSel As Int=jamTableView1";
Debug.ShouldStop(16384);
_idincidenciaproveedorsel = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IDIncidenciaProveedor"))));Debug.locals.put("IDIncidenciaProveedorSel", _idincidenciaproveedorsel);Debug.locals.put("IDIncidenciaProveedorSel", _idincidenciaproveedorsel);
 BA.debugLineNum = 272;BA.debugLine="Dim IncidenciaProveedorSel As String=jamTableView";
Debug.ShouldStop(32768);
_incidenciaproveedorsel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IncidenciaProveedor"))));Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);
 BA.debugLineNum = 274;BA.debugLine="Main.sCamposFiltradosListaIncidenciasProveedor=ja";
Debug.ShouldStop(131072);
cincidenciasproveedorlista._main._scamposfiltradoslistaincidenciasproveedor /*RemoteObject*/  = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_scamposfiltrados" /*RemoteObject*/ );
 BA.debugLineNum = 275;BA.debugLine="Main.lstValoresFiltrosListaIncidenciasProveedor=j";
Debug.ShouldStop(262144);
cincidenciasproveedorlista._main._lstvaloresfiltroslistaincidenciasproveedor /*RemoteObject*/  = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(false,"_lstvaloresfiltros" /*RemoteObject*/ );
 BA.debugLineNum = 277;BA.debugLine="AbrirFichaIncidenciaProveedor(IDIncidenciaProveed";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_abrirfichaincidenciaproveedor" /*RemoteObject*/ ,(Object)(_idincidenciaproveedorsel),(Object)(_incidenciaproveedorsel));
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("jamtableview1_contextmenuitem_action")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","jamtableview1_contextmenuitem_action", __ref, _tagmenuitem);}
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _idincidenciaproveedorsel = RemoteObject.createImmutable(0);
RemoteObject _incidenciaproveedorsel = RemoteObject.createImmutable("");
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 242;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("FichaIncidenciaProveedor"))) {
case 0: {
 BA.debugLineNum = 245;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.ShouldStop(1048576);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 246;BA.debugLine="Dim IDIncidenciaProveedorSel As Int=jamTableVie";
Debug.ShouldStop(2097152);
_idincidenciaproveedorsel = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IDIncidenciaProveedor"))));Debug.locals.put("IDIncidenciaProveedorSel", _idincidenciaproveedorsel);Debug.locals.put("IDIncidenciaProveedorSel", _idincidenciaproveedorsel);
 BA.debugLineNum = 247;BA.debugLine="Dim IncidenciaProveedorSel As String=jamTableVi";
Debug.ShouldStop(4194304);
_incidenciaproveedorsel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("IncidenciaProveedor"))));Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);Debug.locals.put("IncidenciaProveedorSel", _incidenciaproveedorsel);
 BA.debugLineNum = 249;BA.debugLine="AbrirFichaIncidenciaProveedor(IDIncidenciaProve";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_abrirfichaincidenciaproveedor" /*RemoteObject*/ ,(Object)(_idincidenciaproveedorsel),(Object)(_incidenciaproveedorsel));
 break; }
}
;
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableview1_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { __ref.runUserSub(false, "cincidenciasproveedorlista","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem); return;}
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
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.cincidenciasproveedorlista parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cincidenciasproveedorlista parent;
RemoteObject _tagmenuitem;
RemoteObject _robj = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,231);
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
 BA.debugLineNum = 232;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(128);
if (true) break;

case 1:
//select
this.state = 6;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("NuevaIncidenciaProveedorCompras"))) {
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
this.state = 6;
 BA.debugLineNum = 235;BA.debugLine="wait for(ActualizarDatos) complete (rObj As Obj";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "jamtableview1_menubarmenuitem_action"), __ref.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_actualizardatos" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 237;BA.debugLine="AbrirFichaIncidenciaProveedor(0,\"\")";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_abrirfichaincidenciaproveedor" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 239;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cincidenciasproveedorlista","salirmodulo", __ref);}
 BA.debugLineNum = 108;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 110;BA.debugLine="frm.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 111;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(16384);
cincidenciasproveedorlista._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Show (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cincidenciasproveedorlista","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cincidenciasproveedorlista parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cincidenciasproveedorlista parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _robj = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cincidenciasproveedorlista) ","cincidenciasproveedorlista",7,__ref.getField(false, "ba"),__ref,31);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 33;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
Debug.ShouldStop(1);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(2);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 36;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(8);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 37;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(16);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 38;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(32);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 40;BA.debugLine="frm.RootPane.LoadLayout(\"scrIncidenciasProveedorL";
Debug.ShouldStop(128);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrIncidenciasProveedorLista")));
 BA.debugLineNum = 41;BA.debugLine="Sleep(0)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "show"),BA.numberCast(int.class, 0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 43;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Lista Inciden";
Debug.ShouldStop(1024);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Lista Incidencias Proveedor")));
 BA.debugLineNum = 45;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 46;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 51;BA.debugLine="frm.Show";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 53;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 58;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 60;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Nueva Incidencia proveedor")),(Object)(BA.ObjectToString("NuevaIncidenciaProveedorCompras")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf196)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 61;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ficha Incidencia Proveedor")),(Object)(BA.ObjectToString("FichaIncidenciaProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0f6)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 62;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ficha Incidencia Proveedor")),(Object)(BA.ObjectToString("FichaIncidenciaProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0f6)))))));
 BA.debugLineNum = 69;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(16);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaIncidenciasProveedorCompras.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 70;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "show"), _rsub);
this.state = 10;
return;
case 10:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 71;BA.debugLine="Log(mRes)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","829098024",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 72;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 73;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 74;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "show"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 BA.debugLineNum = 75;BA.debugLine="frm.Close";
Debug.ShouldStop(1024);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 76;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 82;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaFecha(Arra";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnafecha" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("FechaIncidenciaLong")),RemoteObject.createImmutable(("FechaDocumentoProveedorLong")),(RemoteObject.createImmutable("FechaCierreLong"))})))));
 BA.debugLineNum = 83;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnatexto1condicioncolorfondocolortexto" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Estado"))})))),(Object)(BA.ObjectToString("ABIERTA")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(BA.numberCast(int.class, ((int)0xff000000))),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 85;BA.debugLine="wait for(ActualizarDatos) complete (rObj As Objec";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cincidenciasproveedorlista", "show"), __ref.runClassMethod (b4j.docU.cincidenciasproveedorlista.class, "_actualizardatos" /*RemoteObject*/ ));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 87;BA.debugLine="If Main.sCamposFiltradosListaIncidenciasProveedor";
Debug.ShouldStop(4194304);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("!",parent._main._scamposfiltradoslistaincidenciasproveedor /*RemoteObject*/ ,BA.ObjectToString("")) && RemoteObject.solveBoolean(">",parent._main._lstvaloresfiltroslistaincidenciasproveedor /*RemoteObject*/ .runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 88;BA.debugLine="jamTableView1.sCamposFiltrados= Utilidades.CopyO";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).setField ("_scamposfiltrados" /*RemoteObject*/ ,BA.ObjectToString(parent._utilidades.runMethod(false,"_copyobject" /*RemoteObject*/ ,(Object)((parent._main._scamposfiltradoslistaincidenciasproveedor /*RemoteObject*/ )))));
 BA.debugLineNum = 89;BA.debugLine="jamTableView1.lstValoresFiltros=Utilidades.CopyO";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(false,"_lstvaloresfiltros" /*RemoteObject*/ ).setObject (parent._utilidades.runMethod(false,"_copyobject" /*RemoteObject*/ ,(Object)((parent._main._lstvaloresfiltroslistaincidenciasproveedor /*RemoteObject*/ .getObject()))));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
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