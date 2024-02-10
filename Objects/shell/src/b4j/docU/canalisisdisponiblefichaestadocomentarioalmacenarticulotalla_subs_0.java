package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class canalisisdisponiblefichaestadocomentarioalmacenarticulotalla_subs_0 {


public static RemoteObject  _background_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("background_MouseClicked (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("background_mouseclicked")) { return __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","background_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 247;BA.debugLine="Private Sub background_MouseClicked (EventData As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="EventData.Consume";
Debug.ShouldStop(8388608);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btncancelarfichaestadocomentarioalmacenarticulotalla_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCancelarFichaEstadoComentarioAlmacenArticuloTalla_Click (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("btncancelarfichaestadocomentarioalmacenarticulotalla_click")) { __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","btncancelarfichaestadocomentarioalmacenarticulotalla_click", __ref); return;}
ResumableSub_btnCancelarFichaEstadoComentarioAlmacenArticuloTalla_Click rsub = new ResumableSub_btnCancelarFichaEstadoComentarioAlmacenArticuloTalla_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnCancelarFichaEstadoComentarioAlmacenArticuloTalla_Click extends BA.ResumableSub {
public ResumableSub_btnCancelarFichaEstadoComentarioAlmacenArticuloTalla_Click(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnCancelarFichaEstadoComentarioAlmacenArticuloTalla_Click (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,289);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 290;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"¿Salir";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "btncancelarfichaestadocomentarioalmacenarticulotalla_click"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("¿Salir sin realizar ningún cambio?")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 291;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
 BA.debugLineNum = 292;BA.debugLine="SalirForm";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 293;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _rint) throws Exception{
}
public static void  _btngrabarfichaestadocomentarioalmacenarticulotalla_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnGrabarFichaEstadoComentarioAlmacenArticuloTalla_Click (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,295);
if (RapidSub.canDelegate("btngrabarfichaestadocomentarioalmacenarticulotalla_click")) { __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","btngrabarfichaestadocomentarioalmacenarticulotalla_click", __ref); return;}
ResumableSub_btnGrabarFichaEstadoComentarioAlmacenArticuloTalla_Click rsub = new ResumableSub_btnGrabarFichaEstadoComentarioAlmacenArticuloTalla_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnGrabarFichaEstadoComentarioAlmacenArticuloTalla_Click extends BA.ResumableSub {
public ResumableSub_btnGrabarFichaEstadoComentarioAlmacenArticuloTalla_Click(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnGrabarFichaEstadoComentarioAlmacenArticuloTalla_Click (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,295);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 296;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"¿Graba";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "btngrabarfichaestadocomentarioalmacenarticulotalla_click"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("¿Grabar los datos de la ficha?")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 297;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 298;BA.debugLine="GrabarDatosFicha";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_grabardatosficha" /*void*/ );
 BA.debugLineNum = 299;BA.debugLine="End Sub";
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
public static void  _btnselnuevafecha_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelNuevaFecha_Click (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("btnselnuevafecha_click")) { __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","btnselnuevafecha_click", __ref); return;}
ResumableSub_btnSelNuevaFecha_Click rsub = new ResumableSub_btnSelNuevaFecha_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelNuevaFecha_Click extends BA.ResumableSub {
public ResumableSub_btnSelNuevaFecha_Click(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
RemoteObject _b4xdatedlg = RemoteObject.declareNull("b4j.docU.b4xdatetemplate");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _nuevafechasel = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelNuevaFecha_Click (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,251);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 252;BA.debugLine="Dialog.Title=\"Indica Fecha Registro\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Fecha Registro")));
 BA.debugLineNum = 254;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
Debug.ShouldStop(536870912);
_b4xdatedlg = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");Debug.locals.put("B4XDateDlg", _b4xdatedlg);
 BA.debugLineNum = 255;BA.debugLine="B4XDateDlg.Initialize";
Debug.ShouldStop(1073741824);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 256;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(-2147483648);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 257;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(1);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 258;BA.debugLine="B4XDateDlg.Date=DateTime.DateParse(txtNuevaFecha.";
Debug.ShouldStop(2);
_b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_txtnuevafecha" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 259;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(4);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 262;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
Debug.ShouldStop(32);
_b4xdatedlg.setField ("_closeonselection" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 263;BA.debugLine="B4XDateDlg.FirstDay=1";
Debug.ShouldStop(64);
_b4xdatedlg.setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 264;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
Debug.ShouldStop(128);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xdatedlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 267;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(1024);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 268;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(2048);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 269;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(4096);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 270;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(8192);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 271;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "btnselnuevafecha_click"), _rsub);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 272;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 273;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 275;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(262144);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 276;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(524288);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 277;BA.debugLine="Dim NuevaFechaSel As Long=B4XDateDlg.Date";
Debug.ShouldStop(1048576);
_nuevafechasel = _b4xdatedlg.runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ );Debug.locals.put("NuevaFechaSel", _nuevafechasel);Debug.locals.put("NuevaFechaSel", _nuevafechasel);
 BA.debugLineNum = 278;BA.debugLine="txtNuevaFecha.Text=DateTime.Date(NuevaFechaSel)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtnuevafecha" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_nuevafechasel)));
 BA.debugLineNum = 279;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(4194304);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _cargadatosfichaestadocomentarioalmacenarticulotalla(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosFichaEstadoComentarioAlmacenArticuloTalla (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("cargadatosfichaestadocomentarioalmacenarticulotalla")) { return __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","cargadatosfichaestadocomentarioalmacenarticulotalla", __ref);}
ResumableSub_CargaDatosFichaEstadoComentarioAlmacenArticuloTalla rsub = new ResumableSub_CargaDatosFichaEstadoComentarioAlmacenArticuloTalla(null,__ref);
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
public static class ResumableSub_CargaDatosFichaEstadoComentarioAlmacenArticuloTalla extends BA.ResumableSub {
public ResumableSub_CargaDatosFichaEstadoComentarioAlmacenArticuloTalla(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosFichaEstadoComentarioAlmacenArticuloTalla (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,209);
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
 BA.debugLineNum = 210;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(131072);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 211;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(262144);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 212;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(524288);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 213;BA.debugLine="Dim mResult As Map";
Debug.ShouldStop(1048576);
_mresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mResult", _mresult);
 BA.debugLineNum = 214;BA.debugLine="mResult.Initialize";
Debug.ShouldStop(2097152);
_mresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 215;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(4194304);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 216;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
Debug.ShouldStop(8388608);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstregistros.getObject())));
 BA.debugLineNum = 217;BA.debugLine="Dim Comando As String";
Debug.ShouldStop(16777216);
_comando = RemoteObject.createImmutable("");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 218;BA.debugLine="Comando=\"AnalisisDisponiblesFichaEstadoComentario";
Debug.ShouldStop(33554432);
_comando = BA.ObjectToString("AnalisisDisponiblesFichaEstadoComentarioAlmacenArticuloTalla");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 220;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(134217728);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(__ref.getField(true,"_malmacen" /*RemoteObject*/ )),(__ref.getField(true,"_marticulo" /*RemoteObject*/ )),(__ref.getField(true,"_mtalla" /*RemoteObject*/ ))})),(Object)(__ref));
 BA.debugLineNum = 221;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "cargadatosfichaestadocomentarioalmacenarticulotalla"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 223;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 224;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 226;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 227;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "cargadatosfichaestadocomentarioalmacenarticulotalla"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 228;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 229;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(16);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 231;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 234;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 235;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(1024);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 237;BA.debugLine="lstRegistros=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4096);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 238;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 239;BA.debugLine="mResult.Put(\"Accion\",Accion)";
Debug.ShouldStop(16384);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 240;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 243;BA.debugLine="Return mResult";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 BA.debugLineNum = 244;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private Dialog As B4XDialog";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._dialog);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Private mParent As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._mparent);
 //BA.debugLineNum = 10;BA.debugLine="Dim Background As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._background);
 //BA.debugLineNum = 11;BA.debugLine="Dim pnlBase As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._pnlbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlbase",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._pnlbase);
 //BA.debugLineNum = 13;BA.debugLine="Private mAlmacen As String";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._malmacen = RemoteObject.createImmutable("");__ref.setField("_malmacen",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._malmacen);
 //BA.debugLineNum = 14;BA.debugLine="Private mNombreAlmacen As String";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._mnombrealmacen = RemoteObject.createImmutable("");__ref.setField("_mnombrealmacen",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._mnombrealmacen);
 //BA.debugLineNum = 15;BA.debugLine="Private mArticulo As String";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._marticulo = RemoteObject.createImmutable("");__ref.setField("_marticulo",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._marticulo);
 //BA.debugLineNum = 16;BA.debugLine="Private mDescripcionArticulo As String";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._mdescripcionarticulo = RemoteObject.createImmutable("");__ref.setField("_mdescripcionarticulo",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._mdescripcionarticulo);
 //BA.debugLineNum = 17;BA.debugLine="Private mTalla As String";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._mtalla = RemoteObject.createImmutable("");__ref.setField("_mtalla",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._mtalla);
 //BA.debugLineNum = 19;BA.debugLine="Type TipoDatosAnalisisDisponibleFichaAlmacenArtic";
;
 //BA.debugLineNum = 20;BA.debugLine="Private DatosAnalisisDisponibleFichaAlmacenArticu";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._datosanalisisdisponiblefichaalmacenarticulotalla = RemoteObject.createNew ("b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla");__ref.setField("_datosanalisisdisponiblefichaalmacenarticulotalla",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._datosanalisisdisponiblefichaalmacenarticulotalla);
 //BA.debugLineNum = 22;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._jamloadingindicator1);
 //BA.debugLineNum = 24;BA.debugLine="Private btnSelNuevaFecha As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._btnselnuevafecha = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnselnuevafecha",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._btnselnuevafecha);
 //BA.debugLineNum = 25;BA.debugLine="Private chboNuevoEstado As ChoiceBox";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._chbonuevoestado = RemoteObject.createNew ("anywheresoftware.b4j.objects.ChoiceBoxWrapper");__ref.setField("_chbonuevoestado",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._chbonuevoestado);
 //BA.debugLineNum = 26;BA.debugLine="Private txtAlmacen As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtalmacen = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtalmacen",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtalmacen);
 //BA.debugLineNum = 27;BA.debugLine="Private txtAreaComentario As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtareacomentario = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtareacomentario",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtareacomentario);
 //BA.debugLineNum = 28;BA.debugLine="Private txtArticulo As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtarticulo",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtarticulo);
 //BA.debugLineNum = 29;BA.debugLine="Private txtDescripcionArticulo As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtdescripcionarticulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtdescripcionarticulo",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtdescripcionarticulo);
 //BA.debugLineNum = 30;BA.debugLine="Private txtEstadoActual As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtestadoactual = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtestadoactual",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtestadoactual);
 //BA.debugLineNum = 31;BA.debugLine="Private txtFechaActual As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtfechaactual = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtfechaactual",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtfechaactual);
 //BA.debugLineNum = 32;BA.debugLine="Private txtNombreAlmacen As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtnombrealmacen = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnombrealmacen",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtnombrealmacen);
 //BA.debugLineNum = 33;BA.debugLine="Private txtNuevaFecha As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtnuevafecha = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnuevafecha",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtnuevafecha);
 //BA.debugLineNum = 34;BA.debugLine="Private txtNuevoUsuario As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtnuevousuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnuevousuario",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtnuevousuario);
 //BA.debugLineNum = 35;BA.debugLine="Private txtTalla As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txttalla = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txttalla",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txttalla);
 //BA.debugLineNum = 36;BA.debugLine="Private txtUsuarioActual As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtusuarioactual = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtusuarioactual",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._txtusuarioactual);
 //BA.debugLineNum = 37;BA.debugLine="Private btnGrabarFichaEstadoComentarioAlmacenArti";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._btngrabarfichaestadocomentarioalmacenarticulotalla = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btngrabarfichaestadocomentarioalmacenarticulotalla",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._btngrabarfichaestadocomentarioalmacenarticulotalla);
 //BA.debugLineNum = 38;BA.debugLine="Private btnCancelarFichaEstadoComentarioAlmacenAr";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._btncancelarfichaestadocomentarioalmacenarticulotalla = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btncancelarfichaestadocomentarioalmacenarticulotalla",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._btncancelarfichaestadocomentarioalmacenarticulotalla);
 //BA.debugLineNum = 39;BA.debugLine="Private btnEliminarFichaEstadoComentarioAlmacenAr";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._btneliminarfichaestadocomentarioalmacenarticulotalla = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btneliminarfichaestadocomentarioalmacenarticulotalla",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._btneliminarfichaestadocomentarioalmacenarticulotalla);
 //BA.debugLineNum = 40;BA.debugLine="Private lblModoFichaEstadoComentario As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._lblmodofichaestadocomentario = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblmodofichaestadocomentario",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._lblmodofichaestadocomentario);
 //BA.debugLineNum = 42;BA.debugLine="Private ModoFicha As String";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._modoficha = RemoteObject.createImmutable("");__ref.setField("_modoficha",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._modoficha);
 //BA.debugLineNum = 43;BA.debugLine="Private lblTitlePanel As B4XView";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._lbltitlepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbltitlepanel",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._lbltitlepanel);
 //BA.debugLineNum = 45;BA.debugLine="Private DownX As Double";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._downx = RemoteObject.createImmutable(0);__ref.setField("_downx",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._downx);
 //BA.debugLineNum = 46;BA.debugLine="Private DownY As Double";
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._downy = RemoteObject.createImmutable(0);__ref.setField("_downy",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._downy);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _controleshabilitados(RemoteObject __ref,RemoteObject _habilitados) throws Exception{
try {
		Debug.PushSubsStack("ControlesHabilitados (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("controleshabilitados")) { return __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","controleshabilitados", __ref, _habilitados);}
Debug.locals.put("Habilitados", _habilitados);
 BA.debugLineNum = 126;BA.debugLine="Sub ControlesHabilitados(Habilitados As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 129;BA.debugLine="btnGrabarFichaEstadoComentarioAlmacenArticuloTall";
Debug.ShouldStop(1);
__ref.getField(false,"_btngrabarfichaestadocomentarioalmacenarticulotalla" /*RemoteObject*/ ).runMethod(true,"setEnabled",_habilitados);
 BA.debugLineNum = 130;BA.debugLine="btnCancelarFichaEstadoComentarioAlmacenArticuloTa";
Debug.ShouldStop(2);
__ref.getField(false,"_btncancelarfichaestadocomentarioalmacenarticulotalla" /*RemoteObject*/ ).runMethod(true,"setEnabled",_habilitados);
 BA.debugLineNum = 131;BA.debugLine="btnSelNuevaFecha.Enabled=Habilitados";
Debug.ShouldStop(4);
__ref.getField(false,"_btnselnuevafecha" /*RemoteObject*/ ).runMethod(true,"setEnabled",_habilitados);
 BA.debugLineNum = 132;BA.debugLine="txtAreaComentario.Enabled=Habilitados";
Debug.ShouldStop(8);
__ref.getField(false,"_txtareacomentario" /*RemoteObject*/ ).runMethod(true,"setEnabled",_habilitados);
 BA.debugLineNum = 133;BA.debugLine="chboNuevoEstado.Enabled=Habilitados";
Debug.ShouldStop(16);
__ref.getField(false,"_chbonuevoestado" /*RemoteObject*/ ).runMethod(true,"setEnabled",_habilitados);
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 122;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="EventData.Consume";
Debug.ShouldStop(67108864);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _grabardatosficha(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GrabarDatosFicha (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,305);
if (RapidSub.canDelegate("grabardatosficha")) { __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","grabardatosficha", __ref); return;}
ResumableSub_GrabarDatosFicha rsub = new ResumableSub_GrabarDatosFicha(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GrabarDatosFicha extends BA.ResumableSub {
public ResumableSub_GrabarDatosFicha(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _estadosel = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GrabarDatosFicha (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,305);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 306;BA.debugLine="Wait For(NuevoEditarEstadoComentarioAnalisisDispA";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "grabardatosficha"), __ref.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_nuevoeditarestadocomentarioanalisisdispalmarttalla" /*RemoteObject*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 307;BA.debugLine="Dim Accion As String=mRes.get(\"Accion\")";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 308;BA.debugLine="If Accion=\"NOK\" Then Return";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 309;BA.debugLine="DatosAnalisisDisponibleFichaAlmacenArticuloTalla.";
Debug.ShouldStop(1048576);
__ref.getField(false,"_datosanalisisdisponiblefichaalmacenarticulotalla" /*RemoteObject*/ ).setField ("DatosModificados" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 310;BA.debugLine="DatosAnalisisDisponibleFichaAlmacenArticuloTalla.";
Debug.ShouldStop(2097152);
__ref.getField(false,"_datosanalisisdisponiblefichaalmacenarticulotalla" /*RemoteObject*/ ).setField ("ConComentario" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("!",__ref.getField(false,"_txtareacomentario" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))));
 BA.debugLineNum = 311;BA.debugLine="DatosAnalisisDisponibleFichaAlmacenArticuloTalla.";
Debug.ShouldStop(4194304);
__ref.getField(false,"_datosanalisisdisponiblefichaalmacenarticulotalla" /*RemoteObject*/ ).setField ("Comentario" /*RemoteObject*/ ,__ref.getField(false,"_txtareacomentario" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 312;BA.debugLine="Dim EstadoSel As String";
Debug.ShouldStop(8388608);
_estadosel = RemoteObject.createImmutable("");Debug.locals.put("EstadoSel", _estadosel);
 BA.debugLineNum = 313;BA.debugLine="If chboNuevoEstado.SelectedIndex=-1 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_chbonuevoestado" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 314;BA.debugLine="EstadoSel=\"\"";
Debug.ShouldStop(33554432);
_estadosel = BA.ObjectToString("");Debug.locals.put("EstadoSel", _estadosel);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 316;BA.debugLine="EstadoSel=chboNuevoEstado.Items.Get(chboNuevoEst";
Debug.ShouldStop(134217728);
_estadosel = BA.ObjectToString(__ref.getField(false,"_chbonuevoestado" /*RemoteObject*/ ).runMethod(false,"getItems").runMethod(false,"Get",(Object)(__ref.getField(false,"_chbonuevoestado" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));Debug.locals.put("EstadoSel", _estadosel);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 318;BA.debugLine="DatosAnalisisDisponibleFichaAlmacenArticuloTalla.";
Debug.ShouldStop(536870912);
__ref.getField(false,"_datosanalisisdisponiblefichaalmacenarticulotalla" /*RemoteObject*/ ).setField ("Estado" /*RemoteObject*/ ,_estadosel);
 BA.debugLineNum = 319;BA.debugLine="SalirForm";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 320;BA.debugLine="End Sub";
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
public static RemoteObject  _inicio(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Inicio (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("inicio")) { return __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","inicio", __ref);}
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
public ResumableSub_Inicio(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Inicio (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,149);
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
 BA.debugLineNum = 151;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando datos...")));
 BA.debugLineNum = 152;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 154;BA.debugLine="wait for(CargaDatosFichaEstadoComentarioAlmacenAr";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "inicio"), __ref.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_cargadatosfichaestadocomentarioalmacenarticulotalla" /*RemoteObject*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 156;BA.debugLine="If mResult.Get(\"Accion\")<>\"OK\" Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))),RemoteObject.createImmutable(("OK")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 158;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 159;BA.debugLine="SalirForm";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_salirform" /*RemoteObject*/ );
 BA.debugLineNum = 160;BA.debugLine="Return Null";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 162;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(2);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 164;BA.debugLine="chboNuevoEstado.Items.AddAll(Array As String(\"\",\"";
Debug.ShouldStop(8);
__ref.getField(false,"_chbonuevoestado" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString(""),BA.ObjectToString("OK"),BA.ObjectToString("PENDIENTE"),RemoteObject.createImmutable("OBSOLETO")})))));
 BA.debugLineNum = 166;BA.debugLine="txtAlmacen.Text=mAlmacen";
Debug.ShouldStop(32);
__ref.getField(false,"_txtalmacen" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_malmacen" /*RemoteObject*/ ));
 BA.debugLineNum = 167;BA.debugLine="txtNombreAlmacen.Text=mNombreAlmacen";
Debug.ShouldStop(64);
__ref.getField(false,"_txtnombrealmacen" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_mnombrealmacen" /*RemoteObject*/ ));
 BA.debugLineNum = 168;BA.debugLine="txtArticulo.Text=mArticulo";
Debug.ShouldStop(128);
__ref.getField(false,"_txtarticulo" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_marticulo" /*RemoteObject*/ ));
 BA.debugLineNum = 169;BA.debugLine="txtDescripcionArticulo.Text=mDescripcionArticulo";
Debug.ShouldStop(256);
__ref.getField(false,"_txtdescripcionarticulo" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_mdescripcionarticulo" /*RemoteObject*/ ));
 BA.debugLineNum = 170;BA.debugLine="txtTalla.Text=mTalla";
Debug.ShouldStop(512);
__ref.getField(false,"_txttalla" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_mtalla" /*RemoteObject*/ ));
 BA.debugLineNum = 172;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(2048);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 173;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(4096);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 174;BA.debugLine="txtNuevaFecha.Text=DateTime.Date(DateTime.Now)";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtnuevafecha" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 175;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(16384);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 177;BA.debugLine="txtNuevoUsuario.Text=Main.DatosUsuario.NombreUsua";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtnuevousuario" /*RemoteObject*/ ).runMethod(true,"setText",parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ ));
 BA.debugLineNum = 179;BA.debugLine="If lstReg.Size=0 Then";
Debug.ShouldStop(262144);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_lstreg.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 180;BA.debugLine="btnEliminarFichaEstadoComentarioAlmacenArticuloT";
Debug.ShouldStop(524288);
__ref.getField(false,"_btneliminarfichaestadocomentarioalmacenarticulotalla" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 181;BA.debugLine="ModoFicha=\"NUEVO\"";
Debug.ShouldStop(1048576);
__ref.setField ("_modoficha" /*RemoteObject*/ ,BA.ObjectToString("NUEVO"));
 BA.debugLineNum = 182;BA.debugLine="lblModoFichaEstadoComentario.Text=\"Modo: \" & Mod";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblmodofichaestadocomentario" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Modo: "),__ref.getField(true,"_modoficha" /*RemoteObject*/ )));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 185;BA.debugLine="ModoFicha=\"EDICION\"";
Debug.ShouldStop(16777216);
__ref.setField ("_modoficha" /*RemoteObject*/ ,BA.ObjectToString("EDICION"));
 BA.debugLineNum = 186;BA.debugLine="lblModoFichaEstadoComentario.Text=\"Modo: \" & Mod";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblmodofichaestadocomentario" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Modo: "),__ref.getField(true,"_modoficha" /*RemoteObject*/ )));
 BA.debugLineNum = 188;BA.debugLine="Dim mData As Map=lstReg.Get(0)";
Debug.ShouldStop(134217728);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 189;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(268435456);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 190;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(536870912);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 191;BA.debugLine="txtFechaActual.Text=DateTime.Date(mData.Get(\"Fec";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtfechaactual" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaLong"))))))));
 BA.debugLineNum = 192;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(-2147483648);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 193;BA.debugLine="txtEstadoActual.Text=mData.Get(\"Estado\")";
Debug.ShouldStop(1);
__ref.getField(false,"_txtestadoactual" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Estado"))))));
 BA.debugLineNum = 194;BA.debugLine="txtUsuarioActual.Text=mData.Get(\"Usuario\")";
Debug.ShouldStop(2);
__ref.getField(false,"_txtusuarioactual" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Usuario"))))));
 BA.debugLineNum = 195;BA.debugLine="txtAreaComentario.Text=mData.Get(\"Comentario\")";
Debug.ShouldStop(4);
__ref.getField(false,"_txtareacomentario" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Comentario"))))));
 BA.debugLineNum = 196;BA.debugLine="txtAreaComentario.SetSelection(txtAreaComentario";
Debug.ShouldStop(8);
__ref.getField(false,"_txtareacomentario" /*RemoteObject*/ ).runVoidMethod ("SetSelection",(Object)(__ref.getField(false,"_txtareacomentario" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length")),(Object)(__ref.getField(false,"_txtareacomentario" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length")));
 BA.debugLineNum = 197;BA.debugLine="chboNuevoEstado.SelectedIndex=chboNuevoEstado.It";
Debug.ShouldStop(16);
__ref.getField(false,"_chbonuevoestado" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",__ref.getField(false,"_chbonuevoestado" /*RemoteObject*/ ).runMethod(false,"getItems").runMethod(true,"IndexOf",(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Estado")))))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 202;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(512);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 204;BA.debugLine="ControlesHabilitados(True)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_controleshabilitados" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 206;BA.debugLine="Return Null";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 207;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _parent,RemoteObject _almacen,RemoteObject _nombrealmacen,RemoteObject _articulo,RemoteObject _descripcionarticulo,RemoteObject _talla) throws Exception{
try {
		Debug.PushSubsStack("Initialize (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","initialize", __ref, _ba, _callback, _parent, _almacen, _nombrealmacen, _articulo, _descripcionarticulo, _talla);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Parent", _parent);
Debug.locals.put("Almacen", _almacen);
Debug.locals.put("NombreAlmacen", _nombrealmacen);
Debug.locals.put("Articulo", _articulo);
Debug.locals.put("DescripcionArticulo", _descripcionarticulo);
Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 59;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="mCallBack=CallBack";
Debug.ShouldStop(268435456);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 62;BA.debugLine="mParent=Parent";
Debug.ShouldStop(536870912);
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 64;BA.debugLine="For Each v As B4XView In mParent.GetAllViewsRecur";
Debug.ShouldStop(-2147483648);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group3 = __ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group3.runMethod(false,"Get",index3));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 65;BA.debugLine="If v.Tag <> Null And v.Tag = \"b4xdialog_backgrou";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("N",_v.runMethod(false,"getTag")) && RemoteObject.solveBoolean("=",_v.runMethod(false,"getTag"),RemoteObject.createImmutable(("b4xdialog_background")))) { 
 BA.debugLineNum = 66;BA.debugLine="v.RemoveViewFromParent";
Debug.ShouldStop(2);
_v.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 67;BA.debugLine="Exit";
Debug.ShouldStop(4);
if (true) break;
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 71;BA.debugLine="Background= xui.CreatePanel(\"background\")";
Debug.ShouldStop(64);
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("background"))));
 BA.debugLineNum = 72;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
Debug.ShouldStop(128);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("b4xdialog_background")));
 BA.debugLineNum = 73;BA.debugLine="Background.Color=0xaa000000";
Debug.ShouldStop(256);
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 74;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.ShouldStop(512);
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 76;BA.debugLine="mAlmacen=Almacen";
Debug.ShouldStop(2048);
__ref.setField ("_malmacen" /*RemoteObject*/ ,_almacen);
 BA.debugLineNum = 77;BA.debugLine="mNombreAlmacen=NombreAlmacen";
Debug.ShouldStop(4096);
__ref.setField ("_mnombrealmacen" /*RemoteObject*/ ,_nombrealmacen);
 BA.debugLineNum = 78;BA.debugLine="mArticulo=Articulo";
Debug.ShouldStop(8192);
__ref.setField ("_marticulo" /*RemoteObject*/ ,_articulo);
 BA.debugLineNum = 79;BA.debugLine="mDescripcionArticulo=DescripcionArticulo";
Debug.ShouldStop(16384);
__ref.setField ("_mdescripcionarticulo" /*RemoteObject*/ ,_descripcionarticulo);
 BA.debugLineNum = 80;BA.debugLine="mTalla=Talla";
Debug.ShouldStop(32768);
__ref.setField ("_mtalla" /*RemoteObject*/ ,_talla);
 BA.debugLineNum = 82;BA.debugLine="DatosAnalisisDisponibleFichaAlmacenArticuloTalla.";
Debug.ShouldStop(131072);
__ref.getField(false,"_datosanalisisdisponiblefichaalmacenarticulotalla" /*RemoteObject*/ ).setField ("DatosModificados" /*RemoteObject*/ ,canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.__c.getField(true,"False"));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nuevoeditarestadocomentarioanalisisdispalmarttalla(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,334);
if (RapidSub.canDelegate("nuevoeditarestadocomentarioanalisisdispalmarttalla")) { return __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","nuevoeditarestadocomentarioanalisisdispalmarttalla", __ref);}
ResumableSub_NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla rsub = new ResumableSub_NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla(null,__ref);
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
public static class ResumableSub_NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla extends BA.ResumableSub {
public ResumableSub_NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _nuevafecha = RemoteObject.createImmutable(0L);
RemoteObject _estadosel = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,334);
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
 BA.debugLineNum = 335;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(16384);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 336;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(32768);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 337;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(65536);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 338;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(131072);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 339;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 340;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 341;BA.debugLine="mRes.Put(\"lstRegistros\",lstReg)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 342;BA.debugLine="Dim Comando As String";
Debug.ShouldStop(2097152);
_comando = RemoteObject.createImmutable("");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 343;BA.debugLine="Comando=\"NuevoEditarEstadoComentarioAnalisisDispA";
Debug.ShouldStop(4194304);
_comando = BA.ObjectToString("NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 344;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(8388608);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 345;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(16777216);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 346;BA.debugLine="Dim NuevaFecha As Long=DateTime.DateParse(txtNuev";
Debug.ShouldStop(33554432);
_nuevafecha = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_txtnuevafecha" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("NuevaFecha", _nuevafecha);Debug.locals.put("NuevaFecha", _nuevafecha);
 BA.debugLineNum = 347;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(67108864);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 348;BA.debugLine="Dim EstadoSel As String";
Debug.ShouldStop(134217728);
_estadosel = RemoteObject.createImmutable("");Debug.locals.put("EstadoSel", _estadosel);
 BA.debugLineNum = 349;BA.debugLine="If chboNuevoEstado.SelectedIndex=-1 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_chbonuevoestado" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 350;BA.debugLine="EstadoSel=\"\"";
Debug.ShouldStop(536870912);
_estadosel = BA.ObjectToString("");Debug.locals.put("EstadoSel", _estadosel);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 352;BA.debugLine="EstadoSel=chboNuevoEstado.Items.Get(chboNuevoEst";
Debug.ShouldStop(-2147483648);
_estadosel = BA.ObjectToString(__ref.getField(false,"_chbonuevoestado" /*RemoteObject*/ ).runMethod(false,"getItems").runMethod(false,"Get",(Object)(__ref.getField(false,"_chbonuevoestado" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));Debug.locals.put("EstadoSel", _estadosel);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 354;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(2);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(_nuevafecha),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(__ref.getField(true,"_malmacen" /*RemoteObject*/ )),(__ref.getField(true,"_marticulo" /*RemoteObject*/ )),(__ref.getField(true,"_mtalla" /*RemoteObject*/ )),(__ref.getField(false,"_txtareacomentario" /*RemoteObject*/ ).runMethod(true,"getText")),(_estadosel)})),(Object)(__ref));
 BA.debugLineNum = 357;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "nuevoeditarestadocomentarioanalisisdispalmarttalla"), null);
this.state = 25;
return;
case 25:
//C
this.state = 7;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 359;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(64);
if (true) break;

case 7:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 24;
 BA.debugLineNum = 360;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(128);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 362;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 363;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "nuevoeditarestadocomentarioanalisisdispalmarttalla"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 24;
;
 BA.debugLineNum = 364;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 365;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 367;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(16384);
if (true) break;

case 12:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 23;
 BA.debugLineNum = 369;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 370;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 372;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
Debug.ShouldStop(524288);
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 373;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(1048576);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 374;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(2097152);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 375;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
Debug.ShouldStop(4194304);
if (true) break;

case 17:
//if
this.state = 22;
if (_sresp.runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERR"))).<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 376;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Nu";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SP NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 377;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "nuevoeditarestadocomentarioanalisisdispalmarttalla"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 22;
;
 BA.debugLineNum = 378;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 379;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 381;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 382;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 22:
//C
this.state = 23;
;
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
 BA.debugLineNum = 386;BA.debugLine="Return mRes";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
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
public static RemoteObject  _pnlbase_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("pnlBase_Touch (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("pnlbase_touch")) { return __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","pnlbase_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 323;BA.debugLine="Private Sub pnlBase_Touch(Action As Int, X As Floa";
Debug.ShouldStop(4);
 BA.debugLineNum = 324;BA.debugLine="If Action = pnlBase.TOUCH_ACTION_DOWN Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_pnlbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 325;BA.debugLine="DownX  = X";
Debug.ShouldStop(16);
__ref.setField ("_downx" /*RemoteObject*/ ,BA.numberCast(double.class, _x));
 BA.debugLineNum = 326;BA.debugLine="DownY  = y";
Debug.ShouldStop(32);
__ref.setField ("_downy" /*RemoteObject*/ ,BA.numberCast(double.class, _y));
 }else 
{ BA.debugLineNum = 327;BA.debugLine="Else if Action = pnlBase.TOUCH_ACTION_MOVE Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_pnlbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE")))) { 
 BA.debugLineNum = 328;BA.debugLine="pnlBase.Top = Min(Max(pnlBase.Top + y - DownY,0)";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlbase" /*RemoteObject*/ ).runMethod(true,"setTop",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.__c.runMethod(true,"Min",(Object)(canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlbase" /*RemoteObject*/ ).runMethod(true,"getTop"),_y,__ref.getField(true,"_downy" /*RemoteObject*/ )}, "+-",2, 0)),(Object)(BA.numberCast(double.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_pnlbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 0))));
 BA.debugLineNum = 329;BA.debugLine="pnlBase.Left = Min(Max(pnlBase.Left + x - DownX,";
Debug.ShouldStop(256);
__ref.getField(false,"_pnlbase" /*RemoteObject*/ ).runMethod(true,"setLeft",canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.__c.runMethod(true,"Min",(Object)(canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlbase" /*RemoteObject*/ ).runMethod(true,"getLeft"),_x,__ref.getField(true,"_downx" /*RemoteObject*/ )}, "+-",2, 0)),(Object)(BA.numberCast(double.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_pnlbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0))));
 }}
;
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salirform(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirForm (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("salirform")) { return __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","salirform", __ref);}
 BA.debugLineNum = 140;BA.debugLine="Sub SalirForm";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="Background.RemoveViewFromParent";
Debug.ShouldStop(4096);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 143;BA.debugLine="CallSubDelayed2(mCallBack,\"cAnalisisDisponibleFic";
Debug.ShouldStop(16384);
canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("cAnalisisDisponibleFichaEstadoComentarioAlmacenArticuloTalla_Done")),(Object)((__ref.getField(false,"_datosanalisisdisponiblefichaalmacenarticulotalla" /*RemoteObject*/ ))));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Show (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla parent;
RemoteObject _robj = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (canalisisdisponiblefichaestadocomentarioalmacenarticulotalla) ","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla",14,__ref.getField(false, "ba"),__ref,86);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 97;BA.debugLine="pnlBase=xui.CreatePanel(\"pnlBase\")";
Debug.ShouldStop(1);
__ref.setField ("_pnlbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlBase"))));
 BA.debugLineNum = 98;BA.debugLine="pnlBase.SetLayoutAnimated(0,0,0,800dip,500dip)";
Debug.ShouldStop(2);
__ref.getField(false,"_pnlbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 800))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500))))));
 BA.debugLineNum = 99;BA.debugLine="pnlBase.Color=xui.Color_White";
Debug.ShouldStop(4);
__ref.getField(false,"_pnlbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 100;BA.debugLine="pnlBase.LoadLayout(\"scrAnalisisDisponibleEstadoCo";
Debug.ShouldStop(8);
__ref.getField(false,"_pnlbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrAnalisisDisponibleEstadoComentarioAlmacenArticuloTalla")),__ref.getField(false, "ba"));
 BA.debugLineNum = 102;BA.debugLine="Background.AddView(pnlBase,(Background.Width-800d";
Debug.ShouldStop(32);
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlbase" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 800)))}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 800))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500))))));
 BA.debugLineNum = 104;BA.debugLine="ControlesHabilitados(False)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_controleshabilitados" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 110;BA.debugLine="lblTitlePanel.Text=\"Ficha Estado/Comentario Almac";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbltitlepanel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Ficha Estado/Comentario Almacén-Artículo-Talla"));
 BA.debugLineNum = 112;BA.debugLine="Dialog.Initialize(pnlBase)";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_pnlbase" /*RemoteObject*/ )));
 BA.debugLineNum = 113;BA.debugLine="jamLoadingIndicator1.Initialize(Me,pnlBase)";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(__ref.getField(false,"_pnlbase" /*RemoteObject*/ )));
 BA.debugLineNum = 115;BA.debugLine="btnEliminarFichaEstadoComentarioAlmacenArticuloTa";
Debug.ShouldStop(262144);
__ref.getField(false,"_btneliminarfichaestadocomentarioalmacenarticulotalla" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 119;BA.debugLine="Wait For(Inicio) complete (rObj As Object)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblefichaestadocomentarioalmacenarticulotalla", "show"), __ref.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_inicio" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 120;BA.debugLine="End Sub";
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