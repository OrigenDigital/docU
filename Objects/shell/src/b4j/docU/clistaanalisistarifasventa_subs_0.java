package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clistaanalisistarifasventa_subs_0 {


public static RemoteObject  _abrirfichaanalisistarifasventa(RemoteObject __ref,RemoteObject _idantar,RemoteObject _antar,RemoteObject _descantar) throws Exception{
try {
		Debug.PushSubsStack("AbrirFichaAnalisisTarifasVenta (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,552);
if (RapidSub.canDelegate("abrirfichaanalisistarifasventa")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","abrirfichaanalisistarifasventa", __ref, _idantar, _antar, _descantar);}
RemoteObject _cfichaantar = RemoteObject.declareNull("b4j.docU.cfichaanalisistarifasventa");
Debug.locals.put("IDAnTar", _idantar);
Debug.locals.put("AnTar", _antar);
Debug.locals.put("DescAnTar", _descantar);
 BA.debugLineNum = 552;BA.debugLine="Sub AbrirFichaAnalisisTarifasVenta(IDAnTar As Int,";
Debug.ShouldStop(128);
 BA.debugLineNum = 553;BA.debugLine="Dim cFichaAnTar As cFichaAnalisisTarifasVenta";
Debug.ShouldStop(256);
_cfichaantar = RemoteObject.createNew ("b4j.docU.cfichaanalisistarifasventa");Debug.locals.put("cFichaAnTar", _cfichaantar);
 BA.debugLineNum = 554;BA.debugLine="cFichaAnTar.Initialize(IDAnTar, AnTar, DescAnTar)";
Debug.ShouldStop(512);
_cfichaantar.runClassMethod (b4j.docU.cfichaanalisistarifasventa.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_idantar),(Object)(_antar),(Object)(_descantar));
 BA.debugLineNum = 555;BA.debugLine="cFichaAnTar.Show";
Debug.ShouldStop(1024);
_cfichaantar.runClassMethod (b4j.docU.cfichaanalisistarifasventa.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 556;BA.debugLine="frm.Close";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 557;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ActualizarDatos (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("actualizardatos")) { __ref.runUserSub(false, "clistaanalisistarifasventa","actualizardatos", __ref); return;}
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
public ResumableSub_ActualizarDatos(b4j.docU.clistaanalisistarifasventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.clistaanalisistarifasventa parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,150);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 152;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando datos lista análisis tarifas...")));
 BA.debugLineNum = 153;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 154;BA.debugLine="Wait For(ActualizarDatosLista) complete (mRes As";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "actualizardatos"), __ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_actualizardatoslista" /*RemoteObject*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 155;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 156;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 157;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 158;BA.debugLine="SalirModulo";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 159;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 161;BA.debugLine="Dim lstReg As List=mRes.get(\"lstReg\")";
Debug.ShouldStop(1);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 163;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(ls";
Debug.ShouldStop(4);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_lstreg.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 164;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "actualizardatos"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 165;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 166;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 167;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 168;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 169;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "actualizardatos"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
 BA.debugLineNum = 171;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 172;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "actualizardatos"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 173;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 174;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 175;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 178;BA.debugLine="ExitApplication";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 180;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(524288);

case 15:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 181;BA.debugLine="If True<>mResultSetData.Get(\"ListaVacia\") Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 182;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 183;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "actualizardatos"), _msa);
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
 BA.debugLineNum = 185;BA.debugLine="jamTableView1.SetPlaceholderText(\"\")";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 195;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ActualizarDatosLista (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("actualizardatoslista")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","actualizardatoslista", __ref);}
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
public ResumableSub_ActualizarDatosLista(b4j.docU.clistaanalisistarifasventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.clistaanalisistarifasventa parent;
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
		Debug.PushSubsStack("ActualizarDatosLista (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,232);
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
 BA.debugLineNum = 233;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblListaAnalisisTa";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblListaAnalisisTarifasVenta")));
 BA.debugLineNum = 234;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(512);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 235;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(1024);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 236;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 237;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
Debug.ShouldStop(4096);
_slinkjrdc = parent._main._rdclinknav /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 238;BA.debugLine="Dim Comando As String=\"ListaSimpleAnalisisTarifas";
Debug.ShouldStop(8192);
_comando = BA.ObjectToString("ListaSimpleAnalisisTarifasVenta");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 239;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
Debug.ShouldStop(16384);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 241;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "actualizardatoslista"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
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
 BA.debugLineNum = 243;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 244;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 245;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "actualizardatoslista"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 246;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 247;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 250;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 251;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 252;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 253;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 254;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de Análisis Tarifas Venta")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 255;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "actualizardatoslista"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 256;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(-2147483648);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 257;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(1);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 258;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 260;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 261;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 264;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(128);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 265;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 273;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(65536);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblListaAnalisisTarifasVenta")),(Object)(_lstreg));
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
 BA.debugLineNum = 276;BA.debugLine="Return mRes";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 277;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _alternarexcluidoreclamacion(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("AlternarExcluidoReclamacion (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,364);
if (RapidSub.canDelegate("alternarexcluidoreclamacion")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","alternarexcluidoreclamacion", __ref, _datosceldaseleccionada);}
RemoteObject _valoractual = RemoteObject.createImmutable(0);
RemoteObject _nuevovalor = RemoteObject.createImmutable(0);
RemoteObject _mpk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pedidosel = RemoteObject.createImmutable("");
RemoteObject _lineasel = RemoteObject.createImmutable("");
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 364;BA.debugLine="Sub AlternarExcluidoReclamacion(DatosCeldaSeleccio";
Debug.ShouldStop(2048);
 BA.debugLineNum = 365;BA.debugLine="Log(DatosCeldaSeleccionada)";
Debug.ShouldStop(4096);
clistaanalisistarifasventa.__c.runVoidMethod ("LogImpl","892930049",BA.ObjectToString(_datosceldaseleccionada),0);
 BA.debugLineNum = 366;BA.debugLine="Dim ValorActual As Int= DatosCeldaSeleccionada.Va";
Debug.ShouldStop(8192);
_valoractual = BA.numberCast(int.class, _datosceldaseleccionada.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("ValorActual", _valoractual);Debug.locals.put("ValorActual", _valoractual);
 BA.debugLineNum = 367;BA.debugLine="Dim NuevoValor As Int";
Debug.ShouldStop(16384);
_nuevovalor = RemoteObject.createImmutable(0);Debug.locals.put("NuevoValor", _nuevovalor);
 BA.debugLineNum = 368;BA.debugLine="Select ValorActual";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(_valoractual,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 370;BA.debugLine="NuevoValor=1";
Debug.ShouldStop(131072);
_nuevovalor = BA.numberCast(int.class, 1);Debug.locals.put("NuevoValor", _nuevovalor);
 break; }
case 1: {
 BA.debugLineNum = 373;BA.debugLine="NuevoValor=0";
Debug.ShouldStop(1048576);
_nuevovalor = BA.numberCast(int.class, 0);Debug.locals.put("NuevoValor", _nuevovalor);
 break; }
}
;
 BA.debugLineNum = 375;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
Debug.ShouldStop(4194304);
_mpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mpk = _datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mPK", _mpk);Debug.locals.put("mPK", _mpk);
 BA.debugLineNum = 376;BA.debugLine="Dim PedidoSel As String=mPK.Get(\"Pedido\")";
Debug.ShouldStop(8388608);
_pedidosel = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Pedido")))));Debug.locals.put("PedidoSel", _pedidosel);Debug.locals.put("PedidoSel", _pedidosel);
 BA.debugLineNum = 377;BA.debugLine="Dim LineaSel As String=mPK.Get(\"Linea\")";
Debug.ShouldStop(16777216);
_lineasel = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Linea")))));Debug.locals.put("LineaSel", _lineasel);Debug.locals.put("LineaSel", _lineasel);
 BA.debugLineNum = 378;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?")),(Object)(clistaanalisistarifasventa.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_nuevovalor),(_pedidosel),(_lineasel)})))));
 BA.debugLineNum = 379;BA.debugLine="jamTableView1.RefrescarTablaValorCeldaEditada(Dat";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescartablavalorceldaeditada" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ )),(Object)(_datosceldaseleccionada.getField(true,"Columna" /*RemoteObject*/ )),(Object)((_nuevovalor)),(Object)(_datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ )));
 BA.debugLineNum = 380;BA.debugLine="jamTableView1.SeleccionarCelda(\"ExcluidoReclamaci";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_seleccionarcelda" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ExcluidoReclamacion")),(Object)(_datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ )));
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("asJO (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 131;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="Return o";
Debug.ShouldStop(8);
if (true) return _o;
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("btnSalir_Click (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","btnsalir_click", __ref);}
 BA.debugLineNum = 140;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="SalirModulo";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargaranalisistarifasventadatoscababriranalisis(RemoteObject __ref,RemoteObject _idantarsel) throws Exception{
try {
		Debug.PushSubsStack("CargarAnalisisTarifasVentaDatosCabAbrirAnalisis (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,559);
if (RapidSub.canDelegate("cargaranalisistarifasventadatoscababriranalisis")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","cargaranalisistarifasventadatoscababriranalisis", __ref, _idantarsel);}
ResumableSub_CargarAnalisisTarifasVentaDatosCabAbrirAnalisis rsub = new ResumableSub_CargarAnalisisTarifasVentaDatosCabAbrirAnalisis(null,__ref,_idantarsel);
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
public static class ResumableSub_CargarAnalisisTarifasVentaDatosCabAbrirAnalisis extends BA.ResumableSub {
public ResumableSub_CargarAnalisisTarifasVentaDatosCabAbrirAnalisis(b4j.docU.clistaanalisistarifasventa parent,RemoteObject __ref,RemoteObject _idantarsel) {
this.parent = parent;
this.__ref = __ref;
this._idantarsel = _idantarsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.clistaanalisistarifasventa parent;
RemoteObject _idantarsel;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargarAnalisisTarifasVentaDatosCabAbrirAnalisis (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,559);
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
Debug.locals.put("IDAnTarSel", _idantarsel);
 BA.debugLineNum = 560;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(32768);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 561;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(65536);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 562;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 563;BA.debugLine="Dim Comando As String=\"AnalisisTarifasVentaDatosC";
Debug.ShouldStop(262144);
_comando = BA.ObjectToString("AnalisisTarifasVentaDatosCabAbrirAnalisis");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 564;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(524288);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_idantarsel)})),(Object)(__ref));
 BA.debugLineNum = 566;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "cargaranalisistarifasventadatoscababriranalisis"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 568;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 569;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 570;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "cargaranalisistarifasventadatoscababriranalisis"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 571;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 572;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 574;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 575;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de sp";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de sp "),_comando,RemoteObject.createImmutable(". No se ha obtenido respuesta."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 576;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "cargaranalisistarifasventadatoscababriranalisis"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 577;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 578;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 580;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 581;BA.debugLine="Dim mData As Map=lstReg.Get(0)";
Debug.ShouldStop(16);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 582;BA.debugLine="mRes.Put(\"mData\", mData)";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mData"))),(Object)((_mdata.getObject())));
 BA.debugLineNum = 583;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 584;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
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
 BA.debugLineNum = 587;BA.debugLine="Return mRes";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 588;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
clistaanalisistarifasventa._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",clistaanalisistarifasventa._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
clistaanalisistarifasventa._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",clistaanalisistarifasventa._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private frm As Form";
clistaanalisistarifasventa._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",clistaanalisistarifasventa._frm);
 //BA.debugLineNum = 9;BA.debugLine="Private btnSalir As Button";
clistaanalisistarifasventa._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",clistaanalisistarifasventa._btnsalir);
 //BA.debugLineNum = 10;BA.debugLine="Private jamTableView1 As jamTableView";
clistaanalisistarifasventa._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",clistaanalisistarifasventa._jamtableview1);
 //BA.debugLineNum = 12;BA.debugLine="Dim Dialog As B4XDialog";
clistaanalisistarifasventa._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",clistaanalisistarifasventa._dialog);
 //BA.debugLineNum = 13;BA.debugLine="Dim mSQL As SQL";
clistaanalisistarifasventa._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",clistaanalisistarifasventa._msql);
 //BA.debugLineNum = 15;BA.debugLine="Public PermisoModuloUsuario As String";
clistaanalisistarifasventa._permisomodulousuario = RemoteObject.createImmutable("");__ref.setField("_permisomodulousuario",clistaanalisistarifasventa._permisomodulousuario);
 //BA.debugLineNum = 17;BA.debugLine="Private jFormReg As jamFormRegistro";
clistaanalisistarifasventa._jformreg = RemoteObject.createNew ("b4j.docU.jamformregistro");__ref.setField("_jformreg",clistaanalisistarifasventa._jformreg);
 //BA.debugLineNum = 19;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
clistaanalisistarifasventa._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",clistaanalisistarifasventa._jamloadingindicator1);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 199;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(128);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(clistaanalisistarifasventa.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblListaAnalisisTarifasVenta")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 201;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 202;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblListaAnalisisTa";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblListaAnalisisTarifasVenta")));
 };
 BA.debugLineNum = 204;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(2048);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 205;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 206;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblListaAnalisisTarifasVenta (")));
 BA.debugLineNum = 208;BA.debugLine="sbCrearTabla.Append(\"IDAnalisisTarifas INTEGER,\")";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDAnalisisTarifas INTEGER,")));
 BA.debugLineNum = 209;BA.debugLine="sbCrearTabla.Append(\"CodigoAnalisisTarifas TEXT C";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CodigoAnalisisTarifas TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 210;BA.debugLine="sbCrearTabla.Append(\"DescripcionAnalisis TEXT COL";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DescripcionAnalisis TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 214;BA.debugLine="sbCrearTabla.Append(\"FechaCreacionLong INTEGER DE";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaCreacionLong INTEGER DEFAULT 0,")));
 BA.debugLineNum = 215;BA.debugLine="sbCrearTabla.Append(\"FechaCreacion TEXT COLLATE N";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaCreacion TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 216;BA.debugLine="sbCrearTabla.Append(\"UsuarioCreacion TEXT COLLATE";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("UsuarioCreacion TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 217;BA.debugLine="sbCrearTabla.Append(\"FechaModificacionLong INTEGE";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaModificacionLong INTEGER DEFAULT 0,")));
 BA.debugLineNum = 218;BA.debugLine="sbCrearTabla.Append(\"FechaModificacion TEXT COLLA";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaModificacion TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 219;BA.debugLine="sbCrearTabla.Append(\"UsuarioModificacion TEXT COL";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("UsuarioModificacion TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 220;BA.debugLine="sbCrearTabla.Append(\"Estado TEXT COLLATE NOCASE D";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Estado TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 221;BA.debugLine="sbCrearTabla.Append(\"EstadoVentas TEXT COLLATE NO";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("EstadoVentas TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 222;BA.debugLine="sbCrearTabla.Append(\"EstadoCostesFabricacionCorte";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("EstadoCostesFabricacionCorte TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 223;BA.debugLine="sbCrearTabla.Append(\"EstadoCostesFabricacionNoCor";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("EstadoCostesFabricacionNoCorte TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 224;BA.debugLine="sbCrearTabla.Append(\"EstadoCostesImportacion TEXT";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("EstadoCostesImportacion TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 225;BA.debugLine="sbCrearTabla.Append(\"EstadoCostesCompra TEXT COLL";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("EstadoCostesCompra TEXT COLLATE NOCASE DEFAULT '')")));
 BA.debugLineNum = 227;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
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
public static RemoteObject  _crearcabeceraanalisistarifasventa(RemoteObject __ref,RemoteObject _descripcionanalisis,RemoteObject _tipoanalisistarifa,RemoteObject _tipotarifa,RemoteObject _codigotarifa,RemoteObject _usuariocreacion) throws Exception{
try {
		Debug.PushSubsStack("CrearCabeceraAnalisisTarifasVenta (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,470);
if (RapidSub.canDelegate("crearcabeceraanalisistarifasventa")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","crearcabeceraanalisistarifasventa", __ref, _descripcionanalisis, _tipoanalisistarifa, _tipotarifa, _codigotarifa, _usuariocreacion);}
ResumableSub_CrearCabeceraAnalisisTarifasVenta rsub = new ResumableSub_CrearCabeceraAnalisisTarifasVenta(null,__ref,_descripcionanalisis,_tipoanalisistarifa,_tipotarifa,_codigotarifa,_usuariocreacion);
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
public static class ResumableSub_CrearCabeceraAnalisisTarifasVenta extends BA.ResumableSub {
public ResumableSub_CrearCabeceraAnalisisTarifasVenta(b4j.docU.clistaanalisistarifasventa parent,RemoteObject __ref,RemoteObject _descripcionanalisis,RemoteObject _tipoanalisistarifa,RemoteObject _tipotarifa,RemoteObject _codigotarifa,RemoteObject _usuariocreacion) {
this.parent = parent;
this.__ref = __ref;
this._descripcionanalisis = _descripcionanalisis;
this._tipoanalisistarifa = _tipoanalisistarifa;
this._tipotarifa = _tipotarifa;
this._codigotarifa = _codigotarifa;
this._usuariocreacion = _usuariocreacion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.clistaanalisistarifasventa parent;
RemoteObject _descripcionanalisis;
RemoteObject _tipoanalisistarifa;
RemoteObject _tipotarifa;
RemoteObject _codigotarifa;
RemoteObject _usuariocreacion;
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
		Debug.PushSubsStack("CrearCabeceraAnalisisTarifasVenta (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,470);
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
Debug.locals.put("DescripcionAnalisis", _descripcionanalisis);
Debug.locals.put("TipoAnalisisTarifa", _tipoanalisistarifa);
Debug.locals.put("TipoTarifa", _tipotarifa);
Debug.locals.put("CodigoTarifa", _codigotarifa);
Debug.locals.put("UsuarioCreacion", _usuariocreacion);
 BA.debugLineNum = 473;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16777216);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 474;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(33554432);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 475;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 476;BA.debugLine="Dim Comando As String=\"NuevoAnalisisTarifasVenta\"";
Debug.ShouldStop(134217728);
_comando = BA.ObjectToString("NuevoAnalisisTarifasVenta");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 477;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(268435456);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_descripcionanalisis),(_tipoanalisistarifa),(_tipotarifa),(_codigotarifa),(_usuariocreacion),(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))})),(Object)(__ref));
 BA.debugLineNum = 479;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 481;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 482;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 483;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 484;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 485;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 488;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 489;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de sp";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de sp "),_comando,RemoteObject.createImmutable(". No se ha obtenido respuesta."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 490;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 BA.debugLineNum = 491;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 492;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 494;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8192);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 495;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(16384);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 496;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(32768);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 497;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 498;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de SP";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de SP "),_sresp,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 499;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 BA.debugLineNum = 500;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 502;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 503;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 504;BA.debugLine="mRes.Put(\"mData\", mResp)";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mData"))),(Object)((_mresp.getObject())));
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
 BA.debugLineNum = 508;BA.debugLine="Return mRes";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 509;BA.debugLine="End Sub";
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
public static RemoteObject  _crearcabeceraanalisistarifasventa2(RemoteObject __ref,RemoteObject _descripcionanalisis) throws Exception{
try {
		Debug.PushSubsStack("CrearCabeceraAnalisisTarifasVenta2 (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,512);
if (RapidSub.canDelegate("crearcabeceraanalisistarifasventa2")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","crearcabeceraanalisistarifasventa2", __ref, _descripcionanalisis);}
ResumableSub_CrearCabeceraAnalisisTarifasVenta2 rsub = new ResumableSub_CrearCabeceraAnalisisTarifasVenta2(null,__ref,_descripcionanalisis);
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
public static class ResumableSub_CrearCabeceraAnalisisTarifasVenta2 extends BA.ResumableSub {
public ResumableSub_CrearCabeceraAnalisisTarifasVenta2(b4j.docU.clistaanalisistarifasventa parent,RemoteObject __ref,RemoteObject _descripcionanalisis) {
this.parent = parent;
this.__ref = __ref;
this._descripcionanalisis = _descripcionanalisis;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.clistaanalisistarifasventa parent;
RemoteObject _descripcionanalisis;
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
		Debug.PushSubsStack("CrearCabeceraAnalisisTarifasVenta2 (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,512);
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
Debug.locals.put("DescripcionAnalisis", _descripcionanalisis);
 BA.debugLineNum = 514;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 515;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 516;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 517;BA.debugLine="Dim Comando As String=\"NuevoAnalisisTarifasVenta2";
Debug.ShouldStop(16);
_comando = BA.ObjectToString("NuevoAnalisisTarifasVenta2");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 518;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(32);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_descripcionanalisis),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreADUsuarioWindows" /*RemoteObject*/ )),(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))})),(Object)(__ref));
 BA.debugLineNum = 520;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa2"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 522;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 523;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 524;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa2"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 525;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 526;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 529;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 530;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de sp";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de sp "),_comando,RemoteObject.createImmutable(". No se ha obtenido respuesta."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 531;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa2"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 BA.debugLineNum = 532;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 533;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 535;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4194304);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 536;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(8388608);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 537;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(16777216);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 538;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 539;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de SP";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de SP "),_sresp,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 540;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa2"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 BA.debugLineNum = 541;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 543;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 544;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 545;BA.debugLine="mRes.Put(\"mData\", mResp)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mData"))),(Object)((_mresp.getObject())));
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
 BA.debugLineNum = 549;BA.debugLine="Return mRes";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 550;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 136;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="EventData.Consume";
Debug.ShouldStop(256);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 138;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","initialize", __ref, _ba);}
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
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","jamtableview1_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 281;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 282;BA.debugLine="SalirModulo";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("jamTableView1_CambioEnCeldaSeleccionada (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,317);
if (RapidSub.canDelegate("jamtableview1_cambioenceldaseleccionada")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","jamtableview1_cambioenceldaseleccionada", __ref, _datosceldaseleccionada);}
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
 BA.debugLineNum = 317;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila";
Debug.ShouldStop(536870912);
_lineaseltv = _datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ );Debug.locals.put("LineaSelTV", _lineaseltv);Debug.locals.put("LineaSelTV", _lineaseltv);
 BA.debugLineNum = 319;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
Debug.ShouldStop(1073741824);
_mpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mpk = _datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mPK", _mpk);Debug.locals.put("mPK", _mpk);
 BA.debugLineNum = 320;BA.debugLine="Dim Pedido As String=mPK.Get(\"Pedido\")";
Debug.ShouldStop(-2147483648);
_pedido = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Pedido")))));Debug.locals.put("Pedido", _pedido);Debug.locals.put("Pedido", _pedido);
 BA.debugLineNum = 321;BA.debugLine="Dim Linea As Int=mPK.Get(\"Linea\")";
Debug.ShouldStop(1);
_linea = BA.numberCast(int.class, _mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Linea")))));Debug.locals.put("Linea", _linea);Debug.locals.put("Linea", _linea);
 BA.debugLineNum = 322;BA.debugLine="Dim NombreProveedor As String=jamTableView1.GetVa";
Debug.ShouldStop(2);
_nombreproveedor = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("NombreProveedor"))));Debug.locals.put("NombreProveedor", _nombreproveedor);Debug.locals.put("NombreProveedor", _nombreproveedor);
 BA.debugLineNum = 323;BA.debugLine="Dim Articulo As String=jamTableView1.GetValorSQLC";
Debug.ShouldStop(4);
_articulo = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Articulo"))));Debug.locals.put("Articulo", _articulo);Debug.locals.put("Articulo", _articulo);
 BA.debugLineNum = 324;BA.debugLine="Dim Descripcion As String=jamTableView1.GetValorS";
Debug.ShouldStop(8);
_descripcion = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("DescripcionArticulo"))));Debug.locals.put("Descripcion", _descripcion);Debug.locals.put("Descripcion", _descripcion);
 BA.debugLineNum = 325;BA.debugLine="Dim Talla As String=jamTableView1.GetValorSQLCamp";
Debug.ShouldStop(16);
_talla = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Talla"))));Debug.locals.put("Talla", _talla);Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 326;BA.debugLine="Dim sTalla As String=IIf(Talla<>\"\",\"Talla: \" & Ta";
Debug.ShouldStop(32);
_stalla = BA.ObjectToString(((RemoteObject.solveBoolean("!",_talla,BA.ObjectToString(""))) ? ((RemoteObject.concat(RemoteObject.createImmutable("Talla: "),_talla))) : ((RemoteObject.createImmutable("")))));Debug.locals.put("sTalla", _stalla);Debug.locals.put("sTalla", _stalla);
 BA.debugLineNum = 327;BA.debugLine="Dim QtyPte As Int=jamTableView1.GetValorSQLCampoF";
Debug.ShouldStop(64);
_qtypte = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("QtyPendiente"))));Debug.locals.put("QtyPte", _qtypte);Debug.locals.put("QtyPte", _qtypte);
 BA.debugLineNum = 328;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(128);
_dateformatant = clistaanalisistarifasventa.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 329;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(256);
clistaanalisistarifasventa.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 330;BA.debugLine="Dim FechaPrometidaLong As Long=jamTableView1.GetV";
Debug.ShouldStop(512);
_fechaprometidalong = BA.numberCast(long.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("FechaPrometida"))));Debug.locals.put("FechaPrometidaLong", _fechaprometidalong);Debug.locals.put("FechaPrometidaLong", _fechaprometidalong);
 BA.debugLineNum = 331;BA.debugLine="Dim sFechaPrometida As String=IIf(FechaPrometidaL";
Debug.ShouldStop(1024);
_sfechaprometida = BA.ObjectToString(((RemoteObject.solveBoolean(">",_fechaprometidalong,BA.numberCast(long.class, 0))) ? ((RemoteObject.concat(RemoteObject.createImmutable("Fecha Prometida: "),clistaanalisistarifasventa.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechaprometidalong))))) : ((RemoteObject.createImmutable("SIN FECHA PROMETIDA")))));Debug.locals.put("sFechaPrometida", _sfechaprometida);Debug.locals.put("sFechaPrometida", _sfechaprometida);
 BA.debugLineNum = 332;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(2048);
clistaanalisistarifasventa.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 333;BA.debugLine="Dim PendienteSeguimiento As Int=jamTableView1.Get";
Debug.ShouldStop(4096);
_pendienteseguimiento = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("PendienteSeguimiento"))));Debug.locals.put("PendienteSeguimiento", _pendienteseguimiento);Debug.locals.put("PendienteSeguimiento", _pendienteseguimiento);
 BA.debugLineNum = 334;BA.debugLine="Dim sPendienteSeguimiento As String=IIf(Pendiente";
Debug.ShouldStop(8192);
_spendienteseguimiento = BA.ObjectToString(((RemoteObject.solveBoolean("=",_pendienteseguimiento,BA.numberCast(double.class, 1))) ? (RemoteObject.createImmutable(("PENDIENTE SEGUIMIENTO"))) : ((RemoteObject.createImmutable("")))));Debug.locals.put("sPendienteSeguimiento", _spendienteseguimiento);Debug.locals.put("sPendienteSeguimiento", _spendienteseguimiento);
 BA.debugLineNum = 336;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Pedido:";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Pedido: "),_pedido,RemoteObject.createImmutable(" Línea:"),_linea,RemoteObject.createImmutable("  "),_nombreproveedor,RemoteObject.createImmutable("  "),_articulo,RemoteObject.createImmutable("  "),_descripcion,RemoteObject.createImmutable("  "),_stalla,RemoteObject.createImmutable("  QtyPte: "),_qtypte,RemoteObject.createImmutable("  "),_sfechaprometida,RemoteObject.createImmutable(" "),_spendienteseguimiento)));
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("jamTableView1_CellDobleClick (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("jamtableview1_celldobleclick")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","jamtableview1_celldobleclick", __ref, _datosceldaseleccionada);}
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _dcs = RemoteObject.declareNull("b4j.docU.jamtableview._datosceldaseleccionadajamtableview");
RemoteObject _idanalisissel = RemoteObject.createImmutable(0);
RemoteObject _codigoanalisistarifassel = RemoteObject.createImmutable("");
RemoteObject _descripcionanalisistarifassel = RemoteObject.createImmutable("");
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 349;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 350;BA.debugLine="Dim FilaSel As Int=DatosCeldaSeleccionada.Fila";
Debug.ShouldStop(536870912);
_filasel = _datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 351;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=jam";
Debug.ShouldStop(1073741824);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("IDAnalisisTarifas")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 352;BA.debugLine="Dim IDAnalisisSel As Int=DCS.ValorCelda";
Debug.ShouldStop(-2147483648);
_idanalisissel = BA.numberCast(int.class, _dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("IDAnalisisSel", _idanalisissel);Debug.locals.put("IDAnalisisSel", _idanalisissel);
 BA.debugLineNum = 355;BA.debugLine="Dim CodigoAnalisisTarifasSel As String=jamTableVi";
Debug.ShouldStop(4);
_codigoanalisistarifassel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("CodigoAnalisisTarifas"))));Debug.locals.put("CodigoAnalisisTarifasSel", _codigoanalisistarifassel);Debug.locals.put("CodigoAnalisisTarifasSel", _codigoanalisistarifassel);
 BA.debugLineNum = 356;BA.debugLine="Dim DescripcionAnalisisTarifasSel As String=jamTa";
Debug.ShouldStop(8);
_descripcionanalisistarifassel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("DescripcionAnalisis"))));Debug.locals.put("DescripcionAnalisisTarifasSel", _descripcionanalisistarifassel);Debug.locals.put("DescripcionAnalisisTarifasSel", _descripcionanalisistarifassel);
 BA.debugLineNum = 360;BA.debugLine="AbrirFichaAnalisisTarifasVenta(IDAnalisisSel, Cod";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_abrirfichaanalisistarifasventa" /*RemoteObject*/ ,(Object)(_idanalisissel),(Object)(_codigoanalisistarifassel),(Object)(_descripcionanalisistarifassel));
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
public static RemoteObject  _jamtableview1_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,297);
if (RapidSub.canDelegate("jamtableview1_contextmenuitem_action")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","jamtableview1_contextmenuitem_action", __ref, _tagmenuitem);}
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _dcs = RemoteObject.declareNull("b4j.docU.jamtableview._datosceldaseleccionadajamtableview");
RemoteObject _idanalisissel = RemoteObject.createImmutable(0);
RemoteObject _codigoanalisistarifassel = RemoteObject.createImmutable("");
RemoteObject _descripcionanalisistarifassel = RemoteObject.createImmutable("");
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 297;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("FichaAnalisisTarifasVenta"))) {
case 0: {
 BA.debugLineNum = 300;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.ShouldStop(2048);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 301;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(4096);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("IDAnalisisTarifas")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 302;BA.debugLine="Dim IDAnalisisSel As Int=DCS.ValorCelda";
Debug.ShouldStop(8192);
_idanalisissel = BA.numberCast(int.class, _dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("IDAnalisisSel", _idanalisissel);Debug.locals.put("IDAnalisisSel", _idanalisissel);
 BA.debugLineNum = 308;BA.debugLine="Dim CodigoAnalisisTarifasSel As String=jamTable";
Debug.ShouldStop(524288);
_codigoanalisistarifassel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("CodigoAnalisisTarifas"))));Debug.locals.put("CodigoAnalisisTarifasSel", _codigoanalisistarifassel);Debug.locals.put("CodigoAnalisisTarifasSel", _codigoanalisistarifassel);
 BA.debugLineNum = 309;BA.debugLine="Dim DescripcionAnalisisTarifasSel As String=jam";
Debug.ShouldStop(1048576);
_descripcionanalisistarifassel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("DescripcionAnalisis"))));Debug.locals.put("DescripcionAnalisisTarifasSel", _descripcionanalisistarifassel);Debug.locals.put("DescripcionAnalisisTarifasSel", _descripcionanalisistarifassel);
 BA.debugLineNum = 310;BA.debugLine="AbrirFichaAnalisisTarifasVenta(IDAnalisisSel, C";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_abrirfichaanalisistarifasventa" /*RemoteObject*/ ,(Object)(_idanalisissel),(Object)(_codigoanalisistarifassel),(Object)(_descripcionanalisistarifassel));
 break; }
}
;
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,285);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem);}
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 285;BA.debugLine="Sub jamTableView1_MenuBarMenuItem_Action(TagMenuIt";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 286;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("NuevoAnalisisTarifasVenta"))) {
case 0: {
 BA.debugLineNum = 289;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_actualizardatos" /*void*/ );
 break; }
case 1: {
 BA.debugLineNum = 292;BA.debugLine="NuevoAnalisisTarifasVenta2";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_nuevoanalisistarifasventa2" /*void*/ );
 break; }
}
;
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jformreg_grabaredicionregistro(RemoteObject __ref,RemoteObject _lstinfocampojamformregistro) throws Exception{
try {
		Debug.PushSubsStack("jFormReg_GrabarEdicionRegistro (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("jformreg_grabaredicionregistro")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","jformreg_grabaredicionregistro", __ref, _lstinfocampojamformregistro);}
RemoteObject _ifr = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
Debug.locals.put("lstInfoCampoJamFormRegistro", _lstinfocampojamformregistro);
 BA.debugLineNum = 408;BA.debugLine="Sub jFormReg_GrabarEdicionRegistro(lstInfoCampoJam";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 409;BA.debugLine="For Each iFR As InfoCampoJamFormRegistro In lstIn";
Debug.ShouldStop(16777216);
{
final RemoteObject group1 = _lstinfocampojamformregistro;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_ifr = (group1.runMethod(false,"Get",index1));Debug.locals.put("iFR", _ifr);
Debug.locals.put("iFR", _ifr);
 BA.debugLineNum = 410;BA.debugLine="Log(iFR)";
Debug.ShouldStop(33554432);
clistaanalisistarifasventa.__c.runVoidMethod ("LogImpl","893061122",BA.ObjectToString(_ifr),0);
 }
}Debug.locals.put("iFR", _ifr);
;
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jformreg_grabarnuevoregistro(RemoteObject __ref,RemoteObject _lstdatoscamposregistronuevo) throws Exception{
try {
		Debug.PushSubsStack("jFormReg_GrabarNuevoRegistro (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,391);
if (RapidSub.canDelegate("jformreg_grabarnuevoregistro")) { __ref.runUserSub(false, "clistaanalisistarifasventa","jformreg_grabarnuevoregistro", __ref, _lstdatoscamposregistronuevo); return;}
ResumableSub_jFormReg_GrabarNuevoRegistro rsub = new ResumableSub_jFormReg_GrabarNuevoRegistro(null,__ref,_lstdatoscamposregistronuevo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jFormReg_GrabarNuevoRegistro extends BA.ResumableSub {
public ResumableSub_jFormReg_GrabarNuevoRegistro(b4j.docU.clistaanalisistarifasventa parent,RemoteObject __ref,RemoteObject _lstdatoscamposregistronuevo) {
this.parent = parent;
this.__ref = __ref;
this._lstdatoscamposregistronuevo = _lstdatoscamposregistronuevo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.clistaanalisistarifasventa parent;
RemoteObject _lstdatoscamposregistronuevo;
RemoteObject _descripcionanalisis = RemoteObject.createImmutable("");
RemoteObject _tipoanalisistarifas = RemoteObject.createImmutable("");
RemoteObject _tipotarifa = RemoteObject.createImmutable("");
RemoteObject _codigotarifa = RemoteObject.createImmutable("");
RemoteObject _usuariocreacion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jFormReg_GrabarNuevoRegistro (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,391);
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
 BA.debugLineNum = 395;BA.debugLine="Dim DescripcionAnalisis As String=jFormReg.DatosC";
Debug.ShouldStop(1024);
_descripcionanalisis = BA.ObjectToString(__ref.getField(false,"_jformreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("DescripcionAnalisis"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("DescripcionAnalisis", _descripcionanalisis);Debug.locals.put("DescripcionAnalisis", _descripcionanalisis);
 BA.debugLineNum = 396;BA.debugLine="Dim TipoAnalisisTarifas As String=jFormReg.DatosC";
Debug.ShouldStop(2048);
_tipoanalisistarifas = BA.ObjectToString(__ref.getField(false,"_jformreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("TipoAnalisisTarifas"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("TipoAnalisisTarifas", _tipoanalisistarifas);Debug.locals.put("TipoAnalisisTarifas", _tipoanalisistarifas);
 BA.debugLineNum = 397;BA.debugLine="Dim TipoTarifa As String=jFormReg.DatosCampoSelec";
Debug.ShouldStop(4096);
_tipotarifa = BA.ObjectToString(__ref.getField(false,"_jformreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("TipoTarifa"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("TipoTarifa", _tipotarifa);Debug.locals.put("TipoTarifa", _tipotarifa);
 BA.debugLineNum = 398;BA.debugLine="Dim CodigoTarifa As String=jFormReg.DatosCampoSel";
Debug.ShouldStop(8192);
_codigotarifa = BA.ObjectToString(__ref.getField(false,"_jformreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_datoscamposeleccionado" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("CodigoTarifa"))).getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("CodigoTarifa", _codigotarifa);Debug.locals.put("CodigoTarifa", _codigotarifa);
 BA.debugLineNum = 399;BA.debugLine="Dim UsuarioCreacion As String=Main.DatosUsuario.N";
Debug.ShouldStop(16384);
_usuariocreacion = parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreADUsuarioWindows" /*RemoteObject*/ );Debug.locals.put("UsuarioCreacion", _usuariocreacion);Debug.locals.put("UsuarioCreacion", _usuariocreacion);
 BA.debugLineNum = 401;BA.debugLine="Wait For (CrearCabeceraAnalisisTarifasVenta(Descr";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "jformreg_grabarnuevoregistro"), __ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_crearcabeceraanalisistarifasventa" /*RemoteObject*/ ,(Object)(_descripcionanalisis),(Object)(_tipoanalisistarifas),(Object)(_tipotarifa),(Object)(_codigotarifa),(Object)(_usuariocreacion)));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 402;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 403;BA.debugLine="If Accion=\"NOK\" Then Return";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 404;BA.debugLine="jFormReg.CerrarFormRegistro";
Debug.ShouldStop(524288);
__ref.getField(false,"_jformreg" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamformregistro.class, "_cerrarformregistro" /*RemoteObject*/ );
 BA.debugLineNum = 405;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 406;BA.debugLine="End Sub";
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
public static void  _nuevoanalisistarifasventa2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NuevoAnalisisTarifasVenta2 (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,414);
if (RapidSub.canDelegate("nuevoanalisistarifasventa2")) { __ref.runUserSub(false, "clistaanalisistarifasventa","nuevoanalisistarifasventa2", __ref); return;}
ResumableSub_NuevoAnalisisTarifasVenta2 rsub = new ResumableSub_NuevoAnalisisTarifasVenta2(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_NuevoAnalisisTarifasVenta2 extends BA.ResumableSub {
public ResumableSub_NuevoAnalisisTarifasVenta2(b4j.docU.clistaanalisistarifasventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.clistaanalisistarifasventa parent;
RemoteObject _b4xinputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _btnok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _btncancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _nuevadescripcion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idnuevoantar = RemoteObject.createImmutable(0);
RemoteObject _nuevoantar = RemoteObject.createImmutable("");
RemoteObject _desnuevoantar = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("NuevoAnalisisTarifasVenta2 (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,414);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 416;BA.debugLine="Dialog.Title=\"Descripción Análisis (max. \" & 255";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Descripción Análisis (max. "),RemoteObject.createImmutable(255),RemoteObject.createImmutable(" caracteres) "))));
 BA.debugLineNum = 417;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(1);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 419;BA.debugLine="Dim b4xInputDlg As B4XInputTemplate";
Debug.ShouldStop(4);
_b4xinputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("b4xInputDlg", _b4xinputdlg);
 BA.debugLineNum = 420;BA.debugLine="b4xInputDlg.Initialize";
Debug.ShouldStop(8);
_b4xinputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 421;BA.debugLine="b4xInputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(16);
_b4xinputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 422;BA.debugLine="b4xInputDlg.TextField1.SetTextAlignment(\"TOP\", \"L";
Debug.ShouldStop(32);
_b4xinputdlg.getField(false,"_textfield1" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("TOP")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 425;BA.debugLine="b4xInputDlg.mBase.Width = 800dip";
Debug.ShouldStop(256);
_b4xinputdlg.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 800)))));
 BA.debugLineNum = 426;BA.debugLine="b4xInputDlg.RegexPattern=\"^.{\" & 1 & \",\" & 255 &";
Debug.ShouldStop(512);
_b4xinputdlg.setField ("_regexpattern" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("^.{"),RemoteObject.createImmutable(1),RemoteObject.createImmutable(","),RemoteObject.createImmutable(255),RemoteObject.createImmutable("}$")));
 BA.debugLineNum = 432;BA.debugLine="b4xInputDlg.Text=\"\"";
Debug.ShouldStop(32768);
_b4xinputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 433;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(b4xI";
Debug.ShouldStop(65536);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xinputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 435;BA.debugLine="Dim btnOK As B4XView=Dialog.GetButton(xui.DialogR";
Debug.ShouldStop(262144);
_btnok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btnok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("btnOK", _btnok);Debug.locals.put("btnOK", _btnok);
 BA.debugLineNum = 436;BA.debugLine="btnOK.Left=10dip";
Debug.ShouldStop(524288);
_btnok.runMethod(true,"setLeft",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 437;BA.debugLine="btnOK.TextSize=14";
Debug.ShouldStop(1048576);
_btnok.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 439;BA.debugLine="Dim btnCancel As B4XView=Dialog.GetButton(xui.Dia";
Debug.ShouldStop(4194304);
_btncancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btncancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("btnCancel", _btncancel);Debug.locals.put("btnCancel", _btncancel);
 BA.debugLineNum = 440;BA.debugLine="btnCancel.Left=btnCancel.Left-30dip";
Debug.ShouldStop(8388608);
_btncancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_btncancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 0));
 BA.debugLineNum = 441;BA.debugLine="btnCancel.width=btnCancel.width+10dip";
Debug.ShouldStop(16777216);
_btncancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_btncancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0));
 BA.debugLineNum = 442;BA.debugLine="btnCancel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
Debug.ShouldStop(33554432);
_btncancel.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("RIGHT")));
 BA.debugLineNum = 443;BA.debugLine="btnCancel.TextSize=14";
Debug.ShouldStop(67108864);
_btncancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 445;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "nuevoanalisistarifasventa2"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 446;BA.debugLine="If rInt=xui.DialogResponse_Cancel Then Return";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")))) { 
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
 BA.debugLineNum = 448;BA.debugLine="Dim NuevaDescripcion As String=b4xInputDlg.Text.T";
Debug.ShouldStop(-2147483648);
_nuevadescripcion = _b4xinputdlg.getField(true,"_text" /*RemoteObject*/ ).runMethod(true,"toUpperCase");Debug.locals.put("NuevaDescripcion", _nuevadescripcion);Debug.locals.put("NuevaDescripcion", _nuevadescripcion);
 BA.debugLineNum = 451;BA.debugLine="Wait For (CrearCabeceraAnalisisTarifasVenta2(Nuev";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "nuevoanalisistarifasventa2"), __ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_crearcabeceraanalisistarifasventa2" /*RemoteObject*/ ,(Object)(_nuevadescripcion)));
this.state = 18;
return;
case 18:
//C
this.state = 7;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 452;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 453;BA.debugLine="If Accion=\"NOK\" Then Return";
Debug.ShouldStop(16);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 454;BA.debugLine="Dim mData As Map=mRes.Get(\"mData\")";
Debug.ShouldStop(32);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mData")))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 455;BA.debugLine="Dim IDNuevoAnTar As Int=mData.GetValueAt(0)";
Debug.ShouldStop(64);
_idnuevoantar = BA.numberCast(int.class, _mdata.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("IDNuevoAnTar", _idnuevoantar);Debug.locals.put("IDNuevoAnTar", _idnuevoantar);
 BA.debugLineNum = 457;BA.debugLine="Wait For(CargarAnalisisTarifasVentaDatosCabAbrirA";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "nuevoanalisistarifasventa2"), __ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_cargaranalisistarifasventadatoscababriranalisis" /*RemoteObject*/ ,(Object)(_idnuevoantar)));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 458;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(512);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 459;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 460;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 461;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 463;BA.debugLine="Dim mData As Map=mRes.Get(\"mData\")";
Debug.ShouldStop(16384);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mData")))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 464;BA.debugLine="Dim NuevoAnTar As String=mData.Get(\"CodigoAnalisi";
Debug.ShouldStop(32768);
_nuevoantar = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodigoAnalisisTarifas")))));Debug.locals.put("NuevoAnTar", _nuevoantar);Debug.locals.put("NuevoAnTar", _nuevoantar);
 BA.debugLineNum = 465;BA.debugLine="Dim DesNuevoAnTar As String=mData.Get(\"Descripcio";
Debug.ShouldStop(65536);
_desnuevoantar = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DescripcionAnalisis")))));Debug.locals.put("DesNuevoAnTar", _desnuevoantar);Debug.locals.put("DesNuevoAnTar", _desnuevoantar);
 BA.debugLineNum = 467;BA.debugLine="AbrirFichaAnalisisTarifasVenta(IDNuevoAnTar, Nuev";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_abrirfichaanalisistarifasventa" /*RemoteObject*/ ,(Object)(_idnuevoantar),(Object)(_nuevoantar),(Object)(_desnuevoantar));
 BA.debugLineNum = 468;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SalirModulo (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "clistaanalisistarifasventa","salirmodulo", __ref);}
 BA.debugLineNum = 144;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 146;BA.debugLine="frm.Close";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 147;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(262144);
clistaanalisistarifasventa._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Show (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "clistaanalisistarifasventa","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.clistaanalisistarifasventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.clistaanalisistarifasventa parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (clistaanalisistarifasventa) ","clistaanalisistarifasventa",40,__ref.getField(false, "ba"),__ref,27);
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
 BA.debugLineNum = 36;BA.debugLine="frm.RootPane.LoadLayout(\"scrListaAnalisisTarifasV";
Debug.ShouldStop(8);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrListaAnalisisTarifasVenta")));
 BA.debugLineNum = 37;BA.debugLine="Sleep(0)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "show"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 39;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Lista Análisi";
Debug.ShouldStop(64);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Lista Análisis Tarifas Venta")));
 BA.debugLineNum = 41;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 43;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 48;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 50;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Nuevo Análisis Tarifas Venta")),(Object)(BA.ObjectToString("NuevoAnalisisTarifasVenta")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf196)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ficha Análisis Tarifas Venta")),(Object)(BA.ObjectToString("FichaAnalisisTarifasVenta")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0f6)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 53;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ficha Análisis Tarifas Venta")),(Object)(BA.ObjectToString("FichaAnalisisTarifasVenta")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0f6)))))));
 BA.debugLineNum = 66;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(2);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaAnalisisTarifasVenta.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 67;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 68;BA.debugLine="Log(mRes)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","892078121",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 69;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 70;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 71;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clistaanalisistarifasventa", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
 BA.debugLineNum = 72;BA.debugLine="frm.Close";
Debug.ShouldStop(128);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 73;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 76;BA.debugLine="jamTableView1.AlturaFilas=0    ' 0 si se quiere q";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 80;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(32768);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 81;BA.debugLine="CF.Initialize";
Debug.ShouldStop(65536);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
Debug.ShouldStop(131072);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_cellfactory_columnafecha" /*RemoteObject*/ ));
 BA.debugLineNum = 83;BA.debugLine="CF.CellFactoryEnCallBack=False";
Debug.ShouldStop(262144);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 84;BA.debugLine="CF.params=Null";
Debug.ShouldStop(524288);
_cf.setField ("params" /*RemoteObject*/ ,(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 86;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("FechaCreacionLong"),RemoteObject.createImmutable("FechaModificacionLong")})))));
 BA.debugLineNum = 88;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnatexto1condicioncolorfondocolortexto" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Estado"))})))),(Object)(BA.ObjectToString("ABIERTO")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 89;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnatexto1condicioncolorfondocolortexto" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("EstadoVentas"))})))),(Object)(BA.ObjectToString("PENDIENTE")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 90;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnatexto1condicioncolorfondocolortexto" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("EstadoCostesFabricacionCorte"))})))),(Object)(BA.ObjectToString("PENDIENTE")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 91;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnatexto1condicioncolorfondocolortexto" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("EstadoCostesFabricacionNoCorte"))})))),(Object)(BA.ObjectToString("PENDIENTE")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 92;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnatexto1condicioncolorfondocolortexto" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("EstadoCostesImportacion"))})))),(Object)(BA.ObjectToString("PENDIENTE")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 93;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnatexto1condicioncolorfondocolortexto" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("EstadoCostesCompra"))})))),(Object)(BA.ObjectToString("PENDIENTE")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green")),(Object)(BA.numberCast(int.class, ((int)0x00ffffff))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 119;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 120;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 125;BA.debugLine="frm.Show";
Debug.ShouldStop(268435456);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 127;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.clistaanalisistarifasventa.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 129;BA.debugLine="End Sub";
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
}