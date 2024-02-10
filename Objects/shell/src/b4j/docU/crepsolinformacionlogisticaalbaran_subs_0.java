package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class crepsolinformacionlogisticaalbaran_subs_0 {


public static RemoteObject  _abrirventanaoutlookemail(RemoteObject __ref,RemoteObject _titulowindow,RemoteObject _documento) throws Exception{
try {
		Debug.PushSubsStack("AbrirVentanaOutlookEmail (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,802);
if (RapidSub.canDelegate("abrirventanaoutlookemail")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","abrirventanaoutlookemail", __ref, _titulowindow, _documento);}
ResumableSub_AbrirVentanaOutlookEmail rsub = new ResumableSub_AbrirVentanaOutlookEmail(null,__ref,_titulowindow,_documento);
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
public static class ResumableSub_AbrirVentanaOutlookEmail extends BA.ResumableSub {
public ResumableSub_AbrirVentanaOutlookEmail(b4j.docU.crepsolinformacionlogisticaalbaran parent,RemoteObject __ref,RemoteObject _titulowindow,RemoteObject _documento) {
this.parent = parent;
this.__ref = __ref;
this._titulowindow = _titulowindow;
this._documento = _documento;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
RemoteObject _titulowindow;
RemoteObject _documento;
RemoteObject _wu = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _flagok = RemoteObject.createImmutable(false);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _t = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AbrirVentanaOutlookEmail (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,802);
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
Debug.locals.put("TituloWindow", _titulowindow);
Debug.locals.put("Documento", _documento);
 BA.debugLineNum = 805;BA.debugLine="Log(\"Buscando window title \" & TituloWindow)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","899942403",RemoteObject.concat(RemoteObject.createImmutable("Buscando window title "),_titulowindow),0);
 BA.debugLineNum = 808;BA.debugLine="Dim WU As JavaObject";
Debug.ShouldStop(128);
_wu = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("WU", _wu);
 BA.debugLineNum = 809;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.WindowU";
Debug.ShouldStop(256);
_wu.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.jna.platform.WindowUtils")));
 BA.debugLineNum = 810;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",Arra";
Debug.ShouldStop(512);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _wu.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAllWindows")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"False"))}))));Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 811;BA.debugLine="Dim FlagOk As Boolean";
Debug.ShouldStop(1024);
_flagok = RemoteObject.createImmutable(false);Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 812;BA.debugLine="For Each JO As JavaObject In L";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//for
this.state = 8;
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
group6 = _l;
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("JO", _jo);
this.state = 14;
if (true) break;

case 14:
//C
this.state = 8;
if (index6 < groupLen6) {
this.state = 3;
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), group6.runMethod(false,"Get",index6));Debug.locals.put("JO", _jo);}
if (true) break;

case 15:
//C
this.state = 14;
index6++;
Debug.locals.put("JO", _jo);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 813;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Null)";
Debug.ShouldStop(4096);
_t = BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTitle")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 815;BA.debugLine="Log(\"window title\" & t)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","899942413",RemoteObject.concat(RemoteObject.createImmutable("window title"),_t),0);
 BA.debugLineNum = 819;BA.debugLine="If t.Contains(TituloWindow) Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 7;
if (_t.runMethod(true,"contains",(Object)(_titulowindow)).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 826;BA.debugLine="FlagOk=True";
Debug.ShouldStop(33554432);
_flagok = parent.__c.getField(true,"True");Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 827;BA.debugLine="Exit";
Debug.ShouldStop(67108864);
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 15;
;
 if (true) break;
if (true) break;
Debug.locals.put("JO", _jo);
;
 BA.debugLineNum = 831;BA.debugLine="If FlagOk Then";
Debug.ShouldStop(1073741824);

case 8:
//if
this.state = 13;
if (_flagok.<Boolean>get().booleanValue()) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 832;BA.debugLine="SetForegroundWindow(t,False)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_setforegroundwindow" /*RemoteObject*/ ,(Object)(_t),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 833;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 835;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No se ha enc";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No se ha encontrado la ventana de Outlook con el correo correspondiente al documento "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_documento))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Busca manualmente la ventana en outlook para enviar el email")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 837;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "abrirventanaoutlookemail"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 13;
;
 BA.debugLineNum = 838;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 842;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _borrarvbsscriptdireccionremitenteemailoutlook(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarVBSScriptDireccionRemitenteEmailOutlook (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,529);
if (RapidSub.canDelegate("borrarvbsscriptdireccionremitenteemailoutlook")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","borrarvbsscriptdireccionremitenteemailoutlook", __ref);}
 BA.debugLineNum = 529;BA.debugLine="Sub BorrarVBSScriptDireccionRemitenteEmailOutlook";
Debug.ShouldStop(65536);
 BA.debugLineNum = 530;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc.vbs\")";
Debug.ShouldStop(131072);
if (crepsolinformacionlogisticaalbaran.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc.vbs"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 531;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc.vbs\")";
Debug.ShouldStop(262144);
crepsolinformacionlogisticaalbaran.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc.vbs")));
 };
 BA.debugLineNum = 533;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _borrarvbsscriptenvioemailoutlook(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarVBSScriptEnvioEmailOutlook (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,795);
if (RapidSub.canDelegate("borrarvbsscriptenvioemailoutlook")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","borrarvbsscriptenvioemailoutlook", __ref);}
 BA.debugLineNum = 795;BA.debugLine="Sub BorrarVBSScriptEnvioEmailOutlook";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 796;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc2.vbs\")";
Debug.ShouldStop(134217728);
if (crepsolinformacionlogisticaalbaran.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc2.vbs"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 797;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc2.vbs\")";
Debug.ShouldStop(268435456);
crepsolinformacionlogisticaalbaran.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc2.vbs")));
 };
 BA.debugLineNum = 799;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("btnSalir_Click (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","btnsalir_click", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="SalirModulo";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnseleccionardocumento_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSeleccionarDocumento_Click (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("btnseleccionardocumento_click")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","btnseleccionardocumento_click", __ref);}
 BA.debugLineNum = 340;BA.debugLine="Private Sub btnSeleccionarDocumento_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="SeleccionarDocumento";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_seleccionardocumento" /*void*/ );
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarepsolconfiguracionlogisticaalbaranesventa(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaRepsolConfiguracionLogisticaAlbaranesVenta (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("cargarepsolconfiguracionlogisticaalbaranesventa")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","cargarepsolconfiguracionlogisticaalbaranesventa", __ref);}
ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta rsub = new ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta(null,__ref);
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
public static class ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta extends BA.ResumableSub {
public ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta(b4j.docU.crepsolinformacionlogisticaalbaran parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mdataconf = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaRepsolConfiguracionLogisticaAlbaranesVenta (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,106);
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
 BA.debugLineNum = 108;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2048);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 109;BA.debugLine="Dim mDataConf As Map";
Debug.ShouldStop(4096);
_mdataconf = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDataConf", _mdataconf);
 BA.debugLineNum = 110;BA.debugLine="mDataConf.Initialize";
Debug.ShouldStop(8192);
_mdataconf.runVoidMethod ("Initialize");
 BA.debugLineNum = 111;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(16384);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 112;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(32768);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 113;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 114;BA.debugLine="mRes.Put(\"mDataConf\",mDataConf)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mDataConf"))),(Object)((_mdataconf.getObject())));
 BA.debugLineNum = 115;BA.debugLine="Dim Comando As String=\"RepsolConfiguracionLogisti";
Debug.ShouldStop(262144);
_comando = BA.ObjectToString("RepsolConfiguracionLogisticaAlbaranesVenta");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 116;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(524288);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 118;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolconfiguracionlogisticaalbaranesventa"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 120;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 121;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 123;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolconfiguracionlogisticaalbaranesventa"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 124;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(134217728);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 125;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 128;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 129;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 130;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe l";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.createImmutable("No existe la configuración necesaria para la conexión."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 131;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolconfiguracionlogisticaalbaranesventa"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 132;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 133;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 135;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(64);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 136;BA.debugLine="mDataConf=lstReg.Get(0)";
Debug.ShouldStop(128);
_mdataconf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mDataConf", _mdataconf);
 BA.debugLineNum = 137;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(256);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 138;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 139;BA.debugLine="mRes.Put(\"mDataConf\", mDataConf)";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mDataConf"))),(Object)((_mdataconf.getObject())));
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
 BA.debugLineNum = 143;BA.debugLine="Return mRes";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _cargarepsolinformacionlogisticaalbaranventa(RemoteObject __ref,RemoteObject _albarannav) throws Exception{
try {
		Debug.PushSubsStack("CargaRepsolInformacionLogisticaAlbaranVenta (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("cargarepsolinformacionlogisticaalbaranventa")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","cargarepsolinformacionlogisticaalbaranventa", __ref, _albarannav);}
ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta rsub = new ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta(null,__ref,_albarannav);
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
public static class ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta extends BA.ResumableSub {
public ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta(b4j.docU.crepsolinformacionlogisticaalbaran parent,RemoteObject __ref,RemoteObject _albarannav) {
this.parent = parent;
this.__ref = __ref;
this._albarannav = _albarannav;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
RemoteObject _albarannav;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaRepsolInformacionLogisticaAlbaranVenta (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,148);
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
Debug.locals.put("AlbaranNAV", _albarannav);
 BA.debugLineNum = 149;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1048576);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 150;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(2097152);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 151;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(4194304);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 152;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8388608);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 153;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 154;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 155;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 156;BA.debugLine="Dim Comando As String=\"RepsolInformacionLogistica";
Debug.ShouldStop(134217728);
_comando = BA.ObjectToString("RepsolInformacionLogisticaAlbaranVenta");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 157;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(268435456);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_albarannav)})),(Object)(__ref));
 BA.debugLineNum = 159;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolinformacionlogisticaalbaranventa"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 160;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 161;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 162;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 163;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolinformacionlogisticaalbaranventa"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 164;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 165;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 167;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 168;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(128);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 169;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe e";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No existe el documento "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_albarannav))),RemoteObject.createImmutable(" en navision, o no tiene lineas no corregidas de tipo producto.")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 170;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolinformacionlogisticaalbaranventa"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 171;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 172;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 174;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8192);
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 175;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(16384);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 176;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(32768);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 177;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
 BA.debugLineNum = 180;BA.debugLine="Return mRes";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 181;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
crepsolinformacionlogisticaalbaran._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",crepsolinformacionlogisticaalbaran._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
crepsolinformacionlogisticaalbaran._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",crepsolinformacionlogisticaalbaran._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
crepsolinformacionlogisticaalbaran._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",crepsolinformacionlogisticaalbaran._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private mSQL As SQL";
crepsolinformacionlogisticaalbaran._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",crepsolinformacionlogisticaalbaran._msql);
 //BA.debugLineNum = 8;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
crepsolinformacionlogisticaalbaran._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",crepsolinformacionlogisticaalbaran._jamloadingindicator1);
 //BA.debugLineNum = 9;BA.debugLine="Private Dialog As B4XDialog";
crepsolinformacionlogisticaalbaran._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",crepsolinformacionlogisticaalbaran._dialog);
 //BA.debugLineNum = 10;BA.debugLine="Private btnSalir As B4XView";
crepsolinformacionlogisticaalbaran._btnsalir = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnsalir",crepsolinformacionlogisticaalbaran._btnsalir);
 //BA.debugLineNum = 11;BA.debugLine="Private btnSeleccionarDocumento As B4XView";
crepsolinformacionlogisticaalbaran._btnseleccionardocumento = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnseleccionardocumento",crepsolinformacionlogisticaalbaran._btnseleccionardocumento);
 //BA.debugLineNum = 12;BA.debugLine="Private lblDocumento As B4XView";
crepsolinformacionlogisticaalbaran._lbldocumento = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbldocumento",crepsolinformacionlogisticaalbaran._lbldocumento);
 //BA.debugLineNum = 13;BA.debugLine="Private pnlFondo As B4XView";
crepsolinformacionlogisticaalbaran._pnlfondo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlfondo",crepsolinformacionlogisticaalbaran._pnlfondo);
 //BA.debugLineNum = 14;BA.debugLine="Private txtDocumento As B4XView";
crepsolinformacionlogisticaalbaran._txtdocumento = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtdocumento",crepsolinformacionlogisticaalbaran._txtdocumento);
 //BA.debugLineNum = 16;BA.debugLine="Private CarpetaFicherosCSV As String";
crepsolinformacionlogisticaalbaran._carpetaficheroscsv = RemoteObject.createImmutable("");__ref.setField("_carpetaficheroscsv",crepsolinformacionlogisticaalbaran._carpetaficheroscsv);
 //BA.debugLineNum = 17;BA.debugLine="Private CarpetaFicherosPDF As String";
crepsolinformacionlogisticaalbaran._carpetaficherospdf = RemoteObject.createImmutable("");__ref.setField("_carpetaficherospdf",crepsolinformacionlogisticaalbaran._carpetaficherospdf);
 //BA.debugLineNum = 18;BA.debugLine="Private BuzonCompartidoEmailEnvioInfo As String";
crepsolinformacionlogisticaalbaran._buzoncompartidoemailenvioinfo = RemoteObject.createImmutable("");__ref.setField("_buzoncompartidoemailenvioinfo",crepsolinformacionlogisticaalbaran._buzoncompartidoemailenvioinfo);
 //BA.debugLineNum = 19;BA.debugLine="Private BuzonCompartidoEmailEnvioInfo As String";
crepsolinformacionlogisticaalbaran._buzoncompartidoemailenvioinfo = RemoteObject.createImmutable("");__ref.setField("_buzoncompartidoemailenvioinfo",crepsolinformacionlogisticaalbaran._buzoncompartidoemailenvioinfo);
 //BA.debugLineNum = 20;BA.debugLine="Private DireccionSeleccionadaRemitenteEmails As S";
crepsolinformacionlogisticaalbaran._direccionseleccionadaremitenteemails = RemoteObject.createImmutable("");__ref.setField("_direccionseleccionadaremitenteemails",crepsolinformacionlogisticaalbaran._direccionseleccionadaremitenteemails);
 //BA.debugLineNum = 21;BA.debugLine="Private DireccionDestinoEmails As String";
crepsolinformacionlogisticaalbaran._direcciondestinoemails = RemoteObject.createImmutable("");__ref.setField("_direcciondestinoemails",crepsolinformacionlogisticaalbaran._direcciondestinoemails);
 //BA.debugLineNum = 22;BA.debugLine="Private DireccionCCDestinoEmails As String";
crepsolinformacionlogisticaalbaran._direccionccdestinoemails = RemoteObject.createImmutable("");__ref.setField("_direccionccdestinoemails",crepsolinformacionlogisticaalbaran._direccionccdestinoemails);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","creaciontablassqlite", __ref);}
 BA.debugLineNum = 54;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearvbsscriptdireccionremitenteemailoutlook(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CrearVBSScriptDireccionRemitenteEmailOutlook (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,463);
if (RapidSub.canDelegate("crearvbsscriptdireccionremitenteemailoutlook")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","crearvbsscriptdireccionremitenteemailoutlook", __ref);}
RemoteObject _svbscript = RemoteObject.createImmutable("");
 BA.debugLineNum = 463;BA.debugLine="Sub CrearVBSScriptDireccionRemitenteEmailOutlook";
Debug.ShouldStop(16384);
 BA.debugLineNum = 465;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlook";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_borrarvbsscriptdireccionremitenteemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 467;BA.debugLine="Dim sVBscript As String";
Debug.ShouldStop(262144);
_svbscript = RemoteObject.createImmutable("");Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 469;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
Debug.ShouldStop(1048576);
_svbscript = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Option Explicit\n"),RemoteObject.createImmutable("		On Error Resume Next\n"),RemoteObject.createImmutable("		Dim xOLApp, olAccounts\n"),RemoteObject.createImmutable("		Dim objStdOut,objStdErr\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("		Set objStdOut = WScript.StdOut\n"),RemoteObject.createImmutable("		Set objStdErr = WScript.StdErr\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("	'Set xOLApp = CreateObject(\"Outlook.Application\")\n"),RemoteObject.createImmutable("		Set xOLApp =GetObject(, \"Outlook.Application\")\n"),RemoteObject.createImmutable("		If Err.Number<>0 Then\n"),RemoteObject.createImmutable("			If Err.Number=429 Then\n"),RemoteObject.createImmutable("	'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("			Else\n"),RemoteObject.createImmutable("	'MsgBox Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("				objStdErr.Write Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("			End If\n"),RemoteObject.createImmutable("			WScript.Quit (1) 'return code 1\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Dim i\n"),RemoteObject.createImmutable("		For i = 1 To xOLApp.Session.Accounts.count\n"),RemoteObject.createImmutable("			objStdOut.Write xOLApp.Session.Accounts.Item(i) & \",\"\n"),RemoteObject.createImmutable("		Next\n"),RemoteObject.createImmutable("		Set xOLApp = Nothing\n"),RemoteObject.createImmutable("		If Err.Number<>0 Then\n"),RemoteObject.createImmutable("			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"),RemoteObject.createImmutable("			WScript.Quit (1)\n"),RemoteObject.createImmutable("		Else\n"),RemoteObject.createImmutable("			WScript.Quit (0)\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("			")));Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 526;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc.vbs\"";
Debug.ShouldStop(8192);
crepsolinformacionlogisticaalbaran.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(BA.ObjectToString("smfpromc.vbs")),(Object)(_svbscript));
 BA.debugLineNum = 527;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearvbsscriptenvioemailoutlookhtml(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CrearVBSScriptEnvioEmailOutlookHTML (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,724);
if (RapidSub.canDelegate("crearvbsscriptenvioemailoutlookhtml")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","crearvbsscriptenvioemailoutlookhtml", __ref);}
RemoteObject _svbscript = RemoteObject.createImmutable("");
 BA.debugLineNum = 724;BA.debugLine="Sub CrearVBSScriptEnvioEmailOutlookHTML";
Debug.ShouldStop(524288);
 BA.debugLineNum = 726;BA.debugLine="BorrarVBSScriptEnvioEmailOutlook";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_borrarvbsscriptenvioemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 728;BA.debugLine="Dim sVBscript As String";
Debug.ShouldStop(8388608);
_svbscript = RemoteObject.createImmutable("");Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 730;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
Debug.ShouldStop(33554432);
_svbscript = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Option Explicit\n"),RemoteObject.createImmutable("		On Error Resume Next\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Dim objStdOut,objStdErr\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("		Set objStdOut = WScript.StdOut\n"),RemoteObject.createImmutable("		Set objStdErr = WScript.StdErr\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		Dim xOLApp\n"),RemoteObject.createImmutable("		Dim objMailItem\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("	'Dim OutAccount\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		Dim signature\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("	'Set xOLApp = CreateObject(\"Outlook.Application\")\n"),RemoteObject.createImmutable("		Set xOLApp =GetObject(, \"Outlook.Application\")\n"),RemoteObject.createImmutable("		If Err.Number<>0 Then\n"),RemoteObject.createImmutable("			If Err.Number=429 Then\n"),RemoteObject.createImmutable("	'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("			Else\n"),RemoteObject.createImmutable("	'MsgBox Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("				objStdErr.Write Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("			End If\n"),RemoteObject.createImmutable("			WScript.Quit (1) 'return code 1\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("		Set objMailItem = xOLApp.CreateItem(0)\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("   		objMailItem.Display\n"),RemoteObject.createImmutable("		signature = objMailItem.HTMLBody\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("	'Set OutAccount = xOLApp.Session.Accounts(WScript.Arguments(0))\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		objMailItem.SentOnBehalfOfName = WScript.Arguments(0)\n"),RemoteObject.createImmutable("	'objMailItem.SendUsingAccount = WScript.Arguments(0)\n"),RemoteObject.createImmutable("	'objMailItem.SendUsingAccount = OutAccount\n"),RemoteObject.createImmutable("	'objMailItem.SentOnBehalfOfName = OutAccount\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		objMailItem.To = WScript.Arguments(1)\n"),RemoteObject.createImmutable("		if WScript.Arguments(2)<>\"None\" then\n"),RemoteObject.createImmutable("			objMailItem.CC = WScript.Arguments(2)\n"),RemoteObject.createImmutable("		end if\n"),RemoteObject.createImmutable("		objMailItem.Subject = WScript.Arguments(3)\n"),RemoteObject.createImmutable("	'objMailItem.HTMLBody = WScript.Arguments(4) & \"<br><br>\" & objMailItem.HTMLBody & \"</p>\"\n"),RemoteObject.createImmutable("		objMailItem.HTMLBody = \"<p><br>\" & WScript.Arguments(4) & \"<br>\" & signature & \"</p>\"\n"),RemoteObject.createImmutable("		objMailItem.Attachments.Add WScript.Arguments(5)\n"),RemoteObject.createImmutable("		if WScript.Arguments(6)<>\"\" then\n"),RemoteObject.createImmutable("			objMailItem.Attachments.Add WScript.Arguments(6)\n"),RemoteObject.createImmutable("		end if\n"),RemoteObject.createImmutable("	'objMailItem.Send\n"),RemoteObject.createImmutable("		Set xOLApp = Nothing\n"),RemoteObject.createImmutable("		Set objMailItem = Nothing\n"),RemoteObject.createImmutable("		If Err.Number = 0 Then\n"),RemoteObject.createImmutable("			objStdOut.Write \"Email enviado\"\n"),RemoteObject.createImmutable("			WScript.Quit (0)\n"),RemoteObject.createImmutable("		Else\n"),RemoteObject.createImmutable("			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"),RemoteObject.createImmutable("			WScript.Quit (1)\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("			")));Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 792;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc2.vbs";
Debug.ShouldStop(8388608);
crepsolinformacionlogisticaalbaran.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(BA.ObjectToString("smfpromc2.vbs")),(Object)(_svbscript));
 BA.debugLineNum = 793;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ejecutarvbsscriptdireccionesemail(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EjecutarVBSScriptDireccionesEmail (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,672);
if (RapidSub.canDelegate("ejecutarvbsscriptdireccionesemail")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","ejecutarvbsscriptdireccionesemail", __ref);}
ResumableSub_EjecutarVBSScriptDireccionesEmail rsub = new ResumableSub_EjecutarVBSScriptDireccionesEmail(null,__ref);
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
public static class ResumableSub_EjecutarVBSScriptDireccionesEmail extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptDireccionesEmail(b4j.docU.crepsolinformacionlogisticaalbaran parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EjecutarVBSScriptDireccionesEmail (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,672);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 673;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(1);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 674;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 675;BA.debugLine="Dim shl As Shell";
Debug.ShouldStop(4);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 676;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
Debug.ShouldStop(8);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(BA.ObjectToString("c:\\windows\\system32\\cscript.exe")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("//nologo"),RemoteObject.createImmutable("smfpromc.vbs")})))));
 BA.debugLineNum = 677;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
Debug.ShouldStop(16);
_shl.runMethod(true,"setWorkingDirectory",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder"));
 BA.debugLineNum = 678;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(32);
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 679;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.ShouldStop(64);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 680;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "ejecutarvbsscriptdireccionesemail"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 681;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.ShouldStop(256);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 682;BA.debugLine="Log(\"Success\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","899614730",RemoteObject.createImmutable("Success"),0);
 BA.debugLineNum = 683;BA.debugLine="Log(StdOut)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","899614731",_stdout,0);
 BA.debugLineNum = 684;BA.debugLine="mRes.Put(\"Success\",True)";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 685;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdOut"))),(Object)((_stdout)));
 BA.debugLineNum = 686;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdErr"))),(Object)((_stderr)));
 BA.debugLineNum = 687;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ExitCode"))),(Object)((_exitcode)));
 BA.debugLineNum = 688;BA.debugLine="Return mRes";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 689;BA.debugLine="End Sub";
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
public static void  _shl_processcompleted(RemoteObject __ref,RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
}
public static RemoteObject  _ejecutarvbsscriptenviaremail(RemoteObject __ref,RemoteObject _senderaddr,RemoteObject _receiveraddr,RemoteObject _ccreceiveraddr,RemoteObject _subject,RemoteObject _body,RemoteObject _fileattch,RemoteObject _fileattch2) throws Exception{
try {
		Debug.PushSubsStack("EjecutarVBSScriptEnviarEmail (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,691);
if (RapidSub.canDelegate("ejecutarvbsscriptenviaremail")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","ejecutarvbsscriptenviaremail", __ref, _senderaddr, _receiveraddr, _ccreceiveraddr, _subject, _body, _fileattch, _fileattch2);}
ResumableSub_EjecutarVBSScriptEnviarEmail rsub = new ResumableSub_EjecutarVBSScriptEnviarEmail(null,__ref,_senderaddr,_receiveraddr,_ccreceiveraddr,_subject,_body,_fileattch,_fileattch2);
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
public static class ResumableSub_EjecutarVBSScriptEnviarEmail extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptEnviarEmail(b4j.docU.crepsolinformacionlogisticaalbaran parent,RemoteObject __ref,RemoteObject _senderaddr,RemoteObject _receiveraddr,RemoteObject _ccreceiveraddr,RemoteObject _subject,RemoteObject _body,RemoteObject _fileattch,RemoteObject _fileattch2) {
this.parent = parent;
this.__ref = __ref;
this._senderaddr = _senderaddr;
this._receiveraddr = _receiveraddr;
this._ccreceiveraddr = _ccreceiveraddr;
this._subject = _subject;
this._body = _body;
this._fileattch = _fileattch;
this._fileattch2 = _fileattch2;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
RemoteObject _senderaddr;
RemoteObject _receiveraddr;
RemoteObject _ccreceiveraddr;
RemoteObject _subject;
RemoteObject _body;
RemoteObject _fileattch;
RemoteObject _fileattch2;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EjecutarVBSScriptEnviarEmail (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,691);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("SenderAddr", _senderaddr);
Debug.locals.put("ReceiverAddr", _receiveraddr);
Debug.locals.put("CCReceiverAddr", _ccreceiveraddr);
Debug.locals.put("Subject", _subject);
Debug.locals.put("Body", _body);
Debug.locals.put("FileAttch", _fileattch);
Debug.locals.put("FileAttch2", _fileattch2);
 BA.debugLineNum = 693;BA.debugLine="Body=Body.Replace(CRLF,\"<br>\")";
Debug.ShouldStop(1048576);
_body = _body.runMethod(true,"replace",(Object)(parent.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("<br>")));Debug.locals.put("Body", _body);
 BA.debugLineNum = 695;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4194304);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 696;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 697;BA.debugLine="Dim shl As Shell";
Debug.ShouldStop(16777216);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 698;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
Debug.ShouldStop(33554432);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(BA.ObjectToString("c:\\windows\\system32\\cscript.exe")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString("//nologo"),BA.ObjectToString("smfpromc2.vbs"),_senderaddr,_receiveraddr,_ccreceiveraddr,_subject,_body,_fileattch,_fileattch2})))));
 BA.debugLineNum = 699;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
Debug.ShouldStop(67108864);
_shl.runMethod(true,"setWorkingDirectory",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder"));
 BA.debugLineNum = 700;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(134217728);
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 701;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.ShouldStop(268435456);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 702;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "ejecutarvbsscriptenviaremail"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 703;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 704;BA.debugLine="Log(\"Success: \" & Success)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","899680269",RemoteObject.concat(RemoteObject.createImmutable("Success: "),_success),0);
 BA.debugLineNum = 705;BA.debugLine="Log(StdOut)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","899680270",_stdout,0);
 BA.debugLineNum = 706;BA.debugLine="mRes.Put(\"Success\",True)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 707;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdOut"))),(Object)((_stdout)));
 BA.debugLineNum = 708;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdErr"))),(Object)((_stderr)));
 BA.debugLineNum = 709;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ExitCode"))),(Object)((_exitcode)));
 BA.debugLineNum = 710;BA.debugLine="Return mRes";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 711;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 35;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="EventData.Consume";
Debug.ShouldStop(8);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generatestring(RemoteObject __ref,RemoteObject _table,RemoteObject _separatorchar) throws Exception{
try {
		Debug.PushSubsStack("GenerateString (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,433);
if (RapidSub.canDelegate("generatestring")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","generatestring", __ref, _table, _separatorchar);}
RemoteObject _eol = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _row = null;
int _i = 0;
RemoteObject _wrap = RemoteObject.createImmutable(false);
RemoteObject _word = RemoteObject.createImmutable("");
Debug.locals.put("Table", _table);
Debug.locals.put("SeparatorChar", _separatorchar);
 BA.debugLineNum = 433;BA.debugLine="Sub GenerateString (Table As List, SeparatorChar A";
Debug.ShouldStop(65536);
 BA.debugLineNum = 434;BA.debugLine="Dim eol As String = Chr(10)";
Debug.ShouldStop(131072);
_eol = BA.ObjectToString(crepsolinformacionlogisticaalbaran.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("eol", _eol);Debug.locals.put("eol", _eol);
 BA.debugLineNum = 435;BA.debugLine="If Table.Size = 0 Then Return \"\"";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_table.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 436;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(524288);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 437;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 438;BA.debugLine="For Each row() As String In Table";
Debug.ShouldStop(2097152);
{
final RemoteObject group5 = _table;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = (group5.runMethod(false,"Get",index5));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 439;BA.debugLine="For i = 0 To row.Length - 1";
Debug.ShouldStop(4194304);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_row.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 440;BA.debugLine="Dim Wrap As Boolean";
Debug.ShouldStop(8388608);
_wrap = RemoteObject.createImmutable(false);Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 441;BA.debugLine="Dim word As String = row(i)";
Debug.ShouldStop(16777216);
_word = _row.getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("word", _word);Debug.locals.put("word", _word);
 BA.debugLineNum = 442;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
Debug.ShouldStop(33554432);
if (_word.runMethod(true,"contains",(Object)(_separatorchar)).<Boolean>get().booleanValue()) { 
_wrap = crepsolinformacionlogisticaalbaran.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);};
 BA.debugLineNum = 443;BA.debugLine="If word.Contains(QUOTE) Then";
Debug.ShouldStop(67108864);
if (_word.runMethod(true,"contains",(Object)(crepsolinformacionlogisticaalbaran.__c.getField(true,"QUOTE"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 444;BA.debugLine="Wrap = True";
Debug.ShouldStop(134217728);
_wrap = crepsolinformacionlogisticaalbaran.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 445;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
Debug.ShouldStop(268435456);
_word = _word.runMethod(true,"replace",(Object)(crepsolinformacionlogisticaalbaran.__c.getField(true,"QUOTE")),(Object)((RemoteObject.createImmutable("\"\""))));Debug.locals.put("word", _word);
 };
 BA.debugLineNum = 447;BA.debugLine="If Wrap Then";
Debug.ShouldStop(1073741824);
if (_wrap.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 448;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
Debug.ShouldStop(-2147483648);
_sb.runMethod(false,"Append",(Object)(crepsolinformacionlogisticaalbaran.__c.getField(true,"QUOTE"))).runMethod(false,"Append",(Object)(_word)).runVoidMethod ("Append",(Object)(crepsolinformacionlogisticaalbaran.__c.getField(true,"QUOTE")));
 }else {
 BA.debugLineNum = 450;BA.debugLine="sb.Append(word)";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Append",(Object)(_word));
 };
 BA.debugLineNum = 452;BA.debugLine="sb.Append(SeparatorChar)";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(_separatorchar));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 454;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 455;BA.debugLine="sb.Append(eol)";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(_eol));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 457;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_eol.runMethod(true,"length")}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 458;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(512);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _htmlbodyemail(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HTMLBodyEmail (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,714);
if (RapidSub.canDelegate("htmlbodyemail")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","htmlbodyemail", __ref);}
RemoteObject _strbodyhtml = RemoteObject.createImmutable("");
 BA.debugLineNum = 714;BA.debugLine="Sub HTMLBodyEmail As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 715;BA.debugLine="Dim strBodyHTML As String";
Debug.ShouldStop(1024);
_strbodyhtml = RemoteObject.createImmutable("");Debug.locals.put("strBodyHTML", _strbodyhtml);
 BA.debugLineNum = 716;BA.debugLine="strBodyHTML = $\"<p>Buenos días<br><br> Adjunto el";
Debug.ShouldStop(2048);
_strbodyhtml = (RemoteObject.concat(RemoteObject.createImmutable("<p>Buenos días<br><br>\n"),RemoteObject.createImmutable("Adjunto el albarán en pdf y el archivo csv para que procedáis a la preparación de la mercancía y su envío a la mayor brevedad posible.<br>\n"),RemoteObject.createImmutable("En caso de alguna incidencia por favor indicádnoslo.<br>\n"),RemoteObject.createImmutable("<br>Muchas gracias")));Debug.locals.put("strBodyHTML", _strbodyhtml);
 BA.debugLineNum = 720;BA.debugLine="Return strBodyHTML";
Debug.ShouldStop(32768);
if (true) return _strbodyhtml;
 BA.debugLineNum = 721;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Initialize (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(crepsolinformacionlogisticaalbaran._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(crepsolinformacionlogisticaalbaran.__c.getField(true,"True")));
 BA.debugLineNum = 32;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapkeystoarray(RemoteObject __ref,RemoteObject _mdata) throws Exception{
try {
		Debug.PushSubsStack("mapKeysToArray (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("mapkeystoarray")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","mapkeystoarray", __ref, _mdata);}
RemoteObject _arr = null;
RemoteObject _idx = RemoteObject.createImmutable(0);
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 344;BA.debugLine="Sub mapKeysToArray(mData As Map) As String()";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="Dim arr(mData.Size) As String";
Debug.ShouldStop(16777216);
_arr = RemoteObject.createNewArray ("String", new int[] {_mdata.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arr", _arr);
 BA.debugLineNum = 346;BA.debugLine="Dim iDx As Int";
Debug.ShouldStop(33554432);
_idx = RemoteObject.createImmutable(0);Debug.locals.put("iDx", _idx);
 BA.debugLineNum = 347;BA.debugLine="For Each key As String In mData.Keys";
Debug.ShouldStop(67108864);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 348;BA.debugLine="arr(iDx)=key";
Debug.ShouldStop(134217728);
_arr.setArrayElement (_key,_idx);
 BA.debugLineNum = 349;BA.debugLine="iDx=iDx+1";
Debug.ShouldStop(268435456);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("iDx", _idx);
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 351;BA.debugLine="Return arr";
Debug.ShouldStop(1073741824);
if (true) return _arr;
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maptoarrayofstringsconcamposfecha(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("mapToArrayOfStringsConCamposFecha (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,406);
if (RapidSub.canDelegate("maptoarrayofstringsconcamposfecha")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","maptoarrayofstringsconcamposfecha", __ref, _m);}
RemoteObject _arr = null;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _key = RemoteObject.declareNull("Object");
RemoteObject _intvalue = RemoteObject.createImmutable(0);
RemoteObject _svalue = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
 BA.debugLineNum = 406;BA.debugLine="public Sub mapToArrayOfStringsConCamposFecha(m As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 407;BA.debugLine="Dim arr(m.Size * 2) As Object  'array size is dou";
Debug.ShouldStop(4194304);
_arr = RemoteObject.createNewArray ("Object", new int[] {RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "*",0, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arr", _arr);
 BA.debugLineNum = 408;BA.debugLine="Dim i As Int=0";
Debug.ShouldStop(8388608);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 409;BA.debugLine="Dim value As Object";
Debug.ShouldStop(16777216);
_value = RemoteObject.createNew ("Object");Debug.locals.put("value", _value);
 BA.debugLineNum = 410;BA.debugLine="For Each key As Object In m.Keys";
Debug.ShouldStop(33554432);
{
final RemoteObject group4 = _m.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 412;BA.debugLine="value=m.Get(key)";
Debug.ShouldStop(134217728);
_value = _m.runMethod(false,"Get",(Object)(_key));Debug.locals.put("value", _value);
 BA.debugLineNum = 413;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
Debug.ShouldStop(268435456);
crepsolinformacionlogisticaalbaran.__c.runVoidMethod ("LogImpl","899287047",(RemoteObject.concat(RemoteObject.createImmutable("key="),crepsolinformacionlogisticaalbaran.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_key)),RemoteObject.createImmutable(", value="),crepsolinformacionlogisticaalbaran.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable(""))),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 414;BA.debugLine="arr(i)=key";
Debug.ShouldStop(536870912);
_arr.setArrayElement (_key,_i);
 BA.debugLineNum = 415;BA.debugLine="i = i +1";
Debug.ShouldStop(1073741824);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 416;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(".",(BA.ObjectToString(_key)).runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("FECHA")))) && RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 417;BA.debugLine="arr(i)=DateTime.Date(value)";
Debug.ShouldStop(1);
_arr.setArrayElement ((crepsolinformacionlogisticaalbaran.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _value)))),_i);
 }else {
 BA.debugLineNum = 419;BA.debugLine="If value Is String Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("String"))) { 
 BA.debugLineNum = 420;BA.debugLine="arr(i)=value";
Debug.ShouldStop(8);
_arr.setArrayElement (_value,_i);
 }else {
 BA.debugLineNum = 422;BA.debugLine="Dim intValue As Int=value";
Debug.ShouldStop(32);
_intvalue = BA.numberCast(int.class, _value);Debug.locals.put("intValue", _intvalue);Debug.locals.put("intValue", _intvalue);
 BA.debugLineNum = 423;BA.debugLine="Dim sValue As String=intValue";
Debug.ShouldStop(64);
_svalue = BA.NumberToString(_intvalue);Debug.locals.put("sValue", _svalue);Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 424;BA.debugLine="arr(i)=sValue";
Debug.ShouldStop(128);
_arr.setArrayElement ((_svalue),_i);
 };
 };
 BA.debugLineNum = 427;BA.debugLine="i =i +1";
Debug.ShouldStop(1024);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 430;BA.debugLine="Return arr";
Debug.ShouldStop(8192);
if (true) return _arr;
 BA.debugLineNum = 431;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapvaluestoarrayofstringsconcamposfecha(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("mapValuesToArrayOfStringsConCamposFecha (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,379);
if (RapidSub.canDelegate("mapvaluestoarrayofstringsconcamposfecha")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","mapvaluestoarrayofstringsconcamposfecha", __ref, _m);}
RemoteObject _arr = null;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _key = RemoteObject.declareNull("Object");
RemoteObject _svalue = RemoteObject.createImmutable("");
RemoteObject _intvalue = RemoteObject.createImmutable(0);
Debug.locals.put("m", _m);
 BA.debugLineNum = 379;BA.debugLine="public Sub mapValuesToArrayOfStringsConCamposFecha";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 380;BA.debugLine="Dim arr(m.Size) As String  'array size is double";
Debug.ShouldStop(134217728);
_arr = RemoteObject.createNewArray ("String", new int[] {_m.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arr", _arr);
 BA.debugLineNum = 381;BA.debugLine="Dim i As Int=0";
Debug.ShouldStop(268435456);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 382;BA.debugLine="Dim value As Object";
Debug.ShouldStop(536870912);
_value = RemoteObject.createNew ("Object");Debug.locals.put("value", _value);
 BA.debugLineNum = 383;BA.debugLine="For Each key As Object In m.Keys";
Debug.ShouldStop(1073741824);
{
final RemoteObject group4 = _m.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 385;BA.debugLine="value=m.Get(key)";
Debug.ShouldStop(1);
_value = _m.runMethod(false,"Get",(Object)(_key));Debug.locals.put("value", _value);
 BA.debugLineNum = 386;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
Debug.ShouldStop(2);
crepsolinformacionlogisticaalbaran.__c.runVoidMethod ("LogImpl","899221511",(RemoteObject.concat(RemoteObject.createImmutable("key="),crepsolinformacionlogisticaalbaran.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_key)),RemoteObject.createImmutable(", value="),crepsolinformacionlogisticaalbaran.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable(""))),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 387;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
Debug.ShouldStop(4);
if ((BA.ObjectToString(_key)).runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("FECHA"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 388;BA.debugLine="arr(i)=DateTime.Date(value)";
Debug.ShouldStop(8);
_arr.setArrayElement (crepsolinformacionlogisticaalbaran.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _value))),_i);
 }else {
 BA.debugLineNum = 390;BA.debugLine="If value Is String Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("String"))) { 
 BA.debugLineNum = 391;BA.debugLine="Dim sValue As String=value";
Debug.ShouldStop(64);
_svalue = BA.ObjectToString(_value);Debug.locals.put("sValue", _svalue);Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 392;BA.debugLine="sValue=sValue.Replace(TAB,\"\")";
Debug.ShouldStop(128);
_svalue = _svalue.runMethod(true,"replace",(Object)(crepsolinformacionlogisticaalbaran.__c.getField(true,"TAB")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 393;BA.debugLine="arr(i)=sValue";
Debug.ShouldStop(256);
_arr.setArrayElement (_svalue,_i);
 }else {
 BA.debugLineNum = 395;BA.debugLine="Dim intValue As Int=value";
Debug.ShouldStop(1024);
_intvalue = BA.numberCast(int.class, _value);Debug.locals.put("intValue", _intvalue);Debug.locals.put("intValue", _intvalue);
 BA.debugLineNum = 396;BA.debugLine="Dim sValue As String=intValue";
Debug.ShouldStop(2048);
_svalue = BA.NumberToString(_intvalue);Debug.locals.put("sValue", _svalue);Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 397;BA.debugLine="arr(i)=sValue";
Debug.ShouldStop(4096);
_arr.setArrayElement (_svalue,_i);
 };
 };
 BA.debugLineNum = 400;BA.debugLine="i =i +1";
Debug.ShouldStop(32768);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 403;BA.debugLine="Return arr";
Debug.ShouldStop(262144);
if (true) return (_arr);
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","salirmodulo", __ref);}
 BA.debugLineNum = 44;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlook";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_borrarvbsscriptdireccionremitenteemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="BorrarVBSScriptEnvioEmailOutlook";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_borrarvbsscriptenvioemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="frm.Close";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 48;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(32768);
crepsolinformacionlogisticaalbaran._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seleccionardireccionremitenteemails(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDireccionRemitenteEmails (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,536);
if (RapidSub.canDelegate("seleccionardireccionremitenteemails")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","seleccionardireccionremitenteemails", __ref);}
ResumableSub_SeleccionarDireccionRemitenteEmails rsub = new ResumableSub_SeleccionarDireccionRemitenteEmails(null,__ref);
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
public static class ResumableSub_SeleccionarDireccionRemitenteEmails extends BA.ResumableSub {
public ResumableSub_SeleccionarDireccionRemitenteEmails(b4j.docU.crepsolinformacionlogisticaalbaran parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _sdireccionescuentasemail = RemoteObject.createImmutable("");
RemoteObject _arrdireccionescuentasemail = null;
RemoteObject _lstdireccionescuentasemail = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _idx = 0;
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
int step26;
int limit26;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDireccionRemitenteEmails (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,536);
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
 BA.debugLineNum = 538;BA.debugLine="wait for(EjecutarVBSScriptDireccionesEmail) compl";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), __ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_ejecutarvbsscriptdireccionesemail" /*RemoteObject*/ ));
this.state = 33;
return;
case 33:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 539;BA.debugLine="Log(\"mRes: \" & mRes)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","899549187",RemoteObject.concat(RemoteObject.createImmutable("mRes: "),_mres),0);
 BA.debugLineNum = 540;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
Debug.ShouldStop(134217728);
_success = BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Success")))));Debug.locals.put("Success", _success);Debug.locals.put("Success", _success);
 BA.debugLineNum = 541;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
Debug.ShouldStop(268435456);
_exitcode = BA.numberCast(int.class, _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ExitCode")))));Debug.locals.put("ExitCode", _exitcode);Debug.locals.put("ExitCode", _exitcode);
 BA.debugLineNum = 542;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
Debug.ShouldStop(536870912);
_stdout = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdOut")))));Debug.locals.put("StdOut", _stdout);Debug.locals.put("StdOut", _stdout);
 BA.debugLineNum = 543;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
Debug.ShouldStop(1073741824);
_stderr = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdErr")))));Debug.locals.put("StdErr", _stderr);Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 546;BA.debugLine="If Success=False Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 547;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt direcciones email"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 548;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 4;
;
 BA.debugLineNum = 549;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 551;BA.debugLine="If ExitCode=1 Then";
Debug.ShouldStop(64);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 1))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 552;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt direcciones email"),parent.__c.getField(true,"CRLF"),_stderr)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 553;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 7;
;
 BA.debugLineNum = 554;BA.debugLine="Return False";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 556;BA.debugLine="Dim sDireccionesCuentasEmail As String=StdOut.Sub";
Debug.ShouldStop(2048);
_sdireccionescuentasemail = _stdout.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_stdout.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("sDireccionesCuentasEmail", _sdireccionescuentasemail);Debug.locals.put("sDireccionesCuentasEmail", _sdireccionescuentasemail);
 BA.debugLineNum = 557;BA.debugLine="If sDireccionesCuentasEmail=\"\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_sdireccionescuentasemail,BA.ObjectToString(""))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 558;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay direcciones de email configuradas."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Outlook no instalado?"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 559;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 11;
;
 BA.debugLineNum = 560;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 563;BA.debugLine="Dim ArrDireccionesCuentasEmail() As String=Regex.";
Debug.ShouldStop(262144);
_arrdireccionescuentasemail = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)(_sdireccionescuentasemail));Debug.locals.put("ArrDireccionesCuentasEmail", _arrdireccionescuentasemail);Debug.locals.put("ArrDireccionesCuentasEmail", _arrdireccionescuentasemail);
 BA.debugLineNum = 564;BA.debugLine="Dim lstDireccionesCuentasEmail As List";
Debug.ShouldStop(524288);
_lstdireccionescuentasemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstDireccionesCuentasEmail", _lstdireccionescuentasemail);
 BA.debugLineNum = 565;BA.debugLine="lstDireccionesCuentasEmail.Initialize";
Debug.ShouldStop(1048576);
_lstdireccionescuentasemail.runVoidMethod ("Initialize");
 BA.debugLineNum = 567;BA.debugLine="For iDx =0 To ArrDireccionesCuentasEmail.Length-1";
Debug.ShouldStop(4194304);
if (true) break;

case 12:
//for
this.state = 15;
step26 = 1;
limit26 = RemoteObject.solve(new RemoteObject[] {_arrdireccionescuentasemail.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idx = 0 ;
Debug.locals.put("iDx", _idx);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 15;
if ((step26 > 0 && _idx <= limit26) || (step26 < 0 && _idx >= limit26)) this.state = 14;
if (true) break;

case 38:
//C
this.state = 37;
_idx = ((int)(0 + _idx + step26)) ;
Debug.locals.put("iDx", _idx);
if (true) break;

case 14:
//C
this.state = 38;
 BA.debugLineNum = 568;BA.debugLine="lstDireccionesCuentasEmail.Add(ArrDireccionesCue";
Debug.ShouldStop(8388608);
_lstdireccionescuentasemail.runVoidMethod ("Add",(Object)((_arrdireccionescuentasemail.getArrayElement(true,BA.numberCast(int.class, _idx)))));
 if (true) break;
if (true) break;
Debug.locals.put("iDx", _idx);
;
 BA.debugLineNum = 574;BA.debugLine="If lstDireccionesCuentasEmail.Size=0 Then";
Debug.ShouldStop(536870912);

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_lstdireccionescuentasemail.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 575;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay direcciones de email configuradas."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Outlook no instalado?"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 576;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 18;
;
 BA.debugLineNum = 577;BA.debugLine="Return False";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 582;BA.debugLine="Dialog.Title=\"Selecciona Cuenta para Enviar los E";
Debug.ShouldStop(32);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Cuenta para Enviar los Emails")));
 BA.debugLineNum = 583;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(64);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 584;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(128);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 585;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(256);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 586;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(512);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 587;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(1024);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 589;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(4096);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 590;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(8192);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 591;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(16384);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 593;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(65536);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 594;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(131072);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 596;BA.debugLine="B4XListDlg.Options=lstDireccionesCuentasEmail";
Debug.ShouldStop(524288);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstdireccionescuentasemail);
 BA.debugLineNum = 597;BA.debugLine="B4XListDlg.Resize(600dip,300dip)";
Debug.ShouldStop(1048576);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))));
 BA.debugLineNum = 599;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(4194304);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 606;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(536870912);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 607;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 19:
//if
this.state = 22;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 609;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(1);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 610;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(2);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 611;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(4);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 614;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), _rsub);
this.state = 40;
return;
case 40:
//C
this.state = 23;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 615;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(64);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 618;BA.debugLine="Return False";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 622;BA.debugLine="DireccionSeleccionadaRemitenteEmails=B4XListDlg.S";
Debug.ShouldStop(8192);
__ref.setField ("_direccionseleccionadaremitenteemails" /*RemoteObject*/ ,_b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ ));
 BA.debugLineNum = 624;BA.debugLine="If DireccionSeleccionadaRemitenteEmails=\"atencion";
Debug.ShouldStop(32768);
if (true) break;

case 27:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_direccionseleccionadaremitenteemails" /*RemoteObject*/ ),BA.ObjectToString("atencionalcliente@proin-pinilla.com"))) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
__ref.setField ("_direccionseleccionadaremitenteemails" /*RemoteObject*/ ,BA.ObjectToString("Servicio de Atención al Cliente"));
if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 626;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 669;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _seleccionardocumento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDocumento (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("seleccionardocumento")) { __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","seleccionardocumento", __ref); return;}
ResumableSub_SeleccionarDocumento rsub = new ResumableSub_SeleccionarDocumento(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SeleccionarDocumento extends BA.ResumableSub {
public ResumableSub_SeleccionarDocumento(b4j.docU.crepsolinformacionlogisticaalbaran parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _documento = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rutaficheropdfdocumento = RemoteObject.createImmutable("");
RemoteObject _nombreficheropdfdocumento = RemoteObject.createImmutable("");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _lstlineasalbaran = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idx = RemoteObject.createImmutable(0);
RemoteObject _arrh = null;
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _row = null;
int _i = 0;
RemoteObject _dirficherosalbaranesventarepsol = RemoteObject.createImmutable("");
RemoteObject _nombrefichero = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("b4j.docU.csvparser");
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _rutaficherodocumento = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _sbbody = RemoteObject.createImmutable("");
RemoteObject _emailsubject = RemoteObject.createImmutable("");
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");
RemoteObject group50;
int index50;
int groupLen50;
int step53;
int limit53;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDocumento (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,183);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 185;BA.debugLine="Dialog.Title=\"Indica Documento\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Documento")));
 BA.debugLineNum = 186;BA.debugLine="Dialog.TitleBarHeight=50dip";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 187;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(67108864);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 188;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(134217728);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 189;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(268435456);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 190;BA.debugLine="InputDlg.Text=\"\"";
Debug.ShouldStop(536870912);
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 192;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.ShouldStop(-2147483648);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 193;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(1);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 194;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(2);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 195;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(4);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 196;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(8);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 197;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(16);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 198;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(32);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 199;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _rsub);
this.state = 64;
return;
case 64:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 200;BA.debugLine="If rInt=xui.DialogResponse_Cancel Then Return";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 202;BA.debugLine="Dim Documento As String=InputDlg.Text";
Debug.ShouldStop(512);
_documento = _inputdlg.getField(true,"_text" /*RemoteObject*/ );Debug.locals.put("Documento", _documento);Debug.locals.put("Documento", _documento);
 BA.debugLineNum = 204;BA.debugLine="If Documento=\"\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_documento,BA.ObjectToString(""))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 205;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha indi";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha indicado documento")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 206;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 65;
return;
case 65:
//C
this.state = 10;
;
 BA.debugLineNum = 207;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 210;BA.debugLine="txtDocumento.Text=Documento";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtdocumento" /*RemoteObject*/ ).runMethod(true,"setText",_documento);
 BA.debugLineNum = 212;BA.debugLine="Wait For(CargaRepsolInformacionLogisticaAlbaranVe";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), __ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_cargarepsolinformacionlogisticaalbaranventa" /*RemoteObject*/ ,(Object)(_documento)));
this.state = 66;
return;
case 66:
//C
this.state = 11;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 213;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 214;BA.debugLine="If Accion=\"NOK\" Then Return";
Debug.ShouldStop(2097152);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) return ;
if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 215;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(4194304);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 216;BA.debugLine="Log(lstReg)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","899024929",BA.ObjectToString(_lstreg),0);
 BA.debugLineNum = 218;BA.debugLine="If lstReg.Size=0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_lstreg.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 219;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay datos";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No hay datos en el documento "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_documento))),RemoteObject.createImmutable(" para generar el fichero. Revisar información en navision.")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 220;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 67;
return;
case 67:
//C
this.state = 20;
;
 BA.debugLineNum = 221;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 224;BA.debugLine="Dim RutaFicheroPDFDocumento As String";
Debug.ShouldStop(-2147483648);
_rutaficheropdfdocumento = RemoteObject.createImmutable("");Debug.locals.put("RutaFicheroPDFDocumento", _rutaficheropdfdocumento);
 BA.debugLineNum = 225;BA.debugLine="Dim NombreFicheroPDFDocumento As String=$\"${Docum";
Debug.ShouldStop(1);
_nombreficheropdfdocumento = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_documento))),RemoteObject.createImmutable(".pdf")));Debug.locals.put("NombreFicheroPDFDocumento", _nombreficheropdfdocumento);Debug.locals.put("NombreFicheroPDFDocumento", _nombreficheropdfdocumento);
 BA.debugLineNum = 226;BA.debugLine="If File.Exists(CarpetaFicherosPDF,NombreFicheroPD";
Debug.ShouldStop(2);
if (true) break;

case 21:
//if
this.state = 32;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetaficherospdf" /*RemoteObject*/ )),(Object)(_nombreficheropdfdocumento)).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 32;
 BA.debugLineNum = 227;BA.debugLine="RutaFicheroPDFDocumento=File.Combine(CarpetaFich";
Debug.ShouldStop(4);
_rutaficheropdfdocumento = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_carpetaficherospdf" /*RemoteObject*/ )),(Object)(_nombreficheropdfdocumento));Debug.locals.put("RutaFicheroPDFDocumento", _rutaficheropdfdocumento);
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 229;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"No e";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No existe el fichero "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheropdfdocumento))),RemoteObject.createImmutable(" en la carpeta "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_carpetaficherospdf" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("¿Continuar? (Puedes añadir manualmente el PDF en el email")))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 68;
return;
case 68:
//C
this.state = 26;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 231;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(64);
if (true) break;

case 26:
//if
this.state = 31;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
if (true) return ;
if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 234;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(512);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 235;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(1024);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 237;BA.debugLine="Dim lstLineasAlbaran As List";
Debug.ShouldStop(4096);
_lstlineasalbaran = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstLineasAlbaran", _lstlineasalbaran);
 BA.debugLineNum = 238;BA.debugLine="lstLineasAlbaran.Initialize";
Debug.ShouldStop(8192);
_lstlineasalbaran.runVoidMethod ("Initialize");
 BA.debugLineNum = 240;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
Debug.ShouldStop(32768);
_mdata0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData0", _mdata0);Debug.locals.put("mData0", _mdata0);
 BA.debugLineNum = 242;BA.debugLine="Dim iDX As Int";
Debug.ShouldStop(131072);
_idx = RemoteObject.createImmutable(0);Debug.locals.put("iDX", _idx);
 BA.debugLineNum = 243;BA.debugLine="Dim arrH(mData0.size) As String=mapKeysToArray(mD";
Debug.ShouldStop(262144);
_arrh = __ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_mapkeystoarray" /*RemoteObject*/ ,(Object)(_mdata0));Debug.locals.put("arrH", _arrh);Debug.locals.put("arrH", _arrh);
 BA.debugLineNum = 244;BA.debugLine="lstLineasAlbaran.Add(arrH)";
Debug.ShouldStop(524288);
_lstlineasalbaran.runVoidMethod ("Add",(Object)((_arrh)));
 BA.debugLineNum = 246;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(2097152);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 247;BA.debugLine="For Each mData As Map In lstReg";
Debug.ShouldStop(4194304);
if (true) break;

case 33:
//for
this.state = 40;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group50 = _lstreg;
index50 = 0;
groupLen50 = group50.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 69;
if (true) break;

case 69:
//C
this.state = 40;
if (index50 < groupLen50) {
this.state = 35;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group50.runMethod(false,"Get",index50));Debug.locals.put("mData", _mdata);}
if (true) break;

case 70:
//C
this.state = 69;
index50++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 248;BA.debugLine="Log(mData)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","899024961",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 249;BA.debugLine="Dim row() As Object=mapValuesToArrayOfStringsCon";
Debug.ShouldStop(16777216);
_row = __ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_mapvaluestoarrayofstringsconcamposfecha" /*RemoteObject*/ ,(Object)(_mdata));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 250;BA.debugLine="For i=0 To row.Length-1";
Debug.ShouldStop(33554432);
if (true) break;

case 36:
//for
this.state = 39;
step53 = 1;
limit53 = RemoteObject.solve(new RemoteObject[] {_row.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 71;
if (true) break;

case 71:
//C
this.state = 39;
if ((step53 > 0 && _i <= limit53) || (step53 < 0 && _i >= limit53)) this.state = 38;
if (true) break;

case 72:
//C
this.state = 71;
_i = ((int)(0 + _i + step53)) ;
Debug.locals.put("i", _i);
if (true) break;

case 38:
//C
this.state = 72;
 BA.debugLineNum = 251;BA.debugLine="Log(row(i))";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","899024964",BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, _i))),0);
 if (true) break;
if (true) break;

case 39:
//C
this.state = 70;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 253;BA.debugLine="lstLineasAlbaran.Add(row)";
Debug.ShouldStop(268435456);
_lstlineasalbaran.runVoidMethod ("Add",(Object)((_row)));
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 256;BA.debugLine="DateTime.DateFormat=DateTime.DateFormat";
Debug.ShouldStop(-2147483648);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat"));
 BA.debugLineNum = 259;BA.debugLine="Dim DirFicherosAlbaranesVentaRepsol As String=Car";
Debug.ShouldStop(4);
_dirficherosalbaranesventarepsol = __ref.getField(true,"_carpetaficheroscsv" /*RemoteObject*/ );Debug.locals.put("DirFicherosAlbaranesVentaRepsol", _dirficherosalbaranesventarepsol);Debug.locals.put("DirFicherosAlbaranesVentaRepsol", _dirficherosalbaranesventarepsol);
 BA.debugLineNum = 277;BA.debugLine="Dim NombreFichero As String=$\"${Documento}.csv\"$";
Debug.ShouldStop(1048576);
_nombrefichero = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_documento))),RemoteObject.createImmutable(".csv")));Debug.locals.put("NombreFichero", _nombrefichero);Debug.locals.put("NombreFichero", _nombrefichero);
 BA.debugLineNum = 280;BA.debugLine="Dim parser As CSVParser";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("b4j.docU.csvparser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 281;BA.debugLine="parser.Initialize";
Debug.ShouldStop(16777216);
_parser.runClassMethod (b4j.docU.csvparser.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 282;BA.debugLine="Dim s As String = parser.GenerateString(lstLineas";
Debug.ShouldStop(33554432);
_s = _parser.runClassMethod (b4j.docU.csvparser.class, "_generatestring" /*RemoteObject*/ ,(Object)(_lstlineasalbaran),(Object)(parent.__c.getField(true,"TAB")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 283;BA.debugLine="File.WriteString(DirFicherosAlbaranesVentaRepsol,";
Debug.ShouldStop(67108864);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_dirficherosalbaranesventarepsol),(Object)(_nombrefichero),(Object)(_s));
 BA.debugLineNum = 285;BA.debugLine="Dim RutaFicheroDocumento As String=File.Combine(D";
Debug.ShouldStop(268435456);
_rutaficherodocumento = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dirficherosalbaranesventarepsol),(Object)(_nombrefichero));Debug.locals.put("RutaFicheroDocumento", _rutaficherodocumento);Debug.locals.put("RutaFicheroDocumento", _rutaficherodocumento);
 BA.debugLineNum = 292;BA.debugLine="wait for(SeleccionarDireccionRemitenteEmails) com";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), __ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_seleccionardireccionremitenteemails" /*RemoteObject*/ ));
this.state = 73;
return;
case 73:
//C
this.state = 41;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 293;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(16);
if (true) break;

case 41:
//if
this.state = 50;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 50;
 BA.debugLineNum = 294;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es necesario";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Es necesario seleccionar la dirección desde la que enviar el correo al operador logístico.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 295;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 74;
return;
case 74:
//C
this.state = 50;
;
 BA.debugLineNum = 296;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 298;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"La direcci";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La dirección DESDE la que se enviará el correo será:"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),__ref.getField(true,"_direccionseleccionadaremitenteemails" /*RemoteObject*/ ))),(Object)(BA.ObjectToString("Direccion envío email")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 299;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 75;
return;
case 75:
//C
this.state = 46;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 300;BA.debugLine="Select rInt";
Debug.ShouldStop(2048);
if (true) break;

case 46:
//select
this.state = 49;
switch (BA.switchObjectToInt(_rint,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel"))) {
case 0: {
this.state = 48;
if (true) break;
}
}
if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 302;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 306;BA.debugLine="Dim sbBody As String=HTMLBodyEmail";
Debug.ShouldStop(131072);
_sbbody = __ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_htmlbodyemail" /*RemoteObject*/ );Debug.locals.put("sbBody", _sbbody);Debug.locals.put("sbBody", _sbbody);
 BA.debugLineNum = 307;BA.debugLine="If DireccionCCDestinoEmails=\"\" Then DireccionCCDe";
Debug.ShouldStop(262144);
if (true) break;

case 51:
//if
this.state = 56;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_direccionccdestinoemails" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 53;
;}if (true) break;

case 53:
//C
this.state = 56;
__ref.setField ("_direccionccdestinoemails" /*RemoteObject*/ ,BA.ObjectToString("None"));
if (true) break;

case 56:
//C
this.state = 57;
;
 BA.debugLineNum = 309;BA.debugLine="Dim EmailSubject As String=$\"Albarán venta REPSOL";
Debug.ShouldStop(1048576);
_emailsubject = (RemoteObject.concat(RemoteObject.createImmutable("Albarán venta REPSOL "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_documento))),RemoteObject.createImmutable("")));Debug.locals.put("EmailSubject", _emailsubject);Debug.locals.put("EmailSubject", _emailsubject);
 BA.debugLineNum = 311;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Creando emai";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Creando email...")));
 BA.debugLineNum = 312;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 313;BA.debugLine="wait for(EjecutarVBSScriptEnviarEmail(DireccionSe";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), __ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_ejecutarvbsscriptenviaremail" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_direccionseleccionadaremitenteemails" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_direcciondestinoemails" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_direccionccdestinoemails" /*RemoteObject*/ )),(Object)(_emailsubject),(Object)(_sbbody),(Object)(_rutaficherodocumento),(Object)(_rutaficheropdfdocumento)));
this.state = 76;
return;
case 76:
//C
this.state = 57;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 315;BA.debugLine="Log(\"mRes: \" & mRes)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","899025028",RemoteObject.concat(RemoteObject.createImmutable("mRes: "),_mres),0);
 BA.debugLineNum = 316;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
Debug.ShouldStop(134217728);
_success = BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Success")))));Debug.locals.put("Success", _success);Debug.locals.put("Success", _success);
 BA.debugLineNum = 317;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
Debug.ShouldStop(268435456);
_exitcode = BA.numberCast(int.class, _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ExitCode")))));Debug.locals.put("ExitCode", _exitcode);Debug.locals.put("ExitCode", _exitcode);
 BA.debugLineNum = 318;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
Debug.ShouldStop(536870912);
_stdout = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdOut")))));Debug.locals.put("StdOut", _stdout);Debug.locals.put("StdOut", _stdout);
 BA.debugLineNum = 319;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
Debug.ShouldStop(1073741824);
_stderr = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdErr")))));Debug.locals.put("StdErr", _stderr);Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 320;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 321;BA.debugLine="If Success=False Then";
Debug.ShouldStop(1);
if (true) break;

case 57:
//if
this.state = 60;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 322;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt cre";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt creación de email"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 323;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 77;
return;
case 77:
//C
this.state = 60;
;
 BA.debugLineNum = 324;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 326;BA.debugLine="If ExitCode=1 Then";
Debug.ShouldStop(32);

case 60:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 1))) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 327;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt cre";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt creación email"),parent.__c.getField(true,"CRLF"),_stderr)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 328;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 78;
return;
case 78:
//C
this.state = 63;
;
 BA.debugLineNum = 329;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 63:
//C
this.state = -1;
;
 BA.debugLineNum = 331;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Email creado,";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Email creado, OK")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 332;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 79;
return;
case 79:
//C
this.state = -1;
;
 BA.debugLineNum = 334;BA.debugLine="Wait For(AbrirVentanaOutlookEmail($\"${EmailSubjec";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), __ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_abrirventanaoutlookemail" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emailsubject))),RemoteObject.createImmutable(" - Mensaje(HTML)")))),(Object)(_documento)));
this.state = 80;
return;
case 80:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 337;BA.debugLine="End Sub";
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
public static RemoteObject  _setforegroundwindow(RemoteObject __ref,RemoteObject _title,RemoteObject _justfind) throws Exception{
try {
		Debug.PushSubsStack("SetForegroundWindow (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,845);
if (RapidSub.canDelegate("setforegroundwindow")) { return __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","setforegroundwindow", __ref, _title, _justfind);}
Debug.locals.put("Title", _title);
Debug.locals.put("JustFind", _justfind);
 BA.debugLineNum = 845;BA.debugLine="Sub SetForegroundWindow(Title As String, JustFind";
Debug.ShouldStop(4096);
 BA.debugLineNum = 846;BA.debugLine="Return Me.As(JavaObject).RunMethod(\"SetForeground";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToBoolean((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref)).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("SetForegroundWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_title),(_justfind)}))));
 BA.debugLineNum = 847;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "crepsolinformacionlogisticaalbaran","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.crepsolinformacionlogisticaalbaran parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (crepsolinformacionlogisticaalbaran) ","crepsolinformacionlogisticaalbaran",45,__ref.getField(false, "ba"),__ref,64);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 65;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(1);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 66;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(2);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 67;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(4);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 68;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(8);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 69;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(16);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 70;BA.debugLine="frm.RootPane.LoadLayout(\"scrRepsolInformacionLogi";
Debug.ShouldStop(32);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrRepsolInformacionLogisticaAlbaranVenta")));
 BA.debugLineNum = 73;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Exportación I";
Debug.ShouldStop(256);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Exportación Información Albarán Repsol")));
 BA.debugLineNum = 75;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 76;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 78;BA.debugLine="frm.Show";
Debug.ShouldStop(8192);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 79;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando con";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando configuración...")));
 BA.debugLineNum = 80;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="Wait For(CargaRepsolConfiguracionLogisticaAlbaran";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crepsolinformacionlogisticaalbaran", "show"), __ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_cargarepsolconfiguracionlogisticaalbaranesventa" /*RemoteObject*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 83;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 84;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 85;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 86;BA.debugLine="SalirModulo";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 87;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 89;BA.debugLine="Dim mData As Map=mRes.Get(\"mDataConf\")";
Debug.ShouldStop(16777216);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mDataConf")))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 90;BA.debugLine="CarpetaFicherosCSV=mData.Get(\"CampoString1\")";
Debug.ShouldStop(33554432);
__ref.setField ("_carpetaficheroscsv" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString1"))))));
 BA.debugLineNum = 91;BA.debugLine="CarpetaFicherosPDF=mData.Get(\"CampoString5\")";
Debug.ShouldStop(67108864);
__ref.setField ("_carpetaficherospdf" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString5"))))));
 BA.debugLineNum = 92;BA.debugLine="BuzonCompartidoEmailEnvioInfo=mData.Get(\"CampoStr";
Debug.ShouldStop(134217728);
__ref.setField ("_buzoncompartidoemailenvioinfo" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString2"))))));
 BA.debugLineNum = 93;BA.debugLine="DireccionDestinoEmails=mData.Get(\"CampoString3\")";
Debug.ShouldStop(268435456);
__ref.setField ("_direcciondestinoemails" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString3"))))));
 BA.debugLineNum = 94;BA.debugLine="DireccionCCDestinoEmails=mData.Get(\"CampoString4\"";
Debug.ShouldStop(536870912);
__ref.setField ("_direccionccdestinoemails" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString4"))))));
 BA.debugLineNum = 96;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlook";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_borrarvbsscriptdireccionremitenteemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 97;BA.debugLine="BorrarVBSScriptEnvioEmailOutlook";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_borrarvbsscriptenvioemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 99;BA.debugLine="CrearVBSScriptDireccionRemitenteEmailOutlook";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_crearvbsscriptdireccionremitenteemailoutlook" /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="CrearVBSScriptEnvioEmailOutlookHTML";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.docU.crepsolinformacionlogisticaalbaran.class, "_crearvbsscriptenvioemailoutlookhtml" /*RemoteObject*/ );
 BA.debugLineNum = 102;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 103;BA.debugLine="End Sub";
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
}