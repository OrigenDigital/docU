package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cseleccionproveedornav_subs_0 {


public static void  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("actualizardatos")) { __ref.runUserSub(false, "cseleccionproveedornav","actualizardatos", __ref); return;}
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
public ResumableSub_ActualizarDatos(b4j.docU.cseleccionproveedornav parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseleccionproveedornav parent;
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,121);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 124;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 125;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 126;BA.debugLine="wait for(DatosProveedoresNav) complete (mResult A";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "actualizardatos"), __ref.runClassMethod (b4j.docU.cseleccionproveedornav.class, "_datosproveedoresnav" /*RemoteObject*/ ));
this.state = 20;
return;
case 20:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 129;BA.debugLine="If mResult.Get(\"Accion\")=\"Salir\" Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))),RemoteObject.createImmutable(("Salir")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 130;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 131;BA.debugLine="SalirForm";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.docU.cseleccionproveedornav.class, "_salirform" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 134;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(32);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 135;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(ls";
Debug.ShouldStop(64);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_lstreg.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 136;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "actualizardatos"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 138;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(512);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 139;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(1024);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 140;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(2048);
if (true) break;

case 5:
//if
this.state = 19;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 141;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(4096);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 142;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 143;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "actualizardatos"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 11;
;
 if (true) break;
;
 BA.debugLineNum = 145;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(65536);

case 11:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 146;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 147;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "actualizardatos"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 14;
;
 BA.debugLineNum = 149;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 150;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "actualizardatos"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 14;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 151;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(4194304);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 152;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 153;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 156;BA.debugLine="ExitApplication";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("ExitApplication");
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
 BA.debugLineNum = 159;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _background_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Background_MouseClicked (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,227);
if (RapidSub.canDelegate("background_mouseclicked")) { return __ref.runUserSub(false, "cseleccionproveedornav","background_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 227;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="EventData.Consume";
Debug.ShouldStop(8);
_eventdata.runVoidMethod ("Consume");
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
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cseleccionproveedornav","btnsalir_click", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="SalirForm";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.docU.cseleccionproveedornav.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
cseleccionproveedornav._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cseleccionproveedornav._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private jamTableView1 As jamTableView";
cseleccionproveedornav._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",cseleccionproveedornav._jamtableview1);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
cseleccionproveedornav._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cseleccionproveedornav._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private frm As Form";
cseleccionproveedornav._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cseleccionproveedornav._frm);
 //BA.debugLineNum = 6;BA.debugLine="Private Dialog As B4XDialog";
cseleccionproveedornav._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cseleccionproveedornav._dialog);
 //BA.debugLineNum = 7;BA.debugLine="Private btnSalir As Button";
cseleccionproveedornav._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",cseleccionproveedornav._btnsalir);
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object";
cseleccionproveedornav._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cseleccionproveedornav._mcallback);
 //BA.debugLineNum = 10;BA.debugLine="Private mParent As B4XView";
cseleccionproveedornav._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",cseleccionproveedornav._mparent);
 //BA.debugLineNum = 11;BA.debugLine="Dim Background As B4XView";
cseleccionproveedornav._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",cseleccionproveedornav._background);
 //BA.debugLineNum = 13;BA.debugLine="Dim mDatosProveedorSeleccionado As Map";
cseleccionproveedornav._mdatosproveedorseleccionado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mdatosproveedorseleccionado",cseleccionproveedornav._mdatosproveedorseleccionado);
 //BA.debugLineNum = 15;BA.debugLine="Dim jamLoadingIndicator1 As JamLoadingIndicator";
cseleccionproveedornav._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cseleccionproveedornav._jamloadingindicator1);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _datosproveedoresnav(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DatosProveedoresNav (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("datosproveedoresnav")) { return __ref.runUserSub(false, "cseleccionproveedornav","datosproveedoresnav", __ref);}
ResumableSub_DatosProveedoresNav rsub = new ResumableSub_DatosProveedoresNav(null,__ref);
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
public static class ResumableSub_DatosProveedoresNav extends BA.ResumableSub {
public ResumableSub_DatosProveedoresNav(b4j.docU.cseleccionproveedornav parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseleccionproveedornav parent;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DatosProveedoresNav (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,163);
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
 BA.debugLineNum = 164;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(8);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 165;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(16);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 166;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(32);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 167;BA.debugLine="Dim mResult As Map";
Debug.ShouldStop(64);
_mresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mResult", _mresult);
 BA.debugLineNum = 168;BA.debugLine="mResult.Initialize";
Debug.ShouldStop(128);
_mresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 169;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(256);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 170;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
Debug.ShouldStop(512);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstregistros.getObject())));
 BA.debugLineNum = 171;BA.debugLine="Dim Comando As String";
Debug.ShouldStop(1024);
_comando = RemoteObject.createImmutable("");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 172;BA.debugLine="Comando=\"ProveedoresSeleccionNAV\"";
Debug.ShouldStop(2048);
_comando = BA.ObjectToString("ProveedoresSeleccionNAV");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 174;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
Debug.ShouldStop(8192);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 175;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "datosproveedoresnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 176;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 177;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 178;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 179;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "datosproveedoresnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 180;BA.debugLine="Accion=\"Error\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("Error");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 181;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(1048576);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 183;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 184;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 185;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos registrados de Proveedores NAV")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 186;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "datosproveedoresnav"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 187;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 188;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(134217728);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 190;BA.debugLine="lstRegistros=mResult.Get(\"lstRes\")";
Debug.ShouldStop(536870912);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 191;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 192;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(-2147483648);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 193;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
Debug.ShouldStop(1);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstregistros.getObject())));
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
 BA.debugLineNum = 196;BA.debugLine="Return mResult";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 BA.debugLineNum = 197;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cseleccionproveedornav","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 95;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="EventData.Consume";
Debug.ShouldStop(-2147483648);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Initialize (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cseleccionproveedornav","initialize", __ref, _ba, _callback, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="mCallBack=CallBack";
Debug.ShouldStop(536870912);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 31;BA.debugLine="mParent=Parent";
Debug.ShouldStop(1073741824);
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 32;BA.debugLine="Background= xui.CreatePanel(\"BackgroundSeleccionP";
Debug.ShouldStop(-2147483648);
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("BackgroundSeleccionProveedor"))));
 BA.debugLineNum = 33;BA.debugLine="Background.Tag = \"BackgroundSeleccionProveedor\"";
Debug.ShouldStop(1);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("BackgroundSeleccionProveedor")));
 BA.debugLineNum = 34;BA.debugLine="Background.Color=0xaa000000";
Debug.ShouldStop(2);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 35;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.ShouldStop(4);
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 37;BA.debugLine="mDatosProveedorSeleccionado.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_mdatosproveedorseleccionado" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="mDatosProveedorSeleccionado.Put(\"Proveedor\",\"\")";
Debug.ShouldStop(32);
__ref.getField(false,"_mdatosproveedorseleccionado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Proveedor"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 39;BA.debugLine="mDatosProveedorSeleccionado.Put(\"NombreProveedor\"";
Debug.ShouldStop(64);
__ref.getField(false,"_mdatosproveedorseleccionado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreProveedor"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 41;BA.debugLine="Show";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.docU.cseleccionproveedornav.class, "_show" /*void*/ );
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableview1_accionsalirjamtableview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { __ref.runUserSub(false, "cseleccionproveedornav","jamtableview1_accionsalirjamtableview", __ref); return;}
ResumableSub_jamTableView1_AccionSalirJamTableView rsub = new ResumableSub_jamTableView1_AccionSalirJamTableView(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableView1_AccionSalirJamTableView extends BA.ResumableSub {
public ResumableSub_jamTableView1_AccionSalirJamTableView(b4j.docU.cseleccionproveedornav parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseleccionproveedornav parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,111);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 112;BA.debugLine="If mDatosProveedorSeleccionado.Get(\"Proveedor\")=\"";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mdatosproveedorseleccionado" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Proveedor")))),RemoteObject.createImmutable(("")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 113;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No se ha s";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No se ha seleccionado Proveedor."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Salir sin seleccionar?"))),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 114;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "jamtableview1_accionsalirjamtableview"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 115;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(262144);
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
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 117;BA.debugLine="SalirForm";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cseleccionproveedornav.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 118;BA.debugLine="End Sub";
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
public static RemoteObject  _jamtableview1_celldobleclick(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_CellDobleClick (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("jamtableview1_celldobleclick")) { return __ref.runUserSub(false, "cseleccionproveedornav","jamtableview1_celldobleclick", __ref, _datosceldaseleccionada);}
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 215;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="SeleccionarProveedor(DatosCeldaSeleccionada)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.cseleccionproveedornav.class, "_seleccionarproveedor" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada));
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { __ref.runUserSub(false, "cseleccionproveedornav","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem); return;}
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
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.cseleccionproveedornav parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseleccionproveedornav parent;
RemoteObject _tagmenuitem;
RemoteObject _fsel = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _dcs = RemoteObject.declareNull("b4j.docU.jamtableview._datosceldaseleccionadajamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,199);
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
 BA.debugLineNum = 200;BA.debugLine="Select TagMenuItem";
Debug.ShouldStop(128);
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("SeleccionarProveedor"))) {
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
this.state = 10;
 BA.debugLineNum = 202;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.cseleccionproveedornav.class, "_actualizardatos" /*void*/ );
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 204;BA.debugLine="Dim fSel As Int=jamTableView1.GetIndiceFilaSele";
Debug.ShouldStop(2048);
_fsel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("fSel", _fsel);Debug.locals.put("fSel", _fsel);
 BA.debugLineNum = 205;BA.debugLine="If fSel=-1 Then";
Debug.ShouldStop(4096);
if (true) break;

case 6:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_fsel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 206;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha se";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha seleccionado ninguna fila")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 207;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 9;
;
 BA.debugLineNum = 208;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 210;BA.debugLine="Dim Dcs As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(131072);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaseleccionada" /*RemoteObject*/ );Debug.locals.put("Dcs", _dcs);Debug.locals.put("Dcs", _dcs);
 BA.debugLineNum = 211;BA.debugLine="SeleccionarProveedor(Dcs)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.cseleccionproveedornav.class, "_seleccionarproveedor" /*RemoteObject*/ ,(Object)(_dcs));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 213;BA.debugLine="End Sub";
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
public static RemoteObject  _salirform(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirForm (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("salirform")) { return __ref.runUserSub(false, "cseleccionproveedornav","salirform", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Sub SalirForm";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 105;BA.debugLine="jamTableView1.LimpiarTabla";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 106;BA.debugLine="Background.RemoveViewFromParent";
Debug.ShouldStop(512);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 107;BA.debugLine="frm.Close";
Debug.ShouldStop(1024);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 108;BA.debugLine="CallSubDelayed2(mCallBack,\"cSeleccionProveedorNAV";
Debug.ShouldStop(2048);
cseleccionproveedornav.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("cSeleccionProveedorNAV_Done")),(Object)((__ref.getField(false,"_mdatosproveedorseleccionado" /*RemoteObject*/ ))));
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
public static RemoteObject  _seleccionarproveedor(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarProveedor (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,219);
if (RapidSub.canDelegate("seleccionarproveedor")) { return __ref.runUserSub(false, "cseleccionproveedornav","seleccionarproveedor", __ref, _datosceldaseleccionada);}
RemoteObject _mdatapk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nombreproveedor = RemoteObject.createImmutable("");
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 219;BA.debugLine="Sub SeleccionarProveedor(DatosCeldaSeleccionada As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 220;BA.debugLine="Dim mDataPK As Map=DatosCeldaSeleccionada.mDataPK";
Debug.ShouldStop(134217728);
_mdatapk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdatapk = _datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mDataPK", _mdatapk);Debug.locals.put("mDataPK", _mdatapk);
 BA.debugLineNum = 221;BA.debugLine="mDatosProveedorSeleccionado.Put(\"Proveedor\",mData";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mdatosproveedorseleccionado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Proveedor"))),(Object)(_mdatapk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Proveedor"))))));
 BA.debugLineNum = 222;BA.debugLine="Dim NombreProveedor As String=jamTableView1.GetVa";
Debug.ShouldStop(536870912);
_nombreproveedor = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("NombreProveedor"))));Debug.locals.put("NombreProveedor", _nombreproveedor);Debug.locals.put("NombreProveedor", _nombreproveedor);
 BA.debugLineNum = 223;BA.debugLine="mDatosProveedorSeleccionado.Put(\"NombreProveedor\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mdatosproveedorseleccionado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreProveedor"))),(Object)((_nombreproveedor)));
 BA.debugLineNum = 224;BA.debugLine="SalirForm";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cseleccionproveedornav.class, "_salirform" /*RemoteObject*/ );
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
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cseleccionproveedornav","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cseleccionproveedornav parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseleccionproveedornav parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cseleccionproveedornav) ","cseleccionproveedornav",47,__ref.getField(false, "ba"),__ref,44);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 45;BA.debugLine="If Not(frm.IsInitialized) Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 47;BA.debugLine="frm.Initialize(\"frm\",-1,-1)";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 49;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(65536);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 50;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"sta";
Debug.ShouldStop(131072);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 51;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(262144);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 53;BA.debugLine="frm.RootPane.LoadLayout(\"scrSeleccionProveedorNA";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrSeleccionProveedorNAV")));
 BA.debugLineNum = 55;BA.debugLine="Sleep(0)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "show"),BA.numberCast(int.class, 0));
this.state = 9;
return;
case 9:
//C
this.state = 4;
;
 BA.debugLineNum = 57;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 59;BA.debugLine="frm.Title=\"Selección Proveedor NAV\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",BA.ObjectToString("Selección Proveedor NAV"));
 BA.debugLineNum = 61;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 62;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 63;BA.debugLine="frm.Show";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 65;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuB";
Debug.ShouldStop(1);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 66;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuB";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 68;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
Debug.ShouldStop(8);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 70;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configura";
Debug.ShouldStop(32);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaProveedoresNAV.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 71;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "show"), _rsub);
this.state = 10;
return;
case 10:
//C
this.state = 4;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 73;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 74;BA.debugLine="Log(mRes)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","8101056542",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 75;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 76;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 77;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionproveedornav", "show"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 7;
;
 BA.debugLineNum = 78;BA.debugLine="SalirForm";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.docU.cseleccionproveedornav.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 82;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenu";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Seleccionar Proveedor")),(Object)(BA.ObjectToString("SeleccionarProveedor")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0a4)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 84;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
Debug.ShouldStop(524288);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("cF", _cf);
 BA.debugLineNum = 85;BA.debugLine="cF.Initialize";
Debug.ShouldStop(1048576);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 86;BA.debugLine="cF.AliasCampoColumna=\"Bloqueado\"";
Debug.ShouldStop(2097152);
_cf.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("Bloqueado"));
 BA.debugLineNum = 87;BA.debugLine="cF.CellFactoryEnCallBack=False";
Debug.ShouldStop(4194304);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 88;BA.debugLine="cF.NombreFuncionCellFactory=jamTableView1.CellFa";
Debug.ShouldStop(8388608);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_cellfactory_columnabooleanatipointegercheckbox" /*RemoteObject*/ ));
 BA.debugLineNum = 89;BA.debugLine="jamTableView1.SetCellFactory(cF)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactory" /*RemoteObject*/ ,(Object)(_cf));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 92;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.cseleccionproveedornav.class, "_actualizardatos" /*void*/ );
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