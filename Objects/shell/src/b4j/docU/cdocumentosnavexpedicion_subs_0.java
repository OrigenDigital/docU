package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cdocumentosnavexpedicion_subs_0 {


public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cdocumentosnavexpedicion) ","cdocumentosnavexpedicion",28,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cdocumentosnavexpedicion","btnsalir_click", __ref);}
 BA.debugLineNum = 87;BA.debugLine="Private Sub btnSalir_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="SalirModulo";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.docU.cdocumentosnavexpedicion.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnselnumexpedicion_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelNumExpedicion_Click (cdocumentosnavexpedicion) ","cdocumentosnavexpedicion",28,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("btnselnumexpedicion_click")) { __ref.runUserSub(false, "cdocumentosnavexpedicion","btnselnumexpedicion_click", __ref); return;}
ResumableSub_btnSelNumExpedicion_Click rsub = new ResumableSub_btnSelNumExpedicion_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelNumExpedicion_Click extends BA.ResumableSub {
public ResumableSub_btnSelNumExpedicion_Click(b4j.docU.cdocumentosnavexpedicion parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cdocumentosnavexpedicion parent;
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _numexpedicion = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject group31;
int index31;
int groupLen31;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelNumExpedicion_Click (cdocumentosnavexpedicion) ","cdocumentosnavexpedicion",28,__ref.getField(false, "ba"),__ref,36);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 37;BA.debugLine="Dialog.Title=\"Indica Nº Expedición\"";
Debug.ShouldStop(16);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Nº Expedición")));
 BA.debugLineNum = 38;BA.debugLine="Dialog.TitleBarHeight=50dip";
Debug.ShouldStop(32);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 39;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(64);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 40;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(128);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 41;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(256);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 42;BA.debugLine="InputDlg.Text=\"\"";
Debug.ShouldStop(512);
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 44;BA.debugLine="Utilidades.SetLightThemeInput(InputDlg)";
Debug.ShouldStop(2048);
parent._utilidades.runVoidMethod ("_setlightthemeinput" /*RemoteObject*/ ,(Object)(_inputdlg));
 BA.debugLineNum = 45;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.ShouldStop(4096);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 46;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(8192);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 47;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(16384);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 48;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(32768);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 49;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(65536);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 50;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(131072);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 51;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(262144);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 52;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cdocumentosnavexpedicion", "btnselnumexpedicion_click"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 54;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 55;BA.debugLine="Dim NumExpedicion As String=InputDlg.Text.Trim.To";
Debug.ShouldStop(4194304);
_numexpedicion = _inputdlg.getField(true,"_text" /*RemoteObject*/ ).runMethod(true,"trim").runMethod(true,"toUpperCase");Debug.locals.put("NumExpedicion", _numexpedicion);Debug.locals.put("NumExpedicion", _numexpedicion);
 BA.debugLineNum = 57;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Es una exp";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Es una expedición de DHL?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 58;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cdocumentosnavexpedicion", "btnselnumexpedicion_click"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 59;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 60;BA.debugLine="NumExpedicion=NumExpedicion.SubString2(8,10) & N";
Debug.ShouldStop(134217728);
_numexpedicion = RemoteObject.concat(_numexpedicion.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 8)),(Object)(BA.numberCast(int.class, 10))),_numexpedicion.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 20))));Debug.locals.put("NumExpedicion", _numexpedicion);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 63;BA.debugLine="txtNumExpedicion.Text=NumExpedicion";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtnumexpedicion" /*RemoteObject*/ ).runMethod(true,"setText",_numexpedicion);
 BA.debugLineNum = 65;BA.debugLine="clvDocumentosExpedicion.Clear";
Debug.ShouldStop(1);
__ref.getField(false,"_clvdocumentosexpedicion" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 67;BA.debugLine="Wait For(DocumentosExpedicion(NumExpedicion)) com";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cdocumentosnavexpedicion", "btnselnumexpedicion_click"), __ref.runClassMethod (b4j.docU.cdocumentosnavexpedicion.class, "_documentosexpedicion" /*RemoteObject*/ ,(Object)(_numexpedicion)));
this.state = 23;
return;
case 23:
//C
this.state = 11;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 68;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 69;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(16);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
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
 BA.debugLineNum = 70;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(32);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 71;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(64);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 72;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(128);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 73;BA.debugLine="For Each mData As Map In lstReg";
Debug.ShouldStop(256);
if (true) break;

case 17:
//for
this.state = 20;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group31 = _lstreg;
index31 = 0;
groupLen31 = group31.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 24;
if (true) break;

case 24:
//C
this.state = 20;
if (index31 < groupLen31) {
this.state = 19;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group31.runMethod(false,"Get",index31));Debug.locals.put("mData", _mdata);}
if (true) break;

case 25:
//C
this.state = 24;
index31++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 19:
//C
this.state = 25;
 BA.debugLineNum = 74;BA.debugLine="Log(mData)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","861276198",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 75;BA.debugLine="Dim p As Pane=xui.CreatePanel(\"\")";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 76;BA.debugLine="p.LoadLayout(\"scrItemDocumentoExpedicion\")";
Debug.ShouldStop(2048);
_p.runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrItemDocumentoExpedicion")));
 BA.debugLineNum = 77;BA.debugLine="p.SetLayoutAnimated(0,0,0,clvDocumentosExpedicio";
Debug.ShouldStop(4096);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_clvdocumentosexpedicion" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))))));
 BA.debugLineNum = 79;BA.debugLine="txtDocumento.Text=mData.Get(\"Documento\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtdocumento" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))));
 BA.debugLineNum = 80;BA.debugLine="txtFechaHoraMov.Text=$\"$DateTime{mData.Get(\"Fech";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtfechahoramov" /*RemoteObject*/ ).runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("datetime")),(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaHoraMov")))))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 81;BA.debugLine="txtTransporte.Text=mData.Get(\"ResponsableFase\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_txttransporte" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableFase"))))));
 BA.debugLineNum = 82;BA.debugLine="clvDocumentosExpedicion.Add(p,\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_clvdocumentosexpedicion" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 84;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(524288);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _rint) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _rint) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
cdocumentosnavexpedicion._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cdocumentosnavexpedicion._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
cdocumentosnavexpedicion._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cdocumentosnavexpedicion._frm);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
cdocumentosnavexpedicion._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cdocumentosnavexpedicion._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private Dialog As B4XDialog";
cdocumentosnavexpedicion._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cdocumentosnavexpedicion._dialog);
 //BA.debugLineNum = 7;BA.debugLine="Private btnSalir As B4XView";
cdocumentosnavexpedicion._btnsalir = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnsalir",cdocumentosnavexpedicion._btnsalir);
 //BA.debugLineNum = 9;BA.debugLine="Private txtNumExpedicion As B4XView";
cdocumentosnavexpedicion._txtnumexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnumexpedicion",cdocumentosnavexpedicion._txtnumexpedicion);
 //BA.debugLineNum = 10;BA.debugLine="Private clvDocumentosExpedicion As CustomListView";
cdocumentosnavexpedicion._clvdocumentosexpedicion = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvdocumentosexpedicion",cdocumentosnavexpedicion._clvdocumentosexpedicion);
 //BA.debugLineNum = 11;BA.debugLine="Private txtDocumento As B4XView";
cdocumentosnavexpedicion._txtdocumento = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtdocumento",cdocumentosnavexpedicion._txtdocumento);
 //BA.debugLineNum = 12;BA.debugLine="Private txtFechaHoraMov As B4XView";
cdocumentosnavexpedicion._txtfechahoramov = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtfechahoramov",cdocumentosnavexpedicion._txtfechahoramov);
 //BA.debugLineNum = 13;BA.debugLine="Private txtTransporte As B4XView";
cdocumentosnavexpedicion._txttransporte = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txttransporte",cdocumentosnavexpedicion._txttransporte);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _documentosexpedicion(RemoteObject __ref,RemoteObject _numexp) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicion (cdocumentosnavexpedicion) ","cdocumentosnavexpedicion",28,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("documentosexpedicion")) { return __ref.runUserSub(false, "cdocumentosnavexpedicion","documentosexpedicion", __ref, _numexp);}
ResumableSub_DocumentosExpedicion rsub = new ResumableSub_DocumentosExpedicion(null,__ref,_numexp);
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
public static class ResumableSub_DocumentosExpedicion extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicion(b4j.docU.cdocumentosnavexpedicion parent,RemoteObject __ref,RemoteObject _numexp) {
this.parent = parent;
this.__ref = __ref;
this._numexp = _numexp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cdocumentosnavexpedicion parent;
RemoteObject _numexp;
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
		Debug.PushSubsStack("DocumentosExpedicion (cdocumentosnavexpedicion) ","cdocumentosnavexpedicion",28,__ref.getField(false, "ba"),__ref,101);
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
Debug.locals.put("NumExp", _numexp);
 BA.debugLineNum = 103;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(64);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 104;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(128);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 105;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 106;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(512);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 107;BA.debugLine="Dim Comando As String=\"DocumentosFaseExpedicionNu";
Debug.ShouldStop(1024);
_comando = BA.ObjectToString("DocumentosFaseExpedicionNumeroExpedicion");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 110;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(NumEx";
Debug.ShouldStop(8192);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_numexp)})),(Object)(__ref));
 BA.debugLineNum = 112;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cdocumentosnavexpedicion", "documentosexpedicion"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 113;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 114;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 115;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cdocumentosnavexpedicion", "documentosexpedicion"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 116;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 117;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 119;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 120;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 121;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 122;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(33554432);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay datos de documentos para el número de expedición seleccionado ("),_numexp,RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 123;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cdocumentosnavexpedicion", "documentosexpedicion"), _msa);
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
 BA.debugLineNum = 125;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 126;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 127;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1073741824);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 128;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 131;BA.debugLine="Return mRes";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 132;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cdocumentosnavexpedicion) ","cdocumentosnavexpedicion",28,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cdocumentosnavexpedicion","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 96;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="EventData.Consume";
Debug.ShouldStop(1);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Initialize (cdocumentosnavexpedicion) ","cdocumentosnavexpedicion",28,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cdocumentosnavexpedicion","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("SalirModulo (cdocumentosnavexpedicion) ","cdocumentosnavexpedicion",28,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cdocumentosnavexpedicion","salirmodulo", __ref);}
 BA.debugLineNum = 91;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="frm.Close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 93;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(268435456);
cdocumentosnavexpedicion._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Show (cdocumentosnavexpedicion) ","cdocumentosnavexpedicion",28,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cdocumentosnavexpedicion","show", __ref);}
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 21;BA.debugLine="Sub Show";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, cdocumentosnavexpedicion._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, cdocumentosnavexpedicion._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(4194304);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 24;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(8388608);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 25;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(16777216);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(cdocumentosnavexpedicion.__c.getField(true,"True"))})));
 BA.debugLineNum = 26;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(33554432);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(cdocumentosnavexpedicion._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 27;BA.debugLine="frm.RootPane.LoadLayout(\"scrDocumentosExpedicion\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrDocumentosExpedicion")));
 BA.debugLineNum = 29;BA.debugLine="txtNumExpedicion.Text=\"\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtnumexpedicion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 30;BA.debugLine="Dialog.Initialize (frm.RootPane)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 31;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
Debug.ShouldStop(1073741824);
cdocumentosnavexpedicion._utilidades.runVoidMethod ("_setlightthemedialog" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="frm.Show";
Debug.ShouldStop(1);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}