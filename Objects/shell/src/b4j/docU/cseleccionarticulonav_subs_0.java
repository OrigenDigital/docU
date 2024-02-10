package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cseleccionarticulonav_subs_0 {


public static RemoteObject  _background_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Background_MouseClicked (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("background_mouseclicked")) { return __ref.runUserSub(false, "cseleccionarticulonav","background_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 231;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="EventData.Consume";
Debug.ShouldStop(128);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("btnSalir_Click (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cseleccionarticulonav","btnsalir_click", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="SalirForm";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.docU.cseleccionarticulonav.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
cseleccionarticulonav._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cseleccionarticulonav._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private jamTableView1 As jamTableView";
cseleccionarticulonav._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",cseleccionarticulonav._jamtableview1);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
cseleccionarticulonav._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cseleccionarticulonav._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private frm As Form";
cseleccionarticulonav._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cseleccionarticulonav._frm);
 //BA.debugLineNum = 6;BA.debugLine="Private Dialog As B4XDialog";
cseleccionarticulonav._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cseleccionarticulonav._dialog);
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object";
cseleccionarticulonav._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cseleccionarticulonav._mcallback);
 //BA.debugLineNum = 10;BA.debugLine="Private mParent As B4XView";
cseleccionarticulonav._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",cseleccionarticulonav._mparent);
 //BA.debugLineNum = 11;BA.debugLine="Dim Background As B4XView";
cseleccionarticulonav._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",cseleccionarticulonav._background);
 //BA.debugLineNum = 13;BA.debugLine="Dim mDatosArticuloSeleccionado As Map";
cseleccionarticulonav._mdatosarticuloseleccionado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mdatosarticuloseleccionado",cseleccionarticulonav._mdatosarticuloseleccionado);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _datosarticulosnav(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DatosArticulosNav (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("datosarticulosnav")) { return __ref.runUserSub(false, "cseleccionarticulonav","datosarticulosnav", __ref);}
ResumableSub_DatosArticulosNav rsub = new ResumableSub_DatosArticulosNav(null,__ref);
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
public static class ResumableSub_DatosArticulosNav extends BA.ResumableSub {
public ResumableSub_DatosArticulosNav(b4j.docU.cseleccionarticulonav parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseleccionarticulonav parent;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DatosArticulosNav (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,156);
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
 BA.debugLineNum = 157;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(268435456);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 158;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(536870912);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 159;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1073741824);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 160;BA.debugLine="Dim mResult As Map";
Debug.ShouldStop(-2147483648);
_mresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mResult", _mresult);
 BA.debugLineNum = 161;BA.debugLine="mResult.Initialize";
Debug.ShouldStop(1);
_mresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 162;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(2);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 163;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
Debug.ShouldStop(4);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstregistros.getObject())));
 BA.debugLineNum = 164;BA.debugLine="Dim Comando As String";
Debug.ShouldStop(8);
_comando = RemoteObject.createImmutable("");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 165;BA.debugLine="Comando=\"ArticulosSeleccionNAV\"";
Debug.ShouldStop(16);
_comando = BA.ObjectToString("ArticulosSeleccionNAV");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 167;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
Debug.ShouldStop(64);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 168;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "datosarticulosnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 170;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 171;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 172;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "datosarticulosnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 173;BA.debugLine="Accion=\"Error\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("Error");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 174;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(8192);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 176;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 177;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos registrados de Artículos NAV")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 178;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "datosarticulosnav"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 179;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 180;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(524288);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 182;BA.debugLine="lstRegistros=mResult.Get(\"lstRes\")";
Debug.ShouldStop(2097152);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 183;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 184;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(8388608);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 185;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 188;BA.debugLine="Return mResult";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 BA.debugLineNum = 189;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cseleccionarticulonav","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 94;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="EventData.Consume";
Debug.ShouldStop(1073741824);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _inicio(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Inicio (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("inicio")) { __ref.runUserSub(false, "cseleccionarticulonav","inicio", __ref); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.cseleccionarticulonav parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseleccionarticulonav parent;
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Inicio (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,120);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 122;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 123;BA.debugLine="wait for(DatosArticulosNav) complete (mResult As";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "inicio"), __ref.runClassMethod (b4j.docU.cseleccionarticulonav.class, "_datosarticulosnav" /*RemoteObject*/ ));
this.state = 20;
return;
case 20:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 124;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 125;BA.debugLine="If mResult.Get(\"Accion\")=\"Salir\" Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 126;BA.debugLine="SalirForm";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cseleccionarticulonav.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 127;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 129;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
Debug.ShouldStop(1);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 130;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(2);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 131;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(ls";
Debug.ShouldStop(4);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_lstreg.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 132;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "inicio"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 133;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 134;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(32);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 135;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 136;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 137;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 138;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "inicio"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 11;
;
 if (true) break;
;
 BA.debugLineNum = 140;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(2048);

case 11:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 141;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 142;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "inicio"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 14;
;
 BA.debugLineNum = 144;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 145;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "inicio"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 14;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 146;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 147;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 148;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 151;BA.debugLine="ExitApplication";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 154;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cseleccionarticulonav","initialize", __ref, _ba, _callback, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="mCallBack=CallBack";
Debug.ShouldStop(134217728);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 29;BA.debugLine="mParent=Parent";
Debug.ShouldStop(268435456);
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 30;BA.debugLine="Background= xui.CreatePanel(\"background\")";
Debug.ShouldStop(536870912);
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("background"))));
 BA.debugLineNum = 31;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("b4xdialog_background")));
 BA.debugLineNum = 32;BA.debugLine="Background.Color=0xaa000000";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 33;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.ShouldStop(1);
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 35;BA.debugLine="mDatosArticuloSeleccionado.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_mdatosarticuloseleccionado" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 36;BA.debugLine="mDatosArticuloSeleccionado.Put(\"Articulo\",\"\")";
Debug.ShouldStop(8);
__ref.getField(false,"_mdatosarticuloseleccionado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Articulo"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 37;BA.debugLine="mDatosArticuloSeleccionado.Put(\"DescripcionArticu";
Debug.ShouldStop(16);
__ref.getField(false,"_mdatosarticuloseleccionado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescripcionArticulo"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 38;BA.debugLine="mDatosArticuloSeleccionado.Put(\"ArticuloBloqueado";
Debug.ShouldStop(32);
__ref.getField(false,"_mdatosarticuloseleccionado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ArticuloBloqueado"))),(Object)((cseleccionarticulonav.__c.getField(true,"False"))));
 BA.debugLineNum = 39;BA.debugLine="Show";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.cseleccionarticulonav.class, "_show" /*void*/ );
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { __ref.runUserSub(false, "cseleccionarticulonav","jamtableview1_accionsalirjamtableview", __ref); return;}
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
public ResumableSub_jamTableView1_AccionSalirJamTableView(b4j.docU.cseleccionarticulonav parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseleccionarticulonav parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,110);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 111;BA.debugLine="If mDatosArticuloSeleccionado.Get(\"Articulo\")=\"\"";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mdatosarticuloseleccionado" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Articulo")))),RemoteObject.createImmutable(("")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 112;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No se ha s";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No se ha seleccionado Artículo."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Salir sin seleccionar?"))),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 113;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "jamtableview1_accionsalirjamtableview"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 114;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 116;BA.debugLine="SalirForm";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.docU.cseleccionarticulonav.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 117;BA.debugLine="End Sub";
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
public static RemoteObject  _jamtableview1_celldobleclick(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_CellDobleClick (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("jamtableview1_celldobleclick")) { return __ref.runUserSub(false, "cseleccionarticulonav","jamtableview1_celldobleclick", __ref, _datosceldaseleccionada);}
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 207;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="SeleccionarArticulo(DatosCeldaSeleccionada)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.cseleccionarticulonav.class, "_seleccionararticulo" /*void*/ ,(Object)(_datosceldaseleccionada));
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { __ref.runUserSub(false, "cseleccionarticulonav","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem); return;}
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
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.cseleccionarticulonav parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseleccionarticulonav parent;
RemoteObject _tagmenuitem;
RemoteObject _fsel = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _dcs = RemoteObject.declareNull("b4j.docU.jamtableview._datosceldaseleccionadajamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,191);
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
 BA.debugLineNum = 192;BA.debugLine="Select TagMenuItem";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("SeleccionarArticulo"))) {
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
 BA.debugLineNum = 194;BA.debugLine="Inicio";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.docU.cseleccionarticulonav.class, "_inicio" /*void*/ );
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 196;BA.debugLine="Dim fSel As Int=jamTableView1.GetIndiceFilaSele";
Debug.ShouldStop(8);
_fsel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("fSel", _fsel);Debug.locals.put("fSel", _fsel);
 BA.debugLineNum = 197;BA.debugLine="If fSel=-1 Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 198;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha se";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha seleccionado ninguna fila")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 199;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 9;
;
 BA.debugLineNum = 200;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 202;BA.debugLine="Dim Dcs As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(512);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaseleccionada" /*RemoteObject*/ );Debug.locals.put("Dcs", _dcs);Debug.locals.put("Dcs", _dcs);
 BA.debugLineNum = 203;BA.debugLine="SeleccionarArticulo(Dcs)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.docU.cseleccionarticulonav.class, "_seleccionararticulo" /*void*/ ,(Object)(_dcs));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 205;BA.debugLine="End Sub";
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
public static RemoteObject  _salirform(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirForm (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("salirform")) { return __ref.runUserSub(false, "cseleccionarticulonav","salirform", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Sub SalirForm";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
Debug.ShouldStop(64);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 104;BA.debugLine="jamTableView1.LimpiarTabla";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 105;BA.debugLine="Background.RemoveViewFromParent";
Debug.ShouldStop(256);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 106;BA.debugLine="frm.Close";
Debug.ShouldStop(512);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 107;BA.debugLine="CallSubDelayed2(mCallBack,\"cSeleccionArticuloNAV_";
Debug.ShouldStop(1024);
cseleccionarticulonav.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("cSeleccionArticuloNAV_Done")),(Object)((__ref.getField(false,"_mdatosarticuloseleccionado" /*RemoteObject*/ ))));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _seleccionararticulo(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarArticulo (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("seleccionararticulo")) { __ref.runUserSub(false, "cseleccionarticulonav","seleccionararticulo", __ref, _datosceldaseleccionada); return;}
ResumableSub_SeleccionarArticulo rsub = new ResumableSub_SeleccionarArticulo(null,__ref,_datosceldaseleccionada);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SeleccionarArticulo extends BA.ResumableSub {
public ResumableSub_SeleccionarArticulo(b4j.docU.cseleccionarticulonav parent,RemoteObject __ref,RemoteObject _datosceldaseleccionada) {
this.parent = parent;
this.__ref = __ref;
this._datosceldaseleccionada = _datosceldaseleccionada;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseleccionarticulonav parent;
RemoteObject _datosceldaseleccionada;
RemoteObject _mdatapk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _descripcionarticulo = RemoteObject.createImmutable("");
RemoteObject _articulobloqueado = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarArticulo (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,211);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 212;BA.debugLine="Dim mDataPK As Map=DatosCeldaSeleccionada.mDataPK";
Debug.ShouldStop(524288);
_mdatapk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdatapk = _datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mDataPK", _mdatapk);Debug.locals.put("mDataPK", _mdatapk);
 BA.debugLineNum = 213;BA.debugLine="mDatosArticuloSeleccionado.Put(\"Articulo\",mDataPK";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mdatosarticuloseleccionado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Articulo"))),(Object)(_mdatapk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Articulo"))))));
 BA.debugLineNum = 214;BA.debugLine="Dim DescripcionArticulo As String=jamTableView1.G";
Debug.ShouldStop(2097152);
_descripcionarticulo = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("DescripcionArticulo"))));Debug.locals.put("DescripcionArticulo", _descripcionarticulo);Debug.locals.put("DescripcionArticulo", _descripcionarticulo);
 BA.debugLineNum = 215;BA.debugLine="mDatosArticuloSeleccionado.Put(\"DescripcionArticu";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mdatosarticuloseleccionado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescripcionArticulo"))),(Object)((_descripcionarticulo)));
 BA.debugLineNum = 216;BA.debugLine="Dim ArticuloBloqueado As Int=jamTableView1.GetVal";
Debug.ShouldStop(8388608);
_articulobloqueado = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Bloqueado"))));Debug.locals.put("ArticuloBloqueado", _articulobloqueado);Debug.locals.put("ArticuloBloqueado", _articulobloqueado);
 BA.debugLineNum = 217;BA.debugLine="mDatosArticuloSeleccionado.Put(\"ArticuloBloqueado";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mdatosarticuloseleccionado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ArticuloBloqueado"))),(Object)((_articulobloqueado)));
 BA.debugLineNum = 218;BA.debugLine="If ArticuloBloqueado=1 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_articulobloqueado,BA.numberCast(double.class, 1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 219;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(67108864);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 220;BA.debugLine="sb.Initialize";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 221;BA.debugLine="sb.Append(\"El artículo seleccionado (\").Append(m";
Debug.ShouldStop(268435456);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("El artículo seleccionado ("))).runMethod(false,"Append",(Object)(BA.ObjectToString(_mdatapk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Articulo"))))))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runMethod(false,"Append",(Object)(_descripcionarticulo)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(") está BLOQUEADO.")));
 BA.debugLineNum = 222;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
Debug.ShouldStop(536870912);
_sb.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 223;BA.debugLine="sb.Append(\"¿Continuar?\")";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("¿Continuar?")));
 BA.debugLineNum = 224;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(sb.ToString";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(_sb.runMethod(true,"ToString")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 225;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "seleccionararticulo"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 226;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 228;BA.debugLine="SalirForm";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.docU.cseleccionarticulonav.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 229;BA.debugLine="End Sub";
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
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cseleccionarticulonav","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cseleccionarticulonav parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cseleccionarticulonav parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cseleccionarticulonav) ","cseleccionarticulonav",46,__ref.getField(false, "ba"),__ref,42);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 45;BA.debugLine="frm.Initialize(\"frm\",-1,-1)";
Debug.ShouldStop(4096);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 47;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(16384);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 48;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"sta";
Debug.ShouldStop(32768);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 49;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(65536);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 51;BA.debugLine="frm.RootPane.LoadLayout(\"scrListaSeleccionArticu";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrListaSeleccionArticuloNAV")));
 BA.debugLineNum = 53;BA.debugLine="Sleep(0)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "show"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 55;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(4194304);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 57;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Selección Ar";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Selección Artículo NAV")));
 BA.debugLineNum = 59;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 60;BA.debugLine="frm.Show";
Debug.ShouldStop(134217728);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 62;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuB";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 63;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuB";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 65;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
Debug.ShouldStop(1);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 67;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configura";
Debug.ShouldStop(4);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaArticulosNAV.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 68;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 70;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
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
 BA.debugLineNum = 73;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 74;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cseleccionarticulonav", "show"), _msa);
this.state = 7;
return;
case 7:
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
this.state = -1;
;
 BA.debugLineNum = 79;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenu";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Seleccionar Articulo")),(Object)(BA.ObjectToString("SeleccionarArticulo")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0a4)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 81;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
Debug.ShouldStop(65536);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("cF", _cf);
 BA.debugLineNum = 82;BA.debugLine="cF.Initialize";
Debug.ShouldStop(131072);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 83;BA.debugLine="cF.AliasCampoColumna=\"Bloqueado\"";
Debug.ShouldStop(262144);
_cf.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("Bloqueado"));
 BA.debugLineNum = 84;BA.debugLine="cF.CellFactoryEnCallBack=False";
Debug.ShouldStop(524288);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 85;BA.debugLine="cF.NombreFuncionCellFactory=jamTableView1.CellFa";
Debug.ShouldStop(1048576);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_cellfactory_columnabooleanatipointegercheckbox" /*RemoteObject*/ ));
 BA.debugLineNum = 86;BA.debugLine="jamTableView1.SetCellFactory(cF)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactory" /*RemoteObject*/ ,(Object)(_cf));
 BA.debugLineNum = 91;BA.debugLine="Inicio";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cseleccionarticulonav.class, "_inicio" /*void*/ );
 BA.debugLineNum = 92;BA.debugLine="End Sub";
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
}