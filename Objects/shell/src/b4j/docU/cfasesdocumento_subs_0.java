package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfasesdocumento_subs_0 {


public static RemoteObject  _actualizardatosnavdocumentosel(RemoteObject __ref,RemoteObject _docsel) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosNavDocumentoSel (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,635);
if (RapidSub.canDelegate("actualizardatosnavdocumentosel")) { return __ref.runUserSub(false, "cfasesdocumento","actualizardatosnavdocumentosel", __ref, _docsel);}
ResumableSub_ActualizarDatosNavDocumentoSel rsub = new ResumableSub_ActualizarDatosNavDocumentoSel(null,__ref,_docsel);
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
public static class ResumableSub_ActualizarDatosNavDocumentoSel extends BA.ResumableSub {
public ResumableSub_ActualizarDatosNavDocumentoSel(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _docsel;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosNavDocumentoSel (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,635);
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
 BA.debugLineNum = 637;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(268435456);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 638;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(536870912);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 639;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 640;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
Debug.ShouldStop(-2147483648);
_slinkjrdc = parent._main._rdclinknav /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 641;BA.debugLine="Dim Comando As String";
Debug.ShouldStop(1);
_comando = RemoteObject.createImmutable("");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 642;BA.debugLine="Select True";
Debug.ShouldStop(2);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("CDEV"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("OSUB"))))) {
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
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 644;BA.debugLine="Comando=\"CabFasesALBV\"";
Debug.ShouldStop(8);
_comando = BA.ObjectToString("CabFasesALBV");Debug.locals.put("Comando", _comando);
 if (true) break;

case 5:
//C
this.state = 12;
 BA.debugLineNum = 646;BA.debugLine="Comando=\"CabFasesRT\"";
Debug.ShouldStop(32);
_comando = BA.ObjectToString("CabFasesRT");Debug.locals.put("Comando", _comando);
 if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 648;BA.debugLine="Comando=\"CabFasesCDEV\"";
Debug.ShouldStop(128);
_comando = BA.ObjectToString("CabFasesCDEV");Debug.locals.put("Comando", _comando);
 if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 650;BA.debugLine="Comando=\"CabFasesProduccionPC\"";
Debug.ShouldStop(512);
_comando = BA.ObjectToString("CabFasesProduccionPC");Debug.locals.put("Comando", _comando);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 652;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(DocSel & \" no";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_docsel,RemoteObject.createImmutable(" no es un documento no válido."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("(sólo ALBV,RT,CDEV, Y OSUB.)"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 653;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizardatosnavdocumentosel"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 12;
;
 BA.debugLineNum = 654;BA.debugLine="mRes.Put(\"Accion\", \"NOK\")";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((RemoteObject.createImmutable("NOK"))));
 BA.debugLineNum = 655;BA.debugLine="Return mRes";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 658;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DocSe";
Debug.ShouldStop(131072);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_docsel)})),(Object)(__ref));
 BA.debugLineNum = 660;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizardatosnavdocumentosel"), null);
this.state = 26;
return;
case 26:
//C
this.state = 13;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 661;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1048576);
if (true) break;

case 13:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 24;
 BA.debugLineNum = 662;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 663;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizardatosnavdocumentosel"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 24;
;
 BA.debugLineNum = 664;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 665;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 668;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(134217728);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 669;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 670;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 671;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay datos en NAVISION para el documento seleccionado ("),_docsel,RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 672;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizardatosnavdocumentosel"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 674;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 675;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 678;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(32);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 679;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 689;BA.debugLine="Return mRes";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 690;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _actualizardatostotalesdocumentosel(RemoteObject __ref,RemoteObject _docsel) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosTotalesDocumentoSel (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,479);
if (RapidSub.canDelegate("actualizardatostotalesdocumentosel")) { return __ref.runUserSub(false, "cfasesdocumento","actualizardatostotalesdocumentosel", __ref, _docsel);}
ResumableSub_ActualizarDatosTotalesDocumentoSel rsub = new ResumableSub_ActualizarDatosTotalesDocumentoSel(null,__ref,_docsel);
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
public static class ResumableSub_ActualizarDatosTotalesDocumentoSel extends BA.ResumableSub {
public ResumableSub_ActualizarDatosTotalesDocumentoSel(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _docsel;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _osubrt = RemoteObject.createImmutable("");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject group43;
int index43;
int groupLen43;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosTotalesDocumentoSel (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,479);
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
 BA.debugLineNum = 480;BA.debugLine="OSUBTaller=\"\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_osubtaller" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 481;BA.debugLine="Wait For(ActualizarDatosNavDocumentoSel(DocSel))";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), __ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_actualizardatosnavdocumentosel" /*RemoteObject*/ ,(Object)(_docsel)));
this.state = 58;
return;
case 58:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 482;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(2);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 483;BA.debugLine="If Accion=\"NOK\" Then Return False";
Debug.ShouldStop(4);
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
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 484;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(8);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 485;BA.debugLine="If lstReg.Size=0 Then Return False";
Debug.ShouldStop(16);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_lstreg.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
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
 BA.debugLineNum = 486;BA.debugLine="Dim mData As Map=lstReg.Get(0)";
Debug.ShouldStop(32);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 487;BA.debugLine="Log(mData)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","831064072",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 488;BA.debugLine="txtDocumento.Text=mDocumentoSel";
Debug.ShouldStop(128);
__ref.getField(false,"_txtdocumento" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ));
 BA.debugLineNum = 489;BA.debugLine="Select True";
Debug.ShouldStop(256);
if (true) break;

case 13:
//select
this.state = 22;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("CDEV"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("OSUB"))))) {
case 0: {
this.state = 15;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
case 2: {
this.state = 19;
if (true) break;
}
case 3: {
this.state = 21;
if (true) break;
}
}
if (true) break;

case 15:
//C
this.state = 22;
 BA.debugLineNum = 491;BA.debugLine="lblTitleCodigoDestinoDoc.Text=\"Cliente\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbltitlecodigodestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Cliente"));
 BA.debugLineNum = 492;BA.debugLine="lblTitleNombreDestinoDoc.Text=\"Nombre Cliente\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbltitlenombredestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Nombre Cliente"));
 BA.debugLineNum = 493;BA.debugLine="txtCodigoDestinoDoc.Text=mData.Get(\"Destinatari";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtcodigodestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Destinatario"))))));
 BA.debugLineNum = 494;BA.debugLine="txtNombreDestinoDoc.Text=mData.Get(\"NombreDesti";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtnombredestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreDestinatario"))))));
 if (true) break;

case 17:
//C
this.state = 22;
 BA.debugLineNum = 496;BA.debugLine="lblTitleCodigoDestinoDoc.Text=\"Codigo\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbltitlecodigodestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Codigo"));
 BA.debugLineNum = 497;BA.debugLine="lblTitleNombreDestinoDoc.Text=\"Nombre Destinata";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbltitlenombredestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Nombre Destinatario"));
 BA.debugLineNum = 498;BA.debugLine="txtCodigoDestinoDoc.Text=mData.Get(\"Destinatari";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtcodigodestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Destinatario"))))));
 BA.debugLineNum = 499;BA.debugLine="txtNombreDestinoDoc.Text=mData.Get(\"NombreDesti";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtnombredestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreDestinatario"))))));
 if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 501;BA.debugLine="lblTitleCodigoDestinoDoc.Text=\"Proveedor\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbltitlecodigodestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Proveedor"));
 BA.debugLineNum = 502;BA.debugLine="lblTitleNombreDestinoDoc.Text=\"Nombre Proveedor";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbltitlenombredestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Nombre Proveedor"));
 BA.debugLineNum = 503;BA.debugLine="txtCodigoDestinoDoc.Text=mData.Get(\"Destinatari";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtcodigodestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Destinatario"))))));
 BA.debugLineNum = 504;BA.debugLine="txtNombreDestinoDoc.Text=mData.Get(\"NombreDesti";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtnombredestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreDestinatario"))))));
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 506;BA.debugLine="lblTitleCodigoDestinoDoc.Text=\"Proveedor\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lbltitlecodigodestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Proveedor"));
 BA.debugLineNum = 507;BA.debugLine="lblTitleNombreDestinoDoc.Text=\"Nombre Proveedor";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbltitlenombredestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Nombre Proveedor"));
 BA.debugLineNum = 508;BA.debugLine="txtCodigoDestinoDoc.Text=mData.Get(\"Proveedor\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtcodigodestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Proveedor"))))));
 BA.debugLineNum = 509;BA.debugLine="txtNombreDestinoDoc.Text=mData.Get(\"NombreProve";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtnombredestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreProveedor"))))));
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 513;BA.debugLine="txtFechaDocumento.Text=mData.Get(\"Fecha\")";
Debug.ShouldStop(1);
__ref.getField(false,"_txtfechadocumento" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fecha"))))));
 BA.debugLineNum = 515;BA.debugLine="If DocSel.StartsWith(\"RT\") Then";
Debug.ShouldStop(4);
if (true) break;

case 23:
//if
this.state = 26;
if (_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))).<Boolean>get().booleanValue()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 516;BA.debugLine="Dim OsubRT As String=mData.Get(\"PedidoFab\")";
Debug.ShouldStop(8);
_osubrt = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PedidoFab")))));Debug.locals.put("OsubRT", _osubrt);Debug.locals.put("OsubRT", _osubrt);
 BA.debugLineNum = 517;BA.debugLine="DestinatarioTaller=OsubRT<>\"\"";
Debug.ShouldStop(16);
__ref.setField ("_destinatariotaller" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("!",_osubrt,BA.ObjectToString(""))));
 BA.debugLineNum = 518;BA.debugLine="OSUBTaller=OsubRT";
Debug.ShouldStop(32);
__ref.setField ("_osubtaller" /*RemoteObject*/ ,_osubrt);
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 521;BA.debugLine="JamTableCLVFasesDoc.Clear";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 523;BA.debugLine="Wait For(ActualizarFasesDocumentoSel(DocSel)) com";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), __ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_actualizarfasesdocumentosel" /*RemoteObject*/ ,(Object)(_docsel)));
this.state = 59;
return;
case 59:
//C
this.state = 27;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 524;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 525;BA.debugLine="If Accion=\"NOK\" Then Return False";
Debug.ShouldStop(4096);
if (true) break;

case 27:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 526;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(8192);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 527;BA.debugLine="For Each mData As Map In lstReg";
Debug.ShouldStop(16384);
if (true) break;

case 33:
//for
this.state = 36;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group43 = _lstreg;
index43 = 0;
groupLen43 = group43.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 60;
if (true) break;

case 60:
//C
this.state = 36;
if (index43 < groupLen43) {
this.state = 35;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group43.runMethod(false,"Get",index43));Debug.locals.put("mData", _mdata);}
if (true) break;

case 61:
//C
this.state = 60;
index43++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 35:
//C
this.state = 61;
 BA.debugLineNum = 528;BA.debugLine="Log(mData)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","831064113",BA.ObjectToString(_mdata),0);
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 531;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 533;BA.debugLine="Dim rSub As ResumableSub=JamTableCLVFasesDoc.setd";
Debug.ShouldStop(1048576);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setdata" /*RemoteObject*/ ,(Object)((_lstreg.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 534;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), _rsub);
this.state = 62;
return;
case 62:
//C
this.state = 37;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 535;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(4194304);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 536;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 37:
//if
this.state = 57;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 537;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(16777216);
if (true) break;

case 40:
//if
this.state = 47;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 538;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 539;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), _msa);
this.state = 63;
return;
case 63:
//C
this.state = 43;
;
 BA.debugLineNum = 541;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 542;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 43;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 543;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 43:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 544;BA.debugLine="JamTableCLVFasesDoc.AbrirCamposBuilder";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 545;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 46:
//C
this.state = 47;
;
 BA.debugLineNum = 548;BA.debugLine="ExitApplication";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 550;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(32);

case 47:
//if
this.state = 56;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 551;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(64);
if (true) break;

case 50:
//if
this.state = 55;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 52;
;}if (true) break;

case 52:
//C
this.state = 55;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 55:
//C
this.state = 56;
;
 BA.debugLineNum = 552;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 553;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), _msa);
this.state = 65;
return;
case 65:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = 57;
;
 if (true) break;

case 57:
//C
this.state = -1;
;
 BA.debugLineNum = 558;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _actualizarfaseactualdocumentosel(RemoteObject __ref,RemoteObject _docsel) throws Exception{
try {
		Debug.PushSubsStack("ActualizarFaseActualDocumentoSel (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,701);
if (RapidSub.canDelegate("actualizarfaseactualdocumentosel")) { return __ref.runUserSub(false, "cfasesdocumento","actualizarfaseactualdocumentosel", __ref, _docsel);}
ResumableSub_ActualizarFaseActualDocumentoSel rsub = new ResumableSub_ActualizarFaseActualDocumentoSel(null,__ref,_docsel);
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
public static class ResumableSub_ActualizarFaseActualDocumentoSel extends BA.ResumableSub {
public ResumableSub_ActualizarFaseActualDocumentoSel(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _docsel;
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
		Debug.PushSubsStack("ActualizarFaseActualDocumentoSel (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,701);
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
 BA.debugLineNum = 703;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1073741824);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 704;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(-2147483648);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 705;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 706;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(2);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 707;BA.debugLine="Dim Comando As String=\"FaseActualDocumentoSP\"";
Debug.ShouldStop(4);
_comando = BA.ObjectToString("FaseActualDocumentoSP");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 710;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DocSe";
Debug.ShouldStop(32);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_docsel)})),(Object)(__ref));
 BA.debugLineNum = 712;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizarfaseactualdocumentosel"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 713;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 714;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 715;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizarfaseactualdocumentosel"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 716;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 717;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 720;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 721;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 722;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 723;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay datos en NAVISION para el documento seleccionado ("),_docsel,RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 724;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizarfaseactualdocumentosel"), _msa);
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
 BA.debugLineNum = 726;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 727;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 728;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8388608);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 729;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 732;BA.debugLine="Return mRes";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 733;BA.debugLine="End Sub";
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
public static RemoteObject  _actualizarfasesdocumentosel(RemoteObject __ref,RemoteObject _docsel) throws Exception{
try {
		Debug.PushSubsStack("ActualizarFasesDocumentoSel (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,735);
if (RapidSub.canDelegate("actualizarfasesdocumentosel")) { return __ref.runUserSub(false, "cfasesdocumento","actualizarfasesdocumentosel", __ref, _docsel);}
ResumableSub_ActualizarFasesDocumentoSel rsub = new ResumableSub_ActualizarFasesDocumentoSel(null,__ref,_docsel);
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
public static class ResumableSub_ActualizarFasesDocumentoSel extends BA.ResumableSub {
public ResumableSub_ActualizarFasesDocumentoSel(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _docsel;
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
		Debug.PushSubsStack("ActualizarFasesDocumentoSel (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,735);
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
 BA.debugLineNum = 737;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 738;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(2);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 739;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 740;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(8);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 741;BA.debugLine="Dim Comando As String=\"FasesDocNoCorregidasDateTi";
Debug.ShouldStop(16);
_comando = BA.ObjectToString("FasesDocNoCorregidasDateTime");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 744;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DocSe";
Debug.ShouldStop(128);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_docsel)})),(Object)(__ref));
 BA.debugLineNum = 746;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizarfasesdocumentosel"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 747;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 748;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 749;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizarfasesdocumentosel"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 750;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 751;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 754;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 755;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 756;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 757;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(1048576);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 758;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(2097152);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 759;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 760;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay datos de fases para el documento seleccionado ("),_docsel,RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 761;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "actualizarfasesdocumentosel"), _msa);
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
 BA.debugLineNum = 763;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 764;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 765;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(268435456);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 766;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 769;BA.debugLine="Return mRes";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
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
public static void  _anularfase(RemoteObject __ref,RemoteObject _mdata) throws Exception{
try {
		Debug.PushSubsStack("AnularFase (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,854);
if (RapidSub.canDelegate("anularfase")) { __ref.runUserSub(false, "cfasesdocumento","anularfase", __ref, _mdata); return;}
ResumableSub_AnularFase rsub = new ResumableSub_AnularFase(null,__ref,_mdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AnularFase extends BA.ResumableSub {
public ResumableSub_AnularFase(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _mdata) {
this.parent = parent;
this.__ref = __ref;
this._mdata = _mdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _mdata;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _faseactiva = RemoteObject.createImmutable(false);
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AnularFase (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,854);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 856;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Anular mov";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Anular movimiento seleccionado?")),(Object)(BA.ObjectToString("Anulación de Fase")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 857;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularfase"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 858;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 867;BA.debugLine="Dim FaseActiva As Boolean=1=mData.Get(\"Mov\")";
Debug.ShouldStop(4);
_faseactiva = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable(1),BA.numberCast(double.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Mov")))))));Debug.locals.put("FaseActiva", _faseactiva);Debug.locals.put("FaseActiva", _faseactiva);
 BA.debugLineNum = 868;BA.debugLine="If FaseActiva=False Then";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_faseactiva,parent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 869;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo se puede";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Sólo se puede anular la última fase del documento.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 870;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularfase"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 10;
;
 BA.debugLineNum = 871;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 874;BA.debugLine="If DestinatarioTaller Then";
Debug.ShouldStop(512);

case 10:
//if
this.state = 27;
if (__ref.getField(true,"_destinatariotaller" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 875;BA.debugLine="wait for (AnularMovimientoFaseRTFab(mData.Get(\"I";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularfase"), __ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_anularmovimientofasertfab" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDMov")))))),(Object)(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_osubtaller" /*RemoteObject*/ ))));
this.state = 36;
return;
case 36:
//C
this.state = 13;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
;
 BA.debugLineNum = 876;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(2048);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) return ;
if (true) break;

case 18:
//C
this.state = 27;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 878;BA.debugLine="wait for (AnularMovimientoFaseDoc(mData.Get(\"IDM";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularfase"), __ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_anularmovimientofasedoc" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDMov")))))),(Object)(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0))));
this.state = 37;
return;
case 37:
//C
this.state = 21;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
;
 BA.debugLineNum = 879;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(16384);
if (true) break;

case 21:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 23;
;}if (true) break;

case 23:
//C
this.state = 26;
if (true) return ;
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
 BA.debugLineNum = 881;BA.debugLine="Wait For(ActualizarDatosTotalesDocumentoSel(mDocu";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularfase"), __ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_actualizardatostotalesdocumentosel" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ))));
this.state = 38;
return;
case 38:
//C
this.state = 28;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 882;BA.debugLine="If Success=False Then SalirModulo";
Debug.ShouldStop(131072);
if (true) break;

case 28:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_salirmodulo" /*RemoteObject*/ );
if (true) break;

case 33:
//C
this.state = -1;
;
 BA.debugLineNum = 883;BA.debugLine="End Sub";
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
public static RemoteObject  _anularmovimientofasedoc(RemoteObject __ref,RemoteObject _idmov,RemoteObject _doc,RemoteObject _idu) throws Exception{
try {
		Debug.PushSubsStack("AnularMovimientoFaseDoc (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,928);
if (RapidSub.canDelegate("anularmovimientofasedoc")) { return __ref.runUserSub(false, "cfasesdocumento","anularmovimientofasedoc", __ref, _idmov, _doc, _idu);}
ResumableSub_AnularMovimientoFaseDoc rsub = new ResumableSub_AnularMovimientoFaseDoc(null,__ref,_idmov,_doc,_idu);
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
public static class ResumableSub_AnularMovimientoFaseDoc extends BA.ResumableSub {
public ResumableSub_AnularMovimientoFaseDoc(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _idmov,RemoteObject _doc,RemoteObject _idu) {
this.parent = parent;
this.__ref = __ref;
this._idmov = _idmov;
this._doc = _doc;
this._idu = _idu;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _idmov;
RemoteObject _doc;
RemoteObject _idu;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AnularMovimientoFaseDoc (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,928);
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
Debug.locals.put("IDMov", _idmov);
Debug.locals.put("Doc", _doc);
Debug.locals.put("IDU", _idu);
 BA.debugLineNum = 929;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 932;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(8);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 933;BA.debugLine="Dim Comando As String=\"AnularFase\"";
Debug.ShouldStop(16);
_comando = BA.ObjectToString("AnularFase");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 936;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDMov";
Debug.ShouldStop(128);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_idmov),(_doc),(_idu)})),(Object)(__ref));
 BA.debugLineNum = 938;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularmovimientofasedoc"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 939;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 940;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 941;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularmovimientofasedoc"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 942;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 946;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(131072);
if (true) break;

case 6:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 947;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 949;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible anular la fase.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 950;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularmovimientofasedoc"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 952;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 953;BA.debugLine="Dim lstRes As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16777216);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 954;BA.debugLine="Dim mResp As Map=lstRes.Get(0)";
Debug.ShouldStop(33554432);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 955;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(67108864);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 956;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
Debug.ShouldStop(134217728);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 957;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 959;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible ."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 960;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularmovimientofasedoc"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 962;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
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
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 967;BA.debugLine="Return Accion";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 968;BA.debugLine="End Sub";
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
public static RemoteObject  _anularmovimientofasertfab(RemoteObject __ref,RemoteObject _idmov,RemoteObject _doc,RemoteObject _idu,RemoteObject _osub) throws Exception{
try {
		Debug.PushSubsStack("AnularMovimientoFaseRTFab (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,886);
if (RapidSub.canDelegate("anularmovimientofasertfab")) { return __ref.runUserSub(false, "cfasesdocumento","anularmovimientofasertfab", __ref, _idmov, _doc, _idu, _osub);}
ResumableSub_AnularMovimientoFaseRTFab rsub = new ResumableSub_AnularMovimientoFaseRTFab(null,__ref,_idmov,_doc,_idu,_osub);
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
public static class ResumableSub_AnularMovimientoFaseRTFab extends BA.ResumableSub {
public ResumableSub_AnularMovimientoFaseRTFab(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _idmov,RemoteObject _doc,RemoteObject _idu,RemoteObject _osub) {
this.parent = parent;
this.__ref = __ref;
this._idmov = _idmov;
this._doc = _doc;
this._idu = _idu;
this._osub = _osub;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _idmov;
RemoteObject _doc;
RemoteObject _idu;
RemoteObject _osub;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AnularMovimientoFaseRTFab (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,886);
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
Debug.locals.put("IDMov", _idmov);
Debug.locals.put("Doc", _doc);
Debug.locals.put("IDU", _idu);
Debug.locals.put("OSUB", _osub);
 BA.debugLineNum = 887;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4194304);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 890;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(33554432);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 891;BA.debugLine="Dim Comando As String=\"AnularFaseRTFab\"";
Debug.ShouldStop(67108864);
_comando = BA.ObjectToString("AnularFaseRTFab");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 894;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDMov";
Debug.ShouldStop(536870912);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_idmov),(_doc),(_idu),(_osub)})),(Object)(__ref));
 BA.debugLineNum = 896;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularmovimientofasertfab"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 897;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 898;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 899;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularmovimientofasertfab"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 900;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 904;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(128);
if (true) break;

case 6:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 905;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(256);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 907;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible anular la fase.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 908;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularmovimientofasertfab"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 910;BA.debugLine="Dim lstRes As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(8192);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 911;BA.debugLine="Dim mResp As Map=lstRes.Get(0)";
Debug.ShouldStop(16384);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 912;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(32768);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 913;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
Debug.ShouldStop(65536);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 914;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 916;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible ."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 917;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "anularmovimientofasertfab"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 919;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
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
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 925;BA.debugLine="Return Accion";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 926;BA.debugLine="End Sub";
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
public static RemoteObject  _background_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Background_MouseClicked (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("background_mouseclicked")) { return __ref.runUserSub(false, "cfasesdocumento","background_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 60;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="EventData.Consume";
Debug.ShouldStop(268435456);
_eventdata.runVoidMethod ("Consume");
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
public static void  _btnaccionesfase_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnAccionesFase_Click (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,560);
if (RapidSub.canDelegate("btnaccionesfase_click")) { __ref.runUserSub(false, "cfasesdocumento","btnaccionesfase_click", __ref); return;}
ResumableSub_btnAccionesFase_Click rsub = new ResumableSub_btnAccionesFase_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnAccionesFase_Click extends BA.ResumableSub {
public ResumableSub_btnAccionesFase_Click(b4j.docU.cfasesdocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
RemoteObject _offset_before_dialog = RemoteObject.createImmutable(0f);
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fasesel = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
int _i = 0;
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _accionfase = RemoteObject.createImmutable("");
int step27;
int limit27;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnAccionesFase_Click (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,560);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 562;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(131072);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 563;BA.debugLine="Dim mData As Map=JamTableCLVFasesDoc.GetValue(Jam";
Debug.ShouldStop(262144);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 564;BA.debugLine="Log(mData)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","831129604",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 565;BA.debugLine="Dim IndexSel As Int=JamTableCLVFasesDoc.GetItemFr";
Debug.ShouldStop(1048576);
_indexsel = __ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 566;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLVFa";
Debug.ShouldStop(2097152);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 568;BA.debugLine="Dialog.Title=\"Selecciona Acción\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Acción")));
 BA.debugLineNum = 569;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 570;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 571;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(67108864);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 572;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(134217728);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 573;BA.debugLine="Utilidades.SetLightThemeList(B4XListDlg)";
Debug.ShouldStop(268435456);
parent._utilidades.runVoidMethod ("_setlightthemelist" /*RemoteObject*/ ,(Object)(_b4xlistdlg));
 BA.debugLineNum = 575;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(1073741824);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 576;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(-2147483648);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 577;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
Debug.ShouldStop(1);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 579;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(4);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 580;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(8);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 582;BA.debugLine="Dim lstOpciones As List";
Debug.ShouldStop(32);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 583;BA.debugLine="lstOpciones.Initialize";
Debug.ShouldStop(64);
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 584;BA.debugLine="lstOpciones.Add(\"Anular Fase\")";
Debug.ShouldStop(128);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Anular Fase"))));
 BA.debugLineNum = 585;BA.debugLine="lstOpciones.Add(\"Editar Observaciones\")";
Debug.ShouldStop(256);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Editar Observaciones"))));
 BA.debugLineNum = 587;BA.debugLine="Dim FaseSel As String=mData.Get(\"Fase\")";
Debug.ShouldStop(1024);
_fasesel = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fase")))));Debug.locals.put("FaseSel", _fasesel);Debug.locals.put("FaseSel", _fasesel);
 BA.debugLineNum = 589;BA.debugLine="If FaseSel.ToUpperCase=\"EXPEDIDO\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_fasesel.runMethod(true,"toUpperCase"),BA.ObjectToString("EXPEDIDO"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 590;BA.debugLine="lstOpciones.Add(\"Trazabilidad Transporte\")";
Debug.ShouldStop(8192);
_lstopciones.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Trazabilidad Transporte"))));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 596;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(524288);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 598;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(B4XLis";
Debug.ShouldStop(2097152);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 600;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(8388608);
if (true) break;

case 5:
//for
this.state = 8;
step27 = 1;
limit27 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 8;
if ((step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27)) this.state = 7;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step27)) ;
Debug.locals.put("i", _i);
if (true) break;

case 7:
//C
this.state = 24;
 BA.debugLineNum = 601;BA.debugLine="xclv.ResizeItem(i,80dip)";
Debug.ShouldStop(16777216);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 605;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(268435456);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 606;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(536870912);
if (true) break;

case 9:
//if
this.state = 12;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 608;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(-2147483648);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 609;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(1);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 610;BA.debugLine="bCancel.TextSize=16";
Debug.ShouldStop(2);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 16));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 613;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "btnaccionesfase_click"), _rs);
this.state = 25;
return;
case 25:
//C
this.state = 13;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 614;BA.debugLine="JamTableCLVFasesDoc.sv.ScrollViewOffsetY=offset_b";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 615;BA.debugLine="Dim AccionFase As String=B4XListDlg.SelectedItem";
Debug.ShouldStop(64);
_accionfase = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("AccionFase", _accionfase);Debug.locals.put("AccionFase", _accionfase);
 BA.debugLineNum = 618;BA.debugLine="Select AccionFase";
Debug.ShouldStop(512);
if (true) break;

case 13:
//select
this.state = 22;
switch (BA.switchObjectToInt(_accionfase,BA.ObjectToString("Trazabilidad Transporte"),BA.ObjectToString("Anular Fase"),BA.ObjectToString("Editar Observaciones"),BA.ObjectToString("Buscar Expedicion DHL"))) {
case 0: {
this.state = 15;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
case 2: {
this.state = 19;
if (true) break;
}
case 3: {
this.state = 21;
if (true) break;
}
}
if (true) break;

case 15:
//C
this.state = 22;
 BA.debugLineNum = 620;BA.debugLine="TrazabilidadTransporte(mData)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_trazabilidadtransporte" /*void*/ ,(Object)(_mdata));
 if (true) break;

case 17:
//C
this.state = 22;
 BA.debugLineNum = 623;BA.debugLine="AnularFase(mData)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_anularfase" /*void*/ ,(Object)(_mdata));
 if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 626;BA.debugLine="EditarObservaciones(mData)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_editarobservaciones" /*void*/ ,(Object)(_mdata));
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 629;BA.debugLine="BuscarExpedicionDHLPorReferencia";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_buscarexpediciondhlporreferencia" /*RemoteObject*/ );
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 632;BA.debugLine="End Sub";
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
public static RemoteObject  _btnejemplo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEjemplo_Click (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,429);
if (RapidSub.canDelegate("btnejemplo_click")) { return __ref.runUserSub(false, "cfasesdocumento","btnejemplo_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexsel = RemoteObject.createImmutable(0);
 BA.debugLineNum = 429;BA.debugLine="Private Sub btnEjemplo_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 430;BA.debugLine="Dim btn As Button=Sender";
Debug.ShouldStop(8192);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), cfasesdocumento.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 431;BA.debugLine="Dim mData As Map=JamTableCLVFasesDoc.GetValue(Jam";
Debug.ShouldStop(16384);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject())))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 432;BA.debugLine="Log(mData)";
Debug.ShouldStop(32768);
cfasesdocumento.__c.runVoidMethod ("LogImpl","830932995",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 433;BA.debugLine="Dim IndexSel As Int=JamTableCLVFasesDoc.GetItemFr";
Debug.ShouldStop(65536);
_indexsel = __ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject()));Debug.locals.put("IndexSel", _indexsel);Debug.locals.put("IndexSel", _indexsel);
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnmostrardocumentoennavision_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMostrarDocumentoEnNavision_Click (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,772);
if (RapidSub.canDelegate("btnmostrardocumentoennavision_click")) { __ref.runUserSub(false, "cfasesdocumento","btnmostrardocumentoennavision_click", __ref); return;}
ResumableSub_btnMostrarDocumentoEnNavision_Click rsub = new ResumableSub_btnMostrarDocumentoEnNavision_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnMostrarDocumentoEnNavision_Click extends BA.ResumableSub {
public ResumableSub_btnMostrarDocumentoEnNavision_Click(b4j.docU.cfasesdocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _docsel = RemoteObject.createImmutable("");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnMostrarDocumentoEnNavision_Click (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,772);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 774;BA.debugLine="If mDocumentoSel=\"\" Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 775;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha sele";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha seleccionado ningún documento válido.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 776;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "btnmostrardocumentoennavision_click"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 4;
;
 BA.debugLineNum = 777;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 780;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Mostrar el";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Mostrar el documento "),__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ),RemoteObject.createImmutable(" en NAVISION?"))),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 781;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "btnmostrardocumentoennavision_click"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 5;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 782;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(8192);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 785;BA.debugLine="Dim DocSel As String=mDocumentoSel";
Debug.ShouldStop(65536);
_docsel = __ref.getField(true,"_mdocumentosel" /*RemoteObject*/ );Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 786;BA.debugLine="Select True";
Debug.ShouldStop(131072);
if (true) break;

case 11:
//select
this.state = 18;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("CDEV"))))) {
case 0: {
this.state = 13;
if (true) break;
}
case 1: {
this.state = 15;
if (true) break;
}
case 2: {
this.state = 17;
if (true) break;
}
}
if (true) break;

case 13:
//C
this.state = 18;
 BA.debugLineNum = 788;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(524288);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico Albaranes Venta")),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 790;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(2097152);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico recep. transferencia")),(Object)(BA.numberCast(int.class, 5745)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 792;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(8388608);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico envío devolución")),(Object)(BA.numberCast(int.class, 6650)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 798;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "btnmostrardocumentoennavision_click"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 19;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 800;BA.debugLine="If success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 19:
//if
this.state = 24;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 803;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible abrir la ficha del documento "),_docsel,RemoteObject.createImmutable(" en NAVISION."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 804;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "btnmostrardocumentoennavision_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 806;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btnSalir_Click (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cfasesdocumento","btnsalir_click", __ref);}
 BA.debugLineNum = 188;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="SalirModulo";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnseldocumento_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelDocumento_Click (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,438);
if (RapidSub.canDelegate("btnseldocumento_click")) { __ref.runUserSub(false, "cfasesdocumento","btnseldocumento_click", __ref); return;}
ResumableSub_btnSelDocumento_Click rsub = new ResumableSub_btnSelDocumento_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelDocumento_Click extends BA.ResumableSub {
public ResumableSub_btnSelDocumento_Click(b4j.docU.cfasesdocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _offset_before_dialog = RemoteObject.createImmutable(0f);
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _docsel = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelDocumento_Click (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,438);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 439;BA.debugLine="mDocumentoSel=\"\"";
Debug.ShouldStop(4194304);
__ref.setField ("_mdocumentosel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 440;BA.debugLine="DestinatarioTaller=False";
Debug.ShouldStop(8388608);
__ref.setField ("_destinatariotaller" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 441;BA.debugLine="txtDocumento.Text=\"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtdocumento" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 442;BA.debugLine="LimpiarDatosDocumento";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_limpiardatosdocumento" /*RemoteObject*/ );
 BA.debugLineNum = 443;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLVFa";
Debug.ShouldStop(67108864);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 444;BA.debugLine="Dialog.Title=\"Indica Documento\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Documento")));
 BA.debugLineNum = 445;BA.debugLine="Dialog.TitleBarHeight=50dip";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 446;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(536870912);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 447;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(1073741824);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 448;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(-2147483648);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 449;BA.debugLine="InputDlg.Text=\"\"";
Debug.ShouldStop(1);
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 451;BA.debugLine="Utilidades.SetLightThemeInput(InputDlg)";
Debug.ShouldStop(4);
parent._utilidades.runVoidMethod ("_setlightthemeinput" /*RemoteObject*/ ,(Object)(_inputdlg));
 BA.debugLineNum = 452;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.ShouldStop(8);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 453;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(16);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 454;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(32);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 455;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(64);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 456;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(128);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 457;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(256);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 458;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(512);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 459;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "btnseldocumento_click"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 461;BA.debugLine="JamTableCLVFasesDoc.sv.ScrollViewOffsetY=offset_b";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 462;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 463;BA.debugLine="Dim DocSel As String=InputDlg.Text.Trim.ToUpperCa";
Debug.ShouldStop(16384);
_docsel = _inputdlg.getField(true,"_text" /*RemoteObject*/ ).runMethod(true,"trim").runMethod(true,"toUpperCase");Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 464;BA.debugLine="If Not(DocSel.StartsWith(\"ALBV\")) And Not(DocSel.";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV")))))) && RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT")))))) && RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("CDEV")))))) && RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("OSUB"))))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 466;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(DocSel & \" no";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_docsel,RemoteObject.createImmutable(" no es un documento no válido."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("(sólo ALBV,RT,CDEV, Y OSUB.)"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 467;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "btnseldocumento_click"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 10;
;
 BA.debugLineNum = 468;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 471;BA.debugLine="mDocumentoSel=DocSel";
Debug.ShouldStop(4194304);
__ref.setField ("_mdocumentosel" /*RemoteObject*/ ,_docsel);
 BA.debugLineNum = 472;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 473;BA.debugLine="Wait For(ActualizarDatosTotalesDocumentoSel(mDocu";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "btnseldocumento_click"), __ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_actualizardatostotalesdocumentosel" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ))));
this.state = 19;
return;
case 19:
//C
this.state = 11;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 474;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 475;BA.debugLine="If Success=False Then SalirModulo";
Debug.ShouldStop(67108864);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_salirmodulo" /*RemoteObject*/ );
if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 476;BA.debugLine="End Sub";
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
public static RemoteObject  _buscarexpediciondhlporreferencia(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuscarExpedicionDHLPorReferencia (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,1167);
if (RapidSub.canDelegate("buscarexpediciondhlporreferencia")) { return __ref.runUserSub(false, "cfasesdocumento","buscarexpediciondhlporreferencia", __ref);}
RemoteObject _cexpdhl = RemoteObject.declareNull("b4j.docU.cinfoexpediciondhl");
 BA.debugLineNum = 1167;BA.debugLine="Sub BuscarExpedicionDHLPorReferencia";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1169;BA.debugLine="Dim cExpDHL As cInfoExpedicionDHL";
Debug.ShouldStop(65536);
_cexpdhl = RemoteObject.createNew ("b4j.docU.cinfoexpediciondhl");Debug.locals.put("cExpDHL", _cexpdhl);
 BA.debugLineNum = 1170;BA.debugLine="cExpDHL.Initialize";
Debug.ShouldStop(131072);
_cexpdhl.runClassMethod (b4j.docU.cinfoexpediciondhl.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1171;BA.debugLine="cExpDHL.ActualizarInfoExpedicionDHL(mDocumentoSel";
Debug.ShouldStop(262144);
_cexpdhl.runClassMethod (b4j.docU.cinfoexpediciondhl.class, "_actualizarinfoexpediciondhl" /*void*/ ,(Object)(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ )));
 BA.debugLineNum = 1172;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargadatoswebservicetransporte(RemoteObject __ref,RemoteObject _idtransportista) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,1079);
if (RapidSub.canDelegate("cargadatoswebservicetransporte")) { return __ref.runUserSub(false, "cfasesdocumento","cargadatoswebservicetransporte", __ref, _idtransportista);}
ResumableSub_CargaDatosWebServiceTransporte rsub = new ResumableSub_CargaDatosWebServiceTransporte(null,__ref,_idtransportista);
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
public static class ResumableSub_CargaDatosWebServiceTransporte extends BA.ResumableSub {
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _idtransportista) {
this.parent = parent;
this.__ref = __ref;
this._idtransportista = _idtransportista;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _idtransportista;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _comandojrdc = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,1079);
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
Debug.locals.put("IDTransportista", _idtransportista);
 BA.debugLineNum = 1081;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16777216);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1082;BA.debugLine="Dim lstRes As List";
Debug.ShouldStop(33554432);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 1083;BA.debugLine="lstRes.Initialize";
Debug.ShouldStop(67108864);
_lstres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1084;BA.debugLine="Dim ComandoJRDC As String";
Debug.ShouldStop(134217728);
_comandojrdc = RemoteObject.createImmutable("");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 1085;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
Debug.ShouldStop(268435456);
_comandojrdc = BA.ObjectToString("DatosWebServiceTransporte");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 1086;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(536870912);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comandojrdc),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idtransportista)}))),(Object)(__ref));
 BA.debugLineNum = 1087;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 1088;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 1089;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1091;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 1092;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1094;BA.debugLine="lstRes=mresult.Get(\"lstRes\")";
Debug.ShouldStop(32);
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 1095;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
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
 BA.debugLineNum = 1098;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(512);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1099;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1100;BA.debugLine="mRes.put(\"Accion\",Accion)";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1101;BA.debugLine="mRes.put(\"lstRes\",lstRes)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstres.getObject())));
 BA.debugLineNum = 1102;BA.debugLine="Return mRes";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1104;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
cfasesdocumento._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfasesdocumento._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
cfasesdocumento._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cfasesdocumento._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cfasesdocumento._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cfasesdocumento._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object";
cfasesdocumento._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfasesdocumento._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Private mParent As B4XView";
cfasesdocumento._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",cfasesdocumento._mparent);
 //BA.debugLineNum = 9;BA.debugLine="Dim Background As B4XView";
cfasesdocumento._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",cfasesdocumento._background);
 //BA.debugLineNum = 11;BA.debugLine="Private Dialog As B4XDialog";
cfasesdocumento._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cfasesdocumento._dialog);
 //BA.debugLineNum = 13;BA.debugLine="Private mSQL As SQL";
cfasesdocumento._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cfasesdocumento._msql);
 //BA.debugLineNum = 15;BA.debugLine="Private mDocumentoSel As String";
cfasesdocumento._mdocumentosel = RemoteObject.createImmutable("");__ref.setField("_mdocumentosel",cfasesdocumento._mdocumentosel);
 //BA.debugLineNum = 20;BA.debugLine="Private JamTableCLVFasesDoc As JamTableCLV";
cfasesdocumento._jamtableclvfasesdoc = RemoteObject.createNew ("b4j.docU.jamtableclv");__ref.setField("_jamtableclvfasesdoc",cfasesdocumento._jamtableclvfasesdoc);
 //BA.debugLineNum = 21;BA.debugLine="Private btnAccionesFase As Button";
cfasesdocumento._btnaccionesfase = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnaccionesfase",cfasesdocumento._btnaccionesfase);
 //BA.debugLineNum = 22;BA.debugLine="Private chkFaseActiva As CheckBox";
cfasesdocumento._chkfaseactiva = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkfaseactiva",cfasesdocumento._chkfaseactiva);
 //BA.debugLineNum = 23;BA.debugLine="Private txtFase As TextField";
cfasesdocumento._txtfase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfase",cfasesdocumento._txtfase);
 //BA.debugLineNum = 24;BA.debugLine="Private txtFechaFase As TextField";
cfasesdocumento._txtfechafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechafase",cfasesdocumento._txtfechafase);
 //BA.debugLineNum = 25;BA.debugLine="Private txtInfoAdicionalFase As TextField";
cfasesdocumento._txtinfoadicionalfase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtinfoadicionalfase",cfasesdocumento._txtinfoadicionalfase);
 //BA.debugLineNum = 26;BA.debugLine="Private txtNumeroExpedicion As TextField";
cfasesdocumento._txtnumeroexpedicion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumeroexpedicion",cfasesdocumento._txtnumeroexpedicion);
 //BA.debugLineNum = 27;BA.debugLine="Private txtObservaciones As TextField";
cfasesdocumento._txtobservaciones = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtobservaciones",cfasesdocumento._txtobservaciones);
 //BA.debugLineNum = 28;BA.debugLine="Private txtResponsableFase As TextField";
cfasesdocumento._txtresponsablefase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtresponsablefase",cfasesdocumento._txtresponsablefase);
 //BA.debugLineNum = 30;BA.debugLine="Private txtDocumento As TextField";
cfasesdocumento._txtdocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdocumento",cfasesdocumento._txtdocumento);
 //BA.debugLineNum = 31;BA.debugLine="Private txtFechaDocumento As TextField";
cfasesdocumento._txtfechadocumento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechadocumento",cfasesdocumento._txtfechadocumento);
 //BA.debugLineNum = 33;BA.debugLine="Private txtAreaFase As TextField";
cfasesdocumento._txtareafase = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtareafase",cfasesdocumento._txtareafase);
 //BA.debugLineNum = 35;BA.debugLine="Private DestinatarioTaller As Boolean";
cfasesdocumento._destinatariotaller = RemoteObject.createImmutable(false);__ref.setField("_destinatariotaller",cfasesdocumento._destinatariotaller);
 //BA.debugLineNum = 36;BA.debugLine="Private OSUBTaller As String";
cfasesdocumento._osubtaller = RemoteObject.createImmutable("");__ref.setField("_osubtaller",cfasesdocumento._osubtaller);
 //BA.debugLineNum = 39;BA.debugLine="Private lblTitleCodigoDestinoDoc As Label";
cfasesdocumento._lbltitlecodigodestinodoc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlecodigodestinodoc",cfasesdocumento._lbltitlecodigodestinodoc);
 //BA.debugLineNum = 40;BA.debugLine="Private txtCodigoDestinoDoc As TextField";
cfasesdocumento._txtcodigodestinodoc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodigodestinodoc",cfasesdocumento._txtcodigodestinodoc);
 //BA.debugLineNum = 41;BA.debugLine="Private lblTitleNombreDestinoDoc As Label";
cfasesdocumento._lbltitlenombredestinodoc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlenombredestinodoc",cfasesdocumento._lbltitlenombredestinodoc);
 //BA.debugLineNum = 42;BA.debugLine="Private txtNombreDestinoDoc As TextField";
cfasesdocumento._txtnombredestinodoc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombredestinodoc",cfasesdocumento._txtnombredestinodoc);
 //BA.debugLineNum = 44;BA.debugLine="Private JamLoadingIndicator1 As JamLoadingIndicat";
cfasesdocumento._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cfasesdocumento._jamloadingindicator1);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _editarobservaciones(RemoteObject __ref,RemoteObject _mdata) throws Exception{
try {
		Debug.PushSubsStack("EditarObservaciones (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,970);
if (RapidSub.canDelegate("editarobservaciones")) { __ref.runUserSub(false, "cfasesdocumento","editarobservaciones", __ref, _mdata); return;}
ResumableSub_EditarObservaciones rsub = new ResumableSub_EditarObservaciones(null,__ref,_mdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EditarObservaciones extends BA.ResumableSub {
public ResumableSub_EditarObservaciones(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _mdata) {
this.parent = parent;
this.__ref = __ref;
this._mdata = _mdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _mdata;
RemoteObject _offset_before_dialog = RemoteObject.createImmutable(0f);
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _maxnumchar = RemoteObject.createImmutable(0);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _nuevasobs = RemoteObject.createImmutable("");
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject group29;
int index29;
int groupLen29;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EditarObservaciones (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,970);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 971;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLVFa";
Debug.ShouldStop(1024);
_offset_before_dialog = BA.numberCast(float.class, __ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("offset_before_dialog", _offset_before_dialog);Debug.locals.put("offset_before_dialog", _offset_before_dialog);
 BA.debugLineNum = 972;BA.debugLine="Dialog.Title=\"Editar Observaciones Fase\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Editar Observaciones Fase")));
 BA.debugLineNum = 973;BA.debugLine="Dialog.TitleBarHeight=50dip";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 974;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(8192);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 975;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(16384);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 976;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(32768);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 977;BA.debugLine="InputDlg.Text=mData.Get(\"Obs\")";
Debug.ShouldStop(65536);
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Obs"))))));
 BA.debugLineNum = 978;BA.debugLine="Dim MaxNumChar As Int=100";
Debug.ShouldStop(131072);
_maxnumchar = BA.numberCast(int.class, 100);Debug.locals.put("MaxNumChar", _maxnumchar);Debug.locals.put("MaxNumChar", _maxnumchar);
 BA.debugLineNum = 979;BA.debugLine="InputDlg.RegexPattern=\"^.{\" & 0 & \",\" & MaxNumCha";
Debug.ShouldStop(262144);
_inputdlg.setField ("_regexpattern" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("^.{"),RemoteObject.createImmutable(0),RemoteObject.createImmutable(","),_maxnumchar,RemoteObject.createImmutable("}$")));
 BA.debugLineNum = 980;BA.debugLine="InputDlg.mBase.Width=750dip";
Debug.ShouldStop(524288);
_inputdlg.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 750)))));
 BA.debugLineNum = 981;BA.debugLine="Utilidades.SetLightThemeInput(InputDlg)";
Debug.ShouldStop(1048576);
parent._utilidades.runVoidMethod ("_setlightthemeinput" /*RemoteObject*/ ,(Object)(_inputdlg));
 BA.debugLineNum = 982;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.ShouldStop(2097152);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 983;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(4194304);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 984;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(8388608);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 985;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(16777216);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 986;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(33554432);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 987;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(67108864);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 988;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(134217728);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 989;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "editarobservaciones"), _rsub);
this.state = 44;
return;
case 44:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 991;BA.debugLine="JamTableCLVFasesDoc.sv.ScrollViewOffsetY=offset_b";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_getsv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY",BA.numberCast(double.class, _offset_before_dialog));
 BA.debugLineNum = 992;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 993;BA.debugLine="Dim NuevasObs As String=InputDlg.Text";
Debug.ShouldStop(1);
_nuevasobs = _inputdlg.getField(true,"_text" /*RemoteObject*/ );Debug.locals.put("NuevasObs", _nuevasobs);Debug.locals.put("NuevasObs", _nuevasobs);
 BA.debugLineNum = 994;BA.debugLine="Wait For(UpdateObservacionesFaseDoc(mData.Get(\"ID";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "editarobservaciones"), __ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_updateobservacionesfasedoc" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDMov")))))),(Object)(_nuevasobs)));
this.state = 45;
return;
case 45:
//C
this.state = 7;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 995;BA.debugLine="If sResp=\"NOK\" Then Return";
Debug.ShouldStop(4);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("NOK"))) { 
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
 BA.debugLineNum = 997;BA.debugLine="Wait For(ActualizarFasesDocumentoSel(mDocumentoSe";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "editarobservaciones"), __ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_actualizarfasesdocumentosel" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ))));
this.state = 46;
return;
case 46:
//C
this.state = 13;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 998;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(32);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 999;BA.debugLine="If Accion=\"NOK\" Then Return";
Debug.ShouldStop(64);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
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
 BA.debugLineNum = 1000;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(128);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1001;BA.debugLine="For Each mData As Map In lstReg";
Debug.ShouldStop(256);
if (true) break;

case 19:
//for
this.state = 22;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group29 = _lstreg;
index29 = 0;
groupLen29 = group29.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 47;
if (true) break;

case 47:
//C
this.state = 22;
if (index29 < groupLen29) {
this.state = 21;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group29.runMethod(false,"Get",index29));Debug.locals.put("mData", _mdata);}
if (true) break;

case 48:
//C
this.state = 47;
index29++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 21:
//C
this.state = 48;
 BA.debugLineNum = 1002;BA.debugLine="Log(mData)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","831784992",BA.ObjectToString(_mdata),0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 1005;BA.debugLine="Dim rSub As ResumableSub=JamTableCLVFasesDoc.setd";
Debug.ShouldStop(4096);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setdata" /*RemoteObject*/ ,(Object)((_lstreg.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1006;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "editarobservaciones"), _rsub);
this.state = 49;
return;
case 49:
//C
this.state = 23;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 1007;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(16384);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 1008;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(32768);
if (true) break;

case 23:
//if
this.state = 43;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1009;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(65536);
if (true) break;

case 26:
//if
this.state = 33;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1010;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1011;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "editarobservaciones"), _msa);
this.state = 50;
return;
case 50:
//C
this.state = 29;
;
 BA.debugLineNum = 1013;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1014;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "editarobservaciones"), _msa);
this.state = 51;
return;
case 51:
//C
this.state = 29;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1015;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(4194304);
if (true) break;

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1016;BA.debugLine="JamTableCLVFasesDoc.AbrirCamposBuilder";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 1017;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 1020;BA.debugLine="ExitApplication";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 1022;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(536870912);

case 33:
//if
this.state = 42;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1023;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(1073741824);
if (true) break;

case 36:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 38;
;}if (true) break;

case 38:
//C
this.state = 41;
if (true) return ;
if (true) break;

case 41:
//C
this.state = 42;
;
 BA.debugLineNum = 1024;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1025;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "editarobservaciones"), _msa);
this.state = 52;
return;
case 52:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = -1;
;
 BA.debugLineNum = 1029;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cfasesdocumento","frm_closerequest", __ref, _eventdata);}
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
public static RemoteObject  _generaruuidv4(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GenerarUUIDv4 (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("generaruuidv4")) { return __ref.runUserSub(false, "cfasesdocumento","generaruuidv4", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _stp = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _c = RemoteObject.createImmutable(0);
 BA.debugLineNum = 320;BA.debugLine="Sub GenerarUUIDv4 As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 322;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 323;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
Debug.ShouldStop(4);
{
final RemoteObject group3 = RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable((8)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((12))});
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = BA.numberCast(int.class, group3.getArrayElement(false,RemoteObject.createImmutable(index3)));Debug.locals.put("stp", _stp);
Debug.locals.put("stp", _stp);
 BA.debugLineNum = 324;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("-")));};
 BA.debugLineNum = 325;BA.debugLine="For n = 1 To stp";
Debug.ShouldStop(16);
{
final int step5 = 1;
final int limit5 = _stp.<Integer>get().intValue();
_n = 1 ;
for (;(step5 > 0 && _n <= limit5) || (step5 < 0 && _n >= limit5) ;_n = ((int)(0 + _n + step5))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 326;BA.debugLine="Dim c As Int = Rnd(0, 16)";
Debug.ShouldStop(32);
_c = cfasesdocumento.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 327;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",_c,BA.numberCast(double.class, 10))) { 
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(48)}, "+",1, 1);Debug.locals.put("c", _c);}
else {
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(55)}, "+",1, 1);Debug.locals.put("c", _c);};
 BA.debugLineNum = 328;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 19))) { 
_c = cfasesdocumento.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("8"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 329;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 14))) { 
_c = cfasesdocumento.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("4"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 330;BA.debugLine="sb.Append(Chr(c))";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(cfasesdocumento.__c.runMethod(true,"Chr",(Object)(_c)))));
 }
}Debug.locals.put("n", _n);
;
 }
}Debug.locals.put("stp", _stp);
;
 BA.debugLineNum = 333;BA.debugLine="Return sb.ToString.ToLowerCase";
Debug.ShouldStop(4096);
if (true) return _sb.runMethod(true,"ToString").runMethod(true,"toLowerCase");
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _parent,RemoteObject _documentosel) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfasesdocumento","initialize", __ref, _ba, _callback, _parent, _documentosel);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Parent", _parent);
Debug.locals.put("DocumentoSel", _documentosel);
 BA.debugLineNum = 48;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="mCallBack=CallBack";
Debug.ShouldStop(65536);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 50;BA.debugLine="mParent=Parent";
Debug.ShouldStop(131072);
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 51;BA.debugLine="Background= xui.CreatePanel(\"background\")";
Debug.ShouldStop(262144);
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("background"))));
 BA.debugLineNum = 52;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("b4xdialog_background")));
 BA.debugLineNum = 53;BA.debugLine="Background.Color=0xaa000000";
Debug.ShouldStop(1048576);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 54;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 57;BA.debugLine="mDocumentoSel=DocumentoSel";
Debug.ShouldStop(16777216);
__ref.setField ("_mdocumentosel" /*RemoteObject*/ ,_documentosel);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableclvfasesdoc_accionsalirjamtableclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLVFasesDoc_AccionSalirJamTableCLV (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("jamtableclvfasesdoc_accionsalirjamtableclv")) { return __ref.runUserSub(false, "cfasesdocumento","jamtableclvfasesdoc_accionsalirjamtableclv", __ref);}
 BA.debugLineNum = 183;BA.debugLine="Sub JamTableCLVFasesDoc_AccionSalirJamTableCLV";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="SalirModulo";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_salirmodulo" /*RemoteObject*/ );
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
public static RemoteObject  _jamtableclvfasesdoc_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLVFasesDoc_ItemClick (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("jamtableclvfasesdoc_itemclick")) { return __ref.runUserSub(false, "cfasesdocumento","jamtableclvfasesdoc_itemclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 408;BA.debugLine="Sub JamTableCLVFasesDoc_ItemClick(Index As Int, Va";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 409;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(16777216);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 410;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
Debug.ShouldStop(33554432);
cfasesdocumento.__c.runVoidMethod ("LogImpl","830801922",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 411;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(67108864);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 412;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(134217728);
cfasesdocumento.__c.runVoidMethod ("LogImpl","830801924",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 414;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableclvfasesdoc_itemlongclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLVFasesDoc_ItemLongClick (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,417);
if (RapidSub.canDelegate("jamtableclvfasesdoc_itemlongclick")) { return __ref.runUserSub(false, "cfasesdocumento","jamtableclvfasesdoc_itemlongclick", __ref, _index, _value);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 417;BA.debugLine="Sub JamTableCLVFasesDoc_ItemLongClick(Index As Int";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="Dim mData As Map=Value";
Debug.ShouldStop(2);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 419;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
Debug.ShouldStop(4);
cfasesdocumento.__c.runVoidMethod ("LogImpl","830867458",RemoteObject.concat(RemoteObject.createImmutable("Datos Item seleccionado botón secundario ("),_index,RemoteObject.createImmutable("): ")),0);
 BA.debugLineNum = 420;BA.debugLine="For Each k In mData.Keys";
Debug.ShouldStop(8);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.runMethod(false,"Get",index3);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 421;BA.debugLine="Log(k & \": \" & mData.Get(k))";
Debug.ShouldStop(16);
cfasesdocumento.__c.runVoidMethod ("LogImpl","830867460",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_mdata.runMethod(false,"Get",(Object)(_k))),0);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 423;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableclvfasesdoc_loadlayoutpanelitem(RemoteObject __ref,RemoteObject _datositemindexclv) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLVFasesDoc_LoadLayoutPanelItem (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,384);
if (RapidSub.canDelegate("jamtableclvfasesdoc_loadlayoutpanelitem")) { return __ref.runUserSub(false, "cfasesdocumento","jamtableclvfasesdoc_loadlayoutpanelitem", __ref, _datositemindexclv);}
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _timeformatant = RemoteObject.createImmutable("");
Debug.locals.put("DatosItemIndexCLV", _datositemindexclv);
 BA.debugLineNum = 384;BA.debugLine="Sub JamTableCLVFasesDoc_LoadLayoutPanelItem(DatosI";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 385;BA.debugLine="Dim mData As Map = DatosItemIndexCLV.Value";
Debug.ShouldStop(1);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _datositemindexclv.getField(false,"Value" /*RemoteObject*/ ));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 386;BA.debugLine="Dim pnl As B4XView=DatosItemIndexCLV.Panel";
Debug.ShouldStop(2);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = _datositemindexclv.getField(false,"Panel" /*RemoteObject*/ );Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 387;BA.debugLine="pnl.LoadLayout(\"scrItemFasesDocumentoLin\")";
Debug.ShouldStop(4);
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrItemFasesDocumentoLin")),__ref.getField(false, "ba"));
 BA.debugLineNum = 389;BA.debugLine="txtFase.Text=mData.Get(\"Fase\")";
Debug.ShouldStop(16);
__ref.getField(false,"_txtfase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fase"))))));
 BA.debugLineNum = 390;BA.debugLine="txtAreaFase.Text=mData.Get(\"AreaFase\")";
Debug.ShouldStop(32);
__ref.getField(false,"_txtareafase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AreaFase"))))));
 BA.debugLineNum = 391;BA.debugLine="txtResponsableFase.Text=mData.Get(\"ResponsableFas";
Debug.ShouldStop(64);
__ref.getField(false,"_txtresponsablefase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableFase"))))));
 BA.debugLineNum = 392;BA.debugLine="txtInfoAdicionalFase.Text=mData.Get(\"InfoAdiciona";
Debug.ShouldStop(128);
__ref.getField(false,"_txtinfoadicionalfase" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("InfoAdicionalFase"))))));
 BA.debugLineNum = 393;BA.debugLine="txtNumeroExpedicion.Text=mData.Get(\"NumExpedicion";
Debug.ShouldStop(256);
__ref.getField(false,"_txtnumeroexpedicion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumExpedicion"))))));
 BA.debugLineNum = 394;BA.debugLine="txtObservaciones.Text=mData.Get(\"Obs\")";
Debug.ShouldStop(512);
__ref.getField(false,"_txtobservaciones" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Obs"))))));
 BA.debugLineNum = 396;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(2048);
_dateformatant = cfasesdocumento.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 397;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(4096);
cfasesdocumento.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 398;BA.debugLine="Dim TimeFormatAnt As String=DateTime.timeFormat";
Debug.ShouldStop(8192);
_timeformatant = cfasesdocumento.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("TimeFormatAnt", _timeformatant);Debug.locals.put("TimeFormatAnt", _timeformatant);
 BA.debugLineNum = 399;BA.debugLine="DateTime.TimeFormat	=\"HH:mm\"";
Debug.ShouldStop(16384);
cfasesdocumento.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 400;BA.debugLine="txtFechaFase.Text=DateTime.date(mData.Get(\"FechaF";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtfechafase" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(cfasesdocumento.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaFase"))))))),RemoteObject.createImmutable(" "),cfasesdocumento.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaFase")))))))));
 BA.debugLineNum = 402;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(131072);
cfasesdocumento.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 403;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
Debug.ShouldStop(262144);
cfasesdocumento.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_timeformatant);
 BA.debugLineNum = 405;BA.debugLine="chkFaseActiva.Checked=1=mData.Get(\"Mov\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_chkfaseactiva" /*RemoteObject*/ ).runMethod(true,"setChecked",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",RemoteObject.createImmutable(1),BA.numberCast(double.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Mov"))))))));
 BA.debugLineNum = 406;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableclvfasesdoc_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLVFasesDoc_MenuBarMenuItem_Action (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("jamtableclvfasesdoc_menubarmenuitem_action")) { __ref.runUserSub(false, "cfasesdocumento","jamtableclvfasesdoc_menubarmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_JamTableCLVFasesDoc_MenuBarMenuItem_Action rsub = new ResumableSub_JamTableCLVFasesDoc_MenuBarMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_JamTableCLVFasesDoc_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_JamTableCLVFasesDoc_MenuBarMenuItem_Action(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _tagmenuitem;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JamTableCLVFasesDoc_MenuBarMenuItem_Action (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,202);
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
 BA.debugLineNum = 203;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("NuevaFase"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 205;BA.debugLine="Wait For(ActualizarDatosTotalesDocumentoSel(mDo";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "jamtableclvfasesdoc_menubarmenuitem_action"), __ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_actualizardatostotalesdocumentosel" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 206;BA.debugLine="If Success=False Then SalirModulo";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_salirmodulo" /*RemoteObject*/ );
if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 213;BA.debugLine="NuevaFaseDoc";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_nuevafasedoc" /*RemoteObject*/ );
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 215;BA.debugLine="End Sub";
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
public static RemoteObject  _limpiardatosdocumento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LimpiarDatosDocumento (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,692);
if (RapidSub.canDelegate("limpiardatosdocumento")) { return __ref.runUserSub(false, "cfasesdocumento","limpiardatosdocumento", __ref);}
 BA.debugLineNum = 692;BA.debugLine="Sub LimpiarDatosDocumento";
Debug.ShouldStop(524288);
 BA.debugLineNum = 694;BA.debugLine="txtCodigoDestinoDoc.Text=\"\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtcodigodestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 696;BA.debugLine="txtNombreDestinoDoc.Text=\"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtnombredestinodoc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 697;BA.debugLine="txtFechaDocumento.Text=\"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtfechadocumento" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 698;BA.debugLine="JamTableCLVFasesDoc.Clear";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 699;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nuevafasedoc(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NuevaFaseDoc (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("nuevafasedoc")) { return __ref.runUserSub(false, "cfasesdocumento","nuevafasedoc", __ref);}
RemoteObject _tipodoc = RemoteObject.createImmutable("");
RemoteObject _cnuevafasedoc = RemoteObject.declareNull("b4j.docU.cnuevafasedocumento");
 BA.debugLineNum = 217;BA.debugLine="Sub NuevaFaseDoc";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="Dim TipoDoc As String";
Debug.ShouldStop(33554432);
_tipodoc = RemoteObject.createImmutable("");Debug.locals.put("TipoDoc", _tipodoc);
 BA.debugLineNum = 219;BA.debugLine="If mDocumentoSel.StartsWith(\"OSUB\") Then";
Debug.ShouldStop(67108864);
if (__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ).runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("OSUB"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 220;BA.debugLine="TipoDoc=\"FAB\"";
Debug.ShouldStop(134217728);
_tipodoc = BA.ObjectToString("FAB");Debug.locals.put("TipoDoc", _tipodoc);
 }else {
 BA.debugLineNum = 222;BA.debugLine="TipoDoc=\"DOC\"";
Debug.ShouldStop(536870912);
_tipodoc = BA.ObjectToString("DOC");Debug.locals.put("TipoDoc", _tipodoc);
 };
 BA.debugLineNum = 224;BA.debugLine="Dim cNuevaFaseDoc As cNuevaFaseDocumento";
Debug.ShouldStop(-2147483648);
_cnuevafasedoc = RemoteObject.createNew ("b4j.docU.cnuevafasedocumento");Debug.locals.put("cNuevaFaseDoc", _cnuevafasedoc);
 BA.debugLineNum = 225;BA.debugLine="cNuevaFaseDoc.Initialize(Me,frm.RootPane,mDocumen";
Debug.ShouldStop(1);
_cnuevafasedoc.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()),(Object)(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ )),(Object)(_tipodoc),(Object)(__ref.getField(true,"_destinatariotaller" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_osubtaller" /*RemoteObject*/ )));
 BA.debugLineNum = 226;BA.debugLine="cNuevaFaseDoc.Show";
Debug.ShouldStop(2);
_cnuevafasedoc.runClassMethod (b4j.docU.cnuevafasedocumento.class, "_show" /*void*/ );
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _nuevafasedocactualizada(RemoteObject __ref,RemoteObject _actualizada) throws Exception{
try {
		Debug.PushSubsStack("NuevaFaseDocActualizada (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("nuevafasedocactualizada")) { __ref.runUserSub(false, "cfasesdocumento","nuevafasedocactualizada", __ref, _actualizada); return;}
ResumableSub_NuevaFaseDocActualizada rsub = new ResumableSub_NuevaFaseDocActualizada(null,__ref,_actualizada);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_NuevaFaseDocActualizada extends BA.ResumableSub {
public ResumableSub_NuevaFaseDocActualizada(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _actualizada) {
this.parent = parent;
this.__ref = __ref;
this._actualizada = _actualizada;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _actualizada;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("NuevaFaseDocActualizada (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,230);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Actualizada", _actualizada);
 BA.debugLineNum = 231;BA.debugLine="If Actualizada=False Then Return";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_actualizada,parent.__c.getField(true,"False"))) { 
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
 BA.debugLineNum = 232;BA.debugLine="Wait For(ActualizarDatosTotalesDocumentoSel(mDocu";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "nuevafasedocactualizada"), __ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_actualizardatostotalesdocumentosel" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ))));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 233;BA.debugLine="If Success=False Then SalirModulo";
Debug.ShouldStop(256);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_salirmodulo" /*RemoteObject*/ );
if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 234;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cfasesdocumento","salirmodulo", __ref);}
 BA.debugLineNum = 192;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="Background.RemoveViewFromParent";
Debug.ShouldStop(1);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 194;BA.debugLine="frm.Close";
Debug.ShouldStop(2);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 196;BA.debugLine="If SubExists(mCallBack,\"FaseDocumentoActualizada\"";
Debug.ShouldStop(8);
if (cfasesdocumento.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("FaseDocumentoActualizada"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 197;BA.debugLine="CallSub2(mCallBack,\"FaseDocumentoActualizada\",mD";
Debug.ShouldStop(16);
cfasesdocumento.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("FaseDocumentoActualizada")),(Object)((__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Show (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cfasesdocumento","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cfasesdocumento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,67);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 69;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(16);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 70;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(32);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 71;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(64);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 72;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(128);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 73;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(256);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 74;BA.debugLine="frm.RootPane.LoadLayout(\"scrFasesDocumento\")";
Debug.ShouldStop(512);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrFasesDocumento")));
 BA.debugLineNum = 75;BA.debugLine="Sleep(0)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "show"),BA.numberCast(int.class, 0));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
 BA.debugLineNum = 78;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Fases Documen";
Debug.ShouldStop(8192);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Fases Documento")));
 BA.debugLineNum = 80;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 81;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
Debug.ShouldStop(65536);
parent._utilidades.runVoidMethod ("_setlightthemedialog" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 83;BA.debugLine="JamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 85;BA.debugLine="frm.Show";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 87;BA.debugLine="txtDocumento.Text=\"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtdocumento" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 88;BA.debugLine="LimpiarDatosDocumento";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_limpiardatosdocumento" /*RemoteObject*/ );
 BA.debugLineNum = 92;BA.debugLine="JamTableCLVFasesDoc.EstadoMenuItem(JamTableCLVFas";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).getField(true,"_menubartabla" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 93;BA.debugLine="JamTableCLVFasesDoc.EstadoMenuItem(JamTableCLVFas";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 94;BA.debugLine="JamTableCLVFasesDoc.EstadoMenuItem(JamTableCLVFas";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 95;BA.debugLine="JamTableCLVFasesDoc.AddMenuItemFontAwesomeToMenuI";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Actualizar Datos Fases Documento")),(Object)(BA.ObjectToString("Actualizar")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf021)))))),(Object)(__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 103;BA.debugLine="Dim rSub As ResumableSub=JamTableCLVFasesDoc.Conf";
Debug.ShouldStop(64);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_configurartableclv" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ListaFasesDocumentoNoCorregidas.json")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 104;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "show"), _rsub);
this.state = 16;
return;
case 16:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 105;BA.debugLine="Log(mRes)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","830146598",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 106;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 107;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 108;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "show"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
 BA.debugLineNum = 109;BA.debugLine="frm.Close";
Debug.ShouldStop(4096);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 110;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 114;BA.debugLine="JamTableCLVFasesDoc.AddMenuItemFontAwesomeToMenuI";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Nueva Fase")),(Object)(BA.ObjectToString("NuevaFase")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf196)))))),(Object)(__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 117;BA.debugLine="JamTableCLVFasesDoc.AlturaItems=90dip";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setalturaitems" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90))));
 BA.debugLineNum = 119;BA.debugLine="JamTableCLVFasesDoc.ModoSeleccionItems=JamTableCL";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setmodoseleccionitems" /*RemoteObject*/ ,__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).getField(true,"_modoseleccionindividualtemp" /*RemoteObject*/ ));
 BA.debugLineNum = 121;BA.debugLine="JamTableCLVFasesDoc.AlturaSeparadorPaneles=4dip";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableclvfasesdoc" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableclv.class, "_setalturaseparadorpaneles" /*RemoteObject*/ ,BA.numberCast(float.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))));
 BA.debugLineNum = 131;BA.debugLine="If mDocumentoSel<>\"\" Then";
Debug.ShouldStop(4);
if (true) break;

case 5:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 132;BA.debugLine="Wait For(ActualizarDatosTotalesDocumentoSel(mDoc";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "show"), __ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_actualizardatostotalesdocumentosel" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mdocumentosel" /*RemoteObject*/ ))));
this.state = 18;
return;
case 18:
//C
this.state = 8;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 133;BA.debugLine="If Success=False Then SalirModulo";
Debug.ShouldStop(16);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
__ref.runClassMethod (b4j.docU.cfasesdocumento.class, "_salirmodulo" /*RemoteObject*/ );
if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
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
public static void  _trazabilidadtransporte(RemoteObject __ref,RemoteObject _mdata) throws Exception{
try {
		Debug.PushSubsStack("TrazabilidadTransporte (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,809);
if (RapidSub.canDelegate("trazabilidadtransporte")) { __ref.runUserSub(false, "cfasesdocumento","trazabilidadtransporte", __ref, _mdata); return;}
ResumableSub_TrazabilidadTransporte rsub = new ResumableSub_TrazabilidadTransporte(null,__ref,_mdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_TrazabilidadTransporte extends BA.ResumableSub {
public ResumableSub_TrazabilidadTransporte(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _mdata) {
this.parent = parent;
this.__ref = __ref;
this._mdata = _mdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _mdata;
RemoteObject _transporte = RemoteObject.createImmutable("");
RemoteObject _expedicion = RemoteObject.createImmutable("");
RemoteObject _expediciondhl = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _urltxt = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cinfoexpedcorreosexp = RemoteObject.declareNull("b4j.docU.cinfoexpedicioncorreosexpress");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TrazabilidadTransporte (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,809);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 810;BA.debugLine="Dim Transporte As String=mData.Get(\"ResponsableFa";
Debug.ShouldStop(512);
_transporte = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableFase")))));Debug.locals.put("Transporte", _transporte);Debug.locals.put("Transporte", _transporte);
 BA.debugLineNum = 811;BA.debugLine="Transporte=Transporte.ToUpperCase";
Debug.ShouldStop(1024);
_transporte = _transporte.runMethod(true,"toUpperCase");Debug.locals.put("Transporte", _transporte);
 BA.debugLineNum = 812;BA.debugLine="Dim Expedicion As String=mData.Get(\"NumExpedicion";
Debug.ShouldStop(2048);
_expedicion = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumExpedicion")))));Debug.locals.put("Expedicion", _expedicion);Debug.locals.put("Expedicion", _expedicion);
 BA.debugLineNum = 813;BA.debugLine="Expedicion=Expedicion.ToUpperCase";
Debug.ShouldStop(4096);
_expedicion = _expedicion.runMethod(true,"toUpperCase");Debug.locals.put("Expedicion", _expedicion);
 BA.debugLineNum = 814;BA.debugLine="Select Case Transporte";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//select
this.state = 26;
switch (BA.switchObjectToInt(_transporte,BA.ObjectToString("DHL"),BA.ObjectToString("TXT"),BA.ObjectToString("CORREOS EXPRESS"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 23;
if (true) break;
}
default: {
this.state = 25;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 818;BA.debugLine="Dim ExpedicionDHL As String";
Debug.ShouldStop(131072);
_expediciondhl = RemoteObject.createImmutable("");Debug.locals.put("ExpedicionDHL", _expediciondhl);
 BA.debugLineNum = 819;BA.debugLine="If Expedicion.Length>=20 Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("g",_expedicion.runMethod(true,"length"),BA.numberCast(double.class, 20))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 820;BA.debugLine="ExpedicionDHL=Expedicion.SubString2(8,10)&Expe";
Debug.ShouldStop(524288);
_expediciondhl = RemoteObject.concat(_expedicion.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 8)),(Object)(BA.numberCast(int.class, 10))),_expedicion.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 20))));Debug.locals.put("ExpedicionDHL", _expediciondhl);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 822;BA.debugLine="ExpedicionDHL=Expedicion";
Debug.ShouldStop(2097152);
_expediciondhl = _expedicion;Debug.locals.put("ExpedicionDHL", _expediciondhl);
 if (true) break;

case 9:
//C
this.state = 26;
;
 BA.debugLineNum = 824;BA.debugLine="fx.ShowExternalDocument(\"https://clientesparcel";
Debug.ShouldStop(8388608);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethod ("ShowExternalDocument",(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://clientesparcel.dhl.es/seguimientoenvios/integra/SeguimientoDocumentos.aspx?codigo="),_expediciondhl,RemoteObject.createImmutable("&anno=2017&lang=sp"))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 827;BA.debugLine="wait for(cmAuxTxT.ObtenerURLTrazabilidadExpedic";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "trazabilidadtransporte"), parent._cmauxtxt.runMethod(false,"_obtenerurltrazabilidadexpediciontxt" /*RemoteObject*/ ,(Object)(_expedicion)));
this.state = 27;
return;
case 27:
//C
this.state = 12;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 828;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(134217728);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 829;BA.debugLine="If Accion=\"OK\" Then";
Debug.ShouldStop(268435456);
if (true) break;

case 12:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("OK"))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 830;BA.debugLine="Dim URLtxt As String=mRes.Get(\"URL\")";
Debug.ShouldStop(536870912);
_urltxt = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("URL")))));Debug.locals.put("URLtxt", _urltxt);Debug.locals.put("URLtxt", _urltxt);
 BA.debugLineNum = 831;BA.debugLine="If URLtxt<>\"\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 15:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",_urltxt,BA.ObjectToString(""))) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 832;BA.debugLine="fx.ShowExternalDocument(URLtxt)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethod ("ShowExternalDocument",(Object)(_urltxt));
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 834;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Ha fallado";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Ha fallado el método obtener URL TXT.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 835;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "trazabilidadtransporte"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 26;
;
 if (true) break;

case 23:
//C
this.state = 26;
 BA.debugLineNum = 840;BA.debugLine="Dim cInfoExpedCorreosExp As cInfoExpedicionCorr";
Debug.ShouldStop(128);
_cinfoexpedcorreosexp = RemoteObject.createNew ("b4j.docU.cinfoexpedicioncorreosexpress");Debug.locals.put("cInfoExpedCorreosExp", _cinfoexpedcorreosexp);
 BA.debugLineNum = 841;BA.debugLine="cInfoExpedCorreosExp.Initialize(Expedicion)";
Debug.ShouldStop(256);
_cinfoexpedcorreosexp.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_expedicion));
 BA.debugLineNum = 842;BA.debugLine="cInfoExpedCorreosExp.Show";
Debug.ShouldStop(512);
_cinfoexpedcorreosexp.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_show" /*void*/ );
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 844;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No es posibl";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No es posible obtener información de trazabilidad de esta expedición mediante este formulario."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Consultar con Logística."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 846;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "trazabilidadtransporte"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 852;BA.debugLine="End Sub";
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
public static RemoteObject  _updateobservacionesfasedoc(RemoteObject __ref,RemoteObject _idmov,RemoteObject _observaciones) throws Exception{
try {
		Debug.PushSubsStack("UpdateObservacionesFaseDoc (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,1035);
if (RapidSub.canDelegate("updateobservacionesfasedoc")) { return __ref.runUserSub(false, "cfasesdocumento","updateobservacionesfasedoc", __ref, _idmov, _observaciones);}
ResumableSub_UpdateObservacionesFaseDoc rsub = new ResumableSub_UpdateObservacionesFaseDoc(null,__ref,_idmov,_observaciones);
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
public static class ResumableSub_UpdateObservacionesFaseDoc extends BA.ResumableSub {
public ResumableSub_UpdateObservacionesFaseDoc(b4j.docU.cfasesdocumento parent,RemoteObject __ref,RemoteObject _idmov,RemoteObject _observaciones) {
this.parent = parent;
this.__ref = __ref;
this._idmov = _idmov;
this._observaciones = _observaciones;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cfasesdocumento parent;
RemoteObject _idmov;
RemoteObject _observaciones;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateObservacionesFaseDoc (cfasesdocumento) ","cfasesdocumento",8,__ref.getField(false, "ba"),__ref,1035);
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
Debug.locals.put("IDMov", _idmov);
Debug.locals.put("Observaciones", _observaciones);
 BA.debugLineNum = 1036;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2048);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1039;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(16384);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 1040;BA.debugLine="Dim Comando As String=\"UpdateObsFaseDoc\"";
Debug.ShouldStop(32768);
_comando = BA.ObjectToString("UpdateObsFaseDoc");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1043;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDMov";
Debug.ShouldStop(262144);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_idmov),(_observaciones)})),(Object)(__ref));
 BA.debugLineNum = 1045;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "updateobservacionesfasedoc"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1046;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 1047;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1048;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "updateobservacionesfasedoc"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 1049;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1053;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 6:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 1054;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1056;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible actualizar las observaciones de la fase.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1057;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "updateobservacionesfasedoc"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1059;BA.debugLine="Dim lstRes As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 1060;BA.debugLine="Dim mResp As Map=lstRes.Get(0)";
Debug.ShouldStop(8);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 1061;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(16);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 1062;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
Debug.ShouldStop(32);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 1063;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1065;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible actualizar las observaciones de la fase."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1066;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cfasesdocumento", "updateobservacionesfasedoc"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1068;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
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
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 1074;BA.debugLine="Return Accion";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 1075;BA.debugLine="End Sub";
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
}