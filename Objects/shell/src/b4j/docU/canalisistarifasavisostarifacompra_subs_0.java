package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class canalisistarifasavisostarifacompra_subs_0 {


public static void  _addeditarcostearticulousuariovalor(RemoteObject __ref,RemoteObject _articulo,RemoteObject _valor) throws Exception{
try {
		Debug.PushSubsStack("AddEditarCosteArticuloUsuarioValor (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,417);
if (RapidSub.canDelegate("addeditarcostearticulousuariovalor")) { __ref.runUserSub(false, "canalisistarifasavisostarifacompra","addeditarcostearticulousuariovalor", __ref, _articulo, _valor); return;}
ResumableSub_AddEditarCosteArticuloUsuarioValor rsub = new ResumableSub_AddEditarCosteArticuloUsuarioValor(null,__ref,_articulo,_valor);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AddEditarCosteArticuloUsuarioValor extends BA.ResumableSub {
public ResumableSub_AddEditarCosteArticuloUsuarioValor(b4j.docU.canalisistarifasavisostarifacompra parent,RemoteObject __ref,RemoteObject _articulo,RemoteObject _valor) {
this.parent = parent;
this.__ref = __ref;
this._articulo = _articulo;
this._valor = _valor;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
RemoteObject _articulo;
RemoteObject _valor;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _existecostearticulousuario = RemoteObject.createImmutable(false);
RemoteObject _smsg = RemoteObject.createImmutable("");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _costearticulousu = RemoteObject.createImmutable(0);
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AddEditarCosteArticuloUsuarioValor (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,417);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Articulo", _articulo);
Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 418;BA.debugLine="DatosEditados=False";
Debug.ShouldStop(2);
__ref.setField ("_datoseditados" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 419;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
Debug.ShouldStop(4);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",(RemoteObject.concat(RemoteObject.createImmutable("Cargando datos coste artículo usuario para artículo "),_articulo,RemoteObject.createImmutable("..."))));
 BA.debugLineNum = 420;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(8);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 421;BA.debugLine="Wait For (CosteArticuloUsuario(Articulo)) complet";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), __ref.runClassMethod (b4j.docU.canalisistarifasavisostarifacompra.class, "_costearticulousuario" /*RemoteObject*/ ,(Object)(_articulo)));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 422;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 423;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(64);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 424;BA.debugLine="If Accion=\"NOK\" Then Return";
Debug.ShouldStop(128);
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
this.state = 7;
;
 BA.debugLineNum = 430;BA.debugLine="Dim ExisteCosteArticuloUsuario As Boolean";
Debug.ShouldStop(8192);
_existecostearticulousuario = RemoteObject.createImmutable(false);Debug.locals.put("ExisteCosteArticuloUsuario", _existecostearticulousuario);
 BA.debugLineNum = 431;BA.debugLine="If Accion=\"SinCosteArticuloUsuario\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 7:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("SinCosteArticuloUsuario"))) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 432;BA.debugLine="Dim sMsg As String=$\"No existe coste artículo us";
Debug.ShouldStop(32768);
_smsg = (RemoteObject.concat(RemoteObject.createImmutable("No existe coste artículo usuario para el artículo seleccionado.\n"),RemoteObject.createImmutable("¿Grabar uno nuevo="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_valor))),RemoteObject.createImmutable("?")));Debug.locals.put("sMsg", _smsg);Debug.locals.put("sMsg", _smsg);
 BA.debugLineNum = 434;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",sMsg,\"";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)(_smsg),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 36;
return;
case 36:
//C
this.state = 10;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 435;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(262144);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 24;
;
 BA.debugLineNum = 441;BA.debugLine="ExisteCosteArticuloUsuario=False";
Debug.ShouldStop(16777216);
_existecostearticulousuario = parent.__c.getField(true,"False");Debug.locals.put("ExisteCosteArticuloUsuario", _existecostearticulousuario);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 444;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(134217728);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 445;BA.debugLine="Dim mP As Map=lstReg.Get(0)";
Debug.ShouldStop(268435456);
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mP", _mp);Debug.locals.put("mP", _mp);
 BA.debugLineNum = 446;BA.debugLine="Dim CosteArticuloUsu As Double=mP.Get(\"CosteUnit";
Debug.ShouldStop(536870912);
_costearticulousu = BA.numberCast(double.class, _mp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CosteUnitarioUsuario")))));Debug.locals.put("CosteArticuloUsu", _costearticulousu);Debug.locals.put("CosteArticuloUsu", _costearticulousu);
 BA.debugLineNum = 447;BA.debugLine="ExisteCosteArticuloUsuario=True";
Debug.ShouldStop(1073741824);
_existecostearticulousuario = parent.__c.getField(true,"True");Debug.locals.put("ExisteCosteArticuloUsuario", _existecostearticulousuario);
 BA.debugLineNum = 448;BA.debugLine="Dim sMsg As String=$\"Ya existe coste artículo us";
Debug.ShouldStop(-2147483648);
_smsg = (RemoteObject.concat(RemoteObject.createImmutable("Ya existe coste artículo usuario para el artículo seleccionado ( "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_costearticulousu))),RemoteObject.createImmutable(" ).\n"),RemoteObject.createImmutable("¿Cambiarlo por el valor "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_valor))),RemoteObject.createImmutable("?")));Debug.locals.put("sMsg", _smsg);Debug.locals.put("sMsg", _smsg);
 BA.debugLineNum = 450;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",sMsg,\"";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)(_smsg),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 37;
return;
case 37:
//C
this.state = 18;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 451;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(4);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) return ;
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
 BA.debugLineNum = 459;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",(RemoteObject.concat(RemoteObject.createImmutable("Actualizando coste artículo usuario para artículo "),_articulo,RemoteObject.createImmutable("..."))));
 BA.debugLineNum = 460;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 461;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Ana";
Debug.ShouldStop(4096);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("AnalisisTarifasNuevoEditarCosteArticuloUsuario")),(Object)(RemoteObject.createNewArray("Object",new int[] {8},new Object[] {(__ref.getField(true,"_midanalisistarifasventa" /*RemoteObject*/ )),(_articulo),(_valor),(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreADUsuarioWindows" /*RemoteObject*/ )),(_valor),(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreADUsuarioWindows" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 464;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 38;
return;
case 38:
//C
this.state = 25;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 465;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 466;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(131072);
if (true) break;

case 25:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 467;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible grabar el nuevo coste artículo usuario indicado.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 468;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 28;
;
 BA.debugLineNum = 469;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 485;BA.debugLine="DatosEditados=True";
Debug.ShouldStop(16);
__ref.setField ("_datoseditados" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 487;BA.debugLine="Dim sMsg As String";
Debug.ShouldStop(64);
_smsg = RemoteObject.createImmutable("");Debug.locals.put("sMsg", _smsg);
 BA.debugLineNum = 488;BA.debugLine="If ExisteCosteArticuloUsuario=False Then";
Debug.ShouldStop(128);
if (true) break;

case 29:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_existecostearticulousuario,parent.__c.getField(true,"False"))) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 34;
 BA.debugLineNum = 489;BA.debugLine="sMsg=$\"Se ha grabado el nuevo coste artículo usu";
Debug.ShouldStop(256);
_smsg = (RemoteObject.concat(RemoteObject.createImmutable("Se ha grabado el nuevo coste artículo usuario.\n"),RemoteObject.createImmutable("Para ver el efecto del cambio, actualiza la tabla.")));Debug.locals.put("sMsg", _smsg);
 BA.debugLineNum = 491;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sMsg ,\"Aviso\")";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_smsg),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 492;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 494;BA.debugLine="sMsg=$\"Se ha actualizado el valor del coste artí";
Debug.ShouldStop(8192);
_smsg = (RemoteObject.concat(RemoteObject.createImmutable("Se ha actualizado el valor del coste artículo usuario.\n"),RemoteObject.createImmutable("Para ver el efecto del cambio, actualiza la tabla.")));Debug.locals.put("sMsg", _smsg);
 BA.debugLineNum = 496;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sMsg,\"Aviso\")";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_smsg),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 497;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
 BA.debugLineNum = 500;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _asjo(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("asJO (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "canalisistarifasavisostarifacompra","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 156;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="Return o";
Debug.ShouldStop(268435456);
if (true) return _o;
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("btnSalir_Click (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "canalisistarifasavisostarifacompra","btnsalir_click", __ref);}
 BA.debugLineNum = 165;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="SalirModulo";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifacompra.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsalirinfoavisostarifascompravalidasarticulo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalirInfoAvisosTarifasCompraValidasArticulo_Click (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("btnsalirinfoavisostarifascompravalidasarticulo_click")) { return __ref.runUserSub(false, "canalisistarifasavisostarifacompra","btnsalirinfoavisostarifascompravalidasarticulo_click", __ref);}
 BA.debugLineNum = 342;BA.debugLine="Private Sub btnSalirInfoAvisosTarifasCompraValidas";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="SalirModulo";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifacompra.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargalineastarifacompraarticulo(RemoteObject __ref,RemoteObject _articulosel) throws Exception{
try {
		Debug.PushSubsStack("CargaLineasTarifaCompraArticulo (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,303);
if (RapidSub.canDelegate("cargalineastarifacompraarticulo")) { return __ref.runUserSub(false, "canalisistarifasavisostarifacompra","cargalineastarifacompraarticulo", __ref, _articulosel);}
ResumableSub_CargaLineasTarifaCompraArticulo rsub = new ResumableSub_CargaLineasTarifaCompraArticulo(null,__ref,_articulosel);
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
public static class ResumableSub_CargaLineasTarifaCompraArticulo extends BA.ResumableSub {
public ResumableSub_CargaLineasTarifaCompraArticulo(b4j.docU.canalisistarifasavisostarifacompra parent,RemoteObject __ref,RemoteObject _articulosel) {
this.parent = parent;
this.__ref = __ref;
this._articulosel = _articulosel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
RemoteObject _articulosel;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaLineasTarifaCompraArticulo (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,303);
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
Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 305;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblAnalisisTarifas";
Debug.ShouldStop(65536);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblAnalisisTarifasLineasTarifasCompraArticulo")));
 BA.debugLineNum = 306;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(131072);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 307;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(262144);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 308;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 309;BA.debugLine="Dim Comando As String=\"TarifasCompraValidasActual";
Debug.ShouldStop(1048576);
_comando = BA.ObjectToString("TarifasCompraValidasActualesYFuturasUltimaFechaInicialArticulo");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 310;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(2097152);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_articulosel)})),(Object)(__ref));
 BA.debugLineNum = 312;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "cargalineastarifacompraarticulo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 314;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 315;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 316;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 317;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "cargalineastarifacompraarticulo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 318;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 319;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 322;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 323;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(4);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 324;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"NO hay línea";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NO hay líneas de tarifas de compra válidas para los datos seleccionados (Artículo: "),_articulosel,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 325;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "cargalineastarifacompraarticulo"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 326;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(32);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 327;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 329;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(256);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 332;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 333;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 335;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(16384);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblAnalisisTarifasLineasTarifasCompraArticulo")),(Object)(_lstreg));
 BA.debugLineNum = 336;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisTarifasLi";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAnalisisTarifasLineasTarifasCompraArticulo set IDAnalisisTarifas=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(__ref.getField(true,"_midanalisistarifasventa" /*RemoteObject*/ ))})))));
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
 BA.debugLineNum = 339;BA.debugLine="Return mRes";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 340;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
canalisistarifasavisostarifacompra._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",canalisistarifasavisostarifacompra._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
canalisistarifasavisostarifacompra._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",canalisistarifasavisostarifacompra._xui);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object";
canalisistarifasavisostarifacompra._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",canalisistarifasavisostarifacompra._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Private mParent As B4XView";
canalisistarifasavisostarifacompra._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",canalisistarifasavisostarifacompra._mparent);
 //BA.debugLineNum = 10;BA.debugLine="Dim Background As B4XView";
canalisistarifasavisostarifacompra._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",canalisistarifasavisostarifacompra._background);
 //BA.debugLineNum = 11;BA.debugLine="Dim Base As B4XView";
canalisistarifasavisostarifacompra._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",canalisistarifasavisostarifacompra._base);
 //BA.debugLineNum = 13;BA.debugLine="Dim mFrmParent As Form  '  necesario para el jamT";
canalisistarifasavisostarifacompra._mfrmparent = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_mfrmparent",canalisistarifasavisostarifacompra._mfrmparent);
 //BA.debugLineNum = 16;BA.debugLine="Private btnSalir As Button";
canalisistarifasavisostarifacompra._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",canalisistarifasavisostarifacompra._btnsalir);
 //BA.debugLineNum = 18;BA.debugLine="Dim Dialog As B4XDialog";
canalisistarifasavisostarifacompra._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",canalisistarifasavisostarifacompra._dialog);
 //BA.debugLineNum = 19;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
canalisistarifasavisostarifacompra._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",canalisistarifasavisostarifacompra._jamloadingindicator1);
 //BA.debugLineNum = 20;BA.debugLine="Private mSQL As SQL";
canalisistarifasavisostarifacompra._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",canalisistarifasavisostarifacompra._msql);
 //BA.debugLineNum = 24;BA.debugLine="Dim mIDAnalisisTarifasVenta As Int";
canalisistarifasavisostarifacompra._midanalisistarifasventa = RemoteObject.createImmutable(0);__ref.setField("_midanalisistarifasventa",canalisistarifasavisostarifacompra._midanalisistarifasventa);
 //BA.debugLineNum = 27;BA.debugLine="Dim mArticulo As String";
canalisistarifasavisostarifacompra._marticulo = RemoteObject.createImmutable("");__ref.setField("_marticulo",canalisistarifasavisostarifacompra._marticulo);
 //BA.debugLineNum = 28;BA.debugLine="Dim mDescripcionArticulo As String";
canalisistarifasavisostarifacompra._mdescripcionarticulo = RemoteObject.createImmutable("");__ref.setField("_mdescripcionarticulo",canalisistarifasavisostarifacompra._mdescripcionarticulo);
 //BA.debugLineNum = 31;BA.debugLine="Dim DatosEditados As Boolean";
canalisistarifasavisostarifacompra._datoseditados = RemoteObject.createImmutable(false);__ref.setField("_datoseditados",canalisistarifasavisostarifacompra._datoseditados);
 //BA.debugLineNum = 35;BA.debugLine="Private btnSalirInfoAvisosTarifasCompraValidasArt";
canalisistarifasavisostarifacompra._btnsalirinfoavisostarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnsalirinfoavisostarifascompravalidasarticulo",canalisistarifasavisostarifacompra._btnsalirinfoavisostarifascompravalidasarticulo);
 //BA.debugLineNum = 36;BA.debugLine="Private jamTableViewLineasTarifasCompraValidasArt";
canalisistarifasavisostarifacompra._jamtableviewlineastarifascompravalidasarticulo = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewlineastarifascompravalidasarticulo",canalisistarifasavisostarifacompra._jamtableviewlineastarifascompravalidasarticulo);
 //BA.debugLineNum = 37;BA.debugLine="Private lblInfoAvisosTarifasCompraValidasArticulo";
canalisistarifasavisostarifacompra._lblinfoavisostarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblinfoavisostarifascompravalidasarticulo",canalisistarifasavisostarifacompra._lblinfoavisostarifascompravalidasarticulo);
 //BA.debugLineNum = 38;BA.debugLine="Private lblNumPreciosDivisaTarifasCompraValidasAr";
canalisistarifasavisostarifacompra._lblnumpreciosdivisatarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblnumpreciosdivisatarifascompravalidasarticulo",canalisistarifasavisostarifacompra._lblnumpreciosdivisatarifascompravalidasarticulo);
 //BA.debugLineNum = 39;BA.debugLine="Private lblTitleArticuloTarifasCompraValidasArtic";
canalisistarifasavisostarifacompra._lbltitlearticulotarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlearticulotarifascompravalidasarticulo",canalisistarifasavisostarifacompra._lbltitlearticulotarifascompravalidasarticulo);
 //BA.debugLineNum = 40;BA.debugLine="Private lblTitleDescripcionArticuloTarifasCompraV";
canalisistarifasavisostarifacompra._lbltitledescripcionarticulotarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitledescripcionarticulotarifascompravalidasarticulo",canalisistarifasavisostarifacompra._lbltitledescripcionarticulotarifascompravalidasarticulo);
 //BA.debugLineNum = 41;BA.debugLine="Private lblTitleNumMinQtyTarifasCompraValidasArti";
canalisistarifasavisostarifacompra._lbltitlenumminqtytarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlenumminqtytarifascompravalidasarticulo",canalisistarifasavisostarifacompra._lbltitlenumminqtytarifascompravalidasarticulo);
 //BA.debugLineNum = 42;BA.debugLine="Private lblTitleNumPreciosArtTallaTarifasCompraVa";
canalisistarifasavisostarifacompra._lbltitlenumpreciosarttallatarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlenumpreciosarttallatarifascompravalidasarticulo",canalisistarifasavisostarifacompra._lbltitlenumpreciosarttallatarifascompravalidasarticulo);
 //BA.debugLineNum = 43;BA.debugLine="Private lblTitleNumPreciosTarifasCompraValidasArt";
canalisistarifasavisostarifacompra._lbltitlenumpreciostarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlenumpreciostarifascompravalidasarticulo",canalisistarifasavisostarifacompra._lbltitlenumpreciostarifascompravalidasarticulo);
 //BA.debugLineNum = 44;BA.debugLine="Private lblTitleNumPreciosUMDifUMCompra As B4XVie";
canalisistarifasavisostarifacompra._lbltitlenumpreciosumdifumcompra = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlenumpreciosumdifumcompra",canalisistarifasavisostarifacompra._lbltitlenumpreciosumdifumcompra);
 //BA.debugLineNum = 45;BA.debugLine="Private pnlFondoDatosAvisosTarifasCompraValidasAr";
canalisistarifasavisostarifacompra._pnlfondodatosavisostarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlfondodatosavisostarifascompravalidasarticulo",canalisistarifasavisostarifacompra._pnlfondodatosavisostarifascompravalidasarticulo);
 //BA.debugLineNum = 46;BA.debugLine="Private pnljamTableViewAnalisisTarifasLineasTarif";
canalisistarifasavisostarifacompra._pnljamtableviewanalisistarifaslineastarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnljamtableviewanalisistarifaslineastarifascompravalidasarticulo",canalisistarifasavisostarifacompra._pnljamtableviewanalisistarifaslineastarifascompravalidasarticulo);
 //BA.debugLineNum = 47;BA.debugLine="Private txtArticuloAvisosTarifasCompraValidasArti";
canalisistarifasavisostarifacompra._txtarticuloavisostarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtarticuloavisostarifascompravalidasarticulo",canalisistarifasavisostarifacompra._txtarticuloavisostarifascompravalidasarticulo);
 //BA.debugLineNum = 48;BA.debugLine="Private txtDescripcionArticuloAvisosTarifasCompra";
canalisistarifasavisostarifacompra._txtdescripcionarticuloavisostarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdescripcionarticuloavisostarifascompravalidasarticulo",canalisistarifasavisostarifacompra._txtdescripcionarticuloavisostarifascompravalidasarticulo);
 //BA.debugLineNum = 49;BA.debugLine="Private txtNumMinQtyTarifasCompraValidasArticulo";
canalisistarifasavisostarifacompra._txtnumminqtytarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumminqtytarifascompravalidasarticulo",canalisistarifasavisostarifacompra._txtnumminqtytarifascompravalidasarticulo);
 //BA.debugLineNum = 50;BA.debugLine="Private txtNumPreciosArtTallaTarifasCompraValidas";
canalisistarifasavisostarifacompra._txtnumpreciosarttallatarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumpreciosarttallatarifascompravalidasarticulo",canalisistarifasavisostarifacompra._txtnumpreciosarttallatarifascompravalidasarticulo);
 //BA.debugLineNum = 51;BA.debugLine="Private txtNumPreciosDivisaTarifasCompraValidasAr";
canalisistarifasavisostarifacompra._txtnumpreciosdivisatarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumpreciosdivisatarifascompravalidasarticulo",canalisistarifasavisostarifacompra._txtnumpreciosdivisatarifascompravalidasarticulo);
 //BA.debugLineNum = 52;BA.debugLine="Private txtNumPreciosTarifasCompraValidasArticulo";
canalisistarifasavisostarifacompra._txtnumpreciostarifascompravalidasarticulo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumpreciostarifascompravalidasarticulo",canalisistarifasavisostarifacompra._txtnumpreciostarifascompravalidasarticulo);
 //BA.debugLineNum = 53;BA.debugLine="Private txtNumPreciosUMDifUMCompra As TextField";
canalisistarifasavisostarifacompra._txtnumpreciosumdifumcompra = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumpreciosumdifumcompra",canalisistarifasavisostarifacompra._txtnumpreciosumdifumcompra);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _costearticulousuario(RemoteObject __ref,RemoteObject _articulo) throws Exception{
try {
		Debug.PushSubsStack("CosteArticuloUsuario (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,502);
if (RapidSub.canDelegate("costearticulousuario")) { return __ref.runUserSub(false, "canalisistarifasavisostarifacompra","costearticulousuario", __ref, _articulo);}
ResumableSub_CosteArticuloUsuario rsub = new ResumableSub_CosteArticuloUsuario(null,__ref,_articulo);
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
public static class ResumableSub_CosteArticuloUsuario extends BA.ResumableSub {
public ResumableSub_CosteArticuloUsuario(b4j.docU.canalisistarifasavisostarifacompra parent,RemoteObject __ref,RemoteObject _articulo) {
this.parent = parent;
this.__ref = __ref;
this._articulo = _articulo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
RemoteObject _articulo;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CosteArticuloUsuario (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,502);
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
Debug.locals.put("Articulo", _articulo);
 BA.debugLineNum = 503;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4194304);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 504;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8388608);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 505;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 506;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(33554432);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 507;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(67108864);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 508;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 509;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 510;BA.debugLine="Dim Comando As String=\"AnalisisTarifasCosteArticu";
Debug.ShouldStop(536870912);
_comando = BA.ObjectToString("AnalisisTarifasCosteArticuloUsuario");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 511;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(1073741824);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_midanalisistarifasventa" /*RemoteObject*/ )),(_articulo)})),(Object)(__ref));
 BA.debugLineNum = 512;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "costearticulousuario"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 513;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 514;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 515;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 516;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "costearticulousuario"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 517;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 518;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 521;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 524;BA.debugLine="Accion=\"SinCosteArticuloUsuario\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("SinCosteArticuloUsuario");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 525;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 527;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16384);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 528;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 529;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 530;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 533;BA.debugLine="Return mRes";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 534;BA.debugLine="End Sub";
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
public static RemoteObject  _datoslineastarifascompraavisosarticulo(RemoteObject __ref,RemoteObject _articulosel,RemoteObject _descripcionarticulosel) throws Exception{
try {
		Debug.PushSubsStack("DatosLineasTarifasCompraAvisosArticulo (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("datoslineastarifascompraavisosarticulo")) { return __ref.runUserSub(false, "canalisistarifasavisostarifacompra","datoslineastarifascompraavisosarticulo", __ref, _articulosel, _descripcionarticulosel);}
ResumableSub_DatosLineasTarifasCompraAvisosArticulo rsub = new ResumableSub_DatosLineasTarifasCompraAvisosArticulo(null,__ref,_articulosel,_descripcionarticulosel);
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
public static class ResumableSub_DatosLineasTarifasCompraAvisosArticulo extends BA.ResumableSub {
public ResumableSub_DatosLineasTarifasCompraAvisosArticulo(b4j.docU.canalisistarifasavisostarifacompra parent,RemoteObject __ref,RemoteObject _articulosel,RemoteObject _descripcionarticulosel) {
this.parent = parent;
this.__ref = __ref;
this._articulosel = _articulosel;
this._descripcionarticulosel = _descripcionarticulosel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
RemoteObject _articulosel;
RemoteObject _descripcionarticulosel;
RemoteObject _numpreciosart = RemoteObject.createImmutable(0);
RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _numpreciosarttalla = RemoteObject.createImmutable(0);
RemoteObject _numminqty = RemoteObject.createImmutable(0);
RemoteObject _numpreciosdivisa = RemoteObject.createImmutable(0);
RemoteObject _numpreciosumdifumcompra = RemoteObject.createImmutable(0);
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
		Debug.PushSubsStack("DatosLineasTarifasCompraAvisosArticulo (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,182);
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
Debug.locals.put("ArticuloSel", _articulosel);
Debug.locals.put("DescripcionArticuloSel", _descripcionarticulosel);
 BA.debugLineNum = 185;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando datos tarifas...")));
 BA.debugLineNum = 186;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 189;BA.debugLine="txtArticuloAvisosTarifasCompraValidasArticulo.Tex";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtarticuloavisostarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setText",_articulosel);
 BA.debugLineNum = 190;BA.debugLine="txtDescripcionArticuloAvisosTarifasCompraValidasA";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtdescripcionarticuloavisostarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setText",_descripcionarticulosel);
 BA.debugLineNum = 193;BA.debugLine="Dim NumPreciosArt As Int=Utilidades.FixNullInt(mS";
Debug.ShouldStop(1);
_numpreciosart = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NumPreciosArt from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_articulosel}))))))));Debug.locals.put("NumPreciosArt", _numpreciosart);Debug.locals.put("NumPreciosArt", _numpreciosart);
 BA.debugLineNum = 195;BA.debugLine="txtNumPreciosTarifasCompraValidasArticulo.Text=Nu";
Debug.ShouldStop(4);
__ref.getField(false,"_txtnumpreciostarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_numpreciosart));
 BA.debugLineNum = 196;BA.debugLine="Dim tF As B4XView=txtNumPreciosTarifasCompraValid";
Debug.ShouldStop(8);
_tf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnumpreciostarifascompravalidasarticulo" /*RemoteObject*/ ).getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 197;BA.debugLine="If NumPreciosArt>1 Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_numpreciosart,BA.numberCast(double.class, 1))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 198;BA.debugLine="tF.Color=xui.Color_Red";
Debug.ShouldStop(32);
_tf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 199;BA.debugLine="tF.TextColor=xui.Color_White";
Debug.ShouldStop(64);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 201;BA.debugLine="tF.Color=0xFF00FA9A";
Debug.ShouldStop(256);
_tf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff00fa9a)));
 BA.debugLineNum = 202;BA.debugLine="tF.TextColor=xui.Color_Black";
Debug.ShouldStop(512);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 205;BA.debugLine="Dim NumPreciosArtTalla As Int=Utilidades.FixNullI";
Debug.ShouldStop(4096);
_numpreciosarttalla = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NumPreciosArtTalla from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_articulosel}))))))));Debug.locals.put("NumPreciosArtTalla", _numpreciosarttalla);Debug.locals.put("NumPreciosArtTalla", _numpreciosarttalla);
 BA.debugLineNum = 207;BA.debugLine="txtNumPreciosArtTallaTarifasCompraValidasArticulo";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtnumpreciosarttallatarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_numpreciosarttalla));
 BA.debugLineNum = 208;BA.debugLine="Dim tF As B4XView=txtNumPreciosArtTallaTarifasCom";
Debug.ShouldStop(32768);
_tf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnumpreciosarttallatarifascompravalidasarticulo" /*RemoteObject*/ ).getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 209;BA.debugLine="If NumPreciosArtTalla>0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",_numpreciosarttalla,BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 210;BA.debugLine="tF.Color=xui.Color_Red";
Debug.ShouldStop(131072);
_tf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 211;BA.debugLine="tF.TextColor=xui.Color_White";
Debug.ShouldStop(262144);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 213;BA.debugLine="tF.Color=0xFF00FA9A";
Debug.ShouldStop(1048576);
_tf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff00fa9a)));
 BA.debugLineNum = 214;BA.debugLine="tF.TextColor=xui.Color_Black";
Debug.ShouldStop(2097152);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 217;BA.debugLine="Dim NumMinQty As Int=Utilidades.FixNullInt(mSQL.E";
Debug.ShouldStop(16777216);
_numminqty = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NumPreciosQtyMin from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_articulosel}))))))));Debug.locals.put("NumMinQty", _numminqty);Debug.locals.put("NumMinQty", _numminqty);
 BA.debugLineNum = 219;BA.debugLine="txtNumMinQtyTarifasCompraValidasArticulo.text=Num";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtnumminqtytarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_numminqty));
 BA.debugLineNum = 220;BA.debugLine="Dim tF As B4XView=txtNumMinQtyTarifasCompraValida";
Debug.ShouldStop(134217728);
_tf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnumminqtytarifascompravalidasarticulo" /*RemoteObject*/ ).getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 221;BA.debugLine="If NumMinQty>0 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",_numminqty,BA.numberCast(double.class, 0))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 222;BA.debugLine="tF.Color=xui.Color_Red";
Debug.ShouldStop(536870912);
_tf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 223;BA.debugLine="tF.TextColor=xui.Color_White";
Debug.ShouldStop(1073741824);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 225;BA.debugLine="tF.Color=0xFF00FA9A";
Debug.ShouldStop(1);
_tf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff00fa9a)));
 BA.debugLineNum = 226;BA.debugLine="tF.TextColor=xui.Color_Black";
Debug.ShouldStop(2);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 230;BA.debugLine="Dim NumPreciosDivisa As Int=Utilidades.FixNullInt";
Debug.ShouldStop(32);
_numpreciosdivisa = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NumPreciosDivisa from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_articulosel}))))))));Debug.locals.put("NumPreciosDivisa", _numpreciosdivisa);Debug.locals.put("NumPreciosDivisa", _numpreciosdivisa);
 BA.debugLineNum = 232;BA.debugLine="txtNumPreciosDivisaTarifasCompraValidasArticulo.t";
Debug.ShouldStop(128);
__ref.getField(false,"_txtnumpreciosdivisatarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_numpreciosdivisa));
 BA.debugLineNum = 233;BA.debugLine="Dim tF As B4XView=txtNumPreciosDivisaTarifasCompr";
Debug.ShouldStop(256);
_tf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnumpreciosdivisatarifascompravalidasarticulo" /*RemoteObject*/ ).getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 234;BA.debugLine="If NumPreciosDivisa>0 Then";
Debug.ShouldStop(512);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean(">",_numpreciosdivisa,BA.numberCast(double.class, 0))) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 235;BA.debugLine="tF.Color=xui.Color_Red";
Debug.ShouldStop(1024);
_tf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 236;BA.debugLine="tF.TextColor=xui.Color_White";
Debug.ShouldStop(2048);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 238;BA.debugLine="tF.Color=0xFF00FA9A";
Debug.ShouldStop(8192);
_tf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff00fa9a)));
 BA.debugLineNum = 239;BA.debugLine="tF.TextColor=xui.Color_Black";
Debug.ShouldStop(16384);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 244;BA.debugLine="Dim NumPreciosUMDifUMCompra As Int=Utilidades.Fix";
Debug.ShouldStop(524288);
_numpreciosumdifumcompra = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NumPreciosUMDifUMCompra from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_articulosel}))))))));Debug.locals.put("NumPreciosUMDifUMCompra", _numpreciosumdifumcompra);Debug.locals.put("NumPreciosUMDifUMCompra", _numpreciosumdifumcompra);
 BA.debugLineNum = 246;BA.debugLine="txtNumPreciosUMDifUMCompra.text=NumPreciosUMDifUM";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtnumpreciosumdifumcompra" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_numpreciosumdifumcompra));
 BA.debugLineNum = 247;BA.debugLine="Dim tF As B4XView=txtNumPreciosUMDifUMCompra";
Debug.ShouldStop(4194304);
_tf = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtnumpreciosumdifumcompra" /*RemoteObject*/ ).getObject());Debug.locals.put("tF", _tf);Debug.locals.put("tF", _tf);
 BA.debugLineNum = 248;BA.debugLine="If NumPreciosUMDifUMCompra>0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean(">",_numpreciosumdifumcompra,BA.numberCast(double.class, 0))) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 249;BA.debugLine="tF.Color=xui.Color_Red";
Debug.ShouldStop(16777216);
_tf.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 250;BA.debugLine="tF.TextColor=xui.Color_White";
Debug.ShouldStop(33554432);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 252;BA.debugLine="tF.Color=0xFF00FA9A";
Debug.ShouldStop(134217728);
_tf.runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff00fa9a)));
 BA.debugLineNum = 253;BA.debugLine="tF.TextColor=xui.Color_Black";
Debug.ShouldStop(268435456);
_tf.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 258;BA.debugLine="wait for (CargaLineasTarifaCompraArticulo(Articul";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "datoslineastarifascompraavisosarticulo"), __ref.runClassMethod (b4j.docU.canalisistarifasavisostarifacompra.class, "_cargalineastarifacompraarticulo" /*RemoteObject*/ ,(Object)(_articulosel)));
this.state = 60;
return;
case 60:
//C
this.state = 31;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 259;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(4);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 260;BA.debugLine="Select Case Accion";
Debug.ShouldStop(8);
if (true) break;

case 31:
//select
this.state = 38;
switch (BA.switchObjectToInt(_accion,BA.ObjectToString("NOK"),BA.ObjectToString("SinDatos"),BA.ObjectToString("OK"))) {
case 0: {
this.state = 33;
if (true) break;
}
case 1: {
this.state = 35;
if (true) break;
}
case 2: {
this.state = 37;
if (true) break;
}
}
if (true) break;

case 33:
//C
this.state = 38;
 BA.debugLineNum = 262;BA.debugLine="SalirModulo";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifacompra.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 263;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 35:
//C
this.state = 38;
 if (true) break;

case 37:
//C
this.state = 38;
 if (true) break;

case 38:
//C
this.state = 39;
;
 BA.debugLineNum = 271;BA.debugLine="Dim rsData As ResultSet=mSQL.ExecQuery(\"select *";
Debug.ShouldStop(16384);
_rsdata = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdata = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblAnalisisTarifasLineasTarifasCompraArticulo")));Debug.locals.put("rsData", _rsdata);Debug.locals.put("rsData", _rsdata);
 BA.debugLineNum = 273;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasTarifa";
Debug.ShouldStop(65536);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rsdata.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 274;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "datoslineastarifascompraavisosarticulo"), _rsub);
this.state = 61;
return;
case 61:
//C
this.state = 39;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 275;BA.debugLine="rsData.Close";
Debug.ShouldStop(262144);
_rsdata.runVoidMethod ("Close");
 BA.debugLineNum = 276;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 277;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 39:
//if
this.state = 59;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 278;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(2097152);
if (true) break;

case 42:
//if
this.state = 49;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 279;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 280;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "datoslineastarifascompraavisosarticulo"), _msa);
this.state = 62;
return;
case 62:
//C
this.state = 45;
;
 BA.debugLineNum = 282;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 283;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "datoslineastarifascompraavisosarticulo"), _msa);
this.state = 63;
return;
case 63:
//C
this.state = 45;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 284;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(134217728);
if (true) break;

case 45:
//if
this.state = 48;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 285;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 286;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 48:
//C
this.state = 49;
;
 BA.debugLineNum = 289;BA.debugLine="ExitApplication";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 291;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(4);

case 49:
//if
this.state = 58;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 292;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(8);
if (true) break;

case 52:
//if
this.state = 57;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 57:
//C
this.state = 58;
;
 BA.debugLineNum = 293;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 294;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "datoslineastarifascompraavisosarticulo"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 58;
;
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = -1;
;
 BA.debugLineNum = 299;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 301;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "canalisistarifasavisostarifacompra","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 161;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="EventData.Consume";
Debug.ShouldStop(2);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("getForm (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("getform")) { return __ref.runUserSub(false, "canalisistarifasavisostarifacompra","getform", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Sub getForm As Form";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Return mFrmParent";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_mfrmparent" /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _parent,RemoteObject _frmparent,RemoteObject _sqlanalisis,RemoteObject _idanalisisventa,RemoteObject _articulo,RemoteObject _descripcionarticulo) throws Exception{
try {
		Debug.PushSubsStack("Initialize (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "canalisistarifasavisostarifacompra","initialize", __ref, _ba, _callback, _parent, _frmparent, _sqlanalisis, _idanalisisventa, _articulo, _descripcionarticulo);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Parent", _parent);
Debug.locals.put("frmParent", _frmparent);
Debug.locals.put("SQLAnalisis", _sqlanalisis);
Debug.locals.put("IDAnalisisVenta", _idanalisisventa);
Debug.locals.put("Articulo", _articulo);
Debug.locals.put("DescripcionArticulo", _descripcionarticulo);
 BA.debugLineNum = 57;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 67;BA.debugLine="mSQL=SQLAnalisis";
Debug.ShouldStop(4);
__ref.setField ("_msql" /*RemoteObject*/ ,_sqlanalisis);
 BA.debugLineNum = 69;BA.debugLine="mCallBack=CallBack";
Debug.ShouldStop(16);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 70;BA.debugLine="mParent=Parent";
Debug.ShouldStop(32);
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 72;BA.debugLine="mFrmParent=frmParent";
Debug.ShouldStop(128);
__ref.setField ("_mfrmparent" /*RemoteObject*/ ,_frmparent);
 BA.debugLineNum = 74;BA.debugLine="mIDAnalisisTarifasVenta=IDAnalisisVenta";
Debug.ShouldStop(512);
__ref.setField ("_midanalisistarifasventa" /*RemoteObject*/ ,_idanalisisventa);
 BA.debugLineNum = 77;BA.debugLine="mArticulo=Articulo";
Debug.ShouldStop(4096);
__ref.setField ("_marticulo" /*RemoteObject*/ ,_articulo);
 BA.debugLineNum = 78;BA.debugLine="mDescripcionArticulo=DescripcionArticulo";
Debug.ShouldStop(8192);
__ref.setField ("_mdescripcionarticulo" /*RemoteObject*/ ,_descripcionarticulo);
 BA.debugLineNum = 80;BA.debugLine="Show";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifacompra.class, "_show" /*void*/ );
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableviewlineastarifascompravalidasarticulo_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewLineasTarifasCompraValidasArticulo_ContextMenuItem_Action (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("jamtableviewlineastarifascompravalidasarticulo_contextmenuitem_action")) { __ref.runUserSub(false, "canalisistarifasavisostarifacompra","jamtableviewlineastarifascompravalidasarticulo_contextmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableViewLineasTarifasCompraValidasArticulo_ContextMenuItem_Action rsub = new ResumableSub_jamTableViewLineasTarifasCompraValidasArticulo_ContextMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableViewLineasTarifasCompraValidasArticulo_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewLineasTarifasCompraValidasArticulo_ContextMenuItem_Action(b4j.docU.canalisistarifasavisostarifacompra parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
RemoteObject _tagmenuitem;
RemoteObject _filasel = RemoteObject.createImmutable(0);
RemoteObject _articulosel = RemoteObject.createImmutable("");
RemoteObject _preciocompra = RemoteObject.createImmutable(0);
RemoteObject _divisa = RemoteObject.createImmutable("");
RemoteObject _valoreurpreciocompra = RemoteObject.createImmutable(0);
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _flagdivisaok = RemoteObject.createImmutable(false);
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sdiv = RemoteObject.createImmutable("");
RemoteObject _tipocambio = RemoteObject.createImmutable(0);
RemoteObject _smsg = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject group17;
int index17;
int groupLen17;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewLineasTarifasCompraValidasArticulo_ContextMenuItem_Action (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,346);
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
 BA.debugLineNum = 348;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//select
this.state = 27;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("AddEditarCosteArticuloUsuarioValorPrecioEURLineaTarifaCompra"))) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 378;BA.debugLine="Dim FilaSel As Int=jamTableViewLineasTarifasCom";
Debug.ShouldStop(33554432);
_filasel = __ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSel", _filasel);Debug.locals.put("FilaSel", _filasel);
 BA.debugLineNum = 379;BA.debugLine="Dim ArticuloSel As String=jamTableViewLineasTar";
Debug.ShouldStop(67108864);
_articulosel = BA.ObjectToString(__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Articulo"))));Debug.locals.put("ArticuloSel", _articulosel);Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 380;BA.debugLine="Dim PrecioCompra As Double=jamTableViewLineasTa";
Debug.ShouldStop(134217728);
_preciocompra = BA.numberCast(double.class, __ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("PrecioCompra"))));Debug.locals.put("PrecioCompra", _preciocompra);Debug.locals.put("PrecioCompra", _preciocompra);
 BA.debugLineNum = 381;BA.debugLine="Dim Divisa As String=jamTableViewLineasTarifasC";
Debug.ShouldStop(268435456);
_divisa = BA.ObjectToString(__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filasel),(Object)(RemoteObject.createImmutable("Moneda"))));Debug.locals.put("Divisa", _divisa);Debug.locals.put("Divisa", _divisa);
 BA.debugLineNum = 382;BA.debugLine="Dim ValorEURPrecioCompra As Double";
Debug.ShouldStop(536870912);
_valoreurpreciocompra = RemoteObject.createImmutable(0);Debug.locals.put("ValorEURPrecioCompra", _valoreurpreciocompra);
 BA.debugLineNum = 383;BA.debugLine="If Divisa<>\"\" And Divisa<>\"EUR\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_divisa,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_divisa,BA.ObjectToString("EUR"))) { 
this.state = 6;
}else {
this.state = 25;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 384;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando tipos de cambio grabados en NAV...")));
 BA.debugLineNum = 385;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 386;BA.debugLine="Wait For (TiposCambioConDatosNAV) complete (mR";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "jamtableviewlineastarifascompravalidasarticulo_contextmenuitem_action"), __ref.runClassMethod (b4j.docU.canalisistarifasavisostarifacompra.class, "_tiposcambiocondatosnav" /*RemoteObject*/ ));
this.state = 28;
return;
case 28:
//C
this.state = 7;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 387;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(4);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 388;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 389;BA.debugLine="If Accion=\"NOK\" Then Return";
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
 BA.debugLineNum = 390;BA.debugLine="Dim FlagDivisaOK As Boolean=False";
Debug.ShouldStop(32);
_flagdivisaok = parent.__c.getField(true,"False");Debug.locals.put("FlagDivisaOK", _flagdivisaok);Debug.locals.put("FlagDivisaOK", _flagdivisaok);
 BA.debugLineNum = 391;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(64);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 392;BA.debugLine="For Each m As Map In lstReg";
Debug.ShouldStop(128);
if (true) break;

case 13:
//for
this.state = 20;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group17 = _lstreg;
index17 = 0;
groupLen17 = group17.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 29;
if (true) break;

case 29:
//C
this.state = 20;
if (index17 < groupLen17) {
this.state = 15;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group17.runMethod(false,"Get",index17));Debug.locals.put("m", _m);}
if (true) break;

case 30:
//C
this.state = 29;
index17++;
Debug.locals.put("m", _m);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 393;BA.debugLine="Dim sDiv As String=m.Get(\"Divisa\")";
Debug.ShouldStop(256);
_sdiv = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Divisa")))));Debug.locals.put("sDiv", _sdiv);Debug.locals.put("sDiv", _sdiv);
 BA.debugLineNum = 394;BA.debugLine="If sDiv=Divisa Then";
Debug.ShouldStop(512);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_sdiv,_divisa)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 395;BA.debugLine="FlagDivisaOK=True";
Debug.ShouldStop(1024);
_flagdivisaok = parent.__c.getField(true,"True");Debug.locals.put("FlagDivisaOK", _flagdivisaok);
 BA.debugLineNum = 396;BA.debugLine="Dim TipoCambio As Double=m.Get(\"TipoCambio\")";
Debug.ShouldStop(2048);
_tipocambio = BA.numberCast(double.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoCambio")))));Debug.locals.put("TipoCambio", _tipocambio);Debug.locals.put("TipoCambio", _tipocambio);
 if (true) break;

case 19:
//C
this.state = 30;
;
 if (true) break;
if (true) break;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 399;BA.debugLine="If FlagDivisaOK=False Then";
Debug.ShouldStop(16384);

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_flagdivisaok,parent.__c.getField(true,"False"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 400;BA.debugLine="Dim sMsg As String=$\"No se ha grabado tipo de";
Debug.ShouldStop(32768);
_smsg = (RemoteObject.concat(RemoteObject.createImmutable("No se ha grabado tipo de cambio para la divisa "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_divisa))),RemoteObject.createImmutable(" en NAVISION\n"),RemoteObject.createImmutable("No es posible calcular el valor en EUR correspondiente al coste de compra")));Debug.locals.put("sMsg", _smsg);Debug.locals.put("sMsg", _smsg);
 BA.debugLineNum = 402;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sMsg,\"Error";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_smsg),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 403;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "jamtableviewlineastarifascompravalidasarticulo_contextmenuitem_action"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 23;
;
 BA.debugLineNum = 404;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 23:
//C
this.state = 26;
;
 BA.debugLineNum = 406;BA.debugLine="ValorEURPrecioCompra=PrecioCompra*TipoCambio";
Debug.ShouldStop(2097152);
_valoreurpreciocompra = RemoteObject.solve(new RemoteObject[] {_preciocompra,_tipocambio}, "*",0, 0);Debug.locals.put("ValorEURPrecioCompra", _valoreurpreciocompra);
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 408;BA.debugLine="ValorEURPrecioCompra=PrecioCompra";
Debug.ShouldStop(8388608);
_valoreurpreciocompra = _preciocompra;Debug.locals.put("ValorEURPrecioCompra", _valoreurpreciocompra);
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 410;BA.debugLine="AddEditarCosteArticuloUsuarioValor(ArticuloSel,";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifacompra.class, "_addeditarcostearticulousuariovalor" /*void*/ ,(Object)(_articulosel),(Object)(_valoreurpreciocompra));
 if (true) break;

case 27:
//C
this.state = -1;
;
 BA.debugLineNum = 414;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "canalisistarifasavisostarifacompra","salirmodulo", __ref);}
 BA.debugLineNum = 169;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="If jamTableViewLineasTarifasCompraValidasArticulo";
Debug.ShouldStop(512);
if (__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 171;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.G";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 };
 BA.debugLineNum = 175;BA.debugLine="Background.RemoveViewFromParent";
Debug.ShouldStop(16384);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 177;BA.debugLine="CallSubDelayed2(mCallBack,\"cAnalisisTarifasAvisos";
Debug.ShouldStop(65536);
canalisistarifasavisostarifacompra.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("cAnalisisTarifasAvisosTarifaCompra_Done")),(Object)((__ref.getField(true,"_datoseditados" /*RemoteObject*/ ))));
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Show (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "canalisistarifasavisostarifacompra","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.canalisistarifasavisostarifacompra parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,87);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 89;BA.debugLine="Background= xui.CreatePanel(\"Background\")";
Debug.ShouldStop(16777216);
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Background"))));
 BA.debugLineNum = 90;BA.debugLine="Background.Tag = \"AnalisisTarifasAvisosTarifaComp";
Debug.ShouldStop(33554432);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("AnalisisTarifasAvisosTarifaCompra_background")));
 BA.debugLineNum = 92;BA.debugLine="Background.Color=xui.Color_Transparent";
Debug.ShouldStop(134217728);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 93;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 95;BA.debugLine="Base=xui.CreatePanel(\"pnlBase\")";
Debug.ShouldStop(1073741824);
__ref.setField ("_base" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlBase"))));
 BA.debugLineNum = 96;BA.debugLine="Base.SetLayoutAnimated(0,0,0,Background.Width, Ba";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 97;BA.debugLine="Base.LoadLayout(\"scrAnalisisTarifasVentaInfoTarif";
Debug.ShouldStop(1);
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrAnalisisTarifasVentaInfoTarifasCompraValidasArticulo")),__ref.getField(false, "ba"));
 BA.debugLineNum = 98;BA.debugLine="Sleep(0)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "show"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 99;BA.debugLine="Background.AddView(Base,Background.Width/2-Base.W";
Debug.ShouldStop(4);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_base" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/-/",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/-/",1, 0)),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 101;BA.debugLine="lblInfoAvisosTarifasCompraValidasArticulo.Text=\"A";
Debug.ShouldStop(16);
__ref.getField(false,"_lblinfoavisostarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Avisos Tarifa / Líneas Tarifas Compra"));
 BA.debugLineNum = 106;BA.debugLine="txtArticuloAvisosTarifasCompraValidasArticulo.Ali";
Debug.ShouldStop(512);
__ref.getField(false,"_txtarticuloavisostarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 107;BA.debugLine="txtNumPreciosTarifasCompraValidasArticulo.Alignme";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtnumpreciostarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 108;BA.debugLine="txtNumPreciosArtTallaTarifasCompraValidasArticulo";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtnumpreciosarttallatarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 109;BA.debugLine="txtNumPreciosDivisaTarifasCompraValidasArticulo.A";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtnumpreciosdivisatarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 110;BA.debugLine="txtNumMinQtyTarifasCompraValidasArticulo.Alignmen";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtnumminqtytarifascompravalidasarticulo" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 111;BA.debugLine="txtNumPreciosUMDifUMCompra.Alignment=\"CENTER_RIGH";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtnumpreciosumdifumcompra" /*RemoteObject*/ ).runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 120;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Es";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).getField(true,"_menubartabla" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 121;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Es";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 122;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Es";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 125;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasTarifa";
Debug.ShouldStop(268435456);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaAnalisisTarifasInfoTarifaComprasArticulo2.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 126;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 127;BA.debugLine="Log(mRes)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","843778088",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 128;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 129;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 130;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
 BA.debugLineNum = 131;BA.debugLine="SalirModulo";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifacompra.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 132;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 135;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Al";
Debug.ShouldStop(64);
__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 137;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(256);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 138;BA.debugLine="CF.Initialize";
Debug.ShouldStop(512);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 139;BA.debugLine="CF.NombreFuncionCellFactory=jamTableViewLineasTar";
Debug.ShouldStop(1024);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).getField(true,"_cellfactory_columnafecha" /*RemoteObject*/ ));
 BA.debugLineNum = 140;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Se";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("FechaInicial"),RemoteObject.createImmutable("FechaFinal")})))));
 BA.debugLineNum = 143;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Ad";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 145;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Ad";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamtableviewlineastarifascompravalidasarticulo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Añadir Precio EUR Línea Tarifa a Coste Artículo Usuario")),(Object)(BA.ObjectToString("AddEditarCosteArticuloUsuarioValorPrecioEURLineaTarifaCompra")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf071)))))));
 BA.debugLineNum = 147;BA.debugLine="Dialog.Initialize(Base)";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )));
 BA.debugLineNum = 148;BA.debugLine="jamLoadingIndicator1.Initialize(Me,Base)";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )));
 BA.debugLineNum = 152;BA.debugLine="DatosLineasTarifasCompraAvisosArticulo(mArticulo,";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.canalisistarifasavisostarifacompra.class, "_datoslineastarifascompraavisosarticulo" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_marticulo" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mdescripcionarticulo" /*RemoteObject*/ )));
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
public static RemoteObject  _tiposcambiocondatosnav(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TiposCambioConDatosNAV (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,536);
if (RapidSub.canDelegate("tiposcambiocondatosnav")) { return __ref.runUserSub(false, "canalisistarifasavisostarifacompra","tiposcambiocondatosnav", __ref);}
ResumableSub_TiposCambioConDatosNAV rsub = new ResumableSub_TiposCambioConDatosNAV(null,__ref);
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
public static class ResumableSub_TiposCambioConDatosNAV extends BA.ResumableSub {
public ResumableSub_TiposCambioConDatosNAV(b4j.docU.canalisistarifasavisostarifacompra parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TiposCambioConDatosNAV (canalisistarifasavisostarifacompra) ","canalisistarifasavisostarifacompra",17,__ref.getField(false, "ba"),__ref,536);
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
 BA.debugLineNum = 537;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16777216);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 538;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(33554432);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 539;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 540;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(134217728);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 541;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(268435456);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 542;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 543;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 544;BA.debugLine="Dim Comando As String=\"TiposCambioConDatosNAV\"";
Debug.ShouldStop(-2147483648);
_comando = BA.ObjectToString("TiposCambioConDatosNAV");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 545;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
Debug.ShouldStop(1);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 546;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "tiposcambiocondatosnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 547;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 548;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 549;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 550;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "tiposcambiocondatosnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 551;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 552;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 555;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 556;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay tipos";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay tipos de cambio grabados en NAV.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 557;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisistarifasavisostarifacompra", "tiposcambiocondatosnav"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 558;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 559;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 561;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(65536);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 562;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 563;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 564;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 567;BA.debugLine="Return mRes";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 568;BA.debugLine="End Sub";
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
}