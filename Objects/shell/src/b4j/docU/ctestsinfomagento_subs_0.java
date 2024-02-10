package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ctestsinfomagento_subs_0 {


public static RemoteObject  _actualizardatosmysql(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosMysql (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("actualizardatosmysql")) { return __ref.runUserSub(false, "ctestsinfomagento","actualizardatosmysql", __ref);}
ResumableSub_ActualizarDatosMysql rsub = new ResumableSub_ActualizarDatosMysql(null,__ref);
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
public static class ResumableSub_ActualizarDatosMysql extends BA.ResumableSub {
public ResumableSub_ActualizarDatosMysql(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
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
		Debug.PushSubsStack("ActualizarDatosMysql (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,283);
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
 BA.debugLineNum = 284;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblDatosFormulario";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblDatosFormulario")));
 BA.debugLineNum = 285;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(268435456);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 286;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(536870912);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 287;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 288;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
Debug.ShouldStop(-2147483648);
_slinkjrdc = parent._main._rdclinknav /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 289;BA.debugLine="Dim Comando As String=\"\"";
Debug.ShouldStop(1);
_comando = BA.ObjectToString("");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 290;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
Debug.ShouldStop(2);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 292;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "actualizardatosmysql"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 293;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 294;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 295;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "actualizardatosmysql"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 296;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 297;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 300;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 301;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 302;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 303;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de .............")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 304;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "actualizardatosmysql"), _msa);
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
 BA.debugLineNum = 306;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 307;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 310;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(2097152);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 318;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblDatosFormulario\",ls";
Debug.ShouldStop(536870912);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblDatosFormulario")),(Object)(_lstreg));
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
 BA.debugLineNum = 321;BA.debugLine="Return mRes";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 322;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _alternarexcluidoreclamacion(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("AlternarExcluidoReclamacion (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,425);
if (RapidSub.canDelegate("alternarexcluidoreclamacion")) { return __ref.runUserSub(false, "ctestsinfomagento","alternarexcluidoreclamacion", __ref, _datosceldaseleccionada);}
RemoteObject _valoractual = RemoteObject.createImmutable(0);
RemoteObject _nuevovalor = RemoteObject.createImmutable(0);
RemoteObject _mpk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pedidosel = RemoteObject.createImmutable("");
RemoteObject _lineasel = RemoteObject.createImmutable("");
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 425;BA.debugLine="Sub AlternarExcluidoReclamacion(DatosCeldaSeleccio";
Debug.ShouldStop(256);
 BA.debugLineNum = 426;BA.debugLine="Log(DatosCeldaSeleccionada)";
Debug.ShouldStop(512);
ctestsinfomagento.__c.runVoidMethod ("LogImpl","8103219201",BA.ObjectToString(_datosceldaseleccionada),0);
 BA.debugLineNum = 427;BA.debugLine="Dim ValorActual As Int= DatosCeldaSeleccionada.Va";
Debug.ShouldStop(1024);
_valoractual = BA.numberCast(int.class, _datosceldaseleccionada.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("ValorActual", _valoractual);Debug.locals.put("ValorActual", _valoractual);
 BA.debugLineNum = 428;BA.debugLine="Dim NuevoValor As Int";
Debug.ShouldStop(2048);
_nuevovalor = RemoteObject.createImmutable(0);Debug.locals.put("NuevoValor", _nuevovalor);
 BA.debugLineNum = 429;BA.debugLine="Select ValorActual";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(_valoractual,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 431;BA.debugLine="NuevoValor=1";
Debug.ShouldStop(16384);
_nuevovalor = BA.numberCast(int.class, 1);Debug.locals.put("NuevoValor", _nuevovalor);
 break; }
case 1: {
 BA.debugLineNum = 434;BA.debugLine="NuevoValor=0";
Debug.ShouldStop(131072);
_nuevovalor = BA.numberCast(int.class, 0);Debug.locals.put("NuevoValor", _nuevovalor);
 break; }
}
;
 BA.debugLineNum = 436;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
Debug.ShouldStop(524288);
_mpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mpk = _datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mPK", _mpk);Debug.locals.put("mPK", _mpk);
 BA.debugLineNum = 437;BA.debugLine="Dim PedidoSel As String=mPK.Get(\"Pedido\")";
Debug.ShouldStop(1048576);
_pedidosel = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Pedido")))));Debug.locals.put("PedidoSel", _pedidosel);Debug.locals.put("PedidoSel", _pedidosel);
 BA.debugLineNum = 438;BA.debugLine="Dim LineaSel As String=mPK.Get(\"Linea\")";
Debug.ShouldStop(2097152);
_lineasel = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Linea")))));Debug.locals.put("LineaSel", _lineasel);Debug.locals.put("LineaSel", _lineasel);
 BA.debugLineNum = 439;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?")),(Object)(ctestsinfomagento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_nuevovalor),(_pedidosel),(_lineasel)})))));
 BA.debugLineNum = 440;BA.debugLine="jamTableView1.RefrescarTablaValorCeldaEditada(Dat";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescartablavalorceldaeditada" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ )),(Object)(_datosceldaseleccionada.getField(true,"Columna" /*RemoteObject*/ )),(Object)((_nuevovalor)),(Object)(_datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ )));
 BA.debugLineNum = 441;BA.debugLine="jamTableView1.SeleccionarCelda(\"ExcluidoReclamaci";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_seleccionarcelda" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ExcluidoReclamacion")),(Object)(_datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ )));
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("asJO (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "ctestsinfomagento","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 174;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="Return o";
Debug.ShouldStop(16384);
if (true) return _o;
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xcomboboxstores_selectedindexchanged(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("B4XComboBoxStores_SelectedIndexChanged (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,3229);
if (RapidSub.canDelegate("b4xcomboboxstores_selectedindexchanged")) { return __ref.runUserSub(false, "ctestsinfomagento","b4xcomboboxstores_selectedindexchanged", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 3229;BA.debugLine="Private Sub B4XComboBoxStores_SelectedIndexChanged";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 3231;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _b4xcomboboxtablasb2b_selectedindexchanged(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("B4XComboBoxTablasB2B_SelectedIndexChanged (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,3201);
if (RapidSub.canDelegate("b4xcomboboxtablasb2b_selectedindexchanged")) { __ref.runUserSub(false, "ctestsinfomagento","b4xcomboboxtablasb2b_selectedindexchanged", __ref, _index); return;}
ResumableSub_B4XComboBoxTablasB2B_SelectedIndexChanged rsub = new ResumableSub_B4XComboBoxTablasB2B_SelectedIndexChanged(null,__ref,_index);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_B4XComboBoxTablasB2B_SelectedIndexChanged extends BA.ResumableSub {
public ResumableSub_B4XComboBoxTablasB2B_SelectedIndexChanged(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _index) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _index;
RemoteObject _itemseleccionado = RemoteObject.createImmutable("");
RemoteObject _idclientesel = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XComboBoxTablasB2B_SelectedIndexChanged (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,3201);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 3202;BA.debugLine="Dim ItemSeleccionado As String=B4XComboBoxTablasB";
Debug.ShouldStop(2);
_itemseleccionado = BA.ObjectToString(__ref.getField(false,"_b4xcomboboxtablasb2b" /*RemoteObject*/ ).getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(false,"getItems").runMethod(false,"Get",(Object)(_index)));Debug.locals.put("ItemSeleccionado", _itemseleccionado);Debug.locals.put("ItemSeleccionado", _itemseleccionado);
 BA.debugLineNum = 3203;BA.debugLine="Select Case ItemSeleccionado";
Debug.ShouldStop(4);
if (true) break;

case 1:
//select
this.state = 26;
switch (BA.switchObjectToInt(_itemseleccionado,BA.ObjectToString(""),BA.ObjectToString("Stores"),BA.ObjectToString("Grupos Cliente"),BA.ObjectToString("Clientes"),BA.ObjectToString("Direcciones Cliente"),BA.ObjectToString("Productos"),BA.ObjectToString("Valores Atributo size (Tallas Productos)"),BA.ObjectToString("Pedidos"),BA.ObjectToString("Categorias Productos"))) {
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
case 3: {
this.state = 9;
if (true) break;
}
case 4: {
this.state = 11;
if (true) break;
}
case 5: {
this.state = 19;
if (true) break;
}
case 6: {
this.state = 21;
if (true) break;
}
case 7: {
this.state = 23;
if (true) break;
}
case 8: {
this.state = 25;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 26;
 BA.debugLineNum = 3205;BA.debugLine="jamTableView1.LimpiarTabla";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 3206;BA.debugLine="TextAreaHTTPResponse.Text=\"\"";
Debug.ShouldStop(32);
__ref.getField(false,"_textareahttpresponse" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 if (true) break;

case 5:
//C
this.state = 26;
 BA.debugLineNum = 3208;BA.debugLine="MostrarListaStoresMagento";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrarlistastoresmagento" /*void*/ );
 if (true) break;

case 7:
//C
this.state = 26;
 BA.debugLineNum = 3210;BA.debugLine="MostrarListaGruposClienteMagento";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrarlistagruposclientemagento" /*void*/ );
 if (true) break;

case 9:
//C
this.state = 26;
 BA.debugLineNum = 3212;BA.debugLine="MostrarListaClientesMagento";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrarlistaclientesmagento" /*void*/ );
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3214;BA.debugLine="Wait For(SeleccionarCliente) complete (IDClient";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "b4xcomboboxtablasb2b_selectedindexchanged"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_seleccionarcliente" /*RemoteObject*/ ));
this.state = 27;
return;
case 27:
//C
this.state = 12;
_idclientesel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("IDClienteSel", _idclientesel);
;
 BA.debugLineNum = 3215;BA.debugLine="If IDClienteSel=-1 Then Return";
Debug.ShouldStop(16384);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_idclientesel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
if (true) return ;
if (true) break;

case 17:
//C
this.state = 26;
;
 BA.debugLineNum = 3216;BA.debugLine="MostrarDireccionesClienteMagento(IDClienteSel)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrardireccionesclientemagento" /*void*/ ,(Object)(_idclientesel));
 if (true) break;

case 19:
//C
this.state = 26;
 BA.debugLineNum = 3218;BA.debugLine="MostrarListaProductosMagento";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrarlistaproductosmagento" /*void*/ );
 if (true) break;

case 21:
//C
this.state = 26;
 BA.debugLineNum = 3220;BA.debugLine="MostrarValoresAtributoSizeProductos";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrarvaloresatributosizeproductos" /*RemoteObject*/ );
 if (true) break;

case 23:
//C
this.state = 26;
 BA.debugLineNum = 3222;BA.debugLine="MostrarPedidos";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrarpedidos" /*RemoteObject*/ );
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 3224;BA.debugLine="MostrarListaCategoriasMagento";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrarlistacategoriasmagento" /*void*/ );
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 3227;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _idclientesel) throws Exception{
}
public static void  _btninfopedidoclientemagento_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnInfoPedidoClienteMagento_Click (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1675);
if (RapidSub.canDelegate("btninfopedidoclientemagento_click")) { __ref.runUserSub(false, "ctestsinfomagento","btninfopedidoclientemagento_click", __ref); return;}
ResumableSub_btnInfoPedidoClienteMagento_Click rsub = new ResumableSub_btnInfoPedidoClienteMagento_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnInfoPedidoClienteMagento_Click extends BA.ResumableSub {
public ResumableSub_btnInfoPedidoClienteMagento_Click(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _tipoidentificador = RemoteObject.createImmutable("");
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _idsel = RemoteObject.createImmutable(0);
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _mdatapedido = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tax_amount = RemoteObject.createImmutable(0);
RemoteObject _tax_invoiced = RemoteObject.createImmutable(0);
RemoteObject _customer_note_notify = RemoteObject.createImmutable(0);
RemoteObject _shipping_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _base_discount_tax_compensation_invoiced = RemoteObject.createImmutable(0);
RemoteObject _customer_firstname = RemoteObject.createImmutable("");
RemoteObject _discount_amount = RemoteObject.createImmutable(0);
RemoteObject _billing_address = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _address_type = RemoteObject.createImmutable("");
RemoteObject _customer_address_id = RemoteObject.createImmutable(0);
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _postcode = RemoteObject.createImmutable("");
RemoteObject _region_id = RemoteObject.createImmutable(0);
RemoteObject _telephone = RemoteObject.createImmutable("");
RemoteObject _idbilling_address = RemoteObject.createImmutable(0);
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _parent_id = RemoteObject.createImmutable(0);
RemoteObject _street = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colstreet = RemoteObject.createImmutable("");
RemoteObject _calle = RemoteObject.createImmutable("");
RemoteObject _region = RemoteObject.createImmutable("");
RemoteObject _country_id = RemoteObject.createImmutable("");
RemoteObject _email = RemoteObject.createImmutable("");
RemoteObject _region_code = RemoteObject.createImmutable("");
RemoteObject _total_paid = RemoteObject.createImmutable(0);
RemoteObject _increment_id = RemoteObject.createImmutable("");
RemoteObject _payment = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _base_amount_ordered = RemoteObject.createImmutable(0);
RemoteObject _amount_paid = RemoteObject.createImmutable(0);
RemoteObject _method = RemoteObject.createImmutable("");
RemoteObject _cc_last4 = RemoteObject.createImmutable("");
RemoteObject _shipping_captured = RemoteObject.createImmutable(0);
RemoteObject _account_status = RemoteObject.createImmutable("");
RemoteObject _amount_ordered = RemoteObject.createImmutable(0);
RemoteObject _paymentid = RemoteObject.createImmutable(0);
RemoteObject _base_amount_paid = RemoteObject.createImmutable(0);
RemoteObject _shipping_amount = RemoteObject.createImmutable(0);
RemoteObject _additional_information = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coladditional_information = RemoteObject.createImmutable("");
RemoteObject _base_shipping_amount = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_captured = RemoteObject.createImmutable(0);
RemoteObject _state = RemoteObject.createImmutable("");
RemoteObject _base_shipping_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _base_grand_total = RemoteObject.createImmutable(0);
RemoteObject _billing_address_id = RemoteObject.createImmutable(0);
RemoteObject _customer_lastname = RemoteObject.createImmutable("");
RemoteObject _quote_id = RemoteObject.createImmutable(0);
RemoteObject _shipping_invoiced = RemoteObject.createImmutable(0);
RemoteObject _discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _weight = RemoteObject.createImmutable(0);
RemoteObject _idpedido = RemoteObject.createImmutable(0);
RemoteObject _base_total_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal_invoiced = RemoteObject.createImmutable(0);
RemoteObject _applied_rule_ids = RemoteObject.createImmutable("");
RemoteObject _subtotal_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_discount_tax_compensation_amnt = RemoteObject.createImmutable(0);
RemoteObject _subtotal = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _customer_email = RemoteObject.createImmutable("");
RemoteObject _base_discount_invoiced = RemoteObject.createImmutable(0);
RemoteObject _total_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_to_global_rate = RemoteObject.createImmutable(0);
RemoteObject _customer_is_guest = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _original_price = RemoteObject.createImmutable(0);
RemoteObject _free_shipping = RemoteObject.createImmutable(0);
RemoteObject _tax_percent = RemoteObject.createImmutable(0);
RemoteObject _price_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _price = RemoteObject.createImmutable(0);
RemoteObject _product_id = RemoteObject.createImmutable(0);
RemoteObject _base_row_total = RemoteObject.createImmutable(0);
RemoteObject _sku = RemoteObject.createImmutable("");
RemoteObject _base_original_price = RemoteObject.createImmutable(0);
RemoteObject _row_weight = RemoteObject.createImmutable(0);
RemoteObject _base_amount_refunded = RemoteObject.createImmutable(0);
RemoteObject _base_price_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _no_discount = RemoteObject.createImmutable(0);
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _discount_percent = RemoteObject.createImmutable(0);
RemoteObject _order_id = RemoteObject.createImmutable(0);
RemoteObject _discount_tax_compensation_invoiced = RemoteObject.createImmutable(0);
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _qty_shipped = RemoteObject.createImmutable(0);
RemoteObject _qty_ordered = RemoteObject.createImmutable(0);
RemoteObject _row_total = RemoteObject.createImmutable(0);
RemoteObject _qty_canceled = RemoteObject.createImmutable(0);
RemoteObject _product_option = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _talla = RemoteObject.createImmutable("");
RemoteObject _colconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _option_value = RemoteObject.createImmutable(0);
RemoteObject _option_id = RemoteObject.createImmutable("");
RemoteObject _amount_refunded = RemoteObject.createImmutable(0);
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _base_price = RemoteObject.createImmutable(0);
RemoteObject _qty_invoiced = RemoteObject.createImmutable(0);
RemoteObject _row_invoiced = RemoteObject.createImmutable(0);
RemoteObject _row_total_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _store_id = RemoteObject.createImmutable(0);
RemoteObject _item_id = RemoteObject.createImmutable(0);
RemoteObject _base_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _base_row_total_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _product_type = RemoteObject.createImmutable("");
RemoteObject _qty_refunded = RemoteObject.createImmutable(0);
RemoteObject _base_row_invoiced = RemoteObject.createImmutable(0);
RemoteObject _is_qty_decimal = RemoteObject.createImmutable(0);
RemoteObject _discount_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_tax_invoiced = RemoteObject.createImmutable(0);
RemoteObject _global_currency_code = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _is_virtual = RemoteObject.createImmutable(0);
RemoteObject _base_total_invoiced_cost = RemoteObject.createImmutable(0);
RemoteObject _status_histories = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _store_currency_code = RemoteObject.createImmutable("");
RemoteObject _total_item_count = RemoteObject.createImmutable(0);
RemoteObject _shipping_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _store_to_base_rate = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _store_name = RemoteObject.createImmutable("");
RemoteObject _grand_total = RemoteObject.createImmutable(0);
RemoteObject _base_currency_code = RemoteObject.createImmutable("");
RemoteObject _base_total_paid = RemoteObject.createImmutable(0);
RemoteObject _shipping_discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _total_due = RemoteObject.createImmutable(0);
RemoteObject _total_qty_ordered = RemoteObject.createImmutable(0);
RemoteObject _pgw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _extrinsic = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _extra_data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _posr_data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _originator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entity_id = RemoteObject.createImmutable("");
RemoteObject _poom_data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _po_number = RemoteObject.createImmutable("");
RemoteObject _shipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colshipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shipping = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shipping_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_invoiced = RemoteObject.createImmutable(0);
RemoteObject _address = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idaddress = RemoteObject.createImmutable(0);
RemoteObject _carts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _payment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colpayment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _amount = RemoteObject.createImmutable(0);
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _base_amount = RemoteObject.createImmutable(0);
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _percent = RemoteObject.createImmutable(0);
RemoteObject _item_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitem_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _type = RemoteObject.createImmutable("");
RemoteObject _converting_from_quote = RemoteObject.createImmutable("");
RemoteObject _contacts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _shipping_description = RemoteObject.createImmutable("");
RemoteObject _store_to_order_rate = RemoteObject.createImmutable(0);
RemoteObject _subtotal_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_to_order_rate = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal = RemoteObject.createImmutable(0);
RemoteObject _protect_code = RemoteObject.createImmutable("");
RemoteObject _customer_dob = RemoteObject.createImmutable("");
RemoteObject _base_total_due = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _customer_id = RemoteObject.createImmutable(0);
RemoteObject _customer_group_id = RemoteObject.createImmutable(0);
RemoteObject _order_currency_code = RemoteObject.createImmutable("");
RemoteObject _customer_gender = RemoteObject.createImmutable(0);
RemoteObject group58;
int index58;
int groupLen58;
RemoteObject group81;
int index81;
int groupLen81;
RemoteObject group111;
int index111;
int groupLen111;
RemoteObject group147;
int index147;
int groupLen147;
RemoteObject group209;
int index209;
int groupLen209;
RemoteObject group237;
int index237;
int groupLen237;
RemoteObject group245;
int index245;
int groupLen245;
RemoteObject group252;
int index252;
int groupLen252;
RemoteObject group259;
int index259;
int groupLen259;
RemoteObject group269;
int index269;
int groupLen269;
RemoteObject group271;
int index271;
int groupLen271;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnInfoPedidoClienteMagento_Click (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1675);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1677;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Selecciona";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Selecciona tipo de identificador")),(Object)(BA.ObjectToString("Tipo identificador")),(Object)(BA.ObjectToString("ID Pedido")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Numero pedido")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1678;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "btninfopedidoclientemagento_click"), _msa);
this.state = 87;
return;
case 87:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1679;BA.debugLine="If rInt=xui.DialogResponse_Cancel Then Return";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 1680;BA.debugLine="Dim TipoIdentificador As String";
Debug.ShouldStop(32768);
_tipoidentificador = RemoteObject.createImmutable("");Debug.locals.put("TipoIdentificador", _tipoidentificador);
 BA.debugLineNum = 1681;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1682;BA.debugLine="TipoIdentificador=\"ID Pedido\"";
Debug.ShouldStop(131072);
_tipoidentificador = BA.ObjectToString("ID Pedido");Debug.locals.put("TipoIdentificador", _tipoidentificador);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1684;BA.debugLine="TipoIdentificador=\"Numero Pedido\"";
Debug.ShouldStop(524288);
_tipoidentificador = BA.ObjectToString("Numero Pedido");Debug.locals.put("TipoIdentificador", _tipoidentificador);
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1687;BA.debugLine="Dialog.Title=$\"Indica ${TipoIdentificador}\"$";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,((RemoteObject.concat(RemoteObject.createImmutable("Indica "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tipoidentificador))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1688;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 1689;BA.debugLine="Dialog.OverlayColor=0x00FFFFFF";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_overlaycolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x00ffffff)));
 BA.debugLineNum = 1690;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(33554432);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 1691;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(67108864);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1692;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(134217728);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 1693;BA.debugLine="InputDlg.Text=\"\"";
Debug.ShouldStop(268435456);
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1694;BA.debugLine="InputDlg.ConfigureForNumbers(False,False)";
Debug.ShouldStop(536870912);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 1696;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.ShouldStop(-2147483648);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1697;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(1);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 1698;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(2);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 1699;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(4);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 1700;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(8);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 1701;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(16);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 1702;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(32);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 1703;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "btninfopedidoclientemagento_click"), _rsub);
this.state = 88;
return;
case 88:
//C
this.state = 13;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1705;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(256);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) return ;
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 1706;BA.debugLine="Dim IDSel As Int=InputDlg.Text";
Debug.ShouldStop(512);
_idsel = BA.numberCast(int.class, _inputdlg.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("IDSel", _idsel);Debug.locals.put("IDSel", _idsel);
 BA.debugLineNum = 1708;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidoCli";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "btninfopedidoclientemagento_click"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentoinformacionpedidocliente" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ )),(Object)(_tipoidentificador),(Object)(_idsel)));
this.state = 89;
return;
case 89:
//C
this.state = 19;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1709;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return";
Debug.ShouldStop(4096);
if (true) break;

case 19:
//if
this.state = 24;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) return ;
if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 1711;BA.debugLine="TextAreaHTTPResponse.Text=sResp";
Debug.ShouldStop(16384);
__ref.getField(false,"_textareahttpresponse" /*RemoteObject*/ ).runMethod(true,"setText",_sresp);
 BA.debugLineNum = 1713;BA.debugLine="Dim mDataPedido As Map";
Debug.ShouldStop(65536);
_mdatapedido = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDataPedido", _mdatapedido);
 BA.debugLineNum = 1714;BA.debugLine="mDataPedido.Initialize";
Debug.ShouldStop(131072);
_mdatapedido.runVoidMethod ("Initialize");
 BA.debugLineNum = 1716;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(524288);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1717;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(1048576);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 1718;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(2097152);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1719;BA.debugLine="Dim tax_amount As Double = root.Getdefault(\"tax_a";
Debug.ShouldStop(4194304);
_tax_amount = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_amount", _tax_amount);Debug.locals.put("tax_amount", _tax_amount);
 BA.debugLineNum = 1720;BA.debugLine="Dim tax_invoiced As Double = root.Getdefault(\"tax";
Debug.ShouldStop(8388608);
_tax_invoiced = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_invoiced", _tax_invoiced);Debug.locals.put("tax_invoiced", _tax_invoiced);
 BA.debugLineNum = 1721;BA.debugLine="Dim customer_note_notify As Int = root.Getdefault";
Debug.ShouldStop(16777216);
_customer_note_notify = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_note_notify"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_note_notify", _customer_note_notify);Debug.locals.put("customer_note_notify", _customer_note_notify);
 BA.debugLineNum = 1722;BA.debugLine="Dim shipping_discount_amount As Int = root.Getdef";
Debug.ShouldStop(33554432);
_shipping_discount_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_discount_amount", _shipping_discount_amount);Debug.locals.put("shipping_discount_amount", _shipping_discount_amount);
 BA.debugLineNum = 1723;BA.debugLine="Dim base_discount_tax_compensation_invoiced As In";
Debug.ShouldStop(67108864);
_base_discount_tax_compensation_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);
 BA.debugLineNum = 1724;BA.debugLine="Dim customer_firstname As String = root.Get(\"cust";
Debug.ShouldStop(134217728);
_customer_firstname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_firstname")))));Debug.locals.put("customer_firstname", _customer_firstname);Debug.locals.put("customer_firstname", _customer_firstname);
 BA.debugLineNum = 1725;BA.debugLine="mDataPedido.Put(\"customer_firstname\",customer_fir";
Debug.ShouldStop(268435456);
_mdatapedido.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("customer_firstname"))),(Object)((_customer_firstname)));
 BA.debugLineNum = 1726;BA.debugLine="Dim discount_amount As Double = root.Getdefault(\"";
Debug.ShouldStop(536870912);
_discount_amount = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_amount", _discount_amount);Debug.locals.put("discount_amount", _discount_amount);
 BA.debugLineNum = 1727;BA.debugLine="Dim billing_address As Map = root.Get(\"billing_ad";
Debug.ShouldStop(1073741824);
_billing_address = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_billing_address = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("billing_address")))));Debug.locals.put("billing_address", _billing_address);Debug.locals.put("billing_address", _billing_address);
 BA.debugLineNum = 1728;BA.debugLine="Log(\"billing_address\" & billing_address)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","8104464437",RemoteObject.concat(RemoteObject.createImmutable("billing_address"),_billing_address),0);
 BA.debugLineNum = 1729;BA.debugLine="mDataPedido.Put(\"billing_address\",billing_address";
Debug.ShouldStop(1);
_mdatapedido.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("billing_address"))),(Object)((_billing_address.getObject())));
 BA.debugLineNum = 1730;BA.debugLine="Dim firstname As String = billing_address.Get(\"fi";
Debug.ShouldStop(2);
_firstname = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 1731;BA.debugLine="Dim address_type As String = billing_address.Get(";
Debug.ShouldStop(4);
_address_type = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address_type")))));Debug.locals.put("address_type", _address_type);Debug.locals.put("address_type", _address_type);
 BA.debugLineNum = 1732;BA.debugLine="Dim customer_address_id As Int = billing_address.";
Debug.ShouldStop(8);
_customer_address_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_address_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_address_id", _customer_address_id);Debug.locals.put("customer_address_id", _customer_address_id);
 BA.debugLineNum = 1733;BA.debugLine="Dim city As String = billing_address.Get(\"city\")";
Debug.ShouldStop(16);
_city = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 1734;BA.debugLine="Dim postcode As String = billing_address.Get(\"pos";
Debug.ShouldStop(32);
_postcode = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 1735;BA.debugLine="Dim region_id As Int = billing_address.Getdefault";
Debug.ShouldStop(64);
_region_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("region_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 1736;BA.debugLine="Dim telephone As String = billing_address.Get(\"te";
Debug.ShouldStop(128);
_telephone = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 1738;BA.debugLine="Dim IDbilling_address As Int = billing_address.Ge";
Debug.ShouldStop(512);
_idbilling_address = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("entity_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("IDbilling_address", _idbilling_address);Debug.locals.put("IDbilling_address", _idbilling_address);
 BA.debugLineNum = 1739;BA.debugLine="Dim lastname As String = billing_address.Get(\"las";
Debug.ShouldStop(1024);
_lastname = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 1740;BA.debugLine="Dim parent_id As Int = billing_address.Getdefault";
Debug.ShouldStop(2048);
_parent_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("parent_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 1741;BA.debugLine="Dim street As List = billing_address.Get(\"street\"";
Debug.ShouldStop(4096);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 1742;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(8192);
if (true) break;

case 25:
//for
this.state = 28;
group58 = _street;
index58 = 0;
groupLen58 = group58.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 90;
if (true) break;

case 90:
//C
this.state = 28;
if (index58 < groupLen58) {
this.state = 27;
_colstreet = BA.ObjectToString(group58.runMethod(false,"Get",index58));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 91:
//C
this.state = 90;
index58++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 27:
//C
this.state = 91;
 BA.debugLineNum = 1743;BA.debugLine="Log(colstreet)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","8104464452",_colstreet,0);
 BA.debugLineNum = 1744;BA.debugLine="Dim Calle As String=colstreet";
Debug.ShouldStop(32768);
_calle = _colstreet;Debug.locals.put("Calle", _calle);Debug.locals.put("Calle", _calle);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 1746;BA.debugLine="Dim region As String = billing_address.Get(\"regio";
Debug.ShouldStop(131072);
_region = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 1747;BA.debugLine="Dim country_id As String = billing_address.Get(\"c";
Debug.ShouldStop(262144);
_country_id = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 1748;BA.debugLine="Dim email As String = billing_address.Get(\"email\"";
Debug.ShouldStop(524288);
_email = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 1749;BA.debugLine="Dim region_code As String = billing_address.Get(\"";
Debug.ShouldStop(1048576);
_region_code = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 1750;BA.debugLine="Dim total_paid As Double = root.Getdefault(\"total";
Debug.ShouldStop(2097152);
_total_paid = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("total_paid", _total_paid);Debug.locals.put("total_paid", _total_paid);
 BA.debugLineNum = 1751;BA.debugLine="Dim increment_id As String = root.Get(\"increment_";
Debug.ShouldStop(4194304);
_increment_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("increment_id")))));Debug.locals.put("increment_id", _increment_id);Debug.locals.put("increment_id", _increment_id);
 BA.debugLineNum = 1752;BA.debugLine="Dim payment As Map = root.Get(\"payment\")";
Debug.ShouldStop(8388608);
_payment = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_payment = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment")))));Debug.locals.put("payment", _payment);Debug.locals.put("payment", _payment);
 BA.debugLineNum = 1753;BA.debugLine="Log(\"payment\" & payment)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","8104464462",RemoteObject.concat(RemoteObject.createImmutable("payment"),_payment),0);
 BA.debugLineNum = 1754;BA.debugLine="Dim base_amount_ordered As Double = payment.Getde";
Debug.ShouldStop(33554432);
_base_amount_ordered = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_ordered", _base_amount_ordered);Debug.locals.put("base_amount_ordered", _base_amount_ordered);
 BA.debugLineNum = 1755;BA.debugLine="Dim amount_paid As Double = payment.Getdefault(\"a";
Debug.ShouldStop(67108864);
_amount_paid = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("amount_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("amount_paid", _amount_paid);Debug.locals.put("amount_paid", _amount_paid);
 BA.debugLineNum = 1756;BA.debugLine="Dim method As String = payment.Get(\"method\")";
Debug.ShouldStop(134217728);
_method = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("method")))));Debug.locals.put("method", _method);Debug.locals.put("method", _method);
 BA.debugLineNum = 1757;BA.debugLine="Dim cc_last4 As String = payment.Get(\"cc_last4\")";
Debug.ShouldStop(268435456);
_cc_last4 = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cc_last4")))));Debug.locals.put("cc_last4", _cc_last4);Debug.locals.put("cc_last4", _cc_last4);
 BA.debugLineNum = 1758;BA.debugLine="Dim shipping_captured As Int = payment.Getdefault";
Debug.ShouldStop(536870912);
_shipping_captured = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_captured"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_captured", _shipping_captured);Debug.locals.put("shipping_captured", _shipping_captured);
 BA.debugLineNum = 1759;BA.debugLine="Dim account_status As String = payment.Get(\"accou";
Debug.ShouldStop(1073741824);
_account_status = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_status")))));Debug.locals.put("account_status", _account_status);Debug.locals.put("account_status", _account_status);
 BA.debugLineNum = 1760;BA.debugLine="Dim amount_ordered As Double = payment.Getdefault";
Debug.ShouldStop(-2147483648);
_amount_ordered = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("amount_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("amount_ordered", _amount_ordered);Debug.locals.put("amount_ordered", _amount_ordered);
 BA.debugLineNum = 1762;BA.debugLine="Dim PaymentID As Int = payment.Getdefault(\"entity";
Debug.ShouldStop(2);
_paymentid = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("entity_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("PaymentID", _paymentid);Debug.locals.put("PaymentID", _paymentid);
 BA.debugLineNum = 1763;BA.debugLine="Dim base_amount_paid As Double = payment.Getdefau";
Debug.ShouldStop(4);
_base_amount_paid = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_paid", _base_amount_paid);Debug.locals.put("base_amount_paid", _base_amount_paid);
 BA.debugLineNum = 1764;BA.debugLine="Dim shipping_amount As Int = payment.Getdefault(\"";
Debug.ShouldStop(8);
_shipping_amount = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 1765;BA.debugLine="Dim additional_information As List = payment.Get(";
Debug.ShouldStop(16);
_additional_information = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_additional_information = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("additional_information")))));Debug.locals.put("additional_information", _additional_information);Debug.locals.put("additional_information", _additional_information);
 BA.debugLineNum = 1766;BA.debugLine="For Each coladditional_information As String In a";
Debug.ShouldStop(32);
if (true) break;

case 29:
//for
this.state = 32;
group81 = _additional_information;
index81 = 0;
groupLen81 = group81.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("coladditional_information", _coladditional_information);
this.state = 92;
if (true) break;

case 92:
//C
this.state = 32;
if (index81 < groupLen81) {
this.state = 31;
_coladditional_information = BA.ObjectToString(group81.runMethod(false,"Get",index81));Debug.locals.put("coladditional_information", _coladditional_information);}
if (true) break;

case 93:
//C
this.state = 92;
index81++;
Debug.locals.put("coladditional_information", _coladditional_information);
if (true) break;

case 31:
//C
this.state = 93;
 BA.debugLineNum = 1767;BA.debugLine="Log(coladditional_information)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","8104464476",_coladditional_information,0);
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
Debug.locals.put("coladditional_information", _coladditional_information);
;
 BA.debugLineNum = 1769;BA.debugLine="Dim base_shipping_amount As Int = payment.Getdefa";
Debug.ShouldStop(256);
_base_shipping_amount = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 1770;BA.debugLine="Dim parent_id As Int = payment.Get(\"parent_id\")";
Debug.ShouldStop(512);
_parent_id = BA.numberCast(int.class, _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parent_id")))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 1771;BA.debugLine="Dim base_shipping_captured As Int = payment.Getde";
Debug.ShouldStop(1024);
_base_shipping_captured = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_captured"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_captured", _base_shipping_captured);Debug.locals.put("base_shipping_captured", _base_shipping_captured);
 BA.debugLineNum = 1772;BA.debugLine="Dim state As String = root.Get(\"state\")";
Debug.ShouldStop(2048);
_state = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("state")))));Debug.locals.put("state", _state);Debug.locals.put("state", _state);
 BA.debugLineNum = 1773;BA.debugLine="Dim base_shipping_tax_amount As Int = root.Getdef";
Debug.ShouldStop(4096);
_base_shipping_tax_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_tax_amount", _base_shipping_tax_amount);Debug.locals.put("base_shipping_tax_amount", _base_shipping_tax_amount);
 BA.debugLineNum = 1774;BA.debugLine="Dim base_grand_total As Double = root.Getdefault(";
Debug.ShouldStop(8192);
_base_grand_total = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_grand_total"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_grand_total", _base_grand_total);Debug.locals.put("base_grand_total", _base_grand_total);
 BA.debugLineNum = 1775;BA.debugLine="Dim billing_address_id As Int = root.Get(\"billing";
Debug.ShouldStop(16384);
_billing_address_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("billing_address_id")))));Debug.locals.put("billing_address_id", _billing_address_id);Debug.locals.put("billing_address_id", _billing_address_id);
 BA.debugLineNum = 1776;BA.debugLine="Dim customer_lastname As String = root.Get(\"custo";
Debug.ShouldStop(32768);
_customer_lastname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_lastname")))));Debug.locals.put("customer_lastname", _customer_lastname);Debug.locals.put("customer_lastname", _customer_lastname);
 BA.debugLineNum = 1777;BA.debugLine="Dim quote_id As Int = root.Getdefault(\"quote_id\",";
Debug.ShouldStop(65536);
_quote_id = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("quote_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("quote_id", _quote_id);Debug.locals.put("quote_id", _quote_id);
 BA.debugLineNum = 1778;BA.debugLine="Dim shipping_invoiced As Int = root.Getdefault(\"s";
Debug.ShouldStop(131072);
_shipping_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_invoiced", _shipping_invoiced);Debug.locals.put("shipping_invoiced", _shipping_invoiced);
 BA.debugLineNum = 1779;BA.debugLine="Dim discount_tax_compensation_amount As Int = roo";
Debug.ShouldStop(262144);
_discount_tax_compensation_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 1780;BA.debugLine="Dim weight As Int = root.Getdefault(\"weight\",0)";
Debug.ShouldStop(524288);
_weight = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("weight"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 1782;BA.debugLine="Dim IDPedido As Int = root.Get(\"entity_id\")";
Debug.ShouldStop(2097152);
_idpedido = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("IDPedido", _idpedido);Debug.locals.put("IDPedido", _idpedido);
 BA.debugLineNum = 1783;BA.debugLine="Dim base_total_invoiced As Double = root.Getdefau";
Debug.ShouldStop(4194304);
_base_total_invoiced = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_total_invoiced", _base_total_invoiced);Debug.locals.put("base_total_invoiced", _base_total_invoiced);
 BA.debugLineNum = 1784;BA.debugLine="Dim base_shipping_amount As Int = root.Getdefault";
Debug.ShouldStop(8388608);
_base_shipping_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 1785;BA.debugLine="Dim base_subtotal_invoiced As Int = root.Getdefau";
Debug.ShouldStop(16777216);
_base_subtotal_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_subtotal_invoiced", _base_subtotal_invoiced);Debug.locals.put("base_subtotal_invoiced", _base_subtotal_invoiced);
 BA.debugLineNum = 1786;BA.debugLine="Dim applied_rule_ids As String = root.Get(\"applie";
Debug.ShouldStop(33554432);
_applied_rule_ids = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 1787;BA.debugLine="Dim subtotal_incl_tax As Double = root.Getdefault";
Debug.ShouldStop(67108864);
_subtotal_incl_tax = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("subtotal_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("subtotal_incl_tax", _subtotal_incl_tax);Debug.locals.put("subtotal_incl_tax", _subtotal_incl_tax);
 BA.debugLineNum = 1788;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
Debug.ShouldStop(134217728);
_base_shipping_discount_tax_compensation_amnt = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_tax_compensation_amnt"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);
 BA.debugLineNum = 1789;BA.debugLine="Dim subtotal As Int = root.Getdefault(\"subtotal\",";
Debug.ShouldStop(268435456);
_subtotal = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("subtotal"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("subtotal", _subtotal);Debug.locals.put("subtotal", _subtotal);
 BA.debugLineNum = 1790;BA.debugLine="Dim base_shipping_incl_tax As Int = root.Getdefau";
Debug.ShouldStop(536870912);
_base_shipping_incl_tax = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);
 BA.debugLineNum = 1791;BA.debugLine="Dim customer_email As String = root.Get(\"customer";
Debug.ShouldStop(1073741824);
_customer_email = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_email")))));Debug.locals.put("customer_email", _customer_email);Debug.locals.put("customer_email", _customer_email);
 BA.debugLineNum = 1792;BA.debugLine="Dim base_discount_invoiced As Int = root.Getdefau";
Debug.ShouldStop(-2147483648);
_base_discount_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 1793;BA.debugLine="Dim total_invoiced As Double = root.Getdefault(\"t";
Debug.ShouldStop(1);
_total_invoiced = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("total_invoiced", _total_invoiced);Debug.locals.put("total_invoiced", _total_invoiced);
 BA.debugLineNum = 1794;BA.debugLine="Dim base_to_global_rate As Int = root.Getdefault(";
Debug.ShouldStop(2);
_base_to_global_rate = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_to_global_rate"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_to_global_rate", _base_to_global_rate);Debug.locals.put("base_to_global_rate", _base_to_global_rate);
 BA.debugLineNum = 1795;BA.debugLine="Dim customer_is_guest As Int = root.Getdefault(\"c";
Debug.ShouldStop(4);
_customer_is_guest = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_is_guest"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_is_guest", _customer_is_guest);Debug.locals.put("customer_is_guest", _customer_is_guest);
 BA.debugLineNum = 1796;BA.debugLine="Dim items As List = root.Get(\"items\")";
Debug.ShouldStop(8);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 1797;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(16);
if (true) break;

case 33:
//for
this.state = 48;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group111 = _items;
index111 = 0;
groupLen111 = group111.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 94;
if (true) break;

case 94:
//C
this.state = 48;
if (index111 < groupLen111) {
this.state = 35;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group111.runMethod(false,"Get",index111));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 95:
//C
this.state = 94;
index111++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1798;BA.debugLine="Dim tax_amount As Double = colitems.Getdefault(\"";
Debug.ShouldStop(32);
_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_amount", _tax_amount);Debug.locals.put("tax_amount", _tax_amount);
 BA.debugLineNum = 1799;BA.debugLine="Dim tax_invoiced As Double = colitems.Getdefault";
Debug.ShouldStop(64);
_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_invoiced", _tax_invoiced);Debug.locals.put("tax_invoiced", _tax_invoiced);
 BA.debugLineNum = 1800;BA.debugLine="Dim original_price As Int = colitems.Getdefault(";
Debug.ShouldStop(128);
_original_price = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("original_price"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("original_price", _original_price);Debug.locals.put("original_price", _original_price);
 BA.debugLineNum = 1801;BA.debugLine="Dim free_shipping As Int = colitems.Getdefault(\"";
Debug.ShouldStop(256);
_free_shipping = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("free_shipping"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("free_shipping", _free_shipping);Debug.locals.put("free_shipping", _free_shipping);
 BA.debugLineNum = 1802;BA.debugLine="Dim base_discount_tax_compensation_invoiced As I";
Debug.ShouldStop(512);
_base_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);
 BA.debugLineNum = 1803;BA.debugLine="Dim discount_amount As Double = colitems.Getdefa";
Debug.ShouldStop(1024);
_discount_amount = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_amount", _discount_amount);Debug.locals.put("discount_amount", _discount_amount);
 BA.debugLineNum = 1804;BA.debugLine="Dim tax_percent As Double = colitems.Getdefault(";
Debug.ShouldStop(2048);
_tax_percent = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_percent"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_percent", _tax_percent);Debug.locals.put("tax_percent", _tax_percent);
 BA.debugLineNum = 1805;BA.debugLine="Dim price_incl_tax As Double = colitems.Getdefau";
Debug.ShouldStop(4096);
_price_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("price_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("price_incl_tax", _price_incl_tax);Debug.locals.put("price_incl_tax", _price_incl_tax);
 BA.debugLineNum = 1806;BA.debugLine="Dim price As Double = colitems.Getdefault(\"price";
Debug.ShouldStop(8192);
_price = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("price"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("price", _price);Debug.locals.put("price", _price);
 BA.debugLineNum = 1807;BA.debugLine="Dim product_id As Int = colitems.Get(\"product_id";
Debug.ShouldStop(16384);
_product_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_id")))));Debug.locals.put("product_id", _product_id);Debug.locals.put("product_id", _product_id);
 BA.debugLineNum = 1808;BA.debugLine="Dim base_row_total As Double = colitems.Getdefau";
Debug.ShouldStop(32768);
_base_row_total = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_row_total"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_row_total", _base_row_total);Debug.locals.put("base_row_total", _base_row_total);
 BA.debugLineNum = 1809;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
Debug.ShouldStop(65536);
_sku = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sku")))));Debug.locals.put("sku", _sku);Debug.locals.put("sku", _sku);
 BA.debugLineNum = 1810;BA.debugLine="Dim discount_tax_compensation_amount As Int = co";
Debug.ShouldStop(131072);
_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 1811;BA.debugLine="Dim weight As Int = colitems.Get(\"weight\")";
Debug.ShouldStop(262144);
_weight = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weight")))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 1812;BA.debugLine="Dim base_original_price As Int = colitems.Getdef";
Debug.ShouldStop(524288);
_base_original_price = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_original_price"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_original_price", _base_original_price);Debug.locals.put("base_original_price", _base_original_price);
 BA.debugLineNum = 1813;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_weight";
Debug.ShouldStop(1048576);
_row_weight = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_weight")))));Debug.locals.put("row_weight", _row_weight);Debug.locals.put("row_weight", _row_weight);
 BA.debugLineNum = 1814;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"a";
Debug.ShouldStop(2097152);
_applied_rule_ids = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 1815;BA.debugLine="Dim base_amount_refunded As Int = colitems.Getde";
Debug.ShouldStop(4194304);
_base_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_refunded"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_refunded", _base_amount_refunded);Debug.locals.put("base_amount_refunded", _base_amount_refunded);
 BA.debugLineNum = 1816;BA.debugLine="Dim base_price_incl_tax As Double = colitems.Get";
Debug.ShouldStop(8388608);
_base_price_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_price_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);
 BA.debugLineNum = 1817;BA.debugLine="Dim no_discount As Int = colitems.Getdefault(\"no";
Debug.ShouldStop(16777216);
_no_discount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("no_discount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("no_discount", _no_discount);Debug.locals.put("no_discount", _no_discount);
 BA.debugLineNum = 1818;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
Debug.ShouldStop(33554432);
_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1819;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Get";
Debug.ShouldStop(67108864);
_base_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 1820;BA.debugLine="Dim discount_percent As Int = colitems.Getdefaul";
Debug.ShouldStop(134217728);
_discount_percent = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_percent"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_percent", _discount_percent);Debug.locals.put("discount_percent", _discount_percent);
 BA.debugLineNum = 1821;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id\")";
Debug.ShouldStop(268435456);
_order_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_id")))));Debug.locals.put("order_id", _order_id);Debug.locals.put("order_id", _order_id);
 BA.debugLineNum = 1822;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
Debug.ShouldStop(536870912);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 1823;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
Debug.ShouldStop(1073741824);
_created_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 1824;BA.debugLine="Dim qty_shipped As Int = colitems.Getdefault(\"qt";
Debug.ShouldStop(-2147483648);
_qty_shipped = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("qty_shipped"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("qty_shipped", _qty_shipped);Debug.locals.put("qty_shipped", _qty_shipped);
 BA.debugLineNum = 1825;BA.debugLine="Dim qty_ordered As Int = colitems.Getdefault(\"qt";
Debug.ShouldStop(1);
_qty_ordered = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("qty_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("qty_ordered", _qty_ordered);Debug.locals.put("qty_ordered", _qty_ordered);
 BA.debugLineNum = 1826;BA.debugLine="Dim row_total As Int = colitems.Getdefault(\"row_";
Debug.ShouldStop(2);
_row_total = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("row_total"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("row_total", _row_total);Debug.locals.put("row_total", _row_total);
 BA.debugLineNum = 1827;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_canc";
Debug.ShouldStop(4);
_qty_canceled = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_canceled")))));Debug.locals.put("qty_canceled", _qty_canceled);Debug.locals.put("qty_canceled", _qty_canceled);
 BA.debugLineNum = 1828;BA.debugLine="Dim product_option As Map = IIf(colitems.Get(\"pr";
Debug.ShouldStop(8);
_product_option = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_product_option = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), ((RemoteObject.solveBoolean("n",_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_option")))))) ? ((parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("")),(RemoteObject.createImmutable(""))})).getObject())) : (_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_option")))))));Debug.locals.put("product_option", _product_option);Debug.locals.put("product_option", _product_option);
 BA.debugLineNum = 1829;BA.debugLine="Dim extension_attributes As Map = product_option";
Debug.ShouldStop(16);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _product_option.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 1830;BA.debugLine="If extension_attributes.IsInitialized Then";
Debug.ShouldStop(32);
if (true) break;

case 36:
//if
this.state = 47;
if (_extension_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 1831;BA.debugLine="Dim configurable_item_options As List = extensi";
Debug.ShouldStop(64);
_configurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("configurable_item_options")))));Debug.locals.put("configurable_item_options", _configurable_item_options);Debug.locals.put("configurable_item_options", _configurable_item_options);
 BA.debugLineNum = 1832;BA.debugLine="Dim Talla As String";
Debug.ShouldStop(128);
_talla = RemoteObject.createImmutable("");Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 1833;BA.debugLine="For Each colconfigurable_item_options As Map In";
Debug.ShouldStop(256);
if (true) break;

case 39:
//for
this.state = 46;
_colconfigurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group147 = _configurable_item_options;
index147 = 0;
groupLen147 = group147.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
this.state = 96;
if (true) break;

case 96:
//C
this.state = 46;
if (index147 < groupLen147) {
this.state = 41;
_colconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group147.runMethod(false,"Get",index147));Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);}
if (true) break;

case 97:
//C
this.state = 96;
index147++;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 1834;BA.debugLine="Dim option_value As Int = colconfigurable_item";
Debug.ShouldStop(512);
_option_value = BA.numberCast(int.class, _colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_value")))));Debug.locals.put("option_value", _option_value);Debug.locals.put("option_value", _option_value);
 BA.debugLineNum = 1835;BA.debugLine="Dim option_id As String = colconfigurable_item";
Debug.ShouldStop(1024);
_option_id = BA.ObjectToString(_colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_id")))));Debug.locals.put("option_id", _option_id);Debug.locals.put("option_id", _option_id);
 BA.debugLineNum = 1836;BA.debugLine="If option_id=142 Then";
Debug.ShouldStop(2048);
if (true) break;

case 42:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",_option_id,BA.NumberToString(142))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 1837;BA.debugLine="Talla=mSQL.ExecQuerySingleResult2(\"select lab";
Debug.ShouldStop(4096);
_talla = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select label from tblB2BAtributoSizeProducts where value=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_option_value)})))));Debug.locals.put("Talla", _talla);
 if (true) break;

case 45:
//C
this.state = 97;
;
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
;
 if (true) break;

case 47:
//C
this.state = 95;
;
 BA.debugLineNum = 1841;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"amoun";
Debug.ShouldStop(65536);
_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount_refunded")))));Debug.locals.put("amount_refunded", _amount_refunded);Debug.locals.put("amount_refunded", _amount_refunded);
 BA.debugLineNum = 1842;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
Debug.ShouldStop(131072);
_updated_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 1843;BA.debugLine="Dim base_price As Int = colitems.Get(\"base_price";
Debug.ShouldStop(262144);
_base_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_price")))));Debug.locals.put("base_price", _base_price);Debug.locals.put("base_price", _base_price);
 BA.debugLineNum = 1844;BA.debugLine="Dim qty_invoiced As Int = colitems.Getdefault(\"q";
Debug.ShouldStop(524288);
_qty_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("qty_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("qty_invoiced", _qty_invoiced);Debug.locals.put("qty_invoiced", _qty_invoiced);
 BA.debugLineNum = 1845;BA.debugLine="Dim row_invoiced As Int = colitems.Getdefault(\"r";
Debug.ShouldStop(1048576);
_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("row_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("row_invoiced", _row_invoiced);Debug.locals.put("row_invoiced", _row_invoiced);
 BA.debugLineNum = 1846;BA.debugLine="Dim row_total_incl_tax As Double = colitems.Get(";
Debug.ShouldStop(2097152);
_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total_incl_tax")))));Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);
 BA.debugLineNum = 1847;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"ba";
Debug.ShouldStop(4194304);
_base_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_amount")))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 1848;BA.debugLine="Dim store_id As Int = colitems.Getdefault(\"store";
Debug.ShouldStop(8388608);
_store_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 1849;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
Debug.ShouldStop(16777216);
_item_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_id")))));Debug.locals.put("item_id", _item_id);Debug.locals.put("item_id", _item_id);
 BA.debugLineNum = 1850;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(\"";
Debug.ShouldStop(33554432);
_base_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_amount")))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 1851;BA.debugLine="Dim base_row_total_incl_tax As Double = colitems";
Debug.ShouldStop(67108864);
_base_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total_incl_tax")))));Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);
 BA.debugLineNum = 1852;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
Debug.ShouldStop(134217728);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_tax_compensation_amount")))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 1853;BA.debugLine="Dim product_type As String = colitems.Get(\"produ";
Debug.ShouldStop(268435456);
_product_type = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_type")))));Debug.locals.put("product_type", _product_type);Debug.locals.put("product_type", _product_type);
 BA.debugLineNum = 1854;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_refu";
Debug.ShouldStop(536870912);
_qty_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_refunded")))));Debug.locals.put("qty_refunded", _qty_refunded);Debug.locals.put("qty_refunded", _qty_refunded);
 BA.debugLineNum = 1855;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(\"bas";
Debug.ShouldStop(1073741824);
_base_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_invoiced")))));Debug.locals.put("base_row_invoiced", _base_row_invoiced);Debug.locals.put("base_row_invoiced", _base_row_invoiced);
 BA.debugLineNum = 1856;BA.debugLine="Dim is_qty_decimal As Int = colitems.Getdefault(";
Debug.ShouldStop(-2147483648);
_is_qty_decimal = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_qty_decimal"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("is_qty_decimal", _is_qty_decimal);Debug.locals.put("is_qty_decimal", _is_qty_decimal);
 BA.debugLineNum = 1857;BA.debugLine="Dim discount_invoiced As Int = colitems.Getdefau";
Debug.ShouldStop(1);
_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 1858;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Getde";
Debug.ShouldStop(2);
_base_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_tax_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 if (true) break;
if (true) break;

case 48:
//C
this.state = 49;
Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 1860;BA.debugLine="Dim global_currency_code As String = root.Get(\"gl";
Debug.ShouldStop(8);
_global_currency_code = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("global_currency_code")))));Debug.locals.put("global_currency_code", _global_currency_code);Debug.locals.put("global_currency_code", _global_currency_code);
 BA.debugLineNum = 1861;BA.debugLine="Dim status As String = root.Get(\"status\")";
Debug.ShouldStop(16);
_status = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 1862;BA.debugLine="Dim is_virtual As Int = root.Getdefault(\"is_virtu";
Debug.ShouldStop(32);
_is_virtual = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_virtual"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("is_virtual", _is_virtual);Debug.locals.put("is_virtual", _is_virtual);
 BA.debugLineNum = 1863;BA.debugLine="Dim base_total_invoiced_cost As Int = root.Getdef";
Debug.ShouldStop(64);
_base_total_invoiced_cost = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_invoiced_cost"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_total_invoiced_cost", _base_total_invoiced_cost);Debug.locals.put("base_total_invoiced_cost", _base_total_invoiced_cost);
 BA.debugLineNum = 1864;BA.debugLine="Dim discount_tax_compensation_invoiced As Int = r";
Debug.ShouldStop(128);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 1865;BA.debugLine="Dim status_histories As List = root.Get(\"status_h";
Debug.ShouldStop(256);
_status_histories = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_status_histories = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_histories")))));Debug.locals.put("status_histories", _status_histories);Debug.locals.put("status_histories", _status_histories);
 BA.debugLineNum = 1866;BA.debugLine="Dim store_currency_code As String = root.Get(\"sto";
Debug.ShouldStop(512);
_store_currency_code = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_currency_code")))));Debug.locals.put("store_currency_code", _store_currency_code);Debug.locals.put("store_currency_code", _store_currency_code);
 BA.debugLineNum = 1867;BA.debugLine="Dim created_at As String = root.Get(\"created_at\")";
Debug.ShouldStop(1024);
_created_at = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 1868;BA.debugLine="Dim total_item_count As Int = root.Get(\"total_ite";
Debug.ShouldStop(2048);
_total_item_count = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_item_count")))));Debug.locals.put("total_item_count", _total_item_count);Debug.locals.put("total_item_count", _total_item_count);
 BA.debugLineNum = 1869;BA.debugLine="Dim shipping_tax_amount As Int = root.Getdefault(";
Debug.ShouldStop(4096);
_shipping_tax_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);
 BA.debugLineNum = 1870;BA.debugLine="Dim store_to_base_rate As Int = root.Getdefault(\"";
Debug.ShouldStop(8192);
_store_to_base_rate = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_to_base_rate"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("store_to_base_rate", _store_to_base_rate);Debug.locals.put("store_to_base_rate", _store_to_base_rate);
 BA.debugLineNum = 1871;BA.debugLine="Dim updated_at As String = root.Get(\"updated_at\")";
Debug.ShouldStop(16384);
_updated_at = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 1872;BA.debugLine="Dim base_shipping_discount_amount As Int = root.G";
Debug.ShouldStop(32768);
_base_shipping_discount_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);
 BA.debugLineNum = 1873;BA.debugLine="Dim store_name As String = root.Get(\"store_name\")";
Debug.ShouldStop(65536);
_store_name = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_name")))));Debug.locals.put("store_name", _store_name);Debug.locals.put("store_name", _store_name);
 BA.debugLineNum = 1874;BA.debugLine="Dim grand_total As Double = root.Get(\"grand_total";
Debug.ShouldStop(131072);
_grand_total = BA.numberCast(double.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("grand_total")))));Debug.locals.put("grand_total", _grand_total);Debug.locals.put("grand_total", _grand_total);
 BA.debugLineNum = 1875;BA.debugLine="Dim base_currency_code As String = root.Get(\"base";
Debug.ShouldStop(262144);
_base_currency_code = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_currency_code")))));Debug.locals.put("base_currency_code", _base_currency_code);Debug.locals.put("base_currency_code", _base_currency_code);
 BA.debugLineNum = 1876;BA.debugLine="Dim base_total_paid As Double = root.Getdefault(\"";
Debug.ShouldStop(524288);
_base_total_paid = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_total_paid", _base_total_paid);Debug.locals.put("base_total_paid", _base_total_paid);
 BA.debugLineNum = 1877;BA.debugLine="Dim base_tax_amount As Double = root.Getdefault(\"";
Debug.ShouldStop(1048576);
_base_tax_amount = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 1878;BA.debugLine="Dim store_id As Int = root.Get(\"store_id\")";
Debug.ShouldStop(2097152);
_store_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_id")))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 1879;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
Debug.ShouldStop(4194304);
_shipping_discount_tax_compensation_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);
 BA.debugLineNum = 1880;BA.debugLine="Dim total_due As Int = root.Get(\"total_due\")";
Debug.ShouldStop(8388608);
_total_due = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_due")))));Debug.locals.put("total_due", _total_due);Debug.locals.put("total_due", _total_due);
 BA.debugLineNum = 1881;BA.debugLine="Dim total_qty_ordered As Int = root.Getdefault(\"t";
Debug.ShouldStop(16777216);
_total_qty_ordered = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_qty_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("total_qty_ordered", _total_qty_ordered);Debug.locals.put("total_qty_ordered", _total_qty_ordered);
 BA.debugLineNum = 1882;BA.debugLine="Dim base_discount_amount As Int = root.Getdefault";
Debug.ShouldStop(33554432);
_base_discount_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 1883;BA.debugLine="Dim extension_attributes As Map = root.Get(\"exten";
Debug.ShouldStop(67108864);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 1884;BA.debugLine="Log(\"extension_attributes\" & extension_attributes";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","8104464593",RemoteObject.concat(RemoteObject.createImmutable("extension_attributes"),_extension_attributes),0);
 BA.debugLineNum = 1885;BA.debugLine="Dim pgw As Map = extension_attributes.Get(\"pgw\")";
Debug.ShouldStop(268435456);
_pgw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_pgw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pgw")))));Debug.locals.put("pgw", _pgw);Debug.locals.put("pgw", _pgw);
 BA.debugLineNum = 1886;BA.debugLine="Log(\"pgw\" & pgw)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","8104464595",RemoteObject.concat(RemoteObject.createImmutable("pgw"),_pgw),0);
 BA.debugLineNum = 1887;BA.debugLine="Dim extrinsic As List = pgw.Get(\"extrinsic\")";
Debug.ShouldStop(1073741824);
_extrinsic = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_extrinsic = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extrinsic")))));Debug.locals.put("extrinsic", _extrinsic);Debug.locals.put("extrinsic", _extrinsic);
 BA.debugLineNum = 1888;BA.debugLine="Dim extra_data As List = pgw.Get(\"extra_data\")";
Debug.ShouldStop(-2147483648);
_extra_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_extra_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extra_data")))));Debug.locals.put("extra_data", _extra_data);Debug.locals.put("extra_data", _extra_data);
 BA.debugLineNum = 1889;BA.debugLine="Dim posr_data As List = pgw.Get(\"posr_data\")";
Debug.ShouldStop(1);
_posr_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_posr_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("posr_data")))));Debug.locals.put("posr_data", _posr_data);Debug.locals.put("posr_data", _posr_data);
 BA.debugLineNum = 1890;BA.debugLine="Dim originator As List = pgw.Get(\"originator\")";
Debug.ShouldStop(2);
_originator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_originator = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("originator")))));Debug.locals.put("originator", _originator);Debug.locals.put("originator", _originator);
 BA.debugLineNum = 1891;BA.debugLine="Dim entity_id As String = pgw.Get(\"entity_id\")";
Debug.ShouldStop(4);
_entity_id = BA.ObjectToString(_pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("entity_id", _entity_id);Debug.locals.put("entity_id", _entity_id);
 BA.debugLineNum = 1892;BA.debugLine="Dim poom_data As List = pgw.Get(\"poom_data\")";
Debug.ShouldStop(8);
_poom_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_poom_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("poom_data")))));Debug.locals.put("poom_data", _poom_data);Debug.locals.put("poom_data", _poom_data);
 BA.debugLineNum = 1893;BA.debugLine="Dim po_number As String=pgw.Get(\"po_number\")";
Debug.ShouldStop(16);
_po_number = BA.ObjectToString(_pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("po_number")))));Debug.locals.put("po_number", _po_number);Debug.locals.put("po_number", _po_number);
 BA.debugLineNum = 1894;BA.debugLine="Dim shipping_assignments As List = extension_attr";
Debug.ShouldStop(32);
_shipping_assignments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_shipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_assignments")))));Debug.locals.put("shipping_assignments", _shipping_assignments);Debug.locals.put("shipping_assignments", _shipping_assignments);
 BA.debugLineNum = 1895;BA.debugLine="For Each colshipping_assignments As Map In shippi";
Debug.ShouldStop(64);
if (true) break;

case 49:
//for
this.state = 60;
_colshipping_assignments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group209 = _shipping_assignments;
index209 = 0;
groupLen209 = group209.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colshipping_assignments", _colshipping_assignments);
this.state = 98;
if (true) break;

case 98:
//C
this.state = 60;
if (index209 < groupLen209) {
this.state = 51;
_colshipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group209.runMethod(false,"Get",index209));Debug.locals.put("colshipping_assignments", _colshipping_assignments);}
if (true) break;

case 99:
//C
this.state = 98;
index209++;
Debug.locals.put("colshipping_assignments", _colshipping_assignments);
if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1896;BA.debugLine="Dim shipping As Map = colshipping_assignments.Ge";
Debug.ShouldStop(128);
_shipping = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_shipping = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping")))));Debug.locals.put("shipping", _shipping);Debug.locals.put("shipping", _shipping);
 BA.debugLineNum = 1897;BA.debugLine="Log(\"shipping\" & shipping)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","8104464606",RemoteObject.concat(RemoteObject.createImmutable("shipping"),_shipping),0);
 BA.debugLineNum = 1898;BA.debugLine="Dim total As Map = shipping.Get(\"total\")";
Debug.ShouldStop(512);
_total = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_total = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _shipping.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total")))));Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 1899;BA.debugLine="Dim shipping_amount As Int = total.Get(\"shipping";
Debug.ShouldStop(1024);
_shipping_amount = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_amount")))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 1900;BA.debugLine="Dim base_shipping_amount As Int = total.Get(\"bas";
Debug.ShouldStop(2048);
_base_shipping_amount = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_amount")))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 1901;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
Debug.ShouldStop(4096);
_shipping_discount_tax_compensation_amount = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);
 BA.debugLineNum = 1902;BA.debugLine="Dim shipping_discount_amount As Int = total.Getd";
Debug.ShouldStop(8192);
_shipping_discount_amount = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_discount_amount", _shipping_discount_amount);Debug.locals.put("shipping_discount_amount", _shipping_discount_amount);
 BA.debugLineNum = 1903;BA.debugLine="Dim base_shipping_discount_amount As Int = total";
Debug.ShouldStop(16384);
_base_shipping_discount_amount = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);
 BA.debugLineNum = 1904;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
Debug.ShouldStop(32768);
_base_shipping_discount_tax_compensation_amnt = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_tax_compensation_amnt"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);
 BA.debugLineNum = 1905;BA.debugLine="Dim base_shipping_incl_tax As Int = total.Getdef";
Debug.ShouldStop(65536);
_base_shipping_incl_tax = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);
 BA.debugLineNum = 1906;BA.debugLine="Dim shipping_invoiced As Int = total.Getdefault(";
Debug.ShouldStop(131072);
_shipping_invoiced = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_invoiced", _shipping_invoiced);Debug.locals.put("shipping_invoiced", _shipping_invoiced);
 BA.debugLineNum = 1907;BA.debugLine="Dim shipping_incl_tax As Int = total.Getdefault(";
Debug.ShouldStop(262144);
_shipping_incl_tax = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);
 BA.debugLineNum = 1908;BA.debugLine="Dim base_shipping_invoiced As Int = total.Getdef";
Debug.ShouldStop(524288);
_base_shipping_invoiced = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);
 BA.debugLineNum = 1909;BA.debugLine="Dim base_shipping_tax_amount As Int = total.Getd";
Debug.ShouldStop(1048576);
_base_shipping_tax_amount = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_tax_amount", _base_shipping_tax_amount);Debug.locals.put("base_shipping_tax_amount", _base_shipping_tax_amount);
 BA.debugLineNum = 1910;BA.debugLine="Dim shipping_tax_amount As Int = total.Getdefaul";
Debug.ShouldStop(2097152);
_shipping_tax_amount = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);
 BA.debugLineNum = 1911;BA.debugLine="Dim address As Map = shipping.Get(\"address\")";
Debug.ShouldStop(4194304);
_address = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_address = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _shipping.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address")))));Debug.locals.put("address", _address);Debug.locals.put("address", _address);
 BA.debugLineNum = 1912;BA.debugLine="Dim firstname As String = address.Get(\"firstname";
Debug.ShouldStop(8388608);
_firstname = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 1913;BA.debugLine="Dim address_type As String = address.Get(\"addres";
Debug.ShouldStop(16777216);
_address_type = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address_type")))));Debug.locals.put("address_type", _address_type);Debug.locals.put("address_type", _address_type);
 BA.debugLineNum = 1914;BA.debugLine="Dim customer_address_id As Int = address.Getdefa";
Debug.ShouldStop(33554432);
_customer_address_id = BA.numberCast(int.class, _address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_address_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_address_id", _customer_address_id);Debug.locals.put("customer_address_id", _customer_address_id);
 BA.debugLineNum = 1915;BA.debugLine="Dim city As String = address.Get(\"city\")";
Debug.ShouldStop(67108864);
_city = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 1916;BA.debugLine="Dim postcode As String = address.Get(\"postcode\")";
Debug.ShouldStop(134217728);
_postcode = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 1917;BA.debugLine="Dim region_id As Int = address.Getdefault(\"regio";
Debug.ShouldStop(268435456);
_region_id = BA.numberCast(int.class, _address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("region_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 1918;BA.debugLine="Dim telephone As String = address.Get(\"telephone";
Debug.ShouldStop(536870912);
_telephone = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 1920;BA.debugLine="Dim IDAddress As Int = address.Getdefault(\"entit";
Debug.ShouldStop(-2147483648);
_idaddress = BA.numberCast(int.class, _address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("entity_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("IDAddress", _idaddress);Debug.locals.put("IDAddress", _idaddress);
 BA.debugLineNum = 1921;BA.debugLine="Dim lastname As String = address.Get(\"lastname\")";
Debug.ShouldStop(1);
_lastname = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 1922;BA.debugLine="Dim parent_id As Int = address.Getdefault(\"paren";
Debug.ShouldStop(2);
_parent_id = BA.numberCast(int.class, _address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("parent_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 1923;BA.debugLine="Dim street As List = address.Get(\"street\")";
Debug.ShouldStop(4);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 1924;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(8);
if (true) break;

case 52:
//for
this.state = 55;
group237 = _street;
index237 = 0;
groupLen237 = group237.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 100;
if (true) break;

case 100:
//C
this.state = 55;
if (index237 < groupLen237) {
this.state = 54;
_colstreet = BA.ObjectToString(group237.runMethod(false,"Get",index237));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 101:
//C
this.state = 100;
index237++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 54:
//C
this.state = 101;
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 1926;BA.debugLine="Dim region As String = address.Get(\"region\")";
Debug.ShouldStop(32);
_region = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 1927;BA.debugLine="Dim country_id As String = address.Get(\"country_";
Debug.ShouldStop(64);
_country_id = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 1928;BA.debugLine="Dim email As String = address.Get(\"email\")";
Debug.ShouldStop(128);
_email = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 1929;BA.debugLine="Dim region_code As String = address.Get(\"region_";
Debug.ShouldStop(256);
_region_code = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 1930;BA.debugLine="Dim method As String = shipping.Get(\"method\")";
Debug.ShouldStop(512);
_method = BA.ObjectToString(_shipping.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("method")))));Debug.locals.put("method", _method);Debug.locals.put("method", _method);
 BA.debugLineNum = 1931;BA.debugLine="Dim items As List = colshipping_assignments.Get(";
Debug.ShouldStop(1024);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 1932;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(2048);
if (true) break;

case 56:
//for
this.state = 59;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group245 = _items;
index245 = 0;
groupLen245 = group245.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 102;
if (true) break;

case 102:
//C
this.state = 59;
if (index245 < groupLen245) {
this.state = 58;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group245.runMethod(false,"Get",index245));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 103:
//C
this.state = 102;
index245++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 58:
//C
this.state = 103;
 BA.debugLineNum = 1933;BA.debugLine="Log(\"colitems\" & colitems)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","8104464642",RemoteObject.concat(RemoteObject.createImmutable("colitems"),_colitems),0);
 if (true) break;
if (true) break;

case 59:
//C
this.state = 99;
Debug.locals.put("colitems", _colitems);
;
 if (true) break;
if (true) break;

case 60:
//C
this.state = 61;
Debug.locals.put("colshipping_assignments", _colshipping_assignments);
;
 BA.debugLineNum = 1991;BA.debugLine="Dim carts As List = extension_attributes.Get(\"car";
Debug.ShouldStop(64);
_carts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_carts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("carts")))));Debug.locals.put("carts", _carts);Debug.locals.put("carts", _carts);
 BA.debugLineNum = 1992;BA.debugLine="If extension_attributes.ContainsKey(\"payment_addi";
Debug.ShouldStop(128);
if (true) break;

case 61:
//if
this.state = 68;
if (_extension_attributes.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("payment_additional_info")))).<Boolean>get().booleanValue()) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 1993;BA.debugLine="Dim payment_additional_info As List = extension_";
Debug.ShouldStop(256);
_payment_additional_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_payment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment_additional_info")))));Debug.locals.put("payment_additional_info", _payment_additional_info);Debug.locals.put("payment_additional_info", _payment_additional_info);
 BA.debugLineNum = 1994;BA.debugLine="For Each colpayment_additional_info As Map In pa";
Debug.ShouldStop(512);
if (true) break;

case 64:
//for
this.state = 67;
_colpayment_additional_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group252 = _payment_additional_info;
index252 = 0;
groupLen252 = group252.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
this.state = 104;
if (true) break;

case 104:
//C
this.state = 67;
if (index252 < groupLen252) {
this.state = 66;
_colpayment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group252.runMethod(false,"Get",index252));Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);}
if (true) break;

case 105:
//C
this.state = 104;
index252++;
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
if (true) break;

case 66:
//C
this.state = 105;
 BA.debugLineNum = 1995;BA.debugLine="Dim value As String = colpayment_additional_inf";
Debug.ShouldStop(1024);
_value = BA.ObjectToString(_colpayment_additional_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 1996;BA.debugLine="Dim key As String = colpayment_additional_info.";
Debug.ShouldStop(2048);
_key = BA.ObjectToString(_colpayment_additional_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("key")))));Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 if (true) break;
if (true) break;

case 67:
//C
this.state = 68;
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
;
 if (true) break;
;
 BA.debugLineNum = 1999;BA.debugLine="If extension_attributes.ContainsKey(\"applied_taxe";
Debug.ShouldStop(16384);

case 68:
//if
this.state = 75;
if (_extension_attributes.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("applied_taxes")))).<Boolean>get().booleanValue()) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 2000;BA.debugLine="Dim applied_taxes As List = extension_attributes";
Debug.ShouldStop(32768);
_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_taxes")))));Debug.locals.put("applied_taxes", _applied_taxes);Debug.locals.put("applied_taxes", _applied_taxes);
 BA.debugLineNum = 2001;BA.debugLine="For Each colapplied_taxes As Map In applied_taxe";
Debug.ShouldStop(65536);
if (true) break;

case 71:
//for
this.state = 74;
_colapplied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group259 = _applied_taxes;
index259 = 0;
groupLen259 = group259.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
this.state = 106;
if (true) break;

case 106:
//C
this.state = 74;
if (index259 < groupLen259) {
this.state = 73;
_colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group259.runMethod(false,"Get",index259));Debug.locals.put("colapplied_taxes", _colapplied_taxes);}
if (true) break;

case 107:
//C
this.state = 106;
index259++;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
if (true) break;

case 73:
//C
this.state = 107;
 BA.debugLineNum = 2002;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"am";
Debug.ShouldStop(131072);
_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount")))));Debug.locals.put("amount", _amount);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 2003;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"code";
Debug.ShouldStop(262144);
_code = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 2004;BA.debugLine="Dim base_amount As Double = colapplied_taxes.Ge";
Debug.ShouldStop(524288);
_base_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount")))));Debug.locals.put("base_amount", _base_amount);Debug.locals.put("base_amount", _base_amount);
 BA.debugLineNum = 2005;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"tit";
Debug.ShouldStop(1048576);
_title = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 2006;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(\"p";
Debug.ShouldStop(2097152);
_percent = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("percent")))));Debug.locals.put("percent", _percent);Debug.locals.put("percent", _percent);
 if (true) break;
if (true) break;

case 74:
//C
this.state = 75;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
;
 if (true) break;
;
 BA.debugLineNum = 2009;BA.debugLine="If extension_attributes.ContainsKey(\"item_applied";
Debug.ShouldStop(16777216);

case 75:
//if
this.state = 86;
if (_extension_attributes.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("item_applied_taxes")))).<Boolean>get().booleanValue()) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 2010;BA.debugLine="Dim item_applied_taxes As List = extension_attri";
Debug.ShouldStop(33554432);
_item_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_item_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_applied_taxes")))));Debug.locals.put("item_applied_taxes", _item_applied_taxes);Debug.locals.put("item_applied_taxes", _item_applied_taxes);
 BA.debugLineNum = 2011;BA.debugLine="For Each colitem_applied_taxes As Map In item_ap";
Debug.ShouldStop(67108864);
if (true) break;

case 78:
//for
this.state = 85;
_colitem_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group269 = _item_applied_taxes;
index269 = 0;
groupLen269 = group269.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
this.state = 108;
if (true) break;

case 108:
//C
this.state = 85;
if (index269 < groupLen269) {
this.state = 80;
_colitem_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group269.runMethod(false,"Get",index269));Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);}
if (true) break;

case 109:
//C
this.state = 108;
index269++;
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 2012;BA.debugLine="Dim applied_taxes As List = colitem_applied_tax";
Debug.ShouldStop(134217728);
_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitem_applied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_taxes")))));Debug.locals.put("applied_taxes", _applied_taxes);Debug.locals.put("applied_taxes", _applied_taxes);
 BA.debugLineNum = 2013;BA.debugLine="For Each colapplied_taxes As Map In applied_tax";
Debug.ShouldStop(268435456);
if (true) break;

case 81:
//for
this.state = 84;
_colapplied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group271 = _applied_taxes;
index271 = 0;
groupLen271 = group271.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
this.state = 110;
if (true) break;

case 110:
//C
this.state = 84;
if (index271 < groupLen271) {
this.state = 83;
_colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group271.runMethod(false,"Get",index271));Debug.locals.put("colapplied_taxes", _colapplied_taxes);}
if (true) break;

case 111:
//C
this.state = 110;
index271++;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
if (true) break;

case 83:
//C
this.state = 111;
 BA.debugLineNum = 2014;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"a";
Debug.ShouldStop(536870912);
_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount")))));Debug.locals.put("amount", _amount);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 2015;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"cod";
Debug.ShouldStop(1073741824);
_code = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 2016;BA.debugLine="Dim base_amount As Double = colapplied_taxes.G";
Debug.ShouldStop(-2147483648);
_base_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount")))));Debug.locals.put("base_amount", _base_amount);Debug.locals.put("base_amount", _base_amount);
 BA.debugLineNum = 2017;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"ti";
Debug.ShouldStop(1);
_title = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 2018;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(\"";
Debug.ShouldStop(2);
_percent = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("percent")))));Debug.locals.put("percent", _percent);Debug.locals.put("percent", _percent);
 if (true) break;
if (true) break;

case 84:
//C
this.state = 109;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
;
 BA.debugLineNum = 2020;BA.debugLine="Dim Type As String = colitem_applied_taxes.Get(";
Debug.ShouldStop(8);
_type = BA.ObjectToString(_colitem_applied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Type", _type);Debug.locals.put("Type", _type);
 if (true) break;
if (true) break;

case 85:
//C
this.state = 86;
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
;
 if (true) break;

case 86:
//C
this.state = -1;
;
 BA.debugLineNum = 2023;BA.debugLine="Dim converting_from_quote As String = extension_a";
Debug.ShouldStop(64);
_converting_from_quote = BA.ObjectToString(_extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("converting_from_quote")))));Debug.locals.put("converting_from_quote", _converting_from_quote);Debug.locals.put("converting_from_quote", _converting_from_quote);
 BA.debugLineNum = 2024;BA.debugLine="Dim contacts As List = extension_attributes.Get(\"";
Debug.ShouldStop(128);
_contacts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_contacts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("contacts")))));Debug.locals.put("contacts", _contacts);Debug.locals.put("contacts", _contacts);
 BA.debugLineNum = 2025;BA.debugLine="Dim shipping_description As String = root.Get(\"sh";
Debug.ShouldStop(256);
_shipping_description = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_description")))));Debug.locals.put("shipping_description", _shipping_description);Debug.locals.put("shipping_description", _shipping_description);
 BA.debugLineNum = 2026;BA.debugLine="Dim store_to_order_rate As Int = root.Getdefault(";
Debug.ShouldStop(512);
_store_to_order_rate = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_to_order_rate"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("store_to_order_rate", _store_to_order_rate);Debug.locals.put("store_to_order_rate", _store_to_order_rate);
 BA.debugLineNum = 2027;BA.debugLine="Dim shipping_amount As Int = root.Getdefault(\"shi";
Debug.ShouldStop(1024);
_shipping_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 2028;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
Debug.ShouldStop(2048);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 2029;BA.debugLine="Dim subtotal_invoiced As Int = root.Getdefault(\"s";
Debug.ShouldStop(4096);
_subtotal_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("subtotal_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("subtotal_invoiced", _subtotal_invoiced);Debug.locals.put("subtotal_invoiced", _subtotal_invoiced);
 BA.debugLineNum = 2030;BA.debugLine="Dim base_to_order_rate As Int = root.Getdefault(\"";
Debug.ShouldStop(8192);
_base_to_order_rate = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_to_order_rate"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_to_order_rate", _base_to_order_rate);Debug.locals.put("base_to_order_rate", _base_to_order_rate);
 BA.debugLineNum = 2031;BA.debugLine="Dim base_subtotal As Int = root.Getdefault(\"base_";
Debug.ShouldStop(16384);
_base_subtotal = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_subtotal", _base_subtotal);Debug.locals.put("base_subtotal", _base_subtotal);
 BA.debugLineNum = 2032;BA.debugLine="Dim protect_code As String = root.Get(\"protect_co";
Debug.ShouldStop(32768);
_protect_code = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("protect_code")))));Debug.locals.put("protect_code", _protect_code);Debug.locals.put("protect_code", _protect_code);
 BA.debugLineNum = 2033;BA.debugLine="Dim customer_dob As String = root.Get(\"customer_d";
Debug.ShouldStop(65536);
_customer_dob = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_dob")))));Debug.locals.put("customer_dob", _customer_dob);Debug.locals.put("customer_dob", _customer_dob);
 BA.debugLineNum = 2034;BA.debugLine="Dim base_total_due As Int = root.Getdefault(\"base";
Debug.ShouldStop(131072);
_base_total_due = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_due"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_total_due", _base_total_due);Debug.locals.put("base_total_due", _base_total_due);
 BA.debugLineNum = 2035;BA.debugLine="Dim base_subtotal_incl_tax As Double = root.Getde";
Debug.ShouldStop(262144);
_base_subtotal_incl_tax = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_subtotal_incl_tax", _base_subtotal_incl_tax);Debug.locals.put("base_subtotal_incl_tax", _base_subtotal_incl_tax);
 BA.debugLineNum = 2036;BA.debugLine="Dim customer_id As Int = root.Getdefault(\"custome";
Debug.ShouldStop(524288);
_customer_id = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_id", _customer_id);Debug.locals.put("customer_id", _customer_id);
 BA.debugLineNum = 2037;BA.debugLine="Dim customer_group_id As Int = root.Getdefault(\"c";
Debug.ShouldStop(1048576);
_customer_group_id = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_group_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_group_id", _customer_group_id);Debug.locals.put("customer_group_id", _customer_group_id);
 BA.debugLineNum = 2038;BA.debugLine="Dim discount_invoiced As Int = root.Getdefault(\"d";
Debug.ShouldStop(2097152);
_discount_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 2039;BA.debugLine="Dim order_currency_code As String = root.Get(\"ord";
Debug.ShouldStop(4194304);
_order_currency_code = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_currency_code")))));Debug.locals.put("order_currency_code", _order_currency_code);Debug.locals.put("order_currency_code", _order_currency_code);
 BA.debugLineNum = 2040;BA.debugLine="Dim base_tax_invoiced As Double = root.Getdefault";
Debug.ShouldStop(8388608);
_base_tax_invoiced = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_tax_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 BA.debugLineNum = 2041;BA.debugLine="Dim customer_gender As Int = root.Getdefault(\"cus";
Debug.ShouldStop(16777216);
_customer_gender = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_gender"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_gender", _customer_gender);Debug.locals.put("customer_gender", _customer_gender);
 BA.debugLineNum = 2042;BA.debugLine="Dim shipping_incl_tax As Int = root.Getdefault(\"s";
Debug.ShouldStop(33554432);
_shipping_incl_tax = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);
 BA.debugLineNum = 2043;BA.debugLine="Dim base_shipping_invoiced As Int = root.Getdefau";
Debug.ShouldStop(67108864);
_base_shipping_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);
 BA.debugLineNum = 2047;BA.debugLine="End Sub";
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
public static void  _btnlistapedidosmagento_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnListaPedidosMagento_Click (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1321);
if (RapidSub.canDelegate("btnlistapedidosmagento_click")) { __ref.runUserSub(false, "ctestsinfomagento","btnlistapedidosmagento_click", __ref); return;}
ResumableSub_btnListaPedidosMagento_Click rsub = new ResumableSub_btnListaPedidosMagento_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnListaPedidosMagento_Click extends BA.ResumableSub {
public ResumableSub_btnListaPedidosMagento_Click(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total_count = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _customer_firstname = RemoteObject.createImmutable("");
RemoteObject _billing_address = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _address_type = RemoteObject.createImmutable("");
RemoteObject _customer_address_id = RemoteObject.createImmutable(0);
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _postcode = RemoteObject.createImmutable("");
RemoteObject _region_id = RemoteObject.createImmutable(0);
RemoteObject _telephone = RemoteObject.createImmutable("");
RemoteObject _entity_id = RemoteObject.createImmutable(0);
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _parent_id = RemoteObject.createImmutable(0);
RemoteObject _street = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colstreet = RemoteObject.createImmutable("");
RemoteObject _region = RemoteObject.createImmutable("");
RemoteObject _country_id = RemoteObject.createImmutable("");
RemoteObject _email = RemoteObject.createImmutable("");
RemoteObject _region_code = RemoteObject.createImmutable("");
RemoteObject _total_paid = RemoteObject.createImmutable(0);
RemoteObject _increment_id = RemoteObject.createImmutable("");
RemoteObject _payment = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _base_amount_ordered = RemoteObject.createImmutable(0);
RemoteObject _amount_paid = RemoteObject.createImmutable(0);
RemoteObject _method = RemoteObject.createImmutable("");
RemoteObject _cc_last4 = RemoteObject.createImmutable("");
RemoteObject _account_status = RemoteObject.createImmutable("");
RemoteObject _amount_ordered = RemoteObject.createImmutable(0);
RemoteObject _base_amount_paid = RemoteObject.createImmutable(0);
RemoteObject _shipping_amount = RemoteObject.createImmutable(0);
RemoteObject _additional_information = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coladditional_information = RemoteObject.createImmutable("");
RemoteObject _base_shipping_amount = RemoteObject.createImmutable(0);
RemoteObject _state = RemoteObject.createImmutable("");
RemoteObject _base_grand_total = RemoteObject.createImmutable(0);
RemoteObject _billing_address_id = RemoteObject.createImmutable(0);
RemoteObject _customer_lastname = RemoteObject.createImmutable("");
RemoteObject _quote_id = RemoteObject.createImmutable(0);
RemoteObject _shipping_invoiced = RemoteObject.createImmutable(0);
RemoteObject _discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _weight = RemoteObject.createImmutable(0);
RemoteObject _idpedido = RemoteObject.createImmutable(0);
RemoteObject _base_total_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal_invoiced = RemoteObject.createImmutable(0);
RemoteObject _applied_rule_ids = RemoteObject.createImmutable("");
RemoteObject _subtotal_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_discount_tax_compensation_amnt = RemoteObject.createImmutable(0);
RemoteObject _subtotal = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _customer_email = RemoteObject.createImmutable("");
RemoteObject _base_discount_invoiced = RemoteObject.createImmutable(0);
RemoteObject _total_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_to_global_rate = RemoteObject.createImmutable(0);
RemoteObject _customer_is_guest = RemoteObject.createImmutable(0);
RemoteObject _tax_amount = RemoteObject.createImmutable(0);
RemoteObject _tax_invoiced = RemoteObject.createImmutable(0);
RemoteObject _original_price = RemoteObject.createImmutable(0);
RemoteObject _free_shipping = RemoteObject.createImmutable(0);
RemoteObject _base_discount_tax_compensation_invoiced = RemoteObject.createImmutable(0);
RemoteObject _discount_amount = RemoteObject.createImmutable(0);
RemoteObject _tax_percent = RemoteObject.createImmutable(0);
RemoteObject _price_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _price = RemoteObject.createImmutable(0);
RemoteObject _product_id = RemoteObject.createImmutable(0);
RemoteObject _base_row_total = RemoteObject.createImmutable(0);
RemoteObject _sku = RemoteObject.createImmutable("");
RemoteObject _base_original_price = RemoteObject.createImmutable(0);
RemoteObject _row_weight = RemoteObject.createImmutable(0);
RemoteObject _base_amount_refunded = RemoteObject.createImmutable(0);
RemoteObject _base_price_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _no_discount = RemoteObject.createImmutable(0);
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _discount_percent = RemoteObject.createImmutable(0);
RemoteObject _order_id = RemoteObject.createImmutable(0);
RemoteObject _discount_tax_compensation_invoiced = RemoteObject.createImmutable(0);
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _qty_shipped = RemoteObject.createImmutable(0);
RemoteObject _qty_ordered = RemoteObject.createImmutable(0);
RemoteObject _row_total = RemoteObject.createImmutable(0);
RemoteObject _qty_canceled = RemoteObject.createImmutable(0);
RemoteObject _product_option = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _option_value = RemoteObject.createImmutable(0);
RemoteObject _option_id = RemoteObject.createImmutable("");
RemoteObject _amount_refunded = RemoteObject.createImmutable(0);
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _base_price = RemoteObject.createImmutable(0);
RemoteObject _qty_invoiced = RemoteObject.createImmutable(0);
RemoteObject _row_invoiced = RemoteObject.createImmutable(0);
RemoteObject _row_total_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _store_id = RemoteObject.createImmutable(0);
RemoteObject _item_id = RemoteObject.createImmutable(0);
RemoteObject _base_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _base_row_total_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _product_type = RemoteObject.createImmutable("");
RemoteObject _qty_refunded = RemoteObject.createImmutable(0);
RemoteObject _base_row_invoiced = RemoteObject.createImmutable(0);
RemoteObject _is_qty_decimal = RemoteObject.createImmutable(0);
RemoteObject _discount_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_tax_invoiced = RemoteObject.createImmutable(0);
RemoteObject _global_currency_code = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _is_virtual = RemoteObject.createImmutable(0);
RemoteObject _base_total_invoiced_cost = RemoteObject.createImmutable(0);
RemoteObject _status_histories = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _store_currency_code = RemoteObject.createImmutable("");
RemoteObject _total_item_count = RemoteObject.createImmutable(0);
RemoteObject _shipping_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _store_to_base_rate = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _store_name = RemoteObject.createImmutable("");
RemoteObject _grand_total = RemoteObject.createImmutable(0);
RemoteObject _base_currency_code = RemoteObject.createImmutable("");
RemoteObject _base_total_paid = RemoteObject.createImmutable(0);
RemoteObject _shipping_discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _total_due = RemoteObject.createImmutable(0);
RemoteObject _total_qty_ordered = RemoteObject.createImmutable(0);
RemoteObject _shipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colshipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shipping = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shipping_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _shipping_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _address = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _payment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colpayment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _amount = RemoteObject.createImmutable(0);
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _base_amount = RemoteObject.createImmutable(0);
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _percent = RemoteObject.createImmutable(0);
RemoteObject _item_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitem_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _type = RemoteObject.createImmutable("");
RemoteObject _converting_from_quote = RemoteObject.createImmutable("");
RemoteObject _shipping_description = RemoteObject.createImmutable("");
RemoteObject _store_to_order_rate = RemoteObject.createImmutable(0);
RemoteObject _subtotal_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_to_order_rate = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal = RemoteObject.createImmutable(0);
RemoteObject _protect_code = RemoteObject.createImmutable("");
RemoteObject _customer_dob = RemoteObject.createImmutable("");
RemoteObject _base_total_due = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _customer_id = RemoteObject.createImmutable(0);
RemoteObject _customer_group_id = RemoteObject.createImmutable(0);
RemoteObject _order_currency_code = RemoteObject.createImmutable("");
RemoteObject _customer_gender = RemoteObject.createImmutable(0);
RemoteObject _search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _page_size = RemoteObject.createImmutable(0);
RemoteObject group8;
int index8;
int groupLen8;
RemoteObject group23;
int index23;
int groupLen23;
RemoteObject group43;
int index43;
int groupLen43;
RemoteObject group71;
int index71;
int groupLen71;
RemoteObject group106;
int index106;
int groupLen106;
RemoteObject group157;
int index157;
int groupLen157;
RemoteObject group184;
int index184;
int groupLen184;
RemoteObject group192;
int index192;
int groupLen192;
RemoteObject group226;
int index226;
int groupLen226;
RemoteObject group252;
int index252;
int groupLen252;
RemoteObject group257;
int index257;
int groupLen257;
RemoteObject group265;
int index265;
int groupLen265;
RemoteObject group267;
int index267;
int groupLen267;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnListaPedidosMagento_Click (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1321);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1323;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidos(t";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "btnlistapedidosmagento_click"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentoinformacionpedidos" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 71;
return;
case 71:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1324;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 1326;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8192);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1327;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(16384);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 1328;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(32768);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1329;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
Debug.ShouldStop(65536);
_total_count = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_count")))));Debug.locals.put("total_count", _total_count);Debug.locals.put("total_count", _total_count);
 BA.debugLineNum = 1330;BA.debugLine="Dim items As List = root.Get(\"items\")";
Debug.ShouldStop(131072);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 1331;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(262144);
if (true) break;

case 7:
//for
this.state = 70;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group8 = _items;
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 72;
if (true) break;

case 72:
//C
this.state = 70;
if (index8 < groupLen8) {
this.state = 9;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group8.runMethod(false,"Get",index8));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 73:
//C
this.state = 72;
index8++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1332;BA.debugLine="Log(\"ColItems: \" & colitems)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","8104333323",RemoteObject.concat(RemoteObject.createImmutable("ColItems: "),_colitems),0);
 BA.debugLineNum = 1338;BA.debugLine="Dim customer_firstname As String = colitems.Get(";
Debug.ShouldStop(33554432);
_customer_firstname = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_firstname")))));Debug.locals.put("customer_firstname", _customer_firstname);Debug.locals.put("customer_firstname", _customer_firstname);
 BA.debugLineNum = 1340;BA.debugLine="Dim billing_address As Map = colitems.Get(\"billi";
Debug.ShouldStop(134217728);
_billing_address = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_billing_address = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("billing_address")))));Debug.locals.put("billing_address", _billing_address);Debug.locals.put("billing_address", _billing_address);
 BA.debugLineNum = 1341;BA.debugLine="Dim firstname As String = billing_address.Get(\"f";
Debug.ShouldStop(268435456);
_firstname = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 1342;BA.debugLine="Dim address_type As String = billing_address.Get";
Debug.ShouldStop(536870912);
_address_type = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address_type")))));Debug.locals.put("address_type", _address_type);Debug.locals.put("address_type", _address_type);
 BA.debugLineNum = 1343;BA.debugLine="Dim customer_address_id As Int = billing_address";
Debug.ShouldStop(1073741824);
_customer_address_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_address_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_address_id", _customer_address_id);Debug.locals.put("customer_address_id", _customer_address_id);
 BA.debugLineNum = 1344;BA.debugLine="Dim city As String = billing_address.Get(\"city\")";
Debug.ShouldStop(-2147483648);
_city = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 1345;BA.debugLine="Dim postcode As String = billing_address.Get(\"po";
Debug.ShouldStop(1);
_postcode = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 1346;BA.debugLine="Dim region_id As Int = billing_address.Getdefaul";
Debug.ShouldStop(2);
_region_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("region_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 1347;BA.debugLine="Dim telephone As String = billing_address.Get(\"t";
Debug.ShouldStop(4);
_telephone = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 1348;BA.debugLine="Dim entity_id As Int = billing_address.Get(\"enti";
Debug.ShouldStop(8);
_entity_id = BA.numberCast(int.class, _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("entity_id", _entity_id);Debug.locals.put("entity_id", _entity_id);
 BA.debugLineNum = 1349;BA.debugLine="Dim lastname As String = billing_address.Get(\"la";
Debug.ShouldStop(16);
_lastname = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 1350;BA.debugLine="Dim parent_id As Int = billing_address.Get(\"pare";
Debug.ShouldStop(32);
_parent_id = BA.numberCast(int.class, _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parent_id")))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 1351;BA.debugLine="Dim street As List = billing_address.Get(\"street";
Debug.ShouldStop(64);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 1352;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(128);
if (true) break;

case 10:
//for
this.state = 13;
group23 = _street;
index23 = 0;
groupLen23 = group23.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 74;
if (true) break;

case 74:
//C
this.state = 13;
if (index23 < groupLen23) {
this.state = 12;
_colstreet = BA.ObjectToString(group23.runMethod(false,"Get",index23));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 75:
//C
this.state = 74;
index23++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 12:
//C
this.state = 75;
 BA.debugLineNum = 1353;BA.debugLine="Log(\"colstreet:\" & colstreet)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","8104333344",RemoteObject.concat(RemoteObject.createImmutable("colstreet:"),_colstreet),0);
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 1355;BA.debugLine="Dim region As String = billing_address.Get(\"regi";
Debug.ShouldStop(1024);
_region = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 1356;BA.debugLine="Dim country_id As String = billing_address.Get(\"";
Debug.ShouldStop(2048);
_country_id = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 1357;BA.debugLine="Dim email As String = billing_address.Get(\"email";
Debug.ShouldStop(4096);
_email = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 1358;BA.debugLine="Dim region_code As String = billing_address.Get(";
Debug.ShouldStop(8192);
_region_code = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 1359;BA.debugLine="Dim total_paid As Double = colitems.Getdefault(\"";
Debug.ShouldStop(16384);
_total_paid = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("total_paid", _total_paid);Debug.locals.put("total_paid", _total_paid);
 BA.debugLineNum = 1360;BA.debugLine="Dim increment_id As String = colitems.Get(\"incre";
Debug.ShouldStop(32768);
_increment_id = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("increment_id")))));Debug.locals.put("increment_id", _increment_id);Debug.locals.put("increment_id", _increment_id);
 BA.debugLineNum = 1361;BA.debugLine="Dim payment As Map = colitems.Get(\"payment\")";
Debug.ShouldStop(65536);
_payment = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_payment = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment")))));Debug.locals.put("payment", _payment);Debug.locals.put("payment", _payment);
 BA.debugLineNum = 1362;BA.debugLine="Dim base_amount_ordered As Double = payment.Getd";
Debug.ShouldStop(131072);
_base_amount_ordered = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_ordered", _base_amount_ordered);Debug.locals.put("base_amount_ordered", _base_amount_ordered);
 BA.debugLineNum = 1363;BA.debugLine="Dim amount_paid As Double = payment.Getdefault(\"";
Debug.ShouldStop(262144);
_amount_paid = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("amount_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("amount_paid", _amount_paid);Debug.locals.put("amount_paid", _amount_paid);
 BA.debugLineNum = 1364;BA.debugLine="Dim method As String = payment.Get(\"method\")";
Debug.ShouldStop(524288);
_method = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("method")))));Debug.locals.put("method", _method);Debug.locals.put("method", _method);
 BA.debugLineNum = 1365;BA.debugLine="Dim cc_last4 As String = payment.Get(\"cc_last4\")";
Debug.ShouldStop(1048576);
_cc_last4 = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cc_last4")))));Debug.locals.put("cc_last4", _cc_last4);Debug.locals.put("cc_last4", _cc_last4);
 BA.debugLineNum = 1367;BA.debugLine="Dim account_status As String = payment.Get(\"acco";
Debug.ShouldStop(4194304);
_account_status = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_status")))));Debug.locals.put("account_status", _account_status);Debug.locals.put("account_status", _account_status);
 BA.debugLineNum = 1368;BA.debugLine="Dim amount_ordered As Double = payment.Getdefaul";
Debug.ShouldStop(8388608);
_amount_ordered = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("amount_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("amount_ordered", _amount_ordered);Debug.locals.put("amount_ordered", _amount_ordered);
 BA.debugLineNum = 1369;BA.debugLine="Dim entity_id As Int = payment.Get(\"entity_id\")";
Debug.ShouldStop(16777216);
_entity_id = BA.numberCast(int.class, _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("entity_id", _entity_id);Debug.locals.put("entity_id", _entity_id);
 BA.debugLineNum = 1370;BA.debugLine="Dim base_amount_paid As Double = payment.Getdefa";
Debug.ShouldStop(33554432);
_base_amount_paid = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_paid", _base_amount_paid);Debug.locals.put("base_amount_paid", _base_amount_paid);
 BA.debugLineNum = 1371;BA.debugLine="Dim shipping_amount As Int = payment.Get(\"shippi";
Debug.ShouldStop(67108864);
_shipping_amount = BA.numberCast(int.class, _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_amount")))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 1372;BA.debugLine="Dim additional_information As List = payment.Get";
Debug.ShouldStop(134217728);
_additional_information = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_additional_information = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("additional_information")))));Debug.locals.put("additional_information", _additional_information);Debug.locals.put("additional_information", _additional_information);
 BA.debugLineNum = 1373;BA.debugLine="For Each coladditional_information As String In";
Debug.ShouldStop(268435456);
if (true) break;

case 14:
//for
this.state = 17;
group43 = _additional_information;
index43 = 0;
groupLen43 = group43.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("coladditional_information", _coladditional_information);
this.state = 76;
if (true) break;

case 76:
//C
this.state = 17;
if (index43 < groupLen43) {
this.state = 16;
_coladditional_information = BA.ObjectToString(group43.runMethod(false,"Get",index43));Debug.locals.put("coladditional_information", _coladditional_information);}
if (true) break;

case 77:
//C
this.state = 76;
index43++;
Debug.locals.put("coladditional_information", _coladditional_information);
if (true) break;

case 16:
//C
this.state = 77;
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
Debug.locals.put("coladditional_information", _coladditional_information);
;
 BA.debugLineNum = 1375;BA.debugLine="Dim base_shipping_amount As Int = payment.Get(\"b";
Debug.ShouldStop(1073741824);
_base_shipping_amount = BA.numberCast(int.class, _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_amount")))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 1376;BA.debugLine="Dim parent_id As Int = payment.Get(\"parent_id\")";
Debug.ShouldStop(-2147483648);
_parent_id = BA.numberCast(int.class, _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parent_id")))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 1378;BA.debugLine="Dim state As String = colitems.Get(\"state\")";
Debug.ShouldStop(2);
_state = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("state")))));Debug.locals.put("state", _state);Debug.locals.put("state", _state);
 BA.debugLineNum = 1380;BA.debugLine="Dim base_grand_total As Double = colitems.Get(\"b";
Debug.ShouldStop(8);
_base_grand_total = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_grand_total")))));Debug.locals.put("base_grand_total", _base_grand_total);Debug.locals.put("base_grand_total", _base_grand_total);
 BA.debugLineNum = 1381;BA.debugLine="Dim billing_address_id As Int = colitems.Get(\"bi";
Debug.ShouldStop(16);
_billing_address_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("billing_address_id")))));Debug.locals.put("billing_address_id", _billing_address_id);Debug.locals.put("billing_address_id", _billing_address_id);
 BA.debugLineNum = 1382;BA.debugLine="Dim customer_lastname As String = colitems.Get(\"";
Debug.ShouldStop(32);
_customer_lastname = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_lastname")))));Debug.locals.put("customer_lastname", _customer_lastname);Debug.locals.put("customer_lastname", _customer_lastname);
 BA.debugLineNum = 1383;BA.debugLine="Dim quote_id As Int = colitems.Get(\"quote_id\")";
Debug.ShouldStop(64);
_quote_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("quote_id")))));Debug.locals.put("quote_id", _quote_id);Debug.locals.put("quote_id", _quote_id);
 BA.debugLineNum = 1384;BA.debugLine="Dim shipping_invoiced As Int = colitems.Getdefau";
Debug.ShouldStop(128);
_shipping_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_invoiced", _shipping_invoiced);Debug.locals.put("shipping_invoiced", _shipping_invoiced);
 BA.debugLineNum = 1385;BA.debugLine="Dim discount_tax_compensation_amount As Int = co";
Debug.ShouldStop(256);
_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_tax_compensation_amount")))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 1386;BA.debugLine="Dim weight As Int = colitems.Get(\"weight\")";
Debug.ShouldStop(512);
_weight = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weight")))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 1387;BA.debugLine="Dim entity_id As Int = colitems.Get(\"entity_id\")";
Debug.ShouldStop(1024);
_entity_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("entity_id", _entity_id);Debug.locals.put("entity_id", _entity_id);
 BA.debugLineNum = 1388;BA.debugLine="Dim IDPedido As Int = colitems.Get(\"entity_id\")";
Debug.ShouldStop(2048);
_idpedido = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("IDPedido", _idpedido);Debug.locals.put("IDPedido", _idpedido);
 BA.debugLineNum = 1389;BA.debugLine="Dim base_total_invoiced As Double = colitems.Get";
Debug.ShouldStop(4096);
_base_total_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_total_invoiced", _base_total_invoiced);Debug.locals.put("base_total_invoiced", _base_total_invoiced);
 BA.debugLineNum = 1390;BA.debugLine="Dim base_shipping_amount As Int = colitems.Get(\"";
Debug.ShouldStop(8192);
_base_shipping_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_amount")))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 1391;BA.debugLine="Dim base_subtotal_invoiced As Int = colitems.Get";
Debug.ShouldStop(16384);
_base_subtotal_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_subtotal_invoiced", _base_subtotal_invoiced);Debug.locals.put("base_subtotal_invoiced", _base_subtotal_invoiced);
 BA.debugLineNum = 1392;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"a";
Debug.ShouldStop(32768);
_applied_rule_ids = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 1393;BA.debugLine="Dim subtotal_incl_tax As Double = colitems.Get(\"";
Debug.ShouldStop(65536);
_subtotal_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("subtotal_incl_tax")))));Debug.locals.put("subtotal_incl_tax", _subtotal_incl_tax);Debug.locals.put("subtotal_incl_tax", _subtotal_incl_tax);
 BA.debugLineNum = 1394;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
Debug.ShouldStop(131072);
_base_shipping_discount_tax_compensation_amnt = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_discount_tax_compensation_amnt")))));Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);
 BA.debugLineNum = 1395;BA.debugLine="Dim subtotal As Int = colitems.Get(\"subtotal\")";
Debug.ShouldStop(262144);
_subtotal = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("subtotal")))));Debug.locals.put("subtotal", _subtotal);Debug.locals.put("subtotal", _subtotal);
 BA.debugLineNum = 1396;BA.debugLine="Dim base_shipping_incl_tax As Int = colitems.Get";
Debug.ShouldStop(524288);
_base_shipping_incl_tax = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_incl_tax")))));Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);
 BA.debugLineNum = 1397;BA.debugLine="Dim customer_email As String = colitems.Get(\"cus";
Debug.ShouldStop(1048576);
_customer_email = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_email")))));Debug.locals.put("customer_email", _customer_email);Debug.locals.put("customer_email", _customer_email);
 BA.debugLineNum = 1398;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Get";
Debug.ShouldStop(2097152);
_base_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 1399;BA.debugLine="Dim total_invoiced As Double = colitems.Getdefau";
Debug.ShouldStop(4194304);
_total_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("total_invoiced", _total_invoiced);Debug.locals.put("total_invoiced", _total_invoiced);
 BA.debugLineNum = 1400;BA.debugLine="Dim base_to_global_rate As Int = colitems.Get(\"b";
Debug.ShouldStop(8388608);
_base_to_global_rate = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_to_global_rate")))));Debug.locals.put("base_to_global_rate", _base_to_global_rate);Debug.locals.put("base_to_global_rate", _base_to_global_rate);
 BA.debugLineNum = 1401;BA.debugLine="Dim customer_is_guest As Int = colitems.Get(\"cus";
Debug.ShouldStop(16777216);
_customer_is_guest = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_is_guest")))));Debug.locals.put("customer_is_guest", _customer_is_guest);Debug.locals.put("customer_is_guest", _customer_is_guest);
 BA.debugLineNum = 1402;BA.debugLine="Dim items As List = colitems.Get(\"items\")";
Debug.ShouldStop(33554432);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 1403;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(67108864);
if (true) break;

case 18:
//for
this.state = 29;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group71 = _items;
index71 = 0;
groupLen71 = group71.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 78;
if (true) break;

case 78:
//C
this.state = 29;
if (index71 < groupLen71) {
this.state = 20;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group71.runMethod(false,"Get",index71));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 79:
//C
this.state = 78;
index71++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1404;BA.debugLine="Dim tax_amount As Double = Utilidades.FixNullDo";
Debug.ShouldStop(134217728);
_tax_amount = parent._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tax_amount"))))));Debug.locals.put("tax_amount", _tax_amount);Debug.locals.put("tax_amount", _tax_amount);
 BA.debugLineNum = 1405;BA.debugLine="Dim tax_invoiced As Double = colitems.Get(\"tax_";
Debug.ShouldStop(268435456);
_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tax_invoiced")))));Debug.locals.put("tax_invoiced", _tax_invoiced);Debug.locals.put("tax_invoiced", _tax_invoiced);
 BA.debugLineNum = 1406;BA.debugLine="Dim original_price As Int = colitems.Get(\"origi";
Debug.ShouldStop(536870912);
_original_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("original_price")))));Debug.locals.put("original_price", _original_price);Debug.locals.put("original_price", _original_price);
 BA.debugLineNum = 1407;BA.debugLine="Dim free_shipping As Int = colitems.Get(\"free_s";
Debug.ShouldStop(1073741824);
_free_shipping = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("free_shipping")))));Debug.locals.put("free_shipping", _free_shipping);Debug.locals.put("free_shipping", _free_shipping);
 BA.debugLineNum = 1408;BA.debugLine="Dim base_discount_tax_compensation_invoiced As";
Debug.ShouldStop(-2147483648);
_base_discount_tax_compensation_invoiced = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)(_colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0))))));Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);
 BA.debugLineNum = 1409;BA.debugLine="Dim discount_amount As Int = Utilidades.FixNull";
Debug.ShouldStop(1);
_discount_amount = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_amount"))))));Debug.locals.put("discount_amount", _discount_amount);Debug.locals.put("discount_amount", _discount_amount);
 BA.debugLineNum = 1410;BA.debugLine="Dim tax_percent As Double = Utilidades.FixNullD";
Debug.ShouldStop(2);
_tax_percent = parent._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tax_percent"))))));Debug.locals.put("tax_percent", _tax_percent);Debug.locals.put("tax_percent", _tax_percent);
 BA.debugLineNum = 1411;BA.debugLine="Dim price_incl_tax As Double = Utilidades.FixNu";
Debug.ShouldStop(4);
_price_incl_tax = parent._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)(_colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("price_incl_tax"))),(Object)(RemoteObject.createImmutable((0))))));Debug.locals.put("price_incl_tax", _price_incl_tax);Debug.locals.put("price_incl_tax", _price_incl_tax);
 BA.debugLineNum = 1412;BA.debugLine="Dim price As Int = colitems.Get(\"price\")";
Debug.ShouldStop(8);
_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("price")))));Debug.locals.put("price", _price);Debug.locals.put("price", _price);
 BA.debugLineNum = 1413;BA.debugLine="Dim product_id As Int = colitems.Get(\"product_i";
Debug.ShouldStop(16);
_product_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_id")))));Debug.locals.put("product_id", _product_id);Debug.locals.put("product_id", _product_id);
 BA.debugLineNum = 1414;BA.debugLine="Dim base_row_total As Int = colitems.Get(\"base_";
Debug.ShouldStop(32);
_base_row_total = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total")))));Debug.locals.put("base_row_total", _base_row_total);Debug.locals.put("base_row_total", _base_row_total);
 BA.debugLineNum = 1415;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
Debug.ShouldStop(64);
_sku = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sku")))));Debug.locals.put("sku", _sku);Debug.locals.put("sku", _sku);
 BA.debugLineNum = 1416;BA.debugLine="Dim discount_tax_compensation_amount As Int = U";
Debug.ShouldStop(128);
_discount_tax_compensation_amount = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)(_colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0))))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 1417;BA.debugLine="Dim weight As Int = Utilidades.FixNullInt(colit";
Debug.ShouldStop(256);
_weight = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)(_colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("weight"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 1418;BA.debugLine="Dim base_original_price As Int = colitems.GetDE";
Debug.ShouldStop(512);
_base_original_price = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_original_price"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_original_price", _base_original_price);Debug.locals.put("base_original_price", _base_original_price);
 BA.debugLineNum = 1419;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_weigh";
Debug.ShouldStop(1024);
_row_weight = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_weight")))));Debug.locals.put("row_weight", _row_weight);Debug.locals.put("row_weight", _row_weight);
 BA.debugLineNum = 1420;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"";
Debug.ShouldStop(2048);
_applied_rule_ids = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 1421;BA.debugLine="Dim base_amount_refunded As Int = colitems.Get(";
Debug.ShouldStop(4096);
_base_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount_refunded")))));Debug.locals.put("base_amount_refunded", _base_amount_refunded);Debug.locals.put("base_amount_refunded", _base_amount_refunded);
 BA.debugLineNum = 1422;BA.debugLine="Dim base_price_incl_tax As Double = colitems.Ge";
Debug.ShouldStop(8192);
_base_price_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_price_incl_tax"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);
 BA.debugLineNum = 1423;BA.debugLine="Dim no_discount As Int = colitems.Get(\"no_disco";
Debug.ShouldStop(16384);
_no_discount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("no_discount")))));Debug.locals.put("no_discount", _no_discount);Debug.locals.put("no_discount", _no_discount);
 BA.debugLineNum = 1424;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
Debug.ShouldStop(32768);
_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1425;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Ge";
Debug.ShouldStop(65536);
_base_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_invoiced")))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 1426;BA.debugLine="Dim discount_percent As Int = colitems.Get(\"dis";
Debug.ShouldStop(131072);
_discount_percent = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_percent")))));Debug.locals.put("discount_percent", _discount_percent);Debug.locals.put("discount_percent", _discount_percent);
 BA.debugLineNum = 1427;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id\")";
Debug.ShouldStop(262144);
_order_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_id")))));Debug.locals.put("order_id", _order_id);Debug.locals.put("order_id", _order_id);
 BA.debugLineNum = 1428;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
Debug.ShouldStop(524288);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 1429;BA.debugLine="Dim created_at As String = colitems.Get(\"create";
Debug.ShouldStop(1048576);
_created_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 1430;BA.debugLine="Dim qty_shipped As Int = colitems.Get(\"qty_ship";
Debug.ShouldStop(2097152);
_qty_shipped = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_shipped")))));Debug.locals.put("qty_shipped", _qty_shipped);Debug.locals.put("qty_shipped", _qty_shipped);
 BA.debugLineNum = 1431;BA.debugLine="Dim qty_ordered As Int = colitems.Get(\"qty_orde";
Debug.ShouldStop(4194304);
_qty_ordered = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_ordered")))));Debug.locals.put("qty_ordered", _qty_ordered);Debug.locals.put("qty_ordered", _qty_ordered);
 BA.debugLineNum = 1432;BA.debugLine="Dim row_total As Int = colitems.Get(\"row_total\"";
Debug.ShouldStop(8388608);
_row_total = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total")))));Debug.locals.put("row_total", _row_total);Debug.locals.put("row_total", _row_total);
 BA.debugLineNum = 1433;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_can";
Debug.ShouldStop(16777216);
_qty_canceled = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_canceled")))));Debug.locals.put("qty_canceled", _qty_canceled);Debug.locals.put("qty_canceled", _qty_canceled);
 BA.debugLineNum = 1434;BA.debugLine="Dim product_option As Map = colitems.Get(\"produ";
Debug.ShouldStop(33554432);
_product_option = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_product_option = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_option")))));Debug.locals.put("product_option", _product_option);Debug.locals.put("product_option", _product_option);
 BA.debugLineNum = 1435;BA.debugLine="If product_option.IsInitialized Then";
Debug.ShouldStop(67108864);
if (true) break;

case 21:
//if
this.state = 28;
if (_product_option.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 1436;BA.debugLine="Dim extension_attributes As Map = product_opti";
Debug.ShouldStop(134217728);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _product_option.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 1437;BA.debugLine="Dim configurable_item_options As List = extens";
Debug.ShouldStop(268435456);
_configurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("configurable_item_options")))));Debug.locals.put("configurable_item_options", _configurable_item_options);Debug.locals.put("configurable_item_options", _configurable_item_options);
 BA.debugLineNum = 1438;BA.debugLine="For Each colconfigurable_item_options As Map I";
Debug.ShouldStop(536870912);
if (true) break;

case 24:
//for
this.state = 27;
_colconfigurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group106 = _configurable_item_options;
index106 = 0;
groupLen106 = group106.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
this.state = 80;
if (true) break;

case 80:
//C
this.state = 27;
if (index106 < groupLen106) {
this.state = 26;
_colconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group106.runMethod(false,"Get",index106));Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);}
if (true) break;

case 81:
//C
this.state = 80;
index106++;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
if (true) break;

case 26:
//C
this.state = 81;
 BA.debugLineNum = 1439;BA.debugLine="Dim option_value As Int = colconfigurable_ite";
Debug.ShouldStop(1073741824);
_option_value = BA.numberCast(int.class, _colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_value")))));Debug.locals.put("option_value", _option_value);Debug.locals.put("option_value", _option_value);
 BA.debugLineNum = 1440;BA.debugLine="Dim option_id As String = colconfigurable_ite";
Debug.ShouldStop(-2147483648);
_option_id = BA.ObjectToString(_colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_id")))));Debug.locals.put("option_id", _option_id);Debug.locals.put("option_id", _option_id);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
;
 if (true) break;

case 28:
//C
this.state = 79;
;
 BA.debugLineNum = 1443;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"amou";
Debug.ShouldStop(4);
_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount_refunded")))));Debug.locals.put("amount_refunded", _amount_refunded);Debug.locals.put("amount_refunded", _amount_refunded);
 BA.debugLineNum = 1444;BA.debugLine="Dim updated_at As String = colitems.Get(\"update";
Debug.ShouldStop(8);
_updated_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 1445;BA.debugLine="Dim base_price As Int = colitems.Get(\"base_pric";
Debug.ShouldStop(16);
_base_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_price")))));Debug.locals.put("base_price", _base_price);Debug.locals.put("base_price", _base_price);
 BA.debugLineNum = 1446;BA.debugLine="Dim qty_invoiced As Int = colitems.Get(\"qty_inv";
Debug.ShouldStop(32);
_qty_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_invoiced")))));Debug.locals.put("qty_invoiced", _qty_invoiced);Debug.locals.put("qty_invoiced", _qty_invoiced);
 BA.debugLineNum = 1447;BA.debugLine="Dim row_invoiced As Int = colitems.Get(\"row_inv";
Debug.ShouldStop(64);
_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_invoiced")))));Debug.locals.put("row_invoiced", _row_invoiced);Debug.locals.put("row_invoiced", _row_invoiced);
 BA.debugLineNum = 1448;BA.debugLine="Dim row_total_incl_tax As Double = colitems.Get";
Debug.ShouldStop(128);
_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total_incl_tax")))));Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);
 BA.debugLineNum = 1449;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"b";
Debug.ShouldStop(256);
_base_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_amount")))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 1450;BA.debugLine="Dim store_id As Int = colitems.Get(\"store_id\")";
Debug.ShouldStop(512);
_store_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_id")))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 1451;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
Debug.ShouldStop(1024);
_item_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_id")))));Debug.locals.put("item_id", _item_id);Debug.locals.put("item_id", _item_id);
 BA.debugLineNum = 1452;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(";
Debug.ShouldStop(2048);
_base_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_amount")))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 1453;BA.debugLine="Dim base_row_total_incl_tax As Double = colitem";
Debug.ShouldStop(4096);
_base_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total_incl_tax")))));Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);
 BA.debugLineNum = 1454;BA.debugLine="Dim base_discount_tax_compensation_amount As In";
Debug.ShouldStop(8192);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 1455;BA.debugLine="Dim product_type As String = colitems.Get(\"prod";
Debug.ShouldStop(16384);
_product_type = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_type")))));Debug.locals.put("product_type", _product_type);Debug.locals.put("product_type", _product_type);
 BA.debugLineNum = 1456;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_ref";
Debug.ShouldStop(32768);
_qty_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_refunded")))));Debug.locals.put("qty_refunded", _qty_refunded);Debug.locals.put("qty_refunded", _qty_refunded);
 BA.debugLineNum = 1457;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(\"ba";
Debug.ShouldStop(65536);
_base_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_invoiced")))));Debug.locals.put("base_row_invoiced", _base_row_invoiced);Debug.locals.put("base_row_invoiced", _base_row_invoiced);
 BA.debugLineNum = 1458;BA.debugLine="Dim is_qty_decimal As Int = colitems.Get(\"is_qt";
Debug.ShouldStop(131072);
_is_qty_decimal = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_qty_decimal")))));Debug.locals.put("is_qty_decimal", _is_qty_decimal);Debug.locals.put("is_qty_decimal", _is_qty_decimal);
 BA.debugLineNum = 1459;BA.debugLine="Dim discount_invoiced As Int = colitems.Get(\"di";
Debug.ShouldStop(262144);
_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_invoiced")))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 1460;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Get(";
Debug.ShouldStop(524288);
_base_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_invoiced")))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 1462;BA.debugLine="Dim global_currency_code As String = colitems.Ge";
Debug.ShouldStop(2097152);
_global_currency_code = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("global_currency_code")))));Debug.locals.put("global_currency_code", _global_currency_code);Debug.locals.put("global_currency_code", _global_currency_code);
 BA.debugLineNum = 1463;BA.debugLine="Dim status As String = colitems.Get(\"status\")";
Debug.ShouldStop(4194304);
_status = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 1464;BA.debugLine="Dim is_virtual As Int = colitems.Getdefault(\"is_";
Debug.ShouldStop(8388608);
_is_virtual = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_virtual"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("is_virtual", _is_virtual);Debug.locals.put("is_virtual", _is_virtual);
 BA.debugLineNum = 1465;BA.debugLine="Dim base_total_invoiced_cost As Int = colitems.G";
Debug.ShouldStop(16777216);
_base_total_invoiced_cost = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_invoiced_cost"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_total_invoiced_cost", _base_total_invoiced_cost);Debug.locals.put("base_total_invoiced_cost", _base_total_invoiced_cost);
 BA.debugLineNum = 1466;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
Debug.ShouldStop(33554432);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 1467;BA.debugLine="Dim status_histories As List = colitems.Get(\"sta";
Debug.ShouldStop(67108864);
_status_histories = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_status_histories = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_histories")))));Debug.locals.put("status_histories", _status_histories);Debug.locals.put("status_histories", _status_histories);
 BA.debugLineNum = 1468;BA.debugLine="Dim store_currency_code As String = colitems.Get";
Debug.ShouldStop(134217728);
_store_currency_code = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_currency_code")))));Debug.locals.put("store_currency_code", _store_currency_code);Debug.locals.put("store_currency_code", _store_currency_code);
 BA.debugLineNum = 1469;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
Debug.ShouldStop(268435456);
_created_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 1470;BA.debugLine="Dim total_item_count As Int = colitems.Getdefaul";
Debug.ShouldStop(536870912);
_total_item_count = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_item_count"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("total_item_count", _total_item_count);Debug.locals.put("total_item_count", _total_item_count);
 BA.debugLineNum = 1471;BA.debugLine="Dim shipping_tax_amount As Int = colitems.Getdef";
Debug.ShouldStop(1073741824);
_shipping_tax_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_tax_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);
 BA.debugLineNum = 1472;BA.debugLine="Dim store_to_base_rate As Int = colitems.Getdefa";
Debug.ShouldStop(-2147483648);
_store_to_base_rate = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_to_base_rate"))),(Object)(RemoteObject.createImmutable((1)))));Debug.locals.put("store_to_base_rate", _store_to_base_rate);Debug.locals.put("store_to_base_rate", _store_to_base_rate);
 BA.debugLineNum = 1473;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
Debug.ShouldStop(1);
_updated_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 1474;BA.debugLine="Dim base_shipping_discount_amount As Int = colit";
Debug.ShouldStop(2);
_base_shipping_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);
 BA.debugLineNum = 1475;BA.debugLine="Dim store_name As String = colitems.Get(\"store_n";
Debug.ShouldStop(4);
_store_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_name")))));Debug.locals.put("store_name", _store_name);Debug.locals.put("store_name", _store_name);
 BA.debugLineNum = 1476;BA.debugLine="Dim grand_total As Double = colitems.Getdefault(";
Debug.ShouldStop(8);
_grand_total = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("grand_total"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("grand_total", _grand_total);Debug.locals.put("grand_total", _grand_total);
 BA.debugLineNum = 1477;BA.debugLine="Dim base_currency_code As String = colitems.Get(";
Debug.ShouldStop(16);
_base_currency_code = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_currency_code")))));Debug.locals.put("base_currency_code", _base_currency_code);Debug.locals.put("base_currency_code", _base_currency_code);
 BA.debugLineNum = 1478;BA.debugLine="Dim base_total_paid As Double = colitems.Getdefa";
Debug.ShouldStop(32);
_base_total_paid = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_paid"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_total_paid", _base_total_paid);Debug.locals.put("base_total_paid", _base_total_paid);
 BA.debugLineNum = 1479;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"ba";
Debug.ShouldStop(64);
_base_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_amount")))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 1480;BA.debugLine="Dim store_id As Int = colitems.Get(\"store_id\")";
Debug.ShouldStop(128);
_store_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_id")))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 1481;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
Debug.ShouldStop(256);
_shipping_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);
 BA.debugLineNum = 1482;BA.debugLine="Dim total_due As Int = colitems.Getdefault(\"tota";
Debug.ShouldStop(512);
_total_due = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_due"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("total_due", _total_due);Debug.locals.put("total_due", _total_due);
 BA.debugLineNum = 1483;BA.debugLine="Dim total_qty_ordered As Int = colitems.Getdefau";
Debug.ShouldStop(1024);
_total_qty_ordered = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_qty_ordered"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("total_qty_ordered", _total_qty_ordered);Debug.locals.put("total_qty_ordered", _total_qty_ordered);
 BA.debugLineNum = 1484;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(\"";
Debug.ShouldStop(2048);
_base_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_amount")))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 1485;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
Debug.ShouldStop(4096);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 1486;BA.debugLine="If extension_attributes.IsInitialized Then";
Debug.ShouldStop(8192);
if (true) break;

case 30:
//if
this.state = 69;
if (_extension_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 1487;BA.debugLine="Dim shipping_assignments As List = extension_at";
Debug.ShouldStop(16384);
_shipping_assignments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_shipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_assignments")))));Debug.locals.put("shipping_assignments", _shipping_assignments);Debug.locals.put("shipping_assignments", _shipping_assignments);
 BA.debugLineNum = 1488;BA.debugLine="If shipping_assignments.IsInitialized Then";
Debug.ShouldStop(32768);
if (true) break;

case 33:
//if
this.state = 52;
if (_shipping_assignments.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1489;BA.debugLine="For Each colshipping_assignments As Map In shi";
Debug.ShouldStop(65536);
if (true) break;

case 36:
//for
this.state = 51;
_colshipping_assignments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group157 = _shipping_assignments;
index157 = 0;
groupLen157 = group157.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colshipping_assignments", _colshipping_assignments);
this.state = 82;
if (true) break;

case 82:
//C
this.state = 51;
if (index157 < groupLen157) {
this.state = 38;
_colshipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group157.runMethod(false,"Get",index157));Debug.locals.put("colshipping_assignments", _colshipping_assignments);}
if (true) break;

case 83:
//C
this.state = 82;
index157++;
Debug.locals.put("colshipping_assignments", _colshipping_assignments);
if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 1490;BA.debugLine="Dim shipping As Map = colshipping_assignments";
Debug.ShouldStop(131072);
_shipping = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_shipping = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping")))));Debug.locals.put("shipping", _shipping);Debug.locals.put("shipping", _shipping);
 BA.debugLineNum = 1491;BA.debugLine="Dim total As Map = shipping.Get(\"total\")";
Debug.ShouldStop(262144);
_total = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_total = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _shipping.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total")))));Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 1492;BA.debugLine="Dim shipping_amount As Int = total.Get(\"shipp";
Debug.ShouldStop(524288);
_shipping_amount = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_amount")))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 1493;BA.debugLine="Dim base_shipping_amount As Int = total.Get(\"";
Debug.ShouldStop(1048576);
_base_shipping_amount = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_amount")))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 1494;BA.debugLine="Dim shipping_discount_tax_compensation_amount";
Debug.ShouldStop(2097152);
_shipping_discount_tax_compensation_amount = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_discount_tax_compensation_amount")))));Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);
 BA.debugLineNum = 1495;BA.debugLine="Dim shipping_discount_amount As Int = total.G";
Debug.ShouldStop(4194304);
_shipping_discount_amount = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_discount_amount")))));Debug.locals.put("shipping_discount_amount", _shipping_discount_amount);Debug.locals.put("shipping_discount_amount", _shipping_discount_amount);
 BA.debugLineNum = 1496;BA.debugLine="Dim base_shipping_discount_amount As Int = to";
Debug.ShouldStop(8388608);
_base_shipping_discount_amount = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_discount_amount")))));Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);
 BA.debugLineNum = 1497;BA.debugLine="Dim base_shipping_discount_tax_compensation_a";
Debug.ShouldStop(16777216);
_base_shipping_discount_tax_compensation_amnt = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_discount_tax_compensation_amnt")))));Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);
 BA.debugLineNum = 1498;BA.debugLine="Dim base_shipping_incl_tax As Int = total.Get";
Debug.ShouldStop(33554432);
_base_shipping_incl_tax = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_incl_tax")))));Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);
 BA.debugLineNum = 1499;BA.debugLine="Dim shipping_invoiced As Int = total.Get(\"shi";
Debug.ShouldStop(67108864);
_shipping_invoiced = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_invoiced")))));Debug.locals.put("shipping_invoiced", _shipping_invoiced);Debug.locals.put("shipping_invoiced", _shipping_invoiced);
 BA.debugLineNum = 1500;BA.debugLine="Dim shipping_incl_tax As Int = total.Get(\"shi";
Debug.ShouldStop(134217728);
_shipping_incl_tax = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_incl_tax")))));Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);
 BA.debugLineNum = 1501;BA.debugLine="Dim base_shipping_invoiced As Int = total.Get";
Debug.ShouldStop(268435456);
_base_shipping_invoiced = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_invoiced")))));Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);
 BA.debugLineNum = 1502;BA.debugLine="Dim base_shipping_tax_amount As Int = total.G";
Debug.ShouldStop(536870912);
_base_shipping_tax_amount = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_tax_amount")))));Debug.locals.put("base_shipping_tax_amount", _base_shipping_tax_amount);Debug.locals.put("base_shipping_tax_amount", _base_shipping_tax_amount);
 BA.debugLineNum = 1503;BA.debugLine="Dim shipping_tax_amount As Int = total.Get(\"s";
Debug.ShouldStop(1073741824);
_shipping_tax_amount = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_tax_amount")))));Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);
 BA.debugLineNum = 1504;BA.debugLine="Dim address As Map = shipping.Get(\"address\")";
Debug.ShouldStop(-2147483648);
_address = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_address = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _shipping.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address")))));Debug.locals.put("address", _address);Debug.locals.put("address", _address);
 BA.debugLineNum = 1505;BA.debugLine="Dim firstname As String = address.Get(\"firstn";
Debug.ShouldStop(1);
_firstname = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 1506;BA.debugLine="Dim address_type As String = address.Get(\"add";
Debug.ShouldStop(2);
_address_type = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address_type")))));Debug.locals.put("address_type", _address_type);Debug.locals.put("address_type", _address_type);
 BA.debugLineNum = 1507;BA.debugLine="Dim customer_address_id As Int = address.Get(";
Debug.ShouldStop(4);
_customer_address_id = BA.numberCast(int.class, _address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_address_id")))));Debug.locals.put("customer_address_id", _customer_address_id);Debug.locals.put("customer_address_id", _customer_address_id);
 BA.debugLineNum = 1508;BA.debugLine="Dim city As String = address.Get(\"city\")";
Debug.ShouldStop(8);
_city = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 1509;BA.debugLine="Dim postcode As String = address.Get(\"postcod";
Debug.ShouldStop(16);
_postcode = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 1510;BA.debugLine="Dim region_id As Int = address.Get(\"region_id";
Debug.ShouldStop(32);
_region_id = BA.numberCast(int.class, _address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_id")))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 1511;BA.debugLine="Dim telephone As String = address.Get(\"teleph";
Debug.ShouldStop(64);
_telephone = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 1512;BA.debugLine="Dim entity_id As Int = address.Get(\"entity_id";
Debug.ShouldStop(128);
_entity_id = BA.numberCast(int.class, _address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("entity_id", _entity_id);Debug.locals.put("entity_id", _entity_id);
 BA.debugLineNum = 1513;BA.debugLine="Dim lastname As String = address.Get(\"lastnam";
Debug.ShouldStop(256);
_lastname = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 1514;BA.debugLine="Dim parent_id As Int = address.Get(\"parent_id";
Debug.ShouldStop(512);
_parent_id = BA.numberCast(int.class, _address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parent_id")))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 1515;BA.debugLine="Dim street As List = address.Get(\"street\")";
Debug.ShouldStop(1024);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 1516;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(2048);
if (true) break;

case 39:
//for
this.state = 42;
group184 = _street;
index184 = 0;
groupLen184 = group184.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 84;
if (true) break;

case 84:
//C
this.state = 42;
if (index184 < groupLen184) {
this.state = 41;
_colstreet = BA.ObjectToString(group184.runMethod(false,"Get",index184));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 85:
//C
this.state = 84;
index184++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 41:
//C
this.state = 85;
 if (true) break;
if (true) break;

case 42:
//C
this.state = 43;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 1518;BA.debugLine="Dim region As String = address.Get(\"region\")";
Debug.ShouldStop(8192);
_region = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 1519;BA.debugLine="Dim country_id As String = address.Get(\"count";
Debug.ShouldStop(16384);
_country_id = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 1520;BA.debugLine="Dim email As String = address.Get(\"email\")";
Debug.ShouldStop(32768);
_email = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 1521;BA.debugLine="Dim region_code As String = address.Get(\"regi";
Debug.ShouldStop(65536);
_region_code = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 1522;BA.debugLine="Dim method As String = shipping.Get(\"method\")";
Debug.ShouldStop(131072);
_method = BA.ObjectToString(_shipping.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("method")))));Debug.locals.put("method", _method);Debug.locals.put("method", _method);
 BA.debugLineNum = 1523;BA.debugLine="Dim items As List = colshipping_assignments.G";
Debug.ShouldStop(262144);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 1524;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(524288);
if (true) break;

case 43:
//for
this.state = 50;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group192 = _items;
index192 = 0;
groupLen192 = group192.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 86;
if (true) break;

case 86:
//C
this.state = 50;
if (index192 < groupLen192) {
this.state = 45;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group192.runMethod(false,"Get",index192));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 87:
//C
this.state = 86;
index192++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 1525;BA.debugLine="Dim tax_amount As Double = colitems.Get(\"tax";
Debug.ShouldStop(1048576);
_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tax_amount")))));Debug.locals.put("tax_amount", _tax_amount);Debug.locals.put("tax_amount", _tax_amount);
 BA.debugLineNum = 1526;BA.debugLine="Dim tax_invoiced As Double = colitems.Get(\"t";
Debug.ShouldStop(2097152);
_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tax_invoiced")))));Debug.locals.put("tax_invoiced", _tax_invoiced);Debug.locals.put("tax_invoiced", _tax_invoiced);
 BA.debugLineNum = 1527;BA.debugLine="Dim original_price As Int = colitems.Get(\"or";
Debug.ShouldStop(4194304);
_original_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("original_price")))));Debug.locals.put("original_price", _original_price);Debug.locals.put("original_price", _original_price);
 BA.debugLineNum = 1528;BA.debugLine="Dim free_shipping As Int = colitems.Get(\"fre";
Debug.ShouldStop(8388608);
_free_shipping = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("free_shipping")))));Debug.locals.put("free_shipping", _free_shipping);Debug.locals.put("free_shipping", _free_shipping);
 BA.debugLineNum = 1529;BA.debugLine="Dim base_discount_tax_compensation_invoiced";
Debug.ShouldStop(16777216);
_base_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_tax_compensation_invoiced")))));Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);
 BA.debugLineNum = 1530;BA.debugLine="Dim discount_amount As Int = colitems.Get(\"d";
Debug.ShouldStop(33554432);
_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_amount")))));Debug.locals.put("discount_amount", _discount_amount);Debug.locals.put("discount_amount", _discount_amount);
 BA.debugLineNum = 1531;BA.debugLine="Dim tax_percent As Double = colitems.Get(\"ta";
Debug.ShouldStop(67108864);
_tax_percent = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tax_percent")))));Debug.locals.put("tax_percent", _tax_percent);Debug.locals.put("tax_percent", _tax_percent);
 BA.debugLineNum = 1532;BA.debugLine="Dim price_incl_tax As Double = Utilidades.Fi";
Debug.ShouldStop(134217728);
_price_incl_tax = parent._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)(_colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("price_incl_tax"))),(Object)(RemoteObject.createImmutable((0))))));Debug.locals.put("price_incl_tax", _price_incl_tax);Debug.locals.put("price_incl_tax", _price_incl_tax);
 BA.debugLineNum = 1533;BA.debugLine="Dim price As Int = colitems.Get(\"price\")";
Debug.ShouldStop(268435456);
_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("price")))));Debug.locals.put("price", _price);Debug.locals.put("price", _price);
 BA.debugLineNum = 1534;BA.debugLine="Dim product_id As Int = colitems.Get(\"produc";
Debug.ShouldStop(536870912);
_product_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_id")))));Debug.locals.put("product_id", _product_id);Debug.locals.put("product_id", _product_id);
 BA.debugLineNum = 1535;BA.debugLine="Dim base_row_total As Int = colitems.Get(\"ba";
Debug.ShouldStop(1073741824);
_base_row_total = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total")))));Debug.locals.put("base_row_total", _base_row_total);Debug.locals.put("base_row_total", _base_row_total);
 BA.debugLineNum = 1536;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
Debug.ShouldStop(-2147483648);
_sku = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sku")))));Debug.locals.put("sku", _sku);Debug.locals.put("sku", _sku);
 BA.debugLineNum = 1537;BA.debugLine="Dim discount_tax_compensation_amount As Int";
Debug.ShouldStop(1);
_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_tax_compensation_amount")))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 1538;BA.debugLine="Dim weight As Int = colitems.Get(\"weight\")";
Debug.ShouldStop(2);
_weight = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weight")))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 1539;BA.debugLine="Dim base_original_price As Int = colitems.Ge";
Debug.ShouldStop(4);
_base_original_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_original_price")))));Debug.locals.put("base_original_price", _base_original_price);Debug.locals.put("base_original_price", _base_original_price);
 BA.debugLineNum = 1540;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_we";
Debug.ShouldStop(8);
_row_weight = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_weight")))));Debug.locals.put("row_weight", _row_weight);Debug.locals.put("row_weight", _row_weight);
 BA.debugLineNum = 1541;BA.debugLine="Dim applied_rule_ids As String = colitems.Ge";
Debug.ShouldStop(16);
_applied_rule_ids = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 1542;BA.debugLine="Dim base_amount_refunded As Int = colitems.G";
Debug.ShouldStop(32);
_base_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount_refunded")))));Debug.locals.put("base_amount_refunded", _base_amount_refunded);Debug.locals.put("base_amount_refunded", _base_amount_refunded);
 BA.debugLineNum = 1543;BA.debugLine="Dim base_price_incl_tax As Double = colitems";
Debug.ShouldStop(64);
_base_price_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_price_incl_tax")))));Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);
 BA.debugLineNum = 1544;BA.debugLine="Dim no_discount As Int = colitems.Get(\"no_di";
Debug.ShouldStop(128);
_no_discount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("no_discount")))));Debug.locals.put("no_discount", _no_discount);Debug.locals.put("no_discount", _no_discount);
 BA.debugLineNum = 1545;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
Debug.ShouldStop(256);
_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1546;BA.debugLine="Dim base_discount_invoiced As Int = colitems";
Debug.ShouldStop(512);
_base_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_invoiced")))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 1547;BA.debugLine="Dim discount_percent As Int = colitems.Get(\"";
Debug.ShouldStop(1024);
_discount_percent = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_percent")))));Debug.locals.put("discount_percent", _discount_percent);Debug.locals.put("discount_percent", _discount_percent);
 BA.debugLineNum = 1548;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id";
Debug.ShouldStop(2048);
_order_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_id")))));Debug.locals.put("order_id", _order_id);Debug.locals.put("order_id", _order_id);
 BA.debugLineNum = 1549;BA.debugLine="Dim discount_tax_compensation_invoiced As In";
Debug.ShouldStop(4096);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_tax_compensation_invoiced")))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 1550;BA.debugLine="Dim created_at As String = colitems.Get(\"cre";
Debug.ShouldStop(8192);
_created_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 1551;BA.debugLine="Dim qty_shipped As Int = colitems.Get(\"qty_s";
Debug.ShouldStop(16384);
_qty_shipped = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_shipped")))));Debug.locals.put("qty_shipped", _qty_shipped);Debug.locals.put("qty_shipped", _qty_shipped);
 BA.debugLineNum = 1552;BA.debugLine="Dim qty_ordered As Int = colitems.Get(\"qty_o";
Debug.ShouldStop(32768);
_qty_ordered = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_ordered")))));Debug.locals.put("qty_ordered", _qty_ordered);Debug.locals.put("qty_ordered", _qty_ordered);
 BA.debugLineNum = 1553;BA.debugLine="Dim row_total As Int = colitems.Get(\"row_tot";
Debug.ShouldStop(65536);
_row_total = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total")))));Debug.locals.put("row_total", _row_total);Debug.locals.put("row_total", _row_total);
 BA.debugLineNum = 1554;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_";
Debug.ShouldStop(131072);
_qty_canceled = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_canceled")))));Debug.locals.put("qty_canceled", _qty_canceled);Debug.locals.put("qty_canceled", _qty_canceled);
 BA.debugLineNum = 1555;BA.debugLine="Dim product_option As Map = colitems.Get(\"pr";
Debug.ShouldStop(262144);
_product_option = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_product_option = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_option")))));Debug.locals.put("product_option", _product_option);Debug.locals.put("product_option", _product_option);
 BA.debugLineNum = 1556;BA.debugLine="Dim extension_attributes As Map = product_op";
Debug.ShouldStop(524288);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _product_option.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 1557;BA.debugLine="Dim configurable_item_options As List = exte";
Debug.ShouldStop(1048576);
_configurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("configurable_item_options")))));Debug.locals.put("configurable_item_options", _configurable_item_options);Debug.locals.put("configurable_item_options", _configurable_item_options);
 BA.debugLineNum = 1558;BA.debugLine="For Each colconfigurable_item_options As Map";
Debug.ShouldStop(2097152);
if (true) break;

case 46:
//for
this.state = 49;
_colconfigurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group226 = _configurable_item_options;
index226 = 0;
groupLen226 = group226.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
this.state = 88;
if (true) break;

case 88:
//C
this.state = 49;
if (index226 < groupLen226) {
this.state = 48;
_colconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group226.runMethod(false,"Get",index226));Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);}
if (true) break;

case 89:
//C
this.state = 88;
index226++;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
if (true) break;

case 48:
//C
this.state = 89;
 BA.debugLineNum = 1559;BA.debugLine="Dim option_value As Int = colconfigurable_i";
Debug.ShouldStop(4194304);
_option_value = BA.numberCast(int.class, _colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_value")))));Debug.locals.put("option_value", _option_value);Debug.locals.put("option_value", _option_value);
 BA.debugLineNum = 1560;BA.debugLine="Dim option_id As String = colconfigurable_i";
Debug.ShouldStop(8388608);
_option_id = BA.ObjectToString(_colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_id")))));Debug.locals.put("option_id", _option_id);Debug.locals.put("option_id", _option_id);
 if (true) break;
if (true) break;

case 49:
//C
this.state = 87;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
;
 BA.debugLineNum = 1562;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"a";
Debug.ShouldStop(33554432);
_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount_refunded")))));Debug.locals.put("amount_refunded", _amount_refunded);Debug.locals.put("amount_refunded", _amount_refunded);
 BA.debugLineNum = 1563;BA.debugLine="Dim updated_at As String = colitems.Get(\"upd";
Debug.ShouldStop(67108864);
_updated_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 1564;BA.debugLine="Dim base_price As Int = colitems.Get(\"base_p";
Debug.ShouldStop(134217728);
_base_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_price")))));Debug.locals.put("base_price", _base_price);Debug.locals.put("base_price", _base_price);
 BA.debugLineNum = 1565;BA.debugLine="Dim qty_invoiced As Int = colitems.Get(\"qty_";
Debug.ShouldStop(268435456);
_qty_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_invoiced")))));Debug.locals.put("qty_invoiced", _qty_invoiced);Debug.locals.put("qty_invoiced", _qty_invoiced);
 BA.debugLineNum = 1566;BA.debugLine="Dim row_invoiced As Int = colitems.Get(\"row_";
Debug.ShouldStop(536870912);
_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_invoiced")))));Debug.locals.put("row_invoiced", _row_invoiced);Debug.locals.put("row_invoiced", _row_invoiced);
 BA.debugLineNum = 1567;BA.debugLine="Dim row_total_incl_tax As Double = colitems.";
Debug.ShouldStop(1073741824);
_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total_incl_tax")))));Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);
 BA.debugLineNum = 1568;BA.debugLine="Dim base_tax_amount As Double = colitems.Get";
Debug.ShouldStop(-2147483648);
_base_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_amount")))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 1569;BA.debugLine="Dim store_id As Int = colitems.Get(\"store_id";
Debug.ShouldStop(1);
_store_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_id")))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 1570;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
Debug.ShouldStop(2);
_item_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_id")))));Debug.locals.put("item_id", _item_id);Debug.locals.put("item_id", _item_id);
 BA.debugLineNum = 1571;BA.debugLine="Dim base_discount_amount As Int = colitems.G";
Debug.ShouldStop(4);
_base_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_amount")))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 1572;BA.debugLine="Dim base_row_total_incl_tax As Double = coli";
Debug.ShouldStop(8);
_base_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total_incl_tax")))));Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);
 BA.debugLineNum = 1573;BA.debugLine="Dim base_discount_tax_compensation_amount As";
Debug.ShouldStop(16);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_tax_compensation_amount")))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 1574;BA.debugLine="Dim product_type As String = colitems.Get(\"p";
Debug.ShouldStop(32);
_product_type = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_type")))));Debug.locals.put("product_type", _product_type);Debug.locals.put("product_type", _product_type);
 BA.debugLineNum = 1575;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_";
Debug.ShouldStop(64);
_qty_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_refunded")))));Debug.locals.put("qty_refunded", _qty_refunded);Debug.locals.put("qty_refunded", _qty_refunded);
 BA.debugLineNum = 1576;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(";
Debug.ShouldStop(128);
_base_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_invoiced")))));Debug.locals.put("base_row_invoiced", _base_row_invoiced);Debug.locals.put("base_row_invoiced", _base_row_invoiced);
 BA.debugLineNum = 1577;BA.debugLine="Dim is_qty_decimal As Int = colitems.Get(\"is";
Debug.ShouldStop(256);
_is_qty_decimal = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_qty_decimal")))));Debug.locals.put("is_qty_decimal", _is_qty_decimal);Debug.locals.put("is_qty_decimal", _is_qty_decimal);
 BA.debugLineNum = 1578;BA.debugLine="Dim discount_invoiced As Int = colitems.Get(";
Debug.ShouldStop(512);
_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_invoiced")))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 1579;BA.debugLine="Dim base_tax_invoiced As Double = colitems.G";
Debug.ShouldStop(1024);
_base_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_invoiced")))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 if (true) break;
if (true) break;

case 50:
//C
this.state = 83;
Debug.locals.put("colitems", _colitems);
;
 if (true) break;
if (true) break;

case 51:
//C
this.state = 52;
Debug.locals.put("colshipping_assignments", _colshipping_assignments);
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 BA.debugLineNum = 1585;BA.debugLine="Dim payment_additional_info As List = extension";
Debug.ShouldStop(65536);
_payment_additional_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_payment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment_additional_info")))));Debug.locals.put("payment_additional_info", _payment_additional_info);Debug.locals.put("payment_additional_info", _payment_additional_info);
 BA.debugLineNum = 1586;BA.debugLine="For Each colpayment_additional_info As Map In p";
Debug.ShouldStop(131072);
if (true) break;

case 53:
//for
this.state = 56;
_colpayment_additional_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group252 = _payment_additional_info;
index252 = 0;
groupLen252 = group252.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
this.state = 90;
if (true) break;

case 90:
//C
this.state = 56;
if (index252 < groupLen252) {
this.state = 55;
_colpayment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group252.runMethod(false,"Get",index252));Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);}
if (true) break;

case 91:
//C
this.state = 90;
index252++;
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
if (true) break;

case 55:
//C
this.state = 91;
 BA.debugLineNum = 1587;BA.debugLine="Dim value As String = colpayment_additional_in";
Debug.ShouldStop(262144);
_value = BA.ObjectToString(_colpayment_additional_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 1588;BA.debugLine="Dim key As String = colpayment_additional_info";
Debug.ShouldStop(524288);
_key = BA.ObjectToString(_colpayment_additional_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("key")))));Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 if (true) break;
if (true) break;

case 56:
//C
this.state = 57;
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
;
 BA.debugLineNum = 1590;BA.debugLine="Dim applied_taxes As List = extension_attribute";
Debug.ShouldStop(2097152);
_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_taxes")))));Debug.locals.put("applied_taxes", _applied_taxes);Debug.locals.put("applied_taxes", _applied_taxes);
 BA.debugLineNum = 1591;BA.debugLine="For Each colapplied_taxes As Map In applied_tax";
Debug.ShouldStop(4194304);
if (true) break;

case 57:
//for
this.state = 60;
_colapplied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group257 = _applied_taxes;
index257 = 0;
groupLen257 = group257.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
this.state = 92;
if (true) break;

case 92:
//C
this.state = 60;
if (index257 < groupLen257) {
this.state = 59;
_colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group257.runMethod(false,"Get",index257));Debug.locals.put("colapplied_taxes", _colapplied_taxes);}
if (true) break;

case 93:
//C
this.state = 92;
index257++;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
if (true) break;

case 59:
//C
this.state = 93;
 BA.debugLineNum = 1592;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"a";
Debug.ShouldStop(8388608);
_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount")))));Debug.locals.put("amount", _amount);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 1593;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"cod";
Debug.ShouldStop(16777216);
_code = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 1594;BA.debugLine="Dim base_amount As Double = colapplied_taxes.G";
Debug.ShouldStop(33554432);
_base_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount")))));Debug.locals.put("base_amount", _base_amount);Debug.locals.put("base_amount", _base_amount);
 BA.debugLineNum = 1595;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"ti";
Debug.ShouldStop(67108864);
_title = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 1596;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(\"";
Debug.ShouldStop(134217728);
_percent = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("percent")))));Debug.locals.put("percent", _percent);Debug.locals.put("percent", _percent);
 if (true) break;
if (true) break;

case 60:
//C
this.state = 61;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
;
 BA.debugLineNum = 1598;BA.debugLine="Dim item_applied_taxes As List = extension_attr";
Debug.ShouldStop(536870912);
_item_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_item_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_applied_taxes")))));Debug.locals.put("item_applied_taxes", _item_applied_taxes);Debug.locals.put("item_applied_taxes", _item_applied_taxes);
 BA.debugLineNum = 1599;BA.debugLine="For Each colitem_applied_taxes As Map In item_a";
Debug.ShouldStop(1073741824);
if (true) break;

case 61:
//for
this.state = 68;
_colitem_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group265 = _item_applied_taxes;
index265 = 0;
groupLen265 = group265.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
this.state = 94;
if (true) break;

case 94:
//C
this.state = 68;
if (index265 < groupLen265) {
this.state = 63;
_colitem_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group265.runMethod(false,"Get",index265));Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);}
if (true) break;

case 95:
//C
this.state = 94;
index265++;
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 1600;BA.debugLine="Dim applied_taxes As List = colitem_applied_ta";
Debug.ShouldStop(-2147483648);
_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitem_applied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_taxes")))));Debug.locals.put("applied_taxes", _applied_taxes);Debug.locals.put("applied_taxes", _applied_taxes);
 BA.debugLineNum = 1601;BA.debugLine="For Each colapplied_taxes As Map In applied_ta";
Debug.ShouldStop(1);
if (true) break;

case 64:
//for
this.state = 67;
_colapplied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group267 = _applied_taxes;
index267 = 0;
groupLen267 = group267.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
this.state = 96;
if (true) break;

case 96:
//C
this.state = 67;
if (index267 < groupLen267) {
this.state = 66;
_colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group267.runMethod(false,"Get",index267));Debug.locals.put("colapplied_taxes", _colapplied_taxes);}
if (true) break;

case 97:
//C
this.state = 96;
index267++;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
if (true) break;

case 66:
//C
this.state = 97;
 BA.debugLineNum = 1602;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"";
Debug.ShouldStop(2);
_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount")))));Debug.locals.put("amount", _amount);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 1603;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"co";
Debug.ShouldStop(4);
_code = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 1604;BA.debugLine="Dim base_amount As Double = colapplied_taxes.";
Debug.ShouldStop(8);
_base_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount")))));Debug.locals.put("base_amount", _base_amount);Debug.locals.put("base_amount", _base_amount);
 BA.debugLineNum = 1605;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"t";
Debug.ShouldStop(16);
_title = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 1606;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(";
Debug.ShouldStop(32);
_percent = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("percent")))));Debug.locals.put("percent", _percent);Debug.locals.put("percent", _percent);
 if (true) break;
if (true) break;

case 67:
//C
this.state = 95;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
;
 BA.debugLineNum = 1608;BA.debugLine="Dim Type As String = colitem_applied_taxes.Get";
Debug.ShouldStop(128);
_type = BA.ObjectToString(_colitem_applied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Type", _type);Debug.locals.put("Type", _type);
 if (true) break;
if (true) break;

case 68:
//C
this.state = 69;
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
;
 BA.debugLineNum = 1610;BA.debugLine="Dim converting_from_quote As String = extension";
Debug.ShouldStop(512);
_converting_from_quote = BA.ObjectToString(_extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("converting_from_quote")))));Debug.locals.put("converting_from_quote", _converting_from_quote);Debug.locals.put("converting_from_quote", _converting_from_quote);
 if (true) break;

case 69:
//C
this.state = 73;
;
 BA.debugLineNum = 1613;BA.debugLine="Dim shipping_description As String = colitems.Ge";
Debug.ShouldStop(4096);
_shipping_description = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_description")))));Debug.locals.put("shipping_description", _shipping_description);Debug.locals.put("shipping_description", _shipping_description);
 BA.debugLineNum = 1614;BA.debugLine="Dim store_to_order_rate As Int = colitems.Getdef";
Debug.ShouldStop(8192);
_store_to_order_rate = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_to_order_rate"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("store_to_order_rate", _store_to_order_rate);Debug.locals.put("store_to_order_rate", _store_to_order_rate);
 BA.debugLineNum = 1615;BA.debugLine="Dim shipping_amount As Int = colitems.Getdefault";
Debug.ShouldStop(16384);
_shipping_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 1616;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
Debug.ShouldStop(32768);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 1617;BA.debugLine="Dim subtotal_invoiced As Int = colitems.Getdefau";
Debug.ShouldStop(65536);
_subtotal_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("subtotal_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("subtotal_invoiced", _subtotal_invoiced);Debug.locals.put("subtotal_invoiced", _subtotal_invoiced);
 BA.debugLineNum = 1618;BA.debugLine="Dim base_to_order_rate As Int = colitems.Getdefa";
Debug.ShouldStop(131072);
_base_to_order_rate = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_to_order_rate"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_to_order_rate", _base_to_order_rate);Debug.locals.put("base_to_order_rate", _base_to_order_rate);
 BA.debugLineNum = 1619;BA.debugLine="Dim base_subtotal As Int = colitems.Getdefault(\"";
Debug.ShouldStop(262144);
_base_subtotal = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_subtotal", _base_subtotal);Debug.locals.put("base_subtotal", _base_subtotal);
 BA.debugLineNum = 1620;BA.debugLine="Dim protect_code As String = colitems.Get(\"prote";
Debug.ShouldStop(524288);
_protect_code = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("protect_code")))));Debug.locals.put("protect_code", _protect_code);Debug.locals.put("protect_code", _protect_code);
 BA.debugLineNum = 1621;BA.debugLine="Dim customer_dob As String = colitems.Get(\"custo";
Debug.ShouldStop(1048576);
_customer_dob = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_dob")))));Debug.locals.put("customer_dob", _customer_dob);Debug.locals.put("customer_dob", _customer_dob);
 BA.debugLineNum = 1622;BA.debugLine="Dim base_total_due As Int = colitems.Getdefault(";
Debug.ShouldStop(2097152);
_base_total_due = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_due"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_total_due", _base_total_due);Debug.locals.put("base_total_due", _base_total_due);
 BA.debugLineNum = 1623;BA.debugLine="Dim base_subtotal_incl_tax As Double = colitems.";
Debug.ShouldStop(4194304);
_base_subtotal_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal_incl_tax"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_subtotal_incl_tax", _base_subtotal_incl_tax);Debug.locals.put("base_subtotal_incl_tax", _base_subtotal_incl_tax);
 BA.debugLineNum = 1624;BA.debugLine="Dim customer_id As Int = colitems.Getdefault(\"cu";
Debug.ShouldStop(8388608);
_customer_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_id", _customer_id);Debug.locals.put("customer_id", _customer_id);
 BA.debugLineNum = 1625;BA.debugLine="Dim customer_group_id As Int = colitems.Getdefau";
Debug.ShouldStop(16777216);
_customer_group_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_group_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_group_id", _customer_group_id);Debug.locals.put("customer_group_id", _customer_group_id);
 BA.debugLineNum = 1626;BA.debugLine="Dim discount_invoiced As Int = colitems.Getdefau";
Debug.ShouldStop(33554432);
_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 1627;BA.debugLine="Dim order_currency_code As String = colitems.Get";
Debug.ShouldStop(67108864);
_order_currency_code = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_currency_code")))));Debug.locals.put("order_currency_code", _order_currency_code);Debug.locals.put("order_currency_code", _order_currency_code);
 BA.debugLineNum = 1628;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Get(\"";
Debug.ShouldStop(134217728);
_base_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_invoiced")))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 BA.debugLineNum = 1629;BA.debugLine="Dim customer_gender As Int = colitems.Getdefault";
Debug.ShouldStop(268435456);
_customer_gender = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_gender"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_gender", _customer_gender);Debug.locals.put("customer_gender", _customer_gender);
 BA.debugLineNum = 1630;BA.debugLine="Dim shipping_incl_tax As Int = colitems.Getdefau";
Debug.ShouldStop(536870912);
_shipping_incl_tax = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);
 BA.debugLineNum = 1631;BA.debugLine="Dim base_shipping_invoiced As Int = colitems.Get";
Debug.ShouldStop(1073741824);
_base_shipping_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);
 if (true) break;
if (true) break;

case 70:
//C
this.state = -1;
Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 1633;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
Debug.ShouldStop(1);
_search_criteria = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("search_criteria")))));Debug.locals.put("search_criteria", _search_criteria);Debug.locals.put("search_criteria", _search_criteria);
 BA.debugLineNum = 1634;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
Debug.ShouldStop(2);
_filter_groups = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _search_criteria.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filter_groups")))));Debug.locals.put("filter_groups", _filter_groups);Debug.locals.put("filter_groups", _filter_groups);
 BA.debugLineNum = 1635;BA.debugLine="Dim page_size As Int = search_criteria.Get(\"page_";
Debug.ShouldStop(4);
_page_size = BA.numberCast(int.class, _search_criteria.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("page_size")))));Debug.locals.put("page_size", _page_size);Debug.locals.put("page_size", _page_size);
 BA.debugLineNum = 1638;BA.debugLine="End Sub";
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
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "ctestsinfomagento","btnsalir_click", __ref);}
 BA.debugLineNum = 183;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="SalirModulo";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargadatoscredenciales(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosCredenciales (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,448);
if (RapidSub.canDelegate("cargadatoscredenciales")) { return __ref.runUserSub(false, "ctestsinfomagento","cargadatoscredenciales", __ref);}
ResumableSub_CargaDatosCredenciales rsub = new ResumableSub_CargaDatosCredenciales(null,__ref);
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
public static class ResumableSub_CargaDatosCredenciales extends BA.ResumableSub {
public ResumableSub_CargaDatosCredenciales(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comandojrdc = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosCredenciales (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,448);
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
 BA.debugLineNum = 450;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 451;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 452;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 453;BA.debugLine="Dim ComandoJRDC As String";
Debug.ShouldStop(16);
_comandojrdc = RemoteObject.createImmutable("");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 454;BA.debugLine="ComandoJRDC=\"TokenB2BPruebas\"";
Debug.ShouldStop(32);
_comandojrdc = BA.ObjectToString("TokenB2BPruebas");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 455;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(64);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comandojrdc),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 456;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargadatoscredenciales"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 457;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 458;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 460;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 461;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 463;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
Debug.ShouldStop(16384);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 464;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 465;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 468;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 469;BA.debugLine="Return mRes";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 470;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadirecciondefectoenviocliente(RemoteObject __ref,RemoteObject _idclientesel) throws Exception{
try {
		Debug.PushSubsStack("CargaDireccionDefectoEnvioCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2245);
if (RapidSub.canDelegate("cargadirecciondefectoenviocliente")) { return __ref.runUserSub(false, "ctestsinfomagento","cargadirecciondefectoenviocliente", __ref, _idclientesel);}
ResumableSub_CargaDireccionDefectoEnvioCliente rsub = new ResumableSub_CargaDireccionDefectoEnvioCliente(null,__ref,_idclientesel);
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
public static class ResumableSub_CargaDireccionDefectoEnvioCliente extends BA.ResumableSub {
public ResumableSub_CargaDireccionDefectoEnvioCliente(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _idclientesel;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _region_id = RemoteObject.createImmutable(0);
RemoteObject _postcode = RemoteObject.createImmutable("");
RemoteObject _telephone = RemoteObject.createImmutable("");
RemoteObject _default_shipping = RemoteObject.createImmutable("");
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _customer_code = RemoteObject.createImmutable("");
RemoteObject _custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _attribute_code = RemoteObject.createImmutable("");
RemoteObject _street = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colstreet = RemoteObject.createImmutable("");
RemoteObject _street1 = RemoteObject.createImmutable("");
RemoteObject _street2 = RemoteObject.createImmutable("");
RemoteObject _street3 = RemoteObject.createImmutable("");
RemoteObject _company = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _customer_id = RemoteObject.createImmutable(0);
RemoteObject _mregion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _region = RemoteObject.createImmutable("");
RemoteObject _region_code = RemoteObject.createImmutable("");
RemoteObject _country_id = RemoteObject.createImmutable("");
RemoteObject group21;
int index21;
int groupLen21;
RemoteObject group28;
int index28;
int groupLen28;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDireccionDefectoEnvioCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2245);
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
Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 2246;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BDireccionesC";
Debug.ShouldStop(32);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BDireccionesCliente")));
 BA.debugLineNum = 2247;BA.debugLine="wait for(EnvioDatosAPIMagentoBusquedaDireccionDef";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargadirecciondefectoenviocliente"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentobusquedadirecciondefectoenviocliente" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ )),(Object)(_idclientesel)));
this.state = 37;
return;
case 37:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 2248;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2249;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2250;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargadirecciondefectoenviocliente"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Direccion Defecto Envio Cliente B2B"))));
this.state = 38;
return;
case 38:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 2251;BA.debugLine="Return False";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2254;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8192);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 2255;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(16384);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 2256;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(32768);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 2257;BA.debugLine="Dim firstname As String = root.Get(\"firstname\")";
Debug.ShouldStop(65536);
_firstname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 2258;BA.debugLine="Dim city As String = root.Get(\"city\")";
Debug.ShouldStop(131072);
_city = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 2259;BA.debugLine="Dim region_id As Int = root.Get(\"region_id\")";
Debug.ShouldStop(262144);
_region_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_id")))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 2260;BA.debugLine="Dim postcode As String = root.Get(\"postcode\")";
Debug.ShouldStop(524288);
_postcode = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 2261;BA.debugLine="Dim telephone As String = root.Get(\"telephone\")";
Debug.ShouldStop(1048576);
_telephone = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 2262;BA.debugLine="Dim default_shipping As String = root.Get(\"defaul";
Debug.ShouldStop(2097152);
_default_shipping = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("default_shipping")))));Debug.locals.put("default_shipping", _default_shipping);Debug.locals.put("default_shipping", _default_shipping);
 BA.debugLineNum = 2263;BA.debugLine="Dim lastname As String = root.Get(\"lastname\")";
Debug.ShouldStop(4194304);
_lastname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 2264;BA.debugLine="Dim code As String";
Debug.ShouldStop(8388608);
_code = RemoteObject.createImmutable("");Debug.locals.put("code", _code);
 BA.debugLineNum = 2265;BA.debugLine="Dim customer_code As String";
Debug.ShouldStop(16777216);
_customer_code = RemoteObject.createImmutable("");Debug.locals.put("customer_code", _customer_code);
 BA.debugLineNum = 2266;BA.debugLine="Dim custom_attributes As List = root.Get(\"custom_";
Debug.ShouldStop(33554432);
_custom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("custom_attributes")))));Debug.locals.put("custom_attributes", _custom_attributes);Debug.locals.put("custom_attributes", _custom_attributes);
 BA.debugLineNum = 2267;BA.debugLine="For Each colcustom_attributes As Map In custom_at";
Debug.ShouldStop(67108864);
if (true) break;

case 5:
//for
this.state = 20;
_colcustom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = _custom_attributes;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 20;
if (index21 < groupLen21) {
this.state = 7;
_colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group21.runMethod(false,"Get",index21));Debug.locals.put("colcustom_attributes", _colcustom_attributes);}
if (true) break;

case 40:
//C
this.state = 39;
index21++;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2268;BA.debugLine="Dim value As String = colcustom_attributes.Get(\"";
Debug.ShouldStop(134217728);
_value = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 2269;BA.debugLine="Dim attribute_code As String = colcustom_attribu";
Debug.ShouldStop(268435456);
_attribute_code = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))));Debug.locals.put("attribute_code", _attribute_code);Debug.locals.put("attribute_code", _attribute_code);
 BA.debugLineNum = 2270;BA.debugLine="If attribute_code=\"code\" Then code=value";
Debug.ShouldStop(536870912);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_attribute_code,BA.ObjectToString("code"))) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_code = _value;Debug.locals.put("code", _code);
if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 2271;BA.debugLine="If attribute_code=\"customer_code\" Then customer_";
Debug.ShouldStop(1073741824);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_attribute_code,BA.ObjectToString("customer_code"))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
_customer_code = _value;Debug.locals.put("customer_code", _customer_code);
if (true) break;

case 19:
//C
this.state = 40;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
;
 BA.debugLineNum = 2273;BA.debugLine="Dim street As List = root.Get(\"street\")";
Debug.ShouldStop(1);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 2274;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(2);
if (true) break;

case 21:
//for
this.state = 24;
group28 = _street;
index28 = 0;
groupLen28 = group28.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 41;
if (true) break;

case 41:
//C
this.state = 24;
if (index28 < groupLen28) {
this.state = 23;
_colstreet = BA.ObjectToString(group28.runMethod(false,"Get",index28));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 42:
//C
this.state = 41;
index28++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 23:
//C
this.state = 42;
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 2277;BA.debugLine="Dim Street1 As String=street.Get(0)";
Debug.ShouldStop(16);
_street1 = BA.ObjectToString(_street.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Street1", _street1);Debug.locals.put("Street1", _street1);
 BA.debugLineNum = 2278;BA.debugLine="Dim street2 As String";
Debug.ShouldStop(32);
_street2 = RemoteObject.createImmutable("");Debug.locals.put("street2", _street2);
 BA.debugLineNum = 2279;BA.debugLine="Dim street3 As String";
Debug.ShouldStop(64);
_street3 = RemoteObject.createImmutable("");Debug.locals.put("street3", _street3);
 BA.debugLineNum = 2280;BA.debugLine="If street.Size>1 Then street2=street.Get(1)";
Debug.ShouldStop(128);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean(">",_street.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
_street2 = BA.ObjectToString(_street.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("street2", _street2);
if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 2281;BA.debugLine="If street.Size>2 Then street3=street.Get(2)";
Debug.ShouldStop(256);
if (true) break;

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean(">",_street.runMethod(true,"getSize"),BA.numberCast(double.class, 2))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_street3 = BA.ObjectToString(_street.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("street3", _street3);
if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 2282;BA.debugLine="root.Put(\"Street1\",Street1)";
Debug.ShouldStop(512);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Street1"))),(Object)((_street1)));
 BA.debugLineNum = 2283;BA.debugLine="root.Put(\"Street2\",street2)";
Debug.ShouldStop(1024);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Street2"))),(Object)((_street2)));
 BA.debugLineNum = 2284;BA.debugLine="root.Put(\"Street3\",street3)";
Debug.ShouldStop(2048);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Street3"))),(Object)((_street3)));
 BA.debugLineNum = 2285;BA.debugLine="Dim company As String = root.Get(\"company\")";
Debug.ShouldStop(4096);
_company = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("company")))));Debug.locals.put("company", _company);Debug.locals.put("company", _company);
 BA.debugLineNum = 2286;BA.debugLine="Dim id As Int = root.Get(\"id\")";
Debug.ShouldStop(8192);
_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 2287;BA.debugLine="Dim customer_id As Int = root.Get(\"customer_id\")";
Debug.ShouldStop(16384);
_customer_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_id")))));Debug.locals.put("customer_id", _customer_id);Debug.locals.put("customer_id", _customer_id);
 BA.debugLineNum = 2288;BA.debugLine="Dim mregion As Map = root.Get(\"region\")";
Debug.ShouldStop(32768);
_mregion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mregion = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("mregion", _mregion);Debug.locals.put("mregion", _mregion);
 BA.debugLineNum = 2289;BA.debugLine="Dim region_id As Int = mregion.Get(\"region_id\")";
Debug.ShouldStop(65536);
_region_id = BA.numberCast(int.class, _mregion.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_id")))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 2290;BA.debugLine="Dim region As String = mregion.Get(\"region\")";
Debug.ShouldStop(131072);
_region = BA.ObjectToString(_mregion.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 2291;BA.debugLine="root.Put(\"region\",region)";
Debug.ShouldStop(262144);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("region"))),(Object)((_region)));
 BA.debugLineNum = 2292;BA.debugLine="Dim region_code As String = mregion.Get(\"region_c";
Debug.ShouldStop(524288);
_region_code = BA.ObjectToString(_mregion.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 2293;BA.debugLine="Dim country_id As String = root.Get(\"country_id\")";
Debug.ShouldStop(1048576);
_country_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 2295;BA.debugLine="root.Put(\"default_billing\",\"\")";
Debug.ShouldStop(4194304);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("default_billing"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2296;BA.debugLine="root.Put(\"code\",code)";
Debug.ShouldStop(8388608);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("code"))),(Object)((_code)));
 BA.debugLineNum = 2297;BA.debugLine="root.Put(\"customer_code\",customer_code)";
Debug.ShouldStop(16777216);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("customer_code"))),(Object)((_customer_code)));
 BA.debugLineNum = 2301;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
Debug.ShouldStop(268435456);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblB2BDireccionesCliente")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_root.getObject())})))));
 BA.debugLineNum = 2302;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2303;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadirecciondefectofacturacioncliente(RemoteObject __ref,RemoteObject _idclientesel) throws Exception{
try {
		Debug.PushSubsStack("CargaDireccionDefectoFacturacionCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2388);
if (RapidSub.canDelegate("cargadirecciondefectofacturacioncliente")) { return __ref.runUserSub(false, "ctestsinfomagento","cargadirecciondefectofacturacioncliente", __ref, _idclientesel);}
ResumableSub_CargaDireccionDefectoFacturacionCliente rsub = new ResumableSub_CargaDireccionDefectoFacturacionCliente(null,__ref,_idclientesel);
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
public static class ResumableSub_CargaDireccionDefectoFacturacionCliente extends BA.ResumableSub {
public ResumableSub_CargaDireccionDefectoFacturacionCliente(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _idclientesel;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _region_id = RemoteObject.createImmutable(0);
RemoteObject _postcode = RemoteObject.createImmutable("");
RemoteObject _telephone = RemoteObject.createImmutable("");
RemoteObject _default_shipping = RemoteObject.createImmutable("");
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _customer_code = RemoteObject.createImmutable("");
RemoteObject _custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _attribute_code = RemoteObject.createImmutable("");
RemoteObject _street = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colstreet = RemoteObject.createImmutable("");
RemoteObject _street1 = RemoteObject.createImmutable("");
RemoteObject _street2 = RemoteObject.createImmutable("");
RemoteObject _street3 = RemoteObject.createImmutable("");
RemoteObject _company = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _customer_id = RemoteObject.createImmutable(0);
RemoteObject _mregion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _region = RemoteObject.createImmutable("");
RemoteObject _region_code = RemoteObject.createImmutable("");
RemoteObject _country_id = RemoteObject.createImmutable("");
RemoteObject group21;
int index21;
int groupLen21;
RemoteObject group28;
int index28;
int groupLen28;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDireccionDefectoFacturacionCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2388);
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
Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 2389;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BDireccionesC";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BDireccionesCliente")));
 BA.debugLineNum = 2390;BA.debugLine="wait for(EnvioDatosAPIMagentoBusquedaDireccionDef";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargadirecciondefectofacturacioncliente"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentobusquedadirecciondefectofacturacioncliente" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ )),(Object)(_idclientesel)));
this.state = 37;
return;
case 37:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 2391;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2392;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2393;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargadirecciondefectofacturacioncliente"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Direccion Defecto Facturacion Cliente B2B"))));
this.state = 38;
return;
case 38:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 2394;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2397;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(268435456);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 2398;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(536870912);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 2399;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1073741824);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 2400;BA.debugLine="Dim firstname As String = root.Get(\"firstname\")";
Debug.ShouldStop(-2147483648);
_firstname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 2401;BA.debugLine="Dim city As String = root.Get(\"city\")";
Debug.ShouldStop(1);
_city = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 2402;BA.debugLine="Dim region_id As Int = root.Get(\"region_id\")";
Debug.ShouldStop(2);
_region_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_id")))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 2403;BA.debugLine="Dim postcode As String = root.Get(\"postcode\")";
Debug.ShouldStop(4);
_postcode = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 2404;BA.debugLine="Dim telephone As String = root.Get(\"telephone\")";
Debug.ShouldStop(8);
_telephone = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 2405;BA.debugLine="Dim default_shipping As String = root.Get(\"defaul";
Debug.ShouldStop(16);
_default_shipping = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("default_shipping")))));Debug.locals.put("default_shipping", _default_shipping);Debug.locals.put("default_shipping", _default_shipping);
 BA.debugLineNum = 2406;BA.debugLine="Dim lastname As String = root.Get(\"lastname\")";
Debug.ShouldStop(32);
_lastname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 2407;BA.debugLine="Dim code As String";
Debug.ShouldStop(64);
_code = RemoteObject.createImmutable("");Debug.locals.put("code", _code);
 BA.debugLineNum = 2408;BA.debugLine="Dim customer_code As String";
Debug.ShouldStop(128);
_customer_code = RemoteObject.createImmutable("");Debug.locals.put("customer_code", _customer_code);
 BA.debugLineNum = 2409;BA.debugLine="Dim custom_attributes As List = root.Get(\"custom_";
Debug.ShouldStop(256);
_custom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("custom_attributes")))));Debug.locals.put("custom_attributes", _custom_attributes);Debug.locals.put("custom_attributes", _custom_attributes);
 BA.debugLineNum = 2410;BA.debugLine="For Each colcustom_attributes As Map In custom_at";
Debug.ShouldStop(512);
if (true) break;

case 5:
//for
this.state = 20;
_colcustom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = _custom_attributes;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 20;
if (index21 < groupLen21) {
this.state = 7;
_colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group21.runMethod(false,"Get",index21));Debug.locals.put("colcustom_attributes", _colcustom_attributes);}
if (true) break;

case 40:
//C
this.state = 39;
index21++;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2411;BA.debugLine="Dim value As String = colcustom_attributes.Get(\"";
Debug.ShouldStop(1024);
_value = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 2412;BA.debugLine="Dim attribute_code As String = colcustom_attribu";
Debug.ShouldStop(2048);
_attribute_code = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))));Debug.locals.put("attribute_code", _attribute_code);Debug.locals.put("attribute_code", _attribute_code);
 BA.debugLineNum = 2413;BA.debugLine="If attribute_code=\"code\" Then code=value";
Debug.ShouldStop(4096);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_attribute_code,BA.ObjectToString("code"))) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_code = _value;Debug.locals.put("code", _code);
if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 2414;BA.debugLine="If attribute_code=\"customer_code\" Then customer_";
Debug.ShouldStop(8192);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_attribute_code,BA.ObjectToString("customer_code"))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
_customer_code = _value;Debug.locals.put("customer_code", _customer_code);
if (true) break;

case 19:
//C
this.state = 40;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
;
 BA.debugLineNum = 2416;BA.debugLine="Dim street As List = root.Get(\"street\")";
Debug.ShouldStop(32768);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 2417;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(65536);
if (true) break;

case 21:
//for
this.state = 24;
group28 = _street;
index28 = 0;
groupLen28 = group28.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 41;
if (true) break;

case 41:
//C
this.state = 24;
if (index28 < groupLen28) {
this.state = 23;
_colstreet = BA.ObjectToString(group28.runMethod(false,"Get",index28));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 42:
//C
this.state = 41;
index28++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 23:
//C
this.state = 42;
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 2420;BA.debugLine="Dim Street1 As String=street.Get(0)";
Debug.ShouldStop(524288);
_street1 = BA.ObjectToString(_street.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Street1", _street1);Debug.locals.put("Street1", _street1);
 BA.debugLineNum = 2421;BA.debugLine="Dim street2 As String";
Debug.ShouldStop(1048576);
_street2 = RemoteObject.createImmutable("");Debug.locals.put("street2", _street2);
 BA.debugLineNum = 2422;BA.debugLine="Dim street3 As String";
Debug.ShouldStop(2097152);
_street3 = RemoteObject.createImmutable("");Debug.locals.put("street3", _street3);
 BA.debugLineNum = 2423;BA.debugLine="If street.Size>1 Then street2=street.Get(1)";
Debug.ShouldStop(4194304);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean(">",_street.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
_street2 = BA.ObjectToString(_street.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("street2", _street2);
if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 2424;BA.debugLine="If street.Size>2 Then street3=street.Get(2)";
Debug.ShouldStop(8388608);
if (true) break;

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean(">",_street.runMethod(true,"getSize"),BA.numberCast(double.class, 2))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_street3 = BA.ObjectToString(_street.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("street3", _street3);
if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 2425;BA.debugLine="root.Put(\"Street1\",Street1)";
Debug.ShouldStop(16777216);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Street1"))),(Object)((_street1)));
 BA.debugLineNum = 2426;BA.debugLine="root.Put(\"Street2\",street2)";
Debug.ShouldStop(33554432);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Street2"))),(Object)((_street2)));
 BA.debugLineNum = 2427;BA.debugLine="root.Put(\"Street3\",street3)";
Debug.ShouldStop(67108864);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Street3"))),(Object)((_street3)));
 BA.debugLineNum = 2428;BA.debugLine="Dim company As String = root.Get(\"company\")";
Debug.ShouldStop(134217728);
_company = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("company")))));Debug.locals.put("company", _company);Debug.locals.put("company", _company);
 BA.debugLineNum = 2429;BA.debugLine="Dim id As Int = root.Get(\"id\")";
Debug.ShouldStop(268435456);
_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 2430;BA.debugLine="Dim customer_id As Int = root.Get(\"customer_id\")";
Debug.ShouldStop(536870912);
_customer_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_id")))));Debug.locals.put("customer_id", _customer_id);Debug.locals.put("customer_id", _customer_id);
 BA.debugLineNum = 2431;BA.debugLine="Dim mregion As Map = root.Get(\"region\")";
Debug.ShouldStop(1073741824);
_mregion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mregion = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("mregion", _mregion);Debug.locals.put("mregion", _mregion);
 BA.debugLineNum = 2432;BA.debugLine="Dim region_id As Int = mregion.Get(\"region_id\")";
Debug.ShouldStop(-2147483648);
_region_id = BA.numberCast(int.class, _mregion.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_id")))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 2433;BA.debugLine="Dim region As String = mregion.Get(\"region\")";
Debug.ShouldStop(1);
_region = BA.ObjectToString(_mregion.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 2434;BA.debugLine="root.Put(\"region\",region)";
Debug.ShouldStop(2);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("region"))),(Object)((_region)));
 BA.debugLineNum = 2435;BA.debugLine="Dim region_code As String = mregion.Get(\"region_c";
Debug.ShouldStop(4);
_region_code = BA.ObjectToString(_mregion.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 2436;BA.debugLine="Dim country_id As String = root.Get(\"country_id\")";
Debug.ShouldStop(8);
_country_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 2438;BA.debugLine="root.Put(\"default_shipping\",\"\")";
Debug.ShouldStop(32);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("default_shipping"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2439;BA.debugLine="root.Put(\"code\",code)";
Debug.ShouldStop(64);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("code"))),(Object)((_code)));
 BA.debugLineNum = 2440;BA.debugLine="root.Put(\"customer_code\",customer_code)";
Debug.ShouldStop(128);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("customer_code"))),(Object)((_customer_code)));
 BA.debugLineNum = 2443;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
Debug.ShouldStop(1024);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblB2BDireccionesCliente")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_root.getObject())})))));
 BA.debugLineNum = 2444;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2445;BA.debugLine="End Sub";
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
public static RemoteObject  _cargainfoclientemagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaInfoClienteMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,976);
if (RapidSub.canDelegate("cargainfoclientemagento")) { return __ref.runUserSub(false, "ctestsinfomagento","cargainfoclientemagento", __ref);}
ResumableSub_CargaInfoClienteMagento rsub = new ResumableSub_CargaInfoClienteMagento(null,__ref);
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
public static class ResumableSub_CargaInfoClienteMagento extends BA.ResumableSub {
public ResumableSub_CargaInfoClienteMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _idclientesel = RemoteObject.createImmutable(0);
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sk = RemoteObject.createImmutable("");
RemoteObject _store_id = RemoteObject.createImmutable(0);
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _addresses = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _is_subscribed = RemoteObject.createImmutable("");
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _attribute_code = RemoteObject.createImmutable("");
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _disable_auto_group_change = RemoteObject.createImmutable(0);
RemoteObject _group_id = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _website_id = RemoteObject.createImmutable(0);
RemoteObject _email = RemoteObject.createImmutable("");
RemoteObject _created_in = RemoteObject.createImmutable("");
RemoteObject _maddress = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group8;
int index8;
int groupLen8;
RemoteObject group20;
int index20;
int groupLen20;
RemoteObject group32;
int index32;
int groupLen32;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaInfoClienteMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,976);
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
 BA.debugLineNum = 978;BA.debugLine="Wait For(SeleccionarCliente) complete (IDClienteS";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargainfoclientemagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_seleccionarcliente" /*RemoteObject*/ ));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_idclientesel = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("IDClienteSel", _idclientesel);
;
 BA.debugLineNum = 979;BA.debugLine="If IDClienteSel=-1 Then Return";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_idclientesel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 981;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionCliente(t";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargainfoclientemagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentoinformacioncliente" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ )),(Object)(_idclientesel)));
this.state = 30;
return;
case 30:
//C
this.state = 7;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 982;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
Debug.ShouldStop(2097152);
if (true) break;

case 7:
//if
this.state = 12;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 984;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 985;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 986;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(33554432);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 987;BA.debugLine="For Each sK As String In root.Keys";
Debug.ShouldStop(67108864);
if (true) break;

case 13:
//for
this.state = 16;
group8 = _root.runMethod(false,"Keys");
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("sK", _sk);
this.state = 31;
if (true) break;

case 31:
//C
this.state = 16;
if (index8 < groupLen8) {
this.state = 15;
_sk = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("sK", _sk);}
if (true) break;

case 32:
//C
this.state = 31;
index8++;
Debug.locals.put("sK", _sk);
if (true) break;

case 15:
//C
this.state = 32;
 BA.debugLineNum = 988;BA.debugLine="Log(sK & \": \" & root.Get(sK))";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","8103940108",RemoteObject.concat(_sk,RemoteObject.createImmutable(": "),_root.runMethod(false,"Get",(Object)((_sk)))),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
Debug.locals.put("sK", _sk);
;
 BA.debugLineNum = 990;BA.debugLine="Dim store_id As Int = root.Get(\"store_id\")";
Debug.ShouldStop(536870912);
_store_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_id")))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 991;BA.debugLine="Dim firstname As String = root.Get(\"firstname\")";
Debug.ShouldStop(1073741824);
_firstname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 992;BA.debugLine="Dim addresses As List = root.Get(\"addresses\")";
Debug.ShouldStop(-2147483648);
_addresses = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_addresses = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("addresses")))));Debug.locals.put("addresses", _addresses);Debug.locals.put("addresses", _addresses);
 BA.debugLineNum = 993;BA.debugLine="Dim created_at As String = root.Get(\"created_at\")";
Debug.ShouldStop(1);
_created_at = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 994;BA.debugLine="Dim extension_attributes As Map = root.Get(\"exten";
Debug.ShouldStop(2);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 995;BA.debugLine="Dim is_subscribed As String = extension_attribute";
Debug.ShouldStop(4);
_is_subscribed = BA.ObjectToString(_extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_subscribed")))));Debug.locals.put("is_subscribed", _is_subscribed);Debug.locals.put("is_subscribed", _is_subscribed);
 BA.debugLineNum = 996;BA.debugLine="Dim lastname As String = root.Get(\"lastname\")";
Debug.ShouldStop(8);
_lastname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 997;BA.debugLine="Dim custom_attributes As List = root.Get(\"custom_";
Debug.ShouldStop(16);
_custom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("custom_attributes")))));Debug.locals.put("custom_attributes", _custom_attributes);Debug.locals.put("custom_attributes", _custom_attributes);
 BA.debugLineNum = 998;BA.debugLine="If custom_attributes.IsInitialized Then";
Debug.ShouldStop(32);
if (true) break;

case 17:
//if
this.state = 24;
if (_custom_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 999;BA.debugLine="For Each colcustom_attributes As Map In custom_a";
Debug.ShouldStop(64);
if (true) break;

case 20:
//for
this.state = 23;
_colcustom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group20 = _custom_attributes;
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 23;
if (index20 < groupLen20) {
this.state = 22;
_colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group20.runMethod(false,"Get",index20));Debug.locals.put("colcustom_attributes", _colcustom_attributes);}
if (true) break;

case 34:
//C
this.state = 33;
index20++;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
if (true) break;

case 22:
//C
this.state = 34;
 BA.debugLineNum = 1000;BA.debugLine="Dim value As String = colcustom_attributes.Get(";
Debug.ShouldStop(128);
_value = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 1001;BA.debugLine="Dim attribute_code As String = colcustom_attrib";
Debug.ShouldStop(256);
_attribute_code = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))));Debug.locals.put("attribute_code", _attribute_code);Debug.locals.put("attribute_code", _attribute_code);
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 1004;BA.debugLine="Dim updated_at As String = root.Get(\"updated_at\")";
Debug.ShouldStop(2048);
_updated_at = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 1005;BA.debugLine="Dim disable_auto_group_change As Int = root.Get(\"";
Debug.ShouldStop(4096);
_disable_auto_group_change = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("disable_auto_group_change")))));Debug.locals.put("disable_auto_group_change", _disable_auto_group_change);Debug.locals.put("disable_auto_group_change", _disable_auto_group_change);
 BA.debugLineNum = 1006;BA.debugLine="Dim group_id As Int = root.Get(\"group_id\")";
Debug.ShouldStop(8192);
_group_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("group_id")))));Debug.locals.put("group_id", _group_id);Debug.locals.put("group_id", _group_id);
 BA.debugLineNum = 1007;BA.debugLine="Dim id As Int = root.Get(\"id\")";
Debug.ShouldStop(16384);
_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1008;BA.debugLine="Dim website_id As Int = root.Get(\"website_id\")";
Debug.ShouldStop(32768);
_website_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("website_id")))));Debug.locals.put("website_id", _website_id);Debug.locals.put("website_id", _website_id);
 BA.debugLineNum = 1009;BA.debugLine="Dim email As String = root.Get(\"email\")";
Debug.ShouldStop(65536);
_email = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 1010;BA.debugLine="Dim created_in As String = root.Get(\"created_in\")";
Debug.ShouldStop(131072);
_created_in = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_in")))));Debug.locals.put("created_in", _created_in);Debug.locals.put("created_in", _created_in);
 BA.debugLineNum = 1011;BA.debugLine="For Each mAddress As Map In addresses";
Debug.ShouldStop(262144);
if (true) break;

case 25:
//for
this.state = 28;
_maddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group32 = _addresses;
index32 = 0;
groupLen32 = group32.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mAddress", _maddress);
this.state = 35;
if (true) break;

case 35:
//C
this.state = 28;
if (index32 < groupLen32) {
this.state = 27;
_maddress = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group32.runMethod(false,"Get",index32));Debug.locals.put("mAddress", _maddress);}
if (true) break;

case 36:
//C
this.state = 35;
index32++;
Debug.locals.put("mAddress", _maddress);
if (true) break;

case 27:
//C
this.state = 36;
 BA.debugLineNum = 1012;BA.debugLine="Log(\"Address: \" & mAddress)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","8103940132",RemoteObject.concat(RemoteObject.createImmutable("Address: "),_maddress),0);
 if (true) break;
if (true) break;

case 28:
//C
this.state = -1;
Debug.locals.put("mAddress", _maddress);
;
 BA.debugLineNum = 1014;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1015;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _cargainfodireccionesclientemagento(RemoteObject __ref,RemoteObject _idclientesel) throws Exception{
try {
		Debug.PushSubsStack("CargaInfoDireccionesClienteMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1017);
if (RapidSub.canDelegate("cargainfodireccionesclientemagento")) { return __ref.runUserSub(false, "ctestsinfomagento","cargainfodireccionesclientemagento", __ref, _idclientesel);}
ResumableSub_CargaInfoDireccionesClienteMagento rsub = new ResumableSub_CargaInfoDireccionesClienteMagento(null,__ref,_idclientesel);
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
public static class ResumableSub_CargaInfoDireccionesClienteMagento extends BA.ResumableSub {
public ResumableSub_CargaInfoDireccionesClienteMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _idclientesel;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _store_id = RemoteObject.createImmutable(0);
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _addresses = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _is_subscribed = RemoteObject.createImmutable("");
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _customer_code = RemoteObject.createImmutable("");
RemoteObject _colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _attribute_code = RemoteObject.createImmutable("");
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _disable_auto_group_change = RemoteObject.createImmutable(0);
RemoteObject _group_id = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _website_id = RemoteObject.createImmutable(0);
RemoteObject _email = RemoteObject.createImmutable("");
RemoteObject _created_in = RemoteObject.createImmutable("");
RemoteObject _maddress = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _street = RemoteObject.createImmutable("");
RemoteObject group18;
int index18;
int groupLen18;
RemoteObject group32;
int index32;
int groupLen32;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaInfoDireccionesClienteMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1017);
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
Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 1025;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BDireccionesC";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BDireccionesCliente")));
 BA.debugLineNum = 1027;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionCliente(t";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargainfodireccionesclientemagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentoinformacioncliente" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ )),(Object)(_idclientesel)));
this.state = 31;
return;
case 31:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1028;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 1030;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1031;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(64);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 1032;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(128);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1036;BA.debugLine="Dim store_id As Int = root.Get(\"store_id\")";
Debug.ShouldStop(2048);
_store_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_id")))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 1037;BA.debugLine="Dim firstname As String = root.Get(\"firstname\")";
Debug.ShouldStop(4096);
_firstname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 1038;BA.debugLine="Dim addresses As List = root.Get(\"addresses\")";
Debug.ShouldStop(8192);
_addresses = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_addresses = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("addresses")))));Debug.locals.put("addresses", _addresses);Debug.locals.put("addresses", _addresses);
 BA.debugLineNum = 1039;BA.debugLine="Dim created_at As String = root.Get(\"created_at\")";
Debug.ShouldStop(16384);
_created_at = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 1040;BA.debugLine="Dim extension_attributes As Map = root.Get(\"exten";
Debug.ShouldStop(32768);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 1041;BA.debugLine="Dim is_subscribed As String = extension_attribute";
Debug.ShouldStop(65536);
_is_subscribed = BA.ObjectToString(_extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_subscribed")))));Debug.locals.put("is_subscribed", _is_subscribed);Debug.locals.put("is_subscribed", _is_subscribed);
 BA.debugLineNum = 1042;BA.debugLine="Dim lastname As String = root.Get(\"lastname\")";
Debug.ShouldStop(131072);
_lastname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 1043;BA.debugLine="Dim custom_attributes As List = root.Get(\"custom_";
Debug.ShouldStop(262144);
_custom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("custom_attributes")))));Debug.locals.put("custom_attributes", _custom_attributes);Debug.locals.put("custom_attributes", _custom_attributes);
 BA.debugLineNum = 1044;BA.debugLine="Dim code As String";
Debug.ShouldStop(524288);
_code = RemoteObject.createImmutable("");Debug.locals.put("code", _code);
 BA.debugLineNum = 1045;BA.debugLine="Dim customer_code As String";
Debug.ShouldStop(1048576);
_customer_code = RemoteObject.createImmutable("");Debug.locals.put("customer_code", _customer_code);
 BA.debugLineNum = 1046;BA.debugLine="If custom_attributes.IsInitialized Then";
Debug.ShouldStop(2097152);
if (true) break;

case 7:
//if
this.state = 26;
if (_custom_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1047;BA.debugLine="For Each colcustom_attributes As Map In custom_a";
Debug.ShouldStop(4194304);
if (true) break;

case 10:
//for
this.state = 25;
_colcustom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group18 = _custom_attributes;
index18 = 0;
groupLen18 = group18.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
this.state = 32;
if (true) break;

case 32:
//C
this.state = 25;
if (index18 < groupLen18) {
this.state = 12;
_colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group18.runMethod(false,"Get",index18));Debug.locals.put("colcustom_attributes", _colcustom_attributes);}
if (true) break;

case 33:
//C
this.state = 32;
index18++;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1048;BA.debugLine="Dim value As String = colcustom_attributes.Get(";
Debug.ShouldStop(8388608);
_value = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 1049;BA.debugLine="Dim attribute_code As String = colcustom_attrib";
Debug.ShouldStop(16777216);
_attribute_code = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))));Debug.locals.put("attribute_code", _attribute_code);Debug.locals.put("attribute_code", _attribute_code);
 BA.debugLineNum = 1050;BA.debugLine="If attribute_code=\"code\" Then code=value";
Debug.ShouldStop(33554432);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_attribute_code,BA.ObjectToString("code"))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_code = _value;Debug.locals.put("code", _code);
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 1051;BA.debugLine="If attribute_code=\"customer_code\" Then customer";
Debug.ShouldStop(67108864);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_attribute_code,BA.ObjectToString("customer_code"))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
_customer_code = _value;Debug.locals.put("customer_code", _customer_code);
if (true) break;

case 24:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 1055;BA.debugLine="Dim updated_at As String = root.Get(\"updated_at\")";
Debug.ShouldStop(1073741824);
_updated_at = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 1056;BA.debugLine="Dim disable_auto_group_change As Int = root.Get(\"";
Debug.ShouldStop(-2147483648);
_disable_auto_group_change = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("disable_auto_group_change")))));Debug.locals.put("disable_auto_group_change", _disable_auto_group_change);Debug.locals.put("disable_auto_group_change", _disable_auto_group_change);
 BA.debugLineNum = 1057;BA.debugLine="Dim group_id As Int = root.Get(\"group_id\")";
Debug.ShouldStop(1);
_group_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("group_id")))));Debug.locals.put("group_id", _group_id);Debug.locals.put("group_id", _group_id);
 BA.debugLineNum = 1058;BA.debugLine="Dim id As Int = root.Get(\"id\")";
Debug.ShouldStop(2);
_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1059;BA.debugLine="Dim website_id As Int = root.Get(\"website_id\")";
Debug.ShouldStop(4);
_website_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("website_id")))));Debug.locals.put("website_id", _website_id);Debug.locals.put("website_id", _website_id);
 BA.debugLineNum = 1060;BA.debugLine="Dim email As String = root.Get(\"email\")";
Debug.ShouldStop(8);
_email = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 1061;BA.debugLine="Dim created_in As String = root.Get(\"created_in\")";
Debug.ShouldStop(16);
_created_in = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_in")))));Debug.locals.put("created_in", _created_in);Debug.locals.put("created_in", _created_in);
 BA.debugLineNum = 1062;BA.debugLine="For Each mAddress As Map In addresses";
Debug.ShouldStop(32);
if (true) break;

case 27:
//for
this.state = 30;
_maddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group32 = _addresses;
index32 = 0;
groupLen32 = group32.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mAddress", _maddress);
this.state = 34;
if (true) break;

case 34:
//C
this.state = 30;
if (index32 < groupLen32) {
this.state = 29;
_maddress = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group32.runMethod(false,"Get",index32));Debug.locals.put("mAddress", _maddress);}
if (true) break;

case 35:
//C
this.state = 34;
index32++;
Debug.locals.put("mAddress", _maddress);
if (true) break;

case 29:
//C
this.state = 35;
 BA.debugLineNum = 1063;BA.debugLine="Log(\"Address: \" & mAddress)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","8104005678",RemoteObject.concat(RemoteObject.createImmutable("Address: "),_maddress),0);
 BA.debugLineNum = 1064;BA.debugLine="Dim Street As String=mAddress.Get(\"Street\")";
Debug.ShouldStop(128);
_street = BA.ObjectToString(_maddress.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Street")))));Debug.locals.put("Street", _street);Debug.locals.put("Street", _street);
 BA.debugLineNum = 1073;BA.debugLine="mAddress.Put(\"code\",code)";
Debug.ShouldStop(65536);
_maddress.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("code"))),(Object)((_code)));
 BA.debugLineNum = 1074;BA.debugLine="mAddress.Put(\"customer_code\",customer_code)";
Debug.ShouldStop(131072);
_maddress.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("customer_code"))),(Object)((_customer_code)));
 BA.debugLineNum = 1075;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mS";
Debug.ShouldStop(262144);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblB2BDireccionesCliente")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_maddress.getObject())})))));
 if (true) break;
if (true) break;

case 30:
//C
this.state = -1;
Debug.locals.put("mAddress", _maddress);
;
 BA.debugLineNum = 1078;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1079;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _cargalistacategoriasmagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaListaCategoriasMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,3289);
if (RapidSub.canDelegate("cargalistacategoriasmagento")) { return __ref.runUserSub(false, "ctestsinfomagento","cargalistacategoriasmagento", __ref);}
ResumableSub_CargaListaCategoriasMagento rsub = new ResumableSub_CargaListaCategoriasMagento(null,__ref);
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
public static class ResumableSub_CargaListaCategoriasMagento extends BA.ResumableSub {
public ResumableSub_CargaListaCategoriasMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaListaCategoriasMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,3289);
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
 BA.debugLineNum = 3292;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BCategoriasPr";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BCategoriasProductos")));
 BA.debugLineNum = 3294;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionCategoria";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargalistacategoriasmagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentoinformacioncategoriasproductos" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 3295;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
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
this.state = -1;
;
 BA.debugLineNum = 3297;BA.debugLine="Log(sResp)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","8105775112",_sresp,0);
 BA.debugLineNum = 3299;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 3300;BA.debugLine="End Sub";
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
public static RemoteObject  _cargalistaclientesmagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaListaClientesMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,826);
if (RapidSub.canDelegate("cargalistaclientesmagento")) { return __ref.runUserSub(false, "ctestsinfomagento","cargalistaclientesmagento", __ref);}
ResumableSub_CargaListaClientesMagento rsub = new ResumableSub_CargaListaClientesMagento(null,__ref);
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
public static class ResumableSub_CargaListaClientesMagento extends BA.ResumableSub {
public ResumableSub_CargaListaClientesMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total_count = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _sk = RemoteObject.createImmutable("");
RemoteObject _store_id = RemoteObject.createImmutable(0);
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _addresses = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coladdresses = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _region_id = RemoteObject.createImmutable(0);
RemoteObject _postcode = RemoteObject.createImmutable("");
RemoteObject _telephone = RemoteObject.createImmutable("");
RemoteObject _default_shipping = RemoteObject.createImmutable("");
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _street = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colstreet = RemoteObject.createImmutable("");
RemoteObject _customer_id = RemoteObject.createImmutable(0);
RemoteObject _region = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _regiona = RemoteObject.createImmutable("");
RemoteObject _region_code = RemoteObject.createImmutable("");
RemoteObject _default_billing = RemoteObject.createImmutable("");
RemoteObject _country_id = RemoteObject.createImmutable("");
RemoteObject _gender = RemoteObject.createImmutable(0);
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _is_subscribed = RemoteObject.createImmutable("");
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _disable_auto_group_change = RemoteObject.createImmutable(0);
RemoteObject _group_id = RemoteObject.createImmutable(0);
RemoteObject _dob = RemoteObject.createImmutable("");
RemoteObject _website_id = RemoteObject.createImmutable(0);
RemoteObject _email = RemoteObject.createImmutable("");
RemoteObject _created_in = RemoteObject.createImmutable("");
RemoteObject _custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _is_blocked = RemoteObject.createImmutable(0);
RemoteObject _is_commercial = RemoteObject.createImmutable(0);
RemoteObject _company = RemoteObject.createImmutable("");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _customer_group_code = RemoteObject.createImmutable("");
RemoteObject _customer_group_name = RemoteObject.createImmutable("");
RemoteObject _language = RemoteObject.createImmutable("");
RemoteObject _mattribute = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colfilter_groups = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filters = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colfilters = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _field = RemoteObject.createImmutable("");
RemoteObject _condition_type = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject group9;
int index9;
int groupLen9;
RemoteObject group15;
int index15;
int groupLen15;
RemoteObject group21;
int index21;
int groupLen21;
RemoteObject group31;
int index31;
int groupLen31;
RemoteObject group68;
int index68;
int groupLen68;
RemoteObject group91;
int index91;
int groupLen91;
RemoteObject group93;
int index93;
int groupLen93;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaListaClientesMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,826);
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
 BA.debugLineNum = 827;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BClientes\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BClientes")));
 BA.debugLineNum = 828;BA.debugLine="wait for(EnvioDatosAPIMagentoBusquedaClientes(tk)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargalistaclientesmagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentobusquedaclientes" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 90;
return;
case 90:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 829;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 830;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(536870912);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 831;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(1073741824);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 832;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(-2147483648);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 833;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
Debug.ShouldStop(1);
_total_count = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_count")))));Debug.locals.put("total_count", _total_count);Debug.locals.put("total_count", _total_count);
 BA.debugLineNum = 834;BA.debugLine="Dim items As List = root.Get(\"items\")";
Debug.ShouldStop(2);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 835;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(4);
if (true) break;

case 7:
//for
this.state = 81;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group9 = _items;
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 91;
if (true) break;

case 91:
//C
this.state = 81;
if (index9 < groupLen9) {
this.state = 9;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group9.runMethod(false,"Get",index9));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 92:
//C
this.state = 91;
index9++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 836;BA.debugLine="Log(\"ColItems: \" & colitems)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","8103809034",RemoteObject.concat(RemoteObject.createImmutable("ColItems: "),_colitems),0);
 BA.debugLineNum = 838;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
Debug.ShouldStop(32);
_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 839;BA.debugLine="If id=66 Then";
Debug.ShouldStop(64);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_id,BA.numberCast(double.class, 66))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 840;BA.debugLine="Log(\"Mary J\")";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","8103809038",RemoteObject.createImmutable("Mary J"),0);
 if (true) break;
;
 BA.debugLineNum = 843;BA.debugLine="For Each sK As String In colitems.Keys";
Debug.ShouldStop(1024);

case 13:
//for
this.state = 16;
group15 = _colitems.runMethod(false,"Keys");
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("sK", _sk);
this.state = 93;
if (true) break;

case 93:
//C
this.state = 16;
if (index15 < groupLen15) {
this.state = 15;
_sk = BA.ObjectToString(group15.runMethod(false,"Get",index15));Debug.locals.put("sK", _sk);}
if (true) break;

case 94:
//C
this.state = 93;
index15++;
Debug.locals.put("sK", _sk);
if (true) break;

case 15:
//C
this.state = 94;
 BA.debugLineNum = 844;BA.debugLine="Log(sK & \": \" & colitems.Get(sK))";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","8103809042",RemoteObject.concat(_sk,RemoteObject.createImmutable(": "),_colitems.runMethod(false,"Get",(Object)((_sk)))),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
Debug.locals.put("sK", _sk);
;
 BA.debugLineNum = 846;BA.debugLine="Dim store_id As Int = colitems.Get(\"store_id\")";
Debug.ShouldStop(8192);
_store_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_id")))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 847;BA.debugLine="Dim firstname As String = colitems.Get(\"firstnam";
Debug.ShouldStop(16384);
_firstname = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 848;BA.debugLine="Dim addresses As List = colitems.Get(\"addresses\"";
Debug.ShouldStop(32768);
_addresses = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_addresses = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("addresses")))));Debug.locals.put("addresses", _addresses);Debug.locals.put("addresses", _addresses);
 BA.debugLineNum = 849;BA.debugLine="For Each coladdresses As Map In addresses";
Debug.ShouldStop(65536);
if (true) break;

case 17:
//for
this.state = 24;
_coladdresses = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = _addresses;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("coladdresses", _coladdresses);
this.state = 95;
if (true) break;

case 95:
//C
this.state = 24;
if (index21 < groupLen21) {
this.state = 19;
_coladdresses = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group21.runMethod(false,"Get",index21));Debug.locals.put("coladdresses", _coladdresses);}
if (true) break;

case 96:
//C
this.state = 95;
index21++;
Debug.locals.put("coladdresses", _coladdresses);
if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 851;BA.debugLine="Log(\"coladdresses: \" & coladdresses)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","8103809049",RemoteObject.concat(RemoteObject.createImmutable("coladdresses: "),_coladdresses),0);
 BA.debugLineNum = 852;BA.debugLine="Dim firstname As String = coladdresses.Get(\"fir";
Debug.ShouldStop(524288);
_firstname = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 853;BA.debugLine="Dim city As String = coladdresses.Get(\"city\")";
Debug.ShouldStop(1048576);
_city = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 854;BA.debugLine="Dim region_id As Int = coladdresses.Get(\"region";
Debug.ShouldStop(2097152);
_region_id = BA.numberCast(int.class, _coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_id")))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 855;BA.debugLine="Dim postcode As String = coladdresses.Get(\"post";
Debug.ShouldStop(4194304);
_postcode = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 856;BA.debugLine="Dim telephone As String = coladdresses.Get(\"tel";
Debug.ShouldStop(8388608);
_telephone = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 857;BA.debugLine="Dim default_shipping As String = coladdresses.G";
Debug.ShouldStop(16777216);
_default_shipping = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("default_shipping")))));Debug.locals.put("default_shipping", _default_shipping);Debug.locals.put("default_shipping", _default_shipping);
 BA.debugLineNum = 858;BA.debugLine="Dim lastname As String = coladdresses.Get(\"last";
Debug.ShouldStop(33554432);
_lastname = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 859;BA.debugLine="Dim street As List = coladdresses.Get(\"street\")";
Debug.ShouldStop(67108864);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 860;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(134217728);
if (true) break;

case 20:
//for
this.state = 23;
group31 = _street;
index31 = 0;
groupLen31 = group31.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 97;
if (true) break;

case 97:
//C
this.state = 23;
if (index31 < groupLen31) {
this.state = 22;
_colstreet = BA.ObjectToString(group31.runMethod(false,"Get",index31));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 98:
//C
this.state = 97;
index31++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 22:
//C
this.state = 98;
 if (true) break;
if (true) break;

case 23:
//C
this.state = 96;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 862;BA.debugLine="Dim id As Int = coladdresses.Get(\"id\")";
Debug.ShouldStop(536870912);
_id = BA.numberCast(int.class, _coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 863;BA.debugLine="Dim customer_id As Int = coladdresses.Get(\"cust";
Debug.ShouldStop(1073741824);
_customer_id = BA.numberCast(int.class, _coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_id")))));Debug.locals.put("customer_id", _customer_id);Debug.locals.put("customer_id", _customer_id);
 BA.debugLineNum = 864;BA.debugLine="Dim region As Map = coladdresses.Get(\"region\")";
Debug.ShouldStop(-2147483648);
_region = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_region = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 865;BA.debugLine="Dim region_id As Int = region.Get(\"region_id\")";
Debug.ShouldStop(1);
_region_id = BA.numberCast(int.class, _region.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_id")))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 866;BA.debugLine="Dim regionA As String = region.Get(\"region\")";
Debug.ShouldStop(2);
_regiona = BA.ObjectToString(_region.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("regionA", _regiona);Debug.locals.put("regionA", _regiona);
 BA.debugLineNum = 867;BA.debugLine="Dim region_code As String = region.Get(\"region_";
Debug.ShouldStop(4);
_region_code = BA.ObjectToString(_region.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 868;BA.debugLine="Dim default_billing As String = coladdresses.Ge";
Debug.ShouldStop(8);
_default_billing = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("default_billing")))));Debug.locals.put("default_billing", _default_billing);Debug.locals.put("default_billing", _default_billing);
 BA.debugLineNum = 869;BA.debugLine="Dim country_id As String = coladdresses.Get(\"co";
Debug.ShouldStop(16);
_country_id = BA.ObjectToString(_coladdresses.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
Debug.locals.put("coladdresses", _coladdresses);
;
 BA.debugLineNum = 871;BA.debugLine="Dim gender As Int = colitems.Getdefault(\"gender\"";
Debug.ShouldStop(64);
_gender = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gender"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("gender", _gender);Debug.locals.put("gender", _gender);
 BA.debugLineNum = 872;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
Debug.ShouldStop(128);
_created_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 873;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
Debug.ShouldStop(256);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 874;BA.debugLine="Dim is_subscribed As String = extension_attribut";
Debug.ShouldStop(512);
_is_subscribed = BA.ObjectToString(_extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_subscribed")))));Debug.locals.put("is_subscribed", _is_subscribed);Debug.locals.put("is_subscribed", _is_subscribed);
 BA.debugLineNum = 875;BA.debugLine="Dim default_shipping As String = colitems.Get(\"d";
Debug.ShouldStop(1024);
_default_shipping = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("default_shipping")))));Debug.locals.put("default_shipping", _default_shipping);Debug.locals.put("default_shipping", _default_shipping);
 BA.debugLineNum = 876;BA.debugLine="Dim lastname As String = colitems.Get(\"lastname\"";
Debug.ShouldStop(2048);
_lastname = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 877;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
Debug.ShouldStop(4096);
_updated_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 878;BA.debugLine="Dim disable_auto_group_change As Int = colitems.";
Debug.ShouldStop(8192);
_disable_auto_group_change = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("disable_auto_group_change")))));Debug.locals.put("disable_auto_group_change", _disable_auto_group_change);Debug.locals.put("disable_auto_group_change", _disable_auto_group_change);
 BA.debugLineNum = 879;BA.debugLine="Dim group_id As Int = colitems.Get(\"group_id\")";
Debug.ShouldStop(16384);
_group_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("group_id")))));Debug.locals.put("group_id", _group_id);Debug.locals.put("group_id", _group_id);
 BA.debugLineNum = 880;BA.debugLine="Dim dob As String = colitems.Get(\"dob\")";
Debug.ShouldStop(32768);
_dob = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dob")))));Debug.locals.put("dob", _dob);Debug.locals.put("dob", _dob);
 BA.debugLineNum = 881;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
Debug.ShouldStop(65536);
_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 882;BA.debugLine="Dim default_billing As String = colitems.Get(\"de";
Debug.ShouldStop(131072);
_default_billing = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("default_billing")))));Debug.locals.put("default_billing", _default_billing);Debug.locals.put("default_billing", _default_billing);
 BA.debugLineNum = 883;BA.debugLine="Dim website_id As Int = colitems.Get(\"website_id";
Debug.ShouldStop(262144);
_website_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("website_id")))));Debug.locals.put("website_id", _website_id);Debug.locals.put("website_id", _website_id);
 BA.debugLineNum = 884;BA.debugLine="Dim email As String = colitems.Get(\"email\")";
Debug.ShouldStop(524288);
_email = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 885;BA.debugLine="Dim created_in As String = colitems.Get(\"created";
Debug.ShouldStop(1048576);
_created_in = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_in")))));Debug.locals.put("created_in", _created_in);Debug.locals.put("created_in", _created_in);
 BA.debugLineNum = 886;BA.debugLine="Dim custom_attributes As List=colitems.Get(\"cust";
Debug.ShouldStop(2097152);
_custom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("custom_attributes")))));Debug.locals.put("custom_attributes", _custom_attributes);Debug.locals.put("custom_attributes", _custom_attributes);
 BA.debugLineNum = 887;BA.debugLine="Dim is_blocked As Int=0";
Debug.ShouldStop(4194304);
_is_blocked = BA.numberCast(int.class, 0);Debug.locals.put("is_blocked", _is_blocked);Debug.locals.put("is_blocked", _is_blocked);
 BA.debugLineNum = 888;BA.debugLine="Dim is_commercial As Int=0";
Debug.ShouldStop(8388608);
_is_commercial = BA.numberCast(int.class, 0);Debug.locals.put("is_commercial", _is_commercial);Debug.locals.put("is_commercial", _is_commercial);
 BA.debugLineNum = 889;BA.debugLine="Dim company As String=\"\"";
Debug.ShouldStop(16777216);
_company = BA.ObjectToString("");Debug.locals.put("company", _company);Debug.locals.put("company", _company);
 BA.debugLineNum = 890;BA.debugLine="Dim code As String=\"\"";
Debug.ShouldStop(33554432);
_code = BA.ObjectToString("");Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 891;BA.debugLine="Dim customer_group_code As String=\"\"";
Debug.ShouldStop(67108864);
_customer_group_code = BA.ObjectToString("");Debug.locals.put("customer_group_code", _customer_group_code);Debug.locals.put("customer_group_code", _customer_group_code);
 BA.debugLineNum = 892;BA.debugLine="Dim customer_group_name As String=\"\"";
Debug.ShouldStop(134217728);
_customer_group_name = BA.ObjectToString("");Debug.locals.put("customer_group_name", _customer_group_name);Debug.locals.put("customer_group_name", _customer_group_name);
 BA.debugLineNum = 893;BA.debugLine="Dim language As String=\"\"";
Debug.ShouldStop(268435456);
_language = BA.ObjectToString("");Debug.locals.put("language", _language);Debug.locals.put("language", _language);
 BA.debugLineNum = 894;BA.debugLine="Dim country_id As String=\"\"";
Debug.ShouldStop(536870912);
_country_id = BA.ObjectToString("");Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 895;BA.debugLine="If custom_attributes.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 25:
//if
this.state = 80;
if (_custom_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 896;BA.debugLine="Log(custom_attributes)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","8103809094",BA.ObjectToString(_custom_attributes),0);
 BA.debugLineNum = 897;BA.debugLine="For Each mAttribute As Map In custom_attributes";
Debug.ShouldStop(1);
if (true) break;

case 28:
//for
this.state = 79;
_mattribute = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group68 = _custom_attributes;
index68 = 0;
groupLen68 = group68.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mAttribute", _mattribute);
this.state = 99;
if (true) break;

case 99:
//C
this.state = 79;
if (index68 < groupLen68) {
this.state = 30;
_mattribute = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group68.runMethod(false,"Get",index68));Debug.locals.put("mAttribute", _mattribute);}
if (true) break;

case 100:
//C
this.state = 99;
index68++;
Debug.locals.put("mAttribute", _mattribute);
if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 898;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"is_blocke";
Debug.ShouldStop(2);
if (true) break;

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("is_blocked")))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_is_blocked = BA.numberCast(int.class, _mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("is_blocked", _is_blocked);
if (true) break;

case 36:
//C
this.state = 37;
;
 BA.debugLineNum = 899;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"is_commer";
Debug.ShouldStop(4);
if (true) break;

case 37:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("is_commercial")))) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
_is_commercial = BA.numberCast(int.class, _mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("is_commercial", _is_commercial);
if (true) break;

case 42:
//C
this.state = 43;
;
 BA.debugLineNum = 900;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"company\"";
Debug.ShouldStop(8);
if (true) break;

case 43:
//if
this.state = 48;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("company")))) { 
this.state = 45;
;}if (true) break;

case 45:
//C
this.state = 48;
_company = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("company", _company);
if (true) break;

case 48:
//C
this.state = 49;
;
 BA.debugLineNum = 901;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"code\" The";
Debug.ShouldStop(16);
if (true) break;

case 49:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("code")))) { 
this.state = 51;
;}if (true) break;

case 51:
//C
this.state = 54;
_code = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("code", _code);
if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 902;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"customer_";
Debug.ShouldStop(32);
if (true) break;

case 55:
//if
this.state = 60;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("customer_group_code")))) { 
this.state = 57;
;}if (true) break;

case 57:
//C
this.state = 60;
_customer_group_code = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("customer_group_code", _customer_group_code);
if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 903;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"customer_";
Debug.ShouldStop(64);
if (true) break;

case 61:
//if
this.state = 66;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("customer_group_name")))) { 
this.state = 63;
;}if (true) break;

case 63:
//C
this.state = 66;
_customer_group_name = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("customer_group_name", _customer_group_name);
if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 904;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"language\"";
Debug.ShouldStop(128);
if (true) break;

case 67:
//if
this.state = 72;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("language")))) { 
this.state = 69;
;}if (true) break;

case 69:
//C
this.state = 72;
_language = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("language", _language);
if (true) break;

case 72:
//C
this.state = 73;
;
 BA.debugLineNum = 905;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"country_i";
Debug.ShouldStop(256);
if (true) break;

case 73:
//if
this.state = 78;
if (RemoteObject.solveBoolean("=",_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("country_id")))) { 
this.state = 75;
;}if (true) break;

case 75:
//C
this.state = 78;
_country_id = BA.ObjectToString(_mattribute.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("country_id", _country_id);
if (true) break;

case 78:
//C
this.state = 100;
;
 if (true) break;
if (true) break;

case 79:
//C
this.state = 80;
Debug.locals.put("mAttribute", _mattribute);
;
 BA.debugLineNum = 908;BA.debugLine="colitems.put(\"is_blocked\",is_blocked)";
Debug.ShouldStop(2048);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_blocked"))),(Object)((_is_blocked)));
 BA.debugLineNum = 909;BA.debugLine="colitems.put(\"is_commercial\",is_commercial)";
Debug.ShouldStop(4096);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_commercial"))),(Object)((_is_commercial)));
 BA.debugLineNum = 910;BA.debugLine="colitems.put(\"company\",company)";
Debug.ShouldStop(8192);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("company"))),(Object)((_company)));
 BA.debugLineNum = 911;BA.debugLine="colitems.put(\"code\",code)";
Debug.ShouldStop(16384);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("code"))),(Object)((_code)));
 BA.debugLineNum = 912;BA.debugLine="colitems.put(\"customer_group_code\",customer_gro";
Debug.ShouldStop(32768);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("customer_group_code"))),(Object)((_customer_group_code)));
 BA.debugLineNum = 913;BA.debugLine="colitems.put(\"customer_group_name\",customer_gro";
Debug.ShouldStop(65536);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("customer_group_name"))),(Object)((_customer_group_name)));
 BA.debugLineNum = 914;BA.debugLine="colitems.put(\"language\",language)";
Debug.ShouldStop(131072);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("language"))),(Object)((_language)));
 BA.debugLineNum = 915;BA.debugLine="colitems.put(\"country_id\",country_id)";
Debug.ShouldStop(262144);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("country_id"))),(Object)((_country_id)));
 if (true) break;

case 80:
//C
this.state = 92;
;
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 921;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
Debug.ShouldStop(16777216);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblB2BClientes")),(Object)(_items));
 BA.debugLineNum = 922;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
Debug.ShouldStop(33554432);
_search_criteria = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("search_criteria")))));Debug.locals.put("search_criteria", _search_criteria);Debug.locals.put("search_criteria", _search_criteria);
 BA.debugLineNum = 923;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
Debug.ShouldStop(67108864);
_filter_groups = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _search_criteria.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filter_groups")))));Debug.locals.put("filter_groups", _filter_groups);Debug.locals.put("filter_groups", _filter_groups);
 BA.debugLineNum = 924;BA.debugLine="For Each colfilter_groups As Map In filter_groups";
Debug.ShouldStop(134217728);
if (true) break;

case 82:
//for
this.state = 89;
_colfilter_groups = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group91 = _filter_groups;
index91 = 0;
groupLen91 = group91.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colfilter_groups", _colfilter_groups);
this.state = 101;
if (true) break;

case 101:
//C
this.state = 89;
if (index91 < groupLen91) {
this.state = 84;
_colfilter_groups = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group91.runMethod(false,"Get",index91));Debug.locals.put("colfilter_groups", _colfilter_groups);}
if (true) break;

case 102:
//C
this.state = 101;
index91++;
Debug.locals.put("colfilter_groups", _colfilter_groups);
if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 925;BA.debugLine="Dim filters As List = colfilter_groups.Get(\"filt";
Debug.ShouldStop(268435456);
_filters = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filters = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colfilter_groups.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filters")))));Debug.locals.put("filters", _filters);Debug.locals.put("filters", _filters);
 BA.debugLineNum = 926;BA.debugLine="For Each colfilters As Map In filters";
Debug.ShouldStop(536870912);
if (true) break;

case 85:
//for
this.state = 88;
_colfilters = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group93 = _filters;
index93 = 0;
groupLen93 = group93.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colfilters", _colfilters);
this.state = 103;
if (true) break;

case 103:
//C
this.state = 88;
if (index93 < groupLen93) {
this.state = 87;
_colfilters = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group93.runMethod(false,"Get",index93));Debug.locals.put("colfilters", _colfilters);}
if (true) break;

case 104:
//C
this.state = 103;
index93++;
Debug.locals.put("colfilters", _colfilters);
if (true) break;

case 87:
//C
this.state = 104;
 BA.debugLineNum = 927;BA.debugLine="Dim field As String = colfilters.Get(\"field\")";
Debug.ShouldStop(1073741824);
_field = BA.ObjectToString(_colfilters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("field")))));Debug.locals.put("field", _field);Debug.locals.put("field", _field);
 BA.debugLineNum = 928;BA.debugLine="Dim condition_type As String = colfilters.Get(\"";
Debug.ShouldStop(-2147483648);
_condition_type = BA.ObjectToString(_colfilters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("condition_type")))));Debug.locals.put("condition_type", _condition_type);Debug.locals.put("condition_type", _condition_type);
 BA.debugLineNum = 929;BA.debugLine="Dim value As String = colfilters.Get(\"value\")";
Debug.ShouldStop(1);
_value = BA.ObjectToString(_colfilters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 if (true) break;
if (true) break;

case 88:
//C
this.state = 102;
Debug.locals.put("colfilters", _colfilters);
;
 if (true) break;
if (true) break;

case 89:
//C
this.state = -1;
Debug.locals.put("colfilter_groups", _colfilter_groups);
;
 BA.debugLineNum = 932;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 933;BA.debugLine="End Sub";
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
public static RemoteObject  _cargalistagruposclientemagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaListaGruposClienteMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,705);
if (RapidSub.canDelegate("cargalistagruposclientemagento")) { return __ref.runUserSub(false, "ctestsinfomagento","cargalistagruposclientemagento", __ref);}
ResumableSub_CargaListaGruposClienteMagento rsub = new ResumableSub_CargaListaGruposClienteMagento(null,__ref);
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
public static class ResumableSub_CargaListaGruposClienteMagento extends BA.ResumableSub {
public ResumableSub_CargaListaGruposClienteMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total_count = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _tax_class_id = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _tax_class_name = RemoteObject.createImmutable("");
RemoteObject _search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colfilter_groups = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filters = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colfilters = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _field = RemoteObject.createImmutable("");
RemoteObject _condition_type = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject group9;
int index9;
int groupLen9;
RemoteObject group20;
int index20;
int groupLen20;
RemoteObject group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaListaGruposClienteMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,705);
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
 BA.debugLineNum = 706;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BGruposClient";
Debug.ShouldStop(2);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BGruposCliente")));
 BA.debugLineNum = 707;BA.debugLine="wait for(EnvioDatosAPIMagentoBusquedaGruposClient";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargalistagruposclientemagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentobusquedagruposclientes" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 708;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 710;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 711;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(64);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 712;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(128);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 713;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
Debug.ShouldStop(256);
_total_count = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_count")))));Debug.locals.put("total_count", _total_count);Debug.locals.put("total_count", _total_count);
 BA.debugLineNum = 714;BA.debugLine="Dim items As List = root.Get(\"items\")";
Debug.ShouldStop(512);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 715;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//for
this.state = 10;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group9 = _items;
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 20;
if (true) break;

case 20:
//C
this.state = 10;
if (index9 < groupLen9) {
this.state = 9;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group9.runMethod(false,"Get",index9));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 21:
//C
this.state = 20;
index9++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 9:
//C
this.state = 21;
 BA.debugLineNum = 716;BA.debugLine="Dim code As String = colitems.Get(\"code\")";
Debug.ShouldStop(2048);
_code = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 717;BA.debugLine="Dim tax_class_id As Int = colitems.Get(\"tax_clas";
Debug.ShouldStop(4096);
_tax_class_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tax_class_id")))));Debug.locals.put("tax_class_id", _tax_class_id);Debug.locals.put("tax_class_id", _tax_class_id);
 BA.debugLineNum = 718;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
Debug.ShouldStop(8192);
_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 719;BA.debugLine="Dim tax_class_name As String = colitems.Get(\"tax";
Debug.ShouldStop(16384);
_tax_class_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tax_class_name")))));Debug.locals.put("tax_class_name", _tax_class_name);Debug.locals.put("tax_class_name", _tax_class_name);
 BA.debugLineNum = 720;BA.debugLine="Log(colitems)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","8103612431",BA.ObjectToString(_colitems),0);
 BA.debugLineNum = 721;BA.debugLine="Log(\"\")";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","8103612432",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 722;BA.debugLine="mSQL.ExecNonQuery2($\"insert into tblB2BGruposCli";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.createImmutable("insert into tblB2BGruposCliente (code, tax_class_id, id, tax_class_name) values (?,?,?,?)"))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_code),(_tax_class_id),(_id),(_tax_class_name)})))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 725;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
Debug.ShouldStop(1048576);
_search_criteria = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("search_criteria")))));Debug.locals.put("search_criteria", _search_criteria);Debug.locals.put("search_criteria", _search_criteria);
 BA.debugLineNum = 726;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
Debug.ShouldStop(2097152);
_filter_groups = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _search_criteria.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filter_groups")))));Debug.locals.put("filter_groups", _filter_groups);Debug.locals.put("filter_groups", _filter_groups);
 BA.debugLineNum = 727;BA.debugLine="For Each colfilter_groups As Map In filter_groups";
Debug.ShouldStop(4194304);
if (true) break;

case 11:
//for
this.state = 18;
_colfilter_groups = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group20 = _filter_groups;
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colfilter_groups", _colfilter_groups);
this.state = 22;
if (true) break;

case 22:
//C
this.state = 18;
if (index20 < groupLen20) {
this.state = 13;
_colfilter_groups = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group20.runMethod(false,"Get",index20));Debug.locals.put("colfilter_groups", _colfilter_groups);}
if (true) break;

case 23:
//C
this.state = 22;
index20++;
Debug.locals.put("colfilter_groups", _colfilter_groups);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 728;BA.debugLine="Dim filters As List = colfilter_groups.Get(\"filt";
Debug.ShouldStop(8388608);
_filters = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filters = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colfilter_groups.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filters")))));Debug.locals.put("filters", _filters);Debug.locals.put("filters", _filters);
 BA.debugLineNum = 729;BA.debugLine="For Each colfilters As Map In filters";
Debug.ShouldStop(16777216);
if (true) break;

case 14:
//for
this.state = 17;
_colfilters = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group22 = _filters;
index22 = 0;
groupLen22 = group22.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colfilters", _colfilters);
this.state = 24;
if (true) break;

case 24:
//C
this.state = 17;
if (index22 < groupLen22) {
this.state = 16;
_colfilters = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group22.runMethod(false,"Get",index22));Debug.locals.put("colfilters", _colfilters);}
if (true) break;

case 25:
//C
this.state = 24;
index22++;
Debug.locals.put("colfilters", _colfilters);
if (true) break;

case 16:
//C
this.state = 25;
 BA.debugLineNum = 730;BA.debugLine="Dim field As String = colfilters.Get(\"field\")";
Debug.ShouldStop(33554432);
_field = BA.ObjectToString(_colfilters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("field")))));Debug.locals.put("field", _field);Debug.locals.put("field", _field);
 BA.debugLineNum = 731;BA.debugLine="Dim condition_type As String = colfilters.Get(\"";
Debug.ShouldStop(67108864);
_condition_type = BA.ObjectToString(_colfilters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("condition_type")))));Debug.locals.put("condition_type", _condition_type);Debug.locals.put("condition_type", _condition_type);
 BA.debugLineNum = 732;BA.debugLine="Dim value As String = colfilters.Get(\"value\")";
Debug.ShouldStop(134217728);
_value = BA.ObjectToString(_colfilters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 if (true) break;
if (true) break;

case 17:
//C
this.state = 23;
Debug.locals.put("colfilters", _colfilters);
;
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
Debug.locals.put("colfilter_groups", _colfilter_groups);
;
 BA.debugLineNum = 735;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 737;BA.debugLine="End Sub";
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
public static RemoteObject  _cargalistaproductosmagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaListaProductosMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1164);
if (RapidSub.canDelegate("cargalistaproductosmagento")) { return __ref.runUserSub(false, "ctestsinfomagento","cargalistaproductosmagento", __ref);}
ResumableSub_CargaListaProductosMagento rsub = new ResumableSub_CargaListaProductosMagento(null,__ref);
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
public static class ResumableSub_CargaListaProductosMagento extends BA.ResumableSub {
public ResumableSub_CargaListaProductosMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total_count = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lsttallas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstunidadesmedida = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _visibility = RemoteObject.createImmutable(0);
RemoteObject _type_id = RemoteObject.createImmutable("");
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _website_ids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colwebsite_ids = RemoteObject.createImmutable(0);
RemoteObject _category_links = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colcategory_links = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _category_id = RemoteObject.createImmutable("");
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _tier_prices = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sku = RemoteObject.createImmutable("");
RemoteObject _custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _idtalla = RemoteObject.createImmutable(0);
RemoteObject _unidadmedida = RemoteObject.createImmutable("");
RemoteObject _colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _attribute_code = RemoteObject.createImmutable("");
RemoteObject _attribute_set_id = RemoteObject.createImmutable(0);
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _price = RemoteObject.createImmutable(0);
RemoteObject _media_gallery_entries = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colmedia_gallery_entries = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _types = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coltypes = RemoteObject.createImmutable("");
RemoteObject _fichero = RemoteObject.createImmutable("");
RemoteObject _media_type = RemoteObject.createImmutable("");
RemoteObject _disabled = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _label = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _product_links = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colproduct_links = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _link_type = RemoteObject.createImmutable("");
RemoteObject _linked_product_sku = RemoteObject.createImmutable("");
RemoteObject _linked_product_type = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _current_page = RemoteObject.createImmutable(0);
RemoteObject _page_size = RemoteObject.createImmutable(0);
RemoteObject group15;
int index15;
int groupLen15;
RemoteObject group22;
int index22;
int groupLen22;
RemoteObject group26;
int index26;
int groupLen26;
RemoteObject group36;
int index36;
int groupLen36;
RemoteObject group55;
int index55;
int groupLen55;
RemoteObject group57;
int index57;
int groupLen57;
RemoteObject group71;
int index71;
int groupLen71;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaListaProductosMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1164);
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
 BA.debugLineNum = 1166;BA.debugLine="wait for(CargaValoresAtributoSizeProductos) compl";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargalistaproductosmagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargavaloresatributosizeproductos" /*RemoteObject*/ ));
this.state = 52;
return;
case 52:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1167;BA.debugLine="If Not(Success) Then Return False";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 1172;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BProductos\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BProductos")));
 BA.debugLineNum = 1174;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionProductos";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargalistaproductosmagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentoinformacionproductos" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 53;
return;
case 53:
//C
this.state = 7;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1175;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 12;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1177;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(16777216);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1178;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(33554432);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 1179;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(67108864);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1180;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
Debug.ShouldStop(134217728);
_total_count = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_count")))));Debug.locals.put("total_count", _total_count);Debug.locals.put("total_count", _total_count);
 BA.debugLineNum = 1181;BA.debugLine="Dim items As List = root.Get(\"items\")";
Debug.ShouldStop(268435456);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 1182;BA.debugLine="Dim lstTallas As List";
Debug.ShouldStop(536870912);
_lsttallas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstTallas", _lsttallas);
 BA.debugLineNum = 1183;BA.debugLine="lstTallas.Initialize";
Debug.ShouldStop(1073741824);
_lsttallas.runVoidMethod ("Initialize");
 BA.debugLineNum = 1184;BA.debugLine="Dim lstUnidadesMedida As List";
Debug.ShouldStop(-2147483648);
_lstunidadesmedida = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstUnidadesMedida", _lstunidadesmedida);
 BA.debugLineNum = 1185;BA.debugLine="lstUnidadesMedida.Initialize";
Debug.ShouldStop(1);
_lstunidadesmedida.runVoidMethod ("Initialize");
 BA.debugLineNum = 1186;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(2);
if (true) break;

case 13:
//for
this.state = 51;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group15 = _items;
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 54;
if (true) break;

case 54:
//C
this.state = 51;
if (index15 < groupLen15) {
this.state = 15;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group15.runMethod(false,"Get",index15));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 55:
//C
this.state = 54;
index15++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1187;BA.debugLine="Log(\"colitems:\" & colitems)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","8104202263",RemoteObject.concat(RemoteObject.createImmutable("colitems:"),_colitems),0);
 BA.debugLineNum = 1188;BA.debugLine="Dim visibility As Int = colitems.Get(\"visibility";
Debug.ShouldStop(8);
_visibility = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("visibility")))));Debug.locals.put("visibility", _visibility);Debug.locals.put("visibility", _visibility);
 BA.debugLineNum = 1189;BA.debugLine="Dim type_id As String = colitems.Get(\"type_id\")";
Debug.ShouldStop(16);
_type_id = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("type_id", _type_id);Debug.locals.put("type_id", _type_id);
 BA.debugLineNum = 1190;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
Debug.ShouldStop(32);
_created_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 1191;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
Debug.ShouldStop(64);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 1192;BA.debugLine="Dim website_ids As List = extension_attributes.G";
Debug.ShouldStop(128);
_website_ids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_website_ids = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("website_ids")))));Debug.locals.put("website_ids", _website_ids);Debug.locals.put("website_ids", _website_ids);
 BA.debugLineNum = 1193;BA.debugLine="For Each colwebsite_ids As Int In website_ids";
Debug.ShouldStop(256);
if (true) break;

case 16:
//for
this.state = 19;
group22 = _website_ids;
index22 = 0;
groupLen22 = group22.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colwebsite_ids", _colwebsite_ids);
this.state = 56;
if (true) break;

case 56:
//C
this.state = 19;
if (index22 < groupLen22) {
this.state = 18;
_colwebsite_ids = BA.numberCast(int.class, group22.runMethod(false,"Get",index22));Debug.locals.put("colwebsite_ids", _colwebsite_ids);}
if (true) break;

case 57:
//C
this.state = 56;
index22++;
Debug.locals.put("colwebsite_ids", _colwebsite_ids);
if (true) break;

case 18:
//C
this.state = 57;
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
Debug.locals.put("colwebsite_ids", _colwebsite_ids);
;
 BA.debugLineNum = 1196;BA.debugLine="Dim category_links As List = extension_attribute";
Debug.ShouldStop(2048);
_category_links = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_category_links = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("category_links")))));Debug.locals.put("category_links", _category_links);Debug.locals.put("category_links", _category_links);
 BA.debugLineNum = 1197;BA.debugLine="If category_links.IsInitialized Then";
Debug.ShouldStop(4096);
if (true) break;

case 20:
//if
this.state = 27;
if (_category_links.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1198;BA.debugLine="For Each colcategory_links As Map In category_l";
Debug.ShouldStop(8192);
if (true) break;

case 23:
//for
this.state = 26;
_colcategory_links = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group26 = _category_links;
index26 = 0;
groupLen26 = group26.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colcategory_links", _colcategory_links);
this.state = 58;
if (true) break;

case 58:
//C
this.state = 26;
if (index26 < groupLen26) {
this.state = 25;
_colcategory_links = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group26.runMethod(false,"Get",index26));Debug.locals.put("colcategory_links", _colcategory_links);}
if (true) break;

case 59:
//C
this.state = 58;
index26++;
Debug.locals.put("colcategory_links", _colcategory_links);
if (true) break;

case 25:
//C
this.state = 59;
 BA.debugLineNum = 1199;BA.debugLine="Dim category_id As String = colcategory_links.";
Debug.ShouldStop(16384);
_category_id = BA.ObjectToString(_colcategory_links.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("category_id")))));Debug.locals.put("category_id", _category_id);Debug.locals.put("category_id", _category_id);
 BA.debugLineNum = 1200;BA.debugLine="Dim position As Int = colcategory_links.Get(\"p";
Debug.ShouldStop(32768);
_position = BA.numberCast(int.class, _colcategory_links.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("position")))));Debug.locals.put("position", _position);Debug.locals.put("position", _position);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
Debug.locals.put("colcategory_links", _colcategory_links);
;
 if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 1203;BA.debugLine="Dim tier_prices As List = colitems.Get(\"tier_pri";
Debug.ShouldStop(262144);
_tier_prices = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tier_prices = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tier_prices")))));Debug.locals.put("tier_prices", _tier_prices);Debug.locals.put("tier_prices", _tier_prices);
 BA.debugLineNum = 1204;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
Debug.ShouldStop(524288);
_sku = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sku")))));Debug.locals.put("sku", _sku);Debug.locals.put("sku", _sku);
 BA.debugLineNum = 1215;BA.debugLine="Dim custom_attributes As List = colitems.Get(\"cu";
Debug.ShouldStop(1073741824);
_custom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("custom_attributes")))));Debug.locals.put("custom_attributes", _custom_attributes);Debug.locals.put("custom_attributes", _custom_attributes);
 BA.debugLineNum = 1216;BA.debugLine="Dim IDTalla As Int=-1";
Debug.ShouldStop(-2147483648);
_idtalla = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("IDTalla", _idtalla);Debug.locals.put("IDTalla", _idtalla);
 BA.debugLineNum = 1217;BA.debugLine="Dim UnidadMedida As String";
Debug.ShouldStop(1);
_unidadmedida = RemoteObject.createImmutable("");Debug.locals.put("UnidadMedida", _unidadmedida);
 BA.debugLineNum = 1218;BA.debugLine="For Each colcustom_attributes As Map In custom_a";
Debug.ShouldStop(2);
if (true) break;

case 28:
//for
this.state = 38;
_colcustom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group36 = _custom_attributes;
index36 = 0;
groupLen36 = group36.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
this.state = 60;
if (true) break;

case 60:
//C
this.state = 38;
if (index36 < groupLen36) {
this.state = 30;
_colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group36.runMethod(false,"Get",index36));Debug.locals.put("colcustom_attributes", _colcustom_attributes);}
if (true) break;

case 61:
//C
this.state = 60;
index36++;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1219;BA.debugLine="Log(colcustom_attributes.Get(\"attribute_code\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","8104202295",RemoteObject.concat(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(": "),_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value"))))),0);
 BA.debugLineNum = 1220;BA.debugLine="Dim value As String = colcustom_attributes.Get(";
Debug.ShouldStop(8);
_value = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 1224;BA.debugLine="Dim attribute_code As String = colcustom_attrib";
Debug.ShouldStop(128);
_attribute_code = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))));Debug.locals.put("attribute_code", _attribute_code);Debug.locals.put("attribute_code", _attribute_code);
 BA.debugLineNum = 1225;BA.debugLine="If attribute_code=\"size\" Then";
Debug.ShouldStop(256);
if (true) break;

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_attribute_code,BA.ObjectToString("size"))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 1226;BA.debugLine="Log(\"size\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","8104202302",RemoteObject.createImmutable("size"),0);
 BA.debugLineNum = 1227;BA.debugLine="IDTalla=value";
Debug.ShouldStop(1024);
_idtalla = BA.numberCast(int.class, _value);Debug.locals.put("IDTalla", _idtalla);
 if (true) break;
;
 BA.debugLineNum = 1229;BA.debugLine="If attribute_code=\"unidad_medida\" Then";
Debug.ShouldStop(4096);

case 34:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",_attribute_code,BA.ObjectToString("unidad_medida"))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 1230;BA.debugLine="Log(\"unidad_medida\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","8104202306",RemoteObject.createImmutable("unidad_medida"),0);
 BA.debugLineNum = 1231;BA.debugLine="UnidadMedida=value";
Debug.ShouldStop(16384);
_unidadmedida = _value;Debug.locals.put("UnidadMedida", _unidadmedida);
 if (true) break;

case 37:
//C
this.state = 61;
;
 if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
;
 BA.debugLineNum = 1234;BA.debugLine="colitems.Put(\"IDTalla\",IDTalla)";
Debug.ShouldStop(131072);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("IDTalla"))),(Object)((_idtalla)));
 BA.debugLineNum = 1235;BA.debugLine="colitems.Put(\"UnidadMedida\",UnidadMedida)";
Debug.ShouldStop(262144);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("UnidadMedida"))),(Object)((_unidadmedida)));
 BA.debugLineNum = 1236;BA.debugLine="Dim attribute_set_id As Int = colitems.Get(\"attr";
Debug.ShouldStop(524288);
_attribute_set_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_set_id")))));Debug.locals.put("attribute_set_id", _attribute_set_id);Debug.locals.put("attribute_set_id", _attribute_set_id);
 BA.debugLineNum = 1237;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
Debug.ShouldStop(1048576);
_updated_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 1238;BA.debugLine="Dim price As Int = colitems.Getdefault(\"price\",0";
Debug.ShouldStop(2097152);
_price = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("price"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("price", _price);Debug.locals.put("price", _price);
 BA.debugLineNum = 1239;BA.debugLine="Dim media_gallery_entries As List = colitems.Get";
Debug.ShouldStop(4194304);
_media_gallery_entries = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_media_gallery_entries = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("media_gallery_entries")))));Debug.locals.put("media_gallery_entries", _media_gallery_entries);Debug.locals.put("media_gallery_entries", _media_gallery_entries);
 BA.debugLineNum = 1240;BA.debugLine="For Each colmedia_gallery_entries As Map In medi";
Debug.ShouldStop(8388608);
if (true) break;

case 39:
//for
this.state = 46;
_colmedia_gallery_entries = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group55 = _media_gallery_entries;
index55 = 0;
groupLen55 = group55.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colmedia_gallery_entries", _colmedia_gallery_entries);
this.state = 62;
if (true) break;

case 62:
//C
this.state = 46;
if (index55 < groupLen55) {
this.state = 41;
_colmedia_gallery_entries = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group55.runMethod(false,"Get",index55));Debug.locals.put("colmedia_gallery_entries", _colmedia_gallery_entries);}
if (true) break;

case 63:
//C
this.state = 62;
index55++;
Debug.locals.put("colmedia_gallery_entries", _colmedia_gallery_entries);
if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 1241;BA.debugLine="Dim types As List = colmedia_gallery_entries.Ge";
Debug.ShouldStop(16777216);
_types = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_types = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colmedia_gallery_entries.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("types")))));Debug.locals.put("types", _types);Debug.locals.put("types", _types);
 BA.debugLineNum = 1242;BA.debugLine="For Each coltypes As String In types";
Debug.ShouldStop(33554432);
if (true) break;

case 42:
//for
this.state = 45;
group57 = _types;
index57 = 0;
groupLen57 = group57.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("coltypes", _coltypes);
this.state = 64;
if (true) break;

case 64:
//C
this.state = 45;
if (index57 < groupLen57) {
this.state = 44;
_coltypes = BA.ObjectToString(group57.runMethod(false,"Get",index57));Debug.locals.put("coltypes", _coltypes);}
if (true) break;

case 65:
//C
this.state = 64;
index57++;
Debug.locals.put("coltypes", _coltypes);
if (true) break;

case 44:
//C
this.state = 65;
 if (true) break;
if (true) break;

case 45:
//C
this.state = 63;
Debug.locals.put("coltypes", _coltypes);
;
 BA.debugLineNum = 1244;BA.debugLine="Dim Fichero As String = colmedia_gallery_entrie";
Debug.ShouldStop(134217728);
_fichero = BA.ObjectToString(_colmedia_gallery_entries.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("file")))));Debug.locals.put("Fichero", _fichero);Debug.locals.put("Fichero", _fichero);
 BA.debugLineNum = 1245;BA.debugLine="Dim media_type As String = colmedia_gallery_ent";
Debug.ShouldStop(268435456);
_media_type = BA.ObjectToString(_colmedia_gallery_entries.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("media_type")))));Debug.locals.put("media_type", _media_type);Debug.locals.put("media_type", _media_type);
 BA.debugLineNum = 1246;BA.debugLine="Dim disabled As String = colmedia_gallery_entri";
Debug.ShouldStop(536870912);
_disabled = BA.ObjectToString(_colmedia_gallery_entries.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("disabled")))));Debug.locals.put("disabled", _disabled);Debug.locals.put("disabled", _disabled);
 BA.debugLineNum = 1247;BA.debugLine="Dim id As Int = colmedia_gallery_entries.Get(\"i";
Debug.ShouldStop(1073741824);
_id = BA.numberCast(int.class, _colmedia_gallery_entries.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1248;BA.debugLine="Dim label As String = colmedia_gallery_entries.";
Debug.ShouldStop(-2147483648);
_label = BA.ObjectToString(_colmedia_gallery_entries.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("label")))));Debug.locals.put("label", _label);Debug.locals.put("label", _label);
 BA.debugLineNum = 1249;BA.debugLine="Dim position As Int = colmedia_gallery_entries.";
Debug.ShouldStop(1);
_position = BA.numberCast(int.class, _colmedia_gallery_entries.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("position")))));Debug.locals.put("position", _position);Debug.locals.put("position", _position);
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
Debug.locals.put("colmedia_gallery_entries", _colmedia_gallery_entries);
;
 BA.debugLineNum = 1251;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
Debug.ShouldStop(4);
_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1252;BA.debugLine="Dim options As List = colitems.Get(\"options\")";
Debug.ShouldStop(8);
_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("options")))));Debug.locals.put("options", _options);Debug.locals.put("options", _options);
 BA.debugLineNum = 1253;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
Debug.ShouldStop(16);
_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1254;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
Debug.ShouldStop(32);
_sku = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sku")))));Debug.locals.put("sku", _sku);Debug.locals.put("sku", _sku);
 BA.debugLineNum = 1258;BA.debugLine="Dim product_links As List = colitems.Get(\"produc";
Debug.ShouldStop(512);
_product_links = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_product_links = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_links")))));Debug.locals.put("product_links", _product_links);Debug.locals.put("product_links", _product_links);
 BA.debugLineNum = 1259;BA.debugLine="For Each colproduct_links As Map In product_link";
Debug.ShouldStop(1024);
if (true) break;

case 47:
//for
this.state = 50;
_colproduct_links = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group71 = _product_links;
index71 = 0;
groupLen71 = group71.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colproduct_links", _colproduct_links);
this.state = 66;
if (true) break;

case 66:
//C
this.state = 50;
if (index71 < groupLen71) {
this.state = 49;
_colproduct_links = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group71.runMethod(false,"Get",index71));Debug.locals.put("colproduct_links", _colproduct_links);}
if (true) break;

case 67:
//C
this.state = 66;
index71++;
Debug.locals.put("colproduct_links", _colproduct_links);
if (true) break;

case 49:
//C
this.state = 67;
 BA.debugLineNum = 1260;BA.debugLine="Dim link_type As String = colproduct_links.Get(";
Debug.ShouldStop(2048);
_link_type = BA.ObjectToString(_colproduct_links.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("link_type")))));Debug.locals.put("link_type", _link_type);Debug.locals.put("link_type", _link_type);
 BA.debugLineNum = 1261;BA.debugLine="Dim linked_product_sku As String = colproduct_l";
Debug.ShouldStop(4096);
_linked_product_sku = BA.ObjectToString(_colproduct_links.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("linked_product_sku")))));Debug.locals.put("linked_product_sku", _linked_product_sku);Debug.locals.put("linked_product_sku", _linked_product_sku);
 BA.debugLineNum = 1262;BA.debugLine="Dim linked_product_type As String = colproduct_";
Debug.ShouldStop(8192);
_linked_product_type = BA.ObjectToString(_colproduct_links.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("linked_product_type")))));Debug.locals.put("linked_product_type", _linked_product_type);Debug.locals.put("linked_product_type", _linked_product_type);
 BA.debugLineNum = 1263;BA.debugLine="Dim position As Int = colproduct_links.Get(\"pos";
Debug.ShouldStop(16384);
_position = BA.numberCast(int.class, _colproduct_links.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("position")))));Debug.locals.put("position", _position);Debug.locals.put("position", _position);
 BA.debugLineNum = 1264;BA.debugLine="Dim sku As String = colproduct_links.Get(\"sku\")";
Debug.ShouldStop(32768);
_sku = BA.ObjectToString(_colproduct_links.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sku")))));Debug.locals.put("sku", _sku);Debug.locals.put("sku", _sku);
 if (true) break;
if (true) break;

case 50:
//C
this.state = 55;
Debug.locals.put("colproduct_links", _colproduct_links);
;
 BA.debugLineNum = 1266;BA.debugLine="Dim status As Int = colitems.Get(\"status\")";
Debug.ShouldStop(131072);
_status = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 if (true) break;
if (true) break;

case 51:
//C
this.state = -1;
Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 1269;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
Debug.ShouldStop(1048576);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblB2BProductos")),(Object)(_items));
 BA.debugLineNum = 1271;BA.debugLine="mSQL.ExecNonQuery($\"update tblB2BProductos set Ta";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("update tblB2BProductos set Talla=tTallas.Talla\n"),RemoteObject.createImmutable("	from (select value as IDTalla, label as Talla from tblB2BAtributoSizeProducts) tTallas\n"),RemoteObject.createImmutable("	where tblB2BProductos.IDTalla=tTallas.IDTalla\n"),RemoteObject.createImmutable("	")))));
 BA.debugLineNum = 1276;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
Debug.ShouldStop(134217728);
_search_criteria = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("search_criteria")))));Debug.locals.put("search_criteria", _search_criteria);Debug.locals.put("search_criteria", _search_criteria);
 BA.debugLineNum = 1277;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
Debug.ShouldStop(268435456);
_filter_groups = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _search_criteria.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filter_groups")))));Debug.locals.put("filter_groups", _filter_groups);Debug.locals.put("filter_groups", _filter_groups);
 BA.debugLineNum = 1278;BA.debugLine="Dim current_page As Int = search_criteria.Getdefa";
Debug.ShouldStop(536870912);
_current_page = BA.numberCast(int.class, _search_criteria.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("current_page"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("current_page", _current_page);Debug.locals.put("current_page", _current_page);
 BA.debugLineNum = 1279;BA.debugLine="Dim page_size As Int = search_criteria.Getdefault";
Debug.ShouldStop(1073741824);
_page_size = BA.numberCast(int.class, _search_criteria.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("page_size"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("page_size", _page_size);Debug.locals.put("page_size", _page_size);
 BA.debugLineNum = 1281;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1282;BA.debugLine="End Sub";
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
public static RemoteObject  _cargalistastoresmagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaListaStoresMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,559);
if (RapidSub.canDelegate("cargalistastoresmagento")) { return __ref.runUserSub(false, "ctestsinfomagento","cargalistastoresmagento", __ref);}
ResumableSub_CargaListaStoresMagento rsub = new ResumableSub_CargaListaStoresMagento(null,__ref);
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
public static class ResumableSub_CargaListaStoresMagento extends BA.ResumableSub {
public ResumableSub_CargaListaStoresMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _default_store_id = RemoteObject.createImmutable(0);
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _root_category_id = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _website_id = RemoteObject.createImmutable(0);
RemoteObject group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaListaStoresMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,559);
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
 BA.debugLineNum = 560;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BStores\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BStores")));
 BA.debugLineNum = 561;BA.debugLine="wait for(EnvioDatosAPIMagentoListaStores(tk)) com";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargalistastoresmagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentolistastores" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 562;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 563;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 565;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1048576);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 566;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(2097152);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 567;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(4194304);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 568;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(8388608);
if (true) break;

case 5:
//for
this.state = 8;
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group9 = _root;
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colroot", _colroot);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 8;
if (index9 < groupLen9) {
this.state = 7;
_colroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group9.runMethod(false,"Get",index9));Debug.locals.put("colroot", _colroot);}
if (true) break;

case 11:
//C
this.state = 10;
index9++;
Debug.locals.put("colroot", _colroot);
if (true) break;

case 7:
//C
this.state = 11;
 BA.debugLineNum = 569;BA.debugLine="Dim code As String = colroot.Get(\"code\")";
Debug.ShouldStop(16777216);
_code = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 570;BA.debugLine="Dim default_store_id As Int = colroot.Getdefault";
Debug.ShouldStop(33554432);
_default_store_id = BA.numberCast(int.class, _colroot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("default_store_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("default_store_id", _default_store_id);Debug.locals.put("default_store_id", _default_store_id);
 BA.debugLineNum = 571;BA.debugLine="Dim name As String = colroot.Get(\"name\")";
Debug.ShouldStop(67108864);
_name = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 572;BA.debugLine="Dim root_category_id As Int = colroot.Getdefault";
Debug.ShouldStop(134217728);
_root_category_id = BA.numberCast(int.class, _colroot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("root_category_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("root_category_id", _root_category_id);Debug.locals.put("root_category_id", _root_category_id);
 BA.debugLineNum = 573;BA.debugLine="Dim id As Int = colroot.Get(\"id\")";
Debug.ShouldStop(268435456);
_id = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 574;BA.debugLine="Dim website_id As Int = colroot.Get(\"website_id\"";
Debug.ShouldStop(536870912);
_website_id = BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("website_id")))));Debug.locals.put("website_id", _website_id);Debug.locals.put("website_id", _website_id);
 BA.debugLineNum = 576;BA.debugLine="Log(\"code: \" & code & \" Name: \" & name & \" ID: \"";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","8103415825",RemoteObject.concat(RemoteObject.createImmutable("code: "),_code,RemoteObject.createImmutable(" Name: "),_name,RemoteObject.createImmutable(" ID: "),_id),0);
 BA.debugLineNum = 577;BA.debugLine="Log(\" \")";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","8103415826",RemoteObject.createImmutable(" "),0);
 BA.debugLineNum = 578;BA.debugLine="mSQL.ExecNonQuery2($\"insert into tblB2BStores (c";
Debug.ShouldStop(2);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.createImmutable("insert into tblB2BStores (code, default_store_id, name, root_category_id, id, website_id) values (?,?,?,?,?,?)"))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_code),(_default_store_id),(_name),(_root_category_id),(_id),(_website_id)})))));
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 583;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
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
public static RemoteObject  _cargapedidos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaPedidos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2830);
if (RapidSub.canDelegate("cargapedidos")) { return __ref.runUserSub(false, "ctestsinfomagento","cargapedidos", __ref);}
ResumableSub_CargaPedidos rsub = new ResumableSub_CargaPedidos(null,__ref);
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
public static class ResumableSub_CargaPedidos extends BA.ResumableSub {
public ResumableSub_CargaPedidos(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total_count = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _po_number = RemoteObject.createImmutable("");
RemoteObject _pgw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _customer_firstname = RemoteObject.createImmutable("");
RemoteObject _billing_address = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _address_type = RemoteObject.createImmutable("");
RemoteObject _customer_address_id = RemoteObject.createImmutable(0);
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _postcode = RemoteObject.createImmutable("");
RemoteObject _region_id = RemoteObject.createImmutable(0);
RemoteObject _telephone = RemoteObject.createImmutable("");
RemoteObject _entity_id = RemoteObject.createImmutable(0);
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _parent_id = RemoteObject.createImmutable(0);
RemoteObject _street = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colstreet = RemoteObject.createImmutable("");
RemoteObject _region = RemoteObject.createImmutable("");
RemoteObject _country_id = RemoteObject.createImmutable("");
RemoteObject _email = RemoteObject.createImmutable("");
RemoteObject _region_code = RemoteObject.createImmutable("");
RemoteObject _total_paid = RemoteObject.createImmutable(0);
RemoteObject _increment_id = RemoteObject.createImmutable("");
RemoteObject _payment = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _base_amount_ordered = RemoteObject.createImmutable(0);
RemoteObject _amount_paid = RemoteObject.createImmutable(0);
RemoteObject _method = RemoteObject.createImmutable("");
RemoteObject _cc_last4 = RemoteObject.createImmutable("");
RemoteObject _account_status = RemoteObject.createImmutable("");
RemoteObject _amount_ordered = RemoteObject.createImmutable(0);
RemoteObject _base_amount_paid = RemoteObject.createImmutable(0);
RemoteObject _shipping_amount = RemoteObject.createImmutable(0);
RemoteObject _additional_information = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coladditional_information = RemoteObject.createImmutable("");
RemoteObject _base_shipping_amount = RemoteObject.createImmutable(0);
RemoteObject _state = RemoteObject.createImmutable("");
RemoteObject _base_grand_total = RemoteObject.createImmutable(0);
RemoteObject _billing_address_id = RemoteObject.createImmutable(0);
RemoteObject _customer_lastname = RemoteObject.createImmutable("");
RemoteObject _quote_id = RemoteObject.createImmutable(0);
RemoteObject _shipping_invoiced = RemoteObject.createImmutable(0);
RemoteObject _discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _weight = RemoteObject.createImmutable(0);
RemoteObject _idpedido = RemoteObject.createImmutable(0);
RemoteObject _base_total_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal_invoiced = RemoteObject.createImmutable(0);
RemoteObject _applied_rule_ids = RemoteObject.createImmutable("");
RemoteObject _subtotal_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_discount_tax_compensation_amnt = RemoteObject.createImmutable(0);
RemoteObject _subtotal = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _customer_email = RemoteObject.createImmutable("");
RemoteObject _base_discount_invoiced = RemoteObject.createImmutable(0);
RemoteObject _total_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_to_global_rate = RemoteObject.createImmutable(0);
RemoteObject _customer_is_guest = RemoteObject.createImmutable(0);
RemoteObject _tax_amount = RemoteObject.createImmutable(0);
RemoteObject _tax_invoiced = RemoteObject.createImmutable(0);
RemoteObject _original_price = RemoteObject.createImmutable(0);
RemoteObject _free_shipping = RemoteObject.createImmutable(0);
RemoteObject _base_discount_tax_compensation_invoiced = RemoteObject.createImmutable(0);
RemoteObject _discount_amount = RemoteObject.createImmutable(0);
RemoteObject _tax_percent = RemoteObject.createImmutable(0);
RemoteObject _price_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _price = RemoteObject.createImmutable(0);
RemoteObject _product_id = RemoteObject.createImmutable(0);
RemoteObject _base_row_total = RemoteObject.createImmutable(0);
RemoteObject _sku = RemoteObject.createImmutable("");
RemoteObject _base_original_price = RemoteObject.createImmutable(0);
RemoteObject _row_weight = RemoteObject.createImmutable(0);
RemoteObject _base_amount_refunded = RemoteObject.createImmutable(0);
RemoteObject _base_price_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _no_discount = RemoteObject.createImmutable(0);
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _discount_percent = RemoteObject.createImmutable(0);
RemoteObject _order_id = RemoteObject.createImmutable(0);
RemoteObject _discount_tax_compensation_invoiced = RemoteObject.createImmutable(0);
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _qty_shipped = RemoteObject.createImmutable(0);
RemoteObject _qty_ordered = RemoteObject.createImmutable(0);
RemoteObject _row_total = RemoteObject.createImmutable(0);
RemoteObject _qty_canceled = RemoteObject.createImmutable(0);
RemoteObject _product_option = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _talla = RemoteObject.createImmutable("");
RemoteObject _configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _option_value = RemoteObject.createImmutable(0);
RemoteObject _option_id = RemoteObject.createImmutable("");
RemoteObject _amount_refunded = RemoteObject.createImmutable(0);
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _base_price = RemoteObject.createImmutable(0);
RemoteObject _qty_invoiced = RemoteObject.createImmutable(0);
RemoteObject _row_invoiced = RemoteObject.createImmutable(0);
RemoteObject _row_total_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _store_id = RemoteObject.createImmutable(0);
RemoteObject _item_id = RemoteObject.createImmutable(0);
RemoteObject _base_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _base_row_total_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _product_type = RemoteObject.createImmutable("");
RemoteObject _qty_refunded = RemoteObject.createImmutable(0);
RemoteObject _base_row_invoiced = RemoteObject.createImmutable(0);
RemoteObject _is_qty_decimal = RemoteObject.createImmutable(0);
RemoteObject _discount_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_tax_invoiced = RemoteObject.createImmutable(0);
RemoteObject _global_currency_code = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _is_virtual = RemoteObject.createImmutable(0);
RemoteObject _base_total_invoiced_cost = RemoteObject.createImmutable(0);
RemoteObject _status_histories = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _store_currency_code = RemoteObject.createImmutable("");
RemoteObject _total_item_count = RemoteObject.createImmutable(0);
RemoteObject _shipping_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _store_to_base_rate = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _store_name = RemoteObject.createImmutable("");
RemoteObject _grand_total = RemoteObject.createImmutable(0);
RemoteObject _base_currency_code = RemoteObject.createImmutable("");
RemoteObject _base_total_paid = RemoteObject.createImmutable(0);
RemoteObject _shipping_discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _total_due = RemoteObject.createImmutable(0);
RemoteObject _total_qty_ordered = RemoteObject.createImmutable(0);
RemoteObject _shipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _payment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colpayment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _amount = RemoteObject.createImmutable(0);
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _base_amount = RemoteObject.createImmutable(0);
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _percent = RemoteObject.createImmutable(0);
RemoteObject _item_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitem_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _type = RemoteObject.createImmutable("");
RemoteObject _converting_from_quote = RemoteObject.createImmutable("");
RemoteObject _shipping_description = RemoteObject.createImmutable("");
RemoteObject _store_to_order_rate = RemoteObject.createImmutable(0);
RemoteObject _subtotal_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_to_order_rate = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal = RemoteObject.createImmutable(0);
RemoteObject _protect_code = RemoteObject.createImmutable("");
RemoteObject _customer_dob = RemoteObject.createImmutable("");
RemoteObject _base_total_due = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _customer_id = RemoteObject.createImmutable(0);
RemoteObject _customer_group_id = RemoteObject.createImmutable(0);
RemoteObject _order_currency_code = RemoteObject.createImmutable("");
RemoteObject _customer_gender = RemoteObject.createImmutable(0);
RemoteObject _shipping_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_invoiced = RemoteObject.createImmutable(0);
RemoteObject _search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _page_size = RemoteObject.createImmutable(0);
RemoteObject group16;
int index16;
int groupLen16;
RemoteObject group40;
int index40;
int groupLen40;
RemoteObject group60;
int index60;
int groupLen60;
RemoteObject group88;
int index88;
int groupLen88;
RemoteObject group125;
int index125;
int groupLen125;
RemoteObject group183;
int index183;
int groupLen183;
RemoteObject group190;
int index190;
int groupLen190;
RemoteObject group200;
int index200;
int groupLen200;
RemoteObject group202;
int index202;
int groupLen202;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaPedidos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2830);
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
 BA.debugLineNum = 2832;BA.debugLine="wait for(CargaValoresAtributoSizeProductos) compl";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargapedidos"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargavaloresatributosizeproductos" /*RemoteObject*/ ));
this.state = 83;
return;
case 83:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2833;BA.debugLine="If Not(Success) Then Return False";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 2835;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BOrders\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BOrders")));
 BA.debugLineNum = 2836;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidos(t";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargapedidos"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentoinformacionpedidos" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 84;
return;
case 84:
//C
this.state = 7;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 2837;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(1048576);
if (true) break;

case 7:
//if
this.state = 10;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2838;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2839;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargapedidos"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Pedidos B2B"))));
this.state = 85;
return;
case 85:
//C
this.state = 10;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 2840;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2843;BA.debugLine="TextAreaHTTPResponse.Text=sResp";
Debug.ShouldStop(67108864);
__ref.getField(false,"_textareahttpresponse" /*RemoteObject*/ ).runMethod(true,"setText",_sresp);
 BA.debugLineNum = 2845;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(268435456);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 2846;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(536870912);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 2847;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1073741824);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 2848;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
Debug.ShouldStop(-2147483648);
_total_count = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_count")))));Debug.locals.put("total_count", _total_count);Debug.locals.put("total_count", _total_count);
 BA.debugLineNum = 2849;BA.debugLine="Dim items As List = root.Get(\"items\")";
Debug.ShouldStop(1);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 2850;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(2);
if (true) break;

case 11:
//for
this.state = 82;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group16 = _items;
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 86;
if (true) break;

case 86:
//C
this.state = 82;
if (index16 < groupLen16) {
this.state = 13;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group16.runMethod(false,"Get",index16));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 87:
//C
this.state = 86;
index16++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2851;BA.debugLine="Log(\"ColItems: \" & colitems)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","8105512981",RemoteObject.concat(RemoteObject.createImmutable("ColItems: "),_colitems),0);
 BA.debugLineNum = 2857;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
Debug.ShouldStop(256);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 2858;BA.debugLine="Dim po_number As String";
Debug.ShouldStop(512);
_po_number = RemoteObject.createImmutable("");Debug.locals.put("po_number", _po_number);
 BA.debugLineNum = 2859;BA.debugLine="If extension_attributes.IsInitialized Then";
Debug.ShouldStop(1024);
if (true) break;

case 14:
//if
this.state = 21;
if (_extension_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2860;BA.debugLine="Dim pgw As Map=extension_attributes.Get(\"pgw\")";
Debug.ShouldStop(2048);
_pgw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_pgw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pgw")))));Debug.locals.put("pgw", _pgw);Debug.locals.put("pgw", _pgw);
 BA.debugLineNum = 2861;BA.debugLine="If pgw.IsInitialized Then";
Debug.ShouldStop(4096);
if (true) break;

case 17:
//if
this.state = 20;
if (_pgw.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2862;BA.debugLine="po_number=pgw.Getdefault(\"po_number\",\"\")";
Debug.ShouldStop(8192);
_po_number = BA.ObjectToString(_pgw.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("po_number"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("po_number", _po_number);
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 2874;BA.debugLine="colitems.put(\"po_number\",po_number)";
Debug.ShouldStop(33554432);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("po_number"))),(Object)((_po_number)));
 BA.debugLineNum = 2875;BA.debugLine="Dim customer_firstname As String = colitems.Get(";
Debug.ShouldStop(67108864);
_customer_firstname = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_firstname")))));Debug.locals.put("customer_firstname", _customer_firstname);Debug.locals.put("customer_firstname", _customer_firstname);
 BA.debugLineNum = 2877;BA.debugLine="Dim billing_address As Map = colitems.Get(\"billi";
Debug.ShouldStop(268435456);
_billing_address = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_billing_address = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("billing_address")))));Debug.locals.put("billing_address", _billing_address);Debug.locals.put("billing_address", _billing_address);
 BA.debugLineNum = 2878;BA.debugLine="Dim firstname As String = billing_address.Get(\"f";
Debug.ShouldStop(536870912);
_firstname = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 2879;BA.debugLine="Dim address_type As String = billing_address.Get";
Debug.ShouldStop(1073741824);
_address_type = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address_type")))));Debug.locals.put("address_type", _address_type);Debug.locals.put("address_type", _address_type);
 BA.debugLineNum = 2880;BA.debugLine="Dim customer_address_id As Int = billing_address";
Debug.ShouldStop(-2147483648);
_customer_address_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_address_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_address_id", _customer_address_id);Debug.locals.put("customer_address_id", _customer_address_id);
 BA.debugLineNum = 2881;BA.debugLine="Dim city As String = billing_address.Get(\"city\")";
Debug.ShouldStop(1);
_city = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 2882;BA.debugLine="Dim postcode As String = billing_address.Get(\"po";
Debug.ShouldStop(2);
_postcode = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 2883;BA.debugLine="Dim region_id As Int = billing_address.Getdefaul";
Debug.ShouldStop(4);
_region_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("region_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 2884;BA.debugLine="Dim telephone As String = billing_address.Get(\"t";
Debug.ShouldStop(8);
_telephone = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 2885;BA.debugLine="Dim entity_id As Int = billing_address.Get(\"enti";
Debug.ShouldStop(16);
_entity_id = BA.numberCast(int.class, _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("entity_id", _entity_id);Debug.locals.put("entity_id", _entity_id);
 BA.debugLineNum = 2886;BA.debugLine="Dim lastname As String = billing_address.Get(\"la";
Debug.ShouldStop(32);
_lastname = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 2887;BA.debugLine="Dim parent_id As Int = billing_address.Get(\"pare";
Debug.ShouldStop(64);
_parent_id = BA.numberCast(int.class, _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parent_id")))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 2888;BA.debugLine="Dim street As List = billing_address.Get(\"street";
Debug.ShouldStop(128);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 2889;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(256);
if (true) break;

case 22:
//for
this.state = 25;
group40 = _street;
index40 = 0;
groupLen40 = group40.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 88;
if (true) break;

case 88:
//C
this.state = 25;
if (index40 < groupLen40) {
this.state = 24;
_colstreet = BA.ObjectToString(group40.runMethod(false,"Get",index40));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 89:
//C
this.state = 88;
index40++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 24:
//C
this.state = 89;
 BA.debugLineNum = 2890;BA.debugLine="Log(\"colstreet:\" & colstreet)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","8105513020",RemoteObject.concat(RemoteObject.createImmutable("colstreet:"),_colstreet),0);
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 2892;BA.debugLine="Dim region As String = billing_address.Get(\"regi";
Debug.ShouldStop(2048);
_region = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 2893;BA.debugLine="Dim country_id As String = billing_address.Get(\"";
Debug.ShouldStop(4096);
_country_id = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 2894;BA.debugLine="Dim email As String = billing_address.Get(\"email";
Debug.ShouldStop(8192);
_email = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 2895;BA.debugLine="Dim region_code As String = billing_address.Get(";
Debug.ShouldStop(16384);
_region_code = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 2896;BA.debugLine="Dim total_paid As Double = colitems.Getdefault(\"";
Debug.ShouldStop(32768);
_total_paid = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("total_paid", _total_paid);Debug.locals.put("total_paid", _total_paid);
 BA.debugLineNum = 2897;BA.debugLine="Dim increment_id As String = colitems.Get(\"incre";
Debug.ShouldStop(65536);
_increment_id = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("increment_id")))));Debug.locals.put("increment_id", _increment_id);Debug.locals.put("increment_id", _increment_id);
 BA.debugLineNum = 2898;BA.debugLine="Dim payment As Map = colitems.Get(\"payment\")";
Debug.ShouldStop(131072);
_payment = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_payment = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment")))));Debug.locals.put("payment", _payment);Debug.locals.put("payment", _payment);
 BA.debugLineNum = 2899;BA.debugLine="Dim base_amount_ordered As Double = payment.Getd";
Debug.ShouldStop(262144);
_base_amount_ordered = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_ordered", _base_amount_ordered);Debug.locals.put("base_amount_ordered", _base_amount_ordered);
 BA.debugLineNum = 2900;BA.debugLine="Dim amount_paid As Double = payment.Getdefault(\"";
Debug.ShouldStop(524288);
_amount_paid = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("amount_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("amount_paid", _amount_paid);Debug.locals.put("amount_paid", _amount_paid);
 BA.debugLineNum = 2901;BA.debugLine="Dim method As String = payment.Get(\"method\")";
Debug.ShouldStop(1048576);
_method = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("method")))));Debug.locals.put("method", _method);Debug.locals.put("method", _method);
 BA.debugLineNum = 2902;BA.debugLine="Dim cc_last4 As String = payment.Get(\"cc_last4\")";
Debug.ShouldStop(2097152);
_cc_last4 = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cc_last4")))));Debug.locals.put("cc_last4", _cc_last4);Debug.locals.put("cc_last4", _cc_last4);
 BA.debugLineNum = 2904;BA.debugLine="Dim account_status As String = payment.Get(\"acco";
Debug.ShouldStop(8388608);
_account_status = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_status")))));Debug.locals.put("account_status", _account_status);Debug.locals.put("account_status", _account_status);
 BA.debugLineNum = 2905;BA.debugLine="Dim amount_ordered As Double = payment.Getdefaul";
Debug.ShouldStop(16777216);
_amount_ordered = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("amount_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("amount_ordered", _amount_ordered);Debug.locals.put("amount_ordered", _amount_ordered);
 BA.debugLineNum = 2906;BA.debugLine="Dim entity_id As Int = payment.Get(\"entity_id\")";
Debug.ShouldStop(33554432);
_entity_id = BA.numberCast(int.class, _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("entity_id", _entity_id);Debug.locals.put("entity_id", _entity_id);
 BA.debugLineNum = 2907;BA.debugLine="Dim base_amount_paid As Double = payment.Getdefa";
Debug.ShouldStop(67108864);
_base_amount_paid = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_paid", _base_amount_paid);Debug.locals.put("base_amount_paid", _base_amount_paid);
 BA.debugLineNum = 2908;BA.debugLine="Dim shipping_amount As Int = payment.Getdefault(";
Debug.ShouldStop(134217728);
_shipping_amount = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 2909;BA.debugLine="Dim additional_information As List = payment.Get";
Debug.ShouldStop(268435456);
_additional_information = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_additional_information = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("additional_information")))));Debug.locals.put("additional_information", _additional_information);Debug.locals.put("additional_information", _additional_information);
 BA.debugLineNum = 2910;BA.debugLine="For Each coladditional_information As String In";
Debug.ShouldStop(536870912);
if (true) break;

case 26:
//for
this.state = 29;
group60 = _additional_information;
index60 = 0;
groupLen60 = group60.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("coladditional_information", _coladditional_information);
this.state = 90;
if (true) break;

case 90:
//C
this.state = 29;
if (index60 < groupLen60) {
this.state = 28;
_coladditional_information = BA.ObjectToString(group60.runMethod(false,"Get",index60));Debug.locals.put("coladditional_information", _coladditional_information);}
if (true) break;

case 91:
//C
this.state = 90;
index60++;
Debug.locals.put("coladditional_information", _coladditional_information);
if (true) break;

case 28:
//C
this.state = 91;
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
Debug.locals.put("coladditional_information", _coladditional_information);
;
 BA.debugLineNum = 2912;BA.debugLine="Dim base_shipping_amount As Int = payment.Getdef";
Debug.ShouldStop(-2147483648);
_base_shipping_amount = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 2913;BA.debugLine="Dim parent_id As Int = payment.Get(\"parent_id\")";
Debug.ShouldStop(1);
_parent_id = BA.numberCast(int.class, _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parent_id")))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 2915;BA.debugLine="Dim state As String = colitems.Get(\"state\")";
Debug.ShouldStop(4);
_state = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("state")))));Debug.locals.put("state", _state);Debug.locals.put("state", _state);
 BA.debugLineNum = 2917;BA.debugLine="Dim base_grand_total As Double = colitems.Get(\"b";
Debug.ShouldStop(16);
_base_grand_total = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_grand_total")))));Debug.locals.put("base_grand_total", _base_grand_total);Debug.locals.put("base_grand_total", _base_grand_total);
 BA.debugLineNum = 2918;BA.debugLine="Dim billing_address_id As Int = colitems.Get(\"bi";
Debug.ShouldStop(32);
_billing_address_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("billing_address_id")))));Debug.locals.put("billing_address_id", _billing_address_id);Debug.locals.put("billing_address_id", _billing_address_id);
 BA.debugLineNum = 2919;BA.debugLine="Dim customer_lastname As String = colitems.Get(\"";
Debug.ShouldStop(64);
_customer_lastname = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_lastname")))));Debug.locals.put("customer_lastname", _customer_lastname);Debug.locals.put("customer_lastname", _customer_lastname);
 BA.debugLineNum = 2920;BA.debugLine="Dim quote_id As Int = colitems.Getdefault(\"quote";
Debug.ShouldStop(128);
_quote_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("quote_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("quote_id", _quote_id);Debug.locals.put("quote_id", _quote_id);
 BA.debugLineNum = 2921;BA.debugLine="Dim shipping_invoiced As Int = colitems.Getdefau";
Debug.ShouldStop(256);
_shipping_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_invoiced", _shipping_invoiced);Debug.locals.put("shipping_invoiced", _shipping_invoiced);
 BA.debugLineNum = 2922;BA.debugLine="Dim discount_tax_compensation_amount As Int = co";
Debug.ShouldStop(512);
_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 2923;BA.debugLine="Dim weight As Int = colitems.Getdefault(\"weight\"";
Debug.ShouldStop(1024);
_weight = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("weight"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 2924;BA.debugLine="Dim entity_id As Int = colitems.Get(\"entity_id\")";
Debug.ShouldStop(2048);
_entity_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("entity_id", _entity_id);Debug.locals.put("entity_id", _entity_id);
 BA.debugLineNum = 2925;BA.debugLine="Dim IDPedido As Int = colitems.Get(\"entity_id\")";
Debug.ShouldStop(4096);
_idpedido = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("IDPedido", _idpedido);Debug.locals.put("IDPedido", _idpedido);
 BA.debugLineNum = 2926;BA.debugLine="Dim base_total_invoiced As Double = colitems.Get";
Debug.ShouldStop(8192);
_base_total_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_total_invoiced", _base_total_invoiced);Debug.locals.put("base_total_invoiced", _base_total_invoiced);
 BA.debugLineNum = 2927;BA.debugLine="Dim base_shipping_amount As Int = colitems.Get(\"";
Debug.ShouldStop(16384);
_base_shipping_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_shipping_amount")))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 2928;BA.debugLine="Dim base_subtotal_invoiced As Int = colitems.Get";
Debug.ShouldStop(32768);
_base_subtotal_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_subtotal_invoiced", _base_subtotal_invoiced);Debug.locals.put("base_subtotal_invoiced", _base_subtotal_invoiced);
 BA.debugLineNum = 2929;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"a";
Debug.ShouldStop(65536);
_applied_rule_ids = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 2930;BA.debugLine="Dim subtotal_incl_tax As Double = colitems.Getde";
Debug.ShouldStop(131072);
_subtotal_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("subtotal_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("subtotal_incl_tax", _subtotal_incl_tax);Debug.locals.put("subtotal_incl_tax", _subtotal_incl_tax);
 BA.debugLineNum = 2931;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
Debug.ShouldStop(262144);
_base_shipping_discount_tax_compensation_amnt = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_tax_compensation_amnt"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);
 BA.debugLineNum = 2932;BA.debugLine="Dim subtotal As Int = colitems.Get(\"subtotal\")";
Debug.ShouldStop(524288);
_subtotal = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("subtotal")))));Debug.locals.put("subtotal", _subtotal);Debug.locals.put("subtotal", _subtotal);
 BA.debugLineNum = 2933;BA.debugLine="Dim base_shipping_incl_tax As Int = colitems.Get";
Debug.ShouldStop(1048576);
_base_shipping_incl_tax = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);
 BA.debugLineNum = 2934;BA.debugLine="Dim customer_email As String = colitems.Get(\"cus";
Debug.ShouldStop(2097152);
_customer_email = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_email")))));Debug.locals.put("customer_email", _customer_email);Debug.locals.put("customer_email", _customer_email);
 BA.debugLineNum = 2935;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Get";
Debug.ShouldStop(4194304);
_base_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 2936;BA.debugLine="Dim total_invoiced As Double = colitems.Getdefau";
Debug.ShouldStop(8388608);
_total_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("total_invoiced", _total_invoiced);Debug.locals.put("total_invoiced", _total_invoiced);
 BA.debugLineNum = 2937;BA.debugLine="Dim base_to_global_rate As Int = colitems.Get(\"b";
Debug.ShouldStop(16777216);
_base_to_global_rate = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_to_global_rate")))));Debug.locals.put("base_to_global_rate", _base_to_global_rate);Debug.locals.put("base_to_global_rate", _base_to_global_rate);
 BA.debugLineNum = 2938;BA.debugLine="Dim customer_is_guest As Int = colitems.Get(\"cus";
Debug.ShouldStop(33554432);
_customer_is_guest = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_is_guest")))));Debug.locals.put("customer_is_guest", _customer_is_guest);Debug.locals.put("customer_is_guest", _customer_is_guest);
 BA.debugLineNum = 2939;BA.debugLine="Dim items As List = colitems.Get(\"items\")";
Debug.ShouldStop(67108864);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 2940;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(134217728);
if (true) break;

case 30:
//for
this.state = 45;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group88 = _items;
index88 = 0;
groupLen88 = group88.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 92;
if (true) break;

case 92:
//C
this.state = 45;
if (index88 < groupLen88) {
this.state = 32;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group88.runMethod(false,"Get",index88));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 93:
//C
this.state = 92;
index88++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 2941;BA.debugLine="colitems.Put(\"po_number\",po_number)";
Debug.ShouldStop(268435456);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("po_number"))),(Object)((_po_number)));
 BA.debugLineNum = 2942;BA.debugLine="Dim tax_amount As Double = colitems.Getdefault(";
Debug.ShouldStop(536870912);
_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_amount", _tax_amount);Debug.locals.put("tax_amount", _tax_amount);
 BA.debugLineNum = 2943;BA.debugLine="Dim tax_invoiced As Double = colitems.Get(\"tax_";
Debug.ShouldStop(1073741824);
_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tax_invoiced")))));Debug.locals.put("tax_invoiced", _tax_invoiced);Debug.locals.put("tax_invoiced", _tax_invoiced);
 BA.debugLineNum = 2944;BA.debugLine="Dim original_price As Int = colitems.Get(\"origi";
Debug.ShouldStop(-2147483648);
_original_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("original_price")))));Debug.locals.put("original_price", _original_price);Debug.locals.put("original_price", _original_price);
 BA.debugLineNum = 2945;BA.debugLine="Dim free_shipping As Int = colitems.Get(\"free_s";
Debug.ShouldStop(1);
_free_shipping = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("free_shipping")))));Debug.locals.put("free_shipping", _free_shipping);Debug.locals.put("free_shipping", _free_shipping);
 BA.debugLineNum = 2946;BA.debugLine="Dim base_discount_tax_compensation_invoiced As";
Debug.ShouldStop(2);
_base_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);
 BA.debugLineNum = 2947;BA.debugLine="Dim discount_amount As Int = colitems.Getdefaul";
Debug.ShouldStop(4);
_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_amount", _discount_amount);Debug.locals.put("discount_amount", _discount_amount);
 BA.debugLineNum = 2948;BA.debugLine="Dim tax_percent As Double = colitems.Getdefault";
Debug.ShouldStop(8);
_tax_percent = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_percent"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_percent", _tax_percent);Debug.locals.put("tax_percent", _tax_percent);
 BA.debugLineNum = 2949;BA.debugLine="Dim price_incl_tax As Double = Utilidades.FixNu";
Debug.ShouldStop(16);
_price_incl_tax = parent._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)(_colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("price_incl_tax"))),(Object)(RemoteObject.createImmutable((0))))));Debug.locals.put("price_incl_tax", _price_incl_tax);Debug.locals.put("price_incl_tax", _price_incl_tax);
 BA.debugLineNum = 2950;BA.debugLine="Dim price As Int = colitems.Get(\"price\")";
Debug.ShouldStop(32);
_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("price")))));Debug.locals.put("price", _price);Debug.locals.put("price", _price);
 BA.debugLineNum = 2951;BA.debugLine="Dim product_id As Int = colitems.Getdefault(\"pr";
Debug.ShouldStop(64);
_product_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("product_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("product_id", _product_id);Debug.locals.put("product_id", _product_id);
 BA.debugLineNum = 2952;BA.debugLine="Dim base_row_total As Int = colitems.Get(\"base_";
Debug.ShouldStop(128);
_base_row_total = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total")))));Debug.locals.put("base_row_total", _base_row_total);Debug.locals.put("base_row_total", _base_row_total);
 BA.debugLineNum = 2953;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
Debug.ShouldStop(256);
_sku = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sku")))));Debug.locals.put("sku", _sku);Debug.locals.put("sku", _sku);
 BA.debugLineNum = 2954;BA.debugLine="Dim discount_tax_compensation_amount As Int = c";
Debug.ShouldStop(512);
_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 2955;BA.debugLine="Dim weight As Int = colitems.Getdefault(\"weight";
Debug.ShouldStop(1024);
_weight = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("weight"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 2956;BA.debugLine="Dim base_original_price As Int = colitems.GetDE";
Debug.ShouldStop(2048);
_base_original_price = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_original_price"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_original_price", _base_original_price);Debug.locals.put("base_original_price", _base_original_price);
 BA.debugLineNum = 2957;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_weigh";
Debug.ShouldStop(4096);
_row_weight = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_weight")))));Debug.locals.put("row_weight", _row_weight);Debug.locals.put("row_weight", _row_weight);
 BA.debugLineNum = 2958;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"";
Debug.ShouldStop(8192);
_applied_rule_ids = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 2959;BA.debugLine="Dim base_amount_refunded As Int = colitems.Get(";
Debug.ShouldStop(16384);
_base_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount_refunded")))));Debug.locals.put("base_amount_refunded", _base_amount_refunded);Debug.locals.put("base_amount_refunded", _base_amount_refunded);
 BA.debugLineNum = 2960;BA.debugLine="Dim base_price_incl_tax As Double = colitems.Ge";
Debug.ShouldStop(32768);
_base_price_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_price_incl_tax"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);
 BA.debugLineNum = 2961;BA.debugLine="Dim no_discount As Int = colitems.Get(\"no_disco";
Debug.ShouldStop(65536);
_no_discount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("no_discount")))));Debug.locals.put("no_discount", _no_discount);Debug.locals.put("no_discount", _no_discount);
 BA.debugLineNum = 2962;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
Debug.ShouldStop(131072);
_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 2963;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Ge";
Debug.ShouldStop(262144);
_base_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_invoiced")))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 2964;BA.debugLine="Dim discount_percent As Int = colitems.Getdefau";
Debug.ShouldStop(524288);
_discount_percent = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_percent"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_percent", _discount_percent);Debug.locals.put("discount_percent", _discount_percent);
 BA.debugLineNum = 2965;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id\")";
Debug.ShouldStop(1048576);
_order_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_id")))));Debug.locals.put("order_id", _order_id);Debug.locals.put("order_id", _order_id);
 BA.debugLineNum = 2966;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
Debug.ShouldStop(2097152);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 2967;BA.debugLine="Dim created_at As String = colitems.Get(\"create";
Debug.ShouldStop(4194304);
_created_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 2968;BA.debugLine="Dim qty_shipped As Int = colitems.Get(\"qty_ship";
Debug.ShouldStop(8388608);
_qty_shipped = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_shipped")))));Debug.locals.put("qty_shipped", _qty_shipped);Debug.locals.put("qty_shipped", _qty_shipped);
 BA.debugLineNum = 2969;BA.debugLine="Dim qty_ordered As Int = colitems.Get(\"qty_orde";
Debug.ShouldStop(16777216);
_qty_ordered = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_ordered")))));Debug.locals.put("qty_ordered", _qty_ordered);Debug.locals.put("qty_ordered", _qty_ordered);
 BA.debugLineNum = 2970;BA.debugLine="Dim row_total As Int = colitems.Get(\"row_total\"";
Debug.ShouldStop(33554432);
_row_total = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total")))));Debug.locals.put("row_total", _row_total);Debug.locals.put("row_total", _row_total);
 BA.debugLineNum = 2971;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_can";
Debug.ShouldStop(67108864);
_qty_canceled = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_canceled")))));Debug.locals.put("qty_canceled", _qty_canceled);Debug.locals.put("qty_canceled", _qty_canceled);
 BA.debugLineNum = 2972;BA.debugLine="Dim product_option As Map = colitems.Get(\"produ";
Debug.ShouldStop(134217728);
_product_option = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_product_option = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_option")))));Debug.locals.put("product_option", _product_option);Debug.locals.put("product_option", _product_option);
 BA.debugLineNum = 2973;BA.debugLine="Dim Talla As String";
Debug.ShouldStop(268435456);
_talla = RemoteObject.createImmutable("");Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 2974;BA.debugLine="If product_option.IsInitialized Then";
Debug.ShouldStop(536870912);
if (true) break;

case 33:
//if
this.state = 44;
if (_product_option.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 2975;BA.debugLine="Dim extension_attributes As Map = product_opti";
Debug.ShouldStop(1073741824);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _product_option.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 2976;BA.debugLine="Dim configurable_item_options As List = extens";
Debug.ShouldStop(-2147483648);
_configurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("configurable_item_options")))));Debug.locals.put("configurable_item_options", _configurable_item_options);Debug.locals.put("configurable_item_options", _configurable_item_options);
 BA.debugLineNum = 2977;BA.debugLine="For Each colconfigurable_item_options As Map I";
Debug.ShouldStop(1);
if (true) break;

case 36:
//for
this.state = 43;
_colconfigurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group125 = _configurable_item_options;
index125 = 0;
groupLen125 = group125.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
this.state = 94;
if (true) break;

case 94:
//C
this.state = 43;
if (index125 < groupLen125) {
this.state = 38;
_colconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group125.runMethod(false,"Get",index125));Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);}
if (true) break;

case 95:
//C
this.state = 94;
index125++;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 2978;BA.debugLine="Dim option_value As Int = colconfigurable_ite";
Debug.ShouldStop(2);
_option_value = BA.numberCast(int.class, _colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_value")))));Debug.locals.put("option_value", _option_value);Debug.locals.put("option_value", _option_value);
 BA.debugLineNum = 2979;BA.debugLine="Dim option_id As String = colconfigurable_ite";
Debug.ShouldStop(4);
_option_id = BA.ObjectToString(_colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_id")))));Debug.locals.put("option_id", _option_id);Debug.locals.put("option_id", _option_id);
 BA.debugLineNum = 2980;BA.debugLine="If option_id=142 Then";
Debug.ShouldStop(8);
if (true) break;

case 39:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_option_id,BA.NumberToString(142))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 2981;BA.debugLine="Talla=mSQL.ExecQuerySingleResult2(\"select la";
Debug.ShouldStop(16);
_talla = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select label from tblB2BAtributoSizeProducts where value=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_option_value)})))));Debug.locals.put("Talla", _talla);
 if (true) break;

case 42:
//C
this.state = 95;
;
 if (true) break;
if (true) break;

case 43:
//C
this.state = 44;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
;
 if (true) break;

case 44:
//C
this.state = 93;
;
 BA.debugLineNum = 2985;BA.debugLine="colitems.Put(\"Talla\",Talla)";
Debug.ShouldStop(256);
_colitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Talla"))),(Object)((_talla)));
 BA.debugLineNum = 2986;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"amou";
Debug.ShouldStop(512);
_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount_refunded")))));Debug.locals.put("amount_refunded", _amount_refunded);Debug.locals.put("amount_refunded", _amount_refunded);
 BA.debugLineNum = 2987;BA.debugLine="Dim updated_at As String = colitems.Get(\"update";
Debug.ShouldStop(1024);
_updated_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 2988;BA.debugLine="Dim base_price As Int = colitems.Get(\"base_pric";
Debug.ShouldStop(2048);
_base_price = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_price")))));Debug.locals.put("base_price", _base_price);Debug.locals.put("base_price", _base_price);
 BA.debugLineNum = 2989;BA.debugLine="Dim qty_invoiced As Int = colitems.Get(\"qty_inv";
Debug.ShouldStop(4096);
_qty_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_invoiced")))));Debug.locals.put("qty_invoiced", _qty_invoiced);Debug.locals.put("qty_invoiced", _qty_invoiced);
 BA.debugLineNum = 2990;BA.debugLine="Dim row_invoiced As Int = colitems.Get(\"row_inv";
Debug.ShouldStop(8192);
_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_invoiced")))));Debug.locals.put("row_invoiced", _row_invoiced);Debug.locals.put("row_invoiced", _row_invoiced);
 BA.debugLineNum = 2991;BA.debugLine="Dim row_total_incl_tax As Double = colitems.Get";
Debug.ShouldStop(16384);
_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total_incl_tax")))));Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);
 BA.debugLineNum = 2992;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"b";
Debug.ShouldStop(32768);
_base_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_amount")))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 2993;BA.debugLine="Dim store_id As Int = colitems.Getdefault(\"stor";
Debug.ShouldStop(65536);
_store_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 2994;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
Debug.ShouldStop(131072);
_item_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_id")))));Debug.locals.put("item_id", _item_id);Debug.locals.put("item_id", _item_id);
 BA.debugLineNum = 2995;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(";
Debug.ShouldStop(262144);
_base_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_amount")))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 2996;BA.debugLine="Dim base_row_total_incl_tax As Double = colitem";
Debug.ShouldStop(524288);
_base_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total_incl_tax")))));Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);
 BA.debugLineNum = 2997;BA.debugLine="Dim base_discount_tax_compensation_amount As In";
Debug.ShouldStop(1048576);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 2998;BA.debugLine="Dim product_type As String = colitems.Get(\"prod";
Debug.ShouldStop(2097152);
_product_type = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_type")))));Debug.locals.put("product_type", _product_type);Debug.locals.put("product_type", _product_type);
 BA.debugLineNum = 2999;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_ref";
Debug.ShouldStop(4194304);
_qty_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_refunded")))));Debug.locals.put("qty_refunded", _qty_refunded);Debug.locals.put("qty_refunded", _qty_refunded);
 BA.debugLineNum = 3000;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(\"ba";
Debug.ShouldStop(8388608);
_base_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_invoiced")))));Debug.locals.put("base_row_invoiced", _base_row_invoiced);Debug.locals.put("base_row_invoiced", _base_row_invoiced);
 BA.debugLineNum = 3001;BA.debugLine="Dim is_qty_decimal As Int = colitems.Getdefault";
Debug.ShouldStop(16777216);
_is_qty_decimal = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_qty_decimal"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("is_qty_decimal", _is_qty_decimal);Debug.locals.put("is_qty_decimal", _is_qty_decimal);
 BA.debugLineNum = 3002;BA.debugLine="Dim discount_invoiced As Int = colitems.Get(\"di";
Debug.ShouldStop(33554432);
_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_invoiced")))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 3003;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Get(";
Debug.ShouldStop(67108864);
_base_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_invoiced")))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 3005;BA.debugLine="Dim global_currency_code As String = colitems.Ge";
Debug.ShouldStop(268435456);
_global_currency_code = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("global_currency_code")))));Debug.locals.put("global_currency_code", _global_currency_code);Debug.locals.put("global_currency_code", _global_currency_code);
 BA.debugLineNum = 3006;BA.debugLine="Dim status As String = colitems.Get(\"status\")";
Debug.ShouldStop(536870912);
_status = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 3007;BA.debugLine="Dim is_virtual As Int = colitems.Getdefault(\"is_";
Debug.ShouldStop(1073741824);
_is_virtual = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_virtual"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("is_virtual", _is_virtual);Debug.locals.put("is_virtual", _is_virtual);
 BA.debugLineNum = 3008;BA.debugLine="Dim base_total_invoiced_cost As Int = colitems.G";
Debug.ShouldStop(-2147483648);
_base_total_invoiced_cost = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_invoiced_cost"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_total_invoiced_cost", _base_total_invoiced_cost);Debug.locals.put("base_total_invoiced_cost", _base_total_invoiced_cost);
 BA.debugLineNum = 3009;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
Debug.ShouldStop(1);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 3010;BA.debugLine="Dim status_histories As List = colitems.Get(\"sta";
Debug.ShouldStop(2);
_status_histories = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_status_histories = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_histories")))));Debug.locals.put("status_histories", _status_histories);Debug.locals.put("status_histories", _status_histories);
 BA.debugLineNum = 3011;BA.debugLine="Dim store_currency_code As String = colitems.Get";
Debug.ShouldStop(4);
_store_currency_code = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_currency_code")))));Debug.locals.put("store_currency_code", _store_currency_code);Debug.locals.put("store_currency_code", _store_currency_code);
 BA.debugLineNum = 3012;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
Debug.ShouldStop(8);
_created_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 3013;BA.debugLine="Dim total_item_count As Int = colitems.Getdefaul";
Debug.ShouldStop(16);
_total_item_count = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_item_count"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("total_item_count", _total_item_count);Debug.locals.put("total_item_count", _total_item_count);
 BA.debugLineNum = 3014;BA.debugLine="Dim shipping_tax_amount As Int = colitems.Getdef";
Debug.ShouldStop(32);
_shipping_tax_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_tax_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);
 BA.debugLineNum = 3015;BA.debugLine="Dim store_to_base_rate As Int = colitems.Getdefa";
Debug.ShouldStop(64);
_store_to_base_rate = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_to_base_rate"))),(Object)(RemoteObject.createImmutable((1)))));Debug.locals.put("store_to_base_rate", _store_to_base_rate);Debug.locals.put("store_to_base_rate", _store_to_base_rate);
 BA.debugLineNum = 3016;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
Debug.ShouldStop(128);
_updated_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 3017;BA.debugLine="Dim base_shipping_discount_amount As Int = colit";
Debug.ShouldStop(256);
_base_shipping_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);
 BA.debugLineNum = 3018;BA.debugLine="Dim store_name As String = colitems.Get(\"store_n";
Debug.ShouldStop(512);
_store_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_name")))));Debug.locals.put("store_name", _store_name);Debug.locals.put("store_name", _store_name);
 BA.debugLineNum = 3019;BA.debugLine="Dim grand_total As Double = colitems.Getdefault(";
Debug.ShouldStop(1024);
_grand_total = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("grand_total"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("grand_total", _grand_total);Debug.locals.put("grand_total", _grand_total);
 BA.debugLineNum = 3020;BA.debugLine="Dim base_currency_code As String = colitems.Get(";
Debug.ShouldStop(2048);
_base_currency_code = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_currency_code")))));Debug.locals.put("base_currency_code", _base_currency_code);Debug.locals.put("base_currency_code", _base_currency_code);
 BA.debugLineNum = 3021;BA.debugLine="Dim base_total_paid As Double = colitems.Getdefa";
Debug.ShouldStop(4096);
_base_total_paid = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_paid"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_total_paid", _base_total_paid);Debug.locals.put("base_total_paid", _base_total_paid);
 BA.debugLineNum = 3022;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"ba";
Debug.ShouldStop(8192);
_base_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_amount")))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 3023;BA.debugLine="Dim store_id As Int = colitems.Getdefault(\"store";
Debug.ShouldStop(16384);
_store_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 3024;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
Debug.ShouldStop(32768);
_shipping_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);
 BA.debugLineNum = 3025;BA.debugLine="Dim total_due As Int = colitems.Getdefault(\"tota";
Debug.ShouldStop(65536);
_total_due = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_due"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("total_due", _total_due);Debug.locals.put("total_due", _total_due);
 BA.debugLineNum = 3026;BA.debugLine="Dim total_qty_ordered As Int = colitems.Getdefau";
Debug.ShouldStop(131072);
_total_qty_ordered = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_qty_ordered"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("total_qty_ordered", _total_qty_ordered);Debug.locals.put("total_qty_ordered", _total_qty_ordered);
 BA.debugLineNum = 3027;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(\"";
Debug.ShouldStop(262144);
_base_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_amount")))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 3028;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
Debug.ShouldStop(524288);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 3029;BA.debugLine="If extension_attributes.IsInitialized Then";
Debug.ShouldStop(1048576);
if (true) break;

case 46:
//if
this.state = 81;
if (_extension_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 3030;BA.debugLine="Dim shipping_assignments As List = extension_at";
Debug.ShouldStop(2097152);
_shipping_assignments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_shipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_assignments")))));Debug.locals.put("shipping_assignments", _shipping_assignments);Debug.locals.put("shipping_assignments", _shipping_assignments);
 BA.debugLineNum = 3031;BA.debugLine="If shipping_assignments.IsInitialized Then";
Debug.ShouldStop(4194304);
if (true) break;

case 49:
//if
this.state = 52;
if (_shipping_assignments.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 if (true) break;

case 52:
//C
this.state = 53;
;
 BA.debugLineNum = 3128;BA.debugLine="Dim payment_additional_info As List = extension";
Debug.ShouldStop(8388608);
_payment_additional_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_payment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment_additional_info")))));Debug.locals.put("payment_additional_info", _payment_additional_info);Debug.locals.put("payment_additional_info", _payment_additional_info);
 BA.debugLineNum = 3129;BA.debugLine="If payment_additional_info.IsInitialized Then";
Debug.ShouldStop(16777216);
if (true) break;

case 53:
//if
this.state = 60;
if (_payment_additional_info.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 55;
}if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 3130;BA.debugLine="For Each colpayment_additional_info As Map In";
Debug.ShouldStop(33554432);
if (true) break;

case 56:
//for
this.state = 59;
_colpayment_additional_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group183 = _payment_additional_info;
index183 = 0;
groupLen183 = group183.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
this.state = 96;
if (true) break;

case 96:
//C
this.state = 59;
if (index183 < groupLen183) {
this.state = 58;
_colpayment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group183.runMethod(false,"Get",index183));Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);}
if (true) break;

case 97:
//C
this.state = 96;
index183++;
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
if (true) break;

case 58:
//C
this.state = 97;
 BA.debugLineNum = 3131;BA.debugLine="Dim value As String = colpayment_additional_i";
Debug.ShouldStop(67108864);
_value = BA.ObjectToString(_colpayment_additional_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 3132;BA.debugLine="Dim key As String = colpayment_additional_inf";
Debug.ShouldStop(134217728);
_key = BA.ObjectToString(_colpayment_additional_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("key")))));Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 if (true) break;
if (true) break;

case 59:
//C
this.state = 60;
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
;
 if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 3135;BA.debugLine="Dim applied_taxes As List = extension_attribute";
Debug.ShouldStop(1073741824);
_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_taxes")))));Debug.locals.put("applied_taxes", _applied_taxes);Debug.locals.put("applied_taxes", _applied_taxes);
 BA.debugLineNum = 3136;BA.debugLine="If applied_taxes.IsInitialized Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 61:
//if
this.state = 68;
if (_applied_taxes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 3137;BA.debugLine="For Each colapplied_taxes As Map In applied_ta";
Debug.ShouldStop(1);
if (true) break;

case 64:
//for
this.state = 67;
_colapplied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group190 = _applied_taxes;
index190 = 0;
groupLen190 = group190.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
this.state = 98;
if (true) break;

case 98:
//C
this.state = 67;
if (index190 < groupLen190) {
this.state = 66;
_colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group190.runMethod(false,"Get",index190));Debug.locals.put("colapplied_taxes", _colapplied_taxes);}
if (true) break;

case 99:
//C
this.state = 98;
index190++;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
if (true) break;

case 66:
//C
this.state = 99;
 BA.debugLineNum = 3138;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"";
Debug.ShouldStop(2);
_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount")))));Debug.locals.put("amount", _amount);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 3139;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"co";
Debug.ShouldStop(4);
_code = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 3140;BA.debugLine="Dim base_amount As Double = colapplied_taxes.";
Debug.ShouldStop(8);
_base_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount")))));Debug.locals.put("base_amount", _base_amount);Debug.locals.put("base_amount", _base_amount);
 BA.debugLineNum = 3141;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"t";
Debug.ShouldStop(16);
_title = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 3142;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(";
Debug.ShouldStop(32);
_percent = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("percent")))));Debug.locals.put("percent", _percent);Debug.locals.put("percent", _percent);
 if (true) break;
if (true) break;

case 67:
//C
this.state = 68;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
;
 if (true) break;

case 68:
//C
this.state = 69;
;
 BA.debugLineNum = 3145;BA.debugLine="Dim item_applied_taxes As List = extension_attr";
Debug.ShouldStop(256);
_item_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_item_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_applied_taxes")))));Debug.locals.put("item_applied_taxes", _item_applied_taxes);Debug.locals.put("item_applied_taxes", _item_applied_taxes);
 BA.debugLineNum = 3146;BA.debugLine="If item_applied_taxes.IsInitialized Then";
Debug.ShouldStop(512);
if (true) break;

case 69:
//if
this.state = 80;
if (_item_applied_taxes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 71;
}if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 3147;BA.debugLine="For Each colitem_applied_taxes As Map In item_";
Debug.ShouldStop(1024);
if (true) break;

case 72:
//for
this.state = 79;
_colitem_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group200 = _item_applied_taxes;
index200 = 0;
groupLen200 = group200.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
this.state = 100;
if (true) break;

case 100:
//C
this.state = 79;
if (index200 < groupLen200) {
this.state = 74;
_colitem_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group200.runMethod(false,"Get",index200));Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);}
if (true) break;

case 101:
//C
this.state = 100;
index200++;
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 3148;BA.debugLine="Dim applied_taxes As List = colitem_applied_t";
Debug.ShouldStop(2048);
_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitem_applied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_taxes")))));Debug.locals.put("applied_taxes", _applied_taxes);Debug.locals.put("applied_taxes", _applied_taxes);
 BA.debugLineNum = 3149;BA.debugLine="For Each colapplied_taxes As Map In applied_t";
Debug.ShouldStop(4096);
if (true) break;

case 75:
//for
this.state = 78;
_colapplied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group202 = _applied_taxes;
index202 = 0;
groupLen202 = group202.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
this.state = 102;
if (true) break;

case 102:
//C
this.state = 78;
if (index202 < groupLen202) {
this.state = 77;
_colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group202.runMethod(false,"Get",index202));Debug.locals.put("colapplied_taxes", _colapplied_taxes);}
if (true) break;

case 103:
//C
this.state = 102;
index202++;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
if (true) break;

case 77:
//C
this.state = 103;
 BA.debugLineNum = 3150;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(";
Debug.ShouldStop(8192);
_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount")))));Debug.locals.put("amount", _amount);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 3151;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"c";
Debug.ShouldStop(16384);
_code = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 3152;BA.debugLine="Dim base_amount As Double = colapplied_taxes";
Debug.ShouldStop(32768);
_base_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount")))));Debug.locals.put("base_amount", _base_amount);Debug.locals.put("base_amount", _base_amount);
 BA.debugLineNum = 3153;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"";
Debug.ShouldStop(65536);
_title = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 3154;BA.debugLine="Dim percent As Double = colapplied_taxes.Get";
Debug.ShouldStop(131072);
_percent = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("percent")))));Debug.locals.put("percent", _percent);Debug.locals.put("percent", _percent);
 if (true) break;
if (true) break;

case 78:
//C
this.state = 101;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
;
 BA.debugLineNum = 3156;BA.debugLine="Dim Type As String = colitem_applied_taxes.Ge";
Debug.ShouldStop(524288);
_type = BA.ObjectToString(_colitem_applied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Type", _type);Debug.locals.put("Type", _type);
 if (true) break;
if (true) break;

case 79:
//C
this.state = 80;
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
;
 if (true) break;

case 80:
//C
this.state = 81;
;
 BA.debugLineNum = 3159;BA.debugLine="Dim converting_from_quote As String = extension";
Debug.ShouldStop(4194304);
_converting_from_quote = BA.ObjectToString(_extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("converting_from_quote")))));Debug.locals.put("converting_from_quote", _converting_from_quote);Debug.locals.put("converting_from_quote", _converting_from_quote);
 BA.debugLineNum = 3161;BA.debugLine="Dim pgw As Map=extension_attributes.Get(\"pgw\")";
Debug.ShouldStop(16777216);
_pgw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_pgw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pgw")))));Debug.locals.put("pgw", _pgw);Debug.locals.put("pgw", _pgw);
 if (true) break;

case 81:
//C
this.state = 87;
;
 BA.debugLineNum = 3164;BA.debugLine="Dim shipping_description As String = colitems.Ge";
Debug.ShouldStop(134217728);
_shipping_description = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_description")))));Debug.locals.put("shipping_description", _shipping_description);Debug.locals.put("shipping_description", _shipping_description);
 BA.debugLineNum = 3165;BA.debugLine="Dim store_to_order_rate As Int = colitems.Getdef";
Debug.ShouldStop(268435456);
_store_to_order_rate = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_to_order_rate"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("store_to_order_rate", _store_to_order_rate);Debug.locals.put("store_to_order_rate", _store_to_order_rate);
 BA.debugLineNum = 3166;BA.debugLine="Dim shipping_amount As Int = colitems.Getdefault";
Debug.ShouldStop(536870912);
_shipping_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 3167;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
Debug.ShouldStop(1073741824);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 3168;BA.debugLine="Dim subtotal_invoiced As Int = colitems.Getdefau";
Debug.ShouldStop(-2147483648);
_subtotal_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("subtotal_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("subtotal_invoiced", _subtotal_invoiced);Debug.locals.put("subtotal_invoiced", _subtotal_invoiced);
 BA.debugLineNum = 3169;BA.debugLine="Dim base_to_order_rate As Int = colitems.Getdefa";
Debug.ShouldStop(1);
_base_to_order_rate = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_to_order_rate"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_to_order_rate", _base_to_order_rate);Debug.locals.put("base_to_order_rate", _base_to_order_rate);
 BA.debugLineNum = 3170;BA.debugLine="Dim base_subtotal As Int = colitems.Getdefault(\"";
Debug.ShouldStop(2);
_base_subtotal = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_subtotal", _base_subtotal);Debug.locals.put("base_subtotal", _base_subtotal);
 BA.debugLineNum = 3171;BA.debugLine="Dim protect_code As String = colitems.Get(\"prote";
Debug.ShouldStop(4);
_protect_code = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("protect_code")))));Debug.locals.put("protect_code", _protect_code);Debug.locals.put("protect_code", _protect_code);
 BA.debugLineNum = 3172;BA.debugLine="Dim customer_dob As String = colitems.Get(\"custo";
Debug.ShouldStop(8);
_customer_dob = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_dob")))));Debug.locals.put("customer_dob", _customer_dob);Debug.locals.put("customer_dob", _customer_dob);
 BA.debugLineNum = 3173;BA.debugLine="Dim base_total_due As Int = colitems.Getdefault(";
Debug.ShouldStop(16);
_base_total_due = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_due"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_total_due", _base_total_due);Debug.locals.put("base_total_due", _base_total_due);
 BA.debugLineNum = 3174;BA.debugLine="Dim base_subtotal_incl_tax As Double = colitems.";
Debug.ShouldStop(32);
_base_subtotal_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal_incl_tax"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_subtotal_incl_tax", _base_subtotal_incl_tax);Debug.locals.put("base_subtotal_incl_tax", _base_subtotal_incl_tax);
 BA.debugLineNum = 3175;BA.debugLine="Dim customer_id As Int = colitems.Getdefault(\"cu";
Debug.ShouldStop(64);
_customer_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_id", _customer_id);Debug.locals.put("customer_id", _customer_id);
 BA.debugLineNum = 3176;BA.debugLine="Dim customer_group_id As Int = colitems.Getdefau";
Debug.ShouldStop(128);
_customer_group_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_group_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_group_id", _customer_group_id);Debug.locals.put("customer_group_id", _customer_group_id);
 BA.debugLineNum = 3177;BA.debugLine="Dim discount_invoiced As Int = colitems.Getdefau";
Debug.ShouldStop(256);
_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 3178;BA.debugLine="Dim order_currency_code As String = colitems.Get";
Debug.ShouldStop(512);
_order_currency_code = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_currency_code")))));Debug.locals.put("order_currency_code", _order_currency_code);Debug.locals.put("order_currency_code", _order_currency_code);
 BA.debugLineNum = 3179;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Getde";
Debug.ShouldStop(1024);
_base_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_tax_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 BA.debugLineNum = 3180;BA.debugLine="Dim customer_gender As Int = colitems.Getdefault";
Debug.ShouldStop(2048);
_customer_gender = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_gender"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("customer_gender", _customer_gender);Debug.locals.put("customer_gender", _customer_gender);
 BA.debugLineNum = 3181;BA.debugLine="Dim shipping_incl_tax As Int = colitems.Getdefau";
Debug.ShouldStop(4096);
_shipping_incl_tax = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);
 BA.debugLineNum = 3182;BA.debugLine="Dim base_shipping_invoiced As Int = colitems.Get";
Debug.ShouldStop(8192);
_base_shipping_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);
 BA.debugLineNum = 3186;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mS";
Debug.ShouldStop(131072);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblB2BOrders")),(Object)(_items));
 if (true) break;
if (true) break;

case 82:
//C
this.state = -1;
Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 3189;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
Debug.ShouldStop(1048576);
_search_criteria = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_search_criteria = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("search_criteria")))));Debug.locals.put("search_criteria", _search_criteria);Debug.locals.put("search_criteria", _search_criteria);
 BA.debugLineNum = 3190;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
Debug.ShouldStop(2097152);
_filter_groups = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filter_groups = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _search_criteria.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filter_groups")))));Debug.locals.put("filter_groups", _filter_groups);Debug.locals.put("filter_groups", _filter_groups);
 BA.debugLineNum = 3191;BA.debugLine="Dim page_size As Int = search_criteria.Get(\"page_";
Debug.ShouldStop(4194304);
_page_size = BA.numberCast(int.class, _search_criteria.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("page_size")))));Debug.locals.put("page_size", _page_size);Debug.locals.put("page_size", _page_size);
 BA.debugLineNum = 3196;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 3197;BA.debugLine="End Sub";
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
public static RemoteObject  _cargavaloresatributosizeproductos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaValoresAtributoSizeProductos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2581);
if (RapidSub.canDelegate("cargavaloresatributosizeproductos")) { return __ref.runUserSub(false, "ctestsinfomagento","cargavaloresatributosizeproductos", __ref);}
ResumableSub_CargaValoresAtributoSizeProductos rsub = new ResumableSub_CargaValoresAtributoSizeProductos(null,__ref);
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
public static class ResumableSub_CargaValoresAtributoSizeProductos extends BA.ResumableSub {
public ResumableSub_CargaValoresAtributoSizeProductos(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaValoresAtributoSizeProductos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2581);
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
 BA.debugLineNum = 2582;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BAtributoSize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BAtributoSizeProducts")));
 BA.debugLineNum = 2583;BA.debugLine="wait for(EnvioDatosAPIMagentoValoresAtributoSizeP";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargavaloresatributosizeproductos"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_enviodatosapimagentovaloresatributosizeproductos" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tk" /*RemoteObject*/ ))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 2584;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2585;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2586;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "cargavaloresatributosizeproductos"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Valores atributo size (talla) B2B"))));
this.state = 6;
return;
case 6:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 2587;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 2590;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(536870912);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 2591;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(1073741824);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 2592;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(-2147483648);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 2600;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
Debug.ShouldStop(128);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblB2BAtributoSizeProducts")),(Object)(_root));
 BA.debugLineNum = 2601;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2602;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
ctestsinfomagento._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",ctestsinfomagento._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
ctestsinfomagento._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",ctestsinfomagento._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private frm As Form";
ctestsinfomagento._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",ctestsinfomagento._frm);
 //BA.debugLineNum = 9;BA.debugLine="Private btnSalir As B4XView";
ctestsinfomagento._btnsalir = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnsalir",ctestsinfomagento._btnsalir);
 //BA.debugLineNum = 10;BA.debugLine="Private jamTableView1 As jamTableView";
ctestsinfomagento._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",ctestsinfomagento._jamtableview1);
 //BA.debugLineNum = 12;BA.debugLine="Dim Dialog As B4XDialog";
ctestsinfomagento._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",ctestsinfomagento._dialog);
 //BA.debugLineNum = 13;BA.debugLine="Dim JamLoadingIndicator1 As JamLoadingIndicator";
ctestsinfomagento._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",ctestsinfomagento._jamloadingindicator1);
 //BA.debugLineNum = 15;BA.debugLine="Private FlexGridDialog As FlexGrid";
ctestsinfomagento._flexgriddialog = RemoteObject.createNew ("b4j.example.flexgrid");__ref.setField("_flexgriddialog",ctestsinfomagento._flexgriddialog);
 //BA.debugLineNum = 16;BA.debugLine="Private MeasurementCanvas As B4XCanvas";
ctestsinfomagento._measurementcanvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_measurementcanvas",ctestsinfomagento._measurementcanvas);
 //BA.debugLineNum = 18;BA.debugLine="Dim mSQL As SQL";
ctestsinfomagento._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",ctestsinfomagento._msql);
 //BA.debugLineNum = 20;BA.debugLine="Public PermisoModuloUsuario As String";
ctestsinfomagento._permisomodulousuario = RemoteObject.createImmutable("");__ref.setField("_permisomodulousuario",ctestsinfomagento._permisomodulousuario);
 //BA.debugLineNum = 25;BA.debugLine="Private tk As  String";
ctestsinfomagento._tk = RemoteObject.createImmutable("");__ref.setField("_tk",ctestsinfomagento._tk);
 //BA.debugLineNum = 27;BA.debugLine="Private B4XComboBoxTablasB2B As B4XComboBox";
ctestsinfomagento._b4xcomboboxtablasb2b = RemoteObject.createNew ("b4j.docU.b4xcombobox");__ref.setField("_b4xcomboboxtablasb2b",ctestsinfomagento._b4xcomboboxtablasb2b);
 //BA.debugLineNum = 28;BA.debugLine="Private B4XComboBoxStores As B4XComboBox";
ctestsinfomagento._b4xcomboboxstores = RemoteObject.createNew ("b4j.docU.b4xcombobox");__ref.setField("_b4xcomboboxstores",ctestsinfomagento._b4xcomboboxstores);
 //BA.debugLineNum = 29;BA.debugLine="Private TextAreaHTTPResponse As TextArea";
ctestsinfomagento._textareahttpresponse = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_textareahttpresponse",ctestsinfomagento._textareahttpresponse);
 //BA.debugLineNum = 30;BA.debugLine="Private SplitPane1 As SplitPane";
ctestsinfomagento._splitpane1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SplitPaneWrapper");__ref.setField("_splitpane1",ctestsinfomagento._splitpane1);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "ctestsinfomagento","creaciontablassqlite", __ref);}
RemoteObject _screartabla = RemoteObject.createImmutable("");
 BA.debugLineNum = 198;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(32);
 BA.debugLineNum = 200;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BSto";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BStores")));
 BA.debugLineNum = 201;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE tblB2BSt";
Debug.ShouldStop(256);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE tblB2BStores (\n"),RemoteObject.createImmutable("	code TEXT,default_store_id INTEGER , name TEXT, root_category_id INT, id INTEGER, website_id INTEGER\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 204;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 206;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BGru";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BGruposCliente")));
 BA.debugLineNum = 207;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE tblB2BGr";
Debug.ShouldStop(16384);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE tblB2BGruposCliente (\n"),RemoteObject.createImmutable("	code TEXT,tax_class_id INTEGER , id INTEGER, tax_class_name TEXT\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 210;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 212;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BCli";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BClientes")));
 BA.debugLineNum = 213;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
Debug.ShouldStop(1048576);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS [tblB2BClientes] ([store_id] INTEGER, [firstname] TEXT\n"),RemoteObject.createImmutable("	, [addresses] TEXT, [created_at] TEXT, [extension_attributes] TEXT, [default_shipping] INTEGER default 0, [lastname] TEXT, gender INTEGER default 0, dob INTEGER default 0\n"),RemoteObject.createImmutable("	, [custom_attributes] TEXT, [updated_at] TEXT, [disable_auto_group_change] INTEGER, [group_id] INTEGER, [id] INTEGER\n"),RemoteObject.createImmutable("	, [default_billing] INTEGER default 0, [website_id] INTEGER, [email] TEXT PRIMARY KEY, [created_in] TEXT, [is_blocked] INTEGER default 0\n"),RemoteObject.createImmutable("	, [is_commercial] INTEGER default 0, [company] TEXT default '', [code] TEXT default '', [customer_group_code] TEXT default '', [customer_group_name] TEXT default ''\n"),RemoteObject.createImmutable("	, [language] TEXT default '', [country_id] TEXT '')")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 219;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 221;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BPro";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BProductos")));
 BA.debugLineNum = 222;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(536870912);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BProductos] ([visibility] INTEGER, [type_id] TEXT, [created_at] TEXT\n"),RemoteObject.createImmutable("	, [extension_attributes] TEXT, [tier_prices] TEXT, [custom_attributes] TEXT, IDTalla INTEGER default -1, Talla TEXT default '', UnidadMedida TEXT default ''\n"),RemoteObject.createImmutable("	, [attribute_set_id] INTEGER, [updated_at] TEXT, [price] INTEGER default 0\n"),RemoteObject.createImmutable("	, [media_gallery_entries] TEXT, [name] TEXT, [options] TEXT, [id] INTEGER, [sku] TEXT PRIMARY KEY, [product_links] TEXT, [status] INTEGER, weight INTEGER default 0\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 227;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 229;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BDir";
Debug.ShouldStop(16);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BDireccionesCliente")));
 BA.debugLineNum = 230;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(32);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BDireccionesCliente] ([firstname] TEXT,[lastname] TEXT, [city] TEXT\n"),RemoteObject.createImmutable("	, customer_code TEXT defalut'' , code TEXT default'', [region_id] INTEGER\n"),RemoteObject.createImmutable("	, [postcode] TEXT, [telephone] INTEGER, [default_shipping] TEXT default '', [default_billing] TEXT default '',[custom_attributes] TEXT\n"),RemoteObject.createImmutable("	, [street] TEXT default '', [street1] TEXT default '', [street2] TEXT default '', [street3] TEXT default '', [company] TEXT\n"),RemoteObject.createImmutable("	, [id] INTEGER, [customer_id] INTEGER, [region] TEXT, [country_id] TEXT)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 235;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(1024);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 238;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BAtr";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BAtributoSizeProducts")));
 BA.debugLineNum = 239;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(16384);
_screartabla = (RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BAtributoSizeProducts] ([label] TEXT, [value] INTEGER)"));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 240;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 242;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BAtr";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BAtributoUnidadMedidaProductos")));
 BA.debugLineNum = 243;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(262144);
_screartabla = (RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BAtributoUnidadMedidaProductos] ([label] TEXT, [value] INTEGER)"));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 244;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 259;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BOrd";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BOrders")));
 BA.debugLineNum = 260;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(8);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BOrders] ([order_id] INTEGER,  [created_at] TEXT, [store_id] INTEGER default 0\n"),RemoteObject.createImmutable("	, [po_number] TEXT default ''\n"),RemoteObject.createImmutable("	, [item_id] INTEGER,[product_id] INTEGER default 0, [sku] TEXT, [name] TEXT, [Talla] TEXT DEFAULT '', parent_id TEXT default ''\n"),RemoteObject.createImmutable("	,[original_price] INTEGER default 0\n"),RemoteObject.createImmutable("	, [free_shipping] INTEGER default 0, [discount_amount] REAL default 0, [tax_percent] REAL default 0\n"),RemoteObject.createImmutable("	, [price] REAL default 0, [base_row_total] REAL\n"),RemoteObject.createImmutable("	,  [base_original_price] REAL default 0\n"),RemoteObject.createImmutable("	, [qty_shipped] INTEGER, [qty_ordered] INTEGER\n"),RemoteObject.createImmutable("	, [row_total] REAL, [qty_canceled] INTEGER, [product_option] TEXT, [updated_at] TEXT, [base_price] REAL\n"),RemoteObject.createImmutable("	, [qty_invoiced] INTEGER, [row_invoiced] INTEGER\n"),RemoteObject.createImmutable("	,  [product_type] TEXT\n"),RemoteObject.createImmutable("	, [qty_refunded] INTEGER, [base_row_invoiced] INTEGER, [is_qty_decimal] INTEGER default 0)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 272;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 274;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BCat";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BCategoriasProductos")));
 BA.debugLineNum = 275;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(262144);
_screartabla = (RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BCategoriasProductos] ([label] TEXT, [value] INTEGER)"));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 276;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enviodatosapimagentobusquedaclientes(RemoteObject __ref,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaClientes (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,938);
if (RapidSub.canDelegate("enviodatosapimagentobusquedaclientes")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentobusquedaclientes", __ref, _token);}
ResumableSub_EnvioDatosAPIMagentoBusquedaClientes rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaClientes(null,__ref,_token);
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
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaClientes extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaClientes(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaClientes (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,938);
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
Debug.locals.put("Token", _token);
 BA.debugLineNum = 940;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(2048);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 941;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(4096);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 946;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(131072);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/customers/search?\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][field]=firstname&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][value]=%&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][condition_type]=like")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 951;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(4194304);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 953;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(16777216);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 954;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 956;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(134217728);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 958;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentobusquedaclientes"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 960;BA.debugLine="If j.Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 961;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","8103874583",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 962;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","8103874584",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 963;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(4);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 964;BA.debugLine="j.Release";
Debug.ShouldStop(8);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 965;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 968;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(128);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 969;BA.debugLine="j.Release";
Debug.ShouldStop(256);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 970;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 972;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _enviodatosapimagentobusquedadirecciondefectoenviocliente(RemoteObject __ref,RemoteObject _token,RemoteObject _idclientesel) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2305);
if (RapidSub.canDelegate("enviodatosapimagentobusquedadirecciondefectoenviocliente")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentobusquedadirecciondefectoenviocliente", __ref, _token, _idclientesel);}
ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente(null,__ref,_token,_idclientesel);
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
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token,RemoteObject _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idclientesel = _idclientesel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _idclientesel;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2305);
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
Debug.locals.put("Token", _token);
Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 2307;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(4);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 2308;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(8);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 2310;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(32);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/customers/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idclientesel))),RemoteObject.createImmutable("/shippingAddress")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 2312;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(128);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 2314;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(512);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2315;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(1024);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 2317;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(4096);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 2319;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentobusquedadirecciondefectoenviocliente"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 2321;BA.debugLine="If j.Success Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2322;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","8104923153",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 2323;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","8104923154",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2324;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(524288);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 2325;BA.debugLine="j.Release";
Debug.ShouldStop(1048576);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2326;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2329;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(16777216);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 2330;BA.debugLine="j.Release";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2331;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2333;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentobusquedadirecciondefectofacturacioncliente(RemoteObject __ref,RemoteObject _token,RemoteObject _idclientesel) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2447);
if (RapidSub.canDelegate("enviodatosapimagentobusquedadirecciondefectofacturacioncliente")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentobusquedadirecciondefectofacturacioncliente", __ref, _token, _idclientesel);}
ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente(null,__ref,_token,_idclientesel);
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
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token,RemoteObject _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idclientesel = _idclientesel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _idclientesel;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2447);
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
Debug.locals.put("Token", _token);
Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 2449;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(65536);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 2450;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(131072);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 2452;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(524288);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/customers/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idclientesel))),RemoteObject.createImmutable("/billingAddress")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 2454;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(2097152);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 2456;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(8388608);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2457;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(16777216);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 2459;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(67108864);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 2461;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentobusquedadirecciondefectofacturacioncliente"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 2463;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2464;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","8105119761",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 2465;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","8105119762",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2466;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(2);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 2467;BA.debugLine="j.Release";
Debug.ShouldStop(4);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2468;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2471;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(64);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 2472;BA.debugLine="j.Release";
Debug.ShouldStop(128);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2473;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2475;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentobusquedadireccionescliente(RemoteObject __ref,RemoteObject _token,RemoteObject _idclientesel) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaDireccionesCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2215);
if (RapidSub.canDelegate("enviodatosapimagentobusquedadireccionescliente")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentobusquedadireccionescliente", __ref, _token, _idclientesel);}
ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionesCliente rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionesCliente(null,__ref,_token,_idclientesel);
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
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionesCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionesCliente(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token,RemoteObject _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idclientesel = _idclientesel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _idclientesel;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaDireccionesCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2215);
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
Debug.locals.put("Token", _token);
Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 2217;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(256);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 2218;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(512);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 2220;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(2048);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/customers/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idclientesel))),RemoteObject.createImmutable("/Addreses")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 2222;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(8192);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 2224;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(32768);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2225;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(65536);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 2227;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(262144);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 2229;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentobusquedadireccionescliente"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 2231;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2232;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","8104792081",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 2233;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","8104792082",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2234;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(33554432);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 2235;BA.debugLine="j.Release";
Debug.ShouldStop(67108864);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2236;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2239;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(1073741824);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 2240;BA.debugLine="j.Release";
Debug.ShouldStop(-2147483648);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2241;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2243;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentobusquedagruposclientes(RemoteObject __ref,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaGruposClientes (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,739);
if (RapidSub.canDelegate("enviodatosapimagentobusquedagruposclientes")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentobusquedagruposclientes", __ref, _token);}
ResumableSub_EnvioDatosAPIMagentoBusquedaGruposClientes rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaGruposClientes(null,__ref,_token);
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
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaGruposClientes extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaGruposClientes(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoBusquedaGruposClientes (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,739);
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
Debug.locals.put("Token", _token);
 BA.debugLineNum = 741;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(16);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 742;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(32);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 744;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(128);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/customerGroups/search?\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][field]=code&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][value]=%&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][condition_type]=like")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 749;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(4096);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 751;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(16384);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 752;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(32768);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 754;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(131072);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 756;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentobusquedagruposclientes"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 758;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 759;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","8103677972",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 760;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","8103677973",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 761;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(16777216);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 762;BA.debugLine="j.Release";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 763;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 766;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(536870912);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 767;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 768;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 770;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentoinformacioncategoriasproductos(RemoteObject __ref,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionCategoriasProductos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,3302);
if (RapidSub.canDelegate("enviodatosapimagentoinformacioncategoriasproductos")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentoinformacioncategoriasproductos", __ref, _token);}
ResumableSub_EnvioDatosAPIMagentoInformacionCategoriasProductos rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionCategoriasProductos(null,__ref,_token);
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
public static class ResumableSub_EnvioDatosAPIMagentoInformacionCategoriasProductos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionCategoriasProductos(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionCategoriasProductos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,3302);
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
Debug.locals.put("Token", _token);
 BA.debugLineNum = 3304;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(128);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 3305;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(256);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 3309;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(4096);
_squeryapi = (RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/categories/list"));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 3311;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(16384);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 3313;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(65536);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 3314;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(131072);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 3316;BA.debugLine="job.GetRequest.Timeout=30000";
Debug.ShouldStop(524288);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 30000));
 BA.debugLineNum = 3318;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentoinformacioncategoriasproductos"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 3320;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 3321;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","8105840659",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 3322;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","8105840660",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 3323;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(67108864);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 3324;BA.debugLine="j.Release";
Debug.ShouldStop(134217728);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 3325;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3328;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(-2147483648);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 3329;BA.debugLine="j.Release";
Debug.ShouldStop(1);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 3330;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3332;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentoinformacioncliente(RemoteObject __ref,RemoteObject _token,RemoteObject _idcliente) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1081);
if (RapidSub.canDelegate("enviodatosapimagentoinformacioncliente")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentoinformacioncliente", __ref, _token, _idcliente);}
ResumableSub_EnvioDatosAPIMagentoInformacionCliente rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionCliente(null,__ref,_token,_idcliente);
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
public static class ResumableSub_EnvioDatosAPIMagentoInformacionCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionCliente(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token,RemoteObject _idcliente) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idcliente = _idcliente;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _idcliente;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1081);
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
Debug.locals.put("Token", _token);
Debug.locals.put("IDCliente", _idcliente);
 BA.debugLineNum = 1083;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(67108864);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1084;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(134217728);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1086;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(536870912);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/customers/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idcliente))),RemoteObject.createImmutable("")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 1088;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 1090;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(2);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1091;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(4);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 1093;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(16);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 1095;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentoinformacioncliente"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1097;BA.debugLine="If j.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1098;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","8104071185",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 1099;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","8104071186",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1100;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(2048);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1101;BA.debugLine="j.Release";
Debug.ShouldStop(4096);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1102;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1105;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(65536);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1106;BA.debugLine="j.Release";
Debug.ShouldStop(131072);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1107;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1109;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentoinformacionpedidocliente(RemoteObject __ref,RemoteObject _token,RemoteObject _tipoidentificador,RemoteObject _idsel) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidoCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2049);
if (RapidSub.canDelegate("enviodatosapimagentoinformacionpedidocliente")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentoinformacionpedidocliente", __ref, _token, _tipoidentificador, _idsel);}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente(null,__ref,_token,_tipoidentificador,_idsel);
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
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token,RemoteObject _tipoidentificador,RemoteObject _idsel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._tipoidentificador = _tipoidentificador;
this._idsel = _idsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _tipoidentificador;
RemoteObject _idsel;
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidoCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2049);
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
Debug.locals.put("Token", _token);
Debug.locals.put("TipoIdentificador", _tipoidentificador);
Debug.locals.put("IDSel", _idsel);
 BA.debugLineNum = 2051;BA.debugLine="If TipoIdentificador=\"ID Pedido\" Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_tipoidentificador,BA.ObjectToString("ID Pedido"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2052;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-web";
Debug.ShouldStop(8);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/orders/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idsel))),RemoteObject.createImmutable("")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2054;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-web";
Debug.ShouldStop(32);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/orders/search?\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][field]=increment_id&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][value]="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idsel))),RemoteObject.createImmutable("&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][condition_type]=eq")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2060;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(2048);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 2061;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(4096);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 2064;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(32768);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 2066;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(131072);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2067;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(262144);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 2069;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 2071;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentoinformacionpedidocliente"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 2073;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 12;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 2074;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","8104529945",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 2075;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","8104529946",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2076;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(134217728);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 2077;BA.debugLine="j.Release";
Debug.ShouldStop(268435456);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2078;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2081;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(1);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 2082;BA.debugLine="j.Release";
Debug.ShouldStop(2);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2083;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2085;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentoinformacionpedidos(RemoteObject __ref,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1640);
if (RapidSub.canDelegate("enviodatosapimagentoinformacionpedidos")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentoinformacionpedidos", __ref, _token);}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidos rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidos(null,__ref,_token);
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
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidos(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1640);
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
Debug.locals.put("Token", _token);
 BA.debugLineNum = 1642;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(512);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1643;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(1024);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1647;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(16384);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/orders/?searchCriteria[pageSize] = 0\n"),RemoteObject.createImmutable("	&searchCriteria[filterGroups][0][filters][0][field]=store_id&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][value]=32,35,37,38&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][condition_type]=in")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 1652;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(524288);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 1654;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(2097152);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1655;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(4194304);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 1657;BA.debugLine="job.GetRequest.Timeout=30000";
Debug.ShouldStop(16777216);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 30000));
 BA.debugLineNum = 1659;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentoinformacionpedidos"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1661;BA.debugLine="If j.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1662;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","8104398870",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 1663;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","8104398871",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1664;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(-2147483648);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1665;BA.debugLine="j.Release";
Debug.ShouldStop(1);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1666;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1669;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(16);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1670;BA.debugLine="j.Release";
Debug.ShouldStop(32);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1671;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1673;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentoinformacionproductos(RemoteObject __ref,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionProductos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1284);
if (RapidSub.canDelegate("enviodatosapimagentoinformacionproductos")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentoinformacionproductos", __ref, _token);}
ResumableSub_EnvioDatosAPIMagentoInformacionProductos rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionProductos(null,__ref,_token);
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
public static class ResumableSub_EnvioDatosAPIMagentoInformacionProductos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionProductos(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionProductos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1284);
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
Debug.locals.put("Token", _token);
 BA.debugLineNum = 1286;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(32);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1287;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(64);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1292;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(2048);
_squeryapi = (RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/products/?searchCriteria[pageSize] = 0"));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 1298;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(131072);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 1300;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(524288);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1301;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 1303;BA.debugLine="job.GetRequest.Timeout=30000";
Debug.ShouldStop(4194304);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 30000));
 BA.debugLineNum = 1305;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentoinformacionproductos"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1307;BA.debugLine="If j.Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1308;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","8104267800",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 1309;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","8104267801",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1310;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(536870912);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1311;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1312;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1315;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(4);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1316;BA.debugLine="j.Release";
Debug.ShouldStop(8);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1317;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1319;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentolistastores(RemoteObject __ref,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoListaStores (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,586);
if (RapidSub.canDelegate("enviodatosapimagentolistastores")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentolistastores", __ref, _token);}
ResumableSub_EnvioDatosAPIMagentoListaStores rsub = new ResumableSub_EnvioDatosAPIMagentoListaStores(null,__ref,_token);
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
public static class ResumableSub_EnvioDatosAPIMagentoListaStores extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoListaStores(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoListaStores (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,586);
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
Debug.locals.put("Token", _token);
 BA.debugLineNum = 588;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(2048);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 589;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(4096);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 592;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(32768);
_squeryapi = (RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/store/storeGroups"));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 594;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(131072);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 596;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(524288);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 597;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 599;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(4194304);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 601;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentolistastores"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 603;BA.debugLine="If j.Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 604;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","8103481362",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 605;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","8103481363",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 606;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(536870912);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 607;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 608;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 611;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(4);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 612;BA.debugLine="j.Release";
Debug.ShouldStop(8);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 613;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 615;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentovaloresatributosizeproductos(RemoteObject __ref,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoValoresAtributoSizeProductos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2684);
if (RapidSub.canDelegate("enviodatosapimagentovaloresatributosizeproductos")) { return __ref.runUserSub(false, "ctestsinfomagento","enviodatosapimagentovaloresatributosizeproductos", __ref, _token);}
ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos rsub = new ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos(null,__ref,_token);
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
public static class ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoValoresAtributoSizeProductos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2684);
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
Debug.locals.put("Token", _token);
 BA.debugLineNum = 2686;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(536870912);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 2687;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(1073741824);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 2689;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(1);
_squeryapi = (RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/products/attributes/size/options"));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 2691;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(4);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 2693;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(16);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2694;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(32);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 2696;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(128);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 2698;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "enviodatosapimagentovaloresatributosizeproductos"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 2700;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2701;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","8105381905",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 2702;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","8105381906",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2703;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(16384);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 2704;BA.debugLine="j.Release";
Debug.ShouldStop(32768);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2705;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2708;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(524288);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 2709;BA.debugLine="j.Release";
Debug.ShouldStop(1048576);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 2710;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2712;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("frm_CloseRequest (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "ctestsinfomagento","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 179;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="EventData.Consume";
Debug.ShouldStop(524288);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getform(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getForm (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("getform")) { return __ref.runUserSub(false, "ctestsinfomagento","getform", __ref);}
 BA.debugLineNum = 170;BA.debugLine="Sub getForm As Form";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Return frm";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_frm" /*RemoteObject*/ );
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "ctestsinfomagento","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(8);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(ctestsinfomagento._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(ctestsinfomagento.__c.getField(true,"True")));
 BA.debugLineNum = 40;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 42;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
Debug.ShouldStop(512);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, ctestsinfomagento.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, ctestsinfomagento.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 43;BA.debugLine="MeasurementCanvas.Initialize(p)";
Debug.ShouldStop(1024);
__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_p));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { return __ref.runUserSub(false, "ctestsinfomagento","jamtableview1_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 326;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="SalirModulo";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("jamTableView1_CambioEnCeldaSeleccionada (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,391);
if (RapidSub.canDelegate("jamtableview1_cambioenceldaseleccionada")) { return __ref.runUserSub(false, "ctestsinfomagento","jamtableview1_cambioenceldaseleccionada", __ref, _datosceldaseleccionada);}
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
 BA.debugLineNum = 391;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
Debug.ShouldStop(64);
 BA.debugLineNum = 392;BA.debugLine="Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila";
Debug.ShouldStop(128);
_lineaseltv = _datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ );Debug.locals.put("LineaSelTV", _lineaseltv);Debug.locals.put("LineaSelTV", _lineaseltv);
 BA.debugLineNum = 393;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
Debug.ShouldStop(256);
_mpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mpk = _datosceldaseleccionada.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mPK", _mpk);Debug.locals.put("mPK", _mpk);
 BA.debugLineNum = 394;BA.debugLine="Dim Pedido As String=mPK.Get(\"Pedido\")";
Debug.ShouldStop(512);
_pedido = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Pedido")))));Debug.locals.put("Pedido", _pedido);Debug.locals.put("Pedido", _pedido);
 BA.debugLineNum = 395;BA.debugLine="Dim Linea As Int=mPK.Get(\"Linea\")";
Debug.ShouldStop(1024);
_linea = BA.numberCast(int.class, _mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Linea")))));Debug.locals.put("Linea", _linea);Debug.locals.put("Linea", _linea);
 BA.debugLineNum = 396;BA.debugLine="Dim NombreProveedor As String=jamTableView1.GetVa";
Debug.ShouldStop(2048);
_nombreproveedor = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("NombreProveedor"))));Debug.locals.put("NombreProveedor", _nombreproveedor);Debug.locals.put("NombreProveedor", _nombreproveedor);
 BA.debugLineNum = 397;BA.debugLine="Dim Articulo As String=jamTableView1.GetValorSQLC";
Debug.ShouldStop(4096);
_articulo = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Articulo"))));Debug.locals.put("Articulo", _articulo);Debug.locals.put("Articulo", _articulo);
 BA.debugLineNum = 398;BA.debugLine="Dim Descripcion As String=jamTableView1.GetValorS";
Debug.ShouldStop(8192);
_descripcion = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("DescripcionArticulo"))));Debug.locals.put("Descripcion", _descripcion);Debug.locals.put("Descripcion", _descripcion);
 BA.debugLineNum = 399;BA.debugLine="Dim Talla As String=jamTableView1.GetValorSQLCamp";
Debug.ShouldStop(16384);
_talla = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Talla"))));Debug.locals.put("Talla", _talla);Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 400;BA.debugLine="Dim sTalla As String=IIf(Talla<>\"\",\"Talla: \" & Ta";
Debug.ShouldStop(32768);
_stalla = BA.ObjectToString(((RemoteObject.solveBoolean("!",_talla,BA.ObjectToString(""))) ? ((RemoteObject.concat(RemoteObject.createImmutable("Talla: "),_talla))) : ((RemoteObject.createImmutable("")))));Debug.locals.put("sTalla", _stalla);Debug.locals.put("sTalla", _stalla);
 BA.debugLineNum = 401;BA.debugLine="Dim QtyPte As Int=jamTableView1.GetValorSQLCampoF";
Debug.ShouldStop(65536);
_qtypte = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("QtyPendiente"))));Debug.locals.put("QtyPte", _qtypte);Debug.locals.put("QtyPte", _qtypte);
 BA.debugLineNum = 402;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(131072);
_dateformatant = ctestsinfomagento.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 403;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(262144);
ctestsinfomagento.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 404;BA.debugLine="Dim FechaPrometidaLong As Long=jamTableView1.GetV";
Debug.ShouldStop(524288);
_fechaprometidalong = BA.numberCast(long.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("FechaPrometida"))));Debug.locals.put("FechaPrometidaLong", _fechaprometidalong);Debug.locals.put("FechaPrometidaLong", _fechaprometidalong);
 BA.debugLineNum = 405;BA.debugLine="Dim sFechaPrometida As String=IIf(FechaPrometidaL";
Debug.ShouldStop(1048576);
_sfechaprometida = BA.ObjectToString(((RemoteObject.solveBoolean(">",_fechaprometidalong,BA.numberCast(long.class, 0))) ? ((RemoteObject.concat(RemoteObject.createImmutable("Fecha Prometida: "),ctestsinfomagento.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechaprometidalong))))) : ((RemoteObject.createImmutable("SIN FECHA PROMETIDA")))));Debug.locals.put("sFechaPrometida", _sfechaprometida);Debug.locals.put("sFechaPrometida", _sfechaprometida);
 BA.debugLineNum = 406;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(2097152);
ctestsinfomagento.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 407;BA.debugLine="Dim PendienteSeguimiento As Int=jamTableView1.Get";
Debug.ShouldStop(4194304);
_pendienteseguimiento = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("PendienteSeguimiento"))));Debug.locals.put("PendienteSeguimiento", _pendienteseguimiento);Debug.locals.put("PendienteSeguimiento", _pendienteseguimiento);
 BA.debugLineNum = 408;BA.debugLine="Dim sPendienteSeguimiento As String=IIf(Pendiente";
Debug.ShouldStop(8388608);
_spendienteseguimiento = BA.ObjectToString(((RemoteObject.solveBoolean("=",_pendienteseguimiento,BA.numberCast(double.class, 1))) ? (RemoteObject.createImmutable(("PENDIENTE SEGUIMIENTO"))) : ((RemoteObject.createImmutable("")))));Debug.locals.put("sPendienteSeguimiento", _spendienteseguimiento);Debug.locals.put("sPendienteSeguimiento", _spendienteseguimiento);
 BA.debugLineNum = 410;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Pedido:";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Pedido: "),_pedido,RemoteObject.createImmutable(" Línea:"),_linea,RemoteObject.createImmutable("  "),_nombreproveedor,RemoteObject.createImmutable("  "),_articulo,RemoteObject.createImmutable("  "),_descripcion,RemoteObject.createImmutable("  "),_stalla,RemoteObject.createImmutable("  QtyPte: "),_qtypte,RemoteObject.createImmutable("  "),_sfechaprometida,RemoteObject.createImmutable(" "),_spendienteseguimiento)));
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
public static RemoteObject  _jamtableview1_cellclick(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_CellClick (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,416);
if (RapidSub.canDelegate("jamtableview1_cellclick")) { return __ref.runUserSub(false, "ctestsinfomagento","jamtableview1_cellclick", __ref, _datosceldaseleccionada);}
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 416;BA.debugLine="Sub jamTableView1_CellClick(DatosCeldaSeleccionada";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 417;BA.debugLine="Select DatosCeldaSeleccionada.AliasCampo";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(_datosceldaseleccionada.getField(true,"AliasCampo" /*RemoteObject*/ ),BA.ObjectToString("ExcluidoReclamacion"))) {
case 0: {
 BA.debugLineNum = 419;BA.debugLine="AlternarExcluidoReclamacion(DatosCeldaSeleccion";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_alternarexcluidoreclamacion" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada));
 break; }
}
;
 BA.debugLineNum = 421;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableview1_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("jamtableview1_contextmenuitem_action")) { __ref.runUserSub(false, "ctestsinfomagento","jamtableview1_contextmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableView1_ContextMenuItem_Action rsub = new ResumableSub_jamTableView1_ContextMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableView1_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_ContextMenuItem_Action(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _tagmenuitem;
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _dcs = RemoteObject.declareNull("b4j.docU.jamtableview._datosceldaseleccionadajamtableview");
RemoteObject _pedidosel = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _articulosel = RemoteObject.createImmutable("");
RemoteObject _filaseleccionada = RemoteObject.createImmutable(0);
RemoteObject _lstinfofila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dc = RemoteObject.declareNull("b4j.docU.jamtableview._datoscamporegistrojamtableview");
RemoteObject _idclientesel = RemoteObject.createImmutable("");
RemoteObject group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,342);
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
 BA.debugLineNum = 343;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//select
this.state = 33;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("VerPedidoCompraNAV"),BA.ObjectToString("VerArticuloNAV"),BA.ObjectToString("DireccionesClientes"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 15;
if (true) break;
}
case 2: {
this.state = 32;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 345;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.ShouldStop(16777216);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 346;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(33554432);
_dcs = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaaliascampofilatv" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Pedido")),(Object)(_filasel));Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 347;BA.debugLine="Dim PedidoSel As String=DCS.ValorCelda";
Debug.ShouldStop(67108864);
_pedidosel = BA.ObjectToString(_dcs.getField(false,"ValorCelda" /*RemoteObject*/ ));Debug.locals.put("PedidoSel", _pedidosel);Debug.locals.put("PedidoSel", _pedidosel);
 BA.debugLineNum = 348;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Ver el p";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Ver el pedido de compra "),_pedidosel,RemoteObject.createImmutable(" en NAVISION?"))),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 349;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 350;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 351;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(1073741824);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Pedido compra")),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.ObjectToString("No.")),(Object)(_pedidosel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 352;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 35;
return;
case 35:
//C
this.state = 10;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 353;BA.debugLine="If success=False Then";
Debug.ShouldStop(1);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 354;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible abrir el pedido seleccionado en Navision.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 355;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 33;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 359;BA.debugLine="Dim ArticuloSel As String";
Debug.ShouldStop(64);
_articulosel = RemoteObject.createImmutable("");Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 360;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
Debug.ShouldStop(128);
_filaseleccionada = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_indicesfilasseleccionadas" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 361;BA.debugLine="Dim lstInfoFila As List=jamTableView1.DatosRegi";
Debug.ShouldStop(256);
_lstinfofila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstinfofila = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datosregistroindicefila" /*RemoteObject*/ ,(Object)(_filaseleccionada));Debug.locals.put("lstInfoFila", _lstinfofila);Debug.locals.put("lstInfoFila", _lstinfofila);
 BA.debugLineNum = 362;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
Debug.ShouldStop(512);
if (true) break;

case 16:
//for
this.state = 23;
group19 = _lstinfofila;
index19 = 0;
groupLen19 = group19.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("dc", _dc);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 23;
if (index19 < groupLen19) {
this.state = 18;
_dc = (group19.runMethod(false,"Get",index19));Debug.locals.put("dc", _dc);}
if (true) break;

case 38:
//C
this.state = 37;
index19++;
Debug.locals.put("dc", _dc);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 363;BA.debugLine="If dc.Campo=\"Articulo\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_dc.getField(true,"Campo" /*RemoteObject*/ ),BA.ObjectToString("Articulo"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 364;BA.debugLine="ArticuloSel=dc.ValorCampo";
Debug.ShouldStop(2048);
_articulosel = BA.ObjectToString(_dc.getField(false,"ValorCampo" /*RemoteObject*/ ));Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 365;BA.debugLine="Exit";
Debug.ShouldStop(4096);
this.state = 23;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 38;
;
 if (true) break;
if (true) break;
Debug.locals.put("dc", _dc);
;
 BA.debugLineNum = 368;BA.debugLine="If ArticuloSel=\"\" Then";
Debug.ShouldStop(32768);

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_articulosel,BA.ObjectToString(""))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 369;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha encontrado el campo Artículo.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 370;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 26;
;
 BA.debugLineNum = 371;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 373;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(1048576);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ficha producto")),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.ObjectToString("No.")),(Object)(_articulosel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 374;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 40;
return;
case 40:
//C
this.state = 27;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 375;BA.debugLine="If success=False Then";
Debug.ShouldStop(4194304);
if (true) break;

case 27:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 376;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible abrir el artículo seleccionado en Navision.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 377;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 33;
;
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 381;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
Debug.ShouldStop(268435456);
_filasel = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 383;BA.debugLine="Dim IDClienteSel As String=jamTableView1.GetVal";
Debug.ShouldStop(1073741824);
_idclientesel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("id"))));Debug.locals.put("IDClienteSel", _idclientesel);Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 385;BA.debugLine="MostrarDireccionesClienteMagento(IDClienteSel)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrardireccionesclientemagento" /*void*/ ,(Object)(BA.numberCast(int.class, _idclientesel)));
 if (true) break;

case 33:
//C
this.state = -1;
;
 BA.debugLineNum = 387;BA.debugLine="End Sub";
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
public static void  _jamtableview1_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { __ref.runUserSub(false, "ctestsinfomagento","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem); return;}
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
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _tagmenuitem;
RemoteObject _seleccionardireccionremitenteemails = RemoteObject.createImmutable("");
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,330);
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
 BA.debugLineNum = 331;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("SeleccionarCuentaRemitenteEmail"))) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 336;BA.debugLine="wait for (SeleccionarDireccionRemitenteEmails)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "jamtableview1_menubarmenuitem_action"), (_seleccionardireccionremitenteemails));
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 337;BA.debugLine="If rBool=False Then Return";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
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
 BA.debugLineNum = 339;BA.debugLine="End Sub";
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
public static RemoteObject  _mostrardirecciondefectoenviocliente(RemoteObject __ref,RemoteObject _idclientesel) throws Exception{
try {
		Debug.PushSubsStack("MostrarDireccionDefectoEnvioCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2163);
if (RapidSub.canDelegate("mostrardirecciondefectoenviocliente")) { return __ref.runUserSub(false, "ctestsinfomagento","mostrardirecciondefectoenviocliente", __ref, _idclientesel);}
ResumableSub_MostrarDireccionDefectoEnvioCliente rsub = new ResumableSub_MostrarDireccionDefectoEnvioCliente(null,__ref,_idclientesel);
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
public static class ResumableSub_MostrarDireccionDefectoEnvioCliente extends BA.ResumableSub {
public ResumableSub_MostrarDireccionDefectoEnvioCliente(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _idclientesel;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rsdireccionesclientes = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarDireccionDefectoEnvioCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2163);
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
Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 2164;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Dir";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Direccion Defecto Envío Cliente...")));
 BA.debugLineNum = 2165;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 2166;BA.debugLine="Wait For(CargaDireccionDefectoEnvioCliente(IDClie";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargadirecciondefectoenviocliente" /*RemoteObject*/ ,(Object)(_idclientesel)));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2167;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2168;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2169;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Direccion Defecto Envío Cliente B2B"))));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 2170;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2176;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(-2147483648);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaB2BDireccionesCliente.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2177;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 2178;BA.debugLine="Log(mRes)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","8104726543",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 2179;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(4);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2180;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(8);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2181;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2182;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
 BA.debugLineNum = 2183;BA.debugLine="frm.Close";
Debug.ShouldStop(64);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 2184;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 2187;BA.debugLine="Dim rsDireccionesClientes As ResultSet=mSQL.ExecQ";
Debug.ShouldStop(1024);
_rsdireccionesclientes = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdireccionesclientes = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblB2BDireccionesCliente")));Debug.locals.put("rsDireccionesClientes", _rsdireccionesclientes);Debug.locals.put("rsDireccionesClientes", _rsdireccionesclientes);
 BA.debugLineNum = 2188;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(2048);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rsdireccionesclientes.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2189;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 2190;BA.debugLine="rsDireccionesClientes.close";
Debug.ShouldStop(8192);
_rsdireccionesclientes.runVoidMethod ("Close");
 BA.debugLineNum = 2191;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2192;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(32768);
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2193;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(65536);
if (true) break;

case 12:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2194;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2195;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
 BA.debugLineNum = 2197;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2198;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2199;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(4194304);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2200;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 2201;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 2204;BA.debugLine="ExitApplication";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 2206;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(536870912);

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2207;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(1073741824);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 2208;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2209;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 2213;BA.debugLine="End Sub";
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
public static RemoteObject  _mostrardirecciondefectofacturacioncliente(RemoteObject __ref,RemoteObject _idclientesel) throws Exception{
try {
		Debug.PushSubsStack("MostrarDireccionDefectoFacturacionCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2336);
if (RapidSub.canDelegate("mostrardirecciondefectofacturacioncliente")) { return __ref.runUserSub(false, "ctestsinfomagento","mostrardirecciondefectofacturacioncliente", __ref, _idclientesel);}
ResumableSub_MostrarDireccionDefectoFacturacionCliente rsub = new ResumableSub_MostrarDireccionDefectoFacturacionCliente(null,__ref,_idclientesel);
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
public static class ResumableSub_MostrarDireccionDefectoFacturacionCliente extends BA.ResumableSub {
public ResumableSub_MostrarDireccionDefectoFacturacionCliente(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _idclientesel;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rsdireccionesclientes = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarDireccionDefectoFacturacionCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2336);
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
Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 2337;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Dir";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Direccion Defecto Facturación Cliente...")));
 BA.debugLineNum = 2338;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 2339;BA.debugLine="Wait For(CargaDireccionDefectoFacturacionCliente(";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargadirecciondefectofacturacioncliente" /*RemoteObject*/ ,(Object)(_idclientesel)));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2340;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2341;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(16);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2342;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Direccion Defecto Facturacion Cliente B2B"))));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 2343;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2349;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(4096);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaB2BDireccionesCliente.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2350;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 2351;BA.debugLine="Log(mRes)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","8104988687",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 2352;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(32768);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2353;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2354;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2355;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
 BA.debugLineNum = 2356;BA.debugLine="frm.Close";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 2357;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 2360;BA.debugLine="Dim rsDireccionesClientes As ResultSet=mSQL.ExecQ";
Debug.ShouldStop(8388608);
_rsdireccionesclientes = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdireccionesclientes = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblB2BDireccionesCliente")));Debug.locals.put("rsDireccionesClientes", _rsdireccionesclientes);Debug.locals.put("rsDireccionesClientes", _rsdireccionesclientes);
 BA.debugLineNum = 2361;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(16777216);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rsdireccionesclientes.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2362;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 2363;BA.debugLine="rsDireccionesClientes.close";
Debug.ShouldStop(67108864);
_rsdireccionesclientes.runVoidMethod ("Close");
 BA.debugLineNum = 2364;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2365;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2366;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(536870912);
if (true) break;

case 12:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2367;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2368;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
 BA.debugLineNum = 2370;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2371;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2372;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(8);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2373;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 2374;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 2377;BA.debugLine="ExitApplication";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 2379;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(1024);

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2380;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(2048);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 2381;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2382;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 2386;BA.debugLine="End Sub";
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
public static void  _mostrardireccionesclientemagento(RemoteObject __ref,RemoteObject _idclientesel) throws Exception{
try {
		Debug.PushSubsStack("MostrarDireccionesClienteMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2111);
if (RapidSub.canDelegate("mostrardireccionesclientemagento")) { __ref.runUserSub(false, "ctestsinfomagento","mostrardireccionesclientemagento", __ref, _idclientesel); return;}
ResumableSub_MostrarDireccionesClienteMagento rsub = new ResumableSub_MostrarDireccionesClienteMagento(null,__ref,_idclientesel);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarDireccionesClienteMagento extends BA.ResumableSub {
public ResumableSub_MostrarDireccionesClienteMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _idclientesel;
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
int _i = 0;
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _opcion = RemoteObject.createImmutable("");
int step15;
int limit15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarDireccionesClienteMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2111);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 2115;BA.debugLine="Dialog.Title=\"Selecciona Tipo Dirección\"";
Debug.ShouldStop(4);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Tipo Dirección")));
 BA.debugLineNum = 2116;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(8);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 2117;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(16);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 2118;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(32);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 2119;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(64);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 2120;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(128);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2122;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(512);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 2123;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(1024);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 2124;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(2048);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 2126;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(8192);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 2127;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(16384);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 2129;BA.debugLine="Dim lstOpciones As List=Array As String(\"Default";
Debug.ShouldStop(65536);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstopciones = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("Default Shipping Adress"),BA.ObjectToString("Default Billing Address"),RemoteObject.createImmutable("Todas")})));Debug.locals.put("lstOpciones", _lstopciones);Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 2131;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(262144);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 2133;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(1048576);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2135;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//for
this.state = 4;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 4;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 3;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step15)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 24;
 BA.debugLineNum = 2136;BA.debugLine="xclv.ResizeItem(i,80dip)";
Debug.ShouldStop(8388608);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2140;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(134217728);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 2141;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 2143;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(1073741824);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 2144;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(-2147483648);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 2145;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(1);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 2148;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrardireccionesclientemagento"), _rsub);
this.state = 25;
return;
case 25:
//C
this.state = 9;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2149;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 2150;BA.debugLine="Dim Opcion As String= B4XListDlg.SelectedItem";
Debug.ShouldStop(32);
_opcion = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("Opcion", _opcion);Debug.locals.put("Opcion", _opcion);
 BA.debugLineNum = 2152;BA.debugLine="Select Case Opcion";
Debug.ShouldStop(128);
if (true) break;

case 15:
//select
this.state = 22;
switch (BA.switchObjectToInt(_opcion,BA.ObjectToString("Default Shipping Adress"),BA.ObjectToString("Default Billing Address"),BA.ObjectToString("Todas"))) {
case 0: {
this.state = 17;
if (true) break;
}
case 1: {
this.state = 19;
if (true) break;
}
case 2: {
this.state = 21;
if (true) break;
}
}
if (true) break;

case 17:
//C
this.state = 22;
 BA.debugLineNum = 2154;BA.debugLine="MostrarDireccionDefectoEnvioCliente(IDClienteSe";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrardirecciondefectoenviocliente" /*RemoteObject*/ ,(Object)(_idclientesel));
 if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 2156;BA.debugLine="MostrarDireccionDefectoFacturacionCliente(IDCli";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrardirecciondefectofacturacioncliente" /*RemoteObject*/ ,(Object)(_idclientesel));
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2158;BA.debugLine="MostrarTodasDireccionesCliente(IDClienteSel)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_mostrartodasdireccionescliente" /*RemoteObject*/ ,(Object)(_idclientesel));
 BA.debugLineNum = 2159;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 2161;BA.debugLine="End Sub";
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
public static void  _mostrarlistacategoriasmagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarListaCategoriasMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,3235);
if (RapidSub.canDelegate("mostrarlistacategoriasmagento")) { __ref.runUserSub(false, "ctestsinfomagento","mostrarlistacategoriasmagento", __ref); return;}
ResumableSub_MostrarListaCategoriasMagento rsub = new ResumableSub_MostrarListaCategoriasMagento(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarListaCategoriasMagento extends BA.ResumableSub {
public ResumableSub_MostrarListaCategoriasMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rsclientes = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarListaCategoriasMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,3235);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 3237;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Lis";
Debug.ShouldStop(16);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Lista Categorias...")));
 BA.debugLineNum = 3238;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 3239;BA.debugLine="Wait For(CargaListaCategoriasMagento) complete (S";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargalistacategoriasmagento" /*RemoteObject*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 3240;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(128);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3241;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3242;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando categorias B2B"))));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 3243;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3250;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(131072);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaB2BProductos.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3251;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 3252;BA.debugLine="Log(mRes)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","8105709585",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 3253;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 3254;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3255;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3256;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
 BA.debugLineNum = 3257;BA.debugLine="frm.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 3258;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 3261;BA.debugLine="Dim rsClientes As ResultSet=mSQL.ExecQuery(\"selec";
Debug.ShouldStop(268435456);
_rsclientes = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsclientes = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblB2BCategorias")));Debug.locals.put("rsClientes", _rsclientes);Debug.locals.put("rsClientes", _rsclientes);
 BA.debugLineNum = 3262;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(536870912);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rsclientes.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3263;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 3264;BA.debugLine="rsClientes.close";
Debug.ShouldStop(-2147483648);
_rsclientes.runVoidMethod ("Close");
 BA.debugLineNum = 3265;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3266;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(2);
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3267;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(4);
if (true) break;

case 12:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 3268;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3269;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
 BA.debugLineNum = 3271;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3272;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 3273;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(256);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 3274;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(512);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 3275;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 3278;BA.debugLine="ExitApplication";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 3280;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(32768);

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 3281;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(65536);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) return ;
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 3282;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3283;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 3286;BA.debugLine="End Sub";
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
public static void  _mostrarlistaclientesmagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarListaClientesMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,772);
if (RapidSub.canDelegate("mostrarlistaclientesmagento")) { __ref.runUserSub(false, "ctestsinfomagento","mostrarlistaclientesmagento", __ref); return;}
ResumableSub_MostrarListaClientesMagento rsub = new ResumableSub_MostrarListaClientesMagento(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarListaClientesMagento extends BA.ResumableSub {
public ResumableSub_MostrarListaClientesMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rsclientes = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarListaClientesMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,772);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 773;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Cli";
Debug.ShouldStop(16);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Clientes...")));
 BA.debugLineNum = 774;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 775;BA.debugLine="Wait For(CargaListaClientesMagento) complete (Suc";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargalistaclientesmagento" /*RemoteObject*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 776;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 777;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 778;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Clientes B2B"))));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 779;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 785;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(65536);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaB2BClientes.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 786;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 787;BA.debugLine="Log(mRes)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","8103743503",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 788;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(524288);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 789;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 790;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 791;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
 BA.debugLineNum = 792;BA.debugLine="frm.Close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 793;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 796;BA.debugLine="jamTableView1.AddContextMenuItemFontMaterialIcons";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontmaterialiconstext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Direcciones Cliente")),(Object)(BA.ObjectToString("DireccionesClientes")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe0c8)))))));
 BA.debugLineNum = 798;BA.debugLine="Dim rsClientes As ResultSet=mSQL.ExecQuery(\"selec";
Debug.ShouldStop(536870912);
_rsclientes = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsclientes = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblB2BClientes")));Debug.locals.put("rsClientes", _rsclientes);Debug.locals.put("rsClientes", _rsclientes);
 BA.debugLineNum = 799;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(1073741824);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rsclientes.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 800;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 801;BA.debugLine="rsClientes.close";
Debug.ShouldStop(1);
_rsclientes.runVoidMethod ("Close");
 BA.debugLineNum = 802;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 803;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(4);
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 804;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(8);
if (true) break;

case 12:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 805;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 806;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
 BA.debugLineNum = 808;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 809;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 810;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(512);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 811;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 812;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 815;BA.debugLine="ExitApplication";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 817;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(65536);

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 818;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(131072);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) return ;
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 819;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 820;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 823;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static void  _mostrarlistagruposclientemagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarListaGruposClienteMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,618);
if (RapidSub.canDelegate("mostrarlistagruposclientemagento")) { __ref.runUserSub(false, "ctestsinfomagento","mostrarlistagruposclientemagento", __ref); return;}
ResumableSub_MostrarListaGruposClienteMagento rsub = new ResumableSub_MostrarListaGruposClienteMagento(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarListaGruposClienteMagento extends BA.ResumableSub {
public ResumableSub_MostrarListaGruposClienteMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _lstmaprecords = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsrowids = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
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
		Debug.PushSubsStack("MostrarListaGruposClienteMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,618);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 619;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Gru";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Grupos Cliente...")));
 BA.debugLineNum = 620;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 621;BA.debugLine="Wait For(CargaListaGruposClienteMagento) complete";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistagruposclientemagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargalistagruposclientemagento" /*RemoteObject*/ ));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 622;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 623;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 624;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistagruposclientemagento"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Grupos Cliente B2B"))));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 625;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 628;BA.debugLine="Dim lstMapRecords As List";
Debug.ShouldStop(524288);
_lstmaprecords = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstMapRecords", _lstmaprecords);
 BA.debugLineNum = 629;BA.debugLine="lstMapRecords.Initialize";
Debug.ShouldStop(1048576);
_lstmaprecords.runVoidMethod ("Initialize");
 BA.debugLineNum = 630;BA.debugLine="Dim rsRowIDs As ResultSet=mSQL.ExecQuery(\"select";
Debug.ShouldStop(2097152);
_rsrowids = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsrowids = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select rowid from tblB2BGruposCliente")));Debug.locals.put("rsRowIDs", _rsrowids);Debug.locals.put("rsRowIDs", _rsrowids);
 BA.debugLineNum = 631;BA.debugLine="Do While rsRowIDs.NextRow";
Debug.ShouldStop(4194304);
if (true) break;

case 5:
//do while
this.state = 8;
while (_rsrowids.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
 BA.debugLineNum = 632;BA.debugLine="Dim mData As Map=DBUtils.ExecuteMap(mSQL,\"select";
Debug.ShouldStop(8388608);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("select * from tblB2BGruposCliente where rowid=?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_rsrowids.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("rowId"))))})));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 633;BA.debugLine="lstMapRecords.Add(mData)";
Debug.ShouldStop(16777216);
_lstmaprecords.runVoidMethod ("Add",(Object)((_mdata.getObject())));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 635;BA.debugLine="rsRowIDs.Close";
Debug.ShouldStop(67108864);
_rsrowids.runVoidMethod ("Close");
 BA.debugLineNum = 637;BA.debugLine="Dim pBaseFlexGrid As B4XView = xui.CreatePanel(\"\"";
Debug.ShouldStop(268435456);
_pbaseflexgrid = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pbaseflexgrid = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pBaseFlexGrid", _pbaseflexgrid);Debug.locals.put("pBaseFlexGrid", _pbaseflexgrid);
 BA.debugLineNum = 638;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip,";
Debug.ShouldStop(536870912);
_pbaseflexgrid.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500))))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))}, "*",0, 0))));
 BA.debugLineNum = 639;BA.debugLine="pBaseFlexGrid.LoadLayout(\"scrDialogFlexGrid\")";
Debug.ShouldStop(1073741824);
_pbaseflexgrid.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrDialogFlexGrid")),__ref.getField(false, "ba"));
 BA.debugLineNum = 641;BA.debugLine="Dim HeadersFont As Font=xui.CreateDefaultfont(15)";
Debug.ShouldStop(1);
_headersfont = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_headersfont = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 15))).getObject());Debug.locals.put("HeadersFont", _headersfont);Debug.locals.put("HeadersFont", _headersfont);
 BA.debugLineNum = 642;BA.debugLine="FlexGridDialog.HeaderFont=HeadersFont";
Debug.ShouldStop(2);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_setvvvvvvvvvvvvvvvv7",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject()));
 BA.debugLineNum = 644;BA.debugLine="Dim RowsFont As Font=xui.CreateDefaultfont(14)";
Debug.ShouldStop(8);
_rowsfont = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_rowsfont = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14))).getObject());Debug.locals.put("RowsFont", _rowsfont);Debug.locals.put("RowsFont", _rowsfont);
 BA.debugLineNum = 645;BA.debugLine="FlexGridDialog.Font=RowsFont";
Debug.ShouldStop(16);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_setvvvvvvvvvvvvvvvv4",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject()));
 BA.debugLineNum = 646;BA.debugLine="Dim NumColumnasTablaTotales As Int=mData.Size";
Debug.ShouldStop(32);
_numcolumnastablatotales = _mdata.runMethod(true,"getSize");Debug.locals.put("NumColumnasTablaTotales", _numcolumnastablatotales);Debug.locals.put("NumColumnasTablaTotales", _numcolumnastablatotales);
 BA.debugLineNum = 647;BA.debugLine="Dim AnchosColumnas(NumColumnasTablaTotales) As In";
Debug.ShouldStop(64);
_anchoscolumnas = RemoteObject.createNewArray ("int", new int[] {_numcolumnastablatotales.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("AnchosColumnas", _anchoscolumnas);
 BA.debugLineNum = 648;BA.debugLine="FlexGridDialog.SetColsNumber(NumColumnasTablaTota";
Debug.ShouldStop(128);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvv1",(Object)(_numcolumnastablatotales));
 BA.debugLineNum = 649;BA.debugLine="Dim ColIndex As Int";
Debug.ShouldStop(256);
_colindex = RemoteObject.createImmutable(0);Debug.locals.put("ColIndex", _colindex);
 BA.debugLineNum = 650;BA.debugLine="For Each k As String In mData.Keys";
Debug.ShouldStop(512);
if (true) break;

case 9:
//for
this.state = 16;
group28 = _mdata.runMethod(false,"Keys");
index28 = 0;
groupLen28 = group28.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 16;
if (index28 < groupLen28) {
this.state = 11;
_k = BA.ObjectToString(group28.runMethod(false,"Get",index28));Debug.locals.put("k", _k);}
if (true) break;

case 38:
//C
this.state = 37;
index28++;
Debug.locals.put("k", _k);
if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 651;BA.debugLine="FlexGridDialog.SetColName(ColIndex,k)";
Debug.ShouldStop(1024);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvv4",(Object)(_colindex),(Object)(_k));
 BA.debugLineNum = 653;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex)";
Debug.ShouldStop(4096);
_anchocolumna = _anchoscolumnas.getArrayElement(true,_colindex);Debug.locals.put("AnchoColumna", _anchocolumna);Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 654;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(Fl";
Debug.ShouldStop(8192);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("<",_anchocolumna,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvvv2").getArrayElement(true,_colindex)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 655;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(Flex";
Debug.ShouldStop(16384);
_anchocolumna = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvvv2").getArrayElement(true,_colindex)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0));Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 656;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
Debug.ShouldStop(32768);
_anchoscolumnas.setArrayElement (_anchocolumna,_colindex);
 if (true) break;

case 15:
//C
this.state = 38;
;
 BA.debugLineNum = 659;BA.debugLine="ColIndex=ColIndex+1";
Debug.ShouldStop(262144);
_colindex = RemoteObject.solve(new RemoteObject[] {_colindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColIndex", _colindex);
 if (true) break;
if (true) break;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 662;BA.debugLine="For Each mDatos As Map In lstMapRecords";
Debug.ShouldStop(2097152);

case 16:
//for
this.state = 27;
_mdatos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group37 = _lstmaprecords;
index37 = 0;
groupLen37 = group37.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDatos", _mdatos);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 27;
if (index37 < groupLen37) {
this.state = 18;
_mdatos = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group37.runMethod(false,"Get",index37));Debug.locals.put("mDatos", _mdatos);}
if (true) break;

case 40:
//C
this.state = 39;
index37++;
Debug.locals.put("mDatos", _mdatos);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 663;BA.debugLine="Dim Fila(NumColumnasTablaTotales) As String";
Debug.ShouldStop(4194304);
_fila = RemoteObject.createNewArray ("String", new int[] {_numcolumnastablatotales.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 664;BA.debugLine="Dim ColIndex As Int";
Debug.ShouldStop(8388608);
_colindex = RemoteObject.createImmutable(0);Debug.locals.put("ColIndex", _colindex);
 BA.debugLineNum = 665;BA.debugLine="For Each k As String In mDatos.Keys";
Debug.ShouldStop(16777216);
if (true) break;

case 19:
//for
this.state = 26;
group40 = _mdatos.runMethod(false,"Keys");
index40 = 0;
groupLen40 = group40.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 41;
if (true) break;

case 41:
//C
this.state = 26;
if (index40 < groupLen40) {
this.state = 21;
_k = BA.ObjectToString(group40.runMethod(false,"Get",index40));Debug.locals.put("k", _k);}
if (true) break;

case 42:
//C
this.state = 41;
index40++;
Debug.locals.put("k", _k);
if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 666;BA.debugLine="Fila(ColIndex)=mDatos.get(k)";
Debug.ShouldStop(33554432);
_fila.setArrayElement (BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k)))),_colindex);
 BA.debugLineNum = 667;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex";
Debug.ShouldStop(67108864);
_anchocolumna = _anchoscolumnas.getArrayElement(true,_colindex);Debug.locals.put("AnchoColumna", _anchocolumna);Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 668;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(m";
Debug.ShouldStop(134217728);
if (true) break;

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("<",_anchocolumna,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 669;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(mDa";
Debug.ShouldStop(268435456);
_anchocolumna = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0));Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 670;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
Debug.ShouldStop(536870912);
_anchoscolumnas.setArrayElement (_anchocolumna,_colindex);
 if (true) break;

case 25:
//C
this.state = 42;
;
 BA.debugLineNum = 672;BA.debugLine="ColIndex=ColIndex+1";
Debug.ShouldStop(-2147483648);
_colindex = RemoteObject.solve(new RemoteObject[] {_colindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColIndex", _colindex);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 40;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 674;BA.debugLine="FlexGridDialog.AddRow(Fila,False)";
Debug.ShouldStop(2);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_v7",(Object)((_fila)),(Object)(parent.__c.getField(true,"False")));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
Debug.locals.put("mDatos", _mdatos);
;
 BA.debugLineNum = 678;BA.debugLine="Dim AnchoTotalTabla As Int";
Debug.ShouldStop(32);
_anchototaltabla = RemoteObject.createImmutable(0);Debug.locals.put("AnchoTotalTabla", _anchototaltabla);
 BA.debugLineNum = 679;BA.debugLine="For ColIndex=0 To NumColumnasTablaTotales-1";
Debug.ShouldStop(64);
if (true) break;

case 28:
//for
this.state = 31;
step52 = 1;
limit52 = RemoteObject.solve(new RemoteObject[] {_numcolumnastablatotales,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_colindex = BA.numberCast(int.class, 0) ;
Debug.locals.put("ColIndex", _colindex);
this.state = 43;
if (true) break;

case 43:
//C
this.state = 31;
if ((step52 > 0 && _colindex.<Integer>get().intValue() <= limit52) || (step52 < 0 && _colindex.<Integer>get().intValue() >= limit52)) this.state = 30;
if (true) break;

case 44:
//C
this.state = 43;
_colindex = RemoteObject.createImmutable((int)(0 + _colindex.<Integer>get().intValue() + step52)) ;
Debug.locals.put("ColIndex", _colindex);
if (true) break;

case 30:
//C
this.state = 44;
 BA.debugLineNum = 680;BA.debugLine="FlexGridDialog.SetColWidth(ColIndex,AnchosColumn";
Debug.ShouldStop(128);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvv5",(Object)(_colindex),(Object)(_anchoscolumnas.getArrayElement(true,_colindex)));
 BA.debugLineNum = 681;BA.debugLine="AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(C";
Debug.ShouldStop(256);
_anchototaltabla = RemoteObject.solve(new RemoteObject[] {_anchototaltabla,_anchoscolumnas.getArrayElement(true,_colindex)}, "+",1, 1);Debug.locals.put("AnchoTotalTabla", _anchototaltabla);
 if (true) break;
if (true) break;
Debug.locals.put("ColIndex", _colindex);
;
 BA.debugLineNum = 684;BA.debugLine="For RowIndex=0 To FlexGridDialog.RowCount-1";
Debug.ShouldStop(2048);

case 31:
//for
this.state = 34;
step56 = 1;
limit56 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(true,"_getvvvvvvvvvvvvvv6"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_rowindex = 0 ;
Debug.locals.put("RowIndex", _rowindex);
this.state = 45;
if (true) break;

case 45:
//C
this.state = 34;
if ((step56 > 0 && _rowindex <= limit56) || (step56 < 0 && _rowindex >= limit56)) this.state = 33;
if (true) break;

case 46:
//C
this.state = 45;
_rowindex = ((int)(0 + _rowindex + step56)) ;
Debug.locals.put("RowIndex", _rowindex);
if (true) break;

case 33:
//C
this.state = 46;
 BA.debugLineNum = 685;BA.debugLine="FlexGridDialog.SetRowHeight(RowIndex,50dip)";
Debug.ShouldStop(4096);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvvvv5",(Object)(BA.numberCast(int.class, _rowindex)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
Debug.locals.put("RowIndex", _rowindex);
;
 BA.debugLineNum = 687;BA.debugLine="Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.Ro";
Debug.ShouldStop(16384);
_altototal = BA.numberCast(int.class, parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(true,"_getvvvvvvvvvvvvvv6")),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "*+",1, 1))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))}, "*",0, 0)))));Debug.locals.put("AltoTotal", _altototal);Debug.locals.put("AltoTotal", _altototal);
 BA.debugLineNum = 688;BA.debugLine="FlexGridDialog.Base.Width=AnchoTotalTabla";
Debug.ShouldStop(32768);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvv0").runMethod(true,"setWidth",BA.numberCast(double.class, _anchototaltabla));
 BA.debugLineNum = 689;BA.debugLine="FlexGridDialog.Base.Height=AltoTotal";
Debug.ShouldStop(65536);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvv0").runMethod(true,"setHeight",BA.numberCast(double.class, _altototal));
 BA.debugLineNum = 691;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTot";
Debug.ShouldStop(262144);
_pbaseflexgrid.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_anchototaltabla,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_altototal,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "+",1, 1))));
 BA.debugLineNum = 692;BA.debugLine="Sleep(100)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistagruposclientemagento"),BA.numberCast(int.class, 100));
this.state = 47;
return;
case 47:
//C
this.state = -1;
;
 BA.debugLineNum = 693;BA.debugLine="FlexGridDialog.Invalidate";
Debug.ShouldStop(1048576);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvv1");
 BA.debugLineNum = 695;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 697;BA.debugLine="Dialog.Title=\"Datos Grupos Cliente\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Datos Grupos Cliente")));
 BA.debugLineNum = 698;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseF";
Debug.ShouldStop(33554432);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_pbaseflexgrid),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 699;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(67108864);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 700;BA.debugLine="bOK.TextSize=16";
Debug.ShouldStop(134217728);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 701;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistagruposclientemagento"), _rsub);
this.state = 48;
return;
case 48:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 702;BA.debugLine="End Sub";
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
public static void  _mostrarlistaproductosmagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarListaProductosMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1111);
if (RapidSub.canDelegate("mostrarlistaproductosmagento")) { __ref.runUserSub(false, "ctestsinfomagento","mostrarlistaproductosmagento", __ref); return;}
ResumableSub_MostrarListaProductosMagento rsub = new ResumableSub_MostrarListaProductosMagento(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarListaProductosMagento extends BA.ResumableSub {
public ResumableSub_MostrarListaProductosMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rsclientes = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarListaProductosMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,1111);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1112;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Lis";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Lista Productos...")));
 BA.debugLineNum = 1113;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1114;BA.debugLine="Wait For(CargaListaProductosMagento) complete (Su";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargalistaproductosmagento" /*RemoteObject*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1115;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1116;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1117;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Productos B2B"))));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 1118;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1125;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(16);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaB2BProductos.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1126;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1127;BA.debugLine="Log(mRes)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","8104136720",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 1128;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(128);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1129;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1130;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1131;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
 BA.debugLineNum = 1132;BA.debugLine="frm.Close";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 1133;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 1136;BA.debugLine="Dim rsClientes As ResultSet=mSQL.ExecQuery(\"selec";
Debug.ShouldStop(32768);
_rsclientes = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsclientes = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblB2BProductos")));Debug.locals.put("rsClientes", _rsclientes);Debug.locals.put("rsClientes", _rsclientes);
 BA.debugLineNum = 1137;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(65536);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rsclientes.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1138;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 1139;BA.debugLine="rsClientes.close";
Debug.ShouldStop(262144);
_rsclientes.runVoidMethod ("Close");
 BA.debugLineNum = 1140;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1141;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1142;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(2097152);
if (true) break;

case 12:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1143;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1144;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
 BA.debugLineNum = 1146;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1147;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1148;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(134217728);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1149;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 1150;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 1153;BA.debugLine="ExitApplication";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 1155;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(4);

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1156;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(8);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) return ;
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 1157;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1158;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 1161;BA.debugLine="End Sub";
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
public static void  _mostrarlistastoresmagento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarListaStoresMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,473);
if (RapidSub.canDelegate("mostrarlistastoresmagento")) { __ref.runUserSub(false, "ctestsinfomagento","mostrarlistastoresmagento", __ref); return;}
ResumableSub_MostrarListaStoresMagento rsub = new ResumableSub_MostrarListaStoresMagento(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarListaStoresMagento extends BA.ResumableSub {
public ResumableSub_MostrarListaStoresMagento(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _lstmaprecords = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsrowids = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
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
		Debug.PushSubsStack("MostrarListaStoresMagento (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,473);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 474;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Sto";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Stores...")));
 BA.debugLineNum = 475;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 476;BA.debugLine="Wait For(CargaListaStoresMagento) complete (Succe";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistastoresmagento"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargalistastoresmagento" /*RemoteObject*/ ));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 477;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 478;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 479;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistastoresmagento"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Stores B2B"))));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 480;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 483;BA.debugLine="Dim lstMapRecords As List";
Debug.ShouldStop(4);
_lstmaprecords = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstMapRecords", _lstmaprecords);
 BA.debugLineNum = 484;BA.debugLine="lstMapRecords.Initialize";
Debug.ShouldStop(8);
_lstmaprecords.runVoidMethod ("Initialize");
 BA.debugLineNum = 485;BA.debugLine="Dim rsRowIDs As ResultSet=mSQL.ExecQuery(\"select";
Debug.ShouldStop(16);
_rsrowids = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsrowids = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select rowid from tblB2BStores")));Debug.locals.put("rsRowIDs", _rsrowids);Debug.locals.put("rsRowIDs", _rsrowids);
 BA.debugLineNum = 486;BA.debugLine="Do While rsRowIDs.NextRow";
Debug.ShouldStop(32);
if (true) break;

case 5:
//do while
this.state = 8;
while (_rsrowids.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
 BA.debugLineNum = 487;BA.debugLine="Dim mData As Map=DBUtils.ExecuteMap(mSQL,\"select";
Debug.ShouldStop(64);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("select * from tblB2BStores where rowid=?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_rsrowids.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("rowId"))))})));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 488;BA.debugLine="lstMapRecords.Add(mData)";
Debug.ShouldStop(128);
_lstmaprecords.runVoidMethod ("Add",(Object)((_mdata.getObject())));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 490;BA.debugLine="rsRowIDs.Close";
Debug.ShouldStop(512);
_rsrowids.runVoidMethod ("Close");
 BA.debugLineNum = 492;BA.debugLine="Dim pBaseFlexGrid As B4XView = xui.CreatePanel(\"\"";
Debug.ShouldStop(2048);
_pbaseflexgrid = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pbaseflexgrid = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pBaseFlexGrid", _pbaseflexgrid);Debug.locals.put("pBaseFlexGrid", _pbaseflexgrid);
 BA.debugLineNum = 493;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip,";
Debug.ShouldStop(4096);
_pbaseflexgrid.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500))))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))}, "*",0, 0))));
 BA.debugLineNum = 494;BA.debugLine="pBaseFlexGrid.LoadLayout(\"scrDialogFlexGrid\")";
Debug.ShouldStop(8192);
_pbaseflexgrid.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrDialogFlexGrid")),__ref.getField(false, "ba"));
 BA.debugLineNum = 496;BA.debugLine="Dim HeadersFont As Font=xui.CreateDefaultfont(15)";
Debug.ShouldStop(32768);
_headersfont = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_headersfont = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 15))).getObject());Debug.locals.put("HeadersFont", _headersfont);Debug.locals.put("HeadersFont", _headersfont);
 BA.debugLineNum = 497;BA.debugLine="FlexGridDialog.HeaderFont=HeadersFont";
Debug.ShouldStop(65536);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_setvvvvvvvvvvvvvvvv7",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject()));
 BA.debugLineNum = 499;BA.debugLine="Dim RowsFont As Font=xui.CreateDefaultfont(14)";
Debug.ShouldStop(262144);
_rowsfont = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
_rowsfont = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14))).getObject());Debug.locals.put("RowsFont", _rowsfont);Debug.locals.put("RowsFont", _rowsfont);
 BA.debugLineNum = 500;BA.debugLine="FlexGridDialog.Font=RowsFont";
Debug.ShouldStop(524288);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_setvvvvvvvvvvvvvvvv4",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject()));
 BA.debugLineNum = 501;BA.debugLine="Dim NumColumnasTablaTotales As Int=mData.Size";
Debug.ShouldStop(1048576);
_numcolumnastablatotales = _mdata.runMethod(true,"getSize");Debug.locals.put("NumColumnasTablaTotales", _numcolumnastablatotales);Debug.locals.put("NumColumnasTablaTotales", _numcolumnastablatotales);
 BA.debugLineNum = 502;BA.debugLine="Dim AnchosColumnas(NumColumnasTablaTotales) As In";
Debug.ShouldStop(2097152);
_anchoscolumnas = RemoteObject.createNewArray ("int", new int[] {_numcolumnastablatotales.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("AnchosColumnas", _anchoscolumnas);
 BA.debugLineNum = 503;BA.debugLine="FlexGridDialog.SetColsNumber(NumColumnasTablaTota";
Debug.ShouldStop(4194304);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvv1",(Object)(_numcolumnastablatotales));
 BA.debugLineNum = 504;BA.debugLine="Dim ColIndex As Int";
Debug.ShouldStop(8388608);
_colindex = RemoteObject.createImmutable(0);Debug.locals.put("ColIndex", _colindex);
 BA.debugLineNum = 505;BA.debugLine="For Each k As String In mData.Keys";
Debug.ShouldStop(16777216);
if (true) break;

case 9:
//for
this.state = 16;
group28 = _mdata.runMethod(false,"Keys");
index28 = 0;
groupLen28 = group28.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 16;
if (index28 < groupLen28) {
this.state = 11;
_k = BA.ObjectToString(group28.runMethod(false,"Get",index28));Debug.locals.put("k", _k);}
if (true) break;

case 38:
//C
this.state = 37;
index28++;
Debug.locals.put("k", _k);
if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 506;BA.debugLine="FlexGridDialog.SetColName(ColIndex,k)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvv4",(Object)(_colindex),(Object)(_k));
 BA.debugLineNum = 508;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex)";
Debug.ShouldStop(134217728);
_anchocolumna = _anchoscolumnas.getArrayElement(true,_colindex);Debug.locals.put("AnchoColumna", _anchocolumna);Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 509;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(Fl";
Debug.ShouldStop(268435456);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("<",_anchocolumna,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvvv2").getArrayElement(true,_colindex)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 510;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(Flex";
Debug.ShouldStop(536870912);
_anchocolumna = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvvv2").getArrayElement(true,_colindex)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _headersfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0));Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 511;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
Debug.ShouldStop(1073741824);
_anchoscolumnas.setArrayElement (_anchocolumna,_colindex);
 if (true) break;

case 15:
//C
this.state = 38;
;
 BA.debugLineNum = 514;BA.debugLine="ColIndex=ColIndex+1";
Debug.ShouldStop(2);
_colindex = RemoteObject.solve(new RemoteObject[] {_colindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColIndex", _colindex);
 if (true) break;
if (true) break;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 517;BA.debugLine="For Each mDatos As Map In lstMapRecords";
Debug.ShouldStop(16);

case 16:
//for
this.state = 27;
_mdatos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group37 = _lstmaprecords;
index37 = 0;
groupLen37 = group37.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDatos", _mdatos);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 27;
if (index37 < groupLen37) {
this.state = 18;
_mdatos = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group37.runMethod(false,"Get",index37));Debug.locals.put("mDatos", _mdatos);}
if (true) break;

case 40:
//C
this.state = 39;
index37++;
Debug.locals.put("mDatos", _mdatos);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 518;BA.debugLine="Dim Fila(NumColumnasTablaTotales) As String";
Debug.ShouldStop(32);
_fila = RemoteObject.createNewArray ("String", new int[] {_numcolumnastablatotales.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 519;BA.debugLine="Dim ColIndex As Int";
Debug.ShouldStop(64);
_colindex = RemoteObject.createImmutable(0);Debug.locals.put("ColIndex", _colindex);
 BA.debugLineNum = 520;BA.debugLine="For Each k As String In mDatos.Keys";
Debug.ShouldStop(128);
if (true) break;

case 19:
//for
this.state = 26;
group40 = _mdatos.runMethod(false,"Keys");
index40 = 0;
groupLen40 = group40.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 41;
if (true) break;

case 41:
//C
this.state = 26;
if (index40 < groupLen40) {
this.state = 21;
_k = BA.ObjectToString(group40.runMethod(false,"Get",index40));Debug.locals.put("k", _k);}
if (true) break;

case 42:
//C
this.state = 41;
index40++;
Debug.locals.put("k", _k);
if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 521;BA.debugLine="Fila(ColIndex)=mDatos.get(k)";
Debug.ShouldStop(256);
_fila.setArrayElement (BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k)))),_colindex);
 BA.debugLineNum = 522;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex";
Debug.ShouldStop(512);
_anchocolumna = _anchoscolumnas.getArrayElement(true,_colindex);Debug.locals.put("AnchoColumna", _anchocolumna);Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 523;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(m";
Debug.ShouldStop(1024);
if (true) break;

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("<",_anchocolumna,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 524;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(mDa";
Debug.ShouldStop(2048);
_anchocolumna = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.ObjectToString(_mdatos.runMethod(false,"Get",(Object)((_k))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont"), _rowsfont.getObject())).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0));Debug.locals.put("AnchoColumna", _anchocolumna);
 BA.debugLineNum = 525;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
Debug.ShouldStop(4096);
_anchoscolumnas.setArrayElement (_anchocolumna,_colindex);
 if (true) break;

case 25:
//C
this.state = 42;
;
 BA.debugLineNum = 527;BA.debugLine="ColIndex=ColIndex+1";
Debug.ShouldStop(16384);
_colindex = RemoteObject.solve(new RemoteObject[] {_colindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColIndex", _colindex);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 40;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 529;BA.debugLine="FlexGridDialog.AddRow(Fila,False)";
Debug.ShouldStop(65536);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_v7",(Object)((_fila)),(Object)(parent.__c.getField(true,"False")));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
Debug.locals.put("mDatos", _mdatos);
;
 BA.debugLineNum = 533;BA.debugLine="Dim AnchoTotalTabla As Int";
Debug.ShouldStop(1048576);
_anchototaltabla = RemoteObject.createImmutable(0);Debug.locals.put("AnchoTotalTabla", _anchototaltabla);
 BA.debugLineNum = 534;BA.debugLine="For ColIndex=0 To NumColumnasTablaTotales-1";
Debug.ShouldStop(2097152);
if (true) break;

case 28:
//for
this.state = 31;
step52 = 1;
limit52 = RemoteObject.solve(new RemoteObject[] {_numcolumnastablatotales,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_colindex = BA.numberCast(int.class, 0) ;
Debug.locals.put("ColIndex", _colindex);
this.state = 43;
if (true) break;

case 43:
//C
this.state = 31;
if ((step52 > 0 && _colindex.<Integer>get().intValue() <= limit52) || (step52 < 0 && _colindex.<Integer>get().intValue() >= limit52)) this.state = 30;
if (true) break;

case 44:
//C
this.state = 43;
_colindex = RemoteObject.createImmutable((int)(0 + _colindex.<Integer>get().intValue() + step52)) ;
Debug.locals.put("ColIndex", _colindex);
if (true) break;

case 30:
//C
this.state = 44;
 BA.debugLineNum = 535;BA.debugLine="FlexGridDialog.SetColWidth(ColIndex,AnchosColumn";
Debug.ShouldStop(4194304);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvv5",(Object)(_colindex),(Object)(_anchoscolumnas.getArrayElement(true,_colindex)));
 BA.debugLineNum = 536;BA.debugLine="AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(C";
Debug.ShouldStop(8388608);
_anchototaltabla = RemoteObject.solve(new RemoteObject[] {_anchototaltabla,_anchoscolumnas.getArrayElement(true,_colindex)}, "+",1, 1);Debug.locals.put("AnchoTotalTabla", _anchototaltabla);
 if (true) break;
if (true) break;
Debug.locals.put("ColIndex", _colindex);
;
 BA.debugLineNum = 539;BA.debugLine="For RowIndex=0 To FlexGridDialog.RowCount-1";
Debug.ShouldStop(67108864);

case 31:
//for
this.state = 34;
step56 = 1;
limit56 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(true,"_getvvvvvvvvvvvvvv6"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_rowindex = 0 ;
Debug.locals.put("RowIndex", _rowindex);
this.state = 45;
if (true) break;

case 45:
//C
this.state = 34;
if ((step56 > 0 && _rowindex <= limit56) || (step56 < 0 && _rowindex >= limit56)) this.state = 33;
if (true) break;

case 46:
//C
this.state = 45;
_rowindex = ((int)(0 + _rowindex + step56)) ;
Debug.locals.put("RowIndex", _rowindex);
if (true) break;

case 33:
//C
this.state = 46;
 BA.debugLineNum = 540;BA.debugLine="FlexGridDialog.SetRowHeight(RowIndex,50dip)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvvvvvvv5",(Object)(BA.numberCast(int.class, _rowindex)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
Debug.locals.put("RowIndex", _rowindex);
;
 BA.debugLineNum = 542;BA.debugLine="Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.Ro";
Debug.ShouldStop(536870912);
_altototal = BA.numberCast(int.class, parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),(__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(true,"_getvvvvvvvvvvvvvv6")),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "*+",1, 1))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))}, "*",0, 0)))));Debug.locals.put("AltoTotal", _altototal);Debug.locals.put("AltoTotal", _altototal);
 BA.debugLineNum = 543;BA.debugLine="FlexGridDialog.Base.Width=AnchoTotalTabla";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvv0").runMethod(true,"setWidth",BA.numberCast(double.class, _anchototaltabla));
 BA.debugLineNum = 544;BA.debugLine="FlexGridDialog.Base.Height=AltoTotal";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runMethod(false,"_getvvvvvvvvvvvvv0").runMethod(true,"setHeight",BA.numberCast(double.class, _altototal));
 BA.debugLineNum = 546;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTot";
Debug.ShouldStop(2);
_pbaseflexgrid.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_anchototaltabla,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_altototal,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "+",1, 1))));
 BA.debugLineNum = 547;BA.debugLine="Sleep(100)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistastoresmagento"),BA.numberCast(int.class, 100));
this.state = 47;
return;
case 47:
//C
this.state = -1;
;
 BA.debugLineNum = 548;BA.debugLine="FlexGridDialog.Invalidate";
Debug.ShouldStop(8);
__ref.getField(false,"_flexgriddialog" /*RemoteObject*/ ).runVoidMethod ("_vvvvvvv1");
 BA.debugLineNum = 550;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 552;BA.debugLine="Dialog.Title=\"Datos Stores\"";
Debug.ShouldStop(128);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Datos Stores")));
 BA.debugLineNum = 553;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseF";
Debug.ShouldStop(256);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_pbaseflexgrid),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 554;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(512);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 555;BA.debugLine="bOK.TextSize=16";
Debug.ShouldStop(1024);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 BA.debugLineNum = 556;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarlistastoresmagento"), _rsub);
this.state = 48;
return;
case 48:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 557;BA.debugLine="End Sub";
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
public static RemoteObject  _mostrarpedidos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarPedidos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2777);
if (RapidSub.canDelegate("mostrarpedidos")) { return __ref.runUserSub(false, "ctestsinfomagento","mostrarpedidos", __ref);}
ResumableSub_MostrarPedidos rsub = new ResumableSub_MostrarPedidos(null,__ref);
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
public static class ResumableSub_MostrarPedidos extends BA.ResumableSub {
public ResumableSub_MostrarPedidos(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rspedidos = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarPedidos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2777);
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
 BA.debugLineNum = 2778;BA.debugLine="TextAreaHTTPResponse.Text=\"\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_textareahttpresponse" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 2779;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Ped";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Pedidos...")));
 BA.debugLineNum = 2780;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 2781;BA.debugLine="Wait For(CargaPedidos) complete (Success As Boole";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarpedidos"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargapedidos" /*RemoteObject*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2782;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2783;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2784;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarpedidos"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Pedidos (Orders) B2B"))));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 2785;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2791;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(64);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaB2BPedidos2.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2792;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarpedidos"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 2793;BA.debugLine="Log(mRes)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","8105447440",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 2794;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(512);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2795;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2796;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2797;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarpedidos"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
 BA.debugLineNum = 2798;BA.debugLine="frm.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 2799;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 2802;BA.debugLine="Dim rsPedidos As ResultSet=mSQL.ExecQuery(\"select";
Debug.ShouldStop(131072);
_rspedidos = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rspedidos = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblB2BOrders")));Debug.locals.put("rsPedidos", _rspedidos);Debug.locals.put("rsPedidos", _rspedidos);
 BA.debugLineNum = 2803;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(262144);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rspedidos.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2804;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarpedidos"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 2805;BA.debugLine="rsPedidos.close";
Debug.ShouldStop(1048576);
_rspedidos.runVoidMethod ("Close");
 BA.debugLineNum = 2806;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2807;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2808;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(8388608);
if (true) break;

case 12:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2809;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2810;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarpedidos"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
 BA.debugLineNum = 2812;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2813;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarpedidos"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2814;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(536870912);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2815;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 2816;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 2819;BA.debugLine="ExitApplication";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 2821;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(16);

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2822;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(32);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 2823;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2824;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarpedidos"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 2828;BA.debugLine="End Sub";
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
public static RemoteObject  _mostrartodasdireccionescliente(RemoteObject __ref,RemoteObject _idclientesel) throws Exception{
try {
		Debug.PushSubsStack("MostrarTodasDireccionesCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2477);
if (RapidSub.canDelegate("mostrartodasdireccionescliente")) { return __ref.runUserSub(false, "ctestsinfomagento","mostrartodasdireccionescliente", __ref, _idclientesel);}
ResumableSub_MostrarTodasDireccionesCliente rsub = new ResumableSub_MostrarTodasDireccionesCliente(null,__ref,_idclientesel);
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
public static class ResumableSub_MostrarTodasDireccionesCliente extends BA.ResumableSub {
public ResumableSub_MostrarTodasDireccionesCliente(b4j.docU.ctestsinfomagento parent,RemoteObject __ref,RemoteObject _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _idclientesel;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rsdireccionesclientes = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarTodasDireccionesCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2477);
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
Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 2478;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Dir";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Direcciones Cliente...")));
 BA.debugLineNum = 2479;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 2480;BA.debugLine="Wait For(CargaInfoDireccionesClienteMagento(IDCli";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargainfodireccionesclientemagento" /*RemoteObject*/ ,(Object)(_idclientesel)));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2481;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2482;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2483;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargando Direcciones Cliente B2B"))));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 2484;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2490;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(33554432);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaB2BDireccionesCliente.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2491;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 2492;BA.debugLine="Log(mRes)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","8105185295",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 2493;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2494;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2495;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2496;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
 BA.debugLineNum = 2497;BA.debugLine="frm.Close";
Debug.ShouldStop(1);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 2498;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 2501;BA.debugLine="Dim rsDireccionesClientes As ResultSet=mSQL.ExecQ";
Debug.ShouldStop(16);
_rsdireccionesclientes = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdireccionesclientes = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblB2BDireccionesCliente")));Debug.locals.put("rsDireccionesClientes", _rsdireccionesclientes);Debug.locals.put("rsDireccionesClientes", _rsdireccionesclientes);
 BA.debugLineNum = 2502;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(32);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rsdireccionesclientes.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2503;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 2504;BA.debugLine="rsDireccionesClientes.close";
Debug.ShouldStop(128);
_rsdireccionesclientes.runVoidMethod ("Close");
 BA.debugLineNum = 2505;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2506;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(512);
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2507;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(1024);
if (true) break;

case 12:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2508;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2509;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
 BA.debugLineNum = 2511;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2512;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2513;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(65536);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2514;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 2515;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 2518;BA.debugLine="ExitApplication";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 2520;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(8388608);

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2521;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(16777216);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 2522;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2523;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 2527;BA.debugLine="End Sub";
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
public static RemoteObject  _mostrarvaloresatributosizeproductos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarValoresAtributoSizeProductos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2529);
if (RapidSub.canDelegate("mostrarvaloresatributosizeproductos")) { return __ref.runUserSub(false, "ctestsinfomagento","mostrarvaloresatributosizeproductos", __ref);}
ResumableSub_MostrarValoresAtributoSizeProductos rsub = new ResumableSub_MostrarValoresAtributoSizeProductos(null,__ref);
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
public static class ResumableSub_MostrarValoresAtributoSizeProductos extends BA.ResumableSub {
public ResumableSub_MostrarValoresAtributoSizeProductos(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rsdireccionesclientes = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarValoresAtributoSizeProductos (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2529);
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
 BA.debugLineNum = 2530;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Val";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando Valores Atributo Size Productos...")));
 BA.debugLineNum = 2531;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(4);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 2532;BA.debugLine="Wait For(CargaValoresAtributoSizeProductos) compl";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargavaloresatributosizeproductos" /*RemoteObject*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2533;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2534;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2535;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error cargandoValores Atributo Size Productos B2B"))));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 2536;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2542;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(8192);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaB2BProductAttributeSize.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2543;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 2544;BA.debugLine="Log(mRes)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","8105250831",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 2545;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(65536);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2546;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2547;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2548;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
 BA.debugLineNum = 2549;BA.debugLine="frm.Close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 2550;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 2553;BA.debugLine="Dim rsDireccionesClientes As ResultSet=mSQL.ExecQ";
Debug.ShouldStop(16777216);
_rsdireccionesclientes = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdireccionesclientes = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblB2BAtributoSizeProducts order by label")));Debug.locals.put("rsDireccionesClientes", _rsdireccionesclientes);Debug.locals.put("rsDireccionesClientes", _rsdireccionesclientes);
 BA.debugLineNum = 2554;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(33554432);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rsdireccionesclientes.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2555;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 2556;BA.debugLine="rsDireccionesClientes.close";
Debug.ShouldStop(134217728);
_rsdireccionesclientes.runVoidMethod ("Close");
 BA.debugLineNum = 2557;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2558;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2559;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 12:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2560;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2561;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
 BA.debugLineNum = 2563;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2564;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2565;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(16);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2566;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 2567;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 2570;BA.debugLine="ExitApplication";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 2572;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(2048);

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2573;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(4096);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 2574;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2575;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 2579;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "ctestsinfomagento","salirmodulo", __ref);}
 BA.debugLineNum = 187;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="If jamTableView1.IsInitialized Then";
Debug.ShouldStop(134217728);
if (__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 189;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuari";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 };
 BA.debugLineNum = 191;BA.debugLine="frm.Close";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 192;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(-2147483648);
ctestsinfomagento._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seleccionarcliente(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2087);
if (RapidSub.canDelegate("seleccionarcliente")) { return __ref.runUserSub(false, "ctestsinfomagento","seleccionarcliente", __ref);}
ResumableSub_SeleccionarCliente rsub = new ResumableSub_SeleccionarCliente(null,__ref);
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
public static class ResumableSub_SeleccionarCliente extends BA.ResumableSub {
public ResumableSub_SeleccionarCliente(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _idclientesel = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarCliente (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,2087);
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
 BA.debugLineNum = 2088;BA.debugLine="Dialog.Title=\"Indica ID Cliente\"";
Debug.ShouldStop(128);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica ID Cliente")));
 BA.debugLineNum = 2089;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(256);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 2090;BA.debugLine="Dialog.OverlayColor=0x00FFFFFF";
Debug.ShouldStop(512);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_overlaycolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x00ffffff)));
 BA.debugLineNum = 2091;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(1024);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 2092;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(2048);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2093;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(4096);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 2094;BA.debugLine="InputDlg.Text=\"\"";
Debug.ShouldStop(8192);
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 2095;BA.debugLine="InputDlg.ConfigureForNumbers(False,False)";
Debug.ShouldStop(16384);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 2097;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.ShouldStop(65536);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2098;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(131072);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 2099;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(262144);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 2100;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(524288);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 2101;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(1048576);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 2102;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(2097152);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 2103;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(4194304);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 2104;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "seleccionarcliente"), _rsub);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2106;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(33554432);
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
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((-(double) (0 + 1))));return;};
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2107;BA.debugLine="Dim IDClienteSel As Int=InputDlg.Text";
Debug.ShouldStop(67108864);
_idclientesel = BA.numberCast(int.class, _inputdlg.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("IDClienteSel", _idclientesel);Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 2108;BA.debugLine="Return IDClienteSel";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_idclientesel));return;};
 BA.debugLineNum = 2109;BA.debugLine="End Sub";
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
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "ctestsinfomagento","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.ctestsinfomagento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.ctestsinfomagento parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _imgv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _btnjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (ctestsinfomagento) ","ctestsinfomagento",50,__ref.getField(false, "ba"),__ref,46);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 48;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
Debug.ShouldStop(32768);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(65536);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 51;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(262144);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 52;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(524288);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 53;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(1048576);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 56;BA.debugLine="frm.RootPane.LoadLayout(\"scrTestMagento\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrTestMagento")));
 BA.debugLineNum = 57;BA.debugLine="SplitPane1.LoadLayout(\"scrTestMagentoJamTableView";
Debug.ShouldStop(16777216);
__ref.getField(false,"_splitpane1" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrTestMagentoJamTableView")));
 BA.debugLineNum = 58;BA.debugLine="Sleep(0)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "show"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 59;BA.debugLine="SplitPane1.LoadLayout(\"scrTestMagentoHTTPResponse";
Debug.ShouldStop(67108864);
__ref.getField(false,"_splitpane1" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrTestMagentoHTTPResponse")));
 BA.debugLineNum = 61;BA.debugLine="jamTableView1.EstadoMenuItem(\"Actualizar\",False)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Actualizar")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 63;BA.debugLine="Dim img As Image=xui.LoadBitmapResize(File.DirAss";
Debug.ShouldStop(1073741824);
_img = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
_img = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("twotone_exit_black_24dp.png")),(Object)(BA.numberCast(int.class, 16)),(Object)(BA.numberCast(int.class, 16)),(Object)(parent.__c.getField(true,"True"))).getObject());Debug.locals.put("img", _img);Debug.locals.put("img", _img);
 BA.debugLineNum = 64;BA.debugLine="Dim imgV As ImageView";
Debug.ShouldStop(-2147483648);
_imgv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("imgV", _imgv);
 BA.debugLineNum = 65;BA.debugLine="imgV.Initialize(\"\")";
Debug.ShouldStop(1);
_imgv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 66;BA.debugLine="imgV.SetImage(img)";
Debug.ShouldStop(2);
_imgv.runVoidMethod ("SetImage",(Object)((_img.getObject())));
 BA.debugLineNum = 67;BA.debugLine="Dim btnJO As JavaObject=btnSalir";
Debug.ShouldStop(4);
_btnjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_btnjo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_btnsalir" /*RemoteObject*/ ).getObject());Debug.locals.put("btnJO", _btnjo);Debug.locals.put("btnJO", _btnjo);
 BA.debugLineNum = 68;BA.debugLine="btnJO.RunMethod(\"setGraphic\",Array(imgV))";
Debug.ShouldStop(8);
_btnjo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setGraphic")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_imgv.getObject())})));
 BA.debugLineNum = 71;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"B2B\"";
Debug.ShouldStop(64);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("B2B")));
 BA.debugLineNum = 143;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(16384);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 144;BA.debugLine="JamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 152;BA.debugLine="frm.Show";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 156;BA.debugLine="Wait For(CargaDatosCredenciales) complete (mRes A";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "show"), __ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_cargadatoscredenciales" /*RemoteObject*/ ));
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 157;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 158;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 159;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error cre";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctestsinfomagento", "show"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("Error credenciales."))));
this.state = 7;
return;
case 7:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 160;BA.debugLine="SalirModulo";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.ctestsinfomagento.class, "_salirmodulo" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 162;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(2);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 163;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
Debug.ShouldStop(4);
_mdata0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData0", _mdata0);Debug.locals.put("mData0", _mdata0);
 BA.debugLineNum = 164;BA.debugLine="tk=mData0.GetValueAt(0)";
Debug.ShouldStop(8);
__ref.setField ("_tk" /*RemoteObject*/ ,BA.ObjectToString(_mdata0.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 166;BA.debugLine="B4XComboBoxTablasB2B.SetItems(Array As String(\"\",";
Debug.ShouldStop(32);
__ref.getField(false,"_b4xcomboboxtablasb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString(""),BA.ObjectToString("Stores"),BA.ObjectToString("Grupos Cliente"),BA.ObjectToString("Clientes"),BA.ObjectToString("Direcciones Cliente"),BA.ObjectToString("Categorias Productos"),BA.ObjectToString("Productos"),BA.ObjectToString("Valores Atributo size (Tallas Productos)"),RemoteObject.createImmutable("Pedidos")})))));
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
}