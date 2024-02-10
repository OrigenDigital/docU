package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cevaluacionproveedoresproveedoresfijos_subs_0 {


public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cevaluacionproveedoresproveedoresfijos) ","cevaluacionproveedoresproveedoresfijos",29,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cevaluacionproveedoresproveedoresfijos","btnsalir_click", __ref);}
 BA.debugLineNum = 113;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="SalirForm";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cevaluacionproveedoresproveedoresfijos.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargalistaproveedoresfijosevaluacion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaListaProveedoresFijosEvaluacion (cevaluacionproveedoresproveedoresfijos) ","cevaluacionproveedoresproveedoresfijos",29,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("cargalistaproveedoresfijosevaluacion")) { return __ref.runUserSub(false, "cevaluacionproveedoresproveedoresfijos","cargalistaproveedoresfijosevaluacion", __ref);}
ResumableSub_CargaListaProveedoresFijosEvaluacion rsub = new ResumableSub_CargaListaProveedoresFijosEvaluacion(null,__ref);
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
public static class ResumableSub_CargaListaProveedoresFijosEvaluacion extends BA.ResumableSub {
public ResumableSub_CargaListaProveedoresFijosEvaluacion(b4j.docU.cevaluacionproveedoresproveedoresfijos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedoresproveedoresfijos parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaListaProveedoresFijosEvaluacion (cevaluacionproveedoresproveedoresfijos) ","cevaluacionproveedoresproveedoresfijos",29,__ref.getField(false, "ba"),__ref,130);
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
 BA.debugLineNum = 132;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblEvaluacionProve";
Debug.ShouldStop(8);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblEvaluacionProveedoresListaProveedoresFijos")));
 BA.debugLineNum = 134;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(32);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 135;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(64);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 136;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 137;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresLista";
Debug.ShouldStop(256);
_comando = BA.ObjectToString("EvaluacionProveedoresListaProveedoresFijos");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 138;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(512);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 140;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedoresproveedoresfijos", "cargalistaproveedoresfijosevaluacion"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 142;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 143;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 144;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 145;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedoresproveedoresfijos", "cargalistaproveedoresfijosevaluacion"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 146;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 147;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 150;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 151;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 152;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se han co";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se han configurado proveedores fijos para la evaluación.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 153;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedoresproveedoresfijos", "cargalistaproveedoresfijosevaluacion"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 154;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 155;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 157;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(268435456);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 161;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 162;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 164;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(8);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblEvaluacionProveedoresListaProveedoresFijos")),(Object)(_lstreg));
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
 BA.debugLineNum = 167;BA.debugLine="Return mRes";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 168;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
cevaluacionproveedoresproveedoresfijos._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cevaluacionproveedoresproveedoresfijos._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private jamTableViewProveedoresFijosEvaluacionPro";
cevaluacionproveedoresproveedoresfijos._jamtableviewproveedoresfijosevaluacionproveedores = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewproveedoresfijosevaluacionproveedores",cevaluacionproveedoresproveedoresfijos._jamtableviewproveedoresfijosevaluacionproveedores);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
cevaluacionproveedoresproveedoresfijos._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cevaluacionproveedoresproveedoresfijos._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private frm As Form";
cevaluacionproveedoresproveedoresfijos._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cevaluacionproveedoresproveedoresfijos._frm);
 //BA.debugLineNum = 6;BA.debugLine="Private Dialog As B4XDialog";
cevaluacionproveedoresproveedoresfijos._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cevaluacionproveedoresproveedoresfijos._dialog);
 //BA.debugLineNum = 7;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
cevaluacionproveedoresproveedoresfijos._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cevaluacionproveedoresproveedoresfijos._jamloadingindicator1);
 //BA.debugLineNum = 9;BA.debugLine="Private mSQL As SQL";
cevaluacionproveedoresproveedoresfijos._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cevaluacionproveedoresproveedoresfijos._msql);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object";
cevaluacionproveedoresproveedoresfijos._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cevaluacionproveedoresproveedoresfijos._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private mParent As B4XView";
cevaluacionproveedoresproveedoresfijos._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",cevaluacionproveedoresproveedoresfijos._mparent);
 //BA.debugLineNum = 13;BA.debugLine="Dim Background As B4XView";
cevaluacionproveedoresproveedoresfijos._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",cevaluacionproveedoresproveedoresfijos._background);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cevaluacionproveedoresproveedoresfijos) ","cevaluacionproveedoresproveedoresfijos",29,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cevaluacionproveedoresproveedoresfijos","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 109;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="EventData.Consume";
Debug.ShouldStop(8192);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cevaluacionproveedoresproveedoresfijos) ","cevaluacionproveedoresproveedoresfijos",29,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cevaluacionproveedoresproveedoresfijos","initialize", __ref, _ba, _callback, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="mCallBack=CallBack";
Debug.ShouldStop(131072);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 19;BA.debugLine="mParent=Parent";
Debug.ShouldStop(262144);
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 20;BA.debugLine="Background= xui.CreatePanel(\"backgroundProveedore";
Debug.ShouldStop(524288);
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("backgroundProveedoresFijos"))));
 BA.debugLineNum = 21;BA.debugLine="Background.Tag = \"backgroundProveedoresFijos\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("backgroundProveedoresFijos")));
 BA.debugLineNum = 22;BA.debugLine="Background.Color=0xaa000000";
Debug.ShouldStop(2097152);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 23;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 26;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(cevaluacionproveedoresproveedoresfijos._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(cevaluacionproveedoresproveedoresfijos.__c.getField(true,"True")));
 BA.debugLineNum = 31;BA.debugLine="Show";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.cevaluacionproveedoresproveedoresfijos.class, "_show" /*void*/ );
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewProveedoresFijosEvaluacionProveedores_AccionSalirJamTableView (cevaluacionproveedoresproveedoresfijos) ","cevaluacionproveedoresproveedoresfijos",29,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview")) { return __ref.runUserSub(false, "cevaluacionproveedoresproveedoresfijos","jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 125;BA.debugLine="Sub jamTableViewProveedoresFijosEvaluacionProveedo";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 127;BA.debugLine="SalirForm";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.cevaluacionproveedoresproveedoresfijos.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salirform(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirForm (cevaluacionproveedoresproveedoresfijos) ","cevaluacionproveedoresproveedoresfijos",29,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("salirform")) { return __ref.runUserSub(false, "cevaluacionproveedoresproveedoresfijos","salirform", __ref);}
 BA.debugLineNum = 117;BA.debugLine="Sub SalirForm";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 119;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 120;BA.debugLine="Background.RemoveViewFromParent";
Debug.ShouldStop(8388608);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 121;BA.debugLine="frm.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 122;BA.debugLine="CallSubDelayed(mCallBack,\"cEvaluacionProveedoresP";
Debug.ShouldStop(33554432);
cevaluacionproveedoresproveedoresfijos.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cEvaluacionProveedoresProveedoresFijos_Done")));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Show (cevaluacionproveedoresproveedoresfijos) ","cevaluacionproveedoresproveedoresfijos",29,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cevaluacionproveedoresproveedoresfijos","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cevaluacionproveedoresproveedoresfijos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cevaluacionproveedoresproveedoresfijos parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cevaluacionproveedoresproveedoresfijos) ","cevaluacionproveedoresproveedoresfijos",29,__ref.getField(false, "ba"),__ref,35);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 38;BA.debugLine="frm.Initialize(\"frm\",-1,-1)";
Debug.ShouldStop(32);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 40;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(128);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 41;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(256);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 42;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(512);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 44;BA.debugLine="frm.RootPane.LoadLayout(\"scrEvaluacionProveedores";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrEvaluacionProveedoresProveedoresFijos")));
 BA.debugLineNum = 46;BA.debugLine="Sleep(0)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedoresproveedoresfijos", "show"),BA.numberCast(int.class, 0));
this.state = 32;
return;
case 32:
//C
this.state = 1;
;
 BA.debugLineNum = 48;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(32768);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 50;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"  Proveedores";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("  Proveedores fijos Evaluación ")));
 BA.debugLineNum = 52;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(524288);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 53;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 54;BA.debugLine="frm.Show";
Debug.ShouldStop(2097152);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 56;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 57;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 59;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontmaterialiconstomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Nuevo Proveedor Fijo Evaluación")),(Object)(BA.ObjectToString("NuevoProveedorFijoEvaluacion")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe148)))))),(Object)(__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 60;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontmaterialiconstomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Quitar Proveedor Fijo Evaluación")),(Object)(BA.ObjectToString("QuitarProveedorFijoEvaluacion")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe15d)))))),(Object)(__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 63;BA.debugLine="Dim rSub As ResumableSub=jamTableViewProveedoresF";
Debug.ShouldStop(1073741824);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaEvaluacionProveedoresListaProveedoresFijos.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 64;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _rsub);
this.state = 33;
return;
case 33:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 65;BA.debugLine="Log(mRes)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","861734942",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 66;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 67;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 68;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 4;
;
 BA.debugLineNum = 69;BA.debugLine="frm.Close";
Debug.ShouldStop(16);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 70;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 73;BA.debugLine="Wait For(CargaListaProveedoresFijosEvaluacion) co";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), __ref.runClassMethod (b4j.docU.cevaluacionproveedoresproveedoresfijos.class, "_cargalistaproveedoresfijosevaluacion" /*RemoteObject*/ ));
this.state = 35;
return;
case 35:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 74;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(512);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 75;BA.debugLine="If Accion=\"NOK\" Then Return";
Debug.ShouldStop(1024);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
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
 BA.debugLineNum = 77;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(4096);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblEvaluacionProveedoresListaProveedoresFijos order by NombreProveedorFijoEvaluacionProveedoresaluacionProveedores")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 79;BA.debugLine="Dim rSub As ResumableSub=jamTableViewProveedoresF";
Debug.ShouldStop(16384);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 80;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _rsub);
this.state = 36;
return;
case 36:
//C
this.state = 11;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 81;BA.debugLine="rs.Close";
Debug.ShouldStop(65536);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 82;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(262144);
if (true) break;

case 11:
//if
this.state = 31;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 84;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(524288);
if (true) break;

case 14:
//if
this.state = 21;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 85;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 86;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 17;
;
 BA.debugLineNum = 88;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 89;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _msa);
this.state = 38;
return;
case 38:
//C
this.state = 17;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 90;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(33554432);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 91;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedo";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 92;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 95;BA.debugLine="ExitApplication";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 97;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(1);

case 21:
//if
this.state = 30;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 98;BA.debugLine="If True<>mResultSetData.Get(\"ListaVacia\") Then";
Debug.ShouldStop(2);
if (true) break;

case 24:
//if
this.state = 29;
if (RemoteObject.solveBoolean("!",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 99;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 100;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 29;
;
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 102;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedo";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableviewproveedoresfijosevaluacionproveedores" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setplaceholdertext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = -1;
;
 BA.debugLineNum = 107;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
}