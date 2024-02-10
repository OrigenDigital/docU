package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jamformregistro_subs_0 {


public static RemoteObject  _abrireditordecampo(RemoteObject __ref,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("AbrirEditorDeCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2660);
if (RapidSub.canDelegate("abrireditordecampo")) { return __ref.runUserSub(false, "jamformregistro","abrireditordecampo", __ref, _idx);}
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _b4xcontroldatocampo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("idX", _idx);
 BA.debugLineNum = 2660;BA.debugLine="Private Sub AbrirEditorDeCampo(idX As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2661;BA.debugLine="If idX<clvCamposRegistro.Size Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_idx,BA.numberCast(double.class, __ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getsize")))) { 
 BA.debugLineNum = 2662;BA.debugLine="Dim ClvIV As InfoCampoJamFormRegistro=clvCamposR";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_idx)));Debug.locals.put("ClvIV", _clviv);Debug.locals.put("ClvIV", _clviv);
 BA.debugLineNum = 2663;BA.debugLine="If ClvIV.ControlEditable Then";
Debug.JustUpdateDeviceLine();
if (_clviv.getField(true,"ControlEditable" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2664;BA.debugLine="Select True";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(jamformregistro.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_b4xinputdialogtextfield" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_b4xlistdialogtextfield" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_b4xsearchlistdialogtextfield" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_textfieldbuttonselext" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_textfieldbuttonselfecha" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_textfieldbuttonselfile" /*RemoteObject*/ ))))) {
case 0: {
 BA.debugLineNum = 2666;BA.debugLine="MostrarB4XInputDialogItemCampo(idX)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarb4xinputdialogitemcampo" /*void*/ ,(Object)(_idx));
 break; }
case 1: {
 BA.debugLineNum = 2668;BA.debugLine="MostrarB4XListTemplateItemCampo(idX)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarb4xlisttemplateitemcampo" /*void*/ ,(Object)(_idx));
 break; }
case 2: {
 BA.debugLineNum = 2670;BA.debugLine="MostrarB4XSearchListTemplateItemCampo(idX)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarb4xsearchlisttemplateitemcampo" /*void*/ ,(Object)(_idx));
 break; }
case 3: {
 BA.debugLineNum = 2672;BA.debugLine="MostrarSelValorExtItemCampo(idX)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarselvalorextitemcampo" /*void*/ ,(Object)(_idx));
 break; }
case 4: {
 BA.debugLineNum = 2674;BA.debugLine="MostrarSelFechaItemCampo(idX)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarselfechaitemcampo" /*void*/ ,(Object)(_idx));
 break; }
case 5: {
 BA.debugLineNum = 2676;BA.debugLine="MostrarSelFicheroItemCampo(idX)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarselficheroitemcampo" /*void*/ ,(Object)(_idx));
 break; }
default: {
 BA.debugLineNum = 2678;BA.debugLine="Dim B4XControlDatoCampo As B4XView=ClvIV.Cont";
Debug.JustUpdateDeviceLine();
_b4xcontroldatocampo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b4xcontroldatocampo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _clviv.getField(false,"ControlDatoCampo" /*RemoteObject*/ ));Debug.locals.put("B4XControlDatoCampo", _b4xcontroldatocampo);Debug.locals.put("B4XControlDatoCampo", _b4xcontroldatocampo);
 BA.debugLineNum = 2679;BA.debugLine="B4XControlDatoCampo.RequestFocus";
Debug.JustUpdateDeviceLine();
_b4xcontroldatocampo.runVoidMethod ("RequestFocus");
 break; }
}
;
 }else {
 BA.debugLineNum = 2683;BA.debugLine="AbrirEditorDeCampo((idX+1))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_abrireditordecampo" /*RemoteObject*/ ,(Object)((RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1))));
 };
 }else {
 BA.debugLineNum = 2686;BA.debugLine="btnOK.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnok" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 };
 BA.debugLineNum = 2688;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _abrirrecordformbuilder(RemoteObject __ref,RemoteObject _modo,RemoteObject _ficherojson) throws Exception{
try {
		Debug.PushSubsStack("AbrirRecordFormBuilder (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2924);
if (RapidSub.canDelegate("abrirrecordformbuilder")) { __ref.runUserSub(false, "jamformregistro","abrirrecordformbuilder", __ref, _modo, _ficherojson); return;}
ResumableSub_AbrirRecordFormBuilder rsub = new ResumableSub_AbrirRecordFormBuilder(null,__ref,_modo,_ficherojson);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AbrirRecordFormBuilder extends BA.ResumableSub {
public ResumableSub_AbrirRecordFormBuilder(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _modo,RemoteObject _ficherojson) {
this.parent = parent;
this.__ref = __ref;
this._modo = _modo;
this._ficherojson = _ficherojson;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _modo;
RemoteObject _ficherojson;
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AbrirRecordFormBuilder (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2924);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Modo", _modo);
Debug.locals.put("FicheroJson", _ficherojson);
 BA.debugLineNum = 2925;BA.debugLine="If mNombreFicheroJSON<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mnombreficherojson" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2926;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2927;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2928;BA.debugLine="sb.Append(\"El Registro ya tiene un fichero JSON";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("El Registro ya tiene un fichero JSON de configuración ("))).runMethod(false,"Append",(Object)(__ref.getField(true,"_mnombreficherojson" /*RemoteObject*/ ))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(")"))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 2929;BA.debugLine="sb.Append(\"¿Editar este fichero o crear uno nuev";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("¿Editar este fichero o crear uno nuevo?")));
 BA.debugLineNum = 2931;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(sb.tostring";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(_sb.runMethod(true,"ToString")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Editar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Nuevo")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2932;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "abrirrecordformbuilder"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 4;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2933;BA.debugLine="Select True";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//select
this.state = 11;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Negative")))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")))))) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 8;
if (true) break;
}
case 2: {
this.state = 10;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 2937;BA.debugLine="frmReg.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 2938;BA.debugLine="jamRecordFormBuilder.show(\"Edicion\",mNombreFic";
Debug.JustUpdateDeviceLine();
parent._jamrecordformbuilder.runVoidMethod ("_show" /*void*/ ,(Object)(BA.ObjectToString("Edicion")),(Object)(__ref.getField(true,"_mnombreficherojson" /*RemoteObject*/ )));
 if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 2941;BA.debugLine="frmReg.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 2942;BA.debugLine="jamRecordFormBuilder.show(\"Nuevo\",\"\")";
Debug.JustUpdateDeviceLine();
parent._jamrecordformbuilder.runVoidMethod ("_show" /*void*/ ,(Object)(BA.ObjectToString("Nuevo")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2945;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2949;BA.debugLine="frmReg.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 2950;BA.debugLine="jamRecordFormBuilder.show(\"Nuevo\",\"\")";
Debug.JustUpdateDeviceLine();
parent._jamrecordformbuilder.runVoidMethod ("_show" /*void*/ ,(Object)(BA.ObjectToString("Nuevo")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 2953;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _rint) throws Exception{
}
public static void  _actualizardatoscampo(RemoteObject __ref,RemoteObject _mdataactualizacion) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2588);
if (RapidSub.canDelegate("actualizardatoscampo")) { __ref.runUserSub(false, "jamformregistro","actualizardatoscampo", __ref, _mdataactualizacion); return;}
ResumableSub_ActualizarDatosCampo rsub = new ResumableSub_ActualizarDatosCampo(null,__ref,_mdataactualizacion);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ActualizarDatosCampo extends BA.ResumableSub {
public ResumableSub_ActualizarDatosCampo(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _mdataactualizacion) {
this.parent = parent;
this.__ref = __ref;
this._mdataactualizacion = _mdataactualizacion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _mdataactualizacion;
RemoteObject _clviveditado = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _idxreplace = RemoteObject.createImmutable(0);
RemoteObject _campoeditado = RemoteObject.createImmutable("");
RemoteObject _infocampofr = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _numeroitemclveditado = RemoteObject.createImmutable(0);
RemoteObject group18;
int index18;
int groupLen18;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2588);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("mdataActualizacion", _mdataactualizacion);
 BA.debugLineNum = 2589;BA.debugLine="Log(\"**** ActualizarDatosCampo jamFormRegistro***";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9127336449",RemoteObject.createImmutable("**** ActualizarDatosCampo jamFormRegistro****"),0);
 BA.debugLineNum = 2590;BA.debugLine="Log(\"mdataActualizacion \" & mdataActualizacion)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9127336450",RemoteObject.concat(RemoteObject.createImmutable("mdataActualizacion "),_mdataactualizacion),0);
 BA.debugLineNum = 2592;BA.debugLine="Dim clvivEditado As InfoCampoJamFormRegistro=mdat";
Debug.JustUpdateDeviceLine();
_clviveditado = (_mdataactualizacion.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("clvIV")))));Debug.locals.put("clvivEditado", _clviveditado);Debug.locals.put("clvivEditado", _clviveditado);
 BA.debugLineNum = 2594;BA.debugLine="clvivEditado.ValorOutputCampo=mdataActualizacion.";
Debug.JustUpdateDeviceLine();
_clviveditado.setField ("ValorOutputCampo" /*RemoteObject*/ ,_mdataactualizacion.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ValorValidacion")))));
 BA.debugLineNum = 2596;BA.debugLine="If clvivEditado.NumCamposDatosAux=2 Then clvivEdi";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_clviveditado.getField(true,"NumCamposDatosAux" /*RemoteObject*/ ),BA.numberCast(double.class, 2))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_clviveditado.setField ("ValorMostrarCampoFormulario" /*RemoteObject*/ ,_mdataactualizacion.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ValorMostrarValidacion")))));
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2621;BA.debugLine="Dim rSUB As ResumableSub=CrearItemCLV(clvivEditad";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_crearitemclv" /*RemoteObject*/ ,(Object)(_clviveditado));Debug.locals.put("rSUB", _rsub);Debug.locals.put("rSUB", _rsub);
 BA.debugLineNum = 2622;BA.debugLine="Wait For (rSUB) complete (mItem As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "actualizardatoscampo"), _rsub);
this.state = 38;
return;
case 38:
//C
this.state = 7;
_mitem = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mItem", _mitem);
;
 BA.debugLineNum = 2623;BA.debugLine="Dim pnl As B4XView=mItem.Get(\"Panel\")";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Panel")))));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 2624;BA.debugLine="Dim iDxReplace As Int=mdataActualizacion.Get(\"Ind";
Debug.JustUpdateDeviceLine();
_idxreplace = BA.numberCast(int.class, _mdataactualizacion.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Index")))));Debug.locals.put("iDxReplace", _idxreplace);Debug.locals.put("iDxReplace", _idxreplace);
 BA.debugLineNum = 2625;BA.debugLine="If iDxReplace Mod 2=0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_idxreplace,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 2626;BA.debugLine="pnl.Color=ColItemsPares";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(true,"setColor",__ref.getField(true,"_colitemspares" /*RemoteObject*/ ));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2628;BA.debugLine="pnl.Color=ColItemsImpares";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(true,"setColor",__ref.getField(true,"_colitemsimpares" /*RemoteObject*/ ));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 2630;BA.debugLine="clvCamposRegistro.ReplaceAt(iDxReplace,pnl,pnl.He";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runVoidMethod ("_replaceat",(Object)(_idxreplace),(Object)(_pnl),(Object)(BA.numberCast(int.class, _pnl.runMethod(true,"getHeight"))),(Object)((_clviveditado)));
 BA.debugLineNum = 2632;BA.debugLine="clvCamposRegistro.Base_Resize(clvCamposRegistro.A";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")));
 BA.debugLineNum = 2634;BA.debugLine="Dim CampoEditado As String=clvivEditado.CampoSQL";
Debug.JustUpdateDeviceLine();
_campoeditado = _clviveditado.getField(true,"CampoSQL" /*RemoteObject*/ );Debug.locals.put("CampoEditado", _campoeditado);Debug.locals.put("CampoEditado", _campoeditado);
 BA.debugLineNum = 2637;BA.debugLine="For Each InfoCampoFR As InfoCampoJamFormRegistro";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//for
this.state = 26;
group18 = __ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ );
index18 = 0;
groupLen18 = group18.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("InfoCampoFR", _infocampofr);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 26;
if (index18 < groupLen18) {
this.state = 15;
_infocampofr = (group18.runMethod(false,"Get",index18));Debug.locals.put("InfoCampoFR", _infocampofr);}
if (true) break;

case 40:
//C
this.state = 39;
index18++;
Debug.locals.put("InfoCampoFR", _infocampofr);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2638;BA.debugLine="If InfoCampoFR.CampoSQL=CampoEditado Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_infocampofr.getField(true,"CampoSQL" /*RemoteObject*/ ),_campoeditado)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2639;BA.debugLine="InfoCampoFR.ValorOutputCampo=clvivEditado.Valor";
Debug.JustUpdateDeviceLine();
_infocampofr.setField ("ValorOutputCampo" /*RemoteObject*/ ,_clviveditado.getField(false,"ValorOutputCampo" /*RemoteObject*/ ));
 BA.debugLineNum = 2640;BA.debugLine="If InfoCampoFR.NumCamposDatosAux=2 Then InfoCam";
Debug.JustUpdateDeviceLine();
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_infocampofr.getField(true,"NumCamposDatosAux" /*RemoteObject*/ ),BA.numberCast(double.class, 2))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
_infocampofr.setField ("ValorMostrarCampoFormulario" /*RemoteObject*/ ,_clviveditado.getField(false,"ValorMostrarCampoFormulario" /*RemoteObject*/ ));
if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 2642;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 26;
if (true) break;
 if (true) break;

case 25:
//C
this.state = 40;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
Debug.locals.put("InfoCampoFR", _infocampofr);
;
 BA.debugLineNum = 2646;BA.debugLine="Dim NumeroItemCLVEditado As Int=mdataActualizacio";
Debug.JustUpdateDeviceLine();
_numeroitemclveditado = BA.numberCast(int.class, _mdataactualizacion.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Index")))));Debug.locals.put("NumeroItemCLVEditado", _numeroitemclveditado);Debug.locals.put("NumeroItemCLVEditado", _numeroitemclveditado);
 BA.debugLineNum = 2649;BA.debugLine="If mModoRegistro=\"Nuevo\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 27:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Nuevo"))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 2651;BA.debugLine="AbrirEditorDeCampo((NumeroItemCLVEditado+1))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_abrireditordecampo" /*RemoteObject*/ ,(Object)((RemoteObject.solve(new RemoteObject[] {_numeroitemclveditado,RemoteObject.createImmutable(1)}, "+",1, 1))));
 if (true) break;
;
 BA.debugLineNum = 2653;BA.debugLine="If mModoRegistro=\"Editar\" Then";
Debug.JustUpdateDeviceLine();

case 30:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Editar"))) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 2654;BA.debugLine="If NumeroItemCLVEditado=clvCamposRegistro.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 33:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_numeroitemclveditado,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 2655;BA.debugLine="btnOK.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnok" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 if (true) break;

case 36:
//C
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
 BA.debugLineNum = 2658;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _complete(RemoteObject __ref,RemoteObject _mitem) throws Exception{
}
public static RemoteObject  _afterupdate(RemoteObject __ref,RemoteObject _mdataactualizacion) throws Exception{
try {
		Debug.PushSubsStack("AfterUpdate (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2578);
if (RapidSub.canDelegate("afterupdate")) { return __ref.runUserSub(false, "jamformregistro","afterupdate", __ref, _mdataactualizacion);}
Debug.locals.put("mDataActualizacion", _mdataactualizacion);
 BA.debugLineNum = 2578;BA.debugLine="Public Sub AfterUpdate(mDataActualizacion As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2579;BA.debugLine="If SubExists(mCallBack,mEventName & \"_AfterUpdate";
Debug.JustUpdateDeviceLine();
if (jamformregistro.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_AfterUpdate")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2580;BA.debugLine="CallSubDelayed2(mCallBack,mEventName & \"_AfterUp";
Debug.JustUpdateDeviceLine();
jamformregistro.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_AfterUpdate"))),(Object)((_mdataactualizacion)));
 }else {
 BA.debugLineNum = 2582;BA.debugLine="ActualizarDatosCampo(mDataActualizacion)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_actualizardatoscampo" /*void*/ ,(Object)(_mdataactualizacion));
 };
 BA.debugLineNum = 2584;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animatedialog(RemoteObject __ref,RemoteObject _dlg,RemoteObject _fromedge) throws Exception{
try {
		Debug.PushSubsStack("AnimateDialog (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2447);
if (RapidSub.canDelegate("animatedialog")) { return __ref.runUserSub(false, "jamformregistro","animatedialog", __ref, _dlg, _fromedge);}
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
Debug.locals.put("dlg", _dlg);
Debug.locals.put("FromEdge", _fromedge);
 BA.debugLineNum = 2447;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2448;BA.debugLine="Dim base As B4XView = dlg.Base";
Debug.JustUpdateDeviceLine();
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_base = _dlg.getField(false,"_base" /*RemoteObject*/ );Debug.locals.put("base", _base);Debug.locals.put("base", _base);
 BA.debugLineNum = 2449;BA.debugLine="Dim top As Int = base.Top";
Debug.JustUpdateDeviceLine();
_top = BA.numberCast(int.class, _base.runMethod(true,"getTop"));Debug.locals.put("top", _top);Debug.locals.put("top", _top);
 BA.debugLineNum = 2450;BA.debugLine="Dim left As Int = base.Left";
Debug.JustUpdateDeviceLine();
_left = BA.numberCast(int.class, _base.runMethod(true,"getLeft"));Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 2451;BA.debugLine="Select FromEdge.ToLowerCase";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_fromedge.runMethod(true,"toLowerCase"),BA.ObjectToString("bottom"),BA.ObjectToString("top"),BA.ObjectToString("left"),BA.ObjectToString("right"))) {
case 0: {
 BA.debugLineNum = 2453;BA.debugLine="base.Top = base.Parent.Height";
Debug.JustUpdateDeviceLine();
_base.runMethod(true,"setTop",_base.runMethod(false,"getParent").runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 2455;BA.debugLine="base.Top = -base.Height";
Debug.JustUpdateDeviceLine();
_base.runMethod(true,"setTop",BA.numberCast(double.class, -_base.runMethod(true,"getHeight").<Double>get().doubleValue()));
 break; }
case 2: {
 BA.debugLineNum = 2457;BA.debugLine="base.Left = -base.Width";
Debug.JustUpdateDeviceLine();
_base.runMethod(true,"setLeft",BA.numberCast(double.class, -_base.runMethod(true,"getWidth").<Double>get().doubleValue()));
 break; }
case 3: {
 BA.debugLineNum = 2459;BA.debugLine="base.Left = base.Parent.Width";
Debug.JustUpdateDeviceLine();
_base.runMethod(true,"setLeft",_base.runMethod(false,"getParent").runMethod(true,"getWidth"));
 break; }
}
;
 BA.debugLineNum = 2461;BA.debugLine="base.SetLayoutAnimated(300, left, top, base.Width";
Debug.JustUpdateDeviceLine();
_base.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, _left)),(Object)(BA.numberCast(double.class, _top)),(Object)(_base.runMethod(true,"getWidth")),(Object)(_base.runMethod(true,"getHeight")));
 BA.debugLineNum = 2462;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _asignartooltipinfocampo(RemoteObject __ref,RemoteObject _camposql,RemoteObject _textotooltipinfo,RemoteObject _asignar) throws Exception{
try {
		Debug.PushSubsStack("AsignarToolTipInfoCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,3009);
if (RapidSub.canDelegate("asignartooltipinfocampo")) { __ref.runUserSub(false, "jamformregistro","asignartooltipinfocampo", __ref, _camposql, _textotooltipinfo, _asignar); return;}
ResumableSub_AsignarToolTipInfoCampo rsub = new ResumableSub_AsignarToolTipInfoCampo(null,__ref,_camposql,_textotooltipinfo,_asignar);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AsignarToolTipInfoCampo extends BA.ResumableSub {
public ResumableSub_AsignarToolTipInfoCampo(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _camposql,RemoteObject _textotooltipinfo,RemoteObject _asignar) {
this.parent = parent;
this.__ref = __ref;
this._camposql = _camposql;
this._textotooltipinfo = _textotooltipinfo;
this._asignar = _asignar;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _camposql;
RemoteObject _textotooltipinfo;
RemoteObject _asignar;
RemoteObject _flagcampoencontrado = RemoteObject.createImmutable(false);
int _idx = 0;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _pcsql = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _lblinfot = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _camposqlenlista = RemoteObject.createImmutable(false);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
int step2;
int limit2;
RemoteObject group12;
int index12;
int groupLen12;
RemoteObject group21;
int index21;
int groupLen21;
RemoteObject group35;
int index35;
int groupLen35;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AsignarToolTipInfoCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,3009);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("CampoSQL", _camposql);
Debug.locals.put("TextoToolTipInfo", _textotooltipinfo);
Debug.locals.put("Asignar", _asignar);
 BA.debugLineNum = 3010;BA.debugLine="Dim FlagCampoEncontrado As Boolean";
Debug.JustUpdateDeviceLine();
_flagcampoencontrado = RemoteObject.createImmutable(false);Debug.locals.put("FlagCampoEncontrado", _flagcampoencontrado);
 BA.debugLineNum = 3011;BA.debugLine="For iDx=0 To clvCamposRegistro.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 8;
step2 = 1;
limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idx = 0 ;
Debug.locals.put("iDx", _idx);
this.state = 57;
if (true) break;

case 57:
//C
this.state = 8;
if ((step2 > 0 && _idx <= limit2) || (step2 < 0 && _idx >= limit2)) this.state = 3;
if (true) break;

case 58:
//C
this.state = 57;
_idx = ((int)(0 + _idx + step2)) ;
Debug.locals.put("iDx", _idx);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3012;BA.debugLine="Dim clviv As InfoCampoJamFormRegistro=clvCamposR";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _idx))));Debug.locals.put("clviv", _clviv);Debug.locals.put("clviv", _clviv);
 BA.debugLineNum = 3013;BA.debugLine="If clviv.CampoSQL=CampoSQL Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_clviv.getField(true,"CampoSQL" /*RemoteObject*/ ),_camposql)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3014;BA.debugLine="FlagCampoEncontrado=True";
Debug.JustUpdateDeviceLine();
_flagcampoencontrado = parent.__c.getField(true,"True");Debug.locals.put("FlagCampoEncontrado", _flagcampoencontrado);
 BA.debugLineNum = 3015;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 58;
;
 if (true) break;
if (true) break;
Debug.locals.put("iDx", _idx);
;
 BA.debugLineNum = 3018;BA.debugLine="If FlagCampoEncontrado Then";
Debug.JustUpdateDeviceLine();

case 8:
//if
this.state = 56;
if (_flagcampoencontrado.<Boolean>get().booleanValue()) { 
this.state = 10;
}else {
this.state = 55;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 3019;BA.debugLine="If lstInfoCamposToolTip.IsInitialized=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lstinfocampostooltip" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
__ref.getField(false,"_lstinfocampostooltip" /*RemoteObject*/ ).runVoidMethod ("Initialize");
if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 3020;BA.debugLine="Dim pCSQl As Pane=clvCamposRegistro.GetPanel(iDx";
Debug.JustUpdateDeviceLine();
_pcsql = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_pcsql = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), __ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _idx))).getObject());Debug.locals.put("pCSQl", _pcsql);Debug.locals.put("pCSQl", _pcsql);
 BA.debugLineNum = 3021;BA.debugLine="For Each n As Node In pCSQl.GetAllViewsRecursive";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//for
this.state = 53;
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
group12 = _pcsql.runMethod(false,"GetAllViewsRecursive");
index12 = 0;
groupLen12 = group12.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("n", _n);
this.state = 59;
if (true) break;

case 59:
//C
this.state = 53;
if (index12 < groupLen12) {
this.state = 19;
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group12.runMethod(false,"Get",index12));Debug.locals.put("n", _n);}
if (true) break;

case 60:
//C
this.state = 59;
index12++;
Debug.locals.put("n", _n);
if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 3022;BA.debugLine="If n Is Label Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//if
this.state = 52;
if (RemoteObject.solveBoolean("i",_n.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.Label"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 3023;BA.debugLine="If n.Tag=\"lblInfoCampoTooltipFormRegistro\" The";
Debug.JustUpdateDeviceLine();
if (true) break;

case 23:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",_n.runMethod(false,"getTag"),RemoteObject.createImmutable(("lblInfoCampoTooltipFormRegistro")))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 3024;BA.debugLine="Dim lblInfoT As Label=n";
Debug.JustUpdateDeviceLine();
_lblinfot = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblinfot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _n.getObject());Debug.locals.put("lblInfoT", _lblinfot);Debug.locals.put("lblInfoT", _lblinfot);
 BA.debugLineNum = 3025;BA.debugLine="If Asignar Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 26:
//if
this.state = 50;
if (_asignar.<Boolean>get().booleanValue()) { 
this.state = 28;
}else {
this.state = 41;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 3026;BA.debugLine="lblInfoT.TextSize=18";
Debug.JustUpdateDeviceLine();
_lblinfot.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 BA.debugLineNum = 3027;BA.debugLine="lblInfoT.Visible=True";
Debug.JustUpdateDeviceLine();
_lblinfot.runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 3028;BA.debugLine="lblInfoT.TooltipText=TextoToolTipInfo";
Debug.JustUpdateDeviceLine();
_lblinfot.runMethod(true,"setTooltipText",_textotooltipinfo);
 BA.debugLineNum = 3029;BA.debugLine="Dim CampoSQLEnLista As Boolean";
Debug.JustUpdateDeviceLine();
_camposqlenlista = RemoteObject.createImmutable(false);Debug.locals.put("CampoSQLEnLista", _camposqlenlista);
 BA.debugLineNum = 3030;BA.debugLine="For Each m As Map In lstInfoCamposToolTip";
Debug.JustUpdateDeviceLine();
if (true) break;

case 29:
//for
this.state = 36;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = __ref.getField(false,"_lstinfocampostooltip" /*RemoteObject*/ );
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 61;
if (true) break;

case 61:
//C
this.state = 36;
if (index21 < groupLen21) {
this.state = 31;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group21.runMethod(false,"Get",index21));Debug.locals.put("m", _m);}
if (true) break;

case 62:
//C
this.state = 61;
index21++;
Debug.locals.put("m", _m);
if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 3031;BA.debugLine="If m.Get(\"CampoSQL\")=CampoSQL Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoSQL")))),(_camposql))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 3032;BA.debugLine="m.Put(\"TextoToolTipInfo\",TextoToolTipInfo)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TextoToolTipInfo"))),(Object)((_textotooltipinfo)));
 BA.debugLineNum = 3033;BA.debugLine="CampoSQLEnLista=True";
Debug.JustUpdateDeviceLine();
_camposqlenlista = parent.__c.getField(true,"True");Debug.locals.put("CampoSQLEnLista", _camposqlenlista);
 BA.debugLineNum = 3034;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 36;
if (true) break;
 if (true) break;

case 35:
//C
this.state = 62;
;
 if (true) break;
if (true) break;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 3037;BA.debugLine="If CampoSQLEnLista=False Then";
Debug.JustUpdateDeviceLine();

case 36:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",_camposqlenlista,parent.__c.getField(true,"False"))) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 3038;BA.debugLine="Dim m As Map=CreateMap(\"CampoSQL\":CampoSQL,";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("CampoSQL")),(_camposql),RemoteObject.createImmutable(("TextoToolTipInfo")),(_textotooltipinfo)}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 3039;BA.debugLine="lstInfoCamposToolTip.Add(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstinfocampostooltip" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_m.getObject())));
 if (true) break;

case 39:
//C
this.state = 50;
;
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 3042;BA.debugLine="lblInfoT.Visible=False";
Debug.JustUpdateDeviceLine();
_lblinfot.runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 3043;BA.debugLine="lblInfoT.TooltipText=\"\"";
Debug.JustUpdateDeviceLine();
_lblinfot.runMethod(true,"setTooltipText",BA.ObjectToString(""));
 BA.debugLineNum = 3044;BA.debugLine="For Each m As Map In lstInfoCamposToolTip";
Debug.JustUpdateDeviceLine();
if (true) break;

case 42:
//for
this.state = 49;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group35 = __ref.getField(false,"_lstinfocampostooltip" /*RemoteObject*/ );
index35 = 0;
groupLen35 = group35.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 63;
if (true) break;

case 63:
//C
this.state = 49;
if (index35 < groupLen35) {
this.state = 44;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group35.runMethod(false,"Get",index35));Debug.locals.put("m", _m);}
if (true) break;

case 64:
//C
this.state = 63;
index35++;
Debug.locals.put("m", _m);
if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 3045;BA.debugLine="If m.Get(\"CampoSQL\")=CampoSQL Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 45:
//if
this.state = 48;
if (RemoteObject.solveBoolean("=",_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoSQL")))),(_camposql))) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 3046;BA.debugLine="m.Put(\"TextoToolTipInfo\",\"\")";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("TextoToolTipInfo"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3047;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 49;
if (true) break;
 if (true) break;

case 48:
//C
this.state = 64;
;
 if (true) break;
if (true) break;

case 49:
//C
this.state = 50;
Debug.locals.put("m", _m);
;
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 3051;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 53;
if (true) break;
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 60;
;
 if (true) break;
if (true) break;

case 53:
//C
this.state = 56;
Debug.locals.put("n", _n);
;
 if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 3056;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"CampoSQL \"  &";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("CampoSQL "),_camposql,RemoteObject.createImmutable(" no encontrado en el método AsignarToolTipInfoCampo."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3057;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "asignartooltipinfocampo"), _msa);
this.state = 65;
return;
case 65:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = -1;
;
 BA.debugLineNum = 3059;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _beforeupdate(RemoteObject __ref,RemoteObject _mdatavalidacion) throws Exception{
try {
		Debug.PushSubsStack("BeforeUpdate (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2570);
if (RapidSub.canDelegate("beforeupdate")) { return __ref.runUserSub(false, "jamformregistro","beforeupdate", __ref, _mdatavalidacion);}
Debug.locals.put("mDataValidacion", _mdatavalidacion);
 BA.debugLineNum = 2570;BA.debugLine="private Sub BeforeUpdate(mDataValidacion As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2571;BA.debugLine="If SubExists(mCallBack,mEventName & \"_BeforeUpdat";
Debug.JustUpdateDeviceLine();
if (jamformregistro.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_BeforeUpdate")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2572;BA.debugLine="CallSubDelayed2(mCallBack,mEventName & \"_BeforeU";
Debug.JustUpdateDeviceLine();
jamformregistro.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_BeforeUpdate"))),(Object)((_mdatavalidacion)));
 }else {
 BA.debugLineNum = 2574;BA.debugLine="AfterUpdate(mDataValidacion)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_afterupdate" /*RemoteObject*/ ,(Object)(_mdatavalidacion));
 };
 BA.debugLineNum = 2576;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnb4xinputdialogitemcampo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnB4XInputDialogItemCampo_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1830);
if (RapidSub.canDelegate("btnb4xinputdialogitemcampo_click")) { return __ref.runUserSub(false, "jamformregistro","btnb4xinputdialogitemcampo_click", __ref);}
RemoteObject _idx = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1830;BA.debugLine="private Sub btnB4XInputDialogItemCampo_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1832;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
Debug.JustUpdateDeviceLine();
_idx = __ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamformregistro.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 1833;BA.debugLine="MostrarB4XInputDialogItemCampo(idx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarb4xinputdialogitemcampo" /*void*/ ,(Object)(_idx));
 BA.debugLineNum = 1866;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnb4xinputdialogselficheroitemcampo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnB4XInputDialogSelFicheroItemCampo_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2965);
if (RapidSub.canDelegate("btnb4xinputdialogselficheroitemcampo_click")) { return __ref.runUserSub(false, "jamformregistro","btnb4xinputdialogselficheroitemcampo_click", __ref);}
RemoteObject _idx = RemoteObject.createImmutable(0);
 BA.debugLineNum = 2965;BA.debugLine="Private Sub btnB4XInputDialogSelFicheroItemCampo_C";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2966;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
Debug.JustUpdateDeviceLine();
_idx = __ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamformregistro.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 2969;BA.debugLine="MostrarSelFicheroInputDialogItemCampo(idx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarselficheroinputdialogitemcampo" /*void*/ ,(Object)(_idx));
 BA.debugLineNum = 2970;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnb4xlisttemplateitemcampo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnB4XListTemplateItemCampo_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1901);
if (RapidSub.canDelegate("btnb4xlisttemplateitemcampo_click")) { return __ref.runUserSub(false, "jamformregistro","btnb4xlisttemplateitemcampo_click", __ref);}
RemoteObject _idx = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1901;BA.debugLine="private Sub btnB4XListTemplateItemCampo_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1903;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
Debug.JustUpdateDeviceLine();
_idx = __ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamformregistro.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 1905;BA.debugLine="MostrarB4XListTemplateItemCampo(idx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarb4xlisttemplateitemcampo" /*void*/ ,(Object)(_idx));
 BA.debugLineNum = 1970;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnb4xsearchlisttemplateitemcampo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnB4XSearchListTemplateItemCampo_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2043);
if (RapidSub.canDelegate("btnb4xsearchlisttemplateitemcampo_click")) { return __ref.runUserSub(false, "jamformregistro","btnb4xsearchlisttemplateitemcampo_click", __ref);}
RemoteObject _idx = RemoteObject.createImmutable(0);
 BA.debugLineNum = 2043;BA.debugLine="Private Sub btnB4XSearchListTemplateItemCampo_Clic";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2044;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
Debug.JustUpdateDeviceLine();
_idx = __ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamformregistro.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 2046;BA.debugLine="MostrarB4XSearchListTemplateItemCampo(idx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarb4xsearchlisttemplateitemcampo" /*void*/ ,(Object)(_idx));
 BA.debugLineNum = 2047;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btncancelar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCancelar_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1791);
if (RapidSub.canDelegate("btncancelar_click")) { __ref.runUserSub(false, "jamformregistro","btncancelar_click", __ref); return;}
ResumableSub_btnCancelar_Click rsub = new ResumableSub_btnCancelar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnCancelar_Click extends BA.ResumableSub {
public ResumableSub_btnCancelar_Click(b4j.docU.jamformregistro parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _flagcambios = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnCancelar_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1791);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1792;BA.debugLine="Dim FlagCambios As Boolean=ComprobarCambiosEnRegi";
Debug.JustUpdateDeviceLine();
_flagcambios = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_comprobarcambiosenregistro" /*RemoteObject*/ );Debug.locals.put("FlagCambios", _flagcambios);Debug.locals.put("FlagCambios", _flagcambios);
 BA.debugLineNum = 1793;BA.debugLine="If FlagCambios Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 10;
if (_flagcambios.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1795;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Hay cambio";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Hay cambios no grabados. ¿Salir sin grabar?")),(Object)(BA.ObjectToString("Cambios no grabados")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1796;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "btncancelar_click"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1797;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1798;BA.debugLine="frmReg.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethod ("Close");
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1801;BA.debugLine="frmReg.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethod ("Close");
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1804;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _btnconfigurarjson_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnConfigurarJSON_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2913);
if (RapidSub.canDelegate("btnconfigurarjson_click")) { return __ref.runUserSub(false, "jamformregistro","btnconfigurarjson_click", __ref);}
 BA.debugLineNum = 2913;BA.debugLine="Private Sub btnConfigurarJSON_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2916;BA.debugLine="AbrirRecordFormBuilder(\"Edicion\",mNombreFicheroJS";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_abrirrecordformbuilder" /*void*/ ,(Object)(BA.ObjectToString("Edicion")),(Object)(__ref.getField(true,"_mnombreficherojson" /*RemoteObject*/ )));
 BA.debugLineNum = 2917;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnok_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnOK_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1694);
if (RapidSub.canDelegate("btnok_click")) { __ref.runUserSub(false, "jamformregistro","btnok_click", __ref); return;}
ResumableSub_btnOK_Click rsub = new ResumableSub_btnOK_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnOK_Click extends BA.ResumableSub {
public ResumableSub_btnOK_Click(b4j.docU.jamformregistro parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _flagcambios = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _infocampojfr = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _valorcampoint = RemoteObject.createImmutable(0);
RemoteObject _valorcampostr = RemoteObject.createImmutable("");
RemoteObject _valorcamporeal = RemoteObject.createImmutable(0);
int step16;
int limit16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnOK_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1694);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1695;BA.debugLine="If mModoRegistro<>\"Editar\" And mModoRegistro<>\"Nu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Editar")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Nuevo"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1696;BA.debugLine="frmReg.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 1697;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1700;BA.debugLine="Dim FlagCambios As Boolean=ComprobarCambiosEnRegi";
Debug.JustUpdateDeviceLine();
_flagcambios = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_comprobarcambiosenregistro" /*RemoteObject*/ );Debug.locals.put("FlagCambios", _flagcambios);Debug.locals.put("FlagCambios", _flagcambios);
 BA.debugLineNum = 1701;BA.debugLine="If FlagCambios=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 5:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_flagcambios,parent.__c.getField(true,"False"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1702;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"NO hay cam";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("NO hay cambios respecto al registro. ¿Salir sin grabar?")),(Object)(BA.ObjectToString("Sin cambios en el registro")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1703;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "btnok_click"), _msa);
this.state = 54;
return;
case 54:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1704;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 1705;BA.debugLine="frmReg.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 1706;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1708;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;
;
 BA.debugLineNum = 1715;BA.debugLine="For i=0 To clvCamposRegistro.Size-1";
Debug.JustUpdateDeviceLine();

case 14:
//for
this.state = 35;
step16 = 1;
limit16 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 55;
if (true) break;

case 55:
//C
this.state = 35;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 16;
if (true) break;

case 56:
//C
this.state = 55;
_i = ((int)(0 + _i + step16)) ;
Debug.locals.put("i", _i);
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1717;BA.debugLine="Dim InfoCampojFR As InfoCampoJamFormRegistro=clv";
Debug.JustUpdateDeviceLine();
_infocampojfr = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("InfoCampojFR", _infocampojfr);Debug.locals.put("InfoCampojFR", _infocampojfr);
 BA.debugLineNum = 1721;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//if
this.state = 34;
if (RemoteObject.solveBoolean("n",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
this.state = 19;
}else {
this.state = 25;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1723;BA.debugLine="If InfoCampojFR.CampoObligatorioCumplimentar Th";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//if
this.state = 23;
if (_infocampojfr.getField(true,"CampoObligatorioCumplimentar" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1725;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligato";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Es obligatorio indicar un valor para el campo "),_infocampojfr.getField(true,"TituloCampo" /*RemoteObject*/ ),RemoteObject.createImmutable("."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("No es posible grabar el registro."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1726;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "btnok_click"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 23;
;
 BA.debugLineNum = 1727;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 23:
//C
this.state = 34;
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1730;BA.debugLine="Select True";
Debug.JustUpdateDeviceLine();
if (true) break;

case 26:
//select
this.state = 33;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoDato" /*RemoteObject*/ ),BA.ObjectToString("INTEGER"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoDato" /*RemoteObject*/ ),BA.ObjectToString("TEXT"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoDato" /*RemoteObject*/ ),BA.ObjectToString("REAL"))))) {
case 0: {
this.state = 28;
if (true) break;
}
case 1: {
this.state = 30;
if (true) break;
}
case 2: {
this.state = 32;
if (true) break;
}
}
if (true) break;

case 28:
//C
this.state = 33;
 BA.debugLineNum = 1734;BA.debugLine="Dim ValorCampoInt As Int=InfoCampojFR.ValorOu";
Debug.JustUpdateDeviceLine();
_valorcampoint = BA.numberCast(int.class, _infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("ValorCampoInt", _valorcampoint);Debug.locals.put("ValorCampoInt", _valorcampoint);
 BA.debugLineNum = 1736;BA.debugLine="InfoCampojFR.ValorOutputCampo=ValorCampoInt";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorOutputCampo" /*RemoteObject*/ ,(_valorcampoint));
 if (true) break;

case 30:
//C
this.state = 33;
 BA.debugLineNum = 1740;BA.debugLine="Dim ValorCampoStr As String=InfoCampojFR.Valo";
Debug.JustUpdateDeviceLine();
_valorcampostr = BA.ObjectToString(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("ValorCampoStr", _valorcampostr);Debug.locals.put("ValorCampoStr", _valorcampostr);
 BA.debugLineNum = 1742;BA.debugLine="InfoCampojFR.ValorOutputCampo=ValorCampoStr";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorOutputCampo" /*RemoteObject*/ ,(_valorcampostr));
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 1746;BA.debugLine="Dim ValorCampoReal As Double=InfoCampojFR.Val";
Debug.JustUpdateDeviceLine();
_valorcamporeal = BA.numberCast(double.class, _infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ));Debug.locals.put("ValorCampoReal", _valorcamporeal);Debug.locals.put("ValorCampoReal", _valorcamporeal);
 BA.debugLineNum = 1748;BA.debugLine="InfoCampojFR.ValorOutputCampo=ValorCampoReal";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorOutputCampo" /*RemoteObject*/ ,(_valorcamporeal));
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = 56;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1764;BA.debugLine="If mModoRegistro=\"Editar\" Then";
Debug.JustUpdateDeviceLine();

case 35:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Editar"))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1765;BA.debugLine="If SubExists(mCallBack,mEventName & \"_GrabarEdic";
Debug.JustUpdateDeviceLine();
if (true) break;

case 38:
//if
this.state = 43;
if (parent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_GrabarEdicionRegistro")))).<Boolean>get().booleanValue()) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
 BA.debugLineNum = 1767;BA.debugLine="Log(\"\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125698121",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 1768;BA.debugLine="Log(\"CallSubDelayed2(mCallBack,mEventName & _Gr";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125698122",RemoteObject.createImmutable("CallSubDelayed2(mCallBack,mEventName & _GrabarEdicionRegistro"),0);
 BA.debugLineNum = 1769;BA.debugLine="CallSubDelayed2(mCallBack,mEventName & \"_Grabar";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_GrabarEdicionRegistro"))),(Object)((__ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ ))));
 if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 1771;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha def";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No se ha definido Sub para grabar la edición del registro en el módulo CallBack."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("No es posible grabar el registro."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1772;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "btnok_click"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = 43;
;
 BA.debugLineNum = 1773;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 43:
//C
this.state = 44;
;
 if (true) break;
;
 BA.debugLineNum = 1777;BA.debugLine="If mModoRegistro=\"Nuevo\" Then";
Debug.JustUpdateDeviceLine();

case 44:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Nuevo"))) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1778;BA.debugLine="If SubExists(mCallBack,mEventName & \"_GrabarNuev";
Debug.JustUpdateDeviceLine();
if (true) break;

case 47:
//if
this.state = 52;
if (parent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_GrabarNuevoRegistro")))).<Boolean>get().booleanValue()) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
 BA.debugLineNum = 1780;BA.debugLine="Log(\"\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125698134",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 1781;BA.debugLine="Log(\"CallSubDelayed2(mCallBack,mEventName & _Gr";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125698135",RemoteObject.createImmutable("CallSubDelayed2(mCallBack,mEventName & _GrabarNuevoRegistro"),0);
 BA.debugLineNum = 1782;BA.debugLine="CallSubDelayed2(mCallBack,mEventName & \"_Grabar";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_GrabarNuevoRegistro"))),(Object)((__ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ ))));
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1784;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha def";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No se ha definido Sub para la grabar nuevo registro en el módulo CallBack."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("No es posible grabar el registro."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1785;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "btnok_click"), _msa);
this.state = 59;
return;
case 59:
//C
this.state = 52;
;
 BA.debugLineNum = 1786;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;

case 53:
//C
this.state = -1;
;
 BA.debugLineNum = 1789;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _btnselfechaitemcampo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaItemCampo_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2344);
if (RapidSub.canDelegate("btnselfechaitemcampo_click")) { return __ref.runUserSub(false, "jamformregistro","btnselfechaitemcampo_click", __ref);}
RemoteObject _idx = RemoteObject.createImmutable(0);
 BA.debugLineNum = 2344;BA.debugLine="private Sub btnSelFechaItemCampo_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2345;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
Debug.JustUpdateDeviceLine();
_idx = __ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamformregistro.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 2347;BA.debugLine="MostrarSelFechaItemCampo(idx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarselfechaitemcampo" /*void*/ ,(Object)(_idx));
 BA.debugLineNum = 2361;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnselficheroitemcampo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFicheroItemCampo_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2200);
if (RapidSub.canDelegate("btnselficheroitemcampo_click")) { return __ref.runUserSub(false, "jamformregistro","btnselficheroitemcampo_click", __ref);}
RemoteObject _idx = RemoteObject.createImmutable(0);
 BA.debugLineNum = 2200;BA.debugLine="private Sub btnSelFicheroItemCampo_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2202;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
Debug.JustUpdateDeviceLine();
_idx = __ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamformregistro.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 2204;BA.debugLine="MostrarSelFicheroItemCampo(idx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarselficheroitemcampo" /*void*/ ,(Object)(_idx));
 BA.debugLineNum = 2249;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnselvalorextitemcampo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelValorExtItemCampo_Click (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2409);
if (RapidSub.canDelegate("btnselvalorextitemcampo_click")) { return __ref.runUserSub(false, "jamformregistro","btnselvalorextitemcampo_click", __ref);}
RemoteObject _idx = RemoteObject.createImmutable(0);
 BA.debugLineNum = 2409;BA.debugLine="private Sub btnSelValorExtItemCampo_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2410;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
Debug.JustUpdateDeviceLine();
_idx = __ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamformregistro.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 2412;BA.debugLine="MostrarSelValorExtItemCampo(idx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_mostrarselvalorextitemcampo" /*void*/ ,(Object)(_idx));
 BA.debugLineNum = 2422;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cargacamposclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposCLV (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1145);
if (RapidSub.canDelegate("cargacamposclv")) { __ref.runUserSub(false, "jamformregistro","cargacamposclv", __ref); return;}
ResumableSub_CargaCamposCLV rsub = new ResumableSub_CargaCamposCLV(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaCamposCLV extends BA.ResumableSub {
public ResumableSub_CargaCamposCLV(b4j.docU.jamformregistro parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _infocampojfr = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _iv = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject group2;
int index2;
int groupLen2;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposCLV (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1145);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1146;BA.debugLine="clvCamposRegistro.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 1149;BA.debugLine="For Each InfoCampojFR As InfoCampoJamFormRegistro";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 8;
group2 = __ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ );
index2 = 0;
groupLen2 = group2.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("InfoCampojFR", _infocampojfr);
this.state = 9;
if (true) break;

case 9:
//C
this.state = 8;
if (index2 < groupLen2) {
this.state = 3;
_infocampojfr = (group2.runMethod(false,"Get",index2));Debug.locals.put("InfoCampojFR", _infocampojfr);}
if (true) break;

case 10:
//C
this.state = 9;
index2++;
Debug.locals.put("InfoCampojFR", _infocampojfr);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1154;BA.debugLine="If InfoCampojFR.TipoControl<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_infocampojfr.getField(true,"TipoControl" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1156;BA.debugLine="Dim rSUB As ResumableSub=CrearItemCLV(InfoCampo";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_crearitemclv" /*RemoteObject*/ ,(Object)(_infocampojfr));Debug.locals.put("rSUB", _rsub);Debug.locals.put("rSUB", _rsub);
 BA.debugLineNum = 1157;BA.debugLine="Wait For (rSUB) complete (mItem As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "cargacamposclv"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_mitem = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mItem", _mitem);
;
 BA.debugLineNum = 1159;BA.debugLine="Dim p As B4XView=mItem.Get(\"Panel\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Panel")))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1161;BA.debugLine="Dim IV As InfoCampoJamFormRegistro=mItem.Get(\"I";
Debug.JustUpdateDeviceLine();
_iv = (_mitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ItemValue")))));Debug.locals.put("IV", _iv);Debug.locals.put("IV", _iv);
 BA.debugLineNum = 1162;BA.debugLine="clvCamposRegistro.Add(p,IV)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_p),(Object)((_iv)));
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
Debug.locals.put("InfoCampojFR", _infocampojfr);
;
 BA.debugLineNum = 1167;BA.debugLine="clvCamposRegistro.Base_Resize(clvCamposRegistro.A";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")));
 BA.debugLineNum = 1168;BA.debugLine="CallSubDelayed(Me,\"CargaCamposCLV_Completed\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("CargaCamposCLV_Completed")));
 BA.debugLineNum = 1169;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _cargacamposjrdcmysql(RemoteObject __ref,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _nombretabla) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCMySQL (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,920);
if (RapidSub.canDelegate("cargacamposjrdcmysql")) { return __ref.runUserSub(false, "jamformregistro","cargacamposjrdcmysql", __ref, _ipjrdc, _puertojrdc, _nombretabla);}
ResumableSub_CargaCamposJRDCMySQL rsub = new ResumableSub_CargaCamposJRDCMySQL(null,__ref,_ipjrdc,_puertojrdc,_nombretabla);
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
public static class ResumableSub_CargaCamposJRDCMySQL extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCMySQL(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _nombretabla) {
this.parent = parent;
this.__ref = __ref;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._nombretabla = _nombretabla;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _ipjrdc;
RemoteObject _puertojrdc;
RemoteObject _nombretabla;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _rdclinkquery = RemoteObject.createImmutable("");
RemoteObject _comandoconfigprop = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _tipodato = RemoteObject.createImmutable("");
RemoteObject _tipodatomysql = RemoteObject.createImmutable("");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _infocampojfr = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
int step23;
int limit23;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCMySQL (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,920);
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
Debug.locals.put("IPJrdc", _ipjrdc);
Debug.locals.put("PuertoJrdc", _puertojrdc);
Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 921;BA.debugLine="Dim Accion As String";
Debug.JustUpdateDeviceLine();
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 924;BA.debugLine="mlstInfoCampos.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 925;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
Debug.JustUpdateDeviceLine();
_rdclinkquery = RemoteObject.concat(RemoteObject.createImmutable("http://"),_ipjrdc,RemoteObject.createImmutable(":"),_puertojrdc,RemoteObject.createImmutable("/rdc"));Debug.locals.put("rdcLinkQuery", _rdclinkquery);Debug.locals.put("rdcLinkQuery", _rdclinkquery);
 BA.debugLineNum = 926;BA.debugLine="Dim ComandoConfigProp As String=\"InfoCamposTabla\"";
Debug.JustUpdateDeviceLine();
_comandoconfigprop = BA.ObjectToString("InfoCamposTabla");Debug.locals.put("ComandoConfigProp", _comandoconfigprop);Debug.locals.put("ComandoConfigProp", _comandoconfigprop);
 BA.debugLineNum = 928;BA.debugLine="Log(\"Antes de CargaCamposJRDC \" & IPJrdc & \", \" &";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125435912",RemoteObject.concat(RemoteObject.createImmutable("Antes de CargaCamposJRDC "),_ipjrdc,RemoteObject.createImmutable(", "),_puertojrdc,RemoteObject.createImmutable(", "),_nombretabla),0);
 BA.debugLineNum = 929;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_rdclinkquery),(Object)(_comandoconfigprop),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_nombretabla)})),(Object)(__ref));
 BA.debugLineNum = 930;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "cargacamposjrdcmysql"), null);
this.state = 56;
return;
case 56:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 931;BA.debugLine="Log (\"Despues de CargaCamposJRDC, mresult \" & mre";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125435915",RemoteObject.concat(RemoteObject.createImmutable("Despues de CargaCamposJRDC, mresult "),_mresult),0);
 BA.debugLineNum = 932;BA.debugLine="frmReg.rootpane.MouseCursor = fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 933;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 55;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 55;
 BA.debugLineNum = 934;BA.debugLine="Accion=\"ErrorServer\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("ErrorServer");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 936;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sin conexión";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Sin conexión con el servidor / base de datos / error de consulta"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 937;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "cargacamposjrdcmysql"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 55;
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 939;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 54;
 BA.debugLineNum = 940;BA.debugLine="Accion=\"TablaNoExiste\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("TablaNoExiste");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 942;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La tabla \" &";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La tabla "),_nombretabla,RemoteObject.createImmutable(" no existe en la base de datos correspondiente a los parámetros JRDC, no es posible configurar sus campos."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 943;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "cargacamposjrdcmysql"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = 54;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 945;BA.debugLine="Dim TipoDato As String";
Debug.JustUpdateDeviceLine();
_tipodato = RemoteObject.createImmutable("");Debug.locals.put("TipoDato", _tipodato);
 BA.debugLineNum = 946;BA.debugLine="Dim TipoDatoMySQL As String";
Debug.JustUpdateDeviceLine();
_tipodatomysql = RemoteObject.createImmutable("");Debug.locals.put("TipoDatoMySQL", _tipodatomysql);
 BA.debugLineNum = 947;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 950;BA.debugLine="For i=0 To lstRes.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//for
this.state = 48;
step23 = 1;
limit23 = RemoteObject.solve(new RemoteObject[] {_lstres.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 59;
if (true) break;

case 59:
//C
this.state = 48;
if ((step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23)) this.state = 13;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step23)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 951;BA.debugLine="Dim mReg As Map=lstRes.Get(i)";
Debug.JustUpdateDeviceLine();
_mreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mReg", _mreg);Debug.locals.put("mReg", _mreg);
 BA.debugLineNum = 954;BA.debugLine="Dim InfoCampojFR As InfoCampoJamFormRegistro";
Debug.JustUpdateDeviceLine();
_infocampojfr = RemoteObject.createNew ("b4j.docU.jamformregistro._infocampojamformregistro");Debug.locals.put("InfoCampojFR", _infocampojfr);
 BA.debugLineNum = 955;BA.debugLine="InfoCampojFR.CampoSQL=mReg.Get(\"COLUMN_NAME\")";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("CampoSQL" /*RemoteObject*/ ,BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 956;BA.debugLine="InfoCampojFR.TituloCampo=mReg.Get(\"COLUMN_NAME";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TituloCampo" /*RemoteObject*/ ,BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 957;BA.debugLine="InfoCampojFR.TipoDatoSQL=mReg.Get(\"DATA_TYPE\")";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoDatoSQL" /*RemoteObject*/ ,BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DATA_TYPE"))))));
 BA.debugLineNum = 958;BA.debugLine="InfoCampojFR.TipoColumnaSQL=mReg.Get(\"COLUMN_T";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoColumnaSQL" /*RemoteObject*/ ,BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_TYPE"))))));
 BA.debugLineNum = 959;BA.debugLine="InfoCampojFR.NoNuloSQL=\"NO\"=mReg.Get(\"IS_NULLA";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("NoNuloSQL" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable("NO"),BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IS_NULLABLE"))))))));
 BA.debugLineNum = 960;BA.debugLine="InfoCampojFR.PrimaryKeySQL=\"PRI\"=mReg.Get(\"COL";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("PrimaryKeySQL" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable("PRI"),BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_KEY"))))))));
 BA.debugLineNum = 961;BA.debugLine="InfoCampojFR.AutoIncrementalSQL=\"auto_incremen";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("AutoIncrementalSQL" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable("auto_increment"),BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EXTRA"))))))));
 BA.debugLineNum = 962;BA.debugLine="InfoCampojFR.ValorCampoPorDefectoSQL=mReg.Get(";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorCampoPorDefectoSQL" /*RemoteObject*/ ,_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_DEFAULT")))));
 BA.debugLineNum = 966;BA.debugLine="Select InfoCampojFR.TipoDatoSQL";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//select
this.state = 47;
switch (BA.switchObjectToInt(_infocampojfr.getField(true,"TipoDatoSQL" /*RemoteObject*/ ),BA.ObjectToString("smallint"),BA.ObjectToString("int"),BA.ObjectToString("tinyint"),BA.ObjectToString("bit"),BA.ObjectToString("bigint"),BA.ObjectToString("varchar"),BA.ObjectToString("char"),BA.ObjectToString("text"),BA.ObjectToString("nchar"),BA.ObjectToString("ntext"),BA.ObjectToString("nvarchar"),BA.ObjectToString("enum"),BA.ObjectToString("double"),BA.ObjectToString("decimal"),BA.ObjectToString("float"))) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 20;
if (true) break;
}
case 3: {
this.state = 22;
if (true) break;
}
case 4: {
this.state = 24;
if (true) break;
}
case 5: {
this.state = 26;
if (true) break;
}
case 6: {
this.state = 28;
if (true) break;
}
case 7: {
this.state = 30;
if (true) break;
}
case 8: {
this.state = 32;
if (true) break;
}
case 9: {
this.state = 34;
if (true) break;
}
case 10: {
this.state = 36;
if (true) break;
}
case 11: {
this.state = 38;
if (true) break;
}
case 12: {
this.state = 40;
if (true) break;
}
case 13: {
this.state = 42;
if (true) break;
}
case 14: {
this.state = 44;
if (true) break;
}
default: {
this.state = 46;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 47;
 BA.debugLineNum = 984;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 18:
//C
this.state = 47;
 BA.debugLineNum = 986;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 20:
//C
this.state = 47;
 BA.debugLineNum = 988;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 22:
//C
this.state = 47;
 BA.debugLineNum = 990;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 24:
//C
this.state = 47;
 BA.debugLineNum = 992;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 26:
//C
this.state = 47;
 BA.debugLineNum = 994;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 28:
//C
this.state = 47;
 BA.debugLineNum = 996;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 30:
//C
this.state = 47;
 BA.debugLineNum = 998;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 32:
//C
this.state = 47;
 BA.debugLineNum = 1000;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 34:
//C
this.state = 47;
 BA.debugLineNum = 1002;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 36:
//C
this.state = 47;
 BA.debugLineNum = 1004;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 38:
//C
this.state = 47;
 BA.debugLineNum = 1006;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 40:
//C
this.state = 47;
 BA.debugLineNum = 1008;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 42:
//C
this.state = 47;
 BA.debugLineNum = 1010;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 44:
//C
this.state = 47;
 BA.debugLineNum = 1012;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1015;BA.debugLine="TipoDato=\"\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 47:
//C
this.state = 60;
;
 BA.debugLineNum = 1019;BA.debugLine="InfoCampojFR.TipoDato=TipoDato";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoDato" /*RemoteObject*/ ,_tipodato);
 BA.debugLineNum = 1021;BA.debugLine="mlstInfoCampos.Add(InfoCampojFR)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_infocampojfr)));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1025;BA.debugLine="If mlstInfoCampos.Size=0 Then";
Debug.JustUpdateDeviceLine();

case 48:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
 BA.debugLineNum = 1026;BA.debugLine="Accion=\"TablaExisteSinCampos\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("TablaExisteSinCampos");Debug.locals.put("Accion", _accion);
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 1028;BA.debugLine="Accion=\"OK\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 55;
;
 if (true) break;

case 55:
//C
this.state = -1;
;
 BA.debugLineNum = 1034;BA.debugLine="Return Accion";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 1035;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _cargacamposjrdcsqlserver(RemoteObject __ref,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _nombretabla) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCSQLServer (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1038);
if (RapidSub.canDelegate("cargacamposjrdcsqlserver")) { return __ref.runUserSub(false, "jamformregistro","cargacamposjrdcsqlserver", __ref, _ipjrdc, _puertojrdc, _nombretabla);}
ResumableSub_CargaCamposJRDCSQLServer rsub = new ResumableSub_CargaCamposJRDCSQLServer(null,__ref,_ipjrdc,_puertojrdc,_nombretabla);
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
public static class ResumableSub_CargaCamposJRDCSQLServer extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCSQLServer(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _nombretabla) {
this.parent = parent;
this.__ref = __ref;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._nombretabla = _nombretabla;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _ipjrdc;
RemoteObject _puertojrdc;
RemoteObject _nombretabla;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _rdclinkquery = RemoteObject.createImmutable("");
RemoteObject _comandoconfigprop = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _tipodato = RemoteObject.createImmutable("");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _infocampojfr = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
int step22;
int limit22;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCamposJRDCSQLServer (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1038);
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
Debug.locals.put("IPJrdc", _ipjrdc);
Debug.locals.put("PuertoJrdc", _puertojrdc);
Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 1039;BA.debugLine="Dim Accion As String";
Debug.JustUpdateDeviceLine();
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1042;BA.debugLine="mlstInfoCampos.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1043;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
Debug.JustUpdateDeviceLine();
_rdclinkquery = RemoteObject.concat(RemoteObject.createImmutable("http://"),_ipjrdc,RemoteObject.createImmutable(":"),_puertojrdc,RemoteObject.createImmutable("/rdc"));Debug.locals.put("rdcLinkQuery", _rdclinkquery);Debug.locals.put("rdcLinkQuery", _rdclinkquery);
 BA.debugLineNum = 1045;BA.debugLine="Dim ComandoConfigProp As String=\"InfoTotalCamposT";
Debug.JustUpdateDeviceLine();
_comandoconfigprop = BA.ObjectToString("InfoTotalCamposTabla");Debug.locals.put("ComandoConfigProp", _comandoconfigprop);Debug.locals.put("ComandoConfigProp", _comandoconfigprop);
 BA.debugLineNum = 1047;BA.debugLine="Log(\"Antes de CargaCamposJRDC \" & IPJrdc & \", \" &";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125501449",RemoteObject.concat(RemoteObject.createImmutable("Antes de CargaCamposJRDC "),_ipjrdc,RemoteObject.createImmutable(", "),_puertojrdc,RemoteObject.createImmutable(", "),_nombretabla),0);
 BA.debugLineNum = 1048;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_rdclinkquery),(Object)(_comandoconfigprop),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_nombretabla),(_nombretabla)})),(Object)(__ref));
 BA.debugLineNum = 1049;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "cargacamposjrdcsqlserver"), null);
this.state = 56;
return;
case 56:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 1050;BA.debugLine="Log (\"Despues de CargaCamposJRDC, mresult \" & mre";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125501452",RemoteObject.concat(RemoteObject.createImmutable("Despues de CargaCamposJRDC, mresult "),_mresult),0);
 BA.debugLineNum = 1051;BA.debugLine="frmReg.rootpane.MouseCursor = fx.Cursors.DEFAULT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1052;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 55;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 55;
 BA.debugLineNum = 1053;BA.debugLine="Accion=\"ErrorServer\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("ErrorServer");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1055;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sin conexión";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Sin conexión con el servidor / base de datos / error de consulta"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1056;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "cargacamposjrdcsqlserver"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 55;
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1058;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 54;
 BA.debugLineNum = 1059;BA.debugLine="Accion=\"TablaNoExiste\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("TablaNoExiste");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1061;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La tabla \" &";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La tabla "),_nombretabla,RemoteObject.createImmutable(" no existe en la base de datos correspondiente a los parámetros JRDC, no es posible configurar sus campos."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1062;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "cargacamposjrdcsqlserver"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = 54;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1064;BA.debugLine="Dim TipoDato As String";
Debug.JustUpdateDeviceLine();
_tipodato = RemoteObject.createImmutable("");Debug.locals.put("TipoDato", _tipodato);
 BA.debugLineNum = 1066;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 1069;BA.debugLine="For i=0 To lstRes.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//for
this.state = 48;
step22 = 1;
limit22 = RemoteObject.solve(new RemoteObject[] {_lstres.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 59;
if (true) break;

case 59:
//C
this.state = 48;
if ((step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22)) this.state = 13;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step22)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1070;BA.debugLine="Dim mReg As Map=lstRes.Get(i)";
Debug.JustUpdateDeviceLine();
_mreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mReg", _mreg);Debug.locals.put("mReg", _mreg);
 BA.debugLineNum = 1073;BA.debugLine="Dim InfoCampojFR As InfoCampoJamFormRegistro";
Debug.JustUpdateDeviceLine();
_infocampojfr = RemoteObject.createNew ("b4j.docU.jamformregistro._infocampojamformregistro");Debug.locals.put("InfoCampojFR", _infocampojfr);
 BA.debugLineNum = 1074;BA.debugLine="InfoCampojFR.CampoSQL=mReg.Get(\"COLUMN_NAME\")";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("CampoSQL" /*RemoteObject*/ ,BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 1075;BA.debugLine="InfoCampojFR.TituloCampo=mReg.Get(\"COLUMN_NAME";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TituloCampo" /*RemoteObject*/ ,BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME"))))));
 BA.debugLineNum = 1076;BA.debugLine="InfoCampojFR.TipoDatoSQL=mReg.Get(\"DATA_TYPE\")";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoDatoSQL" /*RemoteObject*/ ,BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DATA_TYPE"))))));
 BA.debugLineNum = 1077;BA.debugLine="InfoCampojFR.TipoColumnaSQL=mReg.Get(\"COLUMN_T";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoColumnaSQL" /*RemoteObject*/ ,BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_TYPE"))))));
 BA.debugLineNum = 1078;BA.debugLine="InfoCampojFR.NoNuloSQL=\"NO\"=mReg.Get(\"IS_NULLA";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("NoNuloSQL" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable("NO"),BA.ObjectToString(_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IS_NULLABLE"))))))));
 BA.debugLineNum = 1082;BA.debugLine="InfoCampojFR.PrimaryKeySQL=mReg.Get(\"PK\")=mReg";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("PrimaryKeySQL" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PK")))),_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_NAME")))))));
 BA.debugLineNum = 1083;BA.debugLine="InfoCampojFR.AutoIncrementalSQL=1=mReg.Get(\"Id";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("AutoIncrementalSQL" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable(1),BA.numberCast(double.class, _mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Identidad"))))))));
 BA.debugLineNum = 1084;BA.debugLine="InfoCampojFR.ValorCampoPorDefectoSQL=mReg.Get(";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorCampoPorDefectoSQL" /*RemoteObject*/ ,_mreg.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("COLUMN_DEFAULT")))));
 BA.debugLineNum = 1088;BA.debugLine="Select InfoCampojFR.TipoDatoSQL";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//select
this.state = 47;
switch (BA.switchObjectToInt(_infocampojfr.getField(true,"TipoDatoSQL" /*RemoteObject*/ ),BA.ObjectToString("smallint"),BA.ObjectToString("int"),BA.ObjectToString("tinyint"),BA.ObjectToString("bit"),BA.ObjectToString("varchar"),BA.ObjectToString("char"),BA.ObjectToString("text"),BA.ObjectToString("nchar"),BA.ObjectToString("ntext"),BA.ObjectToString("nvarchar"),BA.ObjectToString("enum"),BA.ObjectToString("double"),BA.ObjectToString("decimal"),BA.ObjectToString("float"),BA.ObjectToString("bigint"))) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 20;
if (true) break;
}
case 3: {
this.state = 22;
if (true) break;
}
case 4: {
this.state = 24;
if (true) break;
}
case 5: {
this.state = 26;
if (true) break;
}
case 6: {
this.state = 28;
if (true) break;
}
case 7: {
this.state = 30;
if (true) break;
}
case 8: {
this.state = 32;
if (true) break;
}
case 9: {
this.state = 34;
if (true) break;
}
case 10: {
this.state = 36;
if (true) break;
}
case 11: {
this.state = 38;
if (true) break;
}
case 12: {
this.state = 40;
if (true) break;
}
case 13: {
this.state = 42;
if (true) break;
}
case 14: {
this.state = 44;
if (true) break;
}
default: {
this.state = 46;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 47;
 BA.debugLineNum = 1090;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 18:
//C
this.state = 47;
 BA.debugLineNum = 1092;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 20:
//C
this.state = 47;
 BA.debugLineNum = 1094;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 22:
//C
this.state = 47;
 BA.debugLineNum = 1096;BA.debugLine="TipoDato=\"INTEGER\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("INTEGER");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 24:
//C
this.state = 47;
 BA.debugLineNum = 1098;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 26:
//C
this.state = 47;
 BA.debugLineNum = 1100;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 28:
//C
this.state = 47;
 BA.debugLineNum = 1102;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 30:
//C
this.state = 47;
 BA.debugLineNum = 1104;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 32:
//C
this.state = 47;
 BA.debugLineNum = 1106;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 34:
//C
this.state = 47;
 BA.debugLineNum = 1108;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 36:
//C
this.state = 47;
 BA.debugLineNum = 1110;BA.debugLine="TipoDato=\"TEXT\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("TEXT");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 38:
//C
this.state = 47;
 BA.debugLineNum = 1112;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 40:
//C
this.state = 47;
 BA.debugLineNum = 1114;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 42:
//C
this.state = 47;
 BA.debugLineNum = 1116;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 44:
//C
this.state = 47;
 BA.debugLineNum = 1118;BA.debugLine="TipoDato=\"REAL\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("REAL");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1120;BA.debugLine="TipoDato=\"\"";
Debug.JustUpdateDeviceLine();
_tipodato = BA.ObjectToString("");Debug.locals.put("TipoDato", _tipodato);
 if (true) break;

case 47:
//C
this.state = 60;
;
 BA.debugLineNum = 1124;BA.debugLine="InfoCampojFR.TipoDato=TipoDato";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoDato" /*RemoteObject*/ ,_tipodato);
 BA.debugLineNum = 1126;BA.debugLine="mlstInfoCampos.Add(InfoCampojFR)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_infocampojfr)));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1130;BA.debugLine="If mlstInfoCampos.Size=0 Then";
Debug.JustUpdateDeviceLine();

case 48:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
 BA.debugLineNum = 1131;BA.debugLine="Accion=\"TablaExisteSinCampos\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("TablaExisteSinCampos");Debug.locals.put("Accion", _accion);
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 1133;BA.debugLine="Accion=\"OK\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 55;
;
 if (true) break;

case 55:
//C
this.state = -1;
;
 BA.debugLineNum = 1139;BA.debugLine="Return Accion";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 1140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _cargaitemsauxcontrol(RemoteObject __ref,RemoteObject _ipjrdcorigendatosaux,RemoteObject _puertojrdcorigendatosaux,RemoteObject _comandoconfigdatosaux,RemoteObject _lstparametroscomandodatosaux) throws Exception{
try {
		Debug.PushSubsStack("CargaItemsAuxControl (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2465);
if (RapidSub.canDelegate("cargaitemsauxcontrol")) { __ref.runUserSub(false, "jamformregistro","cargaitemsauxcontrol", __ref, _ipjrdcorigendatosaux, _puertojrdcorigendatosaux, _comandoconfigdatosaux, _lstparametroscomandodatosaux); return;}
ResumableSub_CargaItemsAuxControl rsub = new ResumableSub_CargaItemsAuxControl(null,__ref,_ipjrdcorigendatosaux,_puertojrdcorigendatosaux,_comandoconfigdatosaux,_lstparametroscomandodatosaux);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaItemsAuxControl extends BA.ResumableSub {
public ResumableSub_CargaItemsAuxControl(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _ipjrdcorigendatosaux,RemoteObject _puertojrdcorigendatosaux,RemoteObject _comandoconfigdatosaux,RemoteObject _lstparametroscomandodatosaux) {
this.parent = parent;
this.__ref = __ref;
this._ipjrdcorigendatosaux = _ipjrdcorigendatosaux;
this._puertojrdcorigendatosaux = _puertojrdcorigendatosaux;
this._comandoconfigdatosaux = _comandoconfigdatosaux;
this._lstparametroscomandodatosaux = _lstparametroscomandodatosaux;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _ipjrdcorigendatosaux;
RemoteObject _puertojrdcorigendatosaux;
RemoteObject _comandoconfigdatosaux;
RemoteObject _lstparametroscomandodatosaux;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rdclinkquery = RemoteObject.createImmutable("");
RemoteObject _params = null;
int _idxparam = 0;
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
int step9;
int limit9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaItemsAuxControl (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2465);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IPJrdcOrigenDatosAux", _ipjrdcorigendatosaux);
Debug.locals.put("PuertoJrdcOrigenDatosAux", _puertojrdcorigendatosaux);
Debug.locals.put("ComandoConfigDatosAux", _comandoconfigdatosaux);
Debug.locals.put("lstParametrosComandoDatosAux", _lstparametroscomandodatosaux);
 BA.debugLineNum = 2466;BA.debugLine="Dim Accion As String";
Debug.JustUpdateDeviceLine();
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2467;BA.debugLine="Dim lstReg As List";
Debug.JustUpdateDeviceLine();
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2468;BA.debugLine="lstReg.Initialize";
Debug.JustUpdateDeviceLine();
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 2469;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdcOrig";
Debug.JustUpdateDeviceLine();
_rdclinkquery = RemoteObject.concat(RemoteObject.createImmutable("http://"),_ipjrdcorigendatosaux,RemoteObject.createImmutable(":"),_puertojrdcorigendatosaux,RemoteObject.createImmutable("/rdc"));Debug.locals.put("rdcLinkQuery", _rdclinkquery);Debug.locals.put("rdcLinkQuery", _rdclinkquery);
 BA.debugLineNum = 2471;BA.debugLine="If lstParametrosComandoDatosAux.Size=0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_lstparametroscomandodatosaux.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 2472;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigDa";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_rdclinkquery),(Object)(_comandoconfigdatosaux),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2475;BA.debugLine="Dim Params(lstParametrosComandoDatosAux.Size) As";
Debug.JustUpdateDeviceLine();
_params = RemoteObject.createNewArray ("String", new int[] {_lstparametroscomandodatosaux.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Params", _params);
 BA.debugLineNum = 2476;BA.debugLine="For iDxParam=0 To lstParametrosComandoDatosAux.S";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//for
this.state = 9;
step9 = 1;
limit9 = RemoteObject.solve(new RemoteObject[] {_lstparametroscomandodatosaux.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxparam = 0 ;
Debug.locals.put("iDxParam", _idxparam);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 9;
if ((step9 > 0 && _idxparam <= limit9) || (step9 < 0 && _idxparam >= limit9)) this.state = 8;
if (true) break;

case 24:
//C
this.state = 23;
_idxparam = ((int)(0 + _idxparam + step9)) ;
Debug.locals.put("iDxParam", _idxparam);
if (true) break;

case 8:
//C
this.state = 24;
 BA.debugLineNum = 2477;BA.debugLine="Params(iDxParam)=lstParametrosComandoDatosAux.G";
Debug.JustUpdateDeviceLine();
_params.setArrayElement (BA.ObjectToString(_lstparametroscomandodatosaux.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _idxparam)))),BA.numberCast(int.class, _idxparam));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
Debug.locals.put("iDxParam", _idxparam);
;
 BA.debugLineNum = 2479;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigDa";
Debug.JustUpdateDeviceLine();
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_rdclinkquery),(Object)(_comandoconfigdatosaux),(Object)((_params)),(Object)(__ref));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2481;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "cargaitemsauxcontrol"), null);
this.state = 25;
return;
case 25:
//C
this.state = 11;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 2482;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 22;
 BA.debugLineNum = 2483;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2484;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "cargaitemsauxcontrol"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 22;
;
 BA.debugLineNum = 2485;BA.debugLine="Accion=\"ErrConn\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2487;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 2488;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos auxiliares para la carga del control")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2489;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "cargaitemsauxcontrol"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 21;
;
 BA.debugLineNum = 2490;BA.debugLine="Accion=\"ErrNoDataAux\"";
Debug.JustUpdateDeviceLine();
_accion = BA.ObjectToString("ErrNoDataAux");Debug.locals.put("Accion", _accion);
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 2492;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
Debug.JustUpdateDeviceLine();
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 2495;BA.debugLine="CallSubDelayed3(Me,\"CargaItemsAuxControl_Complete";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("CargaItemsAuxControl_Completed")),(Object)((_accion)),(Object)((_lstreg)));
 BA.debugLineNum = 2496;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _cdbl(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CDbl (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2750);
if (RapidSub.canDelegate("cdbl")) { return __ref.runUserSub(false, "jamformregistro","cdbl", __ref, _o);}
RemoteObject _ox = RemoteObject.createImmutable("");
Debug.locals.put("o", _o);
 BA.debugLineNum = 2750;BA.debugLine="private Sub CDbl(o As Object) As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2751;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 2752;BA.debugLine="Dim ox As String = o";
Debug.JustUpdateDeviceLine();
_ox = BA.ObjectToString(_o);Debug.locals.put("ox", _ox);Debug.locals.put("ox", _ox);
 BA.debugLineNum = 2753;BA.debugLine="ox = GetNumbers(ox)";
Debug.JustUpdateDeviceLine();
_ox = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_getnumbers" /*RemoteObject*/ ,(Object)(_ox));Debug.locals.put("ox", _ox);
 BA.debugLineNum = 2754;BA.debugLine="If ox = \"\" Then ox = \"0\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ox,BA.ObjectToString(""))) { 
_ox = BA.ObjectToString("0");Debug.locals.put("ox", _ox);};
 BA.debugLineNum = 2755;BA.debugLine="Return ox";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(double.class, _ox);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 2757;BA.debugLine="Return 0";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, 0);
 };
 BA.debugLineNum = 2759;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cerrarformregistro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CerrarFormRegistro (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1806);
if (RapidSub.canDelegate("cerrarformregistro")) { return __ref.runUserSub(false, "jamformregistro","cerrarformregistro", __ref);}
 BA.debugLineNum = 1806;BA.debugLine="public Sub CerrarFormRegistro";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1807;BA.debugLine="frmReg.Close";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 1808;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkboxitemcampo_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("chkBoxItemCampo_MouseClicked (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2314);
if (RapidSub.canDelegate("chkboxitemcampo_mouseclicked")) { return __ref.runUserSub(false, "jamformregistro","chkboxitemcampo_mouseclicked", __ref, _eventdata);}
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _idx = RemoteObject.createImmutable(0);
RemoteObject _iv = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _valorvalidacion = RemoteObject.createImmutable(0);
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 2314;BA.debugLine="private Sub chkBoxItemCampo_MouseClicked (EventDat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2315;BA.debugLine="Dim chk As CheckBox=Sender";
Debug.JustUpdateDeviceLine();
_chk = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chk = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), jamformregistro.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("chk", _chk);Debug.locals.put("chk", _chk);
 BA.debugLineNum = 2316;BA.debugLine="Log(\"chkBoxItemCampo_CheckedChange Checked \" & ch";
Debug.JustUpdateDeviceLine();
jamformregistro.__c.runVoidMethod ("LogImpl","9126746626",RemoteObject.concat(RemoteObject.createImmutable("chkBoxItemCampo_CheckedChange Checked "),_chk.runMethod(true,"getChecked")),0);
 BA.debugLineNum = 2317;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
Debug.JustUpdateDeviceLine();
_idx = __ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _chk.getObject()));Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 2318;BA.debugLine="Log(\"idx CheckBox: \" & idx)";
Debug.JustUpdateDeviceLine();
jamformregistro.__c.runVoidMethod ("LogImpl","9126746628",RemoteObject.concat(RemoteObject.createImmutable("idx CheckBox: "),_idx),0);
 BA.debugLineNum = 2319;BA.debugLine="Log(\"clvCamposRegistro.GetValue(idx) \" & clvCampo";
Debug.JustUpdateDeviceLine();
jamformregistro.__c.runVoidMethod ("LogImpl","9126746629",RemoteObject.concat(RemoteObject.createImmutable("clvCamposRegistro.GetValue(idx) "),__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_idx))),0);
 BA.debugLineNum = 2320;BA.debugLine="Dim iv As InfoCampoJamFormRegistro=clvCamposRegis";
Debug.JustUpdateDeviceLine();
_iv = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_idx)));Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 2321;BA.debugLine="Dim ValorValidacion As Int";
Debug.JustUpdateDeviceLine();
_valorvalidacion = RemoteObject.createImmutable(0);Debug.locals.put("ValorValidacion", _valorvalidacion);
 BA.debugLineNum = 2322;BA.debugLine="If chk.Checked Then";
Debug.JustUpdateDeviceLine();
if (_chk.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2323;BA.debugLine="ValorValidacion=1";
Debug.JustUpdateDeviceLine();
_valorvalidacion = BA.numberCast(int.class, 1);Debug.locals.put("ValorValidacion", _valorvalidacion);
 }else {
 BA.debugLineNum = 2325;BA.debugLine="ValorValidacion=0";
Debug.JustUpdateDeviceLine();
_valorvalidacion = BA.numberCast(int.class, 0);Debug.locals.put("ValorValidacion", _valorvalidacion);
 };
 BA.debugLineNum = 2327;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":idx, \"clvIV\":i";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = jamformregistro.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Index")),(_idx),RemoteObject.createImmutable(("clvIV")),(_iv),RemoteObject.createImmutable(("ValorValidacion")),(_valorvalidacion)}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 2328;BA.debugLine="BeforeUpdate(mData)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_beforeupdate" /*RemoteObject*/ ,(Object)(_mdata));
 BA.debugLineNum = 2329;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cint(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CInt (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2762);
if (RapidSub.canDelegate("cint")) { return __ref.runUserSub(false, "jamformregistro","cint", __ref, _o);}
RemoteObject _ox = RemoteObject.createImmutable("");
Debug.locals.put("o", _o);
 BA.debugLineNum = 2762;BA.debugLine="private Sub CInt(o As Object) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2763;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 2764;BA.debugLine="Dim ox As String = o";
Debug.JustUpdateDeviceLine();
_ox = BA.ObjectToString(_o);Debug.locals.put("ox", _ox);Debug.locals.put("ox", _ox);
 BA.debugLineNum = 2765;BA.debugLine="ox = GetNumbers(ox)";
Debug.JustUpdateDeviceLine();
_ox = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_getnumbers" /*RemoteObject*/ ,(Object)(_ox));Debug.locals.put("ox", _ox);
 BA.debugLineNum = 2766;BA.debugLine="If ox = \"\" Then ox = \"0\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ox,BA.ObjectToString(""))) { 
_ox = BA.ObjectToString("0");Debug.locals.put("ox", _ox);};
 BA.debugLineNum = 2767;BA.debugLine="Return Floor(ox)";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, jamformregistro.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _ox))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 2769;BA.debugLine="Return 0";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 2771;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private fx As JFX";
jamformregistro._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",jamformregistro._fx);
 //BA.debugLineNum = 23;BA.debugLine="Private frmReg As Form";
jamformregistro._frmreg = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frmreg",jamformregistro._frmreg);
 //BA.debugLineNum = 24;BA.debugLine="Private xui As XUI";
jamformregistro._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",jamformregistro._xui);
 //BA.debugLineNum = 25;BA.debugLine="Private mEventName As String 'ignore";
jamformregistro._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",jamformregistro._meventname);
 //BA.debugLineNum = 26;BA.debugLine="Private mCallBack As Object 'ignore";
jamformregistro._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",jamformregistro._mcallback);
 //BA.debugLineNum = 28;BA.debugLine="Private mModoRegistro As String";
jamformregistro._mmodoregistro = RemoteObject.createImmutable("");__ref.setField("_mmodoregistro",jamformregistro._mmodoregistro);
 //BA.debugLineNum = 29;BA.debugLine="Private btnCancelar As Button";
jamformregistro._btncancelar = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncancelar",jamformregistro._btncancelar);
 //BA.debugLineNum = 30;BA.debugLine="Private btnOK As Button";
jamformregistro._btnok = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnok",jamformregistro._btnok);
 //BA.debugLineNum = 31;BA.debugLine="Private clvCamposRegistro As CustomListView";
jamformregistro._clvcamposregistro = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvcamposregistro",jamformregistro._clvcamposregistro);
 //BA.debugLineNum = 32;BA.debugLine="Private lblModoRegistro As Label";
jamformregistro._lblmodoregistro = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmodoregistro",jamformregistro._lblmodoregistro);
 //BA.debugLineNum = 33;BA.debugLine="Private lblModoRegistroFAweEditar As Label";
jamformregistro._lblmodoregistrofaweeditar = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmodoregistrofaweeditar",jamformregistro._lblmodoregistrofaweeditar);
 //BA.debugLineNum = 34;BA.debugLine="Private lblModoRegistroFAweNuevo As Label";
jamformregistro._lblmodoregistrofawenuevo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmodoregistrofawenuevo",jamformregistro._lblmodoregistrofawenuevo);
 //BA.debugLineNum = 35;BA.debugLine="Private lblModoRegistroFAweVer As Label";
jamformregistro._lblmodoregistrofawever = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmodoregistrofawever",jamformregistro._lblmodoregistrofawever);
 //BA.debugLineNum = 36;BA.debugLine="Private lblTitleModoRegistro As Label";
jamformregistro._lbltitlemodoregistro = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlemodoregistro",jamformregistro._lbltitlemodoregistro);
 //BA.debugLineNum = 38;BA.debugLine="Type TipoOrigenDatosJamFormRegistro (IpJRDC As St";
;
 //BA.debugLineNum = 39;BA.debugLine="Private DatosOrigenDatosFormRegistro As TipoOrige";
jamformregistro._datosorigendatosformregistro = RemoteObject.createNew ("b4j.docU.jamformregistro._tipoorigendatosjamformregistro");__ref.setField("_datosorigendatosformregistro",jamformregistro._datosorigendatosformregistro);
 //BA.debugLineNum = 54;BA.debugLine="Type InfoCampoJamFormRegistro(CampoSQL As String,";
;
 //BA.debugLineNum = 61;BA.debugLine="Private lstItemsCLV As List";
jamformregistro._lstitemsclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstitemsclv",jamformregistro._lstitemsclv);
 //BA.debugLineNum = 64;BA.debugLine="Private CargandoDatos As Boolean";
jamformregistro._cargandodatos = RemoteObject.createImmutable(false);__ref.setField("_cargandodatos",jamformregistro._cargandodatos);
 //BA.debugLineNum = 66;BA.debugLine="Private ErrorCargaDatos As Boolean";
jamformregistro._errorcargadatos = RemoteObject.createImmutable(false);__ref.setField("_errorcargadatos",jamformregistro._errorcargadatos);
 //BA.debugLineNum = 67;BA.debugLine="Private msgErrorCargaDatos As String";
jamformregistro._msgerrorcargadatos = RemoteObject.createImmutable("");__ref.setField("_msgerrorcargadatos",jamformregistro._msgerrorcargadatos);
 //BA.debugLineNum = 70;BA.debugLine="Private ColItemsImpares, ColItemsPares As Int";
jamformregistro._colitemsimpares = RemoteObject.createImmutable(0);__ref.setField("_colitemsimpares",jamformregistro._colitemsimpares);
jamformregistro._colitemspares = RemoteObject.createImmutable(0);__ref.setField("_colitemspares",jamformregistro._colitemspares);
 //BA.debugLineNum = 72;BA.debugLine="Private TipoControl_TextField, TipoControl_B4XInp";
jamformregistro._tipocontrol_textfield = RemoteObject.createImmutable("");__ref.setField("_tipocontrol_textfield",jamformregistro._tipocontrol_textfield);
jamformregistro._tipocontrol_b4xinputdialogtextfield = RemoteObject.createImmutable("");__ref.setField("_tipocontrol_b4xinputdialogtextfield",jamformregistro._tipocontrol_b4xinputdialogtextfield);
jamformregistro._tipocontrol_b4xlistdialogtextfield = RemoteObject.createImmutable("");__ref.setField("_tipocontrol_b4xlistdialogtextfield",jamformregistro._tipocontrol_b4xlistdialogtextfield);
jamformregistro._tipocontrol_b4xsearchlistdialogtextfield = RemoteObject.createImmutable("");__ref.setField("_tipocontrol_b4xsearchlistdialogtextfield",jamformregistro._tipocontrol_b4xsearchlistdialogtextfield);
jamformregistro._tipocontrol_combobox = RemoteObject.createImmutable("");__ref.setField("_tipocontrol_combobox",jamformregistro._tipocontrol_combobox);
jamformregistro._tipocontrol_lmb4xcombobox = RemoteObject.createImmutable("");__ref.setField("_tipocontrol_lmb4xcombobox",jamformregistro._tipocontrol_lmb4xcombobox);
jamformregistro._tipocontrol_checkbox = RemoteObject.createImmutable("");__ref.setField("_tipocontrol_checkbox",jamformregistro._tipocontrol_checkbox);
jamformregistro._tipocontrol_textfieldbuttonselfecha = RemoteObject.createImmutable("");__ref.setField("_tipocontrol_textfieldbuttonselfecha",jamformregistro._tipocontrol_textfieldbuttonselfecha);
jamformregistro._tipocontrol_textfieldbuttonselfile = RemoteObject.createImmutable("");__ref.setField("_tipocontrol_textfieldbuttonselfile",jamformregistro._tipocontrol_textfieldbuttonselfile);
jamformregistro._tipocontrol_textfieldbuttonselext = RemoteObject.createImmutable("");__ref.setField("_tipocontrol_textfieldbuttonselext",jamformregistro._tipocontrol_textfieldbuttonselext);
 //BA.debugLineNum = 74;BA.debugLine="TipoControl_TextField = \"TextField\"";
__ref.setField ("_tipocontrol_textfield" /*RemoteObject*/ ,BA.ObjectToString("TextField"));
 //BA.debugLineNum = 75;BA.debugLine="TipoControl_ComboBox = \"ComboBox\"";
__ref.setField ("_tipocontrol_combobox" /*RemoteObject*/ ,BA.ObjectToString("ComboBox"));
 //BA.debugLineNum = 76;BA.debugLine="TipoControl_lmB4XComboBox = \"lmB4XComboBox\"";
__ref.setField ("_tipocontrol_lmb4xcombobox" /*RemoteObject*/ ,BA.ObjectToString("lmB4XComboBox"));
 //BA.debugLineNum = 77;BA.debugLine="TipoControl_CheckBox = \"CheckBox\"";
__ref.setField ("_tipocontrol_checkbox" /*RemoteObject*/ ,BA.ObjectToString("CheckBox"));
 //BA.debugLineNum = 78;BA.debugLine="TipoControl_TextFieldButtonSelFecha = \"TextFieldB";
__ref.setField ("_tipocontrol_textfieldbuttonselfecha" /*RemoteObject*/ ,BA.ObjectToString("TextFieldBtnSelFecha"));
 //BA.debugLineNum = 79;BA.debugLine="TipoControl_TextFieldButtonSelFile = \"TextFieldBt";
__ref.setField ("_tipocontrol_textfieldbuttonselfile" /*RemoteObject*/ ,BA.ObjectToString("TextFieldBtnSelFile"));
 //BA.debugLineNum = 80;BA.debugLine="TipoControl_TextFieldButtonSelExt = \"TextFieldBtn";
__ref.setField ("_tipocontrol_textfieldbuttonselext" /*RemoteObject*/ ,BA.ObjectToString("TextFieldBtnSelExt"));
 //BA.debugLineNum = 81;BA.debugLine="TipoControl_B4XInputDialogTextField=\"B4XInputDial";
__ref.setField ("_tipocontrol_b4xinputdialogtextfield" /*RemoteObject*/ ,BA.ObjectToString("B4XInputDialogTextField"));
 //BA.debugLineNum = 82;BA.debugLine="TipoControl_B4XListDialogTextField=\"B4XListDialog";
__ref.setField ("_tipocontrol_b4xlistdialogtextfield" /*RemoteObject*/ ,BA.ObjectToString("B4XListDialogTextField"));
 //BA.debugLineNum = 83;BA.debugLine="TipoControl_B4XSearchListDialogTextField=\"B4XSear";
__ref.setField ("_tipocontrol_b4xsearchlistdialogtextfield" /*RemoteObject*/ ,BA.ObjectToString("B4XSearchListDialogTextField"));
 //BA.debugLineNum = 85;BA.debugLine="Private Dialog As B4XDialog";
jamformregistro._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",jamformregistro._dialog);
 //BA.debugLineNum = 86;BA.debugLine="Private DateTemplate As B4XDateTemplate";
jamformregistro._datetemplate = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");__ref.setField("_datetemplate",jamformregistro._datetemplate);
 //BA.debugLineNum = 87;BA.debugLine="Private InputTemplate As B4XInputTemplate";
jamformregistro._inputtemplate = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");__ref.setField("_inputtemplate",jamformregistro._inputtemplate);
 //BA.debugLineNum = 89;BA.debugLine="Private DragCoords As Map";
jamformregistro._dragcoords = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_dragcoords",jamformregistro._dragcoords);
 //BA.debugLineNum = 91;BA.debugLine="Private mNombreFicheroJSON As String";
jamformregistro._mnombreficherojson = RemoteObject.createImmutable("");__ref.setField("_mnombreficherojson",jamformregistro._mnombreficherojson);
 //BA.debugLineNum = 92;BA.debugLine="Private mDatosInputRegistro As Map";
jamformregistro._mdatosinputregistro = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mdatosinputregistro",jamformregistro._mdatosinputregistro);
 //BA.debugLineNum = 94;BA.debugLine="Private mlstInfoCamposSQL As List";
jamformregistro._mlstinfocampossql = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_mlstinfocampossql",jamformregistro._mlstinfocampossql);
 //BA.debugLineNum = 95;BA.debugLine="Private mlstInfoCampos As List";
jamformregistro._mlstinfocampos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_mlstinfocampos",jamformregistro._mlstinfocampos);
 //BA.debugLineNum = 98;BA.debugLine="Private pnlFondoFormRegistro As Pane";
jamformregistro._pnlfondoformregistro = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pnlfondoformregistro",jamformregistro._pnlfondoformregistro);
 //BA.debugLineNum = 100;BA.debugLine="Private lblTitleItemCampo As Label";
jamformregistro._lbltitleitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitleitemcampo",jamformregistro._lbltitleitemcampo);
 //BA.debugLineNum = 101;BA.debugLine="Private btnSelFicheroItemCampo As Button";
jamformregistro._btnselficheroitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselficheroitemcampo",jamformregistro._btnselficheroitemcampo);
 //BA.debugLineNum = 102;BA.debugLine="Private txtSelFicheroItemCampo As TextField";
jamformregistro._txtselficheroitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtselficheroitemcampo",jamformregistro._txtselficheroitemcampo);
 //BA.debugLineNum = 103;BA.debugLine="Private chkBoxItemCampo As CheckBox";
jamformregistro._chkboxitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkboxitemcampo",jamformregistro._chkboxitemcampo);
 //BA.debugLineNum = 104;BA.debugLine="Private btnSelFechaItemCampo As Button";
jamformregistro._btnselfechaitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselfechaitemcampo",jamformregistro._btnselfechaitemcampo);
 //BA.debugLineNum = 105;BA.debugLine="Private txtSelFechaItemCampo As TextField";
jamformregistro._txtselfechaitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtselfechaitemcampo",jamformregistro._txtselfechaitemcampo);
 //BA.debugLineNum = 107;BA.debugLine="Private cboItemCampo As ComboBox";
jamformregistro._cboitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");__ref.setField("_cboitemcampo",jamformregistro._cboitemcampo);
 //BA.debugLineNum = 108;BA.debugLine="Private txtItemCampo As TextField";
jamformregistro._txtitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtitemcampo",jamformregistro._txtitemcampo);
 //BA.debugLineNum = 109;BA.debugLine="Private lblItemCampoObligatorio As Label";
jamformregistro._lblitemcampoobligatorio = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblitemcampoobligatorio",jamformregistro._lblitemcampoobligatorio);
 //BA.debugLineNum = 110;BA.debugLine="Private btnSelValorExtItemCampo As Button";
jamformregistro._btnselvalorextitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselvalorextitemcampo",jamformregistro._btnselvalorextitemcampo);
 //BA.debugLineNum = 111;BA.debugLine="Private txtSelValorExtItemCampo As TextField";
jamformregistro._txtselvalorextitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtselvalorextitemcampo",jamformregistro._txtselvalorextitemcampo);
 //BA.debugLineNum = 112;BA.debugLine="Private btnB4XInputDialogItemCampo As Button";
jamformregistro._btnb4xinputdialogitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnb4xinputdialogitemcampo",jamformregistro._btnb4xinputdialogitemcampo);
 //BA.debugLineNum = 113;BA.debugLine="Private txtB4XInputDialogItemCampo As TextField";
jamformregistro._txtb4xinputdialogitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtb4xinputdialogitemcampo",jamformregistro._txtb4xinputdialogitemcampo);
 //BA.debugLineNum = 114;BA.debugLine="Private btnB4XListTemplateItemCampo As Button";
jamformregistro._btnb4xlisttemplateitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnb4xlisttemplateitemcampo",jamformregistro._btnb4xlisttemplateitemcampo);
 //BA.debugLineNum = 115;BA.debugLine="Private txtB4XListTemplateItemCampo As TextField";
jamformregistro._txtb4xlisttemplateitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtb4xlisttemplateitemcampo",jamformregistro._txtb4xlisttemplateitemcampo);
 //BA.debugLineNum = 117;BA.debugLine="Private btnConfigurarJSON As Button";
jamformregistro._btnconfigurarjson = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnconfigurarjson",jamformregistro._btnconfigurarjson);
 //BA.debugLineNum = 118;BA.debugLine="Private btnB4XSearchListTemplateItemCampo As Butt";
jamformregistro._btnb4xsearchlisttemplateitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnb4xsearchlisttemplateitemcampo",jamformregistro._btnb4xsearchlisttemplateitemcampo);
 //BA.debugLineNum = 119;BA.debugLine="Private txtB4XSearchListTemplateItemCampo As Text";
jamformregistro._txtb4xsearchlisttemplateitemcampo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtb4xsearchlisttemplateitemcampo",jamformregistro._txtb4xsearchlisttemplateitemcampo);
 //BA.debugLineNum = 121;BA.debugLine="Private btnB4XInputDialogSelFicheroItemCampo As B";
jamformregistro._btnb4xinputdialogselficheroitemcampo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnb4xinputdialogselficheroitemcampo",jamformregistro._btnb4xinputdialogselficheroitemcampo);
 //BA.debugLineNum = 123;BA.debugLine="Private lblInfoCampoTooltip As B4XView";
jamformregistro._lblinfocampotooltip = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblinfocampotooltip",jamformregistro._lblinfocampotooltip);
 //BA.debugLineNum = 125;BA.debugLine="Private lstInfoCamposToolTip As List";
jamformregistro._lstinfocampostooltip = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstinfocampostooltip",jamformregistro._lstinfocampostooltip);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clng(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CLng (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2738);
if (RapidSub.canDelegate("clng")) { return __ref.runUserSub(false, "jamformregistro","clng", __ref, _o);}
RemoteObject _ox = RemoteObject.createImmutable("");
Debug.locals.put("o", _o);
 BA.debugLineNum = 2738;BA.debugLine="private Sub CLng(o As Object) As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2739;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 2740;BA.debugLine="Dim ox As String = o";
Debug.JustUpdateDeviceLine();
_ox = BA.ObjectToString(_o);Debug.locals.put("ox", _ox);Debug.locals.put("ox", _ox);
 BA.debugLineNum = 2741;BA.debugLine="ox = GetNumbers(ox)";
Debug.JustUpdateDeviceLine();
_ox = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_getnumbers" /*RemoteObject*/ ,(Object)(_ox));Debug.locals.put("ox", _ox);
 BA.debugLineNum = 2742;BA.debugLine="If ox = \"\" Then ox = \"0\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ox,BA.ObjectToString(""))) { 
_ox = BA.ObjectToString("0");Debug.locals.put("ox", _ox);};
 BA.debugLineNum = 2743;BA.debugLine="Return Floor(ox)";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, jamformregistro.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _ox))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 2745;BA.debugLine="Return 0";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 2747;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _comprobarcambiosenregistro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ComprobarCambiosEnRegistro (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,452);
if (RapidSub.canDelegate("comprobarcambiosenregistro")) { return __ref.runUserSub(false, "jamformregistro","comprobarcambiosenregistro", __ref);}
RemoteObject _flagcambioenvalores = RemoteObject.createImmutable(false);
RemoteObject _infocampojfr = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
 BA.debugLineNum = 452;BA.debugLine="Sub ComprobarCambiosEnRegistro As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 454;BA.debugLine="Dim flagCambioEnValores As Boolean=False";
Debug.JustUpdateDeviceLine();
_flagcambioenvalores = jamformregistro.__c.getField(true,"False");Debug.locals.put("flagCambioEnValores", _flagcambioenvalores);Debug.locals.put("flagCambioEnValores", _flagcambioenvalores);
 BA.debugLineNum = 509;BA.debugLine="For Each InfoCampojFR As InfoCampoJamFormRegistro";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = __ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_infocampojfr = (group2.runMethod(false,"Get",index2));Debug.locals.put("InfoCampojFR", _infocampojfr);
Debug.locals.put("InfoCampojFR", _infocampojfr);
 BA.debugLineNum = 510;BA.debugLine="If InfoCampojFR.ValorOutputCampo<>Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 511;BA.debugLine="If InfoCampojFR.ValorOutputCampo <>InfoCampojFR";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ),_infocampojfr.getField(false,"ValorInputCampo" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 512;BA.debugLine="flagCambioEnValores=True";
Debug.JustUpdateDeviceLine();
_flagcambioenvalores = jamformregistro.__c.getField(true,"True");Debug.locals.put("flagCambioEnValores", _flagcambioenvalores);
 BA.debugLineNum = 513;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 };
 }
}Debug.locals.put("InfoCampojFR", _infocampojfr);
;
 BA.debugLineNum = 518;BA.debugLine="Return flagCambioEnValores";
Debug.JustUpdateDeviceLine();
if (true) return _flagcambioenvalores;
 BA.debugLineNum = 519;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearitemclv(RemoteObject __ref,RemoteObject _infocampojfr) throws Exception{
try {
		Debug.PushSubsStack("CrearItemCLV (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1174);
if (RapidSub.canDelegate("crearitemclv")) { return __ref.runUserSub(false, "jamformregistro","crearitemclv", __ref, _infocampojfr);}
ResumableSub_CrearItemCLV rsub = new ResumableSub_CrearItemCLV(null,__ref,_infocampojfr);
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
public static class ResumableSub_CrearItemCLV extends BA.ResumableSub {
public ResumableSub_CrearItemCLV(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _infocampojfr) {
this.parent = parent;
this.__ref = __ref;
this._infocampojfr = _infocampojfr;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _infocampojfr;
RemoteObject _mitemclv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _anchoclv = RemoteObject.createImmutable(0);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _numcamposdatosaux = RemoteObject.createImmutable(0);
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstitemsaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mdataaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _valorcampodataauxint = RemoteObject.createImmutable(0);
RemoteObject _valorcampodataauxstr = RemoteObject.createImmutable("");
RemoteObject _valorcampodataauxreal = RemoteObject.createImmutable("");
RemoteObject _valint = RemoteObject.createImmutable(0);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lblictoolt = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
int step14;
int limit14;
RemoteObject group173;
int index173;
int groupLen173;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CrearItemCLV (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1174);
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
Debug.locals.put("InfoCampojFR", _infocampojfr);
 BA.debugLineNum = 1177;BA.debugLine="Dim mItemCLV As Map";
Debug.JustUpdateDeviceLine();
_mitemclv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mItemCLV", _mitemclv);
 BA.debugLineNum = 1178;BA.debugLine="mItemCLV.Initialize";
Debug.JustUpdateDeviceLine();
_mitemclv.runVoidMethod ("Initialize");
 BA.debugLineNum = 1180;BA.debugLine="Dim AnchoClv As Int=clvCamposRegistro.sv.ScrollVi";
Debug.JustUpdateDeviceLine();
_anchoclv = BA.numberCast(int.class, __ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewContentWidth"));Debug.locals.put("AnchoClv", _anchoclv);Debug.locals.put("AnchoClv", _anchoclv);
 BA.debugLineNum = 1193;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1200;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Consulta\" And InfoC";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoDatosAux" /*RemoteObject*/ ),BA.ObjectToString("Consulta")) && RemoteObject.solveBoolean("N",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1203;BA.debugLine="Dim NumCamposDatosAux As Int=InfoCampojFR.NumCam";
Debug.JustUpdateDeviceLine();
_numcamposdatosaux = _infocampojfr.getField(true,"NumCamposDatosAux" /*RemoteObject*/ );Debug.locals.put("NumCamposDatosAux", _numcamposdatosaux);Debug.locals.put("NumCamposDatosAux", _numcamposdatosaux);
 BA.debugLineNum = 1204;BA.debugLine="If NumCamposDatosAux=2 Then  ' hará falta cargar";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 43;
if (RemoteObject.solveBoolean("=",_numcamposdatosaux,BA.numberCast(double.class, 2))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1207;BA.debugLine="CargaItemsAuxControl(InfoCampojFR.IPJrdcOrigenD";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_cargaitemsauxcontrol" /*void*/ ,(Object)(_infocampojfr.getField(true,"IPJrdcOrigenDatosAux" /*RemoteObject*/ )),(Object)(_infocampojfr.getField(true,"PuertoJrdcOrigenDatosAux" /*RemoteObject*/ )),(Object)(_infocampojfr.getField(true,"ComandoConfigDatosAux" /*RemoteObject*/ )),(Object)(_infocampojfr.getField(false,"ParametrosComandoDatosAux" /*RemoteObject*/ )));
 BA.debugLineNum = 1208;BA.debugLine="Wait For CargaItemsAuxControl_Completed(Accion";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargaitemsauxcontrol_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "crearitemclv"), null);
this.state = 165;
return;
case 165:
//C
this.state = 7;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
_lstitemsaux = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("lstItemsAux", _lstitemsaux);
;
 BA.debugLineNum = 1209;BA.debugLine="If Accion.StartsWith(\"Err\") Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 42;
if (_accion.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Err"))).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 42;
 BA.debugLineNum = 1210;BA.debugLine="ErrorCargaDatos=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_errorcargadatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1213;BA.debugLine="msgErrorCargaDatos=msgErrorCargaDatos & CRLF &";
Debug.JustUpdateDeviceLine();
__ref.setField ("_msgerrorcargadatos" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_msgerrorcargadatos" /*RemoteObject*/ ),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Error carga datos aux "),_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ )));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1215;BA.debugLine="For i=0 To lstItemsAux.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 12:
//for
this.state = 41;
step14 = 1;
limit14 = RemoteObject.solve(new RemoteObject[] {_lstitemsaux.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 166;
if (true) break;

case 166:
//C
this.state = 41;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 14;
if (true) break;

case 167:
//C
this.state = 166;
_i = ((int)(0 + _i + step14)) ;
Debug.locals.put("i", _i);
if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1216;BA.debugLine="Dim mDataAux As Map=lstItemsAux.Get(i)";
Debug.JustUpdateDeviceLine();
_mdataaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataaux = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstitemsaux.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mDataAux", _mdataaux);Debug.locals.put("mDataAux", _mdataaux);
 BA.debugLineNum = 1217;BA.debugLine="Select True";
Debug.JustUpdateDeviceLine();
if (true) break;

case 15:
//select
this.state = 40;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable("INTEGER"),_infocampojfr.getField(true,"TipoDato" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable("TEXT"),_infocampojfr.getField(true,"TipoDato" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable("REAL"),_infocampojfr.getField(true,"TipoDato" /*RemoteObject*/ ))))) {
case 0: {
this.state = 17;
if (true) break;
}
case 1: {
this.state = 23;
if (true) break;
}
case 2: {
this.state = 29;
if (true) break;
}
default: {
this.state = 35;
if (true) break;
}
}
if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1221;BA.debugLine="Dim ValorCampoDataAuxInt As Int=mDataAux.Ge";
Debug.JustUpdateDeviceLine();
_valorcampodataauxint = BA.numberCast(int.class, _mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("ValorCampoDataAuxInt", _valorcampodataauxint);Debug.locals.put("ValorCampoDataAuxInt", _valorcampodataauxint);
 BA.debugLineNum = 1224;BA.debugLine="If ValorCampoDataAuxInt=InfoCampojFR.ValorO";
Debug.JustUpdateDeviceLine();
if (true) break;

case 18:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_valorcampodataauxint,BA.numberCast(double.class, _infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1227;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=m";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorMostrarCampoFormulario" /*RemoteObject*/ ,_mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 1228;BA.debugLine="Log(\"mDataAux \" & mDataAux)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125632566",RemoteObject.concat(RemoteObject.createImmutable("mDataAux "),_mdataaux),0);
 BA.debugLineNum = 1229;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 40;
if (true) break;
 if (true) break;

case 21:
//C
this.state = 40;
;
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 1234;BA.debugLine="Dim ValorCampoDataAuxStr As String=mDataAux";
Debug.JustUpdateDeviceLine();
_valorcampodataauxstr = BA.ObjectToString(_mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("ValorCampoDataAuxStr", _valorcampodataauxstr);Debug.locals.put("ValorCampoDataAuxStr", _valorcampodataauxstr);
 BA.debugLineNum = 1236;BA.debugLine="If ValorCampoDataAuxStr=InfoCampojFR.ValorO";
Debug.JustUpdateDeviceLine();
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_valorcampodataauxstr,BA.ObjectToString(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 1239;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=m";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorMostrarCampoFormulario" /*RemoteObject*/ ,_mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 1240;BA.debugLine="Log(\"mDataAux \" & mDataAux)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125632578",RemoteObject.concat(RemoteObject.createImmutable("mDataAux "),_mdataaux),0);
 BA.debugLineNum = 1241;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 40;
if (true) break;
 if (true) break;

case 27:
//C
this.state = 40;
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 1246;BA.debugLine="Dim ValorCampoDataAuxReal As String=mDataAu";
Debug.JustUpdateDeviceLine();
_valorcampodataauxreal = BA.ObjectToString(_mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("ValorCampoDataAuxReal", _valorcampodataauxreal);Debug.locals.put("ValorCampoDataAuxReal", _valorcampodataauxreal);
 BA.debugLineNum = 1249;BA.debugLine="If ValorCampoDataAuxReal=InfoCampojFR.Valor";
Debug.JustUpdateDeviceLine();
if (true) break;

case 30:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_valorcampodataauxreal,BA.ObjectToString(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )))) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 1252;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=m";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorMostrarCampoFormulario" /*RemoteObject*/ ,_mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 1253;BA.debugLine="Log(\"mDataAux \" & mDataAux)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125632591",RemoteObject.concat(RemoteObject.createImmutable("mDataAux "),_mdataaux),0);
 BA.debugLineNum = 1254;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 40;
if (true) break;
 if (true) break;

case 33:
//C
this.state = 40;
;
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1259;BA.debugLine="If InfoCampojFR.ValorOutputCampo=mDataAux.G";
Debug.JustUpdateDeviceLine();
if (true) break;

case 36:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ),_mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))))) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 1262;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=m";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorMostrarCampoFormulario" /*RemoteObject*/ ,_mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 1263;BA.debugLine="Log(\"mDataAux \" & mDataAux)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125632601",RemoteObject.concat(RemoteObject.createImmutable("mDataAux "),_mdataaux),0);
 BA.debugLineNum = 1264;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 40;
if (true) break;
 if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 167;
;
 if (true) break;
if (true) break;

case 41:
//C
this.state = 42;
Debug.locals.put("i", _i);
;
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = 44;
;
 if (true) break;
;
 BA.debugLineNum = 1277;BA.debugLine="Select True";
Debug.JustUpdateDeviceLine();

case 44:
//select
this.state = 141;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_checkbox" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_b4xlistdialogtextfield" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_b4xsearchlistdialogtextfield" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_textfield" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_b4xinputdialogtextfield" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_textfieldbuttonselfecha" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_textfieldbuttonselfile" /*RemoteObject*/ ))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoControl" /*RemoteObject*/ ),__ref.getField(true,"_tipocontrol_textfieldbuttonselext" /*RemoteObject*/ ))))) {
case 0: {
this.state = 46;
if (true) break;
}
case 1: {
this.state = 54;
if (true) break;
}
case 2: {
this.state = 75;
if (true) break;
}
case 3: {
this.state = 96;
if (true) break;
}
case 4: {
this.state = 104;
if (true) break;
}
case 5: {
this.state = 112;
if (true) break;
}
case 6: {
this.state = 126;
if (true) break;
}
case 7: {
this.state = 134;
if (true) break;
}
}
if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1281;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 80dip)";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _anchoclv)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))))));
 BA.debugLineNum = 1282;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItemChkBox\")";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrFormRegistroItemChkBox")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1285;BA.debugLine="chkBoxItemCampo.Tag=InfoCampojFR.CampoSQL";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chkboxitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",(_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ )));
 BA.debugLineNum = 1290;BA.debugLine="chkBoxItemCampo.Enabled=InfoCampojFR.ControlEdi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chkboxitemcampo" /*RemoteObject*/ ).runMethod(true,"setEnabled",_infocampojfr.getField(true,"ControlEditable" /*RemoteObject*/ ));
 BA.debugLineNum = 1292;BA.debugLine="InfoCampojFR.ControlDatoCampo=chkBoxItemCampo";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ControlDatoCampo" /*RemoteObject*/ ,(__ref.getField(false,"_chkboxitemcampo" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 1303;BA.debugLine="Dim ValInt As Int=FixNullInt(InfoCampojFR.Val";
Debug.JustUpdateDeviceLine();
_valint = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_fixnullint" /*RemoteObject*/ ,(Object)(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )));Debug.locals.put("ValInt", _valint);Debug.locals.put("ValInt", _valint);
 BA.debugLineNum = 1304;BA.debugLine="If ValInt=1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 47:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_valint,BA.numberCast(double.class, 1))) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
 BA.debugLineNum = 1305;BA.debugLine="chkBoxItemCampo.checked=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chkboxitemcampo" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1307;BA.debugLine="chkBoxItemCampo.checked=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chkboxitemcampo" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"False"));
 if (true) break;

case 52:
//C
this.state = 141;
;
 BA.debugLineNum = 1309;BA.debugLine="InfoCampojFR.ValorOutputCampo=ValInt";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorOutputCampo" /*RemoteObject*/ ,(_valint));
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 1318;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 80dip)";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _anchoclv)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))))));
 BA.debugLineNum = 1319;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItemBtnTxtB4XLis";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrFormRegistroItemBtnTxtB4XListTemplate")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1321;BA.debugLine="txtB4XListTemplateItemCampo.Tag=InfoCampojFR.Ca";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtb4xlisttemplateitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",(_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ )));
 BA.debugLineNum = 1322;BA.debugLine="btnB4XListTemplateItemCampo.Enabled=InfoCampojF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnb4xlisttemplateitemcampo" /*RemoteObject*/ ).runMethod(true,"setEnabled",_infocampojfr.getField(true,"ControlEditable" /*RemoteObject*/ ));
 BA.debugLineNum = 1324;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtB4XListTemplat";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ControlDatoCampo" /*RemoteObject*/ ,(__ref.getField(false,"_txtb4xlisttemplateitemcampo" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 1325;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 55:
//if
this.state = 73;
if (RemoteObject.solveBoolean("n",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 73;
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 1328;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Lista\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 60:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoDatosAux" /*RemoteObject*/ ),BA.ObjectToString("Lista"))) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 1329;BA.debugLine="txtB4XListTemplateItemCampo.text=InfoCampojFR";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtb4xlisttemplateitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 1332;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Consulta\" Then";
Debug.JustUpdateDeviceLine();

case 63:
//if
this.state = 72;
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoDatosAux" /*RemoteObject*/ ),BA.ObjectToString("Consulta"))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 1333;BA.debugLine="If NumCamposDatosAux=2 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 66:
//if
this.state = 71;
if (RemoteObject.solveBoolean("=",_numcamposdatosaux,BA.numberCast(double.class, 2))) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
 BA.debugLineNum = 1334;BA.debugLine="txtB4XListTemplateItemCampo.text=InfoCampojF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtb4xlisttemplateitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorMostrarCampoFormulario" /*RemoteObject*/ )));
 if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 1336;BA.debugLine="txtB4XListTemplateItemCampo.text=InfoCampojF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtb4xlisttemplateitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )));
 if (true) break;

case 71:
//C
this.state = 72;
;
 if (true) break;

case 72:
//C
this.state = 73;
;
 if (true) break;

case 73:
//C
this.state = 141;
;
 if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 1342;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 80dip)";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _anchoclv)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))))));
 BA.debugLineNum = 1343;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItemBtnTxtB4XSea";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrFormRegistroItemBtnTxtB4XSearchListTemplate")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1346;BA.debugLine="txtB4XSearchListTemplateItemCampo.Tag=InfoCampo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtb4xsearchlisttemplateitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",(_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ )));
 BA.debugLineNum = 1351;BA.debugLine="btnB4XSearchListTemplateItemCampo.Enabled=InfoC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnb4xsearchlisttemplateitemcampo" /*RemoteObject*/ ).runMethod(true,"setEnabled",_infocampojfr.getField(true,"ControlEditable" /*RemoteObject*/ ));
 BA.debugLineNum = 1353;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtB4XSearchListT";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ControlDatoCampo" /*RemoteObject*/ ,(__ref.getField(false,"_txtb4xsearchlisttemplateitemcampo" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 1356;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 76:
//if
this.state = 94;
if (RemoteObject.solveBoolean("n",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
this.state = 78;
}else {
this.state = 80;
}if (true) break;

case 78:
//C
this.state = 94;
 if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 1360;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Lista\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 81:
//if
this.state = 84;
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoDatosAux" /*RemoteObject*/ ),BA.ObjectToString("Lista"))) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
 BA.debugLineNum = 1363;BA.debugLine="txtB4XSearchListTemplateItemCampo.text=InfoCa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtb4xsearchlisttemplateitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 1366;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Consulta\" Then";
Debug.JustUpdateDeviceLine();

case 84:
//if
this.state = 93;
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoDatosAux" /*RemoteObject*/ ),BA.ObjectToString("Consulta"))) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
 BA.debugLineNum = 1367;BA.debugLine="If NumCamposDatosAux=2 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 87:
//if
this.state = 92;
if (RemoteObject.solveBoolean("=",_numcamposdatosaux,BA.numberCast(double.class, 2))) { 
this.state = 89;
}else {
this.state = 91;
}if (true) break;

case 89:
//C
this.state = 92;
 BA.debugLineNum = 1370;BA.debugLine="txtB4XSearchListTemplateItemCampo.text=InfoC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtb4xsearchlisttemplateitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorMostrarCampoFormulario" /*RemoteObject*/ )));
 if (true) break;

case 91:
//C
this.state = 92;
 BA.debugLineNum = 1374;BA.debugLine="txtB4XSearchListTemplateItemCampo.text=InfoC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtb4xsearchlisttemplateitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )));
 if (true) break;

case 92:
//C
this.state = 93;
;
 if (true) break;

case 93:
//C
this.state = 94;
;
 if (true) break;

case 94:
//C
this.state = 141;
;
 if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 1453;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 75dip)";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _anchoclv)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 75))))));
 BA.debugLineNum = 1454;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItemTextField\")";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrFormRegistroItemTextField")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1457;BA.debugLine="txtItemCampo.tag=InfoCampojFR.CampoSQL";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",(_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ )));
 BA.debugLineNum = 1462;BA.debugLine="txtItemCampo.Editable=InfoCampojFR.ControlEdita";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtitemcampo" /*RemoteObject*/ ).runMethod(true,"setEditable",_infocampojfr.getField(true,"ControlEditable" /*RemoteObject*/ ));
 BA.debugLineNum = 1464;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtItemCampo";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ControlDatoCampo" /*RemoteObject*/ ,(__ref.getField(false,"_txtitemcampo" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 1468;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 97:
//if
this.state = 102;
if (RemoteObject.solveBoolean("n",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
this.state = 99;
}else {
this.state = 101;
}if (true) break;

case 99:
//C
this.state = 102;
 if (true) break;

case 101:
//C
this.state = 102;
 BA.debugLineNum = 1472;BA.debugLine="txtItemCampo.text=InfoCampojFR.ValorOutputCamp";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )));
 if (true) break;

case 102:
//C
this.state = 141;
;
 if (true) break;

case 104:
//C
this.state = 105;
 BA.debugLineNum = 1479;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 75dip)";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _anchoclv)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 75))))));
 BA.debugLineNum = 1480;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItemB4XInputDial";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrFormRegistroItemB4XInputDialogTextField")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1483;BA.debugLine="btnB4XInputDialogItemCampo.tag=InfoCampojFR.Cam";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnb4xinputdialogitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",(_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ )));
 BA.debugLineNum = 1486;BA.debugLine="btnB4XInputDialogItemCampo.Enabled=InfoCampojFR";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnb4xinputdialogitemcampo" /*RemoteObject*/ ).runMethod(true,"setEnabled",_infocampojfr.getField(true,"ControlEditable" /*RemoteObject*/ ));
 BA.debugLineNum = 1489;BA.debugLine="txtB4XInputDialogItemCampo.Editable=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtb4xinputdialogitemcampo" /*RemoteObject*/ ).runMethod(true,"setEditable",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1490;BA.debugLine="txtB4XInputDialogItemCampo.tag=btnB4XInputDialo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtb4xinputdialogitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",__ref.getField(false,"_btnb4xinputdialogitemcampo" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 1493;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtB4XInputDialog";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ControlDatoCampo" /*RemoteObject*/ ,(__ref.getField(false,"_txtb4xinputdialogitemcampo" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 1496;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 105:
//if
this.state = 110;
if (RemoteObject.solveBoolean("n",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
this.state = 107;
}else {
this.state = 109;
}if (true) break;

case 107:
//C
this.state = 110;
 if (true) break;

case 109:
//C
this.state = 110;
 BA.debugLineNum = 1500;BA.debugLine="txtB4XInputDialogItemCampo.text=InfoCampojFR.V";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtb4xinputdialogitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )));
 if (true) break;

case 110:
//C
this.state = 141;
;
 if (true) break;

case 112:
//C
this.state = 113;
 BA.debugLineNum = 1508;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 75dip)";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _anchoclv)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 75))))));
 BA.debugLineNum = 1509;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItembtntxtSelFec";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrFormRegistroItembtntxtSelFecha")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1512;BA.debugLine="btnSelFechaItemCampo.tag=InfoCampojFR.CampoSQL";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnselfechaitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",(_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ )));
 BA.debugLineNum = 1515;BA.debugLine="btnSelFechaItemCampo.Enabled=InfoCampojFR.Contr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnselfechaitemcampo" /*RemoteObject*/ ).runMethod(true,"setEnabled",_infocampojfr.getField(true,"ControlEditable" /*RemoteObject*/ ));
 BA.debugLineNum = 1517;BA.debugLine="txtSelFechaItemCampo.tag=btnSelFechaItemCampo.t";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtselfechaitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",__ref.getField(false,"_btnselfechaitemcampo" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 1518;BA.debugLine="txtSelFechaItemCampo.Editable=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtselfechaitemcampo" /*RemoteObject*/ ).runMethod(true,"setEditable",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1530;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtSelFechaItemCa";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ControlDatoCampo" /*RemoteObject*/ ,(__ref.getField(false,"_txtselfechaitemcampo" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 1532;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.JustUpdateDeviceLine();
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1533;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1535;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 113:
//if
this.state = 124;
if (RemoteObject.solveBoolean("n",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
this.state = 115;
}else {
this.state = 117;
}if (true) break;

case 115:
//C
this.state = 124;
 if (true) break;

case 117:
//C
this.state = 118;
 BA.debugLineNum = 1538;BA.debugLine="If 0=InfoCampojFR.ValorOutputCampo Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 118:
//if
this.state = 123;
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(0),BA.numberCast(double.class, _infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )))) { 
this.state = 120;
}else {
this.state = 122;
}if (true) break;

case 120:
//C
this.state = 123;
 BA.debugLineNum = 1539;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=\"\"";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorMostrarCampoFormulario" /*RemoteObject*/ ,RemoteObject.createImmutable(("")));
 if (true) break;

case 122:
//C
this.state = 123;
 BA.debugLineNum = 1543;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=Date";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorMostrarCampoFormulario" /*RemoteObject*/ ,(parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))))));
 if (true) break;

case 123:
//C
this.state = 124;
;
 BA.debugLineNum = 1546;BA.debugLine="txtSelFechaItemCampo.text=InfoCampojFR.ValorMo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtselfechaitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorMostrarCampoFormulario" /*RemoteObject*/ )));
 if (true) break;

case 124:
//C
this.state = 141;
;
 BA.debugLineNum = 1548;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 if (true) break;

case 126:
//C
this.state = 127;
 BA.debugLineNum = 1553;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 75dip)";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _anchoclv)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 75))))));
 BA.debugLineNum = 1554;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItembtntxtSelFic";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrFormRegistroItembtntxtSelFichero")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1557;BA.debugLine="btnSelFicheroItemCampo.tag=InfoCampojFR.CampoSQ";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnselficheroitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",(_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ )));
 BA.debugLineNum = 1560;BA.debugLine="btnSelFicheroItemCampo.Enabled=InfoCampojFR.Con";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnselficheroitemcampo" /*RemoteObject*/ ).runMethod(true,"setEnabled",_infocampojfr.getField(true,"ControlEditable" /*RemoteObject*/ ));
 BA.debugLineNum = 1563;BA.debugLine="txtSelFicheroItemCampo.Editable=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtselficheroitemcampo" /*RemoteObject*/ ).runMethod(true,"setEditable",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1564;BA.debugLine="txtSelFicheroItemCampo.tag=btnSelFicheroItemCam";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtselficheroitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",__ref.getField(false,"_btnselficheroitemcampo" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 1576;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtSelFicheroItem";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ControlDatoCampo" /*RemoteObject*/ ,(__ref.getField(false,"_txtselficheroitemcampo" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 1579;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then  'si";
Debug.JustUpdateDeviceLine();
if (true) break;

case 127:
//if
this.state = 132;
if (RemoteObject.solveBoolean("n",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
this.state = 129;
}else {
this.state = 131;
}if (true) break;

case 129:
//C
this.state = 132;
 BA.debugLineNum = 1581;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=\"\"";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorMostrarCampoFormulario" /*RemoteObject*/ ,RemoteObject.createImmutable(("")));
 BA.debugLineNum = 1582;BA.debugLine="txtSelFicheroItemCampo.text=InfoCampojFR.Valor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtselficheroitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorMostrarCampoFormulario" /*RemoteObject*/ )));
 if (true) break;

case 131:
//C
this.state = 132;
 BA.debugLineNum = 1584;BA.debugLine="txtSelFicheroItemCampo.text=InfoCampojFR.Valor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtselficheroitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )));
 if (true) break;

case 132:
//C
this.state = 141;
;
 if (true) break;

case 134:
//C
this.state = 135;
 BA.debugLineNum = 1595;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 75dip)";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _anchoclv)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 75))))));
 BA.debugLineNum = 1596;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItembtntxtSelVal";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrFormRegistroItembtntxtSelValorCampoExt")),__ref.getField(false, "ba"));
 BA.debugLineNum = 1599;BA.debugLine="btnSelValorExtItemCampo.tag=InfoCampojFR.CampoS";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnselvalorextitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",(_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ )));
 BA.debugLineNum = 1602;BA.debugLine="btnSelValorExtItemCampo.Enabled=InfoCampojFR.Co";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnselvalorextitemcampo" /*RemoteObject*/ ).runMethod(true,"setEnabled",_infocampojfr.getField(true,"ControlEditable" /*RemoteObject*/ ));
 BA.debugLineNum = 1605;BA.debugLine="txtSelValorExtItemCampo.Editable=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtselvalorextitemcampo" /*RemoteObject*/ ).runMethod(true,"setEditable",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1606;BA.debugLine="txtSelValorExtItemCampo.tag=btnSelValorExtItemC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtselvalorextitemcampo" /*RemoteObject*/ ).runMethod(false,"setTag",__ref.getField(false,"_btnselvalorextitemcampo" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 1618;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtSelValorExtIte";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ControlDatoCampo" /*RemoteObject*/ ,(__ref.getField(false,"_txtselvalorextitemcampo" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 1621;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 135:
//if
this.state = 140;
if (RemoteObject.solveBoolean("n",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
this.state = 137;
}else {
this.state = 139;
}if (true) break;

case 137:
//C
this.state = 140;
 if (true) break;

case 139:
//C
this.state = 140;
 BA.debugLineNum = 1625;BA.debugLine="txtSelValorExtItemCampo.text=InfoCampojFR.Valo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtselvalorextitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ )));
 if (true) break;

case 140:
//C
this.state = 141;
;
 if (true) break;

case 141:
//C
this.state = 142;
;
 BA.debugLineNum = 1635;BA.debugLine="lblTitleItemCampo.Text=InfoCampojFR.TituloCampo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitleitemcampo" /*RemoteObject*/ ).runMethod(true,"setText",_infocampojfr.getField(true,"TituloCampo" /*RemoteObject*/ ));
 BA.debugLineNum = 1651;BA.debugLine="lblItemCampoObligatorio.Visible=InfoCampojFR.Camp";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblitemcampoobligatorio" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_infocampojfr.getField(true,"CampoObligatorioCumplimentar" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",_infocampojfr.getField(true,"ControlEditable" /*RemoteObject*/ ))));
 BA.debugLineNum = 1662;BA.debugLine="If lstInfoCamposToolTip.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 142:
//if
this.state = 159;
if (__ref.getField(false,"_lstinfocampostooltip" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 144;
}if (true) break;

case 144:
//C
this.state = 145;
 BA.debugLineNum = 1663;BA.debugLine="For Each m As Map In lstInfoCamposToolTip";
Debug.JustUpdateDeviceLine();
if (true) break;

case 145:
//for
this.state = 158;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group173 = __ref.getField(false,"_lstinfocampostooltip" /*RemoteObject*/ );
index173 = 0;
groupLen173 = group173.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 168;
if (true) break;

case 168:
//C
this.state = 158;
if (index173 < groupLen173) {
this.state = 147;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group173.runMethod(false,"Get",index173));Debug.locals.put("m", _m);}
if (true) break;

case 169:
//C
this.state = 168;
index173++;
Debug.locals.put("m", _m);
if (true) break;

case 147:
//C
this.state = 148;
 BA.debugLineNum = 1664;BA.debugLine="If m.Get(\"CampoSQL\")=InfoCampojFR.CampoSQL Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 148:
//if
this.state = 157;
if (RemoteObject.solveBoolean("=",_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoSQL")))),(_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ )))) { 
this.state = 150;
}if (true) break;

case 150:
//C
this.state = 151;
 BA.debugLineNum = 1665;BA.debugLine="Dim lblICToolt As Label=lblInfoCampoTooltip";
Debug.JustUpdateDeviceLine();
_lblictoolt = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblictoolt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), __ref.getField(false,"_lblinfocampotooltip" /*RemoteObject*/ ).getObject());Debug.locals.put("lblICToolt", _lblictoolt);Debug.locals.put("lblICToolt", _lblictoolt);
 BA.debugLineNum = 1666;BA.debugLine="If m.get(\"TextoToolTipInfo\")<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 151:
//if
this.state = 156;
if (RemoteObject.solveBoolean("!",_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextoToolTipInfo")))),RemoteObject.createImmutable(("")))) { 
this.state = 153;
}else {
this.state = 155;
}if (true) break;

case 153:
//C
this.state = 156;
 BA.debugLineNum = 1667;BA.debugLine="lblInfoCampoTooltip.Visible=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblinfocampotooltip" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1669;BA.debugLine="lblICToolt.TooltipText=m.get(\"TextoToolTipInf";
Debug.JustUpdateDeviceLine();
_lblictoolt.runMethod(true,"setTooltipText",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextoToolTipInfo"))))));
 if (true) break;

case 155:
//C
this.state = 156;
 BA.debugLineNum = 1671;BA.debugLine="lblInfoCampoTooltip.Visible=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblinfocampotooltip" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1672;BA.debugLine="lblICToolt.TooltipText=m.get(\"TextoToolTipInf";
Debug.JustUpdateDeviceLine();
_lblictoolt.runMethod(true,"setTooltipText",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextoToolTipInfo"))))));
 if (true) break;

case 156:
//C
this.state = 157;
;
 BA.debugLineNum = 1674;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 158;
if (true) break;
 if (true) break;

case 157:
//C
this.state = 169;
;
 if (true) break;
if (true) break;

case 158:
//C
this.state = 159;
Debug.locals.put("m", _m);
;
 if (true) break;
;
 BA.debugLineNum = 1680;BA.debugLine="If clvCamposRegistro.Size Mod 2=0 Then";
Debug.JustUpdateDeviceLine();

case 159:
//if
this.state = 164;
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
this.state = 161;
}else {
this.state = 163;
}if (true) break;

case 161:
//C
this.state = 164;
 BA.debugLineNum = 1681;BA.debugLine="pnl.Color=ColItemsPares";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(true,"setColor",__ref.getField(true,"_colitemspares" /*RemoteObject*/ ));
 if (true) break;

case 163:
//C
this.state = 164;
 BA.debugLineNum = 1683;BA.debugLine="pnl.Color=ColItemsImpares";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(true,"setColor",__ref.getField(true,"_colitemsimpares" /*RemoteObject*/ ));
 if (true) break;

case 164:
//C
this.state = -1;
;
 BA.debugLineNum = 1686;BA.debugLine="mItemCLV.Put(\"Panel\",pnl)";
Debug.JustUpdateDeviceLine();
_mitemclv.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Panel"))),(Object)((_pnl.getObject())));
 BA.debugLineNum = 1688;BA.debugLine="mItemCLV.Put(\"ItemValue\",InfoCampojFR)";
Debug.JustUpdateDeviceLine();
_mitemclv.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ItemValue"))),(Object)((_infocampojfr)));
 BA.debugLineNum = 1690;BA.debugLine="Return mItemCLV";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mitemclv));return;};
 BA.debugLineNum = 1691;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _cargaitemsauxcontrol_completed(RemoteObject __ref,RemoteObject _accion,RemoteObject _lstitemsaux) throws Exception{
}
public static RemoteObject  _createtipoorigendatos(RemoteObject __ref,RemoteObject _ipjrdc,RemoteObject _puertojrdc,RemoteObject _nombretabla,RemoteObject _dbms) throws Exception{
try {
		Debug.PushSubsStack("CreateTipoOrigenDatos (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,907);
if (RapidSub.canDelegate("createtipoorigendatos")) { return __ref.runUserSub(false, "jamformregistro","createtipoorigendatos", __ref, _ipjrdc, _puertojrdc, _nombretabla, _dbms);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.docU.jamformregistro._tipoorigendatosjamformregistro");
Debug.locals.put("IpJRDC", _ipjrdc);
Debug.locals.put("PuertoJRDC", _puertojrdc);
Debug.locals.put("NombreTabla", _nombretabla);
Debug.locals.put("DBMS", _dbms);
 BA.debugLineNum = 907;BA.debugLine="Public Sub CreateTipoOrigenDatos (IpJRDC As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 908;BA.debugLine="Dim t1 As TipoOrigenDatosJamFormRegistro";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4j.docU.jamformregistro._tipoorigendatosjamformregistro");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 909;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 911;BA.debugLine="t1.IpJRDC = IpJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("IpJRDC" /*RemoteObject*/ ,_ipjrdc);
 BA.debugLineNum = 912;BA.debugLine="t1.PuertoJRDC = PuertoJRDC";
Debug.JustUpdateDeviceLine();
_t1.setField ("PuertoJRDC" /*RemoteObject*/ ,_puertojrdc);
 BA.debugLineNum = 913;BA.debugLine="t1.NombreTabla = NombreTabla";
Debug.JustUpdateDeviceLine();
_t1.setField ("NombreTabla" /*RemoteObject*/ ,_nombretabla);
 BA.debugLineNum = 914;BA.debugLine="t1.DBMS = DBMS";
Debug.JustUpdateDeviceLine();
_t1.setField ("DBMS" /*RemoteObject*/ ,_dbms);
 BA.debugLineNum = 916;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 917;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cstr(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CStr (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2733);
if (RapidSub.canDelegate("cstr")) { return __ref.runUserSub(false, "jamformregistro","cstr", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 2733;BA.debugLine="private Sub CStr(o As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2734;BA.debugLine="Return \"\" & o";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_o);
 BA.debugLineNum = 2735;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datoscamposeleccionado(RemoteObject __ref,RemoteObject _camposel) throws Exception{
try {
		Debug.PushSubsStack("DatosCampoSeleccionado (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,399);
if (RapidSub.canDelegate("datoscamposeleccionado")) { return __ref.runUserSub(false, "jamformregistro","datoscamposeleccionado", __ref, _camposel);}
RemoteObject _infocampojfrnoencontrado = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _infocampojfr = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
Debug.locals.put("CampoSel", _camposel);
 BA.debugLineNum = 399;BA.debugLine="public Sub DatosCampoSeleccionado(CampoSel As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 400;BA.debugLine="Dim infoCampojFrNoEncontrado As InfoCampoJamFormR";
Debug.JustUpdateDeviceLine();
_infocampojfrnoencontrado = RemoteObject.createNew ("b4j.docU.jamformregistro._infocampojamformregistro");Debug.locals.put("infoCampojFrNoEncontrado", _infocampojfrnoencontrado);
 BA.debugLineNum = 401;BA.debugLine="infoCampojFrNoEncontrado.Initialize";
Debug.JustUpdateDeviceLine();
_infocampojfrnoencontrado.runVoidMethod ("Initialize");
 BA.debugLineNum = 402;BA.debugLine="For Each infoCampojFr As InfoCampoJamFormRegistro";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = __ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_infocampojfr = (group3.runMethod(false,"Get",index3));Debug.locals.put("infoCampojFr", _infocampojfr);
Debug.locals.put("infoCampojFr", _infocampojfr);
 BA.debugLineNum = 403;BA.debugLine="If infoCampojFr.CampoSQL=CampoSel Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ ),_camposel)) { 
 BA.debugLineNum = 404;BA.debugLine="If infoCampojFr.ValorOutputCampo=Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_infocampojfr.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 405;BA.debugLine="LogColor(\"ATENCION, posible error: ValorOutPut";
Debug.JustUpdateDeviceLine();
jamformregistro.__c.runVoidMethod ("LogImpl","9125042694",RemoteObject.concat(RemoteObject.createImmutable("ATENCION, posible error: ValorOutPutCampo=NULL. Comprobar si se ha pasado el valor del campo "),_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ ),RemoteObject.createImmutable(" en el mapa de initialize")),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Magenta"));
 };
 BA.debugLineNum = 407;BA.debugLine="Return infoCampojFr";
Debug.JustUpdateDeviceLine();
if (true) return _infocampojfr;
 BA.debugLineNum = 408;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("infoCampojFr", _infocampojfr);
;
 BA.debugLineNum = 411;BA.debugLine="LogColor(\"ERROR. No existe campo \" & CampoSel & \"";
Debug.JustUpdateDeviceLine();
jamformregistro.__c.runVoidMethod ("LogImpl","9125042700",RemoteObject.concat(RemoteObject.createImmutable("ERROR. No existe campo "),_camposel,RemoteObject.createImmutable("!")),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Magenta"));
 BA.debugLineNum = 412;BA.debugLine="LogColor(\"Comprobar el parámetro \" & CampoSel & \"";
Debug.JustUpdateDeviceLine();
jamformregistro.__c.runVoidMethod ("LogImpl","9125042701",RemoteObject.concat(RemoteObject.createImmutable("Comprobar el parámetro "),_camposel,RemoteObject.createImmutable(" pasado al método DatosCampoSeleccionado de jamFormRegistro")),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Magenta"));
 BA.debugLineNum = 413;BA.debugLine="fx.Msgbox(frmReg,\"ERROR. No existe campo \" & Camp";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frmreg" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR. No existe campo "),_camposel,RemoteObject.createImmutable("!"),jamformregistro.__c.getField(true,"CRLF"),jamformregistro.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Comprobar el parámetro "),_camposel,RemoteObject.createImmutable(" pasado al método DatosCampoSeleccionado de jamFormRegistro"),jamformregistro.__c.getField(true,"CRLF"),jamformregistro.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación"))),(Object)(RemoteObject.createImmutable("Error")));
 BA.debugLineNum = 415;BA.debugLine="ExitApplication";
Debug.JustUpdateDeviceLine();
jamformregistro.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 417;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (jamformregistro.__c.getField(false,"Null"));
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dimensionespantalla(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DimensionesPantalla (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("dimensionespantalla")) { return __ref.runUserSub(false, "jamformregistro","dimensionespantalla", __ref);}
RemoteObject _mdim = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 292;BA.debugLine="Sub DimensionesPantalla As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 293;BA.debugLine="Dim mDim As Map";
Debug.JustUpdateDeviceLine();
_mdim = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDim", _mdim);
 BA.debugLineNum = 294;BA.debugLine="mDim.Initialize";
Debug.JustUpdateDeviceLine();
_mdim.runVoidMethod ("Initialize");
 BA.debugLineNum = 295;BA.debugLine="mDim.Put(\"X\",fx.PrimaryScreen.MaxX - fx.PrimarySc";
Debug.JustUpdateDeviceLine();
_mdim.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("X"))),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxX"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinX")}, "-",1, 0))));
 BA.debugLineNum = 296;BA.debugLine="mDim.Put(\"Y\",fx.PrimaryScreen.MaxY - fx.PrimarySc";
Debug.JustUpdateDeviceLine();
_mdim.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Y"))),(Object)((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))));
 BA.debugLineNum = 297;BA.debugLine="Return mDim";
Debug.JustUpdateDeviceLine();
if (true) return _mdim;
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixnull(RemoteObject __ref,RemoteObject _sobj) throws Exception{
try {
		Debug.PushSubsStack("FixNull (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2690);
if (RapidSub.canDelegate("fixnull")) { return __ref.runUserSub(false, "jamformregistro","fixnull", __ref, _sobj);}
RemoteObject _svalue = RemoteObject.createImmutable("");
Debug.locals.put("sObj", _sobj);
 BA.debugLineNum = 2690;BA.debugLine="private Sub FixNull(sObj As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2691;BA.debugLine="Dim sValue As String";
Debug.JustUpdateDeviceLine();
_svalue = RemoteObject.createImmutable("");Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 2692;BA.debugLine="If sObj = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_sobj)) { 
 BA.debugLineNum = 2693;BA.debugLine="sValue = \"\"";
Debug.JustUpdateDeviceLine();
_svalue = BA.ObjectToString("");Debug.locals.put("sValue", _svalue);
 }else {
 BA.debugLineNum = 2695;BA.debugLine="sValue = CStr(sObj)";
Debug.JustUpdateDeviceLine();
_svalue = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_cstr" /*RemoteObject*/ ,(Object)(_sobj));Debug.locals.put("sValue", _svalue);
 };
 BA.debugLineNum = 2697;BA.debugLine="sValue = sValue.Replace(\"NULL\",\"\").Replace(\"null\"";
Debug.JustUpdateDeviceLine();
_svalue = _svalue.runMethod(true,"replace",(Object)(BA.ObjectToString("NULL")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("null")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 2698;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 BA.debugLineNum = 2699;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixnulldouble(RemoteObject __ref,RemoteObject _sobj) throws Exception{
try {
		Debug.PushSubsStack("FixNullDouble (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2701);
if (RapidSub.canDelegate("fixnulldouble")) { return __ref.runUserSub(false, "jamformregistro","fixnulldouble", __ref, _sobj);}
RemoteObject _dvalue = RemoteObject.createImmutable(0);
Debug.locals.put("sObj", _sobj);
 BA.debugLineNum = 2701;BA.debugLine="private Sub FixNullDouble(sObj As Object) As Doubl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2702;BA.debugLine="Dim dValue As Double";
Debug.JustUpdateDeviceLine();
_dvalue = RemoteObject.createImmutable(0);Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2703;BA.debugLine="If sObj = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_sobj)) { 
 BA.debugLineNum = 2704;BA.debugLine="dValue = 0";
Debug.JustUpdateDeviceLine();
_dvalue = BA.numberCast(double.class, 0);Debug.locals.put("dValue", _dvalue);
 }else {
 BA.debugLineNum = 2706;BA.debugLine="dValue = CDbl(sObj)";
Debug.JustUpdateDeviceLine();
_dvalue = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_cdbl" /*RemoteObject*/ ,(Object)(_sobj));Debug.locals.put("dValue", _dvalue);
 };
 BA.debugLineNum = 2708;BA.debugLine="Return dValue";
Debug.JustUpdateDeviceLine();
if (true) return _dvalue;
 BA.debugLineNum = 2709;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixnullint(RemoteObject __ref,RemoteObject _sobj) throws Exception{
try {
		Debug.PushSubsStack("FixNullInt (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2721);
if (RapidSub.canDelegate("fixnullint")) { return __ref.runUserSub(false, "jamformregistro","fixnullint", __ref, _sobj);}
RemoteObject _dvalue = RemoteObject.createImmutable(0);
Debug.locals.put("sObj", _sobj);
 BA.debugLineNum = 2721;BA.debugLine="private Sub FixNullInt(sObj As Object) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2722;BA.debugLine="Dim dValue As Int";
Debug.JustUpdateDeviceLine();
_dvalue = RemoteObject.createImmutable(0);Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2723;BA.debugLine="If sObj = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_sobj)) { 
 BA.debugLineNum = 2724;BA.debugLine="dValue = 0";
Debug.JustUpdateDeviceLine();
_dvalue = BA.numberCast(int.class, 0);Debug.locals.put("dValue", _dvalue);
 }else {
 BA.debugLineNum = 2726;BA.debugLine="dValue = CInt(sObj)";
Debug.JustUpdateDeviceLine();
_dvalue = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_cint" /*RemoteObject*/ ,(Object)(_sobj));Debug.locals.put("dValue", _dvalue);
 };
 BA.debugLineNum = 2728;BA.debugLine="Return dValue";
Debug.JustUpdateDeviceLine();
if (true) return _dvalue;
 BA.debugLineNum = 2729;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixnulllong(RemoteObject __ref,RemoteObject _sobj) throws Exception{
try {
		Debug.PushSubsStack("FixNullLong (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2711);
if (RapidSub.canDelegate("fixnulllong")) { return __ref.runUserSub(false, "jamformregistro","fixnulllong", __ref, _sobj);}
RemoteObject _dvalue = RemoteObject.createImmutable(0L);
Debug.locals.put("sObj", _sobj);
 BA.debugLineNum = 2711;BA.debugLine="private Sub FixNullLong(sObj As Object) As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2712;BA.debugLine="Dim dValue As Long";
Debug.JustUpdateDeviceLine();
_dvalue = RemoteObject.createImmutable(0L);Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2713;BA.debugLine="If sObj = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_sobj)) { 
 BA.debugLineNum = 2714;BA.debugLine="dValue = 0";
Debug.JustUpdateDeviceLine();
_dvalue = BA.numberCast(long.class, 0);Debug.locals.put("dValue", _dvalue);
 }else {
 BA.debugLineNum = 2716;BA.debugLine="dValue = CLng(sObj)";
Debug.JustUpdateDeviceLine();
_dvalue = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_clng" /*RemoteObject*/ ,(Object)(_sobj));Debug.locals.put("dValue", _dvalue);
 };
 BA.debugLineNum = 2718;BA.debugLine="Return dValue";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, _dvalue);
 BA.debugLineNum = 2719;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frmreg_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frmReg_CloseRequest (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("frmreg_closerequest")) { return __ref.runUserSub(false, "jamformregistro","frmreg_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 324;BA.debugLine="Private Sub frmReg_CloseRequest (EventData As Even";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 325;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frmreg_mousedragged(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frmReg_MouseDragged (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1816);
if (RapidSub.canDelegate("frmreg_mousedragged")) { return __ref.runUserSub(false, "jamformregistro","frmreg_mousedragged", __ref, _eventdata);}
RemoteObject _joeventdata = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _mousex = RemoteObject.createImmutable(0);
RemoteObject _mousey = RemoteObject.createImmutable(0);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1816;BA.debugLine="Sub frmReg_MouseDragged (EventData As MouseEvent)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1817;BA.debugLine="Dim joEventData As JavaObject = EventData";
Debug.JustUpdateDeviceLine();
_joeventdata = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joeventdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _eventdata.getObject());Debug.locals.put("joEventData", _joeventdata);Debug.locals.put("joEventData", _joeventdata);
 BA.debugLineNum = 1818;BA.debugLine="Dim mouseX As Double = joEventData.RunMethod(\"get";
Debug.JustUpdateDeviceLine();
_mousex = BA.numberCast(double.class, _joeventdata.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenX")),(Object)((jamformregistro.__c.getField(false,"Null")))));Debug.locals.put("mouseX", _mousex);Debug.locals.put("mouseX", _mousex);
 BA.debugLineNum = 1819;BA.debugLine="Dim mouseY As Double = joEventData.RunMethod(\"get";
Debug.JustUpdateDeviceLine();
_mousey = BA.numberCast(double.class, _joeventdata.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenY")),(Object)((jamformregistro.__c.getField(false,"Null")))));Debug.locals.put("mouseY", _mousey);Debug.locals.put("mouseY", _mousey);
 BA.debugLineNum = 1821;BA.debugLine="frmReg.WindowLeft = mouseX - DragCoords.Get(\"x\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(true,"setWindowLeft",RemoteObject.solve(new RemoteObject[] {_mousex,BA.numberCast(double.class, __ref.getField(false,"_dragcoords" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x")))))}, "-",1, 0));
 BA.debugLineNum = 1822;BA.debugLine="frmReg.WindowTop = mouseY - DragCoords.Get(\"y\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(true,"setWindowTop",RemoteObject.solve(new RemoteObject[] {_mousey,BA.numberCast(double.class, __ref.getField(false,"_dragcoords" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y")))))}, "-",1, 0));
 BA.debugLineNum = 1823;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frmreg_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frmReg_MousePressed (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1812);
if (RapidSub.canDelegate("frmreg_mousepressed")) { return __ref.runUserSub(false, "jamformregistro","frmreg_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1812;BA.debugLine="Sub frmReg_MousePressed (EventData As MouseEvent)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1813;BA.debugLine="DragCoords = CreateMap(\"x\":EventData.X, \"y\":Event";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dragcoords" /*RemoteObject*/ ,jamformregistro.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("x")),(_eventdata.runMethod(true,"getX")),RemoteObject.createImmutable(("y")),(_eventdata.runMethod(true,"getY"))})));
 BA.debugLineNum = 1814;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frmreg_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("frmReg_Resize (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("frmreg_resize")) { return __ref.runUserSub(false, "jamformregistro","frmreg_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 328;BA.debugLine="private Sub frmReg_Resize (Width As Double, Height";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="SetCLVScrollBars(clvCamposRegistro, clvCamposRegi";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_setclvscrollbars" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ )),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewContentHeight"),__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")))));
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getformregistro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFormRegistro (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("getformregistro")) { return __ref.runUserSub(false, "jamformregistro","getformregistro", __ref);}
 BA.debugLineNum = 288;BA.debugLine="Sub getFormRegistro As Form";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 289;BA.debugLine="Return frmReg";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_frmreg" /*RemoteObject*/ );
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmodoregistro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getModoRegistro (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,278);
if (RapidSub.canDelegate("getmodoregistro")) { return __ref.runUserSub(false, "jamformregistro","getmodoregistro", __ref);}
 BA.debugLineNum = 278;BA.debugLine="Sub getModoRegistro As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 279;BA.debugLine="Return mModoRegistro";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mmodoregistro" /*RemoteObject*/ );
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnumbers(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetNumbers (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2774);
if (RapidSub.canDelegate("getnumbers")) { return __ref.runUserSub(false, "jamformregistro","getnumbers", __ref, _value);}
RemoteObject _strcnt = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _master = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2774;BA.debugLine="private Sub GetNumbers(value As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2775;BA.debugLine="Dim strCnt As Int";
Debug.JustUpdateDeviceLine();
_strcnt = RemoteObject.createImmutable(0);Debug.locals.put("strCnt", _strcnt);
 BA.debugLineNum = 2776;BA.debugLine="Dim str As String";
Debug.JustUpdateDeviceLine();
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 2777;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2778;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2779;BA.debugLine="Dim master As String = \"0123456789-.\"";
Debug.JustUpdateDeviceLine();
_master = BA.ObjectToString("0123456789-.");Debug.locals.put("master", _master);Debug.locals.put("master", _master);
 BA.debugLineNum = 2780;BA.debugLine="For strCnt = 0 To value.Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_value.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_strcnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _strcnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _strcnt.<Integer>get().intValue() >= limit6) ;_strcnt = RemoteObject.createImmutable((int)(0 + _strcnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("strCnt", _strcnt);
 BA.debugLineNum = 2781;BA.debugLine="str = value.CharAt(strCnt)";
Debug.JustUpdateDeviceLine();
_str = BA.ObjectToString(_value.runMethod(true,"charAt",(Object)(_strcnt)));Debug.locals.put("str", _str);
 BA.debugLineNum = 2782;BA.debugLine="If master.IndexOf(str) >= 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_master.runMethod(true,"indexOf",(Object)(_str)),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2783;BA.debugLine="sb.Append(str)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_str));
 };
 }
}Debug.locals.put("strCnt", _strcnt);
;
 BA.debugLineNum = 2786;BA.debugLine="Return sb.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 2787;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanelfondoformregistro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPanelFondoFormRegistro (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("getpanelfondoformregistro")) { return __ref.runUserSub(false, "jamformregistro","getpanelfondoformregistro", __ref);}
 BA.debugLineNum = 283;BA.debugLine="Sub getPanelFondoFormRegistro As AnchorPane";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 284;BA.debugLine="Return frmReg.RootPane";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(false,"getRootPane");
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _habilitarbotongrabar(RemoteObject __ref,RemoteObject _habilitado) throws Exception{
try {
		Debug.PushSubsStack("HabilitarBotonGrabar (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,389);
if (RapidSub.canDelegate("habilitarbotongrabar")) { return __ref.runUserSub(false, "jamformregistro","habilitarbotongrabar", __ref, _habilitado);}
Debug.locals.put("Habilitado", _habilitado);
 BA.debugLineNum = 389;BA.debugLine="public Sub HabilitarBotonGrabar(Habilitado As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 390;BA.debugLine="btnOK.Enabled=Habilitado";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnok" /*RemoteObject*/ ).runMethod(true,"setEnabled",_habilitado);
 BA.debugLineNum = 391;BA.debugLine="If Habilitado Then";
Debug.JustUpdateDeviceLine();
if (_habilitado.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 392;BA.debugLine="btnOK.TextColor=fx.Colors.From32Bit(0xFF000000)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnok" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xff000000))))));
 }else {
 BA.debugLineNum = 394;BA.debugLine="btnOK.TextColor=fx.Colors.From32Bit(0xFFD3D3D3)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnok" /*RemoteObject*/ ).runMethod(false,"setTextColor",(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"From32Bit",(Object)(BA.numberCast(int.class, ((int)0xffd3d3d3))))));
 };
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inicializarcalendario(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InicializarCalendario (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,558);
if (RapidSub.canDelegate("inicializarcalendario")) { return __ref.runUserSub(false, "jamformregistro","inicializarcalendario", __ref);}
 BA.debugLineNum = 558;BA.debugLine="private Sub InicializarCalendario";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 559;BA.debugLine="DateTemplate.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 560;BA.debugLine="DateTemplate.MinYear = 2000";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_minyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2000));
 BA.debugLineNum = 561;BA.debugLine="DateTemplate.MaxYear = 2050";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_maxyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2050));
 BA.debugLineNum = 562;BA.debugLine="DateTemplate.FirstDay=1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 563;BA.debugLine="DateTemplate.Date=DateTime.Now";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,jamformregistro.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 564;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inicio(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Inicio (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("inicio")) { return __ref.runUserSub(false, "jamformregistro","inicio", __ref);}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(null,__ref);
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
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.jamformregistro parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Inicio (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,248);
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
 BA.debugLineNum = 249;BA.debugLine="ErrorCargaDatos=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_errorcargadatos" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 250;BA.debugLine="msgErrorCargaDatos=\"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_msgerrorcargadatos" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 251;BA.debugLine="SetModoRegistro(mModoRegistro)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_setmodoregistro" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ )));
 BA.debugLineNum = 252;BA.debugLine="CargandoDatos=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 253;BA.debugLine="Dim rSub As ResumableSub=SetJSONCampos(mNombreFic";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_setjsoncampos" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mnombreficherojson" /*RemoteObject*/ )));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 254;BA.debugLine="wait for (rSub) complete (mResult As Map)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "inicio"), _rsub);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 256;BA.debugLine="If mResult.get(\"FlagOK\")=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 257;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 258;BA.debugLine="ErrorCargaDatos=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_errorcargadatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 259;BA.debugLine="msgErrorCargaDatos=mResult.Get(\"msgError\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_msgerrorcargadatos" /*RemoteObject*/ ,BA.ObjectToString(_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))));
 BA.debugLineNum = 260;BA.debugLine="Log (\"ErrorCargaDatos \" & ErrorCargaDatos & msgE";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9124321804",RemoteObject.concat(RemoteObject.createImmutable("ErrorCargaDatos "),__ref.getField(true,"_errorcargadatos" /*RemoteObject*/ ),__ref.getField(true,"_msgerrorcargadatos" /*RemoteObject*/ )),0);
 BA.debugLineNum = 261;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(msgErrorCargaD";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_msgerrorcargadatos" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 262;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "inicio"), _msa);
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 BA.debugLineNum = 263;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 266;BA.debugLine="CargaCamposCLV";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_cargacamposclv" /*void*/ );
 BA.debugLineNum = 267;BA.debugLine="Wait For CargaCamposCLV_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposclv_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "inicio"), null);
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 269;BA.debugLine="Dialog.Initialize(frmReg.RootPane)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 274;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _cargacamposclv_completed(RemoteObject __ref) throws Exception{
}
public static void  _inicioprev(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InicioPrev (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("inicioprev")) { __ref.runUserSub(false, "jamformregistro","inicioprev", __ref); return;}
ResumableSub_InicioPrev rsub = new ResumableSub_InicioPrev(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InicioPrev extends BA.ResumableSub {
public ResumableSub_InicioPrev(b4j.docU.jamformregistro parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _icf = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject group26;
int index26;
int groupLen26;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InicioPrev (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,202);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 204;BA.debugLine="If mNombreFicheroJSON=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnombreficherojson" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 205;BA.debugLine="jamRecordFormBuilder.Show(\"Nuevo\",\"\")";
Debug.JustUpdateDeviceLine();
parent._jamrecordformbuilder.runVoidMethod ("_show" /*void*/ ,(Object)(BA.ObjectToString("Nuevo")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 206;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 209;BA.debugLine="wait for (Inicio) complete (Success As Boolean)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "inicioprev"), __ref.runClassMethod (b4j.docU.jamformregistro.class, "_inicio" /*RemoteObject*/ ));
this.state = 22;
return;
case 22:
//C
this.state = 5;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 211;BA.debugLine="If Success=False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 5:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 213;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"La carga d";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La carga del JSON "),__ref.getField(true,"_mnombreficherojson" /*RemoteObject*/ ),RemoteObject.createImmutable(" ha dado error, ¿Cargar el RecordFormBuilder?"))),(Object)(BA.ObjectToString("Error carga JSON")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 214;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "inicioprev"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 215;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 216;BA.debugLine="CerrarFormRegistro";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_cerrarformregistro" /*RemoteObject*/ );
 BA.debugLineNum = 217;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 219;BA.debugLine="jamRecordFormBuilder.Show(\"Edicion\",mNombreFich";
Debug.JustUpdateDeviceLine();
parent._jamrecordformbuilder.runVoidMethod ("_show" /*void*/ ,(Object)(BA.ObjectToString("Edicion")),(Object)(__ref.getField(true,"_mnombreficherojson" /*RemoteObject*/ )));
 BA.debugLineNum = 220;BA.debugLine="CerrarFormRegistro";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_cerrarformregistro" /*RemoteObject*/ );
 BA.debugLineNum = 221;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 224;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La carga del";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La carga del JSON "),__ref.getField(true,"_mnombreficherojson" /*RemoteObject*/ ),RemoteObject.createImmutable(" ha dado error. Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 225;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "inicioprev"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 14;
;
 BA.debugLineNum = 226;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 230;BA.debugLine="Log(\"  \")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9124256284",RemoteObject.createImmutable("  "),0);
 BA.debugLineNum = 231;BA.debugLine="Log(\"***********Inicio Form Registro Completed***";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9124256285",RemoteObject.concat(RemoteObject.createImmutable("***********Inicio Form Registro Completed***********"),parent.__c.getField(true,"CRLF")),0);
 BA.debugLineNum = 232;BA.debugLine="Log(\"  \")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9124256286",RemoteObject.createImmutable("  "),0);
 BA.debugLineNum = 233;BA.debugLine="Log(\"***********Lista de campos del registro: mls";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9124256287",RemoteObject.concat(RemoteObject.createImmutable("***********Lista de campos del registro: mlstInfoCampos***********"),parent.__c.getField(true,"CRLF")),0);
 BA.debugLineNum = 234;BA.debugLine="Log(\"  \")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9124256288",RemoteObject.createImmutable("  "),0);
 BA.debugLineNum = 235;BA.debugLine="For Each icF As InfoCampoJamFormRegistro In mlstI";
Debug.JustUpdateDeviceLine();
if (true) break;

case 15:
//for
this.state = 18;
group26 = __ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ );
index26 = 0;
groupLen26 = group26.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("icF", _icf);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 18;
if (index26 < groupLen26) {
this.state = 17;
_icf = (group26.runMethod(false,"Get",index26));Debug.locals.put("icF", _icf);}
if (true) break;

case 26:
//C
this.state = 25;
index26++;
Debug.locals.put("icF", _icf);
if (true) break;

case 17:
//C
this.state = 26;
 BA.debugLineNum = 236;BA.debugLine="Log(icF)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9124256290",BA.ObjectToString(_icf),0);
 BA.debugLineNum = 237;BA.debugLine="Log(\"  \")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9124256291",RemoteObject.createImmutable("  "),0);
 if (true) break;
if (true) break;
Debug.locals.put("icF", _icf);
;
 BA.debugLineNum = 240;BA.debugLine="If SubExists(mCallBack, mEventName & \"_AfterFormL";
Debug.JustUpdateDeviceLine();

case 18:
//if
this.state = 21;
if (parent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_AfterFormLoad")))).<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 241;BA.debugLine="CallSub(mCallBack,mEventName & \"_AfterFormLoad\")";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_AfterFormLoad"))));
 if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 244;BA.debugLine="Show";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname,RemoteObject _owner,RemoteObject _title,RemoteObject _modo,RemoteObject _nombreficherojson,RemoteObject _datosinputregistro) throws Exception{
try {
		Debug.PushSubsStack("Initialize (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "jamformregistro","initialize", __ref, _ba, _callback, _eventname, _owner, _title, _modo, _nombreficherojson, _datosinputregistro);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Owner", _owner);
Debug.locals.put("Title", _title);
Debug.locals.put("Modo", _modo);
Debug.locals.put("NombreFicheroJSON", _nombreficherojson);
Debug.locals.put("DatosInputRegistro", _datosinputregistro);
 BA.debugLineNum = 131;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 133;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 134;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 135;BA.debugLine="frmReg.Initialize(\"frmReg\",500,0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frmReg")),(Object)(BA.numberCast(double.class, 500)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 136;BA.debugLine="frmReg.SetOwner(Owner)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethod ("SetOwner",(Object)(_owner));
 BA.debugLineNum = 137;BA.debugLine="frmReg.BackColor = fx.Colors.Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(false,"setBackColor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"Transparent"));
 BA.debugLineNum = 142;BA.debugLine="frmReg.SetFormStyle(\"UTILITY\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UTILITY")));
 BA.debugLineNum = 143;BA.debugLine="frmReg.RootPane.Style = \"-fx-background-color:red";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color:red;-fx-background-radius:48px;"));
 BA.debugLineNum = 144;BA.debugLine="frmReg.RootPane.LoadLayout(\"scrFormRegistro\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrFormRegistro")));
 BA.debugLineNum = 145;BA.debugLine="frmReg.Title=Title";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(true,"setTitle",_title);
 BA.debugLineNum = 148;BA.debugLine="btnConfigurarJSON.Visible=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnconfigurarjson" /*RemoteObject*/ ).runMethod(true,"setVisible",jamformregistro.__c.getField(true,"False"));
 BA.debugLineNum = 150;BA.debugLine="btnConfigurarJSON.Visible=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnconfigurarjson" /*RemoteObject*/ ).runMethod(true,"setVisible",jamformregistro.__c.getField(true,"True"));
 BA.debugLineNum = 152;BA.debugLine="lstItemsCLV.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstitemsclv" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 153;BA.debugLine="DatosOrigenDatosFormRegistro=CreateTipoOrigenDato";
Debug.JustUpdateDeviceLine();
__ref.setField ("_datosorigendatosformregistro" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.jamformregistro.class, "_createtipoorigendatos" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 174;BA.debugLine="ColItemsPares=0xFFDCDCDC";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colitemspares" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xffdcdcdc)));
 BA.debugLineNum = 175;BA.debugLine="ColItemsImpares=0xFFEFEBE9";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colitemsimpares" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xffefebe9)));
 BA.debugLineNum = 177;BA.debugLine="mlstInfoCamposSQL.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlstinfocampossql" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 180;BA.debugLine="mModoRegistro=Modo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmodoregistro" /*RemoteObject*/ ,_modo);
 BA.debugLineNum = 181;BA.debugLine="If mModoRegistro=\"Editar\" Or mModoRegistro=\"Nuevo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Editar")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Nuevo"))) { 
 BA.debugLineNum = 182;BA.debugLine="btnOK.Text=Chr(0xF0C7) & \" Grabar\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btnok" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(jamformregistro.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0c7)))),RemoteObject.createImmutable(" Grabar")));
 };
 BA.debugLineNum = 184;BA.debugLine="mDatosInputRegistro.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdatosinputregistro" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 185;BA.debugLine="For Each k In DatosInputRegistro.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group22 = _datosinputregistro.runMethod(false,"Keys");
final int groupLen22 = group22.runMethod(true,"getSize").<Integer>get()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_k = group22.runMethod(false,"Get",index22);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 186;BA.debugLine="mDatosInputRegistro.Put(k,DatosInputRegistro.Get";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdatosinputregistro" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(_k),(Object)(_datosinputregistro.runMethod(false,"Get",(Object)(_k))));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 188;BA.debugLine="mNombreFicheroJSON=NombreFicheroJSON";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mnombreficherojson" /*RemoteObject*/ ,_nombreficherojson);
 BA.debugLineNum = 190;BA.debugLine="If mNombreFicheroJSON=\"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mnombreficherojson" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 };
 BA.debugLineNum = 194;BA.debugLine="InicioPrev";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_inicioprev" /*void*/ );
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _modificardatosauxconsultacampo(RemoteObject __ref,RemoteObject _campo,RemoteObject _ipjrdcorigendatosaux,RemoteObject _puertojrdcorigendatosaux,RemoteObject _comandoconfigdatosaux,RemoteObject _parametroscomandodatosaux) throws Exception{
try {
		Debug.PushSubsStack("ModificarDatosAuxConsultaCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2125);
if (RapidSub.canDelegate("modificardatosauxconsultacampo")) { return __ref.runUserSub(false, "jamformregistro","modificardatosauxconsultacampo", __ref, _campo, _ipjrdcorigendatosaux, _puertojrdcorigendatosaux, _comandoconfigdatosaux, _parametroscomandodatosaux);}
RemoteObject _ic = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
int _idxclv = 0;
RemoteObject _icidx = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _cpo = RemoteObject.createImmutable("");
Debug.locals.put("Campo", _campo);
Debug.locals.put("IPJrdcOrigenDatosAux", _ipjrdcorigendatosaux);
Debug.locals.put("PuertoJrdcOrigenDatosAux", _puertojrdcorigendatosaux);
Debug.locals.put("ComandoConfigDatosAux", _comandoconfigdatosaux);
Debug.locals.put("ParametrosComandoDatosAux", _parametroscomandodatosaux);
 BA.debugLineNum = 2125;BA.debugLine="Public Sub ModificarDatosAuxConsultaCampo(Campo As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2126;BA.debugLine="For Each IC As InfoCampoJamFormRegistro In mlstIn";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_ic = (group1.runMethod(false,"Get",index1));Debug.locals.put("IC", _ic);
Debug.locals.put("IC", _ic);
 BA.debugLineNum = 2127;BA.debugLine="If IC.CampoSQL=Campo Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ic.getField(true,"CampoSQL" /*RemoteObject*/ ),_campo)) { 
 BA.debugLineNum = 2128;BA.debugLine="IC.IPJrdcOrigenDatosAux=IPJrdcOrigenDatosAux";
Debug.JustUpdateDeviceLine();
_ic.setField ("IPJrdcOrigenDatosAux" /*RemoteObject*/ ,_ipjrdcorigendatosaux);
 BA.debugLineNum = 2129;BA.debugLine="IC.PuertoJrdcOrigenDatosAux=PuertoJrdcOrigenDat";
Debug.JustUpdateDeviceLine();
_ic.setField ("PuertoJrdcOrigenDatosAux" /*RemoteObject*/ ,_puertojrdcorigendatosaux);
 BA.debugLineNum = 2130;BA.debugLine="IC.ComandoConfigDatosAux=ComandoConfigDatosAux";
Debug.JustUpdateDeviceLine();
_ic.setField ("ComandoConfigDatosAux" /*RemoteObject*/ ,_comandoconfigdatosaux);
 BA.debugLineNum = 2131;BA.debugLine="IC.ParametrosComandoDatosAux=ParametrosComandoD";
Debug.JustUpdateDeviceLine();
_ic.setField ("ParametrosComandoDatosAux" /*RemoteObject*/ ,_parametroscomandodatosaux);
 BA.debugLineNum = 2133;BA.debugLine="For iDxCLV=0 To clvCamposRegistro.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxclv = 0 ;
for (;(step7 > 0 && _idxclv <= limit7) || (step7 < 0 && _idxclv >= limit7) ;_idxclv = ((int)(0 + _idxclv + step7))  ) {
Debug.locals.put("iDxCLV", _idxclv);
 BA.debugLineNum = 2134;BA.debugLine="Dim ICIdx As InfoCampoJamFormRegistro=clvCampo";
Debug.JustUpdateDeviceLine();
_icidx = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _idxclv))));Debug.locals.put("ICIdx", _icidx);Debug.locals.put("ICIdx", _icidx);
 BA.debugLineNum = 2135;BA.debugLine="Dim cpo As String=ICIdx.CampoSQL";
Debug.JustUpdateDeviceLine();
_cpo = _icidx.getField(true,"CampoSQL" /*RemoteObject*/ );Debug.locals.put("cpo", _cpo);Debug.locals.put("cpo", _cpo);
 BA.debugLineNum = 2136;BA.debugLine="If cpo=Campo Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_cpo,_campo)) { 
 BA.debugLineNum = 2137;BA.debugLine="ICIdx.IPJrdcOrigenDatosAux=IPJrdcOrigenDatosA";
Debug.JustUpdateDeviceLine();
_icidx.setField ("IPJrdcOrigenDatosAux" /*RemoteObject*/ ,_ipjrdcorigendatosaux);
 BA.debugLineNum = 2138;BA.debugLine="ICIdx.PuertoJrdcOrigenDatosAux=PuertoJrdcOrig";
Debug.JustUpdateDeviceLine();
_icidx.setField ("PuertoJrdcOrigenDatosAux" /*RemoteObject*/ ,_puertojrdcorigendatosaux);
 BA.debugLineNum = 2139;BA.debugLine="ICIdx.ComandoConfigDatosAux=ComandoConfigDato";
Debug.JustUpdateDeviceLine();
_icidx.setField ("ComandoConfigDatosAux" /*RemoteObject*/ ,_comandoconfigdatosaux);
 BA.debugLineNum = 2140;BA.debugLine="ICIdx.ParametrosComandoDatosAux=ParametrosCom";
Debug.JustUpdateDeviceLine();
_icidx.setField ("ParametrosComandoDatosAux" /*RemoteObject*/ ,_parametroscomandodatosaux);
 BA.debugLineNum = 2141;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("iDxCLV", _idxclv);
;
 BA.debugLineNum = 2144;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("IC", _ic);
;
 BA.debugLineNum = 2147;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _modificardatosauxlistavalorescampo(RemoteObject __ref,RemoteObject _campo,RemoteObject _listavalores) throws Exception{
try {
		Debug.PushSubsStack("ModificarDatosAuxListaValoresCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2153);
if (RapidSub.canDelegate("modificardatosauxlistavalorescampo")) { return __ref.runUserSub(false, "jamformregistro","modificardatosauxlistavalorescampo", __ref, _campo, _listavalores);}
RemoteObject _ic = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
int _idxclv = 0;
RemoteObject _icidx = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _cpo = RemoteObject.createImmutable("");
Debug.locals.put("Campo", _campo);
Debug.locals.put("ListaValores", _listavalores);
 BA.debugLineNum = 2153;BA.debugLine="Public Sub ModificarDatosAuxListaValoresCampo(Camp";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2154;BA.debugLine="For Each IC As InfoCampoJamFormRegistro In mlstIn";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_ic = (group1.runMethod(false,"Get",index1));Debug.locals.put("IC", _ic);
Debug.locals.put("IC", _ic);
 BA.debugLineNum = 2155;BA.debugLine="If IC.CampoSQL=Campo Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ic.getField(true,"CampoSQL" /*RemoteObject*/ ),_campo)) { 
 BA.debugLineNum = 2156;BA.debugLine="IC.ListaValoresDatosAux=ListaValores";
Debug.JustUpdateDeviceLine();
_ic.setField ("ListaValoresDatosAux" /*RemoteObject*/ ,_listavalores);
 BA.debugLineNum = 2157;BA.debugLine="For iDxCLV=0 To clvCamposRegistro.Size-1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxclv = 0 ;
for (;(step4 > 0 && _idxclv <= limit4) || (step4 < 0 && _idxclv >= limit4) ;_idxclv = ((int)(0 + _idxclv + step4))  ) {
Debug.locals.put("iDxCLV", _idxclv);
 BA.debugLineNum = 2158;BA.debugLine="Dim ICIdx As InfoCampoJamFormRegistro=clvCampo";
Debug.JustUpdateDeviceLine();
_icidx = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _idxclv))));Debug.locals.put("ICIdx", _icidx);Debug.locals.put("ICIdx", _icidx);
 BA.debugLineNum = 2159;BA.debugLine="Dim cpo As String=ICIdx.CampoSQL";
Debug.JustUpdateDeviceLine();
_cpo = _icidx.getField(true,"CampoSQL" /*RemoteObject*/ );Debug.locals.put("cpo", _cpo);Debug.locals.put("cpo", _cpo);
 BA.debugLineNum = 2160;BA.debugLine="If cpo=Campo Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_cpo,_campo)) { 
 BA.debugLineNum = 2161;BA.debugLine="ICIdx.ListaValoresDatosAux=ListaValores";
Debug.JustUpdateDeviceLine();
_icidx.setField ("ListaValoresDatosAux" /*RemoteObject*/ ,_listavalores);
 BA.debugLineNum = 2162;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("iDxCLV", _idxclv);
;
 BA.debugLineNum = 2165;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("IC", _ic);
;
 BA.debugLineNum = 2168;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _modificarvalorcampoenformularioregistro(RemoteObject __ref,RemoteObject _campo,RemoteObject _valor,RemoteObject _valormostrado) throws Exception{
try {
		Debug.PushSubsStack("ModificarValorCampoEnFormularioRegistro (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2177);
if (RapidSub.canDelegate("modificarvalorcampoenformularioregistro")) { return __ref.runUserSub(false, "jamformregistro","modificarvalorcampoenformularioregistro", __ref, _campo, _valor, _valormostrado);}
ResumableSub_ModificarValorCampoEnFormularioRegistro rsub = new ResumableSub_ModificarValorCampoEnFormularioRegistro(null,__ref,_campo,_valor,_valormostrado);
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
public static class ResumableSub_ModificarValorCampoEnFormularioRegistro extends BA.ResumableSub {
public ResumableSub_ModificarValorCampoEnFormularioRegistro(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _campo,RemoteObject _valor,RemoteObject _valormostrado) {
this.parent = parent;
this.__ref = __ref;
this._campo = _campo;
this._valor = _valor;
this._valormostrado = _valormostrado;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _campo;
RemoteObject _valor;
RemoteObject _valormostrado;
RemoteObject _ic = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ModificarValorCampoEnFormularioRegistro (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2177);
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
Debug.locals.put("Campo", _campo);
Debug.locals.put("Valor", _valor);
Debug.locals.put("ValorMostrado", _valormostrado);
 BA.debugLineNum = 2178;BA.debugLine="For Each IC As InfoCampoJamFormRegistro In mlstIn";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 12;
group1 = __ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ );
index1 = 0;
groupLen1 = group1.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("IC", _ic);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 12;
if (index1 < groupLen1) {
this.state = 3;
_ic = (group1.runMethod(false,"Get",index1));Debug.locals.put("IC", _ic);}
if (true) break;

case 14:
//C
this.state = 13;
index1++;
Debug.locals.put("IC", _ic);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2179;BA.debugLine="If IC.CampoSQL=Campo Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_ic.getField(true,"CampoSQL" /*RemoteObject*/ ),_campo)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2180;BA.debugLine="IC.ValorOutputCampo=Valor";
Debug.JustUpdateDeviceLine();
_ic.setField ("ValorOutputCampo" /*RemoteObject*/ ,_valor);
 BA.debugLineNum = 2181;BA.debugLine="If IC.NumCamposDatosAux>1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",_ic.getField(true,"NumCamposDatosAux" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2182;BA.debugLine="IC.ValorMostrarCampoFormulario=ValorMostrado";
Debug.JustUpdateDeviceLine();
_ic.setField ("ValorMostrarCampoFormulario" /*RemoteObject*/ ,_valormostrado);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2192;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 12;
if (true) break;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
Debug.locals.put("IC", _ic);
;
 BA.debugLineNum = 2195;BA.debugLine="CargaCamposCLV";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_cargacamposclv" /*void*/ );
 BA.debugLineNum = 2196;BA.debugLine="Wait For CargaCamposCLV_Completed";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargacamposclv_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "modificarvalorcampoenformularioregistro"), null);
this.state = 15;
return;
case 15:
//C
this.state = -1;
;
 BA.debugLineNum = 2197;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 2198;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _mostrarb4xinputdialogitemcampo(RemoteObject __ref,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("MostrarB4XInputDialogItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1868);
if (RapidSub.canDelegate("mostrarb4xinputdialogitemcampo")) { __ref.runUserSub(false, "jamformregistro","mostrarb4xinputdialogitemcampo", __ref, _idx); return;}
ResumableSub_MostrarB4XInputDialogItemCampo rsub = new ResumableSub_MostrarB4XInputDialogItemCampo(null,__ref,_idx);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarB4XInputDialogItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarB4XInputDialogItemCampo(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _idx;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _campo = RemoteObject.createImmutable("");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _btokdlg = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _btcanceldlg = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarB4XInputDialogItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1868);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("iDx", _idx);
 BA.debugLineNum = 1869;BA.debugLine="Dim clvIV As InfoCampoJamFormRegistro=clvCamposRe";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_idx)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 1871;BA.debugLine="Dim Campo As String=clvIV.CampoSQL";
Debug.JustUpdateDeviceLine();
_campo = _clviv.getField(true,"CampoSQL" /*RemoteObject*/ );Debug.locals.put("Campo", _campo);Debug.locals.put("Campo", _campo);
 BA.debugLineNum = 1874;BA.debugLine="Dialog.Title=\"Indica \" & clvIV.TituloCampo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Indica "),_clviv.getField(true,"TituloCampo" /*RemoteObject*/ ))));
 BA.debugLineNum = 1875;BA.debugLine="InputTemplate.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1876;BA.debugLine="If clvIV.ValorOutputCampo<>Null Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("N",_clviv.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1877;BA.debugLine="InputTemplate.Text=clvIV.ValorOutputCampo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ).setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(_clviv.getField(false,"ValorOutputCampo" /*RemoteObject*/ )));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1879;BA.debugLine="InputTemplate.lblTitle.Text=\"\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ).getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 1880;BA.debugLine="Select True";
Debug.JustUpdateDeviceLine();
if (true) break;

case 5:
//select
this.state = 12;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoDato" /*RemoteObject*/ ),BA.ObjectToString("INTEGER"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoDato" /*RemoteObject*/ ),BA.ObjectToString("TEXT"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoDato" /*RemoteObject*/ ),BA.ObjectToString("REAL"))))) {
case 0: {
this.state = 7;
if (true) break;
}
case 1: {
this.state = 9;
if (true) break;
}
case 2: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 1882;BA.debugLine="InputTemplate.ConfigureForNumbers(False,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")),(Object)(parent.__c.getField(true,"True")));
 if (true) break;

case 9:
//C
this.state = 12;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1886;BA.debugLine="InputTemplate.ConfigureForNumbers(True,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")),(Object)(parent.__c.getField(true,"True")));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1888;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1889;BA.debugLine="Dim btOKDlg As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_btokdlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btokdlg = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("btOKDlg", _btokdlg);Debug.locals.put("btOKDlg", _btokdlg);
 BA.debugLineNum = 1890;BA.debugLine="btOKDlg.TextSize=14";
Debug.JustUpdateDeviceLine();
_btokdlg.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 1891;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.D";
Debug.JustUpdateDeviceLine();
_btcanceldlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btcanceldlg = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("btCancelDlg", _btcanceldlg);Debug.locals.put("btCancelDlg", _btcanceldlg);
 BA.debugLineNum = 1892;BA.debugLine="btCancelDlg.TextSize=14";
Debug.JustUpdateDeviceLine();
_btcanceldlg.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 1894;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "mostrarb4xinputdialogitemcampo"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 13;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1895;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1896;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":iDx, \"clvIV\":";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Index")),(_idx),RemoteObject.createImmutable(("clvIV")),(_clviv),RemoteObject.createImmutable(("ValorValidacion")),(__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ).getField(true,"_text" /*RemoteObject*/ ))}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1897;BA.debugLine="BeforeUpdate(mData)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_beforeupdate" /*RemoteObject*/ ,(Object)(_mdata));
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 1899;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _mostrarb4xlisttemplateitemcampo(RemoteObject __ref,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("MostrarB4XListTemplateItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1972);
if (RapidSub.canDelegate("mostrarb4xlisttemplateitemcampo")) { __ref.runUserSub(false, "jamformregistro","mostrarb4xlisttemplateitemcampo", __ref, _idx); return;}
ResumableSub_MostrarB4XListTemplateItemCampo rsub = new ResumableSub_MostrarB4XListTemplateItemCampo(null,__ref,_idx);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarB4XListTemplateItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarB4XListTemplateItemCampo(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _idx;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _campo = RemoteObject.createImmutable("");
RemoteObject _lstoptionsdlg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _numcamposdatosaux = RemoteObject.createImmutable(0);
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstitemsaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstidsitemsaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstvaloresitemsaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdataaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _btcanceldlg = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idxvalores = RemoteObject.createImmutable(0);
int step17;
int limit17;
int step27;
int limit27;
int step32;
int limit32;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarB4XListTemplateItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,1972);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("iDx", _idx);
 BA.debugLineNum = 1973;BA.debugLine="Dim clvIV As InfoCampoJamFormRegistro=clvCamposRe";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_idx)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 1974;BA.debugLine="Dim Campo As String=clvIV.CampoSQL";
Debug.JustUpdateDeviceLine();
_campo = _clviv.getField(true,"CampoSQL" /*RemoteObject*/ );Debug.locals.put("Campo", _campo);Debug.locals.put("Campo", _campo);
 BA.debugLineNum = 1976;BA.debugLine="Dim lstOptionsDlg As List";
Debug.JustUpdateDeviceLine();
_lstoptionsdlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOptionsDlg", _lstoptionsdlg);
 BA.debugLineNum = 1977;BA.debugLine="lstOptionsDlg.Initialize";
Debug.JustUpdateDeviceLine();
_lstoptionsdlg.runVoidMethod ("Initialize");
 BA.debugLineNum = 1978;BA.debugLine="If clvIV.TipoDatosAux=\"Lista\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoDatosAux" /*RemoteObject*/ ),BA.ObjectToString("Lista"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1980;BA.debugLine="lstOptionsDlg=clvIV.ListaValoresDatosAux";
Debug.JustUpdateDeviceLine();
_lstoptionsdlg = _clviv.getField(false,"ListaValoresDatosAux" /*RemoteObject*/ );Debug.locals.put("lstOptionsDlg", _lstoptionsdlg);
 BA.debugLineNum = 1981;BA.debugLine="Dim NumCamposDatosAux As Int=1";
Debug.JustUpdateDeviceLine();
_numcamposdatosaux = BA.numberCast(int.class, 1);Debug.locals.put("NumCamposDatosAux", _numcamposdatosaux);Debug.locals.put("NumCamposDatosAux", _numcamposdatosaux);
 if (true) break;
;
 BA.debugLineNum = 1984;BA.debugLine="If clvIV.TipoDatosAux=\"Consulta\" Then";
Debug.JustUpdateDeviceLine();

case 4:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoDatosAux" /*RemoteObject*/ ),BA.ObjectToString("Consulta"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1985;BA.debugLine="Dim NumCamposDatosAux As Int=clvIV.NumCamposDato";
Debug.JustUpdateDeviceLine();
_numcamposdatosaux = _clviv.getField(true,"NumCamposDatosAux" /*RemoteObject*/ );Debug.locals.put("NumCamposDatosAux", _numcamposdatosaux);Debug.locals.put("NumCamposDatosAux", _numcamposdatosaux);
 BA.debugLineNum = 1986;BA.debugLine="CargaItemsAuxControl(clvIV.IPJrdcOrigenDatosAux,";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_cargaitemsauxcontrol" /*void*/ ,(Object)(_clviv.getField(true,"IPJrdcOrigenDatosAux" /*RemoteObject*/ )),(Object)(_clviv.getField(true,"PuertoJrdcOrigenDatosAux" /*RemoteObject*/ )),(Object)(_clviv.getField(true,"ComandoConfigDatosAux" /*RemoteObject*/ )),(Object)(_clviv.getField(false,"ParametrosComandoDatosAux" /*RemoteObject*/ )));
 BA.debugLineNum = 1987;BA.debugLine="Wait For CargaItemsAuxControl_Completed(Accion A";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargaitemsauxcontrol_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "mostrarb4xlisttemplateitemcampo"), null);
this.state = 46;
return;
case 46:
//C
this.state = 7;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
_lstitemsaux = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("lstItemsAux", _lstitemsaux);
;
 BA.debugLineNum = 1988;BA.debugLine="If Accion.StartsWith(\"Err\") Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 30;
if (_accion.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Err"))).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 30;
 BA.debugLineNum = 1989;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1991;BA.debugLine="If clvIV.NumCamposDatosAux=1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 12:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_clviv.getField(true,"NumCamposDatosAux" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1992;BA.debugLine="For i=0 To lstItemsAux.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 15:
//for
this.state = 18;
step17 = 1;
limit17 = RemoteObject.solve(new RemoteObject[] {_lstitemsaux.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 47;
if (true) break;

case 47:
//C
this.state = 18;
if ((step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17)) this.state = 17;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step17)) ;
Debug.locals.put("i", _i);
if (true) break;

case 17:
//C
this.state = 48;
 BA.debugLineNum = 1994;BA.debugLine="Dim mP As Map=lstItemsAux.Get(i)";
Debug.JustUpdateDeviceLine();
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstitemsaux.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mP", _mp);Debug.locals.put("mP", _mp);
 BA.debugLineNum = 1995;BA.debugLine="lstOptionsDlg.Add(mP.GetValueAt(0))";
Debug.JustUpdateDeviceLine();
_lstoptionsdlg.runVoidMethod ("Add",(Object)(_mp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0)))));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 1998;BA.debugLine="If NumCamposDatosAux=2 Then";
Debug.JustUpdateDeviceLine();

case 19:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_numcamposdatosaux,BA.numberCast(double.class, 2))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1999;BA.debugLine="Dim lstIDsItemsAux As List";
Debug.JustUpdateDeviceLine();
_lstidsitemsaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstIDsItemsAux", _lstidsitemsaux);
 BA.debugLineNum = 2000;BA.debugLine="lstIDsItemsAux.Initialize";
Debug.JustUpdateDeviceLine();
_lstidsitemsaux.runVoidMethod ("Initialize");
 BA.debugLineNum = 2001;BA.debugLine="Dim lstValoresItemsAux As List";
Debug.JustUpdateDeviceLine();
_lstvaloresitemsaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstValoresItemsAux", _lstvaloresitemsaux);
 BA.debugLineNum = 2002;BA.debugLine="lstValoresItemsAux.Initialize";
Debug.JustUpdateDeviceLine();
_lstvaloresitemsaux.runVoidMethod ("Initialize");
 BA.debugLineNum = 2003;BA.debugLine="For i=0 To lstItemsAux.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 22:
//for
this.state = 25;
step27 = 1;
limit27 = RemoteObject.solve(new RemoteObject[] {_lstitemsaux.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 49;
if (true) break;

case 49:
//C
this.state = 25;
if ((step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27)) this.state = 24;
if (true) break;

case 50:
//C
this.state = 49;
_i = ((int)(0 + _i + step27)) ;
Debug.locals.put("i", _i);
if (true) break;

case 24:
//C
this.state = 50;
 BA.debugLineNum = 2004;BA.debugLine="Dim mDataAux As Map=lstItemsAux.Get(i)";
Debug.JustUpdateDeviceLine();
_mdataaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataaux = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstitemsaux.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mDataAux", _mdataaux);Debug.locals.put("mDataAux", _mdataaux);
 BA.debugLineNum = 2005;BA.debugLine="lstIDsItemsAux.Add(mDataAux.GetValueAt(0))";
Debug.JustUpdateDeviceLine();
_lstidsitemsaux.runVoidMethod ("Add",(Object)(_mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 2006;BA.debugLine="lstValoresItemsAux.Add(mDataAux.GetValueAt(1)";
Debug.JustUpdateDeviceLine();
_lstvaloresitemsaux.runVoidMethod ("Add",(Object)(_mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 1)))));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2008;BA.debugLine="For i=0 To lstValoresItemsAux.Size-1";
Debug.JustUpdateDeviceLine();

case 25:
//for
this.state = 28;
step32 = 1;
limit32 = RemoteObject.solve(new RemoteObject[] {_lstvaloresitemsaux.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 51;
if (true) break;

case 51:
//C
this.state = 28;
if ((step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32)) this.state = 27;
if (true) break;

case 52:
//C
this.state = 51;
_i = ((int)(0 + _i + step32)) ;
Debug.locals.put("i", _i);
if (true) break;

case 27:
//C
this.state = 52;
 BA.debugLineNum = 2009;BA.debugLine="lstOptionsDlg.Add(lstValoresItemsAux.Get(i))";
Debug.JustUpdateDeviceLine();
_lstoptionsdlg.runVoidMethod ("Add",(Object)(_lstvaloresitemsaux.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
Debug.locals.put("i", _i);
;
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
;
 BA.debugLineNum = 2015;BA.debugLine="If lstOptionsDlg.Size>0 Then";
Debug.JustUpdateDeviceLine();

case 31:
//if
this.state = 45;
if (RemoteObject.solveBoolean(">",_lstoptionsdlg.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 2017;BA.debugLine="Dialog.Title=\"Selecciona \" & clvIV.TituloCampo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Selecciona "),_clviv.getField(true,"TituloCampo" /*RemoteObject*/ ))));
 BA.debugLineNum = 2018;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.JustUpdateDeviceLine();
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 2019;BA.debugLine="B4XListDlg.Initialize";
Debug.JustUpdateDeviceLine();
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2020;BA.debugLine="B4XListDlg.AllowMultiSelection=False";
Debug.JustUpdateDeviceLine();
_b4xlistdlg.setField ("_allowmultiselection" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 2021;BA.debugLine="B4XListDlg.Options=lstOptionsDlg";
Debug.JustUpdateDeviceLine();
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstoptionsdlg);
 BA.debugLineNum = 2022;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4X";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2025;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.";
Debug.JustUpdateDeviceLine();
_btcanceldlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btcanceldlg = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("btCancelDlg", _btcanceldlg);Debug.locals.put("btCancelDlg", _btcanceldlg);
 BA.debugLineNum = 2026;BA.debugLine="btCancelDlg.TextSize=14";
Debug.JustUpdateDeviceLine();
_btcanceldlg.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 2028;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "mostrarb4xlisttemplateitemcampo"), _rsub);
this.state = 53;
return;
case 53:
//C
this.state = 34;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2029;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 34:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 2030;BA.debugLine="If NumCamposDatosAux=1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 37:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",_numcamposdatosaux,BA.numberCast(double.class, 1))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 2031;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":iDx, \"clvIV";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Index")),(_idx),RemoteObject.createImmutable(("clvIV")),(_clviv),RemoteObject.createImmutable(("ValorValidacion")),(_b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ ))}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 if (true) break;
;
 BA.debugLineNum = 2033;BA.debugLine="If NumCamposDatosAux=2 Then";
Debug.JustUpdateDeviceLine();

case 40:
//if
this.state = 43;
if (RemoteObject.solveBoolean("=",_numcamposdatosaux,BA.numberCast(double.class, 2))) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 2034;BA.debugLine="Dim idxValores As Int=lstValoresItemsAux.Index";
Debug.JustUpdateDeviceLine();
_idxvalores = _lstvaloresitemsaux.runMethod(true,"IndexOf",(Object)((_b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ ))));Debug.locals.put("idxValores", _idxvalores);Debug.locals.put("idxValores", _idxvalores);
 BA.debugLineNum = 2035;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":iDx, \"clvIV";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Index")),(_idx),RemoteObject.createImmutable(("clvIV")),(_clviv),RemoteObject.createImmutable(("ValorValidacion")),_lstidsitemsaux.runMethod(false,"Get",(Object)(_idxvalores)),RemoteObject.createImmutable(("ValorMostrarValidacion")),(_b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ ))}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 if (true) break;

case 43:
//C
this.state = 44;
;
 BA.debugLineNum = 2037;BA.debugLine="BeforeUpdate(mData)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_beforeupdate" /*RemoteObject*/ ,(Object)(_mdata));
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = -1;
;
 BA.debugLineNum = 2040;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _mostrarb4xsearchlisttemplateitemcampo(RemoteObject __ref,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("MostrarB4XSearchListTemplateItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2049);
if (RapidSub.canDelegate("mostrarb4xsearchlisttemplateitemcampo")) { __ref.runUserSub(false, "jamformregistro","mostrarb4xsearchlisttemplateitemcampo", __ref, _idx); return;}
ResumableSub_MostrarB4XSearchListTemplateItemCampo rsub = new ResumableSub_MostrarB4XSearchListTemplateItemCampo(null,__ref,_idx);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarB4XSearchListTemplateItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarB4XSearchListTemplateItemCampo(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _idx;
RemoteObject _clviv = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _campo = RemoteObject.createImmutable("");
RemoteObject _lstoptionsdlg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _numcamposdatosaux = RemoteObject.createImmutable(0);
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstitemsaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstidsitemsaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstvaloresitemsaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdataaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _b4xsearchlistdlg = RemoteObject.declareNull("b4j.docU.b4xsearchtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _btcanceldlg = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idxvalores = RemoteObject.createImmutable(0);
int step17;
int limit17;
int step27;
int limit27;
int step32;
int limit32;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarB4XSearchListTemplateItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2049);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("iDx", _idx);
 BA.debugLineNum = 2050;BA.debugLine="Dim clvIV As InfoCampoJamFormRegistro=clvCamposRe";
Debug.JustUpdateDeviceLine();
_clviv = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_idx)));Debug.locals.put("clvIV", _clviv);Debug.locals.put("clvIV", _clviv);
 BA.debugLineNum = 2051;BA.debugLine="Dim Campo As String=clvIV.CampoSQL";
Debug.JustUpdateDeviceLine();
_campo = _clviv.getField(true,"CampoSQL" /*RemoteObject*/ );Debug.locals.put("Campo", _campo);Debug.locals.put("Campo", _campo);
 BA.debugLineNum = 2053;BA.debugLine="Dim lstOptionsDlg As List";
Debug.JustUpdateDeviceLine();
_lstoptionsdlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOptionsDlg", _lstoptionsdlg);
 BA.debugLineNum = 2054;BA.debugLine="lstOptionsDlg.Initialize";
Debug.JustUpdateDeviceLine();
_lstoptionsdlg.runVoidMethod ("Initialize");
 BA.debugLineNum = 2055;BA.debugLine="If clvIV.TipoDatosAux=\"Lista\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoDatosAux" /*RemoteObject*/ ),BA.ObjectToString("Lista"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2057;BA.debugLine="lstOptionsDlg=clvIV.ListaValoresDatosAux";
Debug.JustUpdateDeviceLine();
_lstoptionsdlg = _clviv.getField(false,"ListaValoresDatosAux" /*RemoteObject*/ );Debug.locals.put("lstOptionsDlg", _lstoptionsdlg);
 BA.debugLineNum = 2058;BA.debugLine="Dim NumCamposDatosAux As Int=1";
Debug.JustUpdateDeviceLine();
_numcamposdatosaux = BA.numberCast(int.class, 1);Debug.locals.put("NumCamposDatosAux", _numcamposdatosaux);Debug.locals.put("NumCamposDatosAux", _numcamposdatosaux);
 if (true) break;
;
 BA.debugLineNum = 2061;BA.debugLine="If clvIV.TipoDatosAux=\"Consulta\" Then";
Debug.JustUpdateDeviceLine();

case 4:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_clviv.getField(true,"TipoDatosAux" /*RemoteObject*/ ),BA.ObjectToString("Consulta"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2062;BA.debugLine="Dim NumCamposDatosAux As Int=clvIV.NumCamposDato";
Debug.JustUpdateDeviceLine();
_numcamposdatosaux = _clviv.getField(true,"NumCamposDatosAux" /*RemoteObject*/ );Debug.locals.put("NumCamposDatosAux", _numcamposdatosaux);Debug.locals.put("NumCamposDatosAux", _numcamposdatosaux);
 BA.debugLineNum = 2063;BA.debugLine="CargaItemsAuxControl(clvIV.IPJrdcOrigenDatosAux,";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_cargaitemsauxcontrol" /*void*/ ,(Object)(_clviv.getField(true,"IPJrdcOrigenDatosAux" /*RemoteObject*/ )),(Object)(_clviv.getField(true,"PuertoJrdcOrigenDatosAux" /*RemoteObject*/ )),(Object)(_clviv.getField(true,"ComandoConfigDatosAux" /*RemoteObject*/ )),(Object)(_clviv.getField(false,"ParametrosComandoDatosAux" /*RemoteObject*/ )));
 BA.debugLineNum = 2064;BA.debugLine="Wait For CargaItemsAuxControl_Completed(Accion A";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","cargaitemsauxcontrol_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "mostrarb4xsearchlisttemplateitemcampo"), null);
this.state = 46;
return;
case 46:
//C
this.state = 7;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
_lstitemsaux = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("lstItemsAux", _lstitemsaux);
;
 BA.debugLineNum = 2065;BA.debugLine="If Accion.StartsWith(\"Err\") Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 30;
if (_accion.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Err"))).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 30;
 BA.debugLineNum = 2066;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2068;BA.debugLine="If clvIV.NumCamposDatosAux=1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 12:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_clviv.getField(true,"NumCamposDatosAux" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2069;BA.debugLine="For i=0 To lstItemsAux.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 15:
//for
this.state = 18;
step17 = 1;
limit17 = RemoteObject.solve(new RemoteObject[] {_lstitemsaux.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 47;
if (true) break;

case 47:
//C
this.state = 18;
if ((step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17)) this.state = 17;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step17)) ;
Debug.locals.put("i", _i);
if (true) break;

case 17:
//C
this.state = 48;
 BA.debugLineNum = 2071;BA.debugLine="Dim mP As Map=lstItemsAux.Get(i)";
Debug.JustUpdateDeviceLine();
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstitemsaux.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mP", _mp);Debug.locals.put("mP", _mp);
 BA.debugLineNum = 2072;BA.debugLine="lstOptionsDlg.Add(mP.GetValueAt(0))";
Debug.JustUpdateDeviceLine();
_lstoptionsdlg.runVoidMethod ("Add",(Object)(_mp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0)))));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 2075;BA.debugLine="If NumCamposDatosAux=2 Then";
Debug.JustUpdateDeviceLine();

case 19:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_numcamposdatosaux,BA.numberCast(double.class, 2))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2076;BA.debugLine="Dim lstIDsItemsAux As List";
Debug.JustUpdateDeviceLine();
_lstidsitemsaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstIDsItemsAux", _lstidsitemsaux);
 BA.debugLineNum = 2077;BA.debugLine="lstIDsItemsAux.Initialize";
Debug.JustUpdateDeviceLine();
_lstidsitemsaux.runVoidMethod ("Initialize");
 BA.debugLineNum = 2078;BA.debugLine="Dim lstValoresItemsAux As List";
Debug.JustUpdateDeviceLine();
_lstvaloresitemsaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstValoresItemsAux", _lstvaloresitemsaux);
 BA.debugLineNum = 2079;BA.debugLine="lstValoresItemsAux.Initialize";
Debug.JustUpdateDeviceLine();
_lstvaloresitemsaux.runVoidMethod ("Initialize");
 BA.debugLineNum = 2080;BA.debugLine="For i=0 To lstItemsAux.Size-1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 22:
//for
this.state = 25;
step27 = 1;
limit27 = RemoteObject.solve(new RemoteObject[] {_lstitemsaux.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 49;
if (true) break;

case 49:
//C
this.state = 25;
if ((step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27)) this.state = 24;
if (true) break;

case 50:
//C
this.state = 49;
_i = ((int)(0 + _i + step27)) ;
Debug.locals.put("i", _i);
if (true) break;

case 24:
//C
this.state = 50;
 BA.debugLineNum = 2081;BA.debugLine="Dim mDataAux As Map=lstItemsAux.Get(i)";
Debug.JustUpdateDeviceLine();
_mdataaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdataaux = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstitemsaux.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mDataAux", _mdataaux);Debug.locals.put("mDataAux", _mdataaux);
 BA.debugLineNum = 2082;BA.debugLine="lstIDsItemsAux.Add(mDataAux.GetValueAt(0))";
Debug.JustUpdateDeviceLine();
_lstidsitemsaux.runVoidMethod ("Add",(Object)(_mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 2083;BA.debugLine="lstValoresItemsAux.Add(mDataAux.GetValueAt(1)";
Debug.JustUpdateDeviceLine();
_lstvaloresitemsaux.runVoidMethod ("Add",(Object)(_mdataaux.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 1)))));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2085;BA.debugLine="For i=0 To lstValoresItemsAux.Size-1";
Debug.JustUpdateDeviceLine();

case 25:
//for
this.state = 28;
step32 = 1;
limit32 = RemoteObject.solve(new RemoteObject[] {_lstvaloresitemsaux.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 51;
if (true) break;

case 51:
//C
this.state = 28;
if ((step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32)) this.state = 27;
if (true) break;

case 52:
//C
this.state = 51;
_i = ((int)(0 + _i + step32)) ;
Debug.locals.put("i", _i);
if (true) break;

case 27:
//C
this.state = 52;
 BA.debugLineNum = 2086;BA.debugLine="lstOptionsDlg.Add(lstValoresItemsAux.Get(i))";
Debug.JustUpdateDeviceLine();
_lstoptionsdlg.runVoidMethod ("Add",(Object)(_lstvaloresitemsaux.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
Debug.locals.put("i", _i);
;
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
;
 BA.debugLineNum = 2092;BA.debugLine="If lstOptionsDlg.Size>0 Then";
Debug.JustUpdateDeviceLine();

case 31:
//if
this.state = 45;
if (RemoteObject.solveBoolean(">",_lstoptionsdlg.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 2094;BA.debugLine="Dialog.Title=\"Selecciona \" & clvIV.TituloCampo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Selecciona "),_clviv.getField(true,"TituloCampo" /*RemoteObject*/ ))));
 BA.debugLineNum = 2095;BA.debugLine="Dim B4XSearchListDlg As B4XSearchTemplate";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg = RemoteObject.createNew ("b4j.docU.b4xsearchtemplate");Debug.locals.put("B4XSearchListDlg", _b4xsearchlistdlg);
 BA.debugLineNum = 2096;BA.debugLine="B4XSearchListDlg.Initialize";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.runClassMethod (b4j.docU.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2097;BA.debugLine="B4XSearchListDlg.SetItems(lstOptionsDlg)";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.runClassMethod (b4j.docU.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_lstoptionsdlg));
 BA.debugLineNum = 2098;BA.debugLine="B4XSearchListDlg.SearchField.HintText=\"Buscar\"";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString("Buscar"));
 BA.debugLineNum = 2099;BA.debugLine="B4XSearchListDlg.SearchField.Update";
Debug.JustUpdateDeviceLine();
_b4xsearchlistdlg.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 2100;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4X";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xsearchlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2103;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.";
Debug.JustUpdateDeviceLine();
_btcanceldlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btcanceldlg = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("btCancelDlg", _btcanceldlg);Debug.locals.put("btCancelDlg", _btcanceldlg);
 BA.debugLineNum = 2104;BA.debugLine="btCancelDlg.TextSize=14";
Debug.JustUpdateDeviceLine();
_btcanceldlg.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 2106;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "mostrarb4xsearchlisttemplateitemcampo"), _rsub);
this.state = 53;
return;
case 53:
//C
this.state = 34;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2107;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 34:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 2108;BA.debugLine="If NumCamposDatosAux=1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 37:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",_numcamposdatosaux,BA.numberCast(double.class, 1))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 2109;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":iDx, \"clvIV";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Index")),(_idx),RemoteObject.createImmutable(("clvIV")),(_clviv),RemoteObject.createImmutable(("ValorValidacion")),(_b4xsearchlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ ))}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 if (true) break;
;
 BA.debugLineNum = 2111;BA.debugLine="If NumCamposDatosAux=2 Then";
Debug.JustUpdateDeviceLine();

case 40:
//if
this.state = 43;
if (RemoteObject.solveBoolean("=",_numcamposdatosaux,BA.numberCast(double.class, 2))) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 2112;BA.debugLine="Dim idxValores As Int=lstValoresItemsAux.Index";
Debug.JustUpdateDeviceLine();
_idxvalores = _lstvaloresitemsaux.runMethod(true,"IndexOf",(Object)((_b4xsearchlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ ))));Debug.locals.put("idxValores", _idxvalores);Debug.locals.put("idxValores", _idxvalores);
 BA.debugLineNum = 2113;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":iDx, \"clvIV";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Index")),(_idx),RemoteObject.createImmutable(("clvIV")),(_clviv),RemoteObject.createImmutable(("ValorValidacion")),_lstidsitemsaux.runMethod(false,"Get",(Object)(_idxvalores)),RemoteObject.createImmutable(("ValorMostrarValidacion")),(_b4xsearchlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ ))}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 if (true) break;

case 43:
//C
this.state = 44;
;
 BA.debugLineNum = 2115;BA.debugLine="BeforeUpdate(mData)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_beforeupdate" /*RemoteObject*/ ,(Object)(_mdata));
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = -1;
;
 BA.debugLineNum = 2118;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _mostrarselfechaitemcampo(RemoteObject __ref,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("MostrarSelFechaItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2370);
if (RapidSub.canDelegate("mostrarselfechaitemcampo")) { __ref.runUserSub(false, "jamformregistro","mostrarselfechaitemcampo", __ref, _idx); return;}
ResumableSub_MostrarSelFechaItemCampo rsub = new ResumableSub_MostrarSelFechaItemCampo(null,__ref,_idx);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarSelFechaItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarSelFechaItemCampo(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _idx;
RemoteObject _iv = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _fechasel = RemoteObject.createImmutable(0L);
RemoteObject _datetimeformatant = RemoteObject.createImmutable("");
RemoteObject _fechaact = RemoteObject.createImmutable(0L);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bnok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarSelFechaItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2370);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IDx", _idx);
 BA.debugLineNum = 2371;BA.debugLine="Dim iv As InfoCampoJamFormRegistro=clvCamposRegis";
Debug.JustUpdateDeviceLine();
_iv = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_idx)));Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 2372;BA.debugLine="Dim FechaSel As Long";
Debug.JustUpdateDeviceLine();
_fechasel = RemoteObject.createImmutable(0L);Debug.locals.put("FechaSel", _fechasel);
 BA.debugLineNum = 2373;BA.debugLine="Dim DatetimeFormatAnt As String=DateTime.DateForm";
Debug.JustUpdateDeviceLine();
_datetimeformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DatetimeFormatAnt", _datetimeformatant);Debug.locals.put("DatetimeFormatAnt", _datetimeformatant);
 BA.debugLineNum = 2374;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 2375;BA.debugLine="InicializarCalendario";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_inicializarcalendario" /*RemoteObject*/ );
 BA.debugLineNum = 2377;BA.debugLine="Dim FechaAct As Long=FixNullLong(iv.ValorOutputCa";
Debug.JustUpdateDeviceLine();
_fechaact = BA.numberCast(long.class, __ref.runClassMethod (b4j.docU.jamformregistro.class, "_fixnulllong" /*RemoteObject*/ ,(Object)(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))));Debug.locals.put("FechaAct", _fechaact);Debug.locals.put("FechaAct", _fechaact);
 BA.debugLineNum = 2378;BA.debugLine="If FechaAct<>0 Then DateTemplate.Date=FechaAct";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_fechaact,BA.numberCast(long.class, 0))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,_fechaact);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2379;BA.debugLine="Dialog.Title=\"Selecciona \" & iv.TituloCampo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Selecciona "),_iv.getField(true,"TituloCampo" /*RemoteObject*/ ))));
 BA.debugLineNum = 2380;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Date";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_datetemplate" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable(("Borrar"))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2381;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 2382;BA.debugLine="bCancel.TextSize=18";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 BA.debugLineNum = 2383;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 2384;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 2385;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.JustUpdateDeviceLine();
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOk", _bok);Debug.locals.put("bOk", _bok);
 BA.debugLineNum = 2386;BA.debugLine="bOk.TextSize=18";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 BA.debugLineNum = 2387;BA.debugLine="bOk.Left=bOk.Left-20dip";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bok.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 2388;BA.debugLine="bOk.Width=bOk.Width+20dip";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bok.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 2389;BA.debugLine="Dim bNOk As B4XView=Dialog.GetButton(xui.DialogRe";
Debug.JustUpdateDeviceLine();
_bnok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bnok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Negative")));Debug.locals.put("bNOk", _bnok);Debug.locals.put("bNOk", _bnok);
 BA.debugLineNum = 2390;BA.debugLine="bNOk.TextSize=18";
Debug.JustUpdateDeviceLine();
_bnok.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 BA.debugLineNum = 2391;BA.debugLine="bNOk.Left=bNOk.Left-20dip";
Debug.JustUpdateDeviceLine();
_bnok.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bnok.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 2392;BA.debugLine="bNOk.Width=bNOk.Width+20dip";
Debug.JustUpdateDeviceLine();
_bnok.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bnok.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 2393;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "mostrarselfechaitemcampo"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2394;BA.debugLine="Select Case rInt";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//select
this.state = 14;
switch (BA.switchObjectToInt(_rint,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Negative"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive"))) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 13;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 14;
 BA.debugLineNum = 2396;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 2398;BA.debugLine="FechaSel=0";
Debug.JustUpdateDeviceLine();
_fechasel = BA.numberCast(long.class, 0);Debug.locals.put("FechaSel", _fechasel);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2400;BA.debugLine="FechaSel=DateTemplate.Date";
Debug.JustUpdateDeviceLine();
_fechasel = __ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ );Debug.locals.put("FechaSel", _fechasel);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 2403;BA.debugLine="DateTime.DateFormat=DatetimeFormatAnt";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_datetimeformatant);
 BA.debugLineNum = 2404;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":IDx, \"clvIV\":i";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Index")),(_idx),RemoteObject.createImmutable(("clvIV")),(_iv),RemoteObject.createImmutable(("ValorValidacion")),(_fechasel)}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 2405;BA.debugLine="BeforeUpdate(mData)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_beforeupdate" /*RemoteObject*/ ,(Object)(_mdata));
 BA.debugLineNum = 2406;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _mostrarselficheroinputdialogitemcampo(RemoteObject __ref,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("MostrarSelFicheroInputDialogItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2972);
if (RapidSub.canDelegate("mostrarselficheroinputdialogitemcampo")) { __ref.runUserSub(false, "jamformregistro","mostrarselficheroinputdialogitemcampo", __ref, _idx); return;}
ResumableSub_MostrarSelFicheroInputDialogItemCampo rsub = new ResumableSub_MostrarSelFicheroInputDialogItemCampo(null,__ref,_idx);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarSelFicheroInputDialogItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarSelFicheroInputDialogItemCampo(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _idx;
RemoteObject _iv = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _btokdlg = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _btcanceldlg = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarSelFicheroInputDialogItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2972);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IDx", _idx);
 BA.debugLineNum = 2974;BA.debugLine="Dim iv As InfoCampoJamFormRegistro=clvCamposRegis";
Debug.JustUpdateDeviceLine();
_iv = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_idx)));Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 2976;BA.debugLine="Dialog.Title=\"Indica \" & iv.TituloCampo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Indica "),_iv.getField(true,"TituloCampo" /*RemoteObject*/ ))));
 BA.debugLineNum = 2977;BA.debugLine="InputTemplate.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2978;BA.debugLine="If FixNull(iv.ValorOutputCampo)<>\"\" And \"\"<>iv.Va";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",__ref.runClassMethod (b4j.docU.jamformregistro.class, "_fixnull" /*RemoteObject*/ ,(Object)(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ )))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2979;BA.debugLine="InputTemplate.Text=iv.ValorOutputCampo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ).setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ )));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2981;BA.debugLine="InputTemplate.lblTitle.Text=\"\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ).getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 2984;BA.debugLine="InputTemplate.mBase.Width = 0.9*frmReg.Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.9),__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0));
 BA.debugLineNum = 2986;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2987;BA.debugLine="Dim btOKDlg As B4XView=Dialog.GetButton(xui.Dialo";
Debug.JustUpdateDeviceLine();
_btokdlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btokdlg = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("btOKDlg", _btokdlg);Debug.locals.put("btOKDlg", _btokdlg);
 BA.debugLineNum = 2988;BA.debugLine="btOKDlg.TextSize=14";
Debug.JustUpdateDeviceLine();
_btokdlg.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 2989;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.D";
Debug.JustUpdateDeviceLine();
_btcanceldlg = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_btcanceldlg = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("btCancelDlg", _btcanceldlg);Debug.locals.put("btCancelDlg", _btcanceldlg);
 BA.debugLineNum = 2990;BA.debugLine="btCancelDlg.TextSize=14";
Debug.JustUpdateDeviceLine();
_btcanceldlg.runMethod(true,"setTextSize",BA.numberCast(double.class, 14));
 BA.debugLineNum = 2992;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "mostrarselficheroinputdialogitemcampo"), _rsub);
this.state = 9;
return;
case 9:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2993;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2994;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":IDx, \"clvIV\":";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Index")),(_idx),RemoteObject.createImmutable(("clvIV")),(_iv),RemoteObject.createImmutable(("ValorValidacion")),(__ref.getField(false,"_inputtemplate" /*RemoteObject*/ ).getField(true,"_text" /*RemoteObject*/ ))}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 2995;BA.debugLine="BeforeUpdate(mData)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_beforeupdate" /*RemoteObject*/ ,(Object)(_mdata));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 2997;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _mostrarselficheroitemcampo(RemoteObject __ref,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("MostrarSelFicheroItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2255);
if (RapidSub.canDelegate("mostrarselficheroitemcampo")) { __ref.runUserSub(false, "jamformregistro","mostrarselficheroitemcampo", __ref, _idx); return;}
ResumableSub_MostrarSelFicheroItemCampo rsub = new ResumableSub_MostrarSelFicheroItemCampo(null,__ref,_idx);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarSelFicheroItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarSelFicheroItemCampo(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _idx;
RemoteObject _iv = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _fch = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _ficherobasefullpath = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarSelFicheroItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2255);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IDx", _idx);
 BA.debugLineNum = 2258;BA.debugLine="Dim iv As InfoCampoJamFormRegistro=clvCamposRegis";
Debug.JustUpdateDeviceLine();
_iv = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_idx)));Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 2260;BA.debugLine="Dim fch As FileChooser";
Debug.JustUpdateDeviceLine();
_fch = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("fch", _fch);
 BA.debugLineNum = 2261;BA.debugLine="fch.Initialize";
Debug.JustUpdateDeviceLine();
_fch.runVoidMethod ("Initialize");
 BA.debugLineNum = 2263;BA.debugLine="fch.Title=\"Selecciona Fichero para el campo \" & i";
Debug.JustUpdateDeviceLine();
_fch.runMethod(true,"setTitle",RemoteObject.concat(RemoteObject.createImmutable("Selecciona Fichero para el campo "),_iv.getField(true,"TituloCampo" /*RemoteObject*/ )));
 BA.debugLineNum = 2268;BA.debugLine="If FixNull(iv.ValorOutputCampo)<>\"\" And \"\"<>iv.Va";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",__ref.runClassMethod (b4j.docU.jamformregistro.class, "_fixnull" /*RemoteObject*/ ,(Object)(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ )))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2270;BA.debugLine="fch.InitialDirectory=File.GetFileParent(iv.Valor";
Debug.JustUpdateDeviceLine();
_fch.runMethod(true,"setInitialDirectory",parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(BA.ObjectToString(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ )))));
 BA.debugLineNum = 2272;BA.debugLine="fch.InitialFileName=File.GetName(iv.ValorOutputC";
Debug.JustUpdateDeviceLine();
_fch.runMethod(true,"setInitialFileName",parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(BA.ObjectToString(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ )))));
 if (true) break;
;
 BA.debugLineNum = 2275;BA.debugLine="If FixNull(iv.ValorOutputCampo)<>\"\" Then";
Debug.JustUpdateDeviceLine();

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",__ref.runClassMethod (b4j.docU.jamformregistro.class, "_fixnull" /*RemoteObject*/ ,(Object)(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))),BA.ObjectToString(""))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2276;BA.debugLine="If File.Exists(File.GetFileParent(iv.ValorOutput";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(BA.ObjectToString(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))))),(Object)(RemoteObject.createImmutable(""))),parent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2277;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"NO existe";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("NO existe, o no se tiene acceso a la carpeta "),parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(BA.ObjectToString(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ )))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Continuar?"))),(Object)(BA.ObjectToString("Aviso")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2278;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "mostrarselficheroitemcampo"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 10;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2279;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.JustUpdateDeviceLine();
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
this.state = 16;
;
 BA.debugLineNum = 2280;BA.debugLine="fch.Initialize";
Debug.JustUpdateDeviceLine();
_fch.runVoidMethod ("Initialize");
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
 BA.debugLineNum = 2284;BA.debugLine="Dim FicheroBaseFullPath As String = fch.ShowOpen(";
Debug.JustUpdateDeviceLine();
_ficherobasefullpath = _fch.runMethodAndSync(true,"ShowOpen",(Object)(__ref.getField(false,"_frmreg" /*RemoteObject*/ )));Debug.locals.put("FicheroBaseFullPath", _ficherobasefullpath);Debug.locals.put("FicheroBaseFullPath", _ficherobasefullpath);
 BA.debugLineNum = 2286;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "mostrarselficheroitemcampo"),BA.numberCast(int.class, 0));
this.state = 31;
return;
case 31:
//C
this.state = 18;
;
 BA.debugLineNum = 2287;BA.debugLine="If FicheroBaseFullPath = \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 18:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_ficherobasefullpath,BA.ObjectToString(""))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 2288;BA.debugLine="If FixNull(iv.ValorOutputCampo)<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 21:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",__ref.runClassMethod (b4j.docU.jamformregistro.class, "_fixnull" /*RemoteObject*/ ,(Object)(_iv.getField(false,"ValorOutputCampo" /*RemoteObject*/ ))),BA.ObjectToString(""))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 2289;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"NO se ha";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("NO se ha seleccionado fichero. ¿Eliminar el enlace al fichero y grabar el campo en blanco?")),(Object)(BA.ObjectToString("Sin Fichero seleccionado")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2290;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "mostrarselficheroitemcampo"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2291;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 2292;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 27:
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
 BA.debugLineNum = 2310;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":IDx, \"clvIV\":i";
Debug.JustUpdateDeviceLine();
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Index")),(_idx),RemoteObject.createImmutable(("clvIV")),(_iv),RemoteObject.createImmutable(("ValorValidacion")),(_ficherobasefullpath)}));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 2311;BA.debugLine="BeforeUpdate(mData)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_beforeupdate" /*RemoteObject*/ ,(Object)(_mdata));
 BA.debugLineNum = 2312;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _mostrarselvalorextitemcampo(RemoteObject __ref,RemoteObject _idx) throws Exception{
try {
		Debug.PushSubsStack("MostrarSelValorExtItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2428);
if (RapidSub.canDelegate("mostrarselvalorextitemcampo")) { __ref.runUserSub(false, "jamformregistro","mostrarselvalorextitemcampo", __ref, _idx); return;}
ResumableSub_MostrarSelValorExtItemCampo rsub = new ResumableSub_MostrarSelValorExtItemCampo(null,__ref,_idx);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MostrarSelValorExtItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarSelValorExtItemCampo(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _idx;
RemoteObject _infocampojfr = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarSelValorExtItemCampo (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,2428);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IDx", _idx);
 BA.debugLineNum = 2429;BA.debugLine="Dim InfoCampojFR  As InfoCampoJamFormRegistro=clv";
Debug.JustUpdateDeviceLine();
_infocampojfr = (__ref.getField(false,"_clvcamposregistro" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_idx)));Debug.locals.put("InfoCampojFR", _infocampojfr);Debug.locals.put("InfoCampojFR", _infocampojfr);
 BA.debugLineNum = 2431;BA.debugLine="If SubExists(mCallBack,mEventName & \"_btnSelValor";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_btnSelValorExtItemCampo_Click")))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2433;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_btnSel";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_btnSelValorExtItemCampo_Click"))),(Object)((_infocampojfr)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2435;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay creada";
Debug.JustUpdateDeviceLine();
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay creada SUB "),__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_btnSelValorExtItemCampo_Click en el módulo CallBack."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador del sistema."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2436;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "mostrarselvalorextitemcampo"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2438;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _setclvscrollbars(RemoteObject __ref,RemoteObject _clv,RemoteObject _visible) throws Exception{
try {
		Debug.PushSubsStack("SetCLVScrollBars (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,332);
if (RapidSub.canDelegate("setclvscrollbars")) { return __ref.runUserSub(false, "jamformregistro","setclvscrollbars", __ref, _clv, _visible);}
RemoteObject _nsv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ScrollPaneWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("clv", _clv);
Debug.locals.put("Visible", _visible);
 BA.debugLineNum = 332;BA.debugLine="Sub SetCLVScrollBars(clv As CustomListView, Visibl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 333;BA.debugLine="Dim nsv As ScrollPane = clv.sv";
Debug.JustUpdateDeviceLine();
_nsv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
_nsv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ScrollPaneWrapper"), _clv.getField(false,"_sv").getObject());Debug.locals.put("nsv", _nsv);Debug.locals.put("nsv", _nsv);
 BA.debugLineNum = 334;BA.debugLine="If Visible Then";
Debug.JustUpdateDeviceLine();
if (_visible.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 335;BA.debugLine="nsv.SetVScrollVisibility(\"ALWAYS\")";
Debug.JustUpdateDeviceLine();
_nsv.runVoidMethod ("SetVScrollVisibility",(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.control.ScrollPane.ScrollBarPolicy"),RemoteObject.createImmutable("ALWAYS"))));
 }else {
 BA.debugLineNum = 337;BA.debugLine="nsv.SetVScrollVisibility(\"NEVER\")";
Debug.JustUpdateDeviceLine();
_nsv.runVoidMethod ("SetVScrollVisibility",(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.control.ScrollPane.ScrollBarPolicy"),RemoteObject.createImmutable("NEVER"))));
 };
 BA.debugLineNum = 339;BA.debugLine="Dim jo As JavaObject = clv 'ignore";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _clv);Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 340;BA.debugLine="jo.SetField(\"_scrollbarsvisible\", Visible)";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("SetField",(Object)(BA.ObjectToString("_scrollbarsvisible")),(Object)((_visible)));
 BA.debugLineNum = 341;BA.debugLine="clv.Base_Resize(clv.AsView.Width, clv.AsView.Heig";
Debug.JustUpdateDeviceLine();
_clv.runVoidMethod ("_base_resize",(Object)(_clv.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(_clv.runMethod(false,"_asview").runMethod(true,"getHeight")));
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteventslistener(RemoteObject __ref,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("SetEventsListener (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("seteventslistener")) { return __ref.runUserSub(false, "jamformregistro","seteventslistener", __ref, _callback, _eventname);}
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 197;BA.debugLine="Public Sub SetEventsListener(Callback As Object, E";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 198;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 199;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setformincenter(RemoteObject __ref,RemoteObject _parent,RemoteObject _form) throws Exception{
try {
		Debug.PushSubsStack("SetFormInCenter (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("setformincenter")) { return __ref.runUserSub(false, "jamformregistro","setformincenter", __ref, _parent, _form);}
Debug.locals.put("Parent", _parent);
Debug.locals.put("Form", _form);
 BA.debugLineNum = 319;BA.debugLine="private Sub SetFormInCenter(Parent As Form, Form A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 320;BA.debugLine="Form.WindowTop = Parent.WindowTop + (Parent.Windo";
Debug.JustUpdateDeviceLine();
_form.runMethod(true,"setWindowTop",RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWindowTop"),(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWindowHeight"),_form.runMethod(true,"getWindowHeight")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "+/",1, 0));
 BA.debugLineNum = 321;BA.debugLine="Form.WindowLeft = Parent.WindowLeft + (Parent.Win";
Debug.JustUpdateDeviceLine();
_form.runMethod(true,"setWindowLeft",RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWindowLeft"),(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getWindowWidth"),_form.runMethod(true,"getWindowWidth")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "+/",1, 0));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setjsoncampos(RemoteObject __ref,RemoteObject _nombreficherojson) throws Exception{
try {
		Debug.PushSubsStack("SetJSONCampos (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,579);
if (RapidSub.canDelegate("setjsoncampos")) { return __ref.runUserSub(false, "jamformregistro","setjsoncampos", __ref, _nombreficherojson);}
ResumableSub_SetJSONCampos rsub = new ResumableSub_SetJSONCampos(null,__ref,_nombreficherojson);
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
public static class ResumableSub_SetJSONCampos extends BA.ResumableSub {
public ResumableSub_SetJSONCampos(b4j.docU.jamformregistro parent,RemoteObject __ref,RemoteObject _nombreficherojson) {
this.parent = parent;
this.__ref = __ref;
this._nombreficherojson = _nombreficherojson;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamformregistro parent;
RemoteObject _nombreficherojson;
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ficherojson = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _mjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _colitemsimparesjson = RemoteObject.createImmutable(0);
RemoteObject _colitemsparesjson = RemoteObject.createImmutable(0);
RemoteObject _lstitemsfromstring = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstnombrescamposjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstcontrolesindependientes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _modificacionendatosjson = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _idxorden = RemoteObject.createImmutable(0);
RemoteObject _lstidxeliminar = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _campojson = RemoteObject.createImmutable("");
RemoteObject _flagcampojsonok = RemoteObject.createImmutable(false);
RemoteObject _infocampojfr = RemoteObject.declareNull("b4j.docU.jamformregistro._infocampojamformregistro");
RemoteObject _mextras = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idxjsonnok = RemoteObject.createImmutable(0);
RemoteObject _idxdel = RemoteObject.createImmutable(0);
RemoteObject _numcamposenformulario = RemoteObject.createImmutable(0);
RemoteObject _flagtodoscamposmysqlok = RemoteObject.createImmutable(false);
RemoteObject _tipodatomysqljson = RemoteObject.createImmutable("");
RemoteObject _nonulojson = RemoteObject.createImmutable(false);
RemoteObject _primarykeyjson = RemoteObject.createImmutable(false);
RemoteObject _autoincrementaljson = RemoteObject.createImmutable(false);
RemoteObject _valorcampopordefectojson = RemoteObject.createImmutable("");
RemoteObject _lstvaloresdatosaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstparams = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _campoobligatoriocumplimentar = RemoteObject.createImmutable(false);
RemoteObject _mdimscreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _frmh = RemoteObject.createImmutable(0);
RemoteObject group41;
int index41;
int groupLen41;
RemoteObject group65;
int index65;
int groupLen65;
RemoteObject group83;
int index83;
int groupLen83;
RemoteObject group88;
int index88;
int groupLen88;
RemoteObject group94;
int index94;
int groupLen94;
RemoteObject group160;
int index160;
int groupLen160;
RemoteObject group176;
int index176;
int groupLen176;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetJSONCampos (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,579);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("NombreFicheroJSON", _nombreficherojson);
 BA.debugLineNum = 580;BA.debugLine="Dim mResult As Map";
Debug.JustUpdateDeviceLine();
_mresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mResult", _mresult);
 BA.debugLineNum = 581;BA.debugLine="mResult.Initialize";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 582;BA.debugLine="mResult.Put(\"FlagOK\",True)";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FlagOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 585;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 586;BA.debugLine="Dim FicheroJSON As String=File.ReadString(File.D";
Debug.JustUpdateDeviceLine();
_ficherojson = parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_nombreficherojson));Debug.locals.put("FicheroJSON", _ficherojson);Debug.locals.put("FicheroJSON", _ficherojson);
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 588;BA.debugLine="mResult.Put(\"FlagOK\",False)";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FlagOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 589;BA.debugLine="mResult.Put(\"msgError\",\"Fichero no encontrado \"";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("msgError"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Fichero no encontrado "),_nombreficherojson))));
 BA.debugLineNum = 590;BA.debugLine="Return mResult";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 if (true) break;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 0;
;
 BA.debugLineNum = 593;BA.debugLine="Dim p As JSONParser";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("p", _p);
 BA.debugLineNum = 594;BA.debugLine="p.Initialize(FicheroJSON)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("Initialize",(Object)(_ficherojson));
 BA.debugLineNum = 595;BA.debugLine="Dim mJSON As Map = p.NextObject";
Debug.JustUpdateDeviceLine();
_mjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mjson = _p.runMethod(false,"NextObject");Debug.locals.put("mJSON", _mjson);Debug.locals.put("mJSON", _mjson);
 BA.debugLineNum = 597;BA.debugLine="DatosOrigenDatosFormRegistro=CreateTipoOrigenDato";
Debug.JustUpdateDeviceLine();
__ref.setField ("_datosorigendatosformregistro" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.jamformregistro.class, "_createtipoorigendatos" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IpJRDC")))))),(Object)(BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PuertoJRDC")))))),(Object)(BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreTabla")))))),(Object)(BA.ObjectToString(_mjson.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("DBMS"))),(Object)((RemoteObject.createImmutable("MySQL"))))))));
 BA.debugLineNum = 599;BA.debugLine="Select DatosOrigenDatosFormRegistro.DBMS";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//select
this.state = 12;
switch (BA.switchObjectToInt(__ref.getField(false,"_datosorigendatosformregistro" /*RemoteObject*/ ).getField(true,"DBMS" /*RemoteObject*/ ),BA.ObjectToString("MySQL"),BA.ObjectToString("SQLServer"))) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 604;BA.debugLine="WAIT FOR (CargaCamposJRDCMySQL(DatosOrigenDato";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "setjsoncampos"), __ref.runClassMethod (b4j.docU.jamformregistro.class, "_cargacamposjrdcmysql" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_datosorigendatosformregistro" /*RemoteObject*/ ).getField(true,"IpJRDC" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, __ref.getField(false,"_datosorigendatosformregistro" /*RemoteObject*/ ).getField(true,"PuertoJRDC" /*RemoteObject*/ ))),(Object)(__ref.getField(false,"_datosorigendatosformregistro" /*RemoteObject*/ ).getField(true,"NombreTabla" /*RemoteObject*/ ))));
this.state = 123;
return;
case 123:
//C
this.state = 12;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 607;BA.debugLine="WAIT FOR (CargaCamposJRDCSQLServer(DatosOrigenD";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamformregistro", "setjsoncampos"), __ref.runClassMethod (b4j.docU.jamformregistro.class, "_cargacamposjrdcsqlserver" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_datosorigendatosformregistro" /*RemoteObject*/ ).getField(true,"IpJRDC" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, __ref.getField(false,"_datosorigendatosformregistro" /*RemoteObject*/ ).getField(true,"PuertoJRDC" /*RemoteObject*/ ))),(Object)(__ref.getField(false,"_datosorigendatosformregistro" /*RemoteObject*/ ).getField(true,"NombreTabla" /*RemoteObject*/ ))));
this.state = 124;
return;
case 124:
//C
this.state = 12;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
;
 if (true) break;
;
 BA.debugLineNum = 611;BA.debugLine="If Accion<>\"OK\" Then";
Debug.JustUpdateDeviceLine();

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 612;BA.debugLine="mResult.Put(\"FlagOK\",False)";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FlagOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 613;BA.debugLine="mResult.Put(\"msgError\",\"Error query/servidor Car";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("msgError"))),(Object)((RemoteObject.createImmutable("Error query/servidor CargaCamposJRDC"))));
 BA.debugLineNum = 614;BA.debugLine="Return mResult";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 619;BA.debugLine="Dim ColItemsImparesJSON, ColItemsParesJSON As Int";
Debug.JustUpdateDeviceLine();
_colitemsimparesjson = RemoteObject.createImmutable(0);Debug.locals.put("ColItemsImparesJSON", _colitemsimparesjson);
_colitemsparesjson = RemoteObject.createImmutable(0);Debug.locals.put("ColItemsParesJSON", _colitemsparesjson);
 BA.debugLineNum = 620;BA.debugLine="ColItemsImparesJSON=mJSON.Getdefault(\"ColorItemsI";
Debug.JustUpdateDeviceLine();
_colitemsimparesjson = BA.numberCast(int.class, _mjson.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorItemsImpares"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("ColItemsImparesJSON", _colitemsimparesjson);
 BA.debugLineNum = 621;BA.debugLine="ColItemsParesJSON=mJSON.Getdefault(\"ColorItemsPar";
Debug.JustUpdateDeviceLine();
_colitemsparesjson = BA.numberCast(int.class, _mjson.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ColorItemsPares"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("ColItemsParesJSON", _colitemsparesjson);
 BA.debugLineNum = 623;BA.debugLine="If ColItemsImparesJSON<>-1 Then ColItemsImpares=C";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("!",_colitemsimparesjson,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
__ref.setField ("_colitemsimpares" /*RemoteObject*/ ,_colitemsimparesjson);
if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 624;BA.debugLine="If ColItemsParesJSON<>-1 Then ColItemsPares=ColIt";
Debug.JustUpdateDeviceLine();
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("!",_colitemsparesjson,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
__ref.setField ("_colitemspares" /*RemoteObject*/ ,_colitemsparesjson);
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 627;BA.debugLine="Dim lstItemsFromString As List=mJSON.Get(\"Items\")";
Debug.JustUpdateDeviceLine();
_lstitemsfromstring = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstitemsfromstring = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Items")))));Debug.locals.put("lstItemsFromString", _lstitemsfromstring);Debug.locals.put("lstItemsFromString", _lstitemsfromstring);
 BA.debugLineNum = 628;BA.debugLine="Dim lstNombresCamposJSON As List";
Debug.JustUpdateDeviceLine();
_lstnombrescamposjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNombresCamposJSON", _lstnombrescamposjson);
 BA.debugLineNum = 629;BA.debugLine="lstNombresCamposJSON.Initialize";
Debug.JustUpdateDeviceLine();
_lstnombrescamposjson.runVoidMethod ("Initialize");
 BA.debugLineNum = 631;BA.debugLine="Dim lstControlesIndependientes As List";
Debug.JustUpdateDeviceLine();
_lstcontrolesindependientes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstControlesIndependientes", _lstcontrolesindependientes);
 BA.debugLineNum = 632;BA.debugLine="lstControlesIndependientes.Initialize";
Debug.JustUpdateDeviceLine();
_lstcontrolesindependientes.runVoidMethod ("Initialize");
 BA.debugLineNum = 636;BA.debugLine="Dim ModificacionEnDatosJSON As StringBuilder";
Debug.JustUpdateDeviceLine();
_modificacionendatosjson = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("ModificacionEnDatosJSON", _modificacionendatosjson);
 BA.debugLineNum = 637;BA.debugLine="ModificacionEnDatosJSON.Initialize";
Debug.JustUpdateDeviceLine();
_modificacionendatosjson.runVoidMethod ("Initialize");
 BA.debugLineNum = 646;BA.debugLine="Dim IDxOrden As Int";
Debug.JustUpdateDeviceLine();
_idxorden = RemoteObject.createImmutable(0);Debug.locals.put("IDxOrden", _idxorden);
 BA.debugLineNum = 647;BA.debugLine="Dim lstIdxEliminar As List";
Debug.JustUpdateDeviceLine();
_lstidxeliminar = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstIdxEliminar", _lstidxeliminar);
 BA.debugLineNum = 648;BA.debugLine="lstIdxEliminar.Initialize";
Debug.JustUpdateDeviceLine();
_lstidxeliminar.runVoidMethod ("Initialize");
 BA.debugLineNum = 649;BA.debugLine="For Each mJSON As Map In lstItemsFromString";
Debug.JustUpdateDeviceLine();
if (true) break;

case 28:
//for
this.state = 50;
_mjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group41 = _lstitemsfromstring;
index41 = 0;
groupLen41 = group41.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mJSON", _mjson);
this.state = 125;
if (true) break;

case 125:
//C
this.state = 50;
if (index41 < groupLen41) {
this.state = 30;
_mjson = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group41.runMethod(false,"Get",index41));Debug.locals.put("mJSON", _mjson);}
if (true) break;

case 126:
//C
this.state = 125;
index41++;
Debug.locals.put("mJSON", _mjson);
if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 650;BA.debugLine="Dim CampoJSON As String=mJSON.Get(\"Campo\")";
Debug.JustUpdateDeviceLine();
_campojson = BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Campo")))));Debug.locals.put("CampoJSON", _campojson);Debug.locals.put("CampoJSON", _campojson);
 BA.debugLineNum = 651;BA.debugLine="Dim FlagCampoJsonOK As Boolean=False";
Debug.JustUpdateDeviceLine();
_flagcampojsonok = parent.__c.getField(true,"False");Debug.locals.put("FlagCampoJsonOK", _flagcampojsonok);Debug.locals.put("FlagCampoJsonOK", _flagcampojsonok);
 BA.debugLineNum = 652;BA.debugLine="If True=mJSON.Getdefault(\"ControlIndependiente\",";
Debug.JustUpdateDeviceLine();
if (true) break;

case 31:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mjson.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ControlIndependiente"))),(Object)((parent.__c.getField(true,"False"))))))) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 49;
 BA.debugLineNum = 653;BA.debugLine="FlagCampoJsonOK=True";
Debug.JustUpdateDeviceLine();
_flagcampojsonok = parent.__c.getField(true,"True");Debug.locals.put("FlagCampoJsonOK", _flagcampojsonok);
 BA.debugLineNum = 654;BA.debugLine="Dim InfoCampojFR As InfoCampoJamFormRegistro";
Debug.JustUpdateDeviceLine();
_infocampojfr = RemoteObject.createNew ("b4j.docU.jamformregistro._infocampojamformregistro");Debug.locals.put("InfoCampojFR", _infocampojfr);
 BA.debugLineNum = 656;BA.debugLine="InfoCampojFR.CampoSQL=CampoJSON";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("CampoSQL" /*RemoteObject*/ ,_campojson);
 BA.debugLineNum = 657;BA.debugLine="InfoCampojFR.TituloCampo=mJSON.Get(\"TituloCampo";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TituloCampo" /*RemoteObject*/ ,BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TituloCampo"))))));
 BA.debugLineNum = 659;BA.debugLine="InfoCampojFR.TipoDatoSQL=mJSON.Get(\"TipoDatoSQL";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoDatoSQL" /*RemoteObject*/ ,BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoDatoSQL"))))));
 BA.debugLineNum = 661;BA.debugLine="InfoCampojFR.NoNuloSQL=mJSON.Get(\"NoNulo\")";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("NoNuloSQL" /*RemoteObject*/ ,BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NoNulo"))))));
 BA.debugLineNum = 662;BA.debugLine="InfoCampojFR.PrimaryKeySQL=mJSON.Get(\"PrimaryKe";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("PrimaryKeySQL" /*RemoteObject*/ ,BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrimaryKey"))))));
 BA.debugLineNum = 663;BA.debugLine="InfoCampojFR.AutoIncrementalSQL=mJSON.Get(\"Auto";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("AutoIncrementalSQL" /*RemoteObject*/ ,BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AutoIncremental"))))));
 BA.debugLineNum = 664;BA.debugLine="InfoCampojFR.ValorCampoPorDefectoSQL=mJSON.Get(";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorCampoPorDefectoSQL" /*RemoteObject*/ ,_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ValorCampoPorDefecto")))));
 BA.debugLineNum = 666;BA.debugLine="InfoCampojFR.TipoControl=mJSON.Get(\"TipoControl";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoControl" /*RemoteObject*/ ,BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoControl"))))));
 BA.debugLineNum = 667;BA.debugLine="InfoCampojFR.ControlEditable=mJSON.Get(\"Control";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ControlEditable" /*RemoteObject*/ ,BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ControlEditable"))))));
 BA.debugLineNum = 668;BA.debugLine="InfoCampojFR.EsFecha=mJSON.Get(\"EsFecha\")";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("EsFecha" /*RemoteObject*/ ,BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EsFecha"))))));
 BA.debugLineNum = 669;BA.debugLine="InfoCampojFR.InfoCampo=mJSON.Get(\"InfoCampo\")";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("InfoCampo" /*RemoteObject*/ ,BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("InfoCampo"))))));
 BA.debugLineNum = 670;BA.debugLine="Dim mExtras As Map=mJSON.Getdefault(\"Extras\",\"\"";
Debug.JustUpdateDeviceLine();
_mextras = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mextras = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mjson.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Extras"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("mExtras", _mextras);Debug.locals.put("mExtras", _mextras);
 BA.debugLineNum = 671;BA.debugLine="InfoCampojFR.TipoDatosAux=\"\"";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoDatosAux" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 672;BA.debugLine="InfoCampojFR.OrdenCampo=IDxOrden";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("OrdenCampo" /*RemoteObject*/ ,_idxorden);
 BA.debugLineNum = 674;BA.debugLine="lstControlesIndependientes.Add(InfoCampojFR)";
Debug.JustUpdateDeviceLine();
_lstcontrolesindependientes.runVoidMethod ("Add",(Object)((_infocampojfr)));
 BA.debugLineNum = 675;BA.debugLine="lstNombresCamposJSON.Add(CampoJSON)";
Debug.JustUpdateDeviceLine();
_lstnombrescamposjson.runVoidMethod ("Add",(Object)((_campojson)));
 BA.debugLineNum = 676;BA.debugLine="IDxOrden=IDxOrden+1";
Debug.JustUpdateDeviceLine();
_idxorden = RemoteObject.solve(new RemoteObject[] {_idxorden,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("IDxOrden", _idxorden);
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 679;BA.debugLine="For Each InfoCampojFR As InfoCampoJamFormRegist";
Debug.JustUpdateDeviceLine();
if (true) break;

case 36:
//for
this.state = 43;
group65 = __ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ );
index65 = 0;
groupLen65 = group65.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("InfoCampojFR", _infocampojfr);
this.state = 127;
if (true) break;

case 127:
//C
this.state = 43;
if (index65 < groupLen65) {
this.state = 38;
_infocampojfr = (group65.runMethod(false,"Get",index65));Debug.locals.put("InfoCampojFR", _infocampojfr);}
if (true) break;

case 128:
//C
this.state = 127;
index65++;
Debug.locals.put("InfoCampojFR", _infocampojfr);
if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 683;BA.debugLine="If CampoJSON=InfoCampojFR.CampoSQL Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 39:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_campojson,_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ ))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 684;BA.debugLine="FlagCampoJsonOK=True";
Debug.JustUpdateDeviceLine();
_flagcampojsonok = parent.__c.getField(true,"True");Debug.locals.put("FlagCampoJsonOK", _flagcampojsonok);
 BA.debugLineNum = 685;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 43;
if (true) break;
 if (true) break;

case 42:
//C
this.state = 128;
;
 if (true) break;
if (true) break;
Debug.locals.put("InfoCampojFR", _infocampojfr);
;
 BA.debugLineNum = 689;BA.debugLine="If FlagCampoJsonOK=False Then";
Debug.JustUpdateDeviceLine();

case 43:
//if
this.state = 48;
if (RemoteObject.solveBoolean("=",_flagcampojsonok,parent.__c.getField(true,"False"))) { 
this.state = 45;
}else {
this.state = 47;
}if (true) break;

case 45:
//C
this.state = 48;
 BA.debugLineNum = 690;BA.debugLine="Dim idXJSONNok As Int=lstItemsFromString.Index";
Debug.JustUpdateDeviceLine();
_idxjsonnok = _lstitemsfromstring.runMethod(true,"IndexOf",(Object)((_mjson.getObject())));Debug.locals.put("idXJSONNok", _idxjsonnok);Debug.locals.put("idXJSONNok", _idxjsonnok);
 BA.debugLineNum = 691;BA.debugLine="Log(\"se elimina Campo \" & CampoJSON & \" por no";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9125304944",RemoteObject.concat(RemoteObject.createImmutable("se elimina Campo "),_campojson,RemoteObject.createImmutable(" por no existir en tabla MySQL, index "),_idxjsonnok),0);
 BA.debugLineNum = 693;BA.debugLine="lstIdxEliminar.Add(idXJSONNok)";
Debug.JustUpdateDeviceLine();
_lstidxeliminar.runVoidMethod ("Add",(Object)((_idxjsonnok)));
 BA.debugLineNum = 694;BA.debugLine="ModificacionEnDatosJSON.Append(\"Campo JSON \" &";
Debug.JustUpdateDeviceLine();
_modificacionendatosjson.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Campo JSON "),_campojson,RemoteObject.createImmutable("se elimina, por no existir en tabla MySQL")))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 696;BA.debugLine="InfoCampojFR.OrdenCampo=IDxOrden";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("OrdenCampo" /*RemoteObject*/ ,_idxorden);
 BA.debugLineNum = 697;BA.debugLine="lstNombresCamposJSON.Add(CampoJSON)";
Debug.JustUpdateDeviceLine();
_lstnombrescamposjson.runVoidMethod ("Add",(Object)((_campojson)));
 BA.debugLineNum = 698;BA.debugLine="IDxOrden=IDxOrden+1";
Debug.JustUpdateDeviceLine();
_idxorden = RemoteObject.solve(new RemoteObject[] {_idxorden,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("IDxOrden", _idxorden);
 if (true) break;

case 48:
//C
this.state = 49;
;
 if (true) break;

case 49:
//C
this.state = 126;
;
 if (true) break;
if (true) break;
Debug.locals.put("mJSON", _mjson);
;
 BA.debugLineNum = 704;BA.debugLine="For Each IDxDel As Int In lstIdxEliminar";
Debug.JustUpdateDeviceLine();

case 50:
//for
this.state = 53;
group83 = _lstidxeliminar;
index83 = 0;
groupLen83 = group83.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("IDxDel", _idxdel);
this.state = 129;
if (true) break;

case 129:
//C
this.state = 53;
if (index83 < groupLen83) {
this.state = 52;
_idxdel = BA.numberCast(int.class, group83.runMethod(false,"Get",index83));Debug.locals.put("IDxDel", _idxdel);}
if (true) break;

case 130:
//C
this.state = 129;
index83++;
Debug.locals.put("IDxDel", _idxdel);
if (true) break;

case 52:
//C
this.state = 130;
 BA.debugLineNum = 705;BA.debugLine="lstItemsFromString.RemoveAt(IDxDel)";
Debug.JustUpdateDeviceLine();
_lstitemsfromstring.runVoidMethod ("RemoveAt",(Object)(_idxdel));
 if (true) break;
if (true) break;

case 53:
//C
this.state = 54;
Debug.locals.put("IDxDel", _idxdel);
;
 BA.debugLineNum = 716;BA.debugLine="Dim NumCamposEnFormulario As Int";
Debug.JustUpdateDeviceLine();
_numcamposenformulario = RemoteObject.createImmutable(0);Debug.locals.put("NumCamposEnFormulario", _numcamposenformulario);
 BA.debugLineNum = 717;BA.debugLine="Dim FlagTodosCamposMySQLOK As Boolean=True";
Debug.JustUpdateDeviceLine();
_flagtodoscamposmysqlok = parent.__c.getField(true,"True");Debug.locals.put("FlagTodosCamposMySQLOK", _flagtodoscamposmysqlok);Debug.locals.put("FlagTodosCamposMySQLOK", _flagtodoscamposmysqlok);
 BA.debugLineNum = 719;BA.debugLine="For Each InfoCampojFR As InfoCampoJamFormRegistro";
Debug.JustUpdateDeviceLine();
if (true) break;

case 54:
//for
this.state = 116;
group88 = __ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ );
index88 = 0;
groupLen88 = group88.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("InfoCampojFR", _infocampojfr);
this.state = 131;
if (true) break;

case 131:
//C
this.state = 116;
if (index88 < groupLen88) {
this.state = 56;
_infocampojfr = (group88.runMethod(false,"Get",index88));Debug.locals.put("InfoCampojFR", _infocampojfr);}
if (true) break;

case 132:
//C
this.state = 131;
index88++;
Debug.locals.put("InfoCampojFR", _infocampojfr);
if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 725;BA.debugLine="If lstNombresCamposJSON.IndexOf(InfoCampojFR.Cam";
Debug.JustUpdateDeviceLine();
if (true) break;

case 57:
//if
this.state = 60;
if (RemoteObject.solveBoolean("=",_lstnombrescamposjson.runMethod(true,"IndexOf",(Object)((_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ )))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 726;BA.debugLine="InfoCampojFR.TipoControl=\"\"";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoControl" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 727;BA.debugLine="Continue ' pasamos al siguiente campo MySQL";
Debug.JustUpdateDeviceLine();
this.state = 132;
if (true) break;;
 if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 741;BA.debugLine="Dim FlagCampoJsonOK As Boolean=False";
Debug.JustUpdateDeviceLine();
_flagcampojsonok = parent.__c.getField(true,"False");Debug.locals.put("FlagCampoJsonOK", _flagcampojsonok);Debug.locals.put("FlagCampoJsonOK", _flagcampojsonok);
 BA.debugLineNum = 744;BA.debugLine="For Each mJSON As Map In lstItemsFromString";
Debug.JustUpdateDeviceLine();
if (true) break;

case 61:
//for
this.state = 99;
_mjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group94 = _lstitemsfromstring;
index94 = 0;
groupLen94 = group94.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mJSON", _mjson);
this.state = 133;
if (true) break;

case 133:
//C
this.state = 99;
if (index94 < groupLen94) {
this.state = 63;
_mjson = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group94.runMethod(false,"Get",index94));Debug.locals.put("mJSON", _mjson);}
if (true) break;

case 134:
//C
this.state = 133;
index94++;
Debug.locals.put("mJSON", _mjson);
if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 746;BA.debugLine="Dim CampoJSON As String=mJSON.Get(\"Campo\")";
Debug.JustUpdateDeviceLine();
_campojson = BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Campo")))));Debug.locals.put("CampoJSON", _campojson);Debug.locals.put("CampoJSON", _campojson);
 BA.debugLineNum = 748;BA.debugLine="If CampoJSON=InfoCampojFR.CampoSQL Then  ' el c";
Debug.JustUpdateDeviceLine();
if (true) break;

case 64:
//if
this.state = 98;
if (RemoteObject.solveBoolean("=",_campojson,_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ ))) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
 BA.debugLineNum = 750;BA.debugLine="Dim TipoDatoMySQLJSON As String=mJSON.Get(\"Tip";
Debug.JustUpdateDeviceLine();
_tipodatomysqljson = BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoDatoMySQL")))));Debug.locals.put("TipoDatoMySQLJSON", _tipodatomysqljson);Debug.locals.put("TipoDatoMySQLJSON", _tipodatomysqljson);
 BA.debugLineNum = 751;BA.debugLine="Dim NoNuloJSON As Boolean=mJSON.Get(\"NoNulo\")";
Debug.JustUpdateDeviceLine();
_nonulojson = BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NoNulo")))));Debug.locals.put("NoNuloJSON", _nonulojson);Debug.locals.put("NoNuloJSON", _nonulojson);
 BA.debugLineNum = 752;BA.debugLine="Dim PrimaryKeyJSON As Boolean=mJSON.Get(\"Prima";
Debug.JustUpdateDeviceLine();
_primarykeyjson = BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrimaryKey")))));Debug.locals.put("PrimaryKeyJSON", _primarykeyjson);Debug.locals.put("PrimaryKeyJSON", _primarykeyjson);
 BA.debugLineNum = 753;BA.debugLine="Dim AutoIncrementalJSON As Boolean=mJSON.Get(\"";
Debug.JustUpdateDeviceLine();
_autoincrementaljson = BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AutoIncremental")))));Debug.locals.put("AutoIncrementalJSON", _autoincrementaljson);Debug.locals.put("AutoIncrementalJSON", _autoincrementaljson);
 BA.debugLineNum = 754;BA.debugLine="Dim ValorCampoPorDefectoJSON As String=mJSON.G";
Debug.JustUpdateDeviceLine();
_valorcampopordefectojson = BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ValorCampoPorDefecto")))));Debug.locals.put("ValorCampoPorDefectoJSON", _valorcampopordefectojson);Debug.locals.put("ValorCampoPorDefectoJSON", _valorcampopordefectojson);
 BA.debugLineNum = 758;BA.debugLine="If TipoDatoMySQLJSON=InfoCampojFR.TipoDatoSQL";
Debug.JustUpdateDeviceLine();
if (true) break;

case 67:
//if
this.state = 97;
if (RemoteObject.solveBoolean("=",_tipodatomysqljson,_infocampojfr.getField(true,"TipoDatoSQL" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_nonulojson,_infocampojfr.getField(true,"NoNuloSQL" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_primarykeyjson,_infocampojfr.getField(true,"PrimaryKeySQL" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_autoincrementaljson,_infocampojfr.getField(true,"AutoIncrementalSQL" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_valorcampopordefectojson,BA.ObjectToString(_infocampojfr.getField(false,"ValorCampoPorDefectoSQL" /*RemoteObject*/ )))) { 
this.state = 69;
}else {
this.state = 96;
}if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 760;BA.debugLine="FlagCampoJsonOK=True   ' si todos los valores";
Debug.JustUpdateDeviceLine();
_flagcampojsonok = parent.__c.getField(true,"True");Debug.locals.put("FlagCampoJsonOK", _flagcampojsonok);
 BA.debugLineNum = 762;BA.debugLine="InfoCampojFR.TipoControl=mJSON.Get(\"TipoContr";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoControl" /*RemoteObject*/ ,BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoControl"))))));
 BA.debugLineNum = 763;BA.debugLine="InfoCampojFR.ControlEditable=mJSON.Get(\"Contr";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ControlEditable" /*RemoteObject*/ ,BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ControlEditable"))))));
 BA.debugLineNum = 764;BA.debugLine="InfoCampojFR.EsFecha=mJSON.Get(\"EsFecha\")";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("EsFecha" /*RemoteObject*/ ,BA.ObjectToBoolean(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EsFecha"))))));
 BA.debugLineNum = 765;BA.debugLine="InfoCampojFR.InfoCampo=mJSON.Get(\"InfoCampo\")";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("InfoCampo" /*RemoteObject*/ ,BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("InfoCampo"))))));
 BA.debugLineNum = 766;BA.debugLine="InfoCampojFR.TituloCampo=mJSON.Get(\"TituloCam";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TituloCampo" /*RemoteObject*/ ,BA.ObjectToString(_mjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TituloCampo"))))));
 BA.debugLineNum = 767;BA.debugLine="Dim mExtras As Map=mJSON.Getdefault(\"Extras\",";
Debug.JustUpdateDeviceLine();
_mextras = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mextras = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mjson.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Extras"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("mExtras", _mextras);Debug.locals.put("mExtras", _mextras);
 BA.debugLineNum = 770;BA.debugLine="InfoCampojFR.TipoDatosAux=mExtras.GetDefault(";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("TipoDatosAux" /*RemoteObject*/ ,BA.ObjectToString(_mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("TipoDatosAux"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 771;BA.debugLine="Dim lstValoresDatosAux As List";
Debug.JustUpdateDeviceLine();
_lstvaloresdatosaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstValoresDatosAux", _lstvaloresdatosaux);
 BA.debugLineNum = 772;BA.debugLine="lstValoresDatosAux.Initialize";
Debug.JustUpdateDeviceLine();
_lstvaloresdatosaux.runVoidMethod ("Initialize");
 BA.debugLineNum = 773;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Lista\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 70:
//if
this.state = 77;
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoDatosAux" /*RemoteObject*/ ),BA.ObjectToString("Lista"))) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 774;BA.debugLine="If mExtras.GetDefault(\"ListaValoresDatosAux\"";
Debug.JustUpdateDeviceLine();
if (true) break;

case 73:
//if
this.state = 76;
if (RemoteObject.solveBoolean("=",_mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ListaValoresDatosAux"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 775;BA.debugLine="mResult.Put(\"FlagOK\",False)";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FlagOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 776;BA.debugLine="mResult.Put(\"msgError\",\"Error, La lista de";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("msgError"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error, La lista de valores aux del campo "),_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ ),RemoteObject.createImmutable(" está vacia")))));
 BA.debugLineNum = 777;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 99;
if (true) break;
 if (true) break;

case 76:
//C
this.state = 77;
;
 BA.debugLineNum = 779;BA.debugLine="lstValoresDatosAux=Regex.Split(\";\",mExtras.G";
Debug.JustUpdateDeviceLine();
_lstvaloresdatosaux = parent.__c.runMethod(false, "ArrayToList", (Object)(parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(";")),(Object)(BA.ObjectToString(_mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ListaValoresDatosAux"))),(Object)((RemoteObject.createImmutable("")))))))));Debug.locals.put("lstValoresDatosAux", _lstvaloresdatosaux);
 if (true) break;

case 77:
//C
this.state = 78;
;
 BA.debugLineNum = 781;BA.debugLine="InfoCampojFR.ListaValoresDatosAux=lstValoresD";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ListaValoresDatosAux" /*RemoteObject*/ ,_lstvaloresdatosaux);
 BA.debugLineNum = 783;BA.debugLine="InfoCampojFR.IPJrdcOrigenDatosAux=mExtras.Get";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("IPJrdcOrigenDatosAux" /*RemoteObject*/ ,BA.ObjectToString(_mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("IPJrdcOrigenDatosAux"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 784;BA.debugLine="InfoCampojFR.PuertoJrdcOrigenDatosAux=mExtras";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("PuertoJrdcOrigenDatosAux" /*RemoteObject*/ ,BA.ObjectToString(_mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("PuertoJrdcOrigenDatosAux"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 785;BA.debugLine="InfoCampojFR.ComandoConfigDatosAux=mExtras.Ge";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ComandoConfigDatosAux" /*RemoteObject*/ ,BA.ObjectToString(_mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ComandoConfigDatosAux"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 787;BA.debugLine="Dim lstParams As List";
Debug.JustUpdateDeviceLine();
_lstparams = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstParams", _lstparams);
 BA.debugLineNum = 788;BA.debugLine="lstParams.Initialize";
Debug.JustUpdateDeviceLine();
_lstparams.runVoidMethod ("Initialize");
 BA.debugLineNum = 789;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Consulta\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 78:
//if
this.state = 94;
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"TipoDatosAux" /*RemoteObject*/ ),BA.ObjectToString("Consulta"))) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 791;BA.debugLine="If InfoCampojFR.IPJrdcOrigenDatosAux=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 81:
//if
this.state = 84;
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"IPJrdcOrigenDatosAux" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
 BA.debugLineNum = 792;BA.debugLine="mResult.Put(\"FlagOK\",False)";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FlagOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 793;BA.debugLine="mResult.Put(\"msgError\",\"Error, El IPJrdcOri";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("msgError"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error, El IPJrdcOrigenDatosAux del campo "),_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ ),RemoteObject.createImmutable(" está vacio")))));
 BA.debugLineNum = 794;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 99;
if (true) break;
 if (true) break;
;
 BA.debugLineNum = 796;BA.debugLine="If InfoCampojFR.PuertoJrdcOrigenDatosAux=\"\"";
Debug.JustUpdateDeviceLine();

case 84:
//if
this.state = 87;
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"PuertoJrdcOrigenDatosAux" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
 BA.debugLineNum = 797;BA.debugLine="mResult.Put(\"FlagOK\",False)";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FlagOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 798;BA.debugLine="mResult.Put(\"msgError\",\"Error, El PuertoJrd";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("msgError"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error, El PuertoJrdcOrigenDatosAux del campo "),_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ ),RemoteObject.createImmutable(" está vacio")))));
 BA.debugLineNum = 799;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 99;
if (true) break;
 if (true) break;
;
 BA.debugLineNum = 801;BA.debugLine="If InfoCampojFR.ComandoConfigDatosAux=\"\" The";
Debug.JustUpdateDeviceLine();

case 87:
//if
this.state = 90;
if (RemoteObject.solveBoolean("=",_infocampojfr.getField(true,"ComandoConfigDatosAux" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
 BA.debugLineNum = 802;BA.debugLine="mResult.Put(\"FlagOK\",False)";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FlagOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 803;BA.debugLine="mResult.Put(\"msgError\",\"Error, El comandoCo";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("msgError"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error, El comandoConfigDatosAux del campo "),_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ ),RemoteObject.createImmutable(" está vacio")))));
 BA.debugLineNum = 804;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 99;
if (true) break;
 if (true) break;
;
 BA.debugLineNum = 807;BA.debugLine="If mExtras.GetDefault(\"ParametrosComandoDato";
Debug.JustUpdateDeviceLine();

case 90:
//if
this.state = 93;
if (RemoteObject.solveBoolean("!",_mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ParametrosComandoDatosAux"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
this.state = 92;
}if (true) break;

case 92:
//C
this.state = 93;
 BA.debugLineNum = 808;BA.debugLine="lstParams=Regex.Split(\";\",mExtras.GetDefaul";
Debug.JustUpdateDeviceLine();
_lstparams = parent.__c.runMethod(false, "ArrayToList", (Object)(parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(";")),(Object)(BA.ObjectToString(_mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ParametrosComandoDatosAux"))),(Object)((RemoteObject.createImmutable("")))))))));Debug.locals.put("lstParams", _lstparams);
 if (true) break;

case 93:
//C
this.state = 94;
;
 if (true) break;

case 94:
//C
this.state = 97;
;
 BA.debugLineNum = 812;BA.debugLine="InfoCampojFR.ParametrosComandoDatosAux=lstPar";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ParametrosComandoDatosAux" /*RemoteObject*/ ,_lstparams);
 BA.debugLineNum = 813;BA.debugLine="InfoCampojFR.NumCamposDatosAux=mExtras.GetDef";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("NumCamposDatosAux" /*RemoteObject*/ ,BA.numberCast(int.class, _mextras.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("NumCamposDatosAux"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))))));
 if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 818;BA.debugLine="FlagCampoJsonOK=False";
Debug.JustUpdateDeviceLine();
_flagcampojsonok = parent.__c.getField(true,"False");Debug.locals.put("FlagCampoJsonOK", _flagcampojsonok);
 BA.debugLineNum = 819;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 99;
if (true) break;
 if (true) break;

case 97:
//C
this.state = 98;
;
 BA.debugLineNum = 821;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 99;
if (true) break;
 if (true) break;

case 98:
//C
this.state = 134;
;
 if (true) break;
if (true) break;
Debug.locals.put("mJSON", _mjson);
;
 BA.debugLineNum = 826;BA.debugLine="If Not(mResult.Get(\"FlagOK\")) Then Return mResul";
Debug.JustUpdateDeviceLine();

case 99:
//if
this.state = 104;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 101;
;}if (true) break;

case 101:
//C
this.state = 104;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
if (true) break;

case 104:
//C
this.state = 105;
;
 BA.debugLineNum = 829;BA.debugLine="If Not(FlagCampoJsonOK) Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 105:
//if
this.state = 108;
if (parent.__c.runMethod(true,"Not",(Object)(_flagcampojsonok)).<Boolean>get().booleanValue()) { 
this.state = 107;
}if (true) break;

case 107:
//C
this.state = 108;
 BA.debugLineNum = 830;BA.debugLine="FlagTodosCamposMySQLOK=False";
Debug.JustUpdateDeviceLine();
_flagtodoscamposmysqlok = parent.__c.getField(true,"False");Debug.locals.put("FlagTodosCamposMySQLOK", _flagtodoscamposmysqlok);
 if (true) break;
;
 BA.debugLineNum = 836;BA.debugLine="For Each k As String In mDatosInputRegistro.Keys";
Debug.JustUpdateDeviceLine();

case 108:
//for
this.state = 115;
group160 = __ref.getField(false,"_mdatosinputregistro" /*RemoteObject*/ ).runMethod(false,"Keys");
index160 = 0;
groupLen160 = group160.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 135;
if (true) break;

case 135:
//C
this.state = 115;
if (index160 < groupLen160) {
this.state = 110;
_k = BA.ObjectToString(group160.runMethod(false,"Get",index160));Debug.locals.put("k", _k);}
if (true) break;

case 136:
//C
this.state = 135;
index160++;
Debug.locals.put("k", _k);
if (true) break;

case 110:
//C
this.state = 111;
 BA.debugLineNum = 837;BA.debugLine="If k=InfoCampojFR.CampoSQL Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 111:
//if
this.state = 114;
if (RemoteObject.solveBoolean("=",_k,_infocampojfr.getField(true,"CampoSQL" /*RemoteObject*/ ))) { 
this.state = 113;
}if (true) break;

case 113:
//C
this.state = 114;
 BA.debugLineNum = 839;BA.debugLine="InfoCampojFR.ValorInputCampo=mDatosInputRegist";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorInputCampo" /*RemoteObject*/ ,__ref.getField(false,"_mdatosinputregistro" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k))));
 BA.debugLineNum = 840;BA.debugLine="InfoCampojFR.ValorOutputCampo=InfoCampojFR.Val";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("ValorOutputCampo" /*RemoteObject*/ ,_infocampojfr.getField(false,"ValorInputCampo" /*RemoteObject*/ ));
 BA.debugLineNum = 844;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 115;
if (true) break;
 if (true) break;

case 114:
//C
this.state = 136;
;
 if (true) break;
if (true) break;

case 115:
//C
this.state = 132;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 848;BA.debugLine="Dim CampoObligatorioCumplimentar As Boolean=(Fal";
Debug.JustUpdateDeviceLine();
_campoobligatoriocumplimentar = BA.ObjectToBoolean((RemoteObject.solveBoolean("=",parent.__c.getField(true,"False"),_infocampojfr.getField(true,"AutoIncrementalSQL" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),_infocampojfr.getField(true,"NoNuloSQL" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",RemoteObject.createImmutable("null"),BA.ObjectToString(_infocampojfr.getField(false,"ValorCampoPorDefectoSQL" /*RemoteObject*/ )))));Debug.locals.put("CampoObligatorioCumplimentar", _campoobligatoriocumplimentar);Debug.locals.put("CampoObligatorioCumplimentar", _campoobligatoriocumplimentar);
 BA.debugLineNum = 849;BA.debugLine="InfoCampojFR.CampoObligatorioCumplimentar=CampoO";
Debug.JustUpdateDeviceLine();
_infocampojfr.setField ("CampoObligatorioCumplimentar" /*RemoteObject*/ ,_campoobligatoriocumplimentar);
 BA.debugLineNum = 851;BA.debugLine="NumCamposEnFormulario=NumCamposEnFormulario+1";
Debug.JustUpdateDeviceLine();
_numcamposenformulario = RemoteObject.solve(new RemoteObject[] {_numcamposenformulario,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumCamposEnFormulario", _numcamposenformulario);
 if (true) break;
if (true) break;
Debug.locals.put("InfoCampojFR", _infocampojfr);
;
 BA.debugLineNum = 854;BA.debugLine="If FlagTodosCamposMySQLOK=False Then  ' o bien al";
Debug.JustUpdateDeviceLine();

case 116:
//if
this.state = 119;
if (RemoteObject.solveBoolean("=",_flagtodoscamposmysqlok,parent.__c.getField(true,"False"))) { 
this.state = 118;
}if (true) break;

case 118:
//C
this.state = 119;
 BA.debugLineNum = 855;BA.debugLine="mResult.Put(\"FlagOK\",False)";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FlagOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 856;BA.debugLine="mResult.Put(\"msgError\",\"Campos Tabla \" & DatosOr";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("msgError"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Campos Tabla "),__ref.getField(false,"_datosorigendatosformregistro" /*RemoteObject*/ ).getField(true,"NombreTabla" /*RemoteObject*/ ),RemoteObject.createImmutable(" no coinciden con los campos JSON (¿estructura de datos?)."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("(Revisar en Record Builder el fichero "),_nombreficherojson,RemoteObject.createImmutable(")"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador del sistema.")))));
 BA.debugLineNum = 857;BA.debugLine="Return mResult";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 if (true) break;
;
 BA.debugLineNum = 863;BA.debugLine="For Each InfoCampojFR As InfoCampoJamFormRegistro";
Debug.JustUpdateDeviceLine();

case 119:
//for
this.state = 122;
group176 = _lstcontrolesindependientes;
index176 = 0;
groupLen176 = group176.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("InfoCampojFR", _infocampojfr);
this.state = 137;
if (true) break;

case 137:
//C
this.state = 122;
if (index176 < groupLen176) {
this.state = 121;
_infocampojfr = (group176.runMethod(false,"Get",index176));Debug.locals.put("InfoCampojFR", _infocampojfr);}
if (true) break;

case 138:
//C
this.state = 137;
index176++;
Debug.locals.put("InfoCampojFR", _infocampojfr);
if (true) break;

case 121:
//C
this.state = 138;
 BA.debugLineNum = 864;BA.debugLine="mlstInfoCampos.Add(InfoCampojFR)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_infocampojfr)));
 BA.debugLineNum = 865;BA.debugLine="NumCamposEnFormulario=NumCamposEnFormulario+1";
Debug.JustUpdateDeviceLine();
_numcamposenformulario = RemoteObject.solve(new RemoteObject[] {_numcamposenformulario,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumCamposEnFormulario", _numcamposenformulario);
 if (true) break;
if (true) break;

case 122:
//C
this.state = -1;
Debug.locals.put("InfoCampojFR", _infocampojfr);
;
 BA.debugLineNum = 874;BA.debugLine="Dim mDimScreen As Map=DimensionesPantalla";
Debug.JustUpdateDeviceLine();
_mdimscreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdimscreen = __ref.runClassMethod (b4j.docU.jamformregistro.class, "_dimensionespantalla" /*RemoteObject*/ );Debug.locals.put("mDimScreen", _mdimscreen);Debug.locals.put("mDimScreen", _mdimscreen);
 BA.debugLineNum = 875;BA.debugLine="Dim frmH As Double=mDimScreen.Get(\"Y\")";
Debug.JustUpdateDeviceLine();
_frmh = BA.numberCast(double.class, _mdimscreen.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Y")))));Debug.locals.put("frmH", _frmh);Debug.locals.put("frmH", _frmh);
 BA.debugLineNum = 878;BA.debugLine="frmReg.WindowHeight=Min(frmH*0.8,NumCamposEnFormu";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(true,"setWindowHeight",parent.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {_frmh,RemoteObject.createImmutable(0.8)}, "*",0, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_numcamposenformulario,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 81))),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))}, "*+",1, 1)))));
 BA.debugLineNum = 880;BA.debugLine="frmReg.RootPane.PrefHeight=frmReg.WindowHeight";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"setPrefHeight",__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runMethod(true,"getWindowHeight"));
 BA.debugLineNum = 902;BA.debugLine="mlstInfoCampos.SortType(\"OrdenCampo\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlstinfocampos" /*RemoteObject*/ ).runVoidMethod ("SortType",(Object)(BA.ObjectToString("OrdenCampo")),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 903;BA.debugLine="mResult.Put(\"FlagOK\",True)";
Debug.JustUpdateDeviceLine();
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FlagOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 904;BA.debugLine="Return mResult";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 BA.debugLineNum = 905;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _setmodoregistro(RemoteObject __ref,RemoteObject _modo) throws Exception{
try {
		Debug.PushSubsStack("SetModoRegistro (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,566);
if (RapidSub.canDelegate("setmodoregistro")) { return __ref.runUserSub(false, "jamformregistro","setmodoregistro", __ref, _modo);}
Debug.locals.put("Modo", _modo);
 BA.debugLineNum = 566;BA.debugLine="private Sub SetModoRegistro(Modo As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 567;BA.debugLine="mModoRegistro=Modo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmodoregistro" /*RemoteObject*/ ,_modo);
 BA.debugLineNum = 568;BA.debugLine="lblModoRegistro.Text=mModoRegistro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblmodoregistro" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ));
 BA.debugLineNum = 569;BA.debugLine="lblModoRegistroFAweEditar.Visible=mModoRegistro=\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblmodoregistrofaweeditar" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Editar"))));
 BA.debugLineNum = 570;BA.debugLine="lblModoRegistroFAweNuevo.Visible=mModoRegistro=\"N";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblmodoregistrofawenuevo" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Nuevo"))));
 BA.debugLineNum = 571;BA.debugLine="lblModoRegistroFAweVer.Visible=mModoRegistro=\"Ver";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblmodoregistrofawever" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Ver"))));
 BA.debugLineNum = 572;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (jamformregistro) ","jamformregistro",66,__ref.getField(false, "ba"),__ref,302);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "jamformregistro","show", __ref);}
 BA.debugLineNum = 302;BA.debugLine="Private Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 303;BA.debugLine="lblTitleModoRegistro.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltitlemodoregistro" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 304;BA.debugLine="CargandoDatos=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,jamformregistro.__c.getField(true,"False"));
 BA.debugLineNum = 307;BA.debugLine="If mModoRegistro=\"Nuevo\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mmodoregistro" /*RemoteObject*/ ),BA.ObjectToString("Nuevo"))) { 
 BA.debugLineNum = 308;BA.debugLine="AbrirEditorDeCampo(0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamformregistro.class, "_abrireditordecampo" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 311;BA.debugLine="frmReg.ShowAndWait";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frmreg" /*RemoteObject*/ ).runVoidMethodAndSync ("ShowAndWait");
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}