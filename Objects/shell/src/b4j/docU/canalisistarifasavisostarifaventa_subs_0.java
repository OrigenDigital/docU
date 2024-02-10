package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class canalisistarifasavisostarifaventa_subs_0 {


public static RemoteObject  _asjo(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("asJO (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "canalisistarifasavisostarifaventa","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 147;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="Return o";
Debug.ShouldStop(524288);
if (true) return _o;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("btnSalir_Click (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "canalisistarifasavisostarifaventa","btnsalir_click", __ref);}
 BA.debugLineNum = 156;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="SalirModulo";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifaventa.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsalirinfoavisostarifasventatipotarifacodigotarifaarticulo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalirInfoAvisosTarifasVentaTipoTarifaCodigoTarifaArticulo_Click (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,347);
if (RapidSub.canDelegate("btnsalirinfoavisostarifasventatipotarifacodigotarifaarticulo_click")) { return __ref.runUserSub(false, "canalisistarifasavisostarifaventa","btnsalirinfoavisostarifasventatipotarifacodigotarifaarticulo_click", __ref);}
 BA.debugLineNum = 347;BA.debugLine="Private Sub btnSalirInfoAvisosTarifasVentaTipoTari";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 348;BA.debugLine="SalirModulo";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifaventa.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargalineastarifaventatipotarifacodigotarifaarticulo(RemoteObject __ref,RemoteObject _tipotarifasel,RemoteObject _codigotarifasel,RemoteObject _articulosel) throws Exception{
try {
		Debug.PushSubsStack("CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,302);
if (RapidSub.canDelegate("cargalineastarifaventatipotarifacodigotarifaarticulo")) { return __ref.runUserSub(false, "canalisistarifasavisostarifaventa","cargalineastarifaventatipotarifacodigotarifaarticulo", __ref, _tipotarifasel, _codigotarifasel, _articulosel);}
ResumableSub_CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo rsub = new ResumableSub_CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo(null,__ref,_tipotarifasel,_codigotarifasel,_articulosel);
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
public static class ResumableSub_CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo extends BA.ResumableSub {
public ResumableSub_CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo(b4j.docU.canalisistarifasavisostarifaventa parent,RemoteObject __ref,RemoteObject _tipotarifasel,RemoteObject _codigotarifasel,RemoteObject _articulosel) {
this.parent = parent;
this.__ref = __ref;
this._tipotarifasel = _tipotarifasel;
this._codigotarifasel = _codigotarifasel;
this._articulosel = _articulosel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasavisostarifaventa parent;
RemoteObject _tipotarifasel;
RemoteObject _codigotarifasel;
RemoteObject _articulosel;
RemoteObject _stipotarifasel = RemoteObject.createImmutable("");
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
		Debug.PushSubsStack("CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,302);
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
Debug.locals.put("TipoTarifaSel", _tipotarifasel);
Debug.locals.put("CodigoTarifaSel", _codigotarifasel);
Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 303;BA.debugLine="Dim sTipoTarifaSel As String";
Debug.ShouldStop(16384);
_stipotarifasel = RemoteObject.createImmutable("");Debug.locals.put("sTipoTarifaSel", _stipotarifasel);
 BA.debugLineNum = 304;BA.debugLine="If TipoTarifaSel=0 Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_tipotarifasel,BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 305;BA.debugLine="sTipoTarifaSel=\"Cliente\"";
Debug.ShouldStop(65536);
_stipotarifasel = BA.ObjectToString("Cliente");Debug.locals.put("sTipoTarifaSel", _stipotarifasel);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 307;BA.debugLine="sTipoTarifaSel=\"GRP\"";
Debug.ShouldStop(262144);
_stipotarifasel = BA.ObjectToString("GRP");Debug.locals.put("sTipoTarifaSel", _stipotarifasel);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 310;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblAnalisisTarifas";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo")));
 BA.debugLineNum = 311;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4194304);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 312;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8388608);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 313;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 314;BA.debugLine="Dim Comando As String=\"AnalisisTarifasLineasTarif";
Debug.ShouldStop(33554432);
_comando = BA.ObjectToString("AnalisisTarifasLineasTarifaVentaTipoTarifaCodigoTarifaArticulo");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 315;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(67108864);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_tipotarifasel),(_codigotarifasel),(_articulosel)})),(Object)(__ref));
 BA.debugLineNum = 317;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "cargalineastarifaventatipotarifacodigotarifaarticulo"), null);
this.state = 19;
return;
case 19:
//C
this.state = 7;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 319;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
 BA.debugLineNum = 320;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 321;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 322;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "cargalineastarifaventatipotarifacodigotarifaarticulo"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 323;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(4);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 324;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 327;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(64);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 328;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(128);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 329;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"NO hay línea";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NO hay líneas de tarifas de venta válidas para los datos seleccionados (Tipo: "),_stipotarifasel,RemoteObject.createImmutable(" Código: "),_codigotarifasel,RemoteObject.createImmutable(" Artículo: "),_articulosel,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 330;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "cargalineastarifaventatipotarifacodigotarifaarticulo"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 BA.debugLineNum = 331;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 332;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 334;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8192);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 335;BA.debugLine="Dim mData As Map=lstReg.Get(0)";
Debug.ShouldStop(16384);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 336;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 337;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 338;BA.debugLine="mRes.Put(\"mData\", mData)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mData"))),(Object)((_mdata.getObject())));
 BA.debugLineNum = 339;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(262144);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo")),(Object)(_lstreg));
 BA.debugLineNum = 340;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisTarifasLi";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo set IDAnalisisTarifas=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(__ref.getField(true,"_midanalisistarifasventa" /*RemoteObject*/ ))})))));
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
 BA.debugLineNum = 343;BA.debugLine="Return mRes";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 344;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
canalisistarifasavisostarifaventa._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",canalisistarifasavisostarifaventa._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
canalisistarifasavisostarifaventa._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",canalisistarifasavisostarifaventa._xui);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object";
canalisistarifasavisostarifaventa._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",canalisistarifasavisostarifaventa._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Private mParent As B4XView";
canalisistarifasavisostarifaventa._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",canalisistarifasavisostarifaventa._mparent);
 //BA.debugLineNum = 10;BA.debugLine="Dim Background As B4XView";
canalisistarifasavisostarifaventa._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",canalisistarifasavisostarifaventa._background);
 //BA.debugLineNum = 11;BA.debugLine="Dim Base As B4XView";
canalisistarifasavisostarifaventa._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",canalisistarifasavisostarifaventa._base);
 //BA.debugLineNum = 13;BA.debugLine="Dim mFrmParent As Form  '  necesario para el jamT";
canalisistarifasavisostarifaventa._mfrmparent = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_mfrmparent",canalisistarifasavisostarifaventa._mfrmparent);
 //BA.debugLineNum = 16;BA.debugLine="Private btnSalir As Button";
canalisistarifasavisostarifaventa._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",canalisistarifasavisostarifaventa._btnsalir);
 //BA.debugLineNum = 18;BA.debugLine="Dim Dialog As B4XDialog";
canalisistarifasavisostarifaventa._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",canalisistarifasavisostarifaventa._dialog);
 //BA.debugLineNum = 19;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
canalisistarifasavisostarifaventa._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",canalisistarifasavisostarifaventa._jamloadingindicator1);
 //BA.debugLineNum = 20;BA.debugLine="Dim mSQL As SQL";
canalisistarifasavisostarifaventa._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",canalisistarifasavisostarifaventa._msql);
 //BA.debugLineNum = 22;BA.debugLine="Dim jamTableViewLineasTarifasVentaValidasTipoTari";
canalisistarifasavisostarifaventa._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo",canalisistarifasavisostarifaventa._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo);
 //BA.debugLineNum = 24;BA.debugLine="Dim mIDAnalisisTarifasVenta As Int";
canalisistarifasavisostarifaventa._midanalisistarifasventa = RemoteObject.createImmutable(0);__ref.setField("_midanalisistarifasventa",canalisistarifasavisostarifaventa._midanalisistarifasventa);
 //BA.debugLineNum = 25;BA.debugLine="Dim mTipoTarifa As Int";
canalisistarifasavisostarifaventa._mtipotarifa = RemoteObject.createImmutable(0);__ref.setField("_mtipotarifa",canalisistarifasavisostarifaventa._mtipotarifa);
 //BA.debugLineNum = 26;BA.debugLine="Dim mCodigoTarifa As String";
canalisistarifasavisostarifaventa._mcodigotarifa = RemoteObject.createImmutable("");__ref.setField("_mcodigotarifa",canalisistarifasavisostarifaventa._mcodigotarifa);
 //BA.debugLineNum = 27;BA.debugLine="Dim mArticulo As String";
canalisistarifasavisostarifaventa._marticulo = RemoteObject.createImmutable("");__ref.setField("_marticulo",canalisistarifasavisostarifaventa._marticulo);
 //BA.debugLineNum = 28;BA.debugLine="Dim mDescripcionArticulo As String";
canalisistarifasavisostarifaventa._mdescripcionarticulo = RemoteObject.createImmutable("");__ref.setField("_mdescripcionarticulo",canalisistarifasavisostarifaventa._mdescripcionarticulo);
 //BA.debugLineNum = 31;BA.debugLine="Dim DatosEditados As Boolean";
canalisistarifasavisostarifaventa._datoseditados = RemoteObject.createImmutable(false);__ref.setField("_datoseditados",canalisistarifasavisostarifaventa._datoseditados);
 //BA.debugLineNum = 32;BA.debugLine="Private lblNumPreciosDivisa As B4XView";
canalisistarifasavisostarifaventa._lblnumpreciosdivisa = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblnumpreciosdivisa",canalisistarifasavisostarifaventa._lblnumpreciosdivisa);
 //BA.debugLineNum = 33;BA.debugLine="Private lblTitleArticulo As B4XView";
canalisistarifasavisostarifaventa._lbltitlearticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlearticulo",canalisistarifasavisostarifaventa._lbltitlearticulo);
 //BA.debugLineNum = 34;BA.debugLine="Private lblTitleCodigoTarifa As B4XView";
canalisistarifasavisostarifaventa._lbltitlecodigotarifa = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlecodigotarifa",canalisistarifasavisostarifaventa._lbltitlecodigotarifa);
 //BA.debugLineNum = 35;BA.debugLine="Private lblTitleDescripcionArticulo As B4XView";
canalisistarifasavisostarifaventa._lbltitledescripcionarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitledescripcionarticulo",canalisistarifasavisostarifaventa._lbltitledescripcionarticulo);
 //BA.debugLineNum = 36;BA.debugLine="Private lblTitleNumMinQty As B4XView";
canalisistarifasavisostarifaventa._lbltitlenumminqty = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlenumminqty",canalisistarifasavisostarifaventa._lbltitlenumminqty);
 //BA.debugLineNum = 37;BA.debugLine="Private lblTitleNumPrecios As B4XView";
canalisistarifasavisostarifaventa._lbltitlenumprecios = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlenumprecios",canalisistarifasavisostarifaventa._lbltitlenumprecios);
 //BA.debugLineNum = 38;BA.debugLine="Private lblTitleNumPreciosArtTalla As B4XView";
canalisistarifasavisostarifaventa._lbltitlenumpreciosarttalla = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlenumpreciosarttalla",canalisistarifasavisostarifaventa._lbltitlenumpreciosarttalla);
 //BA.debugLineNum = 39;BA.debugLine="Private lblTitleNumPreciosUMDifUMVta As B4XView";
canalisistarifasavisostarifaventa._lbltitlenumpreciosumdifumvta = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlenumpreciosumdifumvta",canalisistarifasavisostarifaventa._lbltitlenumpreciosumdifumvta);
 //BA.debugLineNum = 40;BA.debugLine="Private lblTitleTipoTarifa As B4XView";
canalisistarifasavisostarifaventa._lbltitletipotarifa = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitletipotarifa",canalisistarifasavisostarifaventa._lbltitletipotarifa);
 //BA.debugLineNum = 41;BA.debugLine="Private pnlFondoDatosAvisos As B4XView";
canalisistarifasavisostarifaventa._pnlfondodatosavisos = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlfondodatosavisos",canalisistarifasavisostarifaventa._pnlfondodatosavisos);
 //BA.debugLineNum = 42;BA.debugLine="Private pnljamTableViewAnalisisTarifasLineasTarif";
canalisistarifasavisostarifaventa._pnljamtableviewanalisistarifaslineastarifasventavalidastipotarifacodigotarifaarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnljamtableviewanalisistarifaslineastarifasventavalidastipotarifacodigotarifaarticulo",canalisistarifasavisostarifaventa._pnljamtableviewanalisistarifaslineastarifasventavalidastipotarifacodigotarifaarticulo);
 //BA.debugLineNum = 43;BA.debugLine="Private txtArticuloAvisos As TextField";
canalisistarifasavisostarifaventa._txtarticuloavisos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtarticuloavisos",canalisistarifasavisostarifaventa._txtarticuloavisos);
 //BA.debugLineNum = 44;BA.debugLine="Private txtCodigoTarifaAvisos As TextField";
canalisistarifasavisostarifaventa._txtcodigotarifaavisos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodigotarifaavisos",canalisistarifasavisostarifaventa._txtcodigotarifaavisos);
 //BA.debugLineNum = 45;BA.debugLine="Private txtDescripcionArticuloAvisos As TextField";
canalisistarifasavisostarifaventa._txtdescripcionarticuloavisos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdescripcionarticuloavisos",canalisistarifasavisostarifaventa._txtdescripcionarticuloavisos);
 //BA.debugLineNum = 46;BA.debugLine="Private txtNumMinQty As TextField";
canalisistarifasavisostarifaventa._txtnumminqty = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumminqty",canalisistarifasavisostarifaventa._txtnumminqty);
 //BA.debugLineNum = 47;BA.debugLine="Private txtNumPrecios As TextField";
canalisistarifasavisostarifaventa._txtnumprecios = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumprecios",canalisistarifasavisostarifaventa._txtnumprecios);
 //BA.debugLineNum = 48;BA.debugLine="Private txtNumPreciosArtTalla As TextField";
canalisistarifasavisostarifaventa._txtnumpreciosarttalla = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumpreciosarttalla",canalisistarifasavisostarifaventa._txtnumpreciosarttalla);
 //BA.debugLineNum = 49;BA.debugLine="Private txtNumPreciosDivisa As TextField";
canalisistarifasavisostarifaventa._txtnumpreciosdivisa = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumpreciosdivisa",canalisistarifasavisostarifaventa._txtnumpreciosdivisa);
 //BA.debugLineNum = 50;BA.debugLine="Private txtNumPreciosUMDifUMVta As TextField";
canalisistarifasavisostarifaventa._txtnumpreciosumdifumvta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumpreciosumdifumvta",canalisistarifasavisostarifaventa._txtnumpreciosumdifumvta);
 //BA.debugLineNum = 51;BA.debugLine="Private txtTipoTarifaAvisos As TextField";
canalisistarifasavisostarifaventa._txttipotarifaavisos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txttipotarifaavisos",canalisistarifasavisostarifaventa._txttipotarifaavisos);
 //BA.debugLineNum = 53;BA.debugLine="Private lblInfoTarifasVentaValidasTipoTarifaCodig";
canalisistarifasavisostarifaventa._lblinfotarifasventavalidastipotarifacodigotarifaarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblinfotarifasventavalidastipotarifacodigotarifaarticulo",canalisistarifasavisostarifaventa._lblinfotarifasventavalidastipotarifacodigotarifaarticulo);
 //BA.debugLineNum = 54;BA.debugLine="Private btnSalirInfoAvisosTarifasVentaTipoTarifaC";
canalisistarifasavisostarifaventa._btnsalirinfoavisostarifasventatipotarifacodigotarifaarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnsalirinfoavisostarifasventatipotarifacodigotarifaarticulo",canalisistarifasavisostarifaventa._btnsalirinfoavisostarifasventatipotarifacodigotarifaarticulo);
 //BA.debugLineNum = 56;BA.debugLine="Private fRPrecioVentaUsuario As jamFormRegistro";
canalisistarifasavisostarifaventa._frprecioventausuario = RemoteObject.createNew ("b4j.docU.jamformregistro");__ref.setField("_frprecioventausuario",canalisistarifasavisostarifaventa._frprecioventausuario);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _datoslineastarifasavisostipotarifacodigotarifaarticulo(RemoteObject __ref,RemoteObject _tipotarifasel,RemoteObject _codigotarifasel,RemoteObject _articulosel,RemoteObject _descripcionarticulosel) throws Exception{
try {
		Debug.PushSubsStack("DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("datoslineastarifasavisostipotarifacodigotarifaarticulo")) { return __ref.runUserSub(false, "canalisistarifasavisostarifaventa","datoslineastarifasavisostipotarifacodigotarifaarticulo", __ref, _tipotarifasel, _codigotarifasel, _articulosel, _descripcionarticulosel);}
ResumableSub_DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo rsub = new ResumableSub_DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo(null,__ref,_tipotarifasel,_codigotarifasel,_articulosel,_descripcionarticulosel);
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
public static class ResumableSub_DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo extends BA.ResumableSub {
public ResumableSub_DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo(b4j.docU.canalisistarifasavisostarifaventa parent,RemoteObject __ref,RemoteObject _tipotarifasel,RemoteObject _codigotarifasel,RemoteObject _articulosel,RemoteObject _descripcionarticulosel) {
this.parent = parent;
this.__ref = __ref;
this._tipotarifasel = _tipotarifasel;
this._codigotarifasel = _codigotarifasel;
this._articulosel = _articulosel;
this._descripcionarticulosel = _descripcionarticulosel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasavisostarifaventa parent;
RemoteObject _tipotarifasel;
RemoteObject _codigotarifasel;
RemoteObject _articulosel;
RemoteObject _descripcionarticulosel;
RemoteObject _stipotarifasel = RemoteObject.createImmutable("");
RemoteObject _numpreciosart = RemoteObject.createImmutable(0);
RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _numpreciosarttalla = RemoteObject.createImmutable(0);
RemoteObject _numminqty = RemoteObject.createImmutable(0);
RemoteObject _numpreciosdivisa = RemoteObject.createImmutable(0);
RemoteObject _numpreciosumdifumvta = RemoteObject.createImmutable(0);
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _rsdata = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,174);
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
Debug.locals.put("TipoTarifaSel", _tipotarifasel);
Debug.locals.put("CodigoTarifaSel", _codigotarifasel);
Debug.locals.put("ArticuloSel", _articulosel);
Debug.locals.put("DescripcionArticuloSel", _descripcionarticulosel);
 BA.debugLineNum = 177;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando datos tarifas...")));
 BA.debugLineNum = 178;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 180;BA.debugLine="Dim sTipoTarifaSel As String";
Debug.ShouldStop(524288);
_stipotarifasel = RemoteObject.createImmutable("");Debug.locals.put("sTipoTarifaSel", _stipotarifasel);
 BA.debugLineNum = 181;BA.debugLine="If TipoTarifaSel=0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_tipotarifasel,BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 182;BA.debugLine="sTipoTarifaSel=\"Cliente\"";
Debug.ShouldStop(2097152);
_stipotarifasel = BA.ObjectToString("Cliente");Debug.locals.put("sTipoTarifaSel", _stipotarifasel);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 184;BA.debugLine="sTipoTarifaSel=\"GRP\"";
Debug.ShouldStop(8388608);
_stipotarifasel = BA.ObjectToString("GRP");Debug.locals.put("sTipoTarifaSel", _stipotarifasel);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 186;BA.debugLine="txtTipoTarifaAvisos.Text=sTipoTarifaSel";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txttipotarifaavisos" /*RemoteObject*/ ).runMethod(true,"setText",_stipotarifasel);
 BA.debugLineNum = 187;BA.debugLine="txtCodigoTarifaAvisos.Text=CodigoTarifaSel";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtcodigotarifaavisos" /*RemoteObject*/ ).runMethod(true,"setText",_codigotarifasel);
 BA.debugLineNum = 188;BA.debugLine="txtArticuloAvisos.Text=ArticuloSel";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtarticuloavisos" /*RemoteObject*/ ).runMethod(true,"setText",_articulosel);
 BA.debugLineNum = 189;BA.debugLine="txtDescripcionArticuloAvisos.Text=DescripcionArti";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtdescripcionarticuloavisos" /*RemoteObject*/ ).runMethod(true,"setText",_descripcionarticulosel);
 BA.debugLineNum = 192;BA.debugLine="Dim NumPreciosArt As Int=Utilidades.FixNullInt(mS";
Debug.ShouldStop(-2147483648);
_numpreciosart = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NumPreciosArt from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.NumberToString(_tipotarifasel),_codigotarifasel,_articulosel}))))))));Debug.locals.put("NumPreciosArt", _numpreciosart);Debug.locals.put("NumPreciosArt", _numpreciosart);
 BA.debugLineNum = 194;BA.debugLine="txtNumPrecios.Text=NumPreciosArt";
Debug.ShouldStop(2);
__ref.getField(false,"_txtnumprecios" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_numpreciosart));
 BA.debugLineNum = 195;BA.debugLine="Dim tF As B4XView=txtNumPrecios";
Debug.ShouldStop(4);
_tf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnumprecios" /*RemoteObject*/ ).getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 196;BA.debugLine="If NumPreciosArt>1 Then";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",_numpreciosart,BA.numberCast(double.class, 1))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 197;BA.debugLine="tF.Color=xui.Color_Red";
Debug.ShouldStop(16);
_tf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 198;BA.debugLine="tF.TextColor=xui.Color_White";
Debug.ShouldStop(32);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 200;BA.debugLine="tF.Color=0xFF00FA9A";
Debug.ShouldStop(128);
_tf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff00fa9a)));
 BA.debugLineNum = 201;BA.debugLine="tF.TextColor=xui.Color_Black";
Debug.ShouldStop(256);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 204;BA.debugLine="Dim NumPreciosArtTalla As Int=Utilidades.FixNullI";
Debug.ShouldStop(2048);
_numpreciosarttalla = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NumPreciosArtTalla from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.NumberToString(_tipotarifasel),_codigotarifasel,_articulosel}))))))));Debug.locals.put("NumPreciosArtTalla", _numpreciosarttalla);Debug.locals.put("NumPreciosArtTalla", _numpreciosarttalla);
 BA.debugLineNum = 206;BA.debugLine="txtNumPreciosArtTalla.text=NumPreciosArtTalla";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtnumpreciosarttalla" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_numpreciosarttalla));
 BA.debugLineNum = 207;BA.debugLine="Dim tF As B4XView=txtNumPreciosArtTalla";
Debug.ShouldStop(16384);
_tf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnumpreciosarttalla" /*RemoteObject*/ ).getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 208;BA.debugLine="If NumPreciosArtTalla>0 Then";
Debug.ShouldStop(32768);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",_numpreciosarttalla,BA.numberCast(double.class, 0))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 209;BA.debugLine="tF.Color=xui.Color_Red";
Debug.ShouldStop(65536);
_tf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 210;BA.debugLine="tF.TextColor=xui.Color_White";
Debug.ShouldStop(131072);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 212;BA.debugLine="tF.Color=0xFF00FA9A";
Debug.ShouldStop(524288);
_tf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff00fa9a)));
 BA.debugLineNum = 213;BA.debugLine="tF.TextColor=xui.Color_Black";
Debug.ShouldStop(1048576);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 216;BA.debugLine="Dim NumMinQty As Int=Utilidades.FixNullInt(mSQL.E";
Debug.ShouldStop(8388608);
_numminqty = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NumPreciosQtyMin from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.NumberToString(_tipotarifasel),_codigotarifasel,_articulosel}))))))));Debug.locals.put("NumMinQty", _numminqty);Debug.locals.put("NumMinQty", _numminqty);
 BA.debugLineNum = 218;BA.debugLine="txtNumMinQty.text=NumMinQty";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txtnumminqty" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_numminqty));
 BA.debugLineNum = 219;BA.debugLine="Dim tF As B4XView=txtNumMinQty";
Debug.ShouldStop(67108864);
_tf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnumminqty" /*RemoteObject*/ ).getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 220;BA.debugLine="If NumMinQty>0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean(">",_numminqty,BA.numberCast(double.class, 0))) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 221;BA.debugLine="tF.Color=xui.Color_Red";
Debug.ShouldStop(268435456);
_tf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 222;BA.debugLine="tF.TextColor=xui.Color_White";
Debug.ShouldStop(536870912);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 224;BA.debugLine="tF.Color=0xFF00FA9A";
Debug.ShouldStop(-2147483648);
_tf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff00fa9a)));
 BA.debugLineNum = 225;BA.debugLine="tF.TextColor=xui.Color_Black";
Debug.ShouldStop(1);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 229;BA.debugLine="Dim NumPreciosDivisa As Int=Utilidades.FixNullInt";
Debug.ShouldStop(16);
_numpreciosdivisa = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NumPreciosDivisa from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.NumberToString(_tipotarifasel),_codigotarifasel,_articulosel}))))))));Debug.locals.put("NumPreciosDivisa", _numpreciosdivisa);Debug.locals.put("NumPreciosDivisa", _numpreciosdivisa);
 BA.debugLineNum = 231;BA.debugLine="txtNumPreciosDivisa.text=NumPreciosDivisa";
Debug.ShouldStop(64);
__ref.getField(false,"_txtnumpreciosdivisa" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_numpreciosdivisa));
 BA.debugLineNum = 232;BA.debugLine="Dim tF As B4XView=txtNumPreciosDivisa";
Debug.ShouldStop(128);
_tf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnumpreciosdivisa" /*RemoteObject*/ ).getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 233;BA.debugLine="If NumPreciosDivisa>0 Then";
Debug.ShouldStop(256);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean(">",_numpreciosdivisa,BA.numberCast(double.class, 0))) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 234;BA.debugLine="tF.Color=xui.Color_Red";
Debug.ShouldStop(512);
_tf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 235;BA.debugLine="tF.TextColor=xui.Color_White";
Debug.ShouldStop(1024);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 237;BA.debugLine="tF.Color=0xFF00FA9A";
Debug.ShouldStop(4096);
_tf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff00fa9a)));
 BA.debugLineNum = 238;BA.debugLine="tF.TextColor=xui.Color_Black";
Debug.ShouldStop(8192);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 243;BA.debugLine="Dim NumPreciosUMDifUMVta As Int=Utilidades.FixNul";
Debug.ShouldStop(262144);
_numpreciosumdifumvta = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NumPreciosUMDifUMVta from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.NumberToString(_tipotarifasel),_codigotarifasel,_articulosel}))))))));Debug.locals.put("NumPreciosUMDifUMVta", _numpreciosumdifumvta);Debug.locals.put("NumPreciosUMDifUMVta", _numpreciosumdifumvta);
 BA.debugLineNum = 245;BA.debugLine="txtNumPreciosUMDifUMVta.text=NumPreciosUMDifUMVta";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtnumpreciosumdifumvta" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_numpreciosumdifumvta));
 BA.debugLineNum = 246;BA.debugLine="Dim tF As B4XView=txtNumPreciosUMDifUMVta";
Debug.ShouldStop(2097152);
_tf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnumpreciosumdifumvta" /*RemoteObject*/ ).getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 247;BA.debugLine="If NumPreciosUMDifUMVta>0 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean(">",_numpreciosumdifumvta,BA.numberCast(double.class, 0))) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
 BA.debugLineNum = 248;BA.debugLine="tF.Color=xui.Color_Red";
Debug.ShouldStop(8388608);
_tf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 249;BA.debugLine="tF.TextColor=xui.Color_White";
Debug.ShouldStop(16777216);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 251;BA.debugLine="tF.Color=0xFF00FA9A";
Debug.ShouldStop(67108864);
_tf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff00fa9a)));
 BA.debugLineNum = 252;BA.debugLine="tF.TextColor=xui.Color_Black";
Debug.ShouldStop(134217728);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 if (true) break;

case 36:
//C
this.state = 37;
;
 BA.debugLineNum = 257;BA.debugLine="wait for (CargaLineasTarifaVentaTipoTarifaCodigoT";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "datoslineastarifasavisostipotarifacodigotarifaarticulo"), __ref.runClassMethod (b4j.docU.canalisistarifasavisostarifaventa.class, "_cargalineastarifaventatipotarifacodigotarifaarticulo" /*RemoteObject*/ ,(Object)(_tipotarifasel),(Object)(_codigotarifasel),(Object)(_articulosel)));
this.state = 66;
return;
case 66:
//C
this.state = 37;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 258;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(2);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 259;BA.debugLine="Select Case Accion";
Debug.ShouldStop(4);
if (true) break;

case 37:
//select
this.state = 44;
switch (BA.switchObjectToInt(_accion,BA.ObjectToString("NOK"),BA.ObjectToString("SinDatos"),BA.ObjectToString("OK"))) {
case 0: {
this.state = 39;
if (true) break;
}
case 1: {
this.state = 41;
if (true) break;
}
case 2: {
this.state = 43;
if (true) break;
}
}
if (true) break;

case 39:
//C
this.state = 44;
 BA.debugLineNum = 261;BA.debugLine="SalirModulo";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifaventa.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 262;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 41:
//C
this.state = 44;
 if (true) break;

case 43:
//C
this.state = 44;
 if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 270;BA.debugLine="Dim rsData As ResultSet=mSQL.ExecQuery(\"select *";
Debug.ShouldStop(8192);
_rsdata = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdata = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo")));Debug.locals.put("rsData", _rsdata);Debug.locals.put("rsData", _rsdata);
 BA.debugLineNum = 272;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasTarifa";
Debug.ShouldStop(32768);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rsdata.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 273;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "datoslineastarifasavisostipotarifacodigotarifaarticulo"), _rsub);
this.state = 67;
return;
case 67:
//C
this.state = 45;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 274;BA.debugLine="rsData.Close";
Debug.ShouldStop(131072);
_rsdata.runVoidMethod ("Close");
 BA.debugLineNum = 275;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 276;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(524288);
if (true) break;

case 45:
//if
this.state = 65;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 277;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(1048576);
if (true) break;

case 48:
//if
this.state = 55;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 278;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 279;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "datoslineastarifasavisostipotarifacodigotarifaarticulo"), _msa);
this.state = 68;
return;
case 68:
//C
this.state = 51;
;
 BA.debugLineNum = 281;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 282;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "datoslineastarifasavisostipotarifacodigotarifaarticulo"), _msa);
this.state = 69;
return;
case 69:
//C
this.state = 51;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 283;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(67108864);
if (true) break;

case 51:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 284;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarif";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 285;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 288;BA.debugLine="ExitApplication";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 290;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(2);

case 55:
//if
this.state = 64;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 291;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(4);
if (true) break;

case 58:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 60;
;}if (true) break;

case 60:
//C
this.state = 63;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 63:
//C
this.state = 64;
;
 BA.debugLineNum = 292;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 293;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "datoslineastarifasavisostipotarifacodigotarifaarticulo"), _msa);
this.state = 70;
return;
case 70:
//C
this.state = 64;
;
 if (true) break;

case 64:
//C
this.state = 65;
;
 if (true) break;

case 65:
//C
this.state = -1;
;
 BA.debugLineNum = 298;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 300;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "canalisistarifasavisostarifaventa","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 152;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="EventData.Consume";
Debug.ShouldStop(16777216);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("getForm (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("getform")) { return __ref.runUserSub(false, "canalisistarifasavisostarifaventa","getform", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Sub getForm As Form";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Return mFrmParent";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_mfrmparent" /*RemoteObject*/ );
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _parent,RemoteObject _frmparent,RemoteObject _idanalisisventa,RemoteObject _tipotarifa,RemoteObject _codigotarifa,RemoteObject _articulo,RemoteObject _descripcionarticulo) throws Exception{
try {
		Debug.PushSubsStack("Initialize (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "canalisistarifasavisostarifaventa","initialize", __ref, _ba, _callback, _parent, _frmparent, _idanalisisventa, _tipotarifa, _codigotarifa, _articulo, _descripcionarticulo);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Parent", _parent);
Debug.locals.put("frmParent", _frmparent);
Debug.locals.put("IDAnalisisVenta", _idanalisisventa);
Debug.locals.put("TipoTarifa", _tipotarifa);
Debug.locals.put("CodigoTarifa", _codigotarifa);
Debug.locals.put("Articulo", _articulo);
Debug.locals.put("DescripcionArticulo", _descripcionarticulo);
 BA.debugLineNum = 60;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="mCallBack=CallBack";
Debug.ShouldStop(536870912);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 63;BA.debugLine="mParent=Parent";
Debug.ShouldStop(1073741824);
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 65;BA.debugLine="mFrmParent=frmParent";
Debug.ShouldStop(1);
__ref.setField ("_mfrmparent" /*RemoteObject*/ ,_frmparent);
 BA.debugLineNum = 67;BA.debugLine="mIDAnalisisTarifasVenta=IDAnalisisVenta";
Debug.ShouldStop(4);
__ref.setField ("_midanalisistarifasventa" /*RemoteObject*/ ,_idanalisisventa);
 BA.debugLineNum = 68;BA.debugLine="mTipoTarifa=TipoTarifa";
Debug.ShouldStop(8);
__ref.setField ("_mtipotarifa" /*RemoteObject*/ ,_tipotarifa);
 BA.debugLineNum = 69;BA.debugLine="mCodigoTarifa=CodigoTarifa";
Debug.ShouldStop(16);
__ref.setField ("_mcodigotarifa" /*RemoteObject*/ ,_codigotarifa);
 BA.debugLineNum = 70;BA.debugLine="mArticulo=Articulo";
Debug.ShouldStop(32);
__ref.setField ("_marticulo" /*RemoteObject*/ ,_articulo);
 BA.debugLineNum = 71;BA.debugLine="mDescripcionArticulo=DescripcionArticulo";
Debug.ShouldStop(64);
__ref.setField ("_mdescripcionarticulo" /*RemoteObject*/ ,_descripcionarticulo);
 BA.debugLineNum = 73;BA.debugLine="Show";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifaventa.class, "_show" /*void*/ );
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo_ContextMenuItem_Action (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action")) { __ref.runUserSub(false, "canalisistarifasavisostarifaventa","jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo_ContextMenuItem_Action rsub = new ResumableSub_jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo_ContextMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo_ContextMenuItem_Action(b4j.docU.canalisistarifasavisostarifaventa parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasavisostarifaventa parent;
RemoteObject _tagmenuitem;
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _precioventausuario = RemoteObject.createImmutable(0);
RemoteObject _divisa = RemoteObject.createImmutable("");
RemoteObject _sdivisa = RemoteObject.createImmutable("");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo_ContextMenuItem_Action (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,354);
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
 BA.debugLineNum = 357;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(16);
if (true) break;

case 1:
//select
this.state = 16;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("AddPrecioLineaAListaPreciosVentaUsuario"))) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 360;BA.debugLine="Dim FilaSel As Int=jamTableViewLineasTarifasVen";
Debug.ShouldStop(128);
_filasel = __ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 361;BA.debugLine="Dim PrecioVentaUsuario As Double=jamTableViewLi";
Debug.ShouldStop(256);
_precioventausuario = BA.numberCast(double.class, __ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("PrecioUnitario"))));Debug.locals.put("PrecioVentaUsuario", _precioventausuario);Debug.locals.put("PrecioVentaUsuario", _precioventausuario);
 BA.debugLineNum = 362;BA.debugLine="Dim Divisa As String=jamTableViewLineasTarifasV";
Debug.ShouldStop(512);
_divisa = BA.ObjectToString(__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Moneda"))));Debug.locals.put("Divisa", _divisa);Debug.locals.put("Divisa", _divisa);
 BA.debugLineNum = 363;BA.debugLine="Dim sDivisa As String=IIf(Divisa=\"\",\"EUR\",Divis";
Debug.ShouldStop(1024);
_sdivisa = BA.ObjectToString(((RemoteObject.solveBoolean("=",_divisa,BA.ObjectToString(""))) ? (RemoteObject.createImmutable(("EUR"))) : ((_divisa))));Debug.locals.put("sDivisa", _sdivisa);Debug.locals.put("sDivisa", _sdivisa);
 BA.debugLineNum = 365;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\", _ $\"";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("¿Grabar el precio de la línea "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_precioventausuario))),RemoteObject.createImmutable(" ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdivisa))),RemoteObject.createImmutable(") como precio venta usuario?")))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 367;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 370;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"A";
Debug.ShouldStop(131072);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("AnalisisTarifasNuevoEditarPrecioUsuarioVentas")),(Object)(RemoteObject.createNewArray("Object",new int[] {12},new Object[] {(__ref.getField(true,"_midanalisistarifasventa" /*RemoteObject*/ )),(__ref.getField(true,"_mtipotarifa" /*RemoteObject*/ )),(__ref.getField(true,"_mcodigotarifa" /*RemoteObject*/ )),(__ref.getField(true,"_marticulo" /*RemoteObject*/ )),(_precioventausuario),(_divisa),(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreADUsuarioWindows" /*RemoteObject*/ )),(_precioventausuario),(_divisa),(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreADUsuarioWindows" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 373;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNa";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 374;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(2097152);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 375;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible crear el nuevo precio de venta usuario indicado.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 376;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 15;
;
 BA.debugLineNum = 377;BA.debugLine="DatosEditados=False";
Debug.ShouldStop(16777216);
__ref.setField ("_datoseditados" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 379;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Precio de";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Precio de venta usuario grabado ("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_precioventausuario))),RemoteObject.createImmutable(")")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 380;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 15;
;
 BA.debugLineNum = 381;BA.debugLine="DatosEditados=True";
Debug.ShouldStop(268435456);
__ref.setField ("_datoseditados" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 384;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SalirModulo (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "canalisistarifasavisostarifaventa","salirmodulo", __ref);}
 BA.debugLineNum = 160;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="If jamTableViewLineasTarifasVentaValidasTipoTarif";
Debug.ShouldStop(1);
if (__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 162;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaC";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 };
 BA.debugLineNum = 166;BA.debugLine="Background.RemoveViewFromParent";
Debug.ShouldStop(32);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 168;BA.debugLine="CallSubDelayed2(mCallBack,\"cAnalisisTarifasAvisos";
Debug.ShouldStop(128);
canalisistarifasavisostarifaventa.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("cAnalisisTarifasAvisosTarifaVenta_Done")),(Object)((__ref.getField(true,"_datoseditados" /*RemoteObject*/ ))));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Show (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "canalisistarifasavisostarifaventa","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.canalisistarifasavisostarifaventa parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasavisostarifaventa parent;
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (canalisistarifasavisostarifaventa) ","canalisistarifasavisostarifaventa",18,__ref.getField(false, "ba"),__ref,80);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 82;BA.debugLine="Background= xui.CreatePanel(\"Background\")";
Debug.ShouldStop(131072);
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Background"))));
 BA.debugLineNum = 83;BA.debugLine="Background.Tag = \"AnalisisTarifasAvisosTarifaVent";
Debug.ShouldStop(262144);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("AnalisisTarifasAvisosTarifaVenta_background")));
 BA.debugLineNum = 85;BA.debugLine="Background.Color=xui.Color_Transparent";
Debug.ShouldStop(1048576);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 86;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 88;BA.debugLine="Base=xui.CreatePanel(\"pnlBase\")";
Debug.ShouldStop(8388608);
__ref.setField ("_base" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlBase"))));
 BA.debugLineNum = 89;BA.debugLine="Base.SetLayoutAnimated(0,0,0,Background.Width, Ba";
Debug.ShouldStop(16777216);
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 90;BA.debugLine="Base.LoadLayout(\"scrAnalisisTarifasInfoTarifasVen";
Debug.ShouldStop(33554432);
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrAnalisisTarifasInfoTarifasVentaValidasTipoTarifaCodigoTarifaArticulo")),__ref.getField(false, "ba"));
 BA.debugLineNum = 91;BA.debugLine="Sleep(0)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "show"),BA.numberCast(int.class, 0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 BA.debugLineNum = 92;BA.debugLine="Background.AddView(Base,Background.Width/2-Base.W";
Debug.ShouldStop(134217728);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_base" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/-/",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/-/",1, 0)),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 94;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 95;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 97;BA.debugLine="txtTipoTarifaAvisos.Alignment=\"CENTER\"";
Debug.ShouldStop(1);
__ref.getField(false,"_txttipotarifaavisos" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 98;BA.debugLine="txtCodigoTarifaAvisos.Alignment=\"CENTER\"";
Debug.ShouldStop(2);
__ref.getField(false,"_txtcodigotarifaavisos" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 99;BA.debugLine="txtArticuloAvisos.Alignment=\"CENTER\"";
Debug.ShouldStop(4);
__ref.getField(false,"_txtarticuloavisos" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 100;BA.debugLine="txtNumPrecios.Alignment=\"CENTER_RIGHT\"";
Debug.ShouldStop(8);
__ref.getField(false,"_txtnumprecios" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 101;BA.debugLine="txtNumPreciosArtTalla.Alignment=\"CENTER_RIGHT\"";
Debug.ShouldStop(16);
__ref.getField(false,"_txtnumpreciosarttalla" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 102;BA.debugLine="txtNumPreciosDivisa.Alignment=\"CENTER_RIGHT\"";
Debug.ShouldStop(32);
__ref.getField(false,"_txtnumpreciosdivisa" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 103;BA.debugLine="txtNumMinQty.Alignment=\"CENTER_RIGHT\"";
Debug.ShouldStop(64);
__ref.getField(false,"_txtnumminqty" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 104;BA.debugLine="txtNumPreciosUMDifUMVta.Alignment=\"CENTER_RIGHT\"";
Debug.ShouldStop(128);
__ref.getField(false,"_txtnumpreciosumdifumvta" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 113;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).getField(true,"_menubartabla" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 114;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 115;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 118;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasTarifa";
Debug.ShouldStop(2097152);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaAnalisisTarifasListaTarifasTipoTarifaCodigoTarifaArticulo.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 119;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 120;BA.debugLine="Log(mRes)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","844761128",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 121;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 10;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 122;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 123;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifaventa", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 10;
;
 BA.debugLineNum = 124;BA.debugLine="SalirModulo";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifaventa.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 125;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 128;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 130;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(2);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 131;BA.debugLine="CF.Initialize";
Debug.ShouldStop(4);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 132;BA.debugLine="CF.NombreFuncionCellFactory=jamTableViewLineasTar";
Debug.ShouldStop(8);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).getField(true,"_cellfactory_columnafecha" /*RemoteObject*/ ));
 BA.debugLineNum = 133;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("FechaInicial"),RemoteObject.createImmutable("FechaFinal")})))));
 BA.debugLineNum = 135;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
Debug.ShouldStop(64);
__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 136;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Añadir Precio de Línea a Lista Precios Venta Usuario")),(Object)(BA.ObjectToString("AddPrecioLineaAListaPreciosVentaUsuario")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf071)))))));
 BA.debugLineNum = 138;BA.debugLine="Dialog.Initialize(Base)";
Debug.ShouldStop(512);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )));
 BA.debugLineNum = 139;BA.debugLine="jamLoadingIndicator1.Initialize(Me,Base)";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )));
 BA.debugLineNum = 143;BA.debugLine="DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArt";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifaventa.class, "_datoslineastarifasavisostipotarifacodigotarifaarticulo" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtipotarifa" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mcodigotarifa" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_marticulo" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mdescripcionarticulo" /*RemoteObject*/ )));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
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
}