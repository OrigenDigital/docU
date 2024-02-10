package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class canalisistarifasinfocompras_subs_0 {


public static RemoteObject  _background_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Background_MouseClicked (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("background_mouseclicked")) { return __ref.runUserSub(false, "canalisistarifasinfocompras","background_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 289;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
Debug.ShouldStop(1);
 BA.debugLineNum = 290;BA.debugLine="EventData.Consume";
Debug.ShouldStop(2);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("btnSalir_Click (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "canalisistarifasinfocompras","btnsalir_click", __ref);}
 BA.debugLineNum = 140;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="SalirForm";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.canalisistarifasinfocompras.class, "_salirform" /*RemoteObject*/ );
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
canalisistarifasinfocompras._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",canalisistarifasinfocompras._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private jamTableView1 As jamTableView";
canalisistarifasinfocompras._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",canalisistarifasinfocompras._jamtableview1);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
canalisistarifasinfocompras._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",canalisistarifasinfocompras._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private frm As Form";
canalisistarifasinfocompras._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",canalisistarifasinfocompras._frm);
 //BA.debugLineNum = 6;BA.debugLine="Private Dialog As B4XDialog";
canalisistarifasinfocompras._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",canalisistarifasinfocompras._dialog);
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object";
canalisistarifasinfocompras._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",canalisistarifasinfocompras._mcallback);
 //BA.debugLineNum = 10;BA.debugLine="Private mParent As B4XView";
canalisistarifasinfocompras._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",canalisistarifasinfocompras._mparent);
 //BA.debugLineNum = 11;BA.debugLine="Dim Background As B4XView";
canalisistarifasinfocompras._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",canalisistarifasinfocompras._background);
 //BA.debugLineNum = 13;BA.debugLine="Dim mDatosLineaSeleccionada As Map";
canalisistarifasinfocompras._mdatoslineaseleccionada = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mdatoslineaseleccionada",canalisistarifasinfocompras._mdatoslineaseleccionada);
 //BA.debugLineNum = 15;BA.debugLine="Dim mTipoTarifa As Int";
canalisistarifasinfocompras._mtipotarifa = RemoteObject.createImmutable(0);__ref.setField("_mtipotarifa",canalisistarifasinfocompras._mtipotarifa);
 //BA.debugLineNum = 16;BA.debugLine="Dim mCodigoTarifa As String";
canalisistarifasinfocompras._mcodigotarifa = RemoteObject.createImmutable("");__ref.setField("_mcodigotarifa",canalisistarifasinfocompras._mcodigotarifa);
 //BA.debugLineNum = 17;BA.debugLine="Dim mArticulo As String";
canalisistarifasinfocompras._marticulo = RemoteObject.createImmutable("");__ref.setField("_marticulo",canalisistarifasinfocompras._marticulo);
 //BA.debugLineNum = 18;BA.debugLine="Dim mDescripcionArticulo As String";
canalisistarifasinfocompras._mdescripcionarticulo = RemoteObject.createImmutable("");__ref.setField("_mdescripcionarticulo",canalisistarifasinfocompras._mdescripcionarticulo);
 //BA.debugLineNum = 19;BA.debugLine="Dim mFechaInicialVentas, mFechaFinalVentas As Lon";
canalisistarifasinfocompras._mfechainicialventas = RemoteObject.createImmutable(0L);__ref.setField("_mfechainicialventas",canalisistarifasinfocompras._mfechainicialventas);
canalisistarifasinfocompras._mfechafinalventas = RemoteObject.createImmutable(0L);__ref.setField("_mfechafinalventas",canalisistarifasinfocompras._mfechafinalventas);
 //BA.debugLineNum = 21;BA.debugLine="Private btnSalir As Button";
canalisistarifasinfocompras._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",canalisistarifasinfocompras._btnsalir);
 //BA.debugLineNum = 22;BA.debugLine="Private txtArticulo As TextField";
canalisistarifasinfocompras._txtarticulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtarticulo",canalisistarifasinfocompras._txtarticulo);
 //BA.debugLineNum = 23;BA.debugLine="Private txtDescripcionArticulo As TextField";
canalisistarifasinfocompras._txtdescripcionarticulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdescripcionarticulo",canalisistarifasinfocompras._txtdescripcionarticulo);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _datoscompraarticulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DatosCompraArticulo (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("datoscompraarticulo")) { return __ref.runUserSub(false, "canalisistarifasinfocompras","datoscompraarticulo", __ref);}
ResumableSub_DatosCompraArticulo rsub = new ResumableSub_DatosCompraArticulo(null,__ref);
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
public static class ResumableSub_DatosCompraArticulo extends BA.ResumableSub {
public ResumableSub_DatosCompraArticulo(b4j.docU.canalisistarifasinfocompras parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasinfocompras parent;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _sfechainicialcompras = RemoteObject.createImmutable("");
RemoteObject _sfechafinalcompras = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DatosCompraArticulo (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,201);
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
 BA.debugLineNum = 202;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(512);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 203;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(1024);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 204;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2048);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 205;BA.debugLine="Dim mResult As Map";
Debug.ShouldStop(4096);
_mresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mResult", _mresult);
 BA.debugLineNum = 206;BA.debugLine="mResult.Initialize";
Debug.ShouldStop(8192);
_mresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 207;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(16384);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 208;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
Debug.ShouldStop(32768);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstregistros.getObject())));
 BA.debugLineNum = 209;BA.debugLine="Dim Comando As String=\"AnalisisTarifasInfoCompras";
Debug.ShouldStop(65536);
_comando = BA.ObjectToString("AnalisisTarifasInfoComprasArticulo");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 210;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(131072);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 211;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(262144);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 212;BA.debugLine="Dim sFechaInicialCompras As String=DateTime.Date(";
Debug.ShouldStop(524288);
_sfechainicialcompras = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_mfechainicialventas" /*RemoteObject*/ )));Debug.locals.put("sFechaInicialCompras", _sfechainicialcompras);Debug.locals.put("sFechaInicialCompras", _sfechainicialcompras);
 BA.debugLineNum = 213;BA.debugLine="Dim sFechaFinalCompras As String=DateTime.Date(mF";
Debug.ShouldStop(1048576);
_sfechafinalcompras = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_mfechafinalventas" /*RemoteObject*/ )));Debug.locals.put("sFechaFinalCompras", _sfechafinalcompras);Debug.locals.put("sFechaFinalCompras", _sfechafinalcompras);
 BA.debugLineNum = 214;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(2097152);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 216;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(8388608);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(__ref.getField(true,"_marticulo" /*RemoteObject*/ )),(_sfechainicialcompras),(_sfechafinalcompras)})),(Object)(__ref));
 BA.debugLineNum = 217;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "datoscompraarticulo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 219;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 220;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 221;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "datoscompraarticulo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 222;BA.debugLine="Accion=\"Error\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("Error");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 223;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(1073741824);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 225;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 226;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos registrados de compras para el artículo seleccionados")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 227;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "datoscompraarticulo"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 228;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 229;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(16);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 231;BA.debugLine="lstRegistros=mResult.Get(\"lstRes\")";
Debug.ShouldStop(64);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 232;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 233;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(256);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 234;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 237;BA.debugLine="Return mResult";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 BA.debugLineNum = 238;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "canalisistarifasinfocompras","frm_closerequest", __ref, _eventdata);}
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
public static void  _inicio(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Inicio (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("inicio")) { __ref.runUserSub(false, "canalisistarifasinfocompras","inicio", __ref); return;}
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
public ResumableSub_Inicio(b4j.docU.canalisistarifasinfocompras parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasinfocompras parent;
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Inicio (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,162);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 164;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
Debug.ShouldStop(8);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 165;BA.debugLine="wait for(DatosCompraArticulo) complete (mResult A";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "inicio"), __ref.runClassMethod (b4j.docU.canalisistarifasinfocompras.class, "_datoscompraarticulo" /*RemoteObject*/ ));
this.state = 20;
return;
case 20:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 166;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 167;BA.debugLine="If mResult.Get(\"Accion\")<>\"Continuar\" Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))),RemoteObject.createImmutable(("Continuar")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 168;BA.debugLine="SalirForm";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.canalisistarifasinfocompras.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 169;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 172;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 174;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8192);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 175;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(ls";
Debug.ShouldStop(16384);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_lstreg.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 176;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "inicio"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 177;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 178;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(131072);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 179;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 180;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 181;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 182;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "inicio"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 11;
;
 if (true) break;
;
 BA.debugLineNum = 184;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(8388608);

case 11:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 185;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 186;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "inicio"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 14;
;
 BA.debugLineNum = 188;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 189;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "inicio"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 14;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 190;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 191;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 192;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 195;BA.debugLine="ExitApplication";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 198;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _parent,RemoteObject _articulo,RemoteObject _descripcionarticulo,RemoteObject _fechainicialventas,RemoteObject _fechafinalventas) throws Exception{
try {
		Debug.PushSubsStack("Initialize (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "canalisistarifasinfocompras","initialize", __ref, _ba, _callback, _parent, _articulo, _descripcionarticulo, _fechainicialventas, _fechafinalventas);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Parent", _parent);
Debug.locals.put("Articulo", _articulo);
Debug.locals.put("DescripcionArticulo", _descripcionarticulo);
Debug.locals.put("FechaInicialVentas", _fechainicialventas);
Debug.locals.put("FechaFinalVentas", _fechafinalventas);
 BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
Debug.ShouldStop(1);
 BA.debugLineNum = 36;BA.debugLine="mCallBack=CallBack";
Debug.ShouldStop(8);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 37;BA.debugLine="mParent=Parent";
Debug.ShouldStop(16);
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 38;BA.debugLine="Background= xui.CreatePanel(\"background\")";
Debug.ShouldStop(32);
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("background"))));
 BA.debugLineNum = 39;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
Debug.ShouldStop(64);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("b4xdialog_background")));
 BA.debugLineNum = 40;BA.debugLine="Background.Color=0xaa000000";
Debug.ShouldStop(128);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 41;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.ShouldStop(256);
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 43;BA.debugLine="mArticulo=Articulo";
Debug.ShouldStop(1024);
__ref.setField ("_marticulo" /*RemoteObject*/ ,_articulo);
 BA.debugLineNum = 44;BA.debugLine="mDescripcionArticulo=DescripcionArticulo";
Debug.ShouldStop(2048);
__ref.setField ("_mdescripcionarticulo" /*RemoteObject*/ ,_descripcionarticulo);
 BA.debugLineNum = 45;BA.debugLine="mFechaInicialVentas=FechaInicialVentas";
Debug.ShouldStop(4096);
__ref.setField ("_mfechainicialventas" /*RemoteObject*/ ,_fechainicialventas);
 BA.debugLineNum = 46;BA.debugLine="mFechaFinalVentas=FechaFinalVentas";
Debug.ShouldStop(8192);
__ref.setField ("_mfechafinalventas" /*RemoteObject*/ ,_fechafinalventas);
 BA.debugLineNum = 48;BA.debugLine="mDatosLineaSeleccionada.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_mdatoslineaseleccionada" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioSeleccionado\",";
Debug.ShouldStop(65536);
__ref.getField(false,"_mdatoslineaseleccionada" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("PrecioSeleccionado"))),(Object)((canalisistarifasinfocompras.__c.getField(true,"False"))));
 BA.debugLineNum = 54;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioDivisa\",0)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mdatoslineaseleccionada" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("PrecioDivisa"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 55;BA.debugLine="mDatosLineaSeleccionada.Put(\"Divisa\",\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mdatoslineaseleccionada" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Divisa"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 56;BA.debugLine="Show";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.canalisistarifasinfocompras.class, "_show" /*void*/ );
 BA.debugLineNum = 57;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { return __ref.runUserSub(false, "canalisistarifasinfocompras","jamtableview1_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 152;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 158;BA.debugLine="SalirForm";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.canalisistarifasinfocompras.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableview1_celldobleclick(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_CellDobleClick (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("jamtableview1_celldobleclick")) { __ref.runUserSub(false, "canalisistarifasinfocompras","jamtableview1_celldobleclick", __ref, _datosceldaseleccionada); return;}
ResumableSub_jamTableView1_CellDobleClick rsub = new ResumableSub_jamTableView1_CellDobleClick(null,__ref,_datosceldaseleccionada);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableView1_CellDobleClick extends BA.ResumableSub {
public ResumableSub_jamTableView1_CellDobleClick(b4j.docU.canalisistarifasinfocompras parent,RemoteObject __ref,RemoteObject _datosceldaseleccionada) {
this.parent = parent;
this.__ref = __ref;
this._datosceldaseleccionada = _datosceldaseleccionada;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasinfocompras parent;
RemoteObject _datosceldaseleccionada;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_CellDobleClick (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,256);
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
 BA.debugLineNum = 257;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Añadir los";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Añadir los datos de la línea como precio compra usuario?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 258;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "jamtableview1_celldobleclick"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 259;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(4);
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
this.state = -1;
;
 BA.debugLineNum = 260;BA.debugLine="SeleccionarDatosPrecioCompraUsuarioLinea(DatosCel";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.docU.canalisistarifasinfocompras.class, "_seleccionardatospreciocomprausuariolinea" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada));
 BA.debugLineNum = 261;BA.debugLine="End Sub";
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
public static RemoteObject  _jamtableview1_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("jamtableview1_contextmenuitem_action")) { return __ref.runUserSub(false, "canalisistarifasinfocompras","jamtableview1_contextmenuitem_action", __ref, _tagmenuitem);}
RemoteObject _dcs = RemoteObject.declareNull("b4j.docU.jamtableview._datosceldaseleccionadajamtableview");
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 263;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("AddPrecioCompraUsuarioLineaSeleccionada"))) {
case 0: {
 BA.debugLineNum = 266;BA.debugLine="Dim Dcs As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(512);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaseleccionada" /*RemoteObject*/ );Debug.locals.put("Dcs", _dcs);Debug.locals.put("Dcs", _dcs);
 BA.debugLineNum = 267;BA.debugLine="SeleccionarDatosPrecioCompraUsuarioLinea(Dcs)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.docU.canalisistarifasinfocompras.class, "_seleccionardatospreciocomprausuariolinea" /*RemoteObject*/ ,(Object)(_dcs));
 break; }
}
;
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { __ref.runUserSub(false, "canalisistarifasinfocompras","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem); return;}
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
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.canalisistarifasinfocompras parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasinfocompras parent;
RemoteObject _tagmenuitem;
RemoteObject _fsel = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _dcs = RemoteObject.declareNull("b4j.docU.jamtableview._datosceldaseleccionadajamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,240);
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
 BA.debugLineNum = 241;BA.debugLine="Select TagMenuItem";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("AddPrecioCompraUsuarioLineaSeleccionada"))) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 245;BA.debugLine="Dim fSel As Int=jamTableView1.GetIndiceFilaSele";
Debug.ShouldStop(1048576);
_fsel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("fSel", _fsel);Debug.locals.put("fSel", _fsel);
 BA.debugLineNum = 246;BA.debugLine="If fSel=-1 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_fsel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 247;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha se";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha seleccionado ninguna fila")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 248;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 7;
;
 BA.debugLineNum = 249;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 251;BA.debugLine="Dim Dcs As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(67108864);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaseleccionada" /*RemoteObject*/ );Debug.locals.put("Dcs", _dcs);Debug.locals.put("Dcs", _dcs);
 BA.debugLineNum = 252;BA.debugLine="SeleccionarDatosPrecioCompraUsuarioLinea(Dcs)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.canalisistarifasinfocompras.class, "_seleccionardatospreciocomprausuariolinea" /*RemoteObject*/ ,(Object)(_dcs));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 254;BA.debugLine="End Sub";
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
public static RemoteObject  _salirform(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirForm (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("salirform")) { return __ref.runUserSub(false, "canalisistarifasinfocompras","salirform", __ref);}
 BA.debugLineNum = 144;BA.debugLine="Sub SalirForm";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 146;BA.debugLine="jamTableView1.LimpiarTabla";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 147;BA.debugLine="Background.RemoveViewFromParent";
Debug.ShouldStop(262144);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 148;BA.debugLine="frm.Close";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 149;BA.debugLine="CallSubDelayed2(mCallBack,\"cAnalisisTarifasInfoCo";
Debug.ShouldStop(1048576);
canalisistarifasinfocompras.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("cAnalisisTarifasInfoCompras_Done")),(Object)((__ref.getField(false,"_mdatoslineaseleccionada" /*RemoteObject*/ ))));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seleccionardatospreciocomprausuariolinea(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDatosPrecioCompraUsuarioLinea (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("seleccionardatospreciocomprausuariolinea")) { return __ref.runUserSub(false, "canalisistarifasinfocompras","seleccionardatospreciocomprausuariolinea", __ref, _datosceldaseleccionada);}
RemoteObject _divisa = RemoteObject.createImmutable("");
RemoteObject _preciodivisa = RemoteObject.createImmutable(0);
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 271;BA.debugLine="Sub SeleccionarDatosPrecioCompraUsuarioLinea(Datos";
Debug.ShouldStop(16384);
 BA.debugLineNum = 273;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioSeleccionado\",";
Debug.ShouldStop(65536);
__ref.getField(false,"_mdatoslineaseleccionada" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("PrecioSeleccionado"))),(Object)((canalisistarifasinfocompras.__c.getField(true,"True"))));
 BA.debugLineNum = 282;BA.debugLine="Dim Divisa As String=jamTableView1.GetValorSQLCam";
Debug.ShouldStop(33554432);
_divisa = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Divisa"))));Debug.locals.put("Divisa", _divisa);Debug.locals.put("Divisa", _divisa);
 BA.debugLineNum = 283;BA.debugLine="mDatosLineaSeleccionada.Put(\"Divisa\",Divisa)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mdatoslineaseleccionada" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Divisa"))),(Object)((_divisa)));
 BA.debugLineNum = 284;BA.debugLine="Dim PrecioDivisa As Double=jamTableView1.GetValor";
Debug.ShouldStop(134217728);
_preciodivisa = BA.numberCast(double.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("PrecioCompraDivisa"))));Debug.locals.put("PrecioDivisa", _preciodivisa);Debug.locals.put("PrecioDivisa", _preciodivisa);
 BA.debugLineNum = 285;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioDivisa\",Precio";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mdatoslineaseleccionada" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("PrecioDivisa"))),(Object)((_preciodivisa)));
 BA.debugLineNum = 286;BA.debugLine="SalirForm";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.canalisistarifasinfocompras.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Show (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "canalisistarifasinfocompras","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.canalisistarifasinfocompras parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasinfocompras parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (canalisistarifasinfocompras) ","canalisistarifasinfocompras",19,__ref.getField(false, "ba"),__ref,59);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 62;BA.debugLine="frm.Initialize(\"frm\",-1,-1)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 64;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(-2147483648);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 65;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(1);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 66;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(2);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 68;BA.debugLine="frm.RootPane.LoadLayout(\"scrAnalisisTarifasInfoCo";
Debug.ShouldStop(8);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrAnalisisTarifasInfoCompras")));
 BA.debugLineNum = 70;BA.debugLine="Sleep(0)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "show"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 72;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(128);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 74;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    Info Comp";
Debug.ShouldStop(512);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("    Info Compras Periodo")));
 BA.debugLineNum = 78;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(8192);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 79;BA.debugLine="frm.Show";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 82;BA.debugLine="txtArticulo.Text=mArticulo";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtarticulo" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_marticulo" /*RemoteObject*/ ));
 BA.debugLineNum = 83;BA.debugLine="txtDescripcionArticulo.Text=mDescripcionArticulo";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtdescripcionarticulo" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_mdescripcionarticulo" /*RemoteObject*/ ));
 BA.debugLineNum = 89;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 90;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 92;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 94;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(536870912);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaAnalisisTarifasInfoComprasArticulo.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 95;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 100;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
Debug.ShouldStop(8);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
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
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasinfocompras", "show"), _msa);
this.state = 7;
return;
case 7:
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
this.state = -1;
;
 BA.debugLineNum = 109;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Añadir Precio Seleccionado a Lista Precios Compra Usuario")),(Object)(BA.ObjectToString("AddPrecioCompraUsuarioLineaSeleccionada")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0a4)))))),(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )));
 BA.debugLineNum = 111;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 112;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Añadir Precio Seleccionado a Lista Precios Compra Usuario")),(Object)(BA.ObjectToString("AddPrecioCompraUsuarioLineaSeleccionada")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0a4)))))));
 BA.debugLineNum = 114;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
Debug.ShouldStop(131072);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("cF", _cf);
 BA.debugLineNum = 115;BA.debugLine="cF.Initialize";
Debug.ShouldStop(262144);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 116;BA.debugLine="cF.AliasCampoColumna=\"FechaRegistro\"";
Debug.ShouldStop(524288);
_cf.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("FechaRegistro"));
 BA.debugLineNum = 117;BA.debugLine="cF.CellFactoryEnCallBack=False";
Debug.ShouldStop(1048576);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 118;BA.debugLine="cF.NombreFuncionCellFactory=jamTableView1.CellFac";
Debug.ShouldStop(2097152);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_cellfactory_columnafecha" /*RemoteObject*/ ));
 BA.debugLineNum = 119;BA.debugLine="jamTableView1.SetCellFactory(cF)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactory" /*RemoteObject*/ ,(Object)(_cf));
 BA.debugLineNum = 133;BA.debugLine="Inicio";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.canalisistarifasinfocompras.class, "_inicio" /*void*/ );
 BA.debugLineNum = 134;BA.debugLine="End Sub";
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
}