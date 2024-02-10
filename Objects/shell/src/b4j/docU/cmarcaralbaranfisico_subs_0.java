package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cmarcaralbaranfisico_subs_0 {


public static RemoteObject  _actualizardocumentofisico(RemoteObject __ref,RemoteObject _docsel) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDocumentoFisico (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("actualizardocumentofisico")) { return __ref.runUserSub(false, "cmarcaralbaranfisico","actualizardocumentofisico", __ref, _docsel);}
ResumableSub_ActualizarDocumentoFisico rsub = new ResumableSub_ActualizarDocumentoFisico(null,__ref,_docsel);
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
public static class ResumableSub_ActualizarDocumentoFisico extends BA.ResumableSub {
public ResumableSub_ActualizarDocumentoFisico(b4j.docU.cmarcaralbaranfisico parent,RemoteObject __ref,RemoteObject _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cmarcaralbaranfisico parent;
RemoteObject _docsel;
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDocumentoFisico (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,170);
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
Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 171;BA.debugLine="Dim Comando As String";
Debug.ShouldStop(1024);
_comando = RemoteObject.createImmutable("");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 172;BA.debugLine="Select True";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("VDEV"))))) {
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
default: {
this.state = 9;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 174;BA.debugLine="Comando=\"ActualizarAlbaranFisicoALBV\"";
Debug.ShouldStop(8192);
_comando = BA.ObjectToString("ActualizarAlbaranFisicoALBV");Debug.locals.put("Comando", _comando);
 if (true) break;

case 5:
//C
this.state = 10;
 BA.debugLineNum = 176;BA.debugLine="Comando=\"ActualizarAlbaranFisicoRT\" ''' pendien";
Debug.ShouldStop(32768);
_comando = BA.ObjectToString("ActualizarAlbaranFisicoRT");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 177;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posi";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Sólo es posible seleccionar documentos tipo ALBV o VDEV.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 178;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "actualizardocumentofisico"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 10;
;
 BA.debugLineNum = 179;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 181;BA.debugLine="Comando=\"ActualizarAlbaranFisicoVDEV\"";
Debug.ShouldStop(1048576);
_comando = BA.ObjectToString("ActualizarAlbaranFisicoVDEV");Debug.locals.put("Comando", _comando);
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 183;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posi";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Sólo es posible seleccionar documentos tipo ALBV o VDEV.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 184;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "actualizardocumentofisico"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 10;
;
 BA.debugLineNum = 185;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 188;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(Co";
Debug.ShouldStop(134217728);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_docsel)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 189;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "actualizardocumentofisico"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 19;
return;
case 19:
//C
this.state = 11;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 190;BA.debugLine="If Success=False Then";
Debug.ShouldStop(536870912);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 191;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar el campo albarán físico para el documento "),_docsel,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 192;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "actualizardocumentofisico"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 16;
;
 BA.debugLineNum = 193;BA.debugLine="Return False";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 195;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
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
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static void  _complete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cmarcaralbaranfisico","btnsalir_click", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="SalirModulo";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.cmarcaralbaranfisico.class, "_salirmodulo" /*RemoteObject*/ );
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
public static RemoteObject  _btnseleccionardocumento_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSeleccionarDocumento_Click (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("btnseleccionardocumento_click")) { return __ref.runUserSub(false, "cmarcaralbaranfisico","btnseleccionardocumento_click", __ref);}
 BA.debugLineNum = 60;BA.debugLine="Private Sub btnSeleccionarDocumento_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="SeleccionarDocumento";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.docU.cmarcaralbaranfisico.class, "_seleccionardocumento" /*void*/ );
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
public static RemoteObject  _checkexistedocumentonav(RemoteObject __ref,RemoteObject _docsel) throws Exception{
try {
		Debug.PushSubsStack("CheckExisteDocumentoNAV (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("checkexistedocumentonav")) { return __ref.runUserSub(false, "cmarcaralbaranfisico","checkexistedocumentonav", __ref, _docsel);}
ResumableSub_CheckExisteDocumentoNAV rsub = new ResumableSub_CheckExisteDocumentoNAV(null,__ref,_docsel);
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
public static class ResumableSub_CheckExisteDocumentoNAV extends BA.ResumableSub {
public ResumableSub_CheckExisteDocumentoNAV(b4j.docU.cmarcaralbaranfisico parent,RemoteObject __ref,RemoteObject _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cmarcaralbaranfisico parent;
RemoteObject _docsel;
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _numdoc = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckExisteDocumentoNAV (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,124);
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
Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 125;BA.debugLine="Dim Comando As String";
Debug.ShouldStop(268435456);
_comando = RemoteObject.createImmutable("");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 126;BA.debugLine="Select True";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("VDEV"))))) {
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
default: {
this.state = 9;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 128;BA.debugLine="Comando=\"CheckExisteDocumentoALBV\"";
Debug.ShouldStop(-2147483648);
_comando = BA.ObjectToString("CheckExisteDocumentoALBV");Debug.locals.put("Comando", _comando);
 if (true) break;

case 5:
//C
this.state = 10;
 BA.debugLineNum = 130;BA.debugLine="Comando=\"CheckExisteDocumentoRT\"";
Debug.ShouldStop(2);
_comando = BA.ObjectToString("CheckExisteDocumentoRT");Debug.locals.put("Comando", _comando);
 if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 132;BA.debugLine="Comando=\"CheckExisteDocumentoVDEV\"";
Debug.ShouldStop(8);
_comando = BA.ObjectToString("CheckExisteDocumentoVDEV");Debug.locals.put("Comando", _comando);
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 134;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posi";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Sólo es posible seleccionar documentos tipo ALBV o VDEV.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 135;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "checkexistedocumentonav"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 10;
;
 BA.debugLineNum = 136;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 139;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(1024);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_docsel)})),(Object)(__ref));
 BA.debugLineNum = 141;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "checkexistedocumentonav"), null);
this.state = 30;
return;
case 30:
//C
this.state = 11;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 143;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(16384);
if (true) break;

case 11:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 28;
 BA.debugLineNum = 144;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 145;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "checkexistedocumentonav"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 28;
;
 BA.debugLineNum = 146;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 148;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(524288);
if (true) break;

case 16:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 27;
 BA.debugLineNum = 149;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El documento";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El documento "),_docsel,RemoteObject.createImmutable(" no existe en navision."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 150;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "checkexistedocumentonav"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 27;
;
 BA.debugLineNum = 151;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 153;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16777216);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 154;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(33554432);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 155;BA.debugLine="Dim NumDoc As Int=mResp.GetValueAt(0)";
Debug.ShouldStop(67108864);
_numdoc = BA.numberCast(int.class, _mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("NumDoc", _numdoc);Debug.locals.put("NumDoc", _numdoc);
 BA.debugLineNum = 156;BA.debugLine="If NumDoc=0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 21:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_numdoc,BA.numberCast(double.class, 0))) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
 BA.debugLineNum = 157;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El document";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El documento "),_docsel,RemoteObject.createImmutable(" no existe en navision."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 158;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "checkexistedocumentonav"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 26;
;
 BA.debugLineNum = 159;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 161;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 166;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
cmarcaralbaranfisico._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cmarcaralbaranfisico._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
cmarcaralbaranfisico._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cmarcaralbaranfisico._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cmarcaralbaranfisico._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cmarcaralbaranfisico._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private Dialog As B4XDialog";
cmarcaralbaranfisico._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cmarcaralbaranfisico._dialog);
 //BA.debugLineNum = 9;BA.debugLine="Private btnSalir As Button";
cmarcaralbaranfisico._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",cmarcaralbaranfisico._btnsalir);
 //BA.debugLineNum = 10;BA.debugLine="Private btnSeleccionarDocumento As Button";
cmarcaralbaranfisico._btnseleccionardocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnseleccionardocumento",cmarcaralbaranfisico._btnseleccionardocumento);
 //BA.debugLineNum = 11;BA.debugLine="Private lblTitleDocumentosActualizados As Label";
cmarcaralbaranfisico._lbltitledocumentosactualizados = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitledocumentosactualizados",cmarcaralbaranfisico._lbltitledocumentosactualizados);
 //BA.debugLineNum = 13;BA.debugLine="Private lstDocumentosActualizados As List";
cmarcaralbaranfisico._lstdocumentosactualizados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstdocumentosactualizados",cmarcaralbaranfisico._lstdocumentosactualizados);
 //BA.debugLineNum = 14;BA.debugLine="Private clvDocumentosActualizados As CustomListVi";
cmarcaralbaranfisico._clvdocumentosactualizados = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvdocumentosactualizados",cmarcaralbaranfisico._clvdocumentosactualizados);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cmarcaralbaranfisico","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 43;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="EventData.Consume";
Debug.ShouldStop(2048);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Initialize (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cmarcaralbaranfisico","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cmarcaralbaranfisico","salirmodulo", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Sub SalirModulo";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="frm.Close";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 53;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(1048576);
cmarcaralbaranfisico._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _seleccionardocumento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDocumento (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("seleccionardocumento")) { __ref.runUserSub(false, "cmarcaralbaranfisico","seleccionardocumento", __ref); return;}
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
public ResumableSub_SeleccionarDocumento(b4j.docU.cmarcaralbaranfisico parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cmarcaralbaranfisico parent;
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _maxnumchar = RemoteObject.createImmutable(0);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _docsel = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _indexdocsel = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _hclv = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDocumento (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,64);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 65;BA.debugLine="Dialog.Title=\"Selecciona Documento\"";
Debug.ShouldStop(1);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Documento")));
 BA.debugLineNum = 66;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(2);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 67;BA.debugLine="Dialog.OverlayColor=0x00FFFFFF";
Debug.ShouldStop(4);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_overlaycolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x00ffffff)));
 BA.debugLineNum = 68;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(8);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 69;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(16);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 70;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(32);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 71;BA.debugLine="InputDlg.Text=\"\"";
Debug.ShouldStop(64);
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 72;BA.debugLine="Dim MaxNumChar As Int=20";
Debug.ShouldStop(128);
_maxnumchar = BA.numberCast(int.class, 20);Debug.locals.put("MaxNumChar", _maxnumchar);Debug.locals.put("MaxNumChar", _maxnumchar);
 BA.debugLineNum = 73;BA.debugLine="InputDlg.RegexPattern=\"^.{\" & 5 & \",\" & MaxNumCha";
Debug.ShouldStop(256);
_inputdlg.setField ("_regexpattern" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("^.{"),RemoteObject.createImmutable(5),RemoteObject.createImmutable(","),_maxnumchar,RemoteObject.createImmutable("}$")));
 BA.debugLineNum = 74;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.ShouldStop(512);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 75;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(1024);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 76;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(2048);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 77;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(4096);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 78;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(8192);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 79;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(16384);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 80;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(32768);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 81;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "seleccionardocumento"), _rsub);
this.state = 31;
return;
case 31:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 83;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(262144);
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
this.state = 7;
;
 BA.debugLineNum = 84;BA.debugLine="Dim DocSel As String=InputDlg.Text.Trim.ToUpperCa";
Debug.ShouldStop(524288);
_docsel = _inputdlg.getField(true,"_text" /*RemoteObject*/ ).runMethod(true,"trim").runMethod(true,"toUpperCase");Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 86;BA.debugLine="If DocSel.StartsWith(\"ALBV\")=False And DocSel.Sta";
Debug.ShouldStop(2097152);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("VDEV"))),parent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 87;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posib";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Sólo es posible actualizar documentos de tipo ALBV y VDEV")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 88;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "seleccionardocumento"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 10;
;
 BA.debugLineNum = 89;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 92;BA.debugLine="Wait For(CheckExisteDocumentoNAV(DocSel)) complet";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "seleccionardocumento"), __ref.runClassMethod (b4j.docU.cmarcaralbaranfisico.class, "_checkexistedocumentonav" /*RemoteObject*/ ,(Object)(_docsel)));
this.state = 33;
return;
case 33:
//C
this.state = 11;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 93;BA.debugLine="If rBool=False Then Return";
Debug.ShouldStop(268435456);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
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
 BA.debugLineNum = 95;BA.debugLine="Wait For(ActualizarDocumentoFisico(DocSel)) compl";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "seleccionardocumento"), __ref.runClassMethod (b4j.docU.cmarcaralbaranfisico.class, "_actualizardocumentofisico" /*RemoteObject*/ ,(Object)(_docsel)));
this.state = 34;
return;
case 34:
//C
this.state = 17;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 96;BA.debugLine="If rBool=False Then Return";
Debug.ShouldStop(-2147483648);
if (true) break;

case 17:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
if (true) return ;
if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 98;BA.debugLine="Dim IndexDocSel As Int=lstDocumentosActualizados.";
Debug.ShouldStop(2);
_indexdocsel = __ref.getField(false,"_lstdocumentosactualizados" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_docsel)));Debug.locals.put("IndexDocSel", _indexdocsel);Debug.locals.put("IndexDocSel", _indexdocsel);
 BA.debugLineNum = 99;BA.debugLine="If IndexDocSel>-1 Then";
Debug.ShouldStop(4);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean(">",_indexdocsel,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 100;BA.debugLine="lstDocumentosActualizados.RemoveAt(IndexDocSel)";
Debug.ShouldStop(8);
__ref.getField(false,"_lstdocumentosactualizados" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_indexdocsel));
 BA.debugLineNum = 101;BA.debugLine="clvDocumentosActualizados.RemoveAt(IndexDocSel)";
Debug.ShouldStop(16);
__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(_indexdocsel));
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 103;BA.debugLine="lstDocumentosActualizados.Add(DocSel)";
Debug.ShouldStop(64);
__ref.getField(false,"_lstdocumentosactualizados" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_docsel)));
 BA.debugLineNum = 104;BA.debugLine="clvDocumentosActualizados.AddTextItem(DocSel,DocS";
Debug.ShouldStop(128);
__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)((_docsel)),(Object)((_docsel)));
 BA.debugLineNum = 105;BA.debugLine="Dim p As B4XView=clvDocumentosActualizados.GetPan";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 106;BA.debugLine="Dim hClv As Int=Min(0.75*(frm.RootPane.Height-clv";
Debug.ShouldStop(512);
_hclv = BA.numberCast(int.class, parent.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.75),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(true,"getHeight"),__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getTop")}, "-",1, 0))}, "*",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getHeight"),__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(true,"_getdividersize")}, "+",1, 0)),__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(true,"_getsize"),__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(true,"_getdividersize"),RemoteObject.createImmutable(2)}, "*+*",1, 0))));Debug.locals.put("hClv", _hclv);Debug.locals.put("hClv", _hclv);
 BA.debugLineNum = 107;BA.debugLine="clvDocumentosActualizados.Base_Resize(clvDocument";
Debug.ShouldStop(1024);
__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, _hclv)));
 BA.debugLineNum = 108;BA.debugLine="clvDocumentosActualizados.AsView.Height=hClv";
Debug.ShouldStop(2048);
__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setHeight",BA.numberCast(double.class, _hclv));
 BA.debugLineNum = 110;BA.debugLine="Sleep(100)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "seleccionardocumento"),BA.numberCast(int.class, 100));
this.state = 35;
return;
case 35:
//C
this.state = 27;
;
 BA.debugLineNum = 111;BA.debugLine="clvDocumentosActualizados.ScrollToItem(clvDocumen";
Debug.ShouldStop(16384);
__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 114;BA.debugLine="If lstDocumentosActualizados.Size>0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 27:
//if
this.state = 30;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstdocumentosactualizados" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 115;BA.debugLine="lblTitleDocumentosActualizados.Visible=True";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbltitledocumentosactualizados" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 116;BA.debugLine="clvDocumentosActualizados.AsView.Visible=True";
Debug.ShouldStop(524288);
__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 120;BA.debugLine="SeleccionarDocumento";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.cmarcaralbaranfisico.class, "_seleccionardocumento" /*void*/ );
 BA.debugLineNum = 122;BA.debugLine="End Sub";
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
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cmarcaralbaranfisico","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cmarcaralbaranfisico parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cmarcaralbaranfisico parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cmarcaralbaranfisico) ","cmarcaralbaranfisico",41,__ref.getField(false, "ba"),__ref,22);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 23;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 24;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(8388608);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 25;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(16777216);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 26;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(33554432);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 27;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(67108864);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 28;BA.debugLine="frm.RootPane.LoadLayout(\"scrMarcarAlbaranFisico\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrMarcarAlbaranFisico")));
 BA.debugLineNum = 29;BA.debugLine="Sleep(0)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmarcaralbaranfisico", "show"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 30;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"   \" & \"Marca";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("   "),RemoteObject.createImmutable("Marcar documentos NAVISION con Albaran Físico=Sí")));
 BA.debugLineNum = 32;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 34;BA.debugLine="lstDocumentosActualizados.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_lstdocumentosactualizados" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 36;BA.debugLine="lblTitleDocumentosActualizados.Visible=False";
Debug.ShouldStop(8);
__ref.getField(false,"_lbltitledocumentosactualizados" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 37;BA.debugLine="clvDocumentosActualizados.AsView.Visible=False";
Debug.ShouldStop(16);
__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 38;BA.debugLine="clvDocumentosActualizados.Base_Resize(clvDocument";
Debug.ShouldStop(32);
__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(__ref.getField(false,"_clvdocumentosactualizados" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 40;BA.debugLine="frm.Show";
Debug.ShouldStop(128);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 41;BA.debugLine="End Sub";
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
}