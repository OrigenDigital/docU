package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cinfoenviosperiodocorreosexpress2_subs_0 {


public static void  _btnactualizarinfotracking_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnActualizarInfoTracking_Click (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("btnactualizarinfotracking_click")) { __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","btnactualizarinfotracking_click", __ref); return;}
ResumableSub_btnActualizarInfoTracking_Click rsub = new ResumableSub_btnActualizarInfoTracking_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnActualizarInfoTracking_Click extends BA.ResumableSub {
public ResumableSub_btnActualizarInfoTracking_Click(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _datetimeant = RemoteObject.createImmutable("");
RemoteObject _lfitf = RemoteObject.createImmutable(0L);
RemoteObject _lfftf = RemoteObject.createImmutable(0L);
RemoteObject _sfinicial = RemoteObject.createImmutable("");
RemoteObject _sffinal = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("b4j.example.dateutils._period");
RemoteObject _sresult = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _ldia = RemoteObject.createImmutable(0L);
RemoteObject _success = RemoteObject.createImmutable(false);
int step29;
int limit29;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnActualizarInfoTracking_Click (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,292);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 293;BA.debugLine="lstInfoEnviosFechas.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_lstinfoenviosfechas" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 308;BA.debugLine="If txtfechaInicial.Text=\"\" Or txtFechaFinal.Text=";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 309;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha esta";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha establecido el periodo de consulta.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 310;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "btnactualizarinfotracking_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 4;
;
 BA.debugLineNum = 311;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 314;BA.debugLine="Dim DateTimeAnt As String=DateTime.DateFormat";
Debug.ShouldStop(33554432);
_datetimeant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateTimeAnt", _datetimeant);Debug.locals.put("DateTimeAnt", _datetimeant);
 BA.debugLineNum = 315;BA.debugLine="DateTime.dateformat=\"dd/MM/yy\"";
Debug.ShouldStop(67108864);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yy"));
 BA.debugLineNum = 316;BA.debugLine="Dim lFItF As Long=DateTime.DateParse(txtfechaInic";
Debug.ShouldStop(134217728);
_lfitf = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("lFItF", _lfitf);Debug.locals.put("lFItF", _lfitf);
 BA.debugLineNum = 317;BA.debugLine="Dim lFFtF As Long=DateTime.DateParse(txtFechaFina";
Debug.ShouldStop(268435456);
_lfftf = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("lFFtF", _lfftf);Debug.locals.put("lFFtF", _lfftf);
 BA.debugLineNum = 319;BA.debugLine="DateTime.dateformat=\"yyyy-MM-dd\"";
Debug.ShouldStop(1073741824);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 320;BA.debugLine="Dim sFInicial As String=DateTime.Date(lFItF)";
Debug.ShouldStop(-2147483648);
_sfinicial = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lfitf));Debug.locals.put("sFInicial", _sfinicial);Debug.locals.put("sFInicial", _sfinicial);
 BA.debugLineNum = 321;BA.debugLine="Dim sFFinal As String=DateTime.Date(lFFtF)";
Debug.ShouldStop(1);
_sffinal = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lfftf));Debug.locals.put("sFFinal", _sffinal);Debug.locals.put("sFFinal", _sffinal);
 BA.debugLineNum = 322;BA.debugLine="Log( sFInicial & \",\" & sFFinal)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","886769694",RemoteObject.concat(_sfinicial,RemoteObject.createImmutable(","),_sffinal),0);
 BA.debugLineNum = 323;BA.debugLine="DateTime.dateformat=DateTimeAnt";
Debug.ShouldStop(4);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_datetimeant);
 BA.debugLineNum = 327;BA.debugLine="Dim p As Period=DateUtils.PeriodBetweenInDays (lF";
Debug.ShouldStop(64);
_p = parent._dateutils.runMethod(false,"_periodbetweenindays",(Object)(_lfitf),(Object)(_lfftf));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 328;BA.debugLine="If p.Days>45 Then";
Debug.ShouldStop(128);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean(">",_p.getField(true,"Days"),BA.numberCast(double.class, 45))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 329;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El periodo má";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("El periodo máximo de análisis son 45 días.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 330;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "btnactualizarinfotracking_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 8;
;
 BA.debugLineNum = 331;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 334;BA.debugLine="Wait For (CargaCredenciales) complete (sResult As";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "btnactualizarinfotracking_click"), __ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_cargacredenciales" /*RemoteObject*/ ));
this.state = 29;
return;
case 29:
//C
this.state = 9;
_sresult = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResult", _sresult);
;
 BA.debugLineNum = 335;BA.debugLine="If sResult<>\"OK\" Then Return";
Debug.ShouldStop(16384);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",_sresult,BA.ObjectToString("OK"))) { 
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
 BA.debugLineNum = 338;BA.debugLine="Dim DateTimeAnt As String=DateTime.DateFormat";
Debug.ShouldStop(131072);
_datetimeant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateTimeAnt", _datetimeant);Debug.locals.put("DateTimeAnt", _datetimeant);
 BA.debugLineNum = 339;BA.debugLine="DateTime.dateformat=\"dd/MM/yy\"";
Debug.ShouldStop(262144);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yy"));
 BA.debugLineNum = 341;BA.debugLine="jamLoadingIndicator1.DuracionCiclo=1000";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setduracionciclo",BA.numberCast(int.class, 1000));
 BA.debugLineNum = 343;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 347;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 351;BA.debugLine="For i=0 To p.Days";
Debug.ShouldStop(1073741824);
if (true) break;

case 15:
//for
this.state = 26;
step29 = 1;
limit29 = _p.getField(true,"Days").<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 30;
if (true) break;

case 30:
//C
this.state = 26;
if ((step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29)) this.state = 17;
if (true) break;

case 31:
//C
this.state = 30;
_i = ((int)(0 + _i + step29)) ;
Debug.locals.put("i", _i);
if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 352;BA.debugLine="Dim LDia As Long=lFItF+(i*DateTime.TicksPerDay)";
Debug.ShouldStop(-2147483648);
_ldia = RemoteObject.solve(new RemoteObject[] {_lfitf,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "*",0, 2))}, "+",1, 2);Debug.locals.put("LDia", _ldia);Debug.locals.put("LDia", _ldia);
 BA.debugLineNum = 353;BA.debugLine="wait for (InfoEnviosFecha(\"519390001\", LDia)) co";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "btnactualizarinfotracking_click"), __ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_infoenviosfecha" /*RemoteObject*/ ,(Object)(BA.ObjectToString("519390001")),(Object)(_ldia)));
this.state = 32;
return;
case 32:
//C
this.state = 18;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 354;BA.debugLine="If Not(success) Then";
Debug.ShouldStop(2);
if (true) break;

case 18:
//if
this.state = 21;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 355;BA.debugLine="Exit";
Debug.ShouldStop(4);
this.state = 26;
if (true) break;
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 357;BA.debugLine="wait for (InfoEnviosFecha(\"519390002\", LDia)) co";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "btnactualizarinfotracking_click"), __ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_infoenviosfecha" /*RemoteObject*/ ,(Object)(BA.ObjectToString("519390002")),(Object)(_ldia)));
this.state = 33;
return;
case 33:
//C
this.state = 22;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 358;BA.debugLine="If Not(success) Then";
Debug.ShouldStop(32);
if (true) break;

case 22:
//if
this.state = 25;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 359;BA.debugLine="Exit";
Debug.ShouldStop(64);
this.state = 26;
if (true) break;
 if (true) break;

case 25:
//C
this.state = 31;
;
 BA.debugLineNum = 361;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando in";
Debug.ShouldStop(256);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",(RemoteObject.concat(RemoteObject.createImmutable("Cargando info expediciones fecha "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ldia)),RemoteObject.createImmutable("..."))));
 if (true) break;
if (true) break;

case 26:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 365;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 368;BA.debugLine="DateTime.dateformat=DateTimeAnt";
Debug.ShouldStop(32768);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_datetimeant);
 BA.debugLineNum = 370;BA.debugLine="TotalDatosPeriodo(lstInfoEnviosFechas)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_totaldatosperiodo" /*void*/ ,(Object)(__ref.getField(false,"_lstinfoenviosfechas" /*RemoteObject*/ )));
 BA.debugLineNum = 372;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static void  _complete(RemoteObject __ref,RemoteObject _sresult) throws Exception{
}
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","btnsalir_click", __ref);}
 BA.debugLineNum = 164;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="SalirModulo";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnselfechafinal_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaFinal_Click (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("btnselfechafinal_click")) { __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","btnselfechafinal_click", __ref); return;}
ResumableSub_btnSelFechaFinal_Click rsub = new ResumableSub_btnSelFechaFinal_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelFechaFinal_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaFinal_Click(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _datetimeant = RemoteObject.createImmutable("");
RemoteObject _b4xdate = RemoteObject.declareNull("b4j.docU.b4xdatetemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _fechafinprev = RemoteObject.createImmutable(0L);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaFinal_Click (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,260);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 261;BA.debugLine="Dim DateTimeAnt As String=DateTime.DateFormat";
Debug.ShouldStop(16);
_datetimeant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateTimeAnt", _datetimeant);Debug.locals.put("DateTimeAnt", _datetimeant);
 BA.debugLineNum = 262;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
Debug.ShouldStop(32);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yy"));
 BA.debugLineNum = 263;BA.debugLine="Dim B4XDate As B4XDateTemplate";
Debug.ShouldStop(64);
_b4xdate = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");Debug.locals.put("B4XDate", _b4xdate);
 BA.debugLineNum = 264;BA.debugLine="B4XDate.Initialize";
Debug.ShouldStop(128);
_b4xdate.runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 265;BA.debugLine="B4XDate.FirstDay=1";
Debug.ShouldStop(256);
_b4xdate.setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 266;BA.debugLine="If txtFechaFinal.Text<>\"\" Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 267;BA.debugLine="B4XDate.Date=DateTime.DateParse(txtFechaFinal.te";
Debug.ShouldStop(1024);
_b4xdate.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 269;BA.debugLine="B4XDate.Date=DateTime.now";
Debug.ShouldStop(4096);
_b4xdate.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 271;BA.debugLine="Dialog.Title=\"Selecciona Fecha Final\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Fecha Final")));
 BA.debugLineNum = 272;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
Debug.ShouldStop(32768);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xdate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 273;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(65536);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOk", _bok);Debug.locals.put("bOk", _bok);
 BA.debugLineNum = 274;BA.debugLine="bOk.Left=bOk.Left-20dip";
Debug.ShouldStop(131072);
_bok.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bok.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 275;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(262144);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 276;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(524288);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 277;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(1048576);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 278;BA.debugLine="Wait For(rSub) complete (rInt As Int)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "btnselfechafinal_click"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 279;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 280;BA.debugLine="Dim FechaFinPrev As Long=B4XDate.Date";
Debug.ShouldStop(8388608);
_fechafinprev = _b4xdate.runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ );Debug.locals.put("FechaFinPrev", _fechafinprev);Debug.locals.put("FechaFinPrev", _fechafinprev);
 BA.debugLineNum = 281;BA.debugLine="If txtfechaInicial.Text<>\"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 13:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 282;BA.debugLine="If DateTime.DateParse(txtfechaInicial.Text)>Fech";
Debug.ShouldStop(33554432);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean(">",parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"getText"))),_fechafinprev)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 283;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha fin";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La fecha final no puede ser anterior a la inicial.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 284;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "btnselfechafinal_click"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 19;
;
 BA.debugLineNum = 285;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 288;BA.debugLine="txtFechaFinal.Text=DateTime.Date(FechaFinPrev)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechafinprev)));
 BA.debugLineNum = 289;BA.debugLine="DateTime.DateFormat=DateTimeAnt";
Debug.ShouldStop(1);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_datetimeant);
 BA.debugLineNum = 290;BA.debugLine="End Sub";
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
public static void  _btnselfechainicial_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaInicial_Click (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("btnselfechainicial_click")) { __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","btnselfechainicial_click", __ref); return;}
ResumableSub_btnSelFechaInicial_Click rsub = new ResumableSub_btnSelFechaInicial_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSelFechaInicial_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaInicial_Click(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _datetimeant = RemoteObject.createImmutable("");
RemoteObject _b4xdate = RemoteObject.declareNull("b4j.docU.b4xdatetemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _fechainprev = RemoteObject.createImmutable(0L);
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSelFechaInicial_Click (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,225);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 226;BA.debugLine="Dim DateTimeAnt As String=DateTime.DateFormat";
Debug.ShouldStop(2);
_datetimeant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateTimeAnt", _datetimeant);Debug.locals.put("DateTimeAnt", _datetimeant);
 BA.debugLineNum = 227;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
Debug.ShouldStop(4);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yy"));
 BA.debugLineNum = 228;BA.debugLine="Dim B4XDate As B4XDateTemplate";
Debug.ShouldStop(8);
_b4xdate = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");Debug.locals.put("B4XDate", _b4xdate);
 BA.debugLineNum = 229;BA.debugLine="B4XDate.Initialize";
Debug.ShouldStop(16);
_b4xdate.runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 230;BA.debugLine="B4XDate.FirstDay=1";
Debug.ShouldStop(32);
_b4xdate.setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 232;BA.debugLine="If txtfechaInicial.Text<>\"\" Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 233;BA.debugLine="B4XDate.Date=DateTime.DateParse(txtfechaInicial.";
Debug.ShouldStop(256);
_b4xdate.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"getText"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 235;BA.debugLine="B4XDate.Date=DateTime.now";
Debug.ShouldStop(1024);
_b4xdate.runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 239;BA.debugLine="Dialog.Title=\"Selecciona Fecha Inicial\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Fecha Inicial")));
 BA.debugLineNum = 240;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
Debug.ShouldStop(32768);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xdate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 241;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(65536);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOk", _bok);Debug.locals.put("bOk", _bok);
 BA.debugLineNum = 242;BA.debugLine="bOk.Left=bOk.Left-20dip";
Debug.ShouldStop(131072);
_bok.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bok.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 243;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(262144);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 244;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(524288);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 245;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(1048576);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 246;BA.debugLine="Wait For(rSub) complete (rInt As Int)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "btnselfechainicial_click"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 247;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
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
 BA.debugLineNum = 248;BA.debugLine="Dim FechaInPrev As Long=B4XDate.Date";
Debug.ShouldStop(8388608);
_fechainprev = _b4xdate.runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ );Debug.locals.put("FechaInPrev", _fechainprev);Debug.locals.put("FechaInPrev", _fechainprev);
 BA.debugLineNum = 249;BA.debugLine="If txtFechaFinal.Text<>\"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 13:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 250;BA.debugLine="If DateTime.DateParse(txtFechaFinal.Text)<FechaI";
Debug.ShouldStop(33554432);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("<",parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"getText"))),_fechainprev)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 251;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha ini";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La fecha inicial no puede ser posterior a la final.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 252;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "btnselfechainicial_click"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 19;
;
 BA.debugLineNum = 253;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 256;BA.debugLine="txtfechaInicial.Text=DateTime.Date(FechaInPrev)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechainprev)));
 BA.debugLineNum = 257;BA.debugLine="DateTime.DateFormat=DateTimeAnt";
Debug.ShouldStop(1);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_datetimeant);
 BA.debugLineNum = 258;BA.debugLine="End Sub";
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
public static RemoteObject  _cargacredenciales(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaCredenciales (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("cargacredenciales")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","cargacredenciales", __ref);}
ResumableSub_CargaCredenciales rsub = new ResumableSub_CargaCredenciales(null,__ref);
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
public static class ResumableSub_CargaCredenciales extends BA.ResumableSub {
public ResumableSub_CargaCredenciales(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstresws = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdatosws = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCredenciales (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,179);
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
 BA.debugLineNum = 181;BA.debugLine="CargaDatosWebServiceTransporte(17)   '17 es el ID";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_cargadatoswebservicetransporte" /*void*/ ,(Object)(BA.numberCast(int.class, 17)));
 BA.debugLineNum = 182;BA.debugLine="Wait For CargaDatosWebServiceTransporte_Completed";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","cargadatoswebservicetransporte_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "cargacredenciales"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
_lstresws = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("lstResWS", _lstresws);
;
 BA.debugLineNum = 183;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 184;BA.debugLine="Return \"Error carga credenciales\"";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Error carga credenciales")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 186;BA.debugLine="Dim mDatosWS As Map=lstResWS.Get(0)";
Debug.ShouldStop(33554432);
_mdatosws = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdatosws = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstresws.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mDatosWS", _mdatosws);Debug.locals.put("mDatosWS", _mdatosws);
 BA.debugLineNum = 188;BA.debugLine="UsuarioWS=mDatosWS.get(\"UsuarioWS\")";
Debug.ShouldStop(134217728);
__ref.setField ("_usuariows" /*RemoteObject*/ ,BA.ObjectToString(_mdatosws.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UsuarioWS"))))));
 BA.debugLineNum = 189;BA.debugLine="PasswordWs=mDatosWS.get(\"PasswordWS\")";
Debug.ShouldStop(268435456);
__ref.setField ("_passwordws" /*RemoteObject*/ ,BA.ObjectToString(_mdatosws.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PasswordWS"))))));
 BA.debugLineNum = 190;BA.debugLine="Dim URLWS As String=mDatosWS.Get(\"URLWebServiceSe";
Debug.ShouldStop(536870912);
parent._urlws = BA.ObjectToString(_mdatosws.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("URLWebServiceSeguimiento")))));__ref.setField("_urlws",parent._urlws);
 BA.debugLineNum = 194;BA.debugLine="If UsuarioWS=\"\" Or PasswordWs=\"\" Or URLWS=\"\" Then";
Debug.ShouldStop(2);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_usuariows" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_passwordws" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_urlws" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 195;BA.debugLine="Return \"Error carga credenciales\"";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Error carga credenciales")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 197;BA.debugLine="Return \"OK\"";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("OK")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 199;BA.debugLine="End Sub";
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
public static void  _cargadatoswebservicetransporte_completed(RemoteObject __ref,RemoteObject _accion,RemoteObject _lstresws) throws Exception{
}
public static void  _cargadatoswebservicetransporte(RemoteObject __ref,RemoteObject _idtransportista) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("cargadatoswebservicetransporte")) { __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","cargadatoswebservicetransporte", __ref, _idtransportista); return;}
ResumableSub_CargaDatosWebServiceTransporte rsub = new ResumableSub_CargaDatosWebServiceTransporte(null,__ref,_idtransportista);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaDatosWebServiceTransporte extends BA.ResumableSub {
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref,RemoteObject _idtransportista) {
this.parent = parent;
this.__ref = __ref;
this._idtransportista = _idtransportista;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _idtransportista;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _comandojrdc = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,201);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IDTransportista", _idtransportista);
 BA.debugLineNum = 203;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1024);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 204;BA.debugLine="Dim lstRes As List";
Debug.ShouldStop(2048);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 205;BA.debugLine="Dim ComandoJRDC As String";
Debug.ShouldStop(4096);
_comandojrdc = RemoteObject.createImmutable("");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 206;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
Debug.ShouldStop(8192);
_comandojrdc = BA.ObjectToString("DatosWebServiceTransporte");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 207;BA.debugLine="JRDCQuery.DatosJRDC(\"http://192.168.10.20:17179/r";
Debug.ShouldStop(16384);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(BA.ObjectToString("http://192.168.10.20:17179/rdc")),(Object)(_comandojrdc),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idtransportista)}))),(Object)(__ref));
 BA.debugLineNum = 208;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 209;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 210;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 212;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 213;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 215;BA.debugLine="lstRes=mresult.Get(\"lstRes\")";
Debug.ShouldStop(4194304);
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 216;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 219;BA.debugLine="CallSubDelayed3(Me,\"CargaDatosWebServiceTransport";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("CargaDatosWebServiceTransporte_Completed")),(Object)((_accion)),(Object)((_lstres)));
 BA.debugLineNum = 220;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
cinfoenviosperiodocorreosexpress2._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cinfoenviosperiodocorreosexpress2._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
cinfoenviosperiodocorreosexpress2._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cinfoenviosperiodocorreosexpress2._frm);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
cinfoenviosperiodocorreosexpress2._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cinfoenviosperiodocorreosexpress2._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private UsuarioWS As String";
cinfoenviosperiodocorreosexpress2._usuariows = RemoteObject.createImmutable("");__ref.setField("_usuariows",cinfoenviosperiodocorreosexpress2._usuariows);
 //BA.debugLineNum = 7;BA.debugLine="Private PasswordWs As String";
cinfoenviosperiodocorreosexpress2._passwordws = RemoteObject.createImmutable("");__ref.setField("_passwordws",cinfoenviosperiodocorreosexpress2._passwordws);
 //BA.debugLineNum = 8;BA.debugLine="Private URLWS As String";
cinfoenviosperiodocorreosexpress2._urlws = RemoteObject.createImmutable("");__ref.setField("_urlws",cinfoenviosperiodocorreosexpress2._urlws);
 //BA.debugLineNum = 10;BA.debugLine="Private txtfechaInicial As TextField";
cinfoenviosperiodocorreosexpress2._txtfechainicial = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechainicial",cinfoenviosperiodocorreosexpress2._txtfechainicial);
 //BA.debugLineNum = 11;BA.debugLine="Private btnSelFechaInicial As Button";
cinfoenviosperiodocorreosexpress2._btnselfechainicial = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselfechainicial",cinfoenviosperiodocorreosexpress2._btnselfechainicial);
 //BA.debugLineNum = 12;BA.debugLine="Private txtFechaFinal As TextField";
cinfoenviosperiodocorreosexpress2._txtfechafinal = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechafinal",cinfoenviosperiodocorreosexpress2._txtfechafinal);
 //BA.debugLineNum = 13;BA.debugLine="Private btnSelFechaFinal As Button";
cinfoenviosperiodocorreosexpress2._btnselfechafinal = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnselfechafinal",cinfoenviosperiodocorreosexpress2._btnselfechafinal);
 //BA.debugLineNum = 15;BA.debugLine="Private Dialog As B4XDialog";
cinfoenviosperiodocorreosexpress2._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cinfoenviosperiodocorreosexpress2._dialog);
 //BA.debugLineNum = 19;BA.debugLine="Private jamTableViewInfoTrackingEnviosPeriodo As";
cinfoenviosperiodocorreosexpress2._jamtableviewinfotrackingenviosperiodo = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewinfotrackingenviosperiodo",cinfoenviosperiodocorreosexpress2._jamtableviewinfotrackingenviosperiodo);
 //BA.debugLineNum = 21;BA.debugLine="Private lstInfoEnviosFechas As List";
cinfoenviosperiodocorreosexpress2._lstinfoenviosfechas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstinfoenviosfechas",cinfoenviosperiodocorreosexpress2._lstinfoenviosfechas);
 //BA.debugLineNum = 23;BA.debugLine="Private mSQL As SQL";
cinfoenviosperiodocorreosexpress2._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cinfoenviosperiodocorreosexpress2._msql);
 //BA.debugLineNum = 25;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
cinfoenviosperiodocorreosexpress2._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cinfoenviosperiodocorreosexpress2._jamloadingindicator1);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clienteresponsablecuentadocumento(RemoteObject __ref,RemoteObject _doc) throws Exception{
try {
		Debug.PushSubsStack("ClienteResponsableCuentaDocumento (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,985);
if (RapidSub.canDelegate("clienteresponsablecuentadocumento")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","clienteresponsablecuentadocumento", __ref, _doc);}
ResumableSub_ClienteResponsableCuentaDocumento rsub = new ResumableSub_ClienteResponsableCuentaDocumento(null,__ref,_doc);
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
public static class ResumableSub_ClienteResponsableCuentaDocumento extends BA.ResumableSub {
public ResumableSub_ClienteResponsableCuentaDocumento(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref,RemoteObject _doc) {
this.parent = parent;
this.__ref = __ref;
this._doc = _doc;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _doc;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ClienteResponsableCuentaDocumento (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,985);
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
Debug.locals.put("Doc", _doc);
 BA.debugLineNum = 986;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(33554432);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 989;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(268435456);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 990;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 993;BA.debugLine="Dim comando As String";
Debug.ShouldStop(1);
_comando = RemoteObject.createImmutable("");Debug.locals.put("comando", _comando);
 BA.debugLineNum = 994;BA.debugLine="Select True";
Debug.ShouldStop(2);
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_doc.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_doc.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
default: {
this.state = 7;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 8;
 BA.debugLineNum = 996;BA.debugLine="comando=\"ClienteResponsableCuentaALBV\"";
Debug.ShouldStop(8);
_comando = BA.ObjectToString("ClienteResponsableCuentaALBV");Debug.locals.put("comando", _comando);
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 998;BA.debugLine="comando=\"ClienteResponsableCuentaRT\"";
Debug.ShouldStop(32);
_comando = BA.ObjectToString("ClienteResponsableCuentaRT");Debug.locals.put("comando", _comando);
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1000;BA.debugLine="Accion=\"ErrTipoDoc\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("ErrTipoDoc");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1001;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1002;BA.debugLine="Return mRes";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 1004;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,comando,Array";
Debug.ShouldStop(2048);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_doc)})),(Object)(__ref));
 BA.debugLineNum = 1006;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "clienteresponsablecuentadocumento"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1007;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(16384);
if (true) break;

case 9:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 20;
 BA.debugLineNum = 1009;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1010;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "clienteresponsablecuentadocumento"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
 BA.debugLineNum = 1011;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1012;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1015;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(4194304);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 1016;BA.debugLine="Accion=\"SinResultado\"";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString("SinResultado");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1017;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1019;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(67108864);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1020;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(134217728);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1021;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1022;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 1026;BA.debugLine="Return mRes";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1027;BA.debugLine="End Sub";
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
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 129;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(2);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cinfoenviosperiodocorreosexpress2.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblDocumentosExpediciones")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 131;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 132;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblDocumentosExped";
Debug.ShouldStop(8);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblDocumentosExpediciones")));
 };
 BA.debugLineNum = 134;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(32);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 135;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 136;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblDocumentosExpediciones (")));
 BA.debugLineNum = 138;BA.debugLine="sbCrearTabla.Append(\"NumExpedicion TEXT COLLATE N";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NumExpedicion TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 139;BA.debugLine="sbCrearTabla.Append(\"Referencia TEXT COLLATE NOCA";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Referencia TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 140;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 141;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Cliente TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 142;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreCliente TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 143;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreResponsableCuenta TEXT COLLATE NOCASE DEFAULT '')")));
 BA.debugLineNum = 144;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _creartablatemporaldocumentosreferenciastte(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CrearTablaTemporalDocumentosReferenciasTte (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,905);
if (RapidSub.canDelegate("creartablatemporaldocumentosreferenciastte")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","creartablatemporaldocumentosreferenciastte", __ref);}
ResumableSub_CrearTablaTemporalDocumentosReferenciasTte rsub = new ResumableSub_CrearTablaTemporalDocumentosReferenciasTte(null,__ref);
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
public static class ResumableSub_CrearTablaTemporalDocumentosReferenciasTte extends BA.ResumableSub {
public ResumableSub_CrearTablaTemporalDocumentosReferenciasTte(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CrearTablaTemporalDocumentosReferenciasTte (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,905);
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
 BA.debugLineNum = 906;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(512);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 909;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4096);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 910;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 913;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(65536);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("CrearTablaTemporalDocumentosReferenciasTte")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 915;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "creartablatemporaldocumentosreferenciastte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 916;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 917;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query CrearTablaTemporalDocumentosReferenciasTte")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 918;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 919;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 920;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 923;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(67108864);
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
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 926;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(536870912);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 927;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(1073741824);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 928;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(-2147483648);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 929;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 930;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Cr";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SP CrearTablaTemporalDocumentosReferenciasTte"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 931;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 932;BA.debugLine="Accion=\"ERROR SP\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("ERROR SP");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 933;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 935;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 936;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
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
 BA.debugLineNum = 940;BA.debugLine="Return mRes";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 941;BA.debugLine="End Sub";
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
public static RemoteObject  _documentosexpedicionescorreosperiodobatch(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionesCorreosPeriodoBatch (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,849);
if (RapidSub.canDelegate("documentosexpedicionescorreosperiodobatch")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","documentosexpedicionescorreosperiodobatch", __ref);}
ResumableSub_DocumentosExpedicionesCorreosPeriodoBatch rsub = new ResumableSub_DocumentosExpedicionesCorreosPeriodoBatch(null,__ref);
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
public static class ResumableSub_DocumentosExpedicionesCorreosPeriodoBatch extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesCorreosPeriodoBatch(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstcomandos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mie = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _refenvio = RemoteObject.createImmutable("");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionesCorreosPeriodoBatch (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,849);
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
 BA.debugLineNum = 851;BA.debugLine="Dim mResult As Map";
Debug.ShouldStop(262144);
_mresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mResult", _mresult);
 BA.debugLineNum = 852;BA.debugLine="mResult.Initialize";
Debug.ShouldStop(524288);
_mresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 853;BA.debugLine="mResult.Put(\"Success\", False)";
Debug.ShouldStop(1048576);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 858;BA.debugLine="Wait For(CrearTablaTemporalDocumentosReferenciasT";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionescorreosperiodobatch"), __ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_creartablatemporaldocumentosreferenciastte" /*RemoteObject*/ ));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 859;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 860;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 863;BA.debugLine="Dim lstComandos As List";
Debug.ShouldStop(1073741824);
_lstcomandos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstComandos", _lstcomandos);
 BA.debugLineNum = 864;BA.debugLine="lstComandos.Initialize";
Debug.ShouldStop(-2147483648);
_lstcomandos.runVoidMethod ("Initialize");
 BA.debugLineNum = 872;BA.debugLine="For Each mIE As Map In lstInfoEnviosFechas";
Debug.ShouldStop(128);
if (true) break;

case 7:
//for
this.state = 14;
_mie = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group9 = __ref.getField(false,"_lstinfoenviosfechas" /*RemoteObject*/ );
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mIE", _mie);
this.state = 26;
if (true) break;

case 26:
//C
this.state = 14;
if (index9 < groupLen9) {
this.state = 9;
_mie = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group9.runMethod(false,"Get",index9));Debug.locals.put("mIE", _mie);}
if (true) break;

case 27:
//C
this.state = 26;
index9++;
Debug.locals.put("mIE", _mie);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 875;BA.debugLine="Log(\"Referencia \" & mIE.Get(\"Referencia\"))";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","887359514",RemoteObject.concat(RemoteObject.createImmutable("Referencia "),_mie.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Referencia"))))),0);
 BA.debugLineNum = 878;BA.debugLine="Dim refEnvio As String=mIE.Get(\"Referencia\")";
Debug.ShouldStop(8192);
_refenvio = BA.ObjectToString(_mie.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Referencia")))));Debug.locals.put("refEnvio", _refenvio);Debug.locals.put("refEnvio", _refenvio);
 BA.debugLineNum = 879;BA.debugLine="If refEnvio.StartsWith(\"EXP\")=False And refEnvio";
Debug.ShouldStop(16384);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_refenvio.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("EXP"))),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("!",_refenvio,BA.ObjectToString(""))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 880;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(";
Debug.ShouldStop(32768);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InsertarDatosTablaTemporalDocumentosReferenciasTte")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_refenvio)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 881;BA.debugLine="lstComandos.Add(cmd)";
Debug.ShouldStop(65536);
_lstcomandos.runVoidMethod ("Add",(Object)((_cmd)));
 if (true) break;

case 13:
//C
this.state = 27;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("mIE", _mie);
;
 BA.debugLineNum = 887;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionescorreosperiodobatch"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_lstcomandos)));
this.state = 28;
return;
case 28:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 888;BA.debugLine="If Success=False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 889;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible actualizar los datos de documentos expedición en la tabla temporal tblreferenciasexpedicionestemp.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 890;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionescorreosperiodobatch"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 18;
;
 BA.debugLineNum = 891;BA.debugLine="Return mResult";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 894;BA.debugLine="Wait For(DocumentosExpedicionesPeriodo) complete";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionescorreosperiodobatch"), __ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_documentosexpedicionesperiodo" /*RemoteObject*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 19;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 895;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 896;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
Debug.ShouldStop(-2147483648);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 898;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(2);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 899;BA.debugLine="mResult.put(\"Success\", True)";
Debug.ShouldStop(4);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 900;BA.debugLine="mResult.put(\"lstReg\", lstReg)";
Debug.ShouldStop(8);
_mresult.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 902;BA.debugLine="Return mResult";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mresult));return;};
 BA.debugLineNum = 903;BA.debugLine="End Sub";
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
public static RemoteObject  _documentosexpedicionesperiodo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionesPeriodo (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,943);
if (RapidSub.canDelegate("documentosexpedicionesperiodo")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","documentosexpedicionesperiodo", __ref);}
ResumableSub_DocumentosExpedicionesPeriodo rsub = new ResumableSub_DocumentosExpedicionesPeriodo(null,__ref);
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
public static class ResumableSub_DocumentosExpedicionesPeriodo extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesPeriodo(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionesPeriodo (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,943);
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
 BA.debugLineNum = 944;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(32768);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 947;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(262144);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 948;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 951;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(4194304);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("DocumentosReferenciasExpedicionesTte")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 953;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionesperiodo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 954;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 955;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query DocumentosReferenciasExpedicionesTte")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 956;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionesperiodo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 957;BA.debugLine="Accion=\"ErrConn\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("ErrConn");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 958;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 961;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 962;BA.debugLine="Accion=\"SinDocumentos\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("SinDocumentos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 963;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 965;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(16);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 966;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 967;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(64);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 968;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 971;BA.debugLine="Return mRes";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
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
public static RemoteObject  _eliminarenviossinrecepcionerroneos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EliminarEnviosSinRecepcionErroneos (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,458);
if (RapidSub.canDelegate("eliminarenviossinrecepcionerroneos")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","eliminarenviossinrecepcionerroneos", __ref);}
RemoteObject _lstenviossinrecepcion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstenviossinrecepcioneliminar = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mestenv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ref = RemoteObject.createImmutable("");
int _i = 0;
 BA.debugLineNum = 458;BA.debugLine="Sub EliminarEnviosSinRecepcionErroneos";
Debug.ShouldStop(512);
 BA.debugLineNum = 459;BA.debugLine="Dim lstEnviosSinRecepcion As List";
Debug.ShouldStop(1024);
_lstenviossinrecepcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEnviosSinRecepcion", _lstenviossinrecepcion);
 BA.debugLineNum = 460;BA.debugLine="lstEnviosSinRecepcion.Initialize";
Debug.ShouldStop(2048);
_lstenviossinrecepcion.runVoidMethod ("Initialize");
 BA.debugLineNum = 461;BA.debugLine="Dim lstEnviosSinRecepcionEliminar As List";
Debug.ShouldStop(4096);
_lstenviossinrecepcioneliminar = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEnviosSinRecepcionEliminar", _lstenviossinrecepcioneliminar);
 BA.debugLineNum = 462;BA.debugLine="lstEnviosSinRecepcionEliminar.Initialize";
Debug.ShouldStop(8192);
_lstenviossinrecepcioneliminar.runVoidMethod ("Initialize");
 BA.debugLineNum = 463;BA.debugLine="For Each mEstEnv As Map In lstInfoEnviosFechas";
Debug.ShouldStop(16384);
_mestenv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group5 = __ref.getField(false,"_lstinfoenviosfechas" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_mestenv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group5.runMethod(false,"Get",index5));Debug.locals.put("mEstEnv", _mestenv);
Debug.locals.put("mEstEnv", _mestenv);
 BA.debugLineNum = 464;BA.debugLine="If 1=mEstEnv.Get(\"estadoEnvio\") Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(1),BA.numberCast(double.class, _mestenv.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("estadoEnvio"))))))) { 
 BA.debugLineNum = 465;BA.debugLine="lstEnviosSinRecepcion.add(mEstEnv.Get(\"referenc";
Debug.ShouldStop(65536);
_lstenviossinrecepcion.runVoidMethod ("Add",(Object)(_mestenv.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("referencia"))))));
 }else {
 BA.debugLineNum = 467;BA.debugLine="If lstEnviosSinRecepcion.IndexOf(mEstEnv.Get(\"r";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_lstenviossinrecepcion.runMethod(true,"IndexOf",(Object)(_mestenv.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("referencia")))))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 468;BA.debugLine="lstEnviosSinRecepcionEliminar.Add(mEstEnv.Get(";
Debug.ShouldStop(524288);
_lstenviossinrecepcioneliminar.runVoidMethod ("Add",(Object)(_mestenv.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("referencia"))))));
 };
 };
 }
}Debug.locals.put("mEstEnv", _mestenv);
;
 BA.debugLineNum = 472;BA.debugLine="For Each ref As String In lstEnviosSinRecepcionEl";
Debug.ShouldStop(8388608);
{
final RemoteObject group14 = _lstenviossinrecepcioneliminar;
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_ref = BA.ObjectToString(group14.runMethod(false,"Get",index14));Debug.locals.put("ref", _ref);
Debug.locals.put("ref", _ref);
 BA.debugLineNum = 473;BA.debugLine="For i=0 To lstInfoEnviosFechas.Size-1";
Debug.ShouldStop(16777216);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstinfoenviosfechas" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 474;BA.debugLine="Dim mEstEnv As Map=lstInfoEnviosFechas.Get(i)";
Debug.ShouldStop(33554432);
_mestenv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mestenv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_lstinfoenviosfechas" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mEstEnv", _mestenv);Debug.locals.put("mEstEnv", _mestenv);
 BA.debugLineNum = 475;BA.debugLine="If ref= mEstEnv.Get(\"referencia\") And 1=mEstEnv";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_ref,BA.ObjectToString(_mestenv.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("referencia")))))) && RemoteObject.solveBoolean("=",RemoteObject.createImmutable(1),BA.numberCast(double.class, _mestenv.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("estadoEnvio"))))))) { 
 BA.debugLineNum = 476;BA.debugLine="lstInfoEnviosFechas.RemoveAt(i)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lstinfoenviosfechas" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 477;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 }
}Debug.locals.put("ref", _ref);
;
 BA.debugLineNum = 481;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eliminartablatemporaldocumentosreferenciastte(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EliminarTablaTemporalDocumentosReferenciasTte (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,974);
if (RapidSub.canDelegate("eliminartablatemporaldocumentosreferenciastte")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","eliminartablatemporaldocumentosreferenciastte", __ref);}
ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte rsub = new ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte(null,__ref);
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
public static class ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte extends BA.ResumableSub {
public ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EliminarTablaTemporalDocumentosReferenciasTte (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,974);
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
 BA.debugLineNum = 975;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"E";
Debug.ShouldStop(16384);
_cmd = parent._jrdcquery.runMethod(false,"_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("EliminarTablaTemporalDocumentosReferenciasTte")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 976;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "eliminartablatemporaldocumentosreferenciastte"), parent._jrdcquery.runMethod(false,"_executebatch" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)}))))));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 982;BA.debugLine="Return Null";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 983;BA.debugLine="End Sub";
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
public static RemoteObject  _fechasultimasemana(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FechasUltimaSemana (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("fechasultimasemana")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","fechasultimasemana", __ref);}
RemoteObject _datetimeant = RemoteObject.createImmutable("");
RemoteObject _nw = RemoteObject.createImmutable(0L);
RemoteObject _hoy0 = RemoteObject.createImmutable(0L);
RemoteObject _hoy0menos7 = RemoteObject.createImmutable(0L);
RemoteObject _p = RemoteObject.declareNull("b4j.example.dateutils._period");
 BA.debugLineNum = 149;BA.debugLine="Sub FechasUltimaSemana";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim DateTimeAnt As String=DateTime.DateFormat";
Debug.ShouldStop(2097152);
_datetimeant = cinfoenviosperiodocorreosexpress2.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateTimeAnt", _datetimeant);Debug.locals.put("DateTimeAnt", _datetimeant);
 BA.debugLineNum = 151;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
Debug.ShouldStop(4194304);
cinfoenviosperiodocorreosexpress2.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yy"));
 BA.debugLineNum = 152;BA.debugLine="Dim nw As Long=DateTime.Now";
Debug.ShouldStop(8388608);
_nw = cinfoenviosperiodocorreosexpress2.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("nw", _nw);Debug.locals.put("nw", _nw);
 BA.debugLineNum = 153;BA.debugLine="Dim hoy0 As Long=DateUtils.SetDate(DateTime.GetYe";
Debug.ShouldStop(16777216);
_hoy0 = cinfoenviosperiodocorreosexpress2._dateutils.runMethod(true,"_setdate",(Object)(cinfoenviosperiodocorreosexpress2.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_nw))),(Object)(cinfoenviosperiodocorreosexpress2.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_nw))),(Object)(cinfoenviosperiodocorreosexpress2.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_nw))));Debug.locals.put("hoy0", _hoy0);Debug.locals.put("hoy0", _hoy0);
 BA.debugLineNum = 154;BA.debugLine="Dim hoy0menos7 As Long";
Debug.ShouldStop(33554432);
_hoy0menos7 = RemoteObject.createImmutable(0L);Debug.locals.put("hoy0menos7", _hoy0menos7);
 BA.debugLineNum = 155;BA.debugLine="Dim p As Period";
Debug.ShouldStop(67108864);
_p = RemoteObject.createNew ("b4j.example.dateutils._period");Debug.locals.put("p", _p);
 BA.debugLineNum = 156;BA.debugLine="p.Days=-7";
Debug.ShouldStop(134217728);
_p.setField ("Days",BA.numberCast(int.class, -(double) (0 + 7)));
 BA.debugLineNum = 157;BA.debugLine="hoy0menos7=DateUtils.AddPeriod(hoy0,p)";
Debug.ShouldStop(268435456);
_hoy0menos7 = cinfoenviosperiodocorreosexpress2._dateutils.runMethod(true,"_addperiod",(Object)(_hoy0),(Object)(_p));Debug.locals.put("hoy0menos7", _hoy0menos7);
 BA.debugLineNum = 158;BA.debugLine="txtFechaFinal.Text=DateTime.Date(hoy0)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"setText",cinfoenviosperiodocorreosexpress2.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_hoy0)));
 BA.debugLineNum = 159;BA.debugLine="txtfechaInicial.Text=DateTime.Date(hoy0menos7)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"setText",cinfoenviosperiodocorreosexpress2.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_hoy0menos7)));
 BA.debugLineNum = 160;BA.debugLine="DateTime.DateFormat=DateTimeAnt";
Debug.ShouldStop(-2147483648);
cinfoenviosperiodocorreosexpress2.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_datetimeant);
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("frm_CloseRequest (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 175;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="EventData.Consume";
Debug.ShouldStop(32768);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getelements(RemoteObject __ref,RemoteObject _m,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetElements (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,588);
if (RapidSub.canDelegate("getelements")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","getelements", __ref, _m, _key);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _value = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
Debug.locals.put("key", _key);
 BA.debugLineNum = 588;BA.debugLine="Sub GetElements (m As Map, key As String) As List";
Debug.ShouldStop(2048);
 BA.debugLineNum = 589;BA.debugLine="Dim res As List";
Debug.ShouldStop(4096);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 590;BA.debugLine="If m.ContainsKey(key) = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_m.runMethod(true,"ContainsKey",(Object)((_key))),cinfoenviosperiodocorreosexpress2.__c.getField(true,"False"))) { 
 BA.debugLineNum = 591;BA.debugLine="res.Initialize";
Debug.ShouldStop(16384);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 592;BA.debugLine="Return res";
Debug.ShouldStop(32768);
if (true) return _res;
 }else {
 BA.debugLineNum = 594;BA.debugLine="Dim value As Object = m.Get(key)";
Debug.ShouldStop(131072);
_value = _m.runMethod(false,"Get",(Object)((_key)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 595;BA.debugLine="If value Is List Then Return value";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("java.util.List"))) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _value);};
 BA.debugLineNum = 596;BA.debugLine="res.Initialize";
Debug.ShouldStop(524288);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 597;BA.debugLine="res.Add(value)";
Debug.ShouldStop(1048576);
_res.runVoidMethod ("Add",(Object)(_value));
 BA.debugLineNum = 598;BA.debugLine="Return res";
Debug.ShouldStop(2097152);
if (true) return _res;
 };
 BA.debugLineNum = 600;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _infodocsnav(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InfoDocsNav (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,760);
if (RapidSub.canDelegate("infodocsnav")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","infodocsnav", __ref);}
ResumableSub_InfoDocsNav rsub = new ResumableSub_InfoDocsNav(null,__ref);
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
public static class ResumableSub_InfoDocsNav extends BA.ResumableSub {
public ResumableSub_InfoDocsNav(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _lstregdocsexpptes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _ndoc = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _micli = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _minfoexp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _refexp = RemoteObject.createImmutable("");
RemoteObject group13;
int index13;
int groupLen13;
RemoteObject group23;
int index23;
int groupLen23;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InfoDocsNav (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,760);
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
 BA.debugLineNum = 761;BA.debugLine="Dim lstRegDocsExpPtes As List";
Debug.ShouldStop(16777216);
_lstregdocsexpptes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegDocsExpPtes", _lstregdocsexpptes);
 BA.debugLineNum = 762;BA.debugLine="lstRegDocsExpPtes.Initialize";
Debug.ShouldStop(33554432);
_lstregdocsexpptes.runVoidMethod ("Initialize");
 BA.debugLineNum = 763;BA.debugLine="Wait For(DocumentosExpedicionesCorreosPeriodoBatc";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "infodocsnav"), __ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_documentosexpedicionescorreosperiodobatch" /*RemoteObject*/ ));
this.state = 32;
return;
case 32:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 764;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
Debug.ShouldStop(134217728);
_success = BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Success")))));Debug.locals.put("Success", _success);Debug.locals.put("Success", _success);
 BA.debugLineNum = 765;BA.debugLine="If Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 6;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 766;BA.debugLine="Dim lstRegDocsExpPtes As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(536870912);
_lstregdocsexpptes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstregdocsexpptes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstRegDocsExpPtes", _lstregdocsexpptes);Debug.locals.put("lstRegDocsExpPtes", _lstregdocsexpptes);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 768;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 771;BA.debugLine="Wait For(EliminarTablaTemporalDocumentosReferenci";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "infodocsnav"), __ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_eliminartablatemporaldocumentosreferenciastte" /*RemoteObject*/ ));
this.state = 33;
return;
case 33:
//C
this.state = 7;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 774;BA.debugLine="If lstRegDocsExpPtes.Size>0 Then";
Debug.ShouldStop(32);
if (true) break;

case 7:
//if
this.state = 31;
if (RemoteObject.solveBoolean(">",_lstregdocsexpptes.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 30;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 805;BA.debugLine="Dim nDoc As Int=1";
Debug.ShouldStop(16);
_ndoc = BA.numberCast(int.class, 1);Debug.locals.put("nDoc", _ndoc);Debug.locals.put("nDoc", _ndoc);
 BA.debugLineNum = 806;BA.debugLine="For Each m As Map In lstRegDocsExpPtes";
Debug.ShouldStop(32);
if (true) break;

case 10:
//for
this.state = 28;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group13 = _lstregdocsexpptes;
index13 = 0;
groupLen13 = group13.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 34;
if (true) break;

case 34:
//C
this.state = 28;
if (index13 < groupLen13) {
this.state = 12;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group13.runMethod(false,"Get",index13));Debug.locals.put("m", _m);}
if (true) break;

case 35:
//C
this.state = 34;
index13++;
Debug.locals.put("m", _m);
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 808;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizan";
Debug.ShouldStop(128);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",(RemoteObject.concat(RemoteObject.createImmutable("Actualizando info "),_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))),RemoteObject.createImmutable(" ("),_ndoc,RemoteObject.createImmutable(" de "),_lstregdocsexpptes.runMethod(true,"getSize"),RemoteObject.createImmutable(") ..."))));
 BA.debugLineNum = 809;BA.debugLine="Wait For(ClienteResponsableCuentaDocumento(m.Ge";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "infodocsnav"), __ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_clienteresponsablecuentadocumento" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))))));
this.state = 36;
return;
case 36:
//C
this.state = 13;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 810;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(512);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 811;BA.debugLine="If Accion=\"ErrConn\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("ErrConn"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 812;BA.debugLine="Return False";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 814;BA.debugLine="If Accion=\"OK\" Then";
Debug.ShouldStop(8192);

case 16:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("OK"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 815;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(16384);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 816;BA.debugLine="Dim mICli As Map=lstReg.Get(0)";
Debug.ShouldStop(32768);
_micli = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_micli = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mICli", _micli);Debug.locals.put("mICli", _micli);
 BA.debugLineNum = 821;BA.debugLine="For Each mInfoExp As Map In lstInfoEnviosFecha";
Debug.ShouldStop(1048576);
if (true) break;

case 19:
//for
this.state = 26;
_minfoexp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group23 = __ref.getField(false,"_lstinfoenviosfechas" /*RemoteObject*/ );
index23 = 0;
groupLen23 = group23.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mInfoExp", _minfoexp);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 26;
if (index23 < groupLen23) {
this.state = 21;
_minfoexp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group23.runMethod(false,"Get",index23));Debug.locals.put("mInfoExp", _minfoexp);}
if (true) break;

case 38:
//C
this.state = 37;
index23++;
Debug.locals.put("mInfoExp", _minfoexp);
if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 822;BA.debugLine="Dim RefExp As String=mInfoExp.Get(\"Referencia";
Debug.ShouldStop(2097152);
_refexp = BA.ObjectToString(_minfoexp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Referencia")))));Debug.locals.put("RefExp", _refexp);Debug.locals.put("RefExp", _refexp);
 BA.debugLineNum = 823;BA.debugLine="If RefExp=m.Get(\"ReferenciaExpedicionTranspor";
Debug.ShouldStop(4194304);
if (true) break;

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_refexp,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReferenciaExpedicionTransporte"))))))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 824;BA.debugLine="mInfoExp.Put(\"Cliente\",mICli.Get(\"Cliente\"))";
Debug.ShouldStop(8388608);
_minfoexp.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Cliente"))),(Object)(_micli.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cliente"))))));
 BA.debugLineNum = 825;BA.debugLine="mInfoExp.Put(\"NombreCliente\",mICli.Get(\"Nomb";
Debug.ShouldStop(16777216);
_minfoexp.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreCliente"))),(Object)(_micli.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreCliente"))))));
 BA.debugLineNum = 826;BA.debugLine="mInfoExp.Put(\"NombreResponsableCuenta\",mICli";
Debug.ShouldStop(33554432);
_minfoexp.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreResponsableCuenta"))),(Object)(_micli.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableCuenta"))))));
 BA.debugLineNum = 827;BA.debugLine="Exit";
Debug.ShouldStop(67108864);
this.state = 26;
if (true) break;
 if (true) break;

case 25:
//C
this.state = 38;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
Debug.locals.put("mInfoExp", _minfoexp);
;
 if (true) break;

case 27:
//C
this.state = 35;
;
 BA.debugLineNum = 831;BA.debugLine="nDoc=nDoc+1";
Debug.ShouldStop(1073741824);
_ndoc = RemoteObject.solve(new RemoteObject[] {_ndoc,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nDoc", _ndoc);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 31;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 841;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 843;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 31:
//C
this.state = -1;
;
 BA.debugLineNum = 846;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _infoenviosfecha(RemoteObject __ref,RemoteObject _clifac,RemoteObject _lfecha) throws Exception{
try {
		Debug.PushSubsStack("InfoEnviosFecha (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("infoenviosfecha")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","infoenviosfecha", __ref, _clifac, _lfecha);}
ResumableSub_InfoEnviosFecha rsub = new ResumableSub_InfoEnviosFecha(null,__ref,_clifac,_lfecha);
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
public static class ResumableSub_InfoEnviosFecha extends BA.ResumableSub {
public ResumableSub_InfoEnviosFecha(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref,RemoteObject _clifac,RemoteObject _lfecha) {
this.parent = parent;
this.__ref = __ref;
this._clifac = _clifac;
this._lfecha = _lfecha;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _clifac;
RemoteObject _lfecha;
RemoteObject _lstinfoenviosfecha = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _wsresponse = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _mresponse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mensajeerror = RemoteObject.createImmutable("");
RemoteObject _lstseguimientoenviofecha = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _error = RemoteObject.createImmutable(0);
RemoteObject _mestadoactualenvio = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _codigoestadoenvio = RemoteObject.createImmutable("");
RemoteObject _nombreestadoenvio = RemoteObject.createImmutable("");
RemoteObject _descripcionestadoenvio = RemoteObject.createImmutable("");
RemoteObject _infoestado = null;
RemoteObject group31;
int index31;
int groupLen31;
RemoteObject group37;
int index37;
int groupLen37;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InfoEnviosFecha (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,374);
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
Debug.locals.put("CliFac", _clifac);
Debug.locals.put("LFecha", _lfecha);
 BA.debugLineNum = 375;BA.debugLine="Dim lstInfoEnviosFecha As List";
Debug.ShouldStop(4194304);
_lstinfoenviosfecha = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstInfoEnviosFecha", _lstinfoenviosfecha);
 BA.debugLineNum = 376;BA.debugLine="lstInfoEnviosFecha.Initialize";
Debug.ShouldStop(8388608);
_lstinfoenviosfecha.runVoidMethod ("Initialize");
 BA.debugLineNum = 377;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.SetMouseCur";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 378;BA.debugLine="wait for (InfoExpedicionesCorreosExpressEntreFech";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "infoenviosfecha"), __ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_infoexpedicionescorreosexpressentrefechas" /*RemoteObject*/ ,(Object)(_clifac),(Object)(_lfecha),(Object)(_lfecha)));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_wsresponse = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("WSResponse", _wsresponse);
;
 BA.debugLineNum = 379;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.SetMouseCur";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 380;BA.debugLine="Log(\"WSResponse \" & WSResponse)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","886835206",RemoteObject.concat(RemoteObject.createImmutable("WSResponse "),_wsresponse),0);
 BA.debugLineNum = 381;BA.debugLine="If WSResponse.StartsWith(\"ERROR de comunicacion :";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 4;
if (_wsresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR de comunicacion :"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 383;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 384;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(WSResponse,\"";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_wsresponse),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 385;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "infoenviosfecha"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 386;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 389;BA.debugLine="If WSResponse.StartsWith(\"Error carga credenciale";
Debug.ShouldStop(16);

case 4:
//if
this.state = 7;
if (_wsresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Error carga credenciales"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 390;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 391;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible cargar los credenciales de acceso al web service de Correos Express")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 392;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "infoenviosfecha"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 393;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 397;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4096);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 398;BA.debugLine="parser.Initialize(WSResponse)";
Debug.ShouldStop(8192);
_parser.runVoidMethod ("Initialize",(Object)(_wsresponse));
 BA.debugLineNum = 399;BA.debugLine="Dim mResponse As Map = parser.NextObject";
Debug.ShouldStop(16384);
_mresponse = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresponse = _parser.runMethod(false,"NextObject");Debug.locals.put("mResponse", _mresponse);Debug.locals.put("mResponse", _mresponse);
 BA.debugLineNum = 400;BA.debugLine="Dim mensajeError As String = mResponse.Get(\"mensa";
Debug.ShouldStop(32768);
_mensajeerror = BA.ObjectToString(_mresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mensajeError")))));Debug.locals.put("mensajeError", _mensajeerror);Debug.locals.put("mensajeError", _mensajeerror);
 BA.debugLineNum = 401;BA.debugLine="Dim lstSeguimientoEnvioFecha As List = mResponse.";
Debug.ShouldStop(65536);
_lstseguimientoenviofecha = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstseguimientoenviofecha = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("seguimientoEnvioFecha")))));Debug.locals.put("lstSeguimientoEnvioFecha", _lstseguimientoenviofecha);Debug.locals.put("lstSeguimientoEnvioFecha", _lstseguimientoenviofecha);
 BA.debugLineNum = 402;BA.debugLine="Dim error As Int = mResponse.Get(\"error\")";
Debug.ShouldStop(131072);
_error = BA.numberCast(int.class, _mresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("error")))));Debug.locals.put("error", _error);Debug.locals.put("error", _error);
 BA.debugLineNum = 404;BA.debugLine="If error<>0 And error <>402 Then";
Debug.ShouldStop(524288);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",_error,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",_error,BA.numberCast(double.class, 402))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 405;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 406;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(mensajeError";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_mensajeerror),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 407;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "infoenviosfecha"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 408;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 417;BA.debugLine="For Each mEstadoActualEnvio As Map In lstSeguimie";
Debug.ShouldStop(1);

case 11:
//for
this.state = 28;
_mestadoactualenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group31 = _lstseguimientoenviofecha;
index31 = 0;
groupLen31 = group31.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mEstadoActualEnvio", _mestadoactualenvio);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 28;
if (index31 < groupLen31) {
this.state = 13;
_mestadoactualenvio = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group31.runMethod(false,"Get",index31));Debug.locals.put("mEstadoActualEnvio", _mestadoactualenvio);}
if (true) break;

case 34:
//C
this.state = 33;
index31++;
Debug.locals.put("mEstadoActualEnvio", _mestadoactualenvio);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 420;BA.debugLine="Dim CodigoEstadoEnvio As String=mEstadoActualEnv";
Debug.ShouldStop(8);
_codigoestadoenvio = BA.ObjectToString(_mestadoactualenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("estadoEnvio")))));Debug.locals.put("CodigoEstadoEnvio", _codigoestadoenvio);Debug.locals.put("CodigoEstadoEnvio", _codigoestadoenvio);
 BA.debugLineNum = 421;BA.debugLine="mEstadoActualEnvio.Put(\"EstadoEnvio\",CodigoEstad";
Debug.ShouldStop(16);
_mestadoactualenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EstadoEnvio"))),(Object)((_codigoestadoenvio)));
 BA.debugLineNum = 422;BA.debugLine="mEstadoActualEnvio.Put(\"NumEnvio\",mEstadoActualE";
Debug.ShouldStop(32);
_mestadoactualenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NumEnvio"))),(Object)(_mestadoactualenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("numEnvio"))))));
 BA.debugLineNum = 423;BA.debugLine="Dim NombreEstadoEnvio As String";
Debug.ShouldStop(64);
_nombreestadoenvio = RemoteObject.createImmutable("");Debug.locals.put("NombreEstadoEnvio", _nombreestadoenvio);
 BA.debugLineNum = 424;BA.debugLine="Dim DescripcionEstadoEnvio As String";
Debug.ShouldStop(128);
_descripcionestadoenvio = RemoteObject.createImmutable("");Debug.locals.put("DescripcionEstadoEnvio", _descripcionestadoenvio);
 BA.debugLineNum = 425;BA.debugLine="For Each InfoEstado() As String In cmAuxCorreosE";
Debug.ShouldStop(256);
if (true) break;

case 14:
//for
this.state = 21;
group37 = parent._cmauxcorreosexpress._lstestadoscorreosexpress /*RemoteObject*/ ;
index37 = 0;
groupLen37 = group37.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("InfoEstado", _infoestado);
this.state = 35;
if (true) break;

case 35:
//C
this.state = 21;
if (index37 < groupLen37) {
this.state = 16;
_infoestado = (group37.runMethod(false,"Get",index37));Debug.locals.put("InfoEstado", _infoestado);}
if (true) break;

case 36:
//C
this.state = 35;
index37++;
Debug.locals.put("InfoEstado", _infoestado);
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 426;BA.debugLine="If InfoEstado(0)=CodigoEstadoEnvio Then";
Debug.ShouldStop(512);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_infoestado.getArrayElement(true,BA.numberCast(int.class, 0)),_codigoestadoenvio)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 427;BA.debugLine="NombreEstadoEnvio=InfoEstado(1)";
Debug.ShouldStop(1024);
_nombreestadoenvio = _infoestado.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("NombreEstadoEnvio", _nombreestadoenvio);
 BA.debugLineNum = 428;BA.debugLine="DescripcionEstadoEnvio=InfoEstado(2)";
Debug.ShouldStop(2048);
_descripcionestadoenvio = _infoestado.getArrayElement(true,BA.numberCast(int.class, 2));Debug.locals.put("DescripcionEstadoEnvio", _descripcionestadoenvio);
 BA.debugLineNum = 429;BA.debugLine="mEstadoActualEnvio.Put(\"NombreEstadoEnvio\",Nom";
Debug.ShouldStop(4096);
_mestadoactualenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreEstadoEnvio"))),(Object)((_nombreestadoenvio)));
 BA.debugLineNum = 430;BA.debugLine="mEstadoActualEnvio.Put(\"DescripcionEstadoEnvio";
Debug.ShouldStop(8192);
_mestadoactualenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescripcionEstadoEnvio"))),(Object)((_descripcionestadoenvio)));
 BA.debugLineNum = 431;BA.debugLine="Exit";
Debug.ShouldStop(16384);
this.state = 21;
if (true) break;
 if (true) break;

case 20:
//C
this.state = 36;
;
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
Debug.locals.put("InfoEstado", _infoestado);
;
 BA.debugLineNum = 434;BA.debugLine="mEstadoActualEnvio.Put(\"FechaEstadoEnvio\",LFecha";
Debug.ShouldStop(131072);
_mestadoactualenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FechaEstadoEnvio"))),(Object)((_lfecha)));
 BA.debugLineNum = 439;BA.debugLine="If mEstadoActualEnvio.ContainsKey(\"referencia\")=";
Debug.ShouldStop(4194304);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_mestadoactualenvio.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("referencia")))),parent.__c.getField(true,"False"))) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 BA.debugLineNum = 440;BA.debugLine="mEstadoActualEnvio.put(\"Referencia\",\"\")";
Debug.ShouldStop(8388608);
_mestadoactualenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Referencia"))),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 442;BA.debugLine="mEstadoActualEnvio.Put(\"Referencia\",jamTableVie";
Debug.ShouldStop(33554432);
_mestadoactualenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Referencia"))),(Object)((__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_fixnull" /*RemoteObject*/ ,(Object)(_mestadoactualenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("referencia")))))))));
 if (true) break;

case 27:
//C
this.state = 34;
;
 BA.debugLineNum = 446;BA.debugLine="mEstadoActualEnvio.Put(\"Cliente\",\"\")";
Debug.ShouldStop(536870912);
_mestadoactualenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Cliente"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 447;BA.debugLine="mEstadoActualEnvio.Put(\"NombreCliente\",\"\")";
Debug.ShouldStop(1073741824);
_mestadoactualenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreCliente"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 448;BA.debugLine="mEstadoActualEnvio.Put(\"NombreResponsableCuenta\"";
Debug.ShouldStop(-2147483648);
_mestadoactualenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreResponsableCuenta"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 449;BA.debugLine="lstInfoEnviosFechas.Add(mEstadoActualEnvio)";
Debug.ShouldStop(1);
__ref.getField(false,"_lstinfoenviosfechas" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_mestadoactualenvio.getObject())));
 if (true) break;
if (true) break;

case 28:
//C
this.state = -1;
Debug.locals.put("mEstadoActualEnvio", _mestadoactualenvio);
;
 BA.debugLineNum = 452;BA.debugLine="Log(\"lstInfoEnviosFechas \" & lstInfoEnviosFechas)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","886835278",RemoteObject.concat(RemoteObject.createImmutable("lstInfoEnviosFechas "),__ref.getField(false,"_lstinfoenviosfechas" /*RemoteObject*/ )),0);
 BA.debugLineNum = 454;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 456;BA.debugLine="End Sub";
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
public static RemoteObject  _infoexpedicionescorreosexpressentrefechas(RemoteObject __ref,RemoteObject _clifac,RemoteObject _fechainl,RemoteObject _fechafinl) throws Exception{
try {
		Debug.PushSubsStack("InfoExpedicionesCorreosExpressEntreFechas (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,526);
if (RapidSub.canDelegate("infoexpedicionescorreosexpressentrefechas")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","infoexpedicionescorreosexpressentrefechas", __ref, _clifac, _fechainl, _fechafinl);}
ResumableSub_InfoExpedicionesCorreosExpressEntreFechas rsub = new ResumableSub_InfoExpedicionesCorreosExpressEntreFechas(null,__ref,_clifac,_fechainl,_fechafinl);
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
public static class ResumableSub_InfoExpedicionesCorreosExpressEntreFechas extends BA.ResumableSub {
public ResumableSub_InfoExpedicionesCorreosExpressEntreFechas(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref,RemoteObject _clifac,RemoteObject _fechainl,RemoteObject _fechafinl) {
this.parent = parent;
this.__ref = __ref;
this._clifac = _clifac;
this._fechainl = _fechainl;
this._fechafinl = _fechafinl;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _clifac;
RemoteObject _fechainl;
RemoteObject _fechafinl;
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _mseguimientoenviosfechasrequest = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
RemoteObject _infoenviosentrefechasjsonstring = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _urlcorreosexpressfechas = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InfoExpedicionesCorreosExpressEntreFechas (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,526);
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
Debug.locals.put("CliFac", _clifac);
Debug.locals.put("FechaInL", _fechainl);
Debug.locals.put("FechaFinL", _fechafinl);
 BA.debugLineNum = 543;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(1073741824);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 544;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"   ' el formato t";
Debug.ShouldStop(-2147483648);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 546;BA.debugLine="Dim mSeguimientoEnviosFechasRequest As Map";
Debug.ShouldStop(2);
_mseguimientoenviosfechasrequest = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mSeguimientoEnviosFechasRequest", _mseguimientoenviosfechasrequest);
 BA.debugLineNum = 547;BA.debugLine="mSeguimientoEnviosFechasRequest.Initialize";
Debug.ShouldStop(4);
_mseguimientoenviosfechasrequest.runVoidMethod ("Initialize");
 BA.debugLineNum = 548;BA.debugLine="mSeguimientoEnviosFechasRequest.Put(\"keyCliFac\",C";
Debug.ShouldStop(8);
_mseguimientoenviosfechasrequest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("keyCliFac"))),(Object)((_clifac)));
 BA.debugLineNum = 549;BA.debugLine="mSeguimientoEnviosFechasRequest.Put(\"fechaInicial";
Debug.ShouldStop(16);
_mseguimientoenviosfechasrequest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fechaInicial"))),(Object)((parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechainl)))));
 BA.debugLineNum = 550;BA.debugLine="mSeguimientoEnviosFechasRequest.Put(\"fechaFinal\",";
Debug.ShouldStop(32);
_mseguimientoenviosfechasrequest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fechaFinal"))),(Object)((parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechafinl)))));
 BA.debugLineNum = 551;BA.debugLine="mSeguimientoEnviosFechasRequest.Put(\"idioma\",\"ES\"";
Debug.ShouldStop(64);
_mseguimientoenviosfechasrequest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idioma"))),(Object)((RemoteObject.createImmutable("ES"))));
 BA.debugLineNum = 553;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(256);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 555;BA.debugLine="Dim jp As JSONGenerator";
Debug.ShouldStop(1024);
_jp = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 556;BA.debugLine="jp.Initialize(mSeguimientoEnviosFechasRequest)";
Debug.ShouldStop(2048);
_jp.runVoidMethod ("Initialize",(Object)(_mseguimientoenviosfechasrequest));
 BA.debugLineNum = 557;BA.debugLine="Dim InfoEnviosEntreFechasJSONstring As String";
Debug.ShouldStop(4096);
_infoenviosentrefechasjsonstring = RemoteObject.createImmutable("");Debug.locals.put("InfoEnviosEntreFechasJSONstring", _infoenviosentrefechasjsonstring);
 BA.debugLineNum = 558;BA.debugLine="InfoEnviosEntreFechasJSONstring=jp.ToString";
Debug.ShouldStop(8192);
_infoenviosentrefechasjsonstring = _jp.runMethod(true,"ToString");Debug.locals.put("InfoEnviosEntreFechasJSONstring", _infoenviosentrefechasjsonstring);
 BA.debugLineNum = 561;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(65536);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 562;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(131072);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 564;BA.debugLine="Dim URLCorreosExpressFechas As String=\"https://ww";
Debug.ShouldStop(524288);
_urlcorreosexpressfechas = BA.ObjectToString("https://www.cexpr.es/wspsc/apiRestSeguimientoEnviosk8s/json/seguimientoEnviosFechas");Debug.locals.put("URLCorreosExpressFechas", _urlcorreosexpressfechas);Debug.locals.put("URLCorreosExpressFechas", _urlcorreosexpressfechas);
 BA.debugLineNum = 566;BA.debugLine="job.Username=UsuarioWS";
Debug.ShouldStop(2097152);
_job.setField ("_username" /*RemoteObject*/ ,__ref.getField(true,"_usuariows" /*RemoteObject*/ ));
 BA.debugLineNum = 567;BA.debugLine="job.Password=PasswordWs";
Debug.ShouldStop(4194304);
_job.setField ("_password" /*RemoteObject*/ ,__ref.getField(true,"_passwordws" /*RemoteObject*/ ));
 BA.debugLineNum = 568;BA.debugLine="job.PostString(URLCorreosExpressFechas,InfoEnvios";
Debug.ShouldStop(8388608);
_job.runClassMethod (b4j.docU.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_urlcorreosexpressfechas),(Object)(_infoenviosentrefechasjsonstring));
 BA.debugLineNum = 570;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 571;BA.debugLine="job.GetRequest.SetContentEncoding(\"UTF8\")";
Debug.ShouldStop(67108864);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentEncoding",(Object)(RemoteObject.createImmutable("UTF8")));
 BA.debugLineNum = 573;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "infoexpedicionescorreosexpressentrefechas"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 574;BA.debugLine="If j.Success Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 576;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(-2147483648);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 577;BA.debugLine="j.Release";
Debug.ShouldStop(1);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 578;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 580;BA.debugLine="j.Release";
Debug.ShouldStop(8);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 581;BA.debugLine="Return \"ERROR de comunicacion :\" & j.ErrorMessag";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(RemoteObject.concat(RemoteObject.createImmutable("ERROR de comunicacion :"),_j.getField(true,"_errormessage" /*RemoteObject*/ ))));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 583;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableviewinfotrackingenviosperiodo_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewInfoTrackingEnviosPeriodo_ContextMenuItem_Action (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,602);
if (RapidSub.canDelegate("jamtableviewinfotrackingenviosperiodo_contextmenuitem_action")) { __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","jamtableviewinfotrackingenviosperiodo_contextmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableViewInfoTrackingEnviosPeriodo_ContextMenuItem_Action rsub = new ResumableSub_jamTableViewInfoTrackingEnviosPeriodo_ContextMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableViewInfoTrackingEnviosPeriodo_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewInfoTrackingEnviosPeriodo_ContextMenuItem_Action(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _tagmenuitem;
RemoteObject _numenvio = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dcrs = RemoteObject.declareNull("b4j.docU.jamtableview._datoscamporegistrojamtableview");
RemoteObject _cinfoexpce = RemoteObject.declareNull("b4j.docU.cinfoexpedicioncorreosexpress");
RemoteObject _documentosel = RemoteObject.createImmutable("");
RemoteObject _filaseleccionada = RemoteObject.createImmutable(0);
RemoteObject _lstinfofila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dc = RemoteObject.declareNull("b4j.docU.jamtableview._datoscamporegistrojamtableview");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group5;
int index5;
int groupLen5;
RemoteObject group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewInfoTrackingEnviosPeriodo_ContextMenuItem_Action (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,602);
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
 BA.debugLineNum = 603;BA.debugLine="Select TagMenuItem";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//select
this.state = 30;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("TrazabilidadEnvio"),BA.ObjectToString("VerDocumentoNAV"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 16;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 605;BA.debugLine="Dim NumEnvio As String";
Debug.ShouldStop(268435456);
_numenvio = RemoteObject.createImmutable("");Debug.locals.put("NumEnvio", _numenvio);
 BA.debugLineNum = 606;BA.debugLine="Dim lstReg As List=jamTableViewInfoTrackingEnvi";
Debug.ShouldStop(536870912);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = __ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datosregistroindicefila" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ )));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 607;BA.debugLine="For Each dcRS As DatosCampoRegistroJamTableView";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//for
this.state = 11;
group5 = _lstreg;
index5 = 0;
groupLen5 = group5.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("dcRS", _dcrs);
this.state = 31;
if (true) break;

case 31:
//C
this.state = 11;
if (index5 < groupLen5) {
this.state = 6;
_dcrs = (group5.runMethod(false,"Get",index5));Debug.locals.put("dcRS", _dcrs);}
if (true) break;

case 32:
//C
this.state = 31;
index5++;
Debug.locals.put("dcRS", _dcrs);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 608;BA.debugLine="If dcRS.AliasCampo=\"NumEnvio\" Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_dcrs.getField(true,"AliasCampo" /*RemoteObject*/ ),BA.ObjectToString("NumEnvio"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 609;BA.debugLine="NumEnvio=dcRS.ValorCampo";
Debug.ShouldStop(1);
_numenvio = BA.ObjectToString(_dcrs.getField(false,"ValorCampo" /*RemoteObject*/ ));Debug.locals.put("NumEnvio", _numenvio);
 BA.debugLineNum = 610;BA.debugLine="Exit";
Debug.ShouldStop(2);
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 32;
;
 if (true) break;
if (true) break;
Debug.locals.put("dcRS", _dcrs);
;
 BA.debugLineNum = 613;BA.debugLine="If NumEnvio<>\"\" Then";
Debug.ShouldStop(16);

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",_numenvio,BA.ObjectToString(""))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 614;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.GuardarC";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 619;BA.debugLine="Dim cInfoExpCE As cInfoExpedicionCorreosExpres";
Debug.ShouldStop(1024);
_cinfoexpce = RemoteObject.createNew ("b4j.docU.cinfoexpedicioncorreosexpress");Debug.locals.put("cInfoExpCE", _cinfoexpce);
 BA.debugLineNum = 620;BA.debugLine="cInfoExpCE.Initialize(NumEnvio)";
Debug.ShouldStop(2048);
_cinfoexpce.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_numenvio));
 BA.debugLineNum = 621;BA.debugLine="cInfoExpCE.Show";
Debug.ShouldStop(4096);
_cinfoexpce.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_show" /*void*/ );
 if (true) break;

case 14:
//C
this.state = 30;
;
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 625;BA.debugLine="Dim DocumentoSel As String";
Debug.ShouldStop(65536);
_documentosel = RemoteObject.createImmutable("");Debug.locals.put("DocumentoSel", _documentosel);
 BA.debugLineNum = 626;BA.debugLine="Dim FilaSeleccionada As Int=jamTableViewInfoTra";
Debug.ShouldStop(131072);
_filaseleccionada = BA.numberCast(int.class, __ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_indicesfilasseleccionadas" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 627;BA.debugLine="Dim lstInfoFila As List=jamTableViewInfoTrackin";
Debug.ShouldStop(262144);
_lstinfofila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstinfofila = __ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datosregistroindicefila" /*RemoteObject*/ ,(Object)(_filaseleccionada));Debug.locals.put("lstInfoFila", _lstinfofila);Debug.locals.put("lstInfoFila", _lstinfofila);
 BA.debugLineNum = 628;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
Debug.ShouldStop(524288);
if (true) break;

case 17:
//for
this.state = 24;
group21 = _lstinfofila;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("dc", _dc);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 24;
if (index21 < groupLen21) {
this.state = 19;
_dc = (group21.runMethod(false,"Get",index21));Debug.locals.put("dc", _dc);}
if (true) break;

case 34:
//C
this.state = 33;
index21++;
Debug.locals.put("dc", _dc);
if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 629;BA.debugLine="If dc.Campo=\"Referencia\" Then";
Debug.ShouldStop(1048576);
if (true) break;

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_dc.getField(true,"Campo" /*RemoteObject*/ ),BA.ObjectToString("Referencia"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 630;BA.debugLine="DocumentoSel=dc.ValorCampo";
Debug.ShouldStop(2097152);
_documentosel = BA.ObjectToString(_dc.getField(false,"ValorCampo" /*RemoteObject*/ ));Debug.locals.put("DocumentoSel", _documentosel);
 BA.debugLineNum = 631;BA.debugLine="Exit";
Debug.ShouldStop(4194304);
this.state = 24;
if (true) break;
 if (true) break;

case 23:
//C
this.state = 34;
;
 if (true) break;
if (true) break;
Debug.locals.put("dc", _dc);
;
 BA.debugLineNum = 634;BA.debugLine="If DocumentoSel=\"\" Then";
Debug.ShouldStop(33554432);

case 24:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_documentosel,BA.ObjectToString(""))) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 635;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha encontrado el campo Documento.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 636;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "jamtableviewinfotrackingenviosperiodo_contextmenuitem_action"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 29;
;
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 639;BA.debugLine="WAIT FOR (VerDocumentoNAV(DocumentoSel)) COMPL";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "jamtableviewinfotrackingenviosperiodo_contextmenuitem_action"), __ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_verdocumentonav" /*RemoteObject*/ ,(Object)(_documentosel)));
this.state = 36;
return;
case 36:
//C
this.state = 29;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 646;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Process_Globals (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("process_globals")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","process_globals", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Sub Process_Globals";
Debug.ShouldStop(4);
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","salirmodulo", __ref);}
 BA.debugLineNum = 168;BA.debugLine="Sub SalirModulo";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.GuardarConf";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 170;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.LimpiarTabl";
Debug.ShouldStop(512);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 171;BA.debugLine="frm.Close";
Debug.ShouldStop(1024);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 172;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(2048);
cinfoenviosperiodocorreosexpress2._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("show (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","show", __ref); return;}
ResumableSub_show rsub = new ResumableSub_show(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_show extends BA.ResumableSub {
public ResumableSub_show(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _lstcf = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("show (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,39);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 46;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
Debug.ShouldStop(8192);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(16384);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 48;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(32768);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 49;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(65536);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 50;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 52;BA.debugLine="frm.RootPane.LoadLayout(\"scrInfoTrackingEnviosPer";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrInfoTrackingEnviosPeriodo")));
 BA.debugLineNum = 53;BA.debugLine="Sleep(0)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "show"),BA.numberCast(int.class, 0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 BA.debugLineNum = 54;BA.debugLine="frm.Title=\"Tracking Envío Periodo Correos Express";
Debug.ShouldStop(2097152);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",BA.ObjectToString("Tracking Envío Periodo Correos Express"));
 BA.debugLineNum = 56;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 58;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 60;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 61;BA.debugLine="mSQL.InitializeSQLite(\"\", \":memory:\", True)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(":memory:")),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 64;BA.debugLine="cmAuxCorreosExpress.CargaListaEstadosCorreosExpre";
Debug.ShouldStop(-2147483648);
parent._cmauxcorreosexpress.runVoidMethod ("_cargalistaestadoscorreosexpress" /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="cmAuxCorreosExpress.CargaListaIncidenciasCorreosE";
Debug.ShouldStop(1);
parent._cmauxcorreosexpress.runVoidMethod ("_cargalistaincidenciascorreosexpress" /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.EstadoMenuI";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 68;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.EstadoMenuI";
Debug.ShouldStop(8);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 70;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.AlturaFilas";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 72;BA.debugLine="Dim lstCF As List";
Debug.ShouldStop(128);
_lstcf = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCF", _lstcf);
 BA.debugLineNum = 73;BA.debugLine="lstCF.initialize";
Debug.ShouldStop(256);
_lstcf.runVoidMethod ("Initialize");
 BA.debugLineNum = 75;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
Debug.ShouldStop(1024);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("cF", _cf);
 BA.debugLineNum = 76;BA.debugLine="cF.Initialize";
Debug.ShouldStop(2048);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 77;BA.debugLine="cF.AliasCampoColumna=\"FechaEstadoEnvio\"";
Debug.ShouldStop(4096);
_cf.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("FechaEstadoEnvio"));
 BA.debugLineNum = 78;BA.debugLine="cF.CellFactoryEnCallBack=False";
Debug.ShouldStop(8192);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="cF.NombreFuncionCellFactory=jamTableViewInfoTrack";
Debug.ShouldStop(16384);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).getField(true,"_cellfactory_columnafecha" /*RemoteObject*/ ));
 BA.debugLineNum = 80;BA.debugLine="lstCF.Add(cF)";
Debug.ShouldStop(32768);
_lstcf.runVoidMethod ("Add",(Object)((_cf)));
 BA.debugLineNum = 82;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
Debug.ShouldStop(131072);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("cF", _cf);
 BA.debugLineNum = 83;BA.debugLine="cF.Initialize";
Debug.ShouldStop(262144);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 84;BA.debugLine="cF.AliasCampoColumna=\"NombreEstadoEnvio\"";
Debug.ShouldStop(524288);
_cf.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("NombreEstadoEnvio"));
 BA.debugLineNum = 85;BA.debugLine="cF.CellFactoryEnCallBack=True";
Debug.ShouldStop(1048576);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 86;BA.debugLine="cF.NombreFuncionCellFactory=\"setFormatoColumnaNom";
Debug.ShouldStop(2097152);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,BA.ObjectToString("setFormatoColumnaNombreEstadoEnvio"));
 BA.debugLineNum = 87;BA.debugLine="lstCF.Add(cF)";
Debug.ShouldStop(4194304);
_lstcf.runVoidMethod ("Add",(Object)((_cf)));
 BA.debugLineNum = 89;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
Debug.ShouldStop(16777216);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("cF", _cf);
 BA.debugLineNum = 90;BA.debugLine="cF.Initialize";
Debug.ShouldStop(33554432);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 91;BA.debugLine="cF.AliasCampoColumna=\"DescripcionEstadoEnvio\"";
Debug.ShouldStop(67108864);
_cf.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("DescripcionEstadoEnvio"));
 BA.debugLineNum = 92;BA.debugLine="cF.CellFactoryEnCallBack=False";
Debug.ShouldStop(134217728);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 93;BA.debugLine="cF.NombreFuncionCellFactory=jamTableViewInfoTrack";
Debug.ShouldStop(268435456);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).getField(true,"_cellfactory_columnawraptext" /*RemoteObject*/ ));
 BA.debugLineNum = 94;BA.debugLine="lstCF.Add(cF)";
Debug.ShouldStop(536870912);
_lstcf.runVoidMethod ("Add",(Object)((_cf)));
 BA.debugLineNum = 96;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
Debug.ShouldStop(-2147483648);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("cF", _cf);
 BA.debugLineNum = 97;BA.debugLine="cF.Initialize";
Debug.ShouldStop(1);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 98;BA.debugLine="cF.AliasCampoColumna=\"NombreCliente\"";
Debug.ShouldStop(2);
_cf.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("NombreCliente"));
 BA.debugLineNum = 99;BA.debugLine="cF.CellFactoryEnCallBack=False";
Debug.ShouldStop(4);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 100;BA.debugLine="cF.NombreFuncionCellFactory=jamTableViewInfoTrack";
Debug.ShouldStop(8);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).getField(true,"_cellfactory_columnawraptext" /*RemoteObject*/ ));
 BA.debugLineNum = 101;BA.debugLine="lstCF.Add(cF)";
Debug.ShouldStop(16);
_lstcf.runVoidMethod ("Add",(Object)((_cf)));
 BA.debugLineNum = 105;BA.debugLine="Dim rSub As ResumableSub=jamTableViewInfoTracking";
Debug.ShouldStop(256);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FasesTrackingExpedicionesPeriodoCorreosExpress.json")),(Object)(_lstcf));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 106;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 107;BA.debugLine="Log(mRes)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","886114372",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 108;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 109;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 110;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 10;
;
 BA.debugLineNum = 111;BA.debugLine="frm.Close";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 112;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 114;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.AddContextM";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitem" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ver trazabilidad envío")),(Object)(RemoteObject.createImmutable("TrazabilidadEnvio")));
 BA.debugLineNum = 115;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.AddContextM";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitem" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ver Documento NAV")),(Object)(RemoteObject.createImmutable("VerDocumentoNAV")));
 BA.debugLineNum = 118;BA.debugLine="lstInfoEnviosFechas.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lstinfoenviosfechas" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 119;BA.debugLine="frm.Show";
Debug.ShouldStop(4194304);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 124;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 126;BA.debugLine="FechasUltimaSemana";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_fechasultimasemana" /*RemoteObject*/ );
 BA.debugLineNum = 127;BA.debugLine="End Sub";
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
public static void  _totaldatosperiodo(RemoteObject __ref,RemoteObject _lsttotalinfoenviosfechas) throws Exception{
try {
		Debug.PushSubsStack("TotalDatosPeriodo (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,483);
if (RapidSub.canDelegate("totaldatosperiodo")) { __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","totaldatosperiodo", __ref, _lsttotalinfoenviosfechas); return;}
ResumableSub_TotalDatosPeriodo rsub = new ResumableSub_TotalDatosPeriodo(null,__ref,_lsttotalinfoenviosfechas);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_TotalDatosPeriodo extends BA.ResumableSub {
public ResumableSub_TotalDatosPeriodo(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref,RemoteObject _lsttotalinfoenviosfechas) {
this.parent = parent;
this.__ref = __ref;
this._lsttotalinfoenviosfechas = _lsttotalinfoenviosfechas;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _lsttotalinfoenviosfechas;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TotalDatosPeriodo (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,483);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("lstTotalInfoEnviosFechas", _lsttotalinfoenviosfechas);
 BA.debugLineNum = 485;BA.debugLine="EliminarEnviosSinRecepcionErroneos";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_eliminarenviossinrecepcionerroneos" /*RemoteObject*/ );
 BA.debugLineNum = 487;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Actualizar";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Actualizar información documentos navision?")),(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 488;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 491;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 492;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 493;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.SetMouseCu";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursorwaitdeshabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 494;BA.debugLine="Wait For(InfoDocsNav) complete (rBool As Boolean";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), __ref.runClassMethod (b4j.docU.cinfoenviosperiodocorreosexpress2.class, "_infodocsnav" /*RemoteObject*/ ));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 495;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.SetMouseCu";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursordefaulthabilitartableview" /*RemoteObject*/ );
 BA.debugLineNum = 496;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 497;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 499;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha act";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha actualizado la informacion de documentos NAV.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 500;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 7;
;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 504;BA.debugLine="Dim rSub As ResumableSub=jamTableViewInfoTracking";
Debug.ShouldStop(8388608);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewinfotrackingenviosperiodo" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_lsttotalinfoenviosfechas.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 505;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), _rsub);
this.state = 23;
return;
case 23:
//C
this.state = 9;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 506;BA.debugLine="lstTotalInfoEnviosFechas.Initialize";
Debug.ShouldStop(33554432);
_lsttotalinfoenviosfechas.runVoidMethod ("Initialize");
 BA.debugLineNum = 507;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 9:
//if
this.state = 19;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 508;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(134217728);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 509;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 510;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 15;
;
 BA.debugLineNum = 511;BA.debugLine="ExitApplication";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 513;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(1);

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 514;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 515;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 519;BA.debugLine="End Sub";
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
public static RemoteObject  _verdocumentonav(RemoteObject __ref,RemoteObject _documentosel) throws Exception{
try {
		Debug.PushSubsStack("VerDocumentoNAV (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,648);
if (RapidSub.canDelegate("verdocumentonav")) { return __ref.runUserSub(false, "cinfoenviosperiodocorreosexpress2","verdocumentonav", __ref, _documentosel);}
ResumableSub_VerDocumentoNAV rsub = new ResumableSub_VerDocumentoNAV(null,__ref,_documentosel);
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
public static class ResumableSub_VerDocumentoNAV extends BA.ResumableSub {
public ResumableSub_VerDocumentoNAV(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,RemoteObject __ref,RemoteObject _documentosel) {
this.parent = parent;
this.__ref = __ref;
this._documentosel = _documentosel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
RemoteObject _documentosel;
RemoteObject _wu = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _flagok = RemoteObject.createImmutable(false);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _t = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _user32 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _hwnd = RemoteObject.declareNull("Object");
RemoteObject _pagnavtipodoc = RemoteObject.createImmutable(0);
RemoteObject _navfilepath = RemoteObject.createImmutable("");
RemoteObject _navhyperlink = RemoteObject.createImmutable("");
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");
RemoteObject _line = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject group6;
int index6;
int groupLen6;
RemoteObject group49;
int index49;
int groupLen49;
int step53;
int limit53;
RemoteObject group61;
int index61;
int groupLen61;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("VerDocumentoNAV (cinfoenviosperiodocorreosexpress2) ","cinfoenviosperiodocorreosexpress2",35,__ref.getField(false, "ba"),__ref,648);
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
Debug.locals.put("DocumentoSel", _documentosel);
 BA.debugLineNum = 652;BA.debugLine="Log(\"Buscando window title \" & DocumentoSel)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","887228420",RemoteObject.concat(RemoteObject.createImmutable("Buscando window title "),_documentosel),0);
 BA.debugLineNum = 654;BA.debugLine="Dim WU As JavaObject";
Debug.ShouldStop(8192);
_wu = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("WU", _wu);
 BA.debugLineNum = 655;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.WindowU";
Debug.ShouldStop(16384);
_wu.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.jna.platform.WindowUtils")));
 BA.debugLineNum = 656;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",Arra";
Debug.ShouldStop(32768);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _wu.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAllWindows")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"False"))}))));Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 657;BA.debugLine="Dim FlagOk As Boolean";
Debug.ShouldStop(65536);
_flagok = RemoteObject.createImmutable(false);Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 658;BA.debugLine="For Each JO As JavaObject In L";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//for
this.state = 8;
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
group6 = _l;
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("JO", _jo);
this.state = 75;
if (true) break;

case 75:
//C
this.state = 8;
if (index6 < groupLen6) {
this.state = 3;
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), group6.runMethod(false,"Get",index6));Debug.locals.put("JO", _jo);}
if (true) break;

case 76:
//C
this.state = 75;
index6++;
Debug.locals.put("JO", _jo);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 659;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Null)";
Debug.ShouldStop(262144);
_t = BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTitle")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 660;BA.debugLine="Log(\"window title\" & t)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","887228428",RemoteObject.concat(RemoteObject.createImmutable("window title"),_t),0);
 BA.debugLineNum = 661;BA.debugLine="If t.Contains(DocumentoSel) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 7;
if (_t.runMethod(true,"contains",(Object)(_documentosel)).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 662;BA.debugLine="FlagOk=True";
Debug.ShouldStop(2097152);
_flagok = parent.__c.getField(true,"True");Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 663;BA.debugLine="Exit";
Debug.ShouldStop(4194304);
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 76;
;
 if (true) break;
if (true) break;
Debug.locals.put("JO", _jo);
;
 BA.debugLineNum = 667;BA.debugLine="If FlagOk Then";
Debug.ShouldStop(67108864);

case 8:
//if
this.state = 21;
if (_flagok.<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 668;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Ya hay una";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ya hay una ventana abierta con el título: "),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTitle")),(Object)((parent.__c.getField(false,"Null")))),parent.__c.getField(true,"CRLF"))),(Object)(BA.ObjectToString("Aviso")),(Object)(BA.ObjectToString("Abrir Nueva")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Abrir Actual")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 669;BA.debugLine="Wait For (msa) Msgbox_Result (RInt As Int)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 77;
return;
case 77:
//C
this.state = 11;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("RInt", _rint);
;
 BA.debugLineNum = 670;BA.debugLine="If RInt=xui.DialogResponse_Cancel Then Return Fa";
Debug.ShouldStop(536870912);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 671;BA.debugLine="If RInt <>xui.DialogResponse_Positive Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 672;BA.debugLine="Dim user32 As JavaObject";
Debug.ShouldStop(-2147483648);
_user32 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("user32", _user32);
 BA.debugLineNum = 673;BA.debugLine="user32 = user32.InitializeStatic(\"com.sun.jna.p";
Debug.ShouldStop(1);
_user32 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _user32.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.jna.platform.win32.User32"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("INSTANCE"))));Debug.locals.put("user32", _user32);
 BA.debugLineNum = 674;BA.debugLine="Dim hwnd As Object = JO.RunMethod(\"getHWND\", Nu";
Debug.ShouldStop(2);
_hwnd = _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getHWND")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("hwnd", _hwnd);Debug.locals.put("hwnd", _hwnd);
 BA.debugLineNum = 675;BA.debugLine="user32.RunMethod(\"SetForegroundWindow\", Array(h";
Debug.ShouldStop(4);
_user32.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("SetForegroundWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_hwnd})));
 BA.debugLineNum = 676;BA.debugLine="user32.RunMethod(\"SetFocus\", Array(hwnd))";
Debug.ShouldStop(8);
_user32.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("SetFocus")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_hwnd})));
 BA.debugLineNum = 677;BA.debugLine="user32.RunMethod(\"ShowWindow\", Array(hwnd, 9))'";
Debug.ShouldStop(16);
_user32.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("ShowWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_hwnd,RemoteObject.createImmutable((9))})));
 BA.debugLineNum = 678;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
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
 BA.debugLineNum = 682;BA.debugLine="Dim  PagNAVTipoDoc As Int";
Debug.ShouldStop(512);
_pagnavtipodoc = RemoteObject.createImmutable(0);Debug.locals.put("PagNAVTipoDoc", _pagnavtipodoc);
 BA.debugLineNum = 683;BA.debugLine="Select True";
Debug.ShouldStop(1024);
if (true) break;

case 22:
//select
this.state = 29;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_documentosel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_documentosel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))))) {
case 0: {
this.state = 24;
if (true) break;
}
case 1: {
this.state = 26;
if (true) break;
}
default: {
this.state = 28;
if (true) break;
}
}
if (true) break;

case 24:
//C
this.state = 29;
 BA.debugLineNum = 685;BA.debugLine="PagNAVTipoDoc=130";
Debug.ShouldStop(4096);
_pagnavtipodoc = BA.numberCast(int.class, 130);Debug.locals.put("PagNAVTipoDoc", _pagnavtipodoc);
 if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 687;BA.debugLine="PagNAVTipoDoc=5745";
Debug.ShouldStop(16384);
_pagnavtipodoc = BA.numberCast(int.class, 5745);Debug.locals.put("PagNAVTipoDoc", _pagnavtipodoc);
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 689;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posi";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Sólo es posible navegar a documentos tipo ALBV o RT.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 690;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 78;
return;
case 78:
//C
this.state = 29;
;
 BA.debugLineNum = 691;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 29:
//C
this.state = 30;
;
 BA.debugLineNum = 694;BA.debugLine="Dim NavFilePath As String=\"C:\\Program Files (x86)";
Debug.ShouldStop(2097152);
_navfilepath = BA.ObjectToString("C:\\Program Files (x86)\\Microsoft Dynamics NAV\\90\\RoleTailored Client\\Microsoft.Dynamics.Nav.Client.exe");Debug.locals.put("NavFilePath", _navfilepath);Debug.locals.put("NavFilePath", _navfilepath);
 BA.debugLineNum = 697;BA.debugLine="Dim NAVHyperlink As String=\"Dynamicsnav://NAVISIO";
Debug.ShouldStop(16777216);
_navhyperlink = RemoteObject.concat(RemoteObject.createImmutable("Dynamicsnav://NAVISION2012:7046/PROIN/PROIN%20PINILLA/runpage?page="),_pagnavtipodoc,RemoteObject.createImmutable("&$filter='No.'%20IS%20"),_documentosel);Debug.locals.put("NAVHyperlink", _navhyperlink);Debug.locals.put("NAVHyperlink", _navhyperlink);
 BA.debugLineNum = 698;BA.debugLine="Log(\"Microsoft.Dynamics.Nav.Client.exe \" & NAVHyp";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","887228466",RemoteObject.concat(RemoteObject.createImmutable("Microsoft.Dynamics.Nav.Client.exe "),_navhyperlink),0);
 BA.debugLineNum = 699;BA.debugLine="Dim shl As Shell";
Debug.ShouldStop(67108864);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 700;BA.debugLine="shl.Initialize(\"shl\",NavFilePath, Array As String";
Debug.ShouldStop(134217728);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(_navfilepath),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_navhyperlink})))));
 BA.debugLineNum = 702;BA.debugLine="Try";
Debug.ShouldStop(536870912);
if (true) break;

case 30:
//try
this.state = 74;
this.catchState = 67;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 67;
 BA.debugLineNum = 703;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(1073741824);
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 704;BA.debugLine="Log(\"try Success\")";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","887228472",RemoteObject.createImmutable("try Success"),0);
 BA.debugLineNum = 705;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolea";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), null);
this.state = 79;
return;
case 79:
//C
this.state = 33;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 706;BA.debugLine="If Success Then";
Debug.ShouldStop(2);
if (true) break;

case 33:
//if
this.state = 65;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 35;
}else {
this.state = 58;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 707;BA.debugLine="For Each line As String In Regex.Split(\"[\\r\\n]+";
Debug.ShouldStop(4);
if (true) break;

case 36:
//for
this.state = 39;
group49 = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("[\\r\\n]+")),(Object)(_stdout));
index49 = 0;
groupLen49 = group49.getField(true,"length").<Integer>get();
Debug.locals.put("line", _line);
this.state = 80;
if (true) break;

case 80:
//C
this.state = 39;
if (index49 < groupLen49) {
this.state = 38;
_line = group49.getArrayElement(true,RemoteObject.createImmutable(index49));Debug.locals.put("line", _line);}
if (true) break;

case 81:
//C
this.state = 80;
index49++;
Debug.locals.put("line", _line);
if (true) break;

case 38:
//C
this.state = 81;
 BA.debugLineNum = 708;BA.debugLine="Log(\"line shell \" & line)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","887228476",RemoteObject.concat(RemoteObject.createImmutable("line shell "),_line),0);
 if (true) break;
if (true) break;

case 39:
//C
this.state = 40;
Debug.locals.put("line", _line);
;
 BA.debugLineNum = 710;BA.debugLine="Dim FlagOk As Boolean";
Debug.ShouldStop(32);
_flagok = RemoteObject.createImmutable(false);Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 711;BA.debugLine="For i=0 To 3 ' intentarlo 3 veces ... por si na";
Debug.ShouldStop(64);
if (true) break;

case 40:
//for
this.state = 56;
step53 = 1;
limit53 = 3;
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 82;
if (true) break;

case 82:
//C
this.state = 56;
if ((step53 > 0 && _i <= limit53) || (step53 < 0 && _i >= limit53)) this.state = 42;
if (true) break;

case 83:
//C
this.state = 82;
_i = ((int)(0 + _i + step53)) ;
Debug.locals.put("i", _i);
if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 712;BA.debugLine="Sleep(1000) ' dar tiempo a que la ventana se a";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"),BA.numberCast(int.class, 1000));
this.state = 84;
return;
case 84:
//C
this.state = 43;
;
 BA.debugLineNum = 713;BA.debugLine="Log(\"Buscando window title \" & DocumentoSel)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","887228481",RemoteObject.concat(RemoteObject.createImmutable("Buscando window title "),_documentosel),0);
 BA.debugLineNum = 714;BA.debugLine="Dim WU As JavaObject";
Debug.ShouldStop(512);
_wu = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("WU", _wu);
 BA.debugLineNum = 715;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.Wind";
Debug.ShouldStop(1024);
_wu.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.jna.platform.WindowUtils")));
 BA.debugLineNum = 716;BA.debugLine="Dim user32 As JavaObject";
Debug.ShouldStop(2048);
_user32 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("user32", _user32);
 BA.debugLineNum = 717;BA.debugLine="user32 = user32.InitializeStatic(\"com.sun.jna.";
Debug.ShouldStop(4096);
_user32 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _user32.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.jna.platform.win32.User32"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("INSTANCE"))));Debug.locals.put("user32", _user32);
 BA.debugLineNum = 718;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",A";
Debug.ShouldStop(8192);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _wu.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAllWindows")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"False"))}))));Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 719;BA.debugLine="For Each JO As JavaObject In L";
Debug.ShouldStop(16384);
if (true) break;

case 43:
//for
this.state = 50;
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
group61 = _l;
index61 = 0;
groupLen61 = group61.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("JO", _jo);
this.state = 85;
if (true) break;

case 85:
//C
this.state = 50;
if (index61 < groupLen61) {
this.state = 45;
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), group61.runMethod(false,"Get",index61));Debug.locals.put("JO", _jo);}
if (true) break;

case 86:
//C
this.state = 85;
index61++;
Debug.locals.put("JO", _jo);
if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 720;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Nul";
Debug.ShouldStop(32768);
_t = BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTitle")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 721;BA.debugLine="Log(\"window title\" & t)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","887228489",RemoteObject.concat(RemoteObject.createImmutable("window title"),_t),0);
 BA.debugLineNum = 722;BA.debugLine="If t.Contains(DocumentoSel) Then";
Debug.ShouldStop(131072);
if (true) break;

case 46:
//if
this.state = 49;
if (_t.runMethod(true,"contains",(Object)(_documentosel)).<Boolean>get().booleanValue()) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 723;BA.debugLine="Dim hwnd As Object = JO.RunMethod(\"getHWND\",";
Debug.ShouldStop(262144);
_hwnd = _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getHWND")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("hwnd", _hwnd);Debug.locals.put("hwnd", _hwnd);
 BA.debugLineNum = 724;BA.debugLine="user32.RunMethod(\"SetForegroundWindow\", Arra";
Debug.ShouldStop(524288);
_user32.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("SetForegroundWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_hwnd})));
 BA.debugLineNum = 725;BA.debugLine="user32.RunMethod(\"SetFocus\", Array(hwnd))";
Debug.ShouldStop(1048576);
_user32.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("SetFocus")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_hwnd})));
 BA.debugLineNum = 726;BA.debugLine="user32.RunMethod(\"ShowWindow\", Array(hwnd, 9";
Debug.ShouldStop(2097152);
_user32.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("ShowWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_hwnd,RemoteObject.createImmutable((9))})));
 BA.debugLineNum = 727;BA.debugLine="FlagOk=True";
Debug.ShouldStop(4194304);
_flagok = parent.__c.getField(true,"True");Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 728;BA.debugLine="Exit";
Debug.ShouldStop(8388608);
this.state = 50;
if (true) break;
 if (true) break;

case 49:
//C
this.state = 86;
;
 if (true) break;
if (true) break;
Debug.locals.put("JO", _jo);
;
 BA.debugLineNum = 731;BA.debugLine="If FlagOk Then Exit";
Debug.ShouldStop(67108864);

case 50:
//if
this.state = 55;
if (_flagok.<Boolean>get().booleanValue()) { 
this.state = 52;
;}if (true) break;

case 52:
//C
this.state = 55;
this.state = 56;
if (true) break;
if (true) break;

case 55:
//C
this.state = 83;
;
 if (true) break;
if (true) break;

case 56:
//C
this.state = 65;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 733;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 735;BA.debugLine="If StdErr.Contains(shl.WorkingDirectory) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 59:
//if
this.state = 64;
if (_stderr.runMethod(true,"contains",(Object)(_shl.runMethod(true,"getWorkingDirectory"))).<Boolean>get().booleanValue()) { 
this.state = 61;
}else {
this.state = 63;
}if (true) break;

case 61:
//C
this.state = 64;
 BA.debugLineNum = 736;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La aplicaci";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La aplicación NAVISION no está instalada en el directorio predeterminado.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 737;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 87;
return;
case 87:
//C
this.state = 64;
;
 if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 739;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(StdErr,\"Erro";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_stderr),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 740;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 88;
return;
case 88:
//C
this.state = 64;
;
 if (true) break;

case 64:
//C
this.state = 65;
;
 BA.debugLineNum = 742;BA.debugLine="Return False";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 65:
//C
this.state = 74;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 67:
//C
this.state = 68;
this.catchState = 0;
 BA.debugLineNum = 746;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","887228514",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 747;BA.debugLine="If LastException.Message.Contains(shl.WorkingDir";
Debug.ShouldStop(1024);
if (true) break;

case 68:
//if
this.state = 73;
if (parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage").runMethod(true,"contains",(Object)(_shl.runMethod(true,"getWorkingDirectory"))).<Boolean>get().booleanValue()) { 
this.state = 70;
}else {
this.state = 72;
}if (true) break;

case 70:
//C
this.state = 73;
 BA.debugLineNum = 748;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La aplicació";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La aplicación NAVISION no está instalada en el directorio predeterminado.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 749;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 89;
return;
case 89:
//C
this.state = 73;
;
 if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 751;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(LastException";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 752;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 90;
return;
case 90:
//C
this.state = 73;
;
 if (true) break;

case 73:
//C
this.state = 74;
;
 BA.debugLineNum = 754;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 74:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 757;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static void  _shl_processcompleted(RemoteObject __ref,RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
}
}