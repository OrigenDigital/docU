package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cexpedicionesnoentregadasdhl_subs_0 {


public static RemoteObject  _actualizardatostabla(RemoteObject __ref,RemoteObject _lstdatos) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosTabla (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,529);
if (RapidSub.canDelegate("actualizardatostabla")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","actualizardatostabla", __ref, _lstdatos);}
ResumableSub_ActualizarDatosTabla rsub = new ResumableSub_ActualizarDatosTabla(null,__ref,_lstdatos);
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
public static class ResumableSub_ActualizarDatosTabla extends BA.ResumableSub {
public ResumableSub_ActualizarDatosTabla(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref,RemoteObject _lstdatos) {
this.parent = parent;
this.__ref = __ref;
this._lstdatos = _lstdatos;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _lstdatos;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosTabla (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,529);
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
Debug.locals.put("lstDatos", _lstdatos);
 BA.debugLineNum = 530;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblExpedicionesIncidenciasDHL")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 533;BA.debugLine="Dim rSub As ResumableSub=jamTableViewExpediciones";
Debug.ShouldStop(1048576);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 534;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "actualizardatostabla"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 1;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 535;BA.debugLine="lstDatos.Initialize";
Debug.ShouldStop(4194304);
_lstdatos.runVoidMethod ("Initialize");
 BA.debugLineNum = 536;BA.debugLine="rs.Close";
Debug.ShouldStop(8388608);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 537;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 11;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 538;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 539;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 540;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "actualizardatostabla"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 7;
;
 if (true) break;
;
 BA.debugLineNum = 542;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(536870912);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 543;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 544;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "actualizardatostabla"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 10;
;
 BA.debugLineNum = 545;BA.debugLine="ExitApplication";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 548;BA.debugLine="Return Null";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 549;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mresultsetdata) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizarinfoexpediciondhl(RemoteObject __ref,RemoteObject _iddatobuscado) throws Exception{
try {
		Debug.PushSubsStack("ActualizarInfoExpedicionDHL (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,758);
if (RapidSub.canDelegate("actualizarinfoexpediciondhl")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","actualizarinfoexpediciondhl", __ref, _iddatobuscado);}
ResumableSub_ActualizarInfoExpedicionDHL rsub = new ResumableSub_ActualizarInfoExpedicionDHL(null,__ref,_iddatobuscado);
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
public static class ResumableSub_ActualizarInfoExpedicionDHL extends BA.ResumableSub {
public ResumableSub_ActualizarInfoExpedicionDHL(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref,RemoteObject _iddatobuscado) {
this.parent = parent;
this.__ref = __ref;
this._iddatobuscado = _iddatobuscado;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _iddatobuscado;
RemoteObject _acciontracking = RemoteObject.createImmutable("");
RemoteObject _lstresultadotracking = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sresponse = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _mrestrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _timeformatant = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sfechahora = RemoteObject.createImmutable("");
RemoteObject _fh = null;
RemoteObject _lfechahora = RemoteObject.createImmutable(0L);
RemoteObject group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarInfoExpedicionDHL (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,758);
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
Debug.locals.put("IDDatoBuscado", _iddatobuscado);
 BA.debugLineNum = 759;BA.debugLine="Dim AccionTracking As String";
Debug.ShouldStop(4194304);
_acciontracking = RemoteObject.createImmutable("");Debug.locals.put("AccionTracking", _acciontracking);
 BA.debugLineNum = 760;BA.debugLine="Dim lstResultadoTracking As List";
Debug.ShouldStop(8388608);
_lstresultadotracking = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstResultadoTracking", _lstresultadotracking);
 BA.debugLineNum = 761;BA.debugLine="lstResultadoTracking.Initialize";
Debug.ShouldStop(16777216);
_lstresultadotracking.runVoidMethod ("Initialize");
 BA.debugLineNum = 784;BA.debugLine="Wait For (EnvioDatosWebServiceDHL(IDDatoBuscado,a";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "actualizarinfoexpediciondhl"), __ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_enviodatoswebservicedhl" /*RemoteObject*/ ,(Object)(_iddatobuscado),(Object)(__ref.getField(true,"_accesstoken" /*RemoteObject*/ ))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_sresponse = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResponse", _sresponse);
;
 BA.debugLineNum = 786;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 10;
if (_sresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR HTTPJob"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 787;BA.debugLine="AccionTracking=\"ErrorWS\"";
Debug.ShouldStop(262144);
_acciontracking = BA.ObjectToString("ErrorWS");Debug.locals.put("AccionTracking", _acciontracking);
 BA.debugLineNum = 788;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ha fallado la llamada al web service de DHL."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresponse)),(Object)(RemoteObject.createImmutable("Error de comunicación")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 789;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "actualizarinfoexpediciondhl"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 790;BA.debugLine="Dim mResTrack As Map";
Debug.ShouldStop(2097152);
_mrestrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mResTrack", _mrestrack);
 BA.debugLineNum = 791;BA.debugLine="mResTrack.Initialize";
Debug.ShouldStop(4194304);
_mrestrack.runVoidMethod ("Initialize");
 BA.debugLineNum = 792;BA.debugLine="mResTrack.Put(\"AccionTracking\",AccionTracking)";
Debug.ShouldStop(8388608);
_mrestrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AccionTracking"))),(Object)((_acciontracking)));
 BA.debugLineNum = 793;BA.debugLine="Return mResTrack";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mrestrack));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 796;BA.debugLine="Log(sResponse)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","863569958",_sresponse,0);
 BA.debugLineNum = 797;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(268435456);
_jp = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 798;BA.debugLine="jp.Initialize(sResponse)";
Debug.ShouldStop(536870912);
_jp.runVoidMethod ("Initialize",(Object)(_sresponse));
 BA.debugLineNum = 799;BA.debugLine="lstResultadoTracking=jp.NextArray";
Debug.ShouldStop(1073741824);
_lstresultadotracking = _jp.runMethod(false,"NextArray");Debug.locals.put("lstResultadoTracking", _lstresultadotracking);
 BA.debugLineNum = 806;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(32);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 807;BA.debugLine="Dim TimeFormatAnt As String=DateTime.TimeFormat";
Debug.ShouldStop(64);
_timeformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("TimeFormatAnt", _timeformatant);Debug.locals.put("TimeFormatAnt", _timeformatant);
 BA.debugLineNum = 811;BA.debugLine="For Each m As Map In lstResultadoTracking";
Debug.ShouldStop(1024);
if (true) break;

case 6:
//for
this.state = 9;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group20 = _lstresultadotracking;
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 9;
if (index20 < groupLen20) {
this.state = 8;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group20.runMethod(false,"Get",index20));Debug.locals.put("m", _m);}
if (true) break;

case 14:
//C
this.state = 13;
index20++;
Debug.locals.put("m", _m);
if (true) break;

case 8:
//C
this.state = 14;
 BA.debugLineNum = 812;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ss\"";
Debug.ShouldStop(2048);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd'T'HH:mm:ss"));
 BA.debugLineNum = 813;BA.debugLine="Log(\"m recibido\" & m)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","863569975",RemoteObject.concat(RemoteObject.createImmutable("m recibido"),_m),0);
 BA.debugLineNum = 814;BA.debugLine="Dim sFechaHora As String=m.Get(\"DateTime\")";
Debug.ShouldStop(8192);
_sfechahora = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DateTime")))));Debug.locals.put("sFechaHora", _sfechahora);Debug.locals.put("sFechaHora", _sfechahora);
 BA.debugLineNum = 815;BA.debugLine="sFechaHora=sFechaHora.Replace(\"T\",\" \")";
Debug.ShouldStop(16384);
_sfechahora = _sfechahora.runMethod(true,"replace",(Object)(BA.ObjectToString("T")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("sFechaHora", _sfechahora);
 BA.debugLineNum = 816;BA.debugLine="Dim Fh() As String=Regex.Split(\" \",sFechaHora)";
Debug.ShouldStop(32768);
_fh = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_sfechahora));Debug.locals.put("Fh", _fh);Debug.locals.put("Fh", _fh);
 BA.debugLineNum = 817;BA.debugLine="Dim lFechaHora As Long=DateTime.DateParse(m.Get";
Debug.ShouldStop(65536);
_lfechahora = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DateTime")))))));Debug.locals.put("lFechaHora", _lfechahora);Debug.locals.put("lFechaHora", _lfechahora);
 BA.debugLineNum = 818;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(131072);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 819;BA.debugLine="sFechaHora=DateTime.Date(lFechaHora) & \" \" & Fh";
Debug.ShouldStop(262144);
_sfechahora = RemoteObject.concat(parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lfechahora)),RemoteObject.createImmutable(" "),_fh.getArrayElement(true,BA.numberCast(int.class, 1)));Debug.locals.put("sFechaHora", _sfechahora);
 BA.debugLineNum = 820;BA.debugLine="Log(\"m modificado \" & m)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","863569982",RemoteObject.concat(RemoteObject.createImmutable("m modificado "),_m),0);
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 822;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(2097152);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 823;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
Debug.ShouldStop(4194304);
parent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_timeformatant);
 BA.debugLineNum = 825;BA.debugLine="Dim mResTrack As Map";
Debug.ShouldStop(16777216);
_mrestrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mResTrack", _mrestrack);
 BA.debugLineNum = 826;BA.debugLine="mResTrack.Initialize";
Debug.ShouldStop(33554432);
_mrestrack.runVoidMethod ("Initialize");
 BA.debugLineNum = 827;BA.debugLine="mResTrack.Put(\"AccionTracking\",AccionTracking)";
Debug.ShouldStop(67108864);
_mrestrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AccionTracking"))),(Object)((_acciontracking)));
 BA.debugLineNum = 828;BA.debugLine="mResTrack.Put(\"lstResultadoTracking\",lstResultad";
Debug.ShouldStop(134217728);
_mrestrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstResultadoTracking"))),(Object)((_lstresultadotracking.getObject())));
 BA.debugLineNum = 829;BA.debugLine="Return mResTrack";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mrestrack));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 832;BA.debugLine="End Sub";
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
public static RemoteObject  _asjo(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("asJO (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 115;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="Return o";
Debug.ShouldStop(524288);
if (true) return _o;
 BA.debugLineNum = 117;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btnSalir_Click (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,496);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","btnsalir_click", __ref);}
 BA.debugLineNum = 496;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 497;BA.debugLine="SalirModulo";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 498;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargacredenciales(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaCredenciales (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,714);
if (RapidSub.canDelegate("cargacredenciales")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","cargacredenciales", __ref);}
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
public ResumableSub_CargaCredenciales(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstresws = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdatosws = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCredenciales (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,714);
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
 BA.debugLineNum = 716;BA.debugLine="Wait For(CargaDatosWebServiceTransporte(1)) compl";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "cargacredenciales"), __ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_cargadatoswebservicetransporte" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 717;BA.debugLine="Dim accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("accion", _accion);Debug.locals.put("accion", _accion);
 BA.debugLineNum = 718;BA.debugLine="If accion=\"NOK\" Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 719;BA.debugLine="Return \"Error carga credenciales\"";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Error carga credenciales")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 721;BA.debugLine="Dim lstResWS As List=mRes.Get(\"lstRes\")";
Debug.ShouldStop(65536);
_lstresws = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstresws = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstResWS", _lstresws);Debug.locals.put("lstResWS", _lstresws);
 BA.debugLineNum = 722;BA.debugLine="Dim mDatosWS As Map=lstResWS.Get(0)";
Debug.ShouldStop(131072);
_mdatosws = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdatosws = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstresws.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mDatosWS", _mdatosws);Debug.locals.put("mDatosWS", _mdatosws);
 BA.debugLineNum = 724;BA.debugLine="UsuarioWS=mDatosWS.get(\"UsuarioWS\")";
Debug.ShouldStop(524288);
__ref.setField ("_usuariows" /*RemoteObject*/ ,BA.ObjectToString(_mdatosws.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UsuarioWS"))))));
 BA.debugLineNum = 725;BA.debugLine="PasswordWs=mDatosWS.get(\"PasswordWS\")";
Debug.ShouldStop(1048576);
__ref.setField ("_passwordws" /*RemoteObject*/ ,BA.ObjectToString(_mdatosws.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PasswordWS"))))));
 BA.debugLineNum = 726;BA.debugLine="If UsuarioWS=\"\" Or PasswordWs=\"\" Then";
Debug.ShouldStop(2097152);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_usuariows" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_passwordws" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 727;BA.debugLine="Return \"Error carga credenciales\"";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Error carga credenciales")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 729;BA.debugLine="Return \"OK\"";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("OK")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 731;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _cargadatoswebservicetransporte(RemoteObject __ref,RemoteObject _idtransportista) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,733);
if (RapidSub.canDelegate("cargadatoswebservicetransporte")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","cargadatoswebservicetransporte", __ref, _idtransportista);}
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
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref,RemoteObject _idtransportista) {
this.parent = parent;
this.__ref = __ref;
this._idtransportista = _idtransportista;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _idtransportista;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comandojrdc = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,733);
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
 BA.debugLineNum = 735;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1073741824);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 736;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(-2147483648);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 737;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 738;BA.debugLine="Dim ComandoJRDC As String";
Debug.ShouldStop(2);
_comandojrdc = RemoteObject.createImmutable("");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 739;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
Debug.ShouldStop(4);
_comandojrdc = BA.ObjectToString("DatosWebServiceTransporte");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 740;BA.debugLine="JRDCQuery.DatosJRDC(\"http://192.168.10.20:17179/r";
Debug.ShouldStop(8);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(BA.ObjectToString("http://192.168.10.20:17179/rdc")),(Object)(_comandojrdc),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idtransportista)}))),(Object)(__ref));
 BA.debugLineNum = 741;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 742;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 743;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 745;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 746;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 748;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
Debug.ShouldStop(2048);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 749;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 750;BA.debugLine="mRes.Put(\"lstRes\",lstRes)";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstres.getObject())));
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
 BA.debugLineNum = 753;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 754;BA.debugLine="Return mRes";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 755;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _cargatokewebservicedhl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaTokeWebServiceDHL (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,872);
if (RapidSub.canDelegate("cargatokewebservicedhl")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","cargatokewebservicedhl", __ref);}
ResumableSub_CargaTokeWebServiceDHL rsub = new ResumableSub_CargaTokeWebServiceDHL(null,__ref);
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
public static class ResumableSub_CargaTokeWebServiceDHL extends BA.ResumableSub {
public ResumableSub_CargaTokeWebServiceDHL(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _cookie = RemoteObject.createImmutable("");
RemoteObject _lstheaders = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lsttoken = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _datoscsv = null;
RemoteObject _expiration = RemoteObject.createImmutable(0L);
RemoteObject _mjobresponse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresponse = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaTokeWebServiceDHL (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,872);
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
 BA.debugLineNum = 874;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(512);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 876;BA.debugLine="accessToken=\"\"";
Debug.ShouldStop(2048);
__ref.setField ("_accesstoken" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 877;BA.debugLine="Dim Cookie As String";
Debug.ShouldStop(4096);
_cookie = RemoteObject.createImmutable("");Debug.locals.put("Cookie", _cookie);
 BA.debugLineNum = 878;BA.debugLine="Dim lstHeaders As List";
Debug.ShouldStop(8192);
_lstheaders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstHeaders", _lstheaders);
 BA.debugLineNum = 879;BA.debugLine="lstHeaders.Initialize";
Debug.ShouldStop(16384);
_lstheaders.runVoidMethod ("Initialize");
 BA.debugLineNum = 880;BA.debugLine="lstHeaders.Add(Array As String(\"Expiration\",\"Toke";
Debug.ShouldStop(32768);
_lstheaders.runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("Expiration"),BA.ObjectToString("Token"),RemoteObject.createImmutable("Cookie")}))));
 BA.debugLineNum = 881;BA.debugLine="If File.Exists(Main.UserTempFolder,\"info.csv\") Th";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 10;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._main._usertempfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("info.csv"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 883;BA.debugLine="Dim lstToken As List=su.LoadCSV2(Main.UserTempFo";
Debug.ShouldStop(262144);
_lsttoken = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lsttoken = _su.runMethod(false,"LoadCSV2",(Object)(parent._main._usertempfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("info.csv")),(Object)(BA.ObjectToChar(",")),(Object)(_lstheaders));Debug.locals.put("lstToken", _lsttoken);Debug.locals.put("lstToken", _lsttoken);
 BA.debugLineNum = 884;BA.debugLine="Dim DatosCSV() As String=lstToken.Get(0)";
Debug.ShouldStop(524288);
_datoscsv = (_lsttoken.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("DatosCSV", _datoscsv);Debug.locals.put("DatosCSV", _datoscsv);
 BA.debugLineNum = 885;BA.debugLine="Dim Expiration As Long=DatosCSV(0)";
Debug.ShouldStop(1048576);
_expiration = BA.numberCast(long.class, _datoscsv.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("Expiration", _expiration);Debug.locals.put("Expiration", _expiration);
 BA.debugLineNum = 886;BA.debugLine="If DateTime.Now<Expiration Then";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("<",parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_expiration)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 887;BA.debugLine="accessToken=DatosCSV(1)";
Debug.ShouldStop(4194304);
__ref.setField ("_accesstoken" /*RemoteObject*/ ,_datoscsv.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 888;BA.debugLine="Cookie=DatosCSV(2)";
Debug.ShouldStop(8388608);
_cookie = _datoscsv.getArrayElement(true,BA.numberCast(int.class, 2));Debug.locals.put("Cookie", _cookie);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 890;BA.debugLine="File.Delete(Main.UserTempFolder,\"info.csv\")";
Debug.ShouldStop(33554432);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._main._usertempfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("info.csv")));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;
;
 BA.debugLineNum = 894;BA.debugLine="If accessToken=\"\" Then";
Debug.ShouldStop(536870912);

case 10:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_accesstoken" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 896;BA.debugLine="Wait For(ObtenerTokensWebServiceDHL(UsuarioWS,Pa";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "cargatokewebservicedhl"), __ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_obtenertokenswebservicedhl" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_usuariows" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_passwordws" /*RemoteObject*/ ))));
this.state = 20;
return;
case 20:
//C
this.state = 13;
_mjobresponse = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mJobResponse", _mjobresponse);
;
 BA.debugLineNum = 899;BA.debugLine="Dim sResponse As String=mJobResponse.Get(\"sRespu";
Debug.ShouldStop(4);
_sresponse = BA.ObjectToString(_mjobresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sRespuestaWebService")))));Debug.locals.put("sResponse", _sresponse);Debug.locals.put("sResponse", _sresponse);
 BA.debugLineNum = 900;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
Debug.ShouldStop(8);
if (true) break;

case 13:
//if
this.state = 18;
if (_sresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR HTTPJob"))).<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 902;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ha fallado la llamada al web  service de DHL"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("El error puede estar en el servidor de DHL, o en la conexion a internet. Inténtalo más tarde."))),(Object)(RemoteObject.createImmutable("Error de comunicación")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 904;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "cargatokewebservicedhl"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 18;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 905;BA.debugLine="Return \"ErrorWS\"";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("ErrorWS")));return;};
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 907;BA.debugLine="Dim Cookie As String=mJobResponse.Get(\"Cookie\")";
Debug.ShouldStop(1024);
_cookie = BA.ObjectToString(_mjobresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cookie")))));Debug.locals.put("Cookie", _cookie);Debug.locals.put("Cookie", _cookie);
 BA.debugLineNum = 908;BA.debugLine="Log(\"Cookie \" & Cookie)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","863701028",RemoteObject.concat(RemoteObject.createImmutable("Cookie "),_cookie),0);
 BA.debugLineNum = 910;BA.debugLine="accessToken=mJobResponse.Get(\"Token\")";
Debug.ShouldStop(8192);
__ref.setField ("_accesstoken" /*RemoteObject*/ ,BA.ObjectToString(_mjobresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Token"))))));
 BA.debugLineNum = 911;BA.debugLine="Log(\"accessToken \" & accessToken)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","863701031",RemoteObject.concat(RemoteObject.createImmutable("accessToken "),__ref.getField(true,"_accesstoken" /*RemoteObject*/ )),0);
 BA.debugLineNum = 914;BA.debugLine="Dim Expiration As Long=DateTime.Now+(DateTime.T";
Debug.ShouldStop(131072);
_expiration = RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),(parent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")),RemoteObject.createImmutable(20)}, "+*",1, 2);Debug.locals.put("Expiration", _expiration);Debug.locals.put("Expiration", _expiration);
 BA.debugLineNum = 915;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(262144);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 916;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(524288);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 917;BA.debugLine="lstRegistros.Add(Array As String(Expiration,acc";
Debug.ShouldStop(1048576);
_lstregistros.runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.NumberToString(_expiration),__ref.getField(true,"_accesstoken" /*RemoteObject*/ ),_cookie}))));
 BA.debugLineNum = 918;BA.debugLine="su.SaveCSV2(Main.UserTempFolder,\"info.csv\",\",\",";
Debug.ShouldStop(2097152);
_su.runVoidMethod ("SaveCSV2",(Object)(parent._main._usertempfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("info.csv")),(Object)(BA.ObjectToChar(",")),(Object)(_lstregistros),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("Expiration"),BA.ObjectToString("Token"),RemoteObject.createImmutable("Cookie")})))));
 BA.debugLineNum = 919;BA.debugLine="Return \"OK\"";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("OK")));return;};
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
 BA.debugLineNum = 923;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
cexpedicionesnoentregadasdhl._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cexpedicionesnoentregadasdhl._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
cexpedicionesnoentregadasdhl._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cexpedicionesnoentregadasdhl._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private frm As Form";
cexpedicionesnoentregadasdhl._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cexpedicionesnoentregadasdhl._frm);
 //BA.debugLineNum = 7;BA.debugLine="Private sFtpDHL As SFtp";
cexpedicionesnoentregadasdhl._sftpdhl = RemoteObject.createNew ("anywheresoftware.b4a.objects.SFtpWrapper");__ref.setField("_sftpdhl",cexpedicionesnoentregadasdhl._sftpdhl);
 //BA.debugLineNum = 11;BA.debugLine="Private NombreUltimoFichero As String";
cexpedicionesnoentregadasdhl._nombreultimofichero = RemoteObject.createImmutable("");__ref.setField("_nombreultimofichero",cexpedicionesnoentregadasdhl._nombreultimofichero);
 //BA.debugLineNum = 12;BA.debugLine="Private btnSalir As Button";
cexpedicionesnoentregadasdhl._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",cexpedicionesnoentregadasdhl._btnsalir);
 //BA.debugLineNum = 13;BA.debugLine="Private jamTableViewExpedicionesNoEntregadas As j";
cexpedicionesnoentregadasdhl._jamtableviewexpedicionesnoentregadas = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewexpedicionesnoentregadas",cexpedicionesnoentregadasdhl._jamtableviewexpedicionesnoentregadas);
 //BA.debugLineNum = 15;BA.debugLine="Dim Dialog As B4XDialog";
cexpedicionesnoentregadasdhl._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cexpedicionesnoentregadasdhl._dialog);
 //BA.debugLineNum = 16;BA.debugLine="Dim mSQL As SQL";
cexpedicionesnoentregadasdhl._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cexpedicionesnoentregadasdhl._msql);
 //BA.debugLineNum = 18;BA.debugLine="Private UsuarioWS As String";
cexpedicionesnoentregadasdhl._usuariows = RemoteObject.createImmutable("");__ref.setField("_usuariows",cexpedicionesnoentregadasdhl._usuariows);
 //BA.debugLineNum = 19;BA.debugLine="Private PasswordWs As String";
cexpedicionesnoentregadasdhl._passwordws = RemoteObject.createImmutable("");__ref.setField("_passwordws",cexpedicionesnoentregadasdhl._passwordws);
 //BA.debugLineNum = 20;BA.debugLine="Private accessToken As String";
cexpedicionesnoentregadasdhl._accesstoken = RemoteObject.createImmutable("");__ref.setField("_accesstoken",cexpedicionesnoentregadasdhl._accesstoken);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,475);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 475;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 476;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(134217728);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cexpedicionesnoentregadasdhl.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblExpedicionesIncidenciasDHL")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 477;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 478;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblExpedicionesInc";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblExpedicionesIncidenciasDHL")));
 };
 BA.debugLineNum = 480;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(-2147483648);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 481;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 482;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblExpedicionesIncidenciasDHL (")));
 BA.debugLineNum = 485;BA.debugLine="sbCrearTabla.Append(\"NumExpedicion TEXT COLLATE N";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NumExpedicion TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 486;BA.debugLine="sbCrearTabla.Append(\"Referencia TEXT COLLATE NOCA";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Referencia TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 487;BA.debugLine="sbCrearTabla.Append(\"DescripcionSituacion TEXT CO";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DescripcionSituacion TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 488;BA.debugLine="sbCrearTabla.Append(\"Fecha TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fecha TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 489;BA.debugLine="sbCrearTabla.Append(\"Hora TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Hora TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 490;BA.debugLine="sbCrearTabla.Append(\"Observaciones TEXT COLLATE N";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Observaciones TEXT COLLATE NOCASE)")));
 BA.debugLineNum = 492;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 494;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _datosdocumentosexpediciondhl(RemoteObject __ref,RemoteObject _numexp) throws Exception{
try {
		Debug.PushSubsStack("DatosDocumentosExpedicionDHL (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,585);
if (RapidSub.canDelegate("datosdocumentosexpediciondhl")) { __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","datosdocumentosexpediciondhl", __ref, _numexp); return;}
ResumableSub_DatosDocumentosExpedicionDHL rsub = new ResumableSub_DatosDocumentosExpedicionDHL(null,__ref,_numexp);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DatosDocumentosExpedicionDHL extends BA.ResumableSub {
public ResumableSub_DatosDocumentosExpedicionDHL(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref,RemoteObject _numexp) {
this.parent = parent;
this.__ref = __ref;
this._numexp = _numexp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _numexp;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _docexp = RemoteObject.createImmutable("");
RemoteObject _fecha = RemoteObject.createImmutable(0L);
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
int _i = 0;
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _docsel = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject group7;
int index7;
int groupLen7;
int step33;
int limit33;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DatosDocumentosExpedicionDHL (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,585);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("NumExp", _numexp);
 BA.debugLineNum = 586;BA.debugLine="Wait For(DocumentosExpedicionDHLNoWebService(NumE";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "datosdocumentosexpediciondhl"), __ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_documentosexpediciondhlnowebservice" /*RemoteObject*/ ,(Object)(_numexp)));
this.state = 47;
return;
case 47:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 587;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 588;BA.debugLine="If Accion<>\"OK\" Then Return";
Debug.ShouldStop(2048);
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
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 589;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(4096);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 592;BA.debugLine="Dim lstOpciones As List";
Debug.ShouldStop(32768);
_lstopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstOpciones", _lstopciones);
 BA.debugLineNum = 593;BA.debugLine="lstOpciones.Initialize";
Debug.ShouldStop(65536);
_lstopciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 595;BA.debugLine="For Each mData As Map In lstReg";
Debug.ShouldStop(262144);
if (true) break;

case 7:
//for
this.state = 22;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group7 = _lstreg;
index7 = 0;
groupLen7 = group7.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 48;
if (true) break;

case 48:
//C
this.state = 22;
if (index7 < groupLen7) {
this.state = 9;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group7.runMethod(false,"Get",index7));Debug.locals.put("mData", _mdata);}
if (true) break;

case 49:
//C
this.state = 48;
index7++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 596;BA.debugLine="Dim DocExp As String=mData.Get(\"Documento\")";
Debug.ShouldStop(524288);
_docexp = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocExp", _docexp);Debug.locals.put("DocExp", _docexp);
 BA.debugLineNum = 597;BA.debugLine="Dim Fecha As Long=mData.Get(\"FechaHoraMov\")";
Debug.ShouldStop(1048576);
_fecha = BA.numberCast(long.class, _mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaHoraMov")))));Debug.locals.put("Fecha", _fecha);Debug.locals.put("Fecha", _fecha);
 BA.debugLineNum = 598;BA.debugLine="If DateTime.GetYear(Fecha)=DateTime.GetYear(Date";
Debug.ShouldStop(2097152);
if (true) break;

case 10:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_fecha)),BA.numberCast(double.class, parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 599;BA.debugLine="If DocExp<>\"\" Then";
Debug.ShouldStop(4194304);
if (true) break;

case 13:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",_docexp,BA.ObjectToString(""))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 600;BA.debugLine="If lstOpciones.IndexOf(DocExp)=-1 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_lstopciones.runMethod(true,"IndexOf",(Object)((_docexp))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 601;BA.debugLine="lstOpciones.Add(mData.Get(\"Documento\"))";
Debug.ShouldStop(16777216);
_lstopciones.runVoidMethod ("Add",(Object)(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))));
 if (true) break;

case 19:
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
this.state = 49;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 610;BA.debugLine="Dialog.Title=\"Selecciona Documento NAV\"";
Debug.ShouldStop(2);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Documento NAV")));
 BA.debugLineNum = 611;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(4);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 612;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(8);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 613;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(16);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 614;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(32);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 615;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(64);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 617;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
Debug.ShouldStop(256);
parent._utilidades.runVoidMethod ("_setlightthemedialog" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 618;BA.debugLine="Utilidades.SetLightThemeList(B4XListDlg)";
Debug.ShouldStop(512);
parent._utilidades.runVoidMethod ("_setlightthemelist" /*RemoteObject*/ ,(Object)(_b4xlistdlg));
 BA.debugLineNum = 621;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(4096);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 622;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(8192);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 623;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
Debug.ShouldStop(16384);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 625;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(65536);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 626;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(131072);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 630;BA.debugLine="B4XListDlg.Options=lstOpciones";
Debug.ShouldStop(2097152);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstopciones);
 BA.debugLineNum = 634;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(33554432);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 636;BA.debugLine="For i=0 To lstOpciones.size-1";
Debug.ShouldStop(134217728);
if (true) break;

case 23:
//for
this.state = 26;
step33 = 1;
limit33 = RemoteObject.solve(new RemoteObject[] {_lstopciones.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 50;
if (true) break;

case 50:
//C
this.state = 26;
if ((step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33)) this.state = 25;
if (true) break;

case 51:
//C
this.state = 50;
_i = ((int)(0 + _i + step33)) ;
Debug.locals.put("i", _i);
if (true) break;

case 25:
//C
this.state = 51;
 BA.debugLineNum = 637;BA.debugLine="xclv.ResizeItem(i,60dip)";
Debug.ShouldStop(268435456);
_xclv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 641;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(1);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 642;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(2);
if (true) break;

case 27:
//if
this.state = 30;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 644;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(8);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 645;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(16);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 646;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(32);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 649;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "datosdocumentosexpediciondhl"), _rsub);
this.state = 52;
return;
case 52:
//C
this.state = 31;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 652;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(2048);
if (true) break;

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
if (true) return ;
if (true) break;

case 36:
//C
this.state = 37;
;
 BA.debugLineNum = 654;BA.debugLine="Dim DocSel As String=B4XListDlg.SelectedItem";
Debug.ShouldStop(8192);
_docsel = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("DocSel", _docsel);Debug.locals.put("DocSel", _docsel);
 BA.debugLineNum = 655;BA.debugLine="Select True";
Debug.ShouldStop(16384);
if (true) break;

case 37:
//select
this.state = 46;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))),_docsel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("CDEV"))))) {
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
default: {
this.state = 45;
if (true) break;
}
}
if (true) break;

case 39:
//C
this.state = 46;
 BA.debugLineNum = 657;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(65536);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico Albaranes Venta")),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 41:
//C
this.state = 46;
 BA.debugLineNum = 659;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(262144);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico recep. transferencia")),(Object)(BA.numberCast(int.class, 5745)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 43:
//C
this.state = 46;
 BA.debugLineNum = 661;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(1048576);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Histórico envío devolución")),(Object)(BA.numberCast(int.class, 6650)),(Object)(BA.ObjectToString("No.")),(Object)(_docsel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 663;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No es posibl";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No es posible abrir la ficha de navision del documento "),_docsel)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 664;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "datosdocumentosexpediciondhl"), _msa);
this.state = 53;
return;
case 53:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = -1;
;
 BA.debugLineNum = 666;BA.debugLine="End Sub";
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
public static RemoteObject  _documentosexpediciondhlnowebservice(RemoteObject __ref,RemoteObject _numexp) throws Exception{
try {
		Debug.PushSubsStack("DocumentosExpedicionDHLNoWebService (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,551);
if (RapidSub.canDelegate("documentosexpediciondhlnowebservice")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","documentosexpediciondhlnowebservice", __ref, _numexp);}
ResumableSub_DocumentosExpedicionDHLNoWebService rsub = new ResumableSub_DocumentosExpedicionDHLNoWebService(null,__ref,_numexp);
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
public static class ResumableSub_DocumentosExpedicionDHLNoWebService extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionDHLNoWebService(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref,RemoteObject _numexp) {
this.parent = parent;
this.__ref = __ref;
this._numexp = _numexp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
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
		Debug.PushSubsStack("DocumentosExpedicionDHLNoWebService (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,551);
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
 BA.debugLineNum = 553;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(256);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 554;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(512);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 555;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 556;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(2048);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 557;BA.debugLine="Dim Comando As String=\"DocumentosExpedicionDHLNoW";
Debug.ShouldStop(4096);
_comando = BA.ObjectToString("DocumentosExpedicionDHLNoWebService");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 559;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(NumEx";
Debug.ShouldStop(16384);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_numexp)})),(Object)(__ref));
 BA.debugLineNum = 561;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "documentosexpediciondhlnowebservice"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 562;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 563;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 564;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "documentosexpediciondhlnowebservice"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 565;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 566;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2097152);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 569;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 570;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 571;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(67108864);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 572;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay datos de documentos NAV para la expedicion de DHL seleccionada ("),_numexp,RemoteObject.createImmutable(")"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 573;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "documentosexpediciondhlnowebservice"), _msa);
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
 BA.debugLineNum = 575;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 576;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 577;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(1);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 578;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 581;BA.debugLine="Return mRes";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 582;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatoswebservicedhl(RemoteObject __ref,RemoteObject _iddatoenviobuscado,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceDHL (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,836);
if (RapidSub.canDelegate("enviodatoswebservicedhl")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","enviodatoswebservicedhl", __ref, _iddatoenviobuscado, _token);}
ResumableSub_EnvioDatosWebServiceDHL rsub = new ResumableSub_EnvioDatosWebServiceDHL(null,__ref,_iddatoenviobuscado,_token);
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
public static class ResumableSub_EnvioDatosWebServiceDHL extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceDHL(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref,RemoteObject _iddatoenviobuscado,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._iddatoenviobuscado = _iddatoenviobuscado;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _iddatoenviobuscado;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _urldhltracktrace = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceDHL (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,836);
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
Debug.locals.put("IDDatoEnvioBuscado", _iddatoenviobuscado);
Debug.locals.put("Token", _token);
 BA.debugLineNum = 838;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(32);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 839;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(64);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 842;BA.debugLine="Dim URLDhlTrackTrace As String=\"https://external.";
Debug.ShouldStop(512);
_urldhltracktrace = RemoteObject.concat(RemoteObject.createImmutable("https://external.dhl.es/cimapi/api/v1/customer/track?id="),_iddatoenviobuscado,RemoteObject.createImmutable("&idioma=es"));Debug.locals.put("URLDhlTrackTrace", _urldhltracktrace);Debug.locals.put("URLDhlTrackTrace", _urldhltracktrace);
 BA.debugLineNum = 843;BA.debugLine="job.Download(URLDhlTrackTrace)";
Debug.ShouldStop(1024);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_urldhltracktrace));
 BA.debugLineNum = 845;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(4096);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 846;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(8192);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 853;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 855;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "enviodatoswebservicedhl"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 857;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 858;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","863635478",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 860;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(134217728);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 861;BA.debugLine="j.Release";
Debug.ShouldStop(268435456);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 862;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 865;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(1);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 866;BA.debugLine="j.Release";
Debug.ShouldStop(2);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 867;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 869;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _expedicioninternaexpediciontransporte(RemoteObject __ref,RemoteObject _idtransporte,RemoteObject _numexp) throws Exception{
try {
		Debug.PushSubsStack("ExpedicionInternaExpedicionTransporte (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,669);
if (RapidSub.canDelegate("expedicioninternaexpediciontransporte")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","expedicioninternaexpediciontransporte", __ref, _idtransporte, _numexp);}
ResumableSub_ExpedicionInternaExpedicionTransporte rsub = new ResumableSub_ExpedicionInternaExpedicionTransporte(null,__ref,_idtransporte,_numexp);
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
public static class ResumableSub_ExpedicionInternaExpedicionTransporte extends BA.ResumableSub {
public ResumableSub_ExpedicionInternaExpedicionTransporte(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref,RemoteObject _idtransporte,RemoteObject _numexp) {
this.parent = parent;
this.__ref = __ref;
this._idtransporte = _idtransporte;
this._numexp = _numexp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _idtransporte;
RemoteObject _numexp;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slinkjrdc = RemoteObject.createImmutable("");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mrespuesta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExpedicionInternaExpedicionTransporte (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,669);
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
Debug.locals.put("IDTransporte", _idtransporte);
Debug.locals.put("NumExp", _numexp);
 BA.debugLineNum = 671;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1073741824);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 672;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(-2147483648);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 673;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 674;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(2);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 675;BA.debugLine="Dim Comando As String=\"DatosExpedicionInternaExpe";
Debug.ShouldStop(4);
_comando = BA.ObjectToString("DatosExpedicionInternaExpedicionTransporte");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 678;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDTra";
Debug.ShouldStop(32);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_idtransporte),(_numexp)})),(Object)(__ref));
 BA.debugLineNum = 680;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "expedicioninternaexpediciontransporte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 681;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 682;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 683;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "expedicioninternaexpediciontransporte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 684;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 685;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 688;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 689;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 690;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 691;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de expedicion interna para el transporte y número de expedición seleccionados.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 692;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "expedicioninternaexpediciontransporte"), _msa);
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
 BA.debugLineNum = 695;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4194304);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 696;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
Debug.ShouldStop(8388608);
_mrespuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mrespuesta = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mRespuesta", _mrespuesta);Debug.locals.put("mRespuesta", _mrespuesta);
 BA.debugLineNum = 697;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
Debug.ShouldStop(16777216);
_sresp = BA.ObjectToString(_mrespuesta.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 698;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(33554432);
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 699;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error recup";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error recuperando datos del SP "),_comando,RemoteObject.createImmutable("."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 700;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "expedicioninternaexpediciontransporte"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 BA.debugLineNum = 701;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 702;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 704;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 705;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 706;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
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
public static void  _incidenciaspendientes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IncidenciasPendientes (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,373);
if (RapidSub.canDelegate("incidenciaspendientes")) { __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","incidenciaspendientes", __ref); return;}
ResumableSub_IncidenciasPendientes rsub = new ResumableSub_IncidenciasPendientes(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_IncidenciasPendientes extends BA.ResumableSub {
public ResumableSub_IncidenciasPendientes(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _lstcodigosestadosdhl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _lstenviosrepartidos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstenviosnoentregadosdhl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstlineasfichero = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _slin = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _clavesituacion = RemoteObject.createImmutable("");
RemoteObject _puntogeneracion = RemoteObject.createImmutable("");
RemoteObject _evento = RemoteObject.createImmutable("");
RemoteObject _motivo = RemoteObject.createImmutable("");
RemoteObject _descripcionsituacion = RemoteObject.createImmutable("");
RemoteObject _sclave = null;
RemoteObject _d = RemoteObject.createImmutable("");
RemoteObject _descripcionsituacioncorregida = RemoteObject.createImmutable("");
RemoteObject _ma = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _sfecha = RemoteObject.createImmutable("");
RemoteObject _shora = RemoteObject.createImmutable("");
RemoteObject _observaciones = RemoteObject.createImmutable("");
RemoteObject _observacionescorregidas = RemoteObject.createImmutable("");
RemoteObject _numexprepartida = RemoteObject.createImmutable("");
RemoteObject _robj = RemoteObject.declareNull("Object");
int step13;
int limit13;
RemoteObject group25;
int index25;
int groupLen25;
RemoteObject group66;
int index66;
int groupLen66;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("IncidenciasPendientes (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,373);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 375;BA.debugLine="Dim lstCodigosEstadosDHL As List";
Debug.ShouldStop(4194304);
_lstcodigosestadosdhl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCodigosEstadosDHL", _lstcodigosestadosdhl);
 BA.debugLineNum = 376;BA.debugLine="lstCodigosEstadosDHL.Initialize";
Debug.ShouldStop(8388608);
_lstcodigosestadosdhl.runVoidMethod ("Initialize");
 BA.debugLineNum = 377;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(16777216);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 379;BA.debugLine="lstCodigosEstadosDHL=su.LoadCSV(File.DirAssets,\"i";
Debug.ShouldStop(67108864);
_lstcodigosestadosdhl = _su.runMethod(false,"LoadCSV",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("incidencias_carretera.csv")),(Object)(BA.ObjectToChar(RemoteObject.createImmutable(";"))));Debug.locals.put("lstCodigosEstadosDHL", _lstcodigosestadosdhl);
 BA.debugLineNum = 381;BA.debugLine="Dim lstEnviosRepartidos As List";
Debug.ShouldStop(268435456);
_lstenviosrepartidos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEnviosRepartidos", _lstenviosrepartidos);
 BA.debugLineNum = 382;BA.debugLine="lstEnviosRepartidos.Initialize";
Debug.ShouldStop(536870912);
_lstenviosrepartidos.runVoidMethod ("Initialize");
 BA.debugLineNum = 384;BA.debugLine="Dim lstEnviosNoEntregadosDHL As List";
Debug.ShouldStop(-2147483648);
_lstenviosnoentregadosdhl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEnviosNoEntregadosDHL", _lstenviosnoentregadosdhl);
 BA.debugLineNum = 385;BA.debugLine="lstEnviosNoEntregadosDHL.Initialize";
Debug.ShouldStop(1);
_lstenviosnoentregadosdhl.runVoidMethod ("Initialize");
 BA.debugLineNum = 386;BA.debugLine="Dim lstLineasFichero As List";
Debug.ShouldStop(2);
_lstlineasfichero = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstLineasFichero", _lstlineasfichero);
 BA.debugLineNum = 388;BA.debugLine="lstLineasFichero = File.ReadList(xui.DefaultFolde";
Debug.ShouldStop(8);
_lstlineasfichero = parent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(__ref.getField(true,"_nombreultimofichero" /*RemoteObject*/ )));Debug.locals.put("lstLineasFichero", _lstlineasfichero);
 BA.debugLineNum = 389;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(16);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 391;BA.debugLine="DateTime.DateFormat=\"yyyyMMdd\"";
Debug.ShouldStop(64);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 393;BA.debugLine="For i = 0 To lstLineasFichero.Size - 1";
Debug.ShouldStop(256);
if (true) break;

case 1:
//for
this.state = 28;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {_lstlineasfichero.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 28;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 3;
if (true) break;

case 34:
//C
this.state = 33;
_i = ((int)(0 + _i + step13)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 394;BA.debugLine="LogColor(lstLineasFichero.Get(i),xui.Color_Blue)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","862783509",BA.ObjectToString(_lstlineasfichero.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 395;BA.debugLine="Dim sLin As String=lstLineasFichero.Get(i)";
Debug.ShouldStop(1024);
_slin = BA.ObjectToString(_lstlineasfichero.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("sLin", _slin);Debug.locals.put("sLin", _slin);
 BA.debugLineNum = 396;BA.debugLine="Dim m As Map";
Debug.ShouldStop(2048);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 397;BA.debugLine="m.Initialize";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 398;BA.debugLine="m.Put(\"NumExpedicion\",sLin.SubString2(47,62))";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NumExpedicion"))),(Object)((_slin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 47)),(Object)(BA.numberCast(int.class, 62))))));
 BA.debugLineNum = 399;BA.debugLine="m.Put(\"Referencia\",sLin.SubString2(12,46).Trim)";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Referencia"))),(Object)((_slin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 46))).runMethod(true,"trim"))));
 BA.debugLineNum = 401;BA.debugLine="Dim ClaveSituacion As String=sLin.SubString2(64,";
Debug.ShouldStop(65536);
_clavesituacion = _slin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 64)),(Object)(BA.numberCast(int.class, 66))).runMethod(true,"trim");Debug.locals.put("ClaveSituacion", _clavesituacion);Debug.locals.put("ClaveSituacion", _clavesituacion);
 BA.debugLineNum = 402;BA.debugLine="Dim PuntoGeneracion As String=sLin.SubString2(14";
Debug.ShouldStop(131072);
_puntogeneracion = _slin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 140)),(Object)(BA.numberCast(int.class, 143)));Debug.locals.put("PuntoGeneracion", _puntogeneracion);Debug.locals.put("PuntoGeneracion", _puntogeneracion);
 BA.debugLineNum = 403;BA.debugLine="Dim Evento As String=sLin.SubString2(143,146)";
Debug.ShouldStop(262144);
_evento = _slin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 143)),(Object)(BA.numberCast(int.class, 146)));Debug.locals.put("Evento", _evento);Debug.locals.put("Evento", _evento);
 BA.debugLineNum = 404;BA.debugLine="Dim Motivo As String=sLin.SubString2(146,149)";
Debug.ShouldStop(524288);
_motivo = _slin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 146)),(Object)(BA.numberCast(int.class, 149)));Debug.locals.put("Motivo", _motivo);Debug.locals.put("Motivo", _motivo);
 BA.debugLineNum = 405;BA.debugLine="Dim DescripcionSituacion As String";
Debug.ShouldStop(1048576);
_descripcionsituacion = RemoteObject.createImmutable("");Debug.locals.put("DescripcionSituacion", _descripcionsituacion);
 BA.debugLineNum = 406;BA.debugLine="For Each sClave() As String In lstCodigosEstados";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//for
this.state = 11;
group25 = _lstcodigosestadosdhl;
index25 = 0;
groupLen25 = group25.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("sClave", _sclave);
this.state = 35;
if (true) break;

case 35:
//C
this.state = 11;
if (index25 < groupLen25) {
this.state = 6;
_sclave = (group25.runMethod(false,"Get",index25));Debug.locals.put("sClave", _sclave);}
if (true) break;

case 36:
//C
this.state = 35;
index25++;
Debug.locals.put("sClave", _sclave);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 408;BA.debugLine="If sClave(0) & \"#/#\" & sClave(3) & \"#/#\" & sCla";
Debug.ShouldStop(8388608);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",RemoteObject.concat(_sclave.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable("#/#"),_sclave.getArrayElement(true,BA.numberCast(int.class, 3)),RemoteObject.createImmutable("#/#"),_sclave.getArrayElement(true,BA.numberCast(int.class, 4))),RemoteObject.concat(_clavesituacion,RemoteObject.createImmutable("#/#"),_evento,RemoteObject.createImmutable("#/#"),_motivo))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 409;BA.debugLine="DescripcionSituacion=sClave(1)";
Debug.ShouldStop(16777216);
_descripcionsituacion = _sclave.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("DescripcionSituacion", _descripcionsituacion);
 BA.debugLineNum = 410;BA.debugLine="Exit";
Debug.ShouldStop(33554432);
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 36;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("sClave", _sclave);
;
 BA.debugLineNum = 413;BA.debugLine="Dim d As String =DescripcionSituacion";
Debug.ShouldStop(268435456);
_d = _descripcionsituacion;Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 414;BA.debugLine="Dim DescripcionSituacionCorregida As String";
Debug.ShouldStop(536870912);
_descripcionsituacioncorregida = RemoteObject.createImmutable("");Debug.locals.put("DescripcionSituacionCorregida", _descripcionsituacioncorregida);
 BA.debugLineNum = 415;BA.debugLine="Dim ma As Matcher";
Debug.ShouldStop(1073741824);
_ma = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");Debug.locals.put("ma", _ma);
 BA.debugLineNum = 416;BA.debugLine="ma = Regex.Matcher(\"(-?[0-9]+(?:[,.][0-9]+)?)\",d";
Debug.ShouldStop(-2147483648);
_ma = parent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("(-?[0-9]+(?:[,.][0-9]+)?)")),(Object)(_d));Debug.locals.put("ma", _ma);
 BA.debugLineNum = 417;BA.debugLine="If ma.Find Then";
Debug.ShouldStop(1);
if (true) break;

case 12:
//if
this.state = 17;
if (_ma.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 418;BA.debugLine="Log(ma.Match)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","862783533",_ma.runMethod(true,"getMatch"),0);
 BA.debugLineNum = 419;BA.debugLine="DescripcionSituacionCorregida=ma.Match";
Debug.ShouldStop(4);
_descripcionsituacioncorregida = _ma.runMethod(true,"getMatch");Debug.locals.put("DescripcionSituacionCorregida", _descripcionsituacioncorregida);
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 421;BA.debugLine="DescripcionSituacionCorregida=DescripcionSituac";
Debug.ShouldStop(16);
_descripcionsituacioncorregida = _descripcionsituacion;Debug.locals.put("DescripcionSituacionCorregida", _descripcionsituacioncorregida);
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 423;BA.debugLine="m.Put(\"DescripcionSituacion\",DescripcionSituacio";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescripcionSituacion"))),(Object)((_descripcionsituacioncorregida)));
 BA.debugLineNum = 424;BA.debugLine="Dim sFecha As String=sLin.SubString2(66,74)";
Debug.ShouldStop(128);
_sfecha = _slin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 66)),(Object)(BA.numberCast(int.class, 74)));Debug.locals.put("sFecha", _sfecha);Debug.locals.put("sFecha", _sfecha);
 BA.debugLineNum = 425;BA.debugLine="m.Put(\"Fecha\",DateTime.DateParse(sFecha))";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Fecha"))),(Object)((parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_sfecha)))));
 BA.debugLineNum = 426;BA.debugLine="Dim sHora As String=sLin.SubString2(74,80)";
Debug.ShouldStop(512);
_shora = _slin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 74)),(Object)(BA.numberCast(int.class, 80)));Debug.locals.put("sHora", _shora);Debug.locals.put("sHora", _shora);
 BA.debugLineNum = 428;BA.debugLine="m.Put(\"Hora\",sHora.SubString2(0,2) & \":\" & sHora";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Hora"))),(Object)((RemoteObject.concat(_shora.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable(":"),_shora.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 4))),RemoteObject.createImmutable("."),_shora.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 4)))))));
 BA.debugLineNum = 429;BA.debugLine="Dim Observaciones As String=sLin.SubString2(90,1";
Debug.ShouldStop(4096);
_observaciones = _slin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 90)),(Object)(BA.numberCast(int.class, 140)));Debug.locals.put("Observaciones", _observaciones);Debug.locals.put("Observaciones", _observaciones);
 BA.debugLineNum = 430;BA.debugLine="Dim ObservacionesCorregidas As String";
Debug.ShouldStop(8192);
_observacionescorregidas = RemoteObject.createImmutable("");Debug.locals.put("ObservacionesCorregidas", _observacionescorregidas);
 BA.debugLineNum = 431;BA.debugLine="Dim d As String =Observaciones";
Debug.ShouldStop(16384);
_d = _observaciones;Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 432;BA.debugLine="Dim ma As Matcher";
Debug.ShouldStop(32768);
_ma = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");Debug.locals.put("ma", _ma);
 BA.debugLineNum = 433;BA.debugLine="ma = Regex.Matcher(\"(-?[0-9]+(?:[,.][0-9]+)?)\",d";
Debug.ShouldStop(65536);
_ma = parent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("(-?[0-9]+(?:[,.][0-9]+)?)")),(Object)(_d));Debug.locals.put("ma", _ma);
 BA.debugLineNum = 434;BA.debugLine="If ma.Find Then";
Debug.ShouldStop(131072);
if (true) break;

case 18:
//if
this.state = 23;
if (_ma.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 435;BA.debugLine="Log(ma.Match)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","862783550",_ma.runMethod(true,"getMatch"),0);
 BA.debugLineNum = 436;BA.debugLine="ObservacionesCorregidas=ma.Match";
Debug.ShouldStop(524288);
_observacionescorregidas = _ma.runMethod(true,"getMatch");Debug.locals.put("ObservacionesCorregidas", _observacionescorregidas);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 438;BA.debugLine="ObservacionesCorregidas=Observaciones";
Debug.ShouldStop(2097152);
_observacionescorregidas = _observaciones;Debug.locals.put("ObservacionesCorregidas", _observacionescorregidas);
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 440;BA.debugLine="m.Put(\"Observaciones\",ObservacionesCorregidas)";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Observaciones"))),(Object)((_observacionescorregidas)));
 BA.debugLineNum = 441;BA.debugLine="LogColor(\"Estado Expedicion \" & m,xui.Color_Gray";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","862783556",RemoteObject.concat(RemoteObject.createImmutable("Estado Expedicion "),_m),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 442;BA.debugLine="lstEnviosNoEntregadosDHL.Add(m)";
Debug.ShouldStop(33554432);
_lstenviosnoentregadosdhl.runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 443;BA.debugLine="If DescripcionSituacion=\"repartido\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_descripcionsituacion,BA.ObjectToString("repartido"))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 444;BA.debugLine="lstEnviosRepartidos.Add(m.Get(\"NumExpedicion\"))";
Debug.ShouldStop(134217728);
_lstenviosrepartidos.runVoidMethod ("Add",(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumExpedicion"))))));
 if (true) break;

case 27:
//C
this.state = 34;
;
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 448;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(-2147483648);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 451;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblExpedicionesIncidenci";
Debug.ShouldStop(4);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblExpedicionesIncidenciasDHL")),(Object)(_lstenviosnoentregadosdhl));
 BA.debugLineNum = 453;BA.debugLine="For Each NumExpRepartida As String In lstEnviosRe";
Debug.ShouldStop(16);
if (true) break;

case 29:
//for
this.state = 32;
group66 = _lstenviosrepartidos;
index66 = 0;
groupLen66 = group66.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("NumExpRepartida", _numexprepartida);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 32;
if (index66 < groupLen66) {
this.state = 31;
_numexprepartida = BA.ObjectToString(group66.runMethod(false,"Get",index66));Debug.locals.put("NumExpRepartida", _numexprepartida);}
if (true) break;

case 38:
//C
this.state = 37;
index66++;
Debug.locals.put("NumExpRepartida", _numexprepartida);
if (true) break;

case 31:
//C
this.state = 38;
 BA.debugLineNum = 454;BA.debugLine="mSQL.ExecNonQuery2(\"delete from tblExpedicionesI";
Debug.ShouldStop(32);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("delete from tblExpedicionesIncidenciasDHL where NumExpedicion=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_numexprepartida)})))));
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
Debug.locals.put("NumExpRepartida", _numexprepartida);
;
 BA.debugLineNum = 472;BA.debugLine="wait for (ActualizarDatosTabla(lstEnviosNoEntrega";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "incidenciaspendientes"), __ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_actualizardatostabla" /*RemoteObject*/ ,(Object)(_lstenviosnoentregadosdhl)));
this.state = 39;
return;
case 39:
//C
this.state = -1;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 473;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableviewexpedicionesnoentregadas_accionsalirjamtableview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewExpedicionesNoEntregadas_AccionSalirJamTableView (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,505);
if (RapidSub.canDelegate("jamtableviewexpedicionesnoentregadas_accionsalirjamtableview")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","jamtableviewexpedicionesnoentregadas_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 505;BA.debugLine="Sub jamTableViewExpedicionesNoEntregadas_AccionSal";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 506;BA.debugLine="jamTableViewExpedicionesNoEntregadas.GuardarConfi";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 507;BA.debugLine="jamTableViewExpedicionesNoEntregadas.LimpiarTabla";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 508;BA.debugLine="frm.Close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 509;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(268435456);
cexpedicionesnoentregadasdhl._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 510;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableviewexpedicionesnoentregadas_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewExpedicionesNoEntregadas_ContextMenuItem_Action (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,512);
if (RapidSub.canDelegate("jamtableviewexpedicionesnoentregadas_contextmenuitem_action")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","jamtableviewexpedicionesnoentregadas_contextmenuitem_action", __ref, _tagmenuitem);}
RemoteObject _idtransportedhl = RemoteObject.createImmutable(0);
RemoteObject _dcs = RemoteObject.declareNull("b4j.docU.jamtableview._datosceldaseleccionadajamtableview");
RemoteObject _mpk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _expediciondhl = RemoteObject.createImmutable("");
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 512;BA.debugLine="Sub jamTableViewExpedicionesNoEntregadas_ContextMe";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 513;BA.debugLine="Select TagMenuItem";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Documentos NAV de la expedicion"),BA.ObjectToString("TrazabilidadExpedicionWebDHL"))) {
case 0: {
 BA.debugLineNum = 515;BA.debugLine="Dim IDTransporteDHL As Int=1";
Debug.ShouldStop(4);
_idtransportedhl = BA.numberCast(int.class, 1);Debug.locals.put("IDTransporteDHL", _idtransportedhl);Debug.locals.put("IDTransporteDHL", _idtransportedhl);
 BA.debugLineNum = 516;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(8);
_dcs = __ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaseleccionada" /*RemoteObject*/ );Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 517;BA.debugLine="Dim mPK As Map=DCS.mDataPK";
Debug.ShouldStop(16);
_mpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mpk = _dcs.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mPK", _mpk);Debug.locals.put("mPK", _mpk);
 BA.debugLineNum = 518;BA.debugLine="Dim ExpedicionDHL As String=mPK.Get(\"NumExpedic";
Debug.ShouldStop(32);
_expediciondhl = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumExpedicion")))));Debug.locals.put("ExpedicionDHL", _expediciondhl);Debug.locals.put("ExpedicionDHL", _expediciondhl);
 BA.debugLineNum = 519;BA.debugLine="DatosDocumentosExpedicionDHL(ExpedicionDHL.Trim";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_datosdocumentosexpediciondhl" /*void*/ ,(Object)(_expediciondhl.runMethod(true,"trim")));
 break; }
case 1: {
 BA.debugLineNum = 522;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
Debug.ShouldStop(512);
_dcs = __ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatosceldaseleccionada" /*RemoteObject*/ );Debug.locals.put("DCS", _dcs);Debug.locals.put("DCS", _dcs);
 BA.debugLineNum = 523;BA.debugLine="Dim mPK As Map=DCS.mDataPK";
Debug.ShouldStop(1024);
_mpk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mpk = _dcs.getField(false,"mDataPK" /*RemoteObject*/ );Debug.locals.put("mPK", _mpk);Debug.locals.put("mPK", _mpk);
 BA.debugLineNum = 524;BA.debugLine="Dim ExpedicionDHL As String=mPK.Get(\"NumExpedic";
Debug.ShouldStop(2048);
_expediciondhl = BA.ObjectToString(_mpk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumExpedicion")))));Debug.locals.put("ExpedicionDHL", _expediciondhl);Debug.locals.put("ExpedicionDHL", _expediciondhl);
 BA.debugLineNum = 525;BA.debugLine="fx.ShowExternalDocument(\"https://clientesparcel";
Debug.ShouldStop(4096);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethod ("ShowExternalDocument",(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://clientesparcel.dhl.es/seguimientoenvios/integra/SeguimientoDocumentos.aspx?codigo="),_expediciondhl,RemoteObject.createImmutable("&anno=2017&lang=sp"))));
 break; }
}
;
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
public static RemoteObject  _obtenertokenswebservicedhl(RemoteObject __ref,RemoteObject _credenu,RemoteObject _credenpswd) throws Exception{
try {
		Debug.PushSubsStack("ObtenerTokensWebServiceDHL (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,928);
if (RapidSub.canDelegate("obtenertokenswebservicedhl")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","obtenertokenswebservicedhl", __ref, _credenu, _credenpswd);}
ResumableSub_ObtenerTokensWebServiceDHL rsub = new ResumableSub_ObtenerTokensWebServiceDHL(null,__ref,_credenu,_credenpswd);
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
public static class ResumableSub_ObtenerTokensWebServiceDHL extends BA.ResumableSub {
public ResumableSub_ObtenerTokensWebServiceDHL(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref,RemoteObject _credenu,RemoteObject _credenpswd) {
this.parent = parent;
this.__ref = __ref;
this._credenu = _credenu;
this._credenpswd = _credenpswd;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _credenu;
RemoteObject _credenpswd;
RemoteObject _mtokenjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
RemoteObject _tokenjsonstring = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _accesstokenurl = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _mjobresponse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _resp = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse");
RemoteObject _headers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _scookie = RemoteObject.createImmutable("");
RemoteObject _cookiecomponents = null;
RemoteObject _cookie = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");
RemoteObject group23;
int index23;
int groupLen23;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ObtenerTokensWebServiceDHL (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,928);
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
Debug.locals.put("CredenU", _credenu);
Debug.locals.put("CredenPswd", _credenpswd);
 BA.debugLineNum = 930;BA.debugLine="Dim mTokenJSON As Map";
Debug.ShouldStop(2);
_mtokenjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mTokenJSON", _mtokenjson);
 BA.debugLineNum = 931;BA.debugLine="mTokenJSON.Initialize";
Debug.ShouldStop(4);
_mtokenjson.runVoidMethod ("Initialize");
 BA.debugLineNum = 934;BA.debugLine="mTokenJSON.Put(\"Username\",CredenU)";
Debug.ShouldStop(32);
_mtokenjson.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Username"))),(Object)((_credenu)));
 BA.debugLineNum = 936;BA.debugLine="mTokenJSON.Put(\"Password\",CredenPswd)";
Debug.ShouldStop(128);
_mtokenjson.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Password"))),(Object)((_credenpswd)));
 BA.debugLineNum = 938;BA.debugLine="Dim jp As JSONGenerator";
Debug.ShouldStop(512);
_jp = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 939;BA.debugLine="jp.Initialize(mTokenJSON)";
Debug.ShouldStop(1024);
_jp.runVoidMethod ("Initialize",(Object)(_mtokenjson));
 BA.debugLineNum = 940;BA.debugLine="Dim TokenJSONstring As String";
Debug.ShouldStop(2048);
_tokenjsonstring = RemoteObject.createImmutable("");Debug.locals.put("TokenJSONstring", _tokenjsonstring);
 BA.debugLineNum = 941;BA.debugLine="TokenJSONstring=jp.ToString";
Debug.ShouldStop(4096);
_tokenjsonstring = _jp.runMethod(true,"ToString");Debug.locals.put("TokenJSONstring", _tokenjsonstring);
 BA.debugLineNum = 943;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(16384);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 944;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(32768);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 947;BA.debugLine="Dim AccessTokenURL As String=\"https://external.dh";
Debug.ShouldStop(262144);
_accesstokenurl = BA.ObjectToString("https://external.dhl.es/cimapi/api/v1/customer/authenticate");Debug.locals.put("AccessTokenURL", _accesstokenurl);Debug.locals.put("AccessTokenURL", _accesstokenurl);
 BA.debugLineNum = 948;BA.debugLine="job.PostString(AccessTokenURL, TokenJSONstring)";
Debug.ShouldStop(524288);
_job.runClassMethod (b4j.docU.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_accesstokenurl),(Object)(_tokenjsonstring));
 BA.debugLineNum = 949;BA.debugLine="job.GetRequest.SetHeader(\"accept\",\"application/js";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 950;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(2097152);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 951;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(4194304);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 953;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "obtenertokenswebservicedhl"), (_job));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 954;BA.debugLine="Dim mJobResponse As Map";
Debug.ShouldStop(33554432);
_mjobresponse = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mJobResponse", _mjobresponse);
 BA.debugLineNum = 955;BA.debugLine="mJobResponse.Initialize";
Debug.ShouldStop(67108864);
_mjobresponse.runVoidMethod ("Initialize");
 BA.debugLineNum = 956;BA.debugLine="If j.Success Then   ' la API de españa devuelve 1";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 10;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 958;BA.debugLine="Dim sRespuestaWebService As String=j.getstring";
Debug.ShouldStop(536870912);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 959;BA.debugLine="Dim resp As OkHttpResponse = job.Response";
Debug.ShouldStop(1073741824);
_resp = _job.getField(false,"_response" /*RemoteObject*/ );Debug.locals.put("resp", _resp);Debug.locals.put("resp", _resp);
 BA.debugLineNum = 960;BA.debugLine="Dim headers As Map  = resp.GetHeaders";
Debug.ShouldStop(-2147483648);
_headers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_headers = _resp.runMethod(false,"GetHeaders");Debug.locals.put("headers", _headers);Debug.locals.put("headers", _headers);
 BA.debugLineNum = 961;BA.debugLine="For Each key As String In headers.Keys";
Debug.ShouldStop(1);
if (true) break;

case 4:
//for
this.state = 7;
group23 = _headers.runMethod(false,"Keys");
index23 = 0;
groupLen23 = group23.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("key", _key);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index23 < groupLen23) {
this.state = 6;
_key = BA.ObjectToString(group23.runMethod(false,"Get",index23));Debug.locals.put("key", _key);}
if (true) break;

case 13:
//C
this.state = 12;
index23++;
Debug.locals.put("key", _key);
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 962;BA.debugLine="Log($\"Header: ${key} = ${headers.Get(key)}\"$)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","863766562",(RemoteObject.concat(RemoteObject.createImmutable("Header: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key))),RemoteObject.createImmutable(" = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_headers.runMethod(false,"Get",(Object)((_key))))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("key", _key);
;
 BA.debugLineNum = 965;BA.debugLine="Dim sCookie As String=resp.GetHeaders.Get(\"set-c";
Debug.ShouldStop(16);
_scookie = BA.ObjectToString(_resp.runMethod(false,"GetHeaders").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("set-cookie")))));Debug.locals.put("sCookie", _scookie);Debug.locals.put("sCookie", _scookie);
 BA.debugLineNum = 966;BA.debugLine="sCookie=sCookie.Replace(\"[\",\"\").Replace(\"]\",\"\")";
Debug.ShouldStop(32);
_scookie = _scookie.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sCookie", _scookie);
 BA.debugLineNum = 967;BA.debugLine="Dim CookieComponents() As String =Regex.Split(\";";
Debug.ShouldStop(64);
_cookiecomponents = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(";")),(Object)(_scookie));Debug.locals.put("CookieComponents", _cookiecomponents);Debug.locals.put("CookieComponents", _cookiecomponents);
 BA.debugLineNum = 968;BA.debugLine="Dim Cookie As String= CookieComponents(0)";
Debug.ShouldStop(128);
_cookie = _cookiecomponents.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("Cookie", _cookie);Debug.locals.put("Cookie", _cookie);
 BA.debugLineNum = 969;BA.debugLine="Log(\"set-cookie \" & Cookie)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","863766569",RemoteObject.concat(RemoteObject.createImmutable("set-cookie "),_cookie),0);
 BA.debugLineNum = 970;BA.debugLine="j.Release";
Debug.ShouldStop(512);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 971;BA.debugLine="mJobResponse.Put(\"sRespuestaWebService\",sRespues";
Debug.ShouldStop(1024);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sRespuestaWebService"))),(Object)((_srespuestawebservice)));
 BA.debugLineNum = 972;BA.debugLine="mJobResponse.Put(\"Cookie\",Cookie)";
Debug.ShouldStop(2048);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Cookie"))),(Object)((_cookie)));
 BA.debugLineNum = 973;BA.debugLine="mJobResponse.Put(\"Token\",sRespuestaWebService.Re";
Debug.ShouldStop(4096);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Token"))),(Object)((_srespuestawebservice.runMethod(true,"replace",(Object)(parent.__c.getField(true,"QUOTE")),(Object)(RemoteObject.createImmutable(""))))));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 976;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(32768);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 977;BA.debugLine="j.Release";
Debug.ShouldStop(65536);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 978;BA.debugLine="mJobResponse.Put(\"sRespuestaWebService\",sErrorJo";
Debug.ShouldStop(131072);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sRespuestaWebService"))),(Object)((_serrorjobresponse)));
 BA.debugLineNum = 979;BA.debugLine="mJobResponse.Put(\"Cookie\",\"\")";
Debug.ShouldStop(262144);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Cookie"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 980;BA.debugLine="mJobResponse.Put(\"Token\",\"\")";
Debug.ShouldStop(524288);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Token"))),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 983;BA.debugLine="Return mJobResponse";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mjobresponse));return;};
 BA.debugLineNum = 984;BA.debugLine="End Sub";
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
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,500);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","salirmodulo", __ref);}
 BA.debugLineNum = 500;BA.debugLine="Sub SalirModulo";
Debug.ShouldStop(524288);
 BA.debugLineNum = 501;BA.debugLine="frm.Close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 502;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(2097152);
cexpedicionesnoentregadasdhl._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 503;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sftpdhl_downloadcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("sftpDHL_DownloadCompleted (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,358);
if (RapidSub.canDelegate("sftpdhl_downloadcompleted")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","sftpdhl_downloadcompleted", __ref, _serverpath, _success);}
Debug.locals.put("ServerPath", _serverpath);
Debug.locals.put("Success", _success);
 BA.debugLineNum = 358;BA.debugLine="Sub sftpDHL_DownloadCompleted (ServerPath As Strin";
Debug.ShouldStop(32);
 BA.debugLineNum = 359;BA.debugLine="frm.RootPane.MouseCursor= fx.Cursors.DEFAULT";
Debug.ShouldStop(64);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 360;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(128);
if (cexpedicionesnoentregadasdhl.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 361;BA.debugLine="fx.Msgbox(frm,\"Error descargando fichero de esta";
Debug.ShouldStop(256);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Error descargando fichero de estado expediciones.")),(Object)(RemoteObject.createImmutable("Error")));
 BA.debugLineNum = 362;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 364;BA.debugLine="IncidenciasPendientes";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_incidenciaspendientes" /*void*/ );
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _sftpdhl_listcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success,RemoteObject _folders,RemoteObject _files) throws Exception{
try {
		Debug.PushSubsStack("sftpDHL_ListCompleted (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,317);
if (RapidSub.canDelegate("sftpdhl_listcompleted")) { __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","sftpdhl_listcompleted", __ref, _serverpath, _success, _folders, _files); return;}
ResumableSub_sftpDHL_ListCompleted rsub = new ResumableSub_sftpDHL_ListCompleted(null,__ref,_serverpath,_success,_folders,_files);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_sftpDHL_ListCompleted extends BA.ResumableSub {
public ResumableSub_sftpDHL_ListCompleted(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success,RemoteObject _folders,RemoteObject _files) {
this.parent = parent;
this.__ref = __ref;
this._serverpath = _serverpath;
this._success = _success;
this._folders = _folders;
this._files = _files;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _serverpath;
RemoteObject _success;
RemoteObject _folders;
RemoteObject _files;
RemoteObject _lstenviosnoentregadosdhl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _robj = RemoteObject.declareNull("Object");
int _i = 0;
RemoteObject _fechalongultimofichero = RemoteObject.createImmutable(0L);
RemoteObject _rutaultimofichero = RemoteObject.createImmutable("");
int step14;
int limit14;
int step19;
int limit19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("sftpDHL_ListCompleted (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,317);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("ServerPath", _serverpath);
Debug.locals.put("Success", _success);
Debug.locals.put("Folders", _folders);
Debug.locals.put("Files", _files);
 BA.debugLineNum = 318;BA.debugLine="frm.RootPane.MouseCursor= fx.Cursors.DEFAULT";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 319;BA.debugLine="If Files.Length=0 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_files.getField(true,"length"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 320;BA.debugLine="Dim lstEnviosNoEntregadosDHL As List";
Debug.ShouldStop(-2147483648);
_lstenviosnoentregadosdhl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEnviosNoEntregadosDHL", _lstenviosnoentregadosdhl);
 BA.debugLineNum = 321;BA.debugLine="lstEnviosNoEntregadosDHL.Initialize";
Debug.ShouldStop(1);
_lstenviosnoentregadosdhl.runVoidMethod ("Initialize");
 BA.debugLineNum = 322;BA.debugLine="wait for (ActualizarDatosTabla(lstEnviosNoEntreg";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "sftpdhl_listcompleted"), __ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_actualizardatostabla" /*RemoteObject*/ ,(Object)(_lstenviosnoentregadosdhl)));
this.state = 29;
return;
case 29:
//C
this.state = 4;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 323;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 325;BA.debugLine="Log(ServerPath)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","862652424",_serverpath,0);
 BA.debugLineNum = 326;BA.debugLine="If Success = False Then";
Debug.ShouldStop(32);
if (true) break;

case 5:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 22;
 BA.debugLineNum = 327;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","862652426",parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 328;BA.debugLine="fx.Msgbox(frm,\"Error listando carpeta FTP.\" & CR";
Debug.ShouldStop(128);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error listando carpeta FTP."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));
 BA.debugLineNum = 329;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 331;BA.debugLine="For i = 0 To Folders.Length - 1";
Debug.ShouldStop(1024);
if (true) break;

case 10:
//for
this.state = 13;
step14 = 1;
limit14 = RemoteObject.solve(new RemoteObject[] {_folders.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 30;
if (true) break;

case 30:
//C
this.state = 13;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 12;
if (true) break;

case 31:
//C
this.state = 30;
_i = ((int)(0 + _i + step14)) ;
Debug.locals.put("i", _i);
if (true) break;

case 12:
//C
this.state = 31;
 BA.debugLineNum = 332;BA.debugLine="Log(Folders(i).Name)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","862652431",_folders.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),0);
 BA.debugLineNum = 333;BA.debugLine="Log(DateTime.Date(Folders(i).Timestamp))";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","862652432",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_folders.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"))),0);
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 336;BA.debugLine="Dim FechaLongUltimoFichero As Long";
Debug.ShouldStop(32768);
_fechalongultimofichero = RemoteObject.createImmutable(0L);Debug.locals.put("FechaLongUltimoFichero", _fechalongultimofichero);
 BA.debugLineNum = 337;BA.debugLine="For i = 0 To Files.Length - 1";
Debug.ShouldStop(65536);
if (true) break;

case 14:
//for
this.state = 21;
step19 = 1;
limit19 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 32;
if (true) break;

case 32:
//C
this.state = 21;
if ((step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19)) this.state = 16;
if (true) break;

case 33:
//C
this.state = 32;
_i = ((int)(0 + _i + step19)) ;
Debug.locals.put("i", _i);
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 338;BA.debugLine="Log(Files(i).Name & \", \" & Files(i).Size & \", \"";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","862652437",RemoteObject.concat(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),RemoteObject.createImmutable(", "),_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getSize"),RemoteObject.createImmutable(", "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp")))),0);
 BA.debugLineNum = 339;BA.debugLine="If Files(i).Timestamp> FechaLongUltimoFichero T";
Debug.ShouldStop(262144);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean(">",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_fechalongultimofichero)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 340;BA.debugLine="NombreUltimoFichero=Files(i).Name";
Debug.ShouldStop(524288);
__ref.setField ("_nombreultimofichero" /*RemoteObject*/ ,_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"));
 BA.debugLineNum = 341;BA.debugLine="FechaLongUltimoFichero=Files(i).Timestamp";
Debug.ShouldStop(1048576);
_fechalongultimofichero = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp");Debug.locals.put("FechaLongUltimoFichero", _fechalongultimofichero);
 if (true) break;

case 20:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
Debug.locals.put("i", _i);
;
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 345;BA.debugLine="Log(\"********NombreUltimoFichero*******\")";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","862652444",RemoteObject.createImmutable("********NombreUltimoFichero*******"),0);
 BA.debugLineNum = 346;BA.debugLine="Log(NombreUltimoFichero)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","862652445",__ref.getField(true,"_nombreultimofichero" /*RemoteObject*/ ),0);
 BA.debugLineNum = 348;BA.debugLine="If File.Exists(xui.DefaultFolder,NombreUltimoFich";
Debug.ShouldStop(134217728);
if (true) break;

case 23:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(__ref.getField(true,"_nombreultimofichero" /*RemoteObject*/ ))),parent.__c.getField(true,"False"))) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 BA.debugLineNum = 349;BA.debugLine="Dim RutaUltimoFichero As String=\"out/work\" & \"/\"";
Debug.ShouldStop(268435456);
_rutaultimofichero = RemoteObject.concat(RemoteObject.createImmutable("out/work"),RemoteObject.createImmutable("/"),__ref.getField(true,"_nombreultimofichero" /*RemoteObject*/ ));Debug.locals.put("RutaUltimoFichero", _rutaultimofichero);Debug.locals.put("RutaUltimoFichero", _rutaultimofichero);
 BA.debugLineNum = 350;BA.debugLine="frm.RootPane.MouseCursor= fx.Cursors.WAIT";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 352;BA.debugLine="sFtpDHL.DownloadFile(RutaUltimoFichero, xui.Defa";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sftpdhl" /*RemoteObject*/ ).runVoidMethod ("DownloadFile",__ref.getField(false, "ba"),(Object)(_rutaultimofichero),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(__ref.getField(true,"_nombreultimofichero" /*RemoteObject*/ )));
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 354;BA.debugLine="IncidenciasPendientes";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_incidenciaspendientes" /*void*/ );
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 356;BA.debugLine="End Sub";
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
public static RemoteObject  _sftpdhl_promptyesno(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("sftpDHL_PromptYesNo (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("sftpdhl_promptyesno")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","sftpdhl_promptyesno", __ref, _message);}
Debug.locals.put("Message", _message);
 BA.debugLineNum = 292;BA.debugLine="Sub sftpDHL_PromptYesNo (Message As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 298;BA.debugLine="sFtpDHL.SetPromptResult(True)";
Debug.ShouldStop(512);
__ref.getField(false,"_sftpdhl" /*RemoteObject*/ ).runVoidMethod ("SetPromptResult",(Object)(cexpedicionesnoentregadasdhl.__c.getField(true,"True")));
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sftpdhl_showmessage(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("sftpDHL_ShowMessage (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("sftpdhl_showmessage")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","sftpdhl_showmessage", __ref, _message);}
Debug.locals.put("Message", _message);
 BA.debugLineNum = 301;BA.debugLine="Sub sftpDHL_ShowMessage (Message As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 302;BA.debugLine="fx.Msgbox(frm,Message, \"\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(_message),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sftpdhl_uploadcompleted(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("sftpDHL_UploadCompleted (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("sftpdhl_uploadcompleted")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","sftpdhl_uploadcompleted", __ref, _serverpath, _success);}
Debug.locals.put("ServerPath", _serverpath);
Debug.locals.put("Success", _success);
 BA.debugLineNum = 312;BA.debugLine="Sub sftpDHL_UploadCompleted (ServerPath As String,";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 313;BA.debugLine="Log(ServerPath & \", Success=\" & Success)";
Debug.ShouldStop(16777216);
cexpedicionesnoentregadasdhl.__c.runVoidMethod ("LogImpl","862586881",RemoteObject.concat(_serverpath,RemoteObject.createImmutable(", Success="),_success),0);
 BA.debugLineNum = 314;BA.debugLine="If Success = False Then Log(LastException.Message";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_success,cexpedicionesnoentregadasdhl.__c.getField(true,"False"))) { 
cexpedicionesnoentregadasdhl.__c.runVoidMethod ("LogImpl","862586882",cexpedicionesnoentregadasdhl.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);};
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sftpdhl_uploadprogress(RemoteObject __ref,RemoteObject _serverpath,RemoteObject _totaluploaded,RemoteObject _total) throws Exception{
try {
		Debug.PushSubsStack("sftpDHL_UploadProgress (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,305);
if (RapidSub.canDelegate("sftpdhl_uploadprogress")) { return __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","sftpdhl_uploadprogress", __ref, _serverpath, _totaluploaded, _total);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("ServerPath", _serverpath);
Debug.locals.put("TotalUploaded", _totaluploaded);
Debug.locals.put("Total", _total);
 BA.debugLineNum = 305;BA.debugLine="Sub sftpDHL_UploadProgress (ServerPath As String,";
Debug.ShouldStop(65536);
 BA.debugLineNum = 306;BA.debugLine="Dim s As String";
Debug.ShouldStop(131072);
_s = RemoteObject.createImmutable("");Debug.locals.put("s", _s);
 BA.debugLineNum = 307;BA.debugLine="s = \"Uploaded \" & Round(TotalUploaded / 1000) & \"";
Debug.ShouldStop(262144);
_s = RemoteObject.concat(RemoteObject.createImmutable("Uploaded "),cexpedicionesnoentregadasdhl.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_totaluploaded,RemoteObject.createImmutable(1000)}, "/",0, 0))),RemoteObject.createImmutable("KB"));Debug.locals.put("s", _s);
 BA.debugLineNum = 308;BA.debugLine="If Total > 0 Then s = s & \" out of \" & Round(Tota";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_total,BA.numberCast(long.class, 0))) { 
_s = RemoteObject.concat(_s,RemoteObject.createImmutable(" out of "),cexpedicionesnoentregadasdhl.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_total,RemoteObject.createImmutable(1000)}, "/",0, 0))),RemoteObject.createImmutable("KB"));Debug.locals.put("s", _s);};
 BA.debugLineNum = 309;BA.debugLine="Log(s)";
Debug.ShouldStop(1048576);
cexpedicionesnoentregadasdhl.__c.runVoidMethod ("LogImpl","862521348",_s,0);
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Show (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cexpedicionesnoentregadasdhl","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cexpedicionesnoentregadasdhl parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _imgnav = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _imgdhl = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cexpedicionesnoentregadasdhl) ","cexpedicionesnoentregadasdhl",30,__ref.getField(false, "ba"),__ref,28);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 30;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 33;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(1);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 34;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"sta";
Debug.ShouldStop(2);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 35;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(4);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 36;BA.debugLine="frm.RootPane.LoadLayout(\"scrExpedicionesDHLNoEnt";
Debug.ShouldStop(8);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrExpedicionesDHLNoEntregadas")));
 BA.debugLineNum = 37;BA.debugLine="Sleep(0)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "show"),BA.numberCast(int.class, 0));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
 BA.debugLineNum = 38;BA.debugLine="frm.Title=\"Expediciones DHL\"";
Debug.ShouldStop(32);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",BA.ObjectToString("Expediciones DHL"));
 BA.debugLineNum = 40;BA.debugLine="If Not(File.Exists(xui.DefaultFolder,\"hosts.txt\"";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("hosts.txt"))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 41;BA.debugLine="File.WriteString(xui.DefaultFolder,\"hosts.txt\",";
Debug.ShouldStop(256);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(BA.ObjectToString("hosts.txt")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 46;BA.debugLine="jamTableViewExpedicionesNoEntregadas.EstadoMenuI";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 47;BA.debugLine="jamTableViewExpedicionesNoEntregadas.EstadoMenuI";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 49;BA.debugLine="jamTableViewExpedicionesNoEntregadas.AddContextM";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 50;BA.debugLine="Dim imgNAV As Image";
Debug.ShouldStop(131072);
_imgnav = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("imgNAV", _imgnav);
 BA.debugLineNum = 51;BA.debugLine="imgNAV.InitializeSample(File.DirAssets,\"navision";
Debug.ShouldStop(262144);
_imgnav.runVoidMethod ("InitializeSample",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("navision.png")),(Object)(BA.numberCast(double.class, 24)),(Object)(BA.numberCast(double.class, 24)));
 BA.debugLineNum = 52;BA.debugLine="jamTableViewExpedicionesNoEntregadas.AddContextM";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Documentos NAV de la expedición")),(Object)(BA.ObjectToString("Documentos NAV de la expedicion")),(Object)(_imgnav));
 BA.debugLineNum = 53;BA.debugLine="Dim imgDHL As Image";
Debug.ShouldStop(1048576);
_imgdhl = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("imgDHL", _imgdhl);
 BA.debugLineNum = 54;BA.debugLine="imgDHL.InitializeSample(File.DirAssets,\"DHLsq.pn";
Debug.ShouldStop(2097152);
_imgdhl.runVoidMethod ("InitializeSample",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("DHLsq.png")),(Object)(BA.numberCast(double.class, 24)),(Object)(BA.numberCast(double.class, 24)));
 BA.debugLineNum = 55;BA.debugLine="jamTableViewExpedicionesNoEntregadas.AddContextM";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Trazabilidad Expedición Web DHL")),(Object)(BA.ObjectToString("TrazabilidadExpedicionWebDHL")),(Object)(_imgdhl));
 BA.debugLineNum = 57;BA.debugLine="Dim rSub As ResumableSub=jamTableViewExpedicione";
Debug.ShouldStop(16777216);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ExpedicionesNoEntregadasDHL.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 58;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "show"), _rsub);
this.state = 14;
return;
case 14:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 59;BA.debugLine="Log(mRes)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","862259231",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 60;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 61;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 62;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "show"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 8;
;
 BA.debugLineNum = 63;BA.debugLine="SalirModulo";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 64;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 67;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(4);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 68;BA.debugLine="CF.Initialize";
Debug.ShouldStop(8);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="CF.AliasCampoColumna=\"Fecha\"";
Debug.ShouldStop(16);
_cf.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("Fecha"));
 BA.debugLineNum = 70;BA.debugLine="CF.NombreFuncionCellFactory=jamTableViewExpedici";
Debug.ShouldStop(32);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).getField(true,"_cellfactory_columnafecha" /*RemoteObject*/ ));
 BA.debugLineNum = 71;BA.debugLine="CF.CellFactoryEnCallBack=False";
Debug.ShouldStop(64);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 72;BA.debugLine="CF.params=Null";
Debug.ShouldStop(128);
_cf.setField ("params" /*RemoteObject*/ ,(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 73;BA.debugLine="jamTableViewExpedicionesNoEntregadas.SetCellFact";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableviewexpedicionesnoentregadas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactory" /*RemoteObject*/ ,(Object)(_cf));
 BA.debugLineNum = 75;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 79;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(16384);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 81;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="sFtpDHL.Initialize(\"sftpDHL\", \"tak3uada\", \"xfG2&r";
Debug.ShouldStop(524288);
__ref.getField(false,"_sftpdhl" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("sftpDHL")),(Object)(BA.ObjectToString("tak3uada")),(Object)(BA.ObjectToString("xfG2&rNpe!fD8QYP")),(Object)(BA.ObjectToString("sftp3.dhl.com")),(Object)(BA.numberCast(int.class, 4222)));
 BA.debugLineNum = 86;BA.debugLine="sFtpDHL.SetKnownHostsStore(xui.DefaultFolder, \"ho";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sftpdhl" /*RemoteObject*/ ).runVoidMethod ("SetKnownHostsStore",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("hosts.txt")));
 BA.debugLineNum = 88;BA.debugLine="frm.Show";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 90;BA.debugLine="Dim joForm As JavaObject=asJO(frm)";
Debug.ShouldStop(33554432);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = __ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 91;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(67108864);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 92;BA.debugLine="joStage.RunMethod(\"setMaximized\",Array(True))";
Debug.ShouldStop(134217728);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 96;BA.debugLine="frm.RootPane.MouseCursor= fx.Cursors.WAIT";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 98;BA.debugLine="Wait For(CargaCredenciales) complete (sResp As St";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "show"), __ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_cargacredenciales" /*RemoteObject*/ ));
this.state = 16;
return;
case 16:
//C
this.state = 9;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 99;BA.debugLine="If sResp<>\"OK\" Then";
Debug.ShouldStop(4);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_sresp,BA.ObjectToString("OK"))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 101;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error carga c";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error carga credenciales DHL"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 102;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cexpedicionesnoentregadasdhl", "show"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 12;
;
 BA.debugLineNum = 103;BA.debugLine="btnSalir_Click";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.cexpedicionesnoentregadasdhl.class, "_btnsalir_click" /*RemoteObject*/ );
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 109;BA.debugLine="sFtpDHL.List(\"out/work\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_sftpdhl" /*RemoteObject*/ ).runVoidMethod ("List",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("out/work")));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
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