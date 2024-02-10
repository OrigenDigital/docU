package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cinfoexpediciontxt_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
cinfoexpediciontxt._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cinfoexpediciontxt._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
cinfoexpediciontxt._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cinfoexpediciontxt._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cinfoexpediciontxt._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cinfoexpediciontxt._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object";
cinfoexpediciontxt._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cinfoexpediciontxt._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Private mParent As B4XView";
cinfoexpediciontxt._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",cinfoexpediciontxt._mparent);
 //BA.debugLineNum = 9;BA.debugLine="Dim Background As B4XView";
cinfoexpediciontxt._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",cinfoexpediciontxt._background);
 //BA.debugLineNum = 11;BA.debugLine="Private mNumeroExpedicion As String";
cinfoexpediciontxt._mnumeroexpedicion = RemoteObject.createImmutable("");__ref.setField("_mnumeroexpedicion",cinfoexpediciontxt._mnumeroexpedicion);
 //BA.debugLineNum = 14;BA.debugLine="Private lblTitleNumExpedicion As Label";
cinfoexpediciontxt._lbltitlenumexpedicion = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlenumexpedicion",cinfoexpediciontxt._lbltitlenumexpedicion);
 //BA.debugLineNum = 15;BA.debugLine="Private txtNumExpedicion As TextField";
cinfoexpediciontxt._txtnumexpedicion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumexpedicion",cinfoexpediciontxt._txtnumexpedicion);
 //BA.debugLineNum = 17;BA.debugLine="Private UsuarioWS As String";
cinfoexpediciontxt._usuariows = RemoteObject.createImmutable("");__ref.setField("_usuariows",cinfoexpediciontxt._usuariows);
 //BA.debugLineNum = 18;BA.debugLine="Private PasswordWs As String";
cinfoexpediciontxt._passwordws = RemoteObject.createImmutable("");__ref.setField("_passwordws",cinfoexpediciontxt._passwordws);
 //BA.debugLineNum = 20;BA.debugLine="Private Dialog As B4XDialog";
cinfoexpediciontxt._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cinfoexpediciontxt._dialog);
 //BA.debugLineNum = 22;BA.debugLine="Private UserTXT As String";
cinfoexpediciontxt._usertxt = RemoteObject.createImmutable("");__ref.setField("_usertxt",cinfoexpediciontxt._usertxt);
 //BA.debugLineNum = 23;BA.debugLine="Private PswTXT As String";
cinfoexpediciontxt._pswtxt = RemoteObject.createImmutable("");__ref.setField("_pswtxt",cinfoexpediciontxt._pswtxt);
 //BA.debugLineNum = 24;BA.debugLine="Private TokenWebTXT As String";
cinfoexpediciontxt._tokenwebtxt = RemoteObject.createImmutable("");__ref.setField("_tokenwebtxt",cinfoexpediciontxt._tokenwebtxt);
 //BA.debugLineNum = 27;BA.debugLine="Public CallbackInfoEnvio As Object";
cinfoexpediciontxt._callbackinfoenvio = RemoteObject.createNew ("Object");__ref.setField("_callbackinfoenvio",cinfoexpediciontxt._callbackinfoenvio);
 //BA.debugLineNum = 29;BA.debugLine="Private jamTableViewInfoTrackingEnvio As jamTable";
cinfoexpediciontxt._jamtableviewinfotrackingenvio = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewinfotrackingenvio",cinfoexpediciontxt._jamtableviewinfotrackingenvio);
 //BA.debugLineNum = 30;BA.debugLine="Private txtRef As TextField";
cinfoexpediciontxt._txtref = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtref",cinfoexpediciontxt._txtref);
 //BA.debugLineNum = 31;BA.debugLine="Private txtFecha As TextField";
cinfoexpediciontxt._txtfecha = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfecha",cinfoexpediciontxt._txtfecha);
 //BA.debugLineNum = 32;BA.debugLine="Private txtDirRte As TextField";
cinfoexpediciontxt._txtdirrte = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdirrte",cinfoexpediciontxt._txtdirrte);
 //BA.debugLineNum = 33;BA.debugLine="Private txtPobRte As TextField";
cinfoexpediciontxt._txtpobrte = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpobrte",cinfoexpediciontxt._txtpobrte);
 //BA.debugLineNum = 34;BA.debugLine="Private txtCodPosNacRte As TextField";
cinfoexpediciontxt._txtcodposnacrte = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodposnacrte",cinfoexpediciontxt._txtcodposnacrte);
 //BA.debugLineNum = 35;BA.debugLine="Private txtNomDest As TextField";
cinfoexpediciontxt._txtnomdest = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnomdest",cinfoexpediciontxt._txtnomdest);
 //BA.debugLineNum = 36;BA.debugLine="Private txtDirDest As TextField";
cinfoexpediciontxt._txtdirdest = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdirdest",cinfoexpediciontxt._txtdirdest);
 //BA.debugLineNum = 37;BA.debugLine="Private txtPobDest As TextField";
cinfoexpediciontxt._txtpobdest = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpobdest",cinfoexpediciontxt._txtpobdest);
 //BA.debugLineNum = 38;BA.debugLine="Private txtCodPosNacDest As TextField";
cinfoexpediciontxt._txtcodposnacdest = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodposnacdest",cinfoexpediciontxt._txtcodposnacdest);
 //BA.debugLineNum = 39;BA.debugLine="Private txtNumBultos As TextField";
cinfoexpediciontxt._txtnumbultos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumbultos",cinfoexpediciontxt._txtnumbultos);
 //BA.debugLineNum = 40;BA.debugLine="Private txtKilos As TextField";
cinfoexpediciontxt._txtkilos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtkilos",cinfoexpediciontxt._txtkilos);
 //BA.debugLineNum = 41;BA.debugLine="Private txtVolumen As TextField";
cinfoexpediciontxt._txtvolumen = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtvolumen",cinfoexpediciontxt._txtvolumen);
 //BA.debugLineNum = 42;BA.debugLine="Private txtCodIncEstado As TextField";
cinfoexpediciontxt._txtcodincestado = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodincestado",cinfoexpediciontxt._txtcodincestado);
 //BA.debugLineNum = 43;BA.debugLine="Private txtDescIncEstado As TextField";
cinfoexpediciontxt._txtdescincestado = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdescincestado",cinfoexpediciontxt._txtdescincestado);
 //BA.debugLineNum = 44;BA.debugLine="Private btnAlbaranNAV As Button";
cinfoexpediciontxt._btnalbarannav = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnalbarannav",cinfoexpediciontxt._btnalbarannav);
 //BA.debugLineNum = 46;BA.debugLine="Type TipoDatosExpedicionXT(CODEMPRESA As String,";
;
 //BA.debugLineNum = 54;BA.debugLine="Private mDatosExpedicionTXTSeleccionada As TipoDa";
cinfoexpediciontxt._mdatosexpediciontxtseleccionada = RemoteObject.createNew ("b4j.docU.cinfoexpediciontxt._tipodatosexpedicionxt");__ref.setField("_mdatosexpediciontxtseleccionada",cinfoexpediciontxt._mdatosexpediciontxtseleccionada);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _parent,RemoteObject _numexpedicion) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cinfoexpediciontxt) ","cinfoexpediciontxt",38,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cinfoexpediciontxt","initialize", __ref, _ba, _callback, _parent, _numexpedicion);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Parent", _parent);
Debug.locals.put("NumExpedicion", _numexpedicion);
 BA.debugLineNum = 64;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="mCallBack=CallBack";
Debug.ShouldStop(1);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 66;BA.debugLine="mParent=Parent";
Debug.ShouldStop(2);
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 67;BA.debugLine="Background= xui.CreatePanel(\"background\")";
Debug.ShouldStop(4);
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("background"))));
 BA.debugLineNum = 68;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
Debug.ShouldStop(8);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("b4xdialog_background")));
 BA.debugLineNum = 69;BA.debugLine="Background.Color=0xaa000000";
Debug.ShouldStop(16);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 70;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.ShouldStop(32);
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 72;BA.debugLine="mNumeroExpedicion=NumExpedicion";
Debug.ShouldStop(128);
__ref.setField ("_mnumeroexpedicion" /*RemoteObject*/ ,_numexpedicion);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}